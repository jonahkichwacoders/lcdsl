/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching.ui.launchview;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchMode;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.ui.editor.IURIEditorOpener;

import com.wamas.ide.launching.generator.StandaloneLaunchConfigGenerator;
import com.wamas.ide.launching.lcDsl.LaunchConfig;
import com.wamas.ide.launching.ui.LcDslInjectionHelper;
import com.wamas.ide.launching.ui.internal.LaunchingActivator;
import com.wamas.ide.launchview.impl.DebugCoreLaunchObject;
import com.wamas.ide.launchview.launcher.StandaloneLaunchConfigExecutor;
import com.wamas.ide.launchview.services.LaunchObject;

public class LcDslLaunchObject implements LaunchObject {

    private final LaunchConfig cfg;
    private final StandaloneLaunchConfigGenerator generator;

    private final ImageRegistry registry = new ImageRegistry();
    private ILaunchConfiguration cachedGenerated;

    public LcDslLaunchObject(LaunchConfig cfg) {
        this.cfg = cfg;
        this.generator = LcDslInjectionHelper.getLcDslInjector().getInstance(StandaloneLaunchConfigGenerator.class);
    }

    @Override
    public String getId() {
        return cfg.getName();
    }

    @Override
    public StyledString getLabel() {
        return new StyledString(cfg.getName()).append(' ').append("[" + cfg.eResource().getURI().lastSegment() + "]",
                StyledString.QUALIFIER_STYLER);
    }

    @Override
    public Image getImage() {
        Image undecorated = LaunchObject.super.getImage();

        Image image = registry.get(getType().getIdentifier());
        if (image == null) {
            ImageDescriptor overlay = LaunchingActivator.imageDescriptorFromPlugin("com.wamas.ide.launching.ui",
                    "icons/lc_ovr.png");
            image = new MiniOverlayImage(undecorated.getImageData(), overlay.getImageData()).createImage();
            registry.put(getType().getIdentifier(), image);
        }
        return image;
    }

    @Override
    public ILaunchConfigurationType getType() {
        return StandaloneLaunchConfigGenerator.getType(DebugPlugin.getDefault().getLaunchManager(), cfg.getType());
    }

    @Override
    public void launch(ILaunchMode mode) {
        StandaloneLaunchConfigExecutor.launchProcess(generator.generate(cfg), mode.getIdentifier(), true, false, null);
    }

    @Override
    public boolean canTerminate() {
        ILaunchConfiguration generated = findConfig();
        if (generated == null) {
            return false;
        }
        return new DebugCoreLaunchObject(generated).canTerminate();
    }

    @Override
    public void terminate() {
        new DebugCoreLaunchObject(findConfig()).terminate();
    }

    private ILaunchConfiguration findConfig() {
        if (cachedGenerated != null) {
            return cachedGenerated;
        }
        try {
            for (ILaunchConfiguration config : DebugPlugin.getDefault().getLaunchManager().getLaunchConfigurations(getType())) {
                if (config.getName().equals(cfg.getName())) {
                    cachedGenerated = config;
                    break;
                }
            }
        } catch (CoreException e) {
            LaunchingActivator.getInstance().getLog()
                    .log(new Status(IStatus.WARNING, "com.wamas.ide.launching.ui", "cannot lookup launch configuration", e));
        }
        return cachedGenerated;
    }

    @Override
    public void edit() {
        IURIEditorOpener opener = LcDslInjectionHelper.getLcDslInjector().getInstance(IURIEditorOpener.class);
        opener.open(EcoreUtil2.getPlatformResourceOrNormalizedURI(cfg), true);
    }

}
