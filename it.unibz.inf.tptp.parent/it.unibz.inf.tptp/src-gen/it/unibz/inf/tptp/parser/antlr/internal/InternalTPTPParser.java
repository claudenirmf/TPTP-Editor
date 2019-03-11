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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_UPPER_TOKEN", "RULE_LOWER_TOKEN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ID", "RULE_INT", "RULE_ANY_OTHER", "'include'", "'('", "')'", "'.'", "'fof'", "','", "'axiom'", "'hypothesis'", "'negated_conjecture'", "'conjecture'", "'definition'", "'lemma'", "'~'", "'$true'", "'$false'", "'!'", "'?'", "'['", "']'", "':'", "'tff'", "'type'", "'>'", "'*'", "'$i'", "'$o'", "'$tType'", "'$int'", "'$real'", "'$rat'", "'/'", "'$is_int'", "'$is_rat'", "'$uminus'", "'$to_int'", "'$to_rat'", "'$to_real'", "'$less'", "'$sum'", "'$difference'", "'$product'", "'$quotient'", "'$quotient_e'", "'$quotient_t'", "'$quotient_f'", "'$remainder_e'", "'$remainder_t'", "'$remainder_f'", "'$greatereq'", "'$lesseq'", "'$greater'", "'$eq'", "'!>'", "'cnf'", "'plain'", "'|'", "'='", "'!='", "'thf'", "'@'", "'??'", "'!!'", "'&'", "'=>'", "'<='", "'<=>'", "'<~>'", "'^'", "'~|'", "'~&'"
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
    // InternalTPTP.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_TPTP_input_0_0= ruleInclude ) )* ( ( (lv_TPTP_input_1_0= ruleFof_input ) )* | ( (lv_TPTP_input_2_0= ruleTff_input ) )* | ( (lv_TPTP_input_3_0= ruleCnf_input ) )* | ( (lv_TPTP_input_4_0= ruleThf_input ) )* ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_TPTP_input_0_0 = null;

        EObject lv_TPTP_input_1_0 = null;

        EObject lv_TPTP_input_2_0 = null;

        EObject lv_TPTP_input_3_0 = null;

        EObject lv_TPTP_input_4_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:77:2: ( ( ( (lv_TPTP_input_0_0= ruleInclude ) )* ( ( (lv_TPTP_input_1_0= ruleFof_input ) )* | ( (lv_TPTP_input_2_0= ruleTff_input ) )* | ( (lv_TPTP_input_3_0= ruleCnf_input ) )* | ( (lv_TPTP_input_4_0= ruleThf_input ) )* ) ) )
            // InternalTPTP.g:78:2: ( ( (lv_TPTP_input_0_0= ruleInclude ) )* ( ( (lv_TPTP_input_1_0= ruleFof_input ) )* | ( (lv_TPTP_input_2_0= ruleTff_input ) )* | ( (lv_TPTP_input_3_0= ruleCnf_input ) )* | ( (lv_TPTP_input_4_0= ruleThf_input ) )* ) )
            {
            // InternalTPTP.g:78:2: ( ( (lv_TPTP_input_0_0= ruleInclude ) )* ( ( (lv_TPTP_input_1_0= ruleFof_input ) )* | ( (lv_TPTP_input_2_0= ruleTff_input ) )* | ( (lv_TPTP_input_3_0= ruleCnf_input ) )* | ( (lv_TPTP_input_4_0= ruleThf_input ) )* ) )
            // InternalTPTP.g:79:3: ( (lv_TPTP_input_0_0= ruleInclude ) )* ( ( (lv_TPTP_input_1_0= ruleFof_input ) )* | ( (lv_TPTP_input_2_0= ruleTff_input ) )* | ( (lv_TPTP_input_3_0= ruleCnf_input ) )* | ( (lv_TPTP_input_4_0= ruleThf_input ) )* )
            {
            // InternalTPTP.g:79:3: ( (lv_TPTP_input_0_0= ruleInclude ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==14) ) {
                        int LA1_3 = input.LA(3);

                        if ( (LA1_3==RULE_STRING) ) {
                            int LA1_4 = input.LA(4);

                            if ( (LA1_4==15) ) {
                                int LA1_5 = input.LA(5);

                                if ( (LA1_5==16) ) {
                                    alt1=1;
                                }


                            }


                        }


                    }


                }


                switch (alt1) {
            	case 1 :
            	    // InternalTPTP.g:80:4: (lv_TPTP_input_0_0= ruleInclude )
            	    {
            	    // InternalTPTP.g:80:4: (lv_TPTP_input_0_0= ruleInclude )
            	    // InternalTPTP.g:81:5: lv_TPTP_input_0_0= ruleInclude
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getTPTP_inputIncludeParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_TPTP_input_0_0=ruleInclude();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"TPTP_input",
            	    						lv_TPTP_input_0_0,
            	    						"it.unibz.inf.tptp.TPTP.Include");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalTPTP.g:98:3: ( ( (lv_TPTP_input_1_0= ruleFof_input ) )* | ( (lv_TPTP_input_2_0= ruleTff_input ) )* | ( (lv_TPTP_input_3_0= ruleCnf_input ) )* | ( (lv_TPTP_input_4_0= ruleThf_input ) )* )
            int alt6=4;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalTPTP.g:99:4: ( (lv_TPTP_input_1_0= ruleFof_input ) )*
                    {
                    // InternalTPTP.g:99:4: ( (lv_TPTP_input_1_0= ruleFof_input ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==13||LA2_0==17) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalTPTP.g:100:5: (lv_TPTP_input_1_0= ruleFof_input )
                    	    {
                    	    // InternalTPTP.g:100:5: (lv_TPTP_input_1_0= ruleFof_input )
                    	    // InternalTPTP.g:101:6: lv_TPTP_input_1_0= ruleFof_input
                    	    {

                    	    						newCompositeNode(grammarAccess.getModelAccess().getTPTP_inputFof_inputParserRuleCall_1_0_0());
                    	    					
                    	    pushFollow(FOLLOW_4);
                    	    lv_TPTP_input_1_0=ruleFof_input();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getModelRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"TPTP_input",
                    	    							lv_TPTP_input_1_0,
                    	    							"it.unibz.inf.tptp.TPTP.Fof_input");
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
                    // InternalTPTP.g:119:4: ( (lv_TPTP_input_2_0= ruleTff_input ) )*
                    {
                    // InternalTPTP.g:119:4: ( (lv_TPTP_input_2_0= ruleTff_input ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==13||LA3_0==33) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalTPTP.g:120:5: (lv_TPTP_input_2_0= ruleTff_input )
                    	    {
                    	    // InternalTPTP.g:120:5: (lv_TPTP_input_2_0= ruleTff_input )
                    	    // InternalTPTP.g:121:6: lv_TPTP_input_2_0= ruleTff_input
                    	    {

                    	    						newCompositeNode(grammarAccess.getModelAccess().getTPTP_inputTff_inputParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_5);
                    	    lv_TPTP_input_2_0=ruleTff_input();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getModelRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"TPTP_input",
                    	    							lv_TPTP_input_2_0,
                    	    							"it.unibz.inf.tptp.TPTP.Tff_input");
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
                    // InternalTPTP.g:139:4: ( (lv_TPTP_input_3_0= ruleCnf_input ) )*
                    {
                    // InternalTPTP.g:139:4: ( (lv_TPTP_input_3_0= ruleCnf_input ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==13||LA4_0==66) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalTPTP.g:140:5: (lv_TPTP_input_3_0= ruleCnf_input )
                    	    {
                    	    // InternalTPTP.g:140:5: (lv_TPTP_input_3_0= ruleCnf_input )
                    	    // InternalTPTP.g:141:6: lv_TPTP_input_3_0= ruleCnf_input
                    	    {

                    	    						newCompositeNode(grammarAccess.getModelAccess().getTPTP_inputCnf_inputParserRuleCall_1_2_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_TPTP_input_3_0=ruleCnf_input();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getModelRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"TPTP_input",
                    	    							lv_TPTP_input_3_0,
                    	    							"it.unibz.inf.tptp.TPTP.Cnf_input");
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
                    // InternalTPTP.g:159:4: ( (lv_TPTP_input_4_0= ruleThf_input ) )*
                    {
                    // InternalTPTP.g:159:4: ( (lv_TPTP_input_4_0= ruleThf_input ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==13||LA5_0==71) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalTPTP.g:160:5: (lv_TPTP_input_4_0= ruleThf_input )
                    	    {
                    	    // InternalTPTP.g:160:5: (lv_TPTP_input_4_0= ruleThf_input )
                    	    // InternalTPTP.g:161:6: lv_TPTP_input_4_0= ruleThf_input
                    	    {

                    	    						newCompositeNode(grammarAccess.getModelAccess().getTPTP_inputThf_inputParserRuleCall_1_3_0());
                    	    					
                    	    pushFollow(FOLLOW_7);
                    	    lv_TPTP_input_4_0=ruleThf_input();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getModelRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"TPTP_input",
                    	    							lv_TPTP_input_4_0,
                    	    							"it.unibz.inf.tptp.TPTP.Thf_input");
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


    // $ANTLR start "entryRuleInclude"
    // InternalTPTP.g:183:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // InternalTPTP.g:183:48: (iv_ruleInclude= ruleInclude EOF )
            // InternalTPTP.g:184:2: iv_ruleInclude= ruleInclude EOF
            {
             newCompositeNode(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInclude=ruleInclude();

            state._fsp--;

             current =iv_ruleInclude; 
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
    // $ANTLR end "entryRuleInclude"


    // $ANTLR start "ruleInclude"
    // InternalTPTP.g:190:1: ruleInclude returns [EObject current=null] : (otherlv_0= 'include' otherlv_1= '(' ( (lv_path_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.' ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_path_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalTPTP.g:196:2: ( (otherlv_0= 'include' otherlv_1= '(' ( (lv_path_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.' ) )
            // InternalTPTP.g:197:2: (otherlv_0= 'include' otherlv_1= '(' ( (lv_path_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.' )
            {
            // InternalTPTP.g:197:2: (otherlv_0= 'include' otherlv_1= '(' ( (lv_path_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.' )
            // InternalTPTP.g:198:3: otherlv_0= 'include' otherlv_1= '(' ( (lv_path_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '.'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getIncludeAccess().getIncludeKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getIncludeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTPTP.g:206:3: ( (lv_path_2_0= RULE_STRING ) )
            // InternalTPTP.g:207:4: (lv_path_2_0= RULE_STRING )
            {
            // InternalTPTP.g:207:4: (lv_path_2_0= RULE_STRING )
            // InternalTPTP.g:208:5: lv_path_2_0= RULE_STRING
            {
            lv_path_2_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_path_2_0, grammarAccess.getIncludeAccess().getPathSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIncludeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_2_0,
            						"it.unibz.inf.tptp.TPTP.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getIncludeAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getIncludeAccess().getFullStopKeyword_4());
            		

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
    // $ANTLR end "ruleInclude"


    // $ANTLR start "entryRuleFof_input"
    // InternalTPTP.g:236:1: entryRuleFof_input returns [EObject current=null] : iv_ruleFof_input= ruleFof_input EOF ;
    public final EObject entryRuleFof_input() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFof_input = null;


        try {
            // InternalTPTP.g:236:50: (iv_ruleFof_input= ruleFof_input EOF )
            // InternalTPTP.g:237:2: iv_ruleFof_input= ruleFof_input EOF
            {
             newCompositeNode(grammarAccess.getFof_inputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFof_input=ruleFof_input();

            state._fsp--;

             current =iv_ruleFof_input; 
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
    // $ANTLR end "entryRuleFof_input"


    // $ANTLR start "ruleFof_input"
    // InternalTPTP.g:243:1: ruleFof_input returns [EObject current=null] : (this_Fof_root_0= ruleFof_root | this_Include_1= ruleInclude ) ;
    public final EObject ruleFof_input() throws RecognitionException {
        EObject current = null;

        EObject this_Fof_root_0 = null;

        EObject this_Include_1 = null;



        	enterRule();

        try {
            // InternalTPTP.g:249:2: ( (this_Fof_root_0= ruleFof_root | this_Include_1= ruleInclude ) )
            // InternalTPTP.g:250:2: (this_Fof_root_0= ruleFof_root | this_Include_1= ruleInclude )
            {
            // InternalTPTP.g:250:2: (this_Fof_root_0= ruleFof_root | this_Include_1= ruleInclude )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
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
                    // InternalTPTP.g:251:3: this_Fof_root_0= ruleFof_root
                    {

                    			newCompositeNode(grammarAccess.getFof_inputAccess().getFof_rootParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Fof_root_0=ruleFof_root();

                    state._fsp--;


                    			current = this_Fof_root_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:260:3: this_Include_1= ruleInclude
                    {

                    			newCompositeNode(grammarAccess.getFof_inputAccess().getIncludeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Include_1=ruleInclude();

                    state._fsp--;


                    			current = this_Include_1;
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
    // $ANTLR end "ruleFof_input"


    // $ANTLR start "entryRuleFof_root"
    // InternalTPTP.g:272:1: entryRuleFof_root returns [EObject current=null] : iv_ruleFof_root= ruleFof_root EOF ;
    public final EObject entryRuleFof_root() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFof_root = null;


        try {
            // InternalTPTP.g:272:49: (iv_ruleFof_root= ruleFof_root EOF )
            // InternalTPTP.g:273:2: iv_ruleFof_root= ruleFof_root EOF
            {
             newCompositeNode(grammarAccess.getFof_rootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFof_root=ruleFof_root();

            state._fsp--;

             current =iv_ruleFof_root; 
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
    // $ANTLR end "entryRuleFof_root"


    // $ANTLR start "ruleFof_root"
    // InternalTPTP.g:279:1: ruleFof_root returns [EObject current=null] : (otherlv_0= 'fof' otherlv_1= '(' ( ( (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING ) ) ) otherlv_3= ',' ( ( (lv_formula_role_4_1= 'axiom' | lv_formula_role_4_2= 'hypothesis' | lv_formula_role_4_3= 'negated_conjecture' | lv_formula_role_4_4= 'conjecture' | lv_formula_role_4_5= 'definition' | lv_formula_role_4_6= 'lemma' ) ) ) otherlv_5= ',' ( (lv_exp_6_0= ruleFof_expression ) ) otherlv_7= ')' otherlv_8= '.' ) ;
    public final EObject ruleFof_root() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_2=null;
        Token otherlv_3=null;
        Token lv_formula_role_4_1=null;
        Token lv_formula_role_4_2=null;
        Token lv_formula_role_4_3=null;
        Token lv_formula_role_4_4=null;
        Token lv_formula_role_4_5=null;
        Token lv_formula_role_4_6=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_1 = null;

        EObject lv_exp_6_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:285:2: ( (otherlv_0= 'fof' otherlv_1= '(' ( ( (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING ) ) ) otherlv_3= ',' ( ( (lv_formula_role_4_1= 'axiom' | lv_formula_role_4_2= 'hypothesis' | lv_formula_role_4_3= 'negated_conjecture' | lv_formula_role_4_4= 'conjecture' | lv_formula_role_4_5= 'definition' | lv_formula_role_4_6= 'lemma' ) ) ) otherlv_5= ',' ( (lv_exp_6_0= ruleFof_expression ) ) otherlv_7= ')' otherlv_8= '.' ) )
            // InternalTPTP.g:286:2: (otherlv_0= 'fof' otherlv_1= '(' ( ( (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING ) ) ) otherlv_3= ',' ( ( (lv_formula_role_4_1= 'axiom' | lv_formula_role_4_2= 'hypothesis' | lv_formula_role_4_3= 'negated_conjecture' | lv_formula_role_4_4= 'conjecture' | lv_formula_role_4_5= 'definition' | lv_formula_role_4_6= 'lemma' ) ) ) otherlv_5= ',' ( (lv_exp_6_0= ruleFof_expression ) ) otherlv_7= ')' otherlv_8= '.' )
            {
            // InternalTPTP.g:286:2: (otherlv_0= 'fof' otherlv_1= '(' ( ( (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING ) ) ) otherlv_3= ',' ( ( (lv_formula_role_4_1= 'axiom' | lv_formula_role_4_2= 'hypothesis' | lv_formula_role_4_3= 'negated_conjecture' | lv_formula_role_4_4= 'conjecture' | lv_formula_role_4_5= 'definition' | lv_formula_role_4_6= 'lemma' ) ) ) otherlv_5= ',' ( (lv_exp_6_0= ruleFof_expression ) ) otherlv_7= ')' otherlv_8= '.' )
            // InternalTPTP.g:287:3: otherlv_0= 'fof' otherlv_1= '(' ( ( (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING ) ) ) otherlv_3= ',' ( ( (lv_formula_role_4_1= 'axiom' | lv_formula_role_4_2= 'hypothesis' | lv_formula_role_4_3= 'negated_conjecture' | lv_formula_role_4_4= 'conjecture' | lv_formula_role_4_5= 'definition' | lv_formula_role_4_6= 'lemma' ) ) ) otherlv_5= ',' ( (lv_exp_6_0= ruleFof_expression ) ) otherlv_7= ')' otherlv_8= '.'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getFof_rootAccess().getFofKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getFof_rootAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTPTP.g:295:3: ( ( (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING ) ) )
            // InternalTPTP.g:296:4: ( (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING ) )
            {
            // InternalTPTP.g:296:4: ( (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING ) )
            // InternalTPTP.g:297:5: (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING )
            {
            // InternalTPTP.g:297:5: (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_LOWER_TOKEN||(LA8_0>=19 && LA8_0<=24)||LA8_0==34||LA8_0==67) ) {
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
                    // InternalTPTP.g:298:6: lv_name_2_1= ruleLower_token_and_keyword
                    {

                    						newCompositeNode(grammarAccess.getFof_rootAccess().getNameLower_token_and_keywordParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_name_2_1=ruleLower_token_and_keyword();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFof_rootRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_2_1,
                    							"it.unibz.inf.tptp.TPTP.Lower_token_and_keyword");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:314:6: lv_name_2_2= RULE_STRING
                    {
                    lv_name_2_2=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    						newLeafNode(lv_name_2_2, grammarAccess.getFof_rootAccess().getNameSTRINGTerminalRuleCall_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFof_rootRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_2,
                    							"it.unibz.inf.tptp.TPTP.STRING");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getFof_rootAccess().getCommaKeyword_3());
            		
            // InternalTPTP.g:335:3: ( ( (lv_formula_role_4_1= 'axiom' | lv_formula_role_4_2= 'hypothesis' | lv_formula_role_4_3= 'negated_conjecture' | lv_formula_role_4_4= 'conjecture' | lv_formula_role_4_5= 'definition' | lv_formula_role_4_6= 'lemma' ) ) )
            // InternalTPTP.g:336:4: ( (lv_formula_role_4_1= 'axiom' | lv_formula_role_4_2= 'hypothesis' | lv_formula_role_4_3= 'negated_conjecture' | lv_formula_role_4_4= 'conjecture' | lv_formula_role_4_5= 'definition' | lv_formula_role_4_6= 'lemma' ) )
            {
            // InternalTPTP.g:336:4: ( (lv_formula_role_4_1= 'axiom' | lv_formula_role_4_2= 'hypothesis' | lv_formula_role_4_3= 'negated_conjecture' | lv_formula_role_4_4= 'conjecture' | lv_formula_role_4_5= 'definition' | lv_formula_role_4_6= 'lemma' ) )
            // InternalTPTP.g:337:5: (lv_formula_role_4_1= 'axiom' | lv_formula_role_4_2= 'hypothesis' | lv_formula_role_4_3= 'negated_conjecture' | lv_formula_role_4_4= 'conjecture' | lv_formula_role_4_5= 'definition' | lv_formula_role_4_6= 'lemma' )
            {
            // InternalTPTP.g:337:5: (lv_formula_role_4_1= 'axiom' | lv_formula_role_4_2= 'hypothesis' | lv_formula_role_4_3= 'negated_conjecture' | lv_formula_role_4_4= 'conjecture' | lv_formula_role_4_5= 'definition' | lv_formula_role_4_6= 'lemma' )
            int alt9=6;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt9=1;
                }
                break;
            case 20:
                {
                alt9=2;
                }
                break;
            case 21:
                {
                alt9=3;
                }
                break;
            case 22:
                {
                alt9=4;
                }
                break;
            case 23:
                {
                alt9=5;
                }
                break;
            case 24:
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
                    // InternalTPTP.g:338:6: lv_formula_role_4_1= 'axiom'
                    {
                    lv_formula_role_4_1=(Token)match(input,19,FOLLOW_13); 

                    						newLeafNode(lv_formula_role_4_1, grammarAccess.getFof_rootAccess().getFormula_roleAxiomKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFof_rootRule());
                    						}
                    						setWithLastConsumed(current, "formula_role", lv_formula_role_4_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:349:6: lv_formula_role_4_2= 'hypothesis'
                    {
                    lv_formula_role_4_2=(Token)match(input,20,FOLLOW_13); 

                    						newLeafNode(lv_formula_role_4_2, grammarAccess.getFof_rootAccess().getFormula_roleHypothesisKeyword_4_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFof_rootRule());
                    						}
                    						setWithLastConsumed(current, "formula_role", lv_formula_role_4_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalTPTP.g:360:6: lv_formula_role_4_3= 'negated_conjecture'
                    {
                    lv_formula_role_4_3=(Token)match(input,21,FOLLOW_13); 

                    						newLeafNode(lv_formula_role_4_3, grammarAccess.getFof_rootAccess().getFormula_roleNegated_conjectureKeyword_4_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFof_rootRule());
                    						}
                    						setWithLastConsumed(current, "formula_role", lv_formula_role_4_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalTPTP.g:371:6: lv_formula_role_4_4= 'conjecture'
                    {
                    lv_formula_role_4_4=(Token)match(input,22,FOLLOW_13); 

                    						newLeafNode(lv_formula_role_4_4, grammarAccess.getFof_rootAccess().getFormula_roleConjectureKeyword_4_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFof_rootRule());
                    						}
                    						setWithLastConsumed(current, "formula_role", lv_formula_role_4_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalTPTP.g:382:6: lv_formula_role_4_5= 'definition'
                    {
                    lv_formula_role_4_5=(Token)match(input,23,FOLLOW_13); 

                    						newLeafNode(lv_formula_role_4_5, grammarAccess.getFof_rootAccess().getFormula_roleDefinitionKeyword_4_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFof_rootRule());
                    						}
                    						setWithLastConsumed(current, "formula_role", lv_formula_role_4_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalTPTP.g:393:6: lv_formula_role_4_6= 'lemma'
                    {
                    lv_formula_role_4_6=(Token)match(input,24,FOLLOW_13); 

                    						newLeafNode(lv_formula_role_4_6, grammarAccess.getFof_rootAccess().getFormula_roleLemmaKeyword_4_0_5());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFof_rootRule());
                    						}
                    						setWithLastConsumed(current, "formula_role", lv_formula_role_4_6, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getFof_rootAccess().getCommaKeyword_5());
            		
            // InternalTPTP.g:410:3: ( (lv_exp_6_0= ruleFof_expression ) )
            // InternalTPTP.g:411:4: (lv_exp_6_0= ruleFof_expression )
            {
            // InternalTPTP.g:411:4: (lv_exp_6_0= ruleFof_expression )
            // InternalTPTP.g:412:5: lv_exp_6_0= ruleFof_expression
            {

            					newCompositeNode(grammarAccess.getFof_rootAccess().getExpFof_expressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
            lv_exp_6_0=ruleFof_expression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFof_rootRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_6_0,
            						"it.unibz.inf.tptp.TPTP.Fof_expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getFof_rootAccess().getRightParenthesisKeyword_7());
            		
            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getFof_rootAccess().getFullStopKeyword_8());
            		

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
    // $ANTLR end "ruleFof_root"


    // $ANTLR start "entryRuleFof_expression"
    // InternalTPTP.g:441:1: entryRuleFof_expression returns [EObject current=null] : iv_ruleFof_expression= ruleFof_expression EOF ;
    public final EObject entryRuleFof_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFof_expression = null;


        try {
            // InternalTPTP.g:441:55: (iv_ruleFof_expression= ruleFof_expression EOF )
            // InternalTPTP.g:442:2: iv_ruleFof_expression= ruleFof_expression EOF
            {
             newCompositeNode(grammarAccess.getFof_expressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFof_expression=ruleFof_expression();

            state._fsp--;

             current =iv_ruleFof_expression; 
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
    // $ANTLR end "entryRuleFof_expression"


    // $ANTLR start "ruleFof_expression"
    // InternalTPTP.g:448:1: ruleFof_expression returns [EObject current=null] : (this_Fof_terminating_expression_0= ruleFof_terminating_expression ( () ( (lv_op_2_0= ruleBinary_operator ) ) ( (lv_right_3_0= ruleFof_terminating_expression ) ) )* ) ;
    public final EObject ruleFof_expression() throws RecognitionException {
        EObject current = null;

        EObject this_Fof_terminating_expression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:454:2: ( (this_Fof_terminating_expression_0= ruleFof_terminating_expression ( () ( (lv_op_2_0= ruleBinary_operator ) ) ( (lv_right_3_0= ruleFof_terminating_expression ) ) )* ) )
            // InternalTPTP.g:455:2: (this_Fof_terminating_expression_0= ruleFof_terminating_expression ( () ( (lv_op_2_0= ruleBinary_operator ) ) ( (lv_right_3_0= ruleFof_terminating_expression ) ) )* )
            {
            // InternalTPTP.g:455:2: (this_Fof_terminating_expression_0= ruleFof_terminating_expression ( () ( (lv_op_2_0= ruleBinary_operator ) ) ( (lv_right_3_0= ruleFof_terminating_expression ) ) )* )
            // InternalTPTP.g:456:3: this_Fof_terminating_expression_0= ruleFof_terminating_expression ( () ( (lv_op_2_0= ruleBinary_operator ) ) ( (lv_right_3_0= ruleFof_terminating_expression ) ) )*
            {

            			newCompositeNode(grammarAccess.getFof_expressionAccess().getFof_terminating_expressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_Fof_terminating_expression_0=ruleFof_terminating_expression();

            state._fsp--;


            			current = this_Fof_terminating_expression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTPTP.g:464:3: ( () ( (lv_op_2_0= ruleBinary_operator ) ) ( (lv_right_3_0= ruleFof_terminating_expression ) ) )*
            loop10:
            do {
                int alt10=2;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // InternalTPTP.g:465:4: () ( (lv_op_2_0= ruleBinary_operator ) ) ( (lv_right_3_0= ruleFof_terminating_expression ) )
            	    {
            	    // InternalTPTP.g:465:4: ()
            	    // InternalTPTP.g:466:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getFof_expressionAccess().getBinaryLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalTPTP.g:472:4: ( (lv_op_2_0= ruleBinary_operator ) )
            	    // InternalTPTP.g:473:5: (lv_op_2_0= ruleBinary_operator )
            	    {
            	    // InternalTPTP.g:473:5: (lv_op_2_0= ruleBinary_operator )
            	    // InternalTPTP.g:474:6: lv_op_2_0= ruleBinary_operator
            	    {

            	    						newCompositeNode(grammarAccess.getFof_expressionAccess().getOpBinary_operatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_op_2_0=ruleBinary_operator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFof_expressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"op",
            	    							lv_op_2_0,
            	    							"it.unibz.inf.tptp.TPTP.Binary_operator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalTPTP.g:491:4: ( (lv_right_3_0= ruleFof_terminating_expression ) )
            	    // InternalTPTP.g:492:5: (lv_right_3_0= ruleFof_terminating_expression )
            	    {
            	    // InternalTPTP.g:492:5: (lv_right_3_0= ruleFof_terminating_expression )
            	    // InternalTPTP.g:493:6: lv_right_3_0= ruleFof_terminating_expression
            	    {

            	    						newCompositeNode(grammarAccess.getFof_expressionAccess().getRightFof_terminating_expressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_right_3_0=ruleFof_terminating_expression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFof_expressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"it.unibz.inf.tptp.TPTP.Fof_terminating_expression");
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
    // $ANTLR end "ruleFof_expression"


    // $ANTLR start "entryRuleFof_terminating_expression"
    // InternalTPTP.g:515:1: entryRuleFof_terminating_expression returns [EObject current=null] : iv_ruleFof_terminating_expression= ruleFof_terminating_expression EOF ;
    public final EObject entryRuleFof_terminating_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFof_terminating_expression = null;


        try {
            // InternalTPTP.g:515:67: (iv_ruleFof_terminating_expression= ruleFof_terminating_expression EOF )
            // InternalTPTP.g:516:2: iv_ruleFof_terminating_expression= ruleFof_terminating_expression EOF
            {
             newCompositeNode(grammarAccess.getFof_terminating_expressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFof_terminating_expression=ruleFof_terminating_expression();

            state._fsp--;

             current =iv_ruleFof_terminating_expression; 
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
    // $ANTLR end "entryRuleFof_terminating_expression"


    // $ANTLR start "ruleFof_terminating_expression"
    // InternalTPTP.g:522:1: ruleFof_terminating_expression returns [EObject current=null] : ( ( (lv_fof_atom_0_0= ruleFof_atom ) ) | (otherlv_1= '(' this_Fof_expression_2= ruleFof_expression otherlv_3= ')' ) | ( ( (lv_fof_negation_4_0= '~' ) ) ( (lv_fof_exp_5_0= ruleFof_expression ) ) ) | ( (lv_fof_exp_6_0= ruleFof_quantifier_expression ) ) ) ;
    public final EObject ruleFof_terminating_expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_fof_negation_4_0=null;
        EObject lv_fof_atom_0_0 = null;

        EObject this_Fof_expression_2 = null;

        EObject lv_fof_exp_5_0 = null;

        EObject lv_fof_exp_6_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:528:2: ( ( ( (lv_fof_atom_0_0= ruleFof_atom ) ) | (otherlv_1= '(' this_Fof_expression_2= ruleFof_expression otherlv_3= ')' ) | ( ( (lv_fof_negation_4_0= '~' ) ) ( (lv_fof_exp_5_0= ruleFof_expression ) ) ) | ( (lv_fof_exp_6_0= ruleFof_quantifier_expression ) ) ) )
            // InternalTPTP.g:529:2: ( ( (lv_fof_atom_0_0= ruleFof_atom ) ) | (otherlv_1= '(' this_Fof_expression_2= ruleFof_expression otherlv_3= ')' ) | ( ( (lv_fof_negation_4_0= '~' ) ) ( (lv_fof_exp_5_0= ruleFof_expression ) ) ) | ( (lv_fof_exp_6_0= ruleFof_quantifier_expression ) ) )
            {
            // InternalTPTP.g:529:2: ( ( (lv_fof_atom_0_0= ruleFof_atom ) ) | (otherlv_1= '(' this_Fof_expression_2= ruleFof_expression otherlv_3= ')' ) | ( ( (lv_fof_negation_4_0= '~' ) ) ( (lv_fof_exp_5_0= ruleFof_expression ) ) ) | ( (lv_fof_exp_6_0= ruleFof_quantifier_expression ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_UPPER_TOKEN:
            case RULE_LOWER_TOKEN:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 26:
            case 27:
            case 34:
            case 67:
                {
                alt11=1;
                }
                break;
            case 14:
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
                    // InternalTPTP.g:530:3: ( (lv_fof_atom_0_0= ruleFof_atom ) )
                    {
                    // InternalTPTP.g:530:3: ( (lv_fof_atom_0_0= ruleFof_atom ) )
                    // InternalTPTP.g:531:4: (lv_fof_atom_0_0= ruleFof_atom )
                    {
                    // InternalTPTP.g:531:4: (lv_fof_atom_0_0= ruleFof_atom )
                    // InternalTPTP.g:532:5: lv_fof_atom_0_0= ruleFof_atom
                    {

                    					newCompositeNode(grammarAccess.getFof_terminating_expressionAccess().getFof_atomFof_atomParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_fof_atom_0_0=ruleFof_atom();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFof_terminating_expressionRule());
                    					}
                    					set(
                    						current,
                    						"fof_atom",
                    						lv_fof_atom_0_0,
                    						"it.unibz.inf.tptp.TPTP.Fof_atom");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTPTP.g:550:3: (otherlv_1= '(' this_Fof_expression_2= ruleFof_expression otherlv_3= ')' )
                    {
                    // InternalTPTP.g:550:3: (otherlv_1= '(' this_Fof_expression_2= ruleFof_expression otherlv_3= ')' )
                    // InternalTPTP.g:551:4: otherlv_1= '(' this_Fof_expression_2= ruleFof_expression otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_15); 

                    				newLeafNode(otherlv_1, grammarAccess.getFof_terminating_expressionAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getFof_terminating_expressionAccess().getFof_expressionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_10);
                    this_Fof_expression_2=ruleFof_expression();

                    state._fsp--;


                    				current = this_Fof_expression_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getFof_terminating_expressionAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTPTP.g:569:3: ( ( (lv_fof_negation_4_0= '~' ) ) ( (lv_fof_exp_5_0= ruleFof_expression ) ) )
                    {
                    // InternalTPTP.g:569:3: ( ( (lv_fof_negation_4_0= '~' ) ) ( (lv_fof_exp_5_0= ruleFof_expression ) ) )
                    // InternalTPTP.g:570:4: ( (lv_fof_negation_4_0= '~' ) ) ( (lv_fof_exp_5_0= ruleFof_expression ) )
                    {
                    // InternalTPTP.g:570:4: ( (lv_fof_negation_4_0= '~' ) )
                    // InternalTPTP.g:571:5: (lv_fof_negation_4_0= '~' )
                    {
                    // InternalTPTP.g:571:5: (lv_fof_negation_4_0= '~' )
                    // InternalTPTP.g:572:6: lv_fof_negation_4_0= '~'
                    {
                    lv_fof_negation_4_0=(Token)match(input,25,FOLLOW_15); 

                    						newLeafNode(lv_fof_negation_4_0, grammarAccess.getFof_terminating_expressionAccess().getFof_negationTildeKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFof_terminating_expressionRule());
                    						}
                    						setWithLastConsumed(current, "fof_negation", true, "~");
                    					

                    }


                    }

                    // InternalTPTP.g:584:4: ( (lv_fof_exp_5_0= ruleFof_expression ) )
                    // InternalTPTP.g:585:5: (lv_fof_exp_5_0= ruleFof_expression )
                    {
                    // InternalTPTP.g:585:5: (lv_fof_exp_5_0= ruleFof_expression )
                    // InternalTPTP.g:586:6: lv_fof_exp_5_0= ruleFof_expression
                    {

                    						newCompositeNode(grammarAccess.getFof_terminating_expressionAccess().getFof_expFof_expressionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_fof_exp_5_0=ruleFof_expression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFof_terminating_expressionRule());
                    						}
                    						set(
                    							current,
                    							"fof_exp",
                    							lv_fof_exp_5_0,
                    							"it.unibz.inf.tptp.TPTP.Fof_expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalTPTP.g:605:3: ( (lv_fof_exp_6_0= ruleFof_quantifier_expression ) )
                    {
                    // InternalTPTP.g:605:3: ( (lv_fof_exp_6_0= ruleFof_quantifier_expression ) )
                    // InternalTPTP.g:606:4: (lv_fof_exp_6_0= ruleFof_quantifier_expression )
                    {
                    // InternalTPTP.g:606:4: (lv_fof_exp_6_0= ruleFof_quantifier_expression )
                    // InternalTPTP.g:607:5: lv_fof_exp_6_0= ruleFof_quantifier_expression
                    {

                    					newCompositeNode(grammarAccess.getFof_terminating_expressionAccess().getFof_expFof_quantifier_expressionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_fof_exp_6_0=ruleFof_quantifier_expression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFof_terminating_expressionRule());
                    					}
                    					set(
                    						current,
                    						"fof_exp",
                    						lv_fof_exp_6_0,
                    						"it.unibz.inf.tptp.TPTP.Fof_quantifier_expression");
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
    // $ANTLR end "ruleFof_terminating_expression"


    // $ANTLR start "entryRuleFof_atom"
    // InternalTPTP.g:628:1: entryRuleFof_atom returns [EObject current=null] : iv_ruleFof_atom= ruleFof_atom EOF ;
    public final EObject entryRuleFof_atom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFof_atom = null;


        try {
            // InternalTPTP.g:628:49: (iv_ruleFof_atom= ruleFof_atom EOF )
            // InternalTPTP.g:629:2: iv_ruleFof_atom= ruleFof_atom EOF
            {
             newCompositeNode(grammarAccess.getFof_atomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFof_atom=ruleFof_atom();

            state._fsp--;

             current =iv_ruleFof_atom; 
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
    // $ANTLR end "entryRuleFof_atom"


    // $ANTLR start "ruleFof_atom"
    // InternalTPTP.g:635:1: ruleFof_atom returns [EObject current=null] : (this_Fof_constant_0= ruleFof_constant | this_Fof_var_1= ruleFof_var | this_Fof_atom_literal_2= ruleFof_atom_literal ) ;
    public final EObject ruleFof_atom() throws RecognitionException {
        EObject current = null;

        EObject this_Fof_constant_0 = null;

        EObject this_Fof_var_1 = null;

        EObject this_Fof_atom_literal_2 = null;



        	enterRule();

        try {
            // InternalTPTP.g:641:2: ( (this_Fof_constant_0= ruleFof_constant | this_Fof_var_1= ruleFof_var | this_Fof_atom_literal_2= ruleFof_atom_literal ) )
            // InternalTPTP.g:642:2: (this_Fof_constant_0= ruleFof_constant | this_Fof_var_1= ruleFof_var | this_Fof_atom_literal_2= ruleFof_atom_literal )
            {
            // InternalTPTP.g:642:2: (this_Fof_constant_0= ruleFof_constant | this_Fof_var_1= ruleFof_var | this_Fof_atom_literal_2= ruleFof_atom_literal )
            int alt12=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_LOWER_TOKEN:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
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
                    // InternalTPTP.g:643:3: this_Fof_constant_0= ruleFof_constant
                    {

                    			newCompositeNode(grammarAccess.getFof_atomAccess().getFof_constantParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Fof_constant_0=ruleFof_constant();

                    state._fsp--;


                    			current = this_Fof_constant_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:652:3: this_Fof_var_1= ruleFof_var
                    {

                    			newCompositeNode(grammarAccess.getFof_atomAccess().getFof_varParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Fof_var_1=ruleFof_var();

                    state._fsp--;


                    			current = this_Fof_var_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTPTP.g:661:3: this_Fof_atom_literal_2= ruleFof_atom_literal
                    {

                    			newCompositeNode(grammarAccess.getFof_atomAccess().getFof_atom_literalParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Fof_atom_literal_2=ruleFof_atom_literal();

                    state._fsp--;


                    			current = this_Fof_atom_literal_2;
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
    // $ANTLR end "ruleFof_atom"


    // $ANTLR start "entryRuleFof_atom_literal"
    // InternalTPTP.g:673:1: entryRuleFof_atom_literal returns [EObject current=null] : iv_ruleFof_atom_literal= ruleFof_atom_literal EOF ;
    public final EObject entryRuleFof_atom_literal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFof_atom_literal = null;


        try {
            // InternalTPTP.g:673:57: (iv_ruleFof_atom_literal= ruleFof_atom_literal EOF )
            // InternalTPTP.g:674:2: iv_ruleFof_atom_literal= ruleFof_atom_literal EOF
            {
             newCompositeNode(grammarAccess.getFof_atom_literalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFof_atom_literal=ruleFof_atom_literal();

            state._fsp--;

             current =iv_ruleFof_atom_literal; 
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
    // $ANTLR end "entryRuleFof_atom_literal"


    // $ANTLR start "ruleFof_atom_literal"
    // InternalTPTP.g:680:1: ruleFof_atom_literal returns [EObject current=null] : ( ( (lv_name_0_1= '$true' | lv_name_0_2= '$false' ) ) ) ;
    public final EObject ruleFof_atom_literal() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;


        	enterRule();

        try {
            // InternalTPTP.g:686:2: ( ( ( (lv_name_0_1= '$true' | lv_name_0_2= '$false' ) ) ) )
            // InternalTPTP.g:687:2: ( ( (lv_name_0_1= '$true' | lv_name_0_2= '$false' ) ) )
            {
            // InternalTPTP.g:687:2: ( ( (lv_name_0_1= '$true' | lv_name_0_2= '$false' ) ) )
            // InternalTPTP.g:688:3: ( (lv_name_0_1= '$true' | lv_name_0_2= '$false' ) )
            {
            // InternalTPTP.g:688:3: ( (lv_name_0_1= '$true' | lv_name_0_2= '$false' ) )
            // InternalTPTP.g:689:4: (lv_name_0_1= '$true' | lv_name_0_2= '$false' )
            {
            // InternalTPTP.g:689:4: (lv_name_0_1= '$true' | lv_name_0_2= '$false' )
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
                    // InternalTPTP.g:690:5: lv_name_0_1= '$true'
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
                    // InternalTPTP.g:701:5: lv_name_0_2= '$false'
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
    // $ANTLR end "ruleFof_atom_literal"


    // $ANTLR start "entryRuleFof_constant"
    // InternalTPTP.g:717:1: entryRuleFof_constant returns [EObject current=null] : iv_ruleFof_constant= ruleFof_constant EOF ;
    public final EObject entryRuleFof_constant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFof_constant = null;


        try {
            // InternalTPTP.g:717:53: (iv_ruleFof_constant= ruleFof_constant EOF )
            // InternalTPTP.g:718:2: iv_ruleFof_constant= ruleFof_constant EOF
            {
             newCompositeNode(grammarAccess.getFof_constantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFof_constant=ruleFof_constant();

            state._fsp--;

             current =iv_ruleFof_constant; 
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
    // $ANTLR end "entryRuleFof_constant"


    // $ANTLR start "ruleFof_constant"
    // InternalTPTP.g:724:1: ruleFof_constant returns [EObject current=null] : ( ( ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_fof_param_2_0= ruleFof_atom ) ) (otherlv_3= ',' ( (lv_fof_param_4_0= ruleFof_atom ) ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleFof_constant() throws RecognitionException {
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
            // InternalTPTP.g:730:2: ( ( ( ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_fof_param_2_0= ruleFof_atom ) ) (otherlv_3= ',' ( (lv_fof_param_4_0= ruleFof_atom ) ) )* otherlv_5= ')' )? ) )
            // InternalTPTP.g:731:2: ( ( ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_fof_param_2_0= ruleFof_atom ) ) (otherlv_3= ',' ( (lv_fof_param_4_0= ruleFof_atom ) ) )* otherlv_5= ')' )? )
            {
            // InternalTPTP.g:731:2: ( ( ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_fof_param_2_0= ruleFof_atom ) ) (otherlv_3= ',' ( (lv_fof_param_4_0= ruleFof_atom ) ) )* otherlv_5= ')' )? )
            // InternalTPTP.g:732:3: ( ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_fof_param_2_0= ruleFof_atom ) ) (otherlv_3= ',' ( (lv_fof_param_4_0= ruleFof_atom ) ) )* otherlv_5= ')' )?
            {
            // InternalTPTP.g:732:3: ( ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) )
            // InternalTPTP.g:733:4: ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) )
            {
            // InternalTPTP.g:733:4: ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) )
            // InternalTPTP.g:734:5: (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING )
            {
            // InternalTPTP.g:734:5: (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_LOWER_TOKEN||(LA14_0>=19 && LA14_0<=24)||LA14_0==34||LA14_0==67) ) {
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
                    // InternalTPTP.g:735:6: lv_name_0_1= ruleLower_token_and_keyword
                    {

                    						newCompositeNode(grammarAccess.getFof_constantAccess().getNameLower_token_and_keywordParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_name_0_1=ruleLower_token_and_keyword();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFof_constantRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_0_1,
                    							"it.unibz.inf.tptp.TPTP.Lower_token_and_keyword");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:751:6: lv_name_0_2= RULE_STRING
                    {
                    lv_name_0_2=(Token)match(input,RULE_STRING,FOLLOW_17); 

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

            // InternalTPTP.g:768:3: (otherlv_1= '(' ( (lv_fof_param_2_0= ruleFof_atom ) ) (otherlv_3= ',' ( (lv_fof_param_4_0= ruleFof_atom ) ) )* otherlv_5= ')' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==14) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTPTP.g:769:4: otherlv_1= '(' ( (lv_fof_param_2_0= ruleFof_atom ) ) (otherlv_3= ',' ( (lv_fof_param_4_0= ruleFof_atom ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_18); 

                    				newLeafNode(otherlv_1, grammarAccess.getFof_constantAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalTPTP.g:773:4: ( (lv_fof_param_2_0= ruleFof_atom ) )
                    // InternalTPTP.g:774:5: (lv_fof_param_2_0= ruleFof_atom )
                    {
                    // InternalTPTP.g:774:5: (lv_fof_param_2_0= ruleFof_atom )
                    // InternalTPTP.g:775:6: lv_fof_param_2_0= ruleFof_atom
                    {

                    						newCompositeNode(grammarAccess.getFof_constantAccess().getFof_paramFof_atomParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_fof_param_2_0=ruleFof_atom();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFof_constantRule());
                    						}
                    						add(
                    							current,
                    							"fof_param",
                    							lv_fof_param_2_0,
                    							"it.unibz.inf.tptp.TPTP.Fof_atom");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTPTP.g:792:4: (otherlv_3= ',' ( (lv_fof_param_4_0= ruleFof_atom ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==18) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalTPTP.g:793:5: otherlv_3= ',' ( (lv_fof_param_4_0= ruleFof_atom ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FOLLOW_18); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getFof_constantAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalTPTP.g:797:5: ( (lv_fof_param_4_0= ruleFof_atom ) )
                    	    // InternalTPTP.g:798:6: (lv_fof_param_4_0= ruleFof_atom )
                    	    {
                    	    // InternalTPTP.g:798:6: (lv_fof_param_4_0= ruleFof_atom )
                    	    // InternalTPTP.g:799:7: lv_fof_param_4_0= ruleFof_atom
                    	    {

                    	    							newCompositeNode(grammarAccess.getFof_constantAccess().getFof_paramFof_atomParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_fof_param_4_0=ruleFof_atom();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFof_constantRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fof_param",
                    	    								lv_fof_param_4_0,
                    	    								"it.unibz.inf.tptp.TPTP.Fof_atom");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,15,FOLLOW_2); 

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
    // $ANTLR end "ruleFof_constant"


    // $ANTLR start "entryRuleFof_var"
    // InternalTPTP.g:826:1: entryRuleFof_var returns [EObject current=null] : iv_ruleFof_var= ruleFof_var EOF ;
    public final EObject entryRuleFof_var() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFof_var = null;


        try {
            // InternalTPTP.g:826:48: (iv_ruleFof_var= ruleFof_var EOF )
            // InternalTPTP.g:827:2: iv_ruleFof_var= ruleFof_var EOF
            {
             newCompositeNode(grammarAccess.getFof_varRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFof_var=ruleFof_var();

            state._fsp--;

             current =iv_ruleFof_var; 
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
    // $ANTLR end "entryRuleFof_var"


    // $ANTLR start "ruleFof_var"
    // InternalTPTP.g:833:1: ruleFof_var returns [EObject current=null] : ( (lv_name_0_0= RULE_UPPER_TOKEN ) ) ;
    public final EObject ruleFof_var() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalTPTP.g:839:2: ( ( (lv_name_0_0= RULE_UPPER_TOKEN ) ) )
            // InternalTPTP.g:840:2: ( (lv_name_0_0= RULE_UPPER_TOKEN ) )
            {
            // InternalTPTP.g:840:2: ( (lv_name_0_0= RULE_UPPER_TOKEN ) )
            // InternalTPTP.g:841:3: (lv_name_0_0= RULE_UPPER_TOKEN )
            {
            // InternalTPTP.g:841:3: (lv_name_0_0= RULE_UPPER_TOKEN )
            // InternalTPTP.g:842:4: lv_name_0_0= RULE_UPPER_TOKEN
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
    // $ANTLR end "ruleFof_var"


    // $ANTLR start "entryRuleFof_quantifier_expression"
    // InternalTPTP.g:861:1: entryRuleFof_quantifier_expression returns [EObject current=null] : iv_ruleFof_quantifier_expression= ruleFof_quantifier_expression EOF ;
    public final EObject entryRuleFof_quantifier_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFof_quantifier_expression = null;


        try {
            // InternalTPTP.g:861:66: (iv_ruleFof_quantifier_expression= ruleFof_quantifier_expression EOF )
            // InternalTPTP.g:862:2: iv_ruleFof_quantifier_expression= ruleFof_quantifier_expression EOF
            {
             newCompositeNode(grammarAccess.getFof_quantifier_expressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFof_quantifier_expression=ruleFof_quantifier_expression();

            state._fsp--;

             current =iv_ruleFof_quantifier_expression; 
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
    // $ANTLR end "entryRuleFof_quantifier_expression"


    // $ANTLR start "ruleFof_quantifier_expression"
    // InternalTPTP.g:868:1: ruleFof_quantifier_expression returns [EObject current=null] : ( ( ( (lv_fof_quantifier_0_1= '!' | lv_fof_quantifier_0_2= '?' ) ) ) otherlv_1= '[' ( (lv_fof_param_2_0= ruleFof_variable_list ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_fof_exp_5_0= ruleFof_expression ) ) ) ;
    public final EObject ruleFof_quantifier_expression() throws RecognitionException {
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
            // InternalTPTP.g:874:2: ( ( ( ( (lv_fof_quantifier_0_1= '!' | lv_fof_quantifier_0_2= '?' ) ) ) otherlv_1= '[' ( (lv_fof_param_2_0= ruleFof_variable_list ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_fof_exp_5_0= ruleFof_expression ) ) ) )
            // InternalTPTP.g:875:2: ( ( ( (lv_fof_quantifier_0_1= '!' | lv_fof_quantifier_0_2= '?' ) ) ) otherlv_1= '[' ( (lv_fof_param_2_0= ruleFof_variable_list ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_fof_exp_5_0= ruleFof_expression ) ) )
            {
            // InternalTPTP.g:875:2: ( ( ( (lv_fof_quantifier_0_1= '!' | lv_fof_quantifier_0_2= '?' ) ) ) otherlv_1= '[' ( (lv_fof_param_2_0= ruleFof_variable_list ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_fof_exp_5_0= ruleFof_expression ) ) )
            // InternalTPTP.g:876:3: ( ( (lv_fof_quantifier_0_1= '!' | lv_fof_quantifier_0_2= '?' ) ) ) otherlv_1= '[' ( (lv_fof_param_2_0= ruleFof_variable_list ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_fof_exp_5_0= ruleFof_expression ) )
            {
            // InternalTPTP.g:876:3: ( ( (lv_fof_quantifier_0_1= '!' | lv_fof_quantifier_0_2= '?' ) ) )
            // InternalTPTP.g:877:4: ( (lv_fof_quantifier_0_1= '!' | lv_fof_quantifier_0_2= '?' ) )
            {
            // InternalTPTP.g:877:4: ( (lv_fof_quantifier_0_1= '!' | lv_fof_quantifier_0_2= '?' ) )
            // InternalTPTP.g:878:5: (lv_fof_quantifier_0_1= '!' | lv_fof_quantifier_0_2= '?' )
            {
            // InternalTPTP.g:878:5: (lv_fof_quantifier_0_1= '!' | lv_fof_quantifier_0_2= '?' )
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
                    // InternalTPTP.g:879:6: lv_fof_quantifier_0_1= '!'
                    {
                    lv_fof_quantifier_0_1=(Token)match(input,28,FOLLOW_20); 

                    						newLeafNode(lv_fof_quantifier_0_1, grammarAccess.getFof_quantifier_expressionAccess().getFof_quantifierExclamationMarkKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFof_quantifier_expressionRule());
                    						}
                    						setWithLastConsumed(current, "fof_quantifier", lv_fof_quantifier_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:890:6: lv_fof_quantifier_0_2= '?'
                    {
                    lv_fof_quantifier_0_2=(Token)match(input,29,FOLLOW_20); 

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

            otherlv_1=(Token)match(input,30,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getFof_quantifier_expressionAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalTPTP.g:907:3: ( (lv_fof_param_2_0= ruleFof_variable_list ) )
            // InternalTPTP.g:908:4: (lv_fof_param_2_0= ruleFof_variable_list )
            {
            // InternalTPTP.g:908:4: (lv_fof_param_2_0= ruleFof_variable_list )
            // InternalTPTP.g:909:5: lv_fof_param_2_0= ruleFof_variable_list
            {

            					newCompositeNode(grammarAccess.getFof_quantifier_expressionAccess().getFof_paramFof_variable_listParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_fof_param_2_0=ruleFof_variable_list();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFof_quantifier_expressionRule());
            					}
            					set(
            						current,
            						"fof_param",
            						lv_fof_param_2_0,
            						"it.unibz.inf.tptp.TPTP.Fof_variable_list");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getFof_quantifier_expressionAccess().getRightSquareBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,32,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getFof_quantifier_expressionAccess().getColonKeyword_4());
            		
            // InternalTPTP.g:934:3: ( (lv_fof_exp_5_0= ruleFof_expression ) )
            // InternalTPTP.g:935:4: (lv_fof_exp_5_0= ruleFof_expression )
            {
            // InternalTPTP.g:935:4: (lv_fof_exp_5_0= ruleFof_expression )
            // InternalTPTP.g:936:5: lv_fof_exp_5_0= ruleFof_expression
            {

            					newCompositeNode(grammarAccess.getFof_quantifier_expressionAccess().getFof_expFof_expressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_fof_exp_5_0=ruleFof_expression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFof_quantifier_expressionRule());
            					}
            					set(
            						current,
            						"fof_exp",
            						lv_fof_exp_5_0,
            						"it.unibz.inf.tptp.TPTP.Fof_expression");
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
    // $ANTLR end "ruleFof_quantifier_expression"


    // $ANTLR start "entryRuleFof_variable_list"
    // InternalTPTP.g:957:1: entryRuleFof_variable_list returns [EObject current=null] : iv_ruleFof_variable_list= ruleFof_variable_list EOF ;
    public final EObject entryRuleFof_variable_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFof_variable_list = null;


        try {
            // InternalTPTP.g:957:58: (iv_ruleFof_variable_list= ruleFof_variable_list EOF )
            // InternalTPTP.g:958:2: iv_ruleFof_variable_list= ruleFof_variable_list EOF
            {
             newCompositeNode(grammarAccess.getFof_variable_listRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFof_variable_list=ruleFof_variable_list();

            state._fsp--;

             current =iv_ruleFof_variable_list; 
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
    // $ANTLR end "entryRuleFof_variable_list"


    // $ANTLR start "ruleFof_variable_list"
    // InternalTPTP.g:964:1: ruleFof_variable_list returns [EObject current=null] : ( ( (lv_params_0_0= ruleFof_var ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleFof_var ) ) )* ) ;
    public final EObject ruleFof_variable_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_params_0_0 = null;

        EObject lv_params_2_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:970:2: ( ( ( (lv_params_0_0= ruleFof_var ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleFof_var ) ) )* ) )
            // InternalTPTP.g:971:2: ( ( (lv_params_0_0= ruleFof_var ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleFof_var ) ) )* )
            {
            // InternalTPTP.g:971:2: ( ( (lv_params_0_0= ruleFof_var ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleFof_var ) ) )* )
            // InternalTPTP.g:972:3: ( (lv_params_0_0= ruleFof_var ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleFof_var ) ) )*
            {
            // InternalTPTP.g:972:3: ( (lv_params_0_0= ruleFof_var ) )
            // InternalTPTP.g:973:4: (lv_params_0_0= ruleFof_var )
            {
            // InternalTPTP.g:973:4: (lv_params_0_0= ruleFof_var )
            // InternalTPTP.g:974:5: lv_params_0_0= ruleFof_var
            {

            					newCompositeNode(grammarAccess.getFof_variable_listAccess().getParamsFof_varParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_24);
            lv_params_0_0=ruleFof_var();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFof_variable_listRule());
            					}
            					add(
            						current,
            						"params",
            						lv_params_0_0,
            						"it.unibz.inf.tptp.TPTP.Fof_var");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTPTP.g:991:3: (otherlv_1= ',' ( (lv_params_2_0= ruleFof_var ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==18) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalTPTP.g:992:4: otherlv_1= ',' ( (lv_params_2_0= ruleFof_var ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_21); 

            	    				newLeafNode(otherlv_1, grammarAccess.getFof_variable_listAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalTPTP.g:996:4: ( (lv_params_2_0= ruleFof_var ) )
            	    // InternalTPTP.g:997:5: (lv_params_2_0= ruleFof_var )
            	    {
            	    // InternalTPTP.g:997:5: (lv_params_2_0= ruleFof_var )
            	    // InternalTPTP.g:998:6: lv_params_2_0= ruleFof_var
            	    {

            	    						newCompositeNode(grammarAccess.getFof_variable_listAccess().getParamsFof_varParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_params_2_0=ruleFof_var();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFof_variable_listRule());
            	    						}
            	    						add(
            	    							current,
            	    							"params",
            	    							lv_params_2_0,
            	    							"it.unibz.inf.tptp.TPTP.Fof_var");
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
    // $ANTLR end "ruleFof_variable_list"


    // $ANTLR start "entryRuleTff_input"
    // InternalTPTP.g:1020:1: entryRuleTff_input returns [EObject current=null] : iv_ruleTff_input= ruleTff_input EOF ;
    public final EObject entryRuleTff_input() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTff_input = null;


        try {
            // InternalTPTP.g:1020:50: (iv_ruleTff_input= ruleTff_input EOF )
            // InternalTPTP.g:1021:2: iv_ruleTff_input= ruleTff_input EOF
            {
             newCompositeNode(grammarAccess.getTff_inputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTff_input=ruleTff_input();

            state._fsp--;

             current =iv_ruleTff_input; 
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
    // $ANTLR end "entryRuleTff_input"


    // $ANTLR start "ruleTff_input"
    // InternalTPTP.g:1027:1: ruleTff_input returns [EObject current=null] : (this_Tff_root_0= ruleTff_root | this_Include_1= ruleInclude ) ;
    public final EObject ruleTff_input() throws RecognitionException {
        EObject current = null;

        EObject this_Tff_root_0 = null;

        EObject this_Include_1 = null;



        	enterRule();

        try {
            // InternalTPTP.g:1033:2: ( (this_Tff_root_0= ruleTff_root | this_Include_1= ruleInclude ) )
            // InternalTPTP.g:1034:2: (this_Tff_root_0= ruleTff_root | this_Include_1= ruleInclude )
            {
            // InternalTPTP.g:1034:2: (this_Tff_root_0= ruleTff_root | this_Include_1= ruleInclude )
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
                    // InternalTPTP.g:1035:3: this_Tff_root_0= ruleTff_root
                    {

                    			newCompositeNode(grammarAccess.getTff_inputAccess().getTff_rootParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Tff_root_0=ruleTff_root();

                    state._fsp--;


                    			current = this_Tff_root_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:1044:3: this_Include_1= ruleInclude
                    {

                    			newCompositeNode(grammarAccess.getTff_inputAccess().getIncludeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Include_1=ruleInclude();

                    state._fsp--;


                    			current = this_Include_1;
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
    // $ANTLR end "ruleTff_input"


    // $ANTLR start "entryRuleTff_root"
    // InternalTPTP.g:1056:1: entryRuleTff_root returns [EObject current=null] : iv_ruleTff_root= ruleTff_root EOF ;
    public final EObject entryRuleTff_root() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTff_root = null;


        try {
            // InternalTPTP.g:1056:49: (iv_ruleTff_root= ruleTff_root EOF )
            // InternalTPTP.g:1057:2: iv_ruleTff_root= ruleTff_root EOF
            {
             newCompositeNode(grammarAccess.getTff_rootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTff_root=ruleTff_root();

            state._fsp--;

             current =iv_ruleTff_root; 
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
    // $ANTLR end "entryRuleTff_root"


    // $ANTLR start "ruleTff_root"
    // InternalTPTP.g:1063:1: ruleTff_root returns [EObject current=null] : ( (otherlv_0= 'tff' otherlv_1= '(' ( ( (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING ) ) ) otherlv_3= ',' ( ( (lv_formula_role_4_1= 'axiom' | lv_formula_role_4_2= 'hypothesis' | lv_formula_role_4_3= 'negated_conjecture' | lv_formula_role_4_4= 'conjecture' | lv_formula_role_4_5= 'definition' | lv_formula_role_4_6= 'lemma' ) ) ) otherlv_5= ',' ( (lv_exp_6_0= ruleTff_expression ) ) otherlv_7= ')' otherlv_8= '.' ) | (otherlv_9= 'tff' otherlv_10= '(' ( ( (lv_name_11_1= ruleLower_token_and_keyword | lv_name_11_2= RULE_STRING ) ) ) otherlv_12= ',' ( (lv_formula_role_13_0= 'type' ) ) otherlv_14= ',' ( (lv_def_15_0= ruleTff_formula_type_definition ) ) otherlv_16= ')' otherlv_17= '.' ) ) ;
    public final EObject ruleTff_root() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_2=null;
        Token otherlv_3=null;
        Token lv_formula_role_4_1=null;
        Token lv_formula_role_4_2=null;
        Token lv_formula_role_4_3=null;
        Token lv_formula_role_4_4=null;
        Token lv_formula_role_4_5=null;
        Token lv_formula_role_4_6=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_name_11_2=null;
        Token otherlv_12=null;
        Token lv_formula_role_13_0=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_2_1 = null;

        EObject lv_exp_6_0 = null;

        AntlrDatatypeRuleToken lv_name_11_1 = null;

        EObject lv_def_15_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:1069:2: ( ( (otherlv_0= 'tff' otherlv_1= '(' ( ( (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING ) ) ) otherlv_3= ',' ( ( (lv_formula_role_4_1= 'axiom' | lv_formula_role_4_2= 'hypothesis' | lv_formula_role_4_3= 'negated_conjecture' | lv_formula_role_4_4= 'conjecture' | lv_formula_role_4_5= 'definition' | lv_formula_role_4_6= 'lemma' ) ) ) otherlv_5= ',' ( (lv_exp_6_0= ruleTff_expression ) ) otherlv_7= ')' otherlv_8= '.' ) | (otherlv_9= 'tff' otherlv_10= '(' ( ( (lv_name_11_1= ruleLower_token_and_keyword | lv_name_11_2= RULE_STRING ) ) ) otherlv_12= ',' ( (lv_formula_role_13_0= 'type' ) ) otherlv_14= ',' ( (lv_def_15_0= ruleTff_formula_type_definition ) ) otherlv_16= ')' otherlv_17= '.' ) ) )
            // InternalTPTP.g:1070:2: ( (otherlv_0= 'tff' otherlv_1= '(' ( ( (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING ) ) ) otherlv_3= ',' ( ( (lv_formula_role_4_1= 'axiom' | lv_formula_role_4_2= 'hypothesis' | lv_formula_role_4_3= 'negated_conjecture' | lv_formula_role_4_4= 'conjecture' | lv_formula_role_4_5= 'definition' | lv_formula_role_4_6= 'lemma' ) ) ) otherlv_5= ',' ( (lv_exp_6_0= ruleTff_expression ) ) otherlv_7= ')' otherlv_8= '.' ) | (otherlv_9= 'tff' otherlv_10= '(' ( ( (lv_name_11_1= ruleLower_token_and_keyword | lv_name_11_2= RULE_STRING ) ) ) otherlv_12= ',' ( (lv_formula_role_13_0= 'type' ) ) otherlv_14= ',' ( (lv_def_15_0= ruleTff_formula_type_definition ) ) otherlv_16= ')' otherlv_17= '.' ) )
            {
            // InternalTPTP.g:1070:2: ( (otherlv_0= 'tff' otherlv_1= '(' ( ( (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING ) ) ) otherlv_3= ',' ( ( (lv_formula_role_4_1= 'axiom' | lv_formula_role_4_2= 'hypothesis' | lv_formula_role_4_3= 'negated_conjecture' | lv_formula_role_4_4= 'conjecture' | lv_formula_role_4_5= 'definition' | lv_formula_role_4_6= 'lemma' ) ) ) otherlv_5= ',' ( (lv_exp_6_0= ruleTff_expression ) ) otherlv_7= ')' otherlv_8= '.' ) | (otherlv_9= 'tff' otherlv_10= '(' ( ( (lv_name_11_1= ruleLower_token_and_keyword | lv_name_11_2= RULE_STRING ) ) ) otherlv_12= ',' ( (lv_formula_role_13_0= 'type' ) ) otherlv_14= ',' ( (lv_def_15_0= ruleTff_formula_type_definition ) ) otherlv_16= ')' otherlv_17= '.' ) )
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // InternalTPTP.g:1071:3: (otherlv_0= 'tff' otherlv_1= '(' ( ( (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING ) ) ) otherlv_3= ',' ( ( (lv_formula_role_4_1= 'axiom' | lv_formula_role_4_2= 'hypothesis' | lv_formula_role_4_3= 'negated_conjecture' | lv_formula_role_4_4= 'conjecture' | lv_formula_role_4_5= 'definition' | lv_formula_role_4_6= 'lemma' ) ) ) otherlv_5= ',' ( (lv_exp_6_0= ruleTff_expression ) ) otherlv_7= ')' otherlv_8= '.' )
                    {
                    // InternalTPTP.g:1071:3: (otherlv_0= 'tff' otherlv_1= '(' ( ( (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING ) ) ) otherlv_3= ',' ( ( (lv_formula_role_4_1= 'axiom' | lv_formula_role_4_2= 'hypothesis' | lv_formula_role_4_3= 'negated_conjecture' | lv_formula_role_4_4= 'conjecture' | lv_formula_role_4_5= 'definition' | lv_formula_role_4_6= 'lemma' ) ) ) otherlv_5= ',' ( (lv_exp_6_0= ruleTff_expression ) ) otherlv_7= ')' otherlv_8= '.' )
                    // InternalTPTP.g:1072:4: otherlv_0= 'tff' otherlv_1= '(' ( ( (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING ) ) ) otherlv_3= ',' ( ( (lv_formula_role_4_1= 'axiom' | lv_formula_role_4_2= 'hypothesis' | lv_formula_role_4_3= 'negated_conjecture' | lv_formula_role_4_4= 'conjecture' | lv_formula_role_4_5= 'definition' | lv_formula_role_4_6= 'lemma' ) ) ) otherlv_5= ',' ( (lv_exp_6_0= ruleTff_expression ) ) otherlv_7= ')' otherlv_8= '.'
                    {
                    otherlv_0=(Token)match(input,33,FOLLOW_8); 

                    				newLeafNode(otherlv_0, grammarAccess.getTff_rootAccess().getTffKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,14,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getTff_rootAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalTPTP.g:1080:4: ( ( (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING ) ) )
                    // InternalTPTP.g:1081:5: ( (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING ) )
                    {
                    // InternalTPTP.g:1081:5: ( (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING ) )
                    // InternalTPTP.g:1082:6: (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING )
                    {
                    // InternalTPTP.g:1082:6: (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==RULE_LOWER_TOKEN||(LA20_0>=19 && LA20_0<=24)||LA20_0==34||LA20_0==67) ) {
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
                            // InternalTPTP.g:1083:7: lv_name_2_1= ruleLower_token_and_keyword
                            {

                            							newCompositeNode(grammarAccess.getTff_rootAccess().getNameLower_token_and_keywordParserRuleCall_0_2_0_0());
                            						
                            pushFollow(FOLLOW_13);
                            lv_name_2_1=ruleLower_token_and_keyword();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getTff_rootRule());
                            							}
                            							set(
                            								current,
                            								"name",
                            								lv_name_2_1,
                            								"it.unibz.inf.tptp.TPTP.Lower_token_and_keyword");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalTPTP.g:1099:7: lv_name_2_2= RULE_STRING
                            {
                            lv_name_2_2=(Token)match(input,RULE_STRING,FOLLOW_13); 

                            							newLeafNode(lv_name_2_2, grammarAccess.getTff_rootAccess().getNameSTRINGTerminalRuleCall_0_2_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTff_rootRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"name",
                            								lv_name_2_2,
                            								"it.unibz.inf.tptp.TPTP.STRING");
                            						

                            }
                            break;

                    }


                    }


                    }

                    otherlv_3=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getTff_rootAccess().getCommaKeyword_0_3());
                    			
                    // InternalTPTP.g:1120:4: ( ( (lv_formula_role_4_1= 'axiom' | lv_formula_role_4_2= 'hypothesis' | lv_formula_role_4_3= 'negated_conjecture' | lv_formula_role_4_4= 'conjecture' | lv_formula_role_4_5= 'definition' | lv_formula_role_4_6= 'lemma' ) ) )
                    // InternalTPTP.g:1121:5: ( (lv_formula_role_4_1= 'axiom' | lv_formula_role_4_2= 'hypothesis' | lv_formula_role_4_3= 'negated_conjecture' | lv_formula_role_4_4= 'conjecture' | lv_formula_role_4_5= 'definition' | lv_formula_role_4_6= 'lemma' ) )
                    {
                    // InternalTPTP.g:1121:5: ( (lv_formula_role_4_1= 'axiom' | lv_formula_role_4_2= 'hypothesis' | lv_formula_role_4_3= 'negated_conjecture' | lv_formula_role_4_4= 'conjecture' | lv_formula_role_4_5= 'definition' | lv_formula_role_4_6= 'lemma' ) )
                    // InternalTPTP.g:1122:6: (lv_formula_role_4_1= 'axiom' | lv_formula_role_4_2= 'hypothesis' | lv_formula_role_4_3= 'negated_conjecture' | lv_formula_role_4_4= 'conjecture' | lv_formula_role_4_5= 'definition' | lv_formula_role_4_6= 'lemma' )
                    {
                    // InternalTPTP.g:1122:6: (lv_formula_role_4_1= 'axiom' | lv_formula_role_4_2= 'hypothesis' | lv_formula_role_4_3= 'negated_conjecture' | lv_formula_role_4_4= 'conjecture' | lv_formula_role_4_5= 'definition' | lv_formula_role_4_6= 'lemma' )
                    int alt21=6;
                    switch ( input.LA(1) ) {
                    case 19:
                        {
                        alt21=1;
                        }
                        break;
                    case 20:
                        {
                        alt21=2;
                        }
                        break;
                    case 21:
                        {
                        alt21=3;
                        }
                        break;
                    case 22:
                        {
                        alt21=4;
                        }
                        break;
                    case 23:
                        {
                        alt21=5;
                        }
                        break;
                    case 24:
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
                            // InternalTPTP.g:1123:7: lv_formula_role_4_1= 'axiom'
                            {
                            lv_formula_role_4_1=(Token)match(input,19,FOLLOW_13); 

                            							newLeafNode(lv_formula_role_4_1, grammarAccess.getTff_rootAccess().getFormula_roleAxiomKeyword_0_4_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTff_rootRule());
                            							}
                            							setWithLastConsumed(current, "formula_role", lv_formula_role_4_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalTPTP.g:1134:7: lv_formula_role_4_2= 'hypothesis'
                            {
                            lv_formula_role_4_2=(Token)match(input,20,FOLLOW_13); 

                            							newLeafNode(lv_formula_role_4_2, grammarAccess.getTff_rootAccess().getFormula_roleHypothesisKeyword_0_4_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTff_rootRule());
                            							}
                            							setWithLastConsumed(current, "formula_role", lv_formula_role_4_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalTPTP.g:1145:7: lv_formula_role_4_3= 'negated_conjecture'
                            {
                            lv_formula_role_4_3=(Token)match(input,21,FOLLOW_13); 

                            							newLeafNode(lv_formula_role_4_3, grammarAccess.getTff_rootAccess().getFormula_roleNegated_conjectureKeyword_0_4_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTff_rootRule());
                            							}
                            							setWithLastConsumed(current, "formula_role", lv_formula_role_4_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalTPTP.g:1156:7: lv_formula_role_4_4= 'conjecture'
                            {
                            lv_formula_role_4_4=(Token)match(input,22,FOLLOW_13); 

                            							newLeafNode(lv_formula_role_4_4, grammarAccess.getTff_rootAccess().getFormula_roleConjectureKeyword_0_4_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTff_rootRule());
                            							}
                            							setWithLastConsumed(current, "formula_role", lv_formula_role_4_4, null);
                            						

                            }
                            break;
                        case 5 :
                            // InternalTPTP.g:1167:7: lv_formula_role_4_5= 'definition'
                            {
                            lv_formula_role_4_5=(Token)match(input,23,FOLLOW_13); 

                            							newLeafNode(lv_formula_role_4_5, grammarAccess.getTff_rootAccess().getFormula_roleDefinitionKeyword_0_4_0_4());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTff_rootRule());
                            							}
                            							setWithLastConsumed(current, "formula_role", lv_formula_role_4_5, null);
                            						

                            }
                            break;
                        case 6 :
                            // InternalTPTP.g:1178:7: lv_formula_role_4_6= 'lemma'
                            {
                            lv_formula_role_4_6=(Token)match(input,24,FOLLOW_13); 

                            							newLeafNode(lv_formula_role_4_6, grammarAccess.getTff_rootAccess().getFormula_roleLemmaKeyword_0_4_0_5());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTff_rootRule());
                            							}
                            							setWithLastConsumed(current, "formula_role", lv_formula_role_4_6, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    otherlv_5=(Token)match(input,18,FOLLOW_25); 

                    				newLeafNode(otherlv_5, grammarAccess.getTff_rootAccess().getCommaKeyword_0_5());
                    			
                    // InternalTPTP.g:1195:4: ( (lv_exp_6_0= ruleTff_expression ) )
                    // InternalTPTP.g:1196:5: (lv_exp_6_0= ruleTff_expression )
                    {
                    // InternalTPTP.g:1196:5: (lv_exp_6_0= ruleTff_expression )
                    // InternalTPTP.g:1197:6: lv_exp_6_0= ruleTff_expression
                    {

                    						newCompositeNode(grammarAccess.getTff_rootAccess().getExpTff_expressionParserRuleCall_0_6_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_exp_6_0=ruleTff_expression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTff_rootRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_6_0,
                    							"it.unibz.inf.tptp.TPTP.Tff_expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getTff_rootAccess().getRightParenthesisKeyword_0_7());
                    			
                    otherlv_8=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getTff_rootAccess().getFullStopKeyword_0_8());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTPTP.g:1224:3: (otherlv_9= 'tff' otherlv_10= '(' ( ( (lv_name_11_1= ruleLower_token_and_keyword | lv_name_11_2= RULE_STRING ) ) ) otherlv_12= ',' ( (lv_formula_role_13_0= 'type' ) ) otherlv_14= ',' ( (lv_def_15_0= ruleTff_formula_type_definition ) ) otherlv_16= ')' otherlv_17= '.' )
                    {
                    // InternalTPTP.g:1224:3: (otherlv_9= 'tff' otherlv_10= '(' ( ( (lv_name_11_1= ruleLower_token_and_keyword | lv_name_11_2= RULE_STRING ) ) ) otherlv_12= ',' ( (lv_formula_role_13_0= 'type' ) ) otherlv_14= ',' ( (lv_def_15_0= ruleTff_formula_type_definition ) ) otherlv_16= ')' otherlv_17= '.' )
                    // InternalTPTP.g:1225:4: otherlv_9= 'tff' otherlv_10= '(' ( ( (lv_name_11_1= ruleLower_token_and_keyword | lv_name_11_2= RULE_STRING ) ) ) otherlv_12= ',' ( (lv_formula_role_13_0= 'type' ) ) otherlv_14= ',' ( (lv_def_15_0= ruleTff_formula_type_definition ) ) otherlv_16= ')' otherlv_17= '.'
                    {
                    otherlv_9=(Token)match(input,33,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getTff_rootAccess().getTffKeyword_1_0());
                    			
                    otherlv_10=(Token)match(input,14,FOLLOW_12); 

                    				newLeafNode(otherlv_10, grammarAccess.getTff_rootAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalTPTP.g:1233:4: ( ( (lv_name_11_1= ruleLower_token_and_keyword | lv_name_11_2= RULE_STRING ) ) )
                    // InternalTPTP.g:1234:5: ( (lv_name_11_1= ruleLower_token_and_keyword | lv_name_11_2= RULE_STRING ) )
                    {
                    // InternalTPTP.g:1234:5: ( (lv_name_11_1= ruleLower_token_and_keyword | lv_name_11_2= RULE_STRING ) )
                    // InternalTPTP.g:1235:6: (lv_name_11_1= ruleLower_token_and_keyword | lv_name_11_2= RULE_STRING )
                    {
                    // InternalTPTP.g:1235:6: (lv_name_11_1= ruleLower_token_and_keyword | lv_name_11_2= RULE_STRING )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==RULE_LOWER_TOKEN||(LA22_0>=19 && LA22_0<=24)||LA22_0==34||LA22_0==67) ) {
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
                            // InternalTPTP.g:1236:7: lv_name_11_1= ruleLower_token_and_keyword
                            {

                            							newCompositeNode(grammarAccess.getTff_rootAccess().getNameLower_token_and_keywordParserRuleCall_1_2_0_0());
                            						
                            pushFollow(FOLLOW_13);
                            lv_name_11_1=ruleLower_token_and_keyword();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getTff_rootRule());
                            							}
                            							set(
                            								current,
                            								"name",
                            								lv_name_11_1,
                            								"it.unibz.inf.tptp.TPTP.Lower_token_and_keyword");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalTPTP.g:1252:7: lv_name_11_2= RULE_STRING
                            {
                            lv_name_11_2=(Token)match(input,RULE_STRING,FOLLOW_13); 

                            							newLeafNode(lv_name_11_2, grammarAccess.getTff_rootAccess().getNameSTRINGTerminalRuleCall_1_2_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTff_rootRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"name",
                            								lv_name_11_2,
                            								"it.unibz.inf.tptp.TPTP.STRING");
                            						

                            }
                            break;

                    }


                    }


                    }

                    otherlv_12=(Token)match(input,18,FOLLOW_26); 

                    				newLeafNode(otherlv_12, grammarAccess.getTff_rootAccess().getCommaKeyword_1_3());
                    			
                    // InternalTPTP.g:1273:4: ( (lv_formula_role_13_0= 'type' ) )
                    // InternalTPTP.g:1274:5: (lv_formula_role_13_0= 'type' )
                    {
                    // InternalTPTP.g:1274:5: (lv_formula_role_13_0= 'type' )
                    // InternalTPTP.g:1275:6: lv_formula_role_13_0= 'type'
                    {
                    lv_formula_role_13_0=(Token)match(input,34,FOLLOW_13); 

                    						newLeafNode(lv_formula_role_13_0, grammarAccess.getTff_rootAccess().getFormula_roleTypeKeyword_1_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_rootRule());
                    						}
                    						setWithLastConsumed(current, "formula_role", lv_formula_role_13_0, "type");
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,18,FOLLOW_27); 

                    				newLeafNode(otherlv_14, grammarAccess.getTff_rootAccess().getCommaKeyword_1_5());
                    			
                    // InternalTPTP.g:1291:4: ( (lv_def_15_0= ruleTff_formula_type_definition ) )
                    // InternalTPTP.g:1292:5: (lv_def_15_0= ruleTff_formula_type_definition )
                    {
                    // InternalTPTP.g:1292:5: (lv_def_15_0= ruleTff_formula_type_definition )
                    // InternalTPTP.g:1293:6: lv_def_15_0= ruleTff_formula_type_definition
                    {

                    						newCompositeNode(grammarAccess.getTff_rootAccess().getDefTff_formula_type_definitionParserRuleCall_1_6_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_def_15_0=ruleTff_formula_type_definition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTff_rootRule());
                    						}
                    						set(
                    							current,
                    							"def",
                    							lv_def_15_0,
                    							"it.unibz.inf.tptp.TPTP.Tff_formula_type_definition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_16, grammarAccess.getTff_rootAccess().getRightParenthesisKeyword_1_7());
                    			
                    otherlv_17=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_17, grammarAccess.getTff_rootAccess().getFullStopKeyword_1_8());
                    			

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
    // $ANTLR end "ruleTff_root"


    // $ANTLR start "entryRuleTff_formula_type_definition"
    // InternalTPTP.g:1323:1: entryRuleTff_formula_type_definition returns [EObject current=null] : iv_ruleTff_formula_type_definition= ruleTff_formula_type_definition EOF ;
    public final EObject entryRuleTff_formula_type_definition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTff_formula_type_definition = null;


        try {
            // InternalTPTP.g:1323:68: (iv_ruleTff_formula_type_definition= ruleTff_formula_type_definition EOF )
            // InternalTPTP.g:1324:2: iv_ruleTff_formula_type_definition= ruleTff_formula_type_definition EOF
            {
             newCompositeNode(grammarAccess.getTff_formula_type_definitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTff_formula_type_definition=ruleTff_formula_type_definition();

            state._fsp--;

             current =iv_ruleTff_formula_type_definition; 
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
    // $ANTLR end "entryRuleTff_formula_type_definition"


    // $ANTLR start "ruleTff_formula_type_definition"
    // InternalTPTP.g:1330:1: ruleTff_formula_type_definition returns [EObject current=null] : ( (otherlv_0= '(' this_Tff_formula_type_definition_1= ruleTff_formula_type_definition otherlv_2= ')' ) | ( ( ( (lv_name_3_0= ruleLower_token_and_keyword ) ) | ( (lv_name_4_0= RULE_STRING ) ) ) otherlv_5= ':' ( ( (lv_exp_6_1= ruleTff_type_quantifier_epression | lv_exp_6_2= ruleTff_type_expression ) ) ) ) ) ;
    public final EObject ruleTff_formula_type_definition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        EObject this_Tff_formula_type_definition_1 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_exp_6_1 = null;

        EObject lv_exp_6_2 = null;



        	enterRule();

        try {
            // InternalTPTP.g:1336:2: ( ( (otherlv_0= '(' this_Tff_formula_type_definition_1= ruleTff_formula_type_definition otherlv_2= ')' ) | ( ( ( (lv_name_3_0= ruleLower_token_and_keyword ) ) | ( (lv_name_4_0= RULE_STRING ) ) ) otherlv_5= ':' ( ( (lv_exp_6_1= ruleTff_type_quantifier_epression | lv_exp_6_2= ruleTff_type_expression ) ) ) ) ) )
            // InternalTPTP.g:1337:2: ( (otherlv_0= '(' this_Tff_formula_type_definition_1= ruleTff_formula_type_definition otherlv_2= ')' ) | ( ( ( (lv_name_3_0= ruleLower_token_and_keyword ) ) | ( (lv_name_4_0= RULE_STRING ) ) ) otherlv_5= ':' ( ( (lv_exp_6_1= ruleTff_type_quantifier_epression | lv_exp_6_2= ruleTff_type_expression ) ) ) ) )
            {
            // InternalTPTP.g:1337:2: ( (otherlv_0= '(' this_Tff_formula_type_definition_1= ruleTff_formula_type_definition otherlv_2= ')' ) | ( ( ( (lv_name_3_0= ruleLower_token_and_keyword ) ) | ( (lv_name_4_0= RULE_STRING ) ) ) otherlv_5= ':' ( ( (lv_exp_6_1= ruleTff_type_quantifier_epression | lv_exp_6_2= ruleTff_type_expression ) ) ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==14) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_STRING||LA26_0==RULE_LOWER_TOKEN||(LA26_0>=19 && LA26_0<=24)||LA26_0==34||LA26_0==67) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalTPTP.g:1338:3: (otherlv_0= '(' this_Tff_formula_type_definition_1= ruleTff_formula_type_definition otherlv_2= ')' )
                    {
                    // InternalTPTP.g:1338:3: (otherlv_0= '(' this_Tff_formula_type_definition_1= ruleTff_formula_type_definition otherlv_2= ')' )
                    // InternalTPTP.g:1339:4: otherlv_0= '(' this_Tff_formula_type_definition_1= ruleTff_formula_type_definition otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_27); 

                    				newLeafNode(otherlv_0, grammarAccess.getTff_formula_type_definitionAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getTff_formula_type_definitionAccess().getTff_formula_type_definitionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_10);
                    this_Tff_formula_type_definition_1=ruleTff_formula_type_definition();

                    state._fsp--;


                    				current = this_Tff_formula_type_definition_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getTff_formula_type_definitionAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTPTP.g:1357:3: ( ( ( (lv_name_3_0= ruleLower_token_and_keyword ) ) | ( (lv_name_4_0= RULE_STRING ) ) ) otherlv_5= ':' ( ( (lv_exp_6_1= ruleTff_type_quantifier_epression | lv_exp_6_2= ruleTff_type_expression ) ) ) )
                    {
                    // InternalTPTP.g:1357:3: ( ( ( (lv_name_3_0= ruleLower_token_and_keyword ) ) | ( (lv_name_4_0= RULE_STRING ) ) ) otherlv_5= ':' ( ( (lv_exp_6_1= ruleTff_type_quantifier_epression | lv_exp_6_2= ruleTff_type_expression ) ) ) )
                    // InternalTPTP.g:1358:4: ( ( (lv_name_3_0= ruleLower_token_and_keyword ) ) | ( (lv_name_4_0= RULE_STRING ) ) ) otherlv_5= ':' ( ( (lv_exp_6_1= ruleTff_type_quantifier_epression | lv_exp_6_2= ruleTff_type_expression ) ) )
                    {
                    // InternalTPTP.g:1358:4: ( ( (lv_name_3_0= ruleLower_token_and_keyword ) ) | ( (lv_name_4_0= RULE_STRING ) ) )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==RULE_LOWER_TOKEN||(LA24_0>=19 && LA24_0<=24)||LA24_0==34||LA24_0==67) ) {
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
                            // InternalTPTP.g:1359:5: ( (lv_name_3_0= ruleLower_token_and_keyword ) )
                            {
                            // InternalTPTP.g:1359:5: ( (lv_name_3_0= ruleLower_token_and_keyword ) )
                            // InternalTPTP.g:1360:6: (lv_name_3_0= ruleLower_token_and_keyword )
                            {
                            // InternalTPTP.g:1360:6: (lv_name_3_0= ruleLower_token_and_keyword )
                            // InternalTPTP.g:1361:7: lv_name_3_0= ruleLower_token_and_keyword
                            {

                            							newCompositeNode(grammarAccess.getTff_formula_type_definitionAccess().getNameLower_token_and_keywordParserRuleCall_1_0_0_0());
                            						
                            pushFollow(FOLLOW_23);
                            lv_name_3_0=ruleLower_token_and_keyword();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getTff_formula_type_definitionRule());
                            							}
                            							set(
                            								current,
                            								"name",
                            								lv_name_3_0,
                            								"it.unibz.inf.tptp.TPTP.Lower_token_and_keyword");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalTPTP.g:1379:5: ( (lv_name_4_0= RULE_STRING ) )
                            {
                            // InternalTPTP.g:1379:5: ( (lv_name_4_0= RULE_STRING ) )
                            // InternalTPTP.g:1380:6: (lv_name_4_0= RULE_STRING )
                            {
                            // InternalTPTP.g:1380:6: (lv_name_4_0= RULE_STRING )
                            // InternalTPTP.g:1381:7: lv_name_4_0= RULE_STRING
                            {
                            lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

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

                    otherlv_5=(Token)match(input,32,FOLLOW_28); 

                    				newLeafNode(otherlv_5, grammarAccess.getTff_formula_type_definitionAccess().getColonKeyword_1_1());
                    			
                    // InternalTPTP.g:1402:4: ( ( (lv_exp_6_1= ruleTff_type_quantifier_epression | lv_exp_6_2= ruleTff_type_expression ) ) )
                    // InternalTPTP.g:1403:5: ( (lv_exp_6_1= ruleTff_type_quantifier_epression | lv_exp_6_2= ruleTff_type_expression ) )
                    {
                    // InternalTPTP.g:1403:5: ( (lv_exp_6_1= ruleTff_type_quantifier_epression | lv_exp_6_2= ruleTff_type_expression ) )
                    // InternalTPTP.g:1404:6: (lv_exp_6_1= ruleTff_type_quantifier_epression | lv_exp_6_2= ruleTff_type_expression )
                    {
                    // InternalTPTP.g:1404:6: (lv_exp_6_1= ruleTff_type_quantifier_epression | lv_exp_6_2= ruleTff_type_expression )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==65) ) {
                        alt25=1;
                    }
                    else if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_LOWER_TOKEN)||LA25_0==14||(LA25_0>=19 && LA25_0<=24)||LA25_0==34||(LA25_0>=37 && LA25_0<=42)||LA25_0==67) ) {
                        alt25=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalTPTP.g:1405:7: lv_exp_6_1= ruleTff_type_quantifier_epression
                            {

                            							newCompositeNode(grammarAccess.getTff_formula_type_definitionAccess().getExpTff_type_quantifier_epressionParserRuleCall_1_2_0_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_exp_6_1=ruleTff_type_quantifier_epression();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getTff_formula_type_definitionRule());
                            							}
                            							set(
                            								current,
                            								"exp",
                            								lv_exp_6_1,
                            								"it.unibz.inf.tptp.TPTP.Tff_type_quantifier_epression");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalTPTP.g:1421:7: lv_exp_6_2= ruleTff_type_expression
                            {

                            							newCompositeNode(grammarAccess.getTff_formula_type_definitionAccess().getExpTff_type_expressionParserRuleCall_1_2_0_1());
                            						
                            pushFollow(FOLLOW_2);
                            lv_exp_6_2=ruleTff_type_expression();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getTff_formula_type_definitionRule());
                            							}
                            							set(
                            								current,
                            								"exp",
                            								lv_exp_6_2,
                            								"it.unibz.inf.tptp.TPTP.Tff_type_expression");
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
    // $ANTLR end "ruleTff_formula_type_definition"


    // $ANTLR start "entryRuleTff_type_expression"
    // InternalTPTP.g:1444:1: entryRuleTff_type_expression returns [EObject current=null] : iv_ruleTff_type_expression= ruleTff_type_expression EOF ;
    public final EObject entryRuleTff_type_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTff_type_expression = null;


        try {
            // InternalTPTP.g:1444:60: (iv_ruleTff_type_expression= ruleTff_type_expression EOF )
            // InternalTPTP.g:1445:2: iv_ruleTff_type_expression= ruleTff_type_expression EOF
            {
             newCompositeNode(grammarAccess.getTff_type_expressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTff_type_expression=ruleTff_type_expression();

            state._fsp--;

             current =iv_ruleTff_type_expression; 
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
    // $ANTLR end "entryRuleTff_type_expression"


    // $ANTLR start "ruleTff_type_expression"
    // InternalTPTP.g:1451:1: ruleTff_type_expression returns [EObject current=null] : (this_Tff_terminal_type_expression_0= ruleTff_terminal_type_expression ( () ( ( (lv_op_2_1= '>' | lv_op_2_2= '*' ) ) ) ( (lv_right_3_0= ruleTff_terminal_type_expression ) ) )* ) ;
    public final EObject ruleTff_type_expression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Tff_terminal_type_expression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:1457:2: ( (this_Tff_terminal_type_expression_0= ruleTff_terminal_type_expression ( () ( ( (lv_op_2_1= '>' | lv_op_2_2= '*' ) ) ) ( (lv_right_3_0= ruleTff_terminal_type_expression ) ) )* ) )
            // InternalTPTP.g:1458:2: (this_Tff_terminal_type_expression_0= ruleTff_terminal_type_expression ( () ( ( (lv_op_2_1= '>' | lv_op_2_2= '*' ) ) ) ( (lv_right_3_0= ruleTff_terminal_type_expression ) ) )* )
            {
            // InternalTPTP.g:1458:2: (this_Tff_terminal_type_expression_0= ruleTff_terminal_type_expression ( () ( ( (lv_op_2_1= '>' | lv_op_2_2= '*' ) ) ) ( (lv_right_3_0= ruleTff_terminal_type_expression ) ) )* )
            // InternalTPTP.g:1459:3: this_Tff_terminal_type_expression_0= ruleTff_terminal_type_expression ( () ( ( (lv_op_2_1= '>' | lv_op_2_2= '*' ) ) ) ( (lv_right_3_0= ruleTff_terminal_type_expression ) ) )*
            {

            			newCompositeNode(grammarAccess.getTff_type_expressionAccess().getTff_terminal_type_expressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_29);
            this_Tff_terminal_type_expression_0=ruleTff_terminal_type_expression();

            state._fsp--;


            			current = this_Tff_terminal_type_expression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTPTP.g:1467:3: ( () ( ( (lv_op_2_1= '>' | lv_op_2_2= '*' ) ) ) ( (lv_right_3_0= ruleTff_terminal_type_expression ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=35 && LA28_0<=36)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalTPTP.g:1468:4: () ( ( (lv_op_2_1= '>' | lv_op_2_2= '*' ) ) ) ( (lv_right_3_0= ruleTff_terminal_type_expression ) )
            	    {
            	    // InternalTPTP.g:1468:4: ()
            	    // InternalTPTP.g:1469:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getTff_type_expressionAccess().getOperLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalTPTP.g:1475:4: ( ( (lv_op_2_1= '>' | lv_op_2_2= '*' ) ) )
            	    // InternalTPTP.g:1476:5: ( (lv_op_2_1= '>' | lv_op_2_2= '*' ) )
            	    {
            	    // InternalTPTP.g:1476:5: ( (lv_op_2_1= '>' | lv_op_2_2= '*' ) )
            	    // InternalTPTP.g:1477:6: (lv_op_2_1= '>' | lv_op_2_2= '*' )
            	    {
            	    // InternalTPTP.g:1477:6: (lv_op_2_1= '>' | lv_op_2_2= '*' )
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
            	            // InternalTPTP.g:1478:7: lv_op_2_1= '>'
            	            {
            	            lv_op_2_1=(Token)match(input,35,FOLLOW_28); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getTff_type_expressionAccess().getOpGreaterThanSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getTff_type_expressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalTPTP.g:1489:7: lv_op_2_2= '*'
            	            {
            	            lv_op_2_2=(Token)match(input,36,FOLLOW_28); 

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

            	    // InternalTPTP.g:1502:4: ( (lv_right_3_0= ruleTff_terminal_type_expression ) )
            	    // InternalTPTP.g:1503:5: (lv_right_3_0= ruleTff_terminal_type_expression )
            	    {
            	    // InternalTPTP.g:1503:5: (lv_right_3_0= ruleTff_terminal_type_expression )
            	    // InternalTPTP.g:1504:6: lv_right_3_0= ruleTff_terminal_type_expression
            	    {

            	    						newCompositeNode(grammarAccess.getTff_type_expressionAccess().getRightTff_terminal_type_expressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_right_3_0=ruleTff_terminal_type_expression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTff_type_expressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"it.unibz.inf.tptp.TPTP.Tff_terminal_type_expression");
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
    // $ANTLR end "ruleTff_type_expression"


    // $ANTLR start "entryRuleTff_terminal_type_expression"
    // InternalTPTP.g:1526:1: entryRuleTff_terminal_type_expression returns [EObject current=null] : iv_ruleTff_terminal_type_expression= ruleTff_terminal_type_expression EOF ;
    public final EObject entryRuleTff_terminal_type_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTff_terminal_type_expression = null;


        try {
            // InternalTPTP.g:1526:69: (iv_ruleTff_terminal_type_expression= ruleTff_terminal_type_expression EOF )
            // InternalTPTP.g:1527:2: iv_ruleTff_terminal_type_expression= ruleTff_terminal_type_expression EOF
            {
             newCompositeNode(grammarAccess.getTff_terminal_type_expressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTff_terminal_type_expression=ruleTff_terminal_type_expression();

            state._fsp--;

             current =iv_ruleTff_terminal_type_expression; 
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
    // $ANTLR end "entryRuleTff_terminal_type_expression"


    // $ANTLR start "ruleTff_terminal_type_expression"
    // InternalTPTP.g:1533:1: ruleTff_terminal_type_expression returns [EObject current=null] : (this_Tff_type_atom_0= ruleTff_type_atom | (otherlv_1= '(' this_Tff_type_expression_2= ruleTff_type_expression otherlv_3= ')' ) ) ;
    public final EObject ruleTff_terminal_type_expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Tff_type_atom_0 = null;

        EObject this_Tff_type_expression_2 = null;



        	enterRule();

        try {
            // InternalTPTP.g:1539:2: ( (this_Tff_type_atom_0= ruleTff_type_atom | (otherlv_1= '(' this_Tff_type_expression_2= ruleTff_type_expression otherlv_3= ')' ) ) )
            // InternalTPTP.g:1540:2: (this_Tff_type_atom_0= ruleTff_type_atom | (otherlv_1= '(' this_Tff_type_expression_2= ruleTff_type_expression otherlv_3= ')' ) )
            {
            // InternalTPTP.g:1540:2: (this_Tff_type_atom_0= ruleTff_type_atom | (otherlv_1= '(' this_Tff_type_expression_2= ruleTff_type_expression otherlv_3= ')' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_STRING && LA29_0<=RULE_LOWER_TOKEN)||(LA29_0>=19 && LA29_0<=24)||LA29_0==34||(LA29_0>=37 && LA29_0<=42)||LA29_0==67) ) {
                alt29=1;
            }
            else if ( (LA29_0==14) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalTPTP.g:1541:3: this_Tff_type_atom_0= ruleTff_type_atom
                    {

                    			newCompositeNode(grammarAccess.getTff_terminal_type_expressionAccess().getTff_type_atomParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Tff_type_atom_0=ruleTff_type_atom();

                    state._fsp--;


                    			current = this_Tff_type_atom_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:1550:3: (otherlv_1= '(' this_Tff_type_expression_2= ruleTff_type_expression otherlv_3= ')' )
                    {
                    // InternalTPTP.g:1550:3: (otherlv_1= '(' this_Tff_type_expression_2= ruleTff_type_expression otherlv_3= ')' )
                    // InternalTPTP.g:1551:4: otherlv_1= '(' this_Tff_type_expression_2= ruleTff_type_expression otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_28); 

                    				newLeafNode(otherlv_1, grammarAccess.getTff_terminal_type_expressionAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getTff_terminal_type_expressionAccess().getTff_type_expressionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_10);
                    this_Tff_type_expression_2=ruleTff_type_expression();

                    state._fsp--;


                    				current = this_Tff_type_expression_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,15,FOLLOW_2); 

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
    // $ANTLR end "ruleTff_terminal_type_expression"


    // $ANTLR start "entryRuleTff_type_atom"
    // InternalTPTP.g:1572:1: entryRuleTff_type_atom returns [EObject current=null] : iv_ruleTff_type_atom= ruleTff_type_atom EOF ;
    public final EObject entryRuleTff_type_atom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTff_type_atom = null;


        try {
            // InternalTPTP.g:1572:54: (iv_ruleTff_type_atom= ruleTff_type_atom EOF )
            // InternalTPTP.g:1573:2: iv_ruleTff_type_atom= ruleTff_type_atom EOF
            {
             newCompositeNode(grammarAccess.getTff_type_atomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTff_type_atom=ruleTff_type_atom();

            state._fsp--;

             current =iv_ruleTff_type_atom; 
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
    // $ANTLR end "entryRuleTff_type_atom"


    // $ANTLR start "ruleTff_type_atom"
    // InternalTPTP.g:1579:1: ruleTff_type_atom returns [EObject current=null] : (this_Tff_type_constant_0= ruleTff_type_constant | this_Tff_var_1= ruleTff_var | this_Tff_type_literal_2= ruleTff_type_literal ) ;
    public final EObject ruleTff_type_atom() throws RecognitionException {
        EObject current = null;

        EObject this_Tff_type_constant_0 = null;

        EObject this_Tff_var_1 = null;

        EObject this_Tff_type_literal_2 = null;



        	enterRule();

        try {
            // InternalTPTP.g:1585:2: ( (this_Tff_type_constant_0= ruleTff_type_constant | this_Tff_var_1= ruleTff_var | this_Tff_type_literal_2= ruleTff_type_literal ) )
            // InternalTPTP.g:1586:2: (this_Tff_type_constant_0= ruleTff_type_constant | this_Tff_var_1= ruleTff_var | this_Tff_type_literal_2= ruleTff_type_literal )
            {
            // InternalTPTP.g:1586:2: (this_Tff_type_constant_0= ruleTff_type_constant | this_Tff_var_1= ruleTff_var | this_Tff_type_literal_2= ruleTff_type_literal )
            int alt30=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_LOWER_TOKEN:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
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
                    // InternalTPTP.g:1587:3: this_Tff_type_constant_0= ruleTff_type_constant
                    {

                    			newCompositeNode(grammarAccess.getTff_type_atomAccess().getTff_type_constantParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Tff_type_constant_0=ruleTff_type_constant();

                    state._fsp--;


                    			current = this_Tff_type_constant_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:1596:3: this_Tff_var_1= ruleTff_var
                    {

                    			newCompositeNode(grammarAccess.getTff_type_atomAccess().getTff_varParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Tff_var_1=ruleTff_var();

                    state._fsp--;


                    			current = this_Tff_var_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTPTP.g:1605:3: this_Tff_type_literal_2= ruleTff_type_literal
                    {

                    			newCompositeNode(grammarAccess.getTff_type_atomAccess().getTff_type_literalParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Tff_type_literal_2=ruleTff_type_literal();

                    state._fsp--;


                    			current = this_Tff_type_literal_2;
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
    // $ANTLR end "ruleTff_type_atom"


    // $ANTLR start "entryRuleTff_type_constant"
    // InternalTPTP.g:1617:1: entryRuleTff_type_constant returns [EObject current=null] : iv_ruleTff_type_constant= ruleTff_type_constant EOF ;
    public final EObject entryRuleTff_type_constant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTff_type_constant = null;


        try {
            // InternalTPTP.g:1617:58: (iv_ruleTff_type_constant= ruleTff_type_constant EOF )
            // InternalTPTP.g:1618:2: iv_ruleTff_type_constant= ruleTff_type_constant EOF
            {
             newCompositeNode(grammarAccess.getTff_type_constantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTff_type_constant=ruleTff_type_constant();

            state._fsp--;

             current =iv_ruleTff_type_constant; 
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
    // $ANTLR end "entryRuleTff_type_constant"


    // $ANTLR start "ruleTff_type_constant"
    // InternalTPTP.g:1624:1: ruleTff_type_constant returns [EObject current=null] : ( ( ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleTff_type_atom ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleTff_type_atom ) ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleTff_type_constant() throws RecognitionException {
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
            // InternalTPTP.g:1630:2: ( ( ( ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleTff_type_atom ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleTff_type_atom ) ) )* otherlv_5= ')' )? ) )
            // InternalTPTP.g:1631:2: ( ( ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleTff_type_atom ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleTff_type_atom ) ) )* otherlv_5= ')' )? )
            {
            // InternalTPTP.g:1631:2: ( ( ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleTff_type_atom ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleTff_type_atom ) ) )* otherlv_5= ')' )? )
            // InternalTPTP.g:1632:3: ( ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleTff_type_atom ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleTff_type_atom ) ) )* otherlv_5= ')' )?
            {
            // InternalTPTP.g:1632:3: ( ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) )
            // InternalTPTP.g:1633:4: ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) )
            {
            // InternalTPTP.g:1633:4: ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) )
            // InternalTPTP.g:1634:5: (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING )
            {
            // InternalTPTP.g:1634:5: (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_LOWER_TOKEN||(LA31_0>=19 && LA31_0<=24)||LA31_0==34||LA31_0==67) ) {
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
                    // InternalTPTP.g:1635:6: lv_name_0_1= ruleLower_token_and_keyword
                    {

                    						newCompositeNode(grammarAccess.getTff_type_constantAccess().getNameLower_token_and_keywordParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_name_0_1=ruleLower_token_and_keyword();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTff_type_constantRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_0_1,
                    							"it.unibz.inf.tptp.TPTP.Lower_token_and_keyword");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:1651:6: lv_name_0_2= RULE_STRING
                    {
                    lv_name_0_2=(Token)match(input,RULE_STRING,FOLLOW_17); 

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

            // InternalTPTP.g:1668:3: (otherlv_1= '(' ( (lv_param_2_0= ruleTff_type_atom ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleTff_type_atom ) ) )* otherlv_5= ')' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==14) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalTPTP.g:1669:4: otherlv_1= '(' ( (lv_param_2_0= ruleTff_type_atom ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleTff_type_atom ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_30); 

                    				newLeafNode(otherlv_1, grammarAccess.getTff_type_constantAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalTPTP.g:1673:4: ( (lv_param_2_0= ruleTff_type_atom ) )
                    // InternalTPTP.g:1674:5: (lv_param_2_0= ruleTff_type_atom )
                    {
                    // InternalTPTP.g:1674:5: (lv_param_2_0= ruleTff_type_atom )
                    // InternalTPTP.g:1675:6: lv_param_2_0= ruleTff_type_atom
                    {

                    						newCompositeNode(grammarAccess.getTff_type_constantAccess().getParamTff_type_atomParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_param_2_0=ruleTff_type_atom();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTff_type_constantRule());
                    						}
                    						add(
                    							current,
                    							"param",
                    							lv_param_2_0,
                    							"it.unibz.inf.tptp.TPTP.Tff_type_atom");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTPTP.g:1692:4: (otherlv_3= ',' ( (lv_param_4_0= ruleTff_type_atom ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==18) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalTPTP.g:1693:5: otherlv_3= ',' ( (lv_param_4_0= ruleTff_type_atom ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FOLLOW_30); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getTff_type_constantAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalTPTP.g:1697:5: ( (lv_param_4_0= ruleTff_type_atom ) )
                    	    // InternalTPTP.g:1698:6: (lv_param_4_0= ruleTff_type_atom )
                    	    {
                    	    // InternalTPTP.g:1698:6: (lv_param_4_0= ruleTff_type_atom )
                    	    // InternalTPTP.g:1699:7: lv_param_4_0= ruleTff_type_atom
                    	    {

                    	    							newCompositeNode(grammarAccess.getTff_type_constantAccess().getParamTff_type_atomParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_param_4_0=ruleTff_type_atom();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTff_type_constantRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"param",
                    	    								lv_param_4_0,
                    	    								"it.unibz.inf.tptp.TPTP.Tff_type_atom");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,15,FOLLOW_2); 

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
    // $ANTLR end "ruleTff_type_constant"


    // $ANTLR start "entryRuleTff_type_literal"
    // InternalTPTP.g:1726:1: entryRuleTff_type_literal returns [EObject current=null] : iv_ruleTff_type_literal= ruleTff_type_literal EOF ;
    public final EObject entryRuleTff_type_literal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTff_type_literal = null;


        try {
            // InternalTPTP.g:1726:57: (iv_ruleTff_type_literal= ruleTff_type_literal EOF )
            // InternalTPTP.g:1727:2: iv_ruleTff_type_literal= ruleTff_type_literal EOF
            {
             newCompositeNode(grammarAccess.getTff_type_literalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTff_type_literal=ruleTff_type_literal();

            state._fsp--;

             current =iv_ruleTff_type_literal; 
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
    // $ANTLR end "entryRuleTff_type_literal"


    // $ANTLR start "ruleTff_type_literal"
    // InternalTPTP.g:1733:1: ruleTff_type_literal returns [EObject current=null] : ( ( (lv_name_0_1= '$i' | lv_name_0_2= '$o' | lv_name_0_3= '$tType' | lv_name_0_4= '$int' | lv_name_0_5= '$real' | lv_name_0_6= '$rat' ) ) ) ;
    public final EObject ruleTff_type_literal() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token lv_name_0_4=null;
        Token lv_name_0_5=null;
        Token lv_name_0_6=null;


        	enterRule();

        try {
            // InternalTPTP.g:1739:2: ( ( ( (lv_name_0_1= '$i' | lv_name_0_2= '$o' | lv_name_0_3= '$tType' | lv_name_0_4= '$int' | lv_name_0_5= '$real' | lv_name_0_6= '$rat' ) ) ) )
            // InternalTPTP.g:1740:2: ( ( (lv_name_0_1= '$i' | lv_name_0_2= '$o' | lv_name_0_3= '$tType' | lv_name_0_4= '$int' | lv_name_0_5= '$real' | lv_name_0_6= '$rat' ) ) )
            {
            // InternalTPTP.g:1740:2: ( ( (lv_name_0_1= '$i' | lv_name_0_2= '$o' | lv_name_0_3= '$tType' | lv_name_0_4= '$int' | lv_name_0_5= '$real' | lv_name_0_6= '$rat' ) ) )
            // InternalTPTP.g:1741:3: ( (lv_name_0_1= '$i' | lv_name_0_2= '$o' | lv_name_0_3= '$tType' | lv_name_0_4= '$int' | lv_name_0_5= '$real' | lv_name_0_6= '$rat' ) )
            {
            // InternalTPTP.g:1741:3: ( (lv_name_0_1= '$i' | lv_name_0_2= '$o' | lv_name_0_3= '$tType' | lv_name_0_4= '$int' | lv_name_0_5= '$real' | lv_name_0_6= '$rat' ) )
            // InternalTPTP.g:1742:4: (lv_name_0_1= '$i' | lv_name_0_2= '$o' | lv_name_0_3= '$tType' | lv_name_0_4= '$int' | lv_name_0_5= '$real' | lv_name_0_6= '$rat' )
            {
            // InternalTPTP.g:1742:4: (lv_name_0_1= '$i' | lv_name_0_2= '$o' | lv_name_0_3= '$tType' | lv_name_0_4= '$int' | lv_name_0_5= '$real' | lv_name_0_6= '$rat' )
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
                    // InternalTPTP.g:1743:5: lv_name_0_1= '$i'
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
                    // InternalTPTP.g:1754:5: lv_name_0_2= '$o'
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
                    // InternalTPTP.g:1765:5: lv_name_0_3= '$tType'
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
                    // InternalTPTP.g:1776:5: lv_name_0_4= '$int'
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
                    // InternalTPTP.g:1787:5: lv_name_0_5= '$real'
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
                    // InternalTPTP.g:1798:5: lv_name_0_6= '$rat'
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
    // $ANTLR end "ruleTff_type_literal"


    // $ANTLR start "entryRuleTff_expression"
    // InternalTPTP.g:1814:1: entryRuleTff_expression returns [EObject current=null] : iv_ruleTff_expression= ruleTff_expression EOF ;
    public final EObject entryRuleTff_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTff_expression = null;


        try {
            // InternalTPTP.g:1814:55: (iv_ruleTff_expression= ruleTff_expression EOF )
            // InternalTPTP.g:1815:2: iv_ruleTff_expression= ruleTff_expression EOF
            {
             newCompositeNode(grammarAccess.getTff_expressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTff_expression=ruleTff_expression();

            state._fsp--;

             current =iv_ruleTff_expression; 
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
    // $ANTLR end "entryRuleTff_expression"


    // $ANTLR start "ruleTff_expression"
    // InternalTPTP.g:1821:1: ruleTff_expression returns [EObject current=null] : (this_Tff_terminating_expression_0= ruleTff_terminating_expression ( () ( (lv_op_2_0= ruleBinary_operator ) ) ( (lv_right_3_0= ruleTff_terminating_expression ) ) )* ) ;
    public final EObject ruleTff_expression() throws RecognitionException {
        EObject current = null;

        EObject this_Tff_terminating_expression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:1827:2: ( (this_Tff_terminating_expression_0= ruleTff_terminating_expression ( () ( (lv_op_2_0= ruleBinary_operator ) ) ( (lv_right_3_0= ruleTff_terminating_expression ) ) )* ) )
            // InternalTPTP.g:1828:2: (this_Tff_terminating_expression_0= ruleTff_terminating_expression ( () ( (lv_op_2_0= ruleBinary_operator ) ) ( (lv_right_3_0= ruleTff_terminating_expression ) ) )* )
            {
            // InternalTPTP.g:1828:2: (this_Tff_terminating_expression_0= ruleTff_terminating_expression ( () ( (lv_op_2_0= ruleBinary_operator ) ) ( (lv_right_3_0= ruleTff_terminating_expression ) ) )* )
            // InternalTPTP.g:1829:3: this_Tff_terminating_expression_0= ruleTff_terminating_expression ( () ( (lv_op_2_0= ruleBinary_operator ) ) ( (lv_right_3_0= ruleTff_terminating_expression ) ) )*
            {

            			newCompositeNode(grammarAccess.getTff_expressionAccess().getTff_terminating_expressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_Tff_terminating_expression_0=ruleTff_terminating_expression();

            state._fsp--;


            			current = this_Tff_terminating_expression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTPTP.g:1837:3: ( () ( (lv_op_2_0= ruleBinary_operator ) ) ( (lv_right_3_0= ruleTff_terminating_expression ) ) )*
            loop35:
            do {
                int alt35=2;
                alt35 = dfa35.predict(input);
                switch (alt35) {
            	case 1 :
            	    // InternalTPTP.g:1838:4: () ( (lv_op_2_0= ruleBinary_operator ) ) ( (lv_right_3_0= ruleTff_terminating_expression ) )
            	    {
            	    // InternalTPTP.g:1838:4: ()
            	    // InternalTPTP.g:1839:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getTff_expressionAccess().getBinaryLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalTPTP.g:1845:4: ( (lv_op_2_0= ruleBinary_operator ) )
            	    // InternalTPTP.g:1846:5: (lv_op_2_0= ruleBinary_operator )
            	    {
            	    // InternalTPTP.g:1846:5: (lv_op_2_0= ruleBinary_operator )
            	    // InternalTPTP.g:1847:6: lv_op_2_0= ruleBinary_operator
            	    {

            	    						newCompositeNode(grammarAccess.getTff_expressionAccess().getOpBinary_operatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_op_2_0=ruleBinary_operator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTff_expressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"op",
            	    							lv_op_2_0,
            	    							"it.unibz.inf.tptp.TPTP.Binary_operator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalTPTP.g:1864:4: ( (lv_right_3_0= ruleTff_terminating_expression ) )
            	    // InternalTPTP.g:1865:5: (lv_right_3_0= ruleTff_terminating_expression )
            	    {
            	    // InternalTPTP.g:1865:5: (lv_right_3_0= ruleTff_terminating_expression )
            	    // InternalTPTP.g:1866:6: lv_right_3_0= ruleTff_terminating_expression
            	    {

            	    						newCompositeNode(grammarAccess.getTff_expressionAccess().getRightTff_terminating_expressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_right_3_0=ruleTff_terminating_expression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTff_expressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"it.unibz.inf.tptp.TPTP.Tff_terminating_expression");
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
    // $ANTLR end "ruleTff_expression"


    // $ANTLR start "entryRuleTff_terminating_expression"
    // InternalTPTP.g:1888:1: entryRuleTff_terminating_expression returns [EObject current=null] : iv_ruleTff_terminating_expression= ruleTff_terminating_expression EOF ;
    public final EObject entryRuleTff_terminating_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTff_terminating_expression = null;


        try {
            // InternalTPTP.g:1888:67: (iv_ruleTff_terminating_expression= ruleTff_terminating_expression EOF )
            // InternalTPTP.g:1889:2: iv_ruleTff_terminating_expression= ruleTff_terminating_expression EOF
            {
             newCompositeNode(grammarAccess.getTff_terminating_expressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTff_terminating_expression=ruleTff_terminating_expression();

            state._fsp--;

             current =iv_ruleTff_terminating_expression; 
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
    // $ANTLR end "entryRuleTff_terminating_expression"


    // $ANTLR start "ruleTff_terminating_expression"
    // InternalTPTP.g:1895:1: ruleTff_terminating_expression returns [EObject current=null] : ( ( (lv_atom_0_0= ruleTff_atom ) ) | (otherlv_1= '(' this_Tff_expression_2= ruleTff_expression otherlv_3= ')' ) | ( ( (lv_negation_4_0= '~' ) ) ( (lv_exp_5_0= ruleTff_expression ) ) ) | ( (lv_exp_6_0= ruleTff_quantifier_expression ) ) ) ;
    public final EObject ruleTff_terminating_expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_negation_4_0=null;
        EObject lv_atom_0_0 = null;

        EObject this_Tff_expression_2 = null;

        EObject lv_exp_5_0 = null;

        EObject lv_exp_6_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:1901:2: ( ( ( (lv_atom_0_0= ruleTff_atom ) ) | (otherlv_1= '(' this_Tff_expression_2= ruleTff_expression otherlv_3= ')' ) | ( ( (lv_negation_4_0= '~' ) ) ( (lv_exp_5_0= ruleTff_expression ) ) ) | ( (lv_exp_6_0= ruleTff_quantifier_expression ) ) ) )
            // InternalTPTP.g:1902:2: ( ( (lv_atom_0_0= ruleTff_atom ) ) | (otherlv_1= '(' this_Tff_expression_2= ruleTff_expression otherlv_3= ')' ) | ( ( (lv_negation_4_0= '~' ) ) ( (lv_exp_5_0= ruleTff_expression ) ) ) | ( (lv_exp_6_0= ruleTff_quantifier_expression ) ) )
            {
            // InternalTPTP.g:1902:2: ( ( (lv_atom_0_0= ruleTff_atom ) ) | (otherlv_1= '(' this_Tff_expression_2= ruleTff_expression otherlv_3= ')' ) | ( ( (lv_negation_4_0= '~' ) ) ( (lv_exp_5_0= ruleTff_expression ) ) ) | ( (lv_exp_6_0= ruleTff_quantifier_expression ) ) )
            int alt36=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_UPPER_TOKEN:
            case RULE_LOWER_TOKEN:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
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
            case 14:
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
                    // InternalTPTP.g:1903:3: ( (lv_atom_0_0= ruleTff_atom ) )
                    {
                    // InternalTPTP.g:1903:3: ( (lv_atom_0_0= ruleTff_atom ) )
                    // InternalTPTP.g:1904:4: (lv_atom_0_0= ruleTff_atom )
                    {
                    // InternalTPTP.g:1904:4: (lv_atom_0_0= ruleTff_atom )
                    // InternalTPTP.g:1905:5: lv_atom_0_0= ruleTff_atom
                    {

                    					newCompositeNode(grammarAccess.getTff_terminating_expressionAccess().getAtomTff_atomParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_atom_0_0=ruleTff_atom();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTff_terminating_expressionRule());
                    					}
                    					set(
                    						current,
                    						"atom",
                    						lv_atom_0_0,
                    						"it.unibz.inf.tptp.TPTP.Tff_atom");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTPTP.g:1923:3: (otherlv_1= '(' this_Tff_expression_2= ruleTff_expression otherlv_3= ')' )
                    {
                    // InternalTPTP.g:1923:3: (otherlv_1= '(' this_Tff_expression_2= ruleTff_expression otherlv_3= ')' )
                    // InternalTPTP.g:1924:4: otherlv_1= '(' this_Tff_expression_2= ruleTff_expression otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_25); 

                    				newLeafNode(otherlv_1, grammarAccess.getTff_terminating_expressionAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getTff_terminating_expressionAccess().getTff_expressionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_10);
                    this_Tff_expression_2=ruleTff_expression();

                    state._fsp--;


                    				current = this_Tff_expression_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getTff_terminating_expressionAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTPTP.g:1942:3: ( ( (lv_negation_4_0= '~' ) ) ( (lv_exp_5_0= ruleTff_expression ) ) )
                    {
                    // InternalTPTP.g:1942:3: ( ( (lv_negation_4_0= '~' ) ) ( (lv_exp_5_0= ruleTff_expression ) ) )
                    // InternalTPTP.g:1943:4: ( (lv_negation_4_0= '~' ) ) ( (lv_exp_5_0= ruleTff_expression ) )
                    {
                    // InternalTPTP.g:1943:4: ( (lv_negation_4_0= '~' ) )
                    // InternalTPTP.g:1944:5: (lv_negation_4_0= '~' )
                    {
                    // InternalTPTP.g:1944:5: (lv_negation_4_0= '~' )
                    // InternalTPTP.g:1945:6: lv_negation_4_0= '~'
                    {
                    lv_negation_4_0=(Token)match(input,25,FOLLOW_25); 

                    						newLeafNode(lv_negation_4_0, grammarAccess.getTff_terminating_expressionAccess().getNegationTildeKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_terminating_expressionRule());
                    						}
                    						setWithLastConsumed(current, "negation", true, "~");
                    					

                    }


                    }

                    // InternalTPTP.g:1957:4: ( (lv_exp_5_0= ruleTff_expression ) )
                    // InternalTPTP.g:1958:5: (lv_exp_5_0= ruleTff_expression )
                    {
                    // InternalTPTP.g:1958:5: (lv_exp_5_0= ruleTff_expression )
                    // InternalTPTP.g:1959:6: lv_exp_5_0= ruleTff_expression
                    {

                    						newCompositeNode(grammarAccess.getTff_terminating_expressionAccess().getExpTff_expressionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_exp_5_0=ruleTff_expression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTff_terminating_expressionRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_5_0,
                    							"it.unibz.inf.tptp.TPTP.Tff_expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalTPTP.g:1978:3: ( (lv_exp_6_0= ruleTff_quantifier_expression ) )
                    {
                    // InternalTPTP.g:1978:3: ( (lv_exp_6_0= ruleTff_quantifier_expression ) )
                    // InternalTPTP.g:1979:4: (lv_exp_6_0= ruleTff_quantifier_expression )
                    {
                    // InternalTPTP.g:1979:4: (lv_exp_6_0= ruleTff_quantifier_expression )
                    // InternalTPTP.g:1980:5: lv_exp_6_0= ruleTff_quantifier_expression
                    {

                    					newCompositeNode(grammarAccess.getTff_terminating_expressionAccess().getExpTff_quantifier_expressionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_exp_6_0=ruleTff_quantifier_expression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTff_terminating_expressionRule());
                    					}
                    					set(
                    						current,
                    						"exp",
                    						lv_exp_6_0,
                    						"it.unibz.inf.tptp.TPTP.Tff_quantifier_expression");
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
    // $ANTLR end "ruleTff_terminating_expression"


    // $ANTLR start "entryRuleTff_atom"
    // InternalTPTP.g:2001:1: entryRuleTff_atom returns [EObject current=null] : iv_ruleTff_atom= ruleTff_atom EOF ;
    public final EObject entryRuleTff_atom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTff_atom = null;


        try {
            // InternalTPTP.g:2001:49: (iv_ruleTff_atom= ruleTff_atom EOF )
            // InternalTPTP.g:2002:2: iv_ruleTff_atom= ruleTff_atom EOF
            {
             newCompositeNode(grammarAccess.getTff_atomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTff_atom=ruleTff_atom();

            state._fsp--;

             current =iv_ruleTff_atom; 
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
    // $ANTLR end "entryRuleTff_atom"


    // $ANTLR start "ruleTff_atom"
    // InternalTPTP.g:2008:1: ruleTff_atom returns [EObject current=null] : (this_Tff_var_0= ruleTff_var | this_Tff_atom_literal_1= ruleTff_atom_literal | this_Tff_constant_2= ruleTff_constant | this_Tff_predefined_function_1_args_3= ruleTff_predefined_function_1_args | this_Tff_predefined_function_2_args_4= ruleTff_predefined_function_2_args ) ;
    public final EObject ruleTff_atom() throws RecognitionException {
        EObject current = null;

        EObject this_Tff_var_0 = null;

        EObject this_Tff_atom_literal_1 = null;

        EObject this_Tff_constant_2 = null;

        EObject this_Tff_predefined_function_1_args_3 = null;

        EObject this_Tff_predefined_function_2_args_4 = null;



        	enterRule();

        try {
            // InternalTPTP.g:2014:2: ( (this_Tff_var_0= ruleTff_var | this_Tff_atom_literal_1= ruleTff_atom_literal | this_Tff_constant_2= ruleTff_constant | this_Tff_predefined_function_1_args_3= ruleTff_predefined_function_1_args | this_Tff_predefined_function_2_args_4= ruleTff_predefined_function_2_args ) )
            // InternalTPTP.g:2015:2: (this_Tff_var_0= ruleTff_var | this_Tff_atom_literal_1= ruleTff_atom_literal | this_Tff_constant_2= ruleTff_constant | this_Tff_predefined_function_1_args_3= ruleTff_predefined_function_1_args | this_Tff_predefined_function_2_args_4= ruleTff_predefined_function_2_args )
            {
            // InternalTPTP.g:2015:2: (this_Tff_var_0= ruleTff_var | this_Tff_atom_literal_1= ruleTff_atom_literal | this_Tff_constant_2= ruleTff_constant | this_Tff_predefined_function_1_args_3= ruleTff_predefined_function_1_args | this_Tff_predefined_function_2_args_4= ruleTff_predefined_function_2_args )
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
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
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
                    // InternalTPTP.g:2016:3: this_Tff_var_0= ruleTff_var
                    {

                    			newCompositeNode(grammarAccess.getTff_atomAccess().getTff_varParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Tff_var_0=ruleTff_var();

                    state._fsp--;


                    			current = this_Tff_var_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:2025:3: this_Tff_atom_literal_1= ruleTff_atom_literal
                    {

                    			newCompositeNode(grammarAccess.getTff_atomAccess().getTff_atom_literalParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Tff_atom_literal_1=ruleTff_atom_literal();

                    state._fsp--;


                    			current = this_Tff_atom_literal_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTPTP.g:2034:3: this_Tff_constant_2= ruleTff_constant
                    {

                    			newCompositeNode(grammarAccess.getTff_atomAccess().getTff_constantParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Tff_constant_2=ruleTff_constant();

                    state._fsp--;


                    			current = this_Tff_constant_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTPTP.g:2043:3: this_Tff_predefined_function_1_args_3= ruleTff_predefined_function_1_args
                    {

                    			newCompositeNode(grammarAccess.getTff_atomAccess().getTff_predefined_function_1_argsParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Tff_predefined_function_1_args_3=ruleTff_predefined_function_1_args();

                    state._fsp--;


                    			current = this_Tff_predefined_function_1_args_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalTPTP.g:2052:3: this_Tff_predefined_function_2_args_4= ruleTff_predefined_function_2_args
                    {

                    			newCompositeNode(grammarAccess.getTff_atomAccess().getTff_predefined_function_2_argsParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Tff_predefined_function_2_args_4=ruleTff_predefined_function_2_args();

                    state._fsp--;


                    			current = this_Tff_predefined_function_2_args_4;
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
    // $ANTLR end "ruleTff_atom"


    // $ANTLR start "entryRuleTff_constant"
    // InternalTPTP.g:2064:1: entryRuleTff_constant returns [EObject current=null] : iv_ruleTff_constant= ruleTff_constant EOF ;
    public final EObject entryRuleTff_constant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTff_constant = null;


        try {
            // InternalTPTP.g:2064:53: (iv_ruleTff_constant= ruleTff_constant EOF )
            // InternalTPTP.g:2065:2: iv_ruleTff_constant= ruleTff_constant EOF
            {
             newCompositeNode(grammarAccess.getTff_constantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTff_constant=ruleTff_constant();

            state._fsp--;

             current =iv_ruleTff_constant; 
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
    // $ANTLR end "entryRuleTff_constant"


    // $ANTLR start "ruleTff_constant"
    // InternalTPTP.g:2071:1: ruleTff_constant returns [EObject current=null] : ( ( ( ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleTff_atom ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleTff_atom ) ) )* otherlv_5= ')' )? ) | ( ( (lv_top_6_0= ruleLower_token_and_keyword ) ) ( (lv_name_7_0= '/' ) ) ( (lv_bottom_8_0= ruleLower_token_and_keyword ) ) ) ) ;
    public final EObject ruleTff_constant() throws RecognitionException {
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
            // InternalTPTP.g:2077:2: ( ( ( ( ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleTff_atom ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleTff_atom ) ) )* otherlv_5= ')' )? ) | ( ( (lv_top_6_0= ruleLower_token_and_keyword ) ) ( (lv_name_7_0= '/' ) ) ( (lv_bottom_8_0= ruleLower_token_and_keyword ) ) ) ) )
            // InternalTPTP.g:2078:2: ( ( ( ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleTff_atom ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleTff_atom ) ) )* otherlv_5= ')' )? ) | ( ( (lv_top_6_0= ruleLower_token_and_keyword ) ) ( (lv_name_7_0= '/' ) ) ( (lv_bottom_8_0= ruleLower_token_and_keyword ) ) ) )
            {
            // InternalTPTP.g:2078:2: ( ( ( ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleTff_atom ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleTff_atom ) ) )* otherlv_5= ')' )? ) | ( ( (lv_top_6_0= ruleLower_token_and_keyword ) ) ( (lv_name_7_0= '/' ) ) ( (lv_bottom_8_0= ruleLower_token_and_keyword ) ) ) )
            int alt41=2;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // InternalTPTP.g:2079:3: ( ( ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleTff_atom ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleTff_atom ) ) )* otherlv_5= ')' )? )
                    {
                    // InternalTPTP.g:2079:3: ( ( ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleTff_atom ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleTff_atom ) ) )* otherlv_5= ')' )? )
                    // InternalTPTP.g:2080:4: ( ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleTff_atom ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleTff_atom ) ) )* otherlv_5= ')' )?
                    {
                    // InternalTPTP.g:2080:4: ( ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) )
                    // InternalTPTP.g:2081:5: ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) )
                    {
                    // InternalTPTP.g:2081:5: ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) )
                    // InternalTPTP.g:2082:6: (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING )
                    {
                    // InternalTPTP.g:2082:6: (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==RULE_LOWER_TOKEN||(LA38_0>=19 && LA38_0<=24)||LA38_0==34||LA38_0==67) ) {
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
                            // InternalTPTP.g:2083:7: lv_name_0_1= ruleLower_token_and_keyword
                            {

                            							newCompositeNode(grammarAccess.getTff_constantAccess().getNameLower_token_and_keywordParserRuleCall_0_0_0_0());
                            						
                            pushFollow(FOLLOW_17);
                            lv_name_0_1=ruleLower_token_and_keyword();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getTff_constantRule());
                            							}
                            							set(
                            								current,
                            								"name",
                            								lv_name_0_1,
                            								"it.unibz.inf.tptp.TPTP.Lower_token_and_keyword");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalTPTP.g:2099:7: lv_name_0_2= RULE_STRING
                            {
                            lv_name_0_2=(Token)match(input,RULE_STRING,FOLLOW_17); 

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

                    // InternalTPTP.g:2116:4: (otherlv_1= '(' ( (lv_param_2_0= ruleTff_atom ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleTff_atom ) ) )* otherlv_5= ')' )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==14) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalTPTP.g:2117:5: otherlv_1= '(' ( (lv_param_2_0= ruleTff_atom ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleTff_atom ) ) )* otherlv_5= ')'
                            {
                            otherlv_1=(Token)match(input,14,FOLLOW_31); 

                            					newLeafNode(otherlv_1, grammarAccess.getTff_constantAccess().getLeftParenthesisKeyword_0_1_0());
                            				
                            // InternalTPTP.g:2121:5: ( (lv_param_2_0= ruleTff_atom ) )
                            // InternalTPTP.g:2122:6: (lv_param_2_0= ruleTff_atom )
                            {
                            // InternalTPTP.g:2122:6: (lv_param_2_0= ruleTff_atom )
                            // InternalTPTP.g:2123:7: lv_param_2_0= ruleTff_atom
                            {

                            							newCompositeNode(grammarAccess.getTff_constantAccess().getParamTff_atomParserRuleCall_0_1_1_0());
                            						
                            pushFollow(FOLLOW_19);
                            lv_param_2_0=ruleTff_atom();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getTff_constantRule());
                            							}
                            							add(
                            								current,
                            								"param",
                            								lv_param_2_0,
                            								"it.unibz.inf.tptp.TPTP.Tff_atom");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalTPTP.g:2140:5: (otherlv_3= ',' ( (lv_param_4_0= ruleTff_atom ) ) )*
                            loop39:
                            do {
                                int alt39=2;
                                int LA39_0 = input.LA(1);

                                if ( (LA39_0==18) ) {
                                    alt39=1;
                                }


                                switch (alt39) {
                            	case 1 :
                            	    // InternalTPTP.g:2141:6: otherlv_3= ',' ( (lv_param_4_0= ruleTff_atom ) )
                            	    {
                            	    otherlv_3=(Token)match(input,18,FOLLOW_31); 

                            	    						newLeafNode(otherlv_3, grammarAccess.getTff_constantAccess().getCommaKeyword_0_1_2_0());
                            	    					
                            	    // InternalTPTP.g:2145:6: ( (lv_param_4_0= ruleTff_atom ) )
                            	    // InternalTPTP.g:2146:7: (lv_param_4_0= ruleTff_atom )
                            	    {
                            	    // InternalTPTP.g:2146:7: (lv_param_4_0= ruleTff_atom )
                            	    // InternalTPTP.g:2147:8: lv_param_4_0= ruleTff_atom
                            	    {

                            	    								newCompositeNode(grammarAccess.getTff_constantAccess().getParamTff_atomParserRuleCall_0_1_2_1_0());
                            	    							
                            	    pushFollow(FOLLOW_19);
                            	    lv_param_4_0=ruleTff_atom();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getTff_constantRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"param",
                            	    									lv_param_4_0,
                            	    									"it.unibz.inf.tptp.TPTP.Tff_atom");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop39;
                                }
                            } while (true);

                            otherlv_5=(Token)match(input,15,FOLLOW_2); 

                            					newLeafNode(otherlv_5, grammarAccess.getTff_constantAccess().getRightParenthesisKeyword_0_1_3());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTPTP.g:2172:3: ( ( (lv_top_6_0= ruleLower_token_and_keyword ) ) ( (lv_name_7_0= '/' ) ) ( (lv_bottom_8_0= ruleLower_token_and_keyword ) ) )
                    {
                    // InternalTPTP.g:2172:3: ( ( (lv_top_6_0= ruleLower_token_and_keyword ) ) ( (lv_name_7_0= '/' ) ) ( (lv_bottom_8_0= ruleLower_token_and_keyword ) ) )
                    // InternalTPTP.g:2173:4: ( (lv_top_6_0= ruleLower_token_and_keyword ) ) ( (lv_name_7_0= '/' ) ) ( (lv_bottom_8_0= ruleLower_token_and_keyword ) )
                    {
                    // InternalTPTP.g:2173:4: ( (lv_top_6_0= ruleLower_token_and_keyword ) )
                    // InternalTPTP.g:2174:5: (lv_top_6_0= ruleLower_token_and_keyword )
                    {
                    // InternalTPTP.g:2174:5: (lv_top_6_0= ruleLower_token_and_keyword )
                    // InternalTPTP.g:2175:6: lv_top_6_0= ruleLower_token_and_keyword
                    {

                    						newCompositeNode(grammarAccess.getTff_constantAccess().getTopLower_token_and_keywordParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_top_6_0=ruleLower_token_and_keyword();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTff_constantRule());
                    						}
                    						set(
                    							current,
                    							"top",
                    							lv_top_6_0,
                    							"it.unibz.inf.tptp.TPTP.Lower_token_and_keyword");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTPTP.g:2192:4: ( (lv_name_7_0= '/' ) )
                    // InternalTPTP.g:2193:5: (lv_name_7_0= '/' )
                    {
                    // InternalTPTP.g:2193:5: (lv_name_7_0= '/' )
                    // InternalTPTP.g:2194:6: lv_name_7_0= '/'
                    {
                    lv_name_7_0=(Token)match(input,43,FOLLOW_33); 

                    						newLeafNode(lv_name_7_0, grammarAccess.getTff_constantAccess().getNameSolidusKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_constantRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_7_0, "/");
                    					

                    }


                    }

                    // InternalTPTP.g:2206:4: ( (lv_bottom_8_0= ruleLower_token_and_keyword ) )
                    // InternalTPTP.g:2207:5: (lv_bottom_8_0= ruleLower_token_and_keyword )
                    {
                    // InternalTPTP.g:2207:5: (lv_bottom_8_0= ruleLower_token_and_keyword )
                    // InternalTPTP.g:2208:6: lv_bottom_8_0= ruleLower_token_and_keyword
                    {

                    						newCompositeNode(grammarAccess.getTff_constantAccess().getBottomLower_token_and_keywordParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_bottom_8_0=ruleLower_token_and_keyword();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTff_constantRule());
                    						}
                    						set(
                    							current,
                    							"bottom",
                    							lv_bottom_8_0,
                    							"it.unibz.inf.tptp.TPTP.Lower_token_and_keyword");
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
    // $ANTLR end "ruleTff_constant"


    // $ANTLR start "entryRuleTff_atom_literal"
    // InternalTPTP.g:2230:1: entryRuleTff_atom_literal returns [EObject current=null] : iv_ruleTff_atom_literal= ruleTff_atom_literal EOF ;
    public final EObject entryRuleTff_atom_literal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTff_atom_literal = null;


        try {
            // InternalTPTP.g:2230:57: (iv_ruleTff_atom_literal= ruleTff_atom_literal EOF )
            // InternalTPTP.g:2231:2: iv_ruleTff_atom_literal= ruleTff_atom_literal EOF
            {
             newCompositeNode(grammarAccess.getTff_atom_literalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTff_atom_literal=ruleTff_atom_literal();

            state._fsp--;

             current =iv_ruleTff_atom_literal; 
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
    // $ANTLR end "entryRuleTff_atom_literal"


    // $ANTLR start "ruleTff_atom_literal"
    // InternalTPTP.g:2237:1: ruleTff_atom_literal returns [EObject current=null] : ( ( (lv_name_0_1= '$true' | lv_name_0_2= '$false' ) ) ) ;
    public final EObject ruleTff_atom_literal() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;


        	enterRule();

        try {
            // InternalTPTP.g:2243:2: ( ( ( (lv_name_0_1= '$true' | lv_name_0_2= '$false' ) ) ) )
            // InternalTPTP.g:2244:2: ( ( (lv_name_0_1= '$true' | lv_name_0_2= '$false' ) ) )
            {
            // InternalTPTP.g:2244:2: ( ( (lv_name_0_1= '$true' | lv_name_0_2= '$false' ) ) )
            // InternalTPTP.g:2245:3: ( (lv_name_0_1= '$true' | lv_name_0_2= '$false' ) )
            {
            // InternalTPTP.g:2245:3: ( (lv_name_0_1= '$true' | lv_name_0_2= '$false' ) )
            // InternalTPTP.g:2246:4: (lv_name_0_1= '$true' | lv_name_0_2= '$false' )
            {
            // InternalTPTP.g:2246:4: (lv_name_0_1= '$true' | lv_name_0_2= '$false' )
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
                    // InternalTPTP.g:2247:5: lv_name_0_1= '$true'
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
                    // InternalTPTP.g:2258:5: lv_name_0_2= '$false'
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
    // $ANTLR end "ruleTff_atom_literal"


    // $ANTLR start "entryRuleTff_predefined_function_1_args"
    // InternalTPTP.g:2274:1: entryRuleTff_predefined_function_1_args returns [EObject current=null] : iv_ruleTff_predefined_function_1_args= ruleTff_predefined_function_1_args EOF ;
    public final EObject entryRuleTff_predefined_function_1_args() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTff_predefined_function_1_args = null;


        try {
            // InternalTPTP.g:2274:71: (iv_ruleTff_predefined_function_1_args= ruleTff_predefined_function_1_args EOF )
            // InternalTPTP.g:2275:2: iv_ruleTff_predefined_function_1_args= ruleTff_predefined_function_1_args EOF
            {
             newCompositeNode(grammarAccess.getTff_predefined_function_1_argsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTff_predefined_function_1_args=ruleTff_predefined_function_1_args();

            state._fsp--;

             current =iv_ruleTff_predefined_function_1_args; 
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
    // $ANTLR end "entryRuleTff_predefined_function_1_args"


    // $ANTLR start "ruleTff_predefined_function_1_args"
    // InternalTPTP.g:2281:1: ruleTff_predefined_function_1_args returns [EObject current=null] : ( ( ( (lv_name_0_1= '$is_int' | lv_name_0_2= '$is_rat' | lv_name_0_3= '$uminus' | lv_name_0_4= '$to_int' | lv_name_0_5= '$to_rat' | lv_name_0_6= '$to_real' ) ) ) otherlv_1= '(' ( (lv_param_2_0= ruleTff_expression ) ) otherlv_3= ')' ) ;
    public final EObject ruleTff_predefined_function_1_args() throws RecognitionException {
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
            // InternalTPTP.g:2287:2: ( ( ( ( (lv_name_0_1= '$is_int' | lv_name_0_2= '$is_rat' | lv_name_0_3= '$uminus' | lv_name_0_4= '$to_int' | lv_name_0_5= '$to_rat' | lv_name_0_6= '$to_real' ) ) ) otherlv_1= '(' ( (lv_param_2_0= ruleTff_expression ) ) otherlv_3= ')' ) )
            // InternalTPTP.g:2288:2: ( ( ( (lv_name_0_1= '$is_int' | lv_name_0_2= '$is_rat' | lv_name_0_3= '$uminus' | lv_name_0_4= '$to_int' | lv_name_0_5= '$to_rat' | lv_name_0_6= '$to_real' ) ) ) otherlv_1= '(' ( (lv_param_2_0= ruleTff_expression ) ) otherlv_3= ')' )
            {
            // InternalTPTP.g:2288:2: ( ( ( (lv_name_0_1= '$is_int' | lv_name_0_2= '$is_rat' | lv_name_0_3= '$uminus' | lv_name_0_4= '$to_int' | lv_name_0_5= '$to_rat' | lv_name_0_6= '$to_real' ) ) ) otherlv_1= '(' ( (lv_param_2_0= ruleTff_expression ) ) otherlv_3= ')' )
            // InternalTPTP.g:2289:3: ( ( (lv_name_0_1= '$is_int' | lv_name_0_2= '$is_rat' | lv_name_0_3= '$uminus' | lv_name_0_4= '$to_int' | lv_name_0_5= '$to_rat' | lv_name_0_6= '$to_real' ) ) ) otherlv_1= '(' ( (lv_param_2_0= ruleTff_expression ) ) otherlv_3= ')'
            {
            // InternalTPTP.g:2289:3: ( ( (lv_name_0_1= '$is_int' | lv_name_0_2= '$is_rat' | lv_name_0_3= '$uminus' | lv_name_0_4= '$to_int' | lv_name_0_5= '$to_rat' | lv_name_0_6= '$to_real' ) ) )
            // InternalTPTP.g:2290:4: ( (lv_name_0_1= '$is_int' | lv_name_0_2= '$is_rat' | lv_name_0_3= '$uminus' | lv_name_0_4= '$to_int' | lv_name_0_5= '$to_rat' | lv_name_0_6= '$to_real' ) )
            {
            // InternalTPTP.g:2290:4: ( (lv_name_0_1= '$is_int' | lv_name_0_2= '$is_rat' | lv_name_0_3= '$uminus' | lv_name_0_4= '$to_int' | lv_name_0_5= '$to_rat' | lv_name_0_6= '$to_real' ) )
            // InternalTPTP.g:2291:5: (lv_name_0_1= '$is_int' | lv_name_0_2= '$is_rat' | lv_name_0_3= '$uminus' | lv_name_0_4= '$to_int' | lv_name_0_5= '$to_rat' | lv_name_0_6= '$to_real' )
            {
            // InternalTPTP.g:2291:5: (lv_name_0_1= '$is_int' | lv_name_0_2= '$is_rat' | lv_name_0_3= '$uminus' | lv_name_0_4= '$to_int' | lv_name_0_5= '$to_rat' | lv_name_0_6= '$to_real' )
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
                    // InternalTPTP.g:2292:6: lv_name_0_1= '$is_int'
                    {
                    lv_name_0_1=(Token)match(input,44,FOLLOW_8); 

                    						newLeafNode(lv_name_0_1, grammarAccess.getTff_predefined_function_1_argsAccess().getNameIs_intKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_predefined_function_1_argsRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:2303:6: lv_name_0_2= '$is_rat'
                    {
                    lv_name_0_2=(Token)match(input,45,FOLLOW_8); 

                    						newLeafNode(lv_name_0_2, grammarAccess.getTff_predefined_function_1_argsAccess().getNameIs_ratKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_predefined_function_1_argsRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalTPTP.g:2314:6: lv_name_0_3= '$uminus'
                    {
                    lv_name_0_3=(Token)match(input,46,FOLLOW_8); 

                    						newLeafNode(lv_name_0_3, grammarAccess.getTff_predefined_function_1_argsAccess().getNameUminusKeyword_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_predefined_function_1_argsRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_0_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalTPTP.g:2325:6: lv_name_0_4= '$to_int'
                    {
                    lv_name_0_4=(Token)match(input,47,FOLLOW_8); 

                    						newLeafNode(lv_name_0_4, grammarAccess.getTff_predefined_function_1_argsAccess().getNameTo_intKeyword_0_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_predefined_function_1_argsRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_0_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalTPTP.g:2336:6: lv_name_0_5= '$to_rat'
                    {
                    lv_name_0_5=(Token)match(input,48,FOLLOW_8); 

                    						newLeafNode(lv_name_0_5, grammarAccess.getTff_predefined_function_1_argsAccess().getNameTo_ratKeyword_0_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_predefined_function_1_argsRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_0_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalTPTP.g:2347:6: lv_name_0_6= '$to_real'
                    {
                    lv_name_0_6=(Token)match(input,49,FOLLOW_8); 

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

            otherlv_1=(Token)match(input,14,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getTff_predefined_function_1_argsAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTPTP.g:2364:3: ( (lv_param_2_0= ruleTff_expression ) )
            // InternalTPTP.g:2365:4: (lv_param_2_0= ruleTff_expression )
            {
            // InternalTPTP.g:2365:4: (lv_param_2_0= ruleTff_expression )
            // InternalTPTP.g:2366:5: lv_param_2_0= ruleTff_expression
            {

            					newCompositeNode(grammarAccess.getTff_predefined_function_1_argsAccess().getParamTff_expressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_param_2_0=ruleTff_expression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTff_predefined_function_1_argsRule());
            					}
            					add(
            						current,
            						"param",
            						lv_param_2_0,
            						"it.unibz.inf.tptp.TPTP.Tff_expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

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
    // $ANTLR end "ruleTff_predefined_function_1_args"


    // $ANTLR start "entryRuleTff_predefined_function_2_args"
    // InternalTPTP.g:2391:1: entryRuleTff_predefined_function_2_args returns [EObject current=null] : iv_ruleTff_predefined_function_2_args= ruleTff_predefined_function_2_args EOF ;
    public final EObject entryRuleTff_predefined_function_2_args() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTff_predefined_function_2_args = null;


        try {
            // InternalTPTP.g:2391:71: (iv_ruleTff_predefined_function_2_args= ruleTff_predefined_function_2_args EOF )
            // InternalTPTP.g:2392:2: iv_ruleTff_predefined_function_2_args= ruleTff_predefined_function_2_args EOF
            {
             newCompositeNode(grammarAccess.getTff_predefined_function_2_argsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTff_predefined_function_2_args=ruleTff_predefined_function_2_args();

            state._fsp--;

             current =iv_ruleTff_predefined_function_2_args; 
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
    // $ANTLR end "entryRuleTff_predefined_function_2_args"


    // $ANTLR start "ruleTff_predefined_function_2_args"
    // InternalTPTP.g:2398:1: ruleTff_predefined_function_2_args returns [EObject current=null] : ( ( ( (lv_func_0_1= '$less' | lv_func_0_2= '$sum' | lv_func_0_3= '$difference' | lv_func_0_4= '$product' | lv_func_0_5= '$quotient' | lv_func_0_6= '$quotient_e' | lv_func_0_7= '$quotient_t' | lv_func_0_8= '$quotient_f' | lv_func_0_9= '$remainder_e' | lv_func_0_10= '$remainder_t' | lv_func_0_11= '$remainder_f' | lv_func_0_12= '$greatereq' | lv_func_0_13= '$lesseq' | lv_func_0_14= '$greater' | lv_func_0_15= '$eq' ) ) ) otherlv_1= '(' ( (lv_param_2_0= ruleTff_expression ) ) otherlv_3= ',' ( (lv_param_4_0= ruleTff_expression ) ) otherlv_5= ')' ) ;
    public final EObject ruleTff_predefined_function_2_args() throws RecognitionException {
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
            // InternalTPTP.g:2404:2: ( ( ( ( (lv_func_0_1= '$less' | lv_func_0_2= '$sum' | lv_func_0_3= '$difference' | lv_func_0_4= '$product' | lv_func_0_5= '$quotient' | lv_func_0_6= '$quotient_e' | lv_func_0_7= '$quotient_t' | lv_func_0_8= '$quotient_f' | lv_func_0_9= '$remainder_e' | lv_func_0_10= '$remainder_t' | lv_func_0_11= '$remainder_f' | lv_func_0_12= '$greatereq' | lv_func_0_13= '$lesseq' | lv_func_0_14= '$greater' | lv_func_0_15= '$eq' ) ) ) otherlv_1= '(' ( (lv_param_2_0= ruleTff_expression ) ) otherlv_3= ',' ( (lv_param_4_0= ruleTff_expression ) ) otherlv_5= ')' ) )
            // InternalTPTP.g:2405:2: ( ( ( (lv_func_0_1= '$less' | lv_func_0_2= '$sum' | lv_func_0_3= '$difference' | lv_func_0_4= '$product' | lv_func_0_5= '$quotient' | lv_func_0_6= '$quotient_e' | lv_func_0_7= '$quotient_t' | lv_func_0_8= '$quotient_f' | lv_func_0_9= '$remainder_e' | lv_func_0_10= '$remainder_t' | lv_func_0_11= '$remainder_f' | lv_func_0_12= '$greatereq' | lv_func_0_13= '$lesseq' | lv_func_0_14= '$greater' | lv_func_0_15= '$eq' ) ) ) otherlv_1= '(' ( (lv_param_2_0= ruleTff_expression ) ) otherlv_3= ',' ( (lv_param_4_0= ruleTff_expression ) ) otherlv_5= ')' )
            {
            // InternalTPTP.g:2405:2: ( ( ( (lv_func_0_1= '$less' | lv_func_0_2= '$sum' | lv_func_0_3= '$difference' | lv_func_0_4= '$product' | lv_func_0_5= '$quotient' | lv_func_0_6= '$quotient_e' | lv_func_0_7= '$quotient_t' | lv_func_0_8= '$quotient_f' | lv_func_0_9= '$remainder_e' | lv_func_0_10= '$remainder_t' | lv_func_0_11= '$remainder_f' | lv_func_0_12= '$greatereq' | lv_func_0_13= '$lesseq' | lv_func_0_14= '$greater' | lv_func_0_15= '$eq' ) ) ) otherlv_1= '(' ( (lv_param_2_0= ruleTff_expression ) ) otherlv_3= ',' ( (lv_param_4_0= ruleTff_expression ) ) otherlv_5= ')' )
            // InternalTPTP.g:2406:3: ( ( (lv_func_0_1= '$less' | lv_func_0_2= '$sum' | lv_func_0_3= '$difference' | lv_func_0_4= '$product' | lv_func_0_5= '$quotient' | lv_func_0_6= '$quotient_e' | lv_func_0_7= '$quotient_t' | lv_func_0_8= '$quotient_f' | lv_func_0_9= '$remainder_e' | lv_func_0_10= '$remainder_t' | lv_func_0_11= '$remainder_f' | lv_func_0_12= '$greatereq' | lv_func_0_13= '$lesseq' | lv_func_0_14= '$greater' | lv_func_0_15= '$eq' ) ) ) otherlv_1= '(' ( (lv_param_2_0= ruleTff_expression ) ) otherlv_3= ',' ( (lv_param_4_0= ruleTff_expression ) ) otherlv_5= ')'
            {
            // InternalTPTP.g:2406:3: ( ( (lv_func_0_1= '$less' | lv_func_0_2= '$sum' | lv_func_0_3= '$difference' | lv_func_0_4= '$product' | lv_func_0_5= '$quotient' | lv_func_0_6= '$quotient_e' | lv_func_0_7= '$quotient_t' | lv_func_0_8= '$quotient_f' | lv_func_0_9= '$remainder_e' | lv_func_0_10= '$remainder_t' | lv_func_0_11= '$remainder_f' | lv_func_0_12= '$greatereq' | lv_func_0_13= '$lesseq' | lv_func_0_14= '$greater' | lv_func_0_15= '$eq' ) ) )
            // InternalTPTP.g:2407:4: ( (lv_func_0_1= '$less' | lv_func_0_2= '$sum' | lv_func_0_3= '$difference' | lv_func_0_4= '$product' | lv_func_0_5= '$quotient' | lv_func_0_6= '$quotient_e' | lv_func_0_7= '$quotient_t' | lv_func_0_8= '$quotient_f' | lv_func_0_9= '$remainder_e' | lv_func_0_10= '$remainder_t' | lv_func_0_11= '$remainder_f' | lv_func_0_12= '$greatereq' | lv_func_0_13= '$lesseq' | lv_func_0_14= '$greater' | lv_func_0_15= '$eq' ) )
            {
            // InternalTPTP.g:2407:4: ( (lv_func_0_1= '$less' | lv_func_0_2= '$sum' | lv_func_0_3= '$difference' | lv_func_0_4= '$product' | lv_func_0_5= '$quotient' | lv_func_0_6= '$quotient_e' | lv_func_0_7= '$quotient_t' | lv_func_0_8= '$quotient_f' | lv_func_0_9= '$remainder_e' | lv_func_0_10= '$remainder_t' | lv_func_0_11= '$remainder_f' | lv_func_0_12= '$greatereq' | lv_func_0_13= '$lesseq' | lv_func_0_14= '$greater' | lv_func_0_15= '$eq' ) )
            // InternalTPTP.g:2408:5: (lv_func_0_1= '$less' | lv_func_0_2= '$sum' | lv_func_0_3= '$difference' | lv_func_0_4= '$product' | lv_func_0_5= '$quotient' | lv_func_0_6= '$quotient_e' | lv_func_0_7= '$quotient_t' | lv_func_0_8= '$quotient_f' | lv_func_0_9= '$remainder_e' | lv_func_0_10= '$remainder_t' | lv_func_0_11= '$remainder_f' | lv_func_0_12= '$greatereq' | lv_func_0_13= '$lesseq' | lv_func_0_14= '$greater' | lv_func_0_15= '$eq' )
            {
            // InternalTPTP.g:2408:5: (lv_func_0_1= '$less' | lv_func_0_2= '$sum' | lv_func_0_3= '$difference' | lv_func_0_4= '$product' | lv_func_0_5= '$quotient' | lv_func_0_6= '$quotient_e' | lv_func_0_7= '$quotient_t' | lv_func_0_8= '$quotient_f' | lv_func_0_9= '$remainder_e' | lv_func_0_10= '$remainder_t' | lv_func_0_11= '$remainder_f' | lv_func_0_12= '$greatereq' | lv_func_0_13= '$lesseq' | lv_func_0_14= '$greater' | lv_func_0_15= '$eq' )
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
                    // InternalTPTP.g:2409:6: lv_func_0_1= '$less'
                    {
                    lv_func_0_1=(Token)match(input,50,FOLLOW_8); 

                    						newLeafNode(lv_func_0_1, grammarAccess.getTff_predefined_function_2_argsAccess().getFuncLessKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_predefined_function_2_argsRule());
                    						}
                    						setWithLastConsumed(current, "func", lv_func_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:2420:6: lv_func_0_2= '$sum'
                    {
                    lv_func_0_2=(Token)match(input,51,FOLLOW_8); 

                    						newLeafNode(lv_func_0_2, grammarAccess.getTff_predefined_function_2_argsAccess().getFuncSumKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_predefined_function_2_argsRule());
                    						}
                    						setWithLastConsumed(current, "func", lv_func_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalTPTP.g:2431:6: lv_func_0_3= '$difference'
                    {
                    lv_func_0_3=(Token)match(input,52,FOLLOW_8); 

                    						newLeafNode(lv_func_0_3, grammarAccess.getTff_predefined_function_2_argsAccess().getFuncDifferenceKeyword_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_predefined_function_2_argsRule());
                    						}
                    						setWithLastConsumed(current, "func", lv_func_0_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalTPTP.g:2442:6: lv_func_0_4= '$product'
                    {
                    lv_func_0_4=(Token)match(input,53,FOLLOW_8); 

                    						newLeafNode(lv_func_0_4, grammarAccess.getTff_predefined_function_2_argsAccess().getFuncProductKeyword_0_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_predefined_function_2_argsRule());
                    						}
                    						setWithLastConsumed(current, "func", lv_func_0_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalTPTP.g:2453:6: lv_func_0_5= '$quotient'
                    {
                    lv_func_0_5=(Token)match(input,54,FOLLOW_8); 

                    						newLeafNode(lv_func_0_5, grammarAccess.getTff_predefined_function_2_argsAccess().getFuncQuotientKeyword_0_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_predefined_function_2_argsRule());
                    						}
                    						setWithLastConsumed(current, "func", lv_func_0_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalTPTP.g:2464:6: lv_func_0_6= '$quotient_e'
                    {
                    lv_func_0_6=(Token)match(input,55,FOLLOW_8); 

                    						newLeafNode(lv_func_0_6, grammarAccess.getTff_predefined_function_2_argsAccess().getFuncQuotient_eKeyword_0_0_5());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_predefined_function_2_argsRule());
                    						}
                    						setWithLastConsumed(current, "func", lv_func_0_6, null);
                    					

                    }
                    break;
                case 7 :
                    // InternalTPTP.g:2475:6: lv_func_0_7= '$quotient_t'
                    {
                    lv_func_0_7=(Token)match(input,56,FOLLOW_8); 

                    						newLeafNode(lv_func_0_7, grammarAccess.getTff_predefined_function_2_argsAccess().getFuncQuotient_tKeyword_0_0_6());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_predefined_function_2_argsRule());
                    						}
                    						setWithLastConsumed(current, "func", lv_func_0_7, null);
                    					

                    }
                    break;
                case 8 :
                    // InternalTPTP.g:2486:6: lv_func_0_8= '$quotient_f'
                    {
                    lv_func_0_8=(Token)match(input,57,FOLLOW_8); 

                    						newLeafNode(lv_func_0_8, grammarAccess.getTff_predefined_function_2_argsAccess().getFuncQuotient_fKeyword_0_0_7());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_predefined_function_2_argsRule());
                    						}
                    						setWithLastConsumed(current, "func", lv_func_0_8, null);
                    					

                    }
                    break;
                case 9 :
                    // InternalTPTP.g:2497:6: lv_func_0_9= '$remainder_e'
                    {
                    lv_func_0_9=(Token)match(input,58,FOLLOW_8); 

                    						newLeafNode(lv_func_0_9, grammarAccess.getTff_predefined_function_2_argsAccess().getFuncRemainder_eKeyword_0_0_8());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_predefined_function_2_argsRule());
                    						}
                    						setWithLastConsumed(current, "func", lv_func_0_9, null);
                    					

                    }
                    break;
                case 10 :
                    // InternalTPTP.g:2508:6: lv_func_0_10= '$remainder_t'
                    {
                    lv_func_0_10=(Token)match(input,59,FOLLOW_8); 

                    						newLeafNode(lv_func_0_10, grammarAccess.getTff_predefined_function_2_argsAccess().getFuncRemainder_tKeyword_0_0_9());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_predefined_function_2_argsRule());
                    						}
                    						setWithLastConsumed(current, "func", lv_func_0_10, null);
                    					

                    }
                    break;
                case 11 :
                    // InternalTPTP.g:2519:6: lv_func_0_11= '$remainder_f'
                    {
                    lv_func_0_11=(Token)match(input,60,FOLLOW_8); 

                    						newLeafNode(lv_func_0_11, grammarAccess.getTff_predefined_function_2_argsAccess().getFuncRemainder_fKeyword_0_0_10());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_predefined_function_2_argsRule());
                    						}
                    						setWithLastConsumed(current, "func", lv_func_0_11, null);
                    					

                    }
                    break;
                case 12 :
                    // InternalTPTP.g:2530:6: lv_func_0_12= '$greatereq'
                    {
                    lv_func_0_12=(Token)match(input,61,FOLLOW_8); 

                    						newLeafNode(lv_func_0_12, grammarAccess.getTff_predefined_function_2_argsAccess().getFuncGreatereqKeyword_0_0_11());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_predefined_function_2_argsRule());
                    						}
                    						setWithLastConsumed(current, "func", lv_func_0_12, null);
                    					

                    }
                    break;
                case 13 :
                    // InternalTPTP.g:2541:6: lv_func_0_13= '$lesseq'
                    {
                    lv_func_0_13=(Token)match(input,62,FOLLOW_8); 

                    						newLeafNode(lv_func_0_13, grammarAccess.getTff_predefined_function_2_argsAccess().getFuncLesseqKeyword_0_0_12());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_predefined_function_2_argsRule());
                    						}
                    						setWithLastConsumed(current, "func", lv_func_0_13, null);
                    					

                    }
                    break;
                case 14 :
                    // InternalTPTP.g:2552:6: lv_func_0_14= '$greater'
                    {
                    lv_func_0_14=(Token)match(input,63,FOLLOW_8); 

                    						newLeafNode(lv_func_0_14, grammarAccess.getTff_predefined_function_2_argsAccess().getFuncGreaterKeyword_0_0_13());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_predefined_function_2_argsRule());
                    						}
                    						setWithLastConsumed(current, "func", lv_func_0_14, null);
                    					

                    }
                    break;
                case 15 :
                    // InternalTPTP.g:2563:6: lv_func_0_15= '$eq'
                    {
                    lv_func_0_15=(Token)match(input,64,FOLLOW_8); 

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

            otherlv_1=(Token)match(input,14,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getTff_predefined_function_2_argsAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTPTP.g:2580:3: ( (lv_param_2_0= ruleTff_expression ) )
            // InternalTPTP.g:2581:4: (lv_param_2_0= ruleTff_expression )
            {
            // InternalTPTP.g:2581:4: (lv_param_2_0= ruleTff_expression )
            // InternalTPTP.g:2582:5: lv_param_2_0= ruleTff_expression
            {

            					newCompositeNode(grammarAccess.getTff_predefined_function_2_argsAccess().getParamTff_expressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_param_2_0=ruleTff_expression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTff_predefined_function_2_argsRule());
            					}
            					add(
            						current,
            						"param",
            						lv_param_2_0,
            						"it.unibz.inf.tptp.TPTP.Tff_expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getTff_predefined_function_2_argsAccess().getCommaKeyword_3());
            		
            // InternalTPTP.g:2603:3: ( (lv_param_4_0= ruleTff_expression ) )
            // InternalTPTP.g:2604:4: (lv_param_4_0= ruleTff_expression )
            {
            // InternalTPTP.g:2604:4: (lv_param_4_0= ruleTff_expression )
            // InternalTPTP.g:2605:5: lv_param_4_0= ruleTff_expression
            {

            					newCompositeNode(grammarAccess.getTff_predefined_function_2_argsAccess().getParamTff_expressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_param_4_0=ruleTff_expression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTff_predefined_function_2_argsRule());
            					}
            					add(
            						current,
            						"param",
            						lv_param_4_0,
            						"it.unibz.inf.tptp.TPTP.Tff_expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

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
    // $ANTLR end "ruleTff_predefined_function_2_args"


    // $ANTLR start "entryRuleTff_var"
    // InternalTPTP.g:2630:1: entryRuleTff_var returns [EObject current=null] : iv_ruleTff_var= ruleTff_var EOF ;
    public final EObject entryRuleTff_var() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTff_var = null;


        try {
            // InternalTPTP.g:2630:48: (iv_ruleTff_var= ruleTff_var EOF )
            // InternalTPTP.g:2631:2: iv_ruleTff_var= ruleTff_var EOF
            {
             newCompositeNode(grammarAccess.getTff_varRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTff_var=ruleTff_var();

            state._fsp--;

             current =iv_ruleTff_var; 
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
    // $ANTLR end "entryRuleTff_var"


    // $ANTLR start "ruleTff_var"
    // InternalTPTP.g:2637:1: ruleTff_var returns [EObject current=null] : ( (lv_name_0_0= RULE_UPPER_TOKEN ) ) ;
    public final EObject ruleTff_var() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalTPTP.g:2643:2: ( ( (lv_name_0_0= RULE_UPPER_TOKEN ) ) )
            // InternalTPTP.g:2644:2: ( (lv_name_0_0= RULE_UPPER_TOKEN ) )
            {
            // InternalTPTP.g:2644:2: ( (lv_name_0_0= RULE_UPPER_TOKEN ) )
            // InternalTPTP.g:2645:3: (lv_name_0_0= RULE_UPPER_TOKEN )
            {
            // InternalTPTP.g:2645:3: (lv_name_0_0= RULE_UPPER_TOKEN )
            // InternalTPTP.g:2646:4: lv_name_0_0= RULE_UPPER_TOKEN
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
    // $ANTLR end "ruleTff_var"


    // $ANTLR start "entryRuleTff_var_declaration"
    // InternalTPTP.g:2665:1: entryRuleTff_var_declaration returns [EObject current=null] : iv_ruleTff_var_declaration= ruleTff_var_declaration EOF ;
    public final EObject entryRuleTff_var_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTff_var_declaration = null;


        try {
            // InternalTPTP.g:2665:60: (iv_ruleTff_var_declaration= ruleTff_var_declaration EOF )
            // InternalTPTP.g:2666:2: iv_ruleTff_var_declaration= ruleTff_var_declaration EOF
            {
             newCompositeNode(grammarAccess.getTff_var_declarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTff_var_declaration=ruleTff_var_declaration();

            state._fsp--;

             current =iv_ruleTff_var_declaration; 
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
    // $ANTLR end "entryRuleTff_var_declaration"


    // $ANTLR start "ruleTff_var_declaration"
    // InternalTPTP.g:2672:1: ruleTff_var_declaration returns [EObject current=null] : ( ( (lv_var_0_0= ruleTff_var ) ) otherlv_1= ':' ( (lv_vartype_2_0= ruleTff_type_expression ) ) ) ;
    public final EObject ruleTff_var_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_var_0_0 = null;

        EObject lv_vartype_2_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:2678:2: ( ( ( (lv_var_0_0= ruleTff_var ) ) otherlv_1= ':' ( (lv_vartype_2_0= ruleTff_type_expression ) ) ) )
            // InternalTPTP.g:2679:2: ( ( (lv_var_0_0= ruleTff_var ) ) otherlv_1= ':' ( (lv_vartype_2_0= ruleTff_type_expression ) ) )
            {
            // InternalTPTP.g:2679:2: ( ( (lv_var_0_0= ruleTff_var ) ) otherlv_1= ':' ( (lv_vartype_2_0= ruleTff_type_expression ) ) )
            // InternalTPTP.g:2680:3: ( (lv_var_0_0= ruleTff_var ) ) otherlv_1= ':' ( (lv_vartype_2_0= ruleTff_type_expression ) )
            {
            // InternalTPTP.g:2680:3: ( (lv_var_0_0= ruleTff_var ) )
            // InternalTPTP.g:2681:4: (lv_var_0_0= ruleTff_var )
            {
            // InternalTPTP.g:2681:4: (lv_var_0_0= ruleTff_var )
            // InternalTPTP.g:2682:5: lv_var_0_0= ruleTff_var
            {

            					newCompositeNode(grammarAccess.getTff_var_declarationAccess().getVarTff_varParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_23);
            lv_var_0_0=ruleTff_var();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTff_var_declarationRule());
            					}
            					set(
            						current,
            						"var",
            						lv_var_0_0,
            						"it.unibz.inf.tptp.TPTP.Tff_var");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getTff_var_declarationAccess().getColonKeyword_1());
            		
            // InternalTPTP.g:2703:3: ( (lv_vartype_2_0= ruleTff_type_expression ) )
            // InternalTPTP.g:2704:4: (lv_vartype_2_0= ruleTff_type_expression )
            {
            // InternalTPTP.g:2704:4: (lv_vartype_2_0= ruleTff_type_expression )
            // InternalTPTP.g:2705:5: lv_vartype_2_0= ruleTff_type_expression
            {

            					newCompositeNode(grammarAccess.getTff_var_declarationAccess().getVartypeTff_type_expressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_vartype_2_0=ruleTff_type_expression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTff_var_declarationRule());
            					}
            					set(
            						current,
            						"vartype",
            						lv_vartype_2_0,
            						"it.unibz.inf.tptp.TPTP.Tff_type_expression");
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
    // $ANTLR end "ruleTff_var_declaration"


    // $ANTLR start "entryRuleTff_quantifier_expression"
    // InternalTPTP.g:2726:1: entryRuleTff_quantifier_expression returns [EObject current=null] : iv_ruleTff_quantifier_expression= ruleTff_quantifier_expression EOF ;
    public final EObject entryRuleTff_quantifier_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTff_quantifier_expression = null;


        try {
            // InternalTPTP.g:2726:66: (iv_ruleTff_quantifier_expression= ruleTff_quantifier_expression EOF )
            // InternalTPTP.g:2727:2: iv_ruleTff_quantifier_expression= ruleTff_quantifier_expression EOF
            {
             newCompositeNode(grammarAccess.getTff_quantifier_expressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTff_quantifier_expression=ruleTff_quantifier_expression();

            state._fsp--;

             current =iv_ruleTff_quantifier_expression; 
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
    // $ANTLR end "entryRuleTff_quantifier_expression"


    // $ANTLR start "ruleTff_quantifier_expression"
    // InternalTPTP.g:2733:1: ruleTff_quantifier_expression returns [EObject current=null] : ( ( ( (lv_quantifier_0_1= '!' | lv_quantifier_0_2= '?' ) ) ) otherlv_1= '[' ( (lv_param_2_0= ruleTff_variable_list ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_exp_5_0= ruleTff_expression ) ) ) ;
    public final EObject ruleTff_quantifier_expression() throws RecognitionException {
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
            // InternalTPTP.g:2739:2: ( ( ( ( (lv_quantifier_0_1= '!' | lv_quantifier_0_2= '?' ) ) ) otherlv_1= '[' ( (lv_param_2_0= ruleTff_variable_list ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_exp_5_0= ruleTff_expression ) ) ) )
            // InternalTPTP.g:2740:2: ( ( ( (lv_quantifier_0_1= '!' | lv_quantifier_0_2= '?' ) ) ) otherlv_1= '[' ( (lv_param_2_0= ruleTff_variable_list ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_exp_5_0= ruleTff_expression ) ) )
            {
            // InternalTPTP.g:2740:2: ( ( ( (lv_quantifier_0_1= '!' | lv_quantifier_0_2= '?' ) ) ) otherlv_1= '[' ( (lv_param_2_0= ruleTff_variable_list ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_exp_5_0= ruleTff_expression ) ) )
            // InternalTPTP.g:2741:3: ( ( (lv_quantifier_0_1= '!' | lv_quantifier_0_2= '?' ) ) ) otherlv_1= '[' ( (lv_param_2_0= ruleTff_variable_list ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_exp_5_0= ruleTff_expression ) )
            {
            // InternalTPTP.g:2741:3: ( ( (lv_quantifier_0_1= '!' | lv_quantifier_0_2= '?' ) ) )
            // InternalTPTP.g:2742:4: ( (lv_quantifier_0_1= '!' | lv_quantifier_0_2= '?' ) )
            {
            // InternalTPTP.g:2742:4: ( (lv_quantifier_0_1= '!' | lv_quantifier_0_2= '?' ) )
            // InternalTPTP.g:2743:5: (lv_quantifier_0_1= '!' | lv_quantifier_0_2= '?' )
            {
            // InternalTPTP.g:2743:5: (lv_quantifier_0_1= '!' | lv_quantifier_0_2= '?' )
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
                    // InternalTPTP.g:2744:6: lv_quantifier_0_1= '!'
                    {
                    lv_quantifier_0_1=(Token)match(input,28,FOLLOW_20); 

                    						newLeafNode(lv_quantifier_0_1, grammarAccess.getTff_quantifier_expressionAccess().getQuantifierExclamationMarkKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTff_quantifier_expressionRule());
                    						}
                    						setWithLastConsumed(current, "quantifier", lv_quantifier_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:2755:6: lv_quantifier_0_2= '?'
                    {
                    lv_quantifier_0_2=(Token)match(input,29,FOLLOW_20); 

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

            otherlv_1=(Token)match(input,30,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getTff_quantifier_expressionAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalTPTP.g:2772:3: ( (lv_param_2_0= ruleTff_variable_list ) )
            // InternalTPTP.g:2773:4: (lv_param_2_0= ruleTff_variable_list )
            {
            // InternalTPTP.g:2773:4: (lv_param_2_0= ruleTff_variable_list )
            // InternalTPTP.g:2774:5: lv_param_2_0= ruleTff_variable_list
            {

            					newCompositeNode(grammarAccess.getTff_quantifier_expressionAccess().getParamTff_variable_listParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_param_2_0=ruleTff_variable_list();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTff_quantifier_expressionRule());
            					}
            					set(
            						current,
            						"param",
            						lv_param_2_0,
            						"it.unibz.inf.tptp.TPTP.Tff_variable_list");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getTff_quantifier_expressionAccess().getRightSquareBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,32,FOLLOW_25); 

            			newLeafNode(otherlv_4, grammarAccess.getTff_quantifier_expressionAccess().getColonKeyword_4());
            		
            // InternalTPTP.g:2799:3: ( (lv_exp_5_0= ruleTff_expression ) )
            // InternalTPTP.g:2800:4: (lv_exp_5_0= ruleTff_expression )
            {
            // InternalTPTP.g:2800:4: (lv_exp_5_0= ruleTff_expression )
            // InternalTPTP.g:2801:5: lv_exp_5_0= ruleTff_expression
            {

            					newCompositeNode(grammarAccess.getTff_quantifier_expressionAccess().getExpTff_expressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_5_0=ruleTff_expression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTff_quantifier_expressionRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_5_0,
            						"it.unibz.inf.tptp.TPTP.Tff_expression");
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
    // $ANTLR end "ruleTff_quantifier_expression"


    // $ANTLR start "entryRuleTff_type_quantifier_epression"
    // InternalTPTP.g:2822:1: entryRuleTff_type_quantifier_epression returns [EObject current=null] : iv_ruleTff_type_quantifier_epression= ruleTff_type_quantifier_epression EOF ;
    public final EObject entryRuleTff_type_quantifier_epression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTff_type_quantifier_epression = null;


        try {
            // InternalTPTP.g:2822:70: (iv_ruleTff_type_quantifier_epression= ruleTff_type_quantifier_epression EOF )
            // InternalTPTP.g:2823:2: iv_ruleTff_type_quantifier_epression= ruleTff_type_quantifier_epression EOF
            {
             newCompositeNode(grammarAccess.getTff_type_quantifier_epressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTff_type_quantifier_epression=ruleTff_type_quantifier_epression();

            state._fsp--;

             current =iv_ruleTff_type_quantifier_epression; 
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
    // $ANTLR end "entryRuleTff_type_quantifier_epression"


    // $ANTLR start "ruleTff_type_quantifier_epression"
    // InternalTPTP.g:2829:1: ruleTff_type_quantifier_epression returns [EObject current=null] : ( ( (lv_quantifier_0_0= '!>' ) ) otherlv_1= '[' ( (lv_param_2_0= ruleTff_variable_list ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_exp_5_0= ruleTff_type_expression ) ) ) ;
    public final EObject ruleTff_type_quantifier_epression() throws RecognitionException {
        EObject current = null;

        Token lv_quantifier_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_param_2_0 = null;

        EObject lv_exp_5_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:2835:2: ( ( ( (lv_quantifier_0_0= '!>' ) ) otherlv_1= '[' ( (lv_param_2_0= ruleTff_variable_list ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_exp_5_0= ruleTff_type_expression ) ) ) )
            // InternalTPTP.g:2836:2: ( ( (lv_quantifier_0_0= '!>' ) ) otherlv_1= '[' ( (lv_param_2_0= ruleTff_variable_list ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_exp_5_0= ruleTff_type_expression ) ) )
            {
            // InternalTPTP.g:2836:2: ( ( (lv_quantifier_0_0= '!>' ) ) otherlv_1= '[' ( (lv_param_2_0= ruleTff_variable_list ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_exp_5_0= ruleTff_type_expression ) ) )
            // InternalTPTP.g:2837:3: ( (lv_quantifier_0_0= '!>' ) ) otherlv_1= '[' ( (lv_param_2_0= ruleTff_variable_list ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_exp_5_0= ruleTff_type_expression ) )
            {
            // InternalTPTP.g:2837:3: ( (lv_quantifier_0_0= '!>' ) )
            // InternalTPTP.g:2838:4: (lv_quantifier_0_0= '!>' )
            {
            // InternalTPTP.g:2838:4: (lv_quantifier_0_0= '!>' )
            // InternalTPTP.g:2839:5: lv_quantifier_0_0= '!>'
            {
            lv_quantifier_0_0=(Token)match(input,65,FOLLOW_20); 

            					newLeafNode(lv_quantifier_0_0, grammarAccess.getTff_type_quantifier_epressionAccess().getQuantifierExclamationMarkGreaterThanSignKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTff_type_quantifier_epressionRule());
            					}
            					setWithLastConsumed(current, "quantifier", lv_quantifier_0_0, "!>");
            				

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getTff_type_quantifier_epressionAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalTPTP.g:2855:3: ( (lv_param_2_0= ruleTff_variable_list ) )
            // InternalTPTP.g:2856:4: (lv_param_2_0= ruleTff_variable_list )
            {
            // InternalTPTP.g:2856:4: (lv_param_2_0= ruleTff_variable_list )
            // InternalTPTP.g:2857:5: lv_param_2_0= ruleTff_variable_list
            {

            					newCompositeNode(grammarAccess.getTff_type_quantifier_epressionAccess().getParamTff_variable_listParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_param_2_0=ruleTff_variable_list();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTff_type_quantifier_epressionRule());
            					}
            					set(
            						current,
            						"param",
            						lv_param_2_0,
            						"it.unibz.inf.tptp.TPTP.Tff_variable_list");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getTff_type_quantifier_epressionAccess().getRightSquareBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,32,FOLLOW_28); 

            			newLeafNode(otherlv_4, grammarAccess.getTff_type_quantifier_epressionAccess().getColonKeyword_4());
            		
            // InternalTPTP.g:2882:3: ( (lv_exp_5_0= ruleTff_type_expression ) )
            // InternalTPTP.g:2883:4: (lv_exp_5_0= ruleTff_type_expression )
            {
            // InternalTPTP.g:2883:4: (lv_exp_5_0= ruleTff_type_expression )
            // InternalTPTP.g:2884:5: lv_exp_5_0= ruleTff_type_expression
            {

            					newCompositeNode(grammarAccess.getTff_type_quantifier_epressionAccess().getExpTff_type_expressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_5_0=ruleTff_type_expression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTff_type_quantifier_epressionRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_5_0,
            						"it.unibz.inf.tptp.TPTP.Tff_type_expression");
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
    // $ANTLR end "ruleTff_type_quantifier_epression"


    // $ANTLR start "entryRuleTff_variable_list"
    // InternalTPTP.g:2905:1: entryRuleTff_variable_list returns [EObject current=null] : iv_ruleTff_variable_list= ruleTff_variable_list EOF ;
    public final EObject entryRuleTff_variable_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTff_variable_list = null;


        try {
            // InternalTPTP.g:2905:58: (iv_ruleTff_variable_list= ruleTff_variable_list EOF )
            // InternalTPTP.g:2906:2: iv_ruleTff_variable_list= ruleTff_variable_list EOF
            {
             newCompositeNode(grammarAccess.getTff_variable_listRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTff_variable_list=ruleTff_variable_list();

            state._fsp--;

             current =iv_ruleTff_variable_list; 
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
    // $ANTLR end "entryRuleTff_variable_list"


    // $ANTLR start "ruleTff_variable_list"
    // InternalTPTP.g:2912:1: ruleTff_variable_list returns [EObject current=null] : ( ( (lv_params_0_0= ruleTff_var_declaration ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleTff_var_declaration ) ) )* ) ;
    public final EObject ruleTff_variable_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_params_0_0 = null;

        EObject lv_params_2_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:2918:2: ( ( ( (lv_params_0_0= ruleTff_var_declaration ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleTff_var_declaration ) ) )* ) )
            // InternalTPTP.g:2919:2: ( ( (lv_params_0_0= ruleTff_var_declaration ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleTff_var_declaration ) ) )* )
            {
            // InternalTPTP.g:2919:2: ( ( (lv_params_0_0= ruleTff_var_declaration ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleTff_var_declaration ) ) )* )
            // InternalTPTP.g:2920:3: ( (lv_params_0_0= ruleTff_var_declaration ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleTff_var_declaration ) ) )*
            {
            // InternalTPTP.g:2920:3: ( (lv_params_0_0= ruleTff_var_declaration ) )
            // InternalTPTP.g:2921:4: (lv_params_0_0= ruleTff_var_declaration )
            {
            // InternalTPTP.g:2921:4: (lv_params_0_0= ruleTff_var_declaration )
            // InternalTPTP.g:2922:5: lv_params_0_0= ruleTff_var_declaration
            {

            					newCompositeNode(grammarAccess.getTff_variable_listAccess().getParamsTff_var_declarationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_24);
            lv_params_0_0=ruleTff_var_declaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTff_variable_listRule());
            					}
            					add(
            						current,
            						"params",
            						lv_params_0_0,
            						"it.unibz.inf.tptp.TPTP.Tff_var_declaration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTPTP.g:2939:3: (otherlv_1= ',' ( (lv_params_2_0= ruleTff_var_declaration ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==18) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalTPTP.g:2940:4: otherlv_1= ',' ( (lv_params_2_0= ruleTff_var_declaration ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_21); 

            	    				newLeafNode(otherlv_1, grammarAccess.getTff_variable_listAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalTPTP.g:2944:4: ( (lv_params_2_0= ruleTff_var_declaration ) )
            	    // InternalTPTP.g:2945:5: (lv_params_2_0= ruleTff_var_declaration )
            	    {
            	    // InternalTPTP.g:2945:5: (lv_params_2_0= ruleTff_var_declaration )
            	    // InternalTPTP.g:2946:6: lv_params_2_0= ruleTff_var_declaration
            	    {

            	    						newCompositeNode(grammarAccess.getTff_variable_listAccess().getParamsTff_var_declarationParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_params_2_0=ruleTff_var_declaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTff_variable_listRule());
            	    						}
            	    						add(
            	    							current,
            	    							"params",
            	    							lv_params_2_0,
            	    							"it.unibz.inf.tptp.TPTP.Tff_var_declaration");
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
    // $ANTLR end "ruleTff_variable_list"


    // $ANTLR start "entryRuleCnf_input"
    // InternalTPTP.g:2968:1: entryRuleCnf_input returns [EObject current=null] : iv_ruleCnf_input= ruleCnf_input EOF ;
    public final EObject entryRuleCnf_input() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCnf_input = null;


        try {
            // InternalTPTP.g:2968:50: (iv_ruleCnf_input= ruleCnf_input EOF )
            // InternalTPTP.g:2969:2: iv_ruleCnf_input= ruleCnf_input EOF
            {
             newCompositeNode(grammarAccess.getCnf_inputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCnf_input=ruleCnf_input();

            state._fsp--;

             current =iv_ruleCnf_input; 
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
    // $ANTLR end "entryRuleCnf_input"


    // $ANTLR start "ruleCnf_input"
    // InternalTPTP.g:2975:1: ruleCnf_input returns [EObject current=null] : (this_Cnf_root_0= ruleCnf_root | this_Include_1= ruleInclude ) ;
    public final EObject ruleCnf_input() throws RecognitionException {
        EObject current = null;

        EObject this_Cnf_root_0 = null;

        EObject this_Include_1 = null;



        	enterRule();

        try {
            // InternalTPTP.g:2981:2: ( (this_Cnf_root_0= ruleCnf_root | this_Include_1= ruleInclude ) )
            // InternalTPTP.g:2982:2: (this_Cnf_root_0= ruleCnf_root | this_Include_1= ruleInclude )
            {
            // InternalTPTP.g:2982:2: (this_Cnf_root_0= ruleCnf_root | this_Include_1= ruleInclude )
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
                    // InternalTPTP.g:2983:3: this_Cnf_root_0= ruleCnf_root
                    {

                    			newCompositeNode(grammarAccess.getCnf_inputAccess().getCnf_rootParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Cnf_root_0=ruleCnf_root();

                    state._fsp--;


                    			current = this_Cnf_root_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:2992:3: this_Include_1= ruleInclude
                    {

                    			newCompositeNode(grammarAccess.getCnf_inputAccess().getIncludeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Include_1=ruleInclude();

                    state._fsp--;


                    			current = this_Include_1;
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
    // $ANTLR end "ruleCnf_input"


    // $ANTLR start "entryRuleCnf_root"
    // InternalTPTP.g:3004:1: entryRuleCnf_root returns [EObject current=null] : iv_ruleCnf_root= ruleCnf_root EOF ;
    public final EObject entryRuleCnf_root() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCnf_root = null;


        try {
            // InternalTPTP.g:3004:49: (iv_ruleCnf_root= ruleCnf_root EOF )
            // InternalTPTP.g:3005:2: iv_ruleCnf_root= ruleCnf_root EOF
            {
             newCompositeNode(grammarAccess.getCnf_rootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCnf_root=ruleCnf_root();

            state._fsp--;

             current =iv_ruleCnf_root; 
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
    // $ANTLR end "entryRuleCnf_root"


    // $ANTLR start "ruleCnf_root"
    // InternalTPTP.g:3011:1: ruleCnf_root returns [EObject current=null] : (otherlv_0= 'cnf' otherlv_1= '(' ( ( (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING ) ) ) otherlv_3= ',' ( ( (lv_formula_role_4_1= 'axiom' | lv_formula_role_4_2= 'hypothesis' | lv_formula_role_4_3= 'negated_conjecture' | lv_formula_role_4_4= 'plain' ) ) ) otherlv_5= ',' ( (lv_exp_6_0= ruleCnf_formula_type_definition ) ) otherlv_7= ')' otherlv_8= '.' ) ;
    public final EObject ruleCnf_root() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_2=null;
        Token otherlv_3=null;
        Token lv_formula_role_4_1=null;
        Token lv_formula_role_4_2=null;
        Token lv_formula_role_4_3=null;
        Token lv_formula_role_4_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_1 = null;

        EObject lv_exp_6_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:3017:2: ( (otherlv_0= 'cnf' otherlv_1= '(' ( ( (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING ) ) ) otherlv_3= ',' ( ( (lv_formula_role_4_1= 'axiom' | lv_formula_role_4_2= 'hypothesis' | lv_formula_role_4_3= 'negated_conjecture' | lv_formula_role_4_4= 'plain' ) ) ) otherlv_5= ',' ( (lv_exp_6_0= ruleCnf_formula_type_definition ) ) otherlv_7= ')' otherlv_8= '.' ) )
            // InternalTPTP.g:3018:2: (otherlv_0= 'cnf' otherlv_1= '(' ( ( (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING ) ) ) otherlv_3= ',' ( ( (lv_formula_role_4_1= 'axiom' | lv_formula_role_4_2= 'hypothesis' | lv_formula_role_4_3= 'negated_conjecture' | lv_formula_role_4_4= 'plain' ) ) ) otherlv_5= ',' ( (lv_exp_6_0= ruleCnf_formula_type_definition ) ) otherlv_7= ')' otherlv_8= '.' )
            {
            // InternalTPTP.g:3018:2: (otherlv_0= 'cnf' otherlv_1= '(' ( ( (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING ) ) ) otherlv_3= ',' ( ( (lv_formula_role_4_1= 'axiom' | lv_formula_role_4_2= 'hypothesis' | lv_formula_role_4_3= 'negated_conjecture' | lv_formula_role_4_4= 'plain' ) ) ) otherlv_5= ',' ( (lv_exp_6_0= ruleCnf_formula_type_definition ) ) otherlv_7= ')' otherlv_8= '.' )
            // InternalTPTP.g:3019:3: otherlv_0= 'cnf' otherlv_1= '(' ( ( (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING ) ) ) otherlv_3= ',' ( ( (lv_formula_role_4_1= 'axiom' | lv_formula_role_4_2= 'hypothesis' | lv_formula_role_4_3= 'negated_conjecture' | lv_formula_role_4_4= 'plain' ) ) ) otherlv_5= ',' ( (lv_exp_6_0= ruleCnf_formula_type_definition ) ) otherlv_7= ')' otherlv_8= '.'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getCnf_rootAccess().getCnfKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getCnf_rootAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTPTP.g:3027:3: ( ( (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING ) ) )
            // InternalTPTP.g:3028:4: ( (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING ) )
            {
            // InternalTPTP.g:3028:4: ( (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING ) )
            // InternalTPTP.g:3029:5: (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING )
            {
            // InternalTPTP.g:3029:5: (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_LOWER_TOKEN||(LA48_0>=19 && LA48_0<=24)||LA48_0==34||LA48_0==67) ) {
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
                    // InternalTPTP.g:3030:6: lv_name_2_1= ruleLower_token_and_keyword
                    {

                    						newCompositeNode(grammarAccess.getCnf_rootAccess().getNameLower_token_and_keywordParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_name_2_1=ruleLower_token_and_keyword();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCnf_rootRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_2_1,
                    							"it.unibz.inf.tptp.TPTP.Lower_token_and_keyword");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:3046:6: lv_name_2_2= RULE_STRING
                    {
                    lv_name_2_2=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    						newLeafNode(lv_name_2_2, grammarAccess.getCnf_rootAccess().getNameSTRINGTerminalRuleCall_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCnf_rootRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_2,
                    							"it.unibz.inf.tptp.TPTP.STRING");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_34); 

            			newLeafNode(otherlv_3, grammarAccess.getCnf_rootAccess().getCommaKeyword_3());
            		
            // InternalTPTP.g:3067:3: ( ( (lv_formula_role_4_1= 'axiom' | lv_formula_role_4_2= 'hypothesis' | lv_formula_role_4_3= 'negated_conjecture' | lv_formula_role_4_4= 'plain' ) ) )
            // InternalTPTP.g:3068:4: ( (lv_formula_role_4_1= 'axiom' | lv_formula_role_4_2= 'hypothesis' | lv_formula_role_4_3= 'negated_conjecture' | lv_formula_role_4_4= 'plain' ) )
            {
            // InternalTPTP.g:3068:4: ( (lv_formula_role_4_1= 'axiom' | lv_formula_role_4_2= 'hypothesis' | lv_formula_role_4_3= 'negated_conjecture' | lv_formula_role_4_4= 'plain' ) )
            // InternalTPTP.g:3069:5: (lv_formula_role_4_1= 'axiom' | lv_formula_role_4_2= 'hypothesis' | lv_formula_role_4_3= 'negated_conjecture' | lv_formula_role_4_4= 'plain' )
            {
            // InternalTPTP.g:3069:5: (lv_formula_role_4_1= 'axiom' | lv_formula_role_4_2= 'hypothesis' | lv_formula_role_4_3= 'negated_conjecture' | lv_formula_role_4_4= 'plain' )
            int alt49=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt49=1;
                }
                break;
            case 20:
                {
                alt49=2;
                }
                break;
            case 21:
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
                    // InternalTPTP.g:3070:6: lv_formula_role_4_1= 'axiom'
                    {
                    lv_formula_role_4_1=(Token)match(input,19,FOLLOW_13); 

                    						newLeafNode(lv_formula_role_4_1, grammarAccess.getCnf_rootAccess().getFormula_roleAxiomKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCnf_rootRule());
                    						}
                    						setWithLastConsumed(current, "formula_role", lv_formula_role_4_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:3081:6: lv_formula_role_4_2= 'hypothesis'
                    {
                    lv_formula_role_4_2=(Token)match(input,20,FOLLOW_13); 

                    						newLeafNode(lv_formula_role_4_2, grammarAccess.getCnf_rootAccess().getFormula_roleHypothesisKeyword_4_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCnf_rootRule());
                    						}
                    						setWithLastConsumed(current, "formula_role", lv_formula_role_4_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalTPTP.g:3092:6: lv_formula_role_4_3= 'negated_conjecture'
                    {
                    lv_formula_role_4_3=(Token)match(input,21,FOLLOW_13); 

                    						newLeafNode(lv_formula_role_4_3, grammarAccess.getCnf_rootAccess().getFormula_roleNegated_conjectureKeyword_4_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCnf_rootRule());
                    						}
                    						setWithLastConsumed(current, "formula_role", lv_formula_role_4_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalTPTP.g:3103:6: lv_formula_role_4_4= 'plain'
                    {
                    lv_formula_role_4_4=(Token)match(input,67,FOLLOW_13); 

                    						newLeafNode(lv_formula_role_4_4, grammarAccess.getCnf_rootAccess().getFormula_rolePlainKeyword_4_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCnf_rootRule());
                    						}
                    						setWithLastConsumed(current, "formula_role", lv_formula_role_4_4, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_35); 

            			newLeafNode(otherlv_5, grammarAccess.getCnf_rootAccess().getCommaKeyword_5());
            		
            // InternalTPTP.g:3120:3: ( (lv_exp_6_0= ruleCnf_formula_type_definition ) )
            // InternalTPTP.g:3121:4: (lv_exp_6_0= ruleCnf_formula_type_definition )
            {
            // InternalTPTP.g:3121:4: (lv_exp_6_0= ruleCnf_formula_type_definition )
            // InternalTPTP.g:3122:5: lv_exp_6_0= ruleCnf_formula_type_definition
            {

            					newCompositeNode(grammarAccess.getCnf_rootAccess().getExpCnf_formula_type_definitionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
            lv_exp_6_0=ruleCnf_formula_type_definition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCnf_rootRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_6_0,
            						"it.unibz.inf.tptp.TPTP.Cnf_formula_type_definition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getCnf_rootAccess().getRightParenthesisKeyword_7());
            		
            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getCnf_rootAccess().getFullStopKeyword_8());
            		

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
    // $ANTLR end "ruleCnf_root"


    // $ANTLR start "entryRuleCnf_formula_type_definition"
    // InternalTPTP.g:3151:1: entryRuleCnf_formula_type_definition returns [EObject current=null] : iv_ruleCnf_formula_type_definition= ruleCnf_formula_type_definition EOF ;
    public final EObject entryRuleCnf_formula_type_definition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCnf_formula_type_definition = null;


        try {
            // InternalTPTP.g:3151:68: (iv_ruleCnf_formula_type_definition= ruleCnf_formula_type_definition EOF )
            // InternalTPTP.g:3152:2: iv_ruleCnf_formula_type_definition= ruleCnf_formula_type_definition EOF
            {
             newCompositeNode(grammarAccess.getCnf_formula_type_definitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCnf_formula_type_definition=ruleCnf_formula_type_definition();

            state._fsp--;

             current =iv_ruleCnf_formula_type_definition; 
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
    // $ANTLR end "entryRuleCnf_formula_type_definition"


    // $ANTLR start "ruleCnf_formula_type_definition"
    // InternalTPTP.g:3158:1: ruleCnf_formula_type_definition returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_disjunction_1_0= ruleCnf_or ) ) otherlv_2= ')' ) | ( (lv_disjunction_3_0= ruleCnf_or ) ) ) ;
    public final EObject ruleCnf_formula_type_definition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_disjunction_1_0 = null;

        EObject lv_disjunction_3_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:3164:2: ( ( (otherlv_0= '(' ( (lv_disjunction_1_0= ruleCnf_or ) ) otherlv_2= ')' ) | ( (lv_disjunction_3_0= ruleCnf_or ) ) ) )
            // InternalTPTP.g:3165:2: ( (otherlv_0= '(' ( (lv_disjunction_1_0= ruleCnf_or ) ) otherlv_2= ')' ) | ( (lv_disjunction_3_0= ruleCnf_or ) ) )
            {
            // InternalTPTP.g:3165:2: ( (otherlv_0= '(' ( (lv_disjunction_1_0= ruleCnf_or ) ) otherlv_2= ')' ) | ( (lv_disjunction_3_0= ruleCnf_or ) ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==14) ) {
                alt50=1;
            }
            else if ( ((LA50_0>=RULE_STRING && LA50_0<=RULE_LOWER_TOKEN)||(LA50_0>=19 && LA50_0<=27)||LA50_0==34||LA50_0==67) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalTPTP.g:3166:3: (otherlv_0= '(' ( (lv_disjunction_1_0= ruleCnf_or ) ) otherlv_2= ')' )
                    {
                    // InternalTPTP.g:3166:3: (otherlv_0= '(' ( (lv_disjunction_1_0= ruleCnf_or ) ) otherlv_2= ')' )
                    // InternalTPTP.g:3167:4: otherlv_0= '(' ( (lv_disjunction_1_0= ruleCnf_or ) ) otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_35); 

                    				newLeafNode(otherlv_0, grammarAccess.getCnf_formula_type_definitionAccess().getLeftParenthesisKeyword_0_0());
                    			
                    // InternalTPTP.g:3171:4: ( (lv_disjunction_1_0= ruleCnf_or ) )
                    // InternalTPTP.g:3172:5: (lv_disjunction_1_0= ruleCnf_or )
                    {
                    // InternalTPTP.g:3172:5: (lv_disjunction_1_0= ruleCnf_or )
                    // InternalTPTP.g:3173:6: lv_disjunction_1_0= ruleCnf_or
                    {

                    						newCompositeNode(grammarAccess.getCnf_formula_type_definitionAccess().getDisjunctionCnf_orParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_disjunction_1_0=ruleCnf_or();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCnf_formula_type_definitionRule());
                    						}
                    						set(
                    							current,
                    							"disjunction",
                    							lv_disjunction_1_0,
                    							"it.unibz.inf.tptp.TPTP.Cnf_or");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getCnf_formula_type_definitionAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTPTP.g:3196:3: ( (lv_disjunction_3_0= ruleCnf_or ) )
                    {
                    // InternalTPTP.g:3196:3: ( (lv_disjunction_3_0= ruleCnf_or ) )
                    // InternalTPTP.g:3197:4: (lv_disjunction_3_0= ruleCnf_or )
                    {
                    // InternalTPTP.g:3197:4: (lv_disjunction_3_0= ruleCnf_or )
                    // InternalTPTP.g:3198:5: lv_disjunction_3_0= ruleCnf_or
                    {

                    					newCompositeNode(grammarAccess.getCnf_formula_type_definitionAccess().getDisjunctionCnf_orParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_disjunction_3_0=ruleCnf_or();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCnf_formula_type_definitionRule());
                    					}
                    					set(
                    						current,
                    						"disjunction",
                    						lv_disjunction_3_0,
                    						"it.unibz.inf.tptp.TPTP.Cnf_or");
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
    // $ANTLR end "ruleCnf_formula_type_definition"


    // $ANTLR start "entryRuleCnf_or"
    // InternalTPTP.g:3219:1: entryRuleCnf_or returns [EObject current=null] : iv_ruleCnf_or= ruleCnf_or EOF ;
    public final EObject entryRuleCnf_or() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCnf_or = null;


        try {
            // InternalTPTP.g:3219:47: (iv_ruleCnf_or= ruleCnf_or EOF )
            // InternalTPTP.g:3220:2: iv_ruleCnf_or= ruleCnf_or EOF
            {
             newCompositeNode(grammarAccess.getCnf_orRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCnf_or=ruleCnf_or();

            state._fsp--;

             current =iv_ruleCnf_or; 
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
    // $ANTLR end "entryRuleCnf_or"


    // $ANTLR start "ruleCnf_or"
    // InternalTPTP.g:3226:1: ruleCnf_or returns [EObject current=null] : ( ( (lv_or_0_0= ruleCnf_not ) ) (otherlv_1= '|' ( (lv_or_2_0= ruleCnf_not ) ) )* ) ;
    public final EObject ruleCnf_or() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_or_0_0 = null;

        EObject lv_or_2_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:3232:2: ( ( ( (lv_or_0_0= ruleCnf_not ) ) (otherlv_1= '|' ( (lv_or_2_0= ruleCnf_not ) ) )* ) )
            // InternalTPTP.g:3233:2: ( ( (lv_or_0_0= ruleCnf_not ) ) (otherlv_1= '|' ( (lv_or_2_0= ruleCnf_not ) ) )* )
            {
            // InternalTPTP.g:3233:2: ( ( (lv_or_0_0= ruleCnf_not ) ) (otherlv_1= '|' ( (lv_or_2_0= ruleCnf_not ) ) )* )
            // InternalTPTP.g:3234:3: ( (lv_or_0_0= ruleCnf_not ) ) (otherlv_1= '|' ( (lv_or_2_0= ruleCnf_not ) ) )*
            {
            // InternalTPTP.g:3234:3: ( (lv_or_0_0= ruleCnf_not ) )
            // InternalTPTP.g:3235:4: (lv_or_0_0= ruleCnf_not )
            {
            // InternalTPTP.g:3235:4: (lv_or_0_0= ruleCnf_not )
            // InternalTPTP.g:3236:5: lv_or_0_0= ruleCnf_not
            {

            					newCompositeNode(grammarAccess.getCnf_orAccess().getOrCnf_notParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_36);
            lv_or_0_0=ruleCnf_not();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCnf_orRule());
            					}
            					add(
            						current,
            						"or",
            						lv_or_0_0,
            						"it.unibz.inf.tptp.TPTP.Cnf_not");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTPTP.g:3253:3: (otherlv_1= '|' ( (lv_or_2_0= ruleCnf_not ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==68) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalTPTP.g:3254:4: otherlv_1= '|' ( (lv_or_2_0= ruleCnf_not ) )
            	    {
            	    otherlv_1=(Token)match(input,68,FOLLOW_35); 

            	    				newLeafNode(otherlv_1, grammarAccess.getCnf_orAccess().getVerticalLineKeyword_1_0());
            	    			
            	    // InternalTPTP.g:3258:4: ( (lv_or_2_0= ruleCnf_not ) )
            	    // InternalTPTP.g:3259:5: (lv_or_2_0= ruleCnf_not )
            	    {
            	    // InternalTPTP.g:3259:5: (lv_or_2_0= ruleCnf_not )
            	    // InternalTPTP.g:3260:6: lv_or_2_0= ruleCnf_not
            	    {

            	    						newCompositeNode(grammarAccess.getCnf_orAccess().getOrCnf_notParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_36);
            	    lv_or_2_0=ruleCnf_not();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCnf_orRule());
            	    						}
            	    						add(
            	    							current,
            	    							"or",
            	    							lv_or_2_0,
            	    							"it.unibz.inf.tptp.TPTP.Cnf_not");
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
    // $ANTLR end "ruleCnf_or"


    // $ANTLR start "entryRuleCnf_not"
    // InternalTPTP.g:3282:1: entryRuleCnf_not returns [EObject current=null] : iv_ruleCnf_not= ruleCnf_not EOF ;
    public final EObject entryRuleCnf_not() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCnf_not = null;


        try {
            // InternalTPTP.g:3282:48: (iv_ruleCnf_not= ruleCnf_not EOF )
            // InternalTPTP.g:3283:2: iv_ruleCnf_not= ruleCnf_not EOF
            {
             newCompositeNode(grammarAccess.getCnf_notRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCnf_not=ruleCnf_not();

            state._fsp--;

             current =iv_ruleCnf_not; 
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
    // $ANTLR end "entryRuleCnf_not"


    // $ANTLR start "ruleCnf_not"
    // InternalTPTP.g:3289:1: ruleCnf_not returns [EObject current=null] : ( ( (lv_negated_0_0= '~' ) )? ( (lv_literal_1_0= ruleCnf_equality ) ) ) ;
    public final EObject ruleCnf_not() throws RecognitionException {
        EObject current = null;

        Token lv_negated_0_0=null;
        EObject lv_literal_1_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:3295:2: ( ( ( (lv_negated_0_0= '~' ) )? ( (lv_literal_1_0= ruleCnf_equality ) ) ) )
            // InternalTPTP.g:3296:2: ( ( (lv_negated_0_0= '~' ) )? ( (lv_literal_1_0= ruleCnf_equality ) ) )
            {
            // InternalTPTP.g:3296:2: ( ( (lv_negated_0_0= '~' ) )? ( (lv_literal_1_0= ruleCnf_equality ) ) )
            // InternalTPTP.g:3297:3: ( (lv_negated_0_0= '~' ) )? ( (lv_literal_1_0= ruleCnf_equality ) )
            {
            // InternalTPTP.g:3297:3: ( (lv_negated_0_0= '~' ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==25) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalTPTP.g:3298:4: (lv_negated_0_0= '~' )
                    {
                    // InternalTPTP.g:3298:4: (lv_negated_0_0= '~' )
                    // InternalTPTP.g:3299:5: lv_negated_0_0= '~'
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

            // InternalTPTP.g:3311:3: ( (lv_literal_1_0= ruleCnf_equality ) )
            // InternalTPTP.g:3312:4: (lv_literal_1_0= ruleCnf_equality )
            {
            // InternalTPTP.g:3312:4: (lv_literal_1_0= ruleCnf_equality )
            // InternalTPTP.g:3313:5: lv_literal_1_0= ruleCnf_equality
            {

            					newCompositeNode(grammarAccess.getCnf_notAccess().getLiteralCnf_equalityParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_literal_1_0=ruleCnf_equality();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCnf_notRule());
            					}
            					set(
            						current,
            						"literal",
            						lv_literal_1_0,
            						"it.unibz.inf.tptp.TPTP.Cnf_equality");
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
    // $ANTLR end "ruleCnf_not"


    // $ANTLR start "entryRuleCnf_equality"
    // InternalTPTP.g:3334:1: entryRuleCnf_equality returns [EObject current=null] : iv_ruleCnf_equality= ruleCnf_equality EOF ;
    public final EObject entryRuleCnf_equality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCnf_equality = null;


        try {
            // InternalTPTP.g:3334:53: (iv_ruleCnf_equality= ruleCnf_equality EOF )
            // InternalTPTP.g:3335:2: iv_ruleCnf_equality= ruleCnf_equality EOF
            {
             newCompositeNode(grammarAccess.getCnf_equalityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCnf_equality=ruleCnf_equality();

            state._fsp--;

             current =iv_ruleCnf_equality; 
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
    // $ANTLR end "entryRuleCnf_equality"


    // $ANTLR start "ruleCnf_equality"
    // InternalTPTP.g:3341:1: ruleCnf_equality returns [EObject current=null] : ( ( (lv_expL_0_0= ruleCnf_expression ) ) ( ( ( (lv_eq_1_1= '=' | lv_eq_1_2= '!=' ) ) ) ( (lv_expR_2_0= ruleCnf_expression ) ) )? ) ;
    public final EObject ruleCnf_equality() throws RecognitionException {
        EObject current = null;

        Token lv_eq_1_1=null;
        Token lv_eq_1_2=null;
        EObject lv_expL_0_0 = null;

        EObject lv_expR_2_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:3347:2: ( ( ( (lv_expL_0_0= ruleCnf_expression ) ) ( ( ( (lv_eq_1_1= '=' | lv_eq_1_2= '!=' ) ) ) ( (lv_expR_2_0= ruleCnf_expression ) ) )? ) )
            // InternalTPTP.g:3348:2: ( ( (lv_expL_0_0= ruleCnf_expression ) ) ( ( ( (lv_eq_1_1= '=' | lv_eq_1_2= '!=' ) ) ) ( (lv_expR_2_0= ruleCnf_expression ) ) )? )
            {
            // InternalTPTP.g:3348:2: ( ( (lv_expL_0_0= ruleCnf_expression ) ) ( ( ( (lv_eq_1_1= '=' | lv_eq_1_2= '!=' ) ) ) ( (lv_expR_2_0= ruleCnf_expression ) ) )? )
            // InternalTPTP.g:3349:3: ( (lv_expL_0_0= ruleCnf_expression ) ) ( ( ( (lv_eq_1_1= '=' | lv_eq_1_2= '!=' ) ) ) ( (lv_expR_2_0= ruleCnf_expression ) ) )?
            {
            // InternalTPTP.g:3349:3: ( (lv_expL_0_0= ruleCnf_expression ) )
            // InternalTPTP.g:3350:4: (lv_expL_0_0= ruleCnf_expression )
            {
            // InternalTPTP.g:3350:4: (lv_expL_0_0= ruleCnf_expression )
            // InternalTPTP.g:3351:5: lv_expL_0_0= ruleCnf_expression
            {

            					newCompositeNode(grammarAccess.getCnf_equalityAccess().getExpLCnf_expressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_37);
            lv_expL_0_0=ruleCnf_expression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCnf_equalityRule());
            					}
            					set(
            						current,
            						"expL",
            						lv_expL_0_0,
            						"it.unibz.inf.tptp.TPTP.Cnf_expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTPTP.g:3368:3: ( ( ( (lv_eq_1_1= '=' | lv_eq_1_2= '!=' ) ) ) ( (lv_expR_2_0= ruleCnf_expression ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=69 && LA54_0<=70)) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalTPTP.g:3369:4: ( ( (lv_eq_1_1= '=' | lv_eq_1_2= '!=' ) ) ) ( (lv_expR_2_0= ruleCnf_expression ) )
                    {
                    // InternalTPTP.g:3369:4: ( ( (lv_eq_1_1= '=' | lv_eq_1_2= '!=' ) ) )
                    // InternalTPTP.g:3370:5: ( (lv_eq_1_1= '=' | lv_eq_1_2= '!=' ) )
                    {
                    // InternalTPTP.g:3370:5: ( (lv_eq_1_1= '=' | lv_eq_1_2= '!=' ) )
                    // InternalTPTP.g:3371:6: (lv_eq_1_1= '=' | lv_eq_1_2= '!=' )
                    {
                    // InternalTPTP.g:3371:6: (lv_eq_1_1= '=' | lv_eq_1_2= '!=' )
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
                            // InternalTPTP.g:3372:7: lv_eq_1_1= '='
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
                            // InternalTPTP.g:3383:7: lv_eq_1_2= '!='
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

                    // InternalTPTP.g:3396:4: ( (lv_expR_2_0= ruleCnf_expression ) )
                    // InternalTPTP.g:3397:5: (lv_expR_2_0= ruleCnf_expression )
                    {
                    // InternalTPTP.g:3397:5: (lv_expR_2_0= ruleCnf_expression )
                    // InternalTPTP.g:3398:6: lv_expR_2_0= ruleCnf_expression
                    {

                    						newCompositeNode(grammarAccess.getCnf_equalityAccess().getExpRCnf_expressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expR_2_0=ruleCnf_expression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCnf_equalityRule());
                    						}
                    						set(
                    							current,
                    							"expR",
                    							lv_expR_2_0,
                    							"it.unibz.inf.tptp.TPTP.Cnf_expression");
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
    // $ANTLR end "ruleCnf_equality"


    // $ANTLR start "entryRuleCnf_expression"
    // InternalTPTP.g:3420:1: entryRuleCnf_expression returns [EObject current=null] : iv_ruleCnf_expression= ruleCnf_expression EOF ;
    public final EObject entryRuleCnf_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCnf_expression = null;


        try {
            // InternalTPTP.g:3420:55: (iv_ruleCnf_expression= ruleCnf_expression EOF )
            // InternalTPTP.g:3421:2: iv_ruleCnf_expression= ruleCnf_expression EOF
            {
             newCompositeNode(grammarAccess.getCnf_expressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCnf_expression=ruleCnf_expression();

            state._fsp--;

             current =iv_ruleCnf_expression; 
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
    // $ANTLR end "entryRuleCnf_expression"


    // $ANTLR start "ruleCnf_expression"
    // InternalTPTP.g:3427:1: ruleCnf_expression returns [EObject current=null] : (this_Cnf_constant_0= ruleCnf_constant | this_Cnf_var_1= ruleCnf_var | ( (lv_cnf_exp_2_0= ruleCnf_statement_literal ) ) ) ;
    public final EObject ruleCnf_expression() throws RecognitionException {
        EObject current = null;

        EObject this_Cnf_constant_0 = null;

        EObject this_Cnf_var_1 = null;

        AntlrDatatypeRuleToken lv_cnf_exp_2_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:3433:2: ( (this_Cnf_constant_0= ruleCnf_constant | this_Cnf_var_1= ruleCnf_var | ( (lv_cnf_exp_2_0= ruleCnf_statement_literal ) ) ) )
            // InternalTPTP.g:3434:2: (this_Cnf_constant_0= ruleCnf_constant | this_Cnf_var_1= ruleCnf_var | ( (lv_cnf_exp_2_0= ruleCnf_statement_literal ) ) )
            {
            // InternalTPTP.g:3434:2: (this_Cnf_constant_0= ruleCnf_constant | this_Cnf_var_1= ruleCnf_var | ( (lv_cnf_exp_2_0= ruleCnf_statement_literal ) ) )
            int alt55=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_LOWER_TOKEN:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
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
                    // InternalTPTP.g:3435:3: this_Cnf_constant_0= ruleCnf_constant
                    {

                    			newCompositeNode(grammarAccess.getCnf_expressionAccess().getCnf_constantParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Cnf_constant_0=ruleCnf_constant();

                    state._fsp--;


                    			current = this_Cnf_constant_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:3444:3: this_Cnf_var_1= ruleCnf_var
                    {

                    			newCompositeNode(grammarAccess.getCnf_expressionAccess().getCnf_varParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Cnf_var_1=ruleCnf_var();

                    state._fsp--;


                    			current = this_Cnf_var_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTPTP.g:3453:3: ( (lv_cnf_exp_2_0= ruleCnf_statement_literal ) )
                    {
                    // InternalTPTP.g:3453:3: ( (lv_cnf_exp_2_0= ruleCnf_statement_literal ) )
                    // InternalTPTP.g:3454:4: (lv_cnf_exp_2_0= ruleCnf_statement_literal )
                    {
                    // InternalTPTP.g:3454:4: (lv_cnf_exp_2_0= ruleCnf_statement_literal )
                    // InternalTPTP.g:3455:5: lv_cnf_exp_2_0= ruleCnf_statement_literal
                    {

                    					newCompositeNode(grammarAccess.getCnf_expressionAccess().getCnf_expCnf_statement_literalParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_cnf_exp_2_0=ruleCnf_statement_literal();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCnf_expressionRule());
                    					}
                    					set(
                    						current,
                    						"cnf_exp",
                    						lv_cnf_exp_2_0,
                    						"it.unibz.inf.tptp.TPTP.Cnf_statement_literal");
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
    // $ANTLR end "ruleCnf_expression"


    // $ANTLR start "entryRuleCnf_constant"
    // InternalTPTP.g:3476:1: entryRuleCnf_constant returns [EObject current=null] : iv_ruleCnf_constant= ruleCnf_constant EOF ;
    public final EObject entryRuleCnf_constant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCnf_constant = null;


        try {
            // InternalTPTP.g:3476:53: (iv_ruleCnf_constant= ruleCnf_constant EOF )
            // InternalTPTP.g:3477:2: iv_ruleCnf_constant= ruleCnf_constant EOF
            {
             newCompositeNode(grammarAccess.getCnf_constantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCnf_constant=ruleCnf_constant();

            state._fsp--;

             current =iv_ruleCnf_constant; 
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
    // $ANTLR end "entryRuleCnf_constant"


    // $ANTLR start "ruleCnf_constant"
    // InternalTPTP.g:3483:1: ruleCnf_constant returns [EObject current=null] : ( ( ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleCnf_expression ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleCnf_expression ) ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleCnf_constant() throws RecognitionException {
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
            // InternalTPTP.g:3489:2: ( ( ( ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleCnf_expression ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleCnf_expression ) ) )* otherlv_5= ')' )? ) )
            // InternalTPTP.g:3490:2: ( ( ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleCnf_expression ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleCnf_expression ) ) )* otherlv_5= ')' )? )
            {
            // InternalTPTP.g:3490:2: ( ( ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleCnf_expression ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleCnf_expression ) ) )* otherlv_5= ')' )? )
            // InternalTPTP.g:3491:3: ( ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleCnf_expression ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleCnf_expression ) ) )* otherlv_5= ')' )?
            {
            // InternalTPTP.g:3491:3: ( ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) )
            // InternalTPTP.g:3492:4: ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) )
            {
            // InternalTPTP.g:3492:4: ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) )
            // InternalTPTP.g:3493:5: (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING )
            {
            // InternalTPTP.g:3493:5: (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_LOWER_TOKEN||(LA56_0>=19 && LA56_0<=24)||LA56_0==34||LA56_0==67) ) {
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
                    // InternalTPTP.g:3494:6: lv_name_0_1= ruleLower_token_and_keyword
                    {

                    						newCompositeNode(grammarAccess.getCnf_constantAccess().getNameLower_token_and_keywordParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_name_0_1=ruleLower_token_and_keyword();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCnf_constantRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_0_1,
                    							"it.unibz.inf.tptp.TPTP.Lower_token_and_keyword");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:3510:6: lv_name_0_2= RULE_STRING
                    {
                    lv_name_0_2=(Token)match(input,RULE_STRING,FOLLOW_17); 

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

            // InternalTPTP.g:3527:3: (otherlv_1= '(' ( (lv_param_2_0= ruleCnf_expression ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleCnf_expression ) ) )* otherlv_5= ')' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==14) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalTPTP.g:3528:4: otherlv_1= '(' ( (lv_param_2_0= ruleCnf_expression ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleCnf_expression ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_35); 

                    				newLeafNode(otherlv_1, grammarAccess.getCnf_constantAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalTPTP.g:3532:4: ( (lv_param_2_0= ruleCnf_expression ) )
                    // InternalTPTP.g:3533:5: (lv_param_2_0= ruleCnf_expression )
                    {
                    // InternalTPTP.g:3533:5: (lv_param_2_0= ruleCnf_expression )
                    // InternalTPTP.g:3534:6: lv_param_2_0= ruleCnf_expression
                    {

                    						newCompositeNode(grammarAccess.getCnf_constantAccess().getParamCnf_expressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_param_2_0=ruleCnf_expression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCnf_constantRule());
                    						}
                    						add(
                    							current,
                    							"param",
                    							lv_param_2_0,
                    							"it.unibz.inf.tptp.TPTP.Cnf_expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTPTP.g:3551:4: (otherlv_3= ',' ( (lv_param_4_0= ruleCnf_expression ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==18) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalTPTP.g:3552:5: otherlv_3= ',' ( (lv_param_4_0= ruleCnf_expression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FOLLOW_35); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getCnf_constantAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalTPTP.g:3556:5: ( (lv_param_4_0= ruleCnf_expression ) )
                    	    // InternalTPTP.g:3557:6: (lv_param_4_0= ruleCnf_expression )
                    	    {
                    	    // InternalTPTP.g:3557:6: (lv_param_4_0= ruleCnf_expression )
                    	    // InternalTPTP.g:3558:7: lv_param_4_0= ruleCnf_expression
                    	    {

                    	    							newCompositeNode(grammarAccess.getCnf_constantAccess().getParamCnf_expressionParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_param_4_0=ruleCnf_expression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCnf_constantRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"param",
                    	    								lv_param_4_0,
                    	    								"it.unibz.inf.tptp.TPTP.Cnf_expression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,15,FOLLOW_2); 

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
    // $ANTLR end "ruleCnf_constant"


    // $ANTLR start "entryRuleCnf_var"
    // InternalTPTP.g:3585:1: entryRuleCnf_var returns [EObject current=null] : iv_ruleCnf_var= ruleCnf_var EOF ;
    public final EObject entryRuleCnf_var() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCnf_var = null;


        try {
            // InternalTPTP.g:3585:48: (iv_ruleCnf_var= ruleCnf_var EOF )
            // InternalTPTP.g:3586:2: iv_ruleCnf_var= ruleCnf_var EOF
            {
             newCompositeNode(grammarAccess.getCnf_varRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCnf_var=ruleCnf_var();

            state._fsp--;

             current =iv_ruleCnf_var; 
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
    // $ANTLR end "entryRuleCnf_var"


    // $ANTLR start "ruleCnf_var"
    // InternalTPTP.g:3592:1: ruleCnf_var returns [EObject current=null] : ( (lv_name_0_0= RULE_UPPER_TOKEN ) ) ;
    public final EObject ruleCnf_var() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalTPTP.g:3598:2: ( ( (lv_name_0_0= RULE_UPPER_TOKEN ) ) )
            // InternalTPTP.g:3599:2: ( (lv_name_0_0= RULE_UPPER_TOKEN ) )
            {
            // InternalTPTP.g:3599:2: ( (lv_name_0_0= RULE_UPPER_TOKEN ) )
            // InternalTPTP.g:3600:3: (lv_name_0_0= RULE_UPPER_TOKEN )
            {
            // InternalTPTP.g:3600:3: (lv_name_0_0= RULE_UPPER_TOKEN )
            // InternalTPTP.g:3601:4: lv_name_0_0= RULE_UPPER_TOKEN
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
    // $ANTLR end "ruleCnf_var"


    // $ANTLR start "entryRuleCnf_statement_literal"
    // InternalTPTP.g:3620:1: entryRuleCnf_statement_literal returns [String current=null] : iv_ruleCnf_statement_literal= ruleCnf_statement_literal EOF ;
    public final String entryRuleCnf_statement_literal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCnf_statement_literal = null;


        try {
            // InternalTPTP.g:3620:61: (iv_ruleCnf_statement_literal= ruleCnf_statement_literal EOF )
            // InternalTPTP.g:3621:2: iv_ruleCnf_statement_literal= ruleCnf_statement_literal EOF
            {
             newCompositeNode(grammarAccess.getCnf_statement_literalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCnf_statement_literal=ruleCnf_statement_literal();

            state._fsp--;

             current =iv_ruleCnf_statement_literal.getText(); 
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
    // $ANTLR end "entryRuleCnf_statement_literal"


    // $ANTLR start "ruleCnf_statement_literal"
    // InternalTPTP.g:3627:1: ruleCnf_statement_literal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '$true' | kw= '$false' ) ;
    public final AntlrDatatypeRuleToken ruleCnf_statement_literal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTPTP.g:3633:2: ( (kw= '$true' | kw= '$false' ) )
            // InternalTPTP.g:3634:2: (kw= '$true' | kw= '$false' )
            {
            // InternalTPTP.g:3634:2: (kw= '$true' | kw= '$false' )
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
                    // InternalTPTP.g:3635:3: kw= '$true'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCnf_statement_literalAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:3641:3: kw= '$false'
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
    // $ANTLR end "ruleCnf_statement_literal"


    // $ANTLR start "entryRuleThf_input"
    // InternalTPTP.g:3650:1: entryRuleThf_input returns [EObject current=null] : iv_ruleThf_input= ruleThf_input EOF ;
    public final EObject entryRuleThf_input() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThf_input = null;


        try {
            // InternalTPTP.g:3650:50: (iv_ruleThf_input= ruleThf_input EOF )
            // InternalTPTP.g:3651:2: iv_ruleThf_input= ruleThf_input EOF
            {
             newCompositeNode(grammarAccess.getThf_inputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThf_input=ruleThf_input();

            state._fsp--;

             current =iv_ruleThf_input; 
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
    // $ANTLR end "entryRuleThf_input"


    // $ANTLR start "ruleThf_input"
    // InternalTPTP.g:3657:1: ruleThf_input returns [EObject current=null] : (this_Thf_root_0= ruleThf_root | this_Include_1= ruleInclude ) ;
    public final EObject ruleThf_input() throws RecognitionException {
        EObject current = null;

        EObject this_Thf_root_0 = null;

        EObject this_Include_1 = null;



        	enterRule();

        try {
            // InternalTPTP.g:3663:2: ( (this_Thf_root_0= ruleThf_root | this_Include_1= ruleInclude ) )
            // InternalTPTP.g:3664:2: (this_Thf_root_0= ruleThf_root | this_Include_1= ruleInclude )
            {
            // InternalTPTP.g:3664:2: (this_Thf_root_0= ruleThf_root | this_Include_1= ruleInclude )
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
                    // InternalTPTP.g:3665:3: this_Thf_root_0= ruleThf_root
                    {

                    			newCompositeNode(grammarAccess.getThf_inputAccess().getThf_rootParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Thf_root_0=ruleThf_root();

                    state._fsp--;


                    			current = this_Thf_root_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:3674:3: this_Include_1= ruleInclude
                    {

                    			newCompositeNode(grammarAccess.getThf_inputAccess().getIncludeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Include_1=ruleInclude();

                    state._fsp--;


                    			current = this_Include_1;
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
    // $ANTLR end "ruleThf_input"


    // $ANTLR start "entryRuleThf_root"
    // InternalTPTP.g:3686:1: entryRuleThf_root returns [EObject current=null] : iv_ruleThf_root= ruleThf_root EOF ;
    public final EObject entryRuleThf_root() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThf_root = null;


        try {
            // InternalTPTP.g:3686:49: (iv_ruleThf_root= ruleThf_root EOF )
            // InternalTPTP.g:3687:2: iv_ruleThf_root= ruleThf_root EOF
            {
             newCompositeNode(grammarAccess.getThf_rootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThf_root=ruleThf_root();

            state._fsp--;

             current =iv_ruleThf_root; 
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
    // $ANTLR end "entryRuleThf_root"


    // $ANTLR start "ruleThf_root"
    // InternalTPTP.g:3693:1: ruleThf_root returns [EObject current=null] : ( (otherlv_0= 'thf' otherlv_1= '(' ( ( (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING ) ) ) otherlv_3= ',' ( (lv_formula_role_4_0= 'type' ) ) otherlv_5= ',' ( (lv_def_6_0= ruleThf_formula_type_definition ) ) otherlv_7= ')' otherlv_8= '.' ) | (otherlv_9= 'thf' otherlv_10= '(' ( ( (lv_name_11_1= ruleLower_token_and_keyword | lv_name_11_2= RULE_STRING ) ) ) otherlv_12= ',' ( ( (lv_formula_role_13_1= 'axiom' | lv_formula_role_13_2= 'hypothesis' | lv_formula_role_13_3= 'negated_conjecture' | lv_formula_role_13_4= 'conjecture' | lv_formula_role_13_5= 'definition' | lv_formula_role_13_6= 'lemma' ) ) ) otherlv_14= ',' ( (lv_thf_exp_15_0= ruleThf_expression ) ) otherlv_16= ')' otherlv_17= '.' ) ) ;
    public final EObject ruleThf_root() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_2=null;
        Token otherlv_3=null;
        Token lv_formula_role_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_name_11_2=null;
        Token otherlv_12=null;
        Token lv_formula_role_13_1=null;
        Token lv_formula_role_13_2=null;
        Token lv_formula_role_13_3=null;
        Token lv_formula_role_13_4=null;
        Token lv_formula_role_13_5=null;
        Token lv_formula_role_13_6=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_2_1 = null;

        EObject lv_def_6_0 = null;

        AntlrDatatypeRuleToken lv_name_11_1 = null;

        EObject lv_thf_exp_15_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:3699:2: ( ( (otherlv_0= 'thf' otherlv_1= '(' ( ( (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING ) ) ) otherlv_3= ',' ( (lv_formula_role_4_0= 'type' ) ) otherlv_5= ',' ( (lv_def_6_0= ruleThf_formula_type_definition ) ) otherlv_7= ')' otherlv_8= '.' ) | (otherlv_9= 'thf' otherlv_10= '(' ( ( (lv_name_11_1= ruleLower_token_and_keyword | lv_name_11_2= RULE_STRING ) ) ) otherlv_12= ',' ( ( (lv_formula_role_13_1= 'axiom' | lv_formula_role_13_2= 'hypothesis' | lv_formula_role_13_3= 'negated_conjecture' | lv_formula_role_13_4= 'conjecture' | lv_formula_role_13_5= 'definition' | lv_formula_role_13_6= 'lemma' ) ) ) otherlv_14= ',' ( (lv_thf_exp_15_0= ruleThf_expression ) ) otherlv_16= ')' otherlv_17= '.' ) ) )
            // InternalTPTP.g:3700:2: ( (otherlv_0= 'thf' otherlv_1= '(' ( ( (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING ) ) ) otherlv_3= ',' ( (lv_formula_role_4_0= 'type' ) ) otherlv_5= ',' ( (lv_def_6_0= ruleThf_formula_type_definition ) ) otherlv_7= ')' otherlv_8= '.' ) | (otherlv_9= 'thf' otherlv_10= '(' ( ( (lv_name_11_1= ruleLower_token_and_keyword | lv_name_11_2= RULE_STRING ) ) ) otherlv_12= ',' ( ( (lv_formula_role_13_1= 'axiom' | lv_formula_role_13_2= 'hypothesis' | lv_formula_role_13_3= 'negated_conjecture' | lv_formula_role_13_4= 'conjecture' | lv_formula_role_13_5= 'definition' | lv_formula_role_13_6= 'lemma' ) ) ) otherlv_14= ',' ( (lv_thf_exp_15_0= ruleThf_expression ) ) otherlv_16= ')' otherlv_17= '.' ) )
            {
            // InternalTPTP.g:3700:2: ( (otherlv_0= 'thf' otherlv_1= '(' ( ( (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING ) ) ) otherlv_3= ',' ( (lv_formula_role_4_0= 'type' ) ) otherlv_5= ',' ( (lv_def_6_0= ruleThf_formula_type_definition ) ) otherlv_7= ')' otherlv_8= '.' ) | (otherlv_9= 'thf' otherlv_10= '(' ( ( (lv_name_11_1= ruleLower_token_and_keyword | lv_name_11_2= RULE_STRING ) ) ) otherlv_12= ',' ( ( (lv_formula_role_13_1= 'axiom' | lv_formula_role_13_2= 'hypothesis' | lv_formula_role_13_3= 'negated_conjecture' | lv_formula_role_13_4= 'conjecture' | lv_formula_role_13_5= 'definition' | lv_formula_role_13_6= 'lemma' ) ) ) otherlv_14= ',' ( (lv_thf_exp_15_0= ruleThf_expression ) ) otherlv_16= ')' otherlv_17= '.' ) )
            int alt64=2;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // InternalTPTP.g:3701:3: (otherlv_0= 'thf' otherlv_1= '(' ( ( (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING ) ) ) otherlv_3= ',' ( (lv_formula_role_4_0= 'type' ) ) otherlv_5= ',' ( (lv_def_6_0= ruleThf_formula_type_definition ) ) otherlv_7= ')' otherlv_8= '.' )
                    {
                    // InternalTPTP.g:3701:3: (otherlv_0= 'thf' otherlv_1= '(' ( ( (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING ) ) ) otherlv_3= ',' ( (lv_formula_role_4_0= 'type' ) ) otherlv_5= ',' ( (lv_def_6_0= ruleThf_formula_type_definition ) ) otherlv_7= ')' otherlv_8= '.' )
                    // InternalTPTP.g:3702:4: otherlv_0= 'thf' otherlv_1= '(' ( ( (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING ) ) ) otherlv_3= ',' ( (lv_formula_role_4_0= 'type' ) ) otherlv_5= ',' ( (lv_def_6_0= ruleThf_formula_type_definition ) ) otherlv_7= ')' otherlv_8= '.'
                    {
                    otherlv_0=(Token)match(input,71,FOLLOW_8); 

                    				newLeafNode(otherlv_0, grammarAccess.getThf_rootAccess().getThfKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,14,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getThf_rootAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalTPTP.g:3710:4: ( ( (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING ) ) )
                    // InternalTPTP.g:3711:5: ( (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING ) )
                    {
                    // InternalTPTP.g:3711:5: ( (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING ) )
                    // InternalTPTP.g:3712:6: (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING )
                    {
                    // InternalTPTP.g:3712:6: (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING )
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==RULE_LOWER_TOKEN||(LA61_0>=19 && LA61_0<=24)||LA61_0==34||LA61_0==67) ) {
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
                            // InternalTPTP.g:3713:7: lv_name_2_1= ruleLower_token_and_keyword
                            {

                            							newCompositeNode(grammarAccess.getThf_rootAccess().getNameLower_token_and_keywordParserRuleCall_0_2_0_0());
                            						
                            pushFollow(FOLLOW_13);
                            lv_name_2_1=ruleLower_token_and_keyword();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getThf_rootRule());
                            							}
                            							set(
                            								current,
                            								"name",
                            								lv_name_2_1,
                            								"it.unibz.inf.tptp.TPTP.Lower_token_and_keyword");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalTPTP.g:3729:7: lv_name_2_2= RULE_STRING
                            {
                            lv_name_2_2=(Token)match(input,RULE_STRING,FOLLOW_13); 

                            							newLeafNode(lv_name_2_2, grammarAccess.getThf_rootAccess().getNameSTRINGTerminalRuleCall_0_2_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getThf_rootRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"name",
                            								lv_name_2_2,
                            								"it.unibz.inf.tptp.TPTP.STRING");
                            						

                            }
                            break;

                    }


                    }


                    }

                    otherlv_3=(Token)match(input,18,FOLLOW_26); 

                    				newLeafNode(otherlv_3, grammarAccess.getThf_rootAccess().getCommaKeyword_0_3());
                    			
                    // InternalTPTP.g:3750:4: ( (lv_formula_role_4_0= 'type' ) )
                    // InternalTPTP.g:3751:5: (lv_formula_role_4_0= 'type' )
                    {
                    // InternalTPTP.g:3751:5: (lv_formula_role_4_0= 'type' )
                    // InternalTPTP.g:3752:6: lv_formula_role_4_0= 'type'
                    {
                    lv_formula_role_4_0=(Token)match(input,34,FOLLOW_13); 

                    						newLeafNode(lv_formula_role_4_0, grammarAccess.getThf_rootAccess().getFormula_roleTypeKeyword_0_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getThf_rootRule());
                    						}
                    						setWithLastConsumed(current, "formula_role", lv_formula_role_4_0, "type");
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,18,FOLLOW_27); 

                    				newLeafNode(otherlv_5, grammarAccess.getThf_rootAccess().getCommaKeyword_0_5());
                    			
                    // InternalTPTP.g:3768:4: ( (lv_def_6_0= ruleThf_formula_type_definition ) )
                    // InternalTPTP.g:3769:5: (lv_def_6_0= ruleThf_formula_type_definition )
                    {
                    // InternalTPTP.g:3769:5: (lv_def_6_0= ruleThf_formula_type_definition )
                    // InternalTPTP.g:3770:6: lv_def_6_0= ruleThf_formula_type_definition
                    {

                    						newCompositeNode(grammarAccess.getThf_rootAccess().getDefThf_formula_type_definitionParserRuleCall_0_6_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_def_6_0=ruleThf_formula_type_definition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getThf_rootRule());
                    						}
                    						set(
                    							current,
                    							"def",
                    							lv_def_6_0,
                    							"it.unibz.inf.tptp.TPTP.Thf_formula_type_definition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getThf_rootAccess().getRightParenthesisKeyword_0_7());
                    			
                    otherlv_8=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getThf_rootAccess().getFullStopKeyword_0_8());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTPTP.g:3797:3: (otherlv_9= 'thf' otherlv_10= '(' ( ( (lv_name_11_1= ruleLower_token_and_keyword | lv_name_11_2= RULE_STRING ) ) ) otherlv_12= ',' ( ( (lv_formula_role_13_1= 'axiom' | lv_formula_role_13_2= 'hypothesis' | lv_formula_role_13_3= 'negated_conjecture' | lv_formula_role_13_4= 'conjecture' | lv_formula_role_13_5= 'definition' | lv_formula_role_13_6= 'lemma' ) ) ) otherlv_14= ',' ( (lv_thf_exp_15_0= ruleThf_expression ) ) otherlv_16= ')' otherlv_17= '.' )
                    {
                    // InternalTPTP.g:3797:3: (otherlv_9= 'thf' otherlv_10= '(' ( ( (lv_name_11_1= ruleLower_token_and_keyword | lv_name_11_2= RULE_STRING ) ) ) otherlv_12= ',' ( ( (lv_formula_role_13_1= 'axiom' | lv_formula_role_13_2= 'hypothesis' | lv_formula_role_13_3= 'negated_conjecture' | lv_formula_role_13_4= 'conjecture' | lv_formula_role_13_5= 'definition' | lv_formula_role_13_6= 'lemma' ) ) ) otherlv_14= ',' ( (lv_thf_exp_15_0= ruleThf_expression ) ) otherlv_16= ')' otherlv_17= '.' )
                    // InternalTPTP.g:3798:4: otherlv_9= 'thf' otherlv_10= '(' ( ( (lv_name_11_1= ruleLower_token_and_keyword | lv_name_11_2= RULE_STRING ) ) ) otherlv_12= ',' ( ( (lv_formula_role_13_1= 'axiom' | lv_formula_role_13_2= 'hypothesis' | lv_formula_role_13_3= 'negated_conjecture' | lv_formula_role_13_4= 'conjecture' | lv_formula_role_13_5= 'definition' | lv_formula_role_13_6= 'lemma' ) ) ) otherlv_14= ',' ( (lv_thf_exp_15_0= ruleThf_expression ) ) otherlv_16= ')' otherlv_17= '.'
                    {
                    otherlv_9=(Token)match(input,71,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getThf_rootAccess().getThfKeyword_1_0());
                    			
                    otherlv_10=(Token)match(input,14,FOLLOW_12); 

                    				newLeafNode(otherlv_10, grammarAccess.getThf_rootAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalTPTP.g:3806:4: ( ( (lv_name_11_1= ruleLower_token_and_keyword | lv_name_11_2= RULE_STRING ) ) )
                    // InternalTPTP.g:3807:5: ( (lv_name_11_1= ruleLower_token_and_keyword | lv_name_11_2= RULE_STRING ) )
                    {
                    // InternalTPTP.g:3807:5: ( (lv_name_11_1= ruleLower_token_and_keyword | lv_name_11_2= RULE_STRING ) )
                    // InternalTPTP.g:3808:6: (lv_name_11_1= ruleLower_token_and_keyword | lv_name_11_2= RULE_STRING )
                    {
                    // InternalTPTP.g:3808:6: (lv_name_11_1= ruleLower_token_and_keyword | lv_name_11_2= RULE_STRING )
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==RULE_LOWER_TOKEN||(LA62_0>=19 && LA62_0<=24)||LA62_0==34||LA62_0==67) ) {
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
                            // InternalTPTP.g:3809:7: lv_name_11_1= ruleLower_token_and_keyword
                            {

                            							newCompositeNode(grammarAccess.getThf_rootAccess().getNameLower_token_and_keywordParserRuleCall_1_2_0_0());
                            						
                            pushFollow(FOLLOW_13);
                            lv_name_11_1=ruleLower_token_and_keyword();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getThf_rootRule());
                            							}
                            							set(
                            								current,
                            								"name",
                            								lv_name_11_1,
                            								"it.unibz.inf.tptp.TPTP.Lower_token_and_keyword");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalTPTP.g:3825:7: lv_name_11_2= RULE_STRING
                            {
                            lv_name_11_2=(Token)match(input,RULE_STRING,FOLLOW_13); 

                            							newLeafNode(lv_name_11_2, grammarAccess.getThf_rootAccess().getNameSTRINGTerminalRuleCall_1_2_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getThf_rootRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"name",
                            								lv_name_11_2,
                            								"it.unibz.inf.tptp.TPTP.STRING");
                            						

                            }
                            break;

                    }


                    }


                    }

                    otherlv_12=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_12, grammarAccess.getThf_rootAccess().getCommaKeyword_1_3());
                    			
                    // InternalTPTP.g:3846:4: ( ( (lv_formula_role_13_1= 'axiom' | lv_formula_role_13_2= 'hypothesis' | lv_formula_role_13_3= 'negated_conjecture' | lv_formula_role_13_4= 'conjecture' | lv_formula_role_13_5= 'definition' | lv_formula_role_13_6= 'lemma' ) ) )
                    // InternalTPTP.g:3847:5: ( (lv_formula_role_13_1= 'axiom' | lv_formula_role_13_2= 'hypothesis' | lv_formula_role_13_3= 'negated_conjecture' | lv_formula_role_13_4= 'conjecture' | lv_formula_role_13_5= 'definition' | lv_formula_role_13_6= 'lemma' ) )
                    {
                    // InternalTPTP.g:3847:5: ( (lv_formula_role_13_1= 'axiom' | lv_formula_role_13_2= 'hypothesis' | lv_formula_role_13_3= 'negated_conjecture' | lv_formula_role_13_4= 'conjecture' | lv_formula_role_13_5= 'definition' | lv_formula_role_13_6= 'lemma' ) )
                    // InternalTPTP.g:3848:6: (lv_formula_role_13_1= 'axiom' | lv_formula_role_13_2= 'hypothesis' | lv_formula_role_13_3= 'negated_conjecture' | lv_formula_role_13_4= 'conjecture' | lv_formula_role_13_5= 'definition' | lv_formula_role_13_6= 'lemma' )
                    {
                    // InternalTPTP.g:3848:6: (lv_formula_role_13_1= 'axiom' | lv_formula_role_13_2= 'hypothesis' | lv_formula_role_13_3= 'negated_conjecture' | lv_formula_role_13_4= 'conjecture' | lv_formula_role_13_5= 'definition' | lv_formula_role_13_6= 'lemma' )
                    int alt63=6;
                    switch ( input.LA(1) ) {
                    case 19:
                        {
                        alt63=1;
                        }
                        break;
                    case 20:
                        {
                        alt63=2;
                        }
                        break;
                    case 21:
                        {
                        alt63=3;
                        }
                        break;
                    case 22:
                        {
                        alt63=4;
                        }
                        break;
                    case 23:
                        {
                        alt63=5;
                        }
                        break;
                    case 24:
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
                            // InternalTPTP.g:3849:7: lv_formula_role_13_1= 'axiom'
                            {
                            lv_formula_role_13_1=(Token)match(input,19,FOLLOW_13); 

                            							newLeafNode(lv_formula_role_13_1, grammarAccess.getThf_rootAccess().getFormula_roleAxiomKeyword_1_4_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getThf_rootRule());
                            							}
                            							setWithLastConsumed(current, "formula_role", lv_formula_role_13_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalTPTP.g:3860:7: lv_formula_role_13_2= 'hypothesis'
                            {
                            lv_formula_role_13_2=(Token)match(input,20,FOLLOW_13); 

                            							newLeafNode(lv_formula_role_13_2, grammarAccess.getThf_rootAccess().getFormula_roleHypothesisKeyword_1_4_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getThf_rootRule());
                            							}
                            							setWithLastConsumed(current, "formula_role", lv_formula_role_13_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalTPTP.g:3871:7: lv_formula_role_13_3= 'negated_conjecture'
                            {
                            lv_formula_role_13_3=(Token)match(input,21,FOLLOW_13); 

                            							newLeafNode(lv_formula_role_13_3, grammarAccess.getThf_rootAccess().getFormula_roleNegated_conjectureKeyword_1_4_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getThf_rootRule());
                            							}
                            							setWithLastConsumed(current, "formula_role", lv_formula_role_13_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalTPTP.g:3882:7: lv_formula_role_13_4= 'conjecture'
                            {
                            lv_formula_role_13_4=(Token)match(input,22,FOLLOW_13); 

                            							newLeafNode(lv_formula_role_13_4, grammarAccess.getThf_rootAccess().getFormula_roleConjectureKeyword_1_4_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getThf_rootRule());
                            							}
                            							setWithLastConsumed(current, "formula_role", lv_formula_role_13_4, null);
                            						

                            }
                            break;
                        case 5 :
                            // InternalTPTP.g:3893:7: lv_formula_role_13_5= 'definition'
                            {
                            lv_formula_role_13_5=(Token)match(input,23,FOLLOW_13); 

                            							newLeafNode(lv_formula_role_13_5, grammarAccess.getThf_rootAccess().getFormula_roleDefinitionKeyword_1_4_0_4());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getThf_rootRule());
                            							}
                            							setWithLastConsumed(current, "formula_role", lv_formula_role_13_5, null);
                            						

                            }
                            break;
                        case 6 :
                            // InternalTPTP.g:3904:7: lv_formula_role_13_6= 'lemma'
                            {
                            lv_formula_role_13_6=(Token)match(input,24,FOLLOW_13); 

                            							newLeafNode(lv_formula_role_13_6, grammarAccess.getThf_rootAccess().getFormula_roleLemmaKeyword_1_4_0_5());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getThf_rootRule());
                            							}
                            							setWithLastConsumed(current, "formula_role", lv_formula_role_13_6, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    otherlv_14=(Token)match(input,18,FOLLOW_38); 

                    				newLeafNode(otherlv_14, grammarAccess.getThf_rootAccess().getCommaKeyword_1_5());
                    			
                    // InternalTPTP.g:3921:4: ( (lv_thf_exp_15_0= ruleThf_expression ) )
                    // InternalTPTP.g:3922:5: (lv_thf_exp_15_0= ruleThf_expression )
                    {
                    // InternalTPTP.g:3922:5: (lv_thf_exp_15_0= ruleThf_expression )
                    // InternalTPTP.g:3923:6: lv_thf_exp_15_0= ruleThf_expression
                    {

                    						newCompositeNode(grammarAccess.getThf_rootAccess().getThf_expThf_expressionParserRuleCall_1_6_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_thf_exp_15_0=ruleThf_expression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getThf_rootRule());
                    						}
                    						set(
                    							current,
                    							"thf_exp",
                    							lv_thf_exp_15_0,
                    							"it.unibz.inf.tptp.TPTP.Thf_expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_16, grammarAccess.getThf_rootAccess().getRightParenthesisKeyword_1_7());
                    			
                    otherlv_17=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_17, grammarAccess.getThf_rootAccess().getFullStopKeyword_1_8());
                    			

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
    // $ANTLR end "ruleThf_root"


    // $ANTLR start "entryRuleThf_formula_type_definition"
    // InternalTPTP.g:3953:1: entryRuleThf_formula_type_definition returns [EObject current=null] : iv_ruleThf_formula_type_definition= ruleThf_formula_type_definition EOF ;
    public final EObject entryRuleThf_formula_type_definition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThf_formula_type_definition = null;


        try {
            // InternalTPTP.g:3953:68: (iv_ruleThf_formula_type_definition= ruleThf_formula_type_definition EOF )
            // InternalTPTP.g:3954:2: iv_ruleThf_formula_type_definition= ruleThf_formula_type_definition EOF
            {
             newCompositeNode(grammarAccess.getThf_formula_type_definitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThf_formula_type_definition=ruleThf_formula_type_definition();

            state._fsp--;

             current =iv_ruleThf_formula_type_definition; 
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
    // $ANTLR end "entryRuleThf_formula_type_definition"


    // $ANTLR start "ruleThf_formula_type_definition"
    // InternalTPTP.g:3960:1: ruleThf_formula_type_definition returns [EObject current=null] : ( (otherlv_0= '(' this_Thf_formula_type_definition_1= ruleThf_formula_type_definition otherlv_2= ')' ) | ( ( ( (lv_name_3_1= ruleLower_token_and_keyword | lv_name_3_2= RULE_STRING ) ) ) otherlv_4= ':' ( (lv_exp_5_0= ruleThf_type_expression ) ) ) ) ;
    public final EObject ruleThf_formula_type_definition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_3_2=null;
        Token otherlv_4=null;
        EObject this_Thf_formula_type_definition_1 = null;

        AntlrDatatypeRuleToken lv_name_3_1 = null;

        EObject lv_exp_5_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:3966:2: ( ( (otherlv_0= '(' this_Thf_formula_type_definition_1= ruleThf_formula_type_definition otherlv_2= ')' ) | ( ( ( (lv_name_3_1= ruleLower_token_and_keyword | lv_name_3_2= RULE_STRING ) ) ) otherlv_4= ':' ( (lv_exp_5_0= ruleThf_type_expression ) ) ) ) )
            // InternalTPTP.g:3967:2: ( (otherlv_0= '(' this_Thf_formula_type_definition_1= ruleThf_formula_type_definition otherlv_2= ')' ) | ( ( ( (lv_name_3_1= ruleLower_token_and_keyword | lv_name_3_2= RULE_STRING ) ) ) otherlv_4= ':' ( (lv_exp_5_0= ruleThf_type_expression ) ) ) )
            {
            // InternalTPTP.g:3967:2: ( (otherlv_0= '(' this_Thf_formula_type_definition_1= ruleThf_formula_type_definition otherlv_2= ')' ) | ( ( ( (lv_name_3_1= ruleLower_token_and_keyword | lv_name_3_2= RULE_STRING ) ) ) otherlv_4= ':' ( (lv_exp_5_0= ruleThf_type_expression ) ) ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==14) ) {
                alt66=1;
            }
            else if ( (LA66_0==RULE_STRING||LA66_0==RULE_LOWER_TOKEN||(LA66_0>=19 && LA66_0<=24)||LA66_0==34||LA66_0==67) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalTPTP.g:3968:3: (otherlv_0= '(' this_Thf_formula_type_definition_1= ruleThf_formula_type_definition otherlv_2= ')' )
                    {
                    // InternalTPTP.g:3968:3: (otherlv_0= '(' this_Thf_formula_type_definition_1= ruleThf_formula_type_definition otherlv_2= ')' )
                    // InternalTPTP.g:3969:4: otherlv_0= '(' this_Thf_formula_type_definition_1= ruleThf_formula_type_definition otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_27); 

                    				newLeafNode(otherlv_0, grammarAccess.getThf_formula_type_definitionAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getThf_formula_type_definitionAccess().getThf_formula_type_definitionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_10);
                    this_Thf_formula_type_definition_1=ruleThf_formula_type_definition();

                    state._fsp--;


                    				current = this_Thf_formula_type_definition_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getThf_formula_type_definitionAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTPTP.g:3987:3: ( ( ( (lv_name_3_1= ruleLower_token_and_keyword | lv_name_3_2= RULE_STRING ) ) ) otherlv_4= ':' ( (lv_exp_5_0= ruleThf_type_expression ) ) )
                    {
                    // InternalTPTP.g:3987:3: ( ( ( (lv_name_3_1= ruleLower_token_and_keyword | lv_name_3_2= RULE_STRING ) ) ) otherlv_4= ':' ( (lv_exp_5_0= ruleThf_type_expression ) ) )
                    // InternalTPTP.g:3988:4: ( ( (lv_name_3_1= ruleLower_token_and_keyword | lv_name_3_2= RULE_STRING ) ) ) otherlv_4= ':' ( (lv_exp_5_0= ruleThf_type_expression ) )
                    {
                    // InternalTPTP.g:3988:4: ( ( (lv_name_3_1= ruleLower_token_and_keyword | lv_name_3_2= RULE_STRING ) ) )
                    // InternalTPTP.g:3989:5: ( (lv_name_3_1= ruleLower_token_and_keyword | lv_name_3_2= RULE_STRING ) )
                    {
                    // InternalTPTP.g:3989:5: ( (lv_name_3_1= ruleLower_token_and_keyword | lv_name_3_2= RULE_STRING ) )
                    // InternalTPTP.g:3990:6: (lv_name_3_1= ruleLower_token_and_keyword | lv_name_3_2= RULE_STRING )
                    {
                    // InternalTPTP.g:3990:6: (lv_name_3_1= ruleLower_token_and_keyword | lv_name_3_2= RULE_STRING )
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==RULE_LOWER_TOKEN||(LA65_0>=19 && LA65_0<=24)||LA65_0==34||LA65_0==67) ) {
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
                            // InternalTPTP.g:3991:7: lv_name_3_1= ruleLower_token_and_keyword
                            {

                            							newCompositeNode(grammarAccess.getThf_formula_type_definitionAccess().getNameLower_token_and_keywordParserRuleCall_1_0_0_0());
                            						
                            pushFollow(FOLLOW_23);
                            lv_name_3_1=ruleLower_token_and_keyword();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getThf_formula_type_definitionRule());
                            							}
                            							set(
                            								current,
                            								"name",
                            								lv_name_3_1,
                            								"it.unibz.inf.tptp.TPTP.Lower_token_and_keyword");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalTPTP.g:4007:7: lv_name_3_2= RULE_STRING
                            {
                            lv_name_3_2=(Token)match(input,RULE_STRING,FOLLOW_23); 

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
                    			
                    // InternalTPTP.g:4028:4: ( (lv_exp_5_0= ruleThf_type_expression ) )
                    // InternalTPTP.g:4029:5: (lv_exp_5_0= ruleThf_type_expression )
                    {
                    // InternalTPTP.g:4029:5: (lv_exp_5_0= ruleThf_type_expression )
                    // InternalTPTP.g:4030:6: lv_exp_5_0= ruleThf_type_expression
                    {

                    						newCompositeNode(grammarAccess.getThf_formula_type_definitionAccess().getExpThf_type_expressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_exp_5_0=ruleThf_type_expression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getThf_formula_type_definitionRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_5_0,
                    							"it.unibz.inf.tptp.TPTP.Thf_type_expression");
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
    // $ANTLR end "ruleThf_formula_type_definition"


    // $ANTLR start "entryRuleThf_type_expression"
    // InternalTPTP.g:4052:1: entryRuleThf_type_expression returns [EObject current=null] : iv_ruleThf_type_expression= ruleThf_type_expression EOF ;
    public final EObject entryRuleThf_type_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThf_type_expression = null;


        try {
            // InternalTPTP.g:4052:60: (iv_ruleThf_type_expression= ruleThf_type_expression EOF )
            // InternalTPTP.g:4053:2: iv_ruleThf_type_expression= ruleThf_type_expression EOF
            {
             newCompositeNode(grammarAccess.getThf_type_expressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThf_type_expression=ruleThf_type_expression();

            state._fsp--;

             current =iv_ruleThf_type_expression; 
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
    // $ANTLR end "entryRuleThf_type_expression"


    // $ANTLR start "ruleThf_type_expression"
    // InternalTPTP.g:4059:1: ruleThf_type_expression returns [EObject current=null] : (this_Thf_terminal_type_expression_0= ruleThf_terminal_type_expression ( () ( (lv_op_2_0= '>' ) ) ( (lv_right_3_0= ruleThf_terminal_type_expression ) ) )* ) ;
    public final EObject ruleThf_type_expression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Thf_terminal_type_expression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:4065:2: ( (this_Thf_terminal_type_expression_0= ruleThf_terminal_type_expression ( () ( (lv_op_2_0= '>' ) ) ( (lv_right_3_0= ruleThf_terminal_type_expression ) ) )* ) )
            // InternalTPTP.g:4066:2: (this_Thf_terminal_type_expression_0= ruleThf_terminal_type_expression ( () ( (lv_op_2_0= '>' ) ) ( (lv_right_3_0= ruleThf_terminal_type_expression ) ) )* )
            {
            // InternalTPTP.g:4066:2: (this_Thf_terminal_type_expression_0= ruleThf_terminal_type_expression ( () ( (lv_op_2_0= '>' ) ) ( (lv_right_3_0= ruleThf_terminal_type_expression ) ) )* )
            // InternalTPTP.g:4067:3: this_Thf_terminal_type_expression_0= ruleThf_terminal_type_expression ( () ( (lv_op_2_0= '>' ) ) ( (lv_right_3_0= ruleThf_terminal_type_expression ) ) )*
            {

            			newCompositeNode(grammarAccess.getThf_type_expressionAccess().getThf_terminal_type_expressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_40);
            this_Thf_terminal_type_expression_0=ruleThf_terminal_type_expression();

            state._fsp--;


            			current = this_Thf_terminal_type_expression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTPTP.g:4075:3: ( () ( (lv_op_2_0= '>' ) ) ( (lv_right_3_0= ruleThf_terminal_type_expression ) ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==35) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalTPTP.g:4076:4: () ( (lv_op_2_0= '>' ) ) ( (lv_right_3_0= ruleThf_terminal_type_expression ) )
            	    {
            	    // InternalTPTP.g:4076:4: ()
            	    // InternalTPTP.g:4077:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getThf_type_expressionAccess().getOperLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalTPTP.g:4083:4: ( (lv_op_2_0= '>' ) )
            	    // InternalTPTP.g:4084:5: (lv_op_2_0= '>' )
            	    {
            	    // InternalTPTP.g:4084:5: (lv_op_2_0= '>' )
            	    // InternalTPTP.g:4085:6: lv_op_2_0= '>'
            	    {
            	    lv_op_2_0=(Token)match(input,35,FOLLOW_39); 

            	    						newLeafNode(lv_op_2_0, grammarAccess.getThf_type_expressionAccess().getOpGreaterThanSignKeyword_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getThf_type_expressionRule());
            	    						}
            	    						setWithLastConsumed(current, "op", lv_op_2_0, ">");
            	    					

            	    }


            	    }

            	    // InternalTPTP.g:4097:4: ( (lv_right_3_0= ruleThf_terminal_type_expression ) )
            	    // InternalTPTP.g:4098:5: (lv_right_3_0= ruleThf_terminal_type_expression )
            	    {
            	    // InternalTPTP.g:4098:5: (lv_right_3_0= ruleThf_terminal_type_expression )
            	    // InternalTPTP.g:4099:6: lv_right_3_0= ruleThf_terminal_type_expression
            	    {

            	    						newCompositeNode(grammarAccess.getThf_type_expressionAccess().getRightThf_terminal_type_expressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_40);
            	    lv_right_3_0=ruleThf_terminal_type_expression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getThf_type_expressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"it.unibz.inf.tptp.TPTP.Thf_terminal_type_expression");
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
    // $ANTLR end "ruleThf_type_expression"


    // $ANTLR start "entryRuleThf_terminal_type_expression"
    // InternalTPTP.g:4121:1: entryRuleThf_terminal_type_expression returns [EObject current=null] : iv_ruleThf_terminal_type_expression= ruleThf_terminal_type_expression EOF ;
    public final EObject entryRuleThf_terminal_type_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThf_terminal_type_expression = null;


        try {
            // InternalTPTP.g:4121:69: (iv_ruleThf_terminal_type_expression= ruleThf_terminal_type_expression EOF )
            // InternalTPTP.g:4122:2: iv_ruleThf_terminal_type_expression= ruleThf_terminal_type_expression EOF
            {
             newCompositeNode(grammarAccess.getThf_terminal_type_expressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThf_terminal_type_expression=ruleThf_terminal_type_expression();

            state._fsp--;

             current =iv_ruleThf_terminal_type_expression; 
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
    // $ANTLR end "entryRuleThf_terminal_type_expression"


    // $ANTLR start "ruleThf_terminal_type_expression"
    // InternalTPTP.g:4128:1: ruleThf_terminal_type_expression returns [EObject current=null] : (this_Thf_type_atom_0= ruleThf_type_atom | (otherlv_1= '(' this_Thf_type_expression_2= ruleThf_type_expression otherlv_3= ')' ) ) ;
    public final EObject ruleThf_terminal_type_expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Thf_type_atom_0 = null;

        EObject this_Thf_type_expression_2 = null;



        	enterRule();

        try {
            // InternalTPTP.g:4134:2: ( (this_Thf_type_atom_0= ruleThf_type_atom | (otherlv_1= '(' this_Thf_type_expression_2= ruleThf_type_expression otherlv_3= ')' ) ) )
            // InternalTPTP.g:4135:2: (this_Thf_type_atom_0= ruleThf_type_atom | (otherlv_1= '(' this_Thf_type_expression_2= ruleThf_type_expression otherlv_3= ')' ) )
            {
            // InternalTPTP.g:4135:2: (this_Thf_type_atom_0= ruleThf_type_atom | (otherlv_1= '(' this_Thf_type_expression_2= ruleThf_type_expression otherlv_3= ')' ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_STRING||LA68_0==RULE_LOWER_TOKEN||(LA68_0>=19 && LA68_0<=24)||LA68_0==34||(LA68_0>=37 && LA68_0<=39)||LA68_0==67) ) {
                alt68=1;
            }
            else if ( (LA68_0==14) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // InternalTPTP.g:4136:3: this_Thf_type_atom_0= ruleThf_type_atom
                    {

                    			newCompositeNode(grammarAccess.getThf_terminal_type_expressionAccess().getThf_type_atomParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Thf_type_atom_0=ruleThf_type_atom();

                    state._fsp--;


                    			current = this_Thf_type_atom_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:4145:3: (otherlv_1= '(' this_Thf_type_expression_2= ruleThf_type_expression otherlv_3= ')' )
                    {
                    // InternalTPTP.g:4145:3: (otherlv_1= '(' this_Thf_type_expression_2= ruleThf_type_expression otherlv_3= ')' )
                    // InternalTPTP.g:4146:4: otherlv_1= '(' this_Thf_type_expression_2= ruleThf_type_expression otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_39); 

                    				newLeafNode(otherlv_1, grammarAccess.getThf_terminal_type_expressionAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getThf_terminal_type_expressionAccess().getThf_type_expressionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_10);
                    this_Thf_type_expression_2=ruleThf_type_expression();

                    state._fsp--;


                    				current = this_Thf_type_expression_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,15,FOLLOW_2); 

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
    // $ANTLR end "ruleThf_terminal_type_expression"


    // $ANTLR start "entryRuleThf_type_atom"
    // InternalTPTP.g:4167:1: entryRuleThf_type_atom returns [EObject current=null] : iv_ruleThf_type_atom= ruleThf_type_atom EOF ;
    public final EObject entryRuleThf_type_atom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThf_type_atom = null;


        try {
            // InternalTPTP.g:4167:54: (iv_ruleThf_type_atom= ruleThf_type_atom EOF )
            // InternalTPTP.g:4168:2: iv_ruleThf_type_atom= ruleThf_type_atom EOF
            {
             newCompositeNode(grammarAccess.getThf_type_atomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThf_type_atom=ruleThf_type_atom();

            state._fsp--;

             current =iv_ruleThf_type_atom; 
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
    // $ANTLR end "entryRuleThf_type_atom"


    // $ANTLR start "ruleThf_type_atom"
    // InternalTPTP.g:4174:1: ruleThf_type_atom returns [EObject current=null] : (this_Thf_type_constant_0= ruleThf_type_constant | this_Thf_type_literal_1= ruleThf_type_literal ) ;
    public final EObject ruleThf_type_atom() throws RecognitionException {
        EObject current = null;

        EObject this_Thf_type_constant_0 = null;

        EObject this_Thf_type_literal_1 = null;



        	enterRule();

        try {
            // InternalTPTP.g:4180:2: ( (this_Thf_type_constant_0= ruleThf_type_constant | this_Thf_type_literal_1= ruleThf_type_literal ) )
            // InternalTPTP.g:4181:2: (this_Thf_type_constant_0= ruleThf_type_constant | this_Thf_type_literal_1= ruleThf_type_literal )
            {
            // InternalTPTP.g:4181:2: (this_Thf_type_constant_0= ruleThf_type_constant | this_Thf_type_literal_1= ruleThf_type_literal )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_STRING||LA69_0==RULE_LOWER_TOKEN||(LA69_0>=19 && LA69_0<=24)||LA69_0==34||LA69_0==67) ) {
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
                    // InternalTPTP.g:4182:3: this_Thf_type_constant_0= ruleThf_type_constant
                    {

                    			newCompositeNode(grammarAccess.getThf_type_atomAccess().getThf_type_constantParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Thf_type_constant_0=ruleThf_type_constant();

                    state._fsp--;


                    			current = this_Thf_type_constant_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:4191:3: this_Thf_type_literal_1= ruleThf_type_literal
                    {

                    			newCompositeNode(grammarAccess.getThf_type_atomAccess().getThf_type_literalParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Thf_type_literal_1=ruleThf_type_literal();

                    state._fsp--;


                    			current = this_Thf_type_literal_1;
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
    // $ANTLR end "ruleThf_type_atom"


    // $ANTLR start "entryRuleThf_type_constant"
    // InternalTPTP.g:4203:1: entryRuleThf_type_constant returns [EObject current=null] : iv_ruleThf_type_constant= ruleThf_type_constant EOF ;
    public final EObject entryRuleThf_type_constant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThf_type_constant = null;


        try {
            // InternalTPTP.g:4203:58: (iv_ruleThf_type_constant= ruleThf_type_constant EOF )
            // InternalTPTP.g:4204:2: iv_ruleThf_type_constant= ruleThf_type_constant EOF
            {
             newCompositeNode(grammarAccess.getThf_type_constantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThf_type_constant=ruleThf_type_constant();

            state._fsp--;

             current =iv_ruleThf_type_constant; 
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
    // $ANTLR end "entryRuleThf_type_constant"


    // $ANTLR start "ruleThf_type_constant"
    // InternalTPTP.g:4210:1: ruleThf_type_constant returns [EObject current=null] : ( ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) ;
    public final EObject ruleThf_type_constant() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_2=null;
        AntlrDatatypeRuleToken lv_name_0_1 = null;



        	enterRule();

        try {
            // InternalTPTP.g:4216:2: ( ( ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) )
            // InternalTPTP.g:4217:2: ( ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) )
            {
            // InternalTPTP.g:4217:2: ( ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) )
            // InternalTPTP.g:4218:3: ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) )
            {
            // InternalTPTP.g:4218:3: ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) )
            // InternalTPTP.g:4219:4: (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING )
            {
            // InternalTPTP.g:4219:4: (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_LOWER_TOKEN||(LA70_0>=19 && LA70_0<=24)||LA70_0==34||LA70_0==67) ) {
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
                    // InternalTPTP.g:4220:5: lv_name_0_1= ruleLower_token_and_keyword
                    {

                    					newCompositeNode(grammarAccess.getThf_type_constantAccess().getNameLower_token_and_keywordParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_name_0_1=ruleLower_token_and_keyword();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getThf_type_constantRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_0_1,
                    						"it.unibz.inf.tptp.TPTP.Lower_token_and_keyword");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:4236:5: lv_name_0_2= RULE_STRING
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
    // $ANTLR end "ruleThf_type_constant"


    // $ANTLR start "entryRuleThf_type_literal"
    // InternalTPTP.g:4256:1: entryRuleThf_type_literal returns [EObject current=null] : iv_ruleThf_type_literal= ruleThf_type_literal EOF ;
    public final EObject entryRuleThf_type_literal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThf_type_literal = null;


        try {
            // InternalTPTP.g:4256:57: (iv_ruleThf_type_literal= ruleThf_type_literal EOF )
            // InternalTPTP.g:4257:2: iv_ruleThf_type_literal= ruleThf_type_literal EOF
            {
             newCompositeNode(grammarAccess.getThf_type_literalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThf_type_literal=ruleThf_type_literal();

            state._fsp--;

             current =iv_ruleThf_type_literal; 
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
    // $ANTLR end "entryRuleThf_type_literal"


    // $ANTLR start "ruleThf_type_literal"
    // InternalTPTP.g:4263:1: ruleThf_type_literal returns [EObject current=null] : ( ( (lv_name_0_1= '$i' | lv_name_0_2= '$o' | lv_name_0_3= '$tType' ) ) ) ;
    public final EObject ruleThf_type_literal() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;


        	enterRule();

        try {
            // InternalTPTP.g:4269:2: ( ( ( (lv_name_0_1= '$i' | lv_name_0_2= '$o' | lv_name_0_3= '$tType' ) ) ) )
            // InternalTPTP.g:4270:2: ( ( (lv_name_0_1= '$i' | lv_name_0_2= '$o' | lv_name_0_3= '$tType' ) ) )
            {
            // InternalTPTP.g:4270:2: ( ( (lv_name_0_1= '$i' | lv_name_0_2= '$o' | lv_name_0_3= '$tType' ) ) )
            // InternalTPTP.g:4271:3: ( (lv_name_0_1= '$i' | lv_name_0_2= '$o' | lv_name_0_3= '$tType' ) )
            {
            // InternalTPTP.g:4271:3: ( (lv_name_0_1= '$i' | lv_name_0_2= '$o' | lv_name_0_3= '$tType' ) )
            // InternalTPTP.g:4272:4: (lv_name_0_1= '$i' | lv_name_0_2= '$o' | lv_name_0_3= '$tType' )
            {
            // InternalTPTP.g:4272:4: (lv_name_0_1= '$i' | lv_name_0_2= '$o' | lv_name_0_3= '$tType' )
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
                    // InternalTPTP.g:4273:5: lv_name_0_1= '$i'
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
                    // InternalTPTP.g:4284:5: lv_name_0_2= '$o'
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
                    // InternalTPTP.g:4295:5: lv_name_0_3= '$tType'
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
    // $ANTLR end "ruleThf_type_literal"


    // $ANTLR start "entryRuleThf_expression"
    // InternalTPTP.g:4311:1: entryRuleThf_expression returns [EObject current=null] : iv_ruleThf_expression= ruleThf_expression EOF ;
    public final EObject entryRuleThf_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThf_expression = null;


        try {
            // InternalTPTP.g:4311:55: (iv_ruleThf_expression= ruleThf_expression EOF )
            // InternalTPTP.g:4312:2: iv_ruleThf_expression= ruleThf_expression EOF
            {
             newCompositeNode(grammarAccess.getThf_expressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThf_expression=ruleThf_expression();

            state._fsp--;

             current =iv_ruleThf_expression; 
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
    // $ANTLR end "entryRuleThf_expression"


    // $ANTLR start "ruleThf_expression"
    // InternalTPTP.g:4318:1: ruleThf_expression returns [EObject current=null] : (this_Thf_terminating_expression_0= ruleThf_terminating_expression ( () ( (lv_op_2_0= ruleThf_binary_operator ) ) ( (lv_right_3_0= ruleThf_terminating_expression ) ) )* ) ;
    public final EObject ruleThf_expression() throws RecognitionException {
        EObject current = null;

        EObject this_Thf_terminating_expression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:4324:2: ( (this_Thf_terminating_expression_0= ruleThf_terminating_expression ( () ( (lv_op_2_0= ruleThf_binary_operator ) ) ( (lv_right_3_0= ruleThf_terminating_expression ) ) )* ) )
            // InternalTPTP.g:4325:2: (this_Thf_terminating_expression_0= ruleThf_terminating_expression ( () ( (lv_op_2_0= ruleThf_binary_operator ) ) ( (lv_right_3_0= ruleThf_terminating_expression ) ) )* )
            {
            // InternalTPTP.g:4325:2: (this_Thf_terminating_expression_0= ruleThf_terminating_expression ( () ( (lv_op_2_0= ruleThf_binary_operator ) ) ( (lv_right_3_0= ruleThf_terminating_expression ) ) )* )
            // InternalTPTP.g:4326:3: this_Thf_terminating_expression_0= ruleThf_terminating_expression ( () ( (lv_op_2_0= ruleThf_binary_operator ) ) ( (lv_right_3_0= ruleThf_terminating_expression ) ) )*
            {

            			newCompositeNode(grammarAccess.getThf_expressionAccess().getThf_terminating_expressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_41);
            this_Thf_terminating_expression_0=ruleThf_terminating_expression();

            state._fsp--;


            			current = this_Thf_terminating_expression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTPTP.g:4334:3: ( () ( (lv_op_2_0= ruleThf_binary_operator ) ) ( (lv_right_3_0= ruleThf_terminating_expression ) ) )*
            loop72:
            do {
                int alt72=2;
                alt72 = dfa72.predict(input);
                switch (alt72) {
            	case 1 :
            	    // InternalTPTP.g:4335:4: () ( (lv_op_2_0= ruleThf_binary_operator ) ) ( (lv_right_3_0= ruleThf_terminating_expression ) )
            	    {
            	    // InternalTPTP.g:4335:4: ()
            	    // InternalTPTP.g:4336:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getThf_expressionAccess().getBinaryLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalTPTP.g:4342:4: ( (lv_op_2_0= ruleThf_binary_operator ) )
            	    // InternalTPTP.g:4343:5: (lv_op_2_0= ruleThf_binary_operator )
            	    {
            	    // InternalTPTP.g:4343:5: (lv_op_2_0= ruleThf_binary_operator )
            	    // InternalTPTP.g:4344:6: lv_op_2_0= ruleThf_binary_operator
            	    {

            	    						newCompositeNode(grammarAccess.getThf_expressionAccess().getOpThf_binary_operatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_38);
            	    lv_op_2_0=ruleThf_binary_operator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getThf_expressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"op",
            	    							lv_op_2_0,
            	    							"it.unibz.inf.tptp.TPTP.Thf_binary_operator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalTPTP.g:4361:4: ( (lv_right_3_0= ruleThf_terminating_expression ) )
            	    // InternalTPTP.g:4362:5: (lv_right_3_0= ruleThf_terminating_expression )
            	    {
            	    // InternalTPTP.g:4362:5: (lv_right_3_0= ruleThf_terminating_expression )
            	    // InternalTPTP.g:4363:6: lv_right_3_0= ruleThf_terminating_expression
            	    {

            	    						newCompositeNode(grammarAccess.getThf_expressionAccess().getRightThf_terminating_expressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_41);
            	    lv_right_3_0=ruleThf_terminating_expression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getThf_expressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"it.unibz.inf.tptp.TPTP.Thf_terminating_expression");
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
    // $ANTLR end "ruleThf_expression"


    // $ANTLR start "entryRuleThf_terminating_expression"
    // InternalTPTP.g:4385:1: entryRuleThf_terminating_expression returns [EObject current=null] : iv_ruleThf_terminating_expression= ruleThf_terminating_expression EOF ;
    public final EObject entryRuleThf_terminating_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThf_terminating_expression = null;


        try {
            // InternalTPTP.g:4385:67: (iv_ruleThf_terminating_expression= ruleThf_terminating_expression EOF )
            // InternalTPTP.g:4386:2: iv_ruleThf_terminating_expression= ruleThf_terminating_expression EOF
            {
             newCompositeNode(grammarAccess.getThf_terminating_expressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThf_terminating_expression=ruleThf_terminating_expression();

            state._fsp--;

             current =iv_ruleThf_terminating_expression; 
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
    // $ANTLR end "entryRuleThf_terminating_expression"


    // $ANTLR start "ruleThf_terminating_expression"
    // InternalTPTP.g:4392:1: ruleThf_terminating_expression returns [EObject current=null] : ( ( (lv_thf_atom_0_0= ruleThf_atom ) ) | (otherlv_1= '(' this_Thf_expression_2= ruleThf_expression otherlv_3= ')' ) | ( ( (lv_thf_negation_4_0= '~' ) ) ( (lv_thf_exp_5_0= ruleThf_expression ) ) ) | ( ( (lv_op_6_0= ruleThf_unary_operator ) ) ( (lv_thf_exp_7_0= ruleThf_expression ) ) ) | ( (lv_thf_exp_8_0= ruleThf_quantifier_expression ) ) ) ;
    public final EObject ruleThf_terminating_expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_thf_negation_4_0=null;
        EObject lv_thf_atom_0_0 = null;

        EObject this_Thf_expression_2 = null;

        EObject lv_thf_exp_5_0 = null;

        AntlrDatatypeRuleToken lv_op_6_0 = null;

        EObject lv_thf_exp_7_0 = null;

        EObject lv_thf_exp_8_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:4398:2: ( ( ( (lv_thf_atom_0_0= ruleThf_atom ) ) | (otherlv_1= '(' this_Thf_expression_2= ruleThf_expression otherlv_3= ')' ) | ( ( (lv_thf_negation_4_0= '~' ) ) ( (lv_thf_exp_5_0= ruleThf_expression ) ) ) | ( ( (lv_op_6_0= ruleThf_unary_operator ) ) ( (lv_thf_exp_7_0= ruleThf_expression ) ) ) | ( (lv_thf_exp_8_0= ruleThf_quantifier_expression ) ) ) )
            // InternalTPTP.g:4399:2: ( ( (lv_thf_atom_0_0= ruleThf_atom ) ) | (otherlv_1= '(' this_Thf_expression_2= ruleThf_expression otherlv_3= ')' ) | ( ( (lv_thf_negation_4_0= '~' ) ) ( (lv_thf_exp_5_0= ruleThf_expression ) ) ) | ( ( (lv_op_6_0= ruleThf_unary_operator ) ) ( (lv_thf_exp_7_0= ruleThf_expression ) ) ) | ( (lv_thf_exp_8_0= ruleThf_quantifier_expression ) ) )
            {
            // InternalTPTP.g:4399:2: ( ( (lv_thf_atom_0_0= ruleThf_atom ) ) | (otherlv_1= '(' this_Thf_expression_2= ruleThf_expression otherlv_3= ')' ) | ( ( (lv_thf_negation_4_0= '~' ) ) ( (lv_thf_exp_5_0= ruleThf_expression ) ) ) | ( ( (lv_op_6_0= ruleThf_unary_operator ) ) ( (lv_thf_exp_7_0= ruleThf_expression ) ) ) | ( (lv_thf_exp_8_0= ruleThf_quantifier_expression ) ) )
            int alt73=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_UPPER_TOKEN:
            case RULE_LOWER_TOKEN:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 26:
            case 27:
            case 34:
            case 67:
                {
                alt73=1;
                }
                break;
            case 14:
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
                    // InternalTPTP.g:4400:3: ( (lv_thf_atom_0_0= ruleThf_atom ) )
                    {
                    // InternalTPTP.g:4400:3: ( (lv_thf_atom_0_0= ruleThf_atom ) )
                    // InternalTPTP.g:4401:4: (lv_thf_atom_0_0= ruleThf_atom )
                    {
                    // InternalTPTP.g:4401:4: (lv_thf_atom_0_0= ruleThf_atom )
                    // InternalTPTP.g:4402:5: lv_thf_atom_0_0= ruleThf_atom
                    {

                    					newCompositeNode(grammarAccess.getThf_terminating_expressionAccess().getThf_atomThf_atomParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_thf_atom_0_0=ruleThf_atom();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getThf_terminating_expressionRule());
                    					}
                    					set(
                    						current,
                    						"thf_atom",
                    						lv_thf_atom_0_0,
                    						"it.unibz.inf.tptp.TPTP.Thf_atom");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTPTP.g:4420:3: (otherlv_1= '(' this_Thf_expression_2= ruleThf_expression otherlv_3= ')' )
                    {
                    // InternalTPTP.g:4420:3: (otherlv_1= '(' this_Thf_expression_2= ruleThf_expression otherlv_3= ')' )
                    // InternalTPTP.g:4421:4: otherlv_1= '(' this_Thf_expression_2= ruleThf_expression otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_38); 

                    				newLeafNode(otherlv_1, grammarAccess.getThf_terminating_expressionAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getThf_terminating_expressionAccess().getThf_expressionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_10);
                    this_Thf_expression_2=ruleThf_expression();

                    state._fsp--;


                    				current = this_Thf_expression_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getThf_terminating_expressionAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTPTP.g:4439:3: ( ( (lv_thf_negation_4_0= '~' ) ) ( (lv_thf_exp_5_0= ruleThf_expression ) ) )
                    {
                    // InternalTPTP.g:4439:3: ( ( (lv_thf_negation_4_0= '~' ) ) ( (lv_thf_exp_5_0= ruleThf_expression ) ) )
                    // InternalTPTP.g:4440:4: ( (lv_thf_negation_4_0= '~' ) ) ( (lv_thf_exp_5_0= ruleThf_expression ) )
                    {
                    // InternalTPTP.g:4440:4: ( (lv_thf_negation_4_0= '~' ) )
                    // InternalTPTP.g:4441:5: (lv_thf_negation_4_0= '~' )
                    {
                    // InternalTPTP.g:4441:5: (lv_thf_negation_4_0= '~' )
                    // InternalTPTP.g:4442:6: lv_thf_negation_4_0= '~'
                    {
                    lv_thf_negation_4_0=(Token)match(input,25,FOLLOW_38); 

                    						newLeafNode(lv_thf_negation_4_0, grammarAccess.getThf_terminating_expressionAccess().getThf_negationTildeKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getThf_terminating_expressionRule());
                    						}
                    						setWithLastConsumed(current, "thf_negation", true, "~");
                    					

                    }


                    }

                    // InternalTPTP.g:4454:4: ( (lv_thf_exp_5_0= ruleThf_expression ) )
                    // InternalTPTP.g:4455:5: (lv_thf_exp_5_0= ruleThf_expression )
                    {
                    // InternalTPTP.g:4455:5: (lv_thf_exp_5_0= ruleThf_expression )
                    // InternalTPTP.g:4456:6: lv_thf_exp_5_0= ruleThf_expression
                    {

                    						newCompositeNode(grammarAccess.getThf_terminating_expressionAccess().getThf_expThf_expressionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_thf_exp_5_0=ruleThf_expression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getThf_terminating_expressionRule());
                    						}
                    						set(
                    							current,
                    							"thf_exp",
                    							lv_thf_exp_5_0,
                    							"it.unibz.inf.tptp.TPTP.Thf_expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalTPTP.g:4475:3: ( ( (lv_op_6_0= ruleThf_unary_operator ) ) ( (lv_thf_exp_7_0= ruleThf_expression ) ) )
                    {
                    // InternalTPTP.g:4475:3: ( ( (lv_op_6_0= ruleThf_unary_operator ) ) ( (lv_thf_exp_7_0= ruleThf_expression ) ) )
                    // InternalTPTP.g:4476:4: ( (lv_op_6_0= ruleThf_unary_operator ) ) ( (lv_thf_exp_7_0= ruleThf_expression ) )
                    {
                    // InternalTPTP.g:4476:4: ( (lv_op_6_0= ruleThf_unary_operator ) )
                    // InternalTPTP.g:4477:5: (lv_op_6_0= ruleThf_unary_operator )
                    {
                    // InternalTPTP.g:4477:5: (lv_op_6_0= ruleThf_unary_operator )
                    // InternalTPTP.g:4478:6: lv_op_6_0= ruleThf_unary_operator
                    {

                    						newCompositeNode(grammarAccess.getThf_terminating_expressionAccess().getOpThf_unary_operatorParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_op_6_0=ruleThf_unary_operator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getThf_terminating_expressionRule());
                    						}
                    						set(
                    							current,
                    							"op",
                    							lv_op_6_0,
                    							"it.unibz.inf.tptp.TPTP.Thf_unary_operator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTPTP.g:4495:4: ( (lv_thf_exp_7_0= ruleThf_expression ) )
                    // InternalTPTP.g:4496:5: (lv_thf_exp_7_0= ruleThf_expression )
                    {
                    // InternalTPTP.g:4496:5: (lv_thf_exp_7_0= ruleThf_expression )
                    // InternalTPTP.g:4497:6: lv_thf_exp_7_0= ruleThf_expression
                    {

                    						newCompositeNode(grammarAccess.getThf_terminating_expressionAccess().getThf_expThf_expressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_thf_exp_7_0=ruleThf_expression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getThf_terminating_expressionRule());
                    						}
                    						set(
                    							current,
                    							"thf_exp",
                    							lv_thf_exp_7_0,
                    							"it.unibz.inf.tptp.TPTP.Thf_expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalTPTP.g:4516:3: ( (lv_thf_exp_8_0= ruleThf_quantifier_expression ) )
                    {
                    // InternalTPTP.g:4516:3: ( (lv_thf_exp_8_0= ruleThf_quantifier_expression ) )
                    // InternalTPTP.g:4517:4: (lv_thf_exp_8_0= ruleThf_quantifier_expression )
                    {
                    // InternalTPTP.g:4517:4: (lv_thf_exp_8_0= ruleThf_quantifier_expression )
                    // InternalTPTP.g:4518:5: lv_thf_exp_8_0= ruleThf_quantifier_expression
                    {

                    					newCompositeNode(grammarAccess.getThf_terminating_expressionAccess().getThf_expThf_quantifier_expressionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_thf_exp_8_0=ruleThf_quantifier_expression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getThf_terminating_expressionRule());
                    					}
                    					set(
                    						current,
                    						"thf_exp",
                    						lv_thf_exp_8_0,
                    						"it.unibz.inf.tptp.TPTP.Thf_quantifier_expression");
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
    // $ANTLR end "ruleThf_terminating_expression"


    // $ANTLR start "entryRuleThf_unary_operator"
    // InternalTPTP.g:4539:1: entryRuleThf_unary_operator returns [String current=null] : iv_ruleThf_unary_operator= ruleThf_unary_operator EOF ;
    public final String entryRuleThf_unary_operator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleThf_unary_operator = null;


        try {
            // InternalTPTP.g:4539:58: (iv_ruleThf_unary_operator= ruleThf_unary_operator EOF )
            // InternalTPTP.g:4540:2: iv_ruleThf_unary_operator= ruleThf_unary_operator EOF
            {
             newCompositeNode(grammarAccess.getThf_unary_operatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThf_unary_operator=ruleThf_unary_operator();

            state._fsp--;

             current =iv_ruleThf_unary_operator.getText(); 
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
    // $ANTLR end "entryRuleThf_unary_operator"


    // $ANTLR start "ruleThf_unary_operator"
    // InternalTPTP.g:4546:1: ruleThf_unary_operator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '@' | kw= '??' | kw= '!!' | kw= '&' | kw= '|' | kw= '=>' ) ;
    public final AntlrDatatypeRuleToken ruleThf_unary_operator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTPTP.g:4552:2: ( (kw= '@' | kw= '??' | kw= '!!' | kw= '&' | kw= '|' | kw= '=>' ) )
            // InternalTPTP.g:4553:2: (kw= '@' | kw= '??' | kw= '!!' | kw= '&' | kw= '|' | kw= '=>' )
            {
            // InternalTPTP.g:4553:2: (kw= '@' | kw= '??' | kw= '!!' | kw= '&' | kw= '|' | kw= '=>' )
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
                    // InternalTPTP.g:4554:3: kw= '@'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThf_unary_operatorAccess().getCommercialAtKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:4560:3: kw= '??'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThf_unary_operatorAccess().getQuestionMarkQuestionMarkKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalTPTP.g:4566:3: kw= '!!'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThf_unary_operatorAccess().getExclamationMarkExclamationMarkKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalTPTP.g:4572:3: kw= '&'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThf_unary_operatorAccess().getAmpersandKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalTPTP.g:4578:3: kw= '|'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThf_unary_operatorAccess().getVerticalLineKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalTPTP.g:4584:3: kw= '=>'
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
    // $ANTLR end "ruleThf_unary_operator"


    // $ANTLR start "entryRuleThf_binary_operator"
    // InternalTPTP.g:4593:1: entryRuleThf_binary_operator returns [String current=null] : iv_ruleThf_binary_operator= ruleThf_binary_operator EOF ;
    public final String entryRuleThf_binary_operator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleThf_binary_operator = null;


        try {
            // InternalTPTP.g:4593:59: (iv_ruleThf_binary_operator= ruleThf_binary_operator EOF )
            // InternalTPTP.g:4594:2: iv_ruleThf_binary_operator= ruleThf_binary_operator EOF
            {
             newCompositeNode(grammarAccess.getThf_binary_operatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThf_binary_operator=ruleThf_binary_operator();

            state._fsp--;

             current =iv_ruleThf_binary_operator.getText(); 
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
    // $ANTLR end "entryRuleThf_binary_operator"


    // $ANTLR start "ruleThf_binary_operator"
    // InternalTPTP.g:4600:1: ruleThf_binary_operator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '&' | kw= '=>' | kw= '|' | kw= '@' | kw= '=' | kw= '!=' | kw= '<=' | kw= '<=>' | kw= '<~>' ) ;
    public final AntlrDatatypeRuleToken ruleThf_binary_operator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTPTP.g:4606:2: ( (kw= '&' | kw= '=>' | kw= '|' | kw= '@' | kw= '=' | kw= '!=' | kw= '<=' | kw= '<=>' | kw= '<~>' ) )
            // InternalTPTP.g:4607:2: (kw= '&' | kw= '=>' | kw= '|' | kw= '@' | kw= '=' | kw= '!=' | kw= '<=' | kw= '<=>' | kw= '<~>' )
            {
            // InternalTPTP.g:4607:2: (kw= '&' | kw= '=>' | kw= '|' | kw= '@' | kw= '=' | kw= '!=' | kw= '<=' | kw= '<=>' | kw= '<~>' )
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
                    // InternalTPTP.g:4608:3: kw= '&'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThf_binary_operatorAccess().getAmpersandKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:4614:3: kw= '=>'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThf_binary_operatorAccess().getEqualsSignGreaterThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalTPTP.g:4620:3: kw= '|'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThf_binary_operatorAccess().getVerticalLineKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalTPTP.g:4626:3: kw= '@'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThf_binary_operatorAccess().getCommercialAtKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalTPTP.g:4632:3: kw= '='
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThf_binary_operatorAccess().getEqualsSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalTPTP.g:4638:3: kw= '!='
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThf_binary_operatorAccess().getExclamationMarkEqualsSignKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalTPTP.g:4644:3: kw= '<='
                    {
                    kw=(Token)match(input,77,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThf_binary_operatorAccess().getLessThanSignEqualsSignKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalTPTP.g:4650:3: kw= '<=>'
                    {
                    kw=(Token)match(input,78,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getThf_binary_operatorAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalTPTP.g:4656:3: kw= '<~>'
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
    // $ANTLR end "ruleThf_binary_operator"


    // $ANTLR start "entryRuleThf_atom"
    // InternalTPTP.g:4665:1: entryRuleThf_atom returns [EObject current=null] : iv_ruleThf_atom= ruleThf_atom EOF ;
    public final EObject entryRuleThf_atom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThf_atom = null;


        try {
            // InternalTPTP.g:4665:49: (iv_ruleThf_atom= ruleThf_atom EOF )
            // InternalTPTP.g:4666:2: iv_ruleThf_atom= ruleThf_atom EOF
            {
             newCompositeNode(grammarAccess.getThf_atomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThf_atom=ruleThf_atom();

            state._fsp--;

             current =iv_ruleThf_atom; 
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
    // $ANTLR end "entryRuleThf_atom"


    // $ANTLR start "ruleThf_atom"
    // InternalTPTP.g:4672:1: ruleThf_atom returns [EObject current=null] : (this_Thf_constant_0= ruleThf_constant | this_Thf_var_1= ruleThf_var | this_Thf_atom_literal_2= ruleThf_atom_literal ) ;
    public final EObject ruleThf_atom() throws RecognitionException {
        EObject current = null;

        EObject this_Thf_constant_0 = null;

        EObject this_Thf_var_1 = null;

        EObject this_Thf_atom_literal_2 = null;



        	enterRule();

        try {
            // InternalTPTP.g:4678:2: ( (this_Thf_constant_0= ruleThf_constant | this_Thf_var_1= ruleThf_var | this_Thf_atom_literal_2= ruleThf_atom_literal ) )
            // InternalTPTP.g:4679:2: (this_Thf_constant_0= ruleThf_constant | this_Thf_var_1= ruleThf_var | this_Thf_atom_literal_2= ruleThf_atom_literal )
            {
            // InternalTPTP.g:4679:2: (this_Thf_constant_0= ruleThf_constant | this_Thf_var_1= ruleThf_var | this_Thf_atom_literal_2= ruleThf_atom_literal )
            int alt76=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_LOWER_TOKEN:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
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
                    // InternalTPTP.g:4680:3: this_Thf_constant_0= ruleThf_constant
                    {

                    			newCompositeNode(grammarAccess.getThf_atomAccess().getThf_constantParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Thf_constant_0=ruleThf_constant();

                    state._fsp--;


                    			current = this_Thf_constant_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:4689:3: this_Thf_var_1= ruleThf_var
                    {

                    			newCompositeNode(grammarAccess.getThf_atomAccess().getThf_varParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Thf_var_1=ruleThf_var();

                    state._fsp--;


                    			current = this_Thf_var_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTPTP.g:4698:3: this_Thf_atom_literal_2= ruleThf_atom_literal
                    {

                    			newCompositeNode(grammarAccess.getThf_atomAccess().getThf_atom_literalParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Thf_atom_literal_2=ruleThf_atom_literal();

                    state._fsp--;


                    			current = this_Thf_atom_literal_2;
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
    // $ANTLR end "ruleThf_atom"


    // $ANTLR start "entryRuleThf_atom_literal"
    // InternalTPTP.g:4710:1: entryRuleThf_atom_literal returns [EObject current=null] : iv_ruleThf_atom_literal= ruleThf_atom_literal EOF ;
    public final EObject entryRuleThf_atom_literal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThf_atom_literal = null;


        try {
            // InternalTPTP.g:4710:57: (iv_ruleThf_atom_literal= ruleThf_atom_literal EOF )
            // InternalTPTP.g:4711:2: iv_ruleThf_atom_literal= ruleThf_atom_literal EOF
            {
             newCompositeNode(grammarAccess.getThf_atom_literalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThf_atom_literal=ruleThf_atom_literal();

            state._fsp--;

             current =iv_ruleThf_atom_literal; 
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
    // $ANTLR end "entryRuleThf_atom_literal"


    // $ANTLR start "ruleThf_atom_literal"
    // InternalTPTP.g:4717:1: ruleThf_atom_literal returns [EObject current=null] : ( ( (lv_name_0_1= '$true' | lv_name_0_2= '$false' ) ) ) ;
    public final EObject ruleThf_atom_literal() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;


        	enterRule();

        try {
            // InternalTPTP.g:4723:2: ( ( ( (lv_name_0_1= '$true' | lv_name_0_2= '$false' ) ) ) )
            // InternalTPTP.g:4724:2: ( ( (lv_name_0_1= '$true' | lv_name_0_2= '$false' ) ) )
            {
            // InternalTPTP.g:4724:2: ( ( (lv_name_0_1= '$true' | lv_name_0_2= '$false' ) ) )
            // InternalTPTP.g:4725:3: ( (lv_name_0_1= '$true' | lv_name_0_2= '$false' ) )
            {
            // InternalTPTP.g:4725:3: ( (lv_name_0_1= '$true' | lv_name_0_2= '$false' ) )
            // InternalTPTP.g:4726:4: (lv_name_0_1= '$true' | lv_name_0_2= '$false' )
            {
            // InternalTPTP.g:4726:4: (lv_name_0_1= '$true' | lv_name_0_2= '$false' )
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
                    // InternalTPTP.g:4727:5: lv_name_0_1= '$true'
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
                    // InternalTPTP.g:4738:5: lv_name_0_2= '$false'
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
    // $ANTLR end "ruleThf_atom_literal"


    // $ANTLR start "entryRuleThf_constant"
    // InternalTPTP.g:4754:1: entryRuleThf_constant returns [EObject current=null] : iv_ruleThf_constant= ruleThf_constant EOF ;
    public final EObject entryRuleThf_constant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThf_constant = null;


        try {
            // InternalTPTP.g:4754:53: (iv_ruleThf_constant= ruleThf_constant EOF )
            // InternalTPTP.g:4755:2: iv_ruleThf_constant= ruleThf_constant EOF
            {
             newCompositeNode(grammarAccess.getThf_constantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThf_constant=ruleThf_constant();

            state._fsp--;

             current =iv_ruleThf_constant; 
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
    // $ANTLR end "entryRuleThf_constant"


    // $ANTLR start "ruleThf_constant"
    // InternalTPTP.g:4761:1: ruleThf_constant returns [EObject current=null] : ( ( ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_thf_param_2_0= ruleThf_atom ) ) (otherlv_3= ',' ( (lv_thf_param_4_0= ruleThf_atom ) ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleThf_constant() throws RecognitionException {
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
            // InternalTPTP.g:4767:2: ( ( ( ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_thf_param_2_0= ruleThf_atom ) ) (otherlv_3= ',' ( (lv_thf_param_4_0= ruleThf_atom ) ) )* otherlv_5= ')' )? ) )
            // InternalTPTP.g:4768:2: ( ( ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_thf_param_2_0= ruleThf_atom ) ) (otherlv_3= ',' ( (lv_thf_param_4_0= ruleThf_atom ) ) )* otherlv_5= ')' )? )
            {
            // InternalTPTP.g:4768:2: ( ( ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_thf_param_2_0= ruleThf_atom ) ) (otherlv_3= ',' ( (lv_thf_param_4_0= ruleThf_atom ) ) )* otherlv_5= ')' )? )
            // InternalTPTP.g:4769:3: ( ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_thf_param_2_0= ruleThf_atom ) ) (otherlv_3= ',' ( (lv_thf_param_4_0= ruleThf_atom ) ) )* otherlv_5= ')' )?
            {
            // InternalTPTP.g:4769:3: ( ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) )
            // InternalTPTP.g:4770:4: ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) )
            {
            // InternalTPTP.g:4770:4: ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) )
            // InternalTPTP.g:4771:5: (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING )
            {
            // InternalTPTP.g:4771:5: (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RULE_LOWER_TOKEN||(LA78_0>=19 && LA78_0<=24)||LA78_0==34||LA78_0==67) ) {
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
                    // InternalTPTP.g:4772:6: lv_name_0_1= ruleLower_token_and_keyword
                    {

                    						newCompositeNode(grammarAccess.getThf_constantAccess().getNameLower_token_and_keywordParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_name_0_1=ruleLower_token_and_keyword();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getThf_constantRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_0_1,
                    							"it.unibz.inf.tptp.TPTP.Lower_token_and_keyword");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:4788:6: lv_name_0_2= RULE_STRING
                    {
                    lv_name_0_2=(Token)match(input,RULE_STRING,FOLLOW_17); 

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

            // InternalTPTP.g:4805:3: (otherlv_1= '(' ( (lv_thf_param_2_0= ruleThf_atom ) ) (otherlv_3= ',' ( (lv_thf_param_4_0= ruleThf_atom ) ) )* otherlv_5= ')' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==14) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalTPTP.g:4806:4: otherlv_1= '(' ( (lv_thf_param_2_0= ruleThf_atom ) ) (otherlv_3= ',' ( (lv_thf_param_4_0= ruleThf_atom ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_18); 

                    				newLeafNode(otherlv_1, grammarAccess.getThf_constantAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalTPTP.g:4810:4: ( (lv_thf_param_2_0= ruleThf_atom ) )
                    // InternalTPTP.g:4811:5: (lv_thf_param_2_0= ruleThf_atom )
                    {
                    // InternalTPTP.g:4811:5: (lv_thf_param_2_0= ruleThf_atom )
                    // InternalTPTP.g:4812:6: lv_thf_param_2_0= ruleThf_atom
                    {

                    						newCompositeNode(grammarAccess.getThf_constantAccess().getThf_paramThf_atomParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_thf_param_2_0=ruleThf_atom();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getThf_constantRule());
                    						}
                    						add(
                    							current,
                    							"thf_param",
                    							lv_thf_param_2_0,
                    							"it.unibz.inf.tptp.TPTP.Thf_atom");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTPTP.g:4829:4: (otherlv_3= ',' ( (lv_thf_param_4_0= ruleThf_atom ) ) )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==18) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // InternalTPTP.g:4830:5: otherlv_3= ',' ( (lv_thf_param_4_0= ruleThf_atom ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FOLLOW_18); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getThf_constantAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalTPTP.g:4834:5: ( (lv_thf_param_4_0= ruleThf_atom ) )
                    	    // InternalTPTP.g:4835:6: (lv_thf_param_4_0= ruleThf_atom )
                    	    {
                    	    // InternalTPTP.g:4835:6: (lv_thf_param_4_0= ruleThf_atom )
                    	    // InternalTPTP.g:4836:7: lv_thf_param_4_0= ruleThf_atom
                    	    {

                    	    							newCompositeNode(grammarAccess.getThf_constantAccess().getThf_paramThf_atomParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_thf_param_4_0=ruleThf_atom();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getThf_constantRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"thf_param",
                    	    								lv_thf_param_4_0,
                    	    								"it.unibz.inf.tptp.TPTP.Thf_atom");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop79;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,15,FOLLOW_2); 

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
    // $ANTLR end "ruleThf_constant"


    // $ANTLR start "entryRuleThf_var"
    // InternalTPTP.g:4863:1: entryRuleThf_var returns [EObject current=null] : iv_ruleThf_var= ruleThf_var EOF ;
    public final EObject entryRuleThf_var() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThf_var = null;


        try {
            // InternalTPTP.g:4863:48: (iv_ruleThf_var= ruleThf_var EOF )
            // InternalTPTP.g:4864:2: iv_ruleThf_var= ruleThf_var EOF
            {
             newCompositeNode(grammarAccess.getThf_varRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThf_var=ruleThf_var();

            state._fsp--;

             current =iv_ruleThf_var; 
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
    // $ANTLR end "entryRuleThf_var"


    // $ANTLR start "ruleThf_var"
    // InternalTPTP.g:4870:1: ruleThf_var returns [EObject current=null] : ( (lv_name_0_0= RULE_UPPER_TOKEN ) ) ;
    public final EObject ruleThf_var() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalTPTP.g:4876:2: ( ( (lv_name_0_0= RULE_UPPER_TOKEN ) ) )
            // InternalTPTP.g:4877:2: ( (lv_name_0_0= RULE_UPPER_TOKEN ) )
            {
            // InternalTPTP.g:4877:2: ( (lv_name_0_0= RULE_UPPER_TOKEN ) )
            // InternalTPTP.g:4878:3: (lv_name_0_0= RULE_UPPER_TOKEN )
            {
            // InternalTPTP.g:4878:3: (lv_name_0_0= RULE_UPPER_TOKEN )
            // InternalTPTP.g:4879:4: lv_name_0_0= RULE_UPPER_TOKEN
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
    // $ANTLR end "ruleThf_var"


    // $ANTLR start "entryRuleThf_quantifier_expression"
    // InternalTPTP.g:4898:1: entryRuleThf_quantifier_expression returns [EObject current=null] : iv_ruleThf_quantifier_expression= ruleThf_quantifier_expression EOF ;
    public final EObject entryRuleThf_quantifier_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThf_quantifier_expression = null;


        try {
            // InternalTPTP.g:4898:66: (iv_ruleThf_quantifier_expression= ruleThf_quantifier_expression EOF )
            // InternalTPTP.g:4899:2: iv_ruleThf_quantifier_expression= ruleThf_quantifier_expression EOF
            {
             newCompositeNode(grammarAccess.getThf_quantifier_expressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThf_quantifier_expression=ruleThf_quantifier_expression();

            state._fsp--;

             current =iv_ruleThf_quantifier_expression; 
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
    // $ANTLR end "entryRuleThf_quantifier_expression"


    // $ANTLR start "ruleThf_quantifier_expression"
    // InternalTPTP.g:4905:1: ruleThf_quantifier_expression returns [EObject current=null] : ( ( ( (lv_quantifier_0_1= '!' | lv_quantifier_0_2= '?' | lv_quantifier_0_3= '^' ) ) ) otherlv_1= '[' ( (lv_param_2_0= ruleThf_variable_list ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_exp_5_0= ruleThf_expression ) ) ) ;
    public final EObject ruleThf_quantifier_expression() throws RecognitionException {
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
            // InternalTPTP.g:4911:2: ( ( ( ( (lv_quantifier_0_1= '!' | lv_quantifier_0_2= '?' | lv_quantifier_0_3= '^' ) ) ) otherlv_1= '[' ( (lv_param_2_0= ruleThf_variable_list ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_exp_5_0= ruleThf_expression ) ) ) )
            // InternalTPTP.g:4912:2: ( ( ( (lv_quantifier_0_1= '!' | lv_quantifier_0_2= '?' | lv_quantifier_0_3= '^' ) ) ) otherlv_1= '[' ( (lv_param_2_0= ruleThf_variable_list ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_exp_5_0= ruleThf_expression ) ) )
            {
            // InternalTPTP.g:4912:2: ( ( ( (lv_quantifier_0_1= '!' | lv_quantifier_0_2= '?' | lv_quantifier_0_3= '^' ) ) ) otherlv_1= '[' ( (lv_param_2_0= ruleThf_variable_list ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_exp_5_0= ruleThf_expression ) ) )
            // InternalTPTP.g:4913:3: ( ( (lv_quantifier_0_1= '!' | lv_quantifier_0_2= '?' | lv_quantifier_0_3= '^' ) ) ) otherlv_1= '[' ( (lv_param_2_0= ruleThf_variable_list ) ) otherlv_3= ']' otherlv_4= ':' ( (lv_exp_5_0= ruleThf_expression ) )
            {
            // InternalTPTP.g:4913:3: ( ( (lv_quantifier_0_1= '!' | lv_quantifier_0_2= '?' | lv_quantifier_0_3= '^' ) ) )
            // InternalTPTP.g:4914:4: ( (lv_quantifier_0_1= '!' | lv_quantifier_0_2= '?' | lv_quantifier_0_3= '^' ) )
            {
            // InternalTPTP.g:4914:4: ( (lv_quantifier_0_1= '!' | lv_quantifier_0_2= '?' | lv_quantifier_0_3= '^' ) )
            // InternalTPTP.g:4915:5: (lv_quantifier_0_1= '!' | lv_quantifier_0_2= '?' | lv_quantifier_0_3= '^' )
            {
            // InternalTPTP.g:4915:5: (lv_quantifier_0_1= '!' | lv_quantifier_0_2= '?' | lv_quantifier_0_3= '^' )
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
                    // InternalTPTP.g:4916:6: lv_quantifier_0_1= '!'
                    {
                    lv_quantifier_0_1=(Token)match(input,28,FOLLOW_20); 

                    						newLeafNode(lv_quantifier_0_1, grammarAccess.getThf_quantifier_expressionAccess().getQuantifierExclamationMarkKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getThf_quantifier_expressionRule());
                    						}
                    						setWithLastConsumed(current, "quantifier", lv_quantifier_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:4927:6: lv_quantifier_0_2= '?'
                    {
                    lv_quantifier_0_2=(Token)match(input,29,FOLLOW_20); 

                    						newLeafNode(lv_quantifier_0_2, grammarAccess.getThf_quantifier_expressionAccess().getQuantifierQuestionMarkKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getThf_quantifier_expressionRule());
                    						}
                    						setWithLastConsumed(current, "quantifier", lv_quantifier_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalTPTP.g:4938:6: lv_quantifier_0_3= '^'
                    {
                    lv_quantifier_0_3=(Token)match(input,80,FOLLOW_20); 

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

            otherlv_1=(Token)match(input,30,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getThf_quantifier_expressionAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalTPTP.g:4955:3: ( (lv_param_2_0= ruleThf_variable_list ) )
            // InternalTPTP.g:4956:4: (lv_param_2_0= ruleThf_variable_list )
            {
            // InternalTPTP.g:4956:4: (lv_param_2_0= ruleThf_variable_list )
            // InternalTPTP.g:4957:5: lv_param_2_0= ruleThf_variable_list
            {

            					newCompositeNode(grammarAccess.getThf_quantifier_expressionAccess().getParamThf_variable_listParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_param_2_0=ruleThf_variable_list();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getThf_quantifier_expressionRule());
            					}
            					set(
            						current,
            						"param",
            						lv_param_2_0,
            						"it.unibz.inf.tptp.TPTP.Thf_variable_list");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getThf_quantifier_expressionAccess().getRightSquareBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,32,FOLLOW_38); 

            			newLeafNode(otherlv_4, grammarAccess.getThf_quantifier_expressionAccess().getColonKeyword_4());
            		
            // InternalTPTP.g:4982:3: ( (lv_exp_5_0= ruleThf_expression ) )
            // InternalTPTP.g:4983:4: (lv_exp_5_0= ruleThf_expression )
            {
            // InternalTPTP.g:4983:4: (lv_exp_5_0= ruleThf_expression )
            // InternalTPTP.g:4984:5: lv_exp_5_0= ruleThf_expression
            {

            					newCompositeNode(grammarAccess.getThf_quantifier_expressionAccess().getExpThf_expressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_5_0=ruleThf_expression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getThf_quantifier_expressionRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_5_0,
            						"it.unibz.inf.tptp.TPTP.Thf_expression");
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
    // $ANTLR end "ruleThf_quantifier_expression"


    // $ANTLR start "entryRuleThf_variable_list"
    // InternalTPTP.g:5005:1: entryRuleThf_variable_list returns [EObject current=null] : iv_ruleThf_variable_list= ruleThf_variable_list EOF ;
    public final EObject entryRuleThf_variable_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThf_variable_list = null;


        try {
            // InternalTPTP.g:5005:58: (iv_ruleThf_variable_list= ruleThf_variable_list EOF )
            // InternalTPTP.g:5006:2: iv_ruleThf_variable_list= ruleThf_variable_list EOF
            {
             newCompositeNode(grammarAccess.getThf_variable_listRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThf_variable_list=ruleThf_variable_list();

            state._fsp--;

             current =iv_ruleThf_variable_list; 
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
    // $ANTLR end "entryRuleThf_variable_list"


    // $ANTLR start "ruleThf_variable_list"
    // InternalTPTP.g:5012:1: ruleThf_variable_list returns [EObject current=null] : ( ( (lv_params_0_0= ruleThf_var_declaration ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleThf_var_declaration ) ) )* ) ;
    public final EObject ruleThf_variable_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_params_0_0 = null;

        EObject lv_params_2_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:5018:2: ( ( ( (lv_params_0_0= ruleThf_var_declaration ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleThf_var_declaration ) ) )* ) )
            // InternalTPTP.g:5019:2: ( ( (lv_params_0_0= ruleThf_var_declaration ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleThf_var_declaration ) ) )* )
            {
            // InternalTPTP.g:5019:2: ( ( (lv_params_0_0= ruleThf_var_declaration ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleThf_var_declaration ) ) )* )
            // InternalTPTP.g:5020:3: ( (lv_params_0_0= ruleThf_var_declaration ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleThf_var_declaration ) ) )*
            {
            // InternalTPTP.g:5020:3: ( (lv_params_0_0= ruleThf_var_declaration ) )
            // InternalTPTP.g:5021:4: (lv_params_0_0= ruleThf_var_declaration )
            {
            // InternalTPTP.g:5021:4: (lv_params_0_0= ruleThf_var_declaration )
            // InternalTPTP.g:5022:5: lv_params_0_0= ruleThf_var_declaration
            {

            					newCompositeNode(grammarAccess.getThf_variable_listAccess().getParamsThf_var_declarationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_24);
            lv_params_0_0=ruleThf_var_declaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getThf_variable_listRule());
            					}
            					add(
            						current,
            						"params",
            						lv_params_0_0,
            						"it.unibz.inf.tptp.TPTP.Thf_var_declaration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTPTP.g:5039:3: (otherlv_1= ',' ( (lv_params_2_0= ruleThf_var_declaration ) ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==18) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // InternalTPTP.g:5040:4: otherlv_1= ',' ( (lv_params_2_0= ruleThf_var_declaration ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_21); 

            	    				newLeafNode(otherlv_1, grammarAccess.getThf_variable_listAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalTPTP.g:5044:4: ( (lv_params_2_0= ruleThf_var_declaration ) )
            	    // InternalTPTP.g:5045:5: (lv_params_2_0= ruleThf_var_declaration )
            	    {
            	    // InternalTPTP.g:5045:5: (lv_params_2_0= ruleThf_var_declaration )
            	    // InternalTPTP.g:5046:6: lv_params_2_0= ruleThf_var_declaration
            	    {

            	    						newCompositeNode(grammarAccess.getThf_variable_listAccess().getParamsThf_var_declarationParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_params_2_0=ruleThf_var_declaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getThf_variable_listRule());
            	    						}
            	    						add(
            	    							current,
            	    							"params",
            	    							lv_params_2_0,
            	    							"it.unibz.inf.tptp.TPTP.Thf_var_declaration");
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
    // $ANTLR end "ruleThf_variable_list"


    // $ANTLR start "entryRuleThf_var_declaration"
    // InternalTPTP.g:5068:1: entryRuleThf_var_declaration returns [EObject current=null] : iv_ruleThf_var_declaration= ruleThf_var_declaration EOF ;
    public final EObject entryRuleThf_var_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThf_var_declaration = null;


        try {
            // InternalTPTP.g:5068:60: (iv_ruleThf_var_declaration= ruleThf_var_declaration EOF )
            // InternalTPTP.g:5069:2: iv_ruleThf_var_declaration= ruleThf_var_declaration EOF
            {
             newCompositeNode(grammarAccess.getThf_var_declarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThf_var_declaration=ruleThf_var_declaration();

            state._fsp--;

             current =iv_ruleThf_var_declaration; 
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
    // $ANTLR end "entryRuleThf_var_declaration"


    // $ANTLR start "ruleThf_var_declaration"
    // InternalTPTP.g:5075:1: ruleThf_var_declaration returns [EObject current=null] : ( ( (lv_var_0_0= ruleThf_var ) ) otherlv_1= ':' ( (lv_vartype_2_0= ruleThf_type_expression ) ) ) ;
    public final EObject ruleThf_var_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_var_0_0 = null;

        EObject lv_vartype_2_0 = null;



        	enterRule();

        try {
            // InternalTPTP.g:5081:2: ( ( ( (lv_var_0_0= ruleThf_var ) ) otherlv_1= ':' ( (lv_vartype_2_0= ruleThf_type_expression ) ) ) )
            // InternalTPTP.g:5082:2: ( ( (lv_var_0_0= ruleThf_var ) ) otherlv_1= ':' ( (lv_vartype_2_0= ruleThf_type_expression ) ) )
            {
            // InternalTPTP.g:5082:2: ( ( (lv_var_0_0= ruleThf_var ) ) otherlv_1= ':' ( (lv_vartype_2_0= ruleThf_type_expression ) ) )
            // InternalTPTP.g:5083:3: ( (lv_var_0_0= ruleThf_var ) ) otherlv_1= ':' ( (lv_vartype_2_0= ruleThf_type_expression ) )
            {
            // InternalTPTP.g:5083:3: ( (lv_var_0_0= ruleThf_var ) )
            // InternalTPTP.g:5084:4: (lv_var_0_0= ruleThf_var )
            {
            // InternalTPTP.g:5084:4: (lv_var_0_0= ruleThf_var )
            // InternalTPTP.g:5085:5: lv_var_0_0= ruleThf_var
            {

            					newCompositeNode(grammarAccess.getThf_var_declarationAccess().getVarThf_varParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_23);
            lv_var_0_0=ruleThf_var();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getThf_var_declarationRule());
            					}
            					set(
            						current,
            						"var",
            						lv_var_0_0,
            						"it.unibz.inf.tptp.TPTP.Thf_var");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getThf_var_declarationAccess().getColonKeyword_1());
            		
            // InternalTPTP.g:5106:3: ( (lv_vartype_2_0= ruleThf_type_expression ) )
            // InternalTPTP.g:5107:4: (lv_vartype_2_0= ruleThf_type_expression )
            {
            // InternalTPTP.g:5107:4: (lv_vartype_2_0= ruleThf_type_expression )
            // InternalTPTP.g:5108:5: lv_vartype_2_0= ruleThf_type_expression
            {

            					newCompositeNode(grammarAccess.getThf_var_declarationAccess().getVartypeThf_type_expressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_vartype_2_0=ruleThf_type_expression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getThf_var_declarationRule());
            					}
            					set(
            						current,
            						"vartype",
            						lv_vartype_2_0,
            						"it.unibz.inf.tptp.TPTP.Thf_type_expression");
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
    // $ANTLR end "ruleThf_var_declaration"


    // $ANTLR start "entryRuleBinary_operator"
    // InternalTPTP.g:5129:1: entryRuleBinary_operator returns [String current=null] : iv_ruleBinary_operator= ruleBinary_operator EOF ;
    public final String entryRuleBinary_operator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinary_operator = null;


        try {
            // InternalTPTP.g:5129:55: (iv_ruleBinary_operator= ruleBinary_operator EOF )
            // InternalTPTP.g:5130:2: iv_ruleBinary_operator= ruleBinary_operator EOF
            {
             newCompositeNode(grammarAccess.getBinary_operatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinary_operator=ruleBinary_operator();

            state._fsp--;

             current =iv_ruleBinary_operator.getText(); 
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
    // $ANTLR end "entryRuleBinary_operator"


    // $ANTLR start "ruleBinary_operator"
    // InternalTPTP.g:5136:1: ruleBinary_operator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!=' | kw= '=' | kw= '|' | kw= '&' | kw= '=>' | kw= '<=>' | kw= '<=' | kw= '<~>' | kw= '~|' | kw= '~&' ) ;
    public final AntlrDatatypeRuleToken ruleBinary_operator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTPTP.g:5142:2: ( (kw= '!=' | kw= '=' | kw= '|' | kw= '&' | kw= '=>' | kw= '<=>' | kw= '<=' | kw= '<~>' | kw= '~|' | kw= '~&' ) )
            // InternalTPTP.g:5143:2: (kw= '!=' | kw= '=' | kw= '|' | kw= '&' | kw= '=>' | kw= '<=>' | kw= '<=' | kw= '<~>' | kw= '~|' | kw= '~&' )
            {
            // InternalTPTP.g:5143:2: (kw= '!=' | kw= '=' | kw= '|' | kw= '&' | kw= '=>' | kw= '<=>' | kw= '<=' | kw= '<~>' | kw= '~|' | kw= '~&' )
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
                    // InternalTPTP.g:5144:3: kw= '!='
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinary_operatorAccess().getExclamationMarkEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:5150:3: kw= '='
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinary_operatorAccess().getEqualsSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalTPTP.g:5156:3: kw= '|'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinary_operatorAccess().getVerticalLineKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalTPTP.g:5162:3: kw= '&'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinary_operatorAccess().getAmpersandKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalTPTP.g:5168:3: kw= '=>'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinary_operatorAccess().getEqualsSignGreaterThanSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalTPTP.g:5174:3: kw= '<=>'
                    {
                    kw=(Token)match(input,78,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinary_operatorAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalTPTP.g:5180:3: kw= '<='
                    {
                    kw=(Token)match(input,77,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinary_operatorAccess().getLessThanSignEqualsSignKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalTPTP.g:5186:3: kw= '<~>'
                    {
                    kw=(Token)match(input,79,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinary_operatorAccess().getLessThanSignTildeGreaterThanSignKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalTPTP.g:5192:3: kw= '~|'
                    {
                    kw=(Token)match(input,81,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinary_operatorAccess().getTildeVerticalLineKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalTPTP.g:5198:3: kw= '~&'
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
    // $ANTLR end "ruleBinary_operator"


    // $ANTLR start "entryRuleLower_token_and_keyword"
    // InternalTPTP.g:5207:1: entryRuleLower_token_and_keyword returns [String current=null] : iv_ruleLower_token_and_keyword= ruleLower_token_and_keyword EOF ;
    public final String entryRuleLower_token_and_keyword() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLower_token_and_keyword = null;


        try {
            // InternalTPTP.g:5207:63: (iv_ruleLower_token_and_keyword= ruleLower_token_and_keyword EOF )
            // InternalTPTP.g:5208:2: iv_ruleLower_token_and_keyword= ruleLower_token_and_keyword EOF
            {
             newCompositeNode(grammarAccess.getLower_token_and_keywordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLower_token_and_keyword=ruleLower_token_and_keyword();

            state._fsp--;

             current =iv_ruleLower_token_and_keyword.getText(); 
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
    // $ANTLR end "entryRuleLower_token_and_keyword"


    // $ANTLR start "ruleLower_token_and_keyword"
    // InternalTPTP.g:5214:1: ruleLower_token_and_keyword returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'axiom' | kw= 'hypothesis' | kw= 'negated_conjecture' | kw= 'conjecture' | kw= 'definition' | kw= 'lemma' | kw= 'type' | kw= 'plain' | this_LOWER_TOKEN_8= RULE_LOWER_TOKEN ) ;
    public final AntlrDatatypeRuleToken ruleLower_token_and_keyword() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_LOWER_TOKEN_8=null;


        	enterRule();

        try {
            // InternalTPTP.g:5220:2: ( (kw= 'axiom' | kw= 'hypothesis' | kw= 'negated_conjecture' | kw= 'conjecture' | kw= 'definition' | kw= 'lemma' | kw= 'type' | kw= 'plain' | this_LOWER_TOKEN_8= RULE_LOWER_TOKEN ) )
            // InternalTPTP.g:5221:2: (kw= 'axiom' | kw= 'hypothesis' | kw= 'negated_conjecture' | kw= 'conjecture' | kw= 'definition' | kw= 'lemma' | kw= 'type' | kw= 'plain' | this_LOWER_TOKEN_8= RULE_LOWER_TOKEN )
            {
            // InternalTPTP.g:5221:2: (kw= 'axiom' | kw= 'hypothesis' | kw= 'negated_conjecture' | kw= 'conjecture' | kw= 'definition' | kw= 'lemma' | kw= 'type' | kw= 'plain' | this_LOWER_TOKEN_8= RULE_LOWER_TOKEN )
            int alt84=9;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt84=1;
                }
                break;
            case 20:
                {
                alt84=2;
                }
                break;
            case 21:
                {
                alt84=3;
                }
                break;
            case 22:
                {
                alt84=4;
                }
                break;
            case 23:
                {
                alt84=5;
                }
                break;
            case 24:
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
                    // InternalTPTP.g:5222:3: kw= 'axiom'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLower_token_and_keywordAccess().getAxiomKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTPTP.g:5228:3: kw= 'hypothesis'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLower_token_and_keywordAccess().getHypothesisKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalTPTP.g:5234:3: kw= 'negated_conjecture'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLower_token_and_keywordAccess().getNegated_conjectureKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalTPTP.g:5240:3: kw= 'conjecture'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLower_token_and_keywordAccess().getConjectureKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalTPTP.g:5246:3: kw= 'definition'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLower_token_and_keywordAccess().getDefinitionKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalTPTP.g:5252:3: kw= 'lemma'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLower_token_and_keywordAccess().getLemmaKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalTPTP.g:5258:3: kw= 'type'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLower_token_and_keywordAccess().getTypeKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalTPTP.g:5264:3: kw= 'plain'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLower_token_and_keywordAccess().getPlainKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalTPTP.g:5270:3: this_LOWER_TOKEN_8= RULE_LOWER_TOKEN
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
    // $ANTLR end "ruleLower_token_and_keyword"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA72 dfa72 = new DFA72(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\3\12\uffff";
    static final String dfa_3s = "\1\15\1\uffff\1\16\4\uffff\1\4\1\17\1\20\1\uffff";
    static final String dfa_4s = "\1\107\1\uffff\1\16\4\uffff\1\4\1\17\1\20\1\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\uffff\1\1\1\2\1\3\1\4\3\uffff\1\1";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\3\uffff\1\1\17\uffff\1\4\40\uffff\1\5\4\uffff\1\6",
            "",
            "\1\7",
            "",
            "",
            "",
            "",
            "\1\10",
            "\1\11",
            "\1\12",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "98:3: ( ( (lv_TPTP_input_1_0= ruleFof_input ) )* | ( (lv_TPTP_input_2_0= ruleTff_input ) )* | ( (lv_TPTP_input_3_0= ruleCnf_input ) )* | ( (lv_TPTP_input_4_0= ruleThf_input ) )* )";
        }
    }
    static final String dfa_8s = "\14\uffff";
    static final String dfa_9s = "\1\1\13\uffff";
    static final String dfa_10s = "\1\17\13\uffff";
    static final String dfa_11s = "\1\122\13\uffff";
    static final String dfa_12s = "\1\uffff\1\2\12\1";
    static final String dfa_13s = "\14\uffff}>";
    static final String[] dfa_14s = {
            "\1\1\64\uffff\1\4\1\3\1\2\4\uffff\1\5\1\6\1\10\1\7\1\11\1\uffff\1\12\1\13",
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

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()* loopback of 464:3: ( () ( (lv_op_2_0= ruleBinary_operator ) ) ( (lv_right_3_0= ruleFof_terminating_expression ) ) )*";
        }
    }
    static final String dfa_15s = "\20\uffff";
    static final String dfa_16s = "\1\41\1\16\1\4\12\22\1\23\2\uffff";
    static final String dfa_17s = "\1\41\1\16\1\103\12\22\1\42\2\uffff";
    static final String dfa_18s = "\16\uffff\1\1\1\2";
    static final String dfa_19s = "\20\uffff}>";
    static final String[] dfa_20s = {
            "\1\1",
            "\1\2",
            "\1\14\1\uffff\1\13\14\uffff\1\3\1\4\1\5\1\6\1\7\1\10\11\uffff\1\11\40\uffff\1\12",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\6\16\11\uffff\1\17",
            "",
            ""
    };

    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_15;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "1070:2: ( (otherlv_0= 'tff' otherlv_1= '(' ( ( (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING ) ) ) otherlv_3= ',' ( ( (lv_formula_role_4_1= 'axiom' | lv_formula_role_4_2= 'hypothesis' | lv_formula_role_4_3= 'negated_conjecture' | lv_formula_role_4_4= 'conjecture' | lv_formula_role_4_5= 'definition' | lv_formula_role_4_6= 'lemma' ) ) ) otherlv_5= ',' ( (lv_exp_6_0= ruleTff_expression ) ) otherlv_7= ')' otherlv_8= '.' ) | (otherlv_9= 'tff' otherlv_10= '(' ( ( (lv_name_11_1= ruleLower_token_and_keyword | lv_name_11_2= RULE_STRING ) ) ) otherlv_12= ',' ( (lv_formula_role_13_0= 'type' ) ) otherlv_14= ',' ( (lv_def_15_0= ruleTff_formula_type_definition ) ) otherlv_16= ')' otherlv_17= '.' ) )";
        }
    }
    static final String[] dfa_21s = {
            "\1\1\2\uffff\1\1\61\uffff\1\4\1\3\1\2\4\uffff\1\5\1\6\1\10\1\7\1\11\1\uffff\1\12\1\13",
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
    static final short[][] dfa_21 = unpackEncodedStringArray(dfa_21s);

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_21;
        }
        public String getDescription() {
            return "()* loopback of 1837:3: ( () ( (lv_op_2_0= ruleBinary_operator ) ) ( (lv_right_3_0= ruleTff_terminating_expression ) ) )*";
        }
    }
    static final String dfa_22s = "\1\uffff\11\12\2\uffff";
    static final String dfa_23s = "\1\4\11\16\2\uffff";
    static final String dfa_24s = "\1\103\11\122\2\uffff";
    static final String dfa_25s = "\12\uffff\1\1\1\2";
    static final String[] dfa_26s = {
            "\1\12\1\uffff\1\11\14\uffff\1\1\1\2\1\3\1\4\1\5\1\6\11\uffff\1\7\40\uffff\1\10",
            "\2\12\2\uffff\1\12\30\uffff\1\13\30\uffff\3\12\4\uffff\5\12\1\uffff\2\12",
            "\2\12\2\uffff\1\12\30\uffff\1\13\30\uffff\3\12\4\uffff\5\12\1\uffff\2\12",
            "\2\12\2\uffff\1\12\30\uffff\1\13\30\uffff\3\12\4\uffff\5\12\1\uffff\2\12",
            "\2\12\2\uffff\1\12\30\uffff\1\13\30\uffff\3\12\4\uffff\5\12\1\uffff\2\12",
            "\2\12\2\uffff\1\12\30\uffff\1\13\30\uffff\3\12\4\uffff\5\12\1\uffff\2\12",
            "\2\12\2\uffff\1\12\30\uffff\1\13\30\uffff\3\12\4\uffff\5\12\1\uffff\2\12",
            "\2\12\2\uffff\1\12\30\uffff\1\13\30\uffff\3\12\4\uffff\5\12\1\uffff\2\12",
            "\2\12\2\uffff\1\12\30\uffff\1\13\30\uffff\3\12\4\uffff\5\12\1\uffff\2\12",
            "\2\12\2\uffff\1\12\30\uffff\1\13\30\uffff\3\12\4\uffff\5\12\1\uffff\2\12",
            "",
            ""
    };
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = dfa_8;
            this.eof = dfa_22;
            this.min = dfa_23;
            this.max = dfa_24;
            this.accept = dfa_25;
            this.special = dfa_13;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "2078:2: ( ( ( ( (lv_name_0_1= ruleLower_token_and_keyword | lv_name_0_2= RULE_STRING ) ) ) (otherlv_1= '(' ( (lv_param_2_0= ruleTff_atom ) ) (otherlv_3= ',' ( (lv_param_4_0= ruleTff_atom ) ) )* otherlv_5= ')' )? ) | ( ( (lv_top_6_0= ruleLower_token_and_keyword ) ) ( (lv_name_7_0= '/' ) ) ( (lv_bottom_8_0= ruleLower_token_and_keyword ) ) ) )";
        }
    }
    static final String dfa_27s = "\1\107\1\16\1\4\12\22\1\23\2\uffff";
    static final String dfa_28s = "\1\107\1\16\1\103\12\22\1\42\2\uffff";
    static final String dfa_29s = "\16\uffff\1\2\1\1";
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = dfa_15;
            this.eof = dfa_15;
            this.min = dfa_27;
            this.max = dfa_28;
            this.accept = dfa_29;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "3700:2: ( (otherlv_0= 'thf' otherlv_1= '(' ( ( (lv_name_2_1= ruleLower_token_and_keyword | lv_name_2_2= RULE_STRING ) ) ) otherlv_3= ',' ( (lv_formula_role_4_0= 'type' ) ) otherlv_5= ',' ( (lv_def_6_0= ruleThf_formula_type_definition ) ) otherlv_7= ')' otherlv_8= '.' ) | (otherlv_9= 'thf' otherlv_10= '(' ( ( (lv_name_11_1= ruleLower_token_and_keyword | lv_name_11_2= RULE_STRING ) ) ) otherlv_12= ',' ( ( (lv_formula_role_13_1= 'axiom' | lv_formula_role_13_2= 'hypothesis' | lv_formula_role_13_3= 'negated_conjecture' | lv_formula_role_13_4= 'conjecture' | lv_formula_role_13_5= 'definition' | lv_formula_role_13_6= 'lemma' ) ) ) otherlv_14= ',' ( (lv_thf_exp_15_0= ruleThf_expression ) ) otherlv_16= ')' otherlv_17= '.' ) )";
        }
    }
    static final String dfa_30s = "\1\1\12\uffff";
    static final String dfa_31s = "\1\17\12\uffff";
    static final String dfa_32s = "\1\117\12\uffff";
    static final String dfa_33s = "\1\uffff\1\2\11\1";
    static final String[] dfa_34s = {
            "\1\1\64\uffff\1\4\1\6\1\7\1\uffff\1\5\2\uffff\1\2\1\3\1\10\1\11\1\12",
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
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final char[] dfa_31 = DFA.unpackEncodedStringToUnsignedChars(dfa_31s);
    static final char[] dfa_32 = DFA.unpackEncodedStringToUnsignedChars(dfa_32s);
    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final short[][] dfa_34 = unpackEncodedStringArray(dfa_34s);

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = dfa_1;
            this.eof = dfa_30;
            this.min = dfa_31;
            this.max = dfa_32;
            this.accept = dfa_33;
            this.special = dfa_6;
            this.transition = dfa_34;
        }
        public String getDescription() {
            return "()* loopback of 4334:3: ( () ( (lv_op_2_0= ruleThf_binary_operator ) ) ( (lv_right_3_0= ruleThf_terminating_expression ) ) )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000200022002L,0x0000000000000084L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000022002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000200022002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000022002L,0x0000000000000004L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000022002L,0x0000000000000080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000401F80050L,0x0000000000000008L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001F80000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000043FF84070L,0x0000000000000008L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000002L,0x000000000006F870L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000040DF80070L,0x0000000000000008L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0xFFFFF0043FF84070L,0x0000000000000009L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000401F84050L,0x0000000000000008L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000007E401F84070L,0x000000000000000AL});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000007E401F80070L,0x0000000000000008L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0xFFFFF0040DF80070L,0x0000000000000009L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000401F80040L,0x0000000000000008L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000380000L,0x0000000000000008L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000000040FF84070L,0x0000000000000008L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000000043FF84070L,0x0000000000011F18L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000000E401F84050L,0x0000000000000008L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000002L,0x000000000000F970L});

}