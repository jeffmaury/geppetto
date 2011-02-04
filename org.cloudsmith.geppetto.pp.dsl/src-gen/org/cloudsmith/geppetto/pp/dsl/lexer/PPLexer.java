package org.cloudsmith.geppetto.pp.dsl.lexer;

// Use our own Lexer superclass by means of import. 
import org.eclipse.xtext.parser.antlr.Lexer;
import java.util.Arrays;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PPLexer extends Lexer {
    public static final int RULE_REGULAR_EXPRESSION=74;
    public static final int RULE_ANY_OTHER=78;
    public static final int RULE_RE_FLAGS=73;
    public static final int KEYWORD_56=15;
    public static final int KEYWORD_19=64;
    public static final int KEYWORD_55=14;
    public static final int KEYWORD_54=13;
    public static final int KEYWORD_17=62;
    public static final int KEYWORD_53=12;
    public static final int KEYWORD_18=63;
    public static final int RULE_RE_FOLLOW_CHAR=76;
    public static final int KEYWORD_52=19;
    public static final int KEYWORD_15=60;
    public static final int KEYWORD_51=18;
    public static final int KEYWORD_16=61;
    public static final int KEYWORD_13=58;
    public static final int KEYWORD_50=17;
    public static final int KEYWORD_14=59;
    public static final int KEYWORD_11=56;
    public static final int EOF=-1;
    public static final int KEYWORD_12=57;
    public static final int KEYWORD_10=55;
    public static final int KEYWORD_59=10;
    public static final int KEYWORD_58=9;
    public static final int KEYWORD_57=8;
    public static final int KEYWORD_6=51;
    public static final int KEYWORD_7=52;
    public static final int KEYWORD_8=53;
    public static final int KEYWORD_9=54;
    public static final int KEYWORD_28=25;
    public static final int KEYWORD_64=4;
    public static final int KEYWORD_29=26;
    public static final int KEYWORD_61=6;
    public static final int KEYWORD_24=21;
    public static final int KEYWORD_60=11;
    public static final int KEYWORD_25=22;
    public static final int KEYWORD_63=5;
    public static final int KEYWORD_26=23;
    public static final int RULE_RE_FIRST_CHAR=75;
    public static final int KEYWORD_62=7;
    public static final int KEYWORD_27=24;
    public static final int KEYWORD_20=65;
    public static final int KEYWORD_21=66;
    public static final int KEYWORD_22=67;
    public static final int KEYWORD_23=20;
    public static final int RULE_RE_BACKSLASH_SEQUENCE=77;
    public static final int KEYWORD_30=27;
    public static final int KEYWORD_1=46;
    public static final int KEYWORD_34=31;
    public static final int KEYWORD_5=50;
    public static final int KEYWORD_33=30;
    public static final int KEYWORD_4=49;
    public static final int RULE_WORD_CHARS=71;
    public static final int KEYWORD_32=29;
    public static final int KEYWORD_3=48;
    public static final int KEYWORD_31=28;
    public static final int KEYWORD_2=47;
    public static final int KEYWORD_38=35;
    public static final int KEYWORD_37=34;
    public static final int RULE_SL_COMMENT=69;
    public static final int RULE_RE_BODY=72;
    public static final int KEYWORD_36=33;
    public static final int KEYWORD_35=32;
    public static final int RULE_ML_COMMENT=68;
    public static final int KEYWORD_39=36;
    public static final int KEYWORD_41=38;
    public static final int KEYWORD_40=37;
    public static final int KEYWORD_43=40;
    public static final int KEYWORD_42=39;
    public static final int KEYWORD_45=42;
    public static final int KEYWORD_44=41;
    public static final int KEYWORD_47=44;
    public static final int RULE_WS=70;
    public static final int KEYWORD_46=43;
    public static final int KEYWORD_49=16;
    public static final int KEYWORD_48=45;

      private boolean isReAcceptable() {
      	if(singleQuotedString || doubleQuotedString)
      		return false;
      	// accept after ',' 'node', '{','}, '=~', '!~'
      	switch(lastSignificantToken) {
      		// NOTE: Must manually make sure these refer to the correct KEYWORD numbers
      		case KEYWORD_9 : // ','
      		case KEYWORD_55 : // 'node'
      		case KEYWORD_21 : // '{'
      		case KEYWORD_22 : // '}'
      		case KEYWORD_37 : // '=~'
      		case KEYWORD_24 : // '!~'
      		case 0 : // nothing seen before, used when serializing
      			return true;
      		default:
      			return false;
      		}
      }
    	private boolean singleQuotedString = false;

    	private boolean doubleQuotedString = false;

    	protected int lastSignificantToken = 0;

    	private int dqIndex = 0;

    	private boolean dqStack[] = new boolean[10];

    	private int braceNesting = 0;

    	private void enterBrace() {
    		if(!isInterpolating())
    			return;
    		braceNesting++;
    	}

    	private void exitBrace() {
    		if(!isInterpolating())
    			return;
    		braceNesting--;
    		if(braceNesting == 0)
    			popDq();
    	}

    	private boolean isInDqString() {
    		return doubleQuotedString;
    	}

    	private boolean isInSqString() {
    		return singleQuotedString;
    	}

    	private boolean isInterpolating() {
    		return dqIndex > 0;
    	}

    	private boolean isNotInString() {
    		return !singleQuotedString && !doubleQuotedString;
    	}

    	private void popDq() {
    		if(dqIndex == 0)
    			doubleQuotedString = false; // bad state, but stay alive
    		else
    			doubleQuotedString = dqStack[--dqIndex];
    	}

    	private void pushDq() {
    		if(dqIndex >= dqStack.length)
    			dqStack = Arrays.copyOf(dqStack, dqStack.length + 10);

    		dqStack[dqIndex++] = doubleQuotedString;
    		doubleQuotedString = false;
    	}


    // delegates
    // delegators

    public PPLexer() {;} 
    public PPLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public PPLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g"; }

    // $ANTLR start "KEYWORD_64"
    public final void mKEYWORD_64() throws RecognitionException {
        try {
            int _type = KEYWORD_64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:91:12: ({...}? => 'inherits' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:91:14: {...}? => 'inherits'
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_64", "isNotInString()");
            }
            match("inherits"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_64"

    // $ANTLR start "KEYWORD_63"
    public final void mKEYWORD_63() throws RecognitionException {
        try {
            int _type = KEYWORD_63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:93:12: ({...}? => 'default' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:93:14: {...}? => 'default'
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_63", "isNotInString()");
            }
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_63"

    // $ANTLR start "KEYWORD_61"
    public final void mKEYWORD_61() throws RecognitionException {
        try {
            int _type = KEYWORD_61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:95:12: ({...}? => 'define' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:95:14: {...}? => 'define'
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_61", "isNotInString()");
            }
            match("define"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_61"

    // $ANTLR start "KEYWORD_62"
    public final void mKEYWORD_62() throws RecognitionException {
        try {
            int _type = KEYWORD_62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:97:12: ({...}? => 'import' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:97:14: {...}? => 'import'
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_62", "isNotInString()");
            }
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_62"

    // $ANTLR start "KEYWORD_57"
    public final void mKEYWORD_57() throws RecognitionException {
        try {
            int _type = KEYWORD_57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:99:12: ({...}? => 'class' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:99:14: {...}? => 'class'
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_57", "isNotInString()");
            }
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_57"

    // $ANTLR start "KEYWORD_58"
    public final void mKEYWORD_58() throws RecognitionException {
        try {
            int _type = KEYWORD_58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:101:12: ({...}? => 'elsif' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:101:14: {...}? => 'elsif'
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_58", "isNotInString()");
            }
            match("elsif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_58"

    // $ANTLR start "KEYWORD_59"
    public final void mKEYWORD_59() throws RecognitionException {
        try {
            int _type = KEYWORD_59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:103:12: ({...}? => 'false' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:103:14: {...}? => 'false'
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_59", "isNotInString()");
            }
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_59"

    // $ANTLR start "KEYWORD_60"
    public final void mKEYWORD_60() throws RecognitionException {
        try {
            int _type = KEYWORD_60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:105:12: ({...}? => 'undef' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:105:14: {...}? => 'undef'
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_60", "isNotInString()");
            }
            match("undef"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_60"

    // $ANTLR start "KEYWORD_53"
    public final void mKEYWORD_53() throws RecognitionException {
        try {
            int _type = KEYWORD_53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:107:12: ({...}? => 'case' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:107:14: {...}? => 'case'
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_53", "isNotInString()");
            }
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_53"

    // $ANTLR start "KEYWORD_54"
    public final void mKEYWORD_54() throws RecognitionException {
        try {
            int _type = KEYWORD_54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:109:12: ({...}? => 'else' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:109:14: {...}? => 'else'
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_54", "isNotInString()");
            }
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_54"

    // $ANTLR start "KEYWORD_55"
    public final void mKEYWORD_55() throws RecognitionException {
        try {
            int _type = KEYWORD_55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:111:12: ({...}? => 'node' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:111:14: {...}? => 'node'
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_55", "isNotInString()");
            }
            match("node"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_55"

    // $ANTLR start "KEYWORD_56"
    public final void mKEYWORD_56() throws RecognitionException {
        try {
            int _type = KEYWORD_56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:113:12: ({...}? => 'true' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:113:14: {...}? => 'true'
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_56", "isNotInString()");
            }
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_56"

    // $ANTLR start "KEYWORD_49"
    public final void mKEYWORD_49() throws RecognitionException {
        try {
            int _type = KEYWORD_49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:115:12: ({...}? => '<<|' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:115:14: {...}? => '<<|'
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_49", "isNotInString()");
            }
            match("<<|"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_49"

    // $ANTLR start "KEYWORD_50"
    public final void mKEYWORD_50() throws RecognitionException {
        try {
            int _type = KEYWORD_50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:117:12: ( '\\\\${' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:117:14: '\\\\${'
            {
            match("\\${"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_50"

    // $ANTLR start "KEYWORD_51"
    public final void mKEYWORD_51() throws RecognitionException {
        try {
            int _type = KEYWORD_51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:119:12: ({...}? => 'and' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:119:14: {...}? => 'and'
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_51", "isNotInString()");
            }
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_51"

    // $ANTLR start "KEYWORD_52"
    public final void mKEYWORD_52() throws RecognitionException {
        try {
            int _type = KEYWORD_52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:121:12: ({...}? => '|>>' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:121:14: {...}? => '|>>'
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_52", "isNotInString()");
            }
            match("|>>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_52"

    // $ANTLR start "KEYWORD_23"
    public final void mKEYWORD_23() throws RecognitionException {
        try {
            int _type = KEYWORD_23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:123:12: ({...}? => '!=' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:123:14: {...}? => '!='
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_23", "isNotInString()");
            }
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_23"

    // $ANTLR start "KEYWORD_24"
    public final void mKEYWORD_24() throws RecognitionException {
        try {
            int _type = KEYWORD_24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:125:12: ({...}? => '!~' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:125:14: {...}? => '!~'
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_24", "isNotInString()");
            }
            match("!~"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_24"

    // $ANTLR start "KEYWORD_25"
    public final void mKEYWORD_25() throws RecognitionException {
        try {
            int _type = KEYWORD_25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:127:12: ( '${' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:127:14: '${'
            {
            match("${"); 


            	if(doubleQuotedString) {
            		// in string expression interpolation mode
            		pushDq();
            		enterBrace();
            	}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_25"

    // $ANTLR start "KEYWORD_26"
    public final void mKEYWORD_26() throws RecognitionException {
        try {
            int _type = KEYWORD_26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:135:12: ({...}? => '+=' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:135:14: {...}? => '+='
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_26", "isNotInString()");
            }
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_26"

    // $ANTLR start "KEYWORD_27"
    public final void mKEYWORD_27() throws RecognitionException {
        try {
            int _type = KEYWORD_27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:137:12: ({...}? => '+>' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:137:14: {...}? => '+>'
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_27", "isNotInString()");
            }
            match("+>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_27"

    // $ANTLR start "KEYWORD_28"
    public final void mKEYWORD_28() throws RecognitionException {
        try {
            int _type = KEYWORD_28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:139:12: ({...}? => '->' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:139:14: {...}? => '->'
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_28", "isNotInString()");
            }
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_28"

    // $ANTLR start "KEYWORD_29"
    public final void mKEYWORD_29() throws RecognitionException {
        try {
            int _type = KEYWORD_29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:141:12: ( '::' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:141:14: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_29"

    // $ANTLR start "KEYWORD_30"
    public final void mKEYWORD_30() throws RecognitionException {
        try {
            int _type = KEYWORD_30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:143:12: ({...}? => '<-' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:143:14: {...}? => '<-'
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_30", "isNotInString()");
            }
            match("<-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_30"

    // $ANTLR start "KEYWORD_31"
    public final void mKEYWORD_31() throws RecognitionException {
        try {
            int _type = KEYWORD_31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:145:12: ({...}? => '<<' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:145:14: {...}? => '<<'
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_31", "isNotInString()");
            }
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_31"

    // $ANTLR start "KEYWORD_32"
    public final void mKEYWORD_32() throws RecognitionException {
        try {
            int _type = KEYWORD_32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:147:12: ({...}? => '<=' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:147:14: {...}? => '<='
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_32", "isNotInString()");
            }
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_32"

    // $ANTLR start "KEYWORD_33"
    public final void mKEYWORD_33() throws RecognitionException {
        try {
            int _type = KEYWORD_33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:149:12: ({...}? => '<|' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:149:14: {...}? => '<|'
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_33", "isNotInString()");
            }
            match("<|"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_33"

    // $ANTLR start "KEYWORD_34"
    public final void mKEYWORD_34() throws RecognitionException {
        try {
            int _type = KEYWORD_34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:151:12: ({...}? => '<~' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:151:14: {...}? => '<~'
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_34", "isNotInString()");
            }
            match("<~"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_34"

    // $ANTLR start "KEYWORD_35"
    public final void mKEYWORD_35() throws RecognitionException {
        try {
            int _type = KEYWORD_35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:153:12: ({...}? => '==' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:153:14: {...}? => '=='
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_35", "isNotInString()");
            }
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_35"

    // $ANTLR start "KEYWORD_36"
    public final void mKEYWORD_36() throws RecognitionException {
        try {
            int _type = KEYWORD_36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:155:12: ({...}? => '=>' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:155:14: {...}? => '=>'
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_36", "isNotInString()");
            }
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_36"

    // $ANTLR start "KEYWORD_37"
    public final void mKEYWORD_37() throws RecognitionException {
        try {
            int _type = KEYWORD_37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:157:12: ({...}? => '=~' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:157:14: {...}? => '=~'
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_37", "isNotInString()");
            }
            match("=~"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_37"

    // $ANTLR start "KEYWORD_38"
    public final void mKEYWORD_38() throws RecognitionException {
        try {
            int _type = KEYWORD_38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:159:12: ({...}? => '>=' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:159:14: {...}? => '>='
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_38", "isNotInString()");
            }
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_38"

    // $ANTLR start "KEYWORD_39"
    public final void mKEYWORD_39() throws RecognitionException {
        try {
            int _type = KEYWORD_39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:161:12: ({...}? => '>>' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:161:14: {...}? => '>>'
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_39", "isNotInString()");
            }
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_39"

    // $ANTLR start "KEYWORD_40"
    public final void mKEYWORD_40() throws RecognitionException {
        try {
            int _type = KEYWORD_40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:163:12: ( '\\\\\"' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:163:14: '\\\\\"'
            {
            match("\\\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_40"

    // $ANTLR start "KEYWORD_41"
    public final void mKEYWORD_41() throws RecognitionException {
        try {
            int _type = KEYWORD_41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:165:12: ( '\\\\$' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:165:14: '\\\\$'
            {
            match("\\$"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_41"

    // $ANTLR start "KEYWORD_42"
    public final void mKEYWORD_42() throws RecognitionException {
        try {
            int _type = KEYWORD_42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:167:12: ( '\\\\\\'' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:167:14: '\\\\\\''
            {
            match("\\'"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_42"

    // $ANTLR start "KEYWORD_43"
    public final void mKEYWORD_43() throws RecognitionException {
        try {
            int _type = KEYWORD_43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:169:12: ( '\\\\\\\\' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:169:14: '\\\\\\\\'
            {
            match("\\\\"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_43"

    // $ANTLR start "KEYWORD_44"
    public final void mKEYWORD_44() throws RecognitionException {
        try {
            int _type = KEYWORD_44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:171:12: ({...}? => 'if' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:171:14: {...}? => 'if'
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_44", "isNotInString()");
            }
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_44"

    // $ANTLR start "KEYWORD_45"
    public final void mKEYWORD_45() throws RecognitionException {
        try {
            int _type = KEYWORD_45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:173:12: ({...}? => 'in' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:173:14: {...}? => 'in'
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_45", "isNotInString()");
            }
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_45"

    // $ANTLR start "KEYWORD_46"
    public final void mKEYWORD_46() throws RecognitionException {
        try {
            int _type = KEYWORD_46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:175:12: ({...}? => 'or' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:175:14: {...}? => 'or'
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_46", "isNotInString()");
            }
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_46"

    // $ANTLR start "KEYWORD_47"
    public final void mKEYWORD_47() throws RecognitionException {
        try {
            int _type = KEYWORD_47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:177:12: ({...}? => '|>' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:177:14: {...}? => '|>'
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_47", "isNotInString()");
            }
            match("|>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_47"

    // $ANTLR start "KEYWORD_48"
    public final void mKEYWORD_48() throws RecognitionException {
        try {
            int _type = KEYWORD_48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:179:12: ({...}? => '~>' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:179:14: {...}? => '~>'
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_48", "isNotInString()");
            }
            match("~>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_48"

    // $ANTLR start "KEYWORD_1"
    public final void mKEYWORD_1() throws RecognitionException {
        try {
            int _type = KEYWORD_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:181:11: ({...}? => '!' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:181:13: {...}? => '!'
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_1", "isNotInString()");
            }
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_1"

    // $ANTLR start "KEYWORD_2"
    public final void mKEYWORD_2() throws RecognitionException {
        try {
            int _type = KEYWORD_2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:183:11: ({...}? => '\"' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:183:13: {...}? => '\"'
            {
            if ( !((!singleQuotedString)) ) {
                throw new FailedPredicateException(input, "KEYWORD_2", "!singleQuotedString");
            }
            match('\"'); 
             	// flip if in dq string or not
            		doubleQuotedString = !doubleQuotedString;
            	

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_2"

    // $ANTLR start "KEYWORD_3"
    public final void mKEYWORD_3() throws RecognitionException {
        try {
            int _type = KEYWORD_3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:188:11: ( '$' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:188:13: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_3"

    // $ANTLR start "KEYWORD_4"
    public final void mKEYWORD_4() throws RecognitionException {
        try {
            int _type = KEYWORD_4;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:190:11: ({...}? => '\\'' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:190:13: {...}? => '\\''
            {
            if ( !((!doubleQuotedString)) ) {
                throw new FailedPredicateException(input, "KEYWORD_4", "!doubleQuotedString");
            }
            match('\''); 
             	// flip if in sq string or not
            		singleQuotedString = !singleQuotedString;
            	

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_4"

    // $ANTLR start "KEYWORD_5"
    public final void mKEYWORD_5() throws RecognitionException {
        try {
            int _type = KEYWORD_5;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:195:11: ({...}? => '(' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:195:13: {...}? => '('
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_5", "isNotInString()");
            }
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_5"

    // $ANTLR start "KEYWORD_6"
    public final void mKEYWORD_6() throws RecognitionException {
        try {
            int _type = KEYWORD_6;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:197:11: ({...}? => ')' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:197:13: {...}? => ')'
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_6", "isNotInString()");
            }
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_6"

    // $ANTLR start "KEYWORD_7"
    public final void mKEYWORD_7() throws RecognitionException {
        try {
            int _type = KEYWORD_7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:199:11: ({...}? => '*' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:199:13: {...}? => '*'
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_7", "isNotInString()");
            }
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_7"

    // $ANTLR start "KEYWORD_8"
    public final void mKEYWORD_8() throws RecognitionException {
        try {
            int _type = KEYWORD_8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:201:11: ({...}? => '+' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:201:13: {...}? => '+'
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_8", "isNotInString()");
            }
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_8"

    // $ANTLR start "KEYWORD_9"
    public final void mKEYWORD_9() throws RecognitionException {
        try {
            int _type = KEYWORD_9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:203:11: ({...}? => ',' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:203:13: {...}? => ','
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_9", "isNotInString()");
            }
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_9"

    // $ANTLR start "KEYWORD_10"
    public final void mKEYWORD_10() throws RecognitionException {
        try {
            int _type = KEYWORD_10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:205:12: ( '-' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:205:14: '-'
            {
            match('-'); 

            	if(singleQuotedString || doubleQuotedString)
            		_type = RULE_ANY_OTHER;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_10"

    // $ANTLR start "KEYWORD_11"
    public final void mKEYWORD_11() throws RecognitionException {
        try {
            int _type = KEYWORD_11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:210:12: ({...}? => '/' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:210:14: {...}? => '/'
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_11", "isNotInString()");
            }
            match('/'); 

            	if(isReAcceptable()) {
            		mRULE_REGULAR_EXPRESSION();
            		return;
            	}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_11"

    // $ANTLR start "KEYWORD_12"
    public final void mKEYWORD_12() throws RecognitionException {
        try {
            int _type = KEYWORD_12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:217:12: ({...}? => ':' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:217:14: {...}? => ':'
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_12", "isNotInString()");
            }
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_12"

    // $ANTLR start "KEYWORD_13"
    public final void mKEYWORD_13() throws RecognitionException {
        try {
            int _type = KEYWORD_13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:219:12: ({...}? => ';' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:219:14: {...}? => ';'
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_13", "isNotInString()");
            }
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_13"

    // $ANTLR start "KEYWORD_14"
    public final void mKEYWORD_14() throws RecognitionException {
        try {
            int _type = KEYWORD_14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:221:12: ({...}? => '<' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:221:14: {...}? => '<'
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_14", "isNotInString()");
            }
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_14"

    // $ANTLR start "KEYWORD_15"
    public final void mKEYWORD_15() throws RecognitionException {
        try {
            int _type = KEYWORD_15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:223:12: ({...}? => '=' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:223:14: {...}? => '='
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_15", "isNotInString()");
            }
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_15"

    // $ANTLR start "KEYWORD_16"
    public final void mKEYWORD_16() throws RecognitionException {
        try {
            int _type = KEYWORD_16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:225:12: ({...}? => '>' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:225:14: {...}? => '>'
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_16", "isNotInString()");
            }
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_16"

    // $ANTLR start "KEYWORD_17"
    public final void mKEYWORD_17() throws RecognitionException {
        try {
            int _type = KEYWORD_17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:227:12: ({...}? => '?' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:227:14: {...}? => '?'
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_17", "isNotInString()");
            }
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_17"

    // $ANTLR start "KEYWORD_18"
    public final void mKEYWORD_18() throws RecognitionException {
        try {
            int _type = KEYWORD_18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:229:12: ({...}? => '@' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:229:14: {...}? => '@'
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_18", "isNotInString()");
            }
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_18"

    // $ANTLR start "KEYWORD_19"
    public final void mKEYWORD_19() throws RecognitionException {
        try {
            int _type = KEYWORD_19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:231:12: ({...}? => '[' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:231:14: {...}? => '['
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_19", "isNotInString()");
            }
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_19"

    // $ANTLR start "KEYWORD_20"
    public final void mKEYWORD_20() throws RecognitionException {
        try {
            int _type = KEYWORD_20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:233:12: ({...}? => ']' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:233:14: {...}? => ']'
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_20", "isNotInString()");
            }
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_20"

    // $ANTLR start "KEYWORD_21"
    public final void mKEYWORD_21() throws RecognitionException {
        try {
            int _type = KEYWORD_21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:235:12: ({...}? => '{' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:235:14: {...}? => '{'
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_21", "isNotInString()");
            }
            match('{'); 
            enterBrace();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_21"

    // $ANTLR start "KEYWORD_22"
    public final void mKEYWORD_22() throws RecognitionException {
        try {
            int _type = KEYWORD_22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:237:12: ({...}? => '}' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:237:14: {...}? => '}'
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "KEYWORD_22", "isNotInString()");
            }
            match('}'); 
            exitBrace();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_22"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:239:17: ({...}? => ( '/*' ( options {greedy=false; } : . )* '*/' ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:239:19: {...}? => ( '/*' ( options {greedy=false; } : . )* '*/' )
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "RULE_ML_COMMENT", "isNotInString()");
            }
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:239:40: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:239:41: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:239:46: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='*') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='/') ) {
                        alt1=2;
                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='.')||(LA1_1>='0' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<=')')||(LA1_0>='+' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:239:74: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match("*/"); 


            }


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
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:241:17: ({...}? => '#' (~ ( ( '\\r' | '\\n' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:241:19: {...}? => '#' (~ ( ( '\\r' | '\\n' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            if ( !((isNotInString())) ) {
                throw new FailedPredicateException(input, "RULE_SL_COMMENT", "isNotInString()");
            }
            match('#'); 
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:241:44: (~ ( ( '\\r' | '\\n' ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:241:44: ~ ( ( '\\r' | '\\n' ) )
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
            	    break loop2;
                }
            } while (true);

            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:241:60: ( ( '\\r' )? '\\n' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\n'||LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:241:61: ( '\\r' )? '\\n'
                    {
                    // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:241:61: ( '\\r' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='\r') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:241:61: '\\r'
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
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:243:9: ( ( ' ' | '\\u00A0' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:243:11: ( ' ' | '\\u00A0' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:243:11: ( ' ' | '\\u00A0' | '\\t' | '\\r' | '\\n' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\t' && LA5_0<='\n')||LA5_0=='\r'||LA5_0==' '||LA5_0=='\u00A0') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' '||input.LA(1)=='\u00A0' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_WORD_CHARS"
    public final void mRULE_WORD_CHARS() throws RecognitionException {
        try {
            int _type = RULE_WORD_CHARS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:245:17: ( ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '-' )+ )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:245:19: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '-' )+
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:245:19: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '-' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='-' && LA6_0<='.')||(LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:
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
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WORD_CHARS"

    // $ANTLR start "RULE_REGULAR_EXPRESSION"
    public final void mRULE_REGULAR_EXPRESSION() throws RecognitionException {
        try {
            int _type = RULE_REGULAR_EXPRESSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:247:25: ({...}? => '/' RULE_RE_BODY '/' ( RULE_RE_FLAGS )? )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:247:27: {...}? => '/' RULE_RE_BODY '/' ( RULE_RE_FLAGS )?
            {
            if ( !((isReAcceptable())) ) {
                throw new FailedPredicateException(input, "RULE_REGULAR_EXPRESSION", "isReAcceptable()");
            }
            match('/'); 
            mRULE_RE_BODY(); 
            match('/'); 
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:247:69: ( RULE_RE_FLAGS )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>='a' && LA7_0<='z')) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:247:69: RULE_RE_FLAGS
                    {
                    mRULE_RE_FLAGS(); 

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
    // $ANTLR end "RULE_REGULAR_EXPRESSION"

    // $ANTLR start "RULE_RE_BODY"
    public final void mRULE_RE_BODY() throws RecognitionException {
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:249:23: ( ( RULE_RE_FIRST_CHAR ( RULE_RE_FOLLOW_CHAR )* ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:249:25: ( RULE_RE_FIRST_CHAR ( RULE_RE_FOLLOW_CHAR )* )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:249:25: ( RULE_RE_FIRST_CHAR ( RULE_RE_FOLLOW_CHAR )* )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:249:26: RULE_RE_FIRST_CHAR ( RULE_RE_FOLLOW_CHAR )*
            {
            mRULE_RE_FIRST_CHAR(); 
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:249:45: ( RULE_RE_FOLLOW_CHAR )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='.')||(LA8_0>='0' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:249:45: RULE_RE_FOLLOW_CHAR
            	    {
            	    mRULE_RE_FOLLOW_CHAR(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_RE_BODY"

    // $ANTLR start "RULE_RE_FIRST_CHAR"
    public final void mRULE_RE_FIRST_CHAR() throws RecognitionException {
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:251:29: ( (~ ( ( '\\n' | '*' | '/' | '\\\\' ) ) | RULE_RE_BACKSLASH_SEQUENCE ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:251:31: (~ ( ( '\\n' | '*' | '/' | '\\\\' ) ) | RULE_RE_BACKSLASH_SEQUENCE )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:251:31: (~ ( ( '\\n' | '*' | '/' | '\\\\' ) ) | RULE_RE_BACKSLASH_SEQUENCE )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='.')||(LA9_0>='0' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                alt9=1;
            }
            else if ( (LA9_0=='\\') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:251:32: ~ ( ( '\\n' | '*' | '/' | '\\\\' ) )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:251:55: RULE_RE_BACKSLASH_SEQUENCE
                    {
                    mRULE_RE_BACKSLASH_SEQUENCE(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_RE_FIRST_CHAR"

    // $ANTLR start "RULE_RE_FOLLOW_CHAR"
    public final void mRULE_RE_FOLLOW_CHAR() throws RecognitionException {
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:253:30: ( ( RULE_RE_FIRST_CHAR | '*' ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:253:32: ( RULE_RE_FIRST_CHAR | '*' )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:253:32: ( RULE_RE_FIRST_CHAR | '*' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='.')||(LA10_0>='0' && LA10_0<='\uFFFF')) ) {
                alt10=1;
            }
            else if ( (LA10_0=='*') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:253:33: RULE_RE_FIRST_CHAR
                    {
                    mRULE_RE_FIRST_CHAR(); 

                    }
                    break;
                case 2 :
                    // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:253:52: '*'
                    {
                    match('*'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_RE_FOLLOW_CHAR"

    // $ANTLR start "RULE_RE_BACKSLASH_SEQUENCE"
    public final void mRULE_RE_BACKSLASH_SEQUENCE() throws RecognitionException {
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:255:37: ( ( '\\\\' ~ ( '\\n' ) ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:255:39: ( '\\\\' ~ ( '\\n' ) )
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:255:39: ( '\\\\' ~ ( '\\n' ) )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:255:40: '\\\\' ~ ( '\\n' )
            {
            match('\\'); 
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_RE_BACKSLASH_SEQUENCE"

    // $ANTLR start "RULE_RE_FLAGS"
    public final void mRULE_RE_FLAGS() throws RecognitionException {
        try {
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:257:24: ( ( 'a' .. 'z' )+ )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:257:26: ( 'a' .. 'z' )+
            {
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:257:26: ( 'a' .. 'z' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:257:27: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_RE_FLAGS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:259:16: ( . )
            // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:259:18: .
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
        // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:8: ( KEYWORD_64 | KEYWORD_63 | KEYWORD_61 | KEYWORD_62 | KEYWORD_57 | KEYWORD_58 | KEYWORD_59 | KEYWORD_60 | KEYWORD_53 | KEYWORD_54 | KEYWORD_55 | KEYWORD_56 | KEYWORD_49 | KEYWORD_50 | KEYWORD_51 | KEYWORD_52 | KEYWORD_23 | KEYWORD_24 | KEYWORD_25 | KEYWORD_26 | KEYWORD_27 | KEYWORD_28 | KEYWORD_29 | KEYWORD_30 | KEYWORD_31 | KEYWORD_32 | KEYWORD_33 | KEYWORD_34 | KEYWORD_35 | KEYWORD_36 | KEYWORD_37 | KEYWORD_38 | KEYWORD_39 | KEYWORD_40 | KEYWORD_41 | KEYWORD_42 | KEYWORD_43 | KEYWORD_44 | KEYWORD_45 | KEYWORD_46 | KEYWORD_47 | KEYWORD_48 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_14 | KEYWORD_15 | KEYWORD_16 | KEYWORD_17 | KEYWORD_18 | KEYWORD_19 | KEYWORD_20 | KEYWORD_21 | KEYWORD_22 | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_WORD_CHARS | RULE_REGULAR_EXPRESSION | RULE_ANY_OTHER )
        int alt12=70;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:10: KEYWORD_64
                {
                mKEYWORD_64(); 

                }
                break;
            case 2 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:21: KEYWORD_63
                {
                mKEYWORD_63(); 

                }
                break;
            case 3 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:32: KEYWORD_61
                {
                mKEYWORD_61(); 

                }
                break;
            case 4 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:43: KEYWORD_62
                {
                mKEYWORD_62(); 

                }
                break;
            case 5 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:54: KEYWORD_57
                {
                mKEYWORD_57(); 

                }
                break;
            case 6 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:65: KEYWORD_58
                {
                mKEYWORD_58(); 

                }
                break;
            case 7 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:76: KEYWORD_59
                {
                mKEYWORD_59(); 

                }
                break;
            case 8 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:87: KEYWORD_60
                {
                mKEYWORD_60(); 

                }
                break;
            case 9 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:98: KEYWORD_53
                {
                mKEYWORD_53(); 

                }
                break;
            case 10 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:109: KEYWORD_54
                {
                mKEYWORD_54(); 

                }
                break;
            case 11 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:120: KEYWORD_55
                {
                mKEYWORD_55(); 

                }
                break;
            case 12 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:131: KEYWORD_56
                {
                mKEYWORD_56(); 

                }
                break;
            case 13 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:142: KEYWORD_49
                {
                mKEYWORD_49(); 

                }
                break;
            case 14 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:153: KEYWORD_50
                {
                mKEYWORD_50(); 

                }
                break;
            case 15 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:164: KEYWORD_51
                {
                mKEYWORD_51(); 

                }
                break;
            case 16 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:175: KEYWORD_52
                {
                mKEYWORD_52(); 

                }
                break;
            case 17 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:186: KEYWORD_23
                {
                mKEYWORD_23(); 

                }
                break;
            case 18 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:197: KEYWORD_24
                {
                mKEYWORD_24(); 

                }
                break;
            case 19 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:208: KEYWORD_25
                {
                mKEYWORD_25(); 

                }
                break;
            case 20 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:219: KEYWORD_26
                {
                mKEYWORD_26(); 

                }
                break;
            case 21 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:230: KEYWORD_27
                {
                mKEYWORD_27(); 

                }
                break;
            case 22 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:241: KEYWORD_28
                {
                mKEYWORD_28(); 

                }
                break;
            case 23 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:252: KEYWORD_29
                {
                mKEYWORD_29(); 

                }
                break;
            case 24 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:263: KEYWORD_30
                {
                mKEYWORD_30(); 

                }
                break;
            case 25 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:274: KEYWORD_31
                {
                mKEYWORD_31(); 

                }
                break;
            case 26 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:285: KEYWORD_32
                {
                mKEYWORD_32(); 

                }
                break;
            case 27 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:296: KEYWORD_33
                {
                mKEYWORD_33(); 

                }
                break;
            case 28 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:307: KEYWORD_34
                {
                mKEYWORD_34(); 

                }
                break;
            case 29 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:318: KEYWORD_35
                {
                mKEYWORD_35(); 

                }
                break;
            case 30 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:329: KEYWORD_36
                {
                mKEYWORD_36(); 

                }
                break;
            case 31 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:340: KEYWORD_37
                {
                mKEYWORD_37(); 

                }
                break;
            case 32 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:351: KEYWORD_38
                {
                mKEYWORD_38(); 

                }
                break;
            case 33 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:362: KEYWORD_39
                {
                mKEYWORD_39(); 

                }
                break;
            case 34 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:373: KEYWORD_40
                {
                mKEYWORD_40(); 

                }
                break;
            case 35 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:384: KEYWORD_41
                {
                mKEYWORD_41(); 

                }
                break;
            case 36 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:395: KEYWORD_42
                {
                mKEYWORD_42(); 

                }
                break;
            case 37 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:406: KEYWORD_43
                {
                mKEYWORD_43(); 

                }
                break;
            case 38 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:417: KEYWORD_44
                {
                mKEYWORD_44(); 

                }
                break;
            case 39 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:428: KEYWORD_45
                {
                mKEYWORD_45(); 

                }
                break;
            case 40 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:439: KEYWORD_46
                {
                mKEYWORD_46(); 

                }
                break;
            case 41 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:450: KEYWORD_47
                {
                mKEYWORD_47(); 

                }
                break;
            case 42 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:461: KEYWORD_48
                {
                mKEYWORD_48(); 

                }
                break;
            case 43 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:472: KEYWORD_1
                {
                mKEYWORD_1(); 

                }
                break;
            case 44 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:482: KEYWORD_2
                {
                mKEYWORD_2(); 

                }
                break;
            case 45 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:492: KEYWORD_3
                {
                mKEYWORD_3(); 

                }
                break;
            case 46 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:502: KEYWORD_4
                {
                mKEYWORD_4(); 

                }
                break;
            case 47 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:512: KEYWORD_5
                {
                mKEYWORD_5(); 

                }
                break;
            case 48 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:522: KEYWORD_6
                {
                mKEYWORD_6(); 

                }
                break;
            case 49 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:532: KEYWORD_7
                {
                mKEYWORD_7(); 

                }
                break;
            case 50 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:542: KEYWORD_8
                {
                mKEYWORD_8(); 

                }
                break;
            case 51 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:552: KEYWORD_9
                {
                mKEYWORD_9(); 

                }
                break;
            case 52 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:562: KEYWORD_10
                {
                mKEYWORD_10(); 

                }
                break;
            case 53 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:573: KEYWORD_11
                {
                mKEYWORD_11(); 

                }
                break;
            case 54 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:584: KEYWORD_12
                {
                mKEYWORD_12(); 

                }
                break;
            case 55 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:595: KEYWORD_13
                {
                mKEYWORD_13(); 

                }
                break;
            case 56 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:606: KEYWORD_14
                {
                mKEYWORD_14(); 

                }
                break;
            case 57 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:617: KEYWORD_15
                {
                mKEYWORD_15(); 

                }
                break;
            case 58 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:628: KEYWORD_16
                {
                mKEYWORD_16(); 

                }
                break;
            case 59 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:639: KEYWORD_17
                {
                mKEYWORD_17(); 

                }
                break;
            case 60 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:650: KEYWORD_18
                {
                mKEYWORD_18(); 

                }
                break;
            case 61 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:661: KEYWORD_19
                {
                mKEYWORD_19(); 

                }
                break;
            case 62 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:672: KEYWORD_20
                {
                mKEYWORD_20(); 

                }
                break;
            case 63 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:683: KEYWORD_21
                {
                mKEYWORD_21(); 

                }
                break;
            case 64 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:694: KEYWORD_22
                {
                mKEYWORD_22(); 

                }
                break;
            case 65 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:705: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 66 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:721: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 67 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:737: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 68 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:745: RULE_WORD_CHARS
                {
                mRULE_WORD_CHARS(); 

                }
                break;
            case 69 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:761: RULE_REGULAR_EXPRESSION
                {
                mRULE_REGULAR_EXPRESSION(); 

                }
                break;
            case 70 :
                // ../org.cloudsmith.geppetto.pp.dsl/src/org/cloudsmith/geppetto/pp/dsl/lexer/PPLexer.g:1:785: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\10\53\1\71\1\47\1\53\1\47\1\102\1\104\1\107\1\111\1\113"+
        "\1\117\1\122\1\53\1\47\1\125\1\126\1\127\1\130\1\131\1\132\1\134"+
        "\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145\3\uffff\1\151\1"+
        "\53\1\153\1\uffff\10\53\1\165\5\uffff\1\170\3\uffff\1\53\1\173\23"+
        "\uffff\1\u0081\24\uffff\1\53\1\uffff\1\53\1\uffff\10\53\5\uffff"+
        "\1\u009e\26\uffff\1\53\1\uffff\1\53\1\uffff\3\53\1\u00a5\1\53\1"+
        "\u00a7\2\53\1\u00aa\1\u00ab\2\uffff\4\53\1\u00b1\1\uffff\1\u00b3"+
        "\1\uffff\1\u00b5\1\u00b6\3\uffff\1\53\1\u00ba\1\53\1\u00bc\10\uffff"+
        "\1\53\1\uffff\1\u00c3\5\uffff\1\u00c5\6\uffff";
    static final String DFA12_eofS =
        "\u00c8\uffff";
    static final String DFA12_minS =
        "\1\0\1\146\1\145\1\141\1\154\1\141\1\156\1\157\1\162\1\55\1\42\1"+
        "\156\1\76\1\75\1\173\1\75\1\55\1\72\2\75\1\162\1\76\17\0\3\uffff"+
        "\1\55\1\160\1\55\1\uffff\1\146\1\141\2\163\1\154\2\144\1\165\1\174"+
        "\4\uffff\1\0\1\173\3\uffff\1\144\1\76\2\uffff\1\0\4\uffff\1\0\3"+
        "\uffff\1\0\3\uffff\1\0\2\uffff\1\0\1\55\1\uffff\6\0\1\uffff\1\0"+
        "\1\uffff\10\0\2\uffff\1\145\1\0\1\157\1\0\1\141\1\163\2\145\1\163"+
        "\3\145\5\uffff\1\55\7\uffff\1\0\16\uffff\1\162\1\uffff\1\162\1\uffff"+
        "\1\165\1\156\1\163\1\55\1\146\1\55\1\145\1\146\2\55\1\0\1\uffff"+
        "\1\151\1\164\1\154\1\145\1\55\1\0\1\55\1\0\2\55\2\0\1\uffff\1\164"+
        "\1\55\1\164\1\55\1\0\1\uffff\1\0\1\uffff\2\0\2\uffff\1\163\1\0\1"+
        "\55\1\0\4\uffff\1\55\1\uffff\1\0\1\uffff\1\0\2\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\156\1\145\2\154\1\141\1\156\1\157\1\162\1\176\1\134\1"+
        "\156\1\76\1\176\1\173\1\76\1\172\1\72\1\176\1\76\1\162\1\76\6\0"+
        "\1\uffff\7\0\1\uffff\3\uffff\1\172\1\160\1\172\1\uffff\1\146\1\141"+
        "\2\163\1\154\2\144\1\165\1\174\4\uffff\1\0\1\173\3\uffff\1\144\1"+
        "\76\2\uffff\1\0\4\uffff\1\0\3\uffff\1\0\3\uffff\1\0\2\uffff\1\0"+
        "\1\172\1\uffff\6\0\1\uffff\1\0\1\uffff\10\0\2\uffff\1\145\1\0\1"+
        "\157\1\0\1\151\1\163\1\145\1\151\1\163\3\145\5\uffff\1\172\7\uffff"+
        "\1\0\16\uffff\1\162\1\uffff\1\162\1\uffff\1\165\1\156\1\163\1\172"+
        "\1\146\1\172\1\145\1\146\2\172\1\0\1\uffff\1\151\1\164\1\154\1\145"+
        "\1\172\1\0\1\172\1\0\2\172\2\0\1\uffff\1\164\1\172\1\164\1\172\1"+
        "\0\1\uffff\1\0\1\uffff\2\0\2\uffff\1\163\1\0\1\172\1\0\4\uffff\1"+
        "\172\1\uffff\1\0\1\uffff\1\0\2\uffff";
    static final String DFA12_acceptS =
        "\45\uffff\1\103\1\104\1\106\3\uffff\1\104\11\uffff\1\30\1\32\1\33"+
        "\1\34\2\uffff\1\42\1\44\1\45\2\uffff\1\21\1\22\1\uffff\1\23\1\55"+
        "\1\24\1\25\1\uffff\1\26\1\64\1\27\1\uffff\1\35\1\36\1\37\1\uffff"+
        "\1\40\1\41\2\uffff\1\52\6\uffff\1\101\1\uffff\1\105\10\uffff\1\102"+
        "\1\103\14\uffff\1\15\1\31\1\70\1\16\1\43\1\uffff\1\20\1\51\1\53"+
        "\1\62\1\66\1\71\1\72\1\uffff\1\54\1\56\1\57\1\60\1\61\1\63\1\65"+
        "\1\67\1\73\1\74\1\75\1\76\1\77\1\100\1\uffff\1\47\1\uffff\1\46\13"+
        "\uffff\1\50\14\uffff\1\17\5\uffff\1\11\1\uffff\1\12\2\uffff\1\13"+
        "\1\14\4\uffff\1\5\1\6\1\7\1\10\1\uffff\1\4\1\uffff\1\3\1\uffff\1"+
        "\2\1\1";
    static final String DFA12_specialS =
        "\1\0\10\uffff\1\57\2\uffff\1\3\1\2\1\uffff\1\4\1\7\1\uffff\1\60"+
        "\1\5\1\uffff\1\15\6\uffff\1\56\7\uffff\1\61\17\uffff\1\6\4\uffff"+
        "\1\10\5\uffff\1\1\2\uffff\1\23\4\uffff\1\32\3\uffff\1\35\3\uffff"+
        "\1\11\2\uffff\1\12\2\uffff\1\24\1\26\1\25\1\30\1\27\1\31\1\uffff"+
        "\1\33\1\uffff\1\34\1\13\1\14\1\16\1\17\1\20\1\21\1\22\3\uffff\1"+
        "\40\1\uffff\1\37\25\uffff\1\36\34\uffff\1\44\6\uffff\1\51\1\uffff"+
        "\1\43\2\uffff\1\42\1\41\5\uffff\1\55\1\uffff\1\46\1\uffff\1\47\1"+
        "\50\3\uffff\1\54\1\uffff\1\53\6\uffff\1\52\1\uffff\1\45\2\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\47\2\45\2\47\1\45\22\47\1\45\1\15\1\26\1\44\1\16\2\47\1"+
            "\27\1\30\1\31\1\32\1\17\1\33\1\20\1\46\1\34\12\46\1\21\1\35"+
            "\1\11\1\22\1\23\1\36\1\37\32\46\1\40\1\12\1\41\1\47\1\46\1\47"+
            "\1\13\1\46\1\3\1\2\1\4\1\5\2\46\1\1\4\46\1\7\1\24\4\46\1\10"+
            "\1\6\5\46\1\42\1\14\1\43\1\25\41\47\1\45\uff5f\47",
            "\1\52\6\uffff\1\51\1\50",
            "\1\54",
            "\1\56\12\uffff\1\55",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\65\16\uffff\1\64\1\66\76\uffff\1\67\1\uffff\1\70",
            "\1\73\1\uffff\1\72\2\uffff\1\74\64\uffff\1\75",
            "\1\76",
            "\1\77",
            "\1\100\100\uffff\1\101",
            "\1\103",
            "\1\105\1\106",
            "\2\53\1\uffff\12\53\4\uffff\1\110\2\uffff\32\53\4\uffff\1\53"+
            "\1\uffff\32\53",
            "\1\112",
            "\1\114\1\115\77\uffff\1\116",
            "\1\120\1\121",
            "\1\123",
            "\1\124",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\12\135\1\uffff\37\135\1\133\4\135\1\uffff\uffd0\135",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\0\146",
            "",
            "",
            "",
            "\2\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\7\53"+
            "\1\150\22\53",
            "\1\152",
            "\2\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\167",
            "",
            "",
            "",
            "\1\171",
            "\1\172",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\2\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
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
            "\1\u0090",
            "\1\uffff",
            "\1\u0092",
            "\1\uffff",
            "\1\u0094\7\uffff\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0099\3\uffff\1\u0098",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "",
            "",
            "",
            "",
            "",
            "\2\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
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
            "\1\u00a0",
            "",
            "\1\u00a1",
            "",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\2\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00a6",
            "\2\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00a8",
            "\1\u00a9",
            "\2\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\2\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\uffff",
            "",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\2\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\uffff",
            "\2\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\uffff",
            "\2\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\2\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\u00b9",
            "\2\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00bb",
            "\2\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\u00c1",
            "\1\uffff",
            "\2\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "\2\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( KEYWORD_64 | KEYWORD_63 | KEYWORD_61 | KEYWORD_62 | KEYWORD_57 | KEYWORD_58 | KEYWORD_59 | KEYWORD_60 | KEYWORD_53 | KEYWORD_54 | KEYWORD_55 | KEYWORD_56 | KEYWORD_49 | KEYWORD_50 | KEYWORD_51 | KEYWORD_52 | KEYWORD_23 | KEYWORD_24 | KEYWORD_25 | KEYWORD_26 | KEYWORD_27 | KEYWORD_28 | KEYWORD_29 | KEYWORD_30 | KEYWORD_31 | KEYWORD_32 | KEYWORD_33 | KEYWORD_34 | KEYWORD_35 | KEYWORD_36 | KEYWORD_37 | KEYWORD_38 | KEYWORD_39 | KEYWORD_40 | KEYWORD_41 | KEYWORD_42 | KEYWORD_43 | KEYWORD_44 | KEYWORD_45 | KEYWORD_46 | KEYWORD_47 | KEYWORD_48 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_14 | KEYWORD_15 | KEYWORD_16 | KEYWORD_17 | KEYWORD_18 | KEYWORD_19 | KEYWORD_20 | KEYWORD_21 | KEYWORD_22 | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_WORD_CHARS | RULE_REGULAR_EXPRESSION | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='i') ) {s = 1;}

                        else if ( (LA12_0=='d') ) {s = 2;}

                        else if ( (LA12_0=='c') ) {s = 3;}

                        else if ( (LA12_0=='e') ) {s = 4;}

                        else if ( (LA12_0=='f') ) {s = 5;}

                        else if ( (LA12_0=='u') ) {s = 6;}

                        else if ( (LA12_0=='n') ) {s = 7;}

                        else if ( (LA12_0=='t') ) {s = 8;}

                        else if ( (LA12_0=='<') ) {s = 9;}

                        else if ( (LA12_0=='\\') ) {s = 10;}

                        else if ( (LA12_0=='a') ) {s = 11;}

                        else if ( (LA12_0=='|') ) {s = 12;}

                        else if ( (LA12_0=='!') ) {s = 13;}

                        else if ( (LA12_0=='$') ) {s = 14;}

                        else if ( (LA12_0=='+') ) {s = 15;}

                        else if ( (LA12_0=='-') ) {s = 16;}

                        else if ( (LA12_0==':') ) {s = 17;}

                        else if ( (LA12_0=='=') ) {s = 18;}

                        else if ( (LA12_0=='>') ) {s = 19;}

                        else if ( (LA12_0=='o') ) {s = 20;}

                        else if ( (LA12_0=='~') ) {s = 21;}

                        else if ( (LA12_0=='\"') ) {s = 22;}

                        else if ( (LA12_0=='\'') ) {s = 23;}

                        else if ( (LA12_0=='(') ) {s = 24;}

                        else if ( (LA12_0==')') ) {s = 25;}

                        else if ( (LA12_0=='*') ) {s = 26;}

                        else if ( (LA12_0==',') ) {s = 27;}

                        else if ( (LA12_0=='/') ) {s = 28;}

                        else if ( (LA12_0==';') ) {s = 29;}

                        else if ( (LA12_0=='?') ) {s = 30;}

                        else if ( (LA12_0=='@') ) {s = 31;}

                        else if ( (LA12_0=='[') ) {s = 32;}

                        else if ( (LA12_0==']') ) {s = 33;}

                        else if ( (LA12_0=='{') ) {s = 34;}

                        else if ( (LA12_0=='}') ) {s = 35;}

                        else if ( (LA12_0=='#') ) {s = 36;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' '||LA12_0=='\u00A0') ) {s = 37;}

                        else if ( (LA12_0=='.'||(LA12_0>='0' && LA12_0<='9')||(LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='m')||(LA12_0>='p' && LA12_0<='s')||(LA12_0>='v' && LA12_0<='z')) ) {s = 38;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='%' && LA12_0<='&')||LA12_0=='^'||LA12_0=='`'||(LA12_0>='\u007F' && LA12_0<='\u009F')||(LA12_0>='\u00A1' && LA12_0<='\uFFFF')) ) {s = 39;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_63 = input.LA(1);

                         
                        int index12_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_63=='>') && ((isNotInString()))) {s = 122;}

                        else s = 123;

                         
                        input.seek(index12_63);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_13 = input.LA(1);

                         
                        int index12_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_13=='=') && ((isNotInString()))) {s = 64;}

                        else if ( (LA12_13=='~') && ((isNotInString()))) {s = 65;}

                        else s = 66;

                         
                        input.seek(index12_13);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_12 = input.LA(1);

                         
                        int index12_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_12=='>') && ((isNotInString()))) {s = 63;}

                        else s = 39;

                         
                        input.seek(index12_12);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_15 = input.LA(1);

                         
                        int index12_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_15=='=') && ((isNotInString()))) {s = 69;}

                        else if ( (LA12_15=='>') && ((isNotInString()))) {s = 70;}

                        else s = 71;

                         
                        input.seek(index12_15);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_19 = input.LA(1);

                         
                        int index12_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_19=='=') && ((isNotInString()))) {s = 80;}

                        else if ( (LA12_19=='>') && ((isNotInString()))) {s = 81;}

                        else s = 82;

                         
                        input.seek(index12_19);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_52 = input.LA(1);

                         
                        int index12_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_52=='|') && ((isNotInString()))) {s = 116;}

                        else s = 117;

                         
                        input.seek(index12_52);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA12_16 = input.LA(1);

                         
                        int index12_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_16=='>') && ((isNotInString()))) {s = 72;}

                        else if ( ((LA12_16>='-' && LA12_16<='.')||(LA12_16>='0' && LA12_16<='9')||(LA12_16>='A' && LA12_16<='Z')||LA12_16=='_'||(LA12_16>='a' && LA12_16<='z')) ) {s = 43;}

                        else s = 73;

                         
                        input.seek(index12_16);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA12_57 = input.LA(1);

                         
                        int index12_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((isNotInString())) ) {s = 118;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index12_57);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA12_79 = input.LA(1);

                         
                        int index12_79 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((isNotInString())) ) {s = 127;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index12_79);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA12_82 = input.LA(1);

                         
                        int index12_82 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((isNotInString())) ) {s = 128;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index12_82);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA12_95 = input.LA(1);

                         
                        int index12_95 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((isNotInString())) ) {s = 138;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index12_95);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA12_96 = input.LA(1);

                         
                        int index12_96 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((isNotInString())) ) {s = 139;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index12_96);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA12_21 = input.LA(1);

                         
                        int index12_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_21=='>') && ((isNotInString()))) {s = 84;}

                        else s = 39;

                         
                        input.seek(index12_21);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA12_97 = input.LA(1);

                         
                        int index12_97 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((isNotInString())) ) {s = 140;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index12_97);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA12_98 = input.LA(1);

                         
                        int index12_98 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((isNotInString())) ) {s = 141;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index12_98);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA12_99 = input.LA(1);

                         
                        int index12_99 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((isNotInString())) ) {s = 142;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index12_99);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA12_100 = input.LA(1);

                         
                        int index12_100 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((isNotInString())) ) {s = 143;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index12_100);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA12_101 = input.LA(1);

                         
                        int index12_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((isNotInString())) ) {s = 102;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index12_101);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA12_66 = input.LA(1);

                         
                        int index12_66 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((isNotInString())) ) {s = 124;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index12_66);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA12_85 = input.LA(1);

                         
                        int index12_85 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!singleQuotedString)) ) {s = 130;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index12_85);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA12_87 = input.LA(1);

                         
                        int index12_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((isNotInString())) ) {s = 132;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index12_87);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA12_86 = input.LA(1);

                         
                        int index12_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!doubleQuotedString)) ) {s = 131;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index12_86);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA12_89 = input.LA(1);

                         
                        int index12_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((isNotInString())) ) {s = 134;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index12_89);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA12_88 = input.LA(1);

                         
                        int index12_88 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((isNotInString())) ) {s = 133;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index12_88);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA12_90 = input.LA(1);

                         
                        int index12_90 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((isNotInString())) ) {s = 135;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index12_90);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA12_71 = input.LA(1);

                         
                        int index12_71 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((isNotInString())) ) {s = 125;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index12_71);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA12_92 = input.LA(1);

                         
                        int index12_92 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((isNotInString())) ) {s = 136;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index12_92);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA12_94 = input.LA(1);

                         
                        int index12_94 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((isNotInString())) ) {s = 137;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index12_94);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA12_75 = input.LA(1);

                         
                        int index12_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((isNotInString())) ) {s = 126;}

                        else if ( (true) ) {s = 39;}

                         
                        input.seek(index12_75);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA12_129 = input.LA(1);

                         
                        int index12_129 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((isNotInString())) ) {s = 159;}

                        else if ( (true) ) {s = 43;}

                         
                        input.seek(index12_129);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA12_107 = input.LA(1);

                         
                        int index12_107 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((isNotInString())) ) {s = 147;}

                        else if ( (true) ) {s = 43;}

                         
                        input.seek(index12_107);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA12_105 = input.LA(1);

                         
                        int index12_105 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((isNotInString())) ) {s = 145;}

                        else if ( (true) ) {s = 43;}

                         
                        input.seek(index12_105);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA12_171 = input.LA(1);

                         
                        int index12_171 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((isNotInString())) ) {s = 184;}

                        else if ( (true) ) {s = 43;}

                         
                        input.seek(index12_171);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA12_170 = input.LA(1);

                         
                        int index12_170 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((isNotInString())) ) {s = 183;}

                        else if ( (true) ) {s = 43;}

                         
                        input.seek(index12_170);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA12_167 = input.LA(1);

                         
                        int index12_167 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((isNotInString())) ) {s = 180;}

                        else if ( (true) ) {s = 43;}

                         
                        input.seek(index12_167);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA12_158 = input.LA(1);

                         
                        int index12_158 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((isNotInString())) ) {s = 172;}

                        else if ( (true) ) {s = 43;}

                         
                        input.seek(index12_158);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA12_197 = input.LA(1);

                         
                        int index12_197 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((isNotInString())) ) {s = 199;}

                        else if ( (true) ) {s = 43;}

                         
                        input.seek(index12_197);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA12_179 = input.LA(1);

                         
                        int index12_179 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((isNotInString())) ) {s = 190;}

                        else if ( (true) ) {s = 43;}

                         
                        input.seek(index12_179);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA12_181 = input.LA(1);

                         
                        int index12_181 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((isNotInString())) ) {s = 191;}

                        else if ( (true) ) {s = 43;}

                         
                        input.seek(index12_181);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA12_182 = input.LA(1);

                         
                        int index12_182 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((isNotInString())) ) {s = 192;}

                        else if ( (true) ) {s = 43;}

                         
                        input.seek(index12_182);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA12_165 = input.LA(1);

                         
                        int index12_165 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((isNotInString())) ) {s = 178;}

                        else if ( (true) ) {s = 43;}

                         
                        input.seek(index12_165);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA12_195 = input.LA(1);

                         
                        int index12_195 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((isNotInString())) ) {s = 198;}

                        else if ( (true) ) {s = 43;}

                         
                        input.seek(index12_195);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA12_188 = input.LA(1);

                         
                        int index12_188 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((isNotInString())) ) {s = 196;}

                        else if ( (true) ) {s = 43;}

                         
                        input.seek(index12_188);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA12_186 = input.LA(1);

                         
                        int index12_186 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((isNotInString())) ) {s = 194;}

                        else if ( (true) ) {s = 43;}

                         
                        input.seek(index12_186);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA12_177 = input.LA(1);

                         
                        int index12_177 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((isNotInString())) ) {s = 189;}

                        else if ( (true) ) {s = 43;}

                         
                        input.seek(index12_177);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA12_28 = input.LA(1);

                         
                        int index12_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_28=='*') && ((isNotInString()))) {s = 91;}

                        else if ( ((LA12_28>='\u0000' && LA12_28<='\t')||(LA12_28>='\u000B' && LA12_28<=')')||(LA12_28>='+' && LA12_28<='.')||(LA12_28>='0' && LA12_28<='\uFFFF')) && ((isReAcceptable()))) {s = 93;}

                        else s = 92;

                         
                        input.seek(index12_28);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA12_9 = input.LA(1);

                         
                        int index12_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_9=='<') && ((isNotInString()))) {s = 52;}

                        else if ( (LA12_9=='-') && ((isNotInString()))) {s = 53;}

                        else if ( (LA12_9=='=') && ((isNotInString()))) {s = 54;}

                        else if ( (LA12_9=='|') && ((isNotInString()))) {s = 55;}

                        else if ( (LA12_9=='~') && ((isNotInString()))) {s = 56;}

                        else s = 57;

                         
                        input.seek(index12_9);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA12_18 = input.LA(1);

                         
                        int index12_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_18=='=') && ((isNotInString()))) {s = 76;}

                        else if ( (LA12_18=='>') && ((isNotInString()))) {s = 77;}

                        else if ( (LA12_18=='~') && ((isNotInString()))) {s = 78;}

                        else s = 79;

                         
                        input.seek(index12_18);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA12_36 = input.LA(1);

                         
                        int index12_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA12_36>='\u0000' && LA12_36<='\uFFFF')) && ((isNotInString()))) {s = 102;}

                        else s = 101;

                         
                        input.seek(index12_36);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}