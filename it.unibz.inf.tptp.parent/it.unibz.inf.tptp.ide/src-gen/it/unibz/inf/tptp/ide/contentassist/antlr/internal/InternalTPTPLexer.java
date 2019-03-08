package it.unibz.inf.tptp.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTPTPLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=10;
    public static final int RULE_UPPER_TOKEN=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=11;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
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
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_LOWER_TOKEN=5;
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

    public InternalTPTPLexer() {;} 
    public InternalTPTPLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalTPTPLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalTPTP.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTPTP.g:11:7: ( 'axiom' )
            // InternalTPTP.g:11:9: 'axiom'
            {
            match("axiom"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTPTP.g:12:7: ( 'hypothesis' )
            // InternalTPTP.g:12:9: 'hypothesis'
            {
            match("hypothesis"); 


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
            // InternalTPTP.g:13:7: ( 'negated_conjecture' )
            // InternalTPTP.g:13:9: 'negated_conjecture'
            {
            match("negated_conjecture"); 


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
            // InternalTPTP.g:14:7: ( 'conjecture' )
            // InternalTPTP.g:14:9: 'conjecture'
            {
            match("conjecture"); 


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
            // InternalTPTP.g:15:7: ( 'definition' )
            // InternalTPTP.g:15:9: 'definition'
            {
            match("definition"); 


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
            // InternalTPTP.g:16:7: ( 'lemma' )
            // InternalTPTP.g:16:9: 'lemma'
            {
            match("lemma"); 


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
            // InternalTPTP.g:17:7: ( '$true' )
            // InternalTPTP.g:17:9: '$true'
            {
            match("$true"); 


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
            // InternalTPTP.g:18:7: ( '$false' )
            // InternalTPTP.g:18:9: '$false'
            {
            match("$false"); 


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
            // InternalTPTP.g:19:7: ( '!' )
            // InternalTPTP.g:19:9: '!'
            {
            match('!'); 

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
            // InternalTPTP.g:20:7: ( '?' )
            // InternalTPTP.g:20:9: '?'
            {
            match('?'); 

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
            // InternalTPTP.g:21:7: ( '>' )
            // InternalTPTP.g:21:9: '>'
            {
            match('>'); 

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
            // InternalTPTP.g:22:7: ( '*' )
            // InternalTPTP.g:22:9: '*'
            {
            match('*'); 

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
            // InternalTPTP.g:23:7: ( '$i' )
            // InternalTPTP.g:23:9: '$i'
            {
            match("$i"); 


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
            // InternalTPTP.g:24:7: ( '$o' )
            // InternalTPTP.g:24:9: '$o'
            {
            match("$o"); 


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
            // InternalTPTP.g:25:7: ( '$tType' )
            // InternalTPTP.g:25:9: '$tType'
            {
            match("$tType"); 


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
            // InternalTPTP.g:26:7: ( '$int' )
            // InternalTPTP.g:26:9: '$int'
            {
            match("$int"); 


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
            // InternalTPTP.g:27:7: ( '$real' )
            // InternalTPTP.g:27:9: '$real'
            {
            match("$real"); 


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
            // InternalTPTP.g:28:7: ( '$rat' )
            // InternalTPTP.g:28:9: '$rat'
            {
            match("$rat"); 


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
            // InternalTPTP.g:29:7: ( '$is_int' )
            // InternalTPTP.g:29:9: '$is_int'
            {
            match("$is_int"); 


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
            // InternalTPTP.g:30:7: ( '$is_rat' )
            // InternalTPTP.g:30:9: '$is_rat'
            {
            match("$is_rat"); 


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
            // InternalTPTP.g:31:7: ( '$uminus' )
            // InternalTPTP.g:31:9: '$uminus'
            {
            match("$uminus"); 


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
            // InternalTPTP.g:32:7: ( '$to_int' )
            // InternalTPTP.g:32:9: '$to_int'
            {
            match("$to_int"); 


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
            // InternalTPTP.g:33:7: ( '$to_rat' )
            // InternalTPTP.g:33:9: '$to_rat'
            {
            match("$to_rat"); 


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
            // InternalTPTP.g:34:7: ( '$to_real' )
            // InternalTPTP.g:34:9: '$to_real'
            {
            match("$to_real"); 


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
            // InternalTPTP.g:35:7: ( '$less' )
            // InternalTPTP.g:35:9: '$less'
            {
            match("$less"); 


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
            // InternalTPTP.g:36:7: ( '$sum' )
            // InternalTPTP.g:36:9: '$sum'
            {
            match("$sum"); 


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
            // InternalTPTP.g:37:7: ( '$difference' )
            // InternalTPTP.g:37:9: '$difference'
            {
            match("$difference"); 


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
            // InternalTPTP.g:38:7: ( '$product' )
            // InternalTPTP.g:38:9: '$product'
            {
            match("$product"); 


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
            // InternalTPTP.g:39:7: ( '$quotient' )
            // InternalTPTP.g:39:9: '$quotient'
            {
            match("$quotient"); 


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
            // InternalTPTP.g:40:7: ( '$quotient_e' )
            // InternalTPTP.g:40:9: '$quotient_e'
            {
            match("$quotient_e"); 


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
            // InternalTPTP.g:41:7: ( '$quotient_t' )
            // InternalTPTP.g:41:9: '$quotient_t'
            {
            match("$quotient_t"); 


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
            // InternalTPTP.g:42:7: ( '$quotient_f' )
            // InternalTPTP.g:42:9: '$quotient_f'
            {
            match("$quotient_f"); 


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
            // InternalTPTP.g:43:7: ( '$remainder_e' )
            // InternalTPTP.g:43:9: '$remainder_e'
            {
            match("$remainder_e"); 


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
            // InternalTPTP.g:44:7: ( '$remainder_t' )
            // InternalTPTP.g:44:9: '$remainder_t'
            {
            match("$remainder_t"); 


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
            // InternalTPTP.g:45:7: ( '$remainder_f' )
            // InternalTPTP.g:45:9: '$remainder_f'
            {
            match("$remainder_f"); 


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
            // InternalTPTP.g:46:7: ( '$greatereq' )
            // InternalTPTP.g:46:9: '$greatereq'
            {
            match("$greatereq"); 


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
            // InternalTPTP.g:47:7: ( '$lesseq' )
            // InternalTPTP.g:47:9: '$lesseq'
            {
            match("$lesseq"); 


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
            // InternalTPTP.g:48:7: ( '$greater' )
            // InternalTPTP.g:48:9: '$greater'
            {
            match("$greater"); 


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
            // InternalTPTP.g:49:7: ( '$eq' )
            // InternalTPTP.g:49:9: '$eq'
            {
            match("$eq"); 


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
            // InternalTPTP.g:50:7: ( 'plain' )
            // InternalTPTP.g:50:9: 'plain'
            {
            match("plain"); 


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
            // InternalTPTP.g:51:7: ( '=' )
            // InternalTPTP.g:51:9: '='
            {
            match('='); 

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
            // InternalTPTP.g:52:7: ( '!=' )
            // InternalTPTP.g:52:9: '!='
            {
            match("!="); 


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
            // InternalTPTP.g:53:7: ( '@' )
            // InternalTPTP.g:53:9: '@'
            {
            match('@'); 

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
            // InternalTPTP.g:54:7: ( '??' )
            // InternalTPTP.g:54:9: '??'
            {
            match("??"); 


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
            // InternalTPTP.g:55:7: ( '!!' )
            // InternalTPTP.g:55:9: '!!'
            {
            match("!!"); 


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
            // InternalTPTP.g:56:7: ( '&' )
            // InternalTPTP.g:56:9: '&'
            {
            match('&'); 

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
            // InternalTPTP.g:57:7: ( '|' )
            // InternalTPTP.g:57:9: '|'
            {
            match('|'); 

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
            // InternalTPTP.g:58:7: ( '=>' )
            // InternalTPTP.g:58:9: '=>'
            {
            match("=>"); 


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
            // InternalTPTP.g:59:7: ( '<=' )
            // InternalTPTP.g:59:9: '<='
            {
            match("<="); 


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
            // InternalTPTP.g:60:7: ( '<=>' )
            // InternalTPTP.g:60:9: '<=>'
            {
            match("<=>"); 


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
            // InternalTPTP.g:61:7: ( '<~>' )
            // InternalTPTP.g:61:9: '<~>'
            {
            match("<~>"); 


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
            // InternalTPTP.g:62:7: ( '^' )
            // InternalTPTP.g:62:9: '^'
            {
            match('^'); 

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
            // InternalTPTP.g:63:7: ( '~|' )
            // InternalTPTP.g:63:9: '~|'
            {
            match("~|"); 


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
            // InternalTPTP.g:64:7: ( '~&' )
            // InternalTPTP.g:64:9: '~&'
            {
            match("~&"); 


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
            // InternalTPTP.g:65:7: ( 'type' )
            // InternalTPTP.g:65:9: 'type'
            {
            match("type"); 


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
            // InternalTPTP.g:66:7: ( 'include(' )
            // InternalTPTP.g:66:9: 'include('
            {
            match("include("); 


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
            // InternalTPTP.g:67:7: ( ').' )
            // InternalTPTP.g:67:9: ').'
            {
            match(")."); 


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
            // InternalTPTP.g:68:7: ( 'fof(' )
            // InternalTPTP.g:68:9: 'fof('
            {
            match("fof("); 


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
            // InternalTPTP.g:69:7: ( ',' )
            // InternalTPTP.g:69:9: ','
            {
            match(','); 

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
            // InternalTPTP.g:70:7: ( '(' )
            // InternalTPTP.g:70:9: '('
            {
            match('('); 

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
            // InternalTPTP.g:71:7: ( ')' )
            // InternalTPTP.g:71:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTPTP.g:72:7: ( '[' )
            // InternalTPTP.g:72:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTPTP.g:73:7: ( ']' )
            // InternalTPTP.g:73:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTPTP.g:74:7: ( ':' )
            // InternalTPTP.g:74:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTPTP.g:75:7: ( 'tff(' )
            // InternalTPTP.g:75:9: 'tff('
            {
            match("tff("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTPTP.g:76:7: ( 'cnf(' )
            // InternalTPTP.g:76:9: 'cnf('
            {
            match("cnf("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTPTP.g:77:7: ( 'thf(' )
            // InternalTPTP.g:77:9: 'thf('
            {
            match("thf("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTPTP.g:78:7: ( '~' )
            // InternalTPTP.g:78:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTPTP.g:79:7: ( '/' )
            // InternalTPTP.g:79:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTPTP.g:80:7: ( '!>' )
            // InternalTPTP.g:80:9: '!>'
            {
            match("!>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "RULE_LOWER_TOKEN"
    public final void mRULE_LOWER_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_LOWER_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTPTP.g:10930:18: ( ( 'a' .. 'z' | '_' | '-' | '.' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '.' | '0' .. '9' )* )
            // InternalTPTP.g:10930:20: ( 'a' .. 'z' | '_' | '-' | '.' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '.' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalTPTP.g:10930:52: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '.' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='-' && LA1_0<='.')||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTPTP.g:
            	    {
            	    if ( (input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LOWER_TOKEN"

    // $ANTLR start "RULE_UPPER_TOKEN"
    public final void mRULE_UPPER_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_UPPER_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTPTP.g:10932:18: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '.' | '0' .. '9' )* )
            // InternalTPTP.g:10932:20: 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '.' | '0' .. '9' )*
            {
            matchRange('A','Z'); 
            // InternalTPTP.g:10932:29: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '.' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='-' && LA2_0<='.')||(LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTPTP.g:
            	    {
            	    if ( (input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UPPER_TOKEN"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTPTP.g:10934:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalTPTP.g:10934:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalTPTP.g:10934:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\"') ) {
                alt5=1;
            }
            else if ( (LA5_0=='\'') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalTPTP.g:10934:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalTPTP.g:10934:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop3:
                    do {
                        int alt3=3;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='\\') ) {
                            alt3=1;
                        }
                        else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                            alt3=2;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalTPTP.g:10934:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTPTP.g:10934:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop3;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:10934:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalTPTP.g:10934:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='&')||(LA4_0>='(' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalTPTP.g:10934:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTPTP.g:10934:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop4;
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
            // InternalTPTP.g:10936:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalTPTP.g:10936:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalTPTP.g:10936:24: ( options {greedy=false; } : . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='*') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='/') ) {
                        alt6=2;
                    }
                    else if ( ((LA6_1>='\u0000' && LA6_1<='.')||(LA6_1>='0' && LA6_1<='\uFFFF')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0>='\u0000' && LA6_0<=')')||(LA6_0>='+' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTPTP.g:10936:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
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
            // InternalTPTP.g:10938:17: ( '%' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalTPTP.g:10938:19: '%' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('%'); 
            // InternalTPTP.g:10938:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTPTP.g:10938:23: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop7;
                }
            } while (true);

            // InternalTPTP.g:10938:39: ( ( '\\r' )? '\\n' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\n'||LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTPTP.g:10938:40: ( '\\r' )? '\\n'
                    {
                    // InternalTPTP.g:10938:40: ( '\\r' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\r') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalTPTP.g:10938:40: '\\r'
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
            // InternalTPTP.g:10940:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalTPTP.g:10940:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalTPTP.g:10940:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||LA10_0==' ') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTPTP.g:
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
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTPTP.g:10942:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalTPTP.g:10942:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalTPTP.g:10942:11: ( '^' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='^') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTPTP.g:10942:11: '^'
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

            // InternalTPTP.g:10942:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')||(LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTPTP.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
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

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTPTP.g:10944:10: ( ( '0' .. '9' )+ )
            // InternalTPTP.g:10944:12: ( '0' .. '9' )+
            {
            // InternalTPTP.g:10944:12: ( '0' .. '9' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTPTP.g:10944:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTPTP.g:10946:16: ( . )
            // InternalTPTP.g:10946:18: .
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
        // InternalTPTP.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | RULE_LOWER_TOKEN | RULE_UPPER_TOKEN | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ID | RULE_INT | RULE_ANY_OTHER )
        int alt14=79;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalTPTP.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalTPTP.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalTPTP.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalTPTP.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalTPTP.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalTPTP.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalTPTP.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalTPTP.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalTPTP.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalTPTP.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalTPTP.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalTPTP.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalTPTP.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalTPTP.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalTPTP.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalTPTP.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalTPTP.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalTPTP.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalTPTP.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalTPTP.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalTPTP.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalTPTP.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalTPTP.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalTPTP.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // InternalTPTP.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // InternalTPTP.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // InternalTPTP.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // InternalTPTP.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // InternalTPTP.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // InternalTPTP.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // InternalTPTP.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // InternalTPTP.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // InternalTPTP.g:1:202: T__45
                {
                mT__45(); 

                }
                break;
            case 34 :
                // InternalTPTP.g:1:208: T__46
                {
                mT__46(); 

                }
                break;
            case 35 :
                // InternalTPTP.g:1:214: T__47
                {
                mT__47(); 

                }
                break;
            case 36 :
                // InternalTPTP.g:1:220: T__48
                {
                mT__48(); 

                }
                break;
            case 37 :
                // InternalTPTP.g:1:226: T__49
                {
                mT__49(); 

                }
                break;
            case 38 :
                // InternalTPTP.g:1:232: T__50
                {
                mT__50(); 

                }
                break;
            case 39 :
                // InternalTPTP.g:1:238: T__51
                {
                mT__51(); 

                }
                break;
            case 40 :
                // InternalTPTP.g:1:244: T__52
                {
                mT__52(); 

                }
                break;
            case 41 :
                // InternalTPTP.g:1:250: T__53
                {
                mT__53(); 

                }
                break;
            case 42 :
                // InternalTPTP.g:1:256: T__54
                {
                mT__54(); 

                }
                break;
            case 43 :
                // InternalTPTP.g:1:262: T__55
                {
                mT__55(); 

                }
                break;
            case 44 :
                // InternalTPTP.g:1:268: T__56
                {
                mT__56(); 

                }
                break;
            case 45 :
                // InternalTPTP.g:1:274: T__57
                {
                mT__57(); 

                }
                break;
            case 46 :
                // InternalTPTP.g:1:280: T__58
                {
                mT__58(); 

                }
                break;
            case 47 :
                // InternalTPTP.g:1:286: T__59
                {
                mT__59(); 

                }
                break;
            case 48 :
                // InternalTPTP.g:1:292: T__60
                {
                mT__60(); 

                }
                break;
            case 49 :
                // InternalTPTP.g:1:298: T__61
                {
                mT__61(); 

                }
                break;
            case 50 :
                // InternalTPTP.g:1:304: T__62
                {
                mT__62(); 

                }
                break;
            case 51 :
                // InternalTPTP.g:1:310: T__63
                {
                mT__63(); 

                }
                break;
            case 52 :
                // InternalTPTP.g:1:316: T__64
                {
                mT__64(); 

                }
                break;
            case 53 :
                // InternalTPTP.g:1:322: T__65
                {
                mT__65(); 

                }
                break;
            case 54 :
                // InternalTPTP.g:1:328: T__66
                {
                mT__66(); 

                }
                break;
            case 55 :
                // InternalTPTP.g:1:334: T__67
                {
                mT__67(); 

                }
                break;
            case 56 :
                // InternalTPTP.g:1:340: T__68
                {
                mT__68(); 

                }
                break;
            case 57 :
                // InternalTPTP.g:1:346: T__69
                {
                mT__69(); 

                }
                break;
            case 58 :
                // InternalTPTP.g:1:352: T__70
                {
                mT__70(); 

                }
                break;
            case 59 :
                // InternalTPTP.g:1:358: T__71
                {
                mT__71(); 

                }
                break;
            case 60 :
                // InternalTPTP.g:1:364: T__72
                {
                mT__72(); 

                }
                break;
            case 61 :
                // InternalTPTP.g:1:370: T__73
                {
                mT__73(); 

                }
                break;
            case 62 :
                // InternalTPTP.g:1:376: T__74
                {
                mT__74(); 

                }
                break;
            case 63 :
                // InternalTPTP.g:1:382: T__75
                {
                mT__75(); 

                }
                break;
            case 64 :
                // InternalTPTP.g:1:388: T__76
                {
                mT__76(); 

                }
                break;
            case 65 :
                // InternalTPTP.g:1:394: T__77
                {
                mT__77(); 

                }
                break;
            case 66 :
                // InternalTPTP.g:1:400: T__78
                {
                mT__78(); 

                }
                break;
            case 67 :
                // InternalTPTP.g:1:406: T__79
                {
                mT__79(); 

                }
                break;
            case 68 :
                // InternalTPTP.g:1:412: T__80
                {
                mT__80(); 

                }
                break;
            case 69 :
                // InternalTPTP.g:1:418: T__81
                {
                mT__81(); 

                }
                break;
            case 70 :
                // InternalTPTP.g:1:424: T__82
                {
                mT__82(); 

                }
                break;
            case 71 :
                // InternalTPTP.g:1:430: RULE_LOWER_TOKEN
                {
                mRULE_LOWER_TOKEN(); 

                }
                break;
            case 72 :
                // InternalTPTP.g:1:447: RULE_UPPER_TOKEN
                {
                mRULE_UPPER_TOKEN(); 

                }
                break;
            case 73 :
                // InternalTPTP.g:1:464: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 74 :
                // InternalTPTP.g:1:476: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 75 :
                // InternalTPTP.g:1:492: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 76 :
                // InternalTPTP.g:1:508: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 77 :
                // InternalTPTP.g:1:516: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 78 :
                // InternalTPTP.g:1:524: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 79 :
                // InternalTPTP.g:1:533: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\6\51\1\46\1\100\1\102\2\uffff\1\51\1\107\3\uffff\1\46\1\116\1\121\2\51\1\127\1\51\5\uffff\1\137\1\51\1\141\2\46\2\uffff\1\51\2\uffff\2\51\1\uffff\6\51\2\uffff\1\162\22\uffff\1\51\5\uffff\1\172\6\uffff\4\51\2\uffff\1\51\7\uffff\1\141\4\uffff\10\51\13\uffff\1\51\2\uffff\11\51\1\uffff\2\51\7\uffff\1\51\1\u00a3\2\uffff\1\51\1\uffff\1\u00a5\4\51\1\u00aa\5\uffff\1\u00af\2\uffff\1\u00b2\1\uffff\1\51\1\uffff\4\51\11\uffff\5\51\3\uffff\5\51\2\uffff\1\u00cb\1\uffff\4\51\1\uffff\1\u00d2\2\uffff\1\u00d3\1\51\1\u00d5\1\u00d6\4\uffff\1\51\6\uffff\1\51\3\uffff\5\51\1\u00e5\1\uffff";
    static final String DFA14_eofS =
        "\u00e6\uffff";
    static final String DFA14_minS =
        "\1\0\6\60\1\144\1\41\1\77\2\uffff\1\60\1\76\3\uffff\1\75\1\101\1\46\2\60\1\56\1\60\5\uffff\1\52\2\60\2\0\2\uffff\1\60\2\uffff\2\60\1\uffff\6\60\1\124\1\uffff\1\156\1\uffff\1\141\1\uffff\1\145\3\uffff\1\165\1\162\11\uffff\1\60\5\uffff\1\76\6\uffff\4\60\2\uffff\1\60\7\uffff\1\60\4\uffff\5\60\1\50\2\60\2\uffff\1\137\1\uffff\1\137\1\uffff\1\141\1\uffff\1\163\1\157\1\145\1\60\2\uffff\1\60\2\50\1\60\1\50\4\60\1\uffff\2\60\2\151\1\uffff\1\141\1\163\1\164\1\141\1\60\1\55\2\uffff\1\60\1\uffff\1\55\4\60\1\55\1\uffff\1\141\2\uffff\1\151\1\145\1\151\1\164\1\55\1\uffff\1\60\1\uffff\4\60\3\uffff\1\156\2\uffff\2\145\1\uffff\5\60\1\144\1\156\1\162\1\50\4\60\1\145\1\164\1\145\1\uffff\4\60\1\162\1\137\2\uffff\1\55\1\60\2\55\1\137\1\145\2\uffff\1\60\2\uffff\1\145\3\uffff\1\60\3\uffff\5\60\1\55\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\6\172\1\165\1\76\1\77\2\uffff\1\172\1\76\3\uffff\1\176\1\172\1\174\2\172\1\56\1\172\5\uffff\1\52\2\172\2\uffff\2\uffff\1\71\2\uffff\2\172\1\uffff\6\172\1\162\1\uffff\1\163\1\uffff\1\145\1\uffff\1\145\3\uffff\1\165\1\162\11\uffff\1\172\5\uffff\1\76\6\uffff\4\172\2\uffff\1\172\7\uffff\1\172\4\uffff\1\71\7\172\2\uffff\1\137\1\uffff\1\137\1\uffff\1\155\1\uffff\1\163\1\157\1\145\1\172\2\uffff\11\172\1\uffff\2\172\2\162\1\uffff\1\141\1\163\1\164\1\141\2\172\2\uffff\1\172\1\uffff\6\172\1\uffff\1\145\2\uffff\1\151\1\145\1\151\1\164\1\172\1\uffff\1\172\1\uffff\4\172\3\uffff\1\156\2\uffff\2\145\1\uffff\5\172\1\144\1\156\1\162\5\172\1\145\1\164\1\145\1\uffff\4\172\1\162\1\137\2\uffff\4\172\1\137\1\164\2\uffff\1\172\2\uffff\1\164\3\uffff\1\172\3\uffff\6\172\1\uffff";
    static final String DFA14_acceptS =
        "\12\uffff\1\13\1\14\2\uffff\1\53\1\56\1\57\7\uffff\1\73\1\74\1\76\1\77\1\100\5\uffff\1\113\1\114\1\uffff\1\107\1\117\2\uffff\1\107\7\uffff\1\10\1\uffff\1\16\1\uffff\1\25\1\uffff\1\32\1\33\1\34\2\uffff\1\47\1\52\1\55\1\106\1\11\1\54\1\12\1\13\1\14\1\uffff\1\60\1\51\1\53\1\56\1\57\1\uffff\1\63\1\115\1\64\1\65\1\66\1\104\4\uffff\1\71\1\75\1\uffff\1\73\1\74\1\76\1\77\1\100\1\112\1\105\1\uffff\1\110\1\111\1\113\1\114\10\uffff\1\7\1\17\1\uffff\1\20\1\uffff\1\15\1\uffff\1\22\4\uffff\1\62\1\61\11\uffff\1\102\4\uffff\1\21\6\uffff\1\101\1\103\1\uffff\1\72\6\uffff\1\26\1\uffff\1\23\1\24\5\uffff\1\67\1\uffff\1\1\4\uffff\1\6\1\27\1\30\1\uffff\1\45\1\31\2\uffff\1\50\20\uffff\1\70\6\uffff\1\44\1\46\6\uffff\1\35\1\2\1\uffff\1\4\1\5\1\uffff\1\36\1\37\1\40\1\uffff\1\41\1\42\1\43\6\uffff\1\3";
    static final String DFA14_specialS =
        "\1\2\37\uffff\1\0\1\1\u00c4\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\46\2\43\2\46\1\43\22\46\1\43\1\10\1\40\1\46\1\7\1\42\1\17\1\41\1\31\1\26\1\13\1\46\1\30\2\45\1\35\12\44\1\34\1\46\1\21\1\15\1\12\1\11\1\16\32\37\1\32\1\46\1\33\1\22\1\36\1\46\1\1\1\36\1\4\1\5\1\36\1\27\1\36\1\2\1\25\2\36\1\6\1\36\1\3\1\36\1\14\3\36\1\24\6\36\1\46\1\20\1\46\1\23\uff81\46",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\27\50\1\47\2\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\30\50\1\52\1\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\4\50\1\53\25\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\15\50\1\55\1\54\13\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\4\50\1\56\25\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\4\50\1\57\25\50",
            "\1\70\1\74\1\61\1\73\1\uffff\1\62\2\uffff\1\66\2\uffff\1\63\1\71\1\72\1\64\1\67\1\60\1\65",
            "\1\76\33\uffff\1\75\1\77",
            "\1\101",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\13\50\1\105\16\50",
            "\1\106",
            "",
            "",
            "",
            "\1\113\100\uffff\1\114",
            "\32\115\4\uffff\1\115\1\uffff\32\115",
            "\1\120\125\uffff\1\117",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\5\50\1\123\1\50\1\124\20\50\1\122\1\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\15\50\1\125\14\50",
            "\1\126",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\16\50\1\130\13\50",
            "",
            "",
            "",
            "",
            "",
            "\1\136",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\140\7\uffff\32\140\4\uffff\1\140\1\uffff\32\140",
            "\0\142",
            "\0\142",
            "",
            "",
            "\12\145",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\10\50\1\146\21\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\17\50\1\147\12\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\6\50\1\150\23\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\15\50\1\151\14\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\5\50\1\152\24\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\5\50\1\153\24\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\14\50\1\154\15\50",
            "\1\156\32\uffff\1\157\2\uffff\1\155",
            "",
            "\1\160\4\uffff\1\161",
            "",
            "\1\164\3\uffff\1\163",
            "",
            "\1\165",
            "",
            "",
            "",
            "\1\166",
            "\1\167",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\1\170\31\50",
            "",
            "",
            "",
            "",
            "",
            "\1\171",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\17\50\1\173\12\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\5\50\1\174\24\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\5\50\1\175\24\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\2\50\1\176\27\50",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\5\50\1\177\24\50",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\140\7\uffff\32\140\4\uffff\1\140\1\uffff\32\140",
            "",
            "",
            "",
            "",
            "\12\145",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\16\50\1\u0080\13\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\16\50\1\u0081\13\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\1\u0082\31\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\11\50\1\u0083\20\50",
            "\1\u0084\7\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\10\50\1\u0085\21\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\14\50\1\u0086\15\50",
            "",
            "",
            "\1\u0087",
            "",
            "\1\u0088",
            "",
            "\1\u0089\13\uffff\1\u008a",
            "",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\10\50\1\u008e\21\50",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\4\50\1\u008f\25\50",
            "\1\u0090\7\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0091\7\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\13\50\1\u0092\16\50",
            "\1\u0093\7\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\14\50\1\u0094\15\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\23\50\1\u0095\6\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\23\50\1\u0096\6\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\4\50\1\u0097\25\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\15\50\1\u0098\14\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\1\u0099\31\50",
            "\1\u009a\10\uffff\1\u009b",
            "\1\u009c\10\uffff\1\u009d",
            "",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\15\50\1\u00a2\14\50",
            "\2\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\24\50\1\u00a4\5\50",
            "",
            "\2\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\7\50\1\u00a6\22\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\4\50\1\u00a7\25\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\2\50\1\u00a8\27\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\10\50\1\u00a9\21\50",
            "\2\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u00ab\3\uffff\1\u00ac",
            "",
            "",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00b0",
            "\1\u00b1",
            "\2\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\3\50\1\u00b3\26\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\4\50\1\u00b4\25\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\3\50\1\u00b5\26\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\23\50\1\u00b6\6\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\23\50\1\u00b7\6\50",
            "",
            "",
            "",
            "\1\u00b8",
            "",
            "",
            "\1\u00b9",
            "\1\u00ba",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\4\50\1\u00bb\25\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\22\50\1\u00bc\7\50",
            "\12\50\7\uffff\32\50\4\uffff\1\u00bd\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\24\50\1\u00be\5\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\10\50\1\u00bf\21\50",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3\7\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\10\50\1\u00c4\21\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\2\50\1\u00c5\27\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\21\50\1\u00c6\10\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\16\50\1\u00c7\13\50",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\22\50\1\u00cc\7\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\16\50\1\u00cd\13\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\4\50\1\u00ce\25\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\15\50\1\u00cf\14\50",
            "\1\u00d0",
            "\1\u00d1",
            "",
            "",
            "\2\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\15\50\1\u00d4\14\50",
            "\2\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\2\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00d7",
            "\1\u00d8\1\u00da\15\uffff\1\u00d9",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\11\50\1\u00db\20\50",
            "",
            "",
            "\1\u00dc\1\u00de\15\uffff\1\u00dd",
            "",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\4\50\1\u00df\25\50",
            "",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\2\50\1\u00e0\27\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\23\50\1\u00e1\6\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\24\50\1\u00e2\5\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\21\50\1\u00e3\10\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\4\50\1\u00e4\25\50",
            "\2\51\1\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | RULE_LOWER_TOKEN | RULE_UPPER_TOKEN | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ID | RULE_INT | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_32 = input.LA(1);

                        s = -1;
                        if ( ((LA14_32>='\u0000' && LA14_32<='\uFFFF')) ) {s = 98;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_33 = input.LA(1);

                        s = -1;
                        if ( ((LA14_33>='\u0000' && LA14_33<='\uFFFF')) ) {s = 98;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='a') ) {s = 1;}

                        else if ( (LA14_0=='h') ) {s = 2;}

                        else if ( (LA14_0=='n') ) {s = 3;}

                        else if ( (LA14_0=='c') ) {s = 4;}

                        else if ( (LA14_0=='d') ) {s = 5;}

                        else if ( (LA14_0=='l') ) {s = 6;}

                        else if ( (LA14_0=='$') ) {s = 7;}

                        else if ( (LA14_0=='!') ) {s = 8;}

                        else if ( (LA14_0=='?') ) {s = 9;}

                        else if ( (LA14_0=='>') ) {s = 10;}

                        else if ( (LA14_0=='*') ) {s = 11;}

                        else if ( (LA14_0=='p') ) {s = 12;}

                        else if ( (LA14_0=='=') ) {s = 13;}

                        else if ( (LA14_0=='@') ) {s = 14;}

                        else if ( (LA14_0=='&') ) {s = 15;}

                        else if ( (LA14_0=='|') ) {s = 16;}

                        else if ( (LA14_0=='<') ) {s = 17;}

                        else if ( (LA14_0=='^') ) {s = 18;}

                        else if ( (LA14_0=='~') ) {s = 19;}

                        else if ( (LA14_0=='t') ) {s = 20;}

                        else if ( (LA14_0=='i') ) {s = 21;}

                        else if ( (LA14_0==')') ) {s = 22;}

                        else if ( (LA14_0=='f') ) {s = 23;}

                        else if ( (LA14_0==',') ) {s = 24;}

                        else if ( (LA14_0=='(') ) {s = 25;}

                        else if ( (LA14_0=='[') ) {s = 26;}

                        else if ( (LA14_0==']') ) {s = 27;}

                        else if ( (LA14_0==':') ) {s = 28;}

                        else if ( (LA14_0=='/') ) {s = 29;}

                        else if ( (LA14_0=='_'||LA14_0=='b'||LA14_0=='e'||LA14_0=='g'||(LA14_0>='j' && LA14_0<='k')||LA14_0=='m'||LA14_0=='o'||(LA14_0>='q' && LA14_0<='s')||(LA14_0>='u' && LA14_0<='z')) ) {s = 30;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')) ) {s = 31;}

                        else if ( (LA14_0=='\"') ) {s = 32;}

                        else if ( (LA14_0=='\'') ) {s = 33;}

                        else if ( (LA14_0=='%') ) {s = 34;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 35;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 36;}

                        else if ( ((LA14_0>='-' && LA14_0<='.')) ) {s = 37;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='#'||LA14_0=='+'||LA14_0==';'||LA14_0=='\\'||LA14_0=='`'||LA14_0=='{'||LA14_0=='}'||(LA14_0>='\u007F' && LA14_0<='\uFFFF')) ) {s = 38;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}