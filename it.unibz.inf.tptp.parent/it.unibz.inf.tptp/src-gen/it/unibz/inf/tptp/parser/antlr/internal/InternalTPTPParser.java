package it.unibz.inf.tptp.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import it.unibz.inf.tptp.services.TPTPGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTPTPParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_UPPER_TOKEN", "RULE_LOWER_TOKEN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ID", "RULE_INT", "RULE_ANY_OTHER", "'include('", "').'", "'fof('", "','", "'axiom'", "'hypothesis'", "'negated_conjecture'", "'conjecture'", "'definition'", "'lemma'", "'('", "')'", "'~'", "'$true'", "'$false'", "'!'", "'?'", "'['", "']'", "':'", "'tff('", "'type'", "'>'", "'*'", "'$i'", "'$o'", "'$tType'", "'$int'", "'$real'", "'$rat'", "'/'", "'$is_int'", "'$is_rat'", "'$uminus'", "'$to_int'", "'$to_rat'", "'$to_real'", "'$less'", "'$sum'", "'$difference'", "'$product'", "'$quotient'", "'$quotient_e'", "'$quotient_t'", "'$quotient_f'", "'$remainder_e'", "'$remainder_t'", "'$remainder_f'", "'$greatereq'", "'$lesseq'", "'$greater'", "'$eq'", "'!>'", "'cnf('", "'plain'", "'|'", "'='", "'!='", "'thf('", "'@'", "'??'", "'!!'", "'&'", "'=>'", "'<='", "'<=>'", "'<~>'", "'^'", "'~|'", "'~&'"
    };
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
    public static final int RULE_UPPER_TOKEN=5;
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
    public static final int RULE_LOWER_TOKEN=6;
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


        public InternalTPTPParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTPTPParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTPTPParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTPTP.g"; }



     	private TPTPGrammarAccess grammarAccess;

        public InternalTPTPParser(TokenStream input, TPTPGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected TPTPGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalTPTP.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalTPTP.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalTPTP.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalTPTP.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_TPTP_input_0_0= ruleinclude ) )* ( ( (lv_TPTP_input_1_0= rulefof_input ) )* | ( (lv_TPTP_input_2_0= ruletff_input ) )* | ( (lv_TPTP_input_3_0= rulecnf_input ) )* | ( (lv_TPTP_input_4_0= rulethf_input ) )* ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_TPTP_input_0_0 = null;

        EObject lv_TPTP_input_1_0 = null;

        EObject lv_TPTP_input_2_0 = null;

        EObject lv_TPTP_input_3_0 = null;

        EObject lv_TPTP_input_4_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:77:2: ( ( ( (lv_TPTP_input_0_0= ruleinclude ) )* ( ( (lv_TPTP_input_1_0= rulefof_input ) )* | ( (lv_TPTP_input_2_0= ruletff_input ) )* | ( (lv_TPTP_input_3_0= rulecnf_input ) )* | ( (lv_TPTP_input_4_0= rulethf_input ) )* ) ) )
            // InternalTPTP.g:78:2: ( ( (lv_TPTP_input_0_0= ruleinclude ) )* ( ( (lv_TPTP_input_1_0= rulefof_input ) )* | ( (lv_TPTP_input_2_0= ruletff_input ) )* | ( (lv_TPTP_input_3_0= rulecnf_input ) )* | ( (lv_TPTP_input_4_0= rulethf_input ) )* ) )
            {
            // InternalTPTP.g:78:2: ( ( (lv_TPTP_input_0_0= ruleinclude ) )* ( ( (lv_TPTP_input_1_0= rulefof_input ) )* | ( (lv_TPTP_input_2_0= ruletff_input ) )* | ( (lv_TPTP_input_3_0= rulecnf_input ) )* | ( (lv_TPTP_input_4_0= rulethf_input ) )* ) )
            // InternalTPTP.g:79:3: ( (lv_TPTP_input_0_0= ruleinclude ) )* ( ( (lv_TPTP_input_1_0= rulefof_input ) )* | ( (lv_TPTP_input_2_0= ruletff_input ) )* | ( (lv_TPTP_input_3_0= rulecnf_input ) )* | ( (lv_TPTP_input_4_0= rulethf_input ) )* )
            {
            // InternalTPTP.g:79:3: ( (lv_TPTP_input_0_0= ruleinclude ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==RULE_STRING) ) {
                        int LA1_3 = input.LA(3);

                        if ( (LA1_3==14) ) {
                            alt1=1;
                        }


                    }


                }


                switch (alt1) {
            	case 1 :
            	    // InternalTPTP.g:80:4: (lv_TPTP_input_0_0= ruleinclude )
            	    {
            	    // InternalTPTP.g:80:4: (lv_TPTP_input_0_0= ruleinclude )
            	    // InternalTPTP.g:81:5: lv_TPTP_input_0_0= ruleinclude
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getTPTP_inputIncludeParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_TPTP_input_0_0=ruleinclude();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"TPTP_input",
            	    						lv_TPTP_input_0_0,
            	    						"it.unibz.inf.tptp.TPTP.include");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalTPTP.g:98:3: ( ( (lv_TPTP_input_1_0= rulefof_input ) )* | ( (lv_TPTP_input_2_0= ruletff_input ) )* | ( (lv_TPTP_input_3_0= rulecnf_input ) )* | ( (lv_TPTP_input_4_0= rulethf_input ) )* )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt6=1;
                }
                break;
            case 13:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==RULE_STRING) ) {
                    int LA6_7 = input.LA(3);

                    if ( (LA6_7==14) ) {
                        alt6=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 7, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case EOF:
                {
                alt6=1;
                }
                break;
            case 33:
                {
                alt6=2;
                }
                break;
            case 66:
                {
                alt6=3;
                }
                break;
            case 71:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalTPTP.g:99:4: ( (lv_TPTP_input_1_0= rulefof_input ) )*
                    {
                    // InternalTPTP.g:99:4: ( (lv_TPTP_input_1_0= rulefof_input ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==13||LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalTPTP.g:100:5: (lv_TPTP_input_1_0= rulefof_input )
                    	    {
                    	    // InternalTPTP.g:100:5: (lv_TPTP_input_1_0= rulefof_input )
                    	    // InternalTPTP.g:101:6: lv_TPTP_input_1_0= rulefof_input
                    	    {

                    	    						newCompositeNode(grammarAccess.getModelAccess().getTPTP_inputFof_inputParserRuleCall_1_0_0());
                    	    					
                    	    pushFollow(FOLLOW_4);
                    	    lv_TPTP_input_1_0=rulefof_input();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getModelRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"TPTP_input",
                    	    							lv_TPTP_input_1_0,
                    	    							"it.unibz.inf.tptp.TPTP.fof_input");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalTPTP.g:119:4: ( (lv_TPTP_input_2_0= ruletff_input ) )*
                    {
                    // InternalTPTP.g:119:4: ( (lv_TPTP_input_2_0= ruletff_input ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==13||LA3_0==33) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalTPTP.g:120:5: (lv_TPTP_input_2_0= ruletff_input )
                    	    {
                    	    // InternalTPTP.g:120:5: (lv_TPTP_input_2_0= ruletff_input )
                    	    // InternalTPTP.g:121:6: lv_TPTP_input_2_0= ruletff_input
                    	    {

                    	    						newCompositeNode(grammarAccess.getModelAccess().getTPTP_inputTff_inputParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_5);
                    	    lv_TPTP_input_2_0=ruletff_input();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getModelRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"TPTP_input",
                    	    							lv_TPTP_input_2_0,
                    	    							"it.unibz.inf.tptp.TPTP.tff_input");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // InternalTPTP.g:139:4: ( (lv_TPTP_input_3_0= rulecnf_input ) )*
                    {
                    // InternalTPTP.g:139:4: ( (lv_TPTP_input_3_0= rulecnf_input ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==13||LA4_0==66) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalTPTP.g:140:5: (lv_TPTP_input_3_0= rulecnf_input )
                    	    {
                    	    // InternalTPTP.g:140:5: (lv_TPTP_input_3_0= rulecnf_input )
                    	    // InternalTPTP.g:141:6: lv_TPTP_input_3_0= rulecnf_input
                    	    {

                    	    						newCompositeNode(grammarAccess.getModelAccess().getTPTP_inputCnf_inputParserRuleCall_1_2_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_TPTP_input_3_0=rulecnf_input();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getModelRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"TPTP_input",
                    	    							lv_TPTP_input_3_0,
                    	    							"it.unibz.inf.tptp.TPTP.cnf_input");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;
                case 4 :
                    // InternalTPTP.g:159:4: ( (lv_TPTP_input_4_0= rulethf_input ) )*
                    {
                    // InternalTPTP.g:159:4: ( (lv_TPTP_input_4_0= rulethf_input ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==13||LA5_0==71) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalTPTP.g:160:5: (lv_TPTP_input_4_0= rulethf_input )
                    	    {
                    	    // InternalTPTP.g:160:5: (lv_TPTP_input_4_0= rulethf_input )
                    	    // InternalTPTP.g:161:6: lv_TPTP_input_4_0= rulethf_input
                    	    {

                    	    						newCompositeNode(grammarAccess.getModelAccess().getTPTP_inputThf_inputParserRuleCall_1_3_0());
                    	    					
                    	    pushFollow(FOLLOW_7);
                    	    lv_TPTP_input_4_0=rulethf_input();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getModelRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"TPTP_input",
                    	    							lv_TPTP_input_4_0,
                    	    							"it.unibz.inf.tptp.TPTP.thf_input");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleinclude"
    // InternalTPTP.g:183:1: entryRuleinclude returns [EObject current=null] : iv_ruleinclude= ruleinclude EOF ;
    public final EObject entryRuleinclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinclude = null;


        try {
            // InternalTPTP.g:183:48: (iv_ruleinclude= ruleinclude EOF )
            // InternalTPTP.g:184:2: iv_ruleinclude= ruleinclude EOF
            {
             newCompositeNode(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleinclude=ruleinclude();

            state._fsp--;

             current =iv_ruleinclude; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleinclude"


    // $ANTLR start "ruleinclude"
    // InternalTPTP.g:190:1: ruleinclude returns [EObject current=null] : (otherlv_0= 'include(' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ').' ) ;
    public final EObject ruleinclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_path_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalTPTP.g:196:2: ( (otherlv_0= 'include(' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ').' ) )
            // InternalTPTP.g:197:2: (otherlv_0= 'include(' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ').' )
            {
            // InternalTPTP.g:197:2: (otherlv_0= 'include(' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ').' )
            // InternalTPTP.g:198:3: otherlv_0= 'include(' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ').'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getIncludeAccess().getIncludeKeyword_0());
            		
            // InternalTPTP.g:202:3: ( (lv_path_1_0= RULE_STRING ) )
            // InternalTPTP.g:203:4: (lv_path_1_0= RULE_STRING )
            {
            // InternalTPTP.g:203:4: (lv_path_1_0= RULE_STRING )
            // InternalTPTP.g:204:5: lv_path_1_0= RULE_STRING
            {
            lv_path_1_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_path_1_0, grammarAccess.getIncludeAccess().getPathSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIncludeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_1_0,
            						"it.unibz.inf.tptp.TPTP.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getIncludeAccess().getRightParenthesisFullStopKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleinclude"


    // $ANTLR start "entryRulefof_input"
    // InternalTPTP.g:228:1: entryRulefof_input returns [EObject current=null] : iv_rulefof_input= rulefof_input EOF ;
    public final EObject entryRulefof_input() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefof_input = null;


        try {
            // InternalTPTP.g:228:50: (iv_rulefof_input= rulefof_input EOF )
            // InternalTPTP.g:229:2: iv_rulefof_input= rulefof_input EOF
            {
             newCompositeNode(grammarAccess.getFof_inputRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefof_input=rulefof_input();

            state._fsp--;

             current =iv_rulefof_input; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefof_input"


    // $ANTLR start "rulefof_input"
    // InternalTPTP.g:235:1: rulefof_input returns [EObject current=null] : (this_fof_root_0= rulefof_root | this_include_1= ruleinclude ) ;
    public final EObject rulefof_input() throws RecognitionException {
        EObject current = null;

        EObject this_fof_root_0 = null;

        EObject this_include_1 = null;



        	enterRule();

        try {
            // InternalTPTP.g:241:2: ( (this_fof_root_0= rulefof_root | this_include_1= ruleinclude ) )
            // InternalTPTP.g:242:2: (this_fof_root_0= rulefof_root | this_include_1= ruleinclude )
            {
            // InternalTPTP.g:242:2: (this_fof_root_0= rulefof_root | this_include_1= ruleinclude )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==13) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTPTP.g:243:3: this_fof_root_0= rulefof_root
                    {

                    			newCompositeNode(grammarAccess.getFof_inputAccess().getFof_rootParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_fof_root_0=rulefof_root();

                    state._fsp--;


                    			current = this_fof_root_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:252:3: this_include_1= ruleinclude
                    {

                    			newCompositeNode(grammarAccess.getFof_inputAccess().getIncludeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_include_1=ruleinclude();

                    state._fsp--;


                    			current = this_include_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefof_input"


    // $ANTLR start "entryRulefof_root"
    // InternalTPTP.g:264:1: entryRulefof_root returns [EObject current=null] : iv_rulefof_root= rulefof_root EOF ;
    public final EObject entryRulefof_root() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefof_root = null;


        try {
            // InternalTPTP.g:264:49: (iv_rulefof_root= rulefof_root EOF )
            // InternalTPTP.g:265:2: iv_rulefof_root= rulefof_root EOF
            {
             newCompositeNode(grammarAccess.getFof_rootRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefof_root=rulefof_root();

            state._fsp--;

             current =iv_rulefof_root; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefof_root"


    // $ANTLR start "rulefof_root"
    // InternalTPTP.g:271:1: rulefof_root returns [EObject current=null] : (otherlv_0= 'fof(' ( ( (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING ) ) ) otherlv_2= ',' ( ( (lv_formula_role_3_1= 'axiom' | lv_formula_role_3_2= 'hypothesis' | lv_formula_role_3_3= 'negated_conjecture' | lv_formula_role_3_4= 'conjecture' | lv_formula_role_3_5= 'definition' | lv_formula_role_3_6= 'lemma' ) ) ) otherlv_4= ',' ( (lv_exp_5_0= rulefof_expression ) ) otherlv_6= ').' ) ;
    public final EObject rulefof_root() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_2=null;
        Token otherlv_2=null;
        Token lv_formula_role_3_1=null;
        Token lv_formula_role_3_2=null;
        Token lv_formula_role_3_3=null;
        Token lv_formula_role_3_4=null;
        Token lv_formula_role_3_5=null;
        Token lv_formula_role_3_6=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_1 = null;

        EObject lv_exp_5_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:277:2: ( (otherlv_0= 'fof(' ( ( (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING ) ) ) otherlv_2= ',' ( ( (lv_formula_role_3_1= 'axiom' | lv_formula_role_3_2= 'hypothesis' | lv_formula_role_3_3= 'negated_conjecture' | lv_formula_role_3_4= 'conjecture' | lv_formula_role_3_5= 'definition' | lv_formula_role_3_6= 'lemma' ) ) ) otherlv_4= ',' ( (lv_exp_5_0= rulefof_expression ) ) otherlv_6= ').' ) )
            // InternalTPTP.g:278:2: (otherlv_0= 'fof(' ( ( (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING ) ) ) otherlv_2= ',' ( ( (lv_formula_role_3_1= 'axiom' | lv_formula_role_3_2= 'hypothesis' | lv_formula_role_3_3= 'negated_conjecture' | lv_formula_role_3_4= 'conjecture' | lv_formula_role_3_5= 'definition' | lv_formula_role_3_6= 'lemma' ) ) ) otherlv_4= ',' ( (lv_exp_5_0= rulefof_expression ) ) otherlv_6= ').' )
            {
            // InternalTPTP.g:278:2: (otherlv_0= 'fof(' ( ( (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING ) ) ) otherlv_2= ',' ( ( (lv_formula_role_3_1= 'axiom' | lv_formula_role_3_2= 'hypothesis' | lv_formula_role_3_3= 'negated_conjecture' | lv_formula_role_3_4= 'conjecture' | lv_formula_role_3_5= 'definition' | lv_formula_role_3_6= 'lemma' ) ) ) otherlv_4= ',' ( (lv_exp_5_0= rulefof_expression ) ) otherlv_6= ').' )
            // InternalTPTP.g:279:3: otherlv_0= 'fof(' ( ( (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING ) ) ) otherlv_2= ',' ( ( (lv_formula_role_3_1= 'axiom' | lv_formula_role_3_2= 'hypothesis' | lv_formula_role_3_3= 'negated_conjecture' | lv_formula_role_3_4= 'conjecture' | lv_formula_role_3_5= 'definition' | lv_formula_role_3_6= 'lemma' ) ) ) otherlv_4= ',' ( (lv_exp_5_0= rulefof_expression ) ) otherlv_6= ').'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getFof_rootAccess().getFofKeyword_0());
            		
            // InternalTPTP.g:283:3: ( ( (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING ) ) )
            // InternalTPTP.g:284:4: ( (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING ) )
            {
            // InternalTPTP.g:284:4: ( (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING ) )
            // InternalTPTP.g:285:5: (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING )
            {
            // InternalTPTP.g:285:5: (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_LOWER_TOKEN||(LA8_0>=17 && LA8_0<=22)||LA8_0==34||LA8_0==67) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_STRING) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTPTP.g:286:6: lv_name_1_1= rulelower_token_and_keyword
                    {

                    						newCompositeNode(grammarAccess.getFof_rootAccess().getNameLower_token_and_keywordParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_name_1_1=rulelower_token_and_keyword();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFof_rootRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_1_1,
                    							"it.unibz.inf.tptp.TPTP.lower_token_and_keyword");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:302:6: lv_name_1_2= RULE_STRING
                    {
                    lv_name_1_2=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    						newLeafNode(lv_name_1_2, grammarAccess.getFof_rootAccess().getNameSTRINGTerminalRuleCall_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFof_rootRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_2,
                    							"it.unibz.inf.tptp.TPTP.STRING");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getFof_rootAccess().getCommaKeyword_2());
            		
            // InternalTPTP.g:323:3: ( ( (lv_formula_role_3_1= 'axiom' | lv_formula_role_3_2= 'hypothesis' | lv_formula_role_3_3= 'negated_conjecture' | lv_formula_role_3_4= 'conjecture' | lv_formula_role_3_5= 'definition' | lv_formula_role_3_6= 'lemma' ) ) )
            // InternalTPTP.g:324:4: ( (lv_formula_role_3_1= 'axiom' | lv_formula_role_3_2= 'hypothesis' | lv_formula_role_3_3= 'negated_conjecture' | lv_formula_role_3_4= 'conjecture' | lv_formula_role_3_5= 'definition' | lv_formula_role_3_6= 'lemma' ) )
            {
            // InternalTPTP.g:324:4: ( (lv_formula_role_3_1= 'axiom' | lv_formula_role_3_2= 'hypothesis' | lv_formula_role_3_3= 'negated_conjecture' | lv_formula_role_3_4= 'conjecture' | lv_formula_role_3_5= 'definition' | lv_formula_role_3_6= 'lemma' ) )
            // InternalTPTP.g:325:5: (lv_formula_role_3_1= 'axiom' | lv_formula_role_3_2= 'hypothesis' | lv_formula_role_3_3= 'negated_conjecture' | lv_formula_role_3_4= 'conjecture' | lv_formula_role_3_5= 'definition' | lv_formula_role_3_6= 'lemma' )
            {
            // InternalTPTP.g:325:5: (lv_formula_role_3_1= 'axiom' | lv_formula_role_3_2= 'hypothesis' | lv_formula_role_3_3= 'negated_conjecture' | lv_formula_role_3_4= 'conjecture' | lv_formula_role_3_5= 'definition' | lv_formula_role_3_6= 'lemma' )
            int alt9=6;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt9=1;
                }
                break;
            case 18:
                {
                alt9=2;
                }
                break;
            case 19:
                {
                alt9=3;
                }
                break;
            case 20:
                {
                alt9=4;
                }
                break;
            case 21:
                {
                alt9=5;
                }
                break;
            case 22:
                {
                alt9=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalTPTP.g:326:6: lv_formula_role_3_1= 'axiom'
                    {
                    lv_formula_role_3_1=(Token)match(input,17,FOLLOW_11); 

                    						newLeafNode(lv_formula_role_3_1, grammarAccess.getFof_rootAccess().getFormula_roleAxiomKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFof_rootRule());
                    						}
                    						setWithLastConsumed(current, "formula_role", lv_formula_role_3_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:337:6: lv_formula_role_3_2= 'hypothesis'
                    {
                    lv_formula_role_3_2=(Token)match(input,18,FOLLOW_11); 

                    						newLeafNode(lv_formula_role_3_2, grammarAccess.getFof_rootAccess().getFormula_roleHypothesisKeyword_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFof_rootRule());
                    						}
                    						setWithLastConsumed(current, "formula_role", lv_formula_role_3_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalTPTP.g:348:6: lv_formula_role_3_3= 'negated_conjecture'
                    {
                    lv_formula_role_3_3=(Token)match(input,19,FOLLOW_11); 

                    						newLeafNode(lv_formula_role_3_3, grammarAccess.getFof_rootAccess().getFormula_roleNegated_conjectureKeyword_3_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFof_rootRule());
                    						}
                    						setWithLastConsumed(current, "formula_role", lv_formula_role_3_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalTPTP.g:359:6: lv_formula_role_3_4= 'conjecture'
                    {
                    lv_formula_role_3_4=(Token)match(input,20,FOLLOW_11); 

                    						newLeafNode(lv_formula_role_3_4, grammarAccess.getFof_rootAccess().getFormula_roleConjectureKeyword_3_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFof_rootRule());
                    						}
                    						setWithLastConsumed(current, "formula_role", lv_formula_role_3_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalTPTP.g:370:6: lv_formula_role_3_5= 'definition'
                    {
                    lv_formula_role_3_5=(Token)match(input,21,FOLLOW_11); 

                    						newLeafNode(lv_formula_role_3_5, grammarAccess.getFof_rootAccess().getFormula_roleDefinitionKeyword_3_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFof_rootRule());
                    						}
                    						setWithLastConsumed(current, "formula_role", lv_formula_role_3_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalTPTP.g:381:6: lv_formula_role_3_6= 'lemma'
                    {
                    lv_formula_role_3_6=(Token)match(input,22,FOLLOW_11); 

                    						newLeafNode(lv_formula_role_3_6, grammarAccess.getFof_rootAccess().getFormula_roleLemmaKeyword_3_0_5());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFof_rootRule());
                    						}
                    						setWithLastConsumed(current, "formula_role", lv_formula_role_3_6, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getFof_rootAccess().getCommaKeyword_4());
            		
            // InternalTPTP.g:398:3: ( (lv_exp_5_0= rulefof_expression ) )
            // InternalTPTP.g:399:4: (lv_exp_5_0= rulefof_expression )
            {
            // InternalTPTP.g:399:4: (lv_exp_5_0= rulefof_expression )
            // InternalTPTP.g:400:5: lv_exp_5_0= rulefof_expression
            {

            					newCompositeNode(grammarAccess.getFof_rootAccess().getExpFof_expressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
            lv_exp_5_0=rulefof_expression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFof_rootRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_5_0,
            						"it.unibz.inf.tptp.TPTP.fof_expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getFof_rootAccess().getRightParenthesisFullStopKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefof_root"


    // $ANTLR start "entryRulefof_expression"
    // InternalTPTP.g:425:1: entryRulefof_expression returns [EObject current=null] : iv_rulefof_expression= rulefof_expression EOF ;
    public final EObject entryRulefof_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefof_expression = null;


        try {
            // InternalTPTP.g:425:55: (iv_rulefof_expression= rulefof_expression EOF )
            // InternalTPTP.g:426:2: iv_rulefof_expression= rulefof_expression EOF
            {
             newCompositeNode(grammarAccess.getFof_expressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefof_expression=rulefof_expression();

            state._fsp--;

             current =iv_rulefof_expression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefof_expression"


    // $ANTLR start "rulefof_expression"
    // InternalTPTP.g:432:1: rulefof_expression returns [EObject current=null] : (this_fof_terminating_expression_0= rulefof_terminating_expression ( () ( (lv_op_2_0= rulebinary_operator ) ) ( (lv_right_3_0= rulefof_terminating_expression ) ) )* ) ;
    public final EObject rulefof_expression() throws RecognitionException {
        EObject current = null;

        EObject this_fof_terminating_expression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:438:2: ( (this_fof_terminating_expression_0= rulefof_terminating_expression ( () ( (lv_op_2_0= rulebinary_operator ) ) ( (lv_right_3_0= rulefof_terminating_expression ) ) )* ) )
            // InternalTPTP.g:439:2: (this_fof_terminating_expression_0= rulefof_terminating_expression ( () ( (lv_op_2_0= rulebinary_operator ) ) ( (lv_right_3_0= rulefof_terminating_expression ) ) )* )
            {
            // InternalTPTP.g:439:2: (this_fof_terminating_expression_0= rulefof_terminating_expression ( () ( (lv_op_2_0= rulebinary_operator ) ) ( (lv_right_3_0= rulefof_terminating_expression ) ) )* )
            // InternalTPTP.g:440:3: this_fof_terminating_expression_0= rulefof_terminating_expression ( () ( (lv_op_2_0= rulebinary_operator ) ) ( (lv_right_3_0= rulefof_terminating_expression ) ) )*
            {

            			newCompositeNode(grammarAccess.getFof_expressionAccess().getFof_terminating_expressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_fof_terminating_expression_0=rulefof_terminating_expression();

            state._fsp--;


            			current = this_fof_terminating_expression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTPTP.g:448:3: ( () ( (lv_op_2_0= rulebinary_operator ) ) ( (lv_right_3_0= rulefof_terminating_expression ) ) )*
            loop10:
            do {
                int alt10=2;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // InternalTPTP.g:449:4: () ( (lv_op_2_0= rulebinary_operator ) ) ( (lv_right_3_0= rulefof_terminating_expression ) )
            	    {
            	    // InternalTPTP.g:449:4: ()
            	    // InternalTPTP.g:450:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getFof_expressionAccess().getBinaryLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalTPTP.g:456:4: ( (lv_op_2_0= rulebinary_operator ) )
            	    // InternalTPTP.g:457:5: (lv_op_2_0= rulebinary_operator )
            	    {
            	    // InternalTPTP.g:457:5: (lv_op_2_0= rulebinary_operator )
            	    // InternalTPTP.g:458:6: lv_op_2_0= rulebinary_operator
            	    {

            	    						newCompositeNode(grammarAccess.getFof_expressionAccess().getOpBinary_operatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_op_2_0=rulebinary_operator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFof_expressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"op",
            	    							lv_op_2_0,
            	    							"it.unibz.inf.tptp.TPTP.binary_operator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalTPTP.g:475:4: ( (lv_right_3_0= rulefof_terminating_expression ) )
            	    // InternalTPTP.g:476:5: (lv_right_3_0= rulefof_terminating_expression )
            	    {
            	    // InternalTPTP.g:476:5: (lv_right_3_0= rulefof_terminating_expression )
            	    // InternalTPTP.g:477:6: lv_right_3_0= rulefof_terminating_expression
            	    {

            	    						newCompositeNode(grammarAccess.getFof_expressionAccess().getRightFof_terminating_expressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_right_3_0=rulefof_terminating_expression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFof_expressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"it.unibz.inf.tptp.TPTP.fof_terminating_expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefof_expression"


    // $ANTLR start "entryRulefof_terminating_expression"
    // InternalTPTP.g:499:1: entryRulefof_terminating_expression returns [EObject current=null] : iv_rulefof_terminating_expression= rulefof_terminating_expression EOF ;
    public final EObject entryRulefof_terminating_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefof_terminating_expression = null;


        try {
            // InternalTPTP.g:499:67: (iv_rulefof_terminating_expression= rulefof_terminating_expression EOF )
            // InternalTPTP.g:500:2: iv_rulefof_terminating_expression= rulefof_terminating_expression EOF
            {
             newCompositeNode(grammarAccess.getFof_terminating_expressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefof_terminating_expression=rulefof_terminating_expression();

            state._fsp--;

             current =iv_rulefof_terminating_expression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefof_terminating_expression"


    // $ANTLR start "rulefof_terminating_expression"
    // InternalTPTP.g:506:1: rulefof_terminating_expression returns [EObject current=null] : ( ( (lv_fof_atom_0_0= rulefof_atom ) ) | (otherlv_1= '(' this_fof_expression_2= rulefof_expression otherlv_3= ')' ) | ( ( (lv_fof_negation_4_0= '~' ) ) ( (lv_fof_exp_5_0= rulefof_expression ) ) ) | ( (lv_fof_exp_6_0= rulefof_quantifier_expression ) ) ) ;
    public final EObject rulefof_terminating_expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_fof_negation_4_0=null;
        EObject lv_fof_atom_0_0 = null;

        EObject this_fof_expression_2 = null;

        EObject lv_fof_exp_5_0 = null;

        EObject lv_fof_exp_6_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:512:2: ( ( ( (lv_fof_atom_0_0= rulefof_atom ) ) | (otherlv_1= '(' this_fof_expression_2= rulefof_expression otherlv_3= ')' ) | ( ( (lv_fof_negation_4_0= '~' ) ) ( (lv_fof_exp_5_0= rulefof_expression ) ) ) | ( (lv_fof_exp_6_0= rulefof_quantifier_expression ) ) ) )
            // InternalTPTP.g:513:2: ( ( (lv_fof_atom_0_0= rulefof_atom ) ) | (otherlv_1= '(' this_fof_expression_2= rulefof_expression otherlv_3= ')' ) | ( ( (lv_fof_negation_4_0= '~' ) ) ( (lv_fof_exp_5_0= rulefof_expression ) ) ) | ( (lv_fof_exp_6_0= rulefof_quantifier_expression ) ) )
            {
            // InternalTPTP.g:513:2: ( ( (lv_fof_atom_0_0= rulefof_atom ) ) | (otherlv_1= '(' this_fof_expression_2= rulefof_expression otherlv_3= ')' ) | ( ( (lv_fof_negation_4_0= '~' ) ) ( (lv_fof_exp_5_0= rulefof_expression ) ) ) | ( (lv_fof_exp_6_0= rulefof_quantifier_expression ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_UPPER_TOKEN:
            case RULE_LOWER_TOKEN:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 26:
            case 27:
            case 34:
            case 67:
                {
                alt11=1;
                }
                break;
            case 23:
                {
                alt11=2;
                }
                break;
            case 25:
                {
                alt11=3;
                }
                break;
            case 28:
            case 29:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalTPTP.g:514:3: ( (lv_fof_atom_0_0= rulefof_atom ) )
                    {
                    // InternalTPTP.g:514:3: ( (lv_fof_atom_0_0= rulefof_atom ) )
                    // InternalTPTP.g:515:4: (lv_fof_atom_0_0= rulefof_atom )
                    {
                    // InternalTPTP.g:515:4: (lv_fof_atom_0_0= rulefof_atom )
                    // InternalTPTP.g:516:5: lv_fof_atom_0_0= rulefof_atom
                    {

                    					newCompositeNode(grammarAccess.getFof_terminating_expressionAccess().getFof_atomFof_atomParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_fof_atom_0_0=rulefof_atom();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFof_terminating_expressionRule());
                    					}
                    					set(
                    						current,
                    						"fof_atom",
                    						lv_fof_atom_0_0,
                    						"it.unibz.inf.tptp.TPTP.fof_atom");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTPTP.g:534:3: (otherlv_1= '(' this_fof_expression_2= rulefof_expression otherlv_3= ')' )
                    {
                    // InternalTPTP.g:534:3: (otherlv_1= '(' this_fof_expression_2= rulefof_expression otherlv_3= ')' )
                    // InternalTPTP.g:535:4: otherlv_1= '(' this_fof_expression_2= rulefof_expression otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getFof_terminating_expressionAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getFof_terminating_expressionAccess().getFof_expressionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_15);
                    this_fof_expression_2=rulefof_expression();

                    state._fsp--;


                    				current = this_fof_expression_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getFof_terminating_expressionAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTPTP.g:553:3: ( ( (lv_fof_negation_4_0= '~' ) ) ( (lv_fof_exp_5_0= rulefof_expression ) ) )
                    {
                    // InternalTPTP.g:553:3: ( ( (lv_fof_negation_4_0= '~' ) ) ( (lv_fof_exp_5_0= rulefof_expression ) ) )
                    // InternalTPTP.g:554:4: ( (lv_fof_negation_4_0= '~' ) ) ( (lv_fof_exp_5_0= rulefof_expression ) )
                    {
                    // InternalTPTP.g:554:4: ( (lv_fof_negation_4_0= '~' ) )
                    // InternalTPTP.g:555:5: (lv_fof_negation_4_0= '~' )
                    {
                    // InternalTPTP.g:555:5: (lv_fof_negation_4_0= '~' )
                    // InternalTPTP.g:556:6: lv_fof_negation_4_0= '~'
                    {
                    lv_fof_negation_4_0=(Token)match(input,25,FOLLOW_13); 

                    						newLeafNode(lv_fof_negation_4_0, grammarAccess.getFof_terminating_expressionAccess().getFof_negationTildeKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFof_terminating_expressionRule());
                    						}
                    						setWithLastConsumed(current, "fof_negation", true, "~");
                    					

                    }


                    }

                    // InternalTPTP.g:568:4: ( (lv_fof_exp_5_0= rulefof_expression ) )
                    // InternalTPTP.g:569:5: (lv_fof_exp_5_0= rulefof_expression )
                    {
                    // InternalTPTP.g:569:5: (lv_fof_exp_5_0= rulefof_expression )
                    // InternalTPTP.g:570:6: lv_fof_exp_5_0= rulefof_expression
                    {

                    						newCompositeNode(grammarAccess.getFof_terminating_expressionAccess().getFof_expFof_expressionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_fof_exp_5_0=rulefof_expression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFof_terminating_expressionRule());
                    						}
                    						set(
                    							current,
                    							"fof_exp",
                    							lv_fof_exp_5_0,
                    							"it.unibz.inf.tptp.TPTP.fof_expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalTPTP.g:589:3: ( (lv_fof_exp_6_0= rulefof_quantifier_expression ) )
                    {
                    // InternalTPTP.g:589:3: ( (lv_fof_exp_6_0= rulefof_quantifier_expression ) )
                    // InternalTPTP.g:590:4: (lv_fof_exp_6_0= rulefof_quantifier_expression )
                    {
                    // InternalTPTP.g:590:4: (lv_fof_exp_6_0= rulefof_quantifier_expression )
                    // InternalTPTP.g:591:5: lv_fof_exp_6_0= rulefof_quantifier_expression
                    {

                    					newCompositeNode(grammarAccess.getFof_terminating_expressionAccess().getFof_expFof_quantifier_expressionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_fof_exp_6_0=rulefof_quantifier_expression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFof_terminating_expressionRule());
                    					}
                    					set(
                    						current,
                    						"fof_exp",
                    						lv_fof_exp_6_0,
                    						"it.unibz.inf.tptp.TPTP.fof_quantifier_expression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefof_terminating_expression"


    // $ANTLR start "entryRulefof_atom"
    // InternalTPTP.g:612:1: entryRulefof_atom returns [EObject current=null] : iv_rulefof_atom= rulefof_atom EOF ;
    public final EObject entryRulefof_atom() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefof_atom = null;


        try {
            // InternalTPTP.g:612:49: (iv_rulefof_atom= rulefof_atom EOF )
            // InternalTPTP.g:613:2: iv_rulefof_atom= rulefof_atom EOF
            {
             newCompositeNode(grammarAccess.getFof_atomRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefof_atom=rulefof_atom();

            state._fsp--;

             current =iv_rulefof_atom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefof_atom"


    // $ANTLR start "rulefof_atom"
    // InternalTPTP.g:619:1: rulefof_atom returns [EObject current=null] : (this_fof_constant_0= rulefof_constant | this_fof_var_1= rulefof_var | this_fof_atom_literal_2= rulefof_atom_literal ) ;
    public final EObject rulefof_atom() throws RecognitionException {
        EObject current = null;

        EObject this_fof_constant_0 = null;

        EObject this_fof_var_1 = null;

        EObject this_fof_atom_literal_2 = null;



        	enterRule();

        try {
            // InternalTPTP.g:625:2: ( (this_fof_constant_0= rulefof_constant | this_fof_var_1= rulefof_var | this_fof_atom_literal_2= rulefof_atom_literal ) )
            // InternalTPTP.g:626:2: (this_fof_constant_0= rulefof_constant | this_fof_var_1= rulefof_var | this_fof_atom_literal_2= rulefof_atom_literal )
            {
            // InternalTPTP.g:626:2: (this_fof_constant_0= rulefof_constant | this_fof_var_1= rulefof_var | this_fof_atom_literal_2= rulefof_atom_literal )
            int alt12=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_LOWER_TOKEN:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 34:
            case 67:
                {
                alt12=1;
                }
                break;
            case RULE_UPPER_TOKEN:
                {
                alt12=2;
                }
                break;
            case 26:
            case 27:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalTPTP.g:627:3: this_fof_constant_0= rulefof_constant
                    {

                    			newCompositeNode(grammarAccess.getFof_atomAccess().getFof_constantParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_fof_constant_0=rulefof_constant();

                    state._fsp--;


                    			current = this_fof_constant_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:636:3: this_fof_var_1= rulefof_var
                    {

                    			newCompositeNode(grammarAccess.getFof_atomAccess().getFof_varParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_fof_var_1=rulefof_var();

                    state._fsp--;


                    			current = this_fof_var_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTPTP.g:645:3: this_fof_atom_literal_2= rulefof_atom_literal
                    {

                    			newCompositeNode(grammarAccess.getFof_atomAccess().getFof_atom_literalParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_fof_atom_literal_2=rulefof_atom_literal();

                    state._fsp--;


                    			current = this_fof_atom_literal_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefof_atom"


    // $ANTLR start "entryRulefof_atom_literal"
    // InternalTPTP.g:657:1: entryRulefof_atom_literal returns [EObject current=null] : iv_rulefof_atom_literal= rulefof_atom_literal EOF ;
    public final EObject entryRulefof_atom_literal() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefof_atom_literal = null;


        try {
            // InternalTPTP.g:657:57: (iv_rulefof_atom_literal= rulefof_atom_literal EOF )
            // InternalTPTP.g:658:2: iv_rulefof_atom_literal= rulefof_atom_literal EOF
            {
             newCompositeNode(grammarAccess.getFof_atom_literalRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefof_atom_literal=rulefof_atom_literal();

            state._fsp--;

             current =iv_rulefof_atom_literal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefof_atom_literal"


    // $ANTLR start "rulefof_atom_literal"
    // InternalTPTP.g:664:1: rulefof_atom_literal returns [EObject current=null] : ( ( (lv_name_0_1= '$true' | lv_name_0_2= '$false' ) ) ) ;
    public final EObject rulefof_atom_literal() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;


        	enterRule();

        try {
            // InternalTPTP.g:670:2: ( ( ( (lv_name_0_1= '$true' | lv_name_0_2= '$false' ) ) ) )
            // InternalTPTP.g:671:2: ( ( (lv_name_0_1= '$true' | lv_name_0_2= '$false' ) ) )
            {
            // InternalTPTP.g:671:2: ( ( (lv_name_0_1= '$true' | lv_name_0_2= '$false' ) ) )
            // InternalTPTP.g:672:3: ( (lv_name_0_1= '$true' | lv_name_0_2= '$false' ) )
            {
            // InternalTPTP.g:672:3: ( (lv_name_0_1= '$true' | lv_name_0_2= '$false' ) )
            // InternalTPTP.g:673:4: (lv_name_0_1= '$true' | lv_name_0_2= '$false' )
            {
            // InternalTPTP.g:673:4: (lv_name_0_1= '$true' | lv_name_0_2= '$false' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            else if ( (LA13_0==27) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalTPTP.g:674:5: lv_name_0_1= '$true'
                    {
                    lv_name_0_1=(Token)match(input,26,FOLLOW_2); 

                    					newLeafNode(lv_name_0_1, grammarAccess.getFof_atom_literalAccess().getNameTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFof_atom_literalRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:685:5: lv_name_0_2= '$false'
                    {
                    lv_name_0_2=(Token)match(input,27,FOLLOW_2); 

                    					newLeafNode(lv_name_0_2, grammarAccess.getFof_atom_literalAccess().getNameFalseKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFof_atom_literalRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_2, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefof_atom_literal"


    // $ANTLR start "entryRulefof_constant"
    // InternalTPTP.g:701:1: entryRulefof_constant returns [EObject current=null] : iv_rulefof_constant= rulefof_constant EOF ;
    public final EObject entryRulefof_constant() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefof_constant = null;


        try {
            // InternalTPTP.g:701:53: (iv_rulefof_constant= rulefof_constant EOF )
            // InternalTPTP.g:702:2: iv_rulefof_constant= rulefof_constant EOF
            {
             newCompositeNode(grammarAccess.getFof_constantRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefof_constant=rulefof_constant();

            state._fsp--;

             current =iv_rulefof_constant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefof_constant"


    // $ANTLR start "rulefof_constant"
    // InternalTPTP.g:708:1: rulefof_constant returns [EObject current=null] : ( ( ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_fof_param_2_0= rulefof_atom ) ) (otherlv_3= ',' ( (lv_fof_param_4_0= rulefof_atom ) ) )* otherlv_5= ')' )? ) ;
    public final EObject rulefof_constant() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_2=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_0_1 = null;

        EObject lv_fof_param_2_0 = null;

        EObject lv_fof_param_4_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:714:2: ( ( ( ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_fof_param_2_0= rulefof_atom ) ) (otherlv_3= ',' ( (lv_fof_param_4_0= rulefof_atom ) ) )* otherlv_5= ')' )? ) )
            // InternalTPTP.g:715:2: ( ( ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_fof_param_2_0= rulefof_atom ) ) (otherlv_3= ',' ( (lv_fof_param_4_0= rulefof_atom ) ) )* otherlv_5= ')' )? )
            {
            // InternalTPTP.g:715:2: ( ( ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_fof_param_2_0= rulefof_atom ) ) (otherlv_3= ',' ( (lv_fof_param_4_0= rulefof_atom ) ) )* otherlv_5= ')' )? )
            // InternalTPTP.g:716:3: ( ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_fof_param_2_0= rulefof_atom ) ) (otherlv_3= ',' ( (lv_fof_param_4_0= rulefof_atom ) ) )* otherlv_5= ')' )?
            {
            // InternalTPTP.g:716:3: ( ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) )
            // InternalTPTP.g:717:4: ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) )
            {
            // InternalTPTP.g:717:4: ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) )
            // InternalTPTP.g:718:5: (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING )
            {
            // InternalTPTP.g:718:5: (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_LOWER_TOKEN||(LA14_0>=17 && LA14_0<=22)||LA14_0==34||LA14_0==67) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_STRING) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalTPTP.g:719:6: lv_name_0_1= rulelower_token_and_keyword
                    {

                    						newCompositeNode(grammarAccess.getFof_constantAccess().getNameLower_token_and_keywordParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_name_0_1=rulelower_token_and_keyword();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFof_constantRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_0_1,
                    							"it.unibz.inf.tptp.TPTP.lower_token_and_keyword");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:735:6: lv_name_0_2= RULE_STRING
                    {
                    lv_name_0_2=(Token)match(input,RULE_STRING,FOLLOW_16); 

                    						newLeafNode(lv_name_0_2, grammarAccess.getFof_constantAccess().getNameSTRINGTerminalRuleCall_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFof_constantRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_0_2,
                    							"it.unibz.inf.tptp.TPTP.STRING");
                    					

                    }
                    break;

            }


            }


            }

            // InternalTPTP.g:752:3: (otherlv_1= '(' ( (lv_fof_param_2_0= rulefof_atom ) ) (otherlv_3= ',' ( (lv_fof_param_4_0= rulefof_atom ) ) )* otherlv_5= ')' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTPTP.g:753:4: otherlv_1= '(' ( (lv_fof_param_2_0= rulefof_atom ) ) (otherlv_3= ',' ( (lv_fof_param_4_0= rulefof_atom ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_1, grammarAccess.getFof_constantAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalTPTP.g:757:4: ( (lv_fof_param_2_0= rulefof_atom ) )
                    // InternalTPTP.g:758:5: (lv_fof_param_2_0= rulefof_atom )
                    {
                    // InternalTPTP.g:758:5: (lv_fof_param_2_0= rulefof_atom )
                    // InternalTPTP.g:759:6: lv_fof_param_2_0= rulefof_atom
                    {

                    						newCompositeNode(grammarAccess.getFof_constantAccess().getFof_paramFof_atomParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_fof_param_2_0=rulefof_atom();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFof_constantRule());
                    						}
                    						add(
                    							current,
                    							"fof_param",
                    							lv_fof_param_2_0,
                    							"it.unibz.inf.tptp.TPTP.fof_atom");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTPTP.g:776:4: (otherlv_3= ',' ( (lv_fof_param_4_0= rulefof_atom ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==16) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalTPTP.g:777:5: otherlv_3= ',' ( (lv_fof_param_4_0= rulefof_atom ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_17); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getFof_constantAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalTPTP.g:781:5: ( (lv_fof_param_4_0= rulefof_atom ) )
                    	    // InternalTPTP.g:782:6: (lv_fof_param_4_0= rulefof_atom )
                    	    {
                    	    // InternalTPTP.g:782:6: (lv_fof_param_4_0= rulefof_atom )
                    	    // InternalTPTP.g:783:7: lv_fof_param_4_0= rulefof_atom
                    	    {

                    	    							newCompositeNode(grammarAccess.getFof_constantAccess().getFof_paramFof_atomParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_fof_param_4_0=rulefof_atom();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFof_constantRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fof_param",
                    	    								lv_fof_param_4_0,
                    	    								"it.unibz.inf.tptp.TPTP.fof_atom");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getFof_constantAccess().getRightParenthesisKeyword_1_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefof_constant"


    // $ANTLR start "entryRulefof_var"
    // InternalTPTP.g:810:1: entryRulefof_var returns [EObject current=null] : iv_rulefof_var= rulefof_var EOF ;
    public final EObject entryRulefof_var() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefof_var = null;


        try {
            // InternalTPTP.g:810:48: (iv_rulefof_var= rulefof_var EOF )
            // InternalTPTP.g:811:2: iv_rulefof_var= rulefof_var EOF
            {
             newCompositeNode(grammarAccess.getFof_varRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefof_var=rulefof_var();

            state._fsp--;

             current =iv_rulefof_var; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefof_var"


    // $ANTLR start "rulefof_var"
    // InternalTPTP.g:817:1: rulefof_var returns [EObject current=null] : ( (lv_name_0_0= RULE_UPPER_TOKEN ) ) ;
    public final EObject rulefof_var() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalTPTP.g:823:2: ( ( (lv_name_0_0= RULE_UPPER_TOKEN ) ) )
            // InternalTPTP.g:824:2: ( (lv_name_0_0= RULE_UPPER_TOKEN ) )
            {
            // InternalTPTP.g:824:2: ( (lv_name_0_0= RULE_UPPER_TOKEN ) )
            // InternalTPTP.g:825:3: (lv_name_0_0= RULE_UPPER_TOKEN )
            {
            // InternalTPTP.g:825:3: (lv_name_0_0= RULE_UPPER_TOKEN )
            // InternalTPTP.g:826:4: lv_name_0_0= RULE_UPPER_TOKEN
            {
            lv_name_0_0=(Token)match(input,RULE_UPPER_TOKEN,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getFof_varAccess().getNameUPPER_TOKENTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFof_varRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"it.unibz.inf.tptp.TPTP.UPPER_TOKEN");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefof_var"


    // $ANTLR start "entryRulefof_quantifier_expression"
    // InternalTPTP.g:845:1: entryRulefof_quantifier_expression returns [EObject current=null] : iv_rulefof_quantifier_expression= rulefof_quantifier_expression EOF ;
    public final EObject entryRulefof_quantifier_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefof_quantifier_expression = null;


        try {
            // InternalTPTP.g:845:66: (iv_rulefof_quantifier_expression= rulefof_quantifier_expression EOF )
            // InternalTPTP.g:846:2: iv_rulefof_quantifier_expression= rulefof_quantifier_expression EOF
            {
             newCompositeNode(grammarAccess.getFof_quantifier_expressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefof_quantifier_expression=rulefof_quantifier_expression();

            state._fsp--;

             current =iv_rulefof_quantifier_expression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefof_quantifier_expression"


    // $ANTLR start "rulefof_quantifier_expression"
    // InternalTPTP.g:852:1: rulefof_quantifier_expression returns [EObject current=null] : ( ( ( (lv_fof_quantifier_0_1= '!' | lv_fof_quantifier_0_2= '?' ) ) ) otherlv_1= '[' ( (lv_fof_param_2_0= rulefof_variable_list ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_fof_exp_5_0= rulefof_expression ) ) ) ;
    public final EObject rulefof_quantifier_expression() throws RecognitionException {
        EObject current = null;

        Token lv_fof_quantifier_0_1=null;
        Token lv_fof_quantifier_0_2=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_fof_param_2_0 = null;

        EObject lv_fof_exp_5_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:858:2: ( ( ( ( (lv_fof_quantifier_0_1= '!' | lv_fof_quantifier_0_2= '?' ) ) ) otherlv_1= '[' ( (lv_fof_param_2_0= rulefof_variable_list ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_fof_exp_5_0= rulefof_expression ) ) ) )
            // InternalTPTP.g:859:2: ( ( ( (lv_fof_quantifier_0_1= '!' | lv_fof_quantifier_0_2= '?' ) ) ) otherlv_1= '[' ( (lv_fof_param_2_0= rulefof_variable_list ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_fof_exp_5_0= rulefof_expression ) ) )
            {
            // InternalTPTP.g:859:2: ( ( ( (lv_fof_quantifier_0_1= '!' | lv_fof_quantifier_0_2= '?' ) ) ) otherlv_1= '[' ( (lv_fof_param_2_0= rulefof_variable_list ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_fof_exp_5_0= rulefof_expression ) ) )
            // InternalTPTP.g:860:3: ( ( (lv_fof_quantifier_0_1= '!' | lv_fof_quantifier_0_2= '?' ) ) ) otherlv_1= '[' ( (lv_fof_param_2_0= rulefof_variable_list ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_fof_exp_5_0= rulefof_expression ) )
            {
            // InternalTPTP.g:860:3: ( ( (lv_fof_quantifier_0_1= '!' | lv_fof_quantifier_0_2= '?' ) ) )
            // InternalTPTP.g:861:4: ( (lv_fof_quantifier_0_1= '!' | lv_fof_quantifier_0_2= '?' ) )
            {
            // InternalTPTP.g:861:4: ( (lv_fof_quantifier_0_1= '!' | lv_fof_quantifier_0_2= '?' ) )
            // InternalTPTP.g:862:5: (lv_fof_quantifier_0_1= '!' | lv_fof_quantifier_0_2= '?' )
            {
            // InternalTPTP.g:862:5: (lv_fof_quantifier_0_1= '!' | lv_fof_quantifier_0_2= '?' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            else if ( (LA17_0==29) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalTPTP.g:863:6: lv_fof_quantifier_0_1= '!'
                    {
                    lv_fof_quantifier_0_1=(Token)match(input,28,FOLLOW_19); 

                    						newLeafNode(lv_fof_quantifier_0_1, grammarAccess.getFof_quantifier_expressionAccess().getFof_quantifierExclamationMarkKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFof_quantifier_expressionRule());
                    						}
                    						setWithLastConsumed(current, "fof_quantifier", lv_fof_quantifier_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:874:6: lv_fof_quantifier_0_2= '?'
                    {
                    lv_fof_quantifier_0_2=(Token)match(input,29,FOLLOW_19); 

                    						newLeafNode(lv_fof_quantifier_0_2, grammarAccess.getFof_quantifier_expressionAccess().getFof_quantifierQuestionMarkKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFof_quantifier_expressionRule());
                    						}
                    						setWithLastConsumed(current, "fof_quantifier", lv_fof_quantifier_0_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getFof_quantifier_expressionAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalTPTP.g:891:3: ( (lv_fof_param_2_0= rulefof_variable_list ) )
            // InternalTPTP.g:892:4: (lv_fof_param_2_0= rulefof_variable_list )
            {
            // InternalTPTP.g:892:4: (lv_fof_param_2_0= rulefof_variable_list )
            // InternalTPTP.g:893:5: lv_fof_param_2_0= rulefof_variable_list
            {

            					newCompositeNode(grammarAccess.getFof_quantifier_expressionAccess().getFof_paramFof_variable_listParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_fof_param_2_0=rulefof_variable_list();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFof_quantifier_expressionRule());
            					}
            					set(
            						current,
            						"fof_param",
            						lv_fof_param_2_0,
            						"it.unibz.inf.tptp.TPTP.fof_variable_list");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getFof_quantifier_expressionAccess().getRightSquareBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,32,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getFof_quantifier_expressionAccess().getColonKeyword_4());
            		
            // InternalTPTP.g:918:3: ( (lv_fof_exp_5_0= rulefof_expression ) )
            // InternalTPTP.g:919:4: (lv_fof_exp_5_0= rulefof_expression )
            {
            // InternalTPTP.g:919:4: (lv_fof_exp_5_0= rulefof_expression )
            // InternalTPTP.g:920:5: lv_fof_exp_5_0= rulefof_expression
            {

            					newCompositeNode(grammarAccess.getFof_quantifier_expressionAccess().getFof_expFof_expressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_fof_exp_5_0=rulefof_expression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFof_quantifier_expressionRule());
            					}
            					set(
            						current,
            						"fof_exp",
            						lv_fof_exp_5_0,
            						"it.unibz.inf.tptp.TPTP.fof_expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefof_quantifier_expression"


    // $ANTLR start "entryRulefof_variable_list"
    // InternalTPTP.g:941:1: entryRulefof_variable_list returns [EObject current=null] : iv_rulefof_variable_list= rulefof_variable_list EOF ;
    public final EObject entryRulefof_variable_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefof_variable_list = null;


        try {
            // InternalTPTP.g:941:58: (iv_rulefof_variable_list= rulefof_variable_list EOF )
            // InternalTPTP.g:942:2: iv_rulefof_variable_list= rulefof_variable_list EOF
            {
             newCompositeNode(grammarAccess.getFof_variable_listRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefof_variable_list=rulefof_variable_list();

            state._fsp--;

             current =iv_rulefof_variable_list; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefof_variable_list"


    // $ANTLR start "rulefof_variable_list"
    // InternalTPTP.g:948:1: rulefof_variable_list returns [EObject current=null] : ( ( (lv_params_0_0= rulefof_var ) ) (otherlv_1= ',' ( (lv_params_2_0= rulefof_var ) ) )* ) ;
    public final EObject rulefof_variable_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_params_0_0 = null;

        EObject lv_params_2_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:954:2: ( ( ( (lv_params_0_0= rulefof_var ) ) (otherlv_1= ',' ( (lv_params_2_0= rulefof_var ) ) )* ) )
            // InternalTPTP.g:955:2: ( ( (lv_params_0_0= rulefof_var ) ) (otherlv_1= ',' ( (lv_params_2_0= rulefof_var ) ) )* )
            {
            // InternalTPTP.g:955:2: ( ( (lv_params_0_0= rulefof_var ) ) (otherlv_1= ',' ( (lv_params_2_0= rulefof_var ) ) )* )
            // InternalTPTP.g:956:3: ( (lv_params_0_0= rulefof_var ) ) (otherlv_1= ',' ( (lv_params_2_0= rulefof_var ) ) )*
            {
            // InternalTPTP.g:956:3: ( (lv_params_0_0= rulefof_var ) )
            // InternalTPTP.g:957:4: (lv_params_0_0= rulefof_var )
            {
            // InternalTPTP.g:957:4: (lv_params_0_0= rulefof_var )
            // InternalTPTP.g:958:5: lv_params_0_0= rulefof_var
            {

            					newCompositeNode(grammarAccess.getFof_variable_listAccess().getParamsFof_varParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_23);
            lv_params_0_0=rulefof_var();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFof_variable_listRule());
            					}
            					add(
            						current,
            						"params",
            						lv_params_0_0,
            						"it.unibz.inf.tptp.TPTP.fof_var");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTPTP.g:975:3: (otherlv_1= ',' ( (lv_params_2_0= rulefof_var ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==16) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalTPTP.g:976:4: otherlv_1= ',' ( (lv_params_2_0= rulefof_var ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_20); 

            	    				newLeafNode(otherlv_1, grammarAccess.getFof_variable_listAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalTPTP.g:980:4: ( (lv_params_2_0= rulefof_var ) )
            	    // InternalTPTP.g:981:5: (lv_params_2_0= rulefof_var )
            	    {
            	    // InternalTPTP.g:981:5: (lv_params_2_0= rulefof_var )
            	    // InternalTPTP.g:982:6: lv_params_2_0= rulefof_var
            	    {

            	    						newCompositeNode(grammarAccess.getFof_variable_listAccess().getParamsFof_varParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_params_2_0=rulefof_var();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFof_variable_listRule());
            	    						}
            	    						add(
            	    							current,
            	    							"params",
            	    							lv_params_2_0,
            	    							"it.unibz.inf.tptp.TPTP.fof_var");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefof_variable_list"


    // $ANTLR start "entryRuletff_input"
    // InternalTPTP.g:1004:1: entryRuletff_input returns [EObject current=null] : iv_ruletff_input= ruletff_input EOF ;
    public final EObject entryRuletff_input() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletff_input = null;


        try {
            // InternalTPTP.g:1004:50: (iv_ruletff_input= ruletff_input EOF )
            // InternalTPTP.g:1005:2: iv_ruletff_input= ruletff_input EOF
            {
             newCompositeNode(grammarAccess.getTff_inputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletff_input=ruletff_input();

            state._fsp--;

             current =iv_ruletff_input; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletff_input"


    // $ANTLR start "ruletff_input"
    // InternalTPTP.g:1011:1: ruletff_input returns [EObject current=null] : (this_tff_root_0= ruletff_root | this_include_1= ruleinclude ) ;
    public final EObject ruletff_input() throws RecognitionException {
        EObject current = null;

        EObject this_tff_root_0 = null;

        EObject this_include_1 = null;



        	enterRule();

        try {
            // InternalTPTP.g:1017:2: ( (this_tff_root_0= ruletff_root | this_include_1= ruleinclude ) )
            // InternalTPTP.g:1018:2: (this_tff_root_0= ruletff_root | this_include_1= ruleinclude )
            {
            // InternalTPTP.g:1018:2: (this_tff_root_0= ruletff_root | this_include_1= ruleinclude )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            else if ( (LA19_0==13) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalTPTP.g:1019:3: this_tff_root_0= ruletff_root
                    {

                    			newCompositeNode(grammarAccess.getTff_inputAccess().getTff_rootParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_tff_root_0=ruletff_root();

                    state._fsp--;


                    			current = this_tff_root_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:1028:3: this_include_1= ruleinclude
                    {

                    			newCompositeNode(grammarAccess.getTff_inputAccess().getIncludeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_include_1=ruleinclude();

                    state._fsp--;


                    			current = this_include_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletff_input"


    // $ANTLR start "entryRuletff_root"
    // InternalTPTP.g:1040:1: entryRuletff_root returns [EObject current=null] : iv_ruletff_root= ruletff_root EOF ;
    public final EObject entryRuletff_root() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletff_root = null;


        try {
            // InternalTPTP.g:1040:49: (iv_ruletff_root= ruletff_root EOF )
            // InternalTPTP.g:1041:2: iv_ruletff_root= ruletff_root EOF
            {
             newCompositeNode(grammarAccess.getTff_rootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletff_root=ruletff_root();

            state._fsp--;

             current =iv_ruletff_root; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletff_root"


    // $ANTLR start "ruletff_root"
    // InternalTPTP.g:1047:1: ruletff_root returns [EObject current=null] : ( (otherlv_0= 'tff(' ( ( (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING ) ) ) otherlv_2= ',' ( ( (lv_formula_role_3_1= 'axiom' | lv_formula_role_3_2= 'hypothesis' | lv_formula_role_3_3= 'negated_conjecture' | lv_formula_role_3_4= 'conjecture' | lv_formula_role_3_5= 'definition' | lv_formula_role_3_6= 'lemma' ) ) ) otherlv_4= ',' ( (lv_exp_5_0= ruletff_expression ) ) otherlv_6= ').' ) | (otherlv_7= 'tff(' ( ( (lv_name_8_1= rulelower_token_and_keyword | lv_name_8_2= RULE_STRING ) ) ) otherlv_9= ',' ( (lv_formula_role_10_0= 'type' ) ) otherlv_11= ',' ( (lv_def_12_0= ruletff_formula_type_definition ) ) otherlv_13= ').' ) ) ;
    public final EObject ruletff_root() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_2=null;
        Token otherlv_2=null;
        Token lv_formula_role_3_1=null;
        Token lv_formula_role_3_2=null;
        Token lv_formula_role_3_3=null;
        Token lv_formula_role_3_4=null;
        Token lv_formula_role_3_5=null;
        Token lv_formula_role_3_6=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_name_8_2=null;
        Token otherlv_9=null;
        Token lv_formula_role_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_1 = null;

        EObject lv_exp_5_0 = null;

        AntlrDatatypeRuleToken lv_name_8_1 = null;

        EObject lv_def_12_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:1053:2: ( ( (otherlv_0= 'tff(' ( ( (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING ) ) ) otherlv_2= ',' ( ( (lv_formula_role_3_1= 'axiom' | lv_formula_role_3_2= 'hypothesis' | lv_formula_role_3_3= 'negated_conjecture' | lv_formula_role_3_4= 'conjecture' | lv_formula_role_3_5= 'definition' | lv_formula_role_3_6= 'lemma' ) ) ) otherlv_4= ',' ( (lv_exp_5_0= ruletff_expression ) ) otherlv_6= ').' ) | (otherlv_7= 'tff(' ( ( (lv_name_8_1= rulelower_token_and_keyword | lv_name_8_2= RULE_STRING ) ) ) otherlv_9= ',' ( (lv_formula_role_10_0= 'type' ) ) otherlv_11= ',' ( (lv_def_12_0= ruletff_formula_type_definition ) ) otherlv_13= ').' ) ) )
            // InternalTPTP.g:1054:2: ( (otherlv_0= 'tff(' ( ( (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING ) ) ) otherlv_2= ',' ( ( (lv_formula_role_3_1= 'axiom' | lv_formula_role_3_2= 'hypothesis' | lv_formula_role_3_3= 'negated_conjecture' | lv_formula_role_3_4= 'conjecture' | lv_formula_role_3_5= 'definition' | lv_formula_role_3_6= 'lemma' ) ) ) otherlv_4= ',' ( (lv_exp_5_0= ruletff_expression ) ) otherlv_6= ').' ) | (otherlv_7= 'tff(' ( ( (lv_name_8_1= rulelower_token_and_keyword | lv_name_8_2= RULE_STRING ) ) ) otherlv_9= ',' ( (lv_formula_role_10_0= 'type' ) ) otherlv_11= ',' ( (lv_def_12_0= ruletff_formula_type_definition ) ) otherlv_13= ').' ) )
            {
            // InternalTPTP.g:1054:2: ( (otherlv_0= 'tff(' ( ( (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING ) ) ) otherlv_2= ',' ( ( (lv_formula_role_3_1= 'axiom' | lv_formula_role_3_2= 'hypothesis' | lv_formula_role_3_3= 'negated_conjecture' | lv_formula_role_3_4= 'conjecture' | lv_formula_role_3_5= 'definition' | lv_formula_role_3_6= 'lemma' ) ) ) otherlv_4= ',' ( (lv_exp_5_0= ruletff_expression ) ) otherlv_6= ').' ) | (otherlv_7= 'tff(' ( ( (lv_name_8_1= rulelower_token_and_keyword | lv_name_8_2= RULE_STRING ) ) ) otherlv_9= ',' ( (lv_formula_role_10_0= 'type' ) ) otherlv_11= ',' ( (lv_def_12_0= ruletff_formula_type_definition ) ) otherlv_13= ').' ) )
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // InternalTPTP.g:1055:3: (otherlv_0= 'tff(' ( ( (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING ) ) ) otherlv_2= ',' ( ( (lv_formula_role_3_1= 'axiom' | lv_formula_role_3_2= 'hypothesis' | lv_formula_role_3_3= 'negated_conjecture' | lv_formula_role_3_4= 'conjecture' | lv_formula_role_3_5= 'definition' | lv_formula_role_3_6= 'lemma' ) ) ) otherlv_4= ',' ( (lv_exp_5_0= ruletff_expression ) ) otherlv_6= ').' )
                    {
                    // InternalTPTP.g:1055:3: (otherlv_0= 'tff(' ( ( (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING ) ) ) otherlv_2= ',' ( ( (lv_formula_role_3_1= 'axiom' | lv_formula_role_3_2= 'hypothesis' | lv_formula_role_3_3= 'negated_conjecture' | lv_formula_role_3_4= 'conjecture' | lv_formula_role_3_5= 'definition' | lv_formula_role_3_6= 'lemma' ) ) ) otherlv_4= ',' ( (lv_exp_5_0= ruletff_expression ) ) otherlv_6= ').' )
                    // InternalTPTP.g:1056:4: otherlv_0= 'tff(' ( ( (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING ) ) ) otherlv_2= ',' ( ( (lv_formula_role_3_1= 'axiom' | lv_formula_role_3_2= 'hypothesis' | lv_formula_role_3_3= 'negated_conjecture' | lv_formula_role_3_4= 'conjecture' | lv_formula_role_3_5= 'definition' | lv_formula_role_3_6= 'lemma' ) ) ) otherlv_4= ',' ( (lv_exp_5_0= ruletff_expression ) ) otherlv_6= ').'
                    {
                    otherlv_0=(Token)match(input,33,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getTff_rootAccess().getTffKeyword_0_0());
                    			
                    // InternalTPTP.g:1060:4: ( ( (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING ) ) )
                    // InternalTPTP.g:1061:5: ( (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING ) )
                    {
                    // InternalTPTP.g:1061:5: ( (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING ) )
                    // InternalTPTP.g:1062:6: (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING )
                    {
                    // InternalTPTP.g:1062:6: (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==RULE_LOWER_TOKEN||(LA20_0>=17 && LA20_0<=22)||LA20_0==34||LA20_0==67) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==RULE_STRING) ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalTPTP.g:1063:7: lv_name_1_1= rulelower_token_and_keyword
                            {

                            							newCompositeNode(grammarAccess.getTff_rootAccess().getNameLower_token_and_keywordParserRuleCall_0_1_0_0());
                            						
                            pushFollow(FOLLOW_11);
                            lv_name_1_1=rulelower_token_and_keyword();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getTff_rootRule());
                            							}
                            							set(
                            								current,
                            								"name",
                            								lv_name_1_1,
                            								"it.unibz.inf.tptp.TPTP.lower_token_and_keyword");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalTPTP.g:1079:7: lv_name_1_2= RULE_STRING
                            {
                            lv_name_1_2=(Token)match(input,RULE_STRING,FOLLOW_11); 

                            							newLeafNode(lv_name_1_2, grammarAccess.getTff_rootAccess().getNameSTRINGTerminalRuleCall_0_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTff_rootRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"name",
                            								lv_name_1_2,
                            								"it.unibz.inf.tptp.TPTP.STRING");
                            						

                            }
                            break;

                    }


                    }


                    }

                    otherlv_2=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getTff_rootAccess().getCommaKeyword_0_2());
                    			
                    // InternalTPTP.g:1100:4: ( ( (lv_formula_role_3_1= 'axiom' | lv_formula_role_3_2= 'hypothesis' | lv_formula_role_3_3= 'negated_conjecture' | lv_formula_role_3_4= 'conjecture' | lv_formula_role_3_5= 'definition' | lv_formula_role_3_6= 'lemma' ) ) )
                    // InternalTPTP.g:1101:5: ( (lv_formula_role_3_1= 'axiom' | lv_formula_role_3_2= 'hypothesis' | lv_formula_role_3_3= 'negated_conjecture' | lv_formula_role_3_4= 'conjecture' | lv_formula_role_3_5= 'definition' | lv_formula_role_3_6= 'lemma' ) )
                    {
                    // InternalTPTP.g:1101:5: ( (lv_formula_role_3_1= 'axiom' | lv_formula_role_3_2= 'hypothesis' | lv_formula_role_3_3= 'negated_conjecture' | lv_formula_role_3_4= 'conjecture' | lv_formula_role_3_5= 'definition' | lv_formula_role_3_6= 'lemma' ) )
                    // InternalTPTP.g:1102:6: (lv_formula_role_3_1= 'axiom' | lv_formula_role_3_2= 'hypothesis' | lv_formula_role_3_3= 'negated_conjecture' | lv_formula_role_3_4= 'conjecture' | lv_formula_role_3_5= 'definition' | lv_formula_role_3_6= 'lemma' )
                    {
                    // InternalTPTP.g:1102:6: (lv_formula_role_3_1= 'axiom' | lv_formula_role_3_2= 'hypothesis' | lv_formula_role_3_3= 'negated_conjecture' | lv_formula_role_3_4= 'conjecture' | lv_formula_role_3_5= 'definition' | lv_formula_role_3_6= 'lemma' )
                    int alt21=6;
                    switch ( input.LA(1) ) {
                    case 17:
                        {
                        alt21=1;
                        }
                        break;
                    case 18:
                        {
                        alt21=2;
                        }
                        break;
                    case 19:
                        {
                        alt21=3;
                        }
                        break;
                    case 20:
                        {
                        alt21=4;
                        }
                        break;
                    case 21:
                        {
                        alt21=5;
                        }
                        break;
                    case 22:
                        {
                        alt21=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }

                    switch (alt21) {
                        case 1 :
                            // InternalTPTP.g:1103:7: lv_formula_role_3_1= 'axiom'
                            {
                            lv_formula_role_3_1=(Token)match(input,17,FOLLOW_11); 

                            							newLeafNode(lv_formula_role_3_1, grammarAccess.getTff_rootAccess().getFormula_roleAxiomKeyword_0_3_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTff_rootRule());
                            							}
                            							setWithLastConsumed(current, "formula_role", lv_formula_role_3_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalTPTP.g:1114:7: lv_formula_role_3_2= 'hypothesis'
                            {
                            lv_formula_role_3_2=(Token)match(input,18,FOLLOW_11); 

                            							newLeafNode(lv_formula_role_3_2, grammarAccess.getTff_rootAccess().getFormula_roleHypothesisKeyword_0_3_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTff_rootRule());
                            							}
                            							setWithLastConsumed(current, "formula_role", lv_formula_role_3_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalTPTP.g:1125:7: lv_formula_role_3_3= 'negated_conjecture'
                            {
                            lv_formula_role_3_3=(Token)match(input,19,FOLLOW_11); 

                            							newLeafNode(lv_formula_role_3_3, grammarAccess.getTff_rootAccess().getFormula_roleNegated_conjectureKeyword_0_3_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTff_rootRule());
                            							}
                            							setWithLastConsumed(current, "formula_role", lv_formula_role_3_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalTPTP.g:1136:7: lv_formula_role_3_4= 'conjecture'
                            {
                            lv_formula_role_3_4=(Token)match(input,20,FOLLOW_11); 

                            							newLeafNode(lv_formula_role_3_4, grammarAccess.getTff_rootAccess().getFormula_roleConjectureKeyword_0_3_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTff_rootRule());
                            							}
                            							setWithLastConsumed(current, "formula_role", lv_formula_role_3_4, null);
                            						

                            }
                            break;
                        case 5 :
                            // InternalTPTP.g:1147:7: lv_formula_role_3_5= 'definition'
                            {
                            lv_formula_role_3_5=(Token)match(input,21,FOLLOW_11); 

                            							newLeafNode(lv_formula_role_3_5, grammarAccess.getTff_rootAccess().getFormula_roleDefinitionKeyword_0_3_0_4());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTff_rootRule());
                            							}
                            							setWithLastConsumed(current, "formula_role", lv_formula_role_3_5, null);
                            						

                            }
                            break;
                        case 6 :
                            // InternalTPTP.g:1158:7: lv_formula_role_3_6= 'lemma'
                            {
                            lv_formula_role_3_6=(Token)match(input,22,FOLLOW_11); 

                            							newLeafNode(lv_formula_role_3_6, grammarAccess.getTff_rootAccess().getFormula_roleLemmaKeyword_0_3_0_5());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTff_rootRule());
                            							}
                            							setWithLastConsumed(current, "formula_role", lv_formula_role_3_6, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    otherlv_4=(Token)match(input,16,FOLLOW_24); 

                    				newLeafNode(otherlv_4, grammarAccess.getTff_rootAccess().getCommaKeyword_0_4());
                    			
                    // InternalTPTP.g:1175:4: ( (lv_exp_5_0= ruletff_expression ) )
                    // InternalTPTP.g:1176:5: (lv_exp_5_0= ruletff_expression )
                    {
                    // InternalTPTP.g:1176:5: (lv_exp_5_0= ruletff_expression )
                    // InternalTPTP.g:1177:6: lv_exp_5_0= ruletff_expression
                    {

                    						newCompositeNode(grammarAccess.getTff_rootAccess().getExpTff_expressionParserRuleCall_0_5_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_exp_5_0=ruletff_expression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTff_rootRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_5_0,
                    							"it.unibz.inf.tptp.TPTP.tff_expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getTff_rootAccess().getRightParenthesisFullStopKeyword_0_6());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTPTP.g:1200:3: (otherlv_7= 'tff(' ( ( (lv_name_8_1= rulelower_token_and_keyword | lv_name_8_2= RULE_STRING ) ) ) otherlv_9= ',' ( (lv_formula_role_10_0= 'type' ) ) otherlv_11= ',' ( (lv_def_12_0= ruletff_formula_type_definition ) ) otherlv_13= ').' )
                    {
                    // InternalTPTP.g:1200:3: (otherlv_7= 'tff(' ( ( (lv_name_8_1= rulelower_token_and_keyword | lv_name_8_2= RULE_STRING ) ) ) otherlv_9= ',' ( (lv_formula_role_10_0= 'type' ) ) otherlv_11= ',' ( (lv_def_12_0= ruletff_formula_type_definition ) ) otherlv_13= ').' )
                    // InternalTPTP.g:1201:4: otherlv_7= 'tff(' ( ( (lv_name_8_1= rulelower_token_and_keyword | lv_name_8_2= RULE_STRING ) ) ) otherlv_9= ',' ( (lv_formula_role_10_0= 'type' ) ) otherlv_11= ',' ( (lv_def_12_0= ruletff_formula_type_definition ) ) otherlv_13= ').'
                    {
                    otherlv_7=(Token)match(input,33,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getTff_rootAccess().getTffKeyword_1_0());
                    			
                    // InternalTPTP.g:1205:4: ( ( (lv_name_8_1= rulelower_token_and_keyword | lv_name_8_2= RULE_STRING ) ) )
                    // InternalTPTP.g:1206:5: ( (lv_name_8_1= rulelower_token_and_keyword | lv_name_8_2= RULE_STRING ) )
                    {
                    // InternalTPTP.g:1206:5: ( (lv_name_8_1= rulelower_token_and_keyword | lv_name_8_2= RULE_STRING ) )
                    // InternalTPTP.g:1207:6: (lv_name_8_1= rulelower_token_and_keyword | lv_name_8_2= RULE_STRING )
                    {
                    // InternalTPTP.g:1207:6: (lv_name_8_1= rulelower_token_and_keyword | lv_name_8_2= RULE_STRING )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==RULE_LOWER_TOKEN||(LA22_0>=17 && LA22_0<=22)||LA22_0==34||LA22_0==67) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==RULE_STRING) ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalTPTP.g:1208:7: lv_name_8_1= rulelower_token_and_keyword
                            {

                            							newCompositeNode(grammarAccess.getTff_rootAccess().getNameLower_token_and_keywordParserRuleCall_1_1_0_0());
                            						
                            pushFollow(FOLLOW_11);
                            lv_name_8_1=rulelower_token_and_keyword();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getTff_rootRule());
                            							}
                            							set(
                            								current,
                            								"name",
                            								lv_name_8_1,
                            								"it.unibz.inf.tptp.TPTP.lower_token_and_keyword");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalTPTP.g:1224:7: lv_name_8_2= RULE_STRING
                            {
                            lv_name_8_2=(Token)match(input,RULE_STRING,FOLLOW_11); 

                            							newLeafNode(lv_name_8_2, grammarAccess.getTff_rootAccess().getNameSTRINGTerminalRuleCall_1_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTff_rootRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"name",
                            								lv_name_8_2,
                            								"it.unibz.inf.tptp.TPTP.STRING");
                            						

                            }
                            break;

                    }


                    }


                    }

                    otherlv_9=(Token)match(input,16,FOLLOW_25); 

                    				newLeafNode(otherlv_9, grammarAccess.getTff_rootAccess().getCommaKeyword_1_2());
                    			
                    // InternalTPTP.g:1245:4: ( (lv_formula_role_10_0= 'type' ) )
                    // InternalTPTP.g:1246:5: (lv_formula_role_10_0= 'type' )
                    {
                    // InternalTPTP.g:1246:5: (lv_formula_role_10_0= 'type' )
                    // InternalTPTP.g:1247:6: lv_formula_role_10_0= 'type'
                    {
                    lv_formula_role_10_0=(Token)match(input,34,FOLLOW_11); 

                    						newLeafNode(lv_formula_role_10_0, grammarAccess.getTff_rootAccess().getFormula_roleTypeKeyword_1_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_rootRule());
                    						}
                    						setWithLastConsumed(current, "formula_role", lv_formula_role_10_0, "type");
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,16,FOLLOW_26); 

                    				newLeafNode(otherlv_11, grammarAccess.getTff_rootAccess().getCommaKeyword_1_4());
                    			
                    // InternalTPTP.g:1263:4: ( (lv_def_12_0= ruletff_formula_type_definition ) )
                    // InternalTPTP.g:1264:5: (lv_def_12_0= ruletff_formula_type_definition )
                    {
                    // InternalTPTP.g:1264:5: (lv_def_12_0= ruletff_formula_type_definition )
                    // InternalTPTP.g:1265:6: lv_def_12_0= ruletff_formula_type_definition
                    {

                    						newCompositeNode(grammarAccess.getTff_rootAccess().getDefTff_formula_type_definitionParserRuleCall_1_5_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_def_12_0=ruletff_formula_type_definition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTff_rootRule());
                    						}
                    						set(
                    							current,
                    							"def",
                    							lv_def_12_0,
                    							"it.unibz.inf.tptp.TPTP.tff_formula_type_definition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getTff_rootAccess().getRightParenthesisFullStopKeyword_1_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletff_root"


    // $ANTLR start "entryRuletff_formula_type_definition"
    // InternalTPTP.g:1291:1: entryRuletff_formula_type_definition returns [EObject current=null] : iv_ruletff_formula_type_definition= ruletff_formula_type_definition EOF ;
    public final EObject entryRuletff_formula_type_definition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletff_formula_type_definition = null;


        try {
            // InternalTPTP.g:1291:68: (iv_ruletff_formula_type_definition= ruletff_formula_type_definition EOF )
            // InternalTPTP.g:1292:2: iv_ruletff_formula_type_definition= ruletff_formula_type_definition EOF
            {
             newCompositeNode(grammarAccess.getTff_formula_type_definitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletff_formula_type_definition=ruletff_formula_type_definition();

            state._fsp--;

             current =iv_ruletff_formula_type_definition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletff_formula_type_definition"


    // $ANTLR start "ruletff_formula_type_definition"
    // InternalTPTP.g:1298:1: ruletff_formula_type_definition returns [EObject current=null] : ( (otherlv_0= '(' this_tff_formula_type_definition_1= ruletff_formula_type_definition otherlv_2= ')' ) | ( ( ( (lv_name_3_0= rulelower_token_and_keyword ) ) | ( (lv_name_4_0= RULE_STRING ) ) ) otherlv_5= ':' ( ( (lv_exp_6_1= ruletff_type_quantifier_epression | lv_exp_6_2= ruletff_type_expression ) ) ) ) ) ;
    public final EObject ruletff_formula_type_definition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        EObject this_tff_formula_type_definition_1 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_exp_6_1 = null;

        EObject lv_exp_6_2 = null;



        	enterRule();

        try {
            // InternalTPTP.g:1304:2: ( ( (otherlv_0= '(' this_tff_formula_type_definition_1= ruletff_formula_type_definition otherlv_2= ')' ) | ( ( ( (lv_name_3_0= rulelower_token_and_keyword ) ) | ( (lv_name_4_0= RULE_STRING ) ) ) otherlv_5= ':' ( ( (lv_exp_6_1= ruletff_type_quantifier_epression | lv_exp_6_2= ruletff_type_expression ) ) ) ) ) )
            // InternalTPTP.g:1305:2: ( (otherlv_0= '(' this_tff_formula_type_definition_1= ruletff_formula_type_definition otherlv_2= ')' ) | ( ( ( (lv_name_3_0= rulelower_token_and_keyword ) ) | ( (lv_name_4_0= RULE_STRING ) ) ) otherlv_5= ':' ( ( (lv_exp_6_1= ruletff_type_quantifier_epression | lv_exp_6_2= ruletff_type_expression ) ) ) ) )
            {
            // InternalTPTP.g:1305:2: ( (otherlv_0= '(' this_tff_formula_type_definition_1= ruletff_formula_type_definition otherlv_2= ')' ) | ( ( ( (lv_name_3_0= rulelower_token_and_keyword ) ) | ( (lv_name_4_0= RULE_STRING ) ) ) otherlv_5= ':' ( ( (lv_exp_6_1= ruletff_type_quantifier_epression | lv_exp_6_2= ruletff_type_expression ) ) ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==23) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_STRING||LA26_0==RULE_LOWER_TOKEN||(LA26_0>=17 && LA26_0<=22)||LA26_0==34||LA26_0==67) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalTPTP.g:1306:3: (otherlv_0= '(' this_tff_formula_type_definition_1= ruletff_formula_type_definition otherlv_2= ')' )
                    {
                    // InternalTPTP.g:1306:3: (otherlv_0= '(' this_tff_formula_type_definition_1= ruletff_formula_type_definition otherlv_2= ')' )
                    // InternalTPTP.g:1307:4: otherlv_0= '(' this_tff_formula_type_definition_1= ruletff_formula_type_definition otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_26); 

                    				newLeafNode(otherlv_0, grammarAccess.getTff_formula_type_definitionAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getTff_formula_type_definitionAccess().getTff_formula_type_definitionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_15);
                    this_tff_formula_type_definition_1=ruletff_formula_type_definition();

                    state._fsp--;


                    				current = this_tff_formula_type_definition_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getTff_formula_type_definitionAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTPTP.g:1325:3: ( ( ( (lv_name_3_0= rulelower_token_and_keyword ) ) | ( (lv_name_4_0= RULE_STRING ) ) ) otherlv_5= ':' ( ( (lv_exp_6_1= ruletff_type_quantifier_epression | lv_exp_6_2= ruletff_type_expression ) ) ) )
                    {
                    // InternalTPTP.g:1325:3: ( ( ( (lv_name_3_0= rulelower_token_and_keyword ) ) | ( (lv_name_4_0= RULE_STRING ) ) ) otherlv_5= ':' ( ( (lv_exp_6_1= ruletff_type_quantifier_epression | lv_exp_6_2= ruletff_type_expression ) ) ) )
                    // InternalTPTP.g:1326:4: ( ( (lv_name_3_0= rulelower_token_and_keyword ) ) | ( (lv_name_4_0= RULE_STRING ) ) ) otherlv_5= ':' ( ( (lv_exp_6_1= ruletff_type_quantifier_epression | lv_exp_6_2= ruletff_type_expression ) ) )
                    {
                    // InternalTPTP.g:1326:4: ( ( (lv_name_3_0= rulelower_token_and_keyword ) ) | ( (lv_name_4_0= RULE_STRING ) ) )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==RULE_LOWER_TOKEN||(LA24_0>=17 && LA24_0<=22)||LA24_0==34||LA24_0==67) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==RULE_STRING) ) {
                        alt24=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalTPTP.g:1327:5: ( (lv_name_3_0= rulelower_token_and_keyword ) )
                            {
                            // InternalTPTP.g:1327:5: ( (lv_name_3_0= rulelower_token_and_keyword ) )
                            // InternalTPTP.g:1328:6: (lv_name_3_0= rulelower_token_and_keyword )
                            {
                            // InternalTPTP.g:1328:6: (lv_name_3_0= rulelower_token_and_keyword )
                            // InternalTPTP.g:1329:7: lv_name_3_0= rulelower_token_and_keyword
                            {

                            							newCompositeNode(grammarAccess.getTff_formula_type_definitionAccess().getNameLower_token_and_keywordParserRuleCall_1_0_0_0());
                            						
                            pushFollow(FOLLOW_22);
                            lv_name_3_0=rulelower_token_and_keyword();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getTff_formula_type_definitionRule());
                            							}
                            							set(
                            								current,
                            								"name",
                            								lv_name_3_0,
                            								"it.unibz.inf.tptp.TPTP.lower_token_and_keyword");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalTPTP.g:1347:5: ( (lv_name_4_0= RULE_STRING ) )
                            {
                            // InternalTPTP.g:1347:5: ( (lv_name_4_0= RULE_STRING ) )
                            // InternalTPTP.g:1348:6: (lv_name_4_0= RULE_STRING )
                            {
                            // InternalTPTP.g:1348:6: (lv_name_4_0= RULE_STRING )
                            // InternalTPTP.g:1349:7: lv_name_4_0= RULE_STRING
                            {
                            lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

                            							newLeafNode(lv_name_4_0, grammarAccess.getTff_formula_type_definitionAccess().getNameSTRINGTerminalRuleCall_1_0_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTff_formula_type_definitionRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"name",
                            								lv_name_4_0,
                            								"it.unibz.inf.tptp.TPTP.STRING");
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,32,FOLLOW_27); 

                    				newLeafNode(otherlv_5, grammarAccess.getTff_formula_type_definitionAccess().getColonKeyword_1_1());
                    			
                    // InternalTPTP.g:1370:4: ( ( (lv_exp_6_1= ruletff_type_quantifier_epression | lv_exp_6_2= ruletff_type_expression ) ) )
                    // InternalTPTP.g:1371:5: ( (lv_exp_6_1= ruletff_type_quantifier_epression | lv_exp_6_2= ruletff_type_expression ) )
                    {
                    // InternalTPTP.g:1371:5: ( (lv_exp_6_1= ruletff_type_quantifier_epression | lv_exp_6_2= ruletff_type_expression ) )
                    // InternalTPTP.g:1372:6: (lv_exp_6_1= ruletff_type_quantifier_epression | lv_exp_6_2= ruletff_type_expression )
                    {
                    // InternalTPTP.g:1372:6: (lv_exp_6_1= ruletff_type_quantifier_epression | lv_exp_6_2= ruletff_type_expression )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==65) ) {
                        alt25=1;
                    }
                    else if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_LOWER_TOKEN)||(LA25_0>=17 && LA25_0<=23)||LA25_0==34||(LA25_0>=37 && LA25_0<=42)||LA25_0==67) ) {
                        alt25=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalTPTP.g:1373:7: lv_exp_6_1= ruletff_type_quantifier_epression
                            {

                            							newCompositeNode(grammarAccess.getTff_formula_type_definitionAccess().getExpTff_type_quantifier_epressionParserRuleCall_1_2_0_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_exp_6_1=ruletff_type_quantifier_epression();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getTff_formula_type_definitionRule());
                            							}
                            							set(
                            								current,
                            								"exp",
                            								lv_exp_6_1,
                            								"it.unibz.inf.tptp.TPTP.tff_type_quantifier_epression");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalTPTP.g:1389:7: lv_exp_6_2= ruletff_type_expression
                            {

                            							newCompositeNode(grammarAccess.getTff_formula_type_definitionAccess().getExpTff_type_expressionParserRuleCall_1_2_0_1());
                            						
                            pushFollow(FOLLOW_2);
                            lv_exp_6_2=ruletff_type_expression();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getTff_formula_type_definitionRule());
                            							}
                            							set(
                            								current,
                            								"exp",
                            								lv_exp_6_2,
                            								"it.unibz.inf.tptp.TPTP.tff_type_expression");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletff_formula_type_definition"


    // $ANTLR start "entryRuletff_type_expression"
    // InternalTPTP.g:1412:1: entryRuletff_type_expression returns [EObject current=null] : iv_ruletff_type_expression= ruletff_type_expression EOF ;
    public final EObject entryRuletff_type_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletff_type_expression = null;


        try {
            // InternalTPTP.g:1412:60: (iv_ruletff_type_expression= ruletff_type_expression EOF )
            // InternalTPTP.g:1413:2: iv_ruletff_type_expression= ruletff_type_expression EOF
            {
             newCompositeNode(grammarAccess.getTff_type_expressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletff_type_expression=ruletff_type_expression();

            state._fsp--;

             current =iv_ruletff_type_expression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletff_type_expression"


    // $ANTLR start "ruletff_type_expression"
    // InternalTPTP.g:1419:1: ruletff_type_expression returns [EObject current=null] : (this_tff_terminal_type_expression_0= ruletff_terminal_type_expression ( () ( ( (lv_op_2_1= '>' | lv_op_2_2= '*' ) ) ) ( (lv_right_3_0= ruletff_terminal_type_expression ) ) )* ) ;
    public final EObject ruletff_type_expression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_tff_terminal_type_expression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:1425:2: ( (this_tff_terminal_type_expression_0= ruletff_terminal_type_expression ( () ( ( (lv_op_2_1= '>' | lv_op_2_2= '*' ) ) ) ( (lv_right_3_0= ruletff_terminal_type_expression ) ) )* ) )
            // InternalTPTP.g:1426:2: (this_tff_terminal_type_expression_0= ruletff_terminal_type_expression ( () ( ( (lv_op_2_1= '>' | lv_op_2_2= '*' ) ) ) ( (lv_right_3_0= ruletff_terminal_type_expression ) ) )* )
            {
            // InternalTPTP.g:1426:2: (this_tff_terminal_type_expression_0= ruletff_terminal_type_expression ( () ( ( (lv_op_2_1= '>' | lv_op_2_2= '*' ) ) ) ( (lv_right_3_0= ruletff_terminal_type_expression ) ) )* )
            // InternalTPTP.g:1427:3: this_tff_terminal_type_expression_0= ruletff_terminal_type_expression ( () ( ( (lv_op_2_1= '>' | lv_op_2_2= '*' ) ) ) ( (lv_right_3_0= ruletff_terminal_type_expression ) ) )*
            {

            			newCompositeNode(grammarAccess.getTff_type_expressionAccess().getTff_terminal_type_expressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_tff_terminal_type_expression_0=ruletff_terminal_type_expression();

            state._fsp--;


            			current = this_tff_terminal_type_expression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTPTP.g:1435:3: ( () ( ( (lv_op_2_1= '>' | lv_op_2_2= '*' ) ) ) ( (lv_right_3_0= ruletff_terminal_type_expression ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=35 && LA28_0<=36)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalTPTP.g:1436:4: () ( ( (lv_op_2_1= '>' | lv_op_2_2= '*' ) ) ) ( (lv_right_3_0= ruletff_terminal_type_expression ) )
            	    {
            	    // InternalTPTP.g:1436:4: ()
            	    // InternalTPTP.g:1437:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getTff_type_expressionAccess().getOperLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalTPTP.g:1443:4: ( ( (lv_op_2_1= '>' | lv_op_2_2= '*' ) ) )
            	    // InternalTPTP.g:1444:5: ( (lv_op_2_1= '>' | lv_op_2_2= '*' ) )
            	    {
            	    // InternalTPTP.g:1444:5: ( (lv_op_2_1= '>' | lv_op_2_2= '*' ) )
            	    // InternalTPTP.g:1445:6: (lv_op_2_1= '>' | lv_op_2_2= '*' )
            	    {
            	    // InternalTPTP.g:1445:6: (lv_op_2_1= '>' | lv_op_2_2= '*' )
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==35) ) {
            	        alt27=1;
            	    }
            	    else if ( (LA27_0==36) ) {
            	        alt27=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // InternalTPTP.g:1446:7: lv_op_2_1= '>'
            	            {
            	            lv_op_2_1=(Token)match(input,35,FOLLOW_27); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getTff_type_expressionAccess().getOpGreaterThanSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getTff_type_expressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalTPTP.g:1457:7: lv_op_2_2= '*'
            	            {
            	            lv_op_2_2=(Token)match(input,36,FOLLOW_27); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getTff_type_expressionAccess().getOpAsteriskKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getTff_type_expressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalTPTP.g:1470:4: ( (lv_right_3_0= ruletff_terminal_type_expression ) )
            	    // InternalTPTP.g:1471:5: (lv_right_3_0= ruletff_terminal_type_expression )
            	    {
            	    // InternalTPTP.g:1471:5: (lv_right_3_0= ruletff_terminal_type_expression )
            	    // InternalTPTP.g:1472:6: lv_right_3_0= ruletff_terminal_type_expression
            	    {

            	    						newCompositeNode(grammarAccess.getTff_type_expressionAccess().getRightTff_terminal_type_expressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_right_3_0=ruletff_terminal_type_expression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTff_type_expressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"it.unibz.inf.tptp.TPTP.tff_terminal_type_expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletff_type_expression"


    // $ANTLR start "entryRuletff_terminal_type_expression"
    // InternalTPTP.g:1494:1: entryRuletff_terminal_type_expression returns [EObject current=null] : iv_ruletff_terminal_type_expression= ruletff_terminal_type_expression EOF ;
    public final EObject entryRuletff_terminal_type_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletff_terminal_type_expression = null;


        try {
            // InternalTPTP.g:1494:69: (iv_ruletff_terminal_type_expression= ruletff_terminal_type_expression EOF )
            // InternalTPTP.g:1495:2: iv_ruletff_terminal_type_expression= ruletff_terminal_type_expression EOF
            {
             newCompositeNode(grammarAccess.getTff_terminal_type_expressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletff_terminal_type_expression=ruletff_terminal_type_expression();

            state._fsp--;

             current =iv_ruletff_terminal_type_expression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletff_terminal_type_expression"


    // $ANTLR start "ruletff_terminal_type_expression"
    // InternalTPTP.g:1501:1: ruletff_terminal_type_expression returns [EObject current=null] : (this_tff_type_atom_0= ruletff_type_atom | (otherlv_1= '(' this_tff_type_expression_2= ruletff_type_expression otherlv_3= ')' ) ) ;
    public final EObject ruletff_terminal_type_expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_tff_type_atom_0 = null;

        EObject this_tff_type_expression_2 = null;



        	enterRule();

        try {
            // InternalTPTP.g:1507:2: ( (this_tff_type_atom_0= ruletff_type_atom | (otherlv_1= '(' this_tff_type_expression_2= ruletff_type_expression otherlv_3= ')' ) ) )
            // InternalTPTP.g:1508:2: (this_tff_type_atom_0= ruletff_type_atom | (otherlv_1= '(' this_tff_type_expression_2= ruletff_type_expression otherlv_3= ')' ) )
            {
            // InternalTPTP.g:1508:2: (this_tff_type_atom_0= ruletff_type_atom | (otherlv_1= '(' this_tff_type_expression_2= ruletff_type_expression otherlv_3= ')' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_STRING && LA29_0<=RULE_LOWER_TOKEN)||(LA29_0>=17 && LA29_0<=22)||LA29_0==34||(LA29_0>=37 && LA29_0<=42)||LA29_0==67) ) {
                alt29=1;
            }
            else if ( (LA29_0==23) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalTPTP.g:1509:3: this_tff_type_atom_0= ruletff_type_atom
                    {

                    			newCompositeNode(grammarAccess.getTff_terminal_type_expressionAccess().getTff_type_atomParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_tff_type_atom_0=ruletff_type_atom();

                    state._fsp--;


                    			current = this_tff_type_atom_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:1518:3: (otherlv_1= '(' this_tff_type_expression_2= ruletff_type_expression otherlv_3= ')' )
                    {
                    // InternalTPTP.g:1518:3: (otherlv_1= '(' this_tff_type_expression_2= ruletff_type_expression otherlv_3= ')' )
                    // InternalTPTP.g:1519:4: otherlv_1= '(' this_tff_type_expression_2= ruletff_type_expression otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_27); 

                    				newLeafNode(otherlv_1, grammarAccess.getTff_terminal_type_expressionAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getTff_terminal_type_expressionAccess().getTff_type_expressionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_15);
                    this_tff_type_expression_2=ruletff_type_expression();

                    state._fsp--;


                    				current = this_tff_type_expression_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getTff_terminal_type_expressionAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletff_terminal_type_expression"


    // $ANTLR start "entryRuletff_type_atom"
    // InternalTPTP.g:1540:1: entryRuletff_type_atom returns [EObject current=null] : iv_ruletff_type_atom= ruletff_type_atom EOF ;
    public final EObject entryRuletff_type_atom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletff_type_atom = null;


        try {
            // InternalTPTP.g:1540:54: (iv_ruletff_type_atom= ruletff_type_atom EOF )
            // InternalTPTP.g:1541:2: iv_ruletff_type_atom= ruletff_type_atom EOF
            {
             newCompositeNode(grammarAccess.getTff_type_atomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletff_type_atom=ruletff_type_atom();

            state._fsp--;

             current =iv_ruletff_type_atom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletff_type_atom"


    // $ANTLR start "ruletff_type_atom"
    // InternalTPTP.g:1547:1: ruletff_type_atom returns [EObject current=null] : (this_tff_type_constant_0= ruletff_type_constant | this_tff_var_1= ruletff_var | this_tff_type_literal_2= ruletff_type_literal ) ;
    public final EObject ruletff_type_atom() throws RecognitionException {
        EObject current = null;

        EObject this_tff_type_constant_0 = null;

        EObject this_tff_var_1 = null;

        EObject this_tff_type_literal_2 = null;



        	enterRule();

        try {
            // InternalTPTP.g:1553:2: ( (this_tff_type_constant_0= ruletff_type_constant | this_tff_var_1= ruletff_var | this_tff_type_literal_2= ruletff_type_literal ) )
            // InternalTPTP.g:1554:2: (this_tff_type_constant_0= ruletff_type_constant | this_tff_var_1= ruletff_var | this_tff_type_literal_2= ruletff_type_literal )
            {
            // InternalTPTP.g:1554:2: (this_tff_type_constant_0= ruletff_type_constant | this_tff_var_1= ruletff_var | this_tff_type_literal_2= ruletff_type_literal )
            int alt30=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_LOWER_TOKEN:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 34:
            case 67:
                {
                alt30=1;
                }
                break;
            case RULE_UPPER_TOKEN:
                {
                alt30=2;
                }
                break;
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalTPTP.g:1555:3: this_tff_type_constant_0= ruletff_type_constant
                    {

                    			newCompositeNode(grammarAccess.getTff_type_atomAccess().getTff_type_constantParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_tff_type_constant_0=ruletff_type_constant();

                    state._fsp--;


                    			current = this_tff_type_constant_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:1564:3: this_tff_var_1= ruletff_var
                    {

                    			newCompositeNode(grammarAccess.getTff_type_atomAccess().getTff_varParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_tff_var_1=ruletff_var();

                    state._fsp--;


                    			current = this_tff_var_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTPTP.g:1573:3: this_tff_type_literal_2= ruletff_type_literal
                    {

                    			newCompositeNode(grammarAccess.getTff_type_atomAccess().getTff_type_literalParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_tff_type_literal_2=ruletff_type_literal();

                    state._fsp--;


                    			current = this_tff_type_literal_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletff_type_atom"


    // $ANTLR start "entryRuletff_type_constant"
    // InternalTPTP.g:1585:1: entryRuletff_type_constant returns [EObject current=null] : iv_ruletff_type_constant= ruletff_type_constant EOF ;
    public final EObject entryRuletff_type_constant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletff_type_constant = null;


        try {
            // InternalTPTP.g:1585:58: (iv_ruletff_type_constant= ruletff_type_constant EOF )
            // InternalTPTP.g:1586:2: iv_ruletff_type_constant= ruletff_type_constant EOF
            {
             newCompositeNode(grammarAccess.getTff_type_constantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletff_type_constant=ruletff_type_constant();

            state._fsp--;

             current =iv_ruletff_type_constant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletff_type_constant"


    // $ANTLR start "ruletff_type_constant"
    // InternalTPTP.g:1592:1: ruletff_type_constant returns [EObject current=null] : ( ( ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_param_2_0= ruletff_type_atom ) ) (otherlv_3= ',' ( (lv_param_4_0= ruletff_type_atom ) ) )* otherlv_5= ')' )? ) ;
    public final EObject ruletff_type_constant() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_2=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_0_1 = null;

        EObject lv_param_2_0 = null;

        EObject lv_param_4_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:1598:2: ( ( ( ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_param_2_0= ruletff_type_atom ) ) (otherlv_3= ',' ( (lv_param_4_0= ruletff_type_atom ) ) )* otherlv_5= ')' )? ) )
            // InternalTPTP.g:1599:2: ( ( ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_param_2_0= ruletff_type_atom ) ) (otherlv_3= ',' ( (lv_param_4_0= ruletff_type_atom ) ) )* otherlv_5= ')' )? )
            {
            // InternalTPTP.g:1599:2: ( ( ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_param_2_0= ruletff_type_atom ) ) (otherlv_3= ',' ( (lv_param_4_0= ruletff_type_atom ) ) )* otherlv_5= ')' )? )
            // InternalTPTP.g:1600:3: ( ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_param_2_0= ruletff_type_atom ) ) (otherlv_3= ',' ( (lv_param_4_0= ruletff_type_atom ) ) )* otherlv_5= ')' )?
            {
            // InternalTPTP.g:1600:3: ( ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) )
            // InternalTPTP.g:1601:4: ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) )
            {
            // InternalTPTP.g:1601:4: ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) )
            // InternalTPTP.g:1602:5: (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING )
            {
            // InternalTPTP.g:1602:5: (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_LOWER_TOKEN||(LA31_0>=17 && LA31_0<=22)||LA31_0==34||LA31_0==67) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_STRING) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalTPTP.g:1603:6: lv_name_0_1= rulelower_token_and_keyword
                    {

                    						newCompositeNode(grammarAccess.getTff_type_constantAccess().getNameLower_token_and_keywordParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_name_0_1=rulelower_token_and_keyword();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTff_type_constantRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_0_1,
                    							"it.unibz.inf.tptp.TPTP.lower_token_and_keyword");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:1619:6: lv_name_0_2= RULE_STRING
                    {
                    lv_name_0_2=(Token)match(input,RULE_STRING,FOLLOW_16); 

                    						newLeafNode(lv_name_0_2, grammarAccess.getTff_type_constantAccess().getNameSTRINGTerminalRuleCall_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_type_constantRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_0_2,
                    							"it.unibz.inf.tptp.TPTP.STRING");
                    					

                    }
                    break;

            }


            }


            }

            // InternalTPTP.g:1636:3: (otherlv_1= '(' ( (lv_param_2_0= ruletff_type_atom ) ) (otherlv_3= ',' ( (lv_param_4_0= ruletff_type_atom ) ) )* otherlv_5= ')' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==23) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalTPTP.g:1637:4: otherlv_1= '(' ( (lv_param_2_0= ruletff_type_atom ) ) (otherlv_3= ',' ( (lv_param_4_0= ruletff_type_atom ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_29); 

                    				newLeafNode(otherlv_1, grammarAccess.getTff_type_constantAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalTPTP.g:1641:4: ( (lv_param_2_0= ruletff_type_atom ) )
                    // InternalTPTP.g:1642:5: (lv_param_2_0= ruletff_type_atom )
                    {
                    // InternalTPTP.g:1642:5: (lv_param_2_0= ruletff_type_atom )
                    // InternalTPTP.g:1643:6: lv_param_2_0= ruletff_type_atom
                    {

                    						newCompositeNode(grammarAccess.getTff_type_constantAccess().getParamTff_type_atomParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_param_2_0=ruletff_type_atom();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTff_type_constantRule());
                    						}
                    						add(
                    							current,
                    							"param",
                    							lv_param_2_0,
                    							"it.unibz.inf.tptp.TPTP.tff_type_atom");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTPTP.g:1660:4: (otherlv_3= ',' ( (lv_param_4_0= ruletff_type_atom ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==16) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalTPTP.g:1661:5: otherlv_3= ',' ( (lv_param_4_0= ruletff_type_atom ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_29); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getTff_type_constantAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalTPTP.g:1665:5: ( (lv_param_4_0= ruletff_type_atom ) )
                    	    // InternalTPTP.g:1666:6: (lv_param_4_0= ruletff_type_atom )
                    	    {
                    	    // InternalTPTP.g:1666:6: (lv_param_4_0= ruletff_type_atom )
                    	    // InternalTPTP.g:1667:7: lv_param_4_0= ruletff_type_atom
                    	    {

                    	    							newCompositeNode(grammarAccess.getTff_type_constantAccess().getParamTff_type_atomParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_param_4_0=ruletff_type_atom();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTff_type_constantRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"param",
                    	    								lv_param_4_0,
                    	    								"it.unibz.inf.tptp.TPTP.tff_type_atom");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getTff_type_constantAccess().getRightParenthesisKeyword_1_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletff_type_constant"


    // $ANTLR start "entryRuletff_type_literal"
    // InternalTPTP.g:1694:1: entryRuletff_type_literal returns [EObject current=null] : iv_ruletff_type_literal= ruletff_type_literal EOF ;
    public final EObject entryRuletff_type_literal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletff_type_literal = null;


        try {
            // InternalTPTP.g:1694:57: (iv_ruletff_type_literal= ruletff_type_literal EOF )
            // InternalTPTP.g:1695:2: iv_ruletff_type_literal= ruletff_type_literal EOF
            {
             newCompositeNode(grammarAccess.getTff_type_literalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletff_type_literal=ruletff_type_literal();

            state._fsp--;

             current =iv_ruletff_type_literal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletff_type_literal"


    // $ANTLR start "ruletff_type_literal"
    // InternalTPTP.g:1701:1: ruletff_type_literal returns [EObject current=null] : ( ( (lv_name_0_1= '$i' | lv_name_0_2= '$o' | lv_name_0_3= '$tType' | lv_name_0_4= '$int' | lv_name_0_5= '$real' | lv_name_0_6= '$rat' ) ) ) ;
    public final EObject ruletff_type_literal() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token lv_name_0_4=null;
        Token lv_name_0_5=null;
        Token lv_name_0_6=null;


        	enterRule();

        try {
            // InternalTPTP.g:1707:2: ( ( ( (lv_name_0_1= '$i' | lv_name_0_2= '$o' | lv_name_0_3= '$tType' | lv_name_0_4= '$int' | lv_name_0_5= '$real' | lv_name_0_6= '$rat' ) ) ) )
            // InternalTPTP.g:1708:2: ( ( (lv_name_0_1= '$i' | lv_name_0_2= '$o' | lv_name_0_3= '$tType' | lv_name_0_4= '$int' | lv_name_0_5= '$real' | lv_name_0_6= '$rat' ) ) )
            {
            // InternalTPTP.g:1708:2: ( ( (lv_name_0_1= '$i' | lv_name_0_2= '$o' | lv_name_0_3= '$tType' | lv_name_0_4= '$int' | lv_name_0_5= '$real' | lv_name_0_6= '$rat' ) ) )
            // InternalTPTP.g:1709:3: ( (lv_name_0_1= '$i' | lv_name_0_2= '$o' | lv_name_0_3= '$tType' | lv_name_0_4= '$int' | lv_name_0_5= '$real' | lv_name_0_6= '$rat' ) )
            {
            // InternalTPTP.g:1709:3: ( (lv_name_0_1= '$i' | lv_name_0_2= '$o' | lv_name_0_3= '$tType' | lv_name_0_4= '$int' | lv_name_0_5= '$real' | lv_name_0_6= '$rat' ) )
            // InternalTPTP.g:1710:4: (lv_name_0_1= '$i' | lv_name_0_2= '$o' | lv_name_0_3= '$tType' | lv_name_0_4= '$int' | lv_name_0_5= '$real' | lv_name_0_6= '$rat' )
            {
            // InternalTPTP.g:1710:4: (lv_name_0_1= '$i' | lv_name_0_2= '$o' | lv_name_0_3= '$tType' | lv_name_0_4= '$int' | lv_name_0_5= '$real' | lv_name_0_6= '$rat' )
            int alt34=6;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt34=1;
                }
                break;
            case 38:
                {
                alt34=2;
                }
                break;
            case 39:
                {
                alt34=3;
                }
                break;
            case 40:
                {
                alt34=4;
                }
                break;
            case 41:
                {
                alt34=5;
                }
                break;
            case 42:
                {
                alt34=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalTPTP.g:1711:5: lv_name_0_1= '$i'
                    {
                    lv_name_0_1=(Token)match(input,37,FOLLOW_2); 

                    					newLeafNode(lv_name_0_1, grammarAccess.getTff_type_literalAccess().getNameIKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTff_type_literalRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:1722:5: lv_name_0_2= '$o'
                    {
                    lv_name_0_2=(Token)match(input,38,FOLLOW_2); 

                    					newLeafNode(lv_name_0_2, grammarAccess.getTff_type_literalAccess().getNameOKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTff_type_literalRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalTPTP.g:1733:5: lv_name_0_3= '$tType'
                    {
                    lv_name_0_3=(Token)match(input,39,FOLLOW_2); 

                    					newLeafNode(lv_name_0_3, grammarAccess.getTff_type_literalAccess().getNameTTypeKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTff_type_literalRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalTPTP.g:1744:5: lv_name_0_4= '$int'
                    {
                    lv_name_0_4=(Token)match(input,40,FOLLOW_2); 

                    					newLeafNode(lv_name_0_4, grammarAccess.getTff_type_literalAccess().getNameIntKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTff_type_literalRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalTPTP.g:1755:5: lv_name_0_5= '$real'
                    {
                    lv_name_0_5=(Token)match(input,41,FOLLOW_2); 

                    					newLeafNode(lv_name_0_5, grammarAccess.getTff_type_literalAccess().getNameRealKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTff_type_literalRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalTPTP.g:1766:5: lv_name_0_6= '$rat'
                    {
                    lv_name_0_6=(Token)match(input,42,FOLLOW_2); 

                    					newLeafNode(lv_name_0_6, grammarAccess.getTff_type_literalAccess().getNameRatKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTff_type_literalRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_6, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletff_type_literal"


    // $ANTLR start "entryRuletff_expression"
    // InternalTPTP.g:1782:1: entryRuletff_expression returns [EObject current=null] : iv_ruletff_expression= ruletff_expression EOF ;
    public final EObject entryRuletff_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletff_expression = null;


        try {
            // InternalTPTP.g:1782:55: (iv_ruletff_expression= ruletff_expression EOF )
            // InternalTPTP.g:1783:2: iv_ruletff_expression= ruletff_expression EOF
            {
             newCompositeNode(grammarAccess.getTff_expressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletff_expression=ruletff_expression();

            state._fsp--;

             current =iv_ruletff_expression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletff_expression"


    // $ANTLR start "ruletff_expression"
    // InternalTPTP.g:1789:1: ruletff_expression returns [EObject current=null] : (this_tff_terminating_expression_0= ruletff_terminating_expression ( () ( (lv_op_2_0= rulebinary_operator ) ) ( (lv_right_3_0= ruletff_terminating_expression ) ) )* ) ;
    public final EObject ruletff_expression() throws RecognitionException {
        EObject current = null;

        EObject this_tff_terminating_expression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:1795:2: ( (this_tff_terminating_expression_0= ruletff_terminating_expression ( () ( (lv_op_2_0= rulebinary_operator ) ) ( (lv_right_3_0= ruletff_terminating_expression ) ) )* ) )
            // InternalTPTP.g:1796:2: (this_tff_terminating_expression_0= ruletff_terminating_expression ( () ( (lv_op_2_0= rulebinary_operator ) ) ( (lv_right_3_0= ruletff_terminating_expression ) ) )* )
            {
            // InternalTPTP.g:1796:2: (this_tff_terminating_expression_0= ruletff_terminating_expression ( () ( (lv_op_2_0= rulebinary_operator ) ) ( (lv_right_3_0= ruletff_terminating_expression ) ) )* )
            // InternalTPTP.g:1797:3: this_tff_terminating_expression_0= ruletff_terminating_expression ( () ( (lv_op_2_0= rulebinary_operator ) ) ( (lv_right_3_0= ruletff_terminating_expression ) ) )*
            {

            			newCompositeNode(grammarAccess.getTff_expressionAccess().getTff_terminating_expressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_tff_terminating_expression_0=ruletff_terminating_expression();

            state._fsp--;


            			current = this_tff_terminating_expression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTPTP.g:1805:3: ( () ( (lv_op_2_0= rulebinary_operator ) ) ( (lv_right_3_0= ruletff_terminating_expression ) ) )*
            loop35:
            do {
                int alt35=2;
                alt35 = dfa35.predict(input);
                switch (alt35) {
            	case 1 :
            	    // InternalTPTP.g:1806:4: () ( (lv_op_2_0= rulebinary_operator ) ) ( (lv_right_3_0= ruletff_terminating_expression ) )
            	    {
            	    // InternalTPTP.g:1806:4: ()
            	    // InternalTPTP.g:1807:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getTff_expressionAccess().getBinaryLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalTPTP.g:1813:4: ( (lv_op_2_0= rulebinary_operator ) )
            	    // InternalTPTP.g:1814:5: (lv_op_2_0= rulebinary_operator )
            	    {
            	    // InternalTPTP.g:1814:5: (lv_op_2_0= rulebinary_operator )
            	    // InternalTPTP.g:1815:6: lv_op_2_0= rulebinary_operator
            	    {

            	    						newCompositeNode(grammarAccess.getTff_expressionAccess().getOpBinary_operatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_op_2_0=rulebinary_operator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTff_expressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"op",
            	    							lv_op_2_0,
            	    							"it.unibz.inf.tptp.TPTP.binary_operator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalTPTP.g:1832:4: ( (lv_right_3_0= ruletff_terminating_expression ) )
            	    // InternalTPTP.g:1833:5: (lv_right_3_0= ruletff_terminating_expression )
            	    {
            	    // InternalTPTP.g:1833:5: (lv_right_3_0= ruletff_terminating_expression )
            	    // InternalTPTP.g:1834:6: lv_right_3_0= ruletff_terminating_expression
            	    {

            	    						newCompositeNode(grammarAccess.getTff_expressionAccess().getRightTff_terminating_expressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_right_3_0=ruletff_terminating_expression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTff_expressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"it.unibz.inf.tptp.TPTP.tff_terminating_expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletff_expression"


    // $ANTLR start "entryRuletff_terminating_expression"
    // InternalTPTP.g:1856:1: entryRuletff_terminating_expression returns [EObject current=null] : iv_ruletff_terminating_expression= ruletff_terminating_expression EOF ;
    public final EObject entryRuletff_terminating_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletff_terminating_expression = null;


        try {
            // InternalTPTP.g:1856:67: (iv_ruletff_terminating_expression= ruletff_terminating_expression EOF )
            // InternalTPTP.g:1857:2: iv_ruletff_terminating_expression= ruletff_terminating_expression EOF
            {
             newCompositeNode(grammarAccess.getTff_terminating_expressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletff_terminating_expression=ruletff_terminating_expression();

            state._fsp--;

             current =iv_ruletff_terminating_expression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletff_terminating_expression"


    // $ANTLR start "ruletff_terminating_expression"
    // InternalTPTP.g:1863:1: ruletff_terminating_expression returns [EObject current=null] : ( ( (lv_atom_0_0= ruletff_atom ) ) | (otherlv_1= '(' this_tff_expression_2= ruletff_expression otherlv_3= ')' ) | ( ( (lv_negation_4_0= '~' ) ) ( (lv_exp_5_0= ruletff_expression ) ) ) | ( (lv_exp_6_0= ruletff_quantifier_expression ) ) ) ;
    public final EObject ruletff_terminating_expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_negation_4_0=null;
        EObject lv_atom_0_0 = null;

        EObject this_tff_expression_2 = null;

        EObject lv_exp_5_0 = null;

        EObject lv_exp_6_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:1869:2: ( ( ( (lv_atom_0_0= ruletff_atom ) ) | (otherlv_1= '(' this_tff_expression_2= ruletff_expression otherlv_3= ')' ) | ( ( (lv_negation_4_0= '~' ) ) ( (lv_exp_5_0= ruletff_expression ) ) ) | ( (lv_exp_6_0= ruletff_quantifier_expression ) ) ) )
            // InternalTPTP.g:1870:2: ( ( (lv_atom_0_0= ruletff_atom ) ) | (otherlv_1= '(' this_tff_expression_2= ruletff_expression otherlv_3= ')' ) | ( ( (lv_negation_4_0= '~' ) ) ( (lv_exp_5_0= ruletff_expression ) ) ) | ( (lv_exp_6_0= ruletff_quantifier_expression ) ) )
            {
            // InternalTPTP.g:1870:2: ( ( (lv_atom_0_0= ruletff_atom ) ) | (otherlv_1= '(' this_tff_expression_2= ruletff_expression otherlv_3= ')' ) | ( ( (lv_negation_4_0= '~' ) ) ( (lv_exp_5_0= ruletff_expression ) ) ) | ( (lv_exp_6_0= ruletff_quantifier_expression ) ) )
            int alt36=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_UPPER_TOKEN:
            case RULE_LOWER_TOKEN:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 26:
            case 27:
            case 34:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 67:
                {
                alt36=1;
                }
                break;
            case 23:
                {
                alt36=2;
                }
                break;
            case 25:
                {
                alt36=3;
                }
                break;
            case 28:
            case 29:
                {
                alt36=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalTPTP.g:1871:3: ( (lv_atom_0_0= ruletff_atom ) )
                    {
                    // InternalTPTP.g:1871:3: ( (lv_atom_0_0= ruletff_atom ) )
                    // InternalTPTP.g:1872:4: (lv_atom_0_0= ruletff_atom )
                    {
                    // InternalTPTP.g:1872:4: (lv_atom_0_0= ruletff_atom )
                    // InternalTPTP.g:1873:5: lv_atom_0_0= ruletff_atom
                    {

                    					newCompositeNode(grammarAccess.getTff_terminating_expressionAccess().getAtomTff_atomParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_atom_0_0=ruletff_atom();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTff_terminating_expressionRule());
                    					}
                    					set(
                    						current,
                    						"atom",
                    						lv_atom_0_0,
                    						"it.unibz.inf.tptp.TPTP.tff_atom");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTPTP.g:1891:3: (otherlv_1= '(' this_tff_expression_2= ruletff_expression otherlv_3= ')' )
                    {
                    // InternalTPTP.g:1891:3: (otherlv_1= '(' this_tff_expression_2= ruletff_expression otherlv_3= ')' )
                    // InternalTPTP.g:1892:4: otherlv_1= '(' this_tff_expression_2= ruletff_expression otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_24); 

                    				newLeafNode(otherlv_1, grammarAccess.getTff_terminating_expressionAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getTff_terminating_expressionAccess().getTff_expressionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_15);
                    this_tff_expression_2=ruletff_expression();

                    state._fsp--;


                    				current = this_tff_expression_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getTff_terminating_expressionAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTPTP.g:1910:3: ( ( (lv_negation_4_0= '~' ) ) ( (lv_exp_5_0= ruletff_expression ) ) )
                    {
                    // InternalTPTP.g:1910:3: ( ( (lv_negation_4_0= '~' ) ) ( (lv_exp_5_0= ruletff_expression ) ) )
                    // InternalTPTP.g:1911:4: ( (lv_negation_4_0= '~' ) ) ( (lv_exp_5_0= ruletff_expression ) )
                    {
                    // InternalTPTP.g:1911:4: ( (lv_negation_4_0= '~' ) )
                    // InternalTPTP.g:1912:5: (lv_negation_4_0= '~' )
                    {
                    // InternalTPTP.g:1912:5: (lv_negation_4_0= '~' )
                    // InternalTPTP.g:1913:6: lv_negation_4_0= '~'
                    {
                    lv_negation_4_0=(Token)match(input,25,FOLLOW_24); 

                    						newLeafNode(lv_negation_4_0, grammarAccess.getTff_terminating_expressionAccess().getNegationTildeKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_terminating_expressionRule());
                    						}
                    						setWithLastConsumed(current, "negation", true, "~");
                    					

                    }


                    }

                    // InternalTPTP.g:1925:4: ( (lv_exp_5_0= ruletff_expression ) )
                    // InternalTPTP.g:1926:5: (lv_exp_5_0= ruletff_expression )
                    {
                    // InternalTPTP.g:1926:5: (lv_exp_5_0= ruletff_expression )
                    // InternalTPTP.g:1927:6: lv_exp_5_0= ruletff_expression
                    {

                    						newCompositeNode(grammarAccess.getTff_terminating_expressionAccess().getExpTff_expressionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_exp_5_0=ruletff_expression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTff_terminating_expressionRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_5_0,
                    							"it.unibz.inf.tptp.TPTP.tff_expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalTPTP.g:1946:3: ( (lv_exp_6_0= ruletff_quantifier_expression ) )
                    {
                    // InternalTPTP.g:1946:3: ( (lv_exp_6_0= ruletff_quantifier_expression ) )
                    // InternalTPTP.g:1947:4: (lv_exp_6_0= ruletff_quantifier_expression )
                    {
                    // InternalTPTP.g:1947:4: (lv_exp_6_0= ruletff_quantifier_expression )
                    // InternalTPTP.g:1948:5: lv_exp_6_0= ruletff_quantifier_expression
                    {

                    					newCompositeNode(grammarAccess.getTff_terminating_expressionAccess().getExpTff_quantifier_expressionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_exp_6_0=ruletff_quantifier_expression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTff_terminating_expressionRule());
                    					}
                    					set(
                    						current,
                    						"exp",
                    						lv_exp_6_0,
                    						"it.unibz.inf.tptp.TPTP.tff_quantifier_expression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletff_terminating_expression"


    // $ANTLR start "entryRuletff_atom"
    // InternalTPTP.g:1969:1: entryRuletff_atom returns [EObject current=null] : iv_ruletff_atom= ruletff_atom EOF ;
    public final EObject entryRuletff_atom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletff_atom = null;


        try {
            // InternalTPTP.g:1969:49: (iv_ruletff_atom= ruletff_atom EOF )
            // InternalTPTP.g:1970:2: iv_ruletff_atom= ruletff_atom EOF
            {
             newCompositeNode(grammarAccess.getTff_atomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletff_atom=ruletff_atom();

            state._fsp--;

             current =iv_ruletff_atom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletff_atom"


    // $ANTLR start "ruletff_atom"
    // InternalTPTP.g:1976:1: ruletff_atom returns [EObject current=null] : (this_tff_var_0= ruletff_var | this_tff_atom_literal_1= ruletff_atom_literal | this_tff_constant_2= ruletff_constant | this_tff_predefined_function_1_args_3= ruletff_predefined_function_1_args | this_tff_predefined_function_2_args_4= ruletff_predefined_function_2_args ) ;
    public final EObject ruletff_atom() throws RecognitionException {
        EObject current = null;

        EObject this_tff_var_0 = null;

        EObject this_tff_atom_literal_1 = null;

        EObject this_tff_constant_2 = null;

        EObject this_tff_predefined_function_1_args_3 = null;

        EObject this_tff_predefined_function_2_args_4 = null;



        	enterRule();

        try {
            // InternalTPTP.g:1982:2: ( (this_tff_var_0= ruletff_var | this_tff_atom_literal_1= ruletff_atom_literal | this_tff_constant_2= ruletff_constant | this_tff_predefined_function_1_args_3= ruletff_predefined_function_1_args | this_tff_predefined_function_2_args_4= ruletff_predefined_function_2_args ) )
            // InternalTPTP.g:1983:2: (this_tff_var_0= ruletff_var | this_tff_atom_literal_1= ruletff_atom_literal | this_tff_constant_2= ruletff_constant | this_tff_predefined_function_1_args_3= ruletff_predefined_function_1_args | this_tff_predefined_function_2_args_4= ruletff_predefined_function_2_args )
            {
            // InternalTPTP.g:1983:2: (this_tff_var_0= ruletff_var | this_tff_atom_literal_1= ruletff_atom_literal | this_tff_constant_2= ruletff_constant | this_tff_predefined_function_1_args_3= ruletff_predefined_function_1_args | this_tff_predefined_function_2_args_4= ruletff_predefined_function_2_args )
            int alt37=5;
            switch ( input.LA(1) ) {
            case RULE_UPPER_TOKEN:
                {
                alt37=1;
                }
                break;
            case 26:
            case 27:
                {
                alt37=2;
                }
                break;
            case RULE_STRING:
            case RULE_LOWER_TOKEN:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 34:
            case 67:
                {
                alt37=3;
                }
                break;
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                {
                alt37=4;
                }
                break;
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
                {
                alt37=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalTPTP.g:1984:3: this_tff_var_0= ruletff_var
                    {

                    			newCompositeNode(grammarAccess.getTff_atomAccess().getTff_varParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_tff_var_0=ruletff_var();

                    state._fsp--;


                    			current = this_tff_var_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:1993:3: this_tff_atom_literal_1= ruletff_atom_literal
                    {

                    			newCompositeNode(grammarAccess.getTff_atomAccess().getTff_atom_literalParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_tff_atom_literal_1=ruletff_atom_literal();

                    state._fsp--;


                    			current = this_tff_atom_literal_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTPTP.g:2002:3: this_tff_constant_2= ruletff_constant
                    {

                    			newCompositeNode(grammarAccess.getTff_atomAccess().getTff_constantParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_tff_constant_2=ruletff_constant();

                    state._fsp--;


                    			current = this_tff_constant_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTPTP.g:2011:3: this_tff_predefined_function_1_args_3= ruletff_predefined_function_1_args
                    {

                    			newCompositeNode(grammarAccess.getTff_atomAccess().getTff_predefined_function_1_argsParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_tff_predefined_function_1_args_3=ruletff_predefined_function_1_args();

                    state._fsp--;


                    			current = this_tff_predefined_function_1_args_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalTPTP.g:2020:3: this_tff_predefined_function_2_args_4= ruletff_predefined_function_2_args
                    {

                    			newCompositeNode(grammarAccess.getTff_atomAccess().getTff_predefined_function_2_argsParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_tff_predefined_function_2_args_4=ruletff_predefined_function_2_args();

                    state._fsp--;


                    			current = this_tff_predefined_function_2_args_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletff_atom"


    // $ANTLR start "entryRuletff_constant"
    // InternalTPTP.g:2032:1: entryRuletff_constant returns [EObject current=null] : iv_ruletff_constant= ruletff_constant EOF ;
    public final EObject entryRuletff_constant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletff_constant = null;


        try {
            // InternalTPTP.g:2032:53: (iv_ruletff_constant= ruletff_constant EOF )
            // InternalTPTP.g:2033:2: iv_ruletff_constant= ruletff_constant EOF
            {
             newCompositeNode(grammarAccess.getTff_constantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletff_constant=ruletff_constant();

            state._fsp--;

             current =iv_ruletff_constant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletff_constant"


    // $ANTLR start "ruletff_constant"
    // InternalTPTP.g:2039:1: ruletff_constant returns [EObject current=null] : ( ( ( ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_param_2_0= ruletff_atom ) ) (otherlv_3= ',' ( (lv_param_4_0= ruletff_atom ) ) )* otherlv_5= ')' )? ) | ( ( (lv_top_6_0= rulelower_token_and_keyword ) ) ( (lv_name_7_0= '/' ) ) ( (lv_bottom_8_0= rulelower_token_and_keyword ) ) ) ) ;
    public final EObject ruletff_constant() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_2=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_name_7_0=null;
        AntlrDatatypeRuleToken lv_name_0_1 = null;

        EObject lv_param_2_0 = null;

        EObject lv_param_4_0 = null;

        AntlrDatatypeRuleToken lv_top_6_0 = null;

        AntlrDatatypeRuleToken lv_bottom_8_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:2045:2: ( ( ( ( ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_param_2_0= ruletff_atom ) ) (otherlv_3= ',' ( (lv_param_4_0= ruletff_atom ) ) )* otherlv_5= ')' )? ) | ( ( (lv_top_6_0= rulelower_token_and_keyword ) ) ( (lv_name_7_0= '/' ) ) ( (lv_bottom_8_0= rulelower_token_and_keyword ) ) ) ) )
            // InternalTPTP.g:2046:2: ( ( ( ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_param_2_0= ruletff_atom ) ) (otherlv_3= ',' ( (lv_param_4_0= ruletff_atom ) ) )* otherlv_5= ')' )? ) | ( ( (lv_top_6_0= rulelower_token_and_keyword ) ) ( (lv_name_7_0= '/' ) ) ( (lv_bottom_8_0= rulelower_token_and_keyword ) ) ) )
            {
            // InternalTPTP.g:2046:2: ( ( ( ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_param_2_0= ruletff_atom ) ) (otherlv_3= ',' ( (lv_param_4_0= ruletff_atom ) ) )* otherlv_5= ')' )? ) | ( ( (lv_top_6_0= rulelower_token_and_keyword ) ) ( (lv_name_7_0= '/' ) ) ( (lv_bottom_8_0= rulelower_token_and_keyword ) ) ) )
            int alt41=2;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // InternalTPTP.g:2047:3: ( ( ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_param_2_0= ruletff_atom ) ) (otherlv_3= ',' ( (lv_param_4_0= ruletff_atom ) ) )* otherlv_5= ')' )? )
                    {
                    // InternalTPTP.g:2047:3: ( ( ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_param_2_0= ruletff_atom ) ) (otherlv_3= ',' ( (lv_param_4_0= ruletff_atom ) ) )* otherlv_5= ')' )? )
                    // InternalTPTP.g:2048:4: ( ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_param_2_0= ruletff_atom ) ) (otherlv_3= ',' ( (lv_param_4_0= ruletff_atom ) ) )* otherlv_5= ')' )?
                    {
                    // InternalTPTP.g:2048:4: ( ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) )
                    // InternalTPTP.g:2049:5: ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) )
                    {
                    // InternalTPTP.g:2049:5: ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) )
                    // InternalTPTP.g:2050:6: (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING )
                    {
                    // InternalTPTP.g:2050:6: (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==RULE_LOWER_TOKEN||(LA38_0>=17 && LA38_0<=22)||LA38_0==34||LA38_0==67) ) {
                        alt38=1;
                    }
                    else if ( (LA38_0==RULE_STRING) ) {
                        alt38=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalTPTP.g:2051:7: lv_name_0_1= rulelower_token_and_keyword
                            {

                            							newCompositeNode(grammarAccess.getTff_constantAccess().getNameLower_token_and_keywordParserRuleCall_0_0_0_0());
                            						
                            pushFollow(FOLLOW_16);
                            lv_name_0_1=rulelower_token_and_keyword();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getTff_constantRule());
                            							}
                            							set(
                            								current,
                            								"name",
                            								lv_name_0_1,
                            								"it.unibz.inf.tptp.TPTP.lower_token_and_keyword");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalTPTP.g:2067:7: lv_name_0_2= RULE_STRING
                            {
                            lv_name_0_2=(Token)match(input,RULE_STRING,FOLLOW_16); 

                            							newLeafNode(lv_name_0_2, grammarAccess.getTff_constantAccess().getNameSTRINGTerminalRuleCall_0_0_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTff_constantRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"name",
                            								lv_name_0_2,
                            								"it.unibz.inf.tptp.TPTP.STRING");
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalTPTP.g:2084:4: (otherlv_1= '(' ( (lv_param_2_0= ruletff_atom ) ) (otherlv_3= ',' ( (lv_param_4_0= ruletff_atom ) ) )* otherlv_5= ')' )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==23) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalTPTP.g:2085:5: otherlv_1= '(' ( (lv_param_2_0= ruletff_atom ) ) (otherlv_3= ',' ( (lv_param_4_0= ruletff_atom ) ) )* otherlv_5= ')'
                            {
                            otherlv_1=(Token)match(input,23,FOLLOW_30); 

                            					newLeafNode(otherlv_1, grammarAccess.getTff_constantAccess().getLeftParenthesisKeyword_0_1_0());
                            				
                            // InternalTPTP.g:2089:5: ( (lv_param_2_0= ruletff_atom ) )
                            // InternalTPTP.g:2090:6: (lv_param_2_0= ruletff_atom )
                            {
                            // InternalTPTP.g:2090:6: (lv_param_2_0= ruletff_atom )
                            // InternalTPTP.g:2091:7: lv_param_2_0= ruletff_atom
                            {

                            							newCompositeNode(grammarAccess.getTff_constantAccess().getParamTff_atomParserRuleCall_0_1_1_0());
                            						
                            pushFollow(FOLLOW_18);
                            lv_param_2_0=ruletff_atom();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getTff_constantRule());
                            							}
                            							add(
                            								current,
                            								"param",
                            								lv_param_2_0,
                            								"it.unibz.inf.tptp.TPTP.tff_atom");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalTPTP.g:2108:5: (otherlv_3= ',' ( (lv_param_4_0= ruletff_atom ) ) )*
                            loop39:
                            do {
                                int alt39=2;
                                int LA39_0 = input.LA(1);

                                if ( (LA39_0==16) ) {
                                    alt39=1;
                                }


                                switch (alt39) {
                            	case 1 :
                            	    // InternalTPTP.g:2109:6: otherlv_3= ',' ( (lv_param_4_0= ruletff_atom ) )
                            	    {
                            	    otherlv_3=(Token)match(input,16,FOLLOW_30); 

                            	    						newLeafNode(otherlv_3, grammarAccess.getTff_constantAccess().getCommaKeyword_0_1_2_0());
                            	    					
                            	    // InternalTPTP.g:2113:6: ( (lv_param_4_0= ruletff_atom ) )
                            	    // InternalTPTP.g:2114:7: (lv_param_4_0= ruletff_atom )
                            	    {
                            	    // InternalTPTP.g:2114:7: (lv_param_4_0= ruletff_atom )
                            	    // InternalTPTP.g:2115:8: lv_param_4_0= ruletff_atom
                            	    {

                            	    								newCompositeNode(grammarAccess.getTff_constantAccess().getParamTff_atomParserRuleCall_0_1_2_1_0());
                            	    							
                            	    pushFollow(FOLLOW_18);
                            	    lv_param_4_0=ruletff_atom();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getTff_constantRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"param",
                            	    									lv_param_4_0,
                            	    									"it.unibz.inf.tptp.TPTP.tff_atom");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop39;
                                }
                            } while (true);

                            otherlv_5=(Token)match(input,24,FOLLOW_2); 

                            					newLeafNode(otherlv_5, grammarAccess.getTff_constantAccess().getRightParenthesisKeyword_0_1_3());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTPTP.g:2140:3: ( ( (lv_top_6_0= rulelower_token_and_keyword ) ) ( (lv_name_7_0= '/' ) ) ( (lv_bottom_8_0= rulelower_token_and_keyword ) ) )
                    {
                    // InternalTPTP.g:2140:3: ( ( (lv_top_6_0= rulelower_token_and_keyword ) ) ( (lv_name_7_0= '/' ) ) ( (lv_bottom_8_0= rulelower_token_and_keyword ) ) )
                    // InternalTPTP.g:2141:4: ( (lv_top_6_0= rulelower_token_and_keyword ) ) ( (lv_name_7_0= '/' ) ) ( (lv_bottom_8_0= rulelower_token_and_keyword ) )
                    {
                    // InternalTPTP.g:2141:4: ( (lv_top_6_0= rulelower_token_and_keyword ) )
                    // InternalTPTP.g:2142:5: (lv_top_6_0= rulelower_token_and_keyword )
                    {
                    // InternalTPTP.g:2142:5: (lv_top_6_0= rulelower_token_and_keyword )
                    // InternalTPTP.g:2143:6: lv_top_6_0= rulelower_token_and_keyword
                    {

                    						newCompositeNode(grammarAccess.getTff_constantAccess().getTopLower_token_and_keywordParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_top_6_0=rulelower_token_and_keyword();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTff_constantRule());
                    						}
                    						set(
                    							current,
                    							"top",
                    							lv_top_6_0,
                    							"it.unibz.inf.tptp.TPTP.lower_token_and_keyword");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTPTP.g:2160:4: ( (lv_name_7_0= '/' ) )
                    // InternalTPTP.g:2161:5: (lv_name_7_0= '/' )
                    {
                    // InternalTPTP.g:2161:5: (lv_name_7_0= '/' )
                    // InternalTPTP.g:2162:6: lv_name_7_0= '/'
                    {
                    lv_name_7_0=(Token)match(input,43,FOLLOW_32); 

                    						newLeafNode(lv_name_7_0, grammarAccess.getTff_constantAccess().getNameSolidusKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_constantRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_7_0, "/");
                    					

                    }


                    }

                    // InternalTPTP.g:2174:4: ( (lv_bottom_8_0= rulelower_token_and_keyword ) )
                    // InternalTPTP.g:2175:5: (lv_bottom_8_0= rulelower_token_and_keyword )
                    {
                    // InternalTPTP.g:2175:5: (lv_bottom_8_0= rulelower_token_and_keyword )
                    // InternalTPTP.g:2176:6: lv_bottom_8_0= rulelower_token_and_keyword
                    {

                    						newCompositeNode(grammarAccess.getTff_constantAccess().getBottomLower_token_and_keywordParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_bottom_8_0=rulelower_token_and_keyword();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTff_constantRule());
                    						}
                    						set(
                    							current,
                    							"bottom",
                    							lv_bottom_8_0,
                    							"it.unibz.inf.tptp.TPTP.lower_token_and_keyword");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletff_constant"


    // $ANTLR start "entryRuletff_atom_literal"
    // InternalTPTP.g:2198:1: entryRuletff_atom_literal returns [EObject current=null] : iv_ruletff_atom_literal= ruletff_atom_literal EOF ;
    public final EObject entryRuletff_atom_literal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletff_atom_literal = null;


        try {
            // InternalTPTP.g:2198:57: (iv_ruletff_atom_literal= ruletff_atom_literal EOF )
            // InternalTPTP.g:2199:2: iv_ruletff_atom_literal= ruletff_atom_literal EOF
            {
             newCompositeNode(grammarAccess.getTff_atom_literalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletff_atom_literal=ruletff_atom_literal();

            state._fsp--;

             current =iv_ruletff_atom_literal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletff_atom_literal"


    // $ANTLR start "ruletff_atom_literal"
    // InternalTPTP.g:2205:1: ruletff_atom_literal returns [EObject current=null] : ( ( (lv_name_0_1= '$true' | lv_name_0_2= '$false' ) ) ) ;
    public final EObject ruletff_atom_literal() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;


        	enterRule();

        try {
            // InternalTPTP.g:2211:2: ( ( ( (lv_name_0_1= '$true' | lv_name_0_2= '$false' ) ) ) )
            // InternalTPTP.g:2212:2: ( ( (lv_name_0_1= '$true' | lv_name_0_2= '$false' ) ) )
            {
            // InternalTPTP.g:2212:2: ( ( (lv_name_0_1= '$true' | lv_name_0_2= '$false' ) ) )
            // InternalTPTP.g:2213:3: ( (lv_name_0_1= '$true' | lv_name_0_2= '$false' ) )
            {
            // InternalTPTP.g:2213:3: ( (lv_name_0_1= '$true' | lv_name_0_2= '$false' ) )
            // InternalTPTP.g:2214:4: (lv_name_0_1= '$true' | lv_name_0_2= '$false' )
            {
            // InternalTPTP.g:2214:4: (lv_name_0_1= '$true' | lv_name_0_2= '$false' )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==26) ) {
                alt42=1;
            }
            else if ( (LA42_0==27) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalTPTP.g:2215:5: lv_name_0_1= '$true'
                    {
                    lv_name_0_1=(Token)match(input,26,FOLLOW_2); 

                    					newLeafNode(lv_name_0_1, grammarAccess.getTff_atom_literalAccess().getNameTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTff_atom_literalRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:2226:5: lv_name_0_2= '$false'
                    {
                    lv_name_0_2=(Token)match(input,27,FOLLOW_2); 

                    					newLeafNode(lv_name_0_2, grammarAccess.getTff_atom_literalAccess().getNameFalseKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTff_atom_literalRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_2, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletff_atom_literal"


    // $ANTLR start "entryRuletff_predefined_function_1_args"
    // InternalTPTP.g:2242:1: entryRuletff_predefined_function_1_args returns [EObject current=null] : iv_ruletff_predefined_function_1_args= ruletff_predefined_function_1_args EOF ;
    public final EObject entryRuletff_predefined_function_1_args() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletff_predefined_function_1_args = null;


        try {
            // InternalTPTP.g:2242:71: (iv_ruletff_predefined_function_1_args= ruletff_predefined_function_1_args EOF )
            // InternalTPTP.g:2243:2: iv_ruletff_predefined_function_1_args= ruletff_predefined_function_1_args EOF
            {
             newCompositeNode(grammarAccess.getTff_predefined_function_1_argsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletff_predefined_function_1_args=ruletff_predefined_function_1_args();

            state._fsp--;

             current =iv_ruletff_predefined_function_1_args; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletff_predefined_function_1_args"


    // $ANTLR start "ruletff_predefined_function_1_args"
    // InternalTPTP.g:2249:1: ruletff_predefined_function_1_args returns [EObject current=null] : ( ( ( (lv_name_0_1= '$is_int' | lv_name_0_2= '$is_rat' | lv_name_0_3= '$uminus' | lv_name_0_4= '$to_int' | lv_name_0_5= '$to_rat' | lv_name_0_6= '$to_real' ) ) ) otherlv_1= '(' ( (lv_param_2_0= ruletff_expression ) ) otherlv_3= ')' ) ;
    public final EObject ruletff_predefined_function_1_args() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token lv_name_0_4=null;
        Token lv_name_0_5=null;
        Token lv_name_0_6=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_param_2_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:2255:2: ( ( ( ( (lv_name_0_1= '$is_int' | lv_name_0_2= '$is_rat' | lv_name_0_3= '$uminus' | lv_name_0_4= '$to_int' | lv_name_0_5= '$to_rat' | lv_name_0_6= '$to_real' ) ) ) otherlv_1= '(' ( (lv_param_2_0= ruletff_expression ) ) otherlv_3= ')' ) )
            // InternalTPTP.g:2256:2: ( ( ( (lv_name_0_1= '$is_int' | lv_name_0_2= '$is_rat' | lv_name_0_3= '$uminus' | lv_name_0_4= '$to_int' | lv_name_0_5= '$to_rat' | lv_name_0_6= '$to_real' ) ) ) otherlv_1= '(' ( (lv_param_2_0= ruletff_expression ) ) otherlv_3= ')' )
            {
            // InternalTPTP.g:2256:2: ( ( ( (lv_name_0_1= '$is_int' | lv_name_0_2= '$is_rat' | lv_name_0_3= '$uminus' | lv_name_0_4= '$to_int' | lv_name_0_5= '$to_rat' | lv_name_0_6= '$to_real' ) ) ) otherlv_1= '(' ( (lv_param_2_0= ruletff_expression ) ) otherlv_3= ')' )
            // InternalTPTP.g:2257:3: ( ( (lv_name_0_1= '$is_int' | lv_name_0_2= '$is_rat' | lv_name_0_3= '$uminus' | lv_name_0_4= '$to_int' | lv_name_0_5= '$to_rat' | lv_name_0_6= '$to_real' ) ) ) otherlv_1= '(' ( (lv_param_2_0= ruletff_expression ) ) otherlv_3= ')'
            {
            // InternalTPTP.g:2257:3: ( ( (lv_name_0_1= '$is_int' | lv_name_0_2= '$is_rat' | lv_name_0_3= '$uminus' | lv_name_0_4= '$to_int' | lv_name_0_5= '$to_rat' | lv_name_0_6= '$to_real' ) ) )
            // InternalTPTP.g:2258:4: ( (lv_name_0_1= '$is_int' | lv_name_0_2= '$is_rat' | lv_name_0_3= '$uminus' | lv_name_0_4= '$to_int' | lv_name_0_5= '$to_rat' | lv_name_0_6= '$to_real' ) )
            {
            // InternalTPTP.g:2258:4: ( (lv_name_0_1= '$is_int' | lv_name_0_2= '$is_rat' | lv_name_0_3= '$uminus' | lv_name_0_4= '$to_int' | lv_name_0_5= '$to_rat' | lv_name_0_6= '$to_real' ) )
            // InternalTPTP.g:2259:5: (lv_name_0_1= '$is_int' | lv_name_0_2= '$is_rat' | lv_name_0_3= '$uminus' | lv_name_0_4= '$to_int' | lv_name_0_5= '$to_rat' | lv_name_0_6= '$to_real' )
            {
            // InternalTPTP.g:2259:5: (lv_name_0_1= '$is_int' | lv_name_0_2= '$is_rat' | lv_name_0_3= '$uminus' | lv_name_0_4= '$to_int' | lv_name_0_5= '$to_rat' | lv_name_0_6= '$to_real' )
            int alt43=6;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt43=1;
                }
                break;
            case 45:
                {
                alt43=2;
                }
                break;
            case 46:
                {
                alt43=3;
                }
                break;
            case 47:
                {
                alt43=4;
                }
                break;
            case 48:
                {
                alt43=5;
                }
                break;
            case 49:
                {
                alt43=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalTPTP.g:2260:6: lv_name_0_1= '$is_int'
                    {
                    lv_name_0_1=(Token)match(input,44,FOLLOW_33); 

                    						newLeafNode(lv_name_0_1, grammarAccess.getTff_predefined_function_1_argsAccess().getNameIs_intKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_predefined_function_1_argsRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:2271:6: lv_name_0_2= '$is_rat'
                    {
                    lv_name_0_2=(Token)match(input,45,FOLLOW_33); 

                    						newLeafNode(lv_name_0_2, grammarAccess.getTff_predefined_function_1_argsAccess().getNameIs_ratKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_predefined_function_1_argsRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalTPTP.g:2282:6: lv_name_0_3= '$uminus'
                    {
                    lv_name_0_3=(Token)match(input,46,FOLLOW_33); 

                    						newLeafNode(lv_name_0_3, grammarAccess.getTff_predefined_function_1_argsAccess().getNameUminusKeyword_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_predefined_function_1_argsRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_0_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalTPTP.g:2293:6: lv_name_0_4= '$to_int'
                    {
                    lv_name_0_4=(Token)match(input,47,FOLLOW_33); 

                    						newLeafNode(lv_name_0_4, grammarAccess.getTff_predefined_function_1_argsAccess().getNameTo_intKeyword_0_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_predefined_function_1_argsRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_0_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalTPTP.g:2304:6: lv_name_0_5= '$to_rat'
                    {
                    lv_name_0_5=(Token)match(input,48,FOLLOW_33); 

                    						newLeafNode(lv_name_0_5, grammarAccess.getTff_predefined_function_1_argsAccess().getNameTo_ratKeyword_0_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_predefined_function_1_argsRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_0_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalTPTP.g:2315:6: lv_name_0_6= '$to_real'
                    {
                    lv_name_0_6=(Token)match(input,49,FOLLOW_33); 

                    						newLeafNode(lv_name_0_6, grammarAccess.getTff_predefined_function_1_argsAccess().getNameTo_realKeyword_0_0_5());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_predefined_function_1_argsRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_0_6, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getTff_predefined_function_1_argsAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTPTP.g:2332:3: ( (lv_param_2_0= ruletff_expression ) )
            // InternalTPTP.g:2333:4: (lv_param_2_0= ruletff_expression )
            {
            // InternalTPTP.g:2333:4: (lv_param_2_0= ruletff_expression )
            // InternalTPTP.g:2334:5: lv_param_2_0= ruletff_expression
            {

            					newCompositeNode(grammarAccess.getTff_predefined_function_1_argsAccess().getParamTff_expressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_param_2_0=ruletff_expression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTff_predefined_function_1_argsRule());
            					}
            					add(
            						current,
            						"param",
            						lv_param_2_0,
            						"it.unibz.inf.tptp.TPTP.tff_expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTff_predefined_function_1_argsAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletff_predefined_function_1_args"


    // $ANTLR start "entryRuletff_predefined_function_2_args"
    // InternalTPTP.g:2359:1: entryRuletff_predefined_function_2_args returns [EObject current=null] : iv_ruletff_predefined_function_2_args= ruletff_predefined_function_2_args EOF ;
    public final EObject entryRuletff_predefined_function_2_args() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletff_predefined_function_2_args = null;


        try {
            // InternalTPTP.g:2359:71: (iv_ruletff_predefined_function_2_args= ruletff_predefined_function_2_args EOF )
            // InternalTPTP.g:2360:2: iv_ruletff_predefined_function_2_args= ruletff_predefined_function_2_args EOF
            {
             newCompositeNode(grammarAccess.getTff_predefined_function_2_argsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletff_predefined_function_2_args=ruletff_predefined_function_2_args();

            state._fsp--;

             current =iv_ruletff_predefined_function_2_args; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletff_predefined_function_2_args"


    // $ANTLR start "ruletff_predefined_function_2_args"
    // InternalTPTP.g:2366:1: ruletff_predefined_function_2_args returns [EObject current=null] : ( ( ( (lv_func_0_1= '$less' | lv_func_0_2= '$sum' | lv_func_0_3= '$difference' | lv_func_0_4= '$product' | lv_func_0_5= '$quotient' | lv_func_0_6= '$quotient_e' | lv_func_0_7= '$quotient_t' | lv_func_0_8= '$quotient_f' | lv_func_0_9= '$remainder_e' | lv_func_0_10= '$remainder_t' | lv_func_0_11= '$remainder_f' | lv_func_0_12= '$greatereq' | lv_func_0_13= '$lesseq' | lv_func_0_14= '$greater' | lv_func_0_15= '$eq' ) ) ) otherlv_1= '(' ( (lv_param_2_0= ruletff_expression ) ) otherlv_3= ',' ( (lv_param_4_0= ruletff_expression ) ) otherlv_5= ')' ) ;
    public final EObject ruletff_predefined_function_2_args() throws RecognitionException {
        EObject current = null;

        Token lv_func_0_1=null;
        Token lv_func_0_2=null;
        Token lv_func_0_3=null;
        Token lv_func_0_4=null;
        Token lv_func_0_5=null;
        Token lv_func_0_6=null;
        Token lv_func_0_7=null;
        Token lv_func_0_8=null;
        Token lv_func_0_9=null;
        Token lv_func_0_10=null;
        Token lv_func_0_11=null;
        Token lv_func_0_12=null;
        Token lv_func_0_13=null;
        Token lv_func_0_14=null;
        Token lv_func_0_15=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_param_2_0 = null;

        EObject lv_param_4_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:2372:2: ( ( ( ( (lv_func_0_1= '$less' | lv_func_0_2= '$sum' | lv_func_0_3= '$difference' | lv_func_0_4= '$product' | lv_func_0_5= '$quotient' | lv_func_0_6= '$quotient_e' | lv_func_0_7= '$quotient_t' | lv_func_0_8= '$quotient_f' | lv_func_0_9= '$remainder_e' | lv_func_0_10= '$remainder_t' | lv_func_0_11= '$remainder_f' | lv_func_0_12= '$greatereq' | lv_func_0_13= '$lesseq' | lv_func_0_14= '$greater' | lv_func_0_15= '$eq' ) ) ) otherlv_1= '(' ( (lv_param_2_0= ruletff_expression ) ) otherlv_3= ',' ( (lv_param_4_0= ruletff_expression ) ) otherlv_5= ')' ) )
            // InternalTPTP.g:2373:2: ( ( ( (lv_func_0_1= '$less' | lv_func_0_2= '$sum' | lv_func_0_3= '$difference' | lv_func_0_4= '$product' | lv_func_0_5= '$quotient' | lv_func_0_6= '$quotient_e' | lv_func_0_7= '$quotient_t' | lv_func_0_8= '$quotient_f' | lv_func_0_9= '$remainder_e' | lv_func_0_10= '$remainder_t' | lv_func_0_11= '$remainder_f' | lv_func_0_12= '$greatereq' | lv_func_0_13= '$lesseq' | lv_func_0_14= '$greater' | lv_func_0_15= '$eq' ) ) ) otherlv_1= '(' ( (lv_param_2_0= ruletff_expression ) ) otherlv_3= ',' ( (lv_param_4_0= ruletff_expression ) ) otherlv_5= ')' )
            {
            // InternalTPTP.g:2373:2: ( ( ( (lv_func_0_1= '$less' | lv_func_0_2= '$sum' | lv_func_0_3= '$difference' | lv_func_0_4= '$product' | lv_func_0_5= '$quotient' | lv_func_0_6= '$quotient_e' | lv_func_0_7= '$quotient_t' | lv_func_0_8= '$quotient_f' | lv_func_0_9= '$remainder_e' | lv_func_0_10= '$remainder_t' | lv_func_0_11= '$remainder_f' | lv_func_0_12= '$greatereq' | lv_func_0_13= '$lesseq' | lv_func_0_14= '$greater' | lv_func_0_15= '$eq' ) ) ) otherlv_1= '(' ( (lv_param_2_0= ruletff_expression ) ) otherlv_3= ',' ( (lv_param_4_0= ruletff_expression ) ) otherlv_5= ')' )
            // InternalTPTP.g:2374:3: ( ( (lv_func_0_1= '$less' | lv_func_0_2= '$sum' | lv_func_0_3= '$difference' | lv_func_0_4= '$product' | lv_func_0_5= '$quotient' | lv_func_0_6= '$quotient_e' | lv_func_0_7= '$quotient_t' | lv_func_0_8= '$quotient_f' | lv_func_0_9= '$remainder_e' | lv_func_0_10= '$remainder_t' | lv_func_0_11= '$remainder_f' | lv_func_0_12= '$greatereq' | lv_func_0_13= '$lesseq' | lv_func_0_14= '$greater' | lv_func_0_15= '$eq' ) ) ) otherlv_1= '(' ( (lv_param_2_0= ruletff_expression ) ) otherlv_3= ',' ( (lv_param_4_0= ruletff_expression ) ) otherlv_5= ')'
            {
            // InternalTPTP.g:2374:3: ( ( (lv_func_0_1= '$less' | lv_func_0_2= '$sum' | lv_func_0_3= '$difference' | lv_func_0_4= '$product' | lv_func_0_5= '$quotient' | lv_func_0_6= '$quotient_e' | lv_func_0_7= '$quotient_t' | lv_func_0_8= '$quotient_f' | lv_func_0_9= '$remainder_e' | lv_func_0_10= '$remainder_t' | lv_func_0_11= '$remainder_f' | lv_func_0_12= '$greatereq' | lv_func_0_13= '$lesseq' | lv_func_0_14= '$greater' | lv_func_0_15= '$eq' ) ) )
            // InternalTPTP.g:2375:4: ( (lv_func_0_1= '$less' | lv_func_0_2= '$sum' | lv_func_0_3= '$difference' | lv_func_0_4= '$product' | lv_func_0_5= '$quotient' | lv_func_0_6= '$quotient_e' | lv_func_0_7= '$quotient_t' | lv_func_0_8= '$quotient_f' | lv_func_0_9= '$remainder_e' | lv_func_0_10= '$remainder_t' | lv_func_0_11= '$remainder_f' | lv_func_0_12= '$greatereq' | lv_func_0_13= '$lesseq' | lv_func_0_14= '$greater' | lv_func_0_15= '$eq' ) )
            {
            // InternalTPTP.g:2375:4: ( (lv_func_0_1= '$less' | lv_func_0_2= '$sum' | lv_func_0_3= '$difference' | lv_func_0_4= '$product' | lv_func_0_5= '$quotient' | lv_func_0_6= '$quotient_e' | lv_func_0_7= '$quotient_t' | lv_func_0_8= '$quotient_f' | lv_func_0_9= '$remainder_e' | lv_func_0_10= '$remainder_t' | lv_func_0_11= '$remainder_f' | lv_func_0_12= '$greatereq' | lv_func_0_13= '$lesseq' | lv_func_0_14= '$greater' | lv_func_0_15= '$eq' ) )
            // InternalTPTP.g:2376:5: (lv_func_0_1= '$less' | lv_func_0_2= '$sum' | lv_func_0_3= '$difference' | lv_func_0_4= '$product' | lv_func_0_5= '$quotient' | lv_func_0_6= '$quotient_e' | lv_func_0_7= '$quotient_t' | lv_func_0_8= '$quotient_f' | lv_func_0_9= '$remainder_e' | lv_func_0_10= '$remainder_t' | lv_func_0_11= '$remainder_f' | lv_func_0_12= '$greatereq' | lv_func_0_13= '$lesseq' | lv_func_0_14= '$greater' | lv_func_0_15= '$eq' )
            {
            // InternalTPTP.g:2376:5: (lv_func_0_1= '$less' | lv_func_0_2= '$sum' | lv_func_0_3= '$difference' | lv_func_0_4= '$product' | lv_func_0_5= '$quotient' | lv_func_0_6= '$quotient_e' | lv_func_0_7= '$quotient_t' | lv_func_0_8= '$quotient_f' | lv_func_0_9= '$remainder_e' | lv_func_0_10= '$remainder_t' | lv_func_0_11= '$remainder_f' | lv_func_0_12= '$greatereq' | lv_func_0_13= '$lesseq' | lv_func_0_14= '$greater' | lv_func_0_15= '$eq' )
            int alt44=15;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt44=1;
                }
                break;
            case 51:
                {
                alt44=2;
                }
                break;
            case 52:
                {
                alt44=3;
                }
                break;
            case 53:
                {
                alt44=4;
                }
                break;
            case 54:
                {
                alt44=5;
                }
                break;
            case 55:
                {
                alt44=6;
                }
                break;
            case 56:
                {
                alt44=7;
                }
                break;
            case 57:
                {
                alt44=8;
                }
                break;
            case 58:
                {
                alt44=9;
                }
                break;
            case 59:
                {
                alt44=10;
                }
                break;
            case 60:
                {
                alt44=11;
                }
                break;
            case 61:
                {
                alt44=12;
                }
                break;
            case 62:
                {
                alt44=13;
                }
                break;
            case 63:
                {
                alt44=14;
                }
                break;
            case 64:
                {
                alt44=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalTPTP.g:2377:6: lv_func_0_1= '$less'
                    {
                    lv_func_0_1=(Token)match(input,50,FOLLOW_33); 

                    						newLeafNode(lv_func_0_1, grammarAccess.getTff_predefined_function_2_argsAccess().getFuncLessKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_predefined_function_2_argsRule());
                    						}
                    						setWithLastConsumed(current, "func", lv_func_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:2388:6: lv_func_0_2= '$sum'
                    {
                    lv_func_0_2=(Token)match(input,51,FOLLOW_33); 

                    						newLeafNode(lv_func_0_2, grammarAccess.getTff_predefined_function_2_argsAccess().getFuncSumKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_predefined_function_2_argsRule());
                    						}
                    						setWithLastConsumed(current, "func", lv_func_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalTPTP.g:2399:6: lv_func_0_3= '$difference'
                    {
                    lv_func_0_3=(Token)match(input,52,FOLLOW_33); 

                    						newLeafNode(lv_func_0_3, grammarAccess.getTff_predefined_function_2_argsAccess().getFuncDifferenceKeyword_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_predefined_function_2_argsRule());
                    						}
                    						setWithLastConsumed(current, "func", lv_func_0_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalTPTP.g:2410:6: lv_func_0_4= '$product'
                    {
                    lv_func_0_4=(Token)match(input,53,FOLLOW_33); 

                    						newLeafNode(lv_func_0_4, grammarAccess.getTff_predefined_function_2_argsAccess().getFuncProductKeyword_0_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_predefined_function_2_argsRule());
                    						}
                    						setWithLastConsumed(current, "func", lv_func_0_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalTPTP.g:2421:6: lv_func_0_5= '$quotient'
                    {
                    lv_func_0_5=(Token)match(input,54,FOLLOW_33); 

                    						newLeafNode(lv_func_0_5, grammarAccess.getTff_predefined_function_2_argsAccess().getFuncQuotientKeyword_0_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_predefined_function_2_argsRule());
                    						}
                    						setWithLastConsumed(current, "func", lv_func_0_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalTPTP.g:2432:6: lv_func_0_6= '$quotient_e'
                    {
                    lv_func_0_6=(Token)match(input,55,FOLLOW_33); 

                    						newLeafNode(lv_func_0_6, grammarAccess.getTff_predefined_function_2_argsAccess().getFuncQuotient_eKeyword_0_0_5());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_predefined_function_2_argsRule());
                    						}
                    						setWithLastConsumed(current, "func", lv_func_0_6, null);
                    					

                    }
                    break;
                case 7 :
                    // InternalTPTP.g:2443:6: lv_func_0_7= '$quotient_t'
                    {
                    lv_func_0_7=(Token)match(input,56,FOLLOW_33); 

                    						newLeafNode(lv_func_0_7, grammarAccess.getTff_predefined_function_2_argsAccess().getFuncQuotient_tKeyword_0_0_6());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_predefined_function_2_argsRule());
                    						}
                    						setWithLastConsumed(current, "func", lv_func_0_7, null);
                    					

                    }
                    break;
                case 8 :
                    // InternalTPTP.g:2454:6: lv_func_0_8= '$quotient_f'
                    {
                    lv_func_0_8=(Token)match(input,57,FOLLOW_33); 

                    						newLeafNode(lv_func_0_8, grammarAccess.getTff_predefined_function_2_argsAccess().getFuncQuotient_fKeyword_0_0_7());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_predefined_function_2_argsRule());
                    						}
                    						setWithLastConsumed(current, "func", lv_func_0_8, null);
                    					

                    }
                    break;
                case 9 :
                    // InternalTPTP.g:2465:6: lv_func_0_9= '$remainder_e'
                    {
                    lv_func_0_9=(Token)match(input,58,FOLLOW_33); 

                    						newLeafNode(lv_func_0_9, grammarAccess.getTff_predefined_function_2_argsAccess().getFuncRemainder_eKeyword_0_0_8());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_predefined_function_2_argsRule());
                    						}
                    						setWithLastConsumed(current, "func", lv_func_0_9, null);
                    					

                    }
                    break;
                case 10 :
                    // InternalTPTP.g:2476:6: lv_func_0_10= '$remainder_t'
                    {
                    lv_func_0_10=(Token)match(input,59,FOLLOW_33); 

                    						newLeafNode(lv_func_0_10, grammarAccess.getTff_predefined_function_2_argsAccess().getFuncRemainder_tKeyword_0_0_9());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_predefined_function_2_argsRule());
                    						}
                    						setWithLastConsumed(current, "func", lv_func_0_10, null);
                    					

                    }
                    break;
                case 11 :
                    // InternalTPTP.g:2487:6: lv_func_0_11= '$remainder_f'
                    {
                    lv_func_0_11=(Token)match(input,60,FOLLOW_33); 

                    						newLeafNode(lv_func_0_11, grammarAccess.getTff_predefined_function_2_argsAccess().getFuncRemainder_fKeyword_0_0_10());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_predefined_function_2_argsRule());
                    						}
                    						setWithLastConsumed(current, "func", lv_func_0_11, null);
                    					

                    }
                    break;
                case 12 :
                    // InternalTPTP.g:2498:6: lv_func_0_12= '$greatereq'
                    {
                    lv_func_0_12=(Token)match(input,61,FOLLOW_33); 

                    						newLeafNode(lv_func_0_12, grammarAccess.getTff_predefined_function_2_argsAccess().getFuncGreatereqKeyword_0_0_11());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_predefined_function_2_argsRule());
                    						}
                    						setWithLastConsumed(current, "func", lv_func_0_12, null);
                    					

                    }
                    break;
                case 13 :
                    // InternalTPTP.g:2509:6: lv_func_0_13= '$lesseq'
                    {
                    lv_func_0_13=(Token)match(input,62,FOLLOW_33); 

                    						newLeafNode(lv_func_0_13, grammarAccess.getTff_predefined_function_2_argsAccess().getFuncLesseqKeyword_0_0_12());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_predefined_function_2_argsRule());
                    						}
                    						setWithLastConsumed(current, "func", lv_func_0_13, null);
                    					

                    }
                    break;
                case 14 :
                    // InternalTPTP.g:2520:6: lv_func_0_14= '$greater'
                    {
                    lv_func_0_14=(Token)match(input,63,FOLLOW_33); 

                    						newLeafNode(lv_func_0_14, grammarAccess.getTff_predefined_function_2_argsAccess().getFuncGreaterKeyword_0_0_13());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_predefined_function_2_argsRule());
                    						}
                    						setWithLastConsumed(current, "func", lv_func_0_14, null);
                    					

                    }
                    break;
                case 15 :
                    // InternalTPTP.g:2531:6: lv_func_0_15= '$eq'
                    {
                    lv_func_0_15=(Token)match(input,64,FOLLOW_33); 

                    						newLeafNode(lv_func_0_15, grammarAccess.getTff_predefined_function_2_argsAccess().getFuncEqKeyword_0_0_14());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_predefined_function_2_argsRule());
                    						}
                    						setWithLastConsumed(current, "func", lv_func_0_15, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getTff_predefined_function_2_argsAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTPTP.g:2548:3: ( (lv_param_2_0= ruletff_expression ) )
            // InternalTPTP.g:2549:4: (lv_param_2_0= ruletff_expression )
            {
            // InternalTPTP.g:2549:4: (lv_param_2_0= ruletff_expression )
            // InternalTPTP.g:2550:5: lv_param_2_0= ruletff_expression
            {

            					newCompositeNode(grammarAccess.getTff_predefined_function_2_argsAccess().getParamTff_expressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_param_2_0=ruletff_expression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTff_predefined_function_2_argsRule());
            					}
            					add(
            						current,
            						"param",
            						lv_param_2_0,
            						"it.unibz.inf.tptp.TPTP.tff_expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getTff_predefined_function_2_argsAccess().getCommaKeyword_3());
            		
            // InternalTPTP.g:2571:3: ( (lv_param_4_0= ruletff_expression ) )
            // InternalTPTP.g:2572:4: (lv_param_4_0= ruletff_expression )
            {
            // InternalTPTP.g:2572:4: (lv_param_4_0= ruletff_expression )
            // InternalTPTP.g:2573:5: lv_param_4_0= ruletff_expression
            {

            					newCompositeNode(grammarAccess.getTff_predefined_function_2_argsAccess().getParamTff_expressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
            lv_param_4_0=ruletff_expression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTff_predefined_function_2_argsRule());
            					}
            					add(
            						current,
            						"param",
            						lv_param_4_0,
            						"it.unibz.inf.tptp.TPTP.tff_expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTff_predefined_function_2_argsAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletff_predefined_function_2_args"


    // $ANTLR start "entryRuletff_var"
    // InternalTPTP.g:2598:1: entryRuletff_var returns [EObject current=null] : iv_ruletff_var= ruletff_var EOF ;
    public final EObject entryRuletff_var() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletff_var = null;


        try {
            // InternalTPTP.g:2598:48: (iv_ruletff_var= ruletff_var EOF )
            // InternalTPTP.g:2599:2: iv_ruletff_var= ruletff_var EOF
            {
             newCompositeNode(grammarAccess.getTff_varRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletff_var=ruletff_var();

            state._fsp--;

             current =iv_ruletff_var; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletff_var"


    // $ANTLR start "ruletff_var"
    // InternalTPTP.g:2605:1: ruletff_var returns [EObject current=null] : ( (lv_name_0_0= RULE_UPPER_TOKEN ) ) ;
    public final EObject ruletff_var() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalTPTP.g:2611:2: ( ( (lv_name_0_0= RULE_UPPER_TOKEN ) ) )
            // InternalTPTP.g:2612:2: ( (lv_name_0_0= RULE_UPPER_TOKEN ) )
            {
            // InternalTPTP.g:2612:2: ( (lv_name_0_0= RULE_UPPER_TOKEN ) )
            // InternalTPTP.g:2613:3: (lv_name_0_0= RULE_UPPER_TOKEN )
            {
            // InternalTPTP.g:2613:3: (lv_name_0_0= RULE_UPPER_TOKEN )
            // InternalTPTP.g:2614:4: lv_name_0_0= RULE_UPPER_TOKEN
            {
            lv_name_0_0=(Token)match(input,RULE_UPPER_TOKEN,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getTff_varAccess().getNameUPPER_TOKENTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTff_varRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"it.unibz.inf.tptp.TPTP.UPPER_TOKEN");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletff_var"


    // $ANTLR start "entryRuletff_var_declaration"
    // InternalTPTP.g:2633:1: entryRuletff_var_declaration returns [EObject current=null] : iv_ruletff_var_declaration= ruletff_var_declaration EOF ;
    public final EObject entryRuletff_var_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletff_var_declaration = null;


        try {
            // InternalTPTP.g:2633:60: (iv_ruletff_var_declaration= ruletff_var_declaration EOF )
            // InternalTPTP.g:2634:2: iv_ruletff_var_declaration= ruletff_var_declaration EOF
            {
             newCompositeNode(grammarAccess.getTff_var_declarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletff_var_declaration=ruletff_var_declaration();

            state._fsp--;

             current =iv_ruletff_var_declaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletff_var_declaration"


    // $ANTLR start "ruletff_var_declaration"
    // InternalTPTP.g:2640:1: ruletff_var_declaration returns [EObject current=null] : ( ( (lv_var_0_0= ruletff_var ) ) otherlv_1= ':' ( (lv_vartype_2_0= ruletff_type_expression ) ) ) ;
    public final EObject ruletff_var_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_var_0_0 = null;

        EObject lv_vartype_2_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:2646:2: ( ( ( (lv_var_0_0= ruletff_var ) ) otherlv_1= ':' ( (lv_vartype_2_0= ruletff_type_expression ) ) ) )
            // InternalTPTP.g:2647:2: ( ( (lv_var_0_0= ruletff_var ) ) otherlv_1= ':' ( (lv_vartype_2_0= ruletff_type_expression ) ) )
            {
            // InternalTPTP.g:2647:2: ( ( (lv_var_0_0= ruletff_var ) ) otherlv_1= ':' ( (lv_vartype_2_0= ruletff_type_expression ) ) )
            // InternalTPTP.g:2648:3: ( (lv_var_0_0= ruletff_var ) ) otherlv_1= ':' ( (lv_vartype_2_0= ruletff_type_expression ) )
            {
            // InternalTPTP.g:2648:3: ( (lv_var_0_0= ruletff_var ) )
            // InternalTPTP.g:2649:4: (lv_var_0_0= ruletff_var )
            {
            // InternalTPTP.g:2649:4: (lv_var_0_0= ruletff_var )
            // InternalTPTP.g:2650:5: lv_var_0_0= ruletff_var
            {

            					newCompositeNode(grammarAccess.getTff_var_declarationAccess().getVarTff_varParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_22);
            lv_var_0_0=ruletff_var();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTff_var_declarationRule());
            					}
            					set(
            						current,
            						"var",
            						lv_var_0_0,
            						"it.unibz.inf.tptp.TPTP.tff_var");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getTff_var_declarationAccess().getColonKeyword_1());
            		
            // InternalTPTP.g:2671:3: ( (lv_vartype_2_0= ruletff_type_expression ) )
            // InternalTPTP.g:2672:4: (lv_vartype_2_0= ruletff_type_expression )
            {
            // InternalTPTP.g:2672:4: (lv_vartype_2_0= ruletff_type_expression )
            // InternalTPTP.g:2673:5: lv_vartype_2_0= ruletff_type_expression
            {

            					newCompositeNode(grammarAccess.getTff_var_declarationAccess().getVartypeTff_type_expressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_vartype_2_0=ruletff_type_expression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTff_var_declarationRule());
            					}
            					set(
            						current,
            						"vartype",
            						lv_vartype_2_0,
            						"it.unibz.inf.tptp.TPTP.tff_type_expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletff_var_declaration"


    // $ANTLR start "entryRuletff_quantifier_expression"
    // InternalTPTP.g:2694:1: entryRuletff_quantifier_expression returns [EObject current=null] : iv_ruletff_quantifier_expression= ruletff_quantifier_expression EOF ;
    public final EObject entryRuletff_quantifier_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletff_quantifier_expression = null;


        try {
            // InternalTPTP.g:2694:66: (iv_ruletff_quantifier_expression= ruletff_quantifier_expression EOF )
            // InternalTPTP.g:2695:2: iv_ruletff_quantifier_expression= ruletff_quantifier_expression EOF
            {
             newCompositeNode(grammarAccess.getTff_quantifier_expressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletff_quantifier_expression=ruletff_quantifier_expression();

            state._fsp--;

             current =iv_ruletff_quantifier_expression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletff_quantifier_expression"


    // $ANTLR start "ruletff_quantifier_expression"
    // InternalTPTP.g:2701:1: ruletff_quantifier_expression returns [EObject current=null] : ( ( ( (lv_quantifier_0_1= '!' | lv_quantifier_0_2= '?' ) ) ) otherlv_1= '[' ( (lv_param_2_0= ruletff_variable_list ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_exp_5_0= ruletff_expression ) ) ) ;
    public final EObject ruletff_quantifier_expression() throws RecognitionException {
        EObject current = null;

        Token lv_quantifier_0_1=null;
        Token lv_quantifier_0_2=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_param_2_0 = null;

        EObject lv_exp_5_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:2707:2: ( ( ( ( (lv_quantifier_0_1= '!' | lv_quantifier_0_2= '?' ) ) ) otherlv_1= '[' ( (lv_param_2_0= ruletff_variable_list ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_exp_5_0= ruletff_expression ) ) ) )
            // InternalTPTP.g:2708:2: ( ( ( (lv_quantifier_0_1= '!' | lv_quantifier_0_2= '?' ) ) ) otherlv_1= '[' ( (lv_param_2_0= ruletff_variable_list ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_exp_5_0= ruletff_expression ) ) )
            {
            // InternalTPTP.g:2708:2: ( ( ( (lv_quantifier_0_1= '!' | lv_quantifier_0_2= '?' ) ) ) otherlv_1= '[' ( (lv_param_2_0= ruletff_variable_list ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_exp_5_0= ruletff_expression ) ) )
            // InternalTPTP.g:2709:3: ( ( (lv_quantifier_0_1= '!' | lv_quantifier_0_2= '?' ) ) ) otherlv_1= '[' ( (lv_param_2_0= ruletff_variable_list ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_exp_5_0= ruletff_expression ) )
            {
            // InternalTPTP.g:2709:3: ( ( (lv_quantifier_0_1= '!' | lv_quantifier_0_2= '?' ) ) )
            // InternalTPTP.g:2710:4: ( (lv_quantifier_0_1= '!' | lv_quantifier_0_2= '?' ) )
            {
            // InternalTPTP.g:2710:4: ( (lv_quantifier_0_1= '!' | lv_quantifier_0_2= '?' ) )
            // InternalTPTP.g:2711:5: (lv_quantifier_0_1= '!' | lv_quantifier_0_2= '?' )
            {
            // InternalTPTP.g:2711:5: (lv_quantifier_0_1= '!' | lv_quantifier_0_2= '?' )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==28) ) {
                alt45=1;
            }
            else if ( (LA45_0==29) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalTPTP.g:2712:6: lv_quantifier_0_1= '!'
                    {
                    lv_quantifier_0_1=(Token)match(input,28,FOLLOW_19); 

                    						newLeafNode(lv_quantifier_0_1, grammarAccess.getTff_quantifier_expressionAccess().getQuantifierExclamationMarkKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_quantifier_expressionRule());
                    						}
                    						setWithLastConsumed(current, "quantifier", lv_quantifier_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:2723:6: lv_quantifier_0_2= '?'
                    {
                    lv_quantifier_0_2=(Token)match(input,29,FOLLOW_19); 

                    						newLeafNode(lv_quantifier_0_2, grammarAccess.getTff_quantifier_expressionAccess().getQuantifierQuestionMarkKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_quantifier_expressionRule());
                    						}
                    						setWithLastConsumed(current, "quantifier", lv_quantifier_0_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getTff_quantifier_expressionAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalTPTP.g:2740:3: ( (lv_param_2_0= ruletff_variable_list ) )
            // InternalTPTP.g:2741:4: (lv_param_2_0= ruletff_variable_list )
            {
            // InternalTPTP.g:2741:4: (lv_param_2_0= ruletff_variable_list )
            // InternalTPTP.g:2742:5: lv_param_2_0= ruletff_variable_list
            {

            					newCompositeNode(grammarAccess.getTff_quantifier_expressionAccess().getParamTff_variable_listParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_param_2_0=ruletff_variable_list();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTff_quantifier_expressionRule());
            					}
            					set(
            						current,
            						"param",
            						lv_param_2_0,
            						"it.unibz.inf.tptp.TPTP.tff_variable_list");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getTff_quantifier_expressionAccess().getRightSquareBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,32,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getTff_quantifier_expressionAccess().getColonKeyword_4());
            		
            // InternalTPTP.g:2767:3: ( (lv_exp_5_0= ruletff_expression ) )
            // InternalTPTP.g:2768:4: (lv_exp_5_0= ruletff_expression )
            {
            // InternalTPTP.g:2768:4: (lv_exp_5_0= ruletff_expression )
            // InternalTPTP.g:2769:5: lv_exp_5_0= ruletff_expression
            {

            					newCompositeNode(grammarAccess.getTff_quantifier_expressionAccess().getExpTff_expressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_5_0=ruletff_expression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTff_quantifier_expressionRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_5_0,
            						"it.unibz.inf.tptp.TPTP.tff_expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletff_quantifier_expression"


    // $ANTLR start "entryRuletff_type_quantifier_epression"
    // InternalTPTP.g:2790:1: entryRuletff_type_quantifier_epression returns [EObject current=null] : iv_ruletff_type_quantifier_epression= ruletff_type_quantifier_epression EOF ;
    public final EObject entryRuletff_type_quantifier_epression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletff_type_quantifier_epression = null;


        try {
            // InternalTPTP.g:2790:70: (iv_ruletff_type_quantifier_epression= ruletff_type_quantifier_epression EOF )
            // InternalTPTP.g:2791:2: iv_ruletff_type_quantifier_epression= ruletff_type_quantifier_epression EOF
            {
             newCompositeNode(grammarAccess.getTff_type_quantifier_epressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletff_type_quantifier_epression=ruletff_type_quantifier_epression();

            state._fsp--;

             current =iv_ruletff_type_quantifier_epression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletff_type_quantifier_epression"


    // $ANTLR start "ruletff_type_quantifier_epression"
    // InternalTPTP.g:2797:1: ruletff_type_quantifier_epression returns [EObject current=null] : ( ( (lv_quantifier_0_0= '!>' ) ) otherlv_1= '[' ( (lv_param_2_0= ruletff_variable_list ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_exp_5_0= ruletff_type_expression ) ) ) ;
    public final EObject ruletff_type_quantifier_epression() throws RecognitionException {
        EObject current = null;

        Token lv_quantifier_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_param_2_0 = null;

        EObject lv_exp_5_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:2803:2: ( ( ( (lv_quantifier_0_0= '!>' ) ) otherlv_1= '[' ( (lv_param_2_0= ruletff_variable_list ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_exp_5_0= ruletff_type_expression ) ) ) )
            // InternalTPTP.g:2804:2: ( ( (lv_quantifier_0_0= '!>' ) ) otherlv_1= '[' ( (lv_param_2_0= ruletff_variable_list ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_exp_5_0= ruletff_type_expression ) ) )
            {
            // InternalTPTP.g:2804:2: ( ( (lv_quantifier_0_0= '!>' ) ) otherlv_1= '[' ( (lv_param_2_0= ruletff_variable_list ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_exp_5_0= ruletff_type_expression ) ) )
            // InternalTPTP.g:2805:3: ( (lv_quantifier_0_0= '!>' ) ) otherlv_1= '[' ( (lv_param_2_0= ruletff_variable_list ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_exp_5_0= ruletff_type_expression ) )
            {
            // InternalTPTP.g:2805:3: ( (lv_quantifier_0_0= '!>' ) )
            // InternalTPTP.g:2806:4: (lv_quantifier_0_0= '!>' )
            {
            // InternalTPTP.g:2806:4: (lv_quantifier_0_0= '!>' )
            // InternalTPTP.g:2807:5: lv_quantifier_0_0= '!>'
            {
            lv_quantifier_0_0=(Token)match(input,65,FOLLOW_19); 

            					newLeafNode(lv_quantifier_0_0, grammarAccess.getTff_type_quantifier_epressionAccess().getQuantifierExclamationMarkGreaterThanSignKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTff_type_quantifier_epressionRule());
            					}
            					setWithLastConsumed(current, "quantifier", lv_quantifier_0_0, "!>");
            				

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getTff_type_quantifier_epressionAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalTPTP.g:2823:3: ( (lv_param_2_0= ruletff_variable_list ) )
            // InternalTPTP.g:2824:4: (lv_param_2_0= ruletff_variable_list )
            {
            // InternalTPTP.g:2824:4: (lv_param_2_0= ruletff_variable_list )
            // InternalTPTP.g:2825:5: lv_param_2_0= ruletff_variable_list
            {

            					newCompositeNode(grammarAccess.getTff_type_quantifier_epressionAccess().getParamTff_variable_listParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_param_2_0=ruletff_variable_list();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTff_type_quantifier_epressionRule());
            					}
            					set(
            						current,
            						"param",
            						lv_param_2_0,
            						"it.unibz.inf.tptp.TPTP.tff_variable_list");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getTff_type_quantifier_epressionAccess().getRightSquareBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,32,FOLLOW_27); 

            			newLeafNode(otherlv_4, grammarAccess.getTff_type_quantifier_epressionAccess().getColonKeyword_4());
            		
            // InternalTPTP.g:2850:3: ( (lv_exp_5_0= ruletff_type_expression ) )
            // InternalTPTP.g:2851:4: (lv_exp_5_0= ruletff_type_expression )
            {
            // InternalTPTP.g:2851:4: (lv_exp_5_0= ruletff_type_expression )
            // InternalTPTP.g:2852:5: lv_exp_5_0= ruletff_type_expression
            {

            					newCompositeNode(grammarAccess.getTff_type_quantifier_epressionAccess().getExpTff_type_expressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_5_0=ruletff_type_expression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTff_type_quantifier_epressionRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_5_0,
            						"it.unibz.inf.tptp.TPTP.tff_type_expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletff_type_quantifier_epression"


    // $ANTLR start "entryRuletff_variable_list"
    // InternalTPTP.g:2873:1: entryRuletff_variable_list returns [EObject current=null] : iv_ruletff_variable_list= ruletff_variable_list EOF ;
    public final EObject entryRuletff_variable_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletff_variable_list = null;


        try {
            // InternalTPTP.g:2873:58: (iv_ruletff_variable_list= ruletff_variable_list EOF )
            // InternalTPTP.g:2874:2: iv_ruletff_variable_list= ruletff_variable_list EOF
            {
             newCompositeNode(grammarAccess.getTff_variable_listRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletff_variable_list=ruletff_variable_list();

            state._fsp--;

             current =iv_ruletff_variable_list; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletff_variable_list"


    // $ANTLR start "ruletff_variable_list"
    // InternalTPTP.g:2880:1: ruletff_variable_list returns [EObject current=null] : ( ( (lv_params_0_0= ruletff_var_declaration ) ) (otherlv_1= ',' ( (lv_params_2_0= ruletff_var_declaration ) ) )* ) ;
    public final EObject ruletff_variable_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_params_0_0 = null;

        EObject lv_params_2_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:2886:2: ( ( ( (lv_params_0_0= ruletff_var_declaration ) ) (otherlv_1= ',' ( (lv_params_2_0= ruletff_var_declaration ) ) )* ) )
            // InternalTPTP.g:2887:2: ( ( (lv_params_0_0= ruletff_var_declaration ) ) (otherlv_1= ',' ( (lv_params_2_0= ruletff_var_declaration ) ) )* )
            {
            // InternalTPTP.g:2887:2: ( ( (lv_params_0_0= ruletff_var_declaration ) ) (otherlv_1= ',' ( (lv_params_2_0= ruletff_var_declaration ) ) )* )
            // InternalTPTP.g:2888:3: ( (lv_params_0_0= ruletff_var_declaration ) ) (otherlv_1= ',' ( (lv_params_2_0= ruletff_var_declaration ) ) )*
            {
            // InternalTPTP.g:2888:3: ( (lv_params_0_0= ruletff_var_declaration ) )
            // InternalTPTP.g:2889:4: (lv_params_0_0= ruletff_var_declaration )
            {
            // InternalTPTP.g:2889:4: (lv_params_0_0= ruletff_var_declaration )
            // InternalTPTP.g:2890:5: lv_params_0_0= ruletff_var_declaration
            {

            					newCompositeNode(grammarAccess.getTff_variable_listAccess().getParamsTff_var_declarationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_23);
            lv_params_0_0=ruletff_var_declaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTff_variable_listRule());
            					}
            					add(
            						current,
            						"params",
            						lv_params_0_0,
            						"it.unibz.inf.tptp.TPTP.tff_var_declaration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTPTP.g:2907:3: (otherlv_1= ',' ( (lv_params_2_0= ruletff_var_declaration ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==16) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalTPTP.g:2908:4: otherlv_1= ',' ( (lv_params_2_0= ruletff_var_declaration ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_20); 

            	    				newLeafNode(otherlv_1, grammarAccess.getTff_variable_listAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalTPTP.g:2912:4: ( (lv_params_2_0= ruletff_var_declaration ) )
            	    // InternalTPTP.g:2913:5: (lv_params_2_0= ruletff_var_declaration )
            	    {
            	    // InternalTPTP.g:2913:5: (lv_params_2_0= ruletff_var_declaration )
            	    // InternalTPTP.g:2914:6: lv_params_2_0= ruletff_var_declaration
            	    {

            	    						newCompositeNode(grammarAccess.getTff_variable_listAccess().getParamsTff_var_declarationParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_params_2_0=ruletff_var_declaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTff_variable_listRule());
            	    						}
            	    						add(
            	    							current,
            	    							"params",
            	    							lv_params_2_0,
            	    							"it.unibz.inf.tptp.TPTP.tff_var_declaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletff_variable_list"


    // $ANTLR start "entryRulecnf_input"
    // InternalTPTP.g:2936:1: entryRulecnf_input returns [EObject current=null] : iv_rulecnf_input= rulecnf_input EOF ;
    public final EObject entryRulecnf_input() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecnf_input = null;


        try {
            // InternalTPTP.g:2936:50: (iv_rulecnf_input= rulecnf_input EOF )
            // InternalTPTP.g:2937:2: iv_rulecnf_input= rulecnf_input EOF
            {
             newCompositeNode(grammarAccess.getCnf_inputRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecnf_input=rulecnf_input();

            state._fsp--;

             current =iv_rulecnf_input; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecnf_input"


    // $ANTLR start "rulecnf_input"
    // InternalTPTP.g:2943:1: rulecnf_input returns [EObject current=null] : (this_cnf_root_0= rulecnf_root | this_include_1= ruleinclude ) ;
    public final EObject rulecnf_input() throws RecognitionException {
        EObject current = null;

        EObject this_cnf_root_0 = null;

        EObject this_include_1 = null;



        	enterRule();

        try {
            // InternalTPTP.g:2949:2: ( (this_cnf_root_0= rulecnf_root | this_include_1= ruleinclude ) )
            // InternalTPTP.g:2950:2: (this_cnf_root_0= rulecnf_root | this_include_1= ruleinclude )
            {
            // InternalTPTP.g:2950:2: (this_cnf_root_0= rulecnf_root | this_include_1= ruleinclude )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==66) ) {
                alt47=1;
            }
            else if ( (LA47_0==13) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalTPTP.g:2951:3: this_cnf_root_0= rulecnf_root
                    {

                    			newCompositeNode(grammarAccess.getCnf_inputAccess().getCnf_rootParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_cnf_root_0=rulecnf_root();

                    state._fsp--;


                    			current = this_cnf_root_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:2960:3: this_include_1= ruleinclude
                    {

                    			newCompositeNode(grammarAccess.getCnf_inputAccess().getIncludeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_include_1=ruleinclude();

                    state._fsp--;


                    			current = this_include_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecnf_input"


    // $ANTLR start "entryRulecnf_root"
    // InternalTPTP.g:2972:1: entryRulecnf_root returns [EObject current=null] : iv_rulecnf_root= rulecnf_root EOF ;
    public final EObject entryRulecnf_root() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecnf_root = null;


        try {
            // InternalTPTP.g:2972:49: (iv_rulecnf_root= rulecnf_root EOF )
            // InternalTPTP.g:2973:2: iv_rulecnf_root= rulecnf_root EOF
            {
             newCompositeNode(grammarAccess.getCnf_rootRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecnf_root=rulecnf_root();

            state._fsp--;

             current =iv_rulecnf_root; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecnf_root"


    // $ANTLR start "rulecnf_root"
    // InternalTPTP.g:2979:1: rulecnf_root returns [EObject current=null] : (otherlv_0= 'cnf(' ( ( (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING ) ) ) otherlv_2= ',' ( ( (lv_formula_role_3_1= 'axiom' | lv_formula_role_3_2= 'hypothesis' | lv_formula_role_3_3= 'negated_conjecture' | lv_formula_role_3_4= 'plain' ) ) ) otherlv_4= ',' ( (lv_exp_5_0= rulecnf_formula_type_definition ) ) otherlv_6= ').' ) ;
    public final EObject rulecnf_root() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_2=null;
        Token otherlv_2=null;
        Token lv_formula_role_3_1=null;
        Token lv_formula_role_3_2=null;
        Token lv_formula_role_3_3=null;
        Token lv_formula_role_3_4=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_1 = null;

        EObject lv_exp_5_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:2985:2: ( (otherlv_0= 'cnf(' ( ( (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING ) ) ) otherlv_2= ',' ( ( (lv_formula_role_3_1= 'axiom' | lv_formula_role_3_2= 'hypothesis' | lv_formula_role_3_3= 'negated_conjecture' | lv_formula_role_3_4= 'plain' ) ) ) otherlv_4= ',' ( (lv_exp_5_0= rulecnf_formula_type_definition ) ) otherlv_6= ').' ) )
            // InternalTPTP.g:2986:2: (otherlv_0= 'cnf(' ( ( (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING ) ) ) otherlv_2= ',' ( ( (lv_formula_role_3_1= 'axiom' | lv_formula_role_3_2= 'hypothesis' | lv_formula_role_3_3= 'negated_conjecture' | lv_formula_role_3_4= 'plain' ) ) ) otherlv_4= ',' ( (lv_exp_5_0= rulecnf_formula_type_definition ) ) otherlv_6= ').' )
            {
            // InternalTPTP.g:2986:2: (otherlv_0= 'cnf(' ( ( (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING ) ) ) otherlv_2= ',' ( ( (lv_formula_role_3_1= 'axiom' | lv_formula_role_3_2= 'hypothesis' | lv_formula_role_3_3= 'negated_conjecture' | lv_formula_role_3_4= 'plain' ) ) ) otherlv_4= ',' ( (lv_exp_5_0= rulecnf_formula_type_definition ) ) otherlv_6= ').' )
            // InternalTPTP.g:2987:3: otherlv_0= 'cnf(' ( ( (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING ) ) ) otherlv_2= ',' ( ( (lv_formula_role_3_1= 'axiom' | lv_formula_role_3_2= 'hypothesis' | lv_formula_role_3_3= 'negated_conjecture' | lv_formula_role_3_4= 'plain' ) ) ) otherlv_4= ',' ( (lv_exp_5_0= rulecnf_formula_type_definition ) ) otherlv_6= ').'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getCnf_rootAccess().getCnfKeyword_0());
            		
            // InternalTPTP.g:2991:3: ( ( (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING ) ) )
            // InternalTPTP.g:2992:4: ( (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING ) )
            {
            // InternalTPTP.g:2992:4: ( (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING ) )
            // InternalTPTP.g:2993:5: (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING )
            {
            // InternalTPTP.g:2993:5: (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_LOWER_TOKEN||(LA48_0>=17 && LA48_0<=22)||LA48_0==34||LA48_0==67) ) {
                alt48=1;
            }
            else if ( (LA48_0==RULE_STRING) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalTPTP.g:2994:6: lv_name_1_1= rulelower_token_and_keyword
                    {

                    						newCompositeNode(grammarAccess.getCnf_rootAccess().getNameLower_token_and_keywordParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_name_1_1=rulelower_token_and_keyword();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCnf_rootRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_1_1,
                    							"it.unibz.inf.tptp.TPTP.lower_token_and_keyword");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:3010:6: lv_name_1_2= RULE_STRING
                    {
                    lv_name_1_2=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    						newLeafNode(lv_name_1_2, grammarAccess.getCnf_rootAccess().getNameSTRINGTerminalRuleCall_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCnf_rootRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_2,
                    							"it.unibz.inf.tptp.TPTP.STRING");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getCnf_rootAccess().getCommaKeyword_2());
            		
            // InternalTPTP.g:3031:3: ( ( (lv_formula_role_3_1= 'axiom' | lv_formula_role_3_2= 'hypothesis' | lv_formula_role_3_3= 'negated_conjecture' | lv_formula_role_3_4= 'plain' ) ) )
            // InternalTPTP.g:3032:4: ( (lv_formula_role_3_1= 'axiom' | lv_formula_role_3_2= 'hypothesis' | lv_formula_role_3_3= 'negated_conjecture' | lv_formula_role_3_4= 'plain' ) )
            {
            // InternalTPTP.g:3032:4: ( (lv_formula_role_3_1= 'axiom' | lv_formula_role_3_2= 'hypothesis' | lv_formula_role_3_3= 'negated_conjecture' | lv_formula_role_3_4= 'plain' ) )
            // InternalTPTP.g:3033:5: (lv_formula_role_3_1= 'axiom' | lv_formula_role_3_2= 'hypothesis' | lv_formula_role_3_3= 'negated_conjecture' | lv_formula_role_3_4= 'plain' )
            {
            // InternalTPTP.g:3033:5: (lv_formula_role_3_1= 'axiom' | lv_formula_role_3_2= 'hypothesis' | lv_formula_role_3_3= 'negated_conjecture' | lv_formula_role_3_4= 'plain' )
            int alt49=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt49=1;
                }
                break;
            case 18:
                {
                alt49=2;
                }
                break;
            case 19:
                {
                alt49=3;
                }
                break;
            case 67:
                {
                alt49=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalTPTP.g:3034:6: lv_formula_role_3_1= 'axiom'
                    {
                    lv_formula_role_3_1=(Token)match(input,17,FOLLOW_11); 

                    						newLeafNode(lv_formula_role_3_1, grammarAccess.getCnf_rootAccess().getFormula_roleAxiomKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCnf_rootRule());
                    						}
                    						setWithLastConsumed(current, "formula_role", lv_formula_role_3_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:3045:6: lv_formula_role_3_2= 'hypothesis'
                    {
                    lv_formula_role_3_2=(Token)match(input,18,FOLLOW_11); 

                    						newLeafNode(lv_formula_role_3_2, grammarAccess.getCnf_rootAccess().getFormula_roleHypothesisKeyword_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCnf_rootRule());
                    						}
                    						setWithLastConsumed(current, "formula_role", lv_formula_role_3_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalTPTP.g:3056:6: lv_formula_role_3_3= 'negated_conjecture'
                    {
                    lv_formula_role_3_3=(Token)match(input,19,FOLLOW_11); 

                    						newLeafNode(lv_formula_role_3_3, grammarAccess.getCnf_rootAccess().getFormula_roleNegated_conjectureKeyword_3_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCnf_rootRule());
                    						}
                    						setWithLastConsumed(current, "formula_role", lv_formula_role_3_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalTPTP.g:3067:6: lv_formula_role_3_4= 'plain'
                    {
                    lv_formula_role_3_4=(Token)match(input,67,FOLLOW_11); 

                    						newLeafNode(lv_formula_role_3_4, grammarAccess.getCnf_rootAccess().getFormula_rolePlainKeyword_3_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCnf_rootRule());
                    						}
                    						setWithLastConsumed(current, "formula_role", lv_formula_role_3_4, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_35); 

            			newLeafNode(otherlv_4, grammarAccess.getCnf_rootAccess().getCommaKeyword_4());
            		
            // InternalTPTP.g:3084:3: ( (lv_exp_5_0= rulecnf_formula_type_definition ) )
            // InternalTPTP.g:3085:4: (lv_exp_5_0= rulecnf_formula_type_definition )
            {
            // InternalTPTP.g:3085:4: (lv_exp_5_0= rulecnf_formula_type_definition )
            // InternalTPTP.g:3086:5: lv_exp_5_0= rulecnf_formula_type_definition
            {

            					newCompositeNode(grammarAccess.getCnf_rootAccess().getExpCnf_formula_type_definitionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
            lv_exp_5_0=rulecnf_formula_type_definition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCnf_rootRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_5_0,
            						"it.unibz.inf.tptp.TPTP.cnf_formula_type_definition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCnf_rootAccess().getRightParenthesisFullStopKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecnf_root"


    // $ANTLR start "entryRulecnf_formula_type_definition"
    // InternalTPTP.g:3111:1: entryRulecnf_formula_type_definition returns [EObject current=null] : iv_rulecnf_formula_type_definition= rulecnf_formula_type_definition EOF ;
    public final EObject entryRulecnf_formula_type_definition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecnf_formula_type_definition = null;


        try {
            // InternalTPTP.g:3111:68: (iv_rulecnf_formula_type_definition= rulecnf_formula_type_definition EOF )
            // InternalTPTP.g:3112:2: iv_rulecnf_formula_type_definition= rulecnf_formula_type_definition EOF
            {
             newCompositeNode(grammarAccess.getCnf_formula_type_definitionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecnf_formula_type_definition=rulecnf_formula_type_definition();

            state._fsp--;

             current =iv_rulecnf_formula_type_definition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecnf_formula_type_definition"


    // $ANTLR start "rulecnf_formula_type_definition"
    // InternalTPTP.g:3118:1: rulecnf_formula_type_definition returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_disjunction_1_0= rulecnf_or ) ) otherlv_2= ')' ) | ( (lv_disjunction_3_0= rulecnf_or ) ) ) ;
    public final EObject rulecnf_formula_type_definition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_disjunction_1_0 = null;

        EObject lv_disjunction_3_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:3124:2: ( ( (otherlv_0= '(' ( (lv_disjunction_1_0= rulecnf_or ) ) otherlv_2= ')' ) | ( (lv_disjunction_3_0= rulecnf_or ) ) ) )
            // InternalTPTP.g:3125:2: ( (otherlv_0= '(' ( (lv_disjunction_1_0= rulecnf_or ) ) otherlv_2= ')' ) | ( (lv_disjunction_3_0= rulecnf_or ) ) )
            {
            // InternalTPTP.g:3125:2: ( (otherlv_0= '(' ( (lv_disjunction_1_0= rulecnf_or ) ) otherlv_2= ')' ) | ( (lv_disjunction_3_0= rulecnf_or ) ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==23) ) {
                alt50=1;
            }
            else if ( ((LA50_0>=RULE_STRING && LA50_0<=RULE_LOWER_TOKEN)||(LA50_0>=17 && LA50_0<=22)||(LA50_0>=25 && LA50_0<=27)||LA50_0==34||LA50_0==67) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalTPTP.g:3126:3: (otherlv_0= '(' ( (lv_disjunction_1_0= rulecnf_or ) ) otherlv_2= ')' )
                    {
                    // InternalTPTP.g:3126:3: (otherlv_0= '(' ( (lv_disjunction_1_0= rulecnf_or ) ) otherlv_2= ')' )
                    // InternalTPTP.g:3127:4: otherlv_0= '(' ( (lv_disjunction_1_0= rulecnf_or ) ) otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_35); 

                    				newLeafNode(otherlv_0, grammarAccess.getCnf_formula_type_definitionAccess().getLeftParenthesisKeyword_0_0());
                    			
                    // InternalTPTP.g:3131:4: ( (lv_disjunction_1_0= rulecnf_or ) )
                    // InternalTPTP.g:3132:5: (lv_disjunction_1_0= rulecnf_or )
                    {
                    // InternalTPTP.g:3132:5: (lv_disjunction_1_0= rulecnf_or )
                    // InternalTPTP.g:3133:6: lv_disjunction_1_0= rulecnf_or
                    {

                    						newCompositeNode(grammarAccess.getCnf_formula_type_definitionAccess().getDisjunctionCnf_orParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_disjunction_1_0=rulecnf_or();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCnf_formula_type_definitionRule());
                    						}
                    						set(
                    							current,
                    							"disjunction",
                    							lv_disjunction_1_0,
                    							"it.unibz.inf.tptp.TPTP.cnf_or");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getCnf_formula_type_definitionAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTPTP.g:3156:3: ( (lv_disjunction_3_0= rulecnf_or ) )
                    {
                    // InternalTPTP.g:3156:3: ( (lv_disjunction_3_0= rulecnf_or ) )
                    // InternalTPTP.g:3157:4: (lv_disjunction_3_0= rulecnf_or )
                    {
                    // InternalTPTP.g:3157:4: (lv_disjunction_3_0= rulecnf_or )
                    // InternalTPTP.g:3158:5: lv_disjunction_3_0= rulecnf_or
                    {

                    					newCompositeNode(grammarAccess.getCnf_formula_type_definitionAccess().getDisjunctionCnf_orParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_disjunction_3_0=rulecnf_or();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCnf_formula_type_definitionRule());
                    					}
                    					set(
                    						current,
                    						"disjunction",
                    						lv_disjunction_3_0,
                    						"it.unibz.inf.tptp.TPTP.cnf_or");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecnf_formula_type_definition"


    // $ANTLR start "entryRulecnf_or"
    // InternalTPTP.g:3179:1: entryRulecnf_or returns [EObject current=null] : iv_rulecnf_or= rulecnf_or EOF ;
    public final EObject entryRulecnf_or() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecnf_or = null;


        try {
            // InternalTPTP.g:3179:47: (iv_rulecnf_or= rulecnf_or EOF )
            // InternalTPTP.g:3180:2: iv_rulecnf_or= rulecnf_or EOF
            {
             newCompositeNode(grammarAccess.getCnf_orRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecnf_or=rulecnf_or();

            state._fsp--;

             current =iv_rulecnf_or; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecnf_or"


    // $ANTLR start "rulecnf_or"
    // InternalTPTP.g:3186:1: rulecnf_or returns [EObject current=null] : ( ( (lv_or_0_0= rulecnf_not ) ) (otherlv_1= '|' ( (lv_or_2_0= rulecnf_not ) ) )* ) ;
    public final EObject rulecnf_or() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_or_0_0 = null;

        EObject lv_or_2_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:3192:2: ( ( ( (lv_or_0_0= rulecnf_not ) ) (otherlv_1= '|' ( (lv_or_2_0= rulecnf_not ) ) )* ) )
            // InternalTPTP.g:3193:2: ( ( (lv_or_0_0= rulecnf_not ) ) (otherlv_1= '|' ( (lv_or_2_0= rulecnf_not ) ) )* )
            {
            // InternalTPTP.g:3193:2: ( ( (lv_or_0_0= rulecnf_not ) ) (otherlv_1= '|' ( (lv_or_2_0= rulecnf_not ) ) )* )
            // InternalTPTP.g:3194:3: ( (lv_or_0_0= rulecnf_not ) ) (otherlv_1= '|' ( (lv_or_2_0= rulecnf_not ) ) )*
            {
            // InternalTPTP.g:3194:3: ( (lv_or_0_0= rulecnf_not ) )
            // InternalTPTP.g:3195:4: (lv_or_0_0= rulecnf_not )
            {
            // InternalTPTP.g:3195:4: (lv_or_0_0= rulecnf_not )
            // InternalTPTP.g:3196:5: lv_or_0_0= rulecnf_not
            {

            					newCompositeNode(grammarAccess.getCnf_orAccess().getOrCnf_notParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_36);
            lv_or_0_0=rulecnf_not();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCnf_orRule());
            					}
            					add(
            						current,
            						"or",
            						lv_or_0_0,
            						"it.unibz.inf.tptp.TPTP.cnf_not");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTPTP.g:3213:3: (otherlv_1= '|' ( (lv_or_2_0= rulecnf_not ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==68) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalTPTP.g:3214:4: otherlv_1= '|' ( (lv_or_2_0= rulecnf_not ) )
            	    {
            	    otherlv_1=(Token)match(input,68,FOLLOW_35); 

            	    				newLeafNode(otherlv_1, grammarAccess.getCnf_orAccess().getVerticalLineKeyword_1_0());
            	    			
            	    // InternalTPTP.g:3218:4: ( (lv_or_2_0= rulecnf_not ) )
            	    // InternalTPTP.g:3219:5: (lv_or_2_0= rulecnf_not )
            	    {
            	    // InternalTPTP.g:3219:5: (lv_or_2_0= rulecnf_not )
            	    // InternalTPTP.g:3220:6: lv_or_2_0= rulecnf_not
            	    {

            	    						newCompositeNode(grammarAccess.getCnf_orAccess().getOrCnf_notParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_36);
            	    lv_or_2_0=rulecnf_not();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCnf_orRule());
            	    						}
            	    						add(
            	    							current,
            	    							"or",
            	    							lv_or_2_0,
            	    							"it.unibz.inf.tptp.TPTP.cnf_not");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecnf_or"


    // $ANTLR start "entryRulecnf_not"
    // InternalTPTP.g:3242:1: entryRulecnf_not returns [EObject current=null] : iv_rulecnf_not= rulecnf_not EOF ;
    public final EObject entryRulecnf_not() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecnf_not = null;


        try {
            // InternalTPTP.g:3242:48: (iv_rulecnf_not= rulecnf_not EOF )
            // InternalTPTP.g:3243:2: iv_rulecnf_not= rulecnf_not EOF
            {
             newCompositeNode(grammarAccess.getCnf_notRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecnf_not=rulecnf_not();

            state._fsp--;

             current =iv_rulecnf_not; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecnf_not"


    // $ANTLR start "rulecnf_not"
    // InternalTPTP.g:3249:1: rulecnf_not returns [EObject current=null] : ( ( (lv_negated_0_0= '~' ) )? ( (lv_literal_1_0= rulecnf_equality ) ) ) ;
    public final EObject rulecnf_not() throws RecognitionException {
        EObject current = null;

        Token lv_negated_0_0=null;
        EObject lv_literal_1_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:3255:2: ( ( ( (lv_negated_0_0= '~' ) )? ( (lv_literal_1_0= rulecnf_equality ) ) ) )
            // InternalTPTP.g:3256:2: ( ( (lv_negated_0_0= '~' ) )? ( (lv_literal_1_0= rulecnf_equality ) ) )
            {
            // InternalTPTP.g:3256:2: ( ( (lv_negated_0_0= '~' ) )? ( (lv_literal_1_0= rulecnf_equality ) ) )
            // InternalTPTP.g:3257:3: ( (lv_negated_0_0= '~' ) )? ( (lv_literal_1_0= rulecnf_equality ) )
            {
            // InternalTPTP.g:3257:3: ( (lv_negated_0_0= '~' ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==25) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalTPTP.g:3258:4: (lv_negated_0_0= '~' )
                    {
                    // InternalTPTP.g:3258:4: (lv_negated_0_0= '~' )
                    // InternalTPTP.g:3259:5: lv_negated_0_0= '~'
                    {
                    lv_negated_0_0=(Token)match(input,25,FOLLOW_35); 

                    					newLeafNode(lv_negated_0_0, grammarAccess.getCnf_notAccess().getNegatedTildeKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCnf_notRule());
                    					}
                    					setWithLastConsumed(current, "negated", true, "~");
                    				

                    }


                    }
                    break;

            }

            // InternalTPTP.g:3271:3: ( (lv_literal_1_0= rulecnf_equality ) )
            // InternalTPTP.g:3272:4: (lv_literal_1_0= rulecnf_equality )
            {
            // InternalTPTP.g:3272:4: (lv_literal_1_0= rulecnf_equality )
            // InternalTPTP.g:3273:5: lv_literal_1_0= rulecnf_equality
            {

            					newCompositeNode(grammarAccess.getCnf_notAccess().getLiteralCnf_equalityParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_literal_1_0=rulecnf_equality();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCnf_notRule());
            					}
            					set(
            						current,
            						"literal",
            						lv_literal_1_0,
            						"it.unibz.inf.tptp.TPTP.cnf_equality");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecnf_not"


    // $ANTLR start "entryRulecnf_equality"
    // InternalTPTP.g:3294:1: entryRulecnf_equality returns [EObject current=null] : iv_rulecnf_equality= rulecnf_equality EOF ;
    public final EObject entryRulecnf_equality() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecnf_equality = null;


        try {
            // InternalTPTP.g:3294:53: (iv_rulecnf_equality= rulecnf_equality EOF )
            // InternalTPTP.g:3295:2: iv_rulecnf_equality= rulecnf_equality EOF
            {
             newCompositeNode(grammarAccess.getCnf_equalityRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecnf_equality=rulecnf_equality();

            state._fsp--;

             current =iv_rulecnf_equality; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecnf_equality"


    // $ANTLR start "rulecnf_equality"
    // InternalTPTP.g:3301:1: rulecnf_equality returns [EObject current=null] : ( ( (lv_expL_0_0= rulecnf_expression ) ) ( ( ( (lv_eq_1_1= '=' | lv_eq_1_2= '!=' ) ) ) ( (lv_expR_2_0= rulecnf_expression ) ) )? ) ;
    public final EObject rulecnf_equality() throws RecognitionException {
        EObject current = null;

        Token lv_eq_1_1=null;
        Token lv_eq_1_2=null;
        EObject lv_expL_0_0 = null;

        EObject lv_expR_2_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:3307:2: ( ( ( (lv_expL_0_0= rulecnf_expression ) ) ( ( ( (lv_eq_1_1= '=' | lv_eq_1_2= '!=' ) ) ) ( (lv_expR_2_0= rulecnf_expression ) ) )? ) )
            // InternalTPTP.g:3308:2: ( ( (lv_expL_0_0= rulecnf_expression ) ) ( ( ( (lv_eq_1_1= '=' | lv_eq_1_2= '!=' ) ) ) ( (lv_expR_2_0= rulecnf_expression ) ) )? )
            {
            // InternalTPTP.g:3308:2: ( ( (lv_expL_0_0= rulecnf_expression ) ) ( ( ( (lv_eq_1_1= '=' | lv_eq_1_2= '!=' ) ) ) ( (lv_expR_2_0= rulecnf_expression ) ) )? )
            // InternalTPTP.g:3309:3: ( (lv_expL_0_0= rulecnf_expression ) ) ( ( ( (lv_eq_1_1= '=' | lv_eq_1_2= '!=' ) ) ) ( (lv_expR_2_0= rulecnf_expression ) ) )?
            {
            // InternalTPTP.g:3309:3: ( (lv_expL_0_0= rulecnf_expression ) )
            // InternalTPTP.g:3310:4: (lv_expL_0_0= rulecnf_expression )
            {
            // InternalTPTP.g:3310:4: (lv_expL_0_0= rulecnf_expression )
            // InternalTPTP.g:3311:5: lv_expL_0_0= rulecnf_expression
            {

            					newCompositeNode(grammarAccess.getCnf_equalityAccess().getExpLCnf_expressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_37);
            lv_expL_0_0=rulecnf_expression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCnf_equalityRule());
            					}
            					set(
            						current,
            						"expL",
            						lv_expL_0_0,
            						"it.unibz.inf.tptp.TPTP.cnf_expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTPTP.g:3328:3: ( ( ( (lv_eq_1_1= '=' | lv_eq_1_2= '!=' ) ) ) ( (lv_expR_2_0= rulecnf_expression ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=69 && LA54_0<=70)) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalTPTP.g:3329:4: ( ( (lv_eq_1_1= '=' | lv_eq_1_2= '!=' ) ) ) ( (lv_expR_2_0= rulecnf_expression ) )
                    {
                    // InternalTPTP.g:3329:4: ( ( (lv_eq_1_1= '=' | lv_eq_1_2= '!=' ) ) )
                    // InternalTPTP.g:3330:5: ( (lv_eq_1_1= '=' | lv_eq_1_2= '!=' ) )
                    {
                    // InternalTPTP.g:3330:5: ( (lv_eq_1_1= '=' | lv_eq_1_2= '!=' ) )
                    // InternalTPTP.g:3331:6: (lv_eq_1_1= '=' | lv_eq_1_2= '!=' )
                    {
                    // InternalTPTP.g:3331:6: (lv_eq_1_1= '=' | lv_eq_1_2= '!=' )
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==69) ) {
                        alt53=1;
                    }
                    else if ( (LA53_0==70) ) {
                        alt53=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 0, input);

                        throw nvae;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalTPTP.g:3332:7: lv_eq_1_1= '='
                            {
                            lv_eq_1_1=(Token)match(input,69,FOLLOW_35); 

                            							newLeafNode(lv_eq_1_1, grammarAccess.getCnf_equalityAccess().getEqEqualsSignKeyword_1_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCnf_equalityRule());
                            							}
                            							setWithLastConsumed(current, "eq", lv_eq_1_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalTPTP.g:3343:7: lv_eq_1_2= '!='
                            {
                            lv_eq_1_2=(Token)match(input,70,FOLLOW_35); 

                            							newLeafNode(lv_eq_1_2, grammarAccess.getCnf_equalityAccess().getEqExclamationMarkEqualsSignKeyword_1_0_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCnf_equalityRule());
                            							}
                            							setWithLastConsumed(current, "eq", lv_eq_1_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalTPTP.g:3356:4: ( (lv_expR_2_0= rulecnf_expression ) )
                    // InternalTPTP.g:3357:5: (lv_expR_2_0= rulecnf_expression )
                    {
                    // InternalTPTP.g:3357:5: (lv_expR_2_0= rulecnf_expression )
                    // InternalTPTP.g:3358:6: lv_expR_2_0= rulecnf_expression
                    {

                    						newCompositeNode(grammarAccess.getCnf_equalityAccess().getExpRCnf_expressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expR_2_0=rulecnf_expression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCnf_equalityRule());
                    						}
                    						set(
                    							current,
                    							"expR",
                    							lv_expR_2_0,
                    							"it.unibz.inf.tptp.TPTP.cnf_expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecnf_equality"


    // $ANTLR start "entryRulecnf_expression"
    // InternalTPTP.g:3380:1: entryRulecnf_expression returns [EObject current=null] : iv_rulecnf_expression= rulecnf_expression EOF ;
    public final EObject entryRulecnf_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecnf_expression = null;


        try {
            // InternalTPTP.g:3380:55: (iv_rulecnf_expression= rulecnf_expression EOF )
            // InternalTPTP.g:3381:2: iv_rulecnf_expression= rulecnf_expression EOF
            {
             newCompositeNode(grammarAccess.getCnf_expressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecnf_expression=rulecnf_expression();

            state._fsp--;

             current =iv_rulecnf_expression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecnf_expression"


    // $ANTLR start "rulecnf_expression"
    // InternalTPTP.g:3387:1: rulecnf_expression returns [EObject current=null] : (this_cnf_constant_0= rulecnf_constant | this_cnf_var_1= rulecnf_var | ( (lv_cnf_exp_2_0= rulecnf_statement_literal ) ) ) ;
    public final EObject rulecnf_expression() throws RecognitionException {
        EObject current = null;

        EObject this_cnf_constant_0 = null;

        EObject this_cnf_var_1 = null;

        AntlrDatatypeRuleToken lv_cnf_exp_2_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:3393:2: ( (this_cnf_constant_0= rulecnf_constant | this_cnf_var_1= rulecnf_var | ( (lv_cnf_exp_2_0= rulecnf_statement_literal ) ) ) )
            // InternalTPTP.g:3394:2: (this_cnf_constant_0= rulecnf_constant | this_cnf_var_1= rulecnf_var | ( (lv_cnf_exp_2_0= rulecnf_statement_literal ) ) )
            {
            // InternalTPTP.g:3394:2: (this_cnf_constant_0= rulecnf_constant | this_cnf_var_1= rulecnf_var | ( (lv_cnf_exp_2_0= rulecnf_statement_literal ) ) )
            int alt55=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_LOWER_TOKEN:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 34:
            case 67:
                {
                alt55=1;
                }
                break;
            case RULE_UPPER_TOKEN:
                {
                alt55=2;
                }
                break;
            case 26:
            case 27:
                {
                alt55=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // InternalTPTP.g:3395:3: this_cnf_constant_0= rulecnf_constant
                    {

                    			newCompositeNode(grammarAccess.getCnf_expressionAccess().getCnf_constantParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_cnf_constant_0=rulecnf_constant();

                    state._fsp--;


                    			current = this_cnf_constant_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:3404:3: this_cnf_var_1= rulecnf_var
                    {

                    			newCompositeNode(grammarAccess.getCnf_expressionAccess().getCnf_varParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_cnf_var_1=rulecnf_var();

                    state._fsp--;


                    			current = this_cnf_var_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTPTP.g:3413:3: ( (lv_cnf_exp_2_0= rulecnf_statement_literal ) )
                    {
                    // InternalTPTP.g:3413:3: ( (lv_cnf_exp_2_0= rulecnf_statement_literal ) )
                    // InternalTPTP.g:3414:4: (lv_cnf_exp_2_0= rulecnf_statement_literal )
                    {
                    // InternalTPTP.g:3414:4: (lv_cnf_exp_2_0= rulecnf_statement_literal )
                    // InternalTPTP.g:3415:5: lv_cnf_exp_2_0= rulecnf_statement_literal
                    {

                    					newCompositeNode(grammarAccess.getCnf_expressionAccess().getCnf_expCnf_statement_literalParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_cnf_exp_2_0=rulecnf_statement_literal();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCnf_expressionRule());
                    					}
                    					set(
                    						current,
                    						"cnf_exp",
                    						lv_cnf_exp_2_0,
                    						"it.unibz.inf.tptp.TPTP.cnf_statement_literal");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecnf_expression"


    // $ANTLR start "entryRulecnf_constant"
    // InternalTPTP.g:3436:1: entryRulecnf_constant returns [EObject current=null] : iv_rulecnf_constant= rulecnf_constant EOF ;
    public final EObject entryRulecnf_constant() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecnf_constant = null;


        try {
            // InternalTPTP.g:3436:53: (iv_rulecnf_constant= rulecnf_constant EOF )
            // InternalTPTP.g:3437:2: iv_rulecnf_constant= rulecnf_constant EOF
            {
             newCompositeNode(grammarAccess.getCnf_constantRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecnf_constant=rulecnf_constant();

            state._fsp--;

             current =iv_rulecnf_constant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecnf_constant"


    // $ANTLR start "rulecnf_constant"
    // InternalTPTP.g:3443:1: rulecnf_constant returns [EObject current=null] : ( ( ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_param_2_0= rulecnf_expression ) ) (otherlv_3= ',' ( (lv_param_4_0= rulecnf_expression ) ) )* otherlv_5= ')' )? ) ;
    public final EObject rulecnf_constant() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_2=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_0_1 = null;

        EObject lv_param_2_0 = null;

        EObject lv_param_4_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:3449:2: ( ( ( ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_param_2_0= rulecnf_expression ) ) (otherlv_3= ',' ( (lv_param_4_0= rulecnf_expression ) ) )* otherlv_5= ')' )? ) )
            // InternalTPTP.g:3450:2: ( ( ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_param_2_0= rulecnf_expression ) ) (otherlv_3= ',' ( (lv_param_4_0= rulecnf_expression ) ) )* otherlv_5= ')' )? )
            {
            // InternalTPTP.g:3450:2: ( ( ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_param_2_0= rulecnf_expression ) ) (otherlv_3= ',' ( (lv_param_4_0= rulecnf_expression ) ) )* otherlv_5= ')' )? )
            // InternalTPTP.g:3451:3: ( ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_param_2_0= rulecnf_expression ) ) (otherlv_3= ',' ( (lv_param_4_0= rulecnf_expression ) ) )* otherlv_5= ')' )?
            {
            // InternalTPTP.g:3451:3: ( ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) )
            // InternalTPTP.g:3452:4: ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) )
            {
            // InternalTPTP.g:3452:4: ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) )
            // InternalTPTP.g:3453:5: (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING )
            {
            // InternalTPTP.g:3453:5: (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_LOWER_TOKEN||(LA56_0>=17 && LA56_0<=22)||LA56_0==34||LA56_0==67) ) {
                alt56=1;
            }
            else if ( (LA56_0==RULE_STRING) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalTPTP.g:3454:6: lv_name_0_1= rulelower_token_and_keyword
                    {

                    						newCompositeNode(grammarAccess.getCnf_constantAccess().getNameLower_token_and_keywordParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_name_0_1=rulelower_token_and_keyword();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCnf_constantRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_0_1,
                    							"it.unibz.inf.tptp.TPTP.lower_token_and_keyword");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:3470:6: lv_name_0_2= RULE_STRING
                    {
                    lv_name_0_2=(Token)match(input,RULE_STRING,FOLLOW_16); 

                    						newLeafNode(lv_name_0_2, grammarAccess.getCnf_constantAccess().getNameSTRINGTerminalRuleCall_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCnf_constantRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_0_2,
                    							"it.unibz.inf.tptp.TPTP.STRING");
                    					

                    }
                    break;

            }


            }


            }

            // InternalTPTP.g:3487:3: (otherlv_1= '(' ( (lv_param_2_0= rulecnf_expression ) ) (otherlv_3= ',' ( (lv_param_4_0= rulecnf_expression ) ) )* otherlv_5= ')' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==23) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalTPTP.g:3488:4: otherlv_1= '(' ( (lv_param_2_0= rulecnf_expression ) ) (otherlv_3= ',' ( (lv_param_4_0= rulecnf_expression ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_35); 

                    				newLeafNode(otherlv_1, grammarAccess.getCnf_constantAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalTPTP.g:3492:4: ( (lv_param_2_0= rulecnf_expression ) )
                    // InternalTPTP.g:3493:5: (lv_param_2_0= rulecnf_expression )
                    {
                    // InternalTPTP.g:3493:5: (lv_param_2_0= rulecnf_expression )
                    // InternalTPTP.g:3494:6: lv_param_2_0= rulecnf_expression
                    {

                    						newCompositeNode(grammarAccess.getCnf_constantAccess().getParamCnf_expressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_param_2_0=rulecnf_expression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCnf_constantRule());
                    						}
                    						add(
                    							current,
                    							"param",
                    							lv_param_2_0,
                    							"it.unibz.inf.tptp.TPTP.cnf_expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTPTP.g:3511:4: (otherlv_3= ',' ( (lv_param_4_0= rulecnf_expression ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==16) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalTPTP.g:3512:5: otherlv_3= ',' ( (lv_param_4_0= rulecnf_expression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_35); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getCnf_constantAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalTPTP.g:3516:5: ( (lv_param_4_0= rulecnf_expression ) )
                    	    // InternalTPTP.g:3517:6: (lv_param_4_0= rulecnf_expression )
                    	    {
                    	    // InternalTPTP.g:3517:6: (lv_param_4_0= rulecnf_expression )
                    	    // InternalTPTP.g:3518:7: lv_param_4_0= rulecnf_expression
                    	    {

                    	    							newCompositeNode(grammarAccess.getCnf_constantAccess().getParamCnf_expressionParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_param_4_0=rulecnf_expression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCnf_constantRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"param",
                    	    								lv_param_4_0,
                    	    								"it.unibz.inf.tptp.TPTP.cnf_expression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getCnf_constantAccess().getRightParenthesisKeyword_1_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecnf_constant"


    // $ANTLR start "entryRulecnf_var"
    // InternalTPTP.g:3545:1: entryRulecnf_var returns [EObject current=null] : iv_rulecnf_var= rulecnf_var EOF ;
    public final EObject entryRulecnf_var() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecnf_var = null;


        try {
            // InternalTPTP.g:3545:48: (iv_rulecnf_var= rulecnf_var EOF )
            // InternalTPTP.g:3546:2: iv_rulecnf_var= rulecnf_var EOF
            {
             newCompositeNode(grammarAccess.getCnf_varRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecnf_var=rulecnf_var();

            state._fsp--;

             current =iv_rulecnf_var; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecnf_var"


    // $ANTLR start "rulecnf_var"
    // InternalTPTP.g:3552:1: rulecnf_var returns [EObject current=null] : ( (lv_name_0_0= RULE_UPPER_TOKEN ) ) ;
    public final EObject rulecnf_var() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalTPTP.g:3558:2: ( ( (lv_name_0_0= RULE_UPPER_TOKEN ) ) )
            // InternalTPTP.g:3559:2: ( (lv_name_0_0= RULE_UPPER_TOKEN ) )
            {
            // InternalTPTP.g:3559:2: ( (lv_name_0_0= RULE_UPPER_TOKEN ) )
            // InternalTPTP.g:3560:3: (lv_name_0_0= RULE_UPPER_TOKEN )
            {
            // InternalTPTP.g:3560:3: (lv_name_0_0= RULE_UPPER_TOKEN )
            // InternalTPTP.g:3561:4: lv_name_0_0= RULE_UPPER_TOKEN
            {
            lv_name_0_0=(Token)match(input,RULE_UPPER_TOKEN,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getCnf_varAccess().getNameUPPER_TOKENTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getCnf_varRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"it.unibz.inf.tptp.TPTP.UPPER_TOKEN");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecnf_var"


    // $ANTLR start "entryRulecnf_statement_literal"
    // InternalTPTP.g:3580:1: entryRulecnf_statement_literal returns [String current=null] : iv_rulecnf_statement_literal= rulecnf_statement_literal EOF ;
    public final String entryRulecnf_statement_literal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecnf_statement_literal = null;


        try {
            // InternalTPTP.g:3580:61: (iv_rulecnf_statement_literal= rulecnf_statement_literal EOF )
            // InternalTPTP.g:3581:2: iv_rulecnf_statement_literal= rulecnf_statement_literal EOF
            {
             newCompositeNode(grammarAccess.getCnf_statement_literalRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecnf_statement_literal=rulecnf_statement_literal();

            state._fsp--;

             current =iv_rulecnf_statement_literal.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecnf_statement_literal"


    // $ANTLR start "rulecnf_statement_literal"
    // InternalTPTP.g:3587:1: rulecnf_statement_literal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '$true' | kw= '$false' ) ;
    public final AntlrDatatypeRuleToken rulecnf_statement_literal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTPTP.g:3593:2: ( (kw= '$true' | kw= '$false' ) )
            // InternalTPTP.g:3594:2: (kw= '$true' | kw= '$false' )
            {
            // InternalTPTP.g:3594:2: (kw= '$true' | kw= '$false' )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==26) ) {
                alt59=1;
            }
            else if ( (LA59_0==27) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalTPTP.g:3595:3: kw= '$true'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCnf_statement_literalAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:3601:3: kw= '$false'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCnf_statement_literalAccess().getFalseKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecnf_statement_literal"


    // $ANTLR start "entryRulethf_input"
    // InternalTPTP.g:3610:1: entryRulethf_input returns [EObject current=null] : iv_rulethf_input= rulethf_input EOF ;
    public final EObject entryRulethf_input() throws RecognitionException {
        EObject current = null;

        EObject iv_rulethf_input = null;


        try {
            // InternalTPTP.g:3610:50: (iv_rulethf_input= rulethf_input EOF )
            // InternalTPTP.g:3611:2: iv_rulethf_input= rulethf_input EOF
            {
             newCompositeNode(grammarAccess.getThf_inputRule()); 
            pushFollow(FOLLOW_1);
            iv_rulethf_input=rulethf_input();

            state._fsp--;

             current =iv_rulethf_input; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulethf_input"


    // $ANTLR start "rulethf_input"
    // InternalTPTP.g:3617:1: rulethf_input returns [EObject current=null] : (this_thf_root_0= rulethf_root | this_include_1= ruleinclude ) ;
    public final EObject rulethf_input() throws RecognitionException {
        EObject current = null;

        EObject this_thf_root_0 = null;

        EObject this_include_1 = null;



        	enterRule();

        try {
            // InternalTPTP.g:3623:2: ( (this_thf_root_0= rulethf_root | this_include_1= ruleinclude ) )
            // InternalTPTP.g:3624:2: (this_thf_root_0= rulethf_root | this_include_1= ruleinclude )
            {
            // InternalTPTP.g:3624:2: (this_thf_root_0= rulethf_root | this_include_1= ruleinclude )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==71) ) {
                alt60=1;
            }
            else if ( (LA60_0==13) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalTPTP.g:3625:3: this_thf_root_0= rulethf_root
                    {

                    			newCompositeNode(grammarAccess.getThf_inputAccess().getThf_rootParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_thf_root_0=rulethf_root();

                    state._fsp--;


                    			current = this_thf_root_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:3634:3: this_include_1= ruleinclude
                    {

                    			newCompositeNode(grammarAccess.getThf_inputAccess().getIncludeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_include_1=ruleinclude();

                    state._fsp--;


                    			current = this_include_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulethf_input"


    // $ANTLR start "entryRulethf_root"
    // InternalTPTP.g:3646:1: entryRulethf_root returns [EObject current=null] : iv_rulethf_root= rulethf_root EOF ;
    public final EObject entryRulethf_root() throws RecognitionException {
        EObject current = null;

        EObject iv_rulethf_root = null;


        try {
            // InternalTPTP.g:3646:49: (iv_rulethf_root= rulethf_root EOF )
            // InternalTPTP.g:3647:2: iv_rulethf_root= rulethf_root EOF
            {
             newCompositeNode(grammarAccess.getThf_rootRule()); 
            pushFollow(FOLLOW_1);
            iv_rulethf_root=rulethf_root();

            state._fsp--;

             current =iv_rulethf_root; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulethf_root"


    // $ANTLR start "rulethf_root"
    // InternalTPTP.g:3653:1: rulethf_root returns [EObject current=null] : ( (otherlv_0= 'thf(' ( ( (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING ) ) ) otherlv_2= ',' ( (lv_formula_role_3_0= 'type' ) ) otherlv_4= ',' ( (lv_def_5_0= rulethf_formula_type_definition ) ) otherlv_6= ').' ) | (otherlv_7= 'thf(' ( ( (lv_name_8_1= rulelower_token_and_keyword | lv_name_8_2= RULE_STRING ) ) ) otherlv_9= ',' ( ( (lv_formula_role_10_1= 'axiom' | lv_formula_role_10_2= 'hypothesis' | lv_formula_role_10_3= 'negated_conjecture' | lv_formula_role_10_4= 'conjecture' | lv_formula_role_10_5= 'definition' | lv_formula_role_10_6= 'lemma' ) ) ) otherlv_11= ',' ( (lv_thf_exp_12_0= rulethf_expression ) ) otherlv_13= ').' ) ) ;
    public final EObject rulethf_root() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_2=null;
        Token otherlv_2=null;
        Token lv_formula_role_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_name_8_2=null;
        Token otherlv_9=null;
        Token lv_formula_role_10_1=null;
        Token lv_formula_role_10_2=null;
        Token lv_formula_role_10_3=null;
        Token lv_formula_role_10_4=null;
        Token lv_formula_role_10_5=null;
        Token lv_formula_role_10_6=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_1 = null;

        EObject lv_def_5_0 = null;

        AntlrDatatypeRuleToken lv_name_8_1 = null;

        EObject lv_thf_exp_12_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:3659:2: ( ( (otherlv_0= 'thf(' ( ( (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING ) ) ) otherlv_2= ',' ( (lv_formula_role_3_0= 'type' ) ) otherlv_4= ',' ( (lv_def_5_0= rulethf_formula_type_definition ) ) otherlv_6= ').' ) | (otherlv_7= 'thf(' ( ( (lv_name_8_1= rulelower_token_and_keyword | lv_name_8_2= RULE_STRING ) ) ) otherlv_9= ',' ( ( (lv_formula_role_10_1= 'axiom' | lv_formula_role_10_2= 'hypothesis' | lv_formula_role_10_3= 'negated_conjecture' | lv_formula_role_10_4= 'conjecture' | lv_formula_role_10_5= 'definition' | lv_formula_role_10_6= 'lemma' ) ) ) otherlv_11= ',' ( (lv_thf_exp_12_0= rulethf_expression ) ) otherlv_13= ').' ) ) )
            // InternalTPTP.g:3660:2: ( (otherlv_0= 'thf(' ( ( (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING ) ) ) otherlv_2= ',' ( (lv_formula_role_3_0= 'type' ) ) otherlv_4= ',' ( (lv_def_5_0= rulethf_formula_type_definition ) ) otherlv_6= ').' ) | (otherlv_7= 'thf(' ( ( (lv_name_8_1= rulelower_token_and_keyword | lv_name_8_2= RULE_STRING ) ) ) otherlv_9= ',' ( ( (lv_formula_role_10_1= 'axiom' | lv_formula_role_10_2= 'hypothesis' | lv_formula_role_10_3= 'negated_conjecture' | lv_formula_role_10_4= 'conjecture' | lv_formula_role_10_5= 'definition' | lv_formula_role_10_6= 'lemma' ) ) ) otherlv_11= ',' ( (lv_thf_exp_12_0= rulethf_expression ) ) otherlv_13= ').' ) )
            {
            // InternalTPTP.g:3660:2: ( (otherlv_0= 'thf(' ( ( (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING ) ) ) otherlv_2= ',' ( (lv_formula_role_3_0= 'type' ) ) otherlv_4= ',' ( (lv_def_5_0= rulethf_formula_type_definition ) ) otherlv_6= ').' ) | (otherlv_7= 'thf(' ( ( (lv_name_8_1= rulelower_token_and_keyword | lv_name_8_2= RULE_STRING ) ) ) otherlv_9= ',' ( ( (lv_formula_role_10_1= 'axiom' | lv_formula_role_10_2= 'hypothesis' | lv_formula_role_10_3= 'negated_conjecture' | lv_formula_role_10_4= 'conjecture' | lv_formula_role_10_5= 'definition' | lv_formula_role_10_6= 'lemma' ) ) ) otherlv_11= ',' ( (lv_thf_exp_12_0= rulethf_expression ) ) otherlv_13= ').' ) )
            int alt64=2;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // InternalTPTP.g:3661:3: (otherlv_0= 'thf(' ( ( (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING ) ) ) otherlv_2= ',' ( (lv_formula_role_3_0= 'type' ) ) otherlv_4= ',' ( (lv_def_5_0= rulethf_formula_type_definition ) ) otherlv_6= ').' )
                    {
                    // InternalTPTP.g:3661:3: (otherlv_0= 'thf(' ( ( (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING ) ) ) otherlv_2= ',' ( (lv_formula_role_3_0= 'type' ) ) otherlv_4= ',' ( (lv_def_5_0= rulethf_formula_type_definition ) ) otherlv_6= ').' )
                    // InternalTPTP.g:3662:4: otherlv_0= 'thf(' ( ( (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING ) ) ) otherlv_2= ',' ( (lv_formula_role_3_0= 'type' ) ) otherlv_4= ',' ( (lv_def_5_0= rulethf_formula_type_definition ) ) otherlv_6= ').'
                    {
                    otherlv_0=(Token)match(input,71,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getThf_rootAccess().getThfKeyword_0_0());
                    			
                    // InternalTPTP.g:3666:4: ( ( (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING ) ) )
                    // InternalTPTP.g:3667:5: ( (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING ) )
                    {
                    // InternalTPTP.g:3667:5: ( (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING ) )
                    // InternalTPTP.g:3668:6: (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING )
                    {
                    // InternalTPTP.g:3668:6: (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING )
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==RULE_LOWER_TOKEN||(LA61_0>=17 && LA61_0<=22)||LA61_0==34||LA61_0==67) ) {
                        alt61=1;
                    }
                    else if ( (LA61_0==RULE_STRING) ) {
                        alt61=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 61, 0, input);

                        throw nvae;
                    }
                    switch (alt61) {
                        case 1 :
                            // InternalTPTP.g:3669:7: lv_name_1_1= rulelower_token_and_keyword
                            {

                            							newCompositeNode(grammarAccess.getThf_rootAccess().getNameLower_token_and_keywordParserRuleCall_0_1_0_0());
                            						
                            pushFollow(FOLLOW_11);
                            lv_name_1_1=rulelower_token_and_keyword();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getThf_rootRule());
                            							}
                            							set(
                            								current,
                            								"name",
                            								lv_name_1_1,
                            								"it.unibz.inf.tptp.TPTP.lower_token_and_keyword");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalTPTP.g:3685:7: lv_name_1_2= RULE_STRING
                            {
                            lv_name_1_2=(Token)match(input,RULE_STRING,FOLLOW_11); 

                            							newLeafNode(lv_name_1_2, grammarAccess.getThf_rootAccess().getNameSTRINGTerminalRuleCall_0_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getThf_rootRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"name",
                            								lv_name_1_2,
                            								"it.unibz.inf.tptp.TPTP.STRING");
                            						

                            }
                            break;

                    }


                    }


                    }

                    otherlv_2=(Token)match(input,16,FOLLOW_25); 

                    				newLeafNode(otherlv_2, grammarAccess.getThf_rootAccess().getCommaKeyword_0_2());
                    			
                    // InternalTPTP.g:3706:4: ( (lv_formula_role_3_0= 'type' ) )
                    // InternalTPTP.g:3707:5: (lv_formula_role_3_0= 'type' )
                    {
                    // InternalTPTP.g:3707:5: (lv_formula_role_3_0= 'type' )
                    // InternalTPTP.g:3708:6: lv_formula_role_3_0= 'type'
                    {
                    lv_formula_role_3_0=(Token)match(input,34,FOLLOW_11); 

                    						newLeafNode(lv_formula_role_3_0, grammarAccess.getThf_rootAccess().getFormula_roleTypeKeyword_0_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getThf_rootRule());
                    						}
                    						setWithLastConsumed(current, "formula_role", lv_formula_role_3_0, "type");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,16,FOLLOW_26); 

                    				newLeafNode(otherlv_4, grammarAccess.getThf_rootAccess().getCommaKeyword_0_4());
                    			
                    // InternalTPTP.g:3724:4: ( (lv_def_5_0= rulethf_formula_type_definition ) )
                    // InternalTPTP.g:3725:5: (lv_def_5_0= rulethf_formula_type_definition )
                    {
                    // InternalTPTP.g:3725:5: (lv_def_5_0= rulethf_formula_type_definition )
                    // InternalTPTP.g:3726:6: lv_def_5_0= rulethf_formula_type_definition
                    {

                    						newCompositeNode(grammarAccess.getThf_rootAccess().getDefThf_formula_type_definitionParserRuleCall_0_5_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_def_5_0=rulethf_formula_type_definition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getThf_rootRule());
                    						}
                    						set(
                    							current,
                    							"def",
                    							lv_def_5_0,
                    							"it.unibz.inf.tptp.TPTP.thf_formula_type_definition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getThf_rootAccess().getRightParenthesisFullStopKeyword_0_6());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTPTP.g:3749:3: (otherlv_7= 'thf(' ( ( (lv_name_8_1= rulelower_token_and_keyword | lv_name_8_2= RULE_STRING ) ) ) otherlv_9= ',' ( ( (lv_formula_role_10_1= 'axiom' | lv_formula_role_10_2= 'hypothesis' | lv_formula_role_10_3= 'negated_conjecture' | lv_formula_role_10_4= 'conjecture' | lv_formula_role_10_5= 'definition' | lv_formula_role_10_6= 'lemma' ) ) ) otherlv_11= ',' ( (lv_thf_exp_12_0= rulethf_expression ) ) otherlv_13= ').' )
                    {
                    // InternalTPTP.g:3749:3: (otherlv_7= 'thf(' ( ( (lv_name_8_1= rulelower_token_and_keyword | lv_name_8_2= RULE_STRING ) ) ) otherlv_9= ',' ( ( (lv_formula_role_10_1= 'axiom' | lv_formula_role_10_2= 'hypothesis' | lv_formula_role_10_3= 'negated_conjecture' | lv_formula_role_10_4= 'conjecture' | lv_formula_role_10_5= 'definition' | lv_formula_role_10_6= 'lemma' ) ) ) otherlv_11= ',' ( (lv_thf_exp_12_0= rulethf_expression ) ) otherlv_13= ').' )
                    // InternalTPTP.g:3750:4: otherlv_7= 'thf(' ( ( (lv_name_8_1= rulelower_token_and_keyword | lv_name_8_2= RULE_STRING ) ) ) otherlv_9= ',' ( ( (lv_formula_role_10_1= 'axiom' | lv_formula_role_10_2= 'hypothesis' | lv_formula_role_10_3= 'negated_conjecture' | lv_formula_role_10_4= 'conjecture' | lv_formula_role_10_5= 'definition' | lv_formula_role_10_6= 'lemma' ) ) ) otherlv_11= ',' ( (lv_thf_exp_12_0= rulethf_expression ) ) otherlv_13= ').'
                    {
                    otherlv_7=(Token)match(input,71,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getThf_rootAccess().getThfKeyword_1_0());
                    			
                    // InternalTPTP.g:3754:4: ( ( (lv_name_8_1= rulelower_token_and_keyword | lv_name_8_2= RULE_STRING ) ) )
                    // InternalTPTP.g:3755:5: ( (lv_name_8_1= rulelower_token_and_keyword | lv_name_8_2= RULE_STRING ) )
                    {
                    // InternalTPTP.g:3755:5: ( (lv_name_8_1= rulelower_token_and_keyword | lv_name_8_2= RULE_STRING ) )
                    // InternalTPTP.g:3756:6: (lv_name_8_1= rulelower_token_and_keyword | lv_name_8_2= RULE_STRING )
                    {
                    // InternalTPTP.g:3756:6: (lv_name_8_1= rulelower_token_and_keyword | lv_name_8_2= RULE_STRING )
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==RULE_LOWER_TOKEN||(LA62_0>=17 && LA62_0<=22)||LA62_0==34||LA62_0==67) ) {
                        alt62=1;
                    }
                    else if ( (LA62_0==RULE_STRING) ) {
                        alt62=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 62, 0, input);

                        throw nvae;
                    }
                    switch (alt62) {
                        case 1 :
                            // InternalTPTP.g:3757:7: lv_name_8_1= rulelower_token_and_keyword
                            {

                            							newCompositeNode(grammarAccess.getThf_rootAccess().getNameLower_token_and_keywordParserRuleCall_1_1_0_0());
                            						
                            pushFollow(FOLLOW_11);
                            lv_name_8_1=rulelower_token_and_keyword();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getThf_rootRule());
                            							}
                            							set(
                            								current,
                            								"name",
                            								lv_name_8_1,
                            								"it.unibz.inf.tptp.TPTP.lower_token_and_keyword");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalTPTP.g:3773:7: lv_name_8_2= RULE_STRING
                            {
                            lv_name_8_2=(Token)match(input,RULE_STRING,FOLLOW_11); 

                            							newLeafNode(lv_name_8_2, grammarAccess.getThf_rootAccess().getNameSTRINGTerminalRuleCall_1_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getThf_rootRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"name",
                            								lv_name_8_2,
                            								"it.unibz.inf.tptp.TPTP.STRING");
                            						

                            }
                            break;

                    }


                    }


                    }

                    otherlv_9=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getThf_rootAccess().getCommaKeyword_1_2());
                    			
                    // InternalTPTP.g:3794:4: ( ( (lv_formula_role_10_1= 'axiom' | lv_formula_role_10_2= 'hypothesis' | lv_formula_role_10_3= 'negated_conjecture' | lv_formula_role_10_4= 'conjecture' | lv_formula_role_10_5= 'definition' | lv_formula_role_10_6= 'lemma' ) ) )
                    // InternalTPTP.g:3795:5: ( (lv_formula_role_10_1= 'axiom' | lv_formula_role_10_2= 'hypothesis' | lv_formula_role_10_3= 'negated_conjecture' | lv_formula_role_10_4= 'conjecture' | lv_formula_role_10_5= 'definition' | lv_formula_role_10_6= 'lemma' ) )
                    {
                    // InternalTPTP.g:3795:5: ( (lv_formula_role_10_1= 'axiom' | lv_formula_role_10_2= 'hypothesis' | lv_formula_role_10_3= 'negated_conjecture' | lv_formula_role_10_4= 'conjecture' | lv_formula_role_10_5= 'definition' | lv_formula_role_10_6= 'lemma' ) )
                    // InternalTPTP.g:3796:6: (lv_formula_role_10_1= 'axiom' | lv_formula_role_10_2= 'hypothesis' | lv_formula_role_10_3= 'negated_conjecture' | lv_formula_role_10_4= 'conjecture' | lv_formula_role_10_5= 'definition' | lv_formula_role_10_6= 'lemma' )
                    {
                    // InternalTPTP.g:3796:6: (lv_formula_role_10_1= 'axiom' | lv_formula_role_10_2= 'hypothesis' | lv_formula_role_10_3= 'negated_conjecture' | lv_formula_role_10_4= 'conjecture' | lv_formula_role_10_5= 'definition' | lv_formula_role_10_6= 'lemma' )
                    int alt63=6;
                    switch ( input.LA(1) ) {
                    case 17:
                        {
                        alt63=1;
                        }
                        break;
                    case 18:
                        {
                        alt63=2;
                        }
                        break;
                    case 19:
                        {
                        alt63=3;
                        }
                        break;
                    case 20:
                        {
                        alt63=4;
                        }
                        break;
                    case 21:
                        {
                        alt63=5;
                        }
                        break;
                    case 22:
                        {
                        alt63=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 63, 0, input);

                        throw nvae;
                    }

                    switch (alt63) {
                        case 1 :
                            // InternalTPTP.g:3797:7: lv_formula_role_10_1= 'axiom'
                            {
                            lv_formula_role_10_1=(Token)match(input,17,FOLLOW_11); 

                            							newLeafNode(lv_formula_role_10_1, grammarAccess.getThf_rootAccess().getFormula_roleAxiomKeyword_1_3_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getThf_rootRule());
                            							}
                            							setWithLastConsumed(current, "formula_role", lv_formula_role_10_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalTPTP.g:3808:7: lv_formula_role_10_2= 'hypothesis'
                            {
                            lv_formula_role_10_2=(Token)match(input,18,FOLLOW_11); 

                            							newLeafNode(lv_formula_role_10_2, grammarAccess.getThf_rootAccess().getFormula_roleHypothesisKeyword_1_3_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getThf_rootRule());
                            							}
                            							setWithLastConsumed(current, "formula_role", lv_formula_role_10_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalTPTP.g:3819:7: lv_formula_role_10_3= 'negated_conjecture'
                            {
                            lv_formula_role_10_3=(Token)match(input,19,FOLLOW_11); 

                            							newLeafNode(lv_formula_role_10_3, grammarAccess.getThf_rootAccess().getFormula_roleNegated_conjectureKeyword_1_3_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getThf_rootRule());
                            							}
                            							setWithLastConsumed(current, "formula_role", lv_formula_role_10_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalTPTP.g:3830:7: lv_formula_role_10_4= 'conjecture'
                            {
                            lv_formula_role_10_4=(Token)match(input,20,FOLLOW_11); 

                            							newLeafNode(lv_formula_role_10_4, grammarAccess.getThf_rootAccess().getFormula_roleConjectureKeyword_1_3_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getThf_rootRule());
                            							}
                            							setWithLastConsumed(current, "formula_role", lv_formula_role_10_4, null);
                            						

                            }
                            break;
                        case 5 :
                            // InternalTPTP.g:3841:7: lv_formula_role_10_5= 'definition'
                            {
                            lv_formula_role_10_5=(Token)match(input,21,FOLLOW_11); 

                            							newLeafNode(lv_formula_role_10_5, grammarAccess.getThf_rootAccess().getFormula_roleDefinitionKeyword_1_3_0_4());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getThf_rootRule());
                            							}
                            							setWithLastConsumed(current, "formula_role", lv_formula_role_10_5, null);
                            						

                            }
                            break;
                        case 6 :
                            // InternalTPTP.g:3852:7: lv_formula_role_10_6= 'lemma'
                            {
                            lv_formula_role_10_6=(Token)match(input,22,FOLLOW_11); 

                            							newLeafNode(lv_formula_role_10_6, grammarAccess.getThf_rootAccess().getFormula_roleLemmaKeyword_1_3_0_5());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getThf_rootRule());
                            							}
                            							setWithLastConsumed(current, "formula_role", lv_formula_role_10_6, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    otherlv_11=(Token)match(input,16,FOLLOW_38); 

                    				newLeafNode(otherlv_11, grammarAccess.getThf_rootAccess().getCommaKeyword_1_4());
                    			
                    // InternalTPTP.g:3869:4: ( (lv_thf_exp_12_0= rulethf_expression ) )
                    // InternalTPTP.g:3870:5: (lv_thf_exp_12_0= rulethf_expression )
                    {
                    // InternalTPTP.g:3870:5: (lv_thf_exp_12_0= rulethf_expression )
                    // InternalTPTP.g:3871:6: lv_thf_exp_12_0= rulethf_expression
                    {

                    						newCompositeNode(grammarAccess.getThf_rootAccess().getThf_expThf_expressionParserRuleCall_1_5_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_thf_exp_12_0=rulethf_expression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getThf_rootRule());
                    						}
                    						set(
                    							current,
                    							"thf_exp",
                    							lv_thf_exp_12_0,
                    							"it.unibz.inf.tptp.TPTP.thf_expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getThf_rootAccess().getRightParenthesisFullStopKeyword_1_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulethf_root"


    // $ANTLR start "entryRulethf_formula_type_definition"
    // InternalTPTP.g:3897:1: entryRulethf_formula_type_definition returns [EObject current=null] : iv_rulethf_formula_type_definition= rulethf_formula_type_definition EOF ;
    public final EObject entryRulethf_formula_type_definition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulethf_formula_type_definition = null;


        try {
            // InternalTPTP.g:3897:68: (iv_rulethf_formula_type_definition= rulethf_formula_type_definition EOF )
            // InternalTPTP.g:3898:2: iv_rulethf_formula_type_definition= rulethf_formula_type_definition EOF
            {
             newCompositeNode(grammarAccess.getThf_formula_type_definitionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulethf_formula_type_definition=rulethf_formula_type_definition();

            state._fsp--;

             current =iv_rulethf_formula_type_definition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulethf_formula_type_definition"


    // $ANTLR start "rulethf_formula_type_definition"
    // InternalTPTP.g:3904:1: rulethf_formula_type_definition returns [EObject current=null] : ( (otherlv_0= '(' this_thf_formula_type_definition_1= rulethf_formula_type_definition otherlv_2= ')' ) | ( ( ( (lv_name_3_1= rulelower_token_and_keyword | lv_name_3_2= RULE_STRING ) ) ) otherlv_4= ':' ( (lv_exp_5_0= rulethf_type_expression ) ) ) ) ;
    public final EObject rulethf_formula_type_definition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_3_2=null;
        Token otherlv_4=null;
        EObject this_thf_formula_type_definition_1 = null;

        AntlrDatatypeRuleToken lv_name_3_1 = null;

        EObject lv_exp_5_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:3910:2: ( ( (otherlv_0= '(' this_thf_formula_type_definition_1= rulethf_formula_type_definition otherlv_2= ')' ) | ( ( ( (lv_name_3_1= rulelower_token_and_keyword | lv_name_3_2= RULE_STRING ) ) ) otherlv_4= ':' ( (lv_exp_5_0= rulethf_type_expression ) ) ) ) )
            // InternalTPTP.g:3911:2: ( (otherlv_0= '(' this_thf_formula_type_definition_1= rulethf_formula_type_definition otherlv_2= ')' ) | ( ( ( (lv_name_3_1= rulelower_token_and_keyword | lv_name_3_2= RULE_STRING ) ) ) otherlv_4= ':' ( (lv_exp_5_0= rulethf_type_expression ) ) ) )
            {
            // InternalTPTP.g:3911:2: ( (otherlv_0= '(' this_thf_formula_type_definition_1= rulethf_formula_type_definition otherlv_2= ')' ) | ( ( ( (lv_name_3_1= rulelower_token_and_keyword | lv_name_3_2= RULE_STRING ) ) ) otherlv_4= ':' ( (lv_exp_5_0= rulethf_type_expression ) ) ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==23) ) {
                alt66=1;
            }
            else if ( (LA66_0==RULE_STRING||LA66_0==RULE_LOWER_TOKEN||(LA66_0>=17 && LA66_0<=22)||LA66_0==34||LA66_0==67) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalTPTP.g:3912:3: (otherlv_0= '(' this_thf_formula_type_definition_1= rulethf_formula_type_definition otherlv_2= ')' )
                    {
                    // InternalTPTP.g:3912:3: (otherlv_0= '(' this_thf_formula_type_definition_1= rulethf_formula_type_definition otherlv_2= ')' )
                    // InternalTPTP.g:3913:4: otherlv_0= '(' this_thf_formula_type_definition_1= rulethf_formula_type_definition otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_26); 

                    				newLeafNode(otherlv_0, grammarAccess.getThf_formula_type_definitionAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getThf_formula_type_definitionAccess().getThf_formula_type_definitionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_15);
                    this_thf_formula_type_definition_1=rulethf_formula_type_definition();

                    state._fsp--;


                    				current = this_thf_formula_type_definition_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getThf_formula_type_definitionAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTPTP.g:3931:3: ( ( ( (lv_name_3_1= rulelower_token_and_keyword | lv_name_3_2= RULE_STRING ) ) ) otherlv_4= ':' ( (lv_exp_5_0= rulethf_type_expression ) ) )
                    {
                    // InternalTPTP.g:3931:3: ( ( ( (lv_name_3_1= rulelower_token_and_keyword | lv_name_3_2= RULE_STRING ) ) ) otherlv_4= ':' ( (lv_exp_5_0= rulethf_type_expression ) ) )
                    // InternalTPTP.g:3932:4: ( ( (lv_name_3_1= rulelower_token_and_keyword | lv_name_3_2= RULE_STRING ) ) ) otherlv_4= ':' ( (lv_exp_5_0= rulethf_type_expression ) )
                    {
                    // InternalTPTP.g:3932:4: ( ( (lv_name_3_1= rulelower_token_and_keyword | lv_name_3_2= RULE_STRING ) ) )
                    // InternalTPTP.g:3933:5: ( (lv_name_3_1= rulelower_token_and_keyword | lv_name_3_2= RULE_STRING ) )
                    {
                    // InternalTPTP.g:3933:5: ( (lv_name_3_1= rulelower_token_and_keyword | lv_name_3_2= RULE_STRING ) )
                    // InternalTPTP.g:3934:6: (lv_name_3_1= rulelower_token_and_keyword | lv_name_3_2= RULE_STRING )
                    {
                    // InternalTPTP.g:3934:6: (lv_name_3_1= rulelower_token_and_keyword | lv_name_3_2= RULE_STRING )
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==RULE_LOWER_TOKEN||(LA65_0>=17 && LA65_0<=22)||LA65_0==34||LA65_0==67) ) {
                        alt65=1;
                    }
                    else if ( (LA65_0==RULE_STRING) ) {
                        alt65=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 65, 0, input);

                        throw nvae;
                    }
                    switch (alt65) {
                        case 1 :
                            // InternalTPTP.g:3935:7: lv_name_3_1= rulelower_token_and_keyword
                            {

                            							newCompositeNode(grammarAccess.getThf_formula_type_definitionAccess().getNameLower_token_and_keywordParserRuleCall_1_0_0_0());
                            						
                            pushFollow(FOLLOW_22);
                            lv_name_3_1=rulelower_token_and_keyword();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getThf_formula_type_definitionRule());
                            							}
                            							set(
                            								current,
                            								"name",
                            								lv_name_3_1,
                            								"it.unibz.inf.tptp.TPTP.lower_token_and_keyword");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalTPTP.g:3951:7: lv_name_3_2= RULE_STRING
                            {
                            lv_name_3_2=(Token)match(input,RULE_STRING,FOLLOW_22); 

                            							newLeafNode(lv_name_3_2, grammarAccess.getThf_formula_type_definitionAccess().getNameSTRINGTerminalRuleCall_1_0_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getThf_formula_type_definitionRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"name",
                            								lv_name_3_2,
                            								"it.unibz.inf.tptp.TPTP.STRING");
                            						

                            }
                            break;

                    }


                    }


                    }

                    otherlv_4=(Token)match(input,32,FOLLOW_39); 

                    				newLeafNode(otherlv_4, grammarAccess.getThf_formula_type_definitionAccess().getColonKeyword_1_1());
                    			
                    // InternalTPTP.g:3972:4: ( (lv_exp_5_0= rulethf_type_expression ) )
                    // InternalTPTP.g:3973:5: (lv_exp_5_0= rulethf_type_expression )
                    {
                    // InternalTPTP.g:3973:5: (lv_exp_5_0= rulethf_type_expression )
                    // InternalTPTP.g:3974:6: lv_exp_5_0= rulethf_type_expression
                    {

                    						newCompositeNode(grammarAccess.getThf_formula_type_definitionAccess().getExpThf_type_expressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_exp_5_0=rulethf_type_expression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getThf_formula_type_definitionRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_5_0,
                    							"it.unibz.inf.tptp.TPTP.thf_type_expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulethf_formula_type_definition"


    // $ANTLR start "entryRulethf_type_expression"
    // InternalTPTP.g:3996:1: entryRulethf_type_expression returns [EObject current=null] : iv_rulethf_type_expression= rulethf_type_expression EOF ;
    public final EObject entryRulethf_type_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulethf_type_expression = null;


        try {
            // InternalTPTP.g:3996:60: (iv_rulethf_type_expression= rulethf_type_expression EOF )
            // InternalTPTP.g:3997:2: iv_rulethf_type_expression= rulethf_type_expression EOF
            {
             newCompositeNode(grammarAccess.getThf_type_expressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulethf_type_expression=rulethf_type_expression();

            state._fsp--;

             current =iv_rulethf_type_expression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulethf_type_expression"


    // $ANTLR start "rulethf_type_expression"
    // InternalTPTP.g:4003:1: rulethf_type_expression returns [EObject current=null] : (this_thf_terminal_type_expression_0= rulethf_terminal_type_expression ( () ( (lv_op_2_0= '>' ) ) ( (lv_right_3_0= rulethf_terminal_type_expression ) ) )* ) ;
    public final EObject rulethf_type_expression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_thf_terminal_type_expression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:4009:2: ( (this_thf_terminal_type_expression_0= rulethf_terminal_type_expression ( () ( (lv_op_2_0= '>' ) ) ( (lv_right_3_0= rulethf_terminal_type_expression ) ) )* ) )
            // InternalTPTP.g:4010:2: (this_thf_terminal_type_expression_0= rulethf_terminal_type_expression ( () ( (lv_op_2_0= '>' ) ) ( (lv_right_3_0= rulethf_terminal_type_expression ) ) )* )
            {
            // InternalTPTP.g:4010:2: (this_thf_terminal_type_expression_0= rulethf_terminal_type_expression ( () ( (lv_op_2_0= '>' ) ) ( (lv_right_3_0= rulethf_terminal_type_expression ) ) )* )
            // InternalTPTP.g:4011:3: this_thf_terminal_type_expression_0= rulethf_terminal_type_expression ( () ( (lv_op_2_0= '>' ) ) ( (lv_right_3_0= rulethf_terminal_type_expression ) ) )*
            {

            			newCompositeNode(grammarAccess.getThf_type_expressionAccess().getThf_terminal_type_expressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_40);
            this_thf_terminal_type_expression_0=rulethf_terminal_type_expression();

            state._fsp--;


            			current = this_thf_terminal_type_expression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTPTP.g:4019:3: ( () ( (lv_op_2_0= '>' ) ) ( (lv_right_3_0= rulethf_terminal_type_expression ) ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==35) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalTPTP.g:4020:4: () ( (lv_op_2_0= '>' ) ) ( (lv_right_3_0= rulethf_terminal_type_expression ) )
            	    {
            	    // InternalTPTP.g:4020:4: ()
            	    // InternalTPTP.g:4021:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getThf_type_expressionAccess().getOperLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalTPTP.g:4027:4: ( (lv_op_2_0= '>' ) )
            	    // InternalTPTP.g:4028:5: (lv_op_2_0= '>' )
            	    {
            	    // InternalTPTP.g:4028:5: (lv_op_2_0= '>' )
            	    // InternalTPTP.g:4029:6: lv_op_2_0= '>'
            	    {
            	    lv_op_2_0=(Token)match(input,35,FOLLOW_39); 

            	    						newLeafNode(lv_op_2_0, grammarAccess.getThf_type_expressionAccess().getOpGreaterThanSignKeyword_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getThf_type_expressionRule());
            	    						}
            	    						setWithLastConsumed(current, "op", lv_op_2_0, ">");
            	    					

            	    }


            	    }

            	    // InternalTPTP.g:4041:4: ( (lv_right_3_0= rulethf_terminal_type_expression ) )
            	    // InternalTPTP.g:4042:5: (lv_right_3_0= rulethf_terminal_type_expression )
            	    {
            	    // InternalTPTP.g:4042:5: (lv_right_3_0= rulethf_terminal_type_expression )
            	    // InternalTPTP.g:4043:6: lv_right_3_0= rulethf_terminal_type_expression
            	    {

            	    						newCompositeNode(grammarAccess.getThf_type_expressionAccess().getRightThf_terminal_type_expressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_40);
            	    lv_right_3_0=rulethf_terminal_type_expression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getThf_type_expressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"it.unibz.inf.tptp.TPTP.thf_terminal_type_expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulethf_type_expression"


    // $ANTLR start "entryRulethf_terminal_type_expression"
    // InternalTPTP.g:4065:1: entryRulethf_terminal_type_expression returns [EObject current=null] : iv_rulethf_terminal_type_expression= rulethf_terminal_type_expression EOF ;
    public final EObject entryRulethf_terminal_type_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulethf_terminal_type_expression = null;


        try {
            // InternalTPTP.g:4065:69: (iv_rulethf_terminal_type_expression= rulethf_terminal_type_expression EOF )
            // InternalTPTP.g:4066:2: iv_rulethf_terminal_type_expression= rulethf_terminal_type_expression EOF
            {
             newCompositeNode(grammarAccess.getThf_terminal_type_expressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulethf_terminal_type_expression=rulethf_terminal_type_expression();

            state._fsp--;

             current =iv_rulethf_terminal_type_expression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulethf_terminal_type_expression"


    // $ANTLR start "rulethf_terminal_type_expression"
    // InternalTPTP.g:4072:1: rulethf_terminal_type_expression returns [EObject current=null] : (this_thf_type_atom_0= rulethf_type_atom | (otherlv_1= '(' this_thf_type_expression_2= rulethf_type_expression otherlv_3= ')' ) ) ;
    public final EObject rulethf_terminal_type_expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_thf_type_atom_0 = null;

        EObject this_thf_type_expression_2 = null;



        	enterRule();

        try {
            // InternalTPTP.g:4078:2: ( (this_thf_type_atom_0= rulethf_type_atom | (otherlv_1= '(' this_thf_type_expression_2= rulethf_type_expression otherlv_3= ')' ) ) )
            // InternalTPTP.g:4079:2: (this_thf_type_atom_0= rulethf_type_atom | (otherlv_1= '(' this_thf_type_expression_2= rulethf_type_expression otherlv_3= ')' ) )
            {
            // InternalTPTP.g:4079:2: (this_thf_type_atom_0= rulethf_type_atom | (otherlv_1= '(' this_thf_type_expression_2= rulethf_type_expression otherlv_3= ')' ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_STRING||LA68_0==RULE_LOWER_TOKEN||(LA68_0>=17 && LA68_0<=22)||LA68_0==34||(LA68_0>=37 && LA68_0<=39)||LA68_0==67) ) {
                alt68=1;
            }
            else if ( (LA68_0==23) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // InternalTPTP.g:4080:3: this_thf_type_atom_0= rulethf_type_atom
                    {

                    			newCompositeNode(grammarAccess.getThf_terminal_type_expressionAccess().getThf_type_atomParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_thf_type_atom_0=rulethf_type_atom();

                    state._fsp--;


                    			current = this_thf_type_atom_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:4089:3: (otherlv_1= '(' this_thf_type_expression_2= rulethf_type_expression otherlv_3= ')' )
                    {
                    // InternalTPTP.g:4089:3: (otherlv_1= '(' this_thf_type_expression_2= rulethf_type_expression otherlv_3= ')' )
                    // InternalTPTP.g:4090:4: otherlv_1= '(' this_thf_type_expression_2= rulethf_type_expression otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_39); 

                    				newLeafNode(otherlv_1, grammarAccess.getThf_terminal_type_expressionAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getThf_terminal_type_expressionAccess().getThf_type_expressionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_15);
                    this_thf_type_expression_2=rulethf_type_expression();

                    state._fsp--;


                    				current = this_thf_type_expression_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getThf_terminal_type_expressionAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulethf_terminal_type_expression"


    // $ANTLR start "entryRulethf_type_atom"
    // InternalTPTP.g:4111:1: entryRulethf_type_atom returns [EObject current=null] : iv_rulethf_type_atom= rulethf_type_atom EOF ;
    public final EObject entryRulethf_type_atom() throws RecognitionException {
        EObject current = null;

        EObject iv_rulethf_type_atom = null;


        try {
            // InternalTPTP.g:4111:54: (iv_rulethf_type_atom= rulethf_type_atom EOF )
            // InternalTPTP.g:4112:2: iv_rulethf_type_atom= rulethf_type_atom EOF
            {
             newCompositeNode(grammarAccess.getThf_type_atomRule()); 
            pushFollow(FOLLOW_1);
            iv_rulethf_type_atom=rulethf_type_atom();

            state._fsp--;

             current =iv_rulethf_type_atom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulethf_type_atom"


    // $ANTLR start "rulethf_type_atom"
    // InternalTPTP.g:4118:1: rulethf_type_atom returns [EObject current=null] : (this_thf_type_constant_0= rulethf_type_constant | this_thf_type_literal_1= rulethf_type_literal ) ;
    public final EObject rulethf_type_atom() throws RecognitionException {
        EObject current = null;

        EObject this_thf_type_constant_0 = null;

        EObject this_thf_type_literal_1 = null;



        	enterRule();

        try {
            // InternalTPTP.g:4124:2: ( (this_thf_type_constant_0= rulethf_type_constant | this_thf_type_literal_1= rulethf_type_literal ) )
            // InternalTPTP.g:4125:2: (this_thf_type_constant_0= rulethf_type_constant | this_thf_type_literal_1= rulethf_type_literal )
            {
            // InternalTPTP.g:4125:2: (this_thf_type_constant_0= rulethf_type_constant | this_thf_type_literal_1= rulethf_type_literal )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_STRING||LA69_0==RULE_LOWER_TOKEN||(LA69_0>=17 && LA69_0<=22)||LA69_0==34||LA69_0==67) ) {
                alt69=1;
            }
            else if ( ((LA69_0>=37 && LA69_0<=39)) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalTPTP.g:4126:3: this_thf_type_constant_0= rulethf_type_constant
                    {

                    			newCompositeNode(grammarAccess.getThf_type_atomAccess().getThf_type_constantParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_thf_type_constant_0=rulethf_type_constant();

                    state._fsp--;


                    			current = this_thf_type_constant_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:4135:3: this_thf_type_literal_1= rulethf_type_literal
                    {

                    			newCompositeNode(grammarAccess.getThf_type_atomAccess().getThf_type_literalParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_thf_type_literal_1=rulethf_type_literal();

                    state._fsp--;


                    			current = this_thf_type_literal_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulethf_type_atom"


    // $ANTLR start "entryRulethf_type_constant"
    // InternalTPTP.g:4147:1: entryRulethf_type_constant returns [EObject current=null] : iv_rulethf_type_constant= rulethf_type_constant EOF ;
    public final EObject entryRulethf_type_constant() throws RecognitionException {
        EObject current = null;

        EObject iv_rulethf_type_constant = null;


        try {
            // InternalTPTP.g:4147:58: (iv_rulethf_type_constant= rulethf_type_constant EOF )
            // InternalTPTP.g:4148:2: iv_rulethf_type_constant= rulethf_type_constant EOF
            {
             newCompositeNode(grammarAccess.getThf_type_constantRule()); 
            pushFollow(FOLLOW_1);
            iv_rulethf_type_constant=rulethf_type_constant();

            state._fsp--;

             current =iv_rulethf_type_constant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulethf_type_constant"


    // $ANTLR start "rulethf_type_constant"
    // InternalTPTP.g:4154:1: rulethf_type_constant returns [EObject current=null] : ( ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) ;
    public final EObject rulethf_type_constant() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_2=null;
        AntlrDatatypeRuleToken lv_name_0_1 = null;



        	enterRule();

        try {
            // InternalTPTP.g:4160:2: ( ( ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) )
            // InternalTPTP.g:4161:2: ( ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) )
            {
            // InternalTPTP.g:4161:2: ( ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) )
            // InternalTPTP.g:4162:3: ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) )
            {
            // InternalTPTP.g:4162:3: ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) )
            // InternalTPTP.g:4163:4: (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING )
            {
            // InternalTPTP.g:4163:4: (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_LOWER_TOKEN||(LA70_0>=17 && LA70_0<=22)||LA70_0==34||LA70_0==67) ) {
                alt70=1;
            }
            else if ( (LA70_0==RULE_STRING) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // InternalTPTP.g:4164:5: lv_name_0_1= rulelower_token_and_keyword
                    {

                    					newCompositeNode(grammarAccess.getThf_type_constantAccess().getNameLower_token_and_keywordParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_name_0_1=rulelower_token_and_keyword();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getThf_type_constantRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_0_1,
                    						"it.unibz.inf.tptp.TPTP.lower_token_and_keyword");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:4180:5: lv_name_0_2= RULE_STRING
                    {
                    lv_name_0_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_name_0_2, grammarAccess.getThf_type_constantAccess().getNameSTRINGTerminalRuleCall_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getThf_type_constantRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_2,
                    						"it.unibz.inf.tptp.TPTP.STRING");
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulethf_type_constant"


    // $ANTLR start "entryRulethf_type_literal"
    // InternalTPTP.g:4200:1: entryRulethf_type_literal returns [EObject current=null] : iv_rulethf_type_literal= rulethf_type_literal EOF ;
    public final EObject entryRulethf_type_literal() throws RecognitionException {
        EObject current = null;

        EObject iv_rulethf_type_literal = null;


        try {
            // InternalTPTP.g:4200:57: (iv_rulethf_type_literal= rulethf_type_literal EOF )
            // InternalTPTP.g:4201:2: iv_rulethf_type_literal= rulethf_type_literal EOF
            {
             newCompositeNode(grammarAccess.getThf_type_literalRule()); 
            pushFollow(FOLLOW_1);
            iv_rulethf_type_literal=rulethf_type_literal();

            state._fsp--;

             current =iv_rulethf_type_literal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulethf_type_literal"


    // $ANTLR start "rulethf_type_literal"
    // InternalTPTP.g:4207:1: rulethf_type_literal returns [EObject current=null] : ( ( (lv_name_0_1= '$i' | lv_name_0_2= '$o' | lv_name_0_3= '$tType' ) ) ) ;
    public final EObject rulethf_type_literal() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;


        	enterRule();

        try {
            // InternalTPTP.g:4213:2: ( ( ( (lv_name_0_1= '$i' | lv_name_0_2= '$o' | lv_name_0_3= '$tType' ) ) ) )
            // InternalTPTP.g:4214:2: ( ( (lv_name_0_1= '$i' | lv_name_0_2= '$o' | lv_name_0_3= '$tType' ) ) )
            {
            // InternalTPTP.g:4214:2: ( ( (lv_name_0_1= '$i' | lv_name_0_2= '$o' | lv_name_0_3= '$tType' ) ) )
            // InternalTPTP.g:4215:3: ( (lv_name_0_1= '$i' | lv_name_0_2= '$o' | lv_name_0_3= '$tType' ) )
            {
            // InternalTPTP.g:4215:3: ( (lv_name_0_1= '$i' | lv_name_0_2= '$o' | lv_name_0_3= '$tType' ) )
            // InternalTPTP.g:4216:4: (lv_name_0_1= '$i' | lv_name_0_2= '$o' | lv_name_0_3= '$tType' )
            {
            // InternalTPTP.g:4216:4: (lv_name_0_1= '$i' | lv_name_0_2= '$o' | lv_name_0_3= '$tType' )
            int alt71=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt71=1;
                }
                break;
            case 38:
                {
                alt71=2;
                }
                break;
            case 39:
                {
                alt71=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // InternalTPTP.g:4217:5: lv_name_0_1= '$i'
                    {
                    lv_name_0_1=(Token)match(input,37,FOLLOW_2); 

                    					newLeafNode(lv_name_0_1, grammarAccess.getThf_type_literalAccess().getNameIKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getThf_type_literalRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:4228:5: lv_name_0_2= '$o'
                    {
                    lv_name_0_2=(Token)match(input,38,FOLLOW_2); 

                    					newLeafNode(lv_name_0_2, grammarAccess.getThf_type_literalAccess().getNameOKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getThf_type_literalRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalTPTP.g:4239:5: lv_name_0_3= '$tType'
                    {
                    lv_name_0_3=(Token)match(input,39,FOLLOW_2); 

                    					newLeafNode(lv_name_0_3, grammarAccess.getThf_type_literalAccess().getNameTTypeKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getThf_type_literalRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_3, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulethf_type_literal"


    // $ANTLR start "entryRulethf_expression"
    // InternalTPTP.g:4255:1: entryRulethf_expression returns [EObject current=null] : iv_rulethf_expression= rulethf_expression EOF ;
    public final EObject entryRulethf_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulethf_expression = null;


        try {
            // InternalTPTP.g:4255:55: (iv_rulethf_expression= rulethf_expression EOF )
            // InternalTPTP.g:4256:2: iv_rulethf_expression= rulethf_expression EOF
            {
             newCompositeNode(grammarAccess.getThf_expressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulethf_expression=rulethf_expression();

            state._fsp--;

             current =iv_rulethf_expression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulethf_expression"


    // $ANTLR start "rulethf_expression"
    // InternalTPTP.g:4262:1: rulethf_expression returns [EObject current=null] : (this_thf_terminating_expression_0= rulethf_terminating_expression ( () ( (lv_op_2_0= rulethf_binary_operator ) ) ( (lv_right_3_0= rulethf_terminating_expression ) ) )* ) ;
    public final EObject rulethf_expression() throws RecognitionException {
        EObject current = null;

        EObject this_thf_terminating_expression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:4268:2: ( (this_thf_terminating_expression_0= rulethf_terminating_expression ( () ( (lv_op_2_0= rulethf_binary_operator ) ) ( (lv_right_3_0= rulethf_terminating_expression ) ) )* ) )
            // InternalTPTP.g:4269:2: (this_thf_terminating_expression_0= rulethf_terminating_expression ( () ( (lv_op_2_0= rulethf_binary_operator ) ) ( (lv_right_3_0= rulethf_terminating_expression ) ) )* )
            {
            // InternalTPTP.g:4269:2: (this_thf_terminating_expression_0= rulethf_terminating_expression ( () ( (lv_op_2_0= rulethf_binary_operator ) ) ( (lv_right_3_0= rulethf_terminating_expression ) ) )* )
            // InternalTPTP.g:4270:3: this_thf_terminating_expression_0= rulethf_terminating_expression ( () ( (lv_op_2_0= rulethf_binary_operator ) ) ( (lv_right_3_0= rulethf_terminating_expression ) ) )*
            {

            			newCompositeNode(grammarAccess.getThf_expressionAccess().getThf_terminating_expressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_41);
            this_thf_terminating_expression_0=rulethf_terminating_expression();

            state._fsp--;


            			current = this_thf_terminating_expression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTPTP.g:4278:3: ( () ( (lv_op_2_0= rulethf_binary_operator ) ) ( (lv_right_3_0= rulethf_terminating_expression ) ) )*
            loop72:
            do {
                int alt72=2;
                alt72 = dfa72.predict(input);
                switch (alt72) {
            	case 1 :
            	    // InternalTPTP.g:4279:4: () ( (lv_op_2_0= rulethf_binary_operator ) ) ( (lv_right_3_0= rulethf_terminating_expression ) )
            	    {
            	    // InternalTPTP.g:4279:4: ()
            	    // InternalTPTP.g:4280:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getThf_expressionAccess().getBinaryLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalTPTP.g:4286:4: ( (lv_op_2_0= rulethf_binary_operator ) )
            	    // InternalTPTP.g:4287:5: (lv_op_2_0= rulethf_binary_operator )
            	    {
            	    // InternalTPTP.g:4287:5: (lv_op_2_0= rulethf_binary_operator )
            	    // InternalTPTP.g:4288:6: lv_op_2_0= rulethf_binary_operator
            	    {

            	    						newCompositeNode(grammarAccess.getThf_expressionAccess().getOpThf_binary_operatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_38);
            	    lv_op_2_0=rulethf_binary_operator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getThf_expressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"op",
            	    							lv_op_2_0,
            	    							"it.unibz.inf.tptp.TPTP.thf_binary_operator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalTPTP.g:4305:4: ( (lv_right_3_0= rulethf_terminating_expression ) )
            	    // InternalTPTP.g:4306:5: (lv_right_3_0= rulethf_terminating_expression )
            	    {
            	    // InternalTPTP.g:4306:5: (lv_right_3_0= rulethf_terminating_expression )
            	    // InternalTPTP.g:4307:6: lv_right_3_0= rulethf_terminating_expression
            	    {

            	    						newCompositeNode(grammarAccess.getThf_expressionAccess().getRightThf_terminating_expressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_41);
            	    lv_right_3_0=rulethf_terminating_expression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getThf_expressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"it.unibz.inf.tptp.TPTP.thf_terminating_expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulethf_expression"


    // $ANTLR start "entryRulethf_terminating_expression"
    // InternalTPTP.g:4329:1: entryRulethf_terminating_expression returns [EObject current=null] : iv_rulethf_terminating_expression= rulethf_terminating_expression EOF ;
    public final EObject entryRulethf_terminating_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulethf_terminating_expression = null;


        try {
            // InternalTPTP.g:4329:67: (iv_rulethf_terminating_expression= rulethf_terminating_expression EOF )
            // InternalTPTP.g:4330:2: iv_rulethf_terminating_expression= rulethf_terminating_expression EOF
            {
             newCompositeNode(grammarAccess.getThf_terminating_expressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulethf_terminating_expression=rulethf_terminating_expression();

            state._fsp--;

             current =iv_rulethf_terminating_expression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulethf_terminating_expression"


    // $ANTLR start "rulethf_terminating_expression"
    // InternalTPTP.g:4336:1: rulethf_terminating_expression returns [EObject current=null] : ( ( (lv_thf_atom_0_0= rulethf_atom ) ) | (otherlv_1= '(' this_thf_expression_2= rulethf_expression otherlv_3= ')' ) | ( ( (lv_thf_negation_4_0= '~' ) ) ( (lv_thf_exp_5_0= rulethf_expression ) ) ) | ( ( (lv_op_6_0= rulethf_unary_operator ) ) ( (lv_thf_exp_7_0= rulethf_expression ) ) ) | ( (lv_thf_exp_8_0= rulethf_quantifier_expression ) ) ) ;
    public final EObject rulethf_terminating_expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_thf_negation_4_0=null;
        EObject lv_thf_atom_0_0 = null;

        EObject this_thf_expression_2 = null;

        EObject lv_thf_exp_5_0 = null;

        AntlrDatatypeRuleToken lv_op_6_0 = null;

        EObject lv_thf_exp_7_0 = null;

        EObject lv_thf_exp_8_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:4342:2: ( ( ( (lv_thf_atom_0_0= rulethf_atom ) ) | (otherlv_1= '(' this_thf_expression_2= rulethf_expression otherlv_3= ')' ) | ( ( (lv_thf_negation_4_0= '~' ) ) ( (lv_thf_exp_5_0= rulethf_expression ) ) ) | ( ( (lv_op_6_0= rulethf_unary_operator ) ) ( (lv_thf_exp_7_0= rulethf_expression ) ) ) | ( (lv_thf_exp_8_0= rulethf_quantifier_expression ) ) ) )
            // InternalTPTP.g:4343:2: ( ( (lv_thf_atom_0_0= rulethf_atom ) ) | (otherlv_1= '(' this_thf_expression_2= rulethf_expression otherlv_3= ')' ) | ( ( (lv_thf_negation_4_0= '~' ) ) ( (lv_thf_exp_5_0= rulethf_expression ) ) ) | ( ( (lv_op_6_0= rulethf_unary_operator ) ) ( (lv_thf_exp_7_0= rulethf_expression ) ) ) | ( (lv_thf_exp_8_0= rulethf_quantifier_expression ) ) )
            {
            // InternalTPTP.g:4343:2: ( ( (lv_thf_atom_0_0= rulethf_atom ) ) | (otherlv_1= '(' this_thf_expression_2= rulethf_expression otherlv_3= ')' ) | ( ( (lv_thf_negation_4_0= '~' ) ) ( (lv_thf_exp_5_0= rulethf_expression ) ) ) | ( ( (lv_op_6_0= rulethf_unary_operator ) ) ( (lv_thf_exp_7_0= rulethf_expression ) ) ) | ( (lv_thf_exp_8_0= rulethf_quantifier_expression ) ) )
            int alt73=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_UPPER_TOKEN:
            case RULE_LOWER_TOKEN:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 26:
            case 27:
            case 34:
            case 67:
                {
                alt73=1;
                }
                break;
            case 23:
                {
                alt73=2;
                }
                break;
            case 25:
                {
                alt73=3;
                }
                break;
            case 68:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
                {
                alt73=4;
                }
                break;
            case 28:
            case 29:
            case 80:
                {
                alt73=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // InternalTPTP.g:4344:3: ( (lv_thf_atom_0_0= rulethf_atom ) )
                    {
                    // InternalTPTP.g:4344:3: ( (lv_thf_atom_0_0= rulethf_atom ) )
                    // InternalTPTP.g:4345:4: (lv_thf_atom_0_0= rulethf_atom )
                    {
                    // InternalTPTP.g:4345:4: (lv_thf_atom_0_0= rulethf_atom )
                    // InternalTPTP.g:4346:5: lv_thf_atom_0_0= rulethf_atom
                    {

                    					newCompositeNode(grammarAccess.getThf_terminating_expressionAccess().getThf_atomThf_atomParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_thf_atom_0_0=rulethf_atom();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getThf_terminating_expressionRule());
                    					}
                    					set(
                    						current,
                    						"thf_atom",
                    						lv_thf_atom_0_0,
                    						"it.unibz.inf.tptp.TPTP.thf_atom");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTPTP.g:4364:3: (otherlv_1= '(' this_thf_expression_2= rulethf_expression otherlv_3= ')' )
                    {
                    // InternalTPTP.g:4364:3: (otherlv_1= '(' this_thf_expression_2= rulethf_expression otherlv_3= ')' )
                    // InternalTPTP.g:4365:4: otherlv_1= '(' this_thf_expression_2= rulethf_expression otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_38); 

                    				newLeafNode(otherlv_1, grammarAccess.getThf_terminating_expressionAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getThf_terminating_expressionAccess().getThf_expressionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_15);
                    this_thf_expression_2=rulethf_expression();

                    state._fsp--;


                    				current = this_thf_expression_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getThf_terminating_expressionAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTPTP.g:4383:3: ( ( (lv_thf_negation_4_0= '~' ) ) ( (lv_thf_exp_5_0= rulethf_expression ) ) )
                    {
                    // InternalTPTP.g:4383:3: ( ( (lv_thf_negation_4_0= '~' ) ) ( (lv_thf_exp_5_0= rulethf_expression ) ) )
                    // InternalTPTP.g:4384:4: ( (lv_thf_negation_4_0= '~' ) ) ( (lv_thf_exp_5_0= rulethf_expression ) )
                    {
                    // InternalTPTP.g:4384:4: ( (lv_thf_negation_4_0= '~' ) )
                    // InternalTPTP.g:4385:5: (lv_thf_negation_4_0= '~' )
                    {
                    // InternalTPTP.g:4385:5: (lv_thf_negation_4_0= '~' )
                    // InternalTPTP.g:4386:6: lv_thf_negation_4_0= '~'
                    {
                    lv_thf_negation_4_0=(Token)match(input,25,FOLLOW_38); 

                    						newLeafNode(lv_thf_negation_4_0, grammarAccess.getThf_terminating_expressionAccess().getThf_negationTildeKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getThf_terminating_expressionRule());
                    						}
                    						setWithLastConsumed(current, "thf_negation", true, "~");
                    					

                    }


                    }

                    // InternalTPTP.g:4398:4: ( (lv_thf_exp_5_0= rulethf_expression ) )
                    // InternalTPTP.g:4399:5: (lv_thf_exp_5_0= rulethf_expression )
                    {
                    // InternalTPTP.g:4399:5: (lv_thf_exp_5_0= rulethf_expression )
                    // InternalTPTP.g:4400:6: lv_thf_exp_5_0= rulethf_expression
                    {

                    						newCompositeNode(grammarAccess.getThf_terminating_expressionAccess().getThf_expThf_expressionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_thf_exp_5_0=rulethf_expression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getThf_terminating_expressionRule());
                    						}
                    						set(
                    							current,
                    							"thf_exp",
                    							lv_thf_exp_5_0,
                    							"it.unibz.inf.tptp.TPTP.thf_expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalTPTP.g:4419:3: ( ( (lv_op_6_0= rulethf_unary_operator ) ) ( (lv_thf_exp_7_0= rulethf_expression ) ) )
                    {
                    // InternalTPTP.g:4419:3: ( ( (lv_op_6_0= rulethf_unary_operator ) ) ( (lv_thf_exp_7_0= rulethf_expression ) ) )
                    // InternalTPTP.g:4420:4: ( (lv_op_6_0= rulethf_unary_operator ) ) ( (lv_thf_exp_7_0= rulethf_expression ) )
                    {
                    // InternalTPTP.g:4420:4: ( (lv_op_6_0= rulethf_unary_operator ) )
                    // InternalTPTP.g:4421:5: (lv_op_6_0= rulethf_unary_operator )
                    {
                    // InternalTPTP.g:4421:5: (lv_op_6_0= rulethf_unary_operator )
                    // InternalTPTP.g:4422:6: lv_op_6_0= rulethf_unary_operator
                    {

                    						newCompositeNode(grammarAccess.getThf_terminating_expressionAccess().getOpThf_unary_operatorParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_op_6_0=rulethf_unary_operator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getThf_terminating_expressionRule());
                    						}
                    						set(
                    							current,
                    							"op",
                    							lv_op_6_0,
                    							"it.unibz.inf.tptp.TPTP.thf_unary_operator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTPTP.g:4439:4: ( (lv_thf_exp_7_0= rulethf_expression ) )
                    // InternalTPTP.g:4440:5: (lv_thf_exp_7_0= rulethf_expression )
                    {
                    // InternalTPTP.g:4440:5: (lv_thf_exp_7_0= rulethf_expression )
                    // InternalTPTP.g:4441:6: lv_thf_exp_7_0= rulethf_expression
                    {

                    						newCompositeNode(grammarAccess.getThf_terminating_expressionAccess().getThf_expThf_expressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_thf_exp_7_0=rulethf_expression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getThf_terminating_expressionRule());
                    						}
                    						set(
                    							current,
                    							"thf_exp",
                    							lv_thf_exp_7_0,
                    							"it.unibz.inf.tptp.TPTP.thf_expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalTPTP.g:4460:3: ( (lv_thf_exp_8_0= rulethf_quantifier_expression ) )
                    {
                    // InternalTPTP.g:4460:3: ( (lv_thf_exp_8_0= rulethf_quantifier_expression ) )
                    // InternalTPTP.g:4461:4: (lv_thf_exp_8_0= rulethf_quantifier_expression )
                    {
                    // InternalTPTP.g:4461:4: (lv_thf_exp_8_0= rulethf_quantifier_expression )
                    // InternalTPTP.g:4462:5: lv_thf_exp_8_0= rulethf_quantifier_expression
                    {

                    					newCompositeNode(grammarAccess.getThf_terminating_expressionAccess().getThf_expThf_quantifier_expressionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_thf_exp_8_0=rulethf_quantifier_expression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getThf_terminating_expressionRule());
                    					}
                    					set(
                    						current,
                    						"thf_exp",
                    						lv_thf_exp_8_0,
                    						"it.unibz.inf.tptp.TPTP.thf_quantifier_expression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulethf_terminating_expression"


    // $ANTLR start "entryRulethf_unary_operator"
    // InternalTPTP.g:4483:1: entryRulethf_unary_operator returns [String current=null] : iv_rulethf_unary_operator= rulethf_unary_operator EOF ;
    public final String entryRulethf_unary_operator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulethf_unary_operator = null;


        try {
            // InternalTPTP.g:4483:58: (iv_rulethf_unary_operator= rulethf_unary_operator EOF )
            // InternalTPTP.g:4484:2: iv_rulethf_unary_operator= rulethf_unary_operator EOF
            {
             newCompositeNode(grammarAccess.getThf_unary_operatorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulethf_unary_operator=rulethf_unary_operator();

            state._fsp--;

             current =iv_rulethf_unary_operator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulethf_unary_operator"


    // $ANTLR start "rulethf_unary_operator"
    // InternalTPTP.g:4490:1: rulethf_unary_operator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '@' | kw= '??' | kw= '!!' | kw= '&' | kw= '|' | kw= '=>' ) ;
    public final AntlrDatatypeRuleToken rulethf_unary_operator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTPTP.g:4496:2: ( (kw= '@' | kw= '??' | kw= '!!' | kw= '&' | kw= '|' | kw= '=>' ) )
            // InternalTPTP.g:4497:2: (kw= '@' | kw= '??' | kw= '!!' | kw= '&' | kw= '|' | kw= '=>' )
            {
            // InternalTPTP.g:4497:2: (kw= '@' | kw= '??' | kw= '!!' | kw= '&' | kw= '|' | kw= '=>' )
            int alt74=6;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt74=1;
                }
                break;
            case 73:
                {
                alt74=2;
                }
                break;
            case 74:
                {
                alt74=3;
                }
                break;
            case 75:
                {
                alt74=4;
                }
                break;
            case 68:
                {
                alt74=5;
                }
                break;
            case 76:
                {
                alt74=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // InternalTPTP.g:4498:3: kw= '@'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThf_unary_operatorAccess().getCommercialAtKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:4504:3: kw= '??'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThf_unary_operatorAccess().getQuestionMarkQuestionMarkKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalTPTP.g:4510:3: kw= '!!'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThf_unary_operatorAccess().getExclamationMarkExclamationMarkKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalTPTP.g:4516:3: kw= '&'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThf_unary_operatorAccess().getAmpersandKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalTPTP.g:4522:3: kw= '|'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThf_unary_operatorAccess().getVerticalLineKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalTPTP.g:4528:3: kw= '=>'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThf_unary_operatorAccess().getEqualsSignGreaterThanSignKeyword_5());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulethf_unary_operator"


    // $ANTLR start "entryRulethf_binary_operator"
    // InternalTPTP.g:4537:1: entryRulethf_binary_operator returns [String current=null] : iv_rulethf_binary_operator= rulethf_binary_operator EOF ;
    public final String entryRulethf_binary_operator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulethf_binary_operator = null;


        try {
            // InternalTPTP.g:4537:59: (iv_rulethf_binary_operator= rulethf_binary_operator EOF )
            // InternalTPTP.g:4538:2: iv_rulethf_binary_operator= rulethf_binary_operator EOF
            {
             newCompositeNode(grammarAccess.getThf_binary_operatorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulethf_binary_operator=rulethf_binary_operator();

            state._fsp--;

             current =iv_rulethf_binary_operator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulethf_binary_operator"


    // $ANTLR start "rulethf_binary_operator"
    // InternalTPTP.g:4544:1: rulethf_binary_operator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '&' | kw= '=>' | kw= '|' | kw= '@' | kw= '=' | kw= '!=' | kw= '<=' | kw= '<=>' | kw= '<~>' ) ;
    public final AntlrDatatypeRuleToken rulethf_binary_operator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTPTP.g:4550:2: ( (kw= '&' | kw= '=>' | kw= '|' | kw= '@' | kw= '=' | kw= '!=' | kw= '<=' | kw= '<=>' | kw= '<~>' ) )
            // InternalTPTP.g:4551:2: (kw= '&' | kw= '=>' | kw= '|' | kw= '@' | kw= '=' | kw= '!=' | kw= '<=' | kw= '<=>' | kw= '<~>' )
            {
            // InternalTPTP.g:4551:2: (kw= '&' | kw= '=>' | kw= '|' | kw= '@' | kw= '=' | kw= '!=' | kw= '<=' | kw= '<=>' | kw= '<~>' )
            int alt75=9;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt75=1;
                }
                break;
            case 76:
                {
                alt75=2;
                }
                break;
            case 68:
                {
                alt75=3;
                }
                break;
            case 72:
                {
                alt75=4;
                }
                break;
            case 69:
                {
                alt75=5;
                }
                break;
            case 70:
                {
                alt75=6;
                }
                break;
            case 77:
                {
                alt75=7;
                }
                break;
            case 78:
                {
                alt75=8;
                }
                break;
            case 79:
                {
                alt75=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // InternalTPTP.g:4552:3: kw= '&'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThf_binary_operatorAccess().getAmpersandKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:4558:3: kw= '=>'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThf_binary_operatorAccess().getEqualsSignGreaterThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalTPTP.g:4564:3: kw= '|'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThf_binary_operatorAccess().getVerticalLineKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalTPTP.g:4570:3: kw= '@'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThf_binary_operatorAccess().getCommercialAtKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalTPTP.g:4576:3: kw= '='
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThf_binary_operatorAccess().getEqualsSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalTPTP.g:4582:3: kw= '!='
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThf_binary_operatorAccess().getExclamationMarkEqualsSignKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalTPTP.g:4588:3: kw= '<='
                    {
                    kw=(Token)match(input,77,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThf_binary_operatorAccess().getLessThanSignEqualsSignKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalTPTP.g:4594:3: kw= '<=>'
                    {
                    kw=(Token)match(input,78,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThf_binary_operatorAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalTPTP.g:4600:3: kw= '<~>'
                    {
                    kw=(Token)match(input,79,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThf_binary_operatorAccess().getLessThanSignTildeGreaterThanSignKeyword_8());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulethf_binary_operator"


    // $ANTLR start "entryRulethf_atom"
    // InternalTPTP.g:4609:1: entryRulethf_atom returns [EObject current=null] : iv_rulethf_atom= rulethf_atom EOF ;
    public final EObject entryRulethf_atom() throws RecognitionException {
        EObject current = null;

        EObject iv_rulethf_atom = null;


        try {
            // InternalTPTP.g:4609:49: (iv_rulethf_atom= rulethf_atom EOF )
            // InternalTPTP.g:4610:2: iv_rulethf_atom= rulethf_atom EOF
            {
             newCompositeNode(grammarAccess.getThf_atomRule()); 
            pushFollow(FOLLOW_1);
            iv_rulethf_atom=rulethf_atom();

            state._fsp--;

             current =iv_rulethf_atom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulethf_atom"


    // $ANTLR start "rulethf_atom"
    // InternalTPTP.g:4616:1: rulethf_atom returns [EObject current=null] : (this_thf_constant_0= rulethf_constant | this_thf_var_1= rulethf_var | this_thf_atom_literal_2= rulethf_atom_literal ) ;
    public final EObject rulethf_atom() throws RecognitionException {
        EObject current = null;

        EObject this_thf_constant_0 = null;

        EObject this_thf_var_1 = null;

        EObject this_thf_atom_literal_2 = null;



        	enterRule();

        try {
            // InternalTPTP.g:4622:2: ( (this_thf_constant_0= rulethf_constant | this_thf_var_1= rulethf_var | this_thf_atom_literal_2= rulethf_atom_literal ) )
            // InternalTPTP.g:4623:2: (this_thf_constant_0= rulethf_constant | this_thf_var_1= rulethf_var | this_thf_atom_literal_2= rulethf_atom_literal )
            {
            // InternalTPTP.g:4623:2: (this_thf_constant_0= rulethf_constant | this_thf_var_1= rulethf_var | this_thf_atom_literal_2= rulethf_atom_literal )
            int alt76=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_LOWER_TOKEN:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 34:
            case 67:
                {
                alt76=1;
                }
                break;
            case RULE_UPPER_TOKEN:
                {
                alt76=2;
                }
                break;
            case 26:
            case 27:
                {
                alt76=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // InternalTPTP.g:4624:3: this_thf_constant_0= rulethf_constant
                    {

                    			newCompositeNode(grammarAccess.getThf_atomAccess().getThf_constantParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_thf_constant_0=rulethf_constant();

                    state._fsp--;


                    			current = this_thf_constant_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:4633:3: this_thf_var_1= rulethf_var
                    {

                    			newCompositeNode(grammarAccess.getThf_atomAccess().getThf_varParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_thf_var_1=rulethf_var();

                    state._fsp--;


                    			current = this_thf_var_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTPTP.g:4642:3: this_thf_atom_literal_2= rulethf_atom_literal
                    {

                    			newCompositeNode(grammarAccess.getThf_atomAccess().getThf_atom_literalParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_thf_atom_literal_2=rulethf_atom_literal();

                    state._fsp--;


                    			current = this_thf_atom_literal_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulethf_atom"


    // $ANTLR start "entryRulethf_atom_literal"
    // InternalTPTP.g:4654:1: entryRulethf_atom_literal returns [EObject current=null] : iv_rulethf_atom_literal= rulethf_atom_literal EOF ;
    public final EObject entryRulethf_atom_literal() throws RecognitionException {
        EObject current = null;

        EObject iv_rulethf_atom_literal = null;


        try {
            // InternalTPTP.g:4654:57: (iv_rulethf_atom_literal= rulethf_atom_literal EOF )
            // InternalTPTP.g:4655:2: iv_rulethf_atom_literal= rulethf_atom_literal EOF
            {
             newCompositeNode(grammarAccess.getThf_atom_literalRule()); 
            pushFollow(FOLLOW_1);
            iv_rulethf_atom_literal=rulethf_atom_literal();

            state._fsp--;

             current =iv_rulethf_atom_literal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulethf_atom_literal"


    // $ANTLR start "rulethf_atom_literal"
    // InternalTPTP.g:4661:1: rulethf_atom_literal returns [EObject current=null] : ( ( (lv_name_0_1= '$true' | lv_name_0_2= '$false' ) ) ) ;
    public final EObject rulethf_atom_literal() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;


        	enterRule();

        try {
            // InternalTPTP.g:4667:2: ( ( ( (lv_name_0_1= '$true' | lv_name_0_2= '$false' ) ) ) )
            // InternalTPTP.g:4668:2: ( ( (lv_name_0_1= '$true' | lv_name_0_2= '$false' ) ) )
            {
            // InternalTPTP.g:4668:2: ( ( (lv_name_0_1= '$true' | lv_name_0_2= '$false' ) ) )
            // InternalTPTP.g:4669:3: ( (lv_name_0_1= '$true' | lv_name_0_2= '$false' ) )
            {
            // InternalTPTP.g:4669:3: ( (lv_name_0_1= '$true' | lv_name_0_2= '$false' ) )
            // InternalTPTP.g:4670:4: (lv_name_0_1= '$true' | lv_name_0_2= '$false' )
            {
            // InternalTPTP.g:4670:4: (lv_name_0_1= '$true' | lv_name_0_2= '$false' )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==26) ) {
                alt77=1;
            }
            else if ( (LA77_0==27) ) {
                alt77=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // InternalTPTP.g:4671:5: lv_name_0_1= '$true'
                    {
                    lv_name_0_1=(Token)match(input,26,FOLLOW_2); 

                    					newLeafNode(lv_name_0_1, grammarAccess.getThf_atom_literalAccess().getNameTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getThf_atom_literalRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:4682:5: lv_name_0_2= '$false'
                    {
                    lv_name_0_2=(Token)match(input,27,FOLLOW_2); 

                    					newLeafNode(lv_name_0_2, grammarAccess.getThf_atom_literalAccess().getNameFalseKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getThf_atom_literalRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_2, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulethf_atom_literal"


    // $ANTLR start "entryRulethf_constant"
    // InternalTPTP.g:4698:1: entryRulethf_constant returns [EObject current=null] : iv_rulethf_constant= rulethf_constant EOF ;
    public final EObject entryRulethf_constant() throws RecognitionException {
        EObject current = null;

        EObject iv_rulethf_constant = null;


        try {
            // InternalTPTP.g:4698:53: (iv_rulethf_constant= rulethf_constant EOF )
            // InternalTPTP.g:4699:2: iv_rulethf_constant= rulethf_constant EOF
            {
             newCompositeNode(grammarAccess.getThf_constantRule()); 
            pushFollow(FOLLOW_1);
            iv_rulethf_constant=rulethf_constant();

            state._fsp--;

             current =iv_rulethf_constant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulethf_constant"


    // $ANTLR start "rulethf_constant"
    // InternalTPTP.g:4705:1: rulethf_constant returns [EObject current=null] : ( ( ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_thf_param_2_0= rulethf_atom ) ) (otherlv_3= ',' ( (lv_thf_param_4_0= rulethf_atom ) ) )* otherlv_5= ')' )? ) ;
    public final EObject rulethf_constant() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_2=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_0_1 = null;

        EObject lv_thf_param_2_0 = null;

        EObject lv_thf_param_4_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:4711:2: ( ( ( ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_thf_param_2_0= rulethf_atom ) ) (otherlv_3= ',' ( (lv_thf_param_4_0= rulethf_atom ) ) )* otherlv_5= ')' )? ) )
            // InternalTPTP.g:4712:2: ( ( ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_thf_param_2_0= rulethf_atom ) ) (otherlv_3= ',' ( (lv_thf_param_4_0= rulethf_atom ) ) )* otherlv_5= ')' )? )
            {
            // InternalTPTP.g:4712:2: ( ( ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_thf_param_2_0= rulethf_atom ) ) (otherlv_3= ',' ( (lv_thf_param_4_0= rulethf_atom ) ) )* otherlv_5= ')' )? )
            // InternalTPTP.g:4713:3: ( ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_thf_param_2_0= rulethf_atom ) ) (otherlv_3= ',' ( (lv_thf_param_4_0= rulethf_atom ) ) )* otherlv_5= ')' )?
            {
            // InternalTPTP.g:4713:3: ( ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) )
            // InternalTPTP.g:4714:4: ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) )
            {
            // InternalTPTP.g:4714:4: ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) )
            // InternalTPTP.g:4715:5: (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING )
            {
            // InternalTPTP.g:4715:5: (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RULE_LOWER_TOKEN||(LA78_0>=17 && LA78_0<=22)||LA78_0==34||LA78_0==67) ) {
                alt78=1;
            }
            else if ( (LA78_0==RULE_STRING) ) {
                alt78=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // InternalTPTP.g:4716:6: lv_name_0_1= rulelower_token_and_keyword
                    {

                    						newCompositeNode(grammarAccess.getThf_constantAccess().getNameLower_token_and_keywordParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_name_0_1=rulelower_token_and_keyword();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getThf_constantRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_0_1,
                    							"it.unibz.inf.tptp.TPTP.lower_token_and_keyword");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:4732:6: lv_name_0_2= RULE_STRING
                    {
                    lv_name_0_2=(Token)match(input,RULE_STRING,FOLLOW_16); 

                    						newLeafNode(lv_name_0_2, grammarAccess.getThf_constantAccess().getNameSTRINGTerminalRuleCall_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getThf_constantRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_0_2,
                    							"it.unibz.inf.tptp.TPTP.STRING");
                    					

                    }
                    break;

            }


            }


            }

            // InternalTPTP.g:4749:3: (otherlv_1= '(' ( (lv_thf_param_2_0= rulethf_atom ) ) (otherlv_3= ',' ( (lv_thf_param_4_0= rulethf_atom ) ) )* otherlv_5= ')' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==23) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalTPTP.g:4750:4: otherlv_1= '(' ( (lv_thf_param_2_0= rulethf_atom ) ) (otherlv_3= ',' ( (lv_thf_param_4_0= rulethf_atom ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_1, grammarAccess.getThf_constantAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalTPTP.g:4754:4: ( (lv_thf_param_2_0= rulethf_atom ) )
                    // InternalTPTP.g:4755:5: (lv_thf_param_2_0= rulethf_atom )
                    {
                    // InternalTPTP.g:4755:5: (lv_thf_param_2_0= rulethf_atom )
                    // InternalTPTP.g:4756:6: lv_thf_param_2_0= rulethf_atom
                    {

                    						newCompositeNode(grammarAccess.getThf_constantAccess().getThf_paramThf_atomParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_thf_param_2_0=rulethf_atom();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getThf_constantRule());
                    						}
                    						add(
                    							current,
                    							"thf_param",
                    							lv_thf_param_2_0,
                    							"it.unibz.inf.tptp.TPTP.thf_atom");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTPTP.g:4773:4: (otherlv_3= ',' ( (lv_thf_param_4_0= rulethf_atom ) ) )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==16) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // InternalTPTP.g:4774:5: otherlv_3= ',' ( (lv_thf_param_4_0= rulethf_atom ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_17); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getThf_constantAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalTPTP.g:4778:5: ( (lv_thf_param_4_0= rulethf_atom ) )
                    	    // InternalTPTP.g:4779:6: (lv_thf_param_4_0= rulethf_atom )
                    	    {
                    	    // InternalTPTP.g:4779:6: (lv_thf_param_4_0= rulethf_atom )
                    	    // InternalTPTP.g:4780:7: lv_thf_param_4_0= rulethf_atom
                    	    {

                    	    							newCompositeNode(grammarAccess.getThf_constantAccess().getThf_paramThf_atomParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_thf_param_4_0=rulethf_atom();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getThf_constantRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"thf_param",
                    	    								lv_thf_param_4_0,
                    	    								"it.unibz.inf.tptp.TPTP.thf_atom");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop79;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getThf_constantAccess().getRightParenthesisKeyword_1_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulethf_constant"


    // $ANTLR start "entryRulethf_var"
    // InternalTPTP.g:4807:1: entryRulethf_var returns [EObject current=null] : iv_rulethf_var= rulethf_var EOF ;
    public final EObject entryRulethf_var() throws RecognitionException {
        EObject current = null;

        EObject iv_rulethf_var = null;


        try {
            // InternalTPTP.g:4807:48: (iv_rulethf_var= rulethf_var EOF )
            // InternalTPTP.g:4808:2: iv_rulethf_var= rulethf_var EOF
            {
             newCompositeNode(grammarAccess.getThf_varRule()); 
            pushFollow(FOLLOW_1);
            iv_rulethf_var=rulethf_var();

            state._fsp--;

             current =iv_rulethf_var; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulethf_var"


    // $ANTLR start "rulethf_var"
    // InternalTPTP.g:4814:1: rulethf_var returns [EObject current=null] : ( (lv_name_0_0= RULE_UPPER_TOKEN ) ) ;
    public final EObject rulethf_var() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalTPTP.g:4820:2: ( ( (lv_name_0_0= RULE_UPPER_TOKEN ) ) )
            // InternalTPTP.g:4821:2: ( (lv_name_0_0= RULE_UPPER_TOKEN ) )
            {
            // InternalTPTP.g:4821:2: ( (lv_name_0_0= RULE_UPPER_TOKEN ) )
            // InternalTPTP.g:4822:3: (lv_name_0_0= RULE_UPPER_TOKEN )
            {
            // InternalTPTP.g:4822:3: (lv_name_0_0= RULE_UPPER_TOKEN )
            // InternalTPTP.g:4823:4: lv_name_0_0= RULE_UPPER_TOKEN
            {
            lv_name_0_0=(Token)match(input,RULE_UPPER_TOKEN,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getThf_varAccess().getNameUPPER_TOKENTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getThf_varRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"it.unibz.inf.tptp.TPTP.UPPER_TOKEN");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulethf_var"


    // $ANTLR start "entryRulethf_quantifier_expression"
    // InternalTPTP.g:4842:1: entryRulethf_quantifier_expression returns [EObject current=null] : iv_rulethf_quantifier_expression= rulethf_quantifier_expression EOF ;
    public final EObject entryRulethf_quantifier_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulethf_quantifier_expression = null;


        try {
            // InternalTPTP.g:4842:66: (iv_rulethf_quantifier_expression= rulethf_quantifier_expression EOF )
            // InternalTPTP.g:4843:2: iv_rulethf_quantifier_expression= rulethf_quantifier_expression EOF
            {
             newCompositeNode(grammarAccess.getThf_quantifier_expressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulethf_quantifier_expression=rulethf_quantifier_expression();

            state._fsp--;

             current =iv_rulethf_quantifier_expression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulethf_quantifier_expression"


    // $ANTLR start "rulethf_quantifier_expression"
    // InternalTPTP.g:4849:1: rulethf_quantifier_expression returns [EObject current=null] : ( ( ( (lv_quantifier_0_1= '!' | lv_quantifier_0_2= '?' | lv_quantifier_0_3= '^' ) ) ) otherlv_1= '[' ( (lv_param_2_0= rulethf_variable_list ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_exp_5_0= rulethf_expression ) ) ) ;
    public final EObject rulethf_quantifier_expression() throws RecognitionException {
        EObject current = null;

        Token lv_quantifier_0_1=null;
        Token lv_quantifier_0_2=null;
        Token lv_quantifier_0_3=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_param_2_0 = null;

        EObject lv_exp_5_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:4855:2: ( ( ( ( (lv_quantifier_0_1= '!' | lv_quantifier_0_2= '?' | lv_quantifier_0_3= '^' ) ) ) otherlv_1= '[' ( (lv_param_2_0= rulethf_variable_list ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_exp_5_0= rulethf_expression ) ) ) )
            // InternalTPTP.g:4856:2: ( ( ( (lv_quantifier_0_1= '!' | lv_quantifier_0_2= '?' | lv_quantifier_0_3= '^' ) ) ) otherlv_1= '[' ( (lv_param_2_0= rulethf_variable_list ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_exp_5_0= rulethf_expression ) ) )
            {
            // InternalTPTP.g:4856:2: ( ( ( (lv_quantifier_0_1= '!' | lv_quantifier_0_2= '?' | lv_quantifier_0_3= '^' ) ) ) otherlv_1= '[' ( (lv_param_2_0= rulethf_variable_list ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_exp_5_0= rulethf_expression ) ) )
            // InternalTPTP.g:4857:3: ( ( (lv_quantifier_0_1= '!' | lv_quantifier_0_2= '?' | lv_quantifier_0_3= '^' ) ) ) otherlv_1= '[' ( (lv_param_2_0= rulethf_variable_list ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_exp_5_0= rulethf_expression ) )
            {
            // InternalTPTP.g:4857:3: ( ( (lv_quantifier_0_1= '!' | lv_quantifier_0_2= '?' | lv_quantifier_0_3= '^' ) ) )
            // InternalTPTP.g:4858:4: ( (lv_quantifier_0_1= '!' | lv_quantifier_0_2= '?' | lv_quantifier_0_3= '^' ) )
            {
            // InternalTPTP.g:4858:4: ( (lv_quantifier_0_1= '!' | lv_quantifier_0_2= '?' | lv_quantifier_0_3= '^' ) )
            // InternalTPTP.g:4859:5: (lv_quantifier_0_1= '!' | lv_quantifier_0_2= '?' | lv_quantifier_0_3= '^' )
            {
            // InternalTPTP.g:4859:5: (lv_quantifier_0_1= '!' | lv_quantifier_0_2= '?' | lv_quantifier_0_3= '^' )
            int alt81=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt81=1;
                }
                break;
            case 29:
                {
                alt81=2;
                }
                break;
            case 80:
                {
                alt81=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // InternalTPTP.g:4860:6: lv_quantifier_0_1= '!'
                    {
                    lv_quantifier_0_1=(Token)match(input,28,FOLLOW_19); 

                    						newLeafNode(lv_quantifier_0_1, grammarAccess.getThf_quantifier_expressionAccess().getQuantifierExclamationMarkKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getThf_quantifier_expressionRule());
                    						}
                    						setWithLastConsumed(current, "quantifier", lv_quantifier_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:4871:6: lv_quantifier_0_2= '?'
                    {
                    lv_quantifier_0_2=(Token)match(input,29,FOLLOW_19); 

                    						newLeafNode(lv_quantifier_0_2, grammarAccess.getThf_quantifier_expressionAccess().getQuantifierQuestionMarkKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getThf_quantifier_expressionRule());
                    						}
                    						setWithLastConsumed(current, "quantifier", lv_quantifier_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalTPTP.g:4882:6: lv_quantifier_0_3= '^'
                    {
                    lv_quantifier_0_3=(Token)match(input,80,FOLLOW_19); 

                    						newLeafNode(lv_quantifier_0_3, grammarAccess.getThf_quantifier_expressionAccess().getQuantifierCircumflexAccentKeyword_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getThf_quantifier_expressionRule());
                    						}
                    						setWithLastConsumed(current, "quantifier", lv_quantifier_0_3, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getThf_quantifier_expressionAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalTPTP.g:4899:3: ( (lv_param_2_0= rulethf_variable_list ) )
            // InternalTPTP.g:4900:4: (lv_param_2_0= rulethf_variable_list )
            {
            // InternalTPTP.g:4900:4: (lv_param_2_0= rulethf_variable_list )
            // InternalTPTP.g:4901:5: lv_param_2_0= rulethf_variable_list
            {

            					newCompositeNode(grammarAccess.getThf_quantifier_expressionAccess().getParamThf_variable_listParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_param_2_0=rulethf_variable_list();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getThf_quantifier_expressionRule());
            					}
            					set(
            						current,
            						"param",
            						lv_param_2_0,
            						"it.unibz.inf.tptp.TPTP.thf_variable_list");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getThf_quantifier_expressionAccess().getRightSquareBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,32,FOLLOW_38); 

            			newLeafNode(otherlv_4, grammarAccess.getThf_quantifier_expressionAccess().getColonKeyword_4());
            		
            // InternalTPTP.g:4926:3: ( (lv_exp_5_0= rulethf_expression ) )
            // InternalTPTP.g:4927:4: (lv_exp_5_0= rulethf_expression )
            {
            // InternalTPTP.g:4927:4: (lv_exp_5_0= rulethf_expression )
            // InternalTPTP.g:4928:5: lv_exp_5_0= rulethf_expression
            {

            					newCompositeNode(grammarAccess.getThf_quantifier_expressionAccess().getExpThf_expressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_5_0=rulethf_expression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getThf_quantifier_expressionRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_5_0,
            						"it.unibz.inf.tptp.TPTP.thf_expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulethf_quantifier_expression"


    // $ANTLR start "entryRulethf_variable_list"
    // InternalTPTP.g:4949:1: entryRulethf_variable_list returns [EObject current=null] : iv_rulethf_variable_list= rulethf_variable_list EOF ;
    public final EObject entryRulethf_variable_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulethf_variable_list = null;


        try {
            // InternalTPTP.g:4949:58: (iv_rulethf_variable_list= rulethf_variable_list EOF )
            // InternalTPTP.g:4950:2: iv_rulethf_variable_list= rulethf_variable_list EOF
            {
             newCompositeNode(grammarAccess.getThf_variable_listRule()); 
            pushFollow(FOLLOW_1);
            iv_rulethf_variable_list=rulethf_variable_list();

            state._fsp--;

             current =iv_rulethf_variable_list; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulethf_variable_list"


    // $ANTLR start "rulethf_variable_list"
    // InternalTPTP.g:4956:1: rulethf_variable_list returns [EObject current=null] : ( ( (lv_params_0_0= rulethf_var_declaration ) ) (otherlv_1= ',' ( (lv_params_2_0= rulethf_var_declaration ) ) )* ) ;
    public final EObject rulethf_variable_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_params_0_0 = null;

        EObject lv_params_2_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:4962:2: ( ( ( (lv_params_0_0= rulethf_var_declaration ) ) (otherlv_1= ',' ( (lv_params_2_0= rulethf_var_declaration ) ) )* ) )
            // InternalTPTP.g:4963:2: ( ( (lv_params_0_0= rulethf_var_declaration ) ) (otherlv_1= ',' ( (lv_params_2_0= rulethf_var_declaration ) ) )* )
            {
            // InternalTPTP.g:4963:2: ( ( (lv_params_0_0= rulethf_var_declaration ) ) (otherlv_1= ',' ( (lv_params_2_0= rulethf_var_declaration ) ) )* )
            // InternalTPTP.g:4964:3: ( (lv_params_0_0= rulethf_var_declaration ) ) (otherlv_1= ',' ( (lv_params_2_0= rulethf_var_declaration ) ) )*
            {
            // InternalTPTP.g:4964:3: ( (lv_params_0_0= rulethf_var_declaration ) )
            // InternalTPTP.g:4965:4: (lv_params_0_0= rulethf_var_declaration )
            {
            // InternalTPTP.g:4965:4: (lv_params_0_0= rulethf_var_declaration )
            // InternalTPTP.g:4966:5: lv_params_0_0= rulethf_var_declaration
            {

            					newCompositeNode(grammarAccess.getThf_variable_listAccess().getParamsThf_var_declarationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_23);
            lv_params_0_0=rulethf_var_declaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getThf_variable_listRule());
            					}
            					add(
            						current,
            						"params",
            						lv_params_0_0,
            						"it.unibz.inf.tptp.TPTP.thf_var_declaration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTPTP.g:4983:3: (otherlv_1= ',' ( (lv_params_2_0= rulethf_var_declaration ) ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==16) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // InternalTPTP.g:4984:4: otherlv_1= ',' ( (lv_params_2_0= rulethf_var_declaration ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_20); 

            	    				newLeafNode(otherlv_1, grammarAccess.getThf_variable_listAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalTPTP.g:4988:4: ( (lv_params_2_0= rulethf_var_declaration ) )
            	    // InternalTPTP.g:4989:5: (lv_params_2_0= rulethf_var_declaration )
            	    {
            	    // InternalTPTP.g:4989:5: (lv_params_2_0= rulethf_var_declaration )
            	    // InternalTPTP.g:4990:6: lv_params_2_0= rulethf_var_declaration
            	    {

            	    						newCompositeNode(grammarAccess.getThf_variable_listAccess().getParamsThf_var_declarationParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_params_2_0=rulethf_var_declaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getThf_variable_listRule());
            	    						}
            	    						add(
            	    							current,
            	    							"params",
            	    							lv_params_2_0,
            	    							"it.unibz.inf.tptp.TPTP.thf_var_declaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulethf_variable_list"


    // $ANTLR start "entryRulethf_var_declaration"
    // InternalTPTP.g:5012:1: entryRulethf_var_declaration returns [EObject current=null] : iv_rulethf_var_declaration= rulethf_var_declaration EOF ;
    public final EObject entryRulethf_var_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulethf_var_declaration = null;


        try {
            // InternalTPTP.g:5012:60: (iv_rulethf_var_declaration= rulethf_var_declaration EOF )
            // InternalTPTP.g:5013:2: iv_rulethf_var_declaration= rulethf_var_declaration EOF
            {
             newCompositeNode(grammarAccess.getThf_var_declarationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulethf_var_declaration=rulethf_var_declaration();

            state._fsp--;

             current =iv_rulethf_var_declaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulethf_var_declaration"


    // $ANTLR start "rulethf_var_declaration"
    // InternalTPTP.g:5019:1: rulethf_var_declaration returns [EObject current=null] : ( ( (lv_var_0_0= rulethf_var ) ) otherlv_1= ':' ( (lv_vartype_2_0= rulethf_type_expression ) ) ) ;
    public final EObject rulethf_var_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_var_0_0 = null;

        EObject lv_vartype_2_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:5025:2: ( ( ( (lv_var_0_0= rulethf_var ) ) otherlv_1= ':' ( (lv_vartype_2_0= rulethf_type_expression ) ) ) )
            // InternalTPTP.g:5026:2: ( ( (lv_var_0_0= rulethf_var ) ) otherlv_1= ':' ( (lv_vartype_2_0= rulethf_type_expression ) ) )
            {
            // InternalTPTP.g:5026:2: ( ( (lv_var_0_0= rulethf_var ) ) otherlv_1= ':' ( (lv_vartype_2_0= rulethf_type_expression ) ) )
            // InternalTPTP.g:5027:3: ( (lv_var_0_0= rulethf_var ) ) otherlv_1= ':' ( (lv_vartype_2_0= rulethf_type_expression ) )
            {
            // InternalTPTP.g:5027:3: ( (lv_var_0_0= rulethf_var ) )
            // InternalTPTP.g:5028:4: (lv_var_0_0= rulethf_var )
            {
            // InternalTPTP.g:5028:4: (lv_var_0_0= rulethf_var )
            // InternalTPTP.g:5029:5: lv_var_0_0= rulethf_var
            {

            					newCompositeNode(grammarAccess.getThf_var_declarationAccess().getVarThf_varParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_22);
            lv_var_0_0=rulethf_var();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getThf_var_declarationRule());
            					}
            					set(
            						current,
            						"var",
            						lv_var_0_0,
            						"it.unibz.inf.tptp.TPTP.thf_var");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getThf_var_declarationAccess().getColonKeyword_1());
            		
            // InternalTPTP.g:5050:3: ( (lv_vartype_2_0= rulethf_type_expression ) )
            // InternalTPTP.g:5051:4: (lv_vartype_2_0= rulethf_type_expression )
            {
            // InternalTPTP.g:5051:4: (lv_vartype_2_0= rulethf_type_expression )
            // InternalTPTP.g:5052:5: lv_vartype_2_0= rulethf_type_expression
            {

            					newCompositeNode(grammarAccess.getThf_var_declarationAccess().getVartypeThf_type_expressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_vartype_2_0=rulethf_type_expression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getThf_var_declarationRule());
            					}
            					set(
            						current,
            						"vartype",
            						lv_vartype_2_0,
            						"it.unibz.inf.tptp.TPTP.thf_type_expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulethf_var_declaration"


    // $ANTLR start "entryRulebinary_operator"
    // InternalTPTP.g:5073:1: entryRulebinary_operator returns [String current=null] : iv_rulebinary_operator= rulebinary_operator EOF ;
    public final String entryRulebinary_operator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulebinary_operator = null;


        try {
            // InternalTPTP.g:5073:55: (iv_rulebinary_operator= rulebinary_operator EOF )
            // InternalTPTP.g:5074:2: iv_rulebinary_operator= rulebinary_operator EOF
            {
             newCompositeNode(grammarAccess.getBinary_operatorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulebinary_operator=rulebinary_operator();

            state._fsp--;

             current =iv_rulebinary_operator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulebinary_operator"


    // $ANTLR start "rulebinary_operator"
    // InternalTPTP.g:5080:1: rulebinary_operator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!=' | kw= '=' | kw= '|' | kw= '&' | kw= '=>' | kw= '<=>' | kw= '<=' | kw= '<~>' | kw= '~|' | kw= '~&' ) ;
    public final AntlrDatatypeRuleToken rulebinary_operator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTPTP.g:5086:2: ( (kw= '!=' | kw= '=' | kw= '|' | kw= '&' | kw= '=>' | kw= '<=>' | kw= '<=' | kw= '<~>' | kw= '~|' | kw= '~&' ) )
            // InternalTPTP.g:5087:2: (kw= '!=' | kw= '=' | kw= '|' | kw= '&' | kw= '=>' | kw= '<=>' | kw= '<=' | kw= '<~>' | kw= '~|' | kw= '~&' )
            {
            // InternalTPTP.g:5087:2: (kw= '!=' | kw= '=' | kw= '|' | kw= '&' | kw= '=>' | kw= '<=>' | kw= '<=' | kw= '<~>' | kw= '~|' | kw= '~&' )
            int alt83=10;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt83=1;
                }
                break;
            case 69:
                {
                alt83=2;
                }
                break;
            case 68:
                {
                alt83=3;
                }
                break;
            case 75:
                {
                alt83=4;
                }
                break;
            case 76:
                {
                alt83=5;
                }
                break;
            case 78:
                {
                alt83=6;
                }
                break;
            case 77:
                {
                alt83=7;
                }
                break;
            case 79:
                {
                alt83=8;
                }
                break;
            case 81:
                {
                alt83=9;
                }
                break;
            case 82:
                {
                alt83=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // InternalTPTP.g:5088:3: kw= '!='
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinary_operatorAccess().getExclamationMarkEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:5094:3: kw= '='
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinary_operatorAccess().getEqualsSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalTPTP.g:5100:3: kw= '|'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinary_operatorAccess().getVerticalLineKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalTPTP.g:5106:3: kw= '&'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinary_operatorAccess().getAmpersandKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalTPTP.g:5112:3: kw= '=>'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinary_operatorAccess().getEqualsSignGreaterThanSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalTPTP.g:5118:3: kw= '<=>'
                    {
                    kw=(Token)match(input,78,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinary_operatorAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalTPTP.g:5124:3: kw= '<='
                    {
                    kw=(Token)match(input,77,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinary_operatorAccess().getLessThanSignEqualsSignKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalTPTP.g:5130:3: kw= '<~>'
                    {
                    kw=(Token)match(input,79,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinary_operatorAccess().getLessThanSignTildeGreaterThanSignKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalTPTP.g:5136:3: kw= '~|'
                    {
                    kw=(Token)match(input,81,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinary_operatorAccess().getTildeVerticalLineKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalTPTP.g:5142:3: kw= '~&'
                    {
                    kw=(Token)match(input,82,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinary_operatorAccess().getTildeAmpersandKeyword_9());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulebinary_operator"


    // $ANTLR start "entryRulelower_token_and_keyword"
    // InternalTPTP.g:5151:1: entryRulelower_token_and_keyword returns [String current=null] : iv_rulelower_token_and_keyword= rulelower_token_and_keyword EOF ;
    public final String entryRulelower_token_and_keyword() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelower_token_and_keyword = null;


        try {
            // InternalTPTP.g:5151:63: (iv_rulelower_token_and_keyword= rulelower_token_and_keyword EOF )
            // InternalTPTP.g:5152:2: iv_rulelower_token_and_keyword= rulelower_token_and_keyword EOF
            {
             newCompositeNode(grammarAccess.getLower_token_and_keywordRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelower_token_and_keyword=rulelower_token_and_keyword();

            state._fsp--;

             current =iv_rulelower_token_and_keyword.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulelower_token_and_keyword"


    // $ANTLR start "rulelower_token_and_keyword"
    // InternalTPTP.g:5158:1: rulelower_token_and_keyword returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'axiom' | kw= 'hypothesis' | kw= 'negated_conjecture' | kw= 'conjecture' | kw= 'definition' | kw= 'lemma' | kw= 'type' | kw= 'plain' | this_LOWER_TOKEN_8= RULE_LOWER_TOKEN ) ;
    public final AntlrDatatypeRuleToken rulelower_token_and_keyword() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_LOWER_TOKEN_8=null;


        	enterRule();

        try {
            // InternalTPTP.g:5164:2: ( (kw= 'axiom' | kw= 'hypothesis' | kw= 'negated_conjecture' | kw= 'conjecture' | kw= 'definition' | kw= 'lemma' | kw= 'type' | kw= 'plain' | this_LOWER_TOKEN_8= RULE_LOWER_TOKEN ) )
            // InternalTPTP.g:5165:2: (kw= 'axiom' | kw= 'hypothesis' | kw= 'negated_conjecture' | kw= 'conjecture' | kw= 'definition' | kw= 'lemma' | kw= 'type' | kw= 'plain' | this_LOWER_TOKEN_8= RULE_LOWER_TOKEN )
            {
            // InternalTPTP.g:5165:2: (kw= 'axiom' | kw= 'hypothesis' | kw= 'negated_conjecture' | kw= 'conjecture' | kw= 'definition' | kw= 'lemma' | kw= 'type' | kw= 'plain' | this_LOWER_TOKEN_8= RULE_LOWER_TOKEN )
            int alt84=9;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt84=1;
                }
                break;
            case 18:
                {
                alt84=2;
                }
                break;
            case 19:
                {
                alt84=3;
                }
                break;
            case 20:
                {
                alt84=4;
                }
                break;
            case 21:
                {
                alt84=5;
                }
                break;
            case 22:
                {
                alt84=6;
                }
                break;
            case 34:
                {
                alt84=7;
                }
                break;
            case 67:
                {
                alt84=8;
                }
                break;
            case RULE_LOWER_TOKEN:
                {
                alt84=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }

            switch (alt84) {
                case 1 :
                    // InternalTPTP.g:5166:3: kw= 'axiom'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLower_token_and_keywordAccess().getAxiomKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:5172:3: kw= 'hypothesis'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLower_token_and_keywordAccess().getHypothesisKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalTPTP.g:5178:3: kw= 'negated_conjecture'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLower_token_and_keywordAccess().getNegated_conjectureKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalTPTP.g:5184:3: kw= 'conjecture'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLower_token_and_keywordAccess().getConjectureKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalTPTP.g:5190:3: kw= 'definition'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLower_token_and_keywordAccess().getDefinitionKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalTPTP.g:5196:3: kw= 'lemma'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLower_token_and_keywordAccess().getLemmaKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalTPTP.g:5202:3: kw= 'type'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLower_token_and_keywordAccess().getTypeKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalTPTP.g:5208:3: kw= 'plain'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLower_token_and_keywordAccess().getPlainKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalTPTP.g:5214:3: this_LOWER_TOKEN_8= RULE_LOWER_TOKEN
                    {
                    this_LOWER_TOKEN_8=(Token)match(input,RULE_LOWER_TOKEN,FOLLOW_2); 

                    			current.merge(this_LOWER_TOKEN_8);
                    		

                    			newLeafNode(this_LOWER_TOKEN_8, grammarAccess.getLower_token_and_keywordAccess().getLOWER_TOKENTerminalRuleCall_8());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelower_token_and_keyword"

    // Delegated rules


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA72 dfa72 = new DFA72(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\1\13\uffff";
    static final String dfa_3s = "\1\16\13\uffff";
    static final String dfa_4s = "\1\122\13\uffff";
    static final String dfa_5s = "\1\uffff\1\2\12\1";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\11\uffff\1\1\53\uffff\1\4\1\3\1\2\4\uffff\1\5\1\6\1\10\1\7\1\11\1\uffff\1\12\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 448:3: ( () ( (lv_op_2_0= rulebinary_operator ) ) ( (lv_right_3_0= rulefof_terminating_expression ) ) )*";
        }
    }
    static final String dfa_8s = "\17\uffff";
    static final String dfa_9s = "\1\41\1\4\12\20\1\21\2\uffff";
    static final String dfa_10s = "\1\41\1\103\12\20\1\42\2\uffff";
    static final String dfa_11s = "\15\uffff\1\2\1\1";
    static final String dfa_12s = "\17\uffff}>";
    static final String[] dfa_13s = {
            "\1\1",
            "\1\13\1\uffff\1\12\12\uffff\1\2\1\3\1\4\1\5\1\6\1\7\13\uffff\1\10\40\uffff\1\11",
            "\1\14",
            "\1\14",
            "\1\14",
            "\1\14",
            "\1\14",
            "\1\14",
            "\1\14",
            "\1\14",
            "\1\14",
            "\1\14",
            "\6\16\13\uffff\1\15",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1054:2: ( (otherlv_0= 'tff(' ( ( (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING ) ) ) otherlv_2= ',' ( ( (lv_formula_role_3_1= 'axiom' | lv_formula_role_3_2= 'hypothesis' | lv_formula_role_3_3= 'negated_conjecture' | lv_formula_role_3_4= 'conjecture' | lv_formula_role_3_5= 'definition' | lv_formula_role_3_6= 'lemma' ) ) ) otherlv_4= ',' ( (lv_exp_5_0= ruletff_expression ) ) otherlv_6= ').' ) | (otherlv_7= 'tff(' ( ( (lv_name_8_1= rulelower_token_and_keyword | lv_name_8_2= RULE_STRING ) ) ) otherlv_9= ',' ( (lv_formula_role_10_0= 'type' ) ) otherlv_11= ',' ( (lv_def_12_0= ruletff_formula_type_definition ) ) otherlv_13= ').' ) )";
        }
    }
    static final String[] dfa_14s = {
            "\1\1\1\uffff\1\1\7\uffff\1\1\53\uffff\1\4\1\3\1\2\4\uffff\1\5\1\6\1\10\1\7\1\11\1\uffff\1\12\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()* loopback of 1805:3: ( () ( (lv_op_2_0= rulebinary_operator ) ) ( (lv_right_3_0= ruletff_terminating_expression ) ) )*";
        }
    }
    static final String dfa_15s = "\1\uffff\11\12\2\uffff";
    static final String dfa_16s = "\1\4\11\16\2\uffff";
    static final String dfa_17s = "\1\103\11\122\2\uffff";
    static final String dfa_18s = "\12\uffff\1\1\1\2";
    static final String[] dfa_19s = {
            "\1\12\1\uffff\1\11\12\uffff\1\1\1\2\1\3\1\4\1\5\1\6\13\uffff\1\7\40\uffff\1\10",
            "\1\12\1\uffff\1\12\6\uffff\2\12\22\uffff\1\13\30\uffff\3\12\4\uffff\5\12\1\uffff\2\12",
            "\1\12\1\uffff\1\12\6\uffff\2\12\22\uffff\1\13\30\uffff\3\12\4\uffff\5\12\1\uffff\2\12",
            "\1\12\1\uffff\1\12\6\uffff\2\12\22\uffff\1\13\30\uffff\3\12\4\uffff\5\12\1\uffff\2\12",
            "\1\12\1\uffff\1\12\6\uffff\2\12\22\uffff\1\13\30\uffff\3\12\4\uffff\5\12\1\uffff\2\12",
            "\1\12\1\uffff\1\12\6\uffff\2\12\22\uffff\1\13\30\uffff\3\12\4\uffff\5\12\1\uffff\2\12",
            "\1\12\1\uffff\1\12\6\uffff\2\12\22\uffff\1\13\30\uffff\3\12\4\uffff\5\12\1\uffff\2\12",
            "\1\12\1\uffff\1\12\6\uffff\2\12\22\uffff\1\13\30\uffff\3\12\4\uffff\5\12\1\uffff\2\12",
            "\1\12\1\uffff\1\12\6\uffff\2\12\22\uffff\1\13\30\uffff\3\12\4\uffff\5\12\1\uffff\2\12",
            "\1\12\1\uffff\1\12\6\uffff\2\12\22\uffff\1\13\30\uffff\3\12\4\uffff\5\12\1\uffff\2\12",
            "",
            ""
    };
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = dfa_1;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_6;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "2046:2: ( ( ( ( (lv_name_0_1= rulelower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_param_2_0= ruletff_atom ) ) (otherlv_3= ',' ( (lv_param_4_0= ruletff_atom ) ) )* otherlv_5= ')' )? ) | ( ( (lv_top_6_0= rulelower_token_and_keyword ) ) ( (lv_name_7_0= '/' ) ) ( (lv_bottom_8_0= rulelower_token_and_keyword ) ) ) )";
        }
    }
    static final String dfa_20s = "\1\107\1\4\12\20\1\21\2\uffff";
    static final String dfa_21s = "\1\107\1\103\12\20\1\42\2\uffff";
    static final String dfa_22s = "\15\uffff\1\1\1\2";
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "3660:2: ( (otherlv_0= 'thf(' ( ( (lv_name_1_1= rulelower_token_and_keyword | lv_name_1_2= RULE_STRING ) ) ) otherlv_2= ',' ( (lv_formula_role_3_0= 'type' ) ) otherlv_4= ',' ( (lv_def_5_0= rulethf_formula_type_definition ) ) otherlv_6= ').' ) | (otherlv_7= 'thf(' ( ( (lv_name_8_1= rulelower_token_and_keyword | lv_name_8_2= RULE_STRING ) ) ) otherlv_9= ',' ( ( (lv_formula_role_10_1= 'axiom' | lv_formula_role_10_2= 'hypothesis' | lv_formula_role_10_3= 'negated_conjecture' | lv_formula_role_10_4= 'conjecture' | lv_formula_role_10_5= 'definition' | lv_formula_role_10_6= 'lemma' ) ) ) otherlv_11= ',' ( (lv_thf_exp_12_0= rulethf_expression ) ) otherlv_13= ').' ) )";
        }
    }
    static final String dfa_23s = "\13\uffff";
    static final String dfa_24s = "\1\1\12\uffff";
    static final String dfa_25s = "\1\16\12\uffff";
    static final String dfa_26s = "\1\117\12\uffff";
    static final String dfa_27s = "\1\uffff\1\2\11\1";
    static final String dfa_28s = "\13\uffff}>";
    static final String[] dfa_29s = {
            "\1\1\11\uffff\1\1\53\uffff\1\4\1\6\1\7\1\uffff\1\5\2\uffff\1\2\1\3\1\10\1\11\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final char[] dfa_25 = DFA.unpackEncodedStringToUnsignedChars(dfa_25s);
    static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final short[][] dfa_29 = unpackEncodedStringArray(dfa_29s);

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = dfa_23;
            this.eof = dfa_24;
            this.min = dfa_25;
            this.max = dfa_26;
            this.accept = dfa_27;
            this.special = dfa_28;
            this.transition = dfa_29;
        }
        public String getDescription() {
            return "()* loopback of 4278:3: ( () ( (lv_op_2_0= rulethf_binary_operator ) ) ( (lv_right_3_0= rulethf_terminating_expression ) ) )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000020000A002L,0x0000000000000084L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000A002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000020000A002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000A002L,0x0000000000000004L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000A002L,0x0000000000000080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000004007E0050L,0x0000000000000008L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000007E0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000043EFE0070L,0x0000000000000008L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000002L,0x000000000006F870L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000040C7E0070L,0x0000000000000008L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0xFFFFF0043EFE0070L,0x0000000000000009L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400FE0050L,0x0000000000000008L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000007E400FE0070L,0x000000000000000AL});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000007E4007E0070L,0x0000000000000008L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0xFFFFF0040C7E0070L,0x0000000000000009L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000004007E0040L,0x0000000000000008L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000000000E0000L,0x0000000000000008L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000000040EFE0070L,0x0000000000000008L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000000043EFE0070L,0x0000000000011F18L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000000E400FE0050L,0x0000000000000008L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000002L,0x000000000000F970L});

}