package org.cloudsmith.geppetto.pp.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.cloudsmith.geppetto.pp.dsl.services.PPGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalPPParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_62", "KEYWORD_61", "KEYWORD_59", "KEYWORD_60", "KEYWORD_55", "KEYWORD_56", "KEYWORD_57", "KEYWORD_58", "KEYWORD_51", "KEYWORD_52", "KEYWORD_53", "KEYWORD_54", "KEYWORD_47", "KEYWORD_48", "KEYWORD_49", "KEYWORD_50", "KEYWORD_22", "KEYWORD_23", "KEYWORD_24", "KEYWORD_25", "KEYWORD_26", "KEYWORD_27", "KEYWORD_28", "KEYWORD_29", "KEYWORD_30", "KEYWORD_31", "KEYWORD_32", "KEYWORD_33", "KEYWORD_34", "KEYWORD_35", "KEYWORD_36", "KEYWORD_37", "KEYWORD_38", "KEYWORD_39", "KEYWORD_40", "KEYWORD_41", "KEYWORD_42", "KEYWORD_43", "KEYWORD_44", "KEYWORD_45", "KEYWORD_46", "KEYWORD_1", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "KEYWORD_5", "KEYWORD_6", "KEYWORD_7", "KEYWORD_8", "KEYWORD_9", "KEYWORD_10", "KEYWORD_11", "KEYWORD_12", "KEYWORD_13", "KEYWORD_14", "KEYWORD_15", "KEYWORD_16", "KEYWORD_17", "KEYWORD_18", "KEYWORD_19", "KEYWORD_20", "KEYWORD_21", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_DOLLAR_VAR", "RULE_WORD_CHARS", "RULE_RE_BODY", "RULE_RE_FLAGS", "RULE_REGULAR_EXPRESSION", "RULE_RE_FIRST_CHAR", "RULE_RE_FOLLOW_CHAR", "RULE_RE_BACKSLASH_SEQUENCE", "RULE_ANY_OTHER"
    };
    public static final int RULE_REGULAR_EXPRESSION=73;
    public static final int RULE_ANY_OTHER=77;
    public static final int RULE_RE_FLAGS=72;
    public static final int KEYWORD_56=9;
    public static final int KEYWORD_19=63;
    public static final int KEYWORD_55=8;
    public static final int KEYWORD_54=15;
    public static final int KEYWORD_17=61;
    public static final int KEYWORD_53=14;
    public static final int KEYWORD_18=62;
    public static final int RULE_RE_FOLLOW_CHAR=75;
    public static final int KEYWORD_52=13;
    public static final int KEYWORD_15=59;
    public static final int KEYWORD_51=12;
    public static final int KEYWORD_16=60;
    public static final int KEYWORD_13=57;
    public static final int KEYWORD_50=19;
    public static final int KEYWORD_14=58;
    public static final int KEYWORD_11=55;
    public static final int EOF=-1;
    public static final int KEYWORD_12=56;
    public static final int KEYWORD_10=54;
    public static final int KEYWORD_59=6;
    public static final int KEYWORD_58=11;
    public static final int KEYWORD_57=10;
    public static final int KEYWORD_6=50;
    public static final int KEYWORD_7=51;
    public static final int KEYWORD_8=52;
    public static final int KEYWORD_9=53;
    public static final int KEYWORD_28=26;
    public static final int KEYWORD_29=27;
    public static final int KEYWORD_61=5;
    public static final int KEYWORD_24=22;
    public static final int KEYWORD_60=7;
    public static final int KEYWORD_25=23;
    public static final int KEYWORD_26=24;
    public static final int RULE_RE_FIRST_CHAR=74;
    public static final int KEYWORD_62=4;
    public static final int KEYWORD_27=25;
    public static final int KEYWORD_20=64;
    public static final int KEYWORD_21=65;
    public static final int KEYWORD_22=20;
    public static final int KEYWORD_23=21;
    public static final int RULE_RE_BACKSLASH_SEQUENCE=76;
    public static final int KEYWORD_30=28;
    public static final int KEYWORD_1=45;
    public static final int KEYWORD_34=32;
    public static final int KEYWORD_5=49;
    public static final int KEYWORD_33=31;
    public static final int KEYWORD_4=48;
    public static final int RULE_WORD_CHARS=70;
    public static final int KEYWORD_32=30;
    public static final int KEYWORD_3=47;
    public static final int KEYWORD_31=29;
    public static final int KEYWORD_2=46;
    public static final int KEYWORD_38=36;
    public static final int KEYWORD_37=35;
    public static final int RULE_SL_COMMENT=67;
    public static final int RULE_RE_BODY=71;
    public static final int KEYWORD_36=34;
    public static final int KEYWORD_35=33;
    public static final int RULE_ML_COMMENT=66;
    public static final int KEYWORD_39=37;
    public static final int KEYWORD_41=39;
    public static final int KEYWORD_40=38;
    public static final int KEYWORD_43=41;
    public static final int KEYWORD_42=40;
    public static final int KEYWORD_45=43;
    public static final int KEYWORD_44=42;
    public static final int KEYWORD_47=16;
    public static final int RULE_WS=68;
    public static final int KEYWORD_46=44;
    public static final int KEYWORD_49=18;
    public static final int KEYWORD_48=17;
    public static final int RULE_DOLLAR_VAR=69;

    // delegates
    // delegators


        public InternalPPParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPPParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPPParser.tokenNames; }
    public String getGrammarFileName() { return "../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     

    	private PPGrammarAccess grammarAccess;
    	 	
    	public InternalPPParser(TokenStream input, PPGrammarAccess grammarAccess) {
    		this(input);
    		this.grammarAccess = grammarAccess;
    		registerRules(grammarAccess.getGrammar());
    	}
    	
    	@Override
    	protected String getFirstRuleName() {
    		return "PuppetManifest";	
    	} 
    	   	   	
    	@Override
    	protected PPGrammarAccess getGrammarAccess() {
    		return grammarAccess;
    	}



    // $ANTLR start "entryRulePuppetManifest"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:67:1: entryRulePuppetManifest returns [EObject current=null] : iv_rulePuppetManifest= rulePuppetManifest EOF ;
    public final EObject entryRulePuppetManifest() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePuppetManifest = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:68:2: (iv_rulePuppetManifest= rulePuppetManifest EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:69:2: iv_rulePuppetManifest= rulePuppetManifest EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPuppetManifestRule()); 
            }
            pushFollow(FOLLOW_rulePuppetManifest_in_entryRulePuppetManifest73);
            iv_rulePuppetManifest=rulePuppetManifest();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePuppetManifest; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePuppetManifest83); if (state.failed) return current;

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
    // $ANTLR end "entryRulePuppetManifest"


    // $ANTLR start "rulePuppetManifest"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:76:1: rulePuppetManifest returns [EObject current=null] : ( () ( (lv_statements_1_0= ruleExpressionList ) )* ) ;
    public final EObject rulePuppetManifest() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:79:28: ( ( () ( (lv_statements_1_0= ruleExpressionList ) )* ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:80:1: ( () ( (lv_statements_1_0= ruleExpressionList ) )* )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:80:1: ( () ( (lv_statements_1_0= ruleExpressionList ) )* )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:80:2: () ( (lv_statements_1_0= ruleExpressionList ) )*
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:80:2: ()
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:81:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPuppetManifestAccess().getPuppetManifestAction_0(),
                          current);
                  
            }

            }

            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:89:2: ( (lv_statements_1_0= ruleExpressionList ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=KEYWORD_61 && LA1_0<=KEYWORD_55)||(LA1_0>=KEYWORD_57 && LA1_0<=KEYWORD_51)||(LA1_0>=KEYWORD_53 && LA1_0<=KEYWORD_54)||LA1_0==KEYWORD_24||LA1_0==KEYWORD_42||(LA1_0>=KEYWORD_1 && LA1_0<=KEYWORD_4)||LA1_0==KEYWORD_9||(LA1_0>=KEYWORD_17 && LA1_0<=KEYWORD_18)||LA1_0==KEYWORD_20||(LA1_0>=RULE_DOLLAR_VAR && LA1_0<=RULE_WORD_CHARS)||LA1_0==RULE_REGULAR_EXPRESSION) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:90:1: (lv_statements_1_0= ruleExpressionList )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:90:1: (lv_statements_1_0= ruleExpressionList )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:91:3: lv_statements_1_0= ruleExpressionList
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPuppetManifestAccess().getStatementsExpressionListParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionList_in_rulePuppetManifest141);
            	    lv_statements_1_0=ruleExpressionList();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPuppetManifestRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_1_0, 
            	              		"ExpressionList");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePuppetManifest"


    // $ANTLR start "entryRuleExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:115:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:116:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:117:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression177);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression187); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:124:1: ruleExpression returns [EObject current=null] : this_RelationshipExpression_0= ruleRelationshipExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_RelationshipExpression_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:127:28: (this_RelationshipExpression_0= ruleRelationshipExpression )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:129:2: this_RelationshipExpression_0= ruleRelationshipExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getRelationshipExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleRelationshipExpression_in_ruleExpression236);
            this_RelationshipExpression_0=ruleRelationshipExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_RelationshipExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleExpressionList"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:148:1: entryRuleExpressionList returns [EObject current=null] : iv_ruleExpressionList= ruleExpressionList EOF ;
    public final EObject entryRuleExpressionList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionList = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:149:2: (iv_ruleExpressionList= ruleExpressionList EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:150:2: iv_ruleExpressionList= ruleExpressionList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionListRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionList_in_entryRuleExpressionList269);
            iv_ruleExpressionList=ruleExpressionList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionList279); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionList"


    // $ANTLR start "ruleExpressionList"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:157:1: ruleExpressionList returns [EObject current=null] : (this_RelationshipExpression_0= ruleRelationshipExpression ( () otherlv_2= KEYWORD_8 ( (lv_expressions_3_0= ruleRelationshipExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_expressions_5_0= ruleRelationshipExpression ) ) )* )? ) ;
    public final EObject ruleExpressionList() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_RelationshipExpression_0 = null;

        EObject lv_expressions_3_0 = null;

        EObject lv_expressions_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:160:28: ( (this_RelationshipExpression_0= ruleRelationshipExpression ( () otherlv_2= KEYWORD_8 ( (lv_expressions_3_0= ruleRelationshipExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_expressions_5_0= ruleRelationshipExpression ) ) )* )? ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:161:1: (this_RelationshipExpression_0= ruleRelationshipExpression ( () otherlv_2= KEYWORD_8 ( (lv_expressions_3_0= ruleRelationshipExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_expressions_5_0= ruleRelationshipExpression ) ) )* )? )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:161:1: (this_RelationshipExpression_0= ruleRelationshipExpression ( () otherlv_2= KEYWORD_8 ( (lv_expressions_3_0= ruleRelationshipExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_expressions_5_0= ruleRelationshipExpression ) ) )* )? )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:162:2: this_RelationshipExpression_0= ruleRelationshipExpression ( () otherlv_2= KEYWORD_8 ( (lv_expressions_3_0= ruleRelationshipExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_expressions_5_0= ruleRelationshipExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionListAccess().getRelationshipExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleRelationshipExpression_in_ruleExpressionList329);
            this_RelationshipExpression_0=ruleRelationshipExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_RelationshipExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:173:1: ( () otherlv_2= KEYWORD_8 ( (lv_expressions_3_0= ruleRelationshipExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_expressions_5_0= ruleRelationshipExpression ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==KEYWORD_8) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:173:2: () otherlv_2= KEYWORD_8 ( (lv_expressions_3_0= ruleRelationshipExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_expressions_5_0= ruleRelationshipExpression ) ) )*
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:173:2: ()
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:174:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getExpressionListAccess().getExprListExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleExpressionList354); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getExpressionListAccess().getCommaKeyword_1_1());
                          
                    }
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:187:1: ( (lv_expressions_3_0= ruleRelationshipExpression ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:188:1: (lv_expressions_3_0= ruleRelationshipExpression )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:188:1: (lv_expressions_3_0= ruleRelationshipExpression )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:189:3: lv_expressions_3_0= ruleRelationshipExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionListAccess().getExpressionsRelationshipExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRelationshipExpression_in_ruleExpressionList374);
                    lv_expressions_3_0=ruleRelationshipExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionListRule());
                      	        }
                             		add(
                             			current, 
                             			"expressions",
                              		lv_expressions_3_0, 
                              		"RelationshipExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:205:2: (otherlv_4= KEYWORD_8 ( (lv_expressions_5_0= ruleRelationshipExpression ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==KEYWORD_8) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:206:2: otherlv_4= KEYWORD_8 ( (lv_expressions_5_0= ruleRelationshipExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleExpressionList388); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getExpressionListAccess().getCommaKeyword_1_3_0());
                    	          
                    	    }
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:210:1: ( (lv_expressions_5_0= ruleRelationshipExpression ) )
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:211:1: (lv_expressions_5_0= ruleRelationshipExpression )
                    	    {
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:211:1: (lv_expressions_5_0= ruleRelationshipExpression )
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:212:3: lv_expressions_5_0= ruleRelationshipExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getExpressionListAccess().getExpressionsRelationshipExpressionParserRuleCall_1_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleRelationshipExpression_in_ruleExpressionList408);
                    	    lv_expressions_5_0=ruleRelationshipExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getExpressionListRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"expressions",
                    	              		lv_expressions_5_0, 
                    	              		"RelationshipExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpressionList"


    // $ANTLR start "entryRuleEdgeOperator"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:236:1: entryRuleEdgeOperator returns [String current=null] : iv_ruleEdgeOperator= ruleEdgeOperator EOF ;
    public final String entryRuleEdgeOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEdgeOperator = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:237:1: (iv_ruleEdgeOperator= ruleEdgeOperator EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:238:2: iv_ruleEdgeOperator= ruleEdgeOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEdgeOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleEdgeOperator_in_entryRuleEdgeOperator448);
            iv_ruleEdgeOperator=ruleEdgeOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEdgeOperator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEdgeOperator459); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEdgeOperator"


    // $ANTLR start "ruleEdgeOperator"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:245:1: ruleEdgeOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_27 | kw= KEYWORD_28 | kw= KEYWORD_46 | kw= KEYWORD_32 ) ;
    public final AntlrDatatypeRuleToken ruleEdgeOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:249:6: ( (kw= KEYWORD_27 | kw= KEYWORD_28 | kw= KEYWORD_46 | kw= KEYWORD_32 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:250:1: (kw= KEYWORD_27 | kw= KEYWORD_28 | kw= KEYWORD_46 | kw= KEYWORD_32 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:250:1: (kw= KEYWORD_27 | kw= KEYWORD_28 | kw= KEYWORD_46 | kw= KEYWORD_32 )
            int alt4=4;
            switch ( input.LA(1) ) {
            case KEYWORD_27:
                {
                alt4=1;
                }
                break;
            case KEYWORD_28:
                {
                alt4=2;
                }
                break;
            case KEYWORD_46:
                {
                alt4=3;
                }
                break;
            case KEYWORD_32:
                {
                alt4=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:251:2: kw= KEYWORD_27
                    {
                    kw=(Token)match(input,KEYWORD_27,FOLLOW_KEYWORD_27_in_ruleEdgeOperator497); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEdgeOperatorAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:258:2: kw= KEYWORD_28
                    {
                    kw=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleEdgeOperator516); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEdgeOperatorAccess().getLessThanSignHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:265:2: kw= KEYWORD_46
                    {
                    kw=(Token)match(input,KEYWORD_46,FOLLOW_KEYWORD_46_in_ruleEdgeOperator535); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEdgeOperatorAccess().getTildeGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:272:2: kw= KEYWORD_32
                    {
                    kw=(Token)match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_ruleEdgeOperator554); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEdgeOperatorAccess().getLessThanSignTildeKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
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
    // $ANTLR end "ruleEdgeOperator"


    // $ANTLR start "entryRuleRelationshipExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:285:1: entryRuleRelationshipExpression returns [EObject current=null] : iv_ruleRelationshipExpression= ruleRelationshipExpression EOF ;
    public final EObject entryRuleRelationshipExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationshipExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:286:2: (iv_ruleRelationshipExpression= ruleRelationshipExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:287:2: iv_ruleRelationshipExpression= ruleRelationshipExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationshipExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleRelationshipExpression_in_entryRuleRelationshipExpression593);
            iv_ruleRelationshipExpression=ruleRelationshipExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationshipExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationshipExpression603); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRelationshipExpression"


    // $ANTLR start "ruleRelationshipExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:294:1: ruleRelationshipExpression returns [EObject current=null] : (this_ResourceExpression_0= ruleResourceExpression ( () ( (lv_opName_2_0= ruleEdgeOperator ) ) ( (lv_rightExpr_3_0= ruleResourceExpression ) ) )* ) ;
    public final EObject ruleRelationshipExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ResourceExpression_0 = null;

        AntlrDatatypeRuleToken lv_opName_2_0 = null;

        EObject lv_rightExpr_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:297:28: ( (this_ResourceExpression_0= ruleResourceExpression ( () ( (lv_opName_2_0= ruleEdgeOperator ) ) ( (lv_rightExpr_3_0= ruleResourceExpression ) ) )* ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:298:1: (this_ResourceExpression_0= ruleResourceExpression ( () ( (lv_opName_2_0= ruleEdgeOperator ) ) ( (lv_rightExpr_3_0= ruleResourceExpression ) ) )* )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:298:1: (this_ResourceExpression_0= ruleResourceExpression ( () ( (lv_opName_2_0= ruleEdgeOperator ) ) ( (lv_rightExpr_3_0= ruleResourceExpression ) ) )* )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:299:2: this_ResourceExpression_0= ruleResourceExpression ( () ( (lv_opName_2_0= ruleEdgeOperator ) ) ( (lv_rightExpr_3_0= ruleResourceExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRelationshipExpressionAccess().getResourceExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleResourceExpression_in_ruleRelationshipExpression653);
            this_ResourceExpression_0=ruleResourceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_ResourceExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:310:1: ( () ( (lv_opName_2_0= ruleEdgeOperator ) ) ( (lv_rightExpr_3_0= ruleResourceExpression ) ) )*
            loop5:
            do {
                int alt5=2;
                switch ( input.LA(1) ) {
                case KEYWORD_27:
                    {
                    int LA5_2 = input.LA(2);

                    if ( (synpred7_InternalPPParser()) ) {
                        alt5=1;
                    }


                    }
                    break;
                case KEYWORD_28:
                    {
                    int LA5_3 = input.LA(2);

                    if ( (synpred7_InternalPPParser()) ) {
                        alt5=1;
                    }


                    }
                    break;
                case KEYWORD_46:
                    {
                    int LA5_4 = input.LA(2);

                    if ( (synpred7_InternalPPParser()) ) {
                        alt5=1;
                    }


                    }
                    break;
                case KEYWORD_32:
                    {
                    int LA5_5 = input.LA(2);

                    if ( (synpred7_InternalPPParser()) ) {
                        alt5=1;
                    }


                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:310:2: () ( (lv_opName_2_0= ruleEdgeOperator ) ) ( (lv_rightExpr_3_0= ruleResourceExpression ) )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:310:2: ()
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:311:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getRelationshipExpressionAccess().getRelationshipExpressionLeftExprAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:319:2: ( (lv_opName_2_0= ruleEdgeOperator ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:320:1: (lv_opName_2_0= ruleEdgeOperator )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:320:1: (lv_opName_2_0= ruleEdgeOperator )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:321:3: lv_opName_2_0= ruleEdgeOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelationshipExpressionAccess().getOpNameEdgeOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEdgeOperator_in_ruleRelationshipExpression686);
            	    lv_opName_2_0=ruleEdgeOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRelationshipExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"opName",
            	              		lv_opName_2_0, 
            	              		"EdgeOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:337:2: ( (lv_rightExpr_3_0= ruleResourceExpression ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:338:1: (lv_rightExpr_3_0= ruleResourceExpression )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:338:1: (lv_rightExpr_3_0= ruleResourceExpression )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:339:3: lv_rightExpr_3_0= ruleResourceExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelationshipExpressionAccess().getRightExprResourceExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleResourceExpression_in_ruleRelationshipExpression707);
            	    lv_rightExpr_3_0=ruleResourceExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRelationshipExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightExpr",
            	              		lv_rightExpr_3_0, 
            	              		"ResourceExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRelationshipExpression"


    // $ANTLR start "entryRuleResourceExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:363:1: entryRuleResourceExpression returns [EObject current=null] : iv_ruleResourceExpression= ruleResourceExpression EOF ;
    public final EObject entryRuleResourceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:364:2: (iv_ruleResourceExpression= ruleResourceExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:365:2: iv_ruleResourceExpression= ruleResourceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getResourceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleResourceExpression_in_entryRuleResourceExpression744);
            iv_ruleResourceExpression=ruleResourceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleResourceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceExpression754); if (state.failed) return current;

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
    // $ANTLR end "entryRuleResourceExpression"


    // $ANTLR start "ruleResourceExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:372:1: ruleResourceExpression returns [EObject current=null] : ( (this_AssignmentExpression_0= ruleAssignmentExpression ( () otherlv_2= KEYWORD_20 ( ( (lv_resourceData_3_0= ruleResourceBody ) ) (otherlv_4= KEYWORD_12 ( (lv_resourceData_5_0= ruleResourceBody ) ) )* (otherlv_6= KEYWORD_12 )? )? otherlv_7= KEYWORD_21 )? ) | ( () ( (lv_resourceExpr_9_0= ruleLiteralClass ) ) otherlv_10= KEYWORD_20 ( ( (lv_resourceData_11_0= ruleResourceBody ) ) (otherlv_12= KEYWORD_12 ( (lv_resourceData_13_0= ruleResourceBody ) ) )* (otherlv_14= KEYWORD_12 )? )? otherlv_15= KEYWORD_21 ) ) ;
    public final EObject ruleResourceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject this_AssignmentExpression_0 = null;

        EObject lv_resourceData_3_0 = null;

        EObject lv_resourceData_5_0 = null;

        EObject lv_resourceExpr_9_0 = null;

        EObject lv_resourceData_11_0 = null;

        EObject lv_resourceData_13_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:375:28: ( ( (this_AssignmentExpression_0= ruleAssignmentExpression ( () otherlv_2= KEYWORD_20 ( ( (lv_resourceData_3_0= ruleResourceBody ) ) (otherlv_4= KEYWORD_12 ( (lv_resourceData_5_0= ruleResourceBody ) ) )* (otherlv_6= KEYWORD_12 )? )? otherlv_7= KEYWORD_21 )? ) | ( () ( (lv_resourceExpr_9_0= ruleLiteralClass ) ) otherlv_10= KEYWORD_20 ( ( (lv_resourceData_11_0= ruleResourceBody ) ) (otherlv_12= KEYWORD_12 ( (lv_resourceData_13_0= ruleResourceBody ) ) )* (otherlv_14= KEYWORD_12 )? )? otherlv_15= KEYWORD_21 ) ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:376:1: ( (this_AssignmentExpression_0= ruleAssignmentExpression ( () otherlv_2= KEYWORD_20 ( ( (lv_resourceData_3_0= ruleResourceBody ) ) (otherlv_4= KEYWORD_12 ( (lv_resourceData_5_0= ruleResourceBody ) ) )* (otherlv_6= KEYWORD_12 )? )? otherlv_7= KEYWORD_21 )? ) | ( () ( (lv_resourceExpr_9_0= ruleLiteralClass ) ) otherlv_10= KEYWORD_20 ( ( (lv_resourceData_11_0= ruleResourceBody ) ) (otherlv_12= KEYWORD_12 ( (lv_resourceData_13_0= ruleResourceBody ) ) )* (otherlv_14= KEYWORD_12 )? )? otherlv_15= KEYWORD_21 ) )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:376:1: ( (this_AssignmentExpression_0= ruleAssignmentExpression ( () otherlv_2= KEYWORD_20 ( ( (lv_resourceData_3_0= ruleResourceBody ) ) (otherlv_4= KEYWORD_12 ( (lv_resourceData_5_0= ruleResourceBody ) ) )* (otherlv_6= KEYWORD_12 )? )? otherlv_7= KEYWORD_21 )? ) | ( () ( (lv_resourceExpr_9_0= ruleLiteralClass ) ) otherlv_10= KEYWORD_20 ( ( (lv_resourceData_11_0= ruleResourceBody ) ) (otherlv_12= KEYWORD_12 ( (lv_resourceData_13_0= ruleResourceBody ) ) )* (otherlv_14= KEYWORD_12 )? )? otherlv_15= KEYWORD_21 ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=KEYWORD_61 && LA13_0<=KEYWORD_60)||(LA13_0>=KEYWORD_57 && LA13_0<=KEYWORD_51)||(LA13_0>=KEYWORD_53 && LA13_0<=KEYWORD_54)||LA13_0==KEYWORD_24||LA13_0==KEYWORD_42||(LA13_0>=KEYWORD_1 && LA13_0<=KEYWORD_4)||LA13_0==KEYWORD_9||(LA13_0>=KEYWORD_17 && LA13_0<=KEYWORD_18)||LA13_0==KEYWORD_20||(LA13_0>=RULE_DOLLAR_VAR && LA13_0<=RULE_WORD_CHARS)||LA13_0==RULE_REGULAR_EXPRESSION) ) {
                alt13=1;
            }
            else if ( (LA13_0==KEYWORD_55) ) {
                int LA13_2 = input.LA(2);

                if ( (LA13_2==KEYWORD_20) ) {
                    alt13=2;
                }
                else if ( (LA13_2==KEYWORD_55||LA13_2==RULE_WORD_CHARS) ) {
                    alt13=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:376:2: (this_AssignmentExpression_0= ruleAssignmentExpression ( () otherlv_2= KEYWORD_20 ( ( (lv_resourceData_3_0= ruleResourceBody ) ) (otherlv_4= KEYWORD_12 ( (lv_resourceData_5_0= ruleResourceBody ) ) )* (otherlv_6= KEYWORD_12 )? )? otherlv_7= KEYWORD_21 )? )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:376:2: (this_AssignmentExpression_0= ruleAssignmentExpression ( () otherlv_2= KEYWORD_20 ( ( (lv_resourceData_3_0= ruleResourceBody ) ) (otherlv_4= KEYWORD_12 ( (lv_resourceData_5_0= ruleResourceBody ) ) )* (otherlv_6= KEYWORD_12 )? )? otherlv_7= KEYWORD_21 )? )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:377:2: this_AssignmentExpression_0= ruleAssignmentExpression ( () otherlv_2= KEYWORD_20 ( ( (lv_resourceData_3_0= ruleResourceBody ) ) (otherlv_4= KEYWORD_12 ( (lv_resourceData_5_0= ruleResourceBody ) ) )* (otherlv_6= KEYWORD_12 )? )? otherlv_7= KEYWORD_21 )?
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getResourceExpressionAccess().getAssignmentExpressionParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleResourceExpression805);
                    this_AssignmentExpression_0=ruleAssignmentExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_AssignmentExpression_0;
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:388:1: ( () otherlv_2= KEYWORD_20 ( ( (lv_resourceData_3_0= ruleResourceBody ) ) (otherlv_4= KEYWORD_12 ( (lv_resourceData_5_0= ruleResourceBody ) ) )* (otherlv_6= KEYWORD_12 )? )? otherlv_7= KEYWORD_21 )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==KEYWORD_20) ) {
                        int LA9_1 = input.LA(2);

                        if ( (synpred11_InternalPPParser()) ) {
                            alt9=1;
                        }
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:388:2: () otherlv_2= KEYWORD_20 ( ( (lv_resourceData_3_0= ruleResourceBody ) ) (otherlv_4= KEYWORD_12 ( (lv_resourceData_5_0= ruleResourceBody ) ) )* (otherlv_6= KEYWORD_12 )? )? otherlv_7= KEYWORD_21
                            {
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:388:2: ()
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:389:2: 
                            {
                            if ( state.backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getResourceExpressionAccess().getResourceExpressionResourceExprAction_0_1_0(),
                                          current);
                                  
                            }

                            }

                            otherlv_2=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleResourceExpression830); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getResourceExpressionAccess().getLeftCurlyBracketKeyword_0_1_1());
                                  
                            }
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:402:1: ( ( (lv_resourceData_3_0= ruleResourceBody ) ) (otherlv_4= KEYWORD_12 ( (lv_resourceData_5_0= ruleResourceBody ) ) )* (otherlv_6= KEYWORD_12 )? )?
                            int alt8=2;
                            int LA8_0 = input.LA(1);

                            if ( ((LA8_0>=KEYWORD_61 && LA8_0<=KEYWORD_55)||(LA8_0>=KEYWORD_57 && LA8_0<=KEYWORD_51)||(LA8_0>=KEYWORD_53 && LA8_0<=KEYWORD_54)||LA8_0==KEYWORD_24||LA8_0==KEYWORD_42||(LA8_0>=KEYWORD_1 && LA8_0<=KEYWORD_4)||LA8_0==KEYWORD_9||(LA8_0>=KEYWORD_17 && LA8_0<=KEYWORD_18)||LA8_0==KEYWORD_20||(LA8_0>=RULE_DOLLAR_VAR && LA8_0<=RULE_WORD_CHARS)||LA8_0==RULE_REGULAR_EXPRESSION) ) {
                                alt8=1;
                            }
                            switch (alt8) {
                                case 1 :
                                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:402:2: ( (lv_resourceData_3_0= ruleResourceBody ) ) (otherlv_4= KEYWORD_12 ( (lv_resourceData_5_0= ruleResourceBody ) ) )* (otherlv_6= KEYWORD_12 )?
                                    {
                                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:402:2: ( (lv_resourceData_3_0= ruleResourceBody ) )
                                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:403:1: (lv_resourceData_3_0= ruleResourceBody )
                                    {
                                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:403:1: (lv_resourceData_3_0= ruleResourceBody )
                                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:404:3: lv_resourceData_3_0= ruleResourceBody
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getResourceExpressionAccess().getResourceDataResourceBodyParserRuleCall_0_1_2_0_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleResourceBody_in_ruleResourceExpression851);
                                    lv_resourceData_3_0=ruleResourceBody();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElementForParent(grammarAccess.getResourceExpressionRule());
                                      	        }
                                             		add(
                                             			current, 
                                             			"resourceData",
                                              		lv_resourceData_3_0, 
                                              		"ResourceBody");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }

                                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:420:2: (otherlv_4= KEYWORD_12 ( (lv_resourceData_5_0= ruleResourceBody ) ) )*
                                    loop6:
                                    do {
                                        int alt6=2;
                                        int LA6_0 = input.LA(1);

                                        if ( (LA6_0==KEYWORD_12) ) {
                                            int LA6_1 = input.LA(2);

                                            if ( ((LA6_1>=KEYWORD_61 && LA6_1<=KEYWORD_55)||(LA6_1>=KEYWORD_57 && LA6_1<=KEYWORD_51)||(LA6_1>=KEYWORD_53 && LA6_1<=KEYWORD_54)||LA6_1==KEYWORD_24||LA6_1==KEYWORD_42||(LA6_1>=KEYWORD_1 && LA6_1<=KEYWORD_4)||LA6_1==KEYWORD_9||(LA6_1>=KEYWORD_17 && LA6_1<=KEYWORD_18)||LA6_1==KEYWORD_20||(LA6_1>=RULE_DOLLAR_VAR && LA6_1<=RULE_WORD_CHARS)||LA6_1==RULE_REGULAR_EXPRESSION) ) {
                                                alt6=1;
                                            }


                                        }


                                        switch (alt6) {
                                    	case 1 :
                                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:421:2: otherlv_4= KEYWORD_12 ( (lv_resourceData_5_0= ruleResourceBody ) )
                                    	    {
                                    	    otherlv_4=(Token)match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleResourceExpression865); if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	          	newLeafNode(otherlv_4, grammarAccess.getResourceExpressionAccess().getSemicolonKeyword_0_1_2_1_0());
                                    	          
                                    	    }
                                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:425:1: ( (lv_resourceData_5_0= ruleResourceBody ) )
                                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:426:1: (lv_resourceData_5_0= ruleResourceBody )
                                    	    {
                                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:426:1: (lv_resourceData_5_0= ruleResourceBody )
                                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:427:3: lv_resourceData_5_0= ruleResourceBody
                                    	    {
                                    	    if ( state.backtracking==0 ) {
                                    	       
                                    	      	        newCompositeNode(grammarAccess.getResourceExpressionAccess().getResourceDataResourceBodyParserRuleCall_0_1_2_1_1_0()); 
                                    	      	    
                                    	    }
                                    	    pushFollow(FOLLOW_ruleResourceBody_in_ruleResourceExpression885);
                                    	    lv_resourceData_5_0=ruleResourceBody();

                                    	    state._fsp--;
                                    	    if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	      	        if (current==null) {
                                    	      	            current = createModelElementForParent(grammarAccess.getResourceExpressionRule());
                                    	      	        }
                                    	             		add(
                                    	             			current, 
                                    	             			"resourceData",
                                    	              		lv_resourceData_5_0, 
                                    	              		"ResourceBody");
                                    	      	        afterParserOrEnumRuleCall();
                                    	      	    
                                    	    }

                                    	    }


                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop6;
                                        }
                                    } while (true);

                                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:443:4: (otherlv_6= KEYWORD_12 )?
                                    int alt7=2;
                                    int LA7_0 = input.LA(1);

                                    if ( (LA7_0==KEYWORD_12) ) {
                                        alt7=1;
                                    }
                                    switch (alt7) {
                                        case 1 :
                                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:444:2: otherlv_6= KEYWORD_12
                                            {
                                            otherlv_6=(Token)match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleResourceExpression901); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                  	newLeafNode(otherlv_6, grammarAccess.getResourceExpressionAccess().getSemicolonKeyword_0_1_2_2());
                                                  
                                            }

                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }

                            otherlv_7=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleResourceExpression917); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getResourceExpressionAccess().getRightCurlyBracketKeyword_0_1_3());
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:454:6: ( () ( (lv_resourceExpr_9_0= ruleLiteralClass ) ) otherlv_10= KEYWORD_20 ( ( (lv_resourceData_11_0= ruleResourceBody ) ) (otherlv_12= KEYWORD_12 ( (lv_resourceData_13_0= ruleResourceBody ) ) )* (otherlv_14= KEYWORD_12 )? )? otherlv_15= KEYWORD_21 )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:454:6: ( () ( (lv_resourceExpr_9_0= ruleLiteralClass ) ) otherlv_10= KEYWORD_20 ( ( (lv_resourceData_11_0= ruleResourceBody ) ) (otherlv_12= KEYWORD_12 ( (lv_resourceData_13_0= ruleResourceBody ) ) )* (otherlv_14= KEYWORD_12 )? )? otherlv_15= KEYWORD_21 )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:454:7: () ( (lv_resourceExpr_9_0= ruleLiteralClass ) ) otherlv_10= KEYWORD_20 ( ( (lv_resourceData_11_0= ruleResourceBody ) ) (otherlv_12= KEYWORD_12 ( (lv_resourceData_13_0= ruleResourceBody ) ) )* (otherlv_14= KEYWORD_12 )? )? otherlv_15= KEYWORD_21
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:454:7: ()
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:455:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getResourceExpressionAccess().getResourceExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:463:2: ( (lv_resourceExpr_9_0= ruleLiteralClass ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:464:1: (lv_resourceExpr_9_0= ruleLiteralClass )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:464:1: (lv_resourceExpr_9_0= ruleLiteralClass )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:465:3: lv_resourceExpr_9_0= ruleLiteralClass
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getResourceExpressionAccess().getResourceExprLiteralClassParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLiteralClass_in_ruleResourceExpression959);
                    lv_resourceExpr_9_0=ruleLiteralClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getResourceExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"resourceExpr",
                              		lv_resourceExpr_9_0, 
                              		"LiteralClass");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleResourceExpression972); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getResourceExpressionAccess().getLeftCurlyBracketKeyword_1_2());
                          
                    }
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:486:1: ( ( (lv_resourceData_11_0= ruleResourceBody ) ) (otherlv_12= KEYWORD_12 ( (lv_resourceData_13_0= ruleResourceBody ) ) )* (otherlv_14= KEYWORD_12 )? )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( ((LA12_0>=KEYWORD_61 && LA12_0<=KEYWORD_55)||(LA12_0>=KEYWORD_57 && LA12_0<=KEYWORD_51)||(LA12_0>=KEYWORD_53 && LA12_0<=KEYWORD_54)||LA12_0==KEYWORD_24||LA12_0==KEYWORD_42||(LA12_0>=KEYWORD_1 && LA12_0<=KEYWORD_4)||LA12_0==KEYWORD_9||(LA12_0>=KEYWORD_17 && LA12_0<=KEYWORD_18)||LA12_0==KEYWORD_20||(LA12_0>=RULE_DOLLAR_VAR && LA12_0<=RULE_WORD_CHARS)||LA12_0==RULE_REGULAR_EXPRESSION) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:486:2: ( (lv_resourceData_11_0= ruleResourceBody ) ) (otherlv_12= KEYWORD_12 ( (lv_resourceData_13_0= ruleResourceBody ) ) )* (otherlv_14= KEYWORD_12 )?
                            {
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:486:2: ( (lv_resourceData_11_0= ruleResourceBody ) )
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:487:1: (lv_resourceData_11_0= ruleResourceBody )
                            {
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:487:1: (lv_resourceData_11_0= ruleResourceBody )
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:488:3: lv_resourceData_11_0= ruleResourceBody
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getResourceExpressionAccess().getResourceDataResourceBodyParserRuleCall_1_3_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleResourceBody_in_ruleResourceExpression993);
                            lv_resourceData_11_0=ruleResourceBody();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getResourceExpressionRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"resourceData",
                                      		lv_resourceData_11_0, 
                                      		"ResourceBody");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:504:2: (otherlv_12= KEYWORD_12 ( (lv_resourceData_13_0= ruleResourceBody ) ) )*
                            loop10:
                            do {
                                int alt10=2;
                                int LA10_0 = input.LA(1);

                                if ( (LA10_0==KEYWORD_12) ) {
                                    int LA10_1 = input.LA(2);

                                    if ( ((LA10_1>=KEYWORD_61 && LA10_1<=KEYWORD_55)||(LA10_1>=KEYWORD_57 && LA10_1<=KEYWORD_51)||(LA10_1>=KEYWORD_53 && LA10_1<=KEYWORD_54)||LA10_1==KEYWORD_24||LA10_1==KEYWORD_42||(LA10_1>=KEYWORD_1 && LA10_1<=KEYWORD_4)||LA10_1==KEYWORD_9||(LA10_1>=KEYWORD_17 && LA10_1<=KEYWORD_18)||LA10_1==KEYWORD_20||(LA10_1>=RULE_DOLLAR_VAR && LA10_1<=RULE_WORD_CHARS)||LA10_1==RULE_REGULAR_EXPRESSION) ) {
                                        alt10=1;
                                    }


                                }


                                switch (alt10) {
                            	case 1 :
                            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:505:2: otherlv_12= KEYWORD_12 ( (lv_resourceData_13_0= ruleResourceBody ) )
                            	    {
                            	    otherlv_12=(Token)match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleResourceExpression1007); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_12, grammarAccess.getResourceExpressionAccess().getSemicolonKeyword_1_3_1_0());
                            	          
                            	    }
                            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:509:1: ( (lv_resourceData_13_0= ruleResourceBody ) )
                            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:510:1: (lv_resourceData_13_0= ruleResourceBody )
                            	    {
                            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:510:1: (lv_resourceData_13_0= ruleResourceBody )
                            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:511:3: lv_resourceData_13_0= ruleResourceBody
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getResourceExpressionAccess().getResourceDataResourceBodyParserRuleCall_1_3_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleResourceBody_in_ruleResourceExpression1027);
                            	    lv_resourceData_13_0=ruleResourceBody();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getResourceExpressionRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"resourceData",
                            	              		lv_resourceData_13_0, 
                            	              		"ResourceBody");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop10;
                                }
                            } while (true);

                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:527:4: (otherlv_14= KEYWORD_12 )?
                            int alt11=2;
                            int LA11_0 = input.LA(1);

                            if ( (LA11_0==KEYWORD_12) ) {
                                alt11=1;
                            }
                            switch (alt11) {
                                case 1 :
                                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:528:2: otherlv_14= KEYWORD_12
                                    {
                                    otherlv_14=(Token)match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleResourceExpression1043); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_14, grammarAccess.getResourceExpressionAccess().getSemicolonKeyword_1_3_2());
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleResourceExpression1059); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getResourceExpressionAccess().getRightCurlyBracketKeyword_1_4());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleResourceExpression"


    // $ANTLR start "entryRuleResourceBody"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:545:1: entryRuleResourceBody returns [EObject current=null] : iv_ruleResourceBody= ruleResourceBody EOF ;
    public final EObject entryRuleResourceBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceBody = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:546:2: (iv_ruleResourceBody= ruleResourceBody EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:547:2: iv_ruleResourceBody= ruleResourceBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getResourceBodyRule()); 
            }
            pushFollow(FOLLOW_ruleResourceBody_in_entryRuleResourceBody1094);
            iv_ruleResourceBody=ruleResourceBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleResourceBody; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceBody1104); if (state.failed) return current;

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
    // $ANTLR end "entryRuleResourceBody"


    // $ANTLR start "ruleResourceBody"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:554:1: ruleResourceBody returns [EObject current=null] : ( ( ( (lv_nameExpr_0_0= ruleExpression ) ) otherlv_1= KEYWORD_11 ( (lv_attributes_2_0= ruleAttributeOperations ) )? ) | ( (lv_attributes_3_0= ruleAttributeOperations ) ) ) ;
    public final EObject ruleResourceBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_nameExpr_0_0 = null;

        EObject lv_attributes_2_0 = null;

        EObject lv_attributes_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:557:28: ( ( ( ( (lv_nameExpr_0_0= ruleExpression ) ) otherlv_1= KEYWORD_11 ( (lv_attributes_2_0= ruleAttributeOperations ) )? ) | ( (lv_attributes_3_0= ruleAttributeOperations ) ) ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:558:1: ( ( ( (lv_nameExpr_0_0= ruleExpression ) ) otherlv_1= KEYWORD_11 ( (lv_attributes_2_0= ruleAttributeOperations ) )? ) | ( (lv_attributes_3_0= ruleAttributeOperations ) ) )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:558:1: ( ( ( (lv_nameExpr_0_0= ruleExpression ) ) otherlv_1= KEYWORD_11 ( (lv_attributes_2_0= ruleAttributeOperations ) )? ) | ( (lv_attributes_3_0= ruleAttributeOperations ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=KEYWORD_61 && LA15_0<=KEYWORD_55)||(LA15_0>=KEYWORD_57 && LA15_0<=KEYWORD_51)||(LA15_0>=KEYWORD_53 && LA15_0<=KEYWORD_54)||LA15_0==KEYWORD_24||LA15_0==KEYWORD_42||(LA15_0>=KEYWORD_1 && LA15_0<=KEYWORD_4)||LA15_0==KEYWORD_9||(LA15_0>=KEYWORD_17 && LA15_0<=KEYWORD_18)||LA15_0==KEYWORD_20||LA15_0==RULE_DOLLAR_VAR||LA15_0==RULE_REGULAR_EXPRESSION) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_WORD_CHARS) ) {
                int LA15_2 = input.LA(2);

                if ( (LA15_2==EOF||LA15_2==KEYWORD_26||LA15_2==KEYWORD_34||LA15_2==KEYWORD_8||LA15_2==KEYWORD_12||LA15_2==KEYWORD_21||LA15_2==RULE_WORD_CHARS) ) {
                    alt15=2;
                }
                else if ( (LA15_2==KEYWORD_47||LA15_2==KEYWORD_49||(LA15_2>=KEYWORD_22 && LA15_2<=KEYWORD_23)||LA15_2==KEYWORD_25||(LA15_2>=KEYWORD_27 && LA15_2<=KEYWORD_33)||(LA15_2>=KEYWORD_35 && LA15_2<=KEYWORD_37)||(LA15_2>=KEYWORD_43 && LA15_2<=KEYWORD_44)||LA15_2==KEYWORD_46||LA15_2==KEYWORD_4||(LA15_2>=KEYWORD_6 && LA15_2<=KEYWORD_7)||(LA15_2>=KEYWORD_9 && LA15_2<=KEYWORD_11)||(LA15_2>=KEYWORD_13 && LA15_2<=KEYWORD_16)||LA15_2==KEYWORD_18||LA15_2==KEYWORD_20) ) {
                    alt15=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:558:2: ( ( (lv_nameExpr_0_0= ruleExpression ) ) otherlv_1= KEYWORD_11 ( (lv_attributes_2_0= ruleAttributeOperations ) )? )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:558:2: ( ( (lv_nameExpr_0_0= ruleExpression ) ) otherlv_1= KEYWORD_11 ( (lv_attributes_2_0= ruleAttributeOperations ) )? )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:558:3: ( (lv_nameExpr_0_0= ruleExpression ) ) otherlv_1= KEYWORD_11 ( (lv_attributes_2_0= ruleAttributeOperations ) )?
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:558:3: ( (lv_nameExpr_0_0= ruleExpression ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:559:1: (lv_nameExpr_0_0= ruleExpression )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:559:1: (lv_nameExpr_0_0= ruleExpression )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:560:3: lv_nameExpr_0_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getResourceBodyAccess().getNameExprExpressionParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleResourceBody1151);
                    lv_nameExpr_0_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getResourceBodyRule());
                      	        }
                             		set(
                             			current, 
                             			"nameExpr",
                              		lv_nameExpr_0_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleResourceBody1164); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getResourceBodyAccess().getColonKeyword_0_1());
                          
                    }
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:581:1: ( (lv_attributes_2_0= ruleAttributeOperations ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_WORD_CHARS) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:582:1: (lv_attributes_2_0= ruleAttributeOperations )
                            {
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:582:1: (lv_attributes_2_0= ruleAttributeOperations )
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:583:3: lv_attributes_2_0= ruleAttributeOperations
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getResourceBodyAccess().getAttributesAttributeOperationsParserRuleCall_0_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleAttributeOperations_in_ruleResourceBody1184);
                            lv_attributes_2_0=ruleAttributeOperations();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getResourceBodyRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"attributes",
                                      		lv_attributes_2_0, 
                                      		"AttributeOperations");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:600:6: ( (lv_attributes_3_0= ruleAttributeOperations ) )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:600:6: ( (lv_attributes_3_0= ruleAttributeOperations ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:601:1: (lv_attributes_3_0= ruleAttributeOperations )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:601:1: (lv_attributes_3_0= ruleAttributeOperations )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:602:3: lv_attributes_3_0= ruleAttributeOperations
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getResourceBodyAccess().getAttributesAttributeOperationsParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAttributeOperations_in_ruleResourceBody1213);
                    lv_attributes_3_0=ruleAttributeOperations();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getResourceBodyRule());
                      	        }
                             		set(
                             			current, 
                             			"attributes",
                              		lv_attributes_3_0, 
                              		"AttributeOperations");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleResourceBody"


    // $ANTLR start "entryRuleAttributeOperation"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:626:1: entryRuleAttributeOperation returns [EObject current=null] : iv_ruleAttributeOperation= ruleAttributeOperation EOF ;
    public final EObject entryRuleAttributeOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeOperation = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:627:2: (iv_ruleAttributeOperation= ruleAttributeOperation EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:628:2: iv_ruleAttributeOperation= ruleAttributeOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeOperationRule()); 
            }
            pushFollow(FOLLOW_ruleAttributeOperation_in_entryRuleAttributeOperation1248);
            iv_ruleAttributeOperation=ruleAttributeOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeOperation1258); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttributeOperation"


    // $ANTLR start "ruleAttributeOperation"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:635:1: ruleAttributeOperation returns [EObject current=null] : ( () ( (lv_key_1_0= rulename ) ) ( ( ( (lv_op_2_1= KEYWORD_34 | lv_op_2_2= KEYWORD_26 ) ) ) ( (lv_value_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleAttributeOperation() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        AntlrDatatypeRuleToken lv_key_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:638:28: ( ( () ( (lv_key_1_0= rulename ) ) ( ( ( (lv_op_2_1= KEYWORD_34 | lv_op_2_2= KEYWORD_26 ) ) ) ( (lv_value_3_0= ruleExpression ) ) )? ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:639:1: ( () ( (lv_key_1_0= rulename ) ) ( ( ( (lv_op_2_1= KEYWORD_34 | lv_op_2_2= KEYWORD_26 ) ) ) ( (lv_value_3_0= ruleExpression ) ) )? )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:639:1: ( () ( (lv_key_1_0= rulename ) ) ( ( ( (lv_op_2_1= KEYWORD_34 | lv_op_2_2= KEYWORD_26 ) ) ) ( (lv_value_3_0= ruleExpression ) ) )? )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:639:2: () ( (lv_key_1_0= rulename ) ) ( ( ( (lv_op_2_1= KEYWORD_34 | lv_op_2_2= KEYWORD_26 ) ) ) ( (lv_value_3_0= ruleExpression ) ) )?
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:639:2: ()
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:640:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAttributeOperationAccess().getAttributeOperationAction_0(),
                          current);
                  
            }

            }

            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:648:2: ( (lv_key_1_0= rulename ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:649:1: (lv_key_1_0= rulename )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:649:1: (lv_key_1_0= rulename )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:650:3: lv_key_1_0= rulename
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeOperationAccess().getKeyNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulename_in_ruleAttributeOperation1316);
            lv_key_1_0=rulename();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAttributeOperationRule());
              	        }
                     		set(
                     			current, 
                     			"key",
                      		lv_key_1_0, 
                      		"name");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:666:2: ( ( ( (lv_op_2_1= KEYWORD_34 | lv_op_2_2= KEYWORD_26 ) ) ) ( (lv_value_3_0= ruleExpression ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==KEYWORD_26||LA17_0==KEYWORD_34) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:666:3: ( ( (lv_op_2_1= KEYWORD_34 | lv_op_2_2= KEYWORD_26 ) ) ) ( (lv_value_3_0= ruleExpression ) )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:666:3: ( ( (lv_op_2_1= KEYWORD_34 | lv_op_2_2= KEYWORD_26 ) ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:667:1: ( (lv_op_2_1= KEYWORD_34 | lv_op_2_2= KEYWORD_26 ) )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:667:1: ( (lv_op_2_1= KEYWORD_34 | lv_op_2_2= KEYWORD_26 ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:668:1: (lv_op_2_1= KEYWORD_34 | lv_op_2_2= KEYWORD_26 )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:668:1: (lv_op_2_1= KEYWORD_34 | lv_op_2_2= KEYWORD_26 )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==KEYWORD_34) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==KEYWORD_26) ) {
                        alt16=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:669:3: lv_op_2_1= KEYWORD_34
                            {
                            lv_op_2_1=(Token)match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_ruleAttributeOperation1338); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_1, grammarAccess.getAttributeOperationAccess().getOpEqualsSignGreaterThanSignKeyword_2_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAttributeOperationRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:682:8: lv_op_2_2= KEYWORD_26
                            {
                            lv_op_2_2=(Token)match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_ruleAttributeOperation1366); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_2, grammarAccess.getAttributeOperationAccess().getOpPlusSignGreaterThanSignKeyword_2_0_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAttributeOperationRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:698:2: ( (lv_value_3_0= ruleExpression ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:699:1: (lv_value_3_0= ruleExpression )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:699:1: (lv_value_3_0= ruleExpression )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:700:3: lv_value_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeOperationAccess().getValueExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleAttributeOperation1401);
                    lv_value_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAttributeOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAttributeOperation"


    // $ANTLR start "entryRuleAttributeOperations"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:724:1: entryRuleAttributeOperations returns [EObject current=null] : iv_ruleAttributeOperations= ruleAttributeOperations EOF ;
    public final EObject entryRuleAttributeOperations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeOperations = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:725:2: (iv_ruleAttributeOperations= ruleAttributeOperations EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:726:2: iv_ruleAttributeOperations= ruleAttributeOperations EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeOperationsRule()); 
            }
            pushFollow(FOLLOW_ruleAttributeOperations_in_entryRuleAttributeOperations1438);
            iv_ruleAttributeOperations=ruleAttributeOperations();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeOperations; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeOperations1448); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttributeOperations"


    // $ANTLR start "ruleAttributeOperations"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:733:1: ruleAttributeOperations returns [EObject current=null] : ( ( (lv_attributes_0_0= ruleAttributeOperation ) ) ( (otherlv_1= KEYWORD_8 ( (lv_attributes_2_0= ruleAttributeOperation ) ) ) | ( (lv_attributes_3_0= ruleAttributeOperation ) ) )* (otherlv_4= KEYWORD_8 )? ) ;
    public final EObject ruleAttributeOperations() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_attributes_0_0 = null;

        EObject lv_attributes_2_0 = null;

        EObject lv_attributes_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:736:28: ( ( ( (lv_attributes_0_0= ruleAttributeOperation ) ) ( (otherlv_1= KEYWORD_8 ( (lv_attributes_2_0= ruleAttributeOperation ) ) ) | ( (lv_attributes_3_0= ruleAttributeOperation ) ) )* (otherlv_4= KEYWORD_8 )? ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:737:1: ( ( (lv_attributes_0_0= ruleAttributeOperation ) ) ( (otherlv_1= KEYWORD_8 ( (lv_attributes_2_0= ruleAttributeOperation ) ) ) | ( (lv_attributes_3_0= ruleAttributeOperation ) ) )* (otherlv_4= KEYWORD_8 )? )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:737:1: ( ( (lv_attributes_0_0= ruleAttributeOperation ) ) ( (otherlv_1= KEYWORD_8 ( (lv_attributes_2_0= ruleAttributeOperation ) ) ) | ( (lv_attributes_3_0= ruleAttributeOperation ) ) )* (otherlv_4= KEYWORD_8 )? )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:737:2: ( (lv_attributes_0_0= ruleAttributeOperation ) ) ( (otherlv_1= KEYWORD_8 ( (lv_attributes_2_0= ruleAttributeOperation ) ) ) | ( (lv_attributes_3_0= ruleAttributeOperation ) ) )* (otherlv_4= KEYWORD_8 )?
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:737:2: ( (lv_attributes_0_0= ruleAttributeOperation ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:738:1: (lv_attributes_0_0= ruleAttributeOperation )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:738:1: (lv_attributes_0_0= ruleAttributeOperation )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:739:3: lv_attributes_0_0= ruleAttributeOperation
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeOperationsAccess().getAttributesAttributeOperationParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAttributeOperation_in_ruleAttributeOperations1494);
            lv_attributes_0_0=ruleAttributeOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAttributeOperationsRule());
              	        }
                     		add(
                     			current, 
                     			"attributes",
                      		lv_attributes_0_0, 
                      		"AttributeOperation");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:755:2: ( (otherlv_1= KEYWORD_8 ( (lv_attributes_2_0= ruleAttributeOperation ) ) ) | ( (lv_attributes_3_0= ruleAttributeOperation ) ) )*
            loop18:
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==KEYWORD_8) ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1==RULE_WORD_CHARS) ) {
                        alt18=1;
                    }


                }
                else if ( (LA18_0==RULE_WORD_CHARS) ) {
                    alt18=2;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:755:3: (otherlv_1= KEYWORD_8 ( (lv_attributes_2_0= ruleAttributeOperation ) ) )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:755:3: (otherlv_1= KEYWORD_8 ( (lv_attributes_2_0= ruleAttributeOperation ) ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:756:2: otherlv_1= KEYWORD_8 ( (lv_attributes_2_0= ruleAttributeOperation ) )
            	    {
            	    otherlv_1=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleAttributeOperations1509); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getAttributeOperationsAccess().getCommaKeyword_1_0_0());
            	          
            	    }
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:760:1: ( (lv_attributes_2_0= ruleAttributeOperation ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:761:1: (lv_attributes_2_0= ruleAttributeOperation )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:761:1: (lv_attributes_2_0= ruleAttributeOperation )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:762:3: lv_attributes_2_0= ruleAttributeOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAttributeOperationsAccess().getAttributesAttributeOperationParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAttributeOperation_in_ruleAttributeOperations1529);
            	    lv_attributes_2_0=ruleAttributeOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAttributeOperationsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"attributes",
            	              		lv_attributes_2_0, 
            	              		"AttributeOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:779:6: ( (lv_attributes_3_0= ruleAttributeOperation ) )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:779:6: ( (lv_attributes_3_0= ruleAttributeOperation ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:780:1: (lv_attributes_3_0= ruleAttributeOperation )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:780:1: (lv_attributes_3_0= ruleAttributeOperation )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:781:3: lv_attributes_3_0= ruleAttributeOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAttributeOperationsAccess().getAttributesAttributeOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAttributeOperation_in_ruleAttributeOperations1557);
            	    lv_attributes_3_0=ruleAttributeOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAttributeOperationsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"attributes",
            	              		lv_attributes_3_0, 
            	              		"AttributeOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:797:4: (otherlv_4= KEYWORD_8 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==KEYWORD_8) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:798:2: otherlv_4= KEYWORD_8
                    {
                    otherlv_4=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleAttributeOperations1573); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAttributeOperationsAccess().getCommaKeyword_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAttributeOperations"


    // $ANTLR start "entryRuleendComma"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:810:1: entryRuleendComma returns [String current=null] : iv_ruleendComma= ruleendComma EOF ;
    public final String entryRuleendComma() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleendComma = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:811:1: (iv_ruleendComma= ruleendComma EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:812:2: iv_ruleendComma= ruleendComma EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEndCommaRule()); 
            }
            pushFollow(FOLLOW_ruleendComma_in_entryRuleendComma1610);
            iv_ruleendComma=ruleendComma();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleendComma.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleendComma1621); if (state.failed) return current;

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
    // $ANTLR end "entryRuleendComma"


    // $ANTLR start "ruleendComma"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:819:1: ruleendComma returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= KEYWORD_8 ;
    public final AntlrDatatypeRuleToken ruleendComma() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:823:6: (kw= KEYWORD_8 )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:825:2: kw= KEYWORD_8
            {
            kw=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleendComma1658); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getEndCommaAccess().getCommaKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
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
    // $ANTLR end "ruleendComma"


    // $ANTLR start "entryRuleAssignmentExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:838:1: entryRuleAssignmentExpression returns [EObject current=null] : iv_ruleAssignmentExpression= ruleAssignmentExpression EOF ;
    public final EObject entryRuleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:839:2: (iv_ruleAssignmentExpression= ruleAssignmentExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:840:2: iv_ruleAssignmentExpression= ruleAssignmentExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression1696);
            iv_ruleAssignmentExpression=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignmentExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentExpression1706); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssignmentExpression"


    // $ANTLR start "ruleAssignmentExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:847:1: ruleAssignmentExpression returns [EObject current=null] : (this_AppendExpression_0= ruleAppendExpression ( () otherlv_2= KEYWORD_14 ( (lv_rightExpr_3_0= ruleAppendExpression ) ) )? ) ;
    public final EObject ruleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AppendExpression_0 = null;

        EObject lv_rightExpr_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:850:28: ( (this_AppendExpression_0= ruleAppendExpression ( () otherlv_2= KEYWORD_14 ( (lv_rightExpr_3_0= ruleAppendExpression ) ) )? ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:851:1: (this_AppendExpression_0= ruleAppendExpression ( () otherlv_2= KEYWORD_14 ( (lv_rightExpr_3_0= ruleAppendExpression ) ) )? )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:851:1: (this_AppendExpression_0= ruleAppendExpression ( () otherlv_2= KEYWORD_14 ( (lv_rightExpr_3_0= ruleAppendExpression ) ) )? )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:852:2: this_AppendExpression_0= ruleAppendExpression ( () otherlv_2= KEYWORD_14 ( (lv_rightExpr_3_0= ruleAppendExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getAppendExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAppendExpression_in_ruleAssignmentExpression1756);
            this_AppendExpression_0=ruleAppendExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_AppendExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:863:1: ( () otherlv_2= KEYWORD_14 ( (lv_rightExpr_3_0= ruleAppendExpression ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==KEYWORD_14) ) {
                int LA20_1 = input.LA(2);

                if ( (synpred23_InternalPPParser()) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:863:2: () otherlv_2= KEYWORD_14 ( (lv_rightExpr_3_0= ruleAppendExpression ) )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:863:2: ()
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:864:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionLeftExprAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleAssignmentExpression1781); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAssignmentExpressionAccess().getEqualsSignKeyword_1_1());
                          
                    }
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:877:1: ( (lv_rightExpr_3_0= ruleAppendExpression ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:878:1: (lv_rightExpr_3_0= ruleAppendExpression )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:878:1: (lv_rightExpr_3_0= ruleAppendExpression )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:879:3: lv_rightExpr_3_0= ruleAppendExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getRightExprAppendExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAppendExpression_in_ruleAssignmentExpression1801);
                    lv_rightExpr_3_0=ruleAppendExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAssignmentExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"rightExpr",
                              		lv_rightExpr_3_0, 
                              		"AppendExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAssignmentExpression"


    // $ANTLR start "entryRuleAppendExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:903:1: entryRuleAppendExpression returns [EObject current=null] : iv_ruleAppendExpression= ruleAppendExpression EOF ;
    public final EObject entryRuleAppendExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppendExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:904:2: (iv_ruleAppendExpression= ruleAppendExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:905:2: iv_ruleAppendExpression= ruleAppendExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAppendExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAppendExpression_in_entryRuleAppendExpression1838);
            iv_ruleAppendExpression=ruleAppendExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAppendExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAppendExpression1848); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAppendExpression"


    // $ANTLR start "ruleAppendExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:912:1: ruleAppendExpression returns [EObject current=null] : (this_OrExpression_0= ruleOrExpression ( () otherlv_2= KEYWORD_25 ( (lv_rightExpr_3_0= ruleOrExpression ) ) )? ) ;
    public final EObject ruleAppendExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_OrExpression_0 = null;

        EObject lv_rightExpr_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:915:28: ( (this_OrExpression_0= ruleOrExpression ( () otherlv_2= KEYWORD_25 ( (lv_rightExpr_3_0= ruleOrExpression ) ) )? ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:916:1: (this_OrExpression_0= ruleOrExpression ( () otherlv_2= KEYWORD_25 ( (lv_rightExpr_3_0= ruleOrExpression ) ) )? )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:916:1: (this_OrExpression_0= ruleOrExpression ( () otherlv_2= KEYWORD_25 ( (lv_rightExpr_3_0= ruleOrExpression ) ) )? )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:917:2: this_OrExpression_0= ruleOrExpression ( () otherlv_2= KEYWORD_25 ( (lv_rightExpr_3_0= ruleOrExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAppendExpressionAccess().getOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleOrExpression_in_ruleAppendExpression1898);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_OrExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:928:1: ( () otherlv_2= KEYWORD_25 ( (lv_rightExpr_3_0= ruleOrExpression ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==KEYWORD_25) ) {
                int LA21_1 = input.LA(2);

                if ( (synpred24_InternalPPParser()) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:928:2: () otherlv_2= KEYWORD_25 ( (lv_rightExpr_3_0= ruleOrExpression ) )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:928:2: ()
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:929:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getAppendExpressionAccess().getAppendExpressionLeftExprAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_ruleAppendExpression1923); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAppendExpressionAccess().getPlusSignEqualsSignKeyword_1_1());
                          
                    }
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:942:1: ( (lv_rightExpr_3_0= ruleOrExpression ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:943:1: (lv_rightExpr_3_0= ruleOrExpression )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:943:1: (lv_rightExpr_3_0= ruleOrExpression )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:944:3: lv_rightExpr_3_0= ruleOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAppendExpressionAccess().getRightExprOrExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOrExpression_in_ruleAppendExpression1943);
                    lv_rightExpr_3_0=ruleOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAppendExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"rightExpr",
                              		lv_rightExpr_3_0, 
                              		"OrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAppendExpression"


    // $ANTLR start "entryRuleOrExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:968:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:969:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:970:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression1980);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression1990); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:977:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () otherlv_2= KEYWORD_44 ( (lv_rightExpr_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpression_0 = null;

        EObject lv_rightExpr_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:980:28: ( (this_AndExpression_0= ruleAndExpression ( () otherlv_2= KEYWORD_44 ( (lv_rightExpr_3_0= ruleAndExpression ) ) )* ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:981:1: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= KEYWORD_44 ( (lv_rightExpr_3_0= ruleAndExpression ) ) )* )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:981:1: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= KEYWORD_44 ( (lv_rightExpr_3_0= ruleAndExpression ) ) )* )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:982:2: this_AndExpression_0= ruleAndExpression ( () otherlv_2= KEYWORD_44 ( (lv_rightExpr_3_0= ruleAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression2040);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_AndExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:993:1: ( () otherlv_2= KEYWORD_44 ( (lv_rightExpr_3_0= ruleAndExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==KEYWORD_44) ) {
                    int LA22_2 = input.LA(2);

                    if ( (synpred25_InternalPPParser()) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:993:2: () otherlv_2= KEYWORD_44 ( (lv_rightExpr_3_0= ruleAndExpression ) )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:993:2: ()
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:994:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getOrExpressionAccess().getOrExpressionLeftExprAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleOrExpression2065); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getOrExpressionAccess().getOrKeyword_1_1());
            	          
            	    }
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1007:1: ( (lv_rightExpr_3_0= ruleAndExpression ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1008:1: (lv_rightExpr_3_0= ruleAndExpression )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1008:1: (lv_rightExpr_3_0= ruleAndExpression )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1009:3: lv_rightExpr_3_0= ruleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrExpressionAccess().getRightExprAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression2085);
            	    lv_rightExpr_3_0=ruleAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightExpr",
            	              		lv_rightExpr_3_0, 
            	              		"AndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1033:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1034:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1035:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression2122);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression2132); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1042:1: ruleAndExpression returns [EObject current=null] : (this_RelationalExpression_0= ruleRelationalExpression ( () otherlv_2= KEYWORD_49 ( (lv_rightExpr_3_0= ruleRelationalExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_RelationalExpression_0 = null;

        EObject lv_rightExpr_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1045:28: ( (this_RelationalExpression_0= ruleRelationalExpression ( () otherlv_2= KEYWORD_49 ( (lv_rightExpr_3_0= ruleRelationalExpression ) ) )* ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1046:1: (this_RelationalExpression_0= ruleRelationalExpression ( () otherlv_2= KEYWORD_49 ( (lv_rightExpr_3_0= ruleRelationalExpression ) ) )* )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1046:1: (this_RelationalExpression_0= ruleRelationalExpression ( () otherlv_2= KEYWORD_49 ( (lv_rightExpr_3_0= ruleRelationalExpression ) ) )* )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1047:2: this_RelationalExpression_0= ruleRelationalExpression ( () otherlv_2= KEYWORD_49 ( (lv_rightExpr_3_0= ruleRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndExpressionAccess().getRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleRelationalExpression_in_ruleAndExpression2182);
            this_RelationalExpression_0=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_RelationalExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1058:1: ( () otherlv_2= KEYWORD_49 ( (lv_rightExpr_3_0= ruleRelationalExpression ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==KEYWORD_49) ) {
                    int LA23_2 = input.LA(2);

                    if ( (synpred26_InternalPPParser()) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1058:2: () otherlv_2= KEYWORD_49 ( (lv_rightExpr_3_0= ruleRelationalExpression ) )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1058:2: ()
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1059:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAndExpressionAccess().getAndExpressionLeftExprAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_ruleAndExpression2207); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getAndKeyword_1_1());
            	          
            	    }
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1072:1: ( (lv_rightExpr_3_0= ruleRelationalExpression ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1073:1: (lv_rightExpr_3_0= ruleRelationalExpression )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1073:1: (lv_rightExpr_3_0= ruleRelationalExpression )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1074:3: lv_rightExpr_3_0= ruleRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndExpressionAccess().getRightExprRelationalExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRelationalExpression_in_ruleAndExpression2227);
            	    lv_rightExpr_3_0=ruleRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightExpr",
            	              		lv_rightExpr_3_0, 
            	              		"RelationalExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleRelationalOperator"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1098:1: entryRuleRelationalOperator returns [String current=null] : iv_ruleRelationalOperator= ruleRelationalOperator EOF ;
    public final String entryRuleRelationalOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelationalOperator = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1099:1: (iv_ruleRelationalOperator= ruleRelationalOperator EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1100:2: iv_ruleRelationalOperator= ruleRelationalOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleRelationalOperator_in_entryRuleRelationalOperator2265);
            iv_ruleRelationalOperator=ruleRelationalOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalOperator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalOperator2276); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRelationalOperator"


    // $ANTLR start "ruleRelationalOperator"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1107:1: ruleRelationalOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_36 | kw= KEYWORD_30 | kw= KEYWORD_15 | kw= KEYWORD_13 ) ;
    public final AntlrDatatypeRuleToken ruleRelationalOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1111:6: ( (kw= KEYWORD_36 | kw= KEYWORD_30 | kw= KEYWORD_15 | kw= KEYWORD_13 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1112:1: (kw= KEYWORD_36 | kw= KEYWORD_30 | kw= KEYWORD_15 | kw= KEYWORD_13 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1112:1: (kw= KEYWORD_36 | kw= KEYWORD_30 | kw= KEYWORD_15 | kw= KEYWORD_13 )
            int alt24=4;
            switch ( input.LA(1) ) {
            case KEYWORD_36:
                {
                alt24=1;
                }
                break;
            case KEYWORD_30:
                {
                alt24=2;
                }
                break;
            case KEYWORD_15:
                {
                alt24=3;
                }
                break;
            case KEYWORD_13:
                {
                alt24=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1113:2: kw= KEYWORD_36
                    {
                    kw=(Token)match(input,KEYWORD_36,FOLLOW_KEYWORD_36_in_ruleRelationalOperator2314); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1120:2: kw= KEYWORD_30
                    {
                    kw=(Token)match(input,KEYWORD_30,FOLLOW_KEYWORD_30_in_ruleRelationalOperator2333); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1127:2: kw= KEYWORD_15
                    {
                    kw=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleRelationalOperator2352); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1134:2: kw= KEYWORD_13
                    {
                    kw=(Token)match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleRelationalOperator2371); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getLessThanSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
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
    // $ANTLR end "ruleRelationalOperator"


    // $ANTLR start "entryRuleRelationalExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1147:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1148:2: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1149:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression2410);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalExpression2420); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRelationalExpression"


    // $ANTLR start "ruleRelationalExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1156:1: ruleRelationalExpression returns [EObject current=null] : (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_opName_2_0= ruleRelationalOperator ) ) ( (lv_rightExpr_3_0= ruleEqualityExpression ) ) )* ) ;
    public final EObject ruleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EqualityExpression_0 = null;

        AntlrDatatypeRuleToken lv_opName_2_0 = null;

        EObject lv_rightExpr_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1159:28: ( (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_opName_2_0= ruleRelationalOperator ) ) ( (lv_rightExpr_3_0= ruleEqualityExpression ) ) )* ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1160:1: (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_opName_2_0= ruleRelationalOperator ) ) ( (lv_rightExpr_3_0= ruleEqualityExpression ) ) )* )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1160:1: (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_opName_2_0= ruleRelationalOperator ) ) ( (lv_rightExpr_3_0= ruleEqualityExpression ) ) )* )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1161:2: this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_opName_2_0= ruleRelationalOperator ) ) ( (lv_rightExpr_3_0= ruleEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRelationalExpressionAccess().getEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleEqualityExpression_in_ruleRelationalExpression2470);
            this_EqualityExpression_0=ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_EqualityExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1172:1: ( () ( (lv_opName_2_0= ruleRelationalOperator ) ) ( (lv_rightExpr_3_0= ruleEqualityExpression ) ) )*
            loop25:
            do {
                int alt25=2;
                switch ( input.LA(1) ) {
                case KEYWORD_36:
                    {
                    int LA25_2 = input.LA(2);

                    if ( (synpred30_InternalPPParser()) ) {
                        alt25=1;
                    }


                    }
                    break;
                case KEYWORD_30:
                    {
                    int LA25_3 = input.LA(2);

                    if ( (synpred30_InternalPPParser()) ) {
                        alt25=1;
                    }


                    }
                    break;
                case KEYWORD_15:
                    {
                    int LA25_4 = input.LA(2);

                    if ( (synpred30_InternalPPParser()) ) {
                        alt25=1;
                    }


                    }
                    break;
                case KEYWORD_13:
                    {
                    int LA25_5 = input.LA(2);

                    if ( (synpred30_InternalPPParser()) ) {
                        alt25=1;
                    }


                    }
                    break;

                }

                switch (alt25) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1172:2: () ( (lv_opName_2_0= ruleRelationalOperator ) ) ( (lv_rightExpr_3_0= ruleEqualityExpression ) )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1172:2: ()
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1173:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftExprAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1181:2: ( (lv_opName_2_0= ruleRelationalOperator ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1182:1: (lv_opName_2_0= ruleRelationalOperator )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1182:1: (lv_opName_2_0= ruleRelationalOperator )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1183:3: lv_opName_2_0= ruleRelationalOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOpNameRelationalOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRelationalOperator_in_ruleRelationalExpression2503);
            	    lv_opName_2_0=ruleRelationalOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"opName",
            	              		lv_opName_2_0, 
            	              		"RelationalOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1199:2: ( (lv_rightExpr_3_0= ruleEqualityExpression ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1200:1: (lv_rightExpr_3_0= ruleEqualityExpression )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1200:1: (lv_rightExpr_3_0= ruleEqualityExpression )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1201:3: lv_rightExpr_3_0= ruleEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightExprEqualityExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEqualityExpression_in_ruleRelationalExpression2524);
            	    lv_rightExpr_3_0=ruleEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightExpr",
            	              		lv_rightExpr_3_0, 
            	              		"EqualityExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleEqualityOperator"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1225:1: entryRuleEqualityOperator returns [String current=null] : iv_ruleEqualityOperator= ruleEqualityOperator EOF ;
    public final String entryRuleEqualityOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEqualityOperator = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1226:1: (iv_ruleEqualityOperator= ruleEqualityOperator EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1227:2: iv_ruleEqualityOperator= ruleEqualityOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualityOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleEqualityOperator_in_entryRuleEqualityOperator2562);
            iv_ruleEqualityOperator=ruleEqualityOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualityOperator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualityOperator2573); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEqualityOperator"


    // $ANTLR start "ruleEqualityOperator"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1234:1: ruleEqualityOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_33 | kw= KEYWORD_22 ) ;
    public final AntlrDatatypeRuleToken ruleEqualityOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1238:6: ( (kw= KEYWORD_33 | kw= KEYWORD_22 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1239:1: (kw= KEYWORD_33 | kw= KEYWORD_22 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1239:1: (kw= KEYWORD_33 | kw= KEYWORD_22 )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==KEYWORD_33) ) {
                alt26=1;
            }
            else if ( (LA26_0==KEYWORD_22) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1240:2: kw= KEYWORD_33
                    {
                    kw=(Token)match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_ruleEqualityOperator2611); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEqualityOperatorAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1247:2: kw= KEYWORD_22
                    {
                    kw=(Token)match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleEqualityOperator2630); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEqualityOperatorAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
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
    // $ANTLR end "ruleEqualityOperator"


    // $ANTLR start "entryRuleEqualityExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1260:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1261:2: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1262:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEqualityExpression_in_entryRuleEqualityExpression2669);
            iv_ruleEqualityExpression=ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualityExpression2679); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEqualityExpression"


    // $ANTLR start "ruleEqualityExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1269:1: ruleEqualityExpression returns [EObject current=null] : (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_opName_2_0= ruleEqualityOperator ) ) ( (lv_rightExpr_3_0= ruleShiftExpression ) ) )* ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ShiftExpression_0 = null;

        AntlrDatatypeRuleToken lv_opName_2_0 = null;

        EObject lv_rightExpr_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1272:28: ( (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_opName_2_0= ruleEqualityOperator ) ) ( (lv_rightExpr_3_0= ruleShiftExpression ) ) )* ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1273:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_opName_2_0= ruleEqualityOperator ) ) ( (lv_rightExpr_3_0= ruleShiftExpression ) ) )* )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1273:1: (this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_opName_2_0= ruleEqualityOperator ) ) ( (lv_rightExpr_3_0= ruleShiftExpression ) ) )* )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1274:2: this_ShiftExpression_0= ruleShiftExpression ( () ( (lv_opName_2_0= ruleEqualityOperator ) ) ( (lv_rightExpr_3_0= ruleShiftExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEqualityExpressionAccess().getShiftExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_ruleEqualityExpression2729);
            this_ShiftExpression_0=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_ShiftExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1285:1: ( () ( (lv_opName_2_0= ruleEqualityOperator ) ) ( (lv_rightExpr_3_0= ruleShiftExpression ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==KEYWORD_33) ) {
                    int LA27_2 = input.LA(2);

                    if ( (synpred32_InternalPPParser()) ) {
                        alt27=1;
                    }


                }
                else if ( (LA27_0==KEYWORD_22) ) {
                    int LA27_3 = input.LA(2);

                    if ( (synpred32_InternalPPParser()) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1285:2: () ( (lv_opName_2_0= ruleEqualityOperator ) ) ( (lv_rightExpr_3_0= ruleShiftExpression ) )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1285:2: ()
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1286:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftExprAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1294:2: ( (lv_opName_2_0= ruleEqualityOperator ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1295:1: (lv_opName_2_0= ruleEqualityOperator )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1295:1: (lv_opName_2_0= ruleEqualityOperator )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1296:3: lv_opName_2_0= ruleEqualityOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEqualityExpressionAccess().getOpNameEqualityOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEqualityOperator_in_ruleEqualityExpression2762);
            	    lv_opName_2_0=ruleEqualityOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"opName",
            	              		lv_opName_2_0, 
            	              		"EqualityOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1312:2: ( (lv_rightExpr_3_0= ruleShiftExpression ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1313:1: (lv_rightExpr_3_0= ruleShiftExpression )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1313:1: (lv_rightExpr_3_0= ruleShiftExpression )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1314:3: lv_rightExpr_3_0= ruleShiftExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRightExprShiftExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftExpression_in_ruleEqualityExpression2783);
            	    lv_rightExpr_3_0=ruleShiftExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightExpr",
            	              		lv_rightExpr_3_0, 
            	              		"ShiftExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEqualityExpression"


    // $ANTLR start "entryRuleShiftOperator"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1338:1: entryRuleShiftOperator returns [String current=null] : iv_ruleShiftOperator= ruleShiftOperator EOF ;
    public final String entryRuleShiftOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleShiftOperator = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1339:1: (iv_ruleShiftOperator= ruleShiftOperator EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1340:2: iv_ruleShiftOperator= ruleShiftOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleShiftOperator_in_entryRuleShiftOperator2821);
            iv_ruleShiftOperator=ruleShiftOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftOperator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleShiftOperator2832); if (state.failed) return current;

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
    // $ANTLR end "entryRuleShiftOperator"


    // $ANTLR start "ruleShiftOperator"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1347:1: ruleShiftOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_29 | kw= KEYWORD_37 ) ;
    public final AntlrDatatypeRuleToken ruleShiftOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1351:6: ( (kw= KEYWORD_29 | kw= KEYWORD_37 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1352:1: (kw= KEYWORD_29 | kw= KEYWORD_37 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1352:1: (kw= KEYWORD_29 | kw= KEYWORD_37 )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==KEYWORD_29) ) {
                alt28=1;
            }
            else if ( (LA28_0==KEYWORD_37) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1353:2: kw= KEYWORD_29
                    {
                    kw=(Token)match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_ruleShiftOperator2870); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getShiftOperatorAccess().getLessThanSignLessThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1360:2: kw= KEYWORD_37
                    {
                    kw=(Token)match(input,KEYWORD_37,FOLLOW_KEYWORD_37_in_ruleShiftOperator2889); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getShiftOperatorAccess().getGreaterThanSignGreaterThanSignKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
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
    // $ANTLR end "ruleShiftOperator"


    // $ANTLR start "entryRuleShiftExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1373:1: entryRuleShiftExpression returns [EObject current=null] : iv_ruleShiftExpression= ruleShiftExpression EOF ;
    public final EObject entryRuleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1374:2: (iv_ruleShiftExpression= ruleShiftExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1375:2: iv_ruleShiftExpression= ruleShiftExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression2928);
            iv_ruleShiftExpression=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleShiftExpression2938); if (state.failed) return current;

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
    // $ANTLR end "entryRuleShiftExpression"


    // $ANTLR start "ruleShiftExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1382:1: ruleShiftExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_opName_2_0= ruleShiftOperator ) ) ( (lv_rightExpr_3_0= ruleAdditiveExpression ) ) )* ) ;
    public final EObject ruleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;

        AntlrDatatypeRuleToken lv_opName_2_0 = null;

        EObject lv_rightExpr_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1385:28: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_opName_2_0= ruleShiftOperator ) ) ( (lv_rightExpr_3_0= ruleAdditiveExpression ) ) )* ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1386:1: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_opName_2_0= ruleShiftOperator ) ) ( (lv_rightExpr_3_0= ruleAdditiveExpression ) ) )* )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1386:1: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_opName_2_0= ruleShiftOperator ) ) ( (lv_rightExpr_3_0= ruleAdditiveExpression ) ) )* )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1387:2: this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_opName_2_0= ruleShiftOperator ) ) ( (lv_rightExpr_3_0= ruleAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getShiftExpressionAccess().getAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleShiftExpression2988);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_AdditiveExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1398:1: ( () ( (lv_opName_2_0= ruleShiftOperator ) ) ( (lv_rightExpr_3_0= ruleAdditiveExpression ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==KEYWORD_29) ) {
                    int LA29_2 = input.LA(2);

                    if ( (synpred34_InternalPPParser()) ) {
                        alt29=1;
                    }


                }
                else if ( (LA29_0==KEYWORD_37) ) {
                    int LA29_3 = input.LA(2);

                    if ( (synpred34_InternalPPParser()) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1398:2: () ( (lv_opName_2_0= ruleShiftOperator ) ) ( (lv_rightExpr_3_0= ruleAdditiveExpression ) )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1398:2: ()
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1399:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftExprAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1407:2: ( (lv_opName_2_0= ruleShiftOperator ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1408:1: (lv_opName_2_0= ruleShiftOperator )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1408:1: (lv_opName_2_0= ruleShiftOperator )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1409:3: lv_opName_2_0= ruleShiftOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getOpNameShiftOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftOperator_in_ruleShiftExpression3021);
            	    lv_opName_2_0=ruleShiftOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getShiftExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"opName",
            	              		lv_opName_2_0, 
            	              		"ShiftOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1425:2: ( (lv_rightExpr_3_0= ruleAdditiveExpression ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1426:1: (lv_rightExpr_3_0= ruleAdditiveExpression )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1426:1: (lv_rightExpr_3_0= ruleAdditiveExpression )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1427:3: lv_rightExpr_3_0= ruleAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getRightExprAdditiveExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleShiftExpression3042);
            	    lv_rightExpr_3_0=ruleAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getShiftExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightExpr",
            	              		lv_rightExpr_3_0, 
            	              		"AdditiveExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleShiftExpression"


    // $ANTLR start "entryRuleAdditiveOperator"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1451:1: entryRuleAdditiveOperator returns [String current=null] : iv_ruleAdditiveOperator= ruleAdditiveOperator EOF ;
    public final String entryRuleAdditiveOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAdditiveOperator = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1452:1: (iv_ruleAdditiveOperator= ruleAdditiveOperator EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1453:2: iv_ruleAdditiveOperator= ruleAdditiveOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAdditiveOperator_in_entryRuleAdditiveOperator3080);
            iv_ruleAdditiveOperator=ruleAdditiveOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveOperator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveOperator3091); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAdditiveOperator"


    // $ANTLR start "ruleAdditiveOperator"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1460:1: ruleAdditiveOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_7 | kw= KEYWORD_9 ) ;
    public final AntlrDatatypeRuleToken ruleAdditiveOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1464:6: ( (kw= KEYWORD_7 | kw= KEYWORD_9 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1465:1: (kw= KEYWORD_7 | kw= KEYWORD_9 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1465:1: (kw= KEYWORD_7 | kw= KEYWORD_9 )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==KEYWORD_7) ) {
                alt30=1;
            }
            else if ( (LA30_0==KEYWORD_9) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1466:2: kw= KEYWORD_7
                    {
                    kw=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleAdditiveOperator3129); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAdditiveOperatorAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1473:2: kw= KEYWORD_9
                    {
                    kw=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleAdditiveOperator3148); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAdditiveOperatorAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
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
    // $ANTLR end "ruleAdditiveOperator"


    // $ANTLR start "entryRuleAdditiveExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1486:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1487:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1488:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression3187);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveExpression3197); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1495:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_opName_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpr_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        AntlrDatatypeRuleToken lv_opName_2_0 = null;

        EObject lv_rightExpr_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1498:28: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_opName_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpr_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1499:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_opName_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpr_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1499:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_opName_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpr_3_0= ruleMultiplicativeExpression ) ) )* )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1500:2: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_opName_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpr_3_0= ruleMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression3247);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_MultiplicativeExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1511:1: ( () ( (lv_opName_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpr_3_0= ruleMultiplicativeExpression ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==KEYWORD_7) ) {
                    int LA31_2 = input.LA(2);

                    if ( (synpred36_InternalPPParser()) ) {
                        alt31=1;
                    }


                }
                else if ( (LA31_0==KEYWORD_9) ) {
                    int LA31_3 = input.LA(2);

                    if ( (synpred36_InternalPPParser()) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1511:2: () ( (lv_opName_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpr_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1511:2: ()
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1512:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftExprAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1520:2: ( (lv_opName_2_0= ruleAdditiveOperator ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1521:1: (lv_opName_2_0= ruleAdditiveOperator )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1521:1: (lv_opName_2_0= ruleAdditiveOperator )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1522:3: lv_opName_2_0= ruleAdditiveOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOpNameAdditiveOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAdditiveOperator_in_ruleAdditiveExpression3280);
            	    lv_opName_2_0=ruleAdditiveOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"opName",
            	              		lv_opName_2_0, 
            	              		"AdditiveOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1538:2: ( (lv_rightExpr_3_0= ruleMultiplicativeExpression ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1539:1: (lv_rightExpr_3_0= ruleMultiplicativeExpression )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1539:1: (lv_rightExpr_3_0= ruleMultiplicativeExpression )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1540:3: lv_rightExpr_3_0= ruleMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightExprMultiplicativeExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression3301);
            	    lv_rightExpr_3_0=ruleMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightExpr",
            	              		lv_rightExpr_3_0, 
            	              		"MultiplicativeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleMultiplicativeOperator"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1564:1: entryRuleMultiplicativeOperator returns [String current=null] : iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF ;
    public final String entryRuleMultiplicativeOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultiplicativeOperator = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1565:1: (iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1566:2: iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicativeOperator_in_entryRuleMultiplicativeOperator3339);
            iv_ruleMultiplicativeOperator=ruleMultiplicativeOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicativeOperator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicativeOperator3350); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultiplicativeOperator"


    // $ANTLR start "ruleMultiplicativeOperator"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1573:1: ruleMultiplicativeOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_6 | kw= KEYWORD_10 ) ;
    public final AntlrDatatypeRuleToken ruleMultiplicativeOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1577:6: ( (kw= KEYWORD_6 | kw= KEYWORD_10 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1578:1: (kw= KEYWORD_6 | kw= KEYWORD_10 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1578:1: (kw= KEYWORD_6 | kw= KEYWORD_10 )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==KEYWORD_6) ) {
                alt32=1;
            }
            else if ( (LA32_0==KEYWORD_10) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1579:2: kw= KEYWORD_6
                    {
                    kw=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleMultiplicativeOperator3388); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMultiplicativeOperatorAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1586:2: kw= KEYWORD_10
                    {
                    kw=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleMultiplicativeOperator3407); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMultiplicativeOperatorAccess().getSolidusKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
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
    // $ANTLR end "ruleMultiplicativeOperator"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1599:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1600:2: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1601:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression3446);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicativeExpression3456); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1608:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_MatchingExpression_0= ruleMatchingExpression ( () ( (lv_opName_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpr_3_0= ruleMatchingExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MatchingExpression_0 = null;

        AntlrDatatypeRuleToken lv_opName_2_0 = null;

        EObject lv_rightExpr_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1611:28: ( (this_MatchingExpression_0= ruleMatchingExpression ( () ( (lv_opName_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpr_3_0= ruleMatchingExpression ) ) )* ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1612:1: (this_MatchingExpression_0= ruleMatchingExpression ( () ( (lv_opName_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpr_3_0= ruleMatchingExpression ) ) )* )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1612:1: (this_MatchingExpression_0= ruleMatchingExpression ( () ( (lv_opName_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpr_3_0= ruleMatchingExpression ) ) )* )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1613:2: this_MatchingExpression_0= ruleMatchingExpression ( () ( (lv_opName_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpr_3_0= ruleMatchingExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getMatchingExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMatchingExpression_in_ruleMultiplicativeExpression3506);
            this_MatchingExpression_0=ruleMatchingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_MatchingExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1624:1: ( () ( (lv_opName_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpr_3_0= ruleMatchingExpression ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==KEYWORD_6) ) {
                    int LA33_2 = input.LA(2);

                    if ( (synpred38_InternalPPParser()) ) {
                        alt33=1;
                    }


                }
                else if ( (LA33_0==KEYWORD_10) ) {
                    int LA33_3 = input.LA(2);

                    if ( (synpred38_InternalPPParser()) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1624:2: () ( (lv_opName_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpr_3_0= ruleMatchingExpression ) )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1624:2: ()
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1625:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftExprAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1633:2: ( (lv_opName_2_0= ruleMultiplicativeOperator ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1634:1: (lv_opName_2_0= ruleMultiplicativeOperator )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1634:1: (lv_opName_2_0= ruleMultiplicativeOperator )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1635:3: lv_opName_2_0= ruleMultiplicativeOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOpNameMultiplicativeOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeOperator_in_ruleMultiplicativeExpression3539);
            	    lv_opName_2_0=ruleMultiplicativeOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"opName",
            	              		lv_opName_2_0, 
            	              		"MultiplicativeOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1651:2: ( (lv_rightExpr_3_0= ruleMatchingExpression ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1652:1: (lv_rightExpr_3_0= ruleMatchingExpression )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1652:1: (lv_rightExpr_3_0= ruleMatchingExpression )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1653:3: lv_rightExpr_3_0= ruleMatchingExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightExprMatchingExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMatchingExpression_in_ruleMultiplicativeExpression3560);
            	    lv_rightExpr_3_0=ruleMatchingExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightExpr",
            	              		lv_rightExpr_3_0, 
            	              		"MatchingExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleMatchingOperator"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1677:1: entryRuleMatchingOperator returns [String current=null] : iv_ruleMatchingOperator= ruleMatchingOperator EOF ;
    public final String entryRuleMatchingOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMatchingOperator = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1678:1: (iv_ruleMatchingOperator= ruleMatchingOperator EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1679:2: iv_ruleMatchingOperator= ruleMatchingOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMatchingOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleMatchingOperator_in_entryRuleMatchingOperator3598);
            iv_ruleMatchingOperator=ruleMatchingOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMatchingOperator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatchingOperator3609); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMatchingOperator"


    // $ANTLR start "ruleMatchingOperator"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1686:1: ruleMatchingOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_35 | kw= KEYWORD_23 ) ;
    public final AntlrDatatypeRuleToken ruleMatchingOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1690:6: ( (kw= KEYWORD_35 | kw= KEYWORD_23 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1691:1: (kw= KEYWORD_35 | kw= KEYWORD_23 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1691:1: (kw= KEYWORD_35 | kw= KEYWORD_23 )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==KEYWORD_35) ) {
                alt34=1;
            }
            else if ( (LA34_0==KEYWORD_23) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1692:2: kw= KEYWORD_35
                    {
                    kw=(Token)match(input,KEYWORD_35,FOLLOW_KEYWORD_35_in_ruleMatchingOperator3647); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMatchingOperatorAccess().getEqualsSignTildeKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1699:2: kw= KEYWORD_23
                    {
                    kw=(Token)match(input,KEYWORD_23,FOLLOW_KEYWORD_23_in_ruleMatchingOperator3666); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMatchingOperatorAccess().getExclamationMarkTildeKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
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
    // $ANTLR end "ruleMatchingOperator"


    // $ANTLR start "entryRuleMatchingExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1712:1: entryRuleMatchingExpression returns [EObject current=null] : iv_ruleMatchingExpression= ruleMatchingExpression EOF ;
    public final EObject entryRuleMatchingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatchingExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1713:2: (iv_ruleMatchingExpression= ruleMatchingExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1714:2: iv_ruleMatchingExpression= ruleMatchingExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMatchingExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMatchingExpression_in_entryRuleMatchingExpression3705);
            iv_ruleMatchingExpression=ruleMatchingExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMatchingExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatchingExpression3715); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMatchingExpression"


    // $ANTLR start "ruleMatchingExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1721:1: ruleMatchingExpression returns [EObject current=null] : (this_InExpression_0= ruleInExpression ( () ( (lv_opName_2_0= ruleMatchingOperator ) ) ( (lv_rightExpr_3_0= ruleLiteralRegex ) ) )* ) ;
    public final EObject ruleMatchingExpression() throws RecognitionException {
        EObject current = null;

        EObject this_InExpression_0 = null;

        AntlrDatatypeRuleToken lv_opName_2_0 = null;

        EObject lv_rightExpr_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1724:28: ( (this_InExpression_0= ruleInExpression ( () ( (lv_opName_2_0= ruleMatchingOperator ) ) ( (lv_rightExpr_3_0= ruleLiteralRegex ) ) )* ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1725:1: (this_InExpression_0= ruleInExpression ( () ( (lv_opName_2_0= ruleMatchingOperator ) ) ( (lv_rightExpr_3_0= ruleLiteralRegex ) ) )* )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1725:1: (this_InExpression_0= ruleInExpression ( () ( (lv_opName_2_0= ruleMatchingOperator ) ) ( (lv_rightExpr_3_0= ruleLiteralRegex ) ) )* )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1726:2: this_InExpression_0= ruleInExpression ( () ( (lv_opName_2_0= ruleMatchingOperator ) ) ( (lv_rightExpr_3_0= ruleLiteralRegex ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMatchingExpressionAccess().getInExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleInExpression_in_ruleMatchingExpression3765);
            this_InExpression_0=ruleInExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_InExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1737:1: ( () ( (lv_opName_2_0= ruleMatchingOperator ) ) ( (lv_rightExpr_3_0= ruleLiteralRegex ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==KEYWORD_35) ) {
                    int LA35_2 = input.LA(2);

                    if ( (synpred40_InternalPPParser()) ) {
                        alt35=1;
                    }


                }
                else if ( (LA35_0==KEYWORD_23) ) {
                    int LA35_3 = input.LA(2);

                    if ( (synpred40_InternalPPParser()) ) {
                        alt35=1;
                    }


                }


                switch (alt35) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1737:2: () ( (lv_opName_2_0= ruleMatchingOperator ) ) ( (lv_rightExpr_3_0= ruleLiteralRegex ) )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1737:2: ()
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1738:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMatchingExpressionAccess().getMatchingExpressionLeftExprAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1746:2: ( (lv_opName_2_0= ruleMatchingOperator ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1747:1: (lv_opName_2_0= ruleMatchingOperator )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1747:1: (lv_opName_2_0= ruleMatchingOperator )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1748:3: lv_opName_2_0= ruleMatchingOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMatchingExpressionAccess().getOpNameMatchingOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMatchingOperator_in_ruleMatchingExpression3798);
            	    lv_opName_2_0=ruleMatchingOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMatchingExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"opName",
            	              		lv_opName_2_0, 
            	              		"MatchingOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1764:2: ( (lv_rightExpr_3_0= ruleLiteralRegex ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1765:1: (lv_rightExpr_3_0= ruleLiteralRegex )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1765:1: (lv_rightExpr_3_0= ruleLiteralRegex )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1766:3: lv_rightExpr_3_0= ruleLiteralRegex
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMatchingExpressionAccess().getRightExprLiteralRegexParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLiteralRegex_in_ruleMatchingExpression3819);
            	    lv_rightExpr_3_0=ruleLiteralRegex();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMatchingExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightExpr",
            	              		lv_rightExpr_3_0, 
            	              		"LiteralRegex");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

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

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMatchingExpression"


    // $ANTLR start "entryRuleInExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1790:1: entryRuleInExpression returns [EObject current=null] : iv_ruleInExpression= ruleInExpression EOF ;
    public final EObject entryRuleInExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1791:2: (iv_ruleInExpression= ruleInExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1792:2: iv_ruleInExpression= ruleInExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleInExpression_in_entryRuleInExpression3856);
            iv_ruleInExpression=ruleInExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInExpression3866); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInExpression"


    // $ANTLR start "ruleInExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1799:1: ruleInExpression returns [EObject current=null] : (this_UnaryOrHigherExpression_0= ruleUnaryOrHigherExpression ( () ( (lv_opName_2_0= KEYWORD_43 ) ) ( (lv_rightExpr_3_0= ruleUnaryOrHigherExpression ) ) )* ) ;
    public final EObject ruleInExpression() throws RecognitionException {
        EObject current = null;

        Token lv_opName_2_0=null;
        EObject this_UnaryOrHigherExpression_0 = null;

        EObject lv_rightExpr_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1802:28: ( (this_UnaryOrHigherExpression_0= ruleUnaryOrHigherExpression ( () ( (lv_opName_2_0= KEYWORD_43 ) ) ( (lv_rightExpr_3_0= ruleUnaryOrHigherExpression ) ) )* ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1803:1: (this_UnaryOrHigherExpression_0= ruleUnaryOrHigherExpression ( () ( (lv_opName_2_0= KEYWORD_43 ) ) ( (lv_rightExpr_3_0= ruleUnaryOrHigherExpression ) ) )* )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1803:1: (this_UnaryOrHigherExpression_0= ruleUnaryOrHigherExpression ( () ( (lv_opName_2_0= KEYWORD_43 ) ) ( (lv_rightExpr_3_0= ruleUnaryOrHigherExpression ) ) )* )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1804:2: this_UnaryOrHigherExpression_0= ruleUnaryOrHigherExpression ( () ( (lv_opName_2_0= KEYWORD_43 ) ) ( (lv_rightExpr_3_0= ruleUnaryOrHigherExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getInExpressionAccess().getUnaryOrHigherExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleUnaryOrHigherExpression_in_ruleInExpression3916);
            this_UnaryOrHigherExpression_0=ruleUnaryOrHigherExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_UnaryOrHigherExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1815:1: ( () ( (lv_opName_2_0= KEYWORD_43 ) ) ( (lv_rightExpr_3_0= ruleUnaryOrHigherExpression ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==KEYWORD_43) ) {
                    int LA36_2 = input.LA(2);

                    if ( (synpred41_InternalPPParser()) ) {
                        alt36=1;
                    }


                }


                switch (alt36) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1815:2: () ( (lv_opName_2_0= KEYWORD_43 ) ) ( (lv_rightExpr_3_0= ruleUnaryOrHigherExpression ) )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1815:2: ()
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1816:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getInExpressionAccess().getInExpressionLeftExprAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1824:2: ( (lv_opName_2_0= KEYWORD_43 ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1825:1: (lv_opName_2_0= KEYWORD_43 )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1825:1: (lv_opName_2_0= KEYWORD_43 )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1826:3: lv_opName_2_0= KEYWORD_43
            	    {
            	    lv_opName_2_0=(Token)match(input,KEYWORD_43,FOLLOW_KEYWORD_43_in_ruleInExpression3947); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_opName_2_0, grammarAccess.getInExpressionAccess().getOpNameInKeyword_1_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getInExpressionRule());
            	      	        }
            	             		setWithLastConsumed(current, "opName", lv_opName_2_0, "in");
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1840:2: ( (lv_rightExpr_3_0= ruleUnaryOrHigherExpression ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1841:1: (lv_rightExpr_3_0= ruleUnaryOrHigherExpression )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1841:1: (lv_rightExpr_3_0= ruleUnaryOrHigherExpression )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1842:3: lv_rightExpr_3_0= ruleUnaryOrHigherExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInExpressionAccess().getRightExprUnaryOrHigherExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUnaryOrHigherExpression_in_ruleInExpression3979);
            	    lv_rightExpr_3_0=ruleUnaryOrHigherExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightExpr",
            	              		lv_rightExpr_3_0, 
            	              		"UnaryOrHigherExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleInExpression"


    // $ANTLR start "entryRuleUnaryOrHigherExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1866:1: entryRuleUnaryOrHigherExpression returns [EObject current=null] : iv_ruleUnaryOrHigherExpression= ruleUnaryOrHigherExpression EOF ;
    public final EObject entryRuleUnaryOrHigherExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOrHigherExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1867:2: (iv_ruleUnaryOrHigherExpression= ruleUnaryOrHigherExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1868:2: iv_ruleUnaryOrHigherExpression= ruleUnaryOrHigherExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryOrHigherExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleUnaryOrHigherExpression_in_entryRuleUnaryOrHigherExpression4016);
            iv_ruleUnaryOrHigherExpression=ruleUnaryOrHigherExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryOrHigherExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryOrHigherExpression4026); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnaryOrHigherExpression"


    // $ANTLR start "ruleUnaryOrHigherExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1875:1: ruleUnaryOrHigherExpression returns [EObject current=null] : (this_UnaryMinusExpression_0= ruleUnaryMinusExpression | this_NotExpression_1= ruleNotExpression | this_CollectExpression_2= ruleCollectExpression ) ;
    public final EObject ruleUnaryOrHigherExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryMinusExpression_0 = null;

        EObject this_NotExpression_1 = null;

        EObject this_CollectExpression_2 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1878:28: ( (this_UnaryMinusExpression_0= ruleUnaryMinusExpression | this_NotExpression_1= ruleNotExpression | this_CollectExpression_2= ruleCollectExpression ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1879:1: (this_UnaryMinusExpression_0= ruleUnaryMinusExpression | this_NotExpression_1= ruleNotExpression | this_CollectExpression_2= ruleCollectExpression )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1879:1: (this_UnaryMinusExpression_0= ruleUnaryMinusExpression | this_NotExpression_1= ruleNotExpression | this_CollectExpression_2= ruleCollectExpression )
            int alt37=3;
            switch ( input.LA(1) ) {
            case KEYWORD_9:
                {
                alt37=1;
                }
                break;
            case KEYWORD_1:
                {
                alt37=2;
                }
                break;
            case KEYWORD_61:
            case KEYWORD_59:
            case KEYWORD_60:
            case KEYWORD_55:
            case KEYWORD_57:
            case KEYWORD_58:
            case KEYWORD_51:
            case KEYWORD_53:
            case KEYWORD_54:
            case KEYWORD_24:
            case KEYWORD_42:
            case KEYWORD_2:
            case KEYWORD_3:
            case KEYWORD_4:
            case KEYWORD_17:
            case KEYWORD_18:
            case KEYWORD_20:
            case RULE_DOLLAR_VAR:
            case RULE_WORD_CHARS:
            case RULE_REGULAR_EXPRESSION:
                {
                alt37=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1880:2: this_UnaryMinusExpression_0= ruleUnaryMinusExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryOrHigherExpressionAccess().getUnaryMinusExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnaryMinusExpression_in_ruleUnaryOrHigherExpression4076);
                    this_UnaryMinusExpression_0=ruleUnaryMinusExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_UnaryMinusExpression_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1893:2: this_NotExpression_1= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryOrHigherExpressionAccess().getNotExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNotExpression_in_ruleUnaryOrHigherExpression4106);
                    this_NotExpression_1=ruleNotExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_NotExpression_1;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1906:2: this_CollectExpression_2= ruleCollectExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryOrHigherExpressionAccess().getCollectExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCollectExpression_in_ruleUnaryOrHigherExpression4136);
                    this_CollectExpression_2=ruleCollectExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_CollectExpression_2;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUnaryOrHigherExpression"


    // $ANTLR start "entryRuleUnaryMinusExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1925:1: entryRuleUnaryMinusExpression returns [EObject current=null] : iv_ruleUnaryMinusExpression= ruleUnaryMinusExpression EOF ;
    public final EObject entryRuleUnaryMinusExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryMinusExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1926:2: (iv_ruleUnaryMinusExpression= ruleUnaryMinusExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1927:2: iv_ruleUnaryMinusExpression= ruleUnaryMinusExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryMinusExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleUnaryMinusExpression_in_entryRuleUnaryMinusExpression4170);
            iv_ruleUnaryMinusExpression=ruleUnaryMinusExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryMinusExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryMinusExpression4180); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnaryMinusExpression"


    // $ANTLR start "ruleUnaryMinusExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1934:1: ruleUnaryMinusExpression returns [EObject current=null] : (otherlv_0= KEYWORD_9 ( (lv_expr_1_0= ruleCollectExpression ) ) ) ;
    public final EObject ruleUnaryMinusExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1937:28: ( (otherlv_0= KEYWORD_9 ( (lv_expr_1_0= ruleCollectExpression ) ) ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1938:1: (otherlv_0= KEYWORD_9 ( (lv_expr_1_0= ruleCollectExpression ) ) )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1938:1: (otherlv_0= KEYWORD_9 ( (lv_expr_1_0= ruleCollectExpression ) ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1939:2: otherlv_0= KEYWORD_9 ( (lv_expr_1_0= ruleCollectExpression ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleUnaryMinusExpression4218); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getUnaryMinusExpressionAccess().getHyphenMinusKeyword_0());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1943:1: ( (lv_expr_1_0= ruleCollectExpression ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1944:1: (lv_expr_1_0= ruleCollectExpression )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1944:1: (lv_expr_1_0= ruleCollectExpression )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1945:3: lv_expr_1_0= ruleCollectExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUnaryMinusExpressionAccess().getExprCollectExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCollectExpression_in_ruleUnaryMinusExpression4238);
            lv_expr_1_0=ruleCollectExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUnaryMinusExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expr",
                      		lv_expr_1_0, 
                      		"CollectExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUnaryMinusExpression"


    // $ANTLR start "entryRuleNotExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1969:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1970:2: (iv_ruleNotExpression= ruleNotExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1971:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNotExpression_in_entryRuleNotExpression4273);
            iv_ruleNotExpression=ruleNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotExpression4283); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNotExpression"


    // $ANTLR start "ruleNotExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1978:1: ruleNotExpression returns [EObject current=null] : (otherlv_0= KEYWORD_1 ( (lv_expr_1_0= ruleCollectExpression ) ) ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1981:28: ( (otherlv_0= KEYWORD_1 ( (lv_expr_1_0= ruleCollectExpression ) ) ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1982:1: (otherlv_0= KEYWORD_1 ( (lv_expr_1_0= ruleCollectExpression ) ) )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1982:1: (otherlv_0= KEYWORD_1 ( (lv_expr_1_0= ruleCollectExpression ) ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1983:2: otherlv_0= KEYWORD_1 ( (lv_expr_1_0= ruleCollectExpression ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleNotExpression4321); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNotExpressionAccess().getExclamationMarkKeyword_0());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1987:1: ( (lv_expr_1_0= ruleCollectExpression ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1988:1: (lv_expr_1_0= ruleCollectExpression )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1988:1: (lv_expr_1_0= ruleCollectExpression )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1989:3: lv_expr_1_0= ruleCollectExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNotExpressionAccess().getExprCollectExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCollectExpression_in_ruleNotExpression4341);
            lv_expr_1_0=ruleCollectExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNotExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expr",
                      		lv_expr_1_0, 
                      		"CollectExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNotExpression"


    // $ANTLR start "entryRuleCollectExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2013:1: entryRuleCollectExpression returns [EObject current=null] : iv_ruleCollectExpression= ruleCollectExpression EOF ;
    public final EObject entryRuleCollectExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2014:2: (iv_ruleCollectExpression= ruleCollectExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2015:2: iv_ruleCollectExpression= ruleCollectExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCollectExpression_in_entryRuleCollectExpression4376);
            iv_ruleCollectExpression=ruleCollectExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectExpression4386); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCollectExpression"


    // $ANTLR start "ruleCollectExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2022:1: ruleCollectExpression returns [EObject current=null] : (this_SelectorExpression_0= ruleSelectorExpression ( () ( (lv_query_2_0= ruleCollectQuery ) ) (otherlv_3= KEYWORD_20 ( (lv_attributes_4_0= ruleAttributeOperations ) )? otherlv_5= KEYWORD_21 )? )? ) ;
    public final EObject ruleCollectExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_SelectorExpression_0 = null;

        EObject lv_query_2_0 = null;

        EObject lv_attributes_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2025:28: ( (this_SelectorExpression_0= ruleSelectorExpression ( () ( (lv_query_2_0= ruleCollectQuery ) ) (otherlv_3= KEYWORD_20 ( (lv_attributes_4_0= ruleAttributeOperations ) )? otherlv_5= KEYWORD_21 )? )? ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2026:1: (this_SelectorExpression_0= ruleSelectorExpression ( () ( (lv_query_2_0= ruleCollectQuery ) ) (otherlv_3= KEYWORD_20 ( (lv_attributes_4_0= ruleAttributeOperations ) )? otherlv_5= KEYWORD_21 )? )? )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2026:1: (this_SelectorExpression_0= ruleSelectorExpression ( () ( (lv_query_2_0= ruleCollectQuery ) ) (otherlv_3= KEYWORD_20 ( (lv_attributes_4_0= ruleAttributeOperations ) )? otherlv_5= KEYWORD_21 )? )? )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2027:2: this_SelectorExpression_0= ruleSelectorExpression ( () ( (lv_query_2_0= ruleCollectQuery ) ) (otherlv_3= KEYWORD_20 ( (lv_attributes_4_0= ruleAttributeOperations ) )? otherlv_5= KEYWORD_21 )? )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCollectExpressionAccess().getSelectorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSelectorExpression_in_ruleCollectExpression4436);
            this_SelectorExpression_0=ruleSelectorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_SelectorExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2038:1: ( () ( (lv_query_2_0= ruleCollectQuery ) ) (otherlv_3= KEYWORD_20 ( (lv_attributes_4_0= ruleAttributeOperations ) )? otherlv_5= KEYWORD_21 )? )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==KEYWORD_31) ) {
                int LA40_1 = input.LA(2);

                if ( (synpred46_InternalPPParser()) ) {
                    alt40=1;
                }
            }
            else if ( (LA40_0==KEYWORD_47) ) {
                int LA40_2 = input.LA(2);

                if ( (synpred46_InternalPPParser()) ) {
                    alt40=1;
                }
            }
            switch (alt40) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2038:2: () ( (lv_query_2_0= ruleCollectQuery ) ) (otherlv_3= KEYWORD_20 ( (lv_attributes_4_0= ruleAttributeOperations ) )? otherlv_5= KEYWORD_21 )?
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2038:2: ()
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2039:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getCollectExpressionAccess().getCollectExpressionClassReferenceAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2047:2: ( (lv_query_2_0= ruleCollectQuery ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2048:1: (lv_query_2_0= ruleCollectQuery )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2048:1: (lv_query_2_0= ruleCollectQuery )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2049:3: lv_query_2_0= ruleCollectQuery
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectExpressionAccess().getQueryCollectQueryParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCollectQuery_in_ruleCollectExpression4469);
                    lv_query_2_0=ruleCollectQuery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCollectExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"query",
                              		lv_query_2_0, 
                              		"CollectQuery");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2065:2: (otherlv_3= KEYWORD_20 ( (lv_attributes_4_0= ruleAttributeOperations ) )? otherlv_5= KEYWORD_21 )?
                    int alt39=2;
                    alt39 = dfa39.predict(input);
                    switch (alt39) {
                        case 1 :
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2066:2: otherlv_3= KEYWORD_20 ( (lv_attributes_4_0= ruleAttributeOperations ) )? otherlv_5= KEYWORD_21
                            {
                            otherlv_3=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleCollectExpression4483); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getCollectExpressionAccess().getLeftCurlyBracketKeyword_1_2_0());
                                  
                            }
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2070:1: ( (lv_attributes_4_0= ruleAttributeOperations ) )?
                            int alt38=2;
                            int LA38_0 = input.LA(1);

                            if ( (LA38_0==RULE_WORD_CHARS) ) {
                                alt38=1;
                            }
                            switch (alt38) {
                                case 1 :
                                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2071:1: (lv_attributes_4_0= ruleAttributeOperations )
                                    {
                                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2071:1: (lv_attributes_4_0= ruleAttributeOperations )
                                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2072:3: lv_attributes_4_0= ruleAttributeOperations
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getCollectExpressionAccess().getAttributesAttributeOperationsParserRuleCall_1_2_1_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleAttributeOperations_in_ruleCollectExpression4503);
                                    lv_attributes_4_0=ruleAttributeOperations();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElementForParent(grammarAccess.getCollectExpressionRule());
                                      	        }
                                             		set(
                                             			current, 
                                             			"attributes",
                                              		lv_attributes_4_0, 
                                              		"AttributeOperations");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }
                                    break;

                            }

                            otherlv_5=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleCollectExpression4517); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getCollectExpressionAccess().getRightCurlyBracketKeyword_1_2_2());
                                  
                            }

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCollectExpression"


    // $ANTLR start "entryRuleCollectQuery"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2101:1: entryRuleCollectQuery returns [EObject current=null] : iv_ruleCollectQuery= ruleCollectQuery EOF ;
    public final EObject entryRuleCollectQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectQuery = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2102:2: (iv_ruleCollectQuery= ruleCollectQuery EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2103:2: iv_ruleCollectQuery= ruleCollectQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectQueryRule()); 
            }
            pushFollow(FOLLOW_ruleCollectQuery_in_entryRuleCollectQuery4555);
            iv_ruleCollectQuery=ruleCollectQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectQuery4565); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCollectQuery"


    // $ANTLR start "ruleCollectQuery"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2110:1: ruleCollectQuery returns [EObject current=null] : (this_VirtualCollectQuery_0= ruleVirtualCollectQuery | this_ExportedCollectQuery_1= ruleExportedCollectQuery ) ;
    public final EObject ruleCollectQuery() throws RecognitionException {
        EObject current = null;

        EObject this_VirtualCollectQuery_0 = null;

        EObject this_ExportedCollectQuery_1 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2113:28: ( (this_VirtualCollectQuery_0= ruleVirtualCollectQuery | this_ExportedCollectQuery_1= ruleExportedCollectQuery ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2114:1: (this_VirtualCollectQuery_0= ruleVirtualCollectQuery | this_ExportedCollectQuery_1= ruleExportedCollectQuery )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2114:1: (this_VirtualCollectQuery_0= ruleVirtualCollectQuery | this_ExportedCollectQuery_1= ruleExportedCollectQuery )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==KEYWORD_31) ) {
                alt41=1;
            }
            else if ( (LA41_0==KEYWORD_47) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2115:2: this_VirtualCollectQuery_0= ruleVirtualCollectQuery
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCollectQueryAccess().getVirtualCollectQueryParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVirtualCollectQuery_in_ruleCollectQuery4615);
                    this_VirtualCollectQuery_0=ruleVirtualCollectQuery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_VirtualCollectQuery_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2128:2: this_ExportedCollectQuery_1= ruleExportedCollectQuery
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCollectQueryAccess().getExportedCollectQueryParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExportedCollectQuery_in_ruleCollectQuery4645);
                    this_ExportedCollectQuery_1=ruleExportedCollectQuery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_ExportedCollectQuery_1;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCollectQuery"


    // $ANTLR start "entryRuleVirtualCollectQuery"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2147:1: entryRuleVirtualCollectQuery returns [EObject current=null] : iv_ruleVirtualCollectQuery= ruleVirtualCollectQuery EOF ;
    public final EObject entryRuleVirtualCollectQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVirtualCollectQuery = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2148:2: (iv_ruleVirtualCollectQuery= ruleVirtualCollectQuery EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2149:2: iv_ruleVirtualCollectQuery= ruleVirtualCollectQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVirtualCollectQueryRule()); 
            }
            pushFollow(FOLLOW_ruleVirtualCollectQuery_in_entryRuleVirtualCollectQuery4679);
            iv_ruleVirtualCollectQuery=ruleVirtualCollectQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVirtualCollectQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVirtualCollectQuery4689); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVirtualCollectQuery"


    // $ANTLR start "ruleVirtualCollectQuery"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2156:1: ruleVirtualCollectQuery returns [EObject current=null] : ( () otherlv_1= KEYWORD_31 ( (lv_expr_2_0= ruleExpression ) )? otherlv_3= KEYWORD_45 ) ;
    public final EObject ruleVirtualCollectQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2159:28: ( ( () otherlv_1= KEYWORD_31 ( (lv_expr_2_0= ruleExpression ) )? otherlv_3= KEYWORD_45 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2160:1: ( () otherlv_1= KEYWORD_31 ( (lv_expr_2_0= ruleExpression ) )? otherlv_3= KEYWORD_45 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2160:1: ( () otherlv_1= KEYWORD_31 ( (lv_expr_2_0= ruleExpression ) )? otherlv_3= KEYWORD_45 )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2160:2: () otherlv_1= KEYWORD_31 ( (lv_expr_2_0= ruleExpression ) )? otherlv_3= KEYWORD_45
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2160:2: ()
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2161:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getVirtualCollectQueryAccess().getVirtualCollectQueryAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,KEYWORD_31,FOLLOW_KEYWORD_31_in_ruleVirtualCollectQuery4739); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getVirtualCollectQueryAccess().getLessThanSignVerticalLineKeyword_1());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2174:1: ( (lv_expr_2_0= ruleExpression ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=KEYWORD_61 && LA42_0<=KEYWORD_55)||(LA42_0>=KEYWORD_57 && LA42_0<=KEYWORD_51)||(LA42_0>=KEYWORD_53 && LA42_0<=KEYWORD_54)||LA42_0==KEYWORD_24||LA42_0==KEYWORD_42||(LA42_0>=KEYWORD_1 && LA42_0<=KEYWORD_4)||LA42_0==KEYWORD_9||(LA42_0>=KEYWORD_17 && LA42_0<=KEYWORD_18)||LA42_0==KEYWORD_20||(LA42_0>=RULE_DOLLAR_VAR && LA42_0<=RULE_WORD_CHARS)||LA42_0==RULE_REGULAR_EXPRESSION) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2175:1: (lv_expr_2_0= ruleExpression )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2175:1: (lv_expr_2_0= ruleExpression )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2176:3: lv_expr_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVirtualCollectQueryAccess().getExprExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleVirtualCollectQuery4759);
                    lv_expr_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVirtualCollectQueryRule());
                      	        }
                             		set(
                             			current, 
                             			"expr",
                              		lv_expr_2_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,KEYWORD_45,FOLLOW_KEYWORD_45_in_ruleVirtualCollectQuery4773); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getVirtualCollectQueryAccess().getVerticalLineGreaterThanSignKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVirtualCollectQuery"


    // $ANTLR start "entryRuleExportedCollectQuery"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2205:1: entryRuleExportedCollectQuery returns [EObject current=null] : iv_ruleExportedCollectQuery= ruleExportedCollectQuery EOF ;
    public final EObject entryRuleExportedCollectQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExportedCollectQuery = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2206:2: (iv_ruleExportedCollectQuery= ruleExportedCollectQuery EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2207:2: iv_ruleExportedCollectQuery= ruleExportedCollectQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExportedCollectQueryRule()); 
            }
            pushFollow(FOLLOW_ruleExportedCollectQuery_in_entryRuleExportedCollectQuery4807);
            iv_ruleExportedCollectQuery=ruleExportedCollectQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExportedCollectQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExportedCollectQuery4817); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExportedCollectQuery"


    // $ANTLR start "ruleExportedCollectQuery"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2214:1: ruleExportedCollectQuery returns [EObject current=null] : ( () otherlv_1= KEYWORD_47 ( (lv_expr_2_0= ruleExpression ) )? otherlv_3= KEYWORD_50 ) ;
    public final EObject ruleExportedCollectQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2217:28: ( ( () otherlv_1= KEYWORD_47 ( (lv_expr_2_0= ruleExpression ) )? otherlv_3= KEYWORD_50 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2218:1: ( () otherlv_1= KEYWORD_47 ( (lv_expr_2_0= ruleExpression ) )? otherlv_3= KEYWORD_50 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2218:1: ( () otherlv_1= KEYWORD_47 ( (lv_expr_2_0= ruleExpression ) )? otherlv_3= KEYWORD_50 )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2218:2: () otherlv_1= KEYWORD_47 ( (lv_expr_2_0= ruleExpression ) )? otherlv_3= KEYWORD_50
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2218:2: ()
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2219:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExportedCollectQueryAccess().getExportedCollectQueryAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,KEYWORD_47,FOLLOW_KEYWORD_47_in_ruleExportedCollectQuery4867); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExportedCollectQueryAccess().getLessThanSignLessThanSignVerticalLineKeyword_1());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2232:1: ( (lv_expr_2_0= ruleExpression ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=KEYWORD_61 && LA43_0<=KEYWORD_55)||(LA43_0>=KEYWORD_57 && LA43_0<=KEYWORD_51)||(LA43_0>=KEYWORD_53 && LA43_0<=KEYWORD_54)||LA43_0==KEYWORD_24||LA43_0==KEYWORD_42||(LA43_0>=KEYWORD_1 && LA43_0<=KEYWORD_4)||LA43_0==KEYWORD_9||(LA43_0>=KEYWORD_17 && LA43_0<=KEYWORD_18)||LA43_0==KEYWORD_20||(LA43_0>=RULE_DOLLAR_VAR && LA43_0<=RULE_WORD_CHARS)||LA43_0==RULE_REGULAR_EXPRESSION) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2233:1: (lv_expr_2_0= ruleExpression )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2233:1: (lv_expr_2_0= ruleExpression )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2234:3: lv_expr_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExportedCollectQueryAccess().getExprExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExportedCollectQuery4887);
                    lv_expr_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExportedCollectQueryRule());
                      	        }
                             		set(
                             			current, 
                             			"expr",
                              		lv_expr_2_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,KEYWORD_50,FOLLOW_KEYWORD_50_in_ruleExportedCollectQuery4901); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getExportedCollectQueryAccess().getVerticalLineGreaterThanSignGreaterThanSignKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExportedCollectQuery"


    // $ANTLR start "entryRuleSelectorExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2263:1: entryRuleSelectorExpression returns [EObject current=null] : iv_ruleSelectorExpression= ruleSelectorExpression EOF ;
    public final EObject entryRuleSelectorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectorExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2264:2: (iv_ruleSelectorExpression= ruleSelectorExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2265:2: iv_ruleSelectorExpression= ruleSelectorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSelectorExpression_in_entryRuleSelectorExpression4935);
            iv_ruleSelectorExpression=ruleSelectorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectorExpression4945); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSelectorExpression"


    // $ANTLR start "ruleSelectorExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2272:1: ruleSelectorExpression returns [EObject current=null] : (this_AtExpression_0= ruleAtExpression ( () otherlv_2= KEYWORD_16 ( (otherlv_3= KEYWORD_20 ( (lv_parameters_4_0= ruleSelectorEntry ) ) (otherlv_5= KEYWORD_8 ( (lv_parameters_6_0= ruleSelectorEntry ) ) )* ( ruleendComma )? otherlv_8= KEYWORD_21 ) | ( (lv_parameters_9_0= ruleSelectorEntry ) ) ) )? ) ;
    public final EObject ruleSelectorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject this_AtExpression_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_parameters_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2275:28: ( (this_AtExpression_0= ruleAtExpression ( () otherlv_2= KEYWORD_16 ( (otherlv_3= KEYWORD_20 ( (lv_parameters_4_0= ruleSelectorEntry ) ) (otherlv_5= KEYWORD_8 ( (lv_parameters_6_0= ruleSelectorEntry ) ) )* ( ruleendComma )? otherlv_8= KEYWORD_21 ) | ( (lv_parameters_9_0= ruleSelectorEntry ) ) ) )? ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2276:1: (this_AtExpression_0= ruleAtExpression ( () otherlv_2= KEYWORD_16 ( (otherlv_3= KEYWORD_20 ( (lv_parameters_4_0= ruleSelectorEntry ) ) (otherlv_5= KEYWORD_8 ( (lv_parameters_6_0= ruleSelectorEntry ) ) )* ( ruleendComma )? otherlv_8= KEYWORD_21 ) | ( (lv_parameters_9_0= ruleSelectorEntry ) ) ) )? )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2276:1: (this_AtExpression_0= ruleAtExpression ( () otherlv_2= KEYWORD_16 ( (otherlv_3= KEYWORD_20 ( (lv_parameters_4_0= ruleSelectorEntry ) ) (otherlv_5= KEYWORD_8 ( (lv_parameters_6_0= ruleSelectorEntry ) ) )* ( ruleendComma )? otherlv_8= KEYWORD_21 ) | ( (lv_parameters_9_0= ruleSelectorEntry ) ) ) )? )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2277:2: this_AtExpression_0= ruleAtExpression ( () otherlv_2= KEYWORD_16 ( (otherlv_3= KEYWORD_20 ( (lv_parameters_4_0= ruleSelectorEntry ) ) (otherlv_5= KEYWORD_8 ( (lv_parameters_6_0= ruleSelectorEntry ) ) )* ( ruleendComma )? otherlv_8= KEYWORD_21 ) | ( (lv_parameters_9_0= ruleSelectorEntry ) ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSelectorExpressionAccess().getAtExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAtExpression_in_ruleSelectorExpression4995);
            this_AtExpression_0=ruleAtExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_AtExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2288:1: ( () otherlv_2= KEYWORD_16 ( (otherlv_3= KEYWORD_20 ( (lv_parameters_4_0= ruleSelectorEntry ) ) (otherlv_5= KEYWORD_8 ( (lv_parameters_6_0= ruleSelectorEntry ) ) )* ( ruleendComma )? otherlv_8= KEYWORD_21 ) | ( (lv_parameters_9_0= ruleSelectorEntry ) ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==KEYWORD_16) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2288:2: () otherlv_2= KEYWORD_16 ( (otherlv_3= KEYWORD_20 ( (lv_parameters_4_0= ruleSelectorEntry ) ) (otherlv_5= KEYWORD_8 ( (lv_parameters_6_0= ruleSelectorEntry ) ) )* ( ruleendComma )? otherlv_8= KEYWORD_21 ) | ( (lv_parameters_9_0= ruleSelectorEntry ) ) )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2288:2: ()
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2289:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getSelectorExpressionAccess().getSelectorExpressionLeftExprAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleSelectorExpression5020); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getSelectorExpressionAccess().getQuestionMarkKeyword_1_1());
                          
                    }
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2302:1: ( (otherlv_3= KEYWORD_20 ( (lv_parameters_4_0= ruleSelectorEntry ) ) (otherlv_5= KEYWORD_8 ( (lv_parameters_6_0= ruleSelectorEntry ) ) )* ( ruleendComma )? otherlv_8= KEYWORD_21 ) | ( (lv_parameters_9_0= ruleSelectorEntry ) ) )
                    int alt46=2;
                    alt46 = dfa46.predict(input);
                    switch (alt46) {
                        case 1 :
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2302:2: (otherlv_3= KEYWORD_20 ( (lv_parameters_4_0= ruleSelectorEntry ) ) (otherlv_5= KEYWORD_8 ( (lv_parameters_6_0= ruleSelectorEntry ) ) )* ( ruleendComma )? otherlv_8= KEYWORD_21 )
                            {
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2302:2: (otherlv_3= KEYWORD_20 ( (lv_parameters_4_0= ruleSelectorEntry ) ) (otherlv_5= KEYWORD_8 ( (lv_parameters_6_0= ruleSelectorEntry ) ) )* ( ruleendComma )? otherlv_8= KEYWORD_21 )
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2303:2: otherlv_3= KEYWORD_20 ( (lv_parameters_4_0= ruleSelectorEntry ) ) (otherlv_5= KEYWORD_8 ( (lv_parameters_6_0= ruleSelectorEntry ) ) )* ( ruleendComma )? otherlv_8= KEYWORD_21
                            {
                            otherlv_3=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleSelectorExpression5034); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getSelectorExpressionAccess().getLeftCurlyBracketKeyword_1_2_0_0());
                                  
                            }
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2307:1: ( (lv_parameters_4_0= ruleSelectorEntry ) )
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2308:1: (lv_parameters_4_0= ruleSelectorEntry )
                            {
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2308:1: (lv_parameters_4_0= ruleSelectorEntry )
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2309:3: lv_parameters_4_0= ruleSelectorEntry
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSelectorExpressionAccess().getParametersSelectorEntryParserRuleCall_1_2_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSelectorEntry_in_ruleSelectorExpression5054);
                            lv_parameters_4_0=ruleSelectorEntry();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSelectorExpressionRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"parameters",
                                      		lv_parameters_4_0, 
                                      		"SelectorEntry");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2325:2: (otherlv_5= KEYWORD_8 ( (lv_parameters_6_0= ruleSelectorEntry ) ) )*
                            loop44:
                            do {
                                int alt44=2;
                                int LA44_0 = input.LA(1);

                                if ( (LA44_0==KEYWORD_8) ) {
                                    int LA44_1 = input.LA(2);

                                    if ( ((LA44_1>=KEYWORD_61 && LA44_1<=KEYWORD_55)||(LA44_1>=KEYWORD_57 && LA44_1<=KEYWORD_51)||(LA44_1>=KEYWORD_53 && LA44_1<=KEYWORD_54)||LA44_1==KEYWORD_24||LA44_1==KEYWORD_42||(LA44_1>=KEYWORD_1 && LA44_1<=KEYWORD_4)||LA44_1==KEYWORD_9||(LA44_1>=KEYWORD_17 && LA44_1<=KEYWORD_18)||LA44_1==KEYWORD_20||(LA44_1>=RULE_DOLLAR_VAR && LA44_1<=RULE_WORD_CHARS)||LA44_1==RULE_REGULAR_EXPRESSION) ) {
                                        alt44=1;
                                    }


                                }


                                switch (alt44) {
                            	case 1 :
                            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2326:2: otherlv_5= KEYWORD_8 ( (lv_parameters_6_0= ruleSelectorEntry ) )
                            	    {
                            	    otherlv_5=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleSelectorExpression5068); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_5, grammarAccess.getSelectorExpressionAccess().getCommaKeyword_1_2_0_2_0());
                            	          
                            	    }
                            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2330:1: ( (lv_parameters_6_0= ruleSelectorEntry ) )
                            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2331:1: (lv_parameters_6_0= ruleSelectorEntry )
                            	    {
                            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2331:1: (lv_parameters_6_0= ruleSelectorEntry )
                            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2332:3: lv_parameters_6_0= ruleSelectorEntry
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getSelectorExpressionAccess().getParametersSelectorEntryParserRuleCall_1_2_0_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleSelectorEntry_in_ruleSelectorExpression5088);
                            	    lv_parameters_6_0=ruleSelectorEntry();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getSelectorExpressionRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"parameters",
                            	              		lv_parameters_6_0, 
                            	              		"SelectorEntry");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop44;
                                }
                            } while (true);

                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2348:4: ( ruleendComma )?
                            int alt45=2;
                            int LA45_0 = input.LA(1);

                            if ( (LA45_0==KEYWORD_8) ) {
                                alt45=1;
                            }
                            switch (alt45) {
                                case 1 :
                                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2349:2: ruleendComma
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	  /* */ 
                                      	
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                              newCompositeNode(grammarAccess.getSelectorExpressionAccess().getEndCommaParserRuleCall_1_2_0_3()); 
                                          
                                    }
                                    pushFollow(FOLLOW_ruleendComma_in_ruleSelectorExpression5110);
                                    ruleendComma();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              afterParserOrEnumRuleCall();
                                          
                                    }

                                    }
                                    break;

                            }

                            otherlv_8=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleSelectorExpression5124); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getSelectorExpressionAccess().getRightCurlyBracketKeyword_1_2_0_4());
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2365:6: ( (lv_parameters_9_0= ruleSelectorEntry ) )
                            {
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2365:6: ( (lv_parameters_9_0= ruleSelectorEntry ) )
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2366:1: (lv_parameters_9_0= ruleSelectorEntry )
                            {
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2366:1: (lv_parameters_9_0= ruleSelectorEntry )
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2367:3: lv_parameters_9_0= ruleSelectorEntry
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSelectorExpressionAccess().getParametersSelectorEntryParserRuleCall_1_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSelectorEntry_in_ruleSelectorExpression5151);
                            lv_parameters_9_0=ruleSelectorEntry();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSelectorExpressionRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"parameters",
                                      		lv_parameters_9_0, 
                                      		"SelectorEntry");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSelectorExpression"


    // $ANTLR start "entryRuleSelectorEntry"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2391:1: entryRuleSelectorEntry returns [EObject current=null] : iv_ruleSelectorEntry= ruleSelectorEntry EOF ;
    public final EObject entryRuleSelectorEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectorEntry = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2392:2: (iv_ruleSelectorEntry= ruleSelectorEntry EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2393:2: iv_ruleSelectorEntry= ruleSelectorEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectorEntryRule()); 
            }
            pushFollow(FOLLOW_ruleSelectorEntry_in_entryRuleSelectorEntry5189);
            iv_ruleSelectorEntry=ruleSelectorEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectorEntry; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectorEntry5199); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSelectorEntry"


    // $ANTLR start "ruleSelectorEntry"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2400:1: ruleSelectorEntry returns [EObject current=null] : (this_Expression_0= ruleExpression ( () otherlv_2= KEYWORD_34 ( (lv_rightExpr_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleSelectorEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Expression_0 = null;

        EObject lv_rightExpr_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2403:28: ( (this_Expression_0= ruleExpression ( () otherlv_2= KEYWORD_34 ( (lv_rightExpr_3_0= ruleExpression ) ) )? ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2404:1: (this_Expression_0= ruleExpression ( () otherlv_2= KEYWORD_34 ( (lv_rightExpr_3_0= ruleExpression ) ) )? )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2404:1: (this_Expression_0= ruleExpression ( () otherlv_2= KEYWORD_34 ( (lv_rightExpr_3_0= ruleExpression ) ) )? )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2405:2: this_Expression_0= ruleExpression ( () otherlv_2= KEYWORD_34 ( (lv_rightExpr_3_0= ruleExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSelectorEntryAccess().getExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleSelectorEntry5249);
            this_Expression_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_Expression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2416:1: ( () otherlv_2= KEYWORD_34 ( (lv_rightExpr_3_0= ruleExpression ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==KEYWORD_34) ) {
                int LA48_1 = input.LA(2);

                if ( (synpred54_InternalPPParser()) ) {
                    alt48=1;
                }
            }
            switch (alt48) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2416:2: () otherlv_2= KEYWORD_34 ( (lv_rightExpr_3_0= ruleExpression ) )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2416:2: ()
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2417:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getSelectorEntryAccess().getSelectorEntryLeftExprAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_ruleSelectorEntry5274); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getSelectorEntryAccess().getEqualsSignGreaterThanSignKeyword_1_1());
                          
                    }
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2430:1: ( (lv_rightExpr_3_0= ruleExpression ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2431:1: (lv_rightExpr_3_0= ruleExpression )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2431:1: (lv_rightExpr_3_0= ruleExpression )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2432:3: lv_rightExpr_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectorEntryAccess().getRightExprExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleSelectorEntry5294);
                    lv_rightExpr_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectorEntryRule());
                      	        }
                             		set(
                             			current, 
                             			"rightExpr",
                              		lv_rightExpr_3_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSelectorEntry"


    // $ANTLR start "entryRuleAtExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2456:1: entryRuleAtExpression returns [EObject current=null] : iv_ruleAtExpression= ruleAtExpression EOF ;
    public final EObject entryRuleAtExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2457:2: (iv_ruleAtExpression= ruleAtExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2458:2: iv_ruleAtExpression= ruleAtExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAtExpression_in_entryRuleAtExpression5331);
            iv_ruleAtExpression=ruleAtExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtExpression5341); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAtExpression"


    // $ANTLR start "ruleAtExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2465:1: ruleAtExpression returns [EObject current=null] : (this_FunctionCall_0= ruleFunctionCall ( () otherlv_2= KEYWORD_18 ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* )? otherlv_6= KEYWORD_19 )* ) ;
    public final EObject ruleAtExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_FunctionCall_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2468:28: ( (this_FunctionCall_0= ruleFunctionCall ( () otherlv_2= KEYWORD_18 ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* )? otherlv_6= KEYWORD_19 )* ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2469:1: (this_FunctionCall_0= ruleFunctionCall ( () otherlv_2= KEYWORD_18 ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* )? otherlv_6= KEYWORD_19 )* )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2469:1: (this_FunctionCall_0= ruleFunctionCall ( () otherlv_2= KEYWORD_18 ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* )? otherlv_6= KEYWORD_19 )* )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2470:2: this_FunctionCall_0= ruleFunctionCall ( () otherlv_2= KEYWORD_18 ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* )? otherlv_6= KEYWORD_19 )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAtExpressionAccess().getFunctionCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleFunctionCall_in_ruleAtExpression5391);
            this_FunctionCall_0=ruleFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_FunctionCall_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2481:1: ( () otherlv_2= KEYWORD_18 ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* )? otherlv_6= KEYWORD_19 )*
            loop51:
            do {
                int alt51=2;
                alt51 = dfa51.predict(input);
                switch (alt51) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2481:2: () otherlv_2= KEYWORD_18 ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* )? otherlv_6= KEYWORD_19
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2481:2: ()
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2482:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAtExpressionAccess().getAtExpressionLeftExprAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_ruleAtExpression5416); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getAtExpressionAccess().getLeftSquareBracketKeyword_1_1());
            	          
            	    }
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2495:1: ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* )?
            	    int alt50=2;
            	    int LA50_0 = input.LA(1);

            	    if ( ((LA50_0>=KEYWORD_61 && LA50_0<=KEYWORD_55)||(LA50_0>=KEYWORD_57 && LA50_0<=KEYWORD_51)||(LA50_0>=KEYWORD_53 && LA50_0<=KEYWORD_54)||LA50_0==KEYWORD_24||LA50_0==KEYWORD_42||(LA50_0>=KEYWORD_1 && LA50_0<=KEYWORD_4)||LA50_0==KEYWORD_9||(LA50_0>=KEYWORD_17 && LA50_0<=KEYWORD_18)||LA50_0==KEYWORD_20||(LA50_0>=RULE_DOLLAR_VAR && LA50_0<=RULE_WORD_CHARS)||LA50_0==RULE_REGULAR_EXPRESSION) ) {
            	        alt50=1;
            	    }
            	    switch (alt50) {
            	        case 1 :
            	            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2495:2: ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )*
            	            {
            	            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2495:2: ( (lv_parameters_3_0= ruleExpression ) )
            	            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2496:1: (lv_parameters_3_0= ruleExpression )
            	            {
            	            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2496:1: (lv_parameters_3_0= ruleExpression )
            	            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2497:3: lv_parameters_3_0= ruleExpression
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getAtExpressionAccess().getParametersExpressionParserRuleCall_1_2_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleExpression_in_ruleAtExpression5437);
            	            lv_parameters_3_0=ruleExpression();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getAtExpressionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"parameters",
            	                      		lv_parameters_3_0, 
            	                      		"Expression");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2513:2: (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )*
            	            loop49:
            	            do {
            	                int alt49=2;
            	                int LA49_0 = input.LA(1);

            	                if ( (LA49_0==KEYWORD_8) ) {
            	                    alt49=1;
            	                }


            	                switch (alt49) {
            	            	case 1 :
            	            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2514:2: otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) )
            	            	    {
            	            	    otherlv_4=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleAtExpression5451); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_4, grammarAccess.getAtExpressionAccess().getCommaKeyword_1_2_1_0());
            	            	          
            	            	    }
            	            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2518:1: ( (lv_parameters_5_0= ruleExpression ) )
            	            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2519:1: (lv_parameters_5_0= ruleExpression )
            	            	    {
            	            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2519:1: (lv_parameters_5_0= ruleExpression )
            	            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2520:3: lv_parameters_5_0= ruleExpression
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getAtExpressionAccess().getParametersExpressionParserRuleCall_1_2_1_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleExpression_in_ruleAtExpression5471);
            	            	    lv_parameters_5_0=ruleExpression();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = createModelElementForParent(grammarAccess.getAtExpressionRule());
            	            	      	        }
            	            	             		add(
            	            	             			current, 
            	            	             			"parameters",
            	            	              		lv_parameters_5_0, 
            	            	              		"Expression");
            	            	      	        afterParserOrEnumRuleCall();
            	            	      	    
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop49;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    otherlv_6=(Token)match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_ruleAtExpression5488); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getAtExpressionAccess().getRightSquareBracketKeyword_1_3());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAtExpression"


    // $ANTLR start "entryRuleFunctionCall"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2549:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2550:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2551:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall5524);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionCall5534); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2558:1: ruleFunctionCall returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= KEYWORD_4 ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* ( ruleendComma )? )? otherlv_7= KEYWORD_5 )? ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2561:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= KEYWORD_4 ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* ( ruleendComma )? )? otherlv_7= KEYWORD_5 )? ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2562:1: (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= KEYWORD_4 ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* ( ruleendComma )? )? otherlv_7= KEYWORD_5 )? )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2562:1: (this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= KEYWORD_4 ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* ( ruleendComma )? )? otherlv_7= KEYWORD_5 )? )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2563:2: this_PrimaryExpression_0= rulePrimaryExpression ( () otherlv_2= KEYWORD_4 ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* ( ruleendComma )? )? otherlv_7= KEYWORD_5 )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFunctionCallAccess().getPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleFunctionCall5584);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_PrimaryExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2574:1: ( () otherlv_2= KEYWORD_4 ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* ( ruleendComma )? )? otherlv_7= KEYWORD_5 )?
            int alt55=2;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2574:2: () otherlv_2= KEYWORD_4 ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* ( ruleendComma )? )? otherlv_7= KEYWORD_5
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2574:2: ()
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2575:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getFunctionCallAccess().getFunctionCallLeftExprAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleFunctionCall5609); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1_1());
                          
                    }
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2588:1: ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* ( ruleendComma )? )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( ((LA54_0>=KEYWORD_61 && LA54_0<=KEYWORD_55)||(LA54_0>=KEYWORD_57 && LA54_0<=KEYWORD_51)||(LA54_0>=KEYWORD_53 && LA54_0<=KEYWORD_54)||LA54_0==KEYWORD_24||LA54_0==KEYWORD_42||(LA54_0>=KEYWORD_1 && LA54_0<=KEYWORD_4)||LA54_0==KEYWORD_9||(LA54_0>=KEYWORD_17 && LA54_0<=KEYWORD_18)||LA54_0==KEYWORD_20||(LA54_0>=RULE_DOLLAR_VAR && LA54_0<=RULE_WORD_CHARS)||LA54_0==RULE_REGULAR_EXPRESSION) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2588:2: ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* ( ruleendComma )?
                            {
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2588:2: ( (lv_parameters_3_0= ruleExpression ) )
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2589:1: (lv_parameters_3_0= ruleExpression )
                            {
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2589:1: (lv_parameters_3_0= ruleExpression )
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2590:3: lv_parameters_3_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersExpressionParserRuleCall_1_2_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleFunctionCall5630);
                            lv_parameters_3_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"parameters",
                                      		lv_parameters_3_0, 
                                      		"Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2606:2: (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )*
                            loop52:
                            do {
                                int alt52=2;
                                int LA52_0 = input.LA(1);

                                if ( (LA52_0==KEYWORD_8) ) {
                                    int LA52_1 = input.LA(2);

                                    if ( ((LA52_1>=KEYWORD_61 && LA52_1<=KEYWORD_55)||(LA52_1>=KEYWORD_57 && LA52_1<=KEYWORD_51)||(LA52_1>=KEYWORD_53 && LA52_1<=KEYWORD_54)||LA52_1==KEYWORD_24||LA52_1==KEYWORD_42||(LA52_1>=KEYWORD_1 && LA52_1<=KEYWORD_4)||LA52_1==KEYWORD_9||(LA52_1>=KEYWORD_17 && LA52_1<=KEYWORD_18)||LA52_1==KEYWORD_20||(LA52_1>=RULE_DOLLAR_VAR && LA52_1<=RULE_WORD_CHARS)||LA52_1==RULE_REGULAR_EXPRESSION) ) {
                                        alt52=1;
                                    }


                                }


                                switch (alt52) {
                            	case 1 :
                            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2607:2: otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) )
                            	    {
                            	    otherlv_4=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleFunctionCall5644); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getCommaKeyword_1_2_1_0());
                            	          
                            	    }
                            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2611:1: ( (lv_parameters_5_0= ruleExpression ) )
                            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2612:1: (lv_parameters_5_0= ruleExpression )
                            	    {
                            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2612:1: (lv_parameters_5_0= ruleExpression )
                            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2613:3: lv_parameters_5_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersExpressionParserRuleCall_1_2_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleExpression_in_ruleFunctionCall5664);
                            	    lv_parameters_5_0=ruleExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"parameters",
                            	              		lv_parameters_5_0, 
                            	              		"Expression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop52;
                                }
                            } while (true);

                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2629:4: ( ruleendComma )?
                            int alt53=2;
                            int LA53_0 = input.LA(1);

                            if ( (LA53_0==KEYWORD_8) ) {
                                alt53=1;
                            }
                            switch (alt53) {
                                case 1 :
                                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2630:2: ruleendComma
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	  /* */ 
                                      	
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                              newCompositeNode(grammarAccess.getFunctionCallAccess().getEndCommaParserRuleCall_1_2_2()); 
                                          
                                    }
                                    pushFollow(FOLLOW_ruleendComma_in_ruleFunctionCall5686);
                                    ruleendComma();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              afterParserOrEnumRuleCall();
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleFunctionCall5702); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_1_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2653:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2654:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2655:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression5738);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression5748); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2662:1: rulePrimaryExpression returns [EObject current=null] : (this_IfExpression_0= ruleIfExpression | this_CaseExpression_1= ruleCaseExpression | this_ImportExpression_2= ruleImportExpression | this_Definition_3= ruleDefinition | this_HostClassDefinition_4= ruleHostClassDefinition | this_NodeDefinition_5= ruleNodeDefinition | this_VirtualNameOrReference_6= ruleVirtualNameOrReference | this_LiteralExpression_7= ruleLiteralExpression | this_VariableExpression_8= ruleVariableExpression | this_ParenthisedExpression_9= ruleParenthisedExpression ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IfExpression_0 = null;

        EObject this_CaseExpression_1 = null;

        EObject this_ImportExpression_2 = null;

        EObject this_Definition_3 = null;

        EObject this_HostClassDefinition_4 = null;

        EObject this_NodeDefinition_5 = null;

        EObject this_VirtualNameOrReference_6 = null;

        EObject this_LiteralExpression_7 = null;

        EObject this_VariableExpression_8 = null;

        EObject this_ParenthisedExpression_9 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2665:28: ( (this_IfExpression_0= ruleIfExpression | this_CaseExpression_1= ruleCaseExpression | this_ImportExpression_2= ruleImportExpression | this_Definition_3= ruleDefinition | this_HostClassDefinition_4= ruleHostClassDefinition | this_NodeDefinition_5= ruleNodeDefinition | this_VirtualNameOrReference_6= ruleVirtualNameOrReference | this_LiteralExpression_7= ruleLiteralExpression | this_VariableExpression_8= ruleVariableExpression | this_ParenthisedExpression_9= ruleParenthisedExpression ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2666:1: (this_IfExpression_0= ruleIfExpression | this_CaseExpression_1= ruleCaseExpression | this_ImportExpression_2= ruleImportExpression | this_Definition_3= ruleDefinition | this_HostClassDefinition_4= ruleHostClassDefinition | this_NodeDefinition_5= ruleNodeDefinition | this_VirtualNameOrReference_6= ruleVirtualNameOrReference | this_LiteralExpression_7= ruleLiteralExpression | this_VariableExpression_8= ruleVariableExpression | this_ParenthisedExpression_9= ruleParenthisedExpression )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2666:1: (this_IfExpression_0= ruleIfExpression | this_CaseExpression_1= ruleCaseExpression | this_ImportExpression_2= ruleImportExpression | this_Definition_3= ruleDefinition | this_HostClassDefinition_4= ruleHostClassDefinition | this_NodeDefinition_5= ruleNodeDefinition | this_VirtualNameOrReference_6= ruleVirtualNameOrReference | this_LiteralExpression_7= ruleLiteralExpression | this_VariableExpression_8= ruleVariableExpression | this_ParenthisedExpression_9= ruleParenthisedExpression )
            int alt56=10;
            switch ( input.LA(1) ) {
            case KEYWORD_42:
                {
                alt56=1;
                }
                break;
            case KEYWORD_51:
                {
                alt56=2;
                }
                break;
            case KEYWORD_60:
                {
                alt56=3;
                }
                break;
            case KEYWORD_59:
                {
                alt56=4;
                }
                break;
            case KEYWORD_55:
                {
                alt56=5;
                }
                break;
            case KEYWORD_53:
                {
                alt56=6;
                }
                break;
            case KEYWORD_17:
                {
                alt56=7;
                }
                break;
            case KEYWORD_61:
            case KEYWORD_57:
            case KEYWORD_58:
            case KEYWORD_54:
            case KEYWORD_24:
            case KEYWORD_2:
            case KEYWORD_3:
            case KEYWORD_18:
            case KEYWORD_20:
            case RULE_WORD_CHARS:
            case RULE_REGULAR_EXPRESSION:
                {
                alt56=8;
                }
                break;
            case RULE_DOLLAR_VAR:
                {
                alt56=9;
                }
                break;
            case KEYWORD_4:
                {
                alt56=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2667:2: this_IfExpression_0= ruleIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getIfExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIfExpression_in_rulePrimaryExpression5798);
                    this_IfExpression_0=ruleIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_IfExpression_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2680:2: this_CaseExpression_1= ruleCaseExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getCaseExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCaseExpression_in_rulePrimaryExpression5828);
                    this_CaseExpression_1=ruleCaseExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_CaseExpression_1;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2693:2: this_ImportExpression_2= ruleImportExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getImportExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleImportExpression_in_rulePrimaryExpression5858);
                    this_ImportExpression_2=ruleImportExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_ImportExpression_2;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2706:2: this_Definition_3= ruleDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getDefinitionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDefinition_in_rulePrimaryExpression5888);
                    this_Definition_3=ruleDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_Definition_3;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2719:2: this_HostClassDefinition_4= ruleHostClassDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getHostClassDefinitionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHostClassDefinition_in_rulePrimaryExpression5918);
                    this_HostClassDefinition_4=ruleHostClassDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_HostClassDefinition_4;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2732:2: this_NodeDefinition_5= ruleNodeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getNodeDefinitionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNodeDefinition_in_rulePrimaryExpression5948);
                    this_NodeDefinition_5=ruleNodeDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_NodeDefinition_5;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2745:2: this_VirtualNameOrReference_6= ruleVirtualNameOrReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getVirtualNameOrReferenceParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVirtualNameOrReference_in_rulePrimaryExpression5978);
                    this_VirtualNameOrReference_6=ruleVirtualNameOrReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_VirtualNameOrReference_6;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2758:2: this_LiteralExpression_7= ruleLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralExpression_in_rulePrimaryExpression6008);
                    this_LiteralExpression_7=ruleLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_LiteralExpression_7;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2771:2: this_VariableExpression_8= ruleVariableExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getVariableExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableExpression_in_rulePrimaryExpression6038);
                    this_VariableExpression_8=ruleVariableExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_VariableExpression_8;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2784:2: this_ParenthisedExpression_9= ruleParenthisedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getParenthisedExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthisedExpression_in_rulePrimaryExpression6068);
                    this_ParenthisedExpression_9=ruleParenthisedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_ParenthisedExpression_9;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleNodeDefinition"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2803:1: entryRuleNodeDefinition returns [EObject current=null] : iv_ruleNodeDefinition= ruleNodeDefinition EOF ;
    public final EObject entryRuleNodeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeDefinition = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2804:2: (iv_ruleNodeDefinition= ruleNodeDefinition EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2805:2: iv_ruleNodeDefinition= ruleNodeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleNodeDefinition_in_entryRuleNodeDefinition6102);
            iv_ruleNodeDefinition=ruleNodeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNodeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeDefinition6112); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNodeDefinition"


    // $ANTLR start "ruleNodeDefinition"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2812:1: ruleNodeDefinition returns [EObject current=null] : (otherlv_0= KEYWORD_53 ( (lv_hostNames_1_0= ruleHostReference ) ) (otherlv_2= KEYWORD_8 ( (lv_hostNames_3_0= ruleHostReference ) ) )* (otherlv_4= KEYWORD_62 ( (lv_parentName_5_0= ruleHostReference ) ) )? otherlv_6= KEYWORD_20 ( (lv_statements_7_0= ruleExpressionList ) )* otherlv_8= KEYWORD_21 ) ;
    public final EObject ruleNodeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_hostNames_1_0 = null;

        EObject lv_hostNames_3_0 = null;

        EObject lv_parentName_5_0 = null;

        EObject lv_statements_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2815:28: ( (otherlv_0= KEYWORD_53 ( (lv_hostNames_1_0= ruleHostReference ) ) (otherlv_2= KEYWORD_8 ( (lv_hostNames_3_0= ruleHostReference ) ) )* (otherlv_4= KEYWORD_62 ( (lv_parentName_5_0= ruleHostReference ) ) )? otherlv_6= KEYWORD_20 ( (lv_statements_7_0= ruleExpressionList ) )* otherlv_8= KEYWORD_21 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2816:1: (otherlv_0= KEYWORD_53 ( (lv_hostNames_1_0= ruleHostReference ) ) (otherlv_2= KEYWORD_8 ( (lv_hostNames_3_0= ruleHostReference ) ) )* (otherlv_4= KEYWORD_62 ( (lv_parentName_5_0= ruleHostReference ) ) )? otherlv_6= KEYWORD_20 ( (lv_statements_7_0= ruleExpressionList ) )* otherlv_8= KEYWORD_21 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2816:1: (otherlv_0= KEYWORD_53 ( (lv_hostNames_1_0= ruleHostReference ) ) (otherlv_2= KEYWORD_8 ( (lv_hostNames_3_0= ruleHostReference ) ) )* (otherlv_4= KEYWORD_62 ( (lv_parentName_5_0= ruleHostReference ) ) )? otherlv_6= KEYWORD_20 ( (lv_statements_7_0= ruleExpressionList ) )* otherlv_8= KEYWORD_21 )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2817:2: otherlv_0= KEYWORD_53 ( (lv_hostNames_1_0= ruleHostReference ) ) (otherlv_2= KEYWORD_8 ( (lv_hostNames_3_0= ruleHostReference ) ) )* (otherlv_4= KEYWORD_62 ( (lv_parentName_5_0= ruleHostReference ) ) )? otherlv_6= KEYWORD_20 ( (lv_statements_7_0= ruleExpressionList ) )* otherlv_8= KEYWORD_21
            {
            otherlv_0=(Token)match(input,KEYWORD_53,FOLLOW_KEYWORD_53_in_ruleNodeDefinition6150); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNodeDefinitionAccess().getNodeKeyword_0());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2821:1: ( (lv_hostNames_1_0= ruleHostReference ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2822:1: (lv_hostNames_1_0= ruleHostReference )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2822:1: (lv_hostNames_1_0= ruleHostReference )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2823:3: lv_hostNames_1_0= ruleHostReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNodeDefinitionAccess().getHostNamesHostReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleHostReference_in_ruleNodeDefinition6170);
            lv_hostNames_1_0=ruleHostReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNodeDefinitionRule());
              	        }
                     		add(
                     			current, 
                     			"hostNames",
                      		lv_hostNames_1_0, 
                      		"HostReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2839:2: (otherlv_2= KEYWORD_8 ( (lv_hostNames_3_0= ruleHostReference ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==KEYWORD_8) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2840:2: otherlv_2= KEYWORD_8 ( (lv_hostNames_3_0= ruleHostReference ) )
            	    {
            	    otherlv_2=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleNodeDefinition6184); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getNodeDefinitionAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2844:1: ( (lv_hostNames_3_0= ruleHostReference ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2845:1: (lv_hostNames_3_0= ruleHostReference )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2845:1: (lv_hostNames_3_0= ruleHostReference )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2846:3: lv_hostNames_3_0= ruleHostReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNodeDefinitionAccess().getHostNamesHostReferenceParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleHostReference_in_ruleNodeDefinition6204);
            	    lv_hostNames_3_0=ruleHostReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNodeDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"hostNames",
            	              		lv_hostNames_3_0, 
            	              		"HostReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2862:4: (otherlv_4= KEYWORD_62 ( (lv_parentName_5_0= ruleHostReference ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==KEYWORD_62) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2863:2: otherlv_4= KEYWORD_62 ( (lv_parentName_5_0= ruleHostReference ) )
                    {
                    otherlv_4=(Token)match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleNodeDefinition6220); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getNodeDefinitionAccess().getInheritsKeyword_3_0());
                          
                    }
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2867:1: ( (lv_parentName_5_0= ruleHostReference ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2868:1: (lv_parentName_5_0= ruleHostReference )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2868:1: (lv_parentName_5_0= ruleHostReference )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2869:3: lv_parentName_5_0= ruleHostReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNodeDefinitionAccess().getParentNameHostReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleHostReference_in_ruleNodeDefinition6240);
                    lv_parentName_5_0=ruleHostReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNodeDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"parentName",
                              		lv_parentName_5_0, 
                              		"HostReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleNodeDefinition6255); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getNodeDefinitionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2890:1: ( (lv_statements_7_0= ruleExpressionList ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( ((LA59_0>=KEYWORD_61 && LA59_0<=KEYWORD_55)||(LA59_0>=KEYWORD_57 && LA59_0<=KEYWORD_51)||(LA59_0>=KEYWORD_53 && LA59_0<=KEYWORD_54)||LA59_0==KEYWORD_24||LA59_0==KEYWORD_42||(LA59_0>=KEYWORD_1 && LA59_0<=KEYWORD_4)||LA59_0==KEYWORD_9||(LA59_0>=KEYWORD_17 && LA59_0<=KEYWORD_18)||LA59_0==KEYWORD_20||(LA59_0>=RULE_DOLLAR_VAR && LA59_0<=RULE_WORD_CHARS)||LA59_0==RULE_REGULAR_EXPRESSION) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2891:1: (lv_statements_7_0= ruleExpressionList )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2891:1: (lv_statements_7_0= ruleExpressionList )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2892:3: lv_statements_7_0= ruleExpressionList
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNodeDefinitionAccess().getStatementsExpressionListParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionList_in_ruleNodeDefinition6275);
            	    lv_statements_7_0=ruleExpressionList();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNodeDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_7_0, 
            	              		"ExpressionList");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

            otherlv_8=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleNodeDefinition6289); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getNodeDefinitionAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNodeDefinition"


    // $ANTLR start "entryRuleHostReference"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2921:1: entryRuleHostReference returns [EObject current=null] : iv_ruleHostReference= ruleHostReference EOF ;
    public final EObject entryRuleHostReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHostReference = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2922:2: (iv_ruleHostReference= ruleHostReference EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2923:2: iv_ruleHostReference= ruleHostReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHostReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleHostReference_in_entryRuleHostReference6323);
            iv_ruleHostReference=ruleHostReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHostReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHostReference6333); if (state.failed) return current;

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
    // $ANTLR end "entryRuleHostReference"


    // $ANTLR start "ruleHostReference"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2930:1: ruleHostReference returns [EObject current=null] : (this_StringExpression_0= ruleStringExpression | this_LiteralRegex_1= ruleLiteralRegex | this_LiteralDefault_2= ruleLiteralDefault | this_LiteralNameOrReference_3= ruleLiteralNameOrReference ) ;
    public final EObject ruleHostReference() throws RecognitionException {
        EObject current = null;

        EObject this_StringExpression_0 = null;

        EObject this_LiteralRegex_1 = null;

        EObject this_LiteralDefault_2 = null;

        EObject this_LiteralNameOrReference_3 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2933:28: ( (this_StringExpression_0= ruleStringExpression | this_LiteralRegex_1= ruleLiteralRegex | this_LiteralDefault_2= ruleLiteralDefault | this_LiteralNameOrReference_3= ruleLiteralNameOrReference ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2934:1: (this_StringExpression_0= ruleStringExpression | this_LiteralRegex_1= ruleLiteralRegex | this_LiteralDefault_2= ruleLiteralDefault | this_LiteralNameOrReference_3= ruleLiteralNameOrReference )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2934:1: (this_StringExpression_0= ruleStringExpression | this_LiteralRegex_1= ruleLiteralRegex | this_LiteralDefault_2= ruleLiteralDefault | this_LiteralNameOrReference_3= ruleLiteralNameOrReference )
            int alt60=4;
            switch ( input.LA(1) ) {
            case KEYWORD_24:
            case KEYWORD_2:
            case KEYWORD_3:
                {
                alt60=1;
                }
                break;
            case RULE_REGULAR_EXPRESSION:
                {
                alt60=2;
                }
                break;
            case KEYWORD_61:
                {
                alt60=3;
                }
                break;
            case RULE_WORD_CHARS:
                {
                alt60=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2935:2: this_StringExpression_0= ruleStringExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHostReferenceAccess().getStringExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringExpression_in_ruleHostReference6383);
                    this_StringExpression_0=ruleStringExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_StringExpression_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2948:2: this_LiteralRegex_1= ruleLiteralRegex
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHostReferenceAccess().getLiteralRegexParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralRegex_in_ruleHostReference6413);
                    this_LiteralRegex_1=ruleLiteralRegex();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_LiteralRegex_1;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2961:2: this_LiteralDefault_2= ruleLiteralDefault
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHostReferenceAccess().getLiteralDefaultParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralDefault_in_ruleHostReference6443);
                    this_LiteralDefault_2=ruleLiteralDefault();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_LiteralDefault_2;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2974:2: this_LiteralNameOrReference_3= ruleLiteralNameOrReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHostReferenceAccess().getLiteralNameOrReferenceParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralNameOrReference_in_ruleHostReference6473);
                    this_LiteralNameOrReference_3=ruleLiteralNameOrReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_LiteralNameOrReference_3;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleHostReference"


    // $ANTLR start "entryRuleHostClassDefinition"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2993:1: entryRuleHostClassDefinition returns [EObject current=null] : iv_ruleHostClassDefinition= ruleHostClassDefinition EOF ;
    public final EObject entryRuleHostClassDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHostClassDefinition = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2994:2: (iv_ruleHostClassDefinition= ruleHostClassDefinition EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2995:2: iv_ruleHostClassDefinition= ruleHostClassDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHostClassDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleHostClassDefinition_in_entryRuleHostClassDefinition6507);
            iv_ruleHostClassDefinition=ruleHostClassDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHostClassDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHostClassDefinition6517); if (state.failed) return current;

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
    // $ANTLR end "entryRuleHostClassDefinition"


    // $ANTLR start "ruleHostClassDefinition"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3002:1: ruleHostClassDefinition returns [EObject current=null] : (otherlv_0= KEYWORD_55 ( (lv_className_1_0= ruleclassname ) ) ( (lv_arguments_2_0= ruleDefinitionArgumentList ) )? (otherlv_3= KEYWORD_62 ( (lv_parent_4_0= ruleParentName ) ) )? otherlv_5= KEYWORD_20 ( (lv_statements_6_0= ruleExpressionList ) )* otherlv_7= KEYWORD_21 ) ;
    public final EObject ruleHostClassDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_className_1_0 = null;

        EObject lv_arguments_2_0 = null;

        EObject lv_parent_4_0 = null;

        EObject lv_statements_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3005:28: ( (otherlv_0= KEYWORD_55 ( (lv_className_1_0= ruleclassname ) ) ( (lv_arguments_2_0= ruleDefinitionArgumentList ) )? (otherlv_3= KEYWORD_62 ( (lv_parent_4_0= ruleParentName ) ) )? otherlv_5= KEYWORD_20 ( (lv_statements_6_0= ruleExpressionList ) )* otherlv_7= KEYWORD_21 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3006:1: (otherlv_0= KEYWORD_55 ( (lv_className_1_0= ruleclassname ) ) ( (lv_arguments_2_0= ruleDefinitionArgumentList ) )? (otherlv_3= KEYWORD_62 ( (lv_parent_4_0= ruleParentName ) ) )? otherlv_5= KEYWORD_20 ( (lv_statements_6_0= ruleExpressionList ) )* otherlv_7= KEYWORD_21 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3006:1: (otherlv_0= KEYWORD_55 ( (lv_className_1_0= ruleclassname ) ) ( (lv_arguments_2_0= ruleDefinitionArgumentList ) )? (otherlv_3= KEYWORD_62 ( (lv_parent_4_0= ruleParentName ) ) )? otherlv_5= KEYWORD_20 ( (lv_statements_6_0= ruleExpressionList ) )* otherlv_7= KEYWORD_21 )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3007:2: otherlv_0= KEYWORD_55 ( (lv_className_1_0= ruleclassname ) ) ( (lv_arguments_2_0= ruleDefinitionArgumentList ) )? (otherlv_3= KEYWORD_62 ( (lv_parent_4_0= ruleParentName ) ) )? otherlv_5= KEYWORD_20 ( (lv_statements_6_0= ruleExpressionList ) )* otherlv_7= KEYWORD_21
            {
            otherlv_0=(Token)match(input,KEYWORD_55,FOLLOW_KEYWORD_55_in_ruleHostClassDefinition6555); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getHostClassDefinitionAccess().getClassKeyword_0());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3011:1: ( (lv_className_1_0= ruleclassname ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3012:1: (lv_className_1_0= ruleclassname )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3012:1: (lv_className_1_0= ruleclassname )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3013:3: lv_className_1_0= ruleclassname
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHostClassDefinitionAccess().getClassNameClassnameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleclassname_in_ruleHostClassDefinition6575);
            lv_className_1_0=ruleclassname();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getHostClassDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"className",
                      		lv_className_1_0, 
                      		"classname");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3029:2: ( (lv_arguments_2_0= ruleDefinitionArgumentList ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==KEYWORD_4) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3030:1: (lv_arguments_2_0= ruleDefinitionArgumentList )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3030:1: (lv_arguments_2_0= ruleDefinitionArgumentList )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3031:3: lv_arguments_2_0= ruleDefinitionArgumentList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getHostClassDefinitionAccess().getArgumentsDefinitionArgumentListParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDefinitionArgumentList_in_ruleHostClassDefinition6596);
                    lv_arguments_2_0=ruleDefinitionArgumentList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getHostClassDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"arguments",
                              		lv_arguments_2_0, 
                              		"DefinitionArgumentList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3047:3: (otherlv_3= KEYWORD_62 ( (lv_parent_4_0= ruleParentName ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==KEYWORD_62) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3048:2: otherlv_3= KEYWORD_62 ( (lv_parent_4_0= ruleParentName ) )
                    {
                    otherlv_3=(Token)match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleHostClassDefinition6611); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getHostClassDefinitionAccess().getInheritsKeyword_3_0());
                          
                    }
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3052:1: ( (lv_parent_4_0= ruleParentName ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3053:1: (lv_parent_4_0= ruleParentName )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3053:1: (lv_parent_4_0= ruleParentName )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3054:3: lv_parent_4_0= ruleParentName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getHostClassDefinitionAccess().getParentParentNameParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParentName_in_ruleHostClassDefinition6631);
                    lv_parent_4_0=ruleParentName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getHostClassDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"parent",
                              		lv_parent_4_0, 
                              		"ParentName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleHostClassDefinition6646); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getHostClassDefinitionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3075:1: ( (lv_statements_6_0= ruleExpressionList ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( ((LA63_0>=KEYWORD_61 && LA63_0<=KEYWORD_55)||(LA63_0>=KEYWORD_57 && LA63_0<=KEYWORD_51)||(LA63_0>=KEYWORD_53 && LA63_0<=KEYWORD_54)||LA63_0==KEYWORD_24||LA63_0==KEYWORD_42||(LA63_0>=KEYWORD_1 && LA63_0<=KEYWORD_4)||LA63_0==KEYWORD_9||(LA63_0>=KEYWORD_17 && LA63_0<=KEYWORD_18)||LA63_0==KEYWORD_20||(LA63_0>=RULE_DOLLAR_VAR && LA63_0<=RULE_WORD_CHARS)||LA63_0==RULE_REGULAR_EXPRESSION) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3076:1: (lv_statements_6_0= ruleExpressionList )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3076:1: (lv_statements_6_0= ruleExpressionList )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3077:3: lv_statements_6_0= ruleExpressionList
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getHostClassDefinitionAccess().getStatementsExpressionListParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionList_in_ruleHostClassDefinition6666);
            	    lv_statements_6_0=ruleExpressionList();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getHostClassDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_6_0, 
            	              		"ExpressionList");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            otherlv_7=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleHostClassDefinition6680); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getHostClassDefinitionAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleHostClassDefinition"


    // $ANTLR start "entryRuleParentName"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3106:1: entryRuleParentName returns [EObject current=null] : iv_ruleParentName= ruleParentName EOF ;
    public final EObject entryRuleParentName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParentName = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3107:2: (iv_ruleParentName= ruleParentName EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3108:2: iv_ruleParentName= ruleParentName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParentNameRule()); 
            }
            pushFollow(FOLLOW_ruleParentName_in_entryRuleParentName6714);
            iv_ruleParentName=ruleParentName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParentName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParentName6724); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParentName"


    // $ANTLR start "ruleParentName"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3115:1: ruleParentName returns [EObject current=null] : (this_LiteralDefault_0= ruleLiteralDefault | this_LiteralClass_1= ruleLiteralClass | this_LiteralNameOrReference_2= ruleLiteralNameOrReference ) ;
    public final EObject ruleParentName() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralDefault_0 = null;

        EObject this_LiteralClass_1 = null;

        EObject this_LiteralNameOrReference_2 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3118:28: ( (this_LiteralDefault_0= ruleLiteralDefault | this_LiteralClass_1= ruleLiteralClass | this_LiteralNameOrReference_2= ruleLiteralNameOrReference ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3119:1: (this_LiteralDefault_0= ruleLiteralDefault | this_LiteralClass_1= ruleLiteralClass | this_LiteralNameOrReference_2= ruleLiteralNameOrReference )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3119:1: (this_LiteralDefault_0= ruleLiteralDefault | this_LiteralClass_1= ruleLiteralClass | this_LiteralNameOrReference_2= ruleLiteralNameOrReference )
            int alt64=3;
            switch ( input.LA(1) ) {
            case KEYWORD_61:
                {
                alt64=1;
                }
                break;
            case KEYWORD_55:
                {
                alt64=2;
                }
                break;
            case RULE_WORD_CHARS:
                {
                alt64=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3120:2: this_LiteralDefault_0= ruleLiteralDefault
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getParentNameAccess().getLiteralDefaultParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralDefault_in_ruleParentName6774);
                    this_LiteralDefault_0=ruleLiteralDefault();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_LiteralDefault_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3133:2: this_LiteralClass_1= ruleLiteralClass
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getParentNameAccess().getLiteralClassParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralClass_in_ruleParentName6804);
                    this_LiteralClass_1=ruleLiteralClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_LiteralClass_1;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3146:2: this_LiteralNameOrReference_2= ruleLiteralNameOrReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getParentNameAccess().getLiteralNameOrReferenceParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralNameOrReference_in_ruleParentName6834);
                    this_LiteralNameOrReference_2=ruleLiteralNameOrReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_LiteralNameOrReference_2;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleParentName"


    // $ANTLR start "entryRuleDefinition"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3165:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3166:2: (iv_ruleDefinition= ruleDefinition EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3167:2: iv_ruleDefinition= ruleDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition6868);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition6878); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3174:1: ruleDefinition returns [EObject current=null] : (otherlv_0= KEYWORD_59 ( (lv_className_1_0= ruleclassname ) ) ( (lv_arguments_2_0= ruleDefinitionArgumentList ) )? otherlv_3= KEYWORD_20 ( (lv_statements_4_0= ruleExpressionList ) )* otherlv_5= KEYWORD_21 ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_className_1_0 = null;

        EObject lv_arguments_2_0 = null;

        EObject lv_statements_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3177:28: ( (otherlv_0= KEYWORD_59 ( (lv_className_1_0= ruleclassname ) ) ( (lv_arguments_2_0= ruleDefinitionArgumentList ) )? otherlv_3= KEYWORD_20 ( (lv_statements_4_0= ruleExpressionList ) )* otherlv_5= KEYWORD_21 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3178:1: (otherlv_0= KEYWORD_59 ( (lv_className_1_0= ruleclassname ) ) ( (lv_arguments_2_0= ruleDefinitionArgumentList ) )? otherlv_3= KEYWORD_20 ( (lv_statements_4_0= ruleExpressionList ) )* otherlv_5= KEYWORD_21 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3178:1: (otherlv_0= KEYWORD_59 ( (lv_className_1_0= ruleclassname ) ) ( (lv_arguments_2_0= ruleDefinitionArgumentList ) )? otherlv_3= KEYWORD_20 ( (lv_statements_4_0= ruleExpressionList ) )* otherlv_5= KEYWORD_21 )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3179:2: otherlv_0= KEYWORD_59 ( (lv_className_1_0= ruleclassname ) ) ( (lv_arguments_2_0= ruleDefinitionArgumentList ) )? otherlv_3= KEYWORD_20 ( (lv_statements_4_0= ruleExpressionList ) )* otherlv_5= KEYWORD_21
            {
            otherlv_0=(Token)match(input,KEYWORD_59,FOLLOW_KEYWORD_59_in_ruleDefinition6916); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getDefineKeyword_0());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3183:1: ( (lv_className_1_0= ruleclassname ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3184:1: (lv_className_1_0= ruleclassname )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3184:1: (lv_className_1_0= ruleclassname )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3185:3: lv_className_1_0= ruleclassname
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDefinitionAccess().getClassNameClassnameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleclassname_in_ruleDefinition6936);
            lv_className_1_0=ruleclassname();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"className",
                      		lv_className_1_0, 
                      		"classname");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3201:2: ( (lv_arguments_2_0= ruleDefinitionArgumentList ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==KEYWORD_4) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3202:1: (lv_arguments_2_0= ruleDefinitionArgumentList )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3202:1: (lv_arguments_2_0= ruleDefinitionArgumentList )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3203:3: lv_arguments_2_0= ruleDefinitionArgumentList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDefinitionAccess().getArgumentsDefinitionArgumentListParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDefinitionArgumentList_in_ruleDefinition6957);
                    lv_arguments_2_0=ruleDefinitionArgumentList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"arguments",
                              		lv_arguments_2_0, 
                              		"DefinitionArgumentList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleDefinition6971); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDefinitionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3224:1: ( (lv_statements_4_0= ruleExpressionList ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( ((LA66_0>=KEYWORD_61 && LA66_0<=KEYWORD_55)||(LA66_0>=KEYWORD_57 && LA66_0<=KEYWORD_51)||(LA66_0>=KEYWORD_53 && LA66_0<=KEYWORD_54)||LA66_0==KEYWORD_24||LA66_0==KEYWORD_42||(LA66_0>=KEYWORD_1 && LA66_0<=KEYWORD_4)||LA66_0==KEYWORD_9||(LA66_0>=KEYWORD_17 && LA66_0<=KEYWORD_18)||LA66_0==KEYWORD_20||(LA66_0>=RULE_DOLLAR_VAR && LA66_0<=RULE_WORD_CHARS)||LA66_0==RULE_REGULAR_EXPRESSION) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3225:1: (lv_statements_4_0= ruleExpressionList )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3225:1: (lv_statements_4_0= ruleExpressionList )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3226:3: lv_statements_4_0= ruleExpressionList
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDefinitionAccess().getStatementsExpressionListParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionList_in_ruleDefinition6991);
            	    lv_statements_4_0=ruleExpressionList();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_4_0, 
            	              		"ExpressionList");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            otherlv_5=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleDefinition7005); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDefinitionAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleDefinitionArgumentList"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3255:1: entryRuleDefinitionArgumentList returns [EObject current=null] : iv_ruleDefinitionArgumentList= ruleDefinitionArgumentList EOF ;
    public final EObject entryRuleDefinitionArgumentList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionArgumentList = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3256:2: (iv_ruleDefinitionArgumentList= ruleDefinitionArgumentList EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3257:2: iv_ruleDefinitionArgumentList= ruleDefinitionArgumentList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionArgumentListRule()); 
            }
            pushFollow(FOLLOW_ruleDefinitionArgumentList_in_entryRuleDefinitionArgumentList7039);
            iv_ruleDefinitionArgumentList=ruleDefinitionArgumentList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefinitionArgumentList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinitionArgumentList7049); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDefinitionArgumentList"


    // $ANTLR start "ruleDefinitionArgumentList"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3264:1: ruleDefinitionArgumentList returns [EObject current=null] : ( () otherlv_1= KEYWORD_4 ( ( (lv_arguments_2_0= ruleDefinitionArgument ) ) (otherlv_3= KEYWORD_8 ( (lv_arguments_4_0= ruleDefinitionArgument ) ) )* )? ( ruleendComma )? otherlv_6= KEYWORD_5 ) ;
    public final EObject ruleDefinitionArgumentList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3267:28: ( ( () otherlv_1= KEYWORD_4 ( ( (lv_arguments_2_0= ruleDefinitionArgument ) ) (otherlv_3= KEYWORD_8 ( (lv_arguments_4_0= ruleDefinitionArgument ) ) )* )? ( ruleendComma )? otherlv_6= KEYWORD_5 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3268:1: ( () otherlv_1= KEYWORD_4 ( ( (lv_arguments_2_0= ruleDefinitionArgument ) ) (otherlv_3= KEYWORD_8 ( (lv_arguments_4_0= ruleDefinitionArgument ) ) )* )? ( ruleendComma )? otherlv_6= KEYWORD_5 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3268:1: ( () otherlv_1= KEYWORD_4 ( ( (lv_arguments_2_0= ruleDefinitionArgument ) ) (otherlv_3= KEYWORD_8 ( (lv_arguments_4_0= ruleDefinitionArgument ) ) )* )? ( ruleendComma )? otherlv_6= KEYWORD_5 )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3268:2: () otherlv_1= KEYWORD_4 ( ( (lv_arguments_2_0= ruleDefinitionArgument ) ) (otherlv_3= KEYWORD_8 ( (lv_arguments_4_0= ruleDefinitionArgument ) ) )* )? ( ruleendComma )? otherlv_6= KEYWORD_5
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3268:2: ()
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3269:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDefinitionArgumentListAccess().getDefinitionArgumentListAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleDefinitionArgumentList7099); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDefinitionArgumentListAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3282:1: ( ( (lv_arguments_2_0= ruleDefinitionArgument ) ) (otherlv_3= KEYWORD_8 ( (lv_arguments_4_0= ruleDefinitionArgument ) ) )* )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=RULE_DOLLAR_VAR && LA68_0<=RULE_WORD_CHARS)) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3282:2: ( (lv_arguments_2_0= ruleDefinitionArgument ) ) (otherlv_3= KEYWORD_8 ( (lv_arguments_4_0= ruleDefinitionArgument ) ) )*
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3282:2: ( (lv_arguments_2_0= ruleDefinitionArgument ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3283:1: (lv_arguments_2_0= ruleDefinitionArgument )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3283:1: (lv_arguments_2_0= ruleDefinitionArgument )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3284:3: lv_arguments_2_0= ruleDefinitionArgument
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDefinitionArgumentListAccess().getArgumentsDefinitionArgumentParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDefinitionArgument_in_ruleDefinitionArgumentList7120);
                    lv_arguments_2_0=ruleDefinitionArgument();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDefinitionArgumentListRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_2_0, 
                              		"DefinitionArgument");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3300:2: (otherlv_3= KEYWORD_8 ( (lv_arguments_4_0= ruleDefinitionArgument ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==KEYWORD_8) ) {
                            int LA67_1 = input.LA(2);

                            if ( ((LA67_1>=RULE_DOLLAR_VAR && LA67_1<=RULE_WORD_CHARS)) ) {
                                alt67=1;
                            }


                        }


                        switch (alt67) {
                    	case 1 :
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3301:2: otherlv_3= KEYWORD_8 ( (lv_arguments_4_0= ruleDefinitionArgument ) )
                    	    {
                    	    otherlv_3=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleDefinitionArgumentList7134); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getDefinitionArgumentListAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3305:1: ( (lv_arguments_4_0= ruleDefinitionArgument ) )
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3306:1: (lv_arguments_4_0= ruleDefinitionArgument )
                    	    {
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3306:1: (lv_arguments_4_0= ruleDefinitionArgument )
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3307:3: lv_arguments_4_0= ruleDefinitionArgument
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDefinitionArgumentListAccess().getArgumentsDefinitionArgumentParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleDefinitionArgument_in_ruleDefinitionArgumentList7154);
                    	    lv_arguments_4_0=ruleDefinitionArgument();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getDefinitionArgumentListRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_4_0, 
                    	              		"DefinitionArgument");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3323:6: ( ruleendComma )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==KEYWORD_8) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3324:2: ruleendComma
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefinitionArgumentListAccess().getEndCommaParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleendComma_in_ruleDefinitionArgumentList7178);
                    ruleendComma();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            otherlv_6=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleDefinitionArgumentList7192); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getDefinitionArgumentListAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDefinitionArgumentList"


    // $ANTLR start "entryRuleDefinitionArgument"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3347:1: entryRuleDefinitionArgument returns [EObject current=null] : iv_ruleDefinitionArgument= ruleDefinitionArgument EOF ;
    public final EObject entryRuleDefinitionArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionArgument = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3348:2: (iv_ruleDefinitionArgument= ruleDefinitionArgument EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3349:2: iv_ruleDefinitionArgument= ruleDefinitionArgument EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionArgumentRule()); 
            }
            pushFollow(FOLLOW_ruleDefinitionArgument_in_entryRuleDefinitionArgument7226);
            iv_ruleDefinitionArgument=ruleDefinitionArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefinitionArgument; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinitionArgument7236); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDefinitionArgument"


    // $ANTLR start "ruleDefinitionArgument"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3356:1: ruleDefinitionArgument returns [EObject current=null] : ( ( (lv_argName_0_0= ruleUNION_VARIABLE_OR_NAME ) ) ( ( ( (lv_op_1_0= KEYWORD_14 ) ) | ( (lv_op_2_0= KEYWORD_34 ) ) ) ( (lv_value_3_0= ruleAssignmentExpression ) ) )? ) ;
    public final EObject ruleDefinitionArgument() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        Token lv_op_2_0=null;
        AntlrDatatypeRuleToken lv_argName_0_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3359:28: ( ( ( (lv_argName_0_0= ruleUNION_VARIABLE_OR_NAME ) ) ( ( ( (lv_op_1_0= KEYWORD_14 ) ) | ( (lv_op_2_0= KEYWORD_34 ) ) ) ( (lv_value_3_0= ruleAssignmentExpression ) ) )? ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3360:1: ( ( (lv_argName_0_0= ruleUNION_VARIABLE_OR_NAME ) ) ( ( ( (lv_op_1_0= KEYWORD_14 ) ) | ( (lv_op_2_0= KEYWORD_34 ) ) ) ( (lv_value_3_0= ruleAssignmentExpression ) ) )? )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3360:1: ( ( (lv_argName_0_0= ruleUNION_VARIABLE_OR_NAME ) ) ( ( ( (lv_op_1_0= KEYWORD_14 ) ) | ( (lv_op_2_0= KEYWORD_34 ) ) ) ( (lv_value_3_0= ruleAssignmentExpression ) ) )? )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3360:2: ( (lv_argName_0_0= ruleUNION_VARIABLE_OR_NAME ) ) ( ( ( (lv_op_1_0= KEYWORD_14 ) ) | ( (lv_op_2_0= KEYWORD_34 ) ) ) ( (lv_value_3_0= ruleAssignmentExpression ) ) )?
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3360:2: ( (lv_argName_0_0= ruleUNION_VARIABLE_OR_NAME ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3361:1: (lv_argName_0_0= ruleUNION_VARIABLE_OR_NAME )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3361:1: (lv_argName_0_0= ruleUNION_VARIABLE_OR_NAME )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3362:3: lv_argName_0_0= ruleUNION_VARIABLE_OR_NAME
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDefinitionArgumentAccess().getArgNameUNION_VARIABLE_OR_NAMEParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUNION_VARIABLE_OR_NAME_in_ruleDefinitionArgument7282);
            lv_argName_0_0=ruleUNION_VARIABLE_OR_NAME();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDefinitionArgumentRule());
              	        }
                     		set(
                     			current, 
                     			"argName",
                      		lv_argName_0_0, 
                      		"UNION_VARIABLE_OR_NAME");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3378:2: ( ( ( (lv_op_1_0= KEYWORD_14 ) ) | ( (lv_op_2_0= KEYWORD_34 ) ) ) ( (lv_value_3_0= ruleAssignmentExpression ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==KEYWORD_34||LA71_0==KEYWORD_14) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3378:3: ( ( (lv_op_1_0= KEYWORD_14 ) ) | ( (lv_op_2_0= KEYWORD_34 ) ) ) ( (lv_value_3_0= ruleAssignmentExpression ) )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3378:3: ( ( (lv_op_1_0= KEYWORD_14 ) ) | ( (lv_op_2_0= KEYWORD_34 ) ) )
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==KEYWORD_14) ) {
                        alt70=1;
                    }
                    else if ( (LA70_0==KEYWORD_34) ) {
                        alt70=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 70, 0, input);

                        throw nvae;
                    }
                    switch (alt70) {
                        case 1 :
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3378:4: ( (lv_op_1_0= KEYWORD_14 ) )
                            {
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3378:4: ( (lv_op_1_0= KEYWORD_14 ) )
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3379:1: (lv_op_1_0= KEYWORD_14 )
                            {
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3379:1: (lv_op_1_0= KEYWORD_14 )
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3380:3: lv_op_1_0= KEYWORD_14
                            {
                            lv_op_1_0=(Token)match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleDefinitionArgument7303); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_1_0, grammarAccess.getDefinitionArgumentAccess().getOpEqualsSignKeyword_1_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getDefinitionArgumentRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_1_0, "=");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3395:6: ( (lv_op_2_0= KEYWORD_34 ) )
                            {
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3395:6: ( (lv_op_2_0= KEYWORD_34 ) )
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3396:1: (lv_op_2_0= KEYWORD_34 )
                            {
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3396:1: (lv_op_2_0= KEYWORD_34 )
                            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3397:3: lv_op_2_0= KEYWORD_34
                            {
                            lv_op_2_0=(Token)match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_ruleDefinitionArgument7339); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_op_2_0, grammarAccess.getDefinitionArgumentAccess().getOpEqualsSignGreaterThanSignKeyword_1_0_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getDefinitionArgumentRule());
                              	        }
                                     		setWithLastConsumed(current, "op", lv_op_2_0, "=>");
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3411:3: ( (lv_value_3_0= ruleAssignmentExpression ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3412:1: (lv_value_3_0= ruleAssignmentExpression )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3412:1: (lv_value_3_0= ruleAssignmentExpression )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3413:3: lv_value_3_0= ruleAssignmentExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDefinitionArgumentAccess().getValueAssignmentExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleDefinitionArgument7372);
                    lv_value_3_0=ruleAssignmentExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDefinitionArgumentRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"AssignmentExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDefinitionArgument"


    // $ANTLR start "entryRuleCaseExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3437:1: entryRuleCaseExpression returns [EObject current=null] : iv_ruleCaseExpression= ruleCaseExpression EOF ;
    public final EObject entryRuleCaseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3438:2: (iv_ruleCaseExpression= ruleCaseExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3439:2: iv_ruleCaseExpression= ruleCaseExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCaseExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCaseExpression_in_entryRuleCaseExpression7409);
            iv_ruleCaseExpression=ruleCaseExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCaseExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCaseExpression7419); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCaseExpression"


    // $ANTLR start "ruleCaseExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3446:1: ruleCaseExpression returns [EObject current=null] : (otherlv_0= KEYWORD_51 ( (lv_switchExpr_1_0= ruleAssignmentExpression ) ) otherlv_2= KEYWORD_20 ( (lv_cases_3_0= ruleCase ) )* otherlv_4= KEYWORD_21 ) ;
    public final EObject ruleCaseExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_switchExpr_1_0 = null;

        EObject lv_cases_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3449:28: ( (otherlv_0= KEYWORD_51 ( (lv_switchExpr_1_0= ruleAssignmentExpression ) ) otherlv_2= KEYWORD_20 ( (lv_cases_3_0= ruleCase ) )* otherlv_4= KEYWORD_21 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3450:1: (otherlv_0= KEYWORD_51 ( (lv_switchExpr_1_0= ruleAssignmentExpression ) ) otherlv_2= KEYWORD_20 ( (lv_cases_3_0= ruleCase ) )* otherlv_4= KEYWORD_21 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3450:1: (otherlv_0= KEYWORD_51 ( (lv_switchExpr_1_0= ruleAssignmentExpression ) ) otherlv_2= KEYWORD_20 ( (lv_cases_3_0= ruleCase ) )* otherlv_4= KEYWORD_21 )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3451:2: otherlv_0= KEYWORD_51 ( (lv_switchExpr_1_0= ruleAssignmentExpression ) ) otherlv_2= KEYWORD_20 ( (lv_cases_3_0= ruleCase ) )* otherlv_4= KEYWORD_21
            {
            otherlv_0=(Token)match(input,KEYWORD_51,FOLLOW_KEYWORD_51_in_ruleCaseExpression7457); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCaseExpressionAccess().getCaseKeyword_0());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3455:1: ( (lv_switchExpr_1_0= ruleAssignmentExpression ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3456:1: (lv_switchExpr_1_0= ruleAssignmentExpression )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3456:1: (lv_switchExpr_1_0= ruleAssignmentExpression )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3457:3: lv_switchExpr_1_0= ruleAssignmentExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCaseExpressionAccess().getSwitchExprAssignmentExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleCaseExpression7477);
            lv_switchExpr_1_0=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCaseExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"switchExpr",
                      		lv_switchExpr_1_0, 
                      		"AssignmentExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleCaseExpression7490); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCaseExpressionAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3478:1: ( (lv_cases_3_0= ruleCase ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( ((LA72_0>=KEYWORD_61 && LA72_0<=KEYWORD_55)||(LA72_0>=KEYWORD_57 && LA72_0<=KEYWORD_51)||(LA72_0>=KEYWORD_53 && LA72_0<=KEYWORD_54)||LA72_0==KEYWORD_24||LA72_0==KEYWORD_42||(LA72_0>=KEYWORD_1 && LA72_0<=KEYWORD_4)||LA72_0==KEYWORD_9||(LA72_0>=KEYWORD_17 && LA72_0<=KEYWORD_18)||LA72_0==KEYWORD_20||(LA72_0>=RULE_DOLLAR_VAR && LA72_0<=RULE_WORD_CHARS)||LA72_0==RULE_REGULAR_EXPRESSION) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3479:1: (lv_cases_3_0= ruleCase )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3479:1: (lv_cases_3_0= ruleCase )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3480:3: lv_cases_3_0= ruleCase
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCaseExpressionAccess().getCasesCaseParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCase_in_ruleCaseExpression7510);
            	    lv_cases_3_0=ruleCase();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCaseExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_3_0, 
            	              		"Case");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);

            otherlv_4=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleCaseExpression7524); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getCaseExpressionAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCaseExpression"


    // $ANTLR start "entryRuleCase"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3509:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3510:2: (iv_ruleCase= ruleCase EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3511:2: iv_ruleCase= ruleCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCaseRule()); 
            }
            pushFollow(FOLLOW_ruleCase_in_entryRuleCase7558);
            iv_ruleCase=ruleCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCase; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCase7568); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCase"


    // $ANTLR start "ruleCase"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3518:1: ruleCase returns [EObject current=null] : ( ( (lv_values_0_0= ruleAssignmentExpression ) ) (otherlv_1= KEYWORD_8 ( (lv_values_2_0= ruleAssignmentExpression ) ) )* otherlv_3= KEYWORD_11 otherlv_4= KEYWORD_20 ( (lv_statements_5_0= ruleExpressionList ) )* otherlv_6= KEYWORD_21 ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_values_0_0 = null;

        EObject lv_values_2_0 = null;

        EObject lv_statements_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3521:28: ( ( ( (lv_values_0_0= ruleAssignmentExpression ) ) (otherlv_1= KEYWORD_8 ( (lv_values_2_0= ruleAssignmentExpression ) ) )* otherlv_3= KEYWORD_11 otherlv_4= KEYWORD_20 ( (lv_statements_5_0= ruleExpressionList ) )* otherlv_6= KEYWORD_21 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3522:1: ( ( (lv_values_0_0= ruleAssignmentExpression ) ) (otherlv_1= KEYWORD_8 ( (lv_values_2_0= ruleAssignmentExpression ) ) )* otherlv_3= KEYWORD_11 otherlv_4= KEYWORD_20 ( (lv_statements_5_0= ruleExpressionList ) )* otherlv_6= KEYWORD_21 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3522:1: ( ( (lv_values_0_0= ruleAssignmentExpression ) ) (otherlv_1= KEYWORD_8 ( (lv_values_2_0= ruleAssignmentExpression ) ) )* otherlv_3= KEYWORD_11 otherlv_4= KEYWORD_20 ( (lv_statements_5_0= ruleExpressionList ) )* otherlv_6= KEYWORD_21 )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3522:2: ( (lv_values_0_0= ruleAssignmentExpression ) ) (otherlv_1= KEYWORD_8 ( (lv_values_2_0= ruleAssignmentExpression ) ) )* otherlv_3= KEYWORD_11 otherlv_4= KEYWORD_20 ( (lv_statements_5_0= ruleExpressionList ) )* otherlv_6= KEYWORD_21
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3522:2: ( (lv_values_0_0= ruleAssignmentExpression ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3523:1: (lv_values_0_0= ruleAssignmentExpression )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3523:1: (lv_values_0_0= ruleAssignmentExpression )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3524:3: lv_values_0_0= ruleAssignmentExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCaseAccess().getValuesAssignmentExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleCase7614);
            lv_values_0_0=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCaseRule());
              	        }
                     		add(
                     			current, 
                     			"values",
                      		lv_values_0_0, 
                      		"AssignmentExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3540:2: (otherlv_1= KEYWORD_8 ( (lv_values_2_0= ruleAssignmentExpression ) ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==KEYWORD_8) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3541:2: otherlv_1= KEYWORD_8 ( (lv_values_2_0= ruleAssignmentExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleCase7628); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getCaseAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3545:1: ( (lv_values_2_0= ruleAssignmentExpression ) )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3546:1: (lv_values_2_0= ruleAssignmentExpression )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3546:1: (lv_values_2_0= ruleAssignmentExpression )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3547:3: lv_values_2_0= ruleAssignmentExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCaseAccess().getValuesAssignmentExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleCase7648);
            	    lv_values_2_0=ruleAssignmentExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCaseRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"values",
            	              		lv_values_2_0, 
            	              		"AssignmentExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

            otherlv_3=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleCase7663); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCaseAccess().getColonKeyword_2());
                  
            }
            otherlv_4=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleCase7675); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getCaseAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3573:1: ( (lv_statements_5_0= ruleExpressionList ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( ((LA74_0>=KEYWORD_61 && LA74_0<=KEYWORD_55)||(LA74_0>=KEYWORD_57 && LA74_0<=KEYWORD_51)||(LA74_0>=KEYWORD_53 && LA74_0<=KEYWORD_54)||LA74_0==KEYWORD_24||LA74_0==KEYWORD_42||(LA74_0>=KEYWORD_1 && LA74_0<=KEYWORD_4)||LA74_0==KEYWORD_9||(LA74_0>=KEYWORD_17 && LA74_0<=KEYWORD_18)||LA74_0==KEYWORD_20||(LA74_0>=RULE_DOLLAR_VAR && LA74_0<=RULE_WORD_CHARS)||LA74_0==RULE_REGULAR_EXPRESSION) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3574:1: (lv_statements_5_0= ruleExpressionList )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3574:1: (lv_statements_5_0= ruleExpressionList )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3575:3: lv_statements_5_0= ruleExpressionList
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCaseAccess().getStatementsExpressionListParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionList_in_ruleCase7695);
            	    lv_statements_5_0=ruleExpressionList();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCaseRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_5_0, 
            	              		"ExpressionList");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);

            otherlv_6=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleCase7709); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getCaseAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCase"


    // $ANTLR start "entryRuleIfExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3604:1: entryRuleIfExpression returns [EObject current=null] : iv_ruleIfExpression= ruleIfExpression EOF ;
    public final EObject entryRuleIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3605:2: (iv_ruleIfExpression= ruleIfExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3606:2: iv_ruleIfExpression= ruleIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleIfExpression_in_entryRuleIfExpression7743);
            iv_ruleIfExpression=ruleIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfExpression7753); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIfExpression"


    // $ANTLR start "ruleIfExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3613:1: ruleIfExpression returns [EObject current=null] : (otherlv_0= KEYWORD_42 ( (lv_condExpr_1_0= ruleAssignmentExpression ) ) otherlv_2= KEYWORD_20 ( (lv_thenStatements_3_0= ruleExpressionList ) )* otherlv_4= KEYWORD_21 ( ( ( ( KEYWORD_56 )=>otherlv_5= KEYWORD_56 ) ( (lv_elseStatement_6_0= ruleElseIfExpression ) ) ) | ( ( ( KEYWORD_52 )=>otherlv_7= KEYWORD_52 ) ( (lv_elseStatement_8_0= ruleElseExpression ) ) ) )? ) ;
    public final EObject ruleIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_condExpr_1_0 = null;

        EObject lv_thenStatements_3_0 = null;

        EObject lv_elseStatement_6_0 = null;

        EObject lv_elseStatement_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3616:28: ( (otherlv_0= KEYWORD_42 ( (lv_condExpr_1_0= ruleAssignmentExpression ) ) otherlv_2= KEYWORD_20 ( (lv_thenStatements_3_0= ruleExpressionList ) )* otherlv_4= KEYWORD_21 ( ( ( ( KEYWORD_56 )=>otherlv_5= KEYWORD_56 ) ( (lv_elseStatement_6_0= ruleElseIfExpression ) ) ) | ( ( ( KEYWORD_52 )=>otherlv_7= KEYWORD_52 ) ( (lv_elseStatement_8_0= ruleElseExpression ) ) ) )? ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3617:1: (otherlv_0= KEYWORD_42 ( (lv_condExpr_1_0= ruleAssignmentExpression ) ) otherlv_2= KEYWORD_20 ( (lv_thenStatements_3_0= ruleExpressionList ) )* otherlv_4= KEYWORD_21 ( ( ( ( KEYWORD_56 )=>otherlv_5= KEYWORD_56 ) ( (lv_elseStatement_6_0= ruleElseIfExpression ) ) ) | ( ( ( KEYWORD_52 )=>otherlv_7= KEYWORD_52 ) ( (lv_elseStatement_8_0= ruleElseExpression ) ) ) )? )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3617:1: (otherlv_0= KEYWORD_42 ( (lv_condExpr_1_0= ruleAssignmentExpression ) ) otherlv_2= KEYWORD_20 ( (lv_thenStatements_3_0= ruleExpressionList ) )* otherlv_4= KEYWORD_21 ( ( ( ( KEYWORD_56 )=>otherlv_5= KEYWORD_56 ) ( (lv_elseStatement_6_0= ruleElseIfExpression ) ) ) | ( ( ( KEYWORD_52 )=>otherlv_7= KEYWORD_52 ) ( (lv_elseStatement_8_0= ruleElseExpression ) ) ) )? )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3618:2: otherlv_0= KEYWORD_42 ( (lv_condExpr_1_0= ruleAssignmentExpression ) ) otherlv_2= KEYWORD_20 ( (lv_thenStatements_3_0= ruleExpressionList ) )* otherlv_4= KEYWORD_21 ( ( ( ( KEYWORD_56 )=>otherlv_5= KEYWORD_56 ) ( (lv_elseStatement_6_0= ruleElseIfExpression ) ) ) | ( ( ( KEYWORD_52 )=>otherlv_7= KEYWORD_52 ) ( (lv_elseStatement_8_0= ruleElseExpression ) ) ) )?
            {
            otherlv_0=(Token)match(input,KEYWORD_42,FOLLOW_KEYWORD_42_in_ruleIfExpression7791); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfExpressionAccess().getIfKeyword_0());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3622:1: ( (lv_condExpr_1_0= ruleAssignmentExpression ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3623:1: (lv_condExpr_1_0= ruleAssignmentExpression )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3623:1: (lv_condExpr_1_0= ruleAssignmentExpression )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3624:3: lv_condExpr_1_0= ruleAssignmentExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfExpressionAccess().getCondExprAssignmentExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleIfExpression7811);
            lv_condExpr_1_0=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"condExpr",
                      		lv_condExpr_1_0, 
                      		"AssignmentExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleIfExpression7824); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getIfExpressionAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3645:1: ( (lv_thenStatements_3_0= ruleExpressionList ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( ((LA75_0>=KEYWORD_61 && LA75_0<=KEYWORD_55)||(LA75_0>=KEYWORD_57 && LA75_0<=KEYWORD_51)||(LA75_0>=KEYWORD_53 && LA75_0<=KEYWORD_54)||LA75_0==KEYWORD_24||LA75_0==KEYWORD_42||(LA75_0>=KEYWORD_1 && LA75_0<=KEYWORD_4)||LA75_0==KEYWORD_9||(LA75_0>=KEYWORD_17 && LA75_0<=KEYWORD_18)||LA75_0==KEYWORD_20||(LA75_0>=RULE_DOLLAR_VAR && LA75_0<=RULE_WORD_CHARS)||LA75_0==RULE_REGULAR_EXPRESSION) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3646:1: (lv_thenStatements_3_0= ruleExpressionList )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3646:1: (lv_thenStatements_3_0= ruleExpressionList )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3647:3: lv_thenStatements_3_0= ruleExpressionList
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getIfExpressionAccess().getThenStatementsExpressionListParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionList_in_ruleIfExpression7844);
            	    lv_thenStatements_3_0=ruleExpressionList();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getIfExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"thenStatements",
            	              		lv_thenStatements_3_0, 
            	              		"ExpressionList");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);

            otherlv_4=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleIfExpression7858); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getIfExpressionAccess().getRightCurlyBracketKeyword_4());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3668:1: ( ( ( ( KEYWORD_56 )=>otherlv_5= KEYWORD_56 ) ( (lv_elseStatement_6_0= ruleElseIfExpression ) ) ) | ( ( ( KEYWORD_52 )=>otherlv_7= KEYWORD_52 ) ( (lv_elseStatement_8_0= ruleElseExpression ) ) ) )?
            int alt76=3;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==KEYWORD_56) ) {
                alt76=1;
            }
            else if ( (LA76_0==KEYWORD_52) ) {
                alt76=2;
            }
            switch (alt76) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3668:2: ( ( ( KEYWORD_56 )=>otherlv_5= KEYWORD_56 ) ( (lv_elseStatement_6_0= ruleElseIfExpression ) ) )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3668:2: ( ( ( KEYWORD_56 )=>otherlv_5= KEYWORD_56 ) ( (lv_elseStatement_6_0= ruleElseIfExpression ) ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3668:3: ( ( KEYWORD_56 )=>otherlv_5= KEYWORD_56 ) ( (lv_elseStatement_6_0= ruleElseIfExpression ) )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3668:3: ( ( KEYWORD_56 )=>otherlv_5= KEYWORD_56 )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3668:4: ( KEYWORD_56 )=>otherlv_5= KEYWORD_56
                    {
                    otherlv_5=(Token)match(input,KEYWORD_56,FOLLOW_KEYWORD_56_in_ruleIfExpression7879); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getIfExpressionAccess().getElsifKeyword_5_0_0());
                          
                    }

                    }

                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3675:2: ( (lv_elseStatement_6_0= ruleElseIfExpression ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3676:1: (lv_elseStatement_6_0= ruleElseIfExpression )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3676:1: (lv_elseStatement_6_0= ruleElseIfExpression )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3677:3: lv_elseStatement_6_0= ruleElseIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfExpressionAccess().getElseStatementElseIfExpressionParserRuleCall_5_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleElseIfExpression_in_ruleIfExpression7900);
                    lv_elseStatement_6_0=ruleElseIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"elseStatement",
                              		lv_elseStatement_6_0, 
                              		"ElseIfExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3694:6: ( ( ( KEYWORD_52 )=>otherlv_7= KEYWORD_52 ) ( (lv_elseStatement_8_0= ruleElseExpression ) ) )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3694:6: ( ( ( KEYWORD_52 )=>otherlv_7= KEYWORD_52 ) ( (lv_elseStatement_8_0= ruleElseExpression ) ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3694:7: ( ( KEYWORD_52 )=>otherlv_7= KEYWORD_52 ) ( (lv_elseStatement_8_0= ruleElseExpression ) )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3694:7: ( ( KEYWORD_52 )=>otherlv_7= KEYWORD_52 )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3694:8: ( KEYWORD_52 )=>otherlv_7= KEYWORD_52
                    {
                    otherlv_7=(Token)match(input,KEYWORD_52,FOLLOW_KEYWORD_52_in_ruleIfExpression7928); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getIfExpressionAccess().getElseKeyword_5_1_0());
                          
                    }

                    }

                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3701:2: ( (lv_elseStatement_8_0= ruleElseExpression ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3702:1: (lv_elseStatement_8_0= ruleElseExpression )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3702:1: (lv_elseStatement_8_0= ruleElseExpression )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3703:3: lv_elseStatement_8_0= ruleElseExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfExpressionAccess().getElseStatementElseExpressionParserRuleCall_5_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleElseExpression_in_ruleIfExpression7949);
                    lv_elseStatement_8_0=ruleElseExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"elseStatement",
                              		lv_elseStatement_8_0, 
                              		"ElseExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIfExpression"


    // $ANTLR start "entryRuleElseExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3727:1: entryRuleElseExpression returns [EObject current=null] : iv_ruleElseExpression= ruleElseExpression EOF ;
    public final EObject entryRuleElseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3728:2: (iv_ruleElseExpression= ruleElseExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3729:2: iv_ruleElseExpression= ruleElseExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElseExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleElseExpression_in_entryRuleElseExpression7987);
            iv_ruleElseExpression=ruleElseExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElseExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElseExpression7997); if (state.failed) return current;

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
    // $ANTLR end "entryRuleElseExpression"


    // $ANTLR start "ruleElseExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3736:1: ruleElseExpression returns [EObject current=null] : ( () otherlv_1= KEYWORD_20 ( (lv_statements_2_0= ruleExpressionList ) )* otherlv_3= KEYWORD_21 ) ;
    public final EObject ruleElseExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3739:28: ( ( () otherlv_1= KEYWORD_20 ( (lv_statements_2_0= ruleExpressionList ) )* otherlv_3= KEYWORD_21 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3740:1: ( () otherlv_1= KEYWORD_20 ( (lv_statements_2_0= ruleExpressionList ) )* otherlv_3= KEYWORD_21 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3740:1: ( () otherlv_1= KEYWORD_20 ( (lv_statements_2_0= ruleExpressionList ) )* otherlv_3= KEYWORD_21 )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3740:2: () otherlv_1= KEYWORD_20 ( (lv_statements_2_0= ruleExpressionList ) )* otherlv_3= KEYWORD_21
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3740:2: ()
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3741:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getElseExpressionAccess().getElseExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleElseExpression8047); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getElseExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3754:1: ( (lv_statements_2_0= ruleExpressionList ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( ((LA77_0>=KEYWORD_61 && LA77_0<=KEYWORD_55)||(LA77_0>=KEYWORD_57 && LA77_0<=KEYWORD_51)||(LA77_0>=KEYWORD_53 && LA77_0<=KEYWORD_54)||LA77_0==KEYWORD_24||LA77_0==KEYWORD_42||(LA77_0>=KEYWORD_1 && LA77_0<=KEYWORD_4)||LA77_0==KEYWORD_9||(LA77_0>=KEYWORD_17 && LA77_0<=KEYWORD_18)||LA77_0==KEYWORD_20||(LA77_0>=RULE_DOLLAR_VAR && LA77_0<=RULE_WORD_CHARS)||LA77_0==RULE_REGULAR_EXPRESSION) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3755:1: (lv_statements_2_0= ruleExpressionList )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3755:1: (lv_statements_2_0= ruleExpressionList )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3756:3: lv_statements_2_0= ruleExpressionList
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getElseExpressionAccess().getStatementsExpressionListParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionList_in_ruleElseExpression8067);
            	    lv_statements_2_0=ruleExpressionList();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getElseExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_2_0, 
            	              		"ExpressionList");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);

            otherlv_3=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleElseExpression8081); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getElseExpressionAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleElseExpression"


    // $ANTLR start "entryRuleElseIfExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3785:1: entryRuleElseIfExpression returns [EObject current=null] : iv_ruleElseIfExpression= ruleElseIfExpression EOF ;
    public final EObject entryRuleElseIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseIfExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3786:2: (iv_ruleElseIfExpression= ruleElseIfExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3787:2: iv_ruleElseIfExpression= ruleElseIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElseIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleElseIfExpression_in_entryRuleElseIfExpression8115);
            iv_ruleElseIfExpression=ruleElseIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElseIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElseIfExpression8125); if (state.failed) return current;

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
    // $ANTLR end "entryRuleElseIfExpression"


    // $ANTLR start "ruleElseIfExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3794:1: ruleElseIfExpression returns [EObject current=null] : ( () ( (lv_condExpr_1_0= ruleAssignmentExpression ) ) otherlv_2= KEYWORD_20 ( (lv_thenStatements_3_0= ruleExpressionList ) )* otherlv_4= KEYWORD_21 ( ( ( ( KEYWORD_56 )=>otherlv_5= KEYWORD_56 ) ( (lv_elseStatement_6_0= ruleElseIfExpression ) ) ) | ( ( ( KEYWORD_52 )=>otherlv_7= KEYWORD_52 ) ( (lv_elseStatement_8_0= ruleElseExpression ) ) ) )? ) ;
    public final EObject ruleElseIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_condExpr_1_0 = null;

        EObject lv_thenStatements_3_0 = null;

        EObject lv_elseStatement_6_0 = null;

        EObject lv_elseStatement_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3797:28: ( ( () ( (lv_condExpr_1_0= ruleAssignmentExpression ) ) otherlv_2= KEYWORD_20 ( (lv_thenStatements_3_0= ruleExpressionList ) )* otherlv_4= KEYWORD_21 ( ( ( ( KEYWORD_56 )=>otherlv_5= KEYWORD_56 ) ( (lv_elseStatement_6_0= ruleElseIfExpression ) ) ) | ( ( ( KEYWORD_52 )=>otherlv_7= KEYWORD_52 ) ( (lv_elseStatement_8_0= ruleElseExpression ) ) ) )? ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3798:1: ( () ( (lv_condExpr_1_0= ruleAssignmentExpression ) ) otherlv_2= KEYWORD_20 ( (lv_thenStatements_3_0= ruleExpressionList ) )* otherlv_4= KEYWORD_21 ( ( ( ( KEYWORD_56 )=>otherlv_5= KEYWORD_56 ) ( (lv_elseStatement_6_0= ruleElseIfExpression ) ) ) | ( ( ( KEYWORD_52 )=>otherlv_7= KEYWORD_52 ) ( (lv_elseStatement_8_0= ruleElseExpression ) ) ) )? )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3798:1: ( () ( (lv_condExpr_1_0= ruleAssignmentExpression ) ) otherlv_2= KEYWORD_20 ( (lv_thenStatements_3_0= ruleExpressionList ) )* otherlv_4= KEYWORD_21 ( ( ( ( KEYWORD_56 )=>otherlv_5= KEYWORD_56 ) ( (lv_elseStatement_6_0= ruleElseIfExpression ) ) ) | ( ( ( KEYWORD_52 )=>otherlv_7= KEYWORD_52 ) ( (lv_elseStatement_8_0= ruleElseExpression ) ) ) )? )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3798:2: () ( (lv_condExpr_1_0= ruleAssignmentExpression ) ) otherlv_2= KEYWORD_20 ( (lv_thenStatements_3_0= ruleExpressionList ) )* otherlv_4= KEYWORD_21 ( ( ( ( KEYWORD_56 )=>otherlv_5= KEYWORD_56 ) ( (lv_elseStatement_6_0= ruleElseIfExpression ) ) ) | ( ( ( KEYWORD_52 )=>otherlv_7= KEYWORD_52 ) ( (lv_elseStatement_8_0= ruleElseExpression ) ) ) )?
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3798:2: ()
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3799:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getElseIfExpressionAccess().getElseIfExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3807:2: ( (lv_condExpr_1_0= ruleAssignmentExpression ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3808:1: (lv_condExpr_1_0= ruleAssignmentExpression )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3808:1: (lv_condExpr_1_0= ruleAssignmentExpression )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3809:3: lv_condExpr_1_0= ruleAssignmentExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getElseIfExpressionAccess().getCondExprAssignmentExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleElseIfExpression8183);
            lv_condExpr_1_0=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getElseIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"condExpr",
                      		lv_condExpr_1_0, 
                      		"AssignmentExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleElseIfExpression8196); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getElseIfExpressionAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3830:1: ( (lv_thenStatements_3_0= ruleExpressionList ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( ((LA78_0>=KEYWORD_61 && LA78_0<=KEYWORD_55)||(LA78_0>=KEYWORD_57 && LA78_0<=KEYWORD_51)||(LA78_0>=KEYWORD_53 && LA78_0<=KEYWORD_54)||LA78_0==KEYWORD_24||LA78_0==KEYWORD_42||(LA78_0>=KEYWORD_1 && LA78_0<=KEYWORD_4)||LA78_0==KEYWORD_9||(LA78_0>=KEYWORD_17 && LA78_0<=KEYWORD_18)||LA78_0==KEYWORD_20||(LA78_0>=RULE_DOLLAR_VAR && LA78_0<=RULE_WORD_CHARS)||LA78_0==RULE_REGULAR_EXPRESSION) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3831:1: (lv_thenStatements_3_0= ruleExpressionList )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3831:1: (lv_thenStatements_3_0= ruleExpressionList )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3832:3: lv_thenStatements_3_0= ruleExpressionList
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getElseIfExpressionAccess().getThenStatementsExpressionListParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionList_in_ruleElseIfExpression8216);
            	    lv_thenStatements_3_0=ruleExpressionList();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getElseIfExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"thenStatements",
            	              		lv_thenStatements_3_0, 
            	              		"ExpressionList");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);

            otherlv_4=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleElseIfExpression8230); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getElseIfExpressionAccess().getRightCurlyBracketKeyword_4());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3853:1: ( ( ( ( KEYWORD_56 )=>otherlv_5= KEYWORD_56 ) ( (lv_elseStatement_6_0= ruleElseIfExpression ) ) ) | ( ( ( KEYWORD_52 )=>otherlv_7= KEYWORD_52 ) ( (lv_elseStatement_8_0= ruleElseExpression ) ) ) )?
            int alt79=3;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==KEYWORD_56) ) {
                alt79=1;
            }
            else if ( (LA79_0==KEYWORD_52) ) {
                alt79=2;
            }
            switch (alt79) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3853:2: ( ( ( KEYWORD_56 )=>otherlv_5= KEYWORD_56 ) ( (lv_elseStatement_6_0= ruleElseIfExpression ) ) )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3853:2: ( ( ( KEYWORD_56 )=>otherlv_5= KEYWORD_56 ) ( (lv_elseStatement_6_0= ruleElseIfExpression ) ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3853:3: ( ( KEYWORD_56 )=>otherlv_5= KEYWORD_56 ) ( (lv_elseStatement_6_0= ruleElseIfExpression ) )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3853:3: ( ( KEYWORD_56 )=>otherlv_5= KEYWORD_56 )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3853:4: ( KEYWORD_56 )=>otherlv_5= KEYWORD_56
                    {
                    otherlv_5=(Token)match(input,KEYWORD_56,FOLLOW_KEYWORD_56_in_ruleElseIfExpression8251); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getElseIfExpressionAccess().getElsifKeyword_5_0_0());
                          
                    }

                    }

                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3860:2: ( (lv_elseStatement_6_0= ruleElseIfExpression ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3861:1: (lv_elseStatement_6_0= ruleElseIfExpression )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3861:1: (lv_elseStatement_6_0= ruleElseIfExpression )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3862:3: lv_elseStatement_6_0= ruleElseIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getElseIfExpressionAccess().getElseStatementElseIfExpressionParserRuleCall_5_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleElseIfExpression_in_ruleElseIfExpression8272);
                    lv_elseStatement_6_0=ruleElseIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getElseIfExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"elseStatement",
                              		lv_elseStatement_6_0, 
                              		"ElseIfExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3879:6: ( ( ( KEYWORD_52 )=>otherlv_7= KEYWORD_52 ) ( (lv_elseStatement_8_0= ruleElseExpression ) ) )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3879:6: ( ( ( KEYWORD_52 )=>otherlv_7= KEYWORD_52 ) ( (lv_elseStatement_8_0= ruleElseExpression ) ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3879:7: ( ( KEYWORD_52 )=>otherlv_7= KEYWORD_52 ) ( (lv_elseStatement_8_0= ruleElseExpression ) )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3879:7: ( ( KEYWORD_52 )=>otherlv_7= KEYWORD_52 )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3879:8: ( KEYWORD_52 )=>otherlv_7= KEYWORD_52
                    {
                    otherlv_7=(Token)match(input,KEYWORD_52,FOLLOW_KEYWORD_52_in_ruleElseIfExpression8300); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getElseIfExpressionAccess().getElseKeyword_5_1_0());
                          
                    }

                    }

                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3886:2: ( (lv_elseStatement_8_0= ruleElseExpression ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3887:1: (lv_elseStatement_8_0= ruleElseExpression )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3887:1: (lv_elseStatement_8_0= ruleElseExpression )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3888:3: lv_elseStatement_8_0= ruleElseExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getElseIfExpressionAccess().getElseStatementElseExpressionParserRuleCall_5_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleElseExpression_in_ruleElseIfExpression8321);
                    lv_elseStatement_8_0=ruleElseExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getElseIfExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"elseStatement",
                              		lv_elseStatement_8_0, 
                              		"ElseExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleElseIfExpression"


    // $ANTLR start "entryRuleLiteralExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3912:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3913:2: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3914:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralExpression_in_entryRuleLiteralExpression8359);
            iv_ruleLiteralExpression=ruleLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralExpression8369); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralExpression"


    // $ANTLR start "ruleLiteralExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3921:1: ruleLiteralExpression returns [EObject current=null] : (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralUndef_1= ruleLiteralUndef | this_LiteralDefault_2= ruleLiteralDefault | this_LiteralList_3= ruleLiteralList | this_LiteralHash_4= ruleLiteralHash | this_LiteralRegex_5= ruleLiteralRegex | this_StringExpression_6= ruleStringExpression | this_LiteralNameOrReference_7= ruleLiteralNameOrReference ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralBoolean_0 = null;

        EObject this_LiteralUndef_1 = null;

        EObject this_LiteralDefault_2 = null;

        EObject this_LiteralList_3 = null;

        EObject this_LiteralHash_4 = null;

        EObject this_LiteralRegex_5 = null;

        EObject this_StringExpression_6 = null;

        EObject this_LiteralNameOrReference_7 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3924:28: ( (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralUndef_1= ruleLiteralUndef | this_LiteralDefault_2= ruleLiteralDefault | this_LiteralList_3= ruleLiteralList | this_LiteralHash_4= ruleLiteralHash | this_LiteralRegex_5= ruleLiteralRegex | this_StringExpression_6= ruleStringExpression | this_LiteralNameOrReference_7= ruleLiteralNameOrReference ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3925:1: (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralUndef_1= ruleLiteralUndef | this_LiteralDefault_2= ruleLiteralDefault | this_LiteralList_3= ruleLiteralList | this_LiteralHash_4= ruleLiteralHash | this_LiteralRegex_5= ruleLiteralRegex | this_StringExpression_6= ruleStringExpression | this_LiteralNameOrReference_7= ruleLiteralNameOrReference )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3925:1: (this_LiteralBoolean_0= ruleLiteralBoolean | this_LiteralUndef_1= ruleLiteralUndef | this_LiteralDefault_2= ruleLiteralDefault | this_LiteralList_3= ruleLiteralList | this_LiteralHash_4= ruleLiteralHash | this_LiteralRegex_5= ruleLiteralRegex | this_StringExpression_6= ruleStringExpression | this_LiteralNameOrReference_7= ruleLiteralNameOrReference )
            int alt80=8;
            switch ( input.LA(1) ) {
            case KEYWORD_57:
            case KEYWORD_54:
                {
                alt80=1;
                }
                break;
            case KEYWORD_58:
                {
                alt80=2;
                }
                break;
            case KEYWORD_61:
                {
                alt80=3;
                }
                break;
            case KEYWORD_18:
                {
                alt80=4;
                }
                break;
            case KEYWORD_20:
                {
                alt80=5;
                }
                break;
            case RULE_REGULAR_EXPRESSION:
                {
                alt80=6;
                }
                break;
            case KEYWORD_24:
            case KEYWORD_2:
            case KEYWORD_3:
                {
                alt80=7;
                }
                break;
            case RULE_WORD_CHARS:
                {
                alt80=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3926:2: this_LiteralBoolean_0= ruleLiteralBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteralBooleanParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralBoolean_in_ruleLiteralExpression8419);
                    this_LiteralBoolean_0=ruleLiteralBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_LiteralBoolean_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3939:2: this_LiteralUndef_1= ruleLiteralUndef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteralUndefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralUndef_in_ruleLiteralExpression8449);
                    this_LiteralUndef_1=ruleLiteralUndef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_LiteralUndef_1;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3952:2: this_LiteralDefault_2= ruleLiteralDefault
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteralDefaultParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralDefault_in_ruleLiteralExpression8479);
                    this_LiteralDefault_2=ruleLiteralDefault();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_LiteralDefault_2;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3965:2: this_LiteralList_3= ruleLiteralList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteralListParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralList_in_ruleLiteralExpression8509);
                    this_LiteralList_3=ruleLiteralList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_LiteralList_3;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3978:2: this_LiteralHash_4= ruleLiteralHash
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteralHashParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralHash_in_ruleLiteralExpression8539);
                    this_LiteralHash_4=ruleLiteralHash();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_LiteralHash_4;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:3991:2: this_LiteralRegex_5= ruleLiteralRegex
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteralRegexParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralRegex_in_ruleLiteralExpression8569);
                    this_LiteralRegex_5=ruleLiteralRegex();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_LiteralRegex_5;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4004:2: this_StringExpression_6= ruleStringExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralExpressionAccess().getStringExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringExpression_in_ruleLiteralExpression8599);
                    this_StringExpression_6=ruleStringExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_StringExpression_6;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4017:2: this_LiteralNameOrReference_7= ruleLiteralNameOrReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteralNameOrReferenceParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralNameOrReference_in_ruleLiteralExpression8629);
                    this_LiteralNameOrReference_7=ruleLiteralNameOrReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_LiteralNameOrReference_7;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLiteralExpression"


    // $ANTLR start "entryRuleLiteralNameOrReference"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4036:1: entryRuleLiteralNameOrReference returns [EObject current=null] : iv_ruleLiteralNameOrReference= ruleLiteralNameOrReference EOF ;
    public final EObject entryRuleLiteralNameOrReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralNameOrReference = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4037:2: (iv_ruleLiteralNameOrReference= ruleLiteralNameOrReference EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4038:2: iv_ruleLiteralNameOrReference= ruleLiteralNameOrReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralNameOrReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralNameOrReference_in_entryRuleLiteralNameOrReference8663);
            iv_ruleLiteralNameOrReference=ruleLiteralNameOrReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralNameOrReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralNameOrReference8673); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralNameOrReference"


    // $ANTLR start "ruleLiteralNameOrReference"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4045:1: ruleLiteralNameOrReference returns [EObject current=null] : ( (lv_value_0_0= rulename ) ) ;
    public final EObject ruleLiteralNameOrReference() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4048:28: ( ( (lv_value_0_0= rulename ) ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4049:1: ( (lv_value_0_0= rulename ) )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4049:1: ( (lv_value_0_0= rulename ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4050:1: (lv_value_0_0= rulename )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4050:1: (lv_value_0_0= rulename )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4051:3: lv_value_0_0= rulename
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLiteralNameOrReferenceAccess().getValueNameParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_rulename_in_ruleLiteralNameOrReference8718);
            lv_value_0_0=rulename();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLiteralNameOrReferenceRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"name");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLiteralNameOrReference"


    // $ANTLR start "entryRuleUNION_VARIABLE_OR_NAME"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4075:1: entryRuleUNION_VARIABLE_OR_NAME returns [String current=null] : iv_ruleUNION_VARIABLE_OR_NAME= ruleUNION_VARIABLE_OR_NAME EOF ;
    public final String entryRuleUNION_VARIABLE_OR_NAME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUNION_VARIABLE_OR_NAME = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4076:1: (iv_ruleUNION_VARIABLE_OR_NAME= ruleUNION_VARIABLE_OR_NAME EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4077:2: iv_ruleUNION_VARIABLE_OR_NAME= ruleUNION_VARIABLE_OR_NAME EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUNION_VARIABLE_OR_NAMERule()); 
            }
            pushFollow(FOLLOW_ruleUNION_VARIABLE_OR_NAME_in_entryRuleUNION_VARIABLE_OR_NAME8753);
            iv_ruleUNION_VARIABLE_OR_NAME=ruleUNION_VARIABLE_OR_NAME();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUNION_VARIABLE_OR_NAME.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUNION_VARIABLE_OR_NAME8764); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUNION_VARIABLE_OR_NAME"


    // $ANTLR start "ruleUNION_VARIABLE_OR_NAME"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4084:1: ruleUNION_VARIABLE_OR_NAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_dollarVariable_0= ruledollarVariable | this_name_1= rulename ) ;
    public final AntlrDatatypeRuleToken ruleUNION_VARIABLE_OR_NAME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_dollarVariable_0 = null;

        AntlrDatatypeRuleToken this_name_1 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4088:6: ( (this_dollarVariable_0= ruledollarVariable | this_name_1= rulename ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4089:1: (this_dollarVariable_0= ruledollarVariable | this_name_1= rulename )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4089:1: (this_dollarVariable_0= ruledollarVariable | this_name_1= rulename )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_DOLLAR_VAR) ) {
                alt81=1;
            }
            else if ( (LA81_0==RULE_WORD_CHARS) ) {
                alt81=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4090:5: this_dollarVariable_0= ruledollarVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUNION_VARIABLE_OR_NAMEAccess().getDollarVariableParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruledollarVariable_in_ruleUNION_VARIABLE_OR_NAME8811);
                    this_dollarVariable_0=ruledollarVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_dollarVariable_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4102:5: this_name_1= rulename
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUNION_VARIABLE_OR_NAMEAccess().getNameParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulename_in_ruleUNION_VARIABLE_OR_NAME8844);
                    this_name_1=rulename();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_name_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
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
    // $ANTLR end "ruleUNION_VARIABLE_OR_NAME"


    // $ANTLR start "entryRuleParenthisedExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4120:1: entryRuleParenthisedExpression returns [EObject current=null] : iv_ruleParenthisedExpression= ruleParenthisedExpression EOF ;
    public final EObject entryRuleParenthisedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthisedExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4121:2: (iv_ruleParenthisedExpression= ruleParenthisedExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4122:2: iv_ruleParenthisedExpression= ruleParenthisedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthisedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthisedExpression_in_entryRuleParenthisedExpression8888);
            iv_ruleParenthisedExpression=ruleParenthisedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthisedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthisedExpression8898); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParenthisedExpression"


    // $ANTLR start "ruleParenthisedExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4129:1: ruleParenthisedExpression returns [EObject current=null] : (otherlv_0= KEYWORD_4 () ( (lv_expr_2_0= ruleAssignmentExpression ) )? otherlv_3= KEYWORD_5 ) ;
    public final EObject ruleParenthisedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4132:28: ( (otherlv_0= KEYWORD_4 () ( (lv_expr_2_0= ruleAssignmentExpression ) )? otherlv_3= KEYWORD_5 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4133:1: (otherlv_0= KEYWORD_4 () ( (lv_expr_2_0= ruleAssignmentExpression ) )? otherlv_3= KEYWORD_5 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4133:1: (otherlv_0= KEYWORD_4 () ( (lv_expr_2_0= ruleAssignmentExpression ) )? otherlv_3= KEYWORD_5 )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4134:2: otherlv_0= KEYWORD_4 () ( (lv_expr_2_0= ruleAssignmentExpression ) )? otherlv_3= KEYWORD_5
            {
            otherlv_0=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleParenthisedExpression8936); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParenthisedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4138:1: ()
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4139:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getParenthisedExpressionAccess().getParenthesisedExpressionAction_1(),
                          current);
                  
            }

            }

            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4147:2: ( (lv_expr_2_0= ruleAssignmentExpression ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( ((LA82_0>=KEYWORD_61 && LA82_0<=KEYWORD_55)||(LA82_0>=KEYWORD_57 && LA82_0<=KEYWORD_51)||(LA82_0>=KEYWORD_53 && LA82_0<=KEYWORD_54)||LA82_0==KEYWORD_24||LA82_0==KEYWORD_42||(LA82_0>=KEYWORD_1 && LA82_0<=KEYWORD_4)||LA82_0==KEYWORD_9||(LA82_0>=KEYWORD_17 && LA82_0<=KEYWORD_18)||LA82_0==KEYWORD_20||(LA82_0>=RULE_DOLLAR_VAR && LA82_0<=RULE_WORD_CHARS)||LA82_0==RULE_REGULAR_EXPRESSION) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4148:1: (lv_expr_2_0= ruleAssignmentExpression )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4148:1: (lv_expr_2_0= ruleAssignmentExpression )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4149:3: lv_expr_2_0= ruleAssignmentExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParenthisedExpressionAccess().getExprAssignmentExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleParenthisedExpression8968);
                    lv_expr_2_0=ruleAssignmentExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getParenthisedExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expr",
                              		lv_expr_2_0, 
                              		"AssignmentExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleParenthisedExpression8982); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getParenthisedExpressionAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleParenthisedExpression"


    // $ANTLR start "entryRuleVirtualNameOrReference"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4178:1: entryRuleVirtualNameOrReference returns [EObject current=null] : iv_ruleVirtualNameOrReference= ruleVirtualNameOrReference EOF ;
    public final EObject entryRuleVirtualNameOrReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVirtualNameOrReference = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4179:2: (iv_ruleVirtualNameOrReference= ruleVirtualNameOrReference EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4180:2: iv_ruleVirtualNameOrReference= ruleVirtualNameOrReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVirtualNameOrReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleVirtualNameOrReference_in_entryRuleVirtualNameOrReference9016);
            iv_ruleVirtualNameOrReference=ruleVirtualNameOrReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVirtualNameOrReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVirtualNameOrReference9026); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVirtualNameOrReference"


    // $ANTLR start "ruleVirtualNameOrReference"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4187:1: ruleVirtualNameOrReference returns [EObject current=null] : (otherlv_0= KEYWORD_17 ( (lv_exported_1_0= ruleATBoolean ) )? ( (lv_value_2_0= ruleunionNameOrReference ) ) ) ;
    public final EObject ruleVirtualNameOrReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_exported_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4190:28: ( (otherlv_0= KEYWORD_17 ( (lv_exported_1_0= ruleATBoolean ) )? ( (lv_value_2_0= ruleunionNameOrReference ) ) ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4191:1: (otherlv_0= KEYWORD_17 ( (lv_exported_1_0= ruleATBoolean ) )? ( (lv_value_2_0= ruleunionNameOrReference ) ) )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4191:1: (otherlv_0= KEYWORD_17 ( (lv_exported_1_0= ruleATBoolean ) )? ( (lv_value_2_0= ruleunionNameOrReference ) ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4192:2: otherlv_0= KEYWORD_17 ( (lv_exported_1_0= ruleATBoolean ) )? ( (lv_value_2_0= ruleunionNameOrReference ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleVirtualNameOrReference9064); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getVirtualNameOrReferenceAccess().getCommercialAtKeyword_0());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4196:1: ( (lv_exported_1_0= ruleATBoolean ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==KEYWORD_17) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4197:1: (lv_exported_1_0= ruleATBoolean )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4197:1: (lv_exported_1_0= ruleATBoolean )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4198:3: lv_exported_1_0= ruleATBoolean
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVirtualNameOrReferenceAccess().getExportedATBooleanParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleATBoolean_in_ruleVirtualNameOrReference9084);
                    lv_exported_1_0=ruleATBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVirtualNameOrReferenceRule());
                      	        }
                             		set(
                             			current, 
                             			"exported",
                              		lv_exported_1_0, 
                              		"ATBoolean");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4214:3: ( (lv_value_2_0= ruleunionNameOrReference ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4215:1: (lv_value_2_0= ruleunionNameOrReference )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4215:1: (lv_value_2_0= ruleunionNameOrReference )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4216:3: lv_value_2_0= ruleunionNameOrReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVirtualNameOrReferenceAccess().getValueUnionNameOrReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleunionNameOrReference_in_ruleVirtualNameOrReference9106);
            lv_value_2_0=ruleunionNameOrReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVirtualNameOrReferenceRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"unionNameOrReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVirtualNameOrReference"


    // $ANTLR start "entryRuleATBoolean"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4240:1: entryRuleATBoolean returns [String current=null] : iv_ruleATBoolean= ruleATBoolean EOF ;
    public final String entryRuleATBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleATBoolean = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4241:1: (iv_ruleATBoolean= ruleATBoolean EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4242:2: iv_ruleATBoolean= ruleATBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getATBooleanRule()); 
            }
            pushFollow(FOLLOW_ruleATBoolean_in_entryRuleATBoolean9142);
            iv_ruleATBoolean=ruleATBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleATBoolean.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleATBoolean9153); if (state.failed) return current;

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
    // $ANTLR end "entryRuleATBoolean"


    // $ANTLR start "ruleATBoolean"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4249:1: ruleATBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= KEYWORD_17 ;
    public final AntlrDatatypeRuleToken ruleATBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4253:6: (kw= KEYWORD_17 )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4255:2: kw= KEYWORD_17
            {
            kw=(Token)match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleATBoolean9190); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getATBooleanAccess().getCommercialAtKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
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
    // $ANTLR end "ruleATBoolean"


    // $ANTLR start "entryRuleImportExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4268:1: entryRuleImportExpression returns [EObject current=null] : iv_ruleImportExpression= ruleImportExpression EOF ;
    public final EObject entryRuleImportExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4269:2: (iv_ruleImportExpression= ruleImportExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4270:2: iv_ruleImportExpression= ruleImportExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleImportExpression_in_entryRuleImportExpression9228);
            iv_ruleImportExpression=ruleImportExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportExpression9238); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImportExpression"


    // $ANTLR start "ruleImportExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4277:1: ruleImportExpression returns [EObject current=null] : ( () otherlv_1= KEYWORD_60 ( ( (lv_values_2_0= ruleQuotedString ) ) (otherlv_3= KEYWORD_8 ( (lv_values_4_0= ruleQuotedString ) ) )* )? ) ;
    public final EObject ruleImportExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4280:28: ( ( () otherlv_1= KEYWORD_60 ( ( (lv_values_2_0= ruleQuotedString ) ) (otherlv_3= KEYWORD_8 ( (lv_values_4_0= ruleQuotedString ) ) )* )? ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4281:1: ( () otherlv_1= KEYWORD_60 ( ( (lv_values_2_0= ruleQuotedString ) ) (otherlv_3= KEYWORD_8 ( (lv_values_4_0= ruleQuotedString ) ) )* )? )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4281:1: ( () otherlv_1= KEYWORD_60 ( ( (lv_values_2_0= ruleQuotedString ) ) (otherlv_3= KEYWORD_8 ( (lv_values_4_0= ruleQuotedString ) ) )* )? )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4281:2: () otherlv_1= KEYWORD_60 ( ( (lv_values_2_0= ruleQuotedString ) ) (otherlv_3= KEYWORD_8 ( (lv_values_4_0= ruleQuotedString ) ) )* )?
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4281:2: ()
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4282:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getImportExpressionAccess().getImportExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,KEYWORD_60,FOLLOW_KEYWORD_60_in_ruleImportExpression9288); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getImportExpressionAccess().getImportKeyword_1());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4295:1: ( ( (lv_values_2_0= ruleQuotedString ) ) (otherlv_3= KEYWORD_8 ( (lv_values_4_0= ruleQuotedString ) ) )* )?
            int alt85=2;
            alt85 = dfa85.predict(input);
            switch (alt85) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4295:2: ( (lv_values_2_0= ruleQuotedString ) ) (otherlv_3= KEYWORD_8 ( (lv_values_4_0= ruleQuotedString ) ) )*
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4295:2: ( (lv_values_2_0= ruleQuotedString ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4296:1: (lv_values_2_0= ruleQuotedString )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4296:1: (lv_values_2_0= ruleQuotedString )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4297:3: lv_values_2_0= ruleQuotedString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImportExpressionAccess().getValuesQuotedStringParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQuotedString_in_ruleImportExpression9309);
                    lv_values_2_0=ruleQuotedString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getImportExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"values",
                              		lv_values_2_0, 
                              		"QuotedString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4313:2: (otherlv_3= KEYWORD_8 ( (lv_values_4_0= ruleQuotedString ) ) )*
                    loop84:
                    do {
                        int alt84=2;
                        alt84 = dfa84.predict(input);
                        switch (alt84) {
                    	case 1 :
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4314:2: otherlv_3= KEYWORD_8 ( (lv_values_4_0= ruleQuotedString ) )
                    	    {
                    	    otherlv_3=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleImportExpression9323); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getImportExpressionAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4318:1: ( (lv_values_4_0= ruleQuotedString ) )
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4319:1: (lv_values_4_0= ruleQuotedString )
                    	    {
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4319:1: (lv_values_4_0= ruleQuotedString )
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4320:3: lv_values_4_0= ruleQuotedString
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getImportExpressionAccess().getValuesQuotedStringParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQuotedString_in_ruleImportExpression9343);
                    	    lv_values_4_0=ruleQuotedString();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getImportExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"values",
                    	              		lv_values_4_0, 
                    	              		"QuotedString");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop84;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleImportExpression"


    // $ANTLR start "entryRuleLiteralList"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4344:1: entryRuleLiteralList returns [EObject current=null] : iv_ruleLiteralList= ruleLiteralList EOF ;
    public final EObject entryRuleLiteralList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralList = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4345:2: (iv_ruleLiteralList= ruleLiteralList EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4346:2: iv_ruleLiteralList= ruleLiteralList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralListRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralList_in_entryRuleLiteralList9382);
            iv_ruleLiteralList=ruleLiteralList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralList9392); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralList"


    // $ANTLR start "ruleLiteralList"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4353:1: ruleLiteralList returns [EObject current=null] : ( () otherlv_1= KEYWORD_18 ( ( (lv_elements_2_0= ruleAssignmentExpression ) ) (otherlv_3= KEYWORD_8 ( (lv_elements_4_0= ruleAssignmentExpression ) ) )* )? ( ruleendComma )? otherlv_6= KEYWORD_19 ) ;
    public final EObject ruleLiteralList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4356:28: ( ( () otherlv_1= KEYWORD_18 ( ( (lv_elements_2_0= ruleAssignmentExpression ) ) (otherlv_3= KEYWORD_8 ( (lv_elements_4_0= ruleAssignmentExpression ) ) )* )? ( ruleendComma )? otherlv_6= KEYWORD_19 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4357:1: ( () otherlv_1= KEYWORD_18 ( ( (lv_elements_2_0= ruleAssignmentExpression ) ) (otherlv_3= KEYWORD_8 ( (lv_elements_4_0= ruleAssignmentExpression ) ) )* )? ( ruleendComma )? otherlv_6= KEYWORD_19 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4357:1: ( () otherlv_1= KEYWORD_18 ( ( (lv_elements_2_0= ruleAssignmentExpression ) ) (otherlv_3= KEYWORD_8 ( (lv_elements_4_0= ruleAssignmentExpression ) ) )* )? ( ruleendComma )? otherlv_6= KEYWORD_19 )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4357:2: () otherlv_1= KEYWORD_18 ( ( (lv_elements_2_0= ruleAssignmentExpression ) ) (otherlv_3= KEYWORD_8 ( (lv_elements_4_0= ruleAssignmentExpression ) ) )* )? ( ruleendComma )? otherlv_6= KEYWORD_19
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4357:2: ()
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4358:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLiteralListAccess().getLiteralListAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_ruleLiteralList9442); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLiteralListAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4371:1: ( ( (lv_elements_2_0= ruleAssignmentExpression ) ) (otherlv_3= KEYWORD_8 ( (lv_elements_4_0= ruleAssignmentExpression ) ) )* )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( ((LA87_0>=KEYWORD_61 && LA87_0<=KEYWORD_55)||(LA87_0>=KEYWORD_57 && LA87_0<=KEYWORD_51)||(LA87_0>=KEYWORD_53 && LA87_0<=KEYWORD_54)||LA87_0==KEYWORD_24||LA87_0==KEYWORD_42||(LA87_0>=KEYWORD_1 && LA87_0<=KEYWORD_4)||LA87_0==KEYWORD_9||(LA87_0>=KEYWORD_17 && LA87_0<=KEYWORD_18)||LA87_0==KEYWORD_20||(LA87_0>=RULE_DOLLAR_VAR && LA87_0<=RULE_WORD_CHARS)||LA87_0==RULE_REGULAR_EXPRESSION) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4371:2: ( (lv_elements_2_0= ruleAssignmentExpression ) ) (otherlv_3= KEYWORD_8 ( (lv_elements_4_0= ruleAssignmentExpression ) ) )*
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4371:2: ( (lv_elements_2_0= ruleAssignmentExpression ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4372:1: (lv_elements_2_0= ruleAssignmentExpression )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4372:1: (lv_elements_2_0= ruleAssignmentExpression )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4373:3: lv_elements_2_0= ruleAssignmentExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralListAccess().getElementsAssignmentExpressionParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleLiteralList9463);
                    lv_elements_2_0=ruleAssignmentExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLiteralListRule());
                      	        }
                             		add(
                             			current, 
                             			"elements",
                              		lv_elements_2_0, 
                              		"AssignmentExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4389:2: (otherlv_3= KEYWORD_8 ( (lv_elements_4_0= ruleAssignmentExpression ) ) )*
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( (LA86_0==KEYWORD_8) ) {
                            int LA86_1 = input.LA(2);

                            if ( ((LA86_1>=KEYWORD_61 && LA86_1<=KEYWORD_55)||(LA86_1>=KEYWORD_57 && LA86_1<=KEYWORD_51)||(LA86_1>=KEYWORD_53 && LA86_1<=KEYWORD_54)||LA86_1==KEYWORD_24||LA86_1==KEYWORD_42||(LA86_1>=KEYWORD_1 && LA86_1<=KEYWORD_4)||LA86_1==KEYWORD_9||(LA86_1>=KEYWORD_17 && LA86_1<=KEYWORD_18)||LA86_1==KEYWORD_20||(LA86_1>=RULE_DOLLAR_VAR && LA86_1<=RULE_WORD_CHARS)||LA86_1==RULE_REGULAR_EXPRESSION) ) {
                                alt86=1;
                            }


                        }


                        switch (alt86) {
                    	case 1 :
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4390:2: otherlv_3= KEYWORD_8 ( (lv_elements_4_0= ruleAssignmentExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleLiteralList9477); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getLiteralListAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4394:1: ( (lv_elements_4_0= ruleAssignmentExpression ) )
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4395:1: (lv_elements_4_0= ruleAssignmentExpression )
                    	    {
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4395:1: (lv_elements_4_0= ruleAssignmentExpression )
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4396:3: lv_elements_4_0= ruleAssignmentExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLiteralListAccess().getElementsAssignmentExpressionParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleLiteralList9497);
                    	    lv_elements_4_0=ruleAssignmentExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getLiteralListRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"elements",
                    	              		lv_elements_4_0, 
                    	              		"AssignmentExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop86;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4412:6: ( ruleendComma )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==KEYWORD_8) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4413:2: ruleendComma
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralListAccess().getEndCommaParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleendComma_in_ruleLiteralList9521);
                    ruleendComma();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            otherlv_6=(Token)match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_ruleLiteralList9535); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getLiteralListAccess().getRightSquareBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLiteralList"


    // $ANTLR start "entryRuleLiteralHash"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4436:1: entryRuleLiteralHash returns [EObject current=null] : iv_ruleLiteralHash= ruleLiteralHash EOF ;
    public final EObject entryRuleLiteralHash() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralHash = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4437:2: (iv_ruleLiteralHash= ruleLiteralHash EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4438:2: iv_ruleLiteralHash= ruleLiteralHash EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralHashRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralHash_in_entryRuleLiteralHash9569);
            iv_ruleLiteralHash=ruleLiteralHash();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralHash; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralHash9579); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralHash"


    // $ANTLR start "ruleLiteralHash"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4445:1: ruleLiteralHash returns [EObject current=null] : ( () otherlv_1= KEYWORD_20 ( ( (lv_elements_2_0= ruleHashEntry ) ) (otherlv_3= KEYWORD_8 ( (lv_elements_4_0= ruleHashEntry ) ) )* )? ( ruleendComma )? otherlv_6= KEYWORD_21 ) ;
    public final EObject ruleLiteralHash() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4448:28: ( ( () otherlv_1= KEYWORD_20 ( ( (lv_elements_2_0= ruleHashEntry ) ) (otherlv_3= KEYWORD_8 ( (lv_elements_4_0= ruleHashEntry ) ) )* )? ( ruleendComma )? otherlv_6= KEYWORD_21 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4449:1: ( () otherlv_1= KEYWORD_20 ( ( (lv_elements_2_0= ruleHashEntry ) ) (otherlv_3= KEYWORD_8 ( (lv_elements_4_0= ruleHashEntry ) ) )* )? ( ruleendComma )? otherlv_6= KEYWORD_21 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4449:1: ( () otherlv_1= KEYWORD_20 ( ( (lv_elements_2_0= ruleHashEntry ) ) (otherlv_3= KEYWORD_8 ( (lv_elements_4_0= ruleHashEntry ) ) )* )? ( ruleendComma )? otherlv_6= KEYWORD_21 )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4449:2: () otherlv_1= KEYWORD_20 ( ( (lv_elements_2_0= ruleHashEntry ) ) (otherlv_3= KEYWORD_8 ( (lv_elements_4_0= ruleHashEntry ) ) )* )? ( ruleendComma )? otherlv_6= KEYWORD_21
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4449:2: ()
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4450:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLiteralHashAccess().getLiteralHashAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleLiteralHash9629); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLiteralHashAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4463:1: ( ( (lv_elements_2_0= ruleHashEntry ) ) (otherlv_3= KEYWORD_8 ( (lv_elements_4_0= ruleHashEntry ) ) )* )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==KEYWORD_24||(LA90_0>=KEYWORD_2 && LA90_0<=KEYWORD_3)||LA90_0==RULE_WORD_CHARS) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4463:2: ( (lv_elements_2_0= ruleHashEntry ) ) (otherlv_3= KEYWORD_8 ( (lv_elements_4_0= ruleHashEntry ) ) )*
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4463:2: ( (lv_elements_2_0= ruleHashEntry ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4464:1: (lv_elements_2_0= ruleHashEntry )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4464:1: (lv_elements_2_0= ruleHashEntry )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4465:3: lv_elements_2_0= ruleHashEntry
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralHashAccess().getElementsHashEntryParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleHashEntry_in_ruleLiteralHash9650);
                    lv_elements_2_0=ruleHashEntry();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLiteralHashRule());
                      	        }
                             		add(
                             			current, 
                             			"elements",
                              		lv_elements_2_0, 
                              		"HashEntry");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4481:2: (otherlv_3= KEYWORD_8 ( (lv_elements_4_0= ruleHashEntry ) ) )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==KEYWORD_8) ) {
                            int LA89_1 = input.LA(2);

                            if ( (LA89_1==KEYWORD_24||(LA89_1>=KEYWORD_2 && LA89_1<=KEYWORD_3)||LA89_1==RULE_WORD_CHARS) ) {
                                alt89=1;
                            }


                        }


                        switch (alt89) {
                    	case 1 :
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4482:2: otherlv_3= KEYWORD_8 ( (lv_elements_4_0= ruleHashEntry ) )
                    	    {
                    	    otherlv_3=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleLiteralHash9664); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getLiteralHashAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4486:1: ( (lv_elements_4_0= ruleHashEntry ) )
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4487:1: (lv_elements_4_0= ruleHashEntry )
                    	    {
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4487:1: (lv_elements_4_0= ruleHashEntry )
                    	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4488:3: lv_elements_4_0= ruleHashEntry
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLiteralHashAccess().getElementsHashEntryParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleHashEntry_in_ruleLiteralHash9684);
                    	    lv_elements_4_0=ruleHashEntry();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getLiteralHashRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"elements",
                    	              		lv_elements_4_0, 
                    	              		"HashEntry");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop89;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4504:6: ( ruleendComma )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==KEYWORD_8) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4505:2: ruleendComma
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralHashAccess().getEndCommaParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleendComma_in_ruleLiteralHash9708);
                    ruleendComma();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            otherlv_6=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleLiteralHash9722); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getLiteralHashAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLiteralHash"


    // $ANTLR start "entryRuleHashEntry"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4528:1: entryRuleHashEntry returns [EObject current=null] : iv_ruleHashEntry= ruleHashEntry EOF ;
    public final EObject entryRuleHashEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHashEntry = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4529:2: (iv_ruleHashEntry= ruleHashEntry EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4530:2: iv_ruleHashEntry= ruleHashEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHashEntryRule()); 
            }
            pushFollow(FOLLOW_ruleHashEntry_in_entryRuleHashEntry9756);
            iv_ruleHashEntry=ruleHashEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHashEntry; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHashEntry9766); if (state.failed) return current;

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
    // $ANTLR end "entryRuleHashEntry"


    // $ANTLR start "ruleHashEntry"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4537:1: ruleHashEntry returns [EObject current=null] : ( ( (lv_key_0_0= ruleLiteralNameOrString ) ) otherlv_1= KEYWORD_34 ( (lv_value_2_0= ruleAssignmentExpression ) ) ) ;
    public final EObject ruleHashEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_key_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4540:28: ( ( ( (lv_key_0_0= ruleLiteralNameOrString ) ) otherlv_1= KEYWORD_34 ( (lv_value_2_0= ruleAssignmentExpression ) ) ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4541:1: ( ( (lv_key_0_0= ruleLiteralNameOrString ) ) otherlv_1= KEYWORD_34 ( (lv_value_2_0= ruleAssignmentExpression ) ) )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4541:1: ( ( (lv_key_0_0= ruleLiteralNameOrString ) ) otherlv_1= KEYWORD_34 ( (lv_value_2_0= ruleAssignmentExpression ) ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4541:2: ( (lv_key_0_0= ruleLiteralNameOrString ) ) otherlv_1= KEYWORD_34 ( (lv_value_2_0= ruleAssignmentExpression ) )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4541:2: ( (lv_key_0_0= ruleLiteralNameOrString ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4542:1: (lv_key_0_0= ruleLiteralNameOrString )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4542:1: (lv_key_0_0= ruleLiteralNameOrString )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4543:3: lv_key_0_0= ruleLiteralNameOrString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHashEntryAccess().getKeyLiteralNameOrStringParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteralNameOrString_in_ruleHashEntry9812);
            lv_key_0_0=ruleLiteralNameOrString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getHashEntryRule());
              	        }
                     		set(
                     			current, 
                     			"key",
                      		lv_key_0_0, 
                      		"LiteralNameOrString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_ruleHashEntry9825); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getHashEntryAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4564:1: ( (lv_value_2_0= ruleAssignmentExpression ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4565:1: (lv_value_2_0= ruleAssignmentExpression )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4565:1: (lv_value_2_0= ruleAssignmentExpression )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4566:3: lv_value_2_0= ruleAssignmentExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHashEntryAccess().getValueAssignmentExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleHashEntry9845);
            lv_value_2_0=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getHashEntryRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"AssignmentExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleHashEntry"


    // $ANTLR start "entryRuleLiteralNameOrString"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4590:1: entryRuleLiteralNameOrString returns [EObject current=null] : iv_ruleLiteralNameOrString= ruleLiteralNameOrString EOF ;
    public final EObject entryRuleLiteralNameOrString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralNameOrString = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4591:2: (iv_ruleLiteralNameOrString= ruleLiteralNameOrString EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4592:2: iv_ruleLiteralNameOrString= ruleLiteralNameOrString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralNameOrStringRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralNameOrString_in_entryRuleLiteralNameOrString9880);
            iv_ruleLiteralNameOrString=ruleLiteralNameOrString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralNameOrString; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralNameOrString9890); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralNameOrString"


    // $ANTLR start "ruleLiteralNameOrString"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4599:1: ruleLiteralNameOrString returns [EObject current=null] : (this_StringExpression_0= ruleStringExpression | this_LiteralName_1= ruleLiteralName ) ;
    public final EObject ruleLiteralNameOrString() throws RecognitionException {
        EObject current = null;

        EObject this_StringExpression_0 = null;

        EObject this_LiteralName_1 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4602:28: ( (this_StringExpression_0= ruleStringExpression | this_LiteralName_1= ruleLiteralName ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4603:1: (this_StringExpression_0= ruleStringExpression | this_LiteralName_1= ruleLiteralName )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4603:1: (this_StringExpression_0= ruleStringExpression | this_LiteralName_1= ruleLiteralName )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==KEYWORD_24||(LA92_0>=KEYWORD_2 && LA92_0<=KEYWORD_3)) ) {
                alt92=1;
            }
            else if ( (LA92_0==RULE_WORD_CHARS) ) {
                alt92=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4604:2: this_StringExpression_0= ruleStringExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralNameOrStringAccess().getStringExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringExpression_in_ruleLiteralNameOrString9940);
                    this_StringExpression_0=ruleStringExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_StringExpression_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4617:2: this_LiteralName_1= ruleLiteralName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralNameOrStringAccess().getLiteralNameParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralName_in_ruleLiteralNameOrString9970);
                    this_LiteralName_1=ruleLiteralName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_LiteralName_1;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLiteralNameOrString"


    // $ANTLR start "entryRuleBooleanValue"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4636:1: entryRuleBooleanValue returns [String current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final String entryRuleBooleanValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanValue = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4637:1: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4638:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanValueRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue10005);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue10016); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4645:1: ruleBooleanValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_54 | kw= KEYWORD_57 ) ;
    public final AntlrDatatypeRuleToken ruleBooleanValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4649:6: ( (kw= KEYWORD_54 | kw= KEYWORD_57 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4650:1: (kw= KEYWORD_54 | kw= KEYWORD_57 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4650:1: (kw= KEYWORD_54 | kw= KEYWORD_57 )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==KEYWORD_54) ) {
                alt93=1;
            }
            else if ( (LA93_0==KEYWORD_57) ) {
                alt93=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }
            switch (alt93) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4651:2: kw= KEYWORD_54
                    {
                    kw=(Token)match(input,KEYWORD_54,FOLLOW_KEYWORD_54_in_ruleBooleanValue10054); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBooleanValueAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4658:2: kw= KEYWORD_57
                    {
                    kw=(Token)match(input,KEYWORD_57,FOLLOW_KEYWORD_57_in_ruleBooleanValue10073); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBooleanValueAccess().getFalseKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
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
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleLiteralBoolean"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4671:1: entryRuleLiteralBoolean returns [EObject current=null] : iv_ruleLiteralBoolean= ruleLiteralBoolean EOF ;
    public final EObject entryRuleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralBoolean = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4672:2: (iv_ruleLiteralBoolean= ruleLiteralBoolean EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4673:2: iv_ruleLiteralBoolean= ruleLiteralBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralBooleanRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralBoolean_in_entryRuleLiteralBoolean10112);
            iv_ruleLiteralBoolean=ruleLiteralBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralBoolean; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralBoolean10122); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralBoolean"


    // $ANTLR start "ruleLiteralBoolean"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4680:1: ruleLiteralBoolean returns [EObject current=null] : ( (lv_value_0_0= ruleBooleanValue ) ) ;
    public final EObject ruleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4683:28: ( ( (lv_value_0_0= ruleBooleanValue ) ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4684:1: ( (lv_value_0_0= ruleBooleanValue ) )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4684:1: ( (lv_value_0_0= ruleBooleanValue ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4685:1: (lv_value_0_0= ruleBooleanValue )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4685:1: (lv_value_0_0= ruleBooleanValue )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4686:3: lv_value_0_0= ruleBooleanValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLiteralBooleanAccess().getValueBooleanValueParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBooleanValue_in_ruleLiteralBoolean10167);
            lv_value_0_0=ruleBooleanValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLiteralBooleanRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"BooleanValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLiteralBoolean"


    // $ANTLR start "entryRuleLiteralDefault"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4710:1: entryRuleLiteralDefault returns [EObject current=null] : iv_ruleLiteralDefault= ruleLiteralDefault EOF ;
    public final EObject entryRuleLiteralDefault() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralDefault = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4711:2: (iv_ruleLiteralDefault= ruleLiteralDefault EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4712:2: iv_ruleLiteralDefault= ruleLiteralDefault EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralDefaultRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralDefault_in_entryRuleLiteralDefault10201);
            iv_ruleLiteralDefault=ruleLiteralDefault();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralDefault; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralDefault10211); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralDefault"


    // $ANTLR start "ruleLiteralDefault"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4719:1: ruleLiteralDefault returns [EObject current=null] : ( () otherlv_1= KEYWORD_61 ) ;
    public final EObject ruleLiteralDefault() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4722:28: ( ( () otherlv_1= KEYWORD_61 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4723:1: ( () otherlv_1= KEYWORD_61 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4723:1: ( () otherlv_1= KEYWORD_61 )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4723:2: () otherlv_1= KEYWORD_61
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4723:2: ()
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4724:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLiteralDefaultAccess().getLiteralDefaultAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,KEYWORD_61,FOLLOW_KEYWORD_61_in_ruleLiteralDefault10261); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLiteralDefaultAccess().getDefaultKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLiteralDefault"


    // $ANTLR start "entryRuleLiteralUndef"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4745:1: entryRuleLiteralUndef returns [EObject current=null] : iv_ruleLiteralUndef= ruleLiteralUndef EOF ;
    public final EObject entryRuleLiteralUndef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralUndef = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4746:2: (iv_ruleLiteralUndef= ruleLiteralUndef EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4747:2: iv_ruleLiteralUndef= ruleLiteralUndef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralUndefRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralUndef_in_entryRuleLiteralUndef10295);
            iv_ruleLiteralUndef=ruleLiteralUndef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralUndef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralUndef10305); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralUndef"


    // $ANTLR start "ruleLiteralUndef"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4754:1: ruleLiteralUndef returns [EObject current=null] : ( () otherlv_1= KEYWORD_58 ) ;
    public final EObject ruleLiteralUndef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4757:28: ( ( () otherlv_1= KEYWORD_58 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4758:1: ( () otherlv_1= KEYWORD_58 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4758:1: ( () otherlv_1= KEYWORD_58 )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4758:2: () otherlv_1= KEYWORD_58
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4758:2: ()
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4759:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLiteralUndefAccess().getLiteralUndefAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,KEYWORD_58,FOLLOW_KEYWORD_58_in_ruleLiteralUndef10355); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLiteralUndefAccess().getUndefKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLiteralUndef"


    // $ANTLR start "entryRuleLiteralClass"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4780:1: entryRuleLiteralClass returns [EObject current=null] : iv_ruleLiteralClass= ruleLiteralClass EOF ;
    public final EObject entryRuleLiteralClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralClass = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4781:2: (iv_ruleLiteralClass= ruleLiteralClass EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4782:2: iv_ruleLiteralClass= ruleLiteralClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralClassRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralClass_in_entryRuleLiteralClass10389);
            iv_ruleLiteralClass=ruleLiteralClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralClass10399); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralClass"


    // $ANTLR start "ruleLiteralClass"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4789:1: ruleLiteralClass returns [EObject current=null] : ( () otherlv_1= KEYWORD_55 ) ;
    public final EObject ruleLiteralClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4792:28: ( ( () otherlv_1= KEYWORD_55 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4793:1: ( () otherlv_1= KEYWORD_55 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4793:1: ( () otherlv_1= KEYWORD_55 )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4793:2: () otherlv_1= KEYWORD_55
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4793:2: ()
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4794:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLiteralClassAccess().getLiteralClassAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,KEYWORD_55,FOLLOW_KEYWORD_55_in_ruleLiteralClass10449); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLiteralClassAccess().getClassKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLiteralClass"


    // $ANTLR start "entryRuleStringExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4815:1: entryRuleStringExpression returns [EObject current=null] : iv_ruleStringExpression= ruleStringExpression EOF ;
    public final EObject entryRuleStringExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringExpression = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        	
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4819:2: (iv_ruleStringExpression= ruleStringExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4820:2: iv_ruleStringExpression= ruleStringExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleStringExpression_in_entryRuleStringExpression10489);
            iv_ruleStringExpression=ruleStringExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringExpression10499); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleStringExpression"


    // $ANTLR start "ruleStringExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4830:1: ruleStringExpression returns [EObject current=null] : (this_SingleQuotedString_0= ruleSingleQuotedString | this_UnquotedString_1= ruleUnquotedString | this_DoubleQuotedString_2= ruleDoubleQuotedString ) ;
    public final EObject ruleStringExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SingleQuotedString_0 = null;

        EObject this_UnquotedString_1 = null;

        EObject this_DoubleQuotedString_2 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4834:28: ( (this_SingleQuotedString_0= ruleSingleQuotedString | this_UnquotedString_1= ruleUnquotedString | this_DoubleQuotedString_2= ruleDoubleQuotedString ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4835:1: (this_SingleQuotedString_0= ruleSingleQuotedString | this_UnquotedString_1= ruleUnquotedString | this_DoubleQuotedString_2= ruleDoubleQuotedString )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4835:1: (this_SingleQuotedString_0= ruleSingleQuotedString | this_UnquotedString_1= ruleUnquotedString | this_DoubleQuotedString_2= ruleDoubleQuotedString )
            int alt94=3;
            switch ( input.LA(1) ) {
            case KEYWORD_3:
                {
                alt94=1;
                }
                break;
            case KEYWORD_24:
                {
                alt94=2;
                }
                break;
            case KEYWORD_2:
                {
                alt94=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }

            switch (alt94) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4836:2: this_SingleQuotedString_0= ruleSingleQuotedString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStringExpressionAccess().getSingleQuotedStringParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSingleQuotedString_in_ruleStringExpression10553);
                    this_SingleQuotedString_0=ruleSingleQuotedString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_SingleQuotedString_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4849:2: this_UnquotedString_1= ruleUnquotedString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStringExpressionAccess().getUnquotedStringParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnquotedString_in_ruleStringExpression10583);
                    this_UnquotedString_1=ruleUnquotedString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_UnquotedString_1;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4862:2: this_DoubleQuotedString_2= ruleDoubleQuotedString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStringExpressionAccess().getDoubleQuotedStringParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDoubleQuotedString_in_ruleStringExpression10613);
                    this_DoubleQuotedString_2=ruleDoubleQuotedString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_DoubleQuotedString_2;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleStringExpression"


    // $ANTLR start "entryRuleQuotedString"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4884:1: entryRuleQuotedString returns [EObject current=null] : iv_ruleQuotedString= ruleQuotedString EOF ;
    public final EObject entryRuleQuotedString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedString = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        	
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4888:2: (iv_ruleQuotedString= ruleQuotedString EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4889:2: iv_ruleQuotedString= ruleQuotedString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuotedStringRule()); 
            }
            pushFollow(FOLLOW_ruleQuotedString_in_entryRuleQuotedString10657);
            iv_ruleQuotedString=ruleQuotedString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuotedString; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuotedString10667); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleQuotedString"


    // $ANTLR start "ruleQuotedString"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4899:1: ruleQuotedString returns [EObject current=null] : (this_DoubleQuotedString_0= ruleDoubleQuotedString | this_SingleQuotedString_1= ruleSingleQuotedString ) ;
    public final EObject ruleQuotedString() throws RecognitionException {
        EObject current = null;

        EObject this_DoubleQuotedString_0 = null;

        EObject this_SingleQuotedString_1 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4903:28: ( (this_DoubleQuotedString_0= ruleDoubleQuotedString | this_SingleQuotedString_1= ruleSingleQuotedString ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4904:1: (this_DoubleQuotedString_0= ruleDoubleQuotedString | this_SingleQuotedString_1= ruleSingleQuotedString )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4904:1: (this_DoubleQuotedString_0= ruleDoubleQuotedString | this_SingleQuotedString_1= ruleSingleQuotedString )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==KEYWORD_2) ) {
                alt95=1;
            }
            else if ( (LA95_0==KEYWORD_3) ) {
                alt95=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4905:2: this_DoubleQuotedString_0= ruleDoubleQuotedString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQuotedStringAccess().getDoubleQuotedStringParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDoubleQuotedString_in_ruleQuotedString10721);
                    this_DoubleQuotedString_0=ruleDoubleQuotedString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_DoubleQuotedString_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4918:2: this_SingleQuotedString_1= ruleSingleQuotedString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQuotedStringAccess().getSingleQuotedStringParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSingleQuotedString_in_ruleQuotedString10751);
                    this_SingleQuotedString_1=ruleSingleQuotedString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_SingleQuotedString_1;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleQuotedString"


    // $ANTLR start "entryRuleSingleQuotedString"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4940:1: entryRuleSingleQuotedString returns [EObject current=null] : iv_ruleSingleQuotedString= ruleSingleQuotedString EOF ;
    public final EObject entryRuleSingleQuotedString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleQuotedString = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4941:2: (iv_ruleSingleQuotedString= ruleSingleQuotedString EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4942:2: iv_ruleSingleQuotedString= ruleSingleQuotedString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleQuotedStringRule()); 
            }
            pushFollow(FOLLOW_ruleSingleQuotedString_in_entryRuleSingleQuotedString10789);
            iv_ruleSingleQuotedString=ruleSingleQuotedString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleQuotedString; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleQuotedString10799); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSingleQuotedString"


    // $ANTLR start "ruleSingleQuotedString"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4949:1: ruleSingleQuotedString returns [EObject current=null] : ( () ( (lv_text_1_0= rulesqText ) ) ) ;
    public final EObject ruleSingleQuotedString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_text_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4952:28: ( ( () ( (lv_text_1_0= rulesqText ) ) ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4953:1: ( () ( (lv_text_1_0= rulesqText ) ) )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4953:1: ( () ( (lv_text_1_0= rulesqText ) ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4953:2: () ( (lv_text_1_0= rulesqText ) )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4953:2: ()
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4954:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSingleQuotedStringAccess().getSingleQuotedStringAction_0(),
                          current);
                  
            }

            }

            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4962:2: ( (lv_text_1_0= rulesqText ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4963:1: (lv_text_1_0= rulesqText )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4963:1: (lv_text_1_0= rulesqText )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4964:3: lv_text_1_0= rulesqText
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSingleQuotedStringAccess().getTextSqTextParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulesqText_in_ruleSingleQuotedString10857);
            lv_text_1_0=rulesqText();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSingleQuotedStringRule());
              	        }
                     		set(
                     			current, 
                     			"text",
                      		lv_text_1_0, 
                      		"sqText");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSingleQuotedString"


    // $ANTLR start "entryRuleDoubleQuotedString"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4988:1: entryRuleDoubleQuotedString returns [EObject current=null] : iv_ruleDoubleQuotedString= ruleDoubleQuotedString EOF ;
    public final EObject entryRuleDoubleQuotedString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleQuotedString = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4992:2: (iv_ruleDoubleQuotedString= ruleDoubleQuotedString EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4993:2: iv_ruleDoubleQuotedString= ruleDoubleQuotedString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDoubleQuotedStringRule()); 
            }
            pushFollow(FOLLOW_ruleDoubleQuotedString_in_entryRuleDoubleQuotedString10898);
            iv_ruleDoubleQuotedString=ruleDoubleQuotedString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDoubleQuotedString; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleQuotedString10908); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleDoubleQuotedString"


    // $ANTLR start "ruleDoubleQuotedString"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5003:1: ruleDoubleQuotedString returns [EObject current=null] : (otherlv_0= KEYWORD_2 () ( (lv_stringPart_2_0= ruleTextExpression ) )* otherlv_3= KEYWORD_2 ) ;
    public final EObject ruleDoubleQuotedString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_stringPart_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5007:28: ( (otherlv_0= KEYWORD_2 () ( (lv_stringPart_2_0= ruleTextExpression ) )* otherlv_3= KEYWORD_2 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5008:1: (otherlv_0= KEYWORD_2 () ( (lv_stringPart_2_0= ruleTextExpression ) )* otherlv_3= KEYWORD_2 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5008:1: (otherlv_0= KEYWORD_2 () ( (lv_stringPart_2_0= ruleTextExpression ) )* otherlv_3= KEYWORD_2 )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5009:2: otherlv_0= KEYWORD_2 () ( (lv_stringPart_2_0= ruleTextExpression ) )* otherlv_3= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleDoubleQuotedString10950); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDoubleQuotedStringAccess().getQuotationMarkKeyword_0());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5013:1: ()
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5014:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDoubleQuotedStringAccess().getDoubleQuotedStringAction_1(),
                          current);
                  
            }

            }

            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5022:2: ( (lv_stringPart_2_0= ruleTextExpression ) )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==KEYWORD_48||LA96_0==KEYWORD_24||(LA96_0>=KEYWORD_38 && LA96_0<=KEYWORD_41)||(LA96_0>=RULE_WS && LA96_0<=RULE_WORD_CHARS)||LA96_0==RULE_ANY_OTHER) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5023:1: (lv_stringPart_2_0= ruleTextExpression )
            	    {
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5023:1: (lv_stringPart_2_0= ruleTextExpression )
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5024:3: lv_stringPart_2_0= ruleTextExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDoubleQuotedStringAccess().getStringPartTextExpressionParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTextExpression_in_ruleDoubleQuotedString10982);
            	    lv_stringPart_2_0=ruleTextExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDoubleQuotedStringRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"stringPart",
            	              		lv_stringPart_2_0, 
            	              		"TextExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop96;
                }
            } while (true);

            otherlv_3=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleDoubleQuotedString10996); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDoubleQuotedStringAccess().getQuotationMarkKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleDoubleQuotedString"


    // $ANTLR start "entryRuleTextExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5056:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5060:2: (iv_ruleTextExpression= ruleTextExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5061:2: iv_ruleTextExpression= ruleTextExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleTextExpression_in_entryRuleTextExpression11040);
            iv_ruleTextExpression=ruleTextExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextExpression11050); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleTextExpression"


    // $ANTLR start "ruleTextExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5071:1: ruleTextExpression returns [EObject current=null] : ( ( () ( (lv_text_1_0= ruledoubleStringCharacters ) ) ) | ( () otherlv_3= KEYWORD_24 ( (lv_expression_4_0= ruleExpressionWithHidden ) ) otherlv_5= KEYWORD_21 ) | ( () ( (lv_varName_7_0= ruledollarVariable ) ) ) ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_text_1_0 = null;

        EObject lv_expression_4_0 = null;

        AntlrDatatypeRuleToken lv_varName_7_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5075:28: ( ( ( () ( (lv_text_1_0= ruledoubleStringCharacters ) ) ) | ( () otherlv_3= KEYWORD_24 ( (lv_expression_4_0= ruleExpressionWithHidden ) ) otherlv_5= KEYWORD_21 ) | ( () ( (lv_varName_7_0= ruledollarVariable ) ) ) ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5076:1: ( ( () ( (lv_text_1_0= ruledoubleStringCharacters ) ) ) | ( () otherlv_3= KEYWORD_24 ( (lv_expression_4_0= ruleExpressionWithHidden ) ) otherlv_5= KEYWORD_21 ) | ( () ( (lv_varName_7_0= ruledollarVariable ) ) ) )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5076:1: ( ( () ( (lv_text_1_0= ruledoubleStringCharacters ) ) ) | ( () otherlv_3= KEYWORD_24 ( (lv_expression_4_0= ruleExpressionWithHidden ) ) otherlv_5= KEYWORD_21 ) | ( () ( (lv_varName_7_0= ruledollarVariable ) ) ) )
            int alt97=3;
            switch ( input.LA(1) ) {
            case KEYWORD_48:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_40:
            case KEYWORD_41:
            case RULE_WS:
            case RULE_WORD_CHARS:
            case RULE_ANY_OTHER:
                {
                alt97=1;
                }
                break;
            case KEYWORD_24:
                {
                alt97=2;
                }
                break;
            case RULE_DOLLAR_VAR:
                {
                alt97=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }

            switch (alt97) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5076:2: ( () ( (lv_text_1_0= ruledoubleStringCharacters ) ) )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5076:2: ( () ( (lv_text_1_0= ruledoubleStringCharacters ) ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5076:3: () ( (lv_text_1_0= ruledoubleStringCharacters ) )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5076:3: ()
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5077:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTextExpressionAccess().getVerbatimTEAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5085:2: ( (lv_text_1_0= ruledoubleStringCharacters ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5086:1: (lv_text_1_0= ruledoubleStringCharacters )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5086:1: (lv_text_1_0= ruledoubleStringCharacters )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5087:3: lv_text_1_0= ruledoubleStringCharacters
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTextExpressionAccess().getTextDoubleStringCharactersParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruledoubleStringCharacters_in_ruleTextExpression11113);
                    lv_text_1_0=ruledoubleStringCharacters();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTextExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"text",
                              		lv_text_1_0, 
                              		"doubleStringCharacters");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5104:6: ( () otherlv_3= KEYWORD_24 ( (lv_expression_4_0= ruleExpressionWithHidden ) ) otherlv_5= KEYWORD_21 )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5104:6: ( () otherlv_3= KEYWORD_24 ( (lv_expression_4_0= ruleExpressionWithHidden ) ) otherlv_5= KEYWORD_21 )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5104:7: () otherlv_3= KEYWORD_24 ( (lv_expression_4_0= ruleExpressionWithHidden ) ) otherlv_5= KEYWORD_21
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5104:7: ()
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5105:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTextExpressionAccess().getExpressionTEAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_3=(Token)match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleTextExpression11146); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getTextExpressionAccess().getDollarSignLeftCurlyBracketKeyword_1_1());
                          
                    }
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5118:1: ( (lv_expression_4_0= ruleExpressionWithHidden ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5119:1: (lv_expression_4_0= ruleExpressionWithHidden )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5119:1: (lv_expression_4_0= ruleExpressionWithHidden )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5120:3: lv_expression_4_0= ruleExpressionWithHidden
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTextExpressionAccess().getExpressionExpressionWithHiddenParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpressionWithHidden_in_ruleTextExpression11166);
                    lv_expression_4_0=ruleExpressionWithHidden();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTextExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_4_0, 
                              		"ExpressionWithHidden");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleTextExpression11179); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getTextExpressionAccess().getRightCurlyBracketKeyword_1_3());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5142:6: ( () ( (lv_varName_7_0= ruledollarVariable ) ) )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5142:6: ( () ( (lv_varName_7_0= ruledollarVariable ) ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5142:7: () ( (lv_varName_7_0= ruledollarVariable ) )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5142:7: ()
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5143:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTextExpressionAccess().getVariableTEAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5151:2: ( (lv_varName_7_0= ruledollarVariable ) )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5152:1: (lv_varName_7_0= ruledollarVariable )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5152:1: (lv_varName_7_0= ruledollarVariable )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5153:3: lv_varName_7_0= ruledollarVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTextExpressionAccess().getVarNameDollarVariableParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruledollarVariable_in_ruleTextExpression11219);
                    lv_varName_7_0=ruledollarVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTextExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"varName",
                              		lv_varName_7_0, 
                              		"dollarVariable");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleTextExpression"


    // $ANTLR start "entryRuleExpressionWithHidden"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5180:1: entryRuleExpressionWithHidden returns [EObject current=null] : iv_ruleExpressionWithHidden= ruleExpressionWithHidden EOF ;
    public final EObject entryRuleExpressionWithHidden() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionWithHidden = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
        	
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5184:2: (iv_ruleExpressionWithHidden= ruleExpressionWithHidden EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5185:2: iv_ruleExpressionWithHidden= ruleExpressionWithHidden EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionWithHiddenRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionWithHidden_in_entryRuleExpressionWithHidden11265);
            iv_ruleExpressionWithHidden=ruleExpressionWithHidden();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionWithHidden; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionWithHidden11275); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionWithHidden"


    // $ANTLR start "ruleExpressionWithHidden"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5195:1: ruleExpressionWithHidden returns [EObject current=null] : ( () ( (lv_expr_1_0= ruleAssignmentExpression ) )? ) ;
    public final EObject ruleExpressionWithHidden() throws RecognitionException {
        EObject current = null;

        EObject lv_expr_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT");
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5199:28: ( ( () ( (lv_expr_1_0= ruleAssignmentExpression ) )? ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5200:1: ( () ( (lv_expr_1_0= ruleAssignmentExpression ) )? )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5200:1: ( () ( (lv_expr_1_0= ruleAssignmentExpression ) )? )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5200:2: () ( (lv_expr_1_0= ruleAssignmentExpression ) )?
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5200:2: ()
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5201:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExpressionWithHiddenAccess().getParenthesisedExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5209:2: ( (lv_expr_1_0= ruleAssignmentExpression ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( ((LA98_0>=KEYWORD_61 && LA98_0<=KEYWORD_55)||(LA98_0>=KEYWORD_57 && LA98_0<=KEYWORD_51)||(LA98_0>=KEYWORD_53 && LA98_0<=KEYWORD_54)||LA98_0==KEYWORD_24||LA98_0==KEYWORD_42||(LA98_0>=KEYWORD_1 && LA98_0<=KEYWORD_4)||LA98_0==KEYWORD_9||(LA98_0>=KEYWORD_17 && LA98_0<=KEYWORD_18)||LA98_0==KEYWORD_20||(LA98_0>=RULE_DOLLAR_VAR && LA98_0<=RULE_WORD_CHARS)||LA98_0==RULE_REGULAR_EXPRESSION) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5210:1: (lv_expr_1_0= ruleAssignmentExpression )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5210:1: (lv_expr_1_0= ruleAssignmentExpression )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5211:3: lv_expr_1_0= ruleAssignmentExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionWithHiddenAccess().getExprAssignmentExpressionParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleExpressionWithHidden11337);
                    lv_expr_1_0=ruleAssignmentExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionWithHiddenRule());
                      	        }
                             		set(
                             			current, 
                             			"expr",
                              		lv_expr_1_0, 
                              		"AssignmentExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleExpressionWithHidden"


    // $ANTLR start "entryRuleUnquotedString"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5240:1: entryRuleUnquotedString returns [EObject current=null] : iv_ruleUnquotedString= ruleUnquotedString EOF ;
    public final EObject entryRuleUnquotedString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnquotedString = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5241:2: (iv_ruleUnquotedString= ruleUnquotedString EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5242:2: iv_ruleUnquotedString= ruleUnquotedString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnquotedStringRule()); 
            }
            pushFollow(FOLLOW_ruleUnquotedString_in_entryRuleUnquotedString11379);
            iv_ruleUnquotedString=ruleUnquotedString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnquotedString; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnquotedString11389); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnquotedString"


    // $ANTLR start "ruleUnquotedString"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5249:1: ruleUnquotedString returns [EObject current=null] : ( () otherlv_1= KEYWORD_24 ( (lv_expression_2_0= ruleAssignmentExpression ) )? otherlv_3= KEYWORD_21 ) ;
    public final EObject ruleUnquotedString() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5252:28: ( ( () otherlv_1= KEYWORD_24 ( (lv_expression_2_0= ruleAssignmentExpression ) )? otherlv_3= KEYWORD_21 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5253:1: ( () otherlv_1= KEYWORD_24 ( (lv_expression_2_0= ruleAssignmentExpression ) )? otherlv_3= KEYWORD_21 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5253:1: ( () otherlv_1= KEYWORD_24 ( (lv_expression_2_0= ruleAssignmentExpression ) )? otherlv_3= KEYWORD_21 )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5253:2: () otherlv_1= KEYWORD_24 ( (lv_expression_2_0= ruleAssignmentExpression ) )? otherlv_3= KEYWORD_21
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5253:2: ()
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5254:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUnquotedStringAccess().getUnquotedStringAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleUnquotedString11439); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUnquotedStringAccess().getDollarSignLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5267:1: ( (lv_expression_2_0= ruleAssignmentExpression ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( ((LA99_0>=KEYWORD_61 && LA99_0<=KEYWORD_55)||(LA99_0>=KEYWORD_57 && LA99_0<=KEYWORD_51)||(LA99_0>=KEYWORD_53 && LA99_0<=KEYWORD_54)||LA99_0==KEYWORD_24||LA99_0==KEYWORD_42||(LA99_0>=KEYWORD_1 && LA99_0<=KEYWORD_4)||LA99_0==KEYWORD_9||(LA99_0>=KEYWORD_17 && LA99_0<=KEYWORD_18)||LA99_0==KEYWORD_20||(LA99_0>=RULE_DOLLAR_VAR && LA99_0<=RULE_WORD_CHARS)||LA99_0==RULE_REGULAR_EXPRESSION) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5268:1: (lv_expression_2_0= ruleAssignmentExpression )
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5268:1: (lv_expression_2_0= ruleAssignmentExpression )
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5269:3: lv_expression_2_0= ruleAssignmentExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnquotedStringAccess().getExpressionAssignmentExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleUnquotedString11459);
                    lv_expression_2_0=ruleAssignmentExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnquotedStringRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_2_0, 
                              		"AssignmentExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleUnquotedString11473); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getUnquotedStringAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUnquotedString"


    // $ANTLR start "entryRulesqText"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5298:1: entryRulesqText returns [String current=null] : iv_rulesqText= rulesqText EOF ;
    public final String entryRulesqText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesqText = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5302:1: (iv_rulesqText= rulesqText EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5303:2: iv_rulesqText= rulesqText EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSqTextRule()); 
            }
            pushFollow(FOLLOW_rulesqText_in_entryRulesqText11514);
            iv_rulesqText=rulesqText();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesqText.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulesqText11525); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulesqText"


    // $ANTLR start "rulesqText"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5313:1: rulesqText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_3 (this_singleStringCharacters_1= rulesingleStringCharacters )? kw= KEYWORD_3 ) ;
    public final AntlrDatatypeRuleToken rulesqText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_singleStringCharacters_1 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5318:6: ( (kw= KEYWORD_3 (this_singleStringCharacters_1= rulesingleStringCharacters )? kw= KEYWORD_3 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5319:1: (kw= KEYWORD_3 (this_singleStringCharacters_1= rulesingleStringCharacters )? kw= KEYWORD_3 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5319:1: (kw= KEYWORD_3 (this_singleStringCharacters_1= rulesingleStringCharacters )? kw= KEYWORD_3 )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5320:2: kw= KEYWORD_3 (this_singleStringCharacters_1= rulesingleStringCharacters )? kw= KEYWORD_3
            {
            kw=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_rulesqText11567); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getSqTextAccess().getApostropheKeyword_0()); 
                  
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5325:1: (this_singleStringCharacters_1= rulesingleStringCharacters )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==KEYWORD_48||LA100_0==KEYWORD_24||(LA100_0>=KEYWORD_38 && LA100_0<=KEYWORD_41)||(LA100_0>=RULE_WS && LA100_0<=RULE_WORD_CHARS)||LA100_0==RULE_ANY_OTHER) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5326:5: this_singleStringCharacters_1= rulesingleStringCharacters
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSqTextAccess().getSingleStringCharactersParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulesingleStringCharacters_in_rulesqText11590);
                    this_singleStringCharacters_1=rulesingleStringCharacters();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_singleStringCharacters_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            kw=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_rulesqText11610); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getSqTextAccess().getApostropheKeyword_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulesqText"


    // $ANTLR start "entryRuleLiteralRegex"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5353:1: entryRuleLiteralRegex returns [EObject current=null] : iv_ruleLiteralRegex= ruleLiteralRegex EOF ;
    public final EObject entryRuleLiteralRegex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralRegex = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5354:2: (iv_ruleLiteralRegex= ruleLiteralRegex EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5355:2: iv_ruleLiteralRegex= ruleLiteralRegex EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRegexRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralRegex_in_entryRuleLiteralRegex11653);
            iv_ruleLiteralRegex=ruleLiteralRegex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralRegex; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralRegex11663); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralRegex"


    // $ANTLR start "ruleLiteralRegex"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5362:1: ruleLiteralRegex returns [EObject current=null] : ( (lv_value_0_0= RULE_REGULAR_EXPRESSION ) ) ;
    public final EObject ruleLiteralRegex() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5365:28: ( ( (lv_value_0_0= RULE_REGULAR_EXPRESSION ) ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5366:1: ( (lv_value_0_0= RULE_REGULAR_EXPRESSION ) )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5366:1: ( (lv_value_0_0= RULE_REGULAR_EXPRESSION ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5367:1: (lv_value_0_0= RULE_REGULAR_EXPRESSION )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5367:1: (lv_value_0_0= RULE_REGULAR_EXPRESSION )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5368:3: lv_value_0_0= RULE_REGULAR_EXPRESSION
            {
            lv_value_0_0=(Token)match(input,RULE_REGULAR_EXPRESSION,FOLLOW_RULE_REGULAR_EXPRESSION_in_ruleLiteralRegex11704); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getLiteralRegexAccess().getValueREGULAR_EXPRESSIONTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLiteralRegexRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"REGULAR_EXPRESSION");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLiteralRegex"


    // $ANTLR start "entryRuleLiteralName"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5392:1: entryRuleLiteralName returns [EObject current=null] : iv_ruleLiteralName= ruleLiteralName EOF ;
    public final EObject entryRuleLiteralName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralName = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5393:2: (iv_ruleLiteralName= ruleLiteralName EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5394:2: iv_ruleLiteralName= ruleLiteralName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralNameRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralName_in_entryRuleLiteralName11743);
            iv_ruleLiteralName=ruleLiteralName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralName11753); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralName"


    // $ANTLR start "ruleLiteralName"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5401:1: ruleLiteralName returns [EObject current=null] : ( (lv_value_0_0= rulename ) ) ;
    public final EObject ruleLiteralName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5404:28: ( ( (lv_value_0_0= rulename ) ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5405:1: ( (lv_value_0_0= rulename ) )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5405:1: ( (lv_value_0_0= rulename ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5406:1: (lv_value_0_0= rulename )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5406:1: (lv_value_0_0= rulename )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5407:3: lv_value_0_0= rulename
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLiteralNameAccess().getValueNameParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_rulename_in_ruleLiteralName11798);
            lv_value_0_0=rulename();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLiteralNameRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"name");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLiteralName"


    // $ANTLR start "entryRuleVariableExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5431:1: entryRuleVariableExpression returns [EObject current=null] : iv_ruleVariableExpression= ruleVariableExpression EOF ;
    public final EObject entryRuleVariableExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableExpression = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5432:2: (iv_ruleVariableExpression= ruleVariableExpression EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5433:2: iv_ruleVariableExpression= ruleVariableExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleVariableExpression_in_entryRuleVariableExpression11832);
            iv_ruleVariableExpression=ruleVariableExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableExpression11842); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariableExpression"


    // $ANTLR start "ruleVariableExpression"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5440:1: ruleVariableExpression returns [EObject current=null] : ( (lv_varName_0_0= ruledollarVariable ) ) ;
    public final EObject ruleVariableExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_varName_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5443:28: ( ( (lv_varName_0_0= ruledollarVariable ) ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5444:1: ( (lv_varName_0_0= ruledollarVariable ) )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5444:1: ( (lv_varName_0_0= ruledollarVariable ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5445:1: (lv_varName_0_0= ruledollarVariable )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5445:1: (lv_varName_0_0= ruledollarVariable )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5446:3: lv_varName_0_0= ruledollarVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableExpressionAccess().getVarNameDollarVariableParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruledollarVariable_in_ruleVariableExpression11887);
            lv_varName_0_0=ruledollarVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"varName",
                      		lv_varName_0_0, 
                      		"dollarVariable");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVariableExpression"


    // $ANTLR start "entryRuledollarVariable"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5470:1: entryRuledollarVariable returns [String current=null] : iv_ruledollarVariable= ruledollarVariable EOF ;
    public final String entryRuledollarVariable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledollarVariable = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5474:1: (iv_ruledollarVariable= ruledollarVariable EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5475:2: iv_ruledollarVariable= ruledollarVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDollarVariableRule()); 
            }
            pushFollow(FOLLOW_ruledollarVariable_in_entryRuledollarVariable11928);
            iv_ruledollarVariable=ruledollarVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledollarVariable.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuledollarVariable11939); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuledollarVariable"


    // $ANTLR start "ruledollarVariable"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5485:1: ruledollarVariable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOLLAR_VAR_0= RULE_DOLLAR_VAR ;
    public final AntlrDatatypeRuleToken ruledollarVariable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOLLAR_VAR_0=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5490:6: (this_DOLLAR_VAR_0= RULE_DOLLAR_VAR )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5491:5: this_DOLLAR_VAR_0= RULE_DOLLAR_VAR
            {
            this_DOLLAR_VAR_0=(Token)match(input,RULE_DOLLAR_VAR,FOLLOW_RULE_DOLLAR_VAR_in_ruledollarVariable11982); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_DOLLAR_VAR_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_DOLLAR_VAR_0, grammarAccess.getDollarVariableAccess().getDOLLAR_VARTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruledollarVariable"


    // $ANTLR start "entryRulename"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5511:1: entryRulename returns [String current=null] : iv_rulename= rulename EOF ;
    public final String entryRulename() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulename = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5512:1: (iv_rulename= rulename EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5513:2: iv_rulename= rulename EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameRule()); 
            }
            pushFollow(FOLLOW_rulename_in_entryRulename12032);
            iv_rulename=rulename();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulename.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulename12043); if (state.failed) return current;

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
    // $ANTLR end "entryRulename"


    // $ANTLR start "rulename"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5520:1: rulename returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_WORD_CHARS_0= RULE_WORD_CHARS ;
    public final AntlrDatatypeRuleToken rulename() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WORD_CHARS_0=null;

         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5524:6: (this_WORD_CHARS_0= RULE_WORD_CHARS )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5525:5: this_WORD_CHARS_0= RULE_WORD_CHARS
            {
            this_WORD_CHARS_0=(Token)match(input,RULE_WORD_CHARS,FOLLOW_RULE_WORD_CHARS_in_rulename12082); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_WORD_CHARS_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_WORD_CHARS_0, grammarAccess.getNameAccess().getWORD_CHARSTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
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
    // $ANTLR end "rulename"


    // $ANTLR start "entryRuleclassname"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5540:1: entryRuleclassname returns [String current=null] : iv_ruleclassname= ruleclassname EOF ;
    public final String entryRuleclassname() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleclassname = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5541:1: (iv_ruleclassname= ruleclassname EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5542:2: iv_ruleclassname= ruleclassname EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassnameRule()); 
            }
            pushFollow(FOLLOW_ruleclassname_in_entryRuleclassname12126);
            iv_ruleclassname=ruleclassname();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleclassname.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleclassname12137); if (state.failed) return current;

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
    // $ANTLR end "entryRuleclassname"


    // $ANTLR start "ruleclassname"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5549:1: ruleclassname returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_name_0= rulename | kw= KEYWORD_55 ) ;
    public final AntlrDatatypeRuleToken ruleclassname() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_name_0 = null;


         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5553:6: ( (this_name_0= rulename | kw= KEYWORD_55 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5554:1: (this_name_0= rulename | kw= KEYWORD_55 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5554:1: (this_name_0= rulename | kw= KEYWORD_55 )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==RULE_WORD_CHARS) ) {
                alt101=1;
            }
            else if ( (LA101_0==KEYWORD_55) ) {
                alt101=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }
            switch (alt101) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5555:5: this_name_0= rulename
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getClassnameAccess().getNameParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulename_in_ruleclassname12184);
                    this_name_0=rulename();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_name_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5567:2: kw= KEYWORD_55
                    {
                    kw=(Token)match(input,KEYWORD_55,FOLLOW_KEYWORD_55_in_ruleclassname12208); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getClassnameAccess().getClassKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
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
    // $ANTLR end "ruleclassname"


    // $ANTLR start "entryRuleunionNameOrReference"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5580:1: entryRuleunionNameOrReference returns [String current=null] : iv_ruleunionNameOrReference= ruleunionNameOrReference EOF ;
    public final String entryRuleunionNameOrReference() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunionNameOrReference = null;


        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5581:1: (iv_ruleunionNameOrReference= ruleunionNameOrReference EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5582:2: iv_ruleunionNameOrReference= ruleunionNameOrReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnionNameOrReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleunionNameOrReference_in_entryRuleunionNameOrReference12248);
            iv_ruleunionNameOrReference=ruleunionNameOrReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleunionNameOrReference.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleunionNameOrReference12259); if (state.failed) return current;

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
    // $ANTLR end "entryRuleunionNameOrReference"


    // $ANTLR start "ruleunionNameOrReference"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5589:1: ruleunionNameOrReference returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WORD_CHARS_0= RULE_WORD_CHARS | kw= KEYWORD_55 | kw= KEYWORD_61 ) ;
    public final AntlrDatatypeRuleToken ruleunionNameOrReference() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WORD_CHARS_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5593:6: ( (this_WORD_CHARS_0= RULE_WORD_CHARS | kw= KEYWORD_55 | kw= KEYWORD_61 ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5594:1: (this_WORD_CHARS_0= RULE_WORD_CHARS | kw= KEYWORD_55 | kw= KEYWORD_61 )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5594:1: (this_WORD_CHARS_0= RULE_WORD_CHARS | kw= KEYWORD_55 | kw= KEYWORD_61 )
            int alt102=3;
            switch ( input.LA(1) ) {
            case RULE_WORD_CHARS:
                {
                alt102=1;
                }
                break;
            case KEYWORD_55:
                {
                alt102=2;
                }
                break;
            case KEYWORD_61:
                {
                alt102=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }

            switch (alt102) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5594:6: this_WORD_CHARS_0= RULE_WORD_CHARS
                    {
                    this_WORD_CHARS_0=(Token)match(input,RULE_WORD_CHARS,FOLLOW_RULE_WORD_CHARS_in_ruleunionNameOrReference12299); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_WORD_CHARS_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WORD_CHARS_0, grammarAccess.getUnionNameOrReferenceAccess().getWORD_CHARSTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5603:2: kw= KEYWORD_55
                    {
                    kw=(Token)match(input,KEYWORD_55,FOLLOW_KEYWORD_55_in_ruleunionNameOrReference12323); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getUnionNameOrReferenceAccess().getClassKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5610:2: kw= KEYWORD_61
                    {
                    kw=(Token)match(input,KEYWORD_61,FOLLOW_KEYWORD_61_in_ruleunionNameOrReference12342); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getUnionNameOrReferenceAccess().getDefaultKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
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
    // $ANTLR end "ruleunionNameOrReference"


    // $ANTLR start "entryRuledoubleStringCharacters"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5623:1: entryRuledoubleStringCharacters returns [String current=null] : iv_ruledoubleStringCharacters= ruledoubleStringCharacters EOF ;
    public final String entryRuledoubleStringCharacters() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledoubleStringCharacters = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5627:1: (iv_ruledoubleStringCharacters= ruledoubleStringCharacters EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5628:2: iv_ruledoubleStringCharacters= ruledoubleStringCharacters EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDoubleStringCharactersRule()); 
            }
            pushFollow(FOLLOW_ruledoubleStringCharacters_in_entryRuledoubleStringCharacters12388);
            iv_ruledoubleStringCharacters=ruledoubleStringCharacters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledoubleStringCharacters.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuledoubleStringCharacters12399); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuledoubleStringCharacters"


    // $ANTLR start "ruledoubleStringCharacters"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5638:1: ruledoubleStringCharacters returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WORD_CHARS_0= RULE_WORD_CHARS | this_ANY_OTHER_1= RULE_ANY_OTHER | this_WS_2= RULE_WS | kw= KEYWORD_38 | kw= KEYWORD_40 | kw= KEYWORD_39 | kw= KEYWORD_48 | kw= KEYWORD_41 )+ ;
    public final AntlrDatatypeRuleToken ruledoubleStringCharacters() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WORD_CHARS_0=null;
        Token this_ANY_OTHER_1=null;
        Token this_WS_2=null;
        Token kw=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5643:6: ( (this_WORD_CHARS_0= RULE_WORD_CHARS | this_ANY_OTHER_1= RULE_ANY_OTHER | this_WS_2= RULE_WS | kw= KEYWORD_38 | kw= KEYWORD_40 | kw= KEYWORD_39 | kw= KEYWORD_48 | kw= KEYWORD_41 )+ )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5644:1: (this_WORD_CHARS_0= RULE_WORD_CHARS | this_ANY_OTHER_1= RULE_ANY_OTHER | this_WS_2= RULE_WS | kw= KEYWORD_38 | kw= KEYWORD_40 | kw= KEYWORD_39 | kw= KEYWORD_48 | kw= KEYWORD_41 )+
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5644:1: (this_WORD_CHARS_0= RULE_WORD_CHARS | this_ANY_OTHER_1= RULE_ANY_OTHER | this_WS_2= RULE_WS | kw= KEYWORD_38 | kw= KEYWORD_40 | kw= KEYWORD_39 | kw= KEYWORD_48 | kw= KEYWORD_41 )+
            int cnt103=0;
            loop103:
            do {
                int alt103=9;
                alt103 = dfa103.predict(input);
                switch (alt103) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5644:6: this_WORD_CHARS_0= RULE_WORD_CHARS
            	    {
            	    this_WORD_CHARS_0=(Token)match(input,RULE_WORD_CHARS,FOLLOW_RULE_WORD_CHARS_in_ruledoubleStringCharacters12443); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WORD_CHARS_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WORD_CHARS_0, grammarAccess.getDoubleStringCharactersAccess().getWORD_CHARSTerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5652:10: this_ANY_OTHER_1= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_1=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruledoubleStringCharacters12469); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ANY_OTHER_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ANY_OTHER_1, grammarAccess.getDoubleStringCharactersAccess().getANY_OTHERTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;
            	case 3 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5660:10: this_WS_2= RULE_WS
            	    {
            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruledoubleStringCharacters12495); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WS_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_2, grammarAccess.getDoubleStringCharactersAccess().getWSTerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;
            	case 4 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5669:2: kw= KEYWORD_38
            	    {
            	    kw=(Token)match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_ruledoubleStringCharacters12519); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getDoubleStringCharactersAccess().getReverseSolidusQuotationMarkKeyword_3()); 
            	          
            	    }

            	    }
            	    break;
            	case 5 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5676:2: kw= KEYWORD_40
            	    {
            	    kw=(Token)match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_ruledoubleStringCharacters12538); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getDoubleStringCharactersAccess().getReverseSolidusApostropheKeyword_4()); 
            	          
            	    }

            	    }
            	    break;
            	case 6 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5683:2: kw= KEYWORD_39
            	    {
            	    kw=(Token)match(input,KEYWORD_39,FOLLOW_KEYWORD_39_in_ruledoubleStringCharacters12557); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getDoubleStringCharactersAccess().getReverseSolidusDollarSignKeyword_5()); 
            	          
            	    }

            	    }
            	    break;
            	case 7 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5690:2: kw= KEYWORD_48
            	    {
            	    kw=(Token)match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_ruledoubleStringCharacters12576); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getDoubleStringCharactersAccess().getReverseSolidusDollarSignLeftCurlyBracketKeyword_6()); 
            	          
            	    }

            	    }
            	    break;
            	case 8 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5697:2: kw= KEYWORD_41
            	    {
            	    kw=(Token)match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_ruledoubleStringCharacters12595); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getDoubleStringCharactersAccess().getReverseSolidusReverseSolidusKeyword_7()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt103 >= 1 ) break loop103;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(103, input);
                        throw eee;
                }
                cnt103++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruledoubleStringCharacters"


    // $ANTLR start "entryRulesingleStringCharacters"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5713:1: entryRulesingleStringCharacters returns [String current=null] : iv_rulesingleStringCharacters= rulesingleStringCharacters EOF ;
    public final String entryRulesingleStringCharacters() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesingleStringCharacters = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5717:1: (iv_rulesingleStringCharacters= rulesingleStringCharacters EOF )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5718:2: iv_rulesingleStringCharacters= rulesingleStringCharacters EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleStringCharactersRule()); 
            }
            pushFollow(FOLLOW_rulesingleStringCharacters_in_entryRulesingleStringCharacters12646);
            iv_rulesingleStringCharacters=rulesingleStringCharacters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesingleStringCharacters.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulesingleStringCharacters12657); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulesingleStringCharacters"


    // $ANTLR start "rulesingleStringCharacters"
    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5728:1: rulesingleStringCharacters returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WORD_CHARS_0= RULE_WORD_CHARS | this_ANY_OTHER_1= RULE_ANY_OTHER | this_WS_2= RULE_WS | this_DOLLAR_VAR_3= RULE_DOLLAR_VAR | kw= KEYWORD_24 | kw= KEYWORD_38 | kw= KEYWORD_40 | kw= KEYWORD_39 | kw= KEYWORD_48 | kw= KEYWORD_41 )+ ;
    public final AntlrDatatypeRuleToken rulesingleStringCharacters() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WORD_CHARS_0=null;
        Token this_ANY_OTHER_1=null;
        Token this_WS_2=null;
        Token this_DOLLAR_VAR_3=null;
        Token kw=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5733:6: ( (this_WORD_CHARS_0= RULE_WORD_CHARS | this_ANY_OTHER_1= RULE_ANY_OTHER | this_WS_2= RULE_WS | this_DOLLAR_VAR_3= RULE_DOLLAR_VAR | kw= KEYWORD_24 | kw= KEYWORD_38 | kw= KEYWORD_40 | kw= KEYWORD_39 | kw= KEYWORD_48 | kw= KEYWORD_41 )+ )
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5734:1: (this_WORD_CHARS_0= RULE_WORD_CHARS | this_ANY_OTHER_1= RULE_ANY_OTHER | this_WS_2= RULE_WS | this_DOLLAR_VAR_3= RULE_DOLLAR_VAR | kw= KEYWORD_24 | kw= KEYWORD_38 | kw= KEYWORD_40 | kw= KEYWORD_39 | kw= KEYWORD_48 | kw= KEYWORD_41 )+
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5734:1: (this_WORD_CHARS_0= RULE_WORD_CHARS | this_ANY_OTHER_1= RULE_ANY_OTHER | this_WS_2= RULE_WS | this_DOLLAR_VAR_3= RULE_DOLLAR_VAR | kw= KEYWORD_24 | kw= KEYWORD_38 | kw= KEYWORD_40 | kw= KEYWORD_39 | kw= KEYWORD_48 | kw= KEYWORD_41 )+
            int cnt104=0;
            loop104:
            do {
                int alt104=11;
                switch ( input.LA(1) ) {
                case RULE_WORD_CHARS:
                    {
                    alt104=1;
                    }
                    break;
                case RULE_ANY_OTHER:
                    {
                    alt104=2;
                    }
                    break;
                case RULE_WS:
                    {
                    alt104=3;
                    }
                    break;
                case RULE_DOLLAR_VAR:
                    {
                    alt104=4;
                    }
                    break;
                case KEYWORD_24:
                    {
                    alt104=5;
                    }
                    break;
                case KEYWORD_38:
                    {
                    alt104=6;
                    }
                    break;
                case KEYWORD_40:
                    {
                    alt104=7;
                    }
                    break;
                case KEYWORD_39:
                    {
                    alt104=8;
                    }
                    break;
                case KEYWORD_48:
                    {
                    alt104=9;
                    }
                    break;
                case KEYWORD_41:
                    {
                    alt104=10;
                    }
                    break;

                }

                switch (alt104) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5734:6: this_WORD_CHARS_0= RULE_WORD_CHARS
            	    {
            	    this_WORD_CHARS_0=(Token)match(input,RULE_WORD_CHARS,FOLLOW_RULE_WORD_CHARS_in_rulesingleStringCharacters12701); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WORD_CHARS_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WORD_CHARS_0, grammarAccess.getSingleStringCharactersAccess().getWORD_CHARSTerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5742:10: this_ANY_OTHER_1= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_1=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rulesingleStringCharacters12727); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ANY_OTHER_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ANY_OTHER_1, grammarAccess.getSingleStringCharactersAccess().getANY_OTHERTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;
            	case 3 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5750:10: this_WS_2= RULE_WS
            	    {
            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_rulesingleStringCharacters12753); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WS_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WS_2, grammarAccess.getSingleStringCharactersAccess().getWSTerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;
            	case 4 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5758:10: this_DOLLAR_VAR_3= RULE_DOLLAR_VAR
            	    {
            	    this_DOLLAR_VAR_3=(Token)match(input,RULE_DOLLAR_VAR,FOLLOW_RULE_DOLLAR_VAR_in_rulesingleStringCharacters12779); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_DOLLAR_VAR_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_DOLLAR_VAR_3, grammarAccess.getSingleStringCharactersAccess().getDOLLAR_VARTerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;
            	case 5 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5767:2: kw= KEYWORD_24
            	    {
            	    kw=(Token)match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_rulesingleStringCharacters12803); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getSingleStringCharactersAccess().getDollarSignLeftCurlyBracketKeyword_4()); 
            	          
            	    }

            	    }
            	    break;
            	case 6 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5774:2: kw= KEYWORD_38
            	    {
            	    kw=(Token)match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_rulesingleStringCharacters12822); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getSingleStringCharactersAccess().getReverseSolidusQuotationMarkKeyword_5()); 
            	          
            	    }

            	    }
            	    break;
            	case 7 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5781:2: kw= KEYWORD_40
            	    {
            	    kw=(Token)match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_rulesingleStringCharacters12841); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getSingleStringCharactersAccess().getReverseSolidusApostropheKeyword_6()); 
            	          
            	    }

            	    }
            	    break;
            	case 8 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5788:2: kw= KEYWORD_39
            	    {
            	    kw=(Token)match(input,KEYWORD_39,FOLLOW_KEYWORD_39_in_rulesingleStringCharacters12860); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getSingleStringCharactersAccess().getReverseSolidusDollarSignKeyword_7()); 
            	          
            	    }

            	    }
            	    break;
            	case 9 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5795:2: kw= KEYWORD_48
            	    {
            	    kw=(Token)match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_rulesingleStringCharacters12879); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getSingleStringCharactersAccess().getReverseSolidusDollarSignLeftCurlyBracketKeyword_8()); 
            	          
            	    }

            	    }
            	    break;
            	case 10 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5802:2: kw= KEYWORD_41
            	    {
            	    kw=(Token)match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_rulesingleStringCharacters12898); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getSingleStringCharactersAccess().getReverseSolidusReverseSolidusKeyword_9()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt104 >= 1 ) break loop104;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(104, input);
                        throw eee;
                }
                cnt104++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulesingleStringCharacters"

    // $ANTLR start synpred7_InternalPPParser
    public final void synpred7_InternalPPParser_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_opName_2_0 = null;

        EObject lv_rightExpr_3_0 = null;


        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:310:2: ( () ( (lv_opName_2_0= ruleEdgeOperator ) ) ( (lv_rightExpr_3_0= ruleResourceExpression ) ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:310:2: () ( (lv_opName_2_0= ruleEdgeOperator ) ) ( (lv_rightExpr_3_0= ruleResourceExpression ) )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:310:2: ()
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:311:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:319:2: ( (lv_opName_2_0= ruleEdgeOperator ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:320:1: (lv_opName_2_0= ruleEdgeOperator )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:320:1: (lv_opName_2_0= ruleEdgeOperator )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:321:3: lv_opName_2_0= ruleEdgeOperator
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getRelationshipExpressionAccess().getOpNameEdgeOperatorParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleEdgeOperator_in_synpred7_InternalPPParser686);
        lv_opName_2_0=ruleEdgeOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:337:2: ( (lv_rightExpr_3_0= ruleResourceExpression ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:338:1: (lv_rightExpr_3_0= ruleResourceExpression )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:338:1: (lv_rightExpr_3_0= ruleResourceExpression )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:339:3: lv_rightExpr_3_0= ruleResourceExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getRelationshipExpressionAccess().getRightExprResourceExpressionParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleResourceExpression_in_synpred7_InternalPPParser707);
        lv_rightExpr_3_0=ruleResourceExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred7_InternalPPParser

    // $ANTLR start synpred11_InternalPPParser
    public final void synpred11_InternalPPParser_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_resourceData_3_0 = null;

        EObject lv_resourceData_5_0 = null;


        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:388:2: ( () otherlv_2= KEYWORD_20 ( ( (lv_resourceData_3_0= ruleResourceBody ) ) (otherlv_4= KEYWORD_12 ( (lv_resourceData_5_0= ruleResourceBody ) ) )* (otherlv_6= KEYWORD_12 )? )? otherlv_7= KEYWORD_21 )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:388:2: () otherlv_2= KEYWORD_20 ( ( (lv_resourceData_3_0= ruleResourceBody ) ) (otherlv_4= KEYWORD_12 ( (lv_resourceData_5_0= ruleResourceBody ) ) )* (otherlv_6= KEYWORD_12 )? )? otherlv_7= KEYWORD_21
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:388:2: ()
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:389:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        otherlv_2=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_synpred11_InternalPPParser830); if (state.failed) return ;
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:402:1: ( ( (lv_resourceData_3_0= ruleResourceBody ) ) (otherlv_4= KEYWORD_12 ( (lv_resourceData_5_0= ruleResourceBody ) ) )* (otherlv_6= KEYWORD_12 )? )?
        int alt110=2;
        int LA110_0 = input.LA(1);

        if ( ((LA110_0>=KEYWORD_61 && LA110_0<=KEYWORD_55)||(LA110_0>=KEYWORD_57 && LA110_0<=KEYWORD_51)||(LA110_0>=KEYWORD_53 && LA110_0<=KEYWORD_54)||LA110_0==KEYWORD_24||LA110_0==KEYWORD_42||(LA110_0>=KEYWORD_1 && LA110_0<=KEYWORD_4)||LA110_0==KEYWORD_9||(LA110_0>=KEYWORD_17 && LA110_0<=KEYWORD_18)||LA110_0==KEYWORD_20||(LA110_0>=RULE_DOLLAR_VAR && LA110_0<=RULE_WORD_CHARS)||LA110_0==RULE_REGULAR_EXPRESSION) ) {
            alt110=1;
        }
        switch (alt110) {
            case 1 :
                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:402:2: ( (lv_resourceData_3_0= ruleResourceBody ) ) (otherlv_4= KEYWORD_12 ( (lv_resourceData_5_0= ruleResourceBody ) ) )* (otherlv_6= KEYWORD_12 )?
                {
                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:402:2: ( (lv_resourceData_3_0= ruleResourceBody ) )
                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:403:1: (lv_resourceData_3_0= ruleResourceBody )
                {
                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:403:1: (lv_resourceData_3_0= ruleResourceBody )
                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:404:3: lv_resourceData_3_0= ruleResourceBody
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getResourceExpressionAccess().getResourceDataResourceBodyParserRuleCall_0_1_2_0_0()); 
                  	    
                }
                pushFollow(FOLLOW_ruleResourceBody_in_synpred11_InternalPPParser851);
                lv_resourceData_3_0=ruleResourceBody();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:420:2: (otherlv_4= KEYWORD_12 ( (lv_resourceData_5_0= ruleResourceBody ) ) )*
                loop108:
                do {
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==KEYWORD_12) ) {
                        int LA108_1 = input.LA(2);

                        if ( ((LA108_1>=KEYWORD_61 && LA108_1<=KEYWORD_55)||(LA108_1>=KEYWORD_57 && LA108_1<=KEYWORD_51)||(LA108_1>=KEYWORD_53 && LA108_1<=KEYWORD_54)||LA108_1==KEYWORD_24||LA108_1==KEYWORD_42||(LA108_1>=KEYWORD_1 && LA108_1<=KEYWORD_4)||LA108_1==KEYWORD_9||(LA108_1>=KEYWORD_17 && LA108_1<=KEYWORD_18)||LA108_1==KEYWORD_20||(LA108_1>=RULE_DOLLAR_VAR && LA108_1<=RULE_WORD_CHARS)||LA108_1==RULE_REGULAR_EXPRESSION) ) {
                            alt108=1;
                        }


                    }


                    switch (alt108) {
                	case 1 :
                	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:421:2: otherlv_4= KEYWORD_12 ( (lv_resourceData_5_0= ruleResourceBody ) )
                	    {
                	    otherlv_4=(Token)match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_synpred11_InternalPPParser865); if (state.failed) return ;
                	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:425:1: ( (lv_resourceData_5_0= ruleResourceBody ) )
                	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:426:1: (lv_resourceData_5_0= ruleResourceBody )
                	    {
                	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:426:1: (lv_resourceData_5_0= ruleResourceBody )
                	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:427:3: lv_resourceData_5_0= ruleResourceBody
                	    {
                	    if ( state.backtracking==0 ) {
                	       
                	      	        newCompositeNode(grammarAccess.getResourceExpressionAccess().getResourceDataResourceBodyParserRuleCall_0_1_2_1_1_0()); 
                	      	    
                	    }
                	    pushFollow(FOLLOW_ruleResourceBody_in_synpred11_InternalPPParser885);
                	    lv_resourceData_5_0=ruleResourceBody();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop108;
                    }
                } while (true);

                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:443:4: (otherlv_6= KEYWORD_12 )?
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==KEYWORD_12) ) {
                    alt109=1;
                }
                switch (alt109) {
                    case 1 :
                        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:444:2: otherlv_6= KEYWORD_12
                        {
                        otherlv_6=(Token)match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_synpred11_InternalPPParser901); if (state.failed) return ;

                        }
                        break;

                }


                }
                break;

        }

        otherlv_7=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_synpred11_InternalPPParser917); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_InternalPPParser

    // $ANTLR start synpred23_InternalPPParser
    public final void synpred23_InternalPPParser_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_rightExpr_3_0 = null;


        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:863:2: ( () otherlv_2= KEYWORD_14 ( (lv_rightExpr_3_0= ruleAppendExpression ) ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:863:2: () otherlv_2= KEYWORD_14 ( (lv_rightExpr_3_0= ruleAppendExpression ) )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:863:2: ()
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:864:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        otherlv_2=(Token)match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_synpred23_InternalPPParser1781); if (state.failed) return ;
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:877:1: ( (lv_rightExpr_3_0= ruleAppendExpression ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:878:1: (lv_rightExpr_3_0= ruleAppendExpression )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:878:1: (lv_rightExpr_3_0= ruleAppendExpression )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:879:3: lv_rightExpr_3_0= ruleAppendExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getRightExprAppendExpressionParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleAppendExpression_in_synpred23_InternalPPParser1801);
        lv_rightExpr_3_0=ruleAppendExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred23_InternalPPParser

    // $ANTLR start synpred24_InternalPPParser
    public final void synpred24_InternalPPParser_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_rightExpr_3_0 = null;


        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:928:2: ( () otherlv_2= KEYWORD_25 ( (lv_rightExpr_3_0= ruleOrExpression ) ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:928:2: () otherlv_2= KEYWORD_25 ( (lv_rightExpr_3_0= ruleOrExpression ) )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:928:2: ()
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:929:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        otherlv_2=(Token)match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_synpred24_InternalPPParser1923); if (state.failed) return ;
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:942:1: ( (lv_rightExpr_3_0= ruleOrExpression ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:943:1: (lv_rightExpr_3_0= ruleOrExpression )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:943:1: (lv_rightExpr_3_0= ruleOrExpression )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:944:3: lv_rightExpr_3_0= ruleOrExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getAppendExpressionAccess().getRightExprOrExpressionParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleOrExpression_in_synpred24_InternalPPParser1943);
        lv_rightExpr_3_0=ruleOrExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred24_InternalPPParser

    // $ANTLR start synpred25_InternalPPParser
    public final void synpred25_InternalPPParser_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_rightExpr_3_0 = null;


        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:993:2: ( () otherlv_2= KEYWORD_44 ( (lv_rightExpr_3_0= ruleAndExpression ) ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:993:2: () otherlv_2= KEYWORD_44 ( (lv_rightExpr_3_0= ruleAndExpression ) )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:993:2: ()
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:994:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        otherlv_2=(Token)match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_synpred25_InternalPPParser2065); if (state.failed) return ;
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1007:1: ( (lv_rightExpr_3_0= ruleAndExpression ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1008:1: (lv_rightExpr_3_0= ruleAndExpression )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1008:1: (lv_rightExpr_3_0= ruleAndExpression )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1009:3: lv_rightExpr_3_0= ruleAndExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getOrExpressionAccess().getRightExprAndExpressionParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleAndExpression_in_synpred25_InternalPPParser2085);
        lv_rightExpr_3_0=ruleAndExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred25_InternalPPParser

    // $ANTLR start synpred26_InternalPPParser
    public final void synpred26_InternalPPParser_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_rightExpr_3_0 = null;


        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1058:2: ( () otherlv_2= KEYWORD_49 ( (lv_rightExpr_3_0= ruleRelationalExpression ) ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1058:2: () otherlv_2= KEYWORD_49 ( (lv_rightExpr_3_0= ruleRelationalExpression ) )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1058:2: ()
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1059:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        otherlv_2=(Token)match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_synpred26_InternalPPParser2207); if (state.failed) return ;
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1072:1: ( (lv_rightExpr_3_0= ruleRelationalExpression ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1073:1: (lv_rightExpr_3_0= ruleRelationalExpression )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1073:1: (lv_rightExpr_3_0= ruleRelationalExpression )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1074:3: lv_rightExpr_3_0= ruleRelationalExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getAndExpressionAccess().getRightExprRelationalExpressionParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleRelationalExpression_in_synpred26_InternalPPParser2227);
        lv_rightExpr_3_0=ruleRelationalExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred26_InternalPPParser

    // $ANTLR start synpred30_InternalPPParser
    public final void synpred30_InternalPPParser_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_opName_2_0 = null;

        EObject lv_rightExpr_3_0 = null;


        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1172:2: ( () ( (lv_opName_2_0= ruleRelationalOperator ) ) ( (lv_rightExpr_3_0= ruleEqualityExpression ) ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1172:2: () ( (lv_opName_2_0= ruleRelationalOperator ) ) ( (lv_rightExpr_3_0= ruleEqualityExpression ) )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1172:2: ()
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1173:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1181:2: ( (lv_opName_2_0= ruleRelationalOperator ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1182:1: (lv_opName_2_0= ruleRelationalOperator )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1182:1: (lv_opName_2_0= ruleRelationalOperator )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1183:3: lv_opName_2_0= ruleRelationalOperator
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOpNameRelationalOperatorParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleRelationalOperator_in_synpred30_InternalPPParser2503);
        lv_opName_2_0=ruleRelationalOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1199:2: ( (lv_rightExpr_3_0= ruleEqualityExpression ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1200:1: (lv_rightExpr_3_0= ruleEqualityExpression )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1200:1: (lv_rightExpr_3_0= ruleEqualityExpression )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1201:3: lv_rightExpr_3_0= ruleEqualityExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightExprEqualityExpressionParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleEqualityExpression_in_synpred30_InternalPPParser2524);
        lv_rightExpr_3_0=ruleEqualityExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred30_InternalPPParser

    // $ANTLR start synpred32_InternalPPParser
    public final void synpred32_InternalPPParser_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_opName_2_0 = null;

        EObject lv_rightExpr_3_0 = null;


        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1285:2: ( () ( (lv_opName_2_0= ruleEqualityOperator ) ) ( (lv_rightExpr_3_0= ruleShiftExpression ) ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1285:2: () ( (lv_opName_2_0= ruleEqualityOperator ) ) ( (lv_rightExpr_3_0= ruleShiftExpression ) )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1285:2: ()
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1286:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1294:2: ( (lv_opName_2_0= ruleEqualityOperator ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1295:1: (lv_opName_2_0= ruleEqualityOperator )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1295:1: (lv_opName_2_0= ruleEqualityOperator )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1296:3: lv_opName_2_0= ruleEqualityOperator
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getEqualityExpressionAccess().getOpNameEqualityOperatorParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleEqualityOperator_in_synpred32_InternalPPParser2762);
        lv_opName_2_0=ruleEqualityOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1312:2: ( (lv_rightExpr_3_0= ruleShiftExpression ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1313:1: (lv_rightExpr_3_0= ruleShiftExpression )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1313:1: (lv_rightExpr_3_0= ruleShiftExpression )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1314:3: lv_rightExpr_3_0= ruleShiftExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRightExprShiftExpressionParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleShiftExpression_in_synpred32_InternalPPParser2783);
        lv_rightExpr_3_0=ruleShiftExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred32_InternalPPParser

    // $ANTLR start synpred34_InternalPPParser
    public final void synpred34_InternalPPParser_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_opName_2_0 = null;

        EObject lv_rightExpr_3_0 = null;


        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1398:2: ( () ( (lv_opName_2_0= ruleShiftOperator ) ) ( (lv_rightExpr_3_0= ruleAdditiveExpression ) ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1398:2: () ( (lv_opName_2_0= ruleShiftOperator ) ) ( (lv_rightExpr_3_0= ruleAdditiveExpression ) )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1398:2: ()
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1399:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1407:2: ( (lv_opName_2_0= ruleShiftOperator ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1408:1: (lv_opName_2_0= ruleShiftOperator )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1408:1: (lv_opName_2_0= ruleShiftOperator )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1409:3: lv_opName_2_0= ruleShiftOperator
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getOpNameShiftOperatorParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleShiftOperator_in_synpred34_InternalPPParser3021);
        lv_opName_2_0=ruleShiftOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1425:2: ( (lv_rightExpr_3_0= ruleAdditiveExpression ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1426:1: (lv_rightExpr_3_0= ruleAdditiveExpression )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1426:1: (lv_rightExpr_3_0= ruleAdditiveExpression )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1427:3: lv_rightExpr_3_0= ruleAdditiveExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getRightExprAdditiveExpressionParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleAdditiveExpression_in_synpred34_InternalPPParser3042);
        lv_rightExpr_3_0=ruleAdditiveExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred34_InternalPPParser

    // $ANTLR start synpred36_InternalPPParser
    public final void synpred36_InternalPPParser_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_opName_2_0 = null;

        EObject lv_rightExpr_3_0 = null;


        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1511:2: ( () ( (lv_opName_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpr_3_0= ruleMultiplicativeExpression ) ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1511:2: () ( (lv_opName_2_0= ruleAdditiveOperator ) ) ( (lv_rightExpr_3_0= ruleMultiplicativeExpression ) )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1511:2: ()
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1512:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1520:2: ( (lv_opName_2_0= ruleAdditiveOperator ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1521:1: (lv_opName_2_0= ruleAdditiveOperator )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1521:1: (lv_opName_2_0= ruleAdditiveOperator )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1522:3: lv_opName_2_0= ruleAdditiveOperator
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOpNameAdditiveOperatorParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleAdditiveOperator_in_synpred36_InternalPPParser3280);
        lv_opName_2_0=ruleAdditiveOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1538:2: ( (lv_rightExpr_3_0= ruleMultiplicativeExpression ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1539:1: (lv_rightExpr_3_0= ruleMultiplicativeExpression )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1539:1: (lv_rightExpr_3_0= ruleMultiplicativeExpression )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1540:3: lv_rightExpr_3_0= ruleMultiplicativeExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightExprMultiplicativeExpressionParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleMultiplicativeExpression_in_synpred36_InternalPPParser3301);
        lv_rightExpr_3_0=ruleMultiplicativeExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred36_InternalPPParser

    // $ANTLR start synpred38_InternalPPParser
    public final void synpred38_InternalPPParser_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_opName_2_0 = null;

        EObject lv_rightExpr_3_0 = null;


        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1624:2: ( () ( (lv_opName_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpr_3_0= ruleMatchingExpression ) ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1624:2: () ( (lv_opName_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightExpr_3_0= ruleMatchingExpression ) )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1624:2: ()
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1625:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1633:2: ( (lv_opName_2_0= ruleMultiplicativeOperator ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1634:1: (lv_opName_2_0= ruleMultiplicativeOperator )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1634:1: (lv_opName_2_0= ruleMultiplicativeOperator )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1635:3: lv_opName_2_0= ruleMultiplicativeOperator
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOpNameMultiplicativeOperatorParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleMultiplicativeOperator_in_synpred38_InternalPPParser3539);
        lv_opName_2_0=ruleMultiplicativeOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1651:2: ( (lv_rightExpr_3_0= ruleMatchingExpression ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1652:1: (lv_rightExpr_3_0= ruleMatchingExpression )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1652:1: (lv_rightExpr_3_0= ruleMatchingExpression )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1653:3: lv_rightExpr_3_0= ruleMatchingExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightExprMatchingExpressionParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleMatchingExpression_in_synpred38_InternalPPParser3560);
        lv_rightExpr_3_0=ruleMatchingExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred38_InternalPPParser

    // $ANTLR start synpred40_InternalPPParser
    public final void synpred40_InternalPPParser_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_opName_2_0 = null;

        EObject lv_rightExpr_3_0 = null;


        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1737:2: ( () ( (lv_opName_2_0= ruleMatchingOperator ) ) ( (lv_rightExpr_3_0= ruleLiteralRegex ) ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1737:2: () ( (lv_opName_2_0= ruleMatchingOperator ) ) ( (lv_rightExpr_3_0= ruleLiteralRegex ) )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1737:2: ()
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1738:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1746:2: ( (lv_opName_2_0= ruleMatchingOperator ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1747:1: (lv_opName_2_0= ruleMatchingOperator )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1747:1: (lv_opName_2_0= ruleMatchingOperator )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1748:3: lv_opName_2_0= ruleMatchingOperator
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getMatchingExpressionAccess().getOpNameMatchingOperatorParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleMatchingOperator_in_synpred40_InternalPPParser3798);
        lv_opName_2_0=ruleMatchingOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1764:2: ( (lv_rightExpr_3_0= ruleLiteralRegex ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1765:1: (lv_rightExpr_3_0= ruleLiteralRegex )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1765:1: (lv_rightExpr_3_0= ruleLiteralRegex )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1766:3: lv_rightExpr_3_0= ruleLiteralRegex
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getMatchingExpressionAccess().getRightExprLiteralRegexParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleLiteralRegex_in_synpred40_InternalPPParser3819);
        lv_rightExpr_3_0=ruleLiteralRegex();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred40_InternalPPParser

    // $ANTLR start synpred41_InternalPPParser
    public final void synpred41_InternalPPParser_fragment() throws RecognitionException {   
        Token lv_opName_2_0=null;
        EObject lv_rightExpr_3_0 = null;


        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1815:2: ( () ( (lv_opName_2_0= KEYWORD_43 ) ) ( (lv_rightExpr_3_0= ruleUnaryOrHigherExpression ) ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1815:2: () ( (lv_opName_2_0= KEYWORD_43 ) ) ( (lv_rightExpr_3_0= ruleUnaryOrHigherExpression ) )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1815:2: ()
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1816:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1824:2: ( (lv_opName_2_0= KEYWORD_43 ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1825:1: (lv_opName_2_0= KEYWORD_43 )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1825:1: (lv_opName_2_0= KEYWORD_43 )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1826:3: lv_opName_2_0= KEYWORD_43
        {
        lv_opName_2_0=(Token)match(input,KEYWORD_43,FOLLOW_KEYWORD_43_in_synpred41_InternalPPParser3947); if (state.failed) return ;

        }


        }

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1840:2: ( (lv_rightExpr_3_0= ruleUnaryOrHigherExpression ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1841:1: (lv_rightExpr_3_0= ruleUnaryOrHigherExpression )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1841:1: (lv_rightExpr_3_0= ruleUnaryOrHigherExpression )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:1842:3: lv_rightExpr_3_0= ruleUnaryOrHigherExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getInExpressionAccess().getRightExprUnaryOrHigherExpressionParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleUnaryOrHigherExpression_in_synpred41_InternalPPParser3979);
        lv_rightExpr_3_0=ruleUnaryOrHigherExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred41_InternalPPParser

    // $ANTLR start synpred45_InternalPPParser
    public final void synpred45_InternalPPParser_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_attributes_4_0 = null;


        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2066:2: (otherlv_3= KEYWORD_20 ( (lv_attributes_4_0= ruleAttributeOperations ) )? otherlv_5= KEYWORD_21 )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2066:2: otherlv_3= KEYWORD_20 ( (lv_attributes_4_0= ruleAttributeOperations ) )? otherlv_5= KEYWORD_21
        {
        otherlv_3=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_synpred45_InternalPPParser4483); if (state.failed) return ;
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2070:1: ( (lv_attributes_4_0= ruleAttributeOperations ) )?
        int alt119=2;
        int LA119_0 = input.LA(1);

        if ( (LA119_0==RULE_WORD_CHARS) ) {
            alt119=1;
        }
        switch (alt119) {
            case 1 :
                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2071:1: (lv_attributes_4_0= ruleAttributeOperations )
                {
                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2071:1: (lv_attributes_4_0= ruleAttributeOperations )
                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2072:3: lv_attributes_4_0= ruleAttributeOperations
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getCollectExpressionAccess().getAttributesAttributeOperationsParserRuleCall_1_2_1_0()); 
                  	    
                }
                pushFollow(FOLLOW_ruleAttributeOperations_in_synpred45_InternalPPParser4503);
                lv_attributes_4_0=ruleAttributeOperations();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;

        }

        otherlv_5=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_synpred45_InternalPPParser4517); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred45_InternalPPParser

    // $ANTLR start synpred46_InternalPPParser
    public final void synpred46_InternalPPParser_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_query_2_0 = null;

        EObject lv_attributes_4_0 = null;


        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2038:2: ( () ( (lv_query_2_0= ruleCollectQuery ) ) (otherlv_3= KEYWORD_20 ( (lv_attributes_4_0= ruleAttributeOperations ) )? otherlv_5= KEYWORD_21 )? )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2038:2: () ( (lv_query_2_0= ruleCollectQuery ) ) (otherlv_3= KEYWORD_20 ( (lv_attributes_4_0= ruleAttributeOperations ) )? otherlv_5= KEYWORD_21 )?
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2038:2: ()
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2039:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2047:2: ( (lv_query_2_0= ruleCollectQuery ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2048:1: (lv_query_2_0= ruleCollectQuery )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2048:1: (lv_query_2_0= ruleCollectQuery )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2049:3: lv_query_2_0= ruleCollectQuery
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCollectExpressionAccess().getQueryCollectQueryParserRuleCall_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleCollectQuery_in_synpred46_InternalPPParser4469);
        lv_query_2_0=ruleCollectQuery();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2065:2: (otherlv_3= KEYWORD_20 ( (lv_attributes_4_0= ruleAttributeOperations ) )? otherlv_5= KEYWORD_21 )?
        int alt121=2;
        int LA121_0 = input.LA(1);

        if ( (LA121_0==KEYWORD_20) ) {
            alt121=1;
        }
        switch (alt121) {
            case 1 :
                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2066:2: otherlv_3= KEYWORD_20 ( (lv_attributes_4_0= ruleAttributeOperations ) )? otherlv_5= KEYWORD_21
                {
                otherlv_3=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_synpred46_InternalPPParser4483); if (state.failed) return ;
                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2070:1: ( (lv_attributes_4_0= ruleAttributeOperations ) )?
                int alt120=2;
                int LA120_0 = input.LA(1);

                if ( (LA120_0==RULE_WORD_CHARS) ) {
                    alt120=1;
                }
                switch (alt120) {
                    case 1 :
                        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2071:1: (lv_attributes_4_0= ruleAttributeOperations )
                        {
                        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2071:1: (lv_attributes_4_0= ruleAttributeOperations )
                        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2072:3: lv_attributes_4_0= ruleAttributeOperations
                        {
                        if ( state.backtracking==0 ) {
                           
                          	        newCompositeNode(grammarAccess.getCollectExpressionAccess().getAttributesAttributeOperationsParserRuleCall_1_2_1_0()); 
                          	    
                        }
                        pushFollow(FOLLOW_ruleAttributeOperations_in_synpred46_InternalPPParser4503);
                        lv_attributes_4_0=ruleAttributeOperations();

                        state._fsp--;
                        if (state.failed) return ;

                        }


                        }
                        break;

                }

                otherlv_5=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_synpred46_InternalPPParser4517); if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred46_InternalPPParser

    // $ANTLR start synpred52_InternalPPParser
    public final void synpred52_InternalPPParser_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;


        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2302:2: ( (otherlv_3= KEYWORD_20 ( (lv_parameters_4_0= ruleSelectorEntry ) ) (otherlv_5= KEYWORD_8 ( (lv_parameters_6_0= ruleSelectorEntry ) ) )* ( ruleendComma )? otherlv_8= KEYWORD_21 ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2302:2: (otherlv_3= KEYWORD_20 ( (lv_parameters_4_0= ruleSelectorEntry ) ) (otherlv_5= KEYWORD_8 ( (lv_parameters_6_0= ruleSelectorEntry ) ) )* ( ruleendComma )? otherlv_8= KEYWORD_21 )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2302:2: (otherlv_3= KEYWORD_20 ( (lv_parameters_4_0= ruleSelectorEntry ) ) (otherlv_5= KEYWORD_8 ( (lv_parameters_6_0= ruleSelectorEntry ) ) )* ( ruleendComma )? otherlv_8= KEYWORD_21 )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2303:2: otherlv_3= KEYWORD_20 ( (lv_parameters_4_0= ruleSelectorEntry ) ) (otherlv_5= KEYWORD_8 ( (lv_parameters_6_0= ruleSelectorEntry ) ) )* ( ruleendComma )? otherlv_8= KEYWORD_21
        {
        otherlv_3=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_synpred52_InternalPPParser5034); if (state.failed) return ;
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2307:1: ( (lv_parameters_4_0= ruleSelectorEntry ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2308:1: (lv_parameters_4_0= ruleSelectorEntry )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2308:1: (lv_parameters_4_0= ruleSelectorEntry )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2309:3: lv_parameters_4_0= ruleSelectorEntry
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSelectorExpressionAccess().getParametersSelectorEntryParserRuleCall_1_2_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleSelectorEntry_in_synpred52_InternalPPParser5054);
        lv_parameters_4_0=ruleSelectorEntry();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2325:2: (otherlv_5= KEYWORD_8 ( (lv_parameters_6_0= ruleSelectorEntry ) ) )*
        loop122:
        do {
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==KEYWORD_8) ) {
                int LA122_1 = input.LA(2);

                if ( ((LA122_1>=KEYWORD_61 && LA122_1<=KEYWORD_55)||(LA122_1>=KEYWORD_57 && LA122_1<=KEYWORD_51)||(LA122_1>=KEYWORD_53 && LA122_1<=KEYWORD_54)||LA122_1==KEYWORD_24||LA122_1==KEYWORD_42||(LA122_1>=KEYWORD_1 && LA122_1<=KEYWORD_4)||LA122_1==KEYWORD_9||(LA122_1>=KEYWORD_17 && LA122_1<=KEYWORD_18)||LA122_1==KEYWORD_20||(LA122_1>=RULE_DOLLAR_VAR && LA122_1<=RULE_WORD_CHARS)||LA122_1==RULE_REGULAR_EXPRESSION) ) {
                    alt122=1;
                }


            }


            switch (alt122) {
        	case 1 :
        	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2326:2: otherlv_5= KEYWORD_8 ( (lv_parameters_6_0= ruleSelectorEntry ) )
        	    {
        	    otherlv_5=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_synpred52_InternalPPParser5068); if (state.failed) return ;
        	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2330:1: ( (lv_parameters_6_0= ruleSelectorEntry ) )
        	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2331:1: (lv_parameters_6_0= ruleSelectorEntry )
        	    {
        	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2331:1: (lv_parameters_6_0= ruleSelectorEntry )
        	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2332:3: lv_parameters_6_0= ruleSelectorEntry
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getSelectorExpressionAccess().getParametersSelectorEntryParserRuleCall_1_2_0_2_1_0()); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_ruleSelectorEntry_in_synpred52_InternalPPParser5088);
        	    lv_parameters_6_0=ruleSelectorEntry();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop122;
            }
        } while (true);

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2348:4: ( ruleendComma )?
        int alt123=2;
        int LA123_0 = input.LA(1);

        if ( (LA123_0==KEYWORD_8) ) {
            alt123=1;
        }
        switch (alt123) {
            case 1 :
                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2349:2: ruleendComma
                {
                pushFollow(FOLLOW_ruleendComma_in_synpred52_InternalPPParser5110);
                ruleendComma();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        otherlv_8=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_synpred52_InternalPPParser5124); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred52_InternalPPParser

    // $ANTLR start synpred54_InternalPPParser
    public final void synpred54_InternalPPParser_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_rightExpr_3_0 = null;


        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2416:2: ( () otherlv_2= KEYWORD_34 ( (lv_rightExpr_3_0= ruleExpression ) ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2416:2: () otherlv_2= KEYWORD_34 ( (lv_rightExpr_3_0= ruleExpression ) )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2416:2: ()
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2417:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        otherlv_2=(Token)match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_synpred54_InternalPPParser5274); if (state.failed) return ;
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2430:1: ( (lv_rightExpr_3_0= ruleExpression ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2431:1: (lv_rightExpr_3_0= ruleExpression )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2431:1: (lv_rightExpr_3_0= ruleExpression )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2432:3: lv_rightExpr_3_0= ruleExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSelectorEntryAccess().getRightExprExpressionParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred54_InternalPPParser5294);
        lv_rightExpr_3_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred54_InternalPPParser

    // $ANTLR start synpred57_InternalPPParser
    public final void synpred57_InternalPPParser_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;


        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2481:2: ( () otherlv_2= KEYWORD_18 ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* )? otherlv_6= KEYWORD_19 )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2481:2: () otherlv_2= KEYWORD_18 ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* )? otherlv_6= KEYWORD_19
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2481:2: ()
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2482:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        otherlv_2=(Token)match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_synpred57_InternalPPParser5416); if (state.failed) return ;
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2495:1: ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* )?
        int alt129=2;
        int LA129_0 = input.LA(1);

        if ( ((LA129_0>=KEYWORD_61 && LA129_0<=KEYWORD_55)||(LA129_0>=KEYWORD_57 && LA129_0<=KEYWORD_51)||(LA129_0>=KEYWORD_53 && LA129_0<=KEYWORD_54)||LA129_0==KEYWORD_24||LA129_0==KEYWORD_42||(LA129_0>=KEYWORD_1 && LA129_0<=KEYWORD_4)||LA129_0==KEYWORD_9||(LA129_0>=KEYWORD_17 && LA129_0<=KEYWORD_18)||LA129_0==KEYWORD_20||(LA129_0>=RULE_DOLLAR_VAR && LA129_0<=RULE_WORD_CHARS)||LA129_0==RULE_REGULAR_EXPRESSION) ) {
            alt129=1;
        }
        switch (alt129) {
            case 1 :
                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2495:2: ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )*
                {
                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2495:2: ( (lv_parameters_3_0= ruleExpression ) )
                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2496:1: (lv_parameters_3_0= ruleExpression )
                {
                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2496:1: (lv_parameters_3_0= ruleExpression )
                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2497:3: lv_parameters_3_0= ruleExpression
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getAtExpressionAccess().getParametersExpressionParserRuleCall_1_2_0_0()); 
                  	    
                }
                pushFollow(FOLLOW_ruleExpression_in_synpred57_InternalPPParser5437);
                lv_parameters_3_0=ruleExpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2513:2: (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )*
                loop128:
                do {
                    int alt128=2;
                    int LA128_0 = input.LA(1);

                    if ( (LA128_0==KEYWORD_8) ) {
                        alt128=1;
                    }


                    switch (alt128) {
                	case 1 :
                	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2514:2: otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) )
                	    {
                	    otherlv_4=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_synpred57_InternalPPParser5451); if (state.failed) return ;
                	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2518:1: ( (lv_parameters_5_0= ruleExpression ) )
                	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2519:1: (lv_parameters_5_0= ruleExpression )
                	    {
                	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2519:1: (lv_parameters_5_0= ruleExpression )
                	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2520:3: lv_parameters_5_0= ruleExpression
                	    {
                	    if ( state.backtracking==0 ) {
                	       
                	      	        newCompositeNode(grammarAccess.getAtExpressionAccess().getParametersExpressionParserRuleCall_1_2_1_1_0()); 
                	      	    
                	    }
                	    pushFollow(FOLLOW_ruleExpression_in_synpred57_InternalPPParser5471);
                	    lv_parameters_5_0=ruleExpression();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop128;
                    }
                } while (true);


                }
                break;

        }

        otherlv_6=(Token)match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_synpred57_InternalPPParser5488); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_InternalPPParser

    // $ANTLR start synpred61_InternalPPParser
    public final void synpred61_InternalPPParser_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;


        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2574:2: ( () otherlv_2= KEYWORD_4 ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* ( ruleendComma )? )? otherlv_7= KEYWORD_5 )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2574:2: () otherlv_2= KEYWORD_4 ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* ( ruleendComma )? )? otherlv_7= KEYWORD_5
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2574:2: ()
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2575:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        otherlv_2=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_synpred61_InternalPPParser5609); if (state.failed) return ;
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2588:1: ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* ( ruleendComma )? )?
        int alt134=2;
        int LA134_0 = input.LA(1);

        if ( ((LA134_0>=KEYWORD_61 && LA134_0<=KEYWORD_55)||(LA134_0>=KEYWORD_57 && LA134_0<=KEYWORD_51)||(LA134_0>=KEYWORD_53 && LA134_0<=KEYWORD_54)||LA134_0==KEYWORD_24||LA134_0==KEYWORD_42||(LA134_0>=KEYWORD_1 && LA134_0<=KEYWORD_4)||LA134_0==KEYWORD_9||(LA134_0>=KEYWORD_17 && LA134_0<=KEYWORD_18)||LA134_0==KEYWORD_20||(LA134_0>=RULE_DOLLAR_VAR && LA134_0<=RULE_WORD_CHARS)||LA134_0==RULE_REGULAR_EXPRESSION) ) {
            alt134=1;
        }
        switch (alt134) {
            case 1 :
                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2588:2: ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* ( ruleendComma )?
                {
                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2588:2: ( (lv_parameters_3_0= ruleExpression ) )
                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2589:1: (lv_parameters_3_0= ruleExpression )
                {
                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2589:1: (lv_parameters_3_0= ruleExpression )
                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2590:3: lv_parameters_3_0= ruleExpression
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersExpressionParserRuleCall_1_2_0_0()); 
                  	    
                }
                pushFollow(FOLLOW_ruleExpression_in_synpred61_InternalPPParser5630);
                lv_parameters_3_0=ruleExpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2606:2: (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )*
                loop132:
                do {
                    int alt132=2;
                    int LA132_0 = input.LA(1);

                    if ( (LA132_0==KEYWORD_8) ) {
                        int LA132_1 = input.LA(2);

                        if ( ((LA132_1>=KEYWORD_61 && LA132_1<=KEYWORD_55)||(LA132_1>=KEYWORD_57 && LA132_1<=KEYWORD_51)||(LA132_1>=KEYWORD_53 && LA132_1<=KEYWORD_54)||LA132_1==KEYWORD_24||LA132_1==KEYWORD_42||(LA132_1>=KEYWORD_1 && LA132_1<=KEYWORD_4)||LA132_1==KEYWORD_9||(LA132_1>=KEYWORD_17 && LA132_1<=KEYWORD_18)||LA132_1==KEYWORD_20||(LA132_1>=RULE_DOLLAR_VAR && LA132_1<=RULE_WORD_CHARS)||LA132_1==RULE_REGULAR_EXPRESSION) ) {
                            alt132=1;
                        }


                    }


                    switch (alt132) {
                	case 1 :
                	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2607:2: otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) )
                	    {
                	    otherlv_4=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_synpred61_InternalPPParser5644); if (state.failed) return ;
                	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2611:1: ( (lv_parameters_5_0= ruleExpression ) )
                	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2612:1: (lv_parameters_5_0= ruleExpression )
                	    {
                	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2612:1: (lv_parameters_5_0= ruleExpression )
                	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2613:3: lv_parameters_5_0= ruleExpression
                	    {
                	    if ( state.backtracking==0 ) {
                	       
                	      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersExpressionParserRuleCall_1_2_1_1_0()); 
                	      	    
                	    }
                	    pushFollow(FOLLOW_ruleExpression_in_synpred61_InternalPPParser5664);
                	    lv_parameters_5_0=ruleExpression();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop132;
                    }
                } while (true);

                // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2629:4: ( ruleendComma )?
                int alt133=2;
                int LA133_0 = input.LA(1);

                if ( (LA133_0==KEYWORD_8) ) {
                    alt133=1;
                }
                switch (alt133) {
                    case 1 :
                        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:2630:2: ruleendComma
                        {
                        pushFollow(FOLLOW_ruleendComma_in_synpred61_InternalPPParser5686);
                        ruleendComma();

                        state._fsp--;
                        if (state.failed) return ;

                        }
                        break;

                }


                }
                break;

        }

        otherlv_7=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_synpred61_InternalPPParser5702); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred61_InternalPPParser

    // $ANTLR start synpred113_InternalPPParser
    public final void synpred113_InternalPPParser_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        EObject lv_values_4_0 = null;


        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4314:2: (otherlv_3= KEYWORD_8 ( (lv_values_4_0= ruleQuotedString ) ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4314:2: otherlv_3= KEYWORD_8 ( (lv_values_4_0= ruleQuotedString ) )
        {
        otherlv_3=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_synpred113_InternalPPParser9323); if (state.failed) return ;
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4318:1: ( (lv_values_4_0= ruleQuotedString ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4319:1: (lv_values_4_0= ruleQuotedString )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4319:1: (lv_values_4_0= ruleQuotedString )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4320:3: lv_values_4_0= ruleQuotedString
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getImportExpressionAccess().getValuesQuotedStringParserRuleCall_2_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleQuotedString_in_synpred113_InternalPPParser9343);
        lv_values_4_0=ruleQuotedString();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred113_InternalPPParser

    // $ANTLR start synpred114_InternalPPParser
    public final void synpred114_InternalPPParser_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;


        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4295:2: ( ( (lv_values_2_0= ruleQuotedString ) ) (otherlv_3= KEYWORD_8 ( (lv_values_4_0= ruleQuotedString ) ) )* )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4295:2: ( (lv_values_2_0= ruleQuotedString ) ) (otherlv_3= KEYWORD_8 ( (lv_values_4_0= ruleQuotedString ) ) )*
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4295:2: ( (lv_values_2_0= ruleQuotedString ) )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4296:1: (lv_values_2_0= ruleQuotedString )
        {
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4296:1: (lv_values_2_0= ruleQuotedString )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4297:3: lv_values_2_0= ruleQuotedString
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getImportExpressionAccess().getValuesQuotedStringParserRuleCall_2_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleQuotedString_in_synpred114_InternalPPParser9309);
        lv_values_2_0=ruleQuotedString();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4313:2: (otherlv_3= KEYWORD_8 ( (lv_values_4_0= ruleQuotedString ) ) )*
        loop137:
        do {
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==KEYWORD_8) ) {
                alt137=1;
            }


            switch (alt137) {
        	case 1 :
        	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4314:2: otherlv_3= KEYWORD_8 ( (lv_values_4_0= ruleQuotedString ) )
        	    {
        	    otherlv_3=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_synpred114_InternalPPParser9323); if (state.failed) return ;
        	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4318:1: ( (lv_values_4_0= ruleQuotedString ) )
        	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4319:1: (lv_values_4_0= ruleQuotedString )
        	    {
        	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4319:1: (lv_values_4_0= ruleQuotedString )
        	    // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:4320:3: lv_values_4_0= ruleQuotedString
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getImportExpressionAccess().getValuesQuotedStringParserRuleCall_2_1_1_0()); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_ruleQuotedString_in_synpred114_InternalPPParser9343);
        	    lv_values_4_0=ruleQuotedString();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop137;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred114_InternalPPParser

    // $ANTLR start synpred135_InternalPPParser
    public final void synpred135_InternalPPParser_fragment() throws RecognitionException {   
        Token this_WORD_CHARS_0=null;

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5644:6: (this_WORD_CHARS_0= RULE_WORD_CHARS )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5644:6: this_WORD_CHARS_0= RULE_WORD_CHARS
        {
        this_WORD_CHARS_0=(Token)match(input,RULE_WORD_CHARS,FOLLOW_RULE_WORD_CHARS_in_synpred135_InternalPPParser12443); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred135_InternalPPParser

    // $ANTLR start synpred136_InternalPPParser
    public final void synpred136_InternalPPParser_fragment() throws RecognitionException {   
        Token this_ANY_OTHER_1=null;

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5652:10: (this_ANY_OTHER_1= RULE_ANY_OTHER )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5652:10: this_ANY_OTHER_1= RULE_ANY_OTHER
        {
        this_ANY_OTHER_1=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_synpred136_InternalPPParser12469); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred136_InternalPPParser

    // $ANTLR start synpred137_InternalPPParser
    public final void synpred137_InternalPPParser_fragment() throws RecognitionException {   
        Token this_WS_2=null;

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5660:10: (this_WS_2= RULE_WS )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5660:10: this_WS_2= RULE_WS
        {
        this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_synpred137_InternalPPParser12495); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred137_InternalPPParser

    // $ANTLR start synpred138_InternalPPParser
    public final void synpred138_InternalPPParser_fragment() throws RecognitionException {   
        Token kw=null;

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5669:2: (kw= KEYWORD_38 )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5669:2: kw= KEYWORD_38
        {
        kw=(Token)match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_synpred138_InternalPPParser12519); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred138_InternalPPParser

    // $ANTLR start synpred139_InternalPPParser
    public final void synpred139_InternalPPParser_fragment() throws RecognitionException {   
        Token kw=null;

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5676:2: (kw= KEYWORD_40 )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5676:2: kw= KEYWORD_40
        {
        kw=(Token)match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_synpred139_InternalPPParser12538); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred139_InternalPPParser

    // $ANTLR start synpred140_InternalPPParser
    public final void synpred140_InternalPPParser_fragment() throws RecognitionException {   
        Token kw=null;

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5683:2: (kw= KEYWORD_39 )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5683:2: kw= KEYWORD_39
        {
        kw=(Token)match(input,KEYWORD_39,FOLLOW_KEYWORD_39_in_synpred140_InternalPPParser12557); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred140_InternalPPParser

    // $ANTLR start synpred141_InternalPPParser
    public final void synpred141_InternalPPParser_fragment() throws RecognitionException {   
        Token kw=null;

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5690:2: (kw= KEYWORD_48 )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5690:2: kw= KEYWORD_48
        {
        kw=(Token)match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_synpred141_InternalPPParser12576); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred141_InternalPPParser

    // $ANTLR start synpred142_InternalPPParser
    public final void synpred142_InternalPPParser_fragment() throws RecognitionException {   
        Token kw=null;

        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5697:2: (kw= KEYWORD_41 )
        // ../org.cloudsmith.geppetto.pp.dsl/src-gen/org/cloudsmith/geppetto/pp/dsl/parser/antlr/internal/InternalPPParser.g:5697:2: kw= KEYWORD_41
        {
        kw=(Token)match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_synpred142_InternalPPParser12595); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred142_InternalPPParser

    // Delegated rules

    public final boolean synpred24_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred142_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred142_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred45_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred137_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred137_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred135_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred135_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred141_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred141_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred139_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred139_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred61_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred114_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred114_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred54_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred46_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred140_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred140_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred113_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred113_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred138_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred138_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred57_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred136_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred136_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalPPParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalPPParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA39 dfa39 = new DFA39(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA85 dfa85 = new DFA85(this);
    protected DFA84 dfa84 = new DFA84(this);
    protected DFA103 dfa103 = new DFA103(this);
    static final String DFA39_eotS =
        "\72\uffff";
    static final String DFA39_eofS =
        "\1\2\71\uffff";
    static final String DFA39_minS =
        "\1\5\1\0\70\uffff";
    static final String DFA39_maxS =
        "\1\111\1\0\70\uffff";
    static final String DFA39_acceptS =
        "\2\uffff\1\2\66\uffff\1\1";
    static final String DFA39_specialS =
        "\1\uffff\1\0\70\uffff}>";
    static final String[] DFA39_transitionS = {
            "\4\2\1\uffff\3\2\1\uffff\3\2\1\uffff\6\2\1\uffff\13\2\4\uffff"+
            "\24\2\1\uffff\3\2\1\1\1\2\3\uffff\2\2\2\uffff\1\2",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "2065:2: (otherlv_3= KEYWORD_20 ( (lv_attributes_4_0= ruleAttributeOperations ) )? otherlv_5= KEYWORD_21 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA39_1 = input.LA(1);

                         
                        int index39_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalPPParser()) ) {s = 57;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index39_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 39, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA46_eotS =
        "\30\uffff";
    static final String DFA46_eofS =
        "\30\uffff";
    static final String DFA46_minS =
        "\1\5\1\0\26\uffff";
    static final String DFA46_maxS =
        "\1\111\1\0\26\uffff";
    static final String DFA46_acceptS =
        "\2\uffff\1\2\24\uffff\1\1";
    static final String DFA46_specialS =
        "\1\uffff\1\0\26\uffff}>";
    static final String[] DFA46_transitionS = {
            "\4\2\1\uffff\3\2\1\uffff\2\2\6\uffff\1\2\21\uffff\1\2\4\uffff"+
            "\4\2\4\uffff\1\2\7\uffff\2\2\1\uffff\1\1\4\uffff\2\2\2\uffff"+
            "\1\2",
            "\1\uffff",
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
            "",
            ""
    };

    static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
    static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
    static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
    static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
    static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
    static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
    static final short[][] DFA46_transition;

    static {
        int numStates = DFA46_transitionS.length;
        DFA46_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = DFA46_eot;
            this.eof = DFA46_eof;
            this.min = DFA46_min;
            this.max = DFA46_max;
            this.accept = DFA46_accept;
            this.special = DFA46_special;
            this.transition = DFA46_transition;
        }
        public String getDescription() {
            return "2302:1: ( (otherlv_3= KEYWORD_20 ( (lv_parameters_4_0= ruleSelectorEntry ) ) (otherlv_5= KEYWORD_8 ( (lv_parameters_6_0= ruleSelectorEntry ) ) )* ( ruleendComma )? otherlv_8= KEYWORD_21 ) | ( (lv_parameters_9_0= ruleSelectorEntry ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA46_1 = input.LA(1);

                         
                        int index46_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred52_InternalPPParser()) ) {s = 23;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index46_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 46, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA51_eotS =
        "\73\uffff";
    static final String DFA51_eofS =
        "\1\1\72\uffff";
    static final String DFA51_minS =
        "\1\5\62\uffff\1\0\7\uffff";
    static final String DFA51_maxS =
        "\1\111\62\uffff\1\0\7\uffff";
    static final String DFA51_acceptS =
        "\1\uffff\1\2\70\uffff\1\1";
    static final String DFA51_specialS =
        "\63\uffff\1\0\7\uffff}>";
    static final String[] DFA51_transitionS = {
            "\4\1\1\uffff\3\1\1\uffff\3\1\1\uffff\6\1\1\uffff\13\1\4\uffff"+
            "\26\1\1\63\3\1\3\uffff\2\1\2\uffff\1\1",
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
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA51_eot = DFA.unpackEncodedString(DFA51_eotS);
    static final short[] DFA51_eof = DFA.unpackEncodedString(DFA51_eofS);
    static final char[] DFA51_min = DFA.unpackEncodedStringToUnsignedChars(DFA51_minS);
    static final char[] DFA51_max = DFA.unpackEncodedStringToUnsignedChars(DFA51_maxS);
    static final short[] DFA51_accept = DFA.unpackEncodedString(DFA51_acceptS);
    static final short[] DFA51_special = DFA.unpackEncodedString(DFA51_specialS);
    static final short[][] DFA51_transition;

    static {
        int numStates = DFA51_transitionS.length;
        DFA51_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA51_transition[i] = DFA.unpackEncodedString(DFA51_transitionS[i]);
        }
    }

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = DFA51_eot;
            this.eof = DFA51_eof;
            this.min = DFA51_min;
            this.max = DFA51_max;
            this.accept = DFA51_accept;
            this.special = DFA51_special;
            this.transition = DFA51_transition;
        }
        public String getDescription() {
            return "()* loopback of 2481:1: ( () otherlv_2= KEYWORD_18 ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* )? otherlv_6= KEYWORD_19 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA51_51 = input.LA(1);

                         
                        int index51_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_InternalPPParser()) ) {s = 58;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index51_51);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 51, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA55_eotS =
        "\73\uffff";
    static final String DFA55_eofS =
        "\1\2\72\uffff";
    static final String DFA55_minS =
        "\1\5\1\0\71\uffff";
    static final String DFA55_maxS =
        "\1\111\1\0\71\uffff";
    static final String DFA55_acceptS =
        "\2\uffff\1\2\67\uffff\1\1";
    static final String DFA55_specialS =
        "\1\uffff\1\0\71\uffff}>";
    static final String[] DFA55_transitionS = {
            "\4\2\1\uffff\3\2\1\uffff\3\2\1\uffff\6\2\1\uffff\13\2\4\uffff"+
            "\10\2\1\1\21\2\3\uffff\2\2\2\uffff\1\2",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA55_eot = DFA.unpackEncodedString(DFA55_eotS);
    static final short[] DFA55_eof = DFA.unpackEncodedString(DFA55_eofS);
    static final char[] DFA55_min = DFA.unpackEncodedStringToUnsignedChars(DFA55_minS);
    static final char[] DFA55_max = DFA.unpackEncodedStringToUnsignedChars(DFA55_maxS);
    static final short[] DFA55_accept = DFA.unpackEncodedString(DFA55_acceptS);
    static final short[] DFA55_special = DFA.unpackEncodedString(DFA55_specialS);
    static final short[][] DFA55_transition;

    static {
        int numStates = DFA55_transitionS.length;
        DFA55_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA55_transition[i] = DFA.unpackEncodedString(DFA55_transitionS[i]);
        }
    }

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = DFA55_eot;
            this.eof = DFA55_eof;
            this.min = DFA55_min;
            this.max = DFA55_max;
            this.accept = DFA55_accept;
            this.special = DFA55_special;
            this.transition = DFA55_transition;
        }
        public String getDescription() {
            return "2574:1: ( () otherlv_2= KEYWORD_4 ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= KEYWORD_8 ( (lv_parameters_5_0= ruleExpression ) ) )* ( ruleendComma )? )? otherlv_7= KEYWORD_5 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA55_1 = input.LA(1);

                         
                        int index55_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_InternalPPParser()) ) {s = 58;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index55_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 55, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA85_eotS =
        "\73\uffff";
    static final String DFA85_eofS =
        "\1\3\72\uffff";
    static final String DFA85_minS =
        "\1\5\2\0\70\uffff";
    static final String DFA85_maxS =
        "\1\111\2\0\70\uffff";
    static final String DFA85_acceptS =
        "\3\uffff\1\2\66\uffff\1\1";
    static final String DFA85_specialS =
        "\1\uffff\1\0\1\1\70\uffff}>";
    static final String[] DFA85_transitionS = {
            "\4\3\1\uffff\3\3\1\uffff\3\3\1\uffff\6\3\1\uffff\13\3\4\uffff"+
            "\6\3\1\1\1\2\22\3\3\uffff\2\3\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA85_eot = DFA.unpackEncodedString(DFA85_eotS);
    static final short[] DFA85_eof = DFA.unpackEncodedString(DFA85_eofS);
    static final char[] DFA85_min = DFA.unpackEncodedStringToUnsignedChars(DFA85_minS);
    static final char[] DFA85_max = DFA.unpackEncodedStringToUnsignedChars(DFA85_maxS);
    static final short[] DFA85_accept = DFA.unpackEncodedString(DFA85_acceptS);
    static final short[] DFA85_special = DFA.unpackEncodedString(DFA85_specialS);
    static final short[][] DFA85_transition;

    static {
        int numStates = DFA85_transitionS.length;
        DFA85_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA85_transition[i] = DFA.unpackEncodedString(DFA85_transitionS[i]);
        }
    }

    class DFA85 extends DFA {

        public DFA85(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 85;
            this.eot = DFA85_eot;
            this.eof = DFA85_eof;
            this.min = DFA85_min;
            this.max = DFA85_max;
            this.accept = DFA85_accept;
            this.special = DFA85_special;
            this.transition = DFA85_transition;
        }
        public String getDescription() {
            return "4295:1: ( ( (lv_values_2_0= ruleQuotedString ) ) (otherlv_3= KEYWORD_8 ( (lv_values_4_0= ruleQuotedString ) ) )* )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA85_1 = input.LA(1);

                         
                        int index85_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred114_InternalPPParser()) ) {s = 58;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index85_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA85_2 = input.LA(1);

                         
                        int index85_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred114_InternalPPParser()) ) {s = 58;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index85_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 85, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA84_eotS =
        "\73\uffff";
    static final String DFA84_eofS =
        "\1\1\72\uffff";
    static final String DFA84_minS =
        "\1\5\37\uffff\1\0\32\uffff";
    static final String DFA84_maxS =
        "\1\111\37\uffff\1\0\32\uffff";
    static final String DFA84_acceptS =
        "\1\uffff\1\2\70\uffff\1\1";
    static final String DFA84_specialS =
        "\40\uffff\1\0\32\uffff}>";
    static final String[] DFA84_transitionS = {
            "\4\1\1\uffff\3\1\1\uffff\3\1\1\uffff\6\1\1\uffff\13\1\4\uffff"+
            "\14\1\1\40\15\1\3\uffff\2\1\2\uffff\1\1",
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
            "",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA84_eot = DFA.unpackEncodedString(DFA84_eotS);
    static final short[] DFA84_eof = DFA.unpackEncodedString(DFA84_eofS);
    static final char[] DFA84_min = DFA.unpackEncodedStringToUnsignedChars(DFA84_minS);
    static final char[] DFA84_max = DFA.unpackEncodedStringToUnsignedChars(DFA84_maxS);
    static final short[] DFA84_accept = DFA.unpackEncodedString(DFA84_acceptS);
    static final short[] DFA84_special = DFA.unpackEncodedString(DFA84_specialS);
    static final short[][] DFA84_transition;

    static {
        int numStates = DFA84_transitionS.length;
        DFA84_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA84_transition[i] = DFA.unpackEncodedString(DFA84_transitionS[i]);
        }
    }

    class DFA84 extends DFA {

        public DFA84(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 84;
            this.eot = DFA84_eot;
            this.eof = DFA84_eof;
            this.min = DFA84_min;
            this.max = DFA84_max;
            this.accept = DFA84_accept;
            this.special = DFA84_special;
            this.transition = DFA84_transition;
        }
        public String getDescription() {
            return "()* loopback of 4313:2: (otherlv_3= KEYWORD_8 ( (lv_values_4_0= ruleQuotedString ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA84_32 = input.LA(1);

                         
                        int index84_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_InternalPPParser()) ) {s = 58;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index84_32);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 84, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA103_eotS =
        "\22\uffff";
    static final String DFA103_eofS =
        "\1\1\21\uffff";
    static final String DFA103_minS =
        "\1\21\1\uffff\10\0\10\uffff";
    static final String DFA103_maxS =
        "\1\115\1\uffff\10\0\10\uffff";
    static final String DFA103_acceptS =
        "\1\uffff\1\11\10\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String DFA103_specialS =
        "\2\uffff\1\6\1\3\1\5\1\2\1\0\1\4\1\7\1\1\10\uffff}>";
    static final String[] DFA103_transitionS = {
            "\1\10\4\uffff\1\1\15\uffff\1\5\1\7\1\6\1\11\6\uffff\1\1\25\uffff"+
            "\1\4\1\1\1\2\6\uffff\1\3",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA103_eot = DFA.unpackEncodedString(DFA103_eotS);
    static final short[] DFA103_eof = DFA.unpackEncodedString(DFA103_eofS);
    static final char[] DFA103_min = DFA.unpackEncodedStringToUnsignedChars(DFA103_minS);
    static final char[] DFA103_max = DFA.unpackEncodedStringToUnsignedChars(DFA103_maxS);
    static final short[] DFA103_accept = DFA.unpackEncodedString(DFA103_acceptS);
    static final short[] DFA103_special = DFA.unpackEncodedString(DFA103_specialS);
    static final short[][] DFA103_transition;

    static {
        int numStates = DFA103_transitionS.length;
        DFA103_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA103_transition[i] = DFA.unpackEncodedString(DFA103_transitionS[i]);
        }
    }

    class DFA103 extends DFA {

        public DFA103(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 103;
            this.eot = DFA103_eot;
            this.eof = DFA103_eof;
            this.min = DFA103_min;
            this.max = DFA103_max;
            this.accept = DFA103_accept;
            this.special = DFA103_special;
            this.transition = DFA103_transition;
        }
        public String getDescription() {
            return "()+ loopback of 5644:1: (this_WORD_CHARS_0= RULE_WORD_CHARS | this_ANY_OTHER_1= RULE_ANY_OTHER | this_WS_2= RULE_WS | kw= KEYWORD_38 | kw= KEYWORD_40 | kw= KEYWORD_39 | kw= KEYWORD_48 | kw= KEYWORD_41 )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA103_6 = input.LA(1);

                         
                        int index103_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred139_InternalPPParser()) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index103_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA103_9 = input.LA(1);

                         
                        int index103_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred142_InternalPPParser()) ) {s = 17;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index103_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA103_5 = input.LA(1);

                         
                        int index103_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalPPParser()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index103_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA103_3 = input.LA(1);

                         
                        int index103_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred136_InternalPPParser()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index103_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA103_7 = input.LA(1);

                         
                        int index103_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred140_InternalPPParser()) ) {s = 15;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index103_7);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA103_4 = input.LA(1);

                         
                        int index103_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_InternalPPParser()) ) {s = 12;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index103_4);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA103_2 = input.LA(1);

                         
                        int index103_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred135_InternalPPParser()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index103_2);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA103_8 = input.LA(1);

                         
                        int index103_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred141_InternalPPParser()) ) {s = 16;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index103_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 103, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_rulePuppetManifest_in_entryRulePuppetManifest73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePuppetManifest83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionList_in_rulePuppetManifest141 = new BitSet(new long[]{0x6021E1000040DDE2L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationshipExpression_in_ruleExpression236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionList_in_entryRuleExpressionList269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionList279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationshipExpression_in_ruleExpressionList329 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleExpressionList354 = new BitSet(new long[]{0x6031E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleRelationshipExpression_in_ruleExpressionList374 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleExpressionList388 = new BitSet(new long[]{0x6031E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleRelationshipExpression_in_ruleExpressionList408 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleEdgeOperator_in_entryRuleEdgeOperator448 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEdgeOperator459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_27_in_ruleEdgeOperator497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleEdgeOperator516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_46_in_ruleEdgeOperator535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_32_in_ruleEdgeOperator554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationshipExpression_in_entryRuleRelationshipExpression593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationshipExpression603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceExpression_in_ruleRelationshipExpression653 = new BitSet(new long[]{0x0000100046000002L});
    public static final BitSet FOLLOW_ruleEdgeOperator_in_ruleRelationshipExpression686 = new BitSet(new long[]{0x6021F1004640DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleResourceExpression_in_ruleRelationshipExpression707 = new BitSet(new long[]{0x0000100046000002L});
    public static final BitSet FOLLOW_ruleResourceExpression_in_entryRuleResourceExpression744 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceExpression754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleResourceExpression805 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleResourceExpression830 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_ruleResourceBody_in_ruleResourceExpression851 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleResourceExpression865 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleResourceBody_in_ruleResourceExpression885 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleResourceExpression901 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleResourceExpression917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralClass_in_ruleResourceExpression959 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleResourceExpression972 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_ruleResourceBody_in_ruleResourceExpression993 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleResourceExpression1007 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleResourceBody_in_ruleResourceExpression1027 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleResourceExpression1043 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleResourceExpression1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceBody_in_entryRuleResourceBody1094 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceBody1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleResourceBody1151 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleResourceBody1164 = new BitSet(new long[]{0x6021E1000040DDE2L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleAttributeOperations_in_ruleResourceBody1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeOperations_in_ruleResourceBody1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeOperation_in_entryRuleAttributeOperation1248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeOperation1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulename_in_ruleAttributeOperation1316 = new BitSet(new long[]{0x0000000101000002L});
    public static final BitSet FOLLOW_KEYWORD_34_in_ruleAttributeOperation1338 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_KEYWORD_26_in_ruleAttributeOperation1366 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAttributeOperation1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeOperations_in_entryRuleAttributeOperations1438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeOperations1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeOperation_in_ruleAttributeOperations1494 = new BitSet(new long[]{0x6031E1000040DDE2L,0x0000000000000261L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleAttributeOperations1509 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleAttributeOperation_in_ruleAttributeOperations1529 = new BitSet(new long[]{0x6031E1000040DDE2L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleAttributeOperation_in_ruleAttributeOperations1557 = new BitSet(new long[]{0x6031E1000040DDE2L,0x0000000000000261L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleAttributeOperations1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleendComma_in_entryRuleendComma1610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleendComma1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleendComma1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression1696 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentExpression1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAppendExpression_in_ruleAssignmentExpression1756 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleAssignmentExpression1781 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleAppendExpression_in_ruleAssignmentExpression1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAppendExpression_in_entryRuleAppendExpression1838 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAppendExpression1848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleAppendExpression1898 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_KEYWORD_25_in_ruleAppendExpression1923 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleAppendExpression1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression1980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression2040 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleOrExpression2065 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression2085 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression2122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleAndExpression2182 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_KEYWORD_49_in_ruleAndExpression2207 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleAndExpression2227 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_entryRuleRelationalOperator2265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalOperator2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_36_in_ruleRelationalOperator2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_30_in_ruleRelationalOperator2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleRelationalOperator2352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleRelationalOperator2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression2410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalExpression2420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_ruleRelationalExpression2470 = new BitSet(new long[]{0x0A00000410000002L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_ruleRelationalExpression2503 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_ruleRelationalExpression2524 = new BitSet(new long[]{0x0A00000410000002L});
    public static final BitSet FOLLOW_ruleEqualityOperator_in_entryRuleEqualityOperator2562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualityOperator2573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_33_in_ruleEqualityOperator2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleEqualityOperator2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_entryRuleEqualityExpression2669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualityExpression2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleEqualityExpression2729 = new BitSet(new long[]{0x0000000080100002L});
    public static final BitSet FOLLOW_ruleEqualityOperator_in_ruleEqualityExpression2762 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_ruleEqualityExpression2783 = new BitSet(new long[]{0x0000000080100002L});
    public static final BitSet FOLLOW_ruleShiftOperator_in_entryRuleShiftOperator2821 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShiftOperator2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_29_in_ruleShiftOperator2870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_37_in_ruleShiftOperator2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression2928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShiftExpression2938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleShiftExpression2988 = new BitSet(new long[]{0x0000000808000002L});
    public static final BitSet FOLLOW_ruleShiftOperator_in_ruleShiftExpression3021 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleShiftExpression3042 = new BitSet(new long[]{0x0000000808000002L});
    public static final BitSet FOLLOW_ruleAdditiveOperator_in_entryRuleAdditiveOperator3080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveOperator3091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleAdditiveOperator3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleAdditiveOperator3148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression3187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression3197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression3247 = new BitSet(new long[]{0x0028000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveOperator_in_ruleAdditiveExpression3280 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression3301 = new BitSet(new long[]{0x0028000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeOperator_in_entryRuleMultiplicativeOperator3339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicativeOperator3350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleMultiplicativeOperator3388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleMultiplicativeOperator3407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression3446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicativeExpression3456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatchingExpression_in_ruleMultiplicativeExpression3506 = new BitSet(new long[]{0x0044000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeOperator_in_ruleMultiplicativeExpression3539 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleMatchingExpression_in_ruleMultiplicativeExpression3560 = new BitSet(new long[]{0x0044000000000002L});
    public static final BitSet FOLLOW_ruleMatchingOperator_in_entryRuleMatchingOperator3598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatchingOperator3609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_35_in_ruleMatchingOperator3647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_ruleMatchingOperator3666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatchingExpression_in_entryRuleMatchingExpression3705 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatchingExpression3715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInExpression_in_ruleMatchingExpression3765 = new BitSet(new long[]{0x0000000200200002L});
    public static final BitSet FOLLOW_ruleMatchingOperator_in_ruleMatchingExpression3798 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleLiteralRegex_in_ruleMatchingExpression3819 = new BitSet(new long[]{0x0000000200200002L});
    public static final BitSet FOLLOW_ruleInExpression_in_entryRuleInExpression3856 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInExpression3866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOrHigherExpression_in_ruleInExpression3916 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_KEYWORD_43_in_ruleInExpression3947 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleUnaryOrHigherExpression_in_ruleInExpression3979 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleUnaryOrHigherExpression_in_entryRuleUnaryOrHigherExpression4016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOrHigherExpression4026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryMinusExpression_in_ruleUnaryOrHigherExpression4076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_ruleUnaryOrHigherExpression4106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectExpression_in_ruleUnaryOrHigherExpression4136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryMinusExpression_in_entryRuleUnaryMinusExpression4170 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryMinusExpression4180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleUnaryMinusExpression4218 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleCollectExpression_in_ruleUnaryMinusExpression4238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_entryRuleNotExpression4273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotExpression4283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleNotExpression4321 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleCollectExpression_in_ruleNotExpression4341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectExpression_in_entryRuleCollectExpression4376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectExpression4386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectorExpression_in_ruleCollectExpression4436 = new BitSet(new long[]{0x0000000020010002L});
    public static final BitSet FOLLOW_ruleCollectQuery_in_ruleCollectExpression4469 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleCollectExpression4483 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_ruleAttributeOperations_in_ruleCollectExpression4503 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleCollectExpression4517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectQuery_in_entryRuleCollectQuery4555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectQuery4565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVirtualCollectQuery_in_ruleCollectQuery4615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExportedCollectQuery_in_ruleCollectQuery4645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVirtualCollectQuery_in_entryRuleVirtualCollectQuery4679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVirtualCollectQuery4689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_31_in_ruleVirtualCollectQuery4739 = new BitSet(new long[]{0x6021E9000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVirtualCollectQuery4759 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_KEYWORD_45_in_ruleVirtualCollectQuery4773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExportedCollectQuery_in_entryRuleExportedCollectQuery4807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExportedCollectQuery4817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_47_in_ruleExportedCollectQuery4867 = new BitSet(new long[]{0x6021E1000048DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExportedCollectQuery4887 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_KEYWORD_50_in_ruleExportedCollectQuery4901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectorExpression_in_entryRuleSelectorExpression4935 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectorExpression4945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtExpression_in_ruleSelectorExpression4995 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleSelectorExpression5020 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleSelectorExpression5034 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleSelectorEntry_in_ruleSelectorExpression5054 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleSelectorExpression5068 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleSelectorEntry_in_ruleSelectorExpression5088 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleendComma_in_ruleSelectorExpression5110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleSelectorExpression5124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectorEntry_in_ruleSelectorExpression5151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectorEntry_in_entryRuleSelectorEntry5189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectorEntry5199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSelectorEntry5249 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_KEYWORD_34_in_ruleSelectorEntry5274 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSelectorEntry5294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtExpression_in_entryRuleAtExpression5331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtExpression5341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_ruleAtExpression5391 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_ruleAtExpression5416 = new BitSet(new long[]{0xE021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAtExpression5437 = new BitSet(new long[]{0x8010000000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleAtExpression5451 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAtExpression5471 = new BitSet(new long[]{0x8010000000000000L});
    public static final BitSet FOLLOW_KEYWORD_19_in_ruleAtExpression5488 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall5524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCall5534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleFunctionCall5584 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleFunctionCall5609 = new BitSet(new long[]{0x6023E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFunctionCall5630 = new BitSet(new long[]{0x0012000000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleFunctionCall5644 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFunctionCall5664 = new BitSet(new long[]{0x0012000000000000L});
    public static final BitSet FOLLOW_ruleendComma_in_ruleFunctionCall5686 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleFunctionCall5702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression5738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression5748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfExpression_in_rulePrimaryExpression5798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCaseExpression_in_rulePrimaryExpression5828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportExpression_in_rulePrimaryExpression5858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_rulePrimaryExpression5888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostClassDefinition_in_rulePrimaryExpression5918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeDefinition_in_rulePrimaryExpression5948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVirtualNameOrReference_in_rulePrimaryExpression5978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralExpression_in_rulePrimaryExpression6008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableExpression_in_rulePrimaryExpression6038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthisedExpression_in_rulePrimaryExpression6068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeDefinition_in_entryRuleNodeDefinition6102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeDefinition6112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_53_in_ruleNodeDefinition6150 = new BitSet(new long[]{0x4000C00000408C20L,0x0000000000000241L});
    public static final BitSet FOLLOW_ruleHostReference_in_ruleNodeDefinition6170 = new BitSet(new long[]{0x0010000000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleNodeDefinition6184 = new BitSet(new long[]{0x4000C00000408C20L,0x0000000000000241L});
    public static final BitSet FOLLOW_ruleHostReference_in_ruleNodeDefinition6204 = new BitSet(new long[]{0x0010000000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleNodeDefinition6220 = new BitSet(new long[]{0x4000C00000408C20L,0x0000000000000241L});
    public static final BitSet FOLLOW_ruleHostReference_in_ruleNodeDefinition6240 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleNodeDefinition6255 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_ruleExpressionList_in_ruleNodeDefinition6275 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleNodeDefinition6289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostReference_in_entryRuleHostReference6323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHostReference6333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpression_in_ruleHostReference6383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralRegex_in_ruleHostReference6413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralDefault_in_ruleHostReference6443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralNameOrReference_in_ruleHostReference6473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostClassDefinition_in_entryRuleHostClassDefinition6507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHostClassDefinition6517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_55_in_ruleHostClassDefinition6555 = new BitSet(new long[]{0x4000C00000408D20L,0x0000000000000241L});
    public static final BitSet FOLLOW_ruleclassname_in_ruleHostClassDefinition6575 = new BitSet(new long[]{0x0001000000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleDefinitionArgumentList_in_ruleHostClassDefinition6596 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleHostClassDefinition6611 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleParentName_in_ruleHostClassDefinition6631 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleHostClassDefinition6646 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_ruleExpressionList_in_ruleHostClassDefinition6666 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleHostClassDefinition6680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParentName_in_entryRuleParentName6714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParentName6724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralDefault_in_ruleParentName6774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralClass_in_ruleParentName6804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralNameOrReference_in_ruleParentName6834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition6868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition6878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_59_in_ruleDefinition6916 = new BitSet(new long[]{0x4000C00000408D20L,0x0000000000000241L});
    public static final BitSet FOLLOW_ruleclassname_in_ruleDefinition6936 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleDefinitionArgumentList_in_ruleDefinition6957 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleDefinition6971 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_ruleExpressionList_in_ruleDefinition6991 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleDefinition7005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitionArgumentList_in_entryRuleDefinitionArgumentList7039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinitionArgumentList7049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleDefinitionArgumentList7099 = new BitSet(new long[]{0x4012C00000408C20L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleDefinitionArgument_in_ruleDefinitionArgumentList7120 = new BitSet(new long[]{0x0012000000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleDefinitionArgumentList7134 = new BitSet(new long[]{0x4000C00000408C20L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleDefinitionArgument_in_ruleDefinitionArgumentList7154 = new BitSet(new long[]{0x0012000000000000L});
    public static final BitSet FOLLOW_ruleendComma_in_ruleDefinitionArgumentList7178 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleDefinitionArgumentList7192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitionArgument_in_entryRuleDefinitionArgument7226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinitionArgument7236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNION_VARIABLE_OR_NAME_in_ruleDefinitionArgument7282 = new BitSet(new long[]{0x0400000100000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleDefinitionArgument7303 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_KEYWORD_34_in_ruleDefinitionArgument7339 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleDefinitionArgument7372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCaseExpression_in_entryRuleCaseExpression7409 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCaseExpression7419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_51_in_ruleCaseExpression7457 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleCaseExpression7477 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleCaseExpression7490 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_ruleCase_in_ruleCaseExpression7510 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleCaseExpression7524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCase_in_entryRuleCase7558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCase7568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleCase7614 = new BitSet(new long[]{0x0090000000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleCase7628 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleCase7648 = new BitSet(new long[]{0x0090000000000000L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleCase7663 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleCase7675 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_ruleExpressionList_in_ruleCase7695 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleCase7709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfExpression_in_entryRuleIfExpression7743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfExpression7753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_42_in_ruleIfExpression7791 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleIfExpression7811 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleIfExpression7824 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_ruleExpressionList_in_ruleIfExpression7844 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleIfExpression7858 = new BitSet(new long[]{0x0000000000002202L});
    public static final BitSet FOLLOW_KEYWORD_56_in_ruleIfExpression7879 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleElseIfExpression_in_ruleIfExpression7900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_52_in_ruleIfExpression7928 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleElseExpression_in_ruleIfExpression7949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElseExpression_in_entryRuleElseExpression7987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElseExpression7997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleElseExpression8047 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_ruleExpressionList_in_ruleElseExpression8067 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleElseExpression8081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElseIfExpression_in_entryRuleElseIfExpression8115 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElseIfExpression8125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleElseIfExpression8183 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleElseIfExpression8196 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_ruleExpressionList_in_ruleElseIfExpression8216 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleElseIfExpression8230 = new BitSet(new long[]{0x0000000000002202L});
    public static final BitSet FOLLOW_KEYWORD_56_in_ruleElseIfExpression8251 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleElseIfExpression_in_ruleElseIfExpression8272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_52_in_ruleElseIfExpression8300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleElseExpression_in_ruleElseIfExpression8321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralExpression_in_entryRuleLiteralExpression8359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralExpression8369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralBoolean_in_ruleLiteralExpression8419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralUndef_in_ruleLiteralExpression8449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralDefault_in_ruleLiteralExpression8479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralList_in_ruleLiteralExpression8509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralHash_in_ruleLiteralExpression8539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralRegex_in_ruleLiteralExpression8569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpression_in_ruleLiteralExpression8599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralNameOrReference_in_ruleLiteralExpression8629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralNameOrReference_in_entryRuleLiteralNameOrReference8663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralNameOrReference8673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulename_in_ruleLiteralNameOrReference8718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNION_VARIABLE_OR_NAME_in_entryRuleUNION_VARIABLE_OR_NAME8753 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUNION_VARIABLE_OR_NAME8764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledollarVariable_in_ruleUNION_VARIABLE_OR_NAME8811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulename_in_ruleUNION_VARIABLE_OR_NAME8844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthisedExpression_in_entryRuleParenthisedExpression8888 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthisedExpression8898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleParenthisedExpression8936 = new BitSet(new long[]{0x6023E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleParenthisedExpression8968 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleParenthisedExpression8982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVirtualNameOrReference_in_entryRuleVirtualNameOrReference9016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVirtualNameOrReference9026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleVirtualNameOrReference9064 = new BitSet(new long[]{0x2000000000000120L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleATBoolean_in_ruleVirtualNameOrReference9084 = new BitSet(new long[]{0x2000000000000120L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleunionNameOrReference_in_ruleVirtualNameOrReference9106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleATBoolean_in_entryRuleATBoolean9142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleATBoolean9153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleATBoolean9190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportExpression_in_entryRuleImportExpression9228 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportExpression9238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_60_in_ruleImportExpression9288 = new BitSet(new long[]{0x0000C00000400002L});
    public static final BitSet FOLLOW_ruleQuotedString_in_ruleImportExpression9309 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleImportExpression9323 = new BitSet(new long[]{0x0000C00000400000L});
    public static final BitSet FOLLOW_ruleQuotedString_in_ruleImportExpression9343 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleLiteralList_in_entryRuleLiteralList9382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralList9392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_ruleLiteralList9442 = new BitSet(new long[]{0xE031E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleLiteralList9463 = new BitSet(new long[]{0x8010000000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleLiteralList9477 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleLiteralList9497 = new BitSet(new long[]{0x8010000000000000L});
    public static final BitSet FOLLOW_ruleendComma_in_ruleLiteralList9521 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_19_in_ruleLiteralList9535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralHash_in_entryRuleLiteralHash9569 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralHash9579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleLiteralHash9629 = new BitSet(new long[]{0x4010C00000408C20L,0x0000000000000243L});
    public static final BitSet FOLLOW_ruleHashEntry_in_ruleLiteralHash9650 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleLiteralHash9664 = new BitSet(new long[]{0x4000C00000408C20L,0x0000000000000241L});
    public static final BitSet FOLLOW_ruleHashEntry_in_ruleLiteralHash9684 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleendComma_in_ruleLiteralHash9708 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleLiteralHash9722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHashEntry_in_entryRuleHashEntry9756 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHashEntry9766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralNameOrString_in_ruleHashEntry9812 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_KEYWORD_34_in_ruleHashEntry9825 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleHashEntry9845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralNameOrString_in_entryRuleLiteralNameOrString9880 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralNameOrString9890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpression_in_ruleLiteralNameOrString9940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralName_in_ruleLiteralNameOrString9970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue10005 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue10016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_54_in_ruleBooleanValue10054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_57_in_ruleBooleanValue10073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralBoolean_in_entryRuleLiteralBoolean10112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralBoolean10122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleLiteralBoolean10167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralDefault_in_entryRuleLiteralDefault10201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralDefault10211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_61_in_ruleLiteralDefault10261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralUndef_in_entryRuleLiteralUndef10295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralUndef10305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_58_in_ruleLiteralUndef10355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralClass_in_entryRuleLiteralClass10389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralClass10399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_55_in_ruleLiteralClass10449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpression_in_entryRuleStringExpression10489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringExpression10499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleQuotedString_in_ruleStringExpression10553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnquotedString_in_ruleStringExpression10583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleQuotedString_in_ruleStringExpression10613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuotedString_in_entryRuleQuotedString10657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuotedString10667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleQuotedString_in_ruleQuotedString10721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleQuotedString_in_ruleQuotedString10751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleQuotedString_in_entryRuleSingleQuotedString10789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleQuotedString10799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesqText_in_ruleSingleQuotedString10857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleQuotedString_in_entryRuleDoubleQuotedString10898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleQuotedString10908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleDoubleQuotedString10950 = new BitSet(new long[]{0x000040F000420000L,0x0000000000002070L});
    public static final BitSet FOLLOW_ruleTextExpression_in_ruleDoubleQuotedString10982 = new BitSet(new long[]{0x000040F000420000L,0x0000000000002070L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleDoubleQuotedString10996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextExpression_in_entryRuleTextExpression11040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextExpression11050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledoubleStringCharacters_in_ruleTextExpression11113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleTextExpression11146 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_ruleExpressionWithHidden_in_ruleTextExpression11166 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleTextExpression11179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledollarVariable_in_ruleTextExpression11219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionWithHidden_in_entryRuleExpressionWithHidden11265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionWithHidden11275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleExpressionWithHidden11337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnquotedString_in_entryRuleUnquotedString11379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnquotedString11389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleUnquotedString11439 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleUnquotedString11459 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleUnquotedString11473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesqText_in_entryRulesqText11514 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesqText11525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_rulesqText11567 = new BitSet(new long[]{0x000080F000420000L,0x0000000000002070L});
    public static final BitSet FOLLOW_rulesingleStringCharacters_in_rulesqText11590 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_KEYWORD_3_in_rulesqText11610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralRegex_in_entryRuleLiteralRegex11653 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralRegex11663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REGULAR_EXPRESSION_in_ruleLiteralRegex11704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralName_in_entryRuleLiteralName11743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralName11753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulename_in_ruleLiteralName11798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableExpression_in_entryRuleVariableExpression11832 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableExpression11842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledollarVariable_in_ruleVariableExpression11887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledollarVariable_in_entryRuledollarVariable11928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledollarVariable11939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOLLAR_VAR_in_ruledollarVariable11982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulename_in_entryRulename12032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulename12043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_CHARS_in_rulename12082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleclassname_in_entryRuleclassname12126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleclassname12137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulename_in_ruleclassname12184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_55_in_ruleclassname12208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunionNameOrReference_in_entryRuleunionNameOrReference12248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunionNameOrReference12259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_CHARS_in_ruleunionNameOrReference12299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_55_in_ruleunionNameOrReference12323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_61_in_ruleunionNameOrReference12342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledoubleStringCharacters_in_entryRuledoubleStringCharacters12388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledoubleStringCharacters12399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_CHARS_in_ruledoubleStringCharacters12443 = new BitSet(new long[]{0x000000F000020002L,0x0000000000002050L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruledoubleStringCharacters12469 = new BitSet(new long[]{0x000000F000020002L,0x0000000000002050L});
    public static final BitSet FOLLOW_RULE_WS_in_ruledoubleStringCharacters12495 = new BitSet(new long[]{0x000000F000020002L,0x0000000000002050L});
    public static final BitSet FOLLOW_KEYWORD_38_in_ruledoubleStringCharacters12519 = new BitSet(new long[]{0x000000F000020002L,0x0000000000002050L});
    public static final BitSet FOLLOW_KEYWORD_40_in_ruledoubleStringCharacters12538 = new BitSet(new long[]{0x000000F000020002L,0x0000000000002050L});
    public static final BitSet FOLLOW_KEYWORD_39_in_ruledoubleStringCharacters12557 = new BitSet(new long[]{0x000000F000020002L,0x0000000000002050L});
    public static final BitSet FOLLOW_KEYWORD_48_in_ruledoubleStringCharacters12576 = new BitSet(new long[]{0x000000F000020002L,0x0000000000002050L});
    public static final BitSet FOLLOW_KEYWORD_41_in_ruledoubleStringCharacters12595 = new BitSet(new long[]{0x000000F000020002L,0x0000000000002050L});
    public static final BitSet FOLLOW_rulesingleStringCharacters_in_entryRulesingleStringCharacters12646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesingleStringCharacters12657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_CHARS_in_rulesingleStringCharacters12701 = new BitSet(new long[]{0x000000F000420002L,0x0000000000002070L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rulesingleStringCharacters12727 = new BitSet(new long[]{0x000000F000420002L,0x0000000000002070L});
    public static final BitSet FOLLOW_RULE_WS_in_rulesingleStringCharacters12753 = new BitSet(new long[]{0x000000F000420002L,0x0000000000002070L});
    public static final BitSet FOLLOW_RULE_DOLLAR_VAR_in_rulesingleStringCharacters12779 = new BitSet(new long[]{0x000000F000420002L,0x0000000000002070L});
    public static final BitSet FOLLOW_KEYWORD_24_in_rulesingleStringCharacters12803 = new BitSet(new long[]{0x000000F000420002L,0x0000000000002070L});
    public static final BitSet FOLLOW_KEYWORD_38_in_rulesingleStringCharacters12822 = new BitSet(new long[]{0x000000F000420002L,0x0000000000002070L});
    public static final BitSet FOLLOW_KEYWORD_40_in_rulesingleStringCharacters12841 = new BitSet(new long[]{0x000000F000420002L,0x0000000000002070L});
    public static final BitSet FOLLOW_KEYWORD_39_in_rulesingleStringCharacters12860 = new BitSet(new long[]{0x000000F000420002L,0x0000000000002070L});
    public static final BitSet FOLLOW_KEYWORD_48_in_rulesingleStringCharacters12879 = new BitSet(new long[]{0x000000F000420002L,0x0000000000002070L});
    public static final BitSet FOLLOW_KEYWORD_41_in_rulesingleStringCharacters12898 = new BitSet(new long[]{0x000000F000420002L,0x0000000000002070L});
    public static final BitSet FOLLOW_ruleEdgeOperator_in_synpred7_InternalPPParser686 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleResourceExpression_in_synpred7_InternalPPParser707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_synpred11_InternalPPParser830 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_ruleResourceBody_in_synpred11_InternalPPParser851 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_synpred11_InternalPPParser865 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleResourceBody_in_synpred11_InternalPPParser885 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_synpred11_InternalPPParser901 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_synpred11_InternalPPParser917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_synpred23_InternalPPParser1781 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleAppendExpression_in_synpred23_InternalPPParser1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_25_in_synpred24_InternalPPParser1923 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleOrExpression_in_synpred24_InternalPPParser1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_44_in_synpred25_InternalPPParser2065 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleAndExpression_in_synpred25_InternalPPParser2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_49_in_synpred26_InternalPPParser2207 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_synpred26_InternalPPParser2227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_synpred30_InternalPPParser2503 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_synpred30_InternalPPParser2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityOperator_in_synpred32_InternalPPParser2762 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleShiftExpression_in_synpred32_InternalPPParser2783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShiftOperator_in_synpred34_InternalPPParser3021 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_synpred34_InternalPPParser3042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveOperator_in_synpred36_InternalPPParser3280 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_synpred36_InternalPPParser3301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeOperator_in_synpred38_InternalPPParser3539 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleMatchingExpression_in_synpred38_InternalPPParser3560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatchingOperator_in_synpred40_InternalPPParser3798 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleLiteralRegex_in_synpred40_InternalPPParser3819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_43_in_synpred41_InternalPPParser3947 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleUnaryOrHigherExpression_in_synpred41_InternalPPParser3979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_synpred45_InternalPPParser4483 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_ruleAttributeOperations_in_synpred45_InternalPPParser4503 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_synpred45_InternalPPParser4517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectQuery_in_synpred46_InternalPPParser4469 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_20_in_synpred46_InternalPPParser4483 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000263L});
    public static final BitSet FOLLOW_ruleAttributeOperations_in_synpred46_InternalPPParser4503 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_synpred46_InternalPPParser4517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_synpred52_InternalPPParser5034 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleSelectorEntry_in_synpred52_InternalPPParser5054 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_synpred52_InternalPPParser5068 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleSelectorEntry_in_synpred52_InternalPPParser5088 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleendComma_in_synpred52_InternalPPParser5110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_synpred52_InternalPPParser5124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_34_in_synpred54_InternalPPParser5274 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred54_InternalPPParser5294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_synpred57_InternalPPParser5416 = new BitSet(new long[]{0xE021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred57_InternalPPParser5437 = new BitSet(new long[]{0x8010000000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_synpred57_InternalPPParser5451 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred57_InternalPPParser5471 = new BitSet(new long[]{0x8010000000000000L});
    public static final BitSet FOLLOW_KEYWORD_19_in_synpred57_InternalPPParser5488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_synpred61_InternalPPParser5609 = new BitSet(new long[]{0x6023E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred61_InternalPPParser5630 = new BitSet(new long[]{0x0012000000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_synpred61_InternalPPParser5644 = new BitSet(new long[]{0x6021E1000040DDE0L,0x0000000000000261L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred61_InternalPPParser5664 = new BitSet(new long[]{0x0012000000000000L});
    public static final BitSet FOLLOW_ruleendComma_in_synpred61_InternalPPParser5686 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_synpred61_InternalPPParser5702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_synpred113_InternalPPParser9323 = new BitSet(new long[]{0x0000C00000400000L});
    public static final BitSet FOLLOW_ruleQuotedString_in_synpred113_InternalPPParser9343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuotedString_in_synpred114_InternalPPParser9309 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_synpred114_InternalPPParser9323 = new BitSet(new long[]{0x0000C00000400000L});
    public static final BitSet FOLLOW_ruleQuotedString_in_synpred114_InternalPPParser9343 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_CHARS_in_synpred135_InternalPPParser12443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_synpred136_InternalPPParser12469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_synpred137_InternalPPParser12495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_38_in_synpred138_InternalPPParser12519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_40_in_synpred139_InternalPPParser12538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_39_in_synpred140_InternalPPParser12557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_48_in_synpred141_InternalPPParser12576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_41_in_synpred142_InternalPPParser12595 = new BitSet(new long[]{0x0000000000000002L});

}