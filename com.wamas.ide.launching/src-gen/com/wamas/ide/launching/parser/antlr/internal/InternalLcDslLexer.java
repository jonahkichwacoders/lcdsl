package com.wamas.ide.launching.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLcDslLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int RULE_VERSION=7;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int RULE_EQ=6;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_QUALIFIER=9;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalLcDslLexer() {;} 
    public InternalLcDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalLcDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalLcDsl.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:11:7: ( 'explicit' )
            // InternalLcDsl.g:11:9: 'explicit'
            {
            match("explicit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:12:7: ( 'manual' )
            // InternalLcDsl.g:12:9: 'manual'
            {
            match("manual"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:13:7: ( 'foreground' )
            // InternalLcDsl.g:13:9: 'foreground'
            {
            match("foreground"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:14:7: ( 'no-console' )
            // InternalLcDsl.g:14:9: 'no-console'
            {
            match("no-console"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:15:7: ( 'configuration' )
            // InternalLcDsl.g:15:9: 'configuration'
            {
            match("configuration"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:16:7: ( ':' )
            // InternalLcDsl.g:16:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:17:7: ( '{' )
            // InternalLcDsl.g:17:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:18:7: ( ';' )
            // InternalLcDsl.g:18:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:19:7: ( 'workspace' )
            // InternalLcDsl.g:19:9: 'workspace'
            {
            match("workspace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:20:7: ( 'working-dir' )
            // InternalLcDsl.g:20:9: 'working-dir'
            {
            match("working-dir"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:21:7: ( 'project' )
            // InternalLcDsl.g:21:9: 'project'
            {
            match("project"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:22:7: ( 'main-class' )
            // InternalLcDsl.g:22:9: 'main-class'
            {
            match("main-class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:23:7: ( '}' )
            // InternalLcDsl.g:23:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:24:7: ( 'plugin' )
            // InternalLcDsl.g:24:9: 'plugin'
            {
            match("plugin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:25:7: ( 'ignore' )
            // InternalLcDsl.g:25:9: 'ignore'
            {
            match("ignore"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:26:7: ( 'vm-arg' )
            // InternalLcDsl.g:26:9: 'vm-arg'
            {
            match("vm-arg"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:27:7: ( 'argument' )
            // InternalLcDsl.g:27:9: 'argument'
            {
            match("argument"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:28:7: ( 'environment' )
            // InternalLcDsl.g:28:9: 'environment'
            {
            match("environment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:29:7: ( 'application' )
            // InternalLcDsl.g:29:9: 'application'
            {
            match("application"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:30:7: ( 'product' )
            // InternalLcDsl.g:30:9: 'product'
            {
            match("product"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:31:7: ( 'favorite' )
            // InternalLcDsl.g:31:9: 'favorite'
            {
            match("favorite"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:32:7: ( 'run' )
            // InternalLcDsl.g:32:9: 'run'
            {
            match("run"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:33:7: ( 'debug' )
            // InternalLcDsl.g:33:9: 'debug'
            {
            match("debug"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:34:7: ( 'redirect' )
            // InternalLcDsl.g:34:9: 'redirect'
            {
            match("redirect"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:35:7: ( 'to' )
            // InternalLcDsl.g:35:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:36:7: ( 'from' )
            // InternalLcDsl.g:36:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:37:7: ( 'execution-environment' )
            // InternalLcDsl.g:37:9: 'execution-environment'
            {
            match("execution-environment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:38:7: ( 'clear' )
            // InternalLcDsl.g:38:9: 'clear'
            {
            match("clear"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:39:7: ( 'log' )
            // InternalLcDsl.g:39:9: 'log'
            {
            match("log"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:40:7: ( '!' )
            // InternalLcDsl.g:40:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:41:7: ( 'config' )
            // InternalLcDsl.g:41:9: 'config'
            {
            match("config"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:42:7: ( 'memory' )
            // InternalLcDsl.g:42:9: 'memory'
            {
            match("memory"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:43:7: ( 'min' )
            // InternalLcDsl.g:43:9: 'min'
            {
            match("min"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:44:7: ( 'max' )
            // InternalLcDsl.g:44:9: 'max'
            {
            match("max"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:45:7: ( 'perm' )
            // InternalLcDsl.g:45:9: 'perm'
            {
            match("perm"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:46:7: ( 'adopt' )
            // InternalLcDsl.g:46:9: 'adopt'
            {
            match("adopt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:47:7: ( 'member' )
            // InternalLcDsl.g:47:9: 'member'
            {
            match("member"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:48:7: ( 'delay' )
            // InternalLcDsl.g:48:9: 'delay'
            {
            match("delay"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:49:7: ( 'regex' )
            // InternalLcDsl.g:49:9: 'regex'
            {
            match("regex"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:50:7: ( 'wait' )
            // InternalLcDsl.g:50:9: 'wait'
            {
            match("wait"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:51:7: ( '.' )
            // InternalLcDsl.g:51:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:52:7: ( 'java' )
            // InternalLcDsl.g:52:9: 'java'
            {
            match("java"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:53:7: ( 'eclipse' )
            // InternalLcDsl.g:53:9: 'eclipse'
            {
            match("eclipse"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:54:7: ( 'rap' )
            // InternalLcDsl.g:54:9: 'rap'
            {
            match("rap"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:55:7: ( 'group' )
            // InternalLcDsl.g:55:9: 'group'
            {
            match("group"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:56:7: ( 'profile' )
            // InternalLcDsl.g:56:9: 'profile'
            {
            match("profile"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:57:7: ( 'coverage' )
            // InternalLcDsl.g:57:9: 'coverage'
            {
            match("coverage"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:58:7: ( 'inherit' )
            // InternalLcDsl.g:58:9: 'inherit'
            {
            match("inherit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:59:7: ( 'MB' )
            // InternalLcDsl.g:59:9: 'MB'
            {
            match("MB"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:60:7: ( 'mb' )
            // InternalLcDsl.g:60:9: 'mb'
            {
            match("mb"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:61:7: ( 'M' )
            // InternalLcDsl.g:61:9: 'M'
            {
            match('M'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:62:7: ( 'm' )
            // InternalLcDsl.g:62:9: 'm'
            {
            match('m'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:63:7: ( 'GB' )
            // InternalLcDsl.g:63:9: 'GB'
            {
            match("GB"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:64:7: ( 'gb' )
            // InternalLcDsl.g:64:9: 'gb'
            {
            match("gb"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:65:7: ( 'G' )
            // InternalLcDsl.g:65:9: 'G'
            {
            match('G'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:66:7: ( 'g' )
            // InternalLcDsl.g:66:9: 'g'
            {
            match('g'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:67:7: ( 'stdout' )
            // InternalLcDsl.g:67:9: 'stdout'
            {
            match("stdout"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:68:7: ( 'stderr' )
            // InternalLcDsl.g:68:9: 'stderr'
            {
            match("stderr"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:69:7: ( 'both-out' )
            // InternalLcDsl.g:69:9: 'both-out'
            {
            match("both-out"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:70:7: ( 'stdin' )
            // InternalLcDsl.g:70:9: 'stdin'
            {
            match("stdin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:2525:10: ( ( '0' .. '9' )+ )
            // InternalLcDsl.g:2525:12: ( '0' .. '9' )+
            {
            // InternalLcDsl.g:2525:12: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLcDsl.g:2525:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:2527:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( ( '.' )? ( 'a' .. 'z' | 'A' .. 'Z' | '^' | '_' | '-' | '0' .. '9' ) )* )
            // InternalLcDsl.g:2527:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( ( '.' )? ( 'a' .. 'z' | 'A' .. 'Z' | '^' | '_' | '-' | '0' .. '9' ) )*
            {
            // InternalLcDsl.g:2527:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalLcDsl.g:2527:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalLcDsl.g:2527:40: ( ( '.' )? ( 'a' .. 'z' | 'A' .. 'Z' | '^' | '_' | '-' | '0' .. '9' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='-' && LA4_0<='.')||(LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||(LA4_0>='^' && LA4_0<='_')||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLcDsl.g:2527:41: ( '.' )? ( 'a' .. 'z' | 'A' .. 'Z' | '^' | '_' | '-' | '0' .. '9' )
            	    {
            	    // InternalLcDsl.g:2527:41: ( '.' )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0=='.') ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalLcDsl.g:2527:41: '.'
            	            {
            	            match('.'); 

            	            }
            	            break;

            	    }

            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='^' && input.LA(1)<='_')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_QUALIFIER"
    public final void mRULE_QUALIFIER() throws RecognitionException {
        try {
            // InternalLcDsl.g:2529:25: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )* )
            // InternalLcDsl.g:2529:27: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )*
            {
            // InternalLcDsl.g:2529:27: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='-'||(LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalLcDsl.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_QUALIFIER"

    // $ANTLR start "RULE_VERSION"
    public final void mRULE_VERSION() throws RecognitionException {
        try {
            int _type = RULE_VERSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:2531:14: ( RULE_INT ( '.' RULE_INT ( '.' RULE_INT ( '.' RULE_QUALIFIER )? )? )? )
            // InternalLcDsl.g:2531:16: RULE_INT ( '.' RULE_INT ( '.' RULE_INT ( '.' RULE_QUALIFIER )? )? )?
            {
            mRULE_INT(); 
            // InternalLcDsl.g:2531:25: ( '.' RULE_INT ( '.' RULE_INT ( '.' RULE_QUALIFIER )? )? )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='.') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalLcDsl.g:2531:26: '.' RULE_INT ( '.' RULE_INT ( '.' RULE_QUALIFIER )? )?
                    {
                    match('.'); 
                    mRULE_INT(); 
                    // InternalLcDsl.g:2531:39: ( '.' RULE_INT ( '.' RULE_QUALIFIER )? )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='.') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalLcDsl.g:2531:40: '.' RULE_INT ( '.' RULE_QUALIFIER )?
                            {
                            match('.'); 
                            mRULE_INT(); 
                            // InternalLcDsl.g:2531:53: ( '.' RULE_QUALIFIER )?
                            int alt6=2;
                            int LA6_0 = input.LA(1);

                            if ( (LA6_0=='.') ) {
                                alt6=1;
                            }
                            switch (alt6) {
                                case 1 :
                                    // InternalLcDsl.g:2531:54: '.' RULE_QUALIFIER
                                    {
                                    match('.'); 
                                    mRULE_QUALIFIER(); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VERSION"

    // $ANTLR start "RULE_EQ"
    public final void mRULE_EQ() throws RecognitionException {
        try {
            int _type = RULE_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:2533:9: ( '=' )
            // InternalLcDsl.g:2533:11: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQ"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:2535:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalLcDsl.g:2535:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalLcDsl.g:2535:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\"') ) {
                alt11=1;
            }
            else if ( (LA11_0=='\'') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalLcDsl.g:2535:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalLcDsl.g:2535:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalLcDsl.g:2535:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalLcDsl.g:2535:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalLcDsl.g:2535:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalLcDsl.g:2535:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalLcDsl.g:2535:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalLcDsl.g:2535:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:2537:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalLcDsl.g:2537:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalLcDsl.g:2537:24: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='*') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='/') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalLcDsl.g:2537:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:2539:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalLcDsl.g:2539:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalLcDsl.g:2539:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalLcDsl.g:2539:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalLcDsl.g:2539:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalLcDsl.g:2539:41: ( '\\r' )? '\\n'
                    {
                    // InternalLcDsl.g:2539:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalLcDsl.g:2539:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:2541:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalLcDsl.g:2541:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalLcDsl.g:2541:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalLcDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLcDsl.g:2543:16: ( . )
            // InternalLcDsl.g:2543:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalLcDsl.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | RULE_INT | RULE_ID | RULE_VERSION | RULE_EQ | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=69;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // InternalLcDsl.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalLcDsl.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalLcDsl.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalLcDsl.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalLcDsl.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalLcDsl.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalLcDsl.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalLcDsl.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalLcDsl.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalLcDsl.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalLcDsl.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalLcDsl.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalLcDsl.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalLcDsl.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalLcDsl.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalLcDsl.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalLcDsl.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalLcDsl.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalLcDsl.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalLcDsl.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalLcDsl.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalLcDsl.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalLcDsl.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalLcDsl.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalLcDsl.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // InternalLcDsl.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // InternalLcDsl.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // InternalLcDsl.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // InternalLcDsl.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // InternalLcDsl.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // InternalLcDsl.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // InternalLcDsl.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // InternalLcDsl.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // InternalLcDsl.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // InternalLcDsl.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // InternalLcDsl.g:1:220: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // InternalLcDsl.g:1:226: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // InternalLcDsl.g:1:232: T__51
                {
                mT__51(); 

                }
                break;
            case 39 :
                // InternalLcDsl.g:1:238: T__52
                {
                mT__52(); 

                }
                break;
            case 40 :
                // InternalLcDsl.g:1:244: T__53
                {
                mT__53(); 

                }
                break;
            case 41 :
                // InternalLcDsl.g:1:250: T__54
                {
                mT__54(); 

                }
                break;
            case 42 :
                // InternalLcDsl.g:1:256: T__55
                {
                mT__55(); 

                }
                break;
            case 43 :
                // InternalLcDsl.g:1:262: T__56
                {
                mT__56(); 

                }
                break;
            case 44 :
                // InternalLcDsl.g:1:268: T__57
                {
                mT__57(); 

                }
                break;
            case 45 :
                // InternalLcDsl.g:1:274: T__58
                {
                mT__58(); 

                }
                break;
            case 46 :
                // InternalLcDsl.g:1:280: T__59
                {
                mT__59(); 

                }
                break;
            case 47 :
                // InternalLcDsl.g:1:286: T__60
                {
                mT__60(); 

                }
                break;
            case 48 :
                // InternalLcDsl.g:1:292: T__61
                {
                mT__61(); 

                }
                break;
            case 49 :
                // InternalLcDsl.g:1:298: T__62
                {
                mT__62(); 

                }
                break;
            case 50 :
                // InternalLcDsl.g:1:304: T__63
                {
                mT__63(); 

                }
                break;
            case 51 :
                // InternalLcDsl.g:1:310: T__64
                {
                mT__64(); 

                }
                break;
            case 52 :
                // InternalLcDsl.g:1:316: T__65
                {
                mT__65(); 

                }
                break;
            case 53 :
                // InternalLcDsl.g:1:322: T__66
                {
                mT__66(); 

                }
                break;
            case 54 :
                // InternalLcDsl.g:1:328: T__67
                {
                mT__67(); 

                }
                break;
            case 55 :
                // InternalLcDsl.g:1:334: T__68
                {
                mT__68(); 

                }
                break;
            case 56 :
                // InternalLcDsl.g:1:340: T__69
                {
                mT__69(); 

                }
                break;
            case 57 :
                // InternalLcDsl.g:1:346: T__70
                {
                mT__70(); 

                }
                break;
            case 58 :
                // InternalLcDsl.g:1:352: T__71
                {
                mT__71(); 

                }
                break;
            case 59 :
                // InternalLcDsl.g:1:358: T__72
                {
                mT__72(); 

                }
                break;
            case 60 :
                // InternalLcDsl.g:1:364: T__73
                {
                mT__73(); 

                }
                break;
            case 61 :
                // InternalLcDsl.g:1:370: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 62 :
                // InternalLcDsl.g:1:379: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 63 :
                // InternalLcDsl.g:1:387: RULE_VERSION
                {
                mRULE_VERSION(); 

                }
                break;
            case 64 :
                // InternalLcDsl.g:1:400: RULE_EQ
                {
                mRULE_EQ(); 

                }
                break;
            case 65 :
                // InternalLcDsl.g:1:408: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 66 :
                // InternalLcDsl.g:1:420: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 67 :
                // InternalLcDsl.g:1:436: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 68 :
                // InternalLcDsl.g:1:452: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 69 :
                // InternalLcDsl.g:1:460: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\1\47\1\54\3\47\3\uffff\2\47\1\uffff\7\47\2\uffff\1\47\1\115\1\117\1\121\2\47\1\124\1\43\2\uffff\3\43\2\uffff\3\47\1\uffff\3\47\1\145\1\uffff\6\47\3\uffff\5\47\1\uffff\12\47\1\176\1\47\2\uffff\2\47\1\u0082\1\uffff\1\u0083\1\uffff\1\u0084\1\uffff\2\47\1\uffff\1\124\6\uffff\6\47\1\u008d\1\47\1\u0090\1\uffff\22\47\1\u00a5\2\47\1\u00a8\2\47\1\uffff\1\u00ab\2\47\3\uffff\10\47\1\uffff\2\47\1\uffff\2\47\1\u00bc\5\47\1\u00c3\4\47\1\u00c8\6\47\1\uffff\2\47\1\uffff\2\47\1\uffff\1\u00d3\17\47\1\uffff\3\47\1\u00e6\2\47\1\uffff\4\47\1\uffff\5\47\1\u00f2\1\47\1\u00f4\1\u00f5\1\u00f6\1\uffff\1\u00f7\2\47\1\u00fa\5\47\1\u0100\1\47\1\u0102\1\u0103\3\47\1\u0108\1\47\1\uffff\5\47\1\u010f\1\u0110\1\47\1\u0112\2\47\1\uffff\1\47\4\uffff\1\u0116\1\u0117\1\uffff\4\47\1\u011c\1\uffff\1\47\2\uffff\4\47\1\uffff\3\47\1\u0125\1\u0126\1\u0127\2\uffff\1\u0128\1\uffff\3\47\2\uffff\1\47\1\u012d\2\47\1\uffff\2\47\1\u0132\2\47\1\u0135\2\47\4\uffff\1\u0138\1\47\1\u013a\1\u013b\1\uffff\4\47\1\uffff\2\47\1\uffff\1\u0142\1\47\1\uffff\1\47\2\uffff\2\47\1\u0147\1\u0148\1\u0149\1\47\1\uffff\3\47\1\u014e\3\uffff\1\47\1\u0150\1\u0151\1\47\1\uffff\1\47\2\uffff\1\47\1\u0155\1\47\1\uffff\6\47\1\u015d\1\uffff";
    static final String DFA17_eofS =
        "\u015e\uffff";
    static final String DFA17_minS =
        "\1\0\1\143\1\55\1\141\1\157\1\154\3\uffff\1\141\1\145\1\uffff\1\147\1\155\1\144\1\141\1\145\2\157\2\uffff\1\141\3\55\1\164\1\157\1\56\1\101\2\uffff\2\0\1\52\2\uffff\1\145\1\166\1\154\1\uffff\1\151\1\155\1\156\1\55\1\uffff\1\162\1\166\1\157\1\55\1\156\1\145\3\uffff\1\162\1\151\1\157\1\165\1\162\1\uffff\1\156\1\150\1\55\1\147\1\160\1\157\1\156\1\144\1\160\1\142\1\55\1\147\2\uffff\1\166\1\157\1\55\1\uffff\1\55\1\uffff\1\55\1\uffff\1\144\1\164\1\uffff\1\56\6\uffff\1\154\1\143\2\151\1\165\1\156\1\55\1\142\1\55\1\uffff\1\145\1\157\1\155\1\143\1\146\1\145\1\141\1\153\1\164\1\144\1\147\1\155\1\157\1\145\1\141\1\165\1\154\1\160\1\55\1\151\1\145\1\55\1\165\1\141\1\uffff\1\55\1\141\1\165\3\uffff\1\145\1\150\1\151\1\165\1\162\1\160\1\141\1\55\1\uffff\1\162\1\145\1\uffff\1\147\1\162\1\55\1\157\1\151\2\162\1\151\1\55\1\145\1\165\2\151\1\55\3\162\1\155\1\151\1\164\1\uffff\1\162\1\170\1\uffff\1\147\1\171\1\uffff\1\55\1\160\1\165\1\162\1\156\1\55\1\143\1\164\1\157\1\163\1\154\1\143\1\171\2\162\1\151\1\uffff\1\156\1\147\1\141\1\55\1\160\1\156\1\uffff\2\143\1\154\1\156\1\uffff\1\145\1\151\1\147\1\145\1\143\1\55\1\145\3\55\1\uffff\1\55\1\164\1\162\1\55\1\157\2\151\1\156\1\145\1\55\1\154\2\55\1\157\1\164\1\163\1\55\1\147\1\uffff\1\141\1\147\2\164\1\145\2\55\1\164\1\55\1\156\1\141\1\uffff\1\143\4\uffff\2\55\1\uffff\1\165\1\164\1\157\1\155\1\55\1\uffff\1\141\2\uffff\1\165\1\145\1\157\1\162\1\uffff\1\145\1\143\4\55\2\uffff\1\55\1\uffff\3\164\2\uffff\1\164\1\55\1\156\1\145\1\uffff\1\163\1\156\1\55\1\154\1\141\1\55\1\145\1\144\4\uffff\1\55\1\151\2\55\1\uffff\1\55\1\156\1\163\1\144\1\uffff\1\145\1\164\1\uffff\1\55\1\151\1\uffff\1\157\2\uffff\1\145\1\164\3\55\1\151\1\uffff\1\162\2\156\1\55\3\uffff\1\157\2\55\1\166\1\uffff\1\156\2\uffff\1\151\1\55\1\162\1\uffff\1\157\1\156\1\155\1\145\1\156\1\164\1\55\1\uffff";
    static final String DFA17_maxS =
        "\1\uffff\1\170\1\172\1\162\2\157\3\uffff\1\157\1\162\1\uffff\1\156\1\155\1\162\1\165\1\145\2\157\2\uffff\1\141\3\172\1\164\1\157\1\71\1\172\2\uffff\2\uffff\1\57\2\uffff\1\160\1\166\1\154\1\uffff\1\170\1\155\1\156\1\172\1\uffff\1\162\1\166\1\157\1\55\1\166\1\145\3\uffff\1\162\1\151\1\157\1\165\1\162\1\uffff\1\156\1\150\1\55\1\147\1\160\1\157\1\156\1\147\1\160\1\154\1\172\1\147\2\uffff\1\166\1\157\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\144\1\164\1\uffff\1\71\6\uffff\1\154\1\143\2\151\1\165\1\156\1\172\1\157\1\172\1\uffff\1\145\1\157\1\155\1\143\1\146\1\145\1\141\1\153\1\164\1\152\1\147\1\155\1\157\1\145\1\141\1\165\1\154\1\160\1\172\1\151\1\145\1\172\1\165\1\141\1\uffff\1\172\1\141\1\165\3\uffff\1\157\1\150\1\151\1\165\1\162\1\160\1\141\1\55\1\uffff\1\162\1\145\1\uffff\1\147\1\162\1\172\1\157\1\151\2\162\1\163\1\172\1\145\1\165\2\151\1\172\3\162\1\155\1\151\1\164\1\uffff\1\162\1\170\1\uffff\1\147\1\171\1\uffff\1\172\1\160\1\165\1\162\1\156\1\55\1\143\1\164\1\157\1\163\1\154\1\143\1\171\2\162\1\151\1\uffff\1\156\1\147\1\141\1\172\1\160\1\156\1\uffff\2\143\1\154\1\156\1\uffff\1\145\1\151\1\147\1\145\1\143\1\172\1\145\3\172\1\uffff\1\172\1\164\1\162\1\172\1\157\2\151\1\156\1\145\1\172\1\154\2\172\1\157\1\164\1\163\1\172\1\147\1\uffff\1\141\1\147\2\164\1\145\2\172\1\164\1\172\1\156\1\141\1\uffff\1\143\4\uffff\2\172\1\uffff\1\165\1\164\1\157\1\155\1\172\1\uffff\1\141\2\uffff\1\165\1\145\1\157\1\162\1\uffff\1\145\1\143\1\55\3\172\2\uffff\1\172\1\uffff\3\164\2\uffff\1\164\1\172\1\156\1\145\1\uffff\1\163\1\156\1\172\1\154\1\141\1\172\1\145\1\144\4\uffff\1\172\1\151\2\172\1\uffff\1\55\1\156\1\163\1\144\1\uffff\1\145\1\164\1\uffff\1\172\1\151\1\uffff\1\157\2\uffff\1\145\1\164\3\172\1\151\1\uffff\1\162\2\156\1\172\3\uffff\1\157\2\172\1\166\1\uffff\1\156\2\uffff\1\151\1\172\1\162\1\uffff\1\157\1\156\1\155\1\145\1\156\1\164\1\172\1\uffff";
    static final String DFA17_acceptS =
        "\6\uffff\1\6\1\7\1\10\2\uffff\1\15\7\uffff\1\36\1\51\10\uffff\1\76\1\100\3\uffff\1\104\1\105\3\uffff\1\76\4\uffff\1\64\6\uffff\1\6\1\7\1\10\5\uffff\1\15\14\uffff\1\36\1\51\3\uffff\1\70\1\uffff\1\63\1\uffff\1\67\2\uffff\1\75\1\uffff\1\77\1\100\1\101\1\102\1\103\1\104\11\uffff\1\62\30\uffff\1\31\3\uffff\1\66\1\61\1\65\10\uffff\1\42\2\uffff\1\41\24\uffff\1\26\2\uffff\1\54\2\uffff\1\35\20\uffff\1\32\6\uffff\1\50\4\uffff\1\43\12\uffff\1\52\22\uffff\1\34\13\uffff\1\44\1\uffff\1\47\1\27\1\46\1\55\2\uffff\1\74\5\uffff\1\2\1\uffff\1\40\1\45\4\uffff\1\37\6\uffff\1\16\1\17\1\uffff\1\20\3\uffff\1\71\1\72\4\uffff\1\53\10\uffff\1\13\1\24\1\56\1\60\4\uffff\1\1\4\uffff\1\25\2\uffff\1\57\2\uffff\1\21\1\uffff\1\30\1\73\6\uffff\1\11\4\uffff\1\14\1\3\1\4\4\uffff\1\22\1\uffff\1\12\1\23\3\uffff\1\5\7\uffff\1\33";
    static final String DFA17_specialS =
        "\1\2\36\uffff\1\0\1\1\u013d\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\43\2\42\2\43\1\42\22\43\1\42\1\23\1\37\4\43\1\40\6\43\1\24\1\41\12\33\1\6\1\10\1\43\1\36\3\43\6\35\1\30\5\35\1\27\15\35\3\43\1\34\1\35\1\43\1\16\1\32\1\5\1\20\1\1\1\3\1\26\1\35\1\14\1\25\1\35\1\22\1\2\1\4\1\35\1\12\1\35\1\17\1\31\1\21\1\35\1\15\1\11\3\35\1\7\1\43\1\13\uff82\43",
            "\1\46\12\uffff\1\45\11\uffff\1\44",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\1\50\1\53\2\47\1\51\3\47\1\52\21\47",
            "\1\56\15\uffff\1\55\2\uffff\1\57",
            "\1\60",
            "\1\62\2\uffff\1\61",
            "",
            "",
            "",
            "\1\67\15\uffff\1\66",
            "\1\72\6\uffff\1\71\5\uffff\1\70",
            "",
            "\1\74\6\uffff\1\75",
            "\1\76",
            "\1\101\13\uffff\1\100\1\uffff\1\77",
            "\1\104\3\uffff\1\103\17\uffff\1\102",
            "\1\105",
            "\1\106",
            "\1\107",
            "",
            "",
            "\1\112",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\1\47\1\114\17\47\1\113\10\47",
            "\2\47\1\uffff\12\47\7\uffff\1\47\1\116\30\47\3\uffff\2\47\1\uffff\32\47",
            "\2\47\1\uffff\12\47\7\uffff\1\47\1\120\30\47\3\uffff\2\47\1\uffff\32\47",
            "\1\122",
            "\1\123",
            "\1\126\1\uffff\12\125",
            "\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "\0\130",
            "\0\130",
            "\1\131\4\uffff\1\132",
            "",
            "",
            "\1\135\12\uffff\1\134",
            "\1\136",
            "\1\137",
            "",
            "\1\141\4\uffff\1\140\11\uffff\1\142",
            "\1\143",
            "\1\144",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152\7\uffff\1\153",
            "\1\154",
            "",
            "",
            "",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171\2\uffff\1\172",
            "\1\173",
            "\1\174\11\uffff\1\175",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "\1\177",
            "",
            "",
            "\1\u0080",
            "\1\u0081",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "",
            "\1\u0085",
            "\1\u0086",
            "",
            "\1\126\1\uffff\12\125",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "\1\u008f\14\uffff\1\u008e",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009b\1\uffff\1\u009c\3\uffff\1\u009a",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "\1\u00a6",
            "\1\u00a7",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "\1\u00a9",
            "\1\u00aa",
            "",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "\1\u00ac",
            "\1\u00ad",
            "",
            "",
            "",
            "\1\u00af\3\uffff\1\u00b0\5\uffff\1\u00ae",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "",
            "\1\u00b8",
            "\1\u00b9",
            "",
            "\1\u00ba",
            "\1\u00bb",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c2\11\uffff\1\u00c1",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "",
            "\1\u00cf",
            "\1\u00d0",
            "",
            "\1\u00d1",
            "\1\u00d2",
            "",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "\1\u00e7",
            "\1\u00e8",
            "",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "\1\u00f3",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "\1\u00f8",
            "\1\u00f9",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "\1\u0101",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\24\47\1\u0107\5\47",
            "\1\u0109",
            "",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "\1\u0111",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "\1\u0113",
            "\1\u0114",
            "",
            "\1\u0115",
            "",
            "",
            "",
            "",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "",
            "\1\u011d",
            "",
            "",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "",
            "",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "",
            "",
            "\1\u012c",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "\1\u012e",
            "\1\u012f",
            "",
            "\1\u0130",
            "\1\u0131",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "\1\u0133",
            "\1\u0134",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "\1\u0136",
            "\1\u0137",
            "",
            "",
            "",
            "",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "\1\u0139",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "",
            "\1\u0140",
            "\1\u0141",
            "",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "\1\u0143",
            "",
            "\1\u0144",
            "",
            "",
            "\1\u0145",
            "\1\u0146",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "\1\u014a",
            "",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "",
            "",
            "",
            "\1\u014f",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "\1\u0152",
            "",
            "\1\u0153",
            "",
            "",
            "\1\u0154",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "\1\u0156",
            "",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\2\47\1\uffff\12\47\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | RULE_INT | RULE_ID | RULE_VERSION | RULE_EQ | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_31 = input.LA(1);

                        s = -1;
                        if ( ((LA17_31>='\u0000' && LA17_31<='\uFFFF')) ) {s = 88;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_32 = input.LA(1);

                        s = -1;
                        if ( ((LA17_32>='\u0000' && LA17_32<='\uFFFF')) ) {s = 88;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='e') ) {s = 1;}

                        else if ( (LA17_0=='m') ) {s = 2;}

                        else if ( (LA17_0=='f') ) {s = 3;}

                        else if ( (LA17_0=='n') ) {s = 4;}

                        else if ( (LA17_0=='c') ) {s = 5;}

                        else if ( (LA17_0==':') ) {s = 6;}

                        else if ( (LA17_0=='{') ) {s = 7;}

                        else if ( (LA17_0==';') ) {s = 8;}

                        else if ( (LA17_0=='w') ) {s = 9;}

                        else if ( (LA17_0=='p') ) {s = 10;}

                        else if ( (LA17_0=='}') ) {s = 11;}

                        else if ( (LA17_0=='i') ) {s = 12;}

                        else if ( (LA17_0=='v') ) {s = 13;}

                        else if ( (LA17_0=='a') ) {s = 14;}

                        else if ( (LA17_0=='r') ) {s = 15;}

                        else if ( (LA17_0=='d') ) {s = 16;}

                        else if ( (LA17_0=='t') ) {s = 17;}

                        else if ( (LA17_0=='l') ) {s = 18;}

                        else if ( (LA17_0=='!') ) {s = 19;}

                        else if ( (LA17_0=='.') ) {s = 20;}

                        else if ( (LA17_0=='j') ) {s = 21;}

                        else if ( (LA17_0=='g') ) {s = 22;}

                        else if ( (LA17_0=='M') ) {s = 23;}

                        else if ( (LA17_0=='G') ) {s = 24;}

                        else if ( (LA17_0=='s') ) {s = 25;}

                        else if ( (LA17_0=='b') ) {s = 26;}

                        else if ( ((LA17_0>='0' && LA17_0<='9')) ) {s = 27;}

                        else if ( (LA17_0=='^') ) {s = 28;}

                        else if ( ((LA17_0>='A' && LA17_0<='F')||(LA17_0>='H' && LA17_0<='L')||(LA17_0>='N' && LA17_0<='Z')||LA17_0=='_'||LA17_0=='h'||LA17_0=='k'||LA17_0=='o'||LA17_0=='q'||LA17_0=='u'||(LA17_0>='x' && LA17_0<='z')) ) {s = 29;}

                        else if ( (LA17_0=='=') ) {s = 30;}

                        else if ( (LA17_0=='\"') ) {s = 31;}

                        else if ( (LA17_0=='\'') ) {s = 32;}

                        else if ( (LA17_0=='/') ) {s = 33;}

                        else if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {s = 34;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||(LA17_0>='#' && LA17_0<='&')||(LA17_0>='(' && LA17_0<='-')||LA17_0=='<'||(LA17_0>='>' && LA17_0<='@')||(LA17_0>='[' && LA17_0<=']')||LA17_0=='`'||LA17_0=='|'||(LA17_0>='~' && LA17_0<='\uFFFF')) ) {s = 35;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}