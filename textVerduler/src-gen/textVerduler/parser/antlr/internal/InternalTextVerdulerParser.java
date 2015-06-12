package textVerduler.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import textVerduler.services.TextVerdulerGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTextVerdulerParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "'.'", "'compro'", "'se redondea a'", "'paga'", "'queda debiendo'", "'de'", "'Las'", "'Los'", "'salen'", "'el'", "'los'", "'kilo'", "'kilos'", "'medio kilo'", "'cuarto kilo'", "'gramos'", "'Cliente'", "'debe'", "'al dia'", "'tiene credito'", "'pesos'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalTextVerdulerParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTextVerdulerParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTextVerdulerParser.tokenNames; }
    public String getGrammarFileName() { return "../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g"; }



     	private TextVerdulerGrammarAccess grammarAccess;
     	
        public InternalTextVerdulerParser(TokenStream input, TextVerdulerGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Verduleria";	
       	}
       	
       	@Override
       	protected TextVerdulerGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleVerduleria"
    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:67:1: entryRuleVerduleria returns [EObject current=null] : iv_ruleVerduleria= ruleVerduleria EOF ;
    public final EObject entryRuleVerduleria() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerduleria = null;


        try {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:68:2: (iv_ruleVerduleria= ruleVerduleria EOF )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:69:2: iv_ruleVerduleria= ruleVerduleria EOF
            {
             newCompositeNode(grammarAccess.getVerduleriaRule()); 
            pushFollow(FOLLOW_ruleVerduleria_in_entryRuleVerduleria75);
            iv_ruleVerduleria=ruleVerduleria();

            state._fsp--;

             current =iv_ruleVerduleria; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerduleria85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVerduleria"


    // $ANTLR start "ruleVerduleria"
    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:76:1: ruleVerduleria returns [EObject current=null] : ( ( (lv_anotaciones_0_1= ruleModelCliente | lv_anotaciones_0_2= ruleModelProducto | lv_anotaciones_0_3= ruleModelVenta ) ) )* ;
    public final EObject ruleVerduleria() throws RecognitionException {
        EObject current = null;

        EObject lv_anotaciones_0_1 = null;

        EObject lv_anotaciones_0_2 = null;

        EObject lv_anotaciones_0_3 = null;


         enterRule(); 
            
        try {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:79:28: ( ( ( (lv_anotaciones_0_1= ruleModelCliente | lv_anotaciones_0_2= ruleModelProducto | lv_anotaciones_0_3= ruleModelVenta ) ) )* )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:80:1: ( ( (lv_anotaciones_0_1= ruleModelCliente | lv_anotaciones_0_2= ruleModelProducto | lv_anotaciones_0_3= ruleModelVenta ) ) )*
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:80:1: ( ( (lv_anotaciones_0_1= ruleModelCliente | lv_anotaciones_0_2= ruleModelProducto | lv_anotaciones_0_3= ruleModelVenta ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||(LA2_0>=18 && LA2_0<=19)||LA2_0==28) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:81:1: ( (lv_anotaciones_0_1= ruleModelCliente | lv_anotaciones_0_2= ruleModelProducto | lv_anotaciones_0_3= ruleModelVenta ) )
            	    {
            	    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:81:1: ( (lv_anotaciones_0_1= ruleModelCliente | lv_anotaciones_0_2= ruleModelProducto | lv_anotaciones_0_3= ruleModelVenta ) )
            	    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:82:1: (lv_anotaciones_0_1= ruleModelCliente | lv_anotaciones_0_2= ruleModelProducto | lv_anotaciones_0_3= ruleModelVenta )
            	    {
            	    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:82:1: (lv_anotaciones_0_1= ruleModelCliente | lv_anotaciones_0_2= ruleModelProducto | lv_anotaciones_0_3= ruleModelVenta )
            	    int alt1=3;
            	    switch ( input.LA(1) ) {
            	    case 28:
            	        {
            	        alt1=1;
            	        }
            	        break;
            	    case 18:
            	    case 19:
            	        {
            	        alt1=2;
            	        }
            	        break;
            	    case RULE_ID:
            	        {
            	        alt1=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt1) {
            	        case 1 :
            	            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:83:3: lv_anotaciones_0_1= ruleModelCliente
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getVerduleriaAccess().getAnotacionesModelClienteParserRuleCall_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleModelCliente_in_ruleVerduleria132);
            	            lv_anotaciones_0_1=ruleModelCliente();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getVerduleriaRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"anotaciones",
            	                    		lv_anotaciones_0_1, 
            	                    		"ModelCliente");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:98:8: lv_anotaciones_0_2= ruleModelProducto
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getVerduleriaAccess().getAnotacionesModelProductoParserRuleCall_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleModelProducto_in_ruleVerduleria151);
            	            lv_anotaciones_0_2=ruleModelProducto();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getVerduleriaRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"anotaciones",
            	                    		lv_anotaciones_0_2, 
            	                    		"ModelProducto");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:113:8: lv_anotaciones_0_3= ruleModelVenta
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getVerduleriaAccess().getAnotacionesModelVentaParserRuleCall_0_2()); 
            	            	    
            	            pushFollow(FOLLOW_ruleModelVenta_in_ruleVerduleria170);
            	            lv_anotaciones_0_3=ruleModelVenta();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getVerduleriaRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"anotaciones",
            	                    		lv_anotaciones_0_3, 
            	                    		"ModelVenta");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "ruleVerduleria"


    // $ANTLR start "entryRuleModelCliente"
    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:139:1: entryRuleModelCliente returns [EObject current=null] : iv_ruleModelCliente= ruleModelCliente EOF ;
    public final EObject entryRuleModelCliente() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelCliente = null;


        try {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:140:2: (iv_ruleModelCliente= ruleModelCliente EOF )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:141:2: iv_ruleModelCliente= ruleModelCliente EOF
            {
             newCompositeNode(grammarAccess.getModelClienteRule()); 
            pushFollow(FOLLOW_ruleModelCliente_in_entryRuleModelCliente209);
            iv_ruleModelCliente=ruleModelCliente();

            state._fsp--;

             current =iv_ruleModelCliente; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelCliente219); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelCliente"


    // $ANTLR start "ruleModelCliente"
    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:148:1: ruleModelCliente returns [EObject current=null] : ( ( (lv_clientes_0_0= ruleCliente ) ) otherlv_1= ',' ( (lv_estadoDeDeuda_2_0= ruleEstadoDeuda ) ) otherlv_3= '.' ) ;
    public final EObject ruleModelCliente() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_clientes_0_0 = null;

        EObject lv_estadoDeDeuda_2_0 = null;


         enterRule(); 
            
        try {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:151:28: ( ( ( (lv_clientes_0_0= ruleCliente ) ) otherlv_1= ',' ( (lv_estadoDeDeuda_2_0= ruleEstadoDeuda ) ) otherlv_3= '.' ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:152:1: ( ( (lv_clientes_0_0= ruleCliente ) ) otherlv_1= ',' ( (lv_estadoDeDeuda_2_0= ruleEstadoDeuda ) ) otherlv_3= '.' )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:152:1: ( ( (lv_clientes_0_0= ruleCliente ) ) otherlv_1= ',' ( (lv_estadoDeDeuda_2_0= ruleEstadoDeuda ) ) otherlv_3= '.' )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:152:2: ( (lv_clientes_0_0= ruleCliente ) ) otherlv_1= ',' ( (lv_estadoDeDeuda_2_0= ruleEstadoDeuda ) ) otherlv_3= '.'
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:152:2: ( (lv_clientes_0_0= ruleCliente ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:153:1: (lv_clientes_0_0= ruleCliente )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:153:1: (lv_clientes_0_0= ruleCliente )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:154:3: lv_clientes_0_0= ruleCliente
            {
             
            	        newCompositeNode(grammarAccess.getModelClienteAccess().getClientesClienteParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleCliente_in_ruleModelCliente265);
            lv_clientes_0_0=ruleCliente();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelClienteRule());
            	        }
                   		add(
                   			current, 
                   			"clientes",
                    		lv_clientes_0_0, 
                    		"Cliente");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleModelCliente277); 

                	newLeafNode(otherlv_1, grammarAccess.getModelClienteAccess().getCommaKeyword_1());
                
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:174:1: ( (lv_estadoDeDeuda_2_0= ruleEstadoDeuda ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:175:1: (lv_estadoDeDeuda_2_0= ruleEstadoDeuda )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:175:1: (lv_estadoDeDeuda_2_0= ruleEstadoDeuda )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:176:3: lv_estadoDeDeuda_2_0= ruleEstadoDeuda
            {
             
            	        newCompositeNode(grammarAccess.getModelClienteAccess().getEstadoDeDeudaEstadoDeudaParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEstadoDeuda_in_ruleModelCliente298);
            lv_estadoDeDeuda_2_0=ruleEstadoDeuda();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelClienteRule());
            	        }
                   		set(
                   			current, 
                   			"estadoDeDeuda",
                    		lv_estadoDeDeuda_2_0, 
                    		"EstadoDeuda");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleModelCliente310); 

                	newLeafNode(otherlv_3, grammarAccess.getModelClienteAccess().getFullStopKeyword_3());
                

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
    // $ANTLR end "ruleModelCliente"


    // $ANTLR start "entryRuleModelProducto"
    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:204:1: entryRuleModelProducto returns [EObject current=null] : iv_ruleModelProducto= ruleModelProducto EOF ;
    public final EObject entryRuleModelProducto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelProducto = null;


        try {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:205:2: (iv_ruleModelProducto= ruleModelProducto EOF )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:206:2: iv_ruleModelProducto= ruleModelProducto EOF
            {
             newCompositeNode(grammarAccess.getModelProductoRule()); 
            pushFollow(FOLLOW_ruleModelProducto_in_entryRuleModelProducto346);
            iv_ruleModelProducto=ruleModelProducto();

            state._fsp--;

             current =iv_ruleModelProducto; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelProducto356); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelProducto"


    // $ANTLR start "ruleModelProducto"
    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:213:1: ruleModelProducto returns [EObject current=null] : ( ( (lv_productos_0_0= ruleProducto ) ) ( (lv_valor_1_0= ruleValorDelProducto ) ) otherlv_2= '.' ) ;
    public final EObject ruleModelProducto() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_productos_0_0 = null;

        EObject lv_valor_1_0 = null;


         enterRule(); 
            
        try {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:216:28: ( ( ( (lv_productos_0_0= ruleProducto ) ) ( (lv_valor_1_0= ruleValorDelProducto ) ) otherlv_2= '.' ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:217:1: ( ( (lv_productos_0_0= ruleProducto ) ) ( (lv_valor_1_0= ruleValorDelProducto ) ) otherlv_2= '.' )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:217:1: ( ( (lv_productos_0_0= ruleProducto ) ) ( (lv_valor_1_0= ruleValorDelProducto ) ) otherlv_2= '.' )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:217:2: ( (lv_productos_0_0= ruleProducto ) ) ( (lv_valor_1_0= ruleValorDelProducto ) ) otherlv_2= '.'
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:217:2: ( (lv_productos_0_0= ruleProducto ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:218:1: (lv_productos_0_0= ruleProducto )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:218:1: (lv_productos_0_0= ruleProducto )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:219:3: lv_productos_0_0= ruleProducto
            {
             
            	        newCompositeNode(grammarAccess.getModelProductoAccess().getProductosProductoParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleProducto_in_ruleModelProducto402);
            lv_productos_0_0=ruleProducto();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelProductoRule());
            	        }
                   		add(
                   			current, 
                   			"productos",
                    		lv_productos_0_0, 
                    		"Producto");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:235:2: ( (lv_valor_1_0= ruleValorDelProducto ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:236:1: (lv_valor_1_0= ruleValorDelProducto )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:236:1: (lv_valor_1_0= ruleValorDelProducto )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:237:3: lv_valor_1_0= ruleValorDelProducto
            {
             
            	        newCompositeNode(grammarAccess.getModelProductoAccess().getValorValorDelProductoParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleValorDelProducto_in_ruleModelProducto423);
            lv_valor_1_0=ruleValorDelProducto();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelProductoRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_1_0, 
                    		"ValorDelProducto");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleModelProducto435); 

                	newLeafNode(otherlv_2, grammarAccess.getModelProductoAccess().getFullStopKeyword_2());
                

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
    // $ANTLR end "ruleModelProducto"


    // $ANTLR start "entryRuleModelVenta"
    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:265:1: entryRuleModelVenta returns [EObject current=null] : iv_ruleModelVenta= ruleModelVenta EOF ;
    public final EObject entryRuleModelVenta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelVenta = null;


        try {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:266:2: (iv_ruleModelVenta= ruleModelVenta EOF )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:267:2: iv_ruleModelVenta= ruleModelVenta EOF
            {
             newCompositeNode(grammarAccess.getModelVentaRule()); 
            pushFollow(FOLLOW_ruleModelVenta_in_entryRuleModelVenta471);
            iv_ruleModelVenta=ruleModelVenta();

            state._fsp--;

             current =iv_ruleModelVenta; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelVenta481); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelVenta"


    // $ANTLR start "ruleModelVenta"
    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:274:1: ruleModelVenta returns [EObject current=null] : ( (lv_venta_0_0= ruleVenta ) ) ;
    public final EObject ruleModelVenta() throws RecognitionException {
        EObject current = null;

        EObject lv_venta_0_0 = null;


         enterRule(); 
            
        try {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:277:28: ( ( (lv_venta_0_0= ruleVenta ) ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:278:1: ( (lv_venta_0_0= ruleVenta ) )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:278:1: ( (lv_venta_0_0= ruleVenta ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:279:1: (lv_venta_0_0= ruleVenta )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:279:1: (lv_venta_0_0= ruleVenta )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:280:3: lv_venta_0_0= ruleVenta
            {
             
            	        newCompositeNode(grammarAccess.getModelVentaAccess().getVentaVentaParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleVenta_in_ruleModelVenta526);
            lv_venta_0_0=ruleVenta();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelVentaRule());
            	        }
                   		add(
                   			current, 
                   			"venta",
                    		lv_venta_0_0, 
                    		"Venta");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleModelVenta"


    // $ANTLR start "entryRuleVenta"
    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:304:1: entryRuleVenta returns [EObject current=null] : iv_ruleVenta= ruleVenta EOF ;
    public final EObject entryRuleVenta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVenta = null;


        try {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:305:2: (iv_ruleVenta= ruleVenta EOF )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:306:2: iv_ruleVenta= ruleVenta EOF
            {
             newCompositeNode(grammarAccess.getVentaRule()); 
            pushFollow(FOLLOW_ruleVenta_in_entryRuleVenta561);
            iv_ruleVenta=ruleVenta();

            state._fsp--;

             current =iv_ruleVenta; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVenta571); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVenta"


    // $ANTLR start "ruleVenta"
    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:313:1: ruleVenta returns [EObject current=null] : ( ( (lv_nombre_0_0= RULE_ID ) ) otherlv_1= 'compro' ( ( (lv_unaListaDeCompras_2_0= ruleMercaderia ) ) (otherlv_3= ',' )? )* (otherlv_4= 'se redondea a' )? ( (lv_unImporte_5_0= ruleImporte ) ) otherlv_6= ',' ( (lv_unTotal_7_0= ruleTotalDeCompra ) ) otherlv_8= '.' ) ;
    public final EObject ruleVenta() throws RecognitionException {
        EObject current = null;

        Token lv_nombre_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_unaListaDeCompras_2_0 = null;

        EObject lv_unImporte_5_0 = null;

        EObject lv_unTotal_7_0 = null;


         enterRule(); 
            
        try {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:316:28: ( ( ( (lv_nombre_0_0= RULE_ID ) ) otherlv_1= 'compro' ( ( (lv_unaListaDeCompras_2_0= ruleMercaderia ) ) (otherlv_3= ',' )? )* (otherlv_4= 'se redondea a' )? ( (lv_unImporte_5_0= ruleImporte ) ) otherlv_6= ',' ( (lv_unTotal_7_0= ruleTotalDeCompra ) ) otherlv_8= '.' ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:317:1: ( ( (lv_nombre_0_0= RULE_ID ) ) otherlv_1= 'compro' ( ( (lv_unaListaDeCompras_2_0= ruleMercaderia ) ) (otherlv_3= ',' )? )* (otherlv_4= 'se redondea a' )? ( (lv_unImporte_5_0= ruleImporte ) ) otherlv_6= ',' ( (lv_unTotal_7_0= ruleTotalDeCompra ) ) otherlv_8= '.' )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:317:1: ( ( (lv_nombre_0_0= RULE_ID ) ) otherlv_1= 'compro' ( ( (lv_unaListaDeCompras_2_0= ruleMercaderia ) ) (otherlv_3= ',' )? )* (otherlv_4= 'se redondea a' )? ( (lv_unImporte_5_0= ruleImporte ) ) otherlv_6= ',' ( (lv_unTotal_7_0= ruleTotalDeCompra ) ) otherlv_8= '.' )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:317:2: ( (lv_nombre_0_0= RULE_ID ) ) otherlv_1= 'compro' ( ( (lv_unaListaDeCompras_2_0= ruleMercaderia ) ) (otherlv_3= ',' )? )* (otherlv_4= 'se redondea a' )? ( (lv_unImporte_5_0= ruleImporte ) ) otherlv_6= ',' ( (lv_unTotal_7_0= ruleTotalDeCompra ) ) otherlv_8= '.'
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:317:2: ( (lv_nombre_0_0= RULE_ID ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:318:1: (lv_nombre_0_0= RULE_ID )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:318:1: (lv_nombre_0_0= RULE_ID )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:319:3: lv_nombre_0_0= RULE_ID
            {
            lv_nombre_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVenta613); 

            			newLeafNode(lv_nombre_0_0, grammarAccess.getVentaAccess().getNombreIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVentaRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nombre",
                    		lv_nombre_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleVenta630); 

                	newLeafNode(otherlv_1, grammarAccess.getVentaAccess().getComproKeyword_1());
                
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:339:1: ( ( (lv_unaListaDeCompras_2_0= ruleMercaderia ) ) (otherlv_3= ',' )? )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_INT) ) {
                    int LA4_2 = input.LA(2);

                    if ( ((LA4_2>=23 && LA4_2<=27)) ) {
                        alt4=1;
                    }


                }
                else if ( ((LA4_0>=21 && LA4_0<=27)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:339:2: ( (lv_unaListaDeCompras_2_0= ruleMercaderia ) ) (otherlv_3= ',' )?
            	    {
            	    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:339:2: ( (lv_unaListaDeCompras_2_0= ruleMercaderia ) )
            	    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:340:1: (lv_unaListaDeCompras_2_0= ruleMercaderia )
            	    {
            	    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:340:1: (lv_unaListaDeCompras_2_0= ruleMercaderia )
            	    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:341:3: lv_unaListaDeCompras_2_0= ruleMercaderia
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVentaAccess().getUnaListaDeComprasMercaderiaParserRuleCall_2_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMercaderia_in_ruleVenta652);
            	    lv_unaListaDeCompras_2_0=ruleMercaderia();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVentaRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"unaListaDeCompras",
            	            		lv_unaListaDeCompras_2_0, 
            	            		"Mercaderia");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:357:2: (otherlv_3= ',' )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==11) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:357:4: otherlv_3= ','
            	            {
            	            otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleVenta665); 

            	                	newLeafNode(otherlv_3, grammarAccess.getVentaAccess().getCommaKeyword_2_1());
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:361:5: (otherlv_4= 'se redondea a' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:361:7: otherlv_4= 'se redondea a'
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleVenta682); 

                        	newLeafNode(otherlv_4, grammarAccess.getVentaAccess().getSeRedondeaAKeyword_3());
                        

                    }
                    break;

            }

            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:365:3: ( (lv_unImporte_5_0= ruleImporte ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:366:1: (lv_unImporte_5_0= ruleImporte )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:366:1: (lv_unImporte_5_0= ruleImporte )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:367:3: lv_unImporte_5_0= ruleImporte
            {
             
            	        newCompositeNode(grammarAccess.getVentaAccess().getUnImporteImporteParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleImporte_in_ruleVenta705);
            lv_unImporte_5_0=ruleImporte();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVentaRule());
            	        }
                   		set(
                   			current, 
                   			"unImporte",
                    		lv_unImporte_5_0, 
                    		"Importe");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,11,FOLLOW_11_in_ruleVenta717); 

                	newLeafNode(otherlv_6, grammarAccess.getVentaAccess().getCommaKeyword_5());
                
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:387:1: ( (lv_unTotal_7_0= ruleTotalDeCompra ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:388:1: (lv_unTotal_7_0= ruleTotalDeCompra )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:388:1: (lv_unTotal_7_0= ruleTotalDeCompra )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:389:3: lv_unTotal_7_0= ruleTotalDeCompra
            {
             
            	        newCompositeNode(grammarAccess.getVentaAccess().getUnTotalTotalDeCompraParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleTotalDeCompra_in_ruleVenta738);
            lv_unTotal_7_0=ruleTotalDeCompra();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVentaRule());
            	        }
                   		set(
                   			current, 
                   			"unTotal",
                    		lv_unTotal_7_0, 
                    		"TotalDeCompra");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,12,FOLLOW_12_in_ruleVenta750); 

                	newLeafNode(otherlv_8, grammarAccess.getVentaAccess().getFullStopKeyword_7());
                

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
    // $ANTLR end "ruleVenta"


    // $ANTLR start "entryRuleTotalDeCompra"
    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:417:1: entryRuleTotalDeCompra returns [EObject current=null] : iv_ruleTotalDeCompra= ruleTotalDeCompra EOF ;
    public final EObject entryRuleTotalDeCompra() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTotalDeCompra = null;


        try {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:418:2: (iv_ruleTotalDeCompra= ruleTotalDeCompra EOF )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:419:2: iv_ruleTotalDeCompra= ruleTotalDeCompra EOF
            {
             newCompositeNode(grammarAccess.getTotalDeCompraRule()); 
            pushFollow(FOLLOW_ruleTotalDeCompra_in_entryRuleTotalDeCompra786);
            iv_ruleTotalDeCompra=ruleTotalDeCompra();

            state._fsp--;

             current =iv_ruleTotalDeCompra; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTotalDeCompra796); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTotalDeCompra"


    // $ANTLR start "ruleTotalDeCompra"
    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:426:1: ruleTotalDeCompra returns [EObject current=null] : ( ( ( (lv_unTotal_0_1= 'paga' | lv_unTotal_0_2= 'queda debiendo' ) ) ) ( (lv_unImporteTotal_1_0= ruleImporte ) )? ) ;
    public final EObject ruleTotalDeCompra() throws RecognitionException {
        EObject current = null;

        Token lv_unTotal_0_1=null;
        Token lv_unTotal_0_2=null;
        EObject lv_unImporteTotal_1_0 = null;


         enterRule(); 
            
        try {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:429:28: ( ( ( ( (lv_unTotal_0_1= 'paga' | lv_unTotal_0_2= 'queda debiendo' ) ) ) ( (lv_unImporteTotal_1_0= ruleImporte ) )? ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:430:1: ( ( ( (lv_unTotal_0_1= 'paga' | lv_unTotal_0_2= 'queda debiendo' ) ) ) ( (lv_unImporteTotal_1_0= ruleImporte ) )? )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:430:1: ( ( ( (lv_unTotal_0_1= 'paga' | lv_unTotal_0_2= 'queda debiendo' ) ) ) ( (lv_unImporteTotal_1_0= ruleImporte ) )? )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:430:2: ( ( (lv_unTotal_0_1= 'paga' | lv_unTotal_0_2= 'queda debiendo' ) ) ) ( (lv_unImporteTotal_1_0= ruleImporte ) )?
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:430:2: ( ( (lv_unTotal_0_1= 'paga' | lv_unTotal_0_2= 'queda debiendo' ) ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:431:1: ( (lv_unTotal_0_1= 'paga' | lv_unTotal_0_2= 'queda debiendo' ) )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:431:1: ( (lv_unTotal_0_1= 'paga' | lv_unTotal_0_2= 'queda debiendo' ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:432:1: (lv_unTotal_0_1= 'paga' | lv_unTotal_0_2= 'queda debiendo' )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:432:1: (lv_unTotal_0_1= 'paga' | lv_unTotal_0_2= 'queda debiendo' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:433:3: lv_unTotal_0_1= 'paga'
                    {
                    lv_unTotal_0_1=(Token)match(input,15,FOLLOW_15_in_ruleTotalDeCompra841); 

                            newLeafNode(lv_unTotal_0_1, grammarAccess.getTotalDeCompraAccess().getUnTotalPagaKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTotalDeCompraRule());
                    	        }
                           		setWithLastConsumed(current, "unTotal", lv_unTotal_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:445:8: lv_unTotal_0_2= 'queda debiendo'
                    {
                    lv_unTotal_0_2=(Token)match(input,16,FOLLOW_16_in_ruleTotalDeCompra870); 

                            newLeafNode(lv_unTotal_0_2, grammarAccess.getTotalDeCompraAccess().getUnTotalQuedaDebiendoKeyword_0_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTotalDeCompraRule());
                    	        }
                           		setWithLastConsumed(current, "unTotal", lv_unTotal_0_2, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:460:2: ( (lv_unImporteTotal_1_0= ruleImporte ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:461:1: (lv_unImporteTotal_1_0= ruleImporte )
                    {
                    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:461:1: (lv_unImporteTotal_1_0= ruleImporte )
                    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:462:3: lv_unImporteTotal_1_0= ruleImporte
                    {
                     
                    	        newCompositeNode(grammarAccess.getTotalDeCompraAccess().getUnImporteTotalImporteParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleImporte_in_ruleTotalDeCompra907);
                    lv_unImporteTotal_1_0=ruleImporte();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTotalDeCompraRule());
                    	        }
                           		set(
                           			current, 
                           			"unImporteTotal",
                            		lv_unImporteTotal_1_0, 
                            		"Importe");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleTotalDeCompra"


    // $ANTLR start "entryRuleMercaderia"
    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:486:1: entryRuleMercaderia returns [EObject current=null] : iv_ruleMercaderia= ruleMercaderia EOF ;
    public final EObject entryRuleMercaderia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMercaderia = null;


        try {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:487:2: (iv_ruleMercaderia= ruleMercaderia EOF )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:488:2: iv_ruleMercaderia= ruleMercaderia EOF
            {
             newCompositeNode(grammarAccess.getMercaderiaRule()); 
            pushFollow(FOLLOW_ruleMercaderia_in_entryRuleMercaderia944);
            iv_ruleMercaderia=ruleMercaderia();

            state._fsp--;

             current =iv_ruleMercaderia; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMercaderia954); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMercaderia"


    // $ANTLR start "ruleMercaderia"
    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:495:1: ruleMercaderia returns [EObject current=null] : ( ( (lv_unaDescripcion_0_0= ruleCantidad ) ) otherlv_1= 'de' ( (lv_nombreDeProducto_2_0= RULE_ID ) ) ) ;
    public final EObject ruleMercaderia() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_nombreDeProducto_2_0=null;
        EObject lv_unaDescripcion_0_0 = null;


         enterRule(); 
            
        try {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:498:28: ( ( ( (lv_unaDescripcion_0_0= ruleCantidad ) ) otherlv_1= 'de' ( (lv_nombreDeProducto_2_0= RULE_ID ) ) ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:499:1: ( ( (lv_unaDescripcion_0_0= ruleCantidad ) ) otherlv_1= 'de' ( (lv_nombreDeProducto_2_0= RULE_ID ) ) )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:499:1: ( ( (lv_unaDescripcion_0_0= ruleCantidad ) ) otherlv_1= 'de' ( (lv_nombreDeProducto_2_0= RULE_ID ) ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:499:2: ( (lv_unaDescripcion_0_0= ruleCantidad ) ) otherlv_1= 'de' ( (lv_nombreDeProducto_2_0= RULE_ID ) )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:499:2: ( (lv_unaDescripcion_0_0= ruleCantidad ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:500:1: (lv_unaDescripcion_0_0= ruleCantidad )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:500:1: (lv_unaDescripcion_0_0= ruleCantidad )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:501:3: lv_unaDescripcion_0_0= ruleCantidad
            {
             
            	        newCompositeNode(grammarAccess.getMercaderiaAccess().getUnaDescripcionCantidadParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleCantidad_in_ruleMercaderia1000);
            lv_unaDescripcion_0_0=ruleCantidad();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMercaderiaRule());
            	        }
                   		set(
                   			current, 
                   			"unaDescripcion",
                    		lv_unaDescripcion_0_0, 
                    		"Cantidad");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleMercaderia1012); 

                	newLeafNode(otherlv_1, grammarAccess.getMercaderiaAccess().getDeKeyword_1());
                
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:521:1: ( (lv_nombreDeProducto_2_0= RULE_ID ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:522:1: (lv_nombreDeProducto_2_0= RULE_ID )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:522:1: (lv_nombreDeProducto_2_0= RULE_ID )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:523:3: lv_nombreDeProducto_2_0= RULE_ID
            {
            lv_nombreDeProducto_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMercaderia1029); 

            			newLeafNode(lv_nombreDeProducto_2_0, grammarAccess.getMercaderiaAccess().getNombreDeProductoIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMercaderiaRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nombreDeProducto",
                    		lv_nombreDeProducto_2_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleMercaderia"


    // $ANTLR start "entryRuleProducto"
    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:547:1: entryRuleProducto returns [EObject current=null] : iv_ruleProducto= ruleProducto EOF ;
    public final EObject entryRuleProducto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProducto = null;


        try {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:548:2: (iv_ruleProducto= ruleProducto EOF )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:549:2: iv_ruleProducto= ruleProducto EOF
            {
             newCompositeNode(grammarAccess.getProductoRule()); 
            pushFollow(FOLLOW_ruleProducto_in_entryRuleProducto1070);
            iv_ruleProducto=ruleProducto();

            state._fsp--;

             current =iv_ruleProducto; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProducto1080); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProducto"


    // $ANTLR start "ruleProducto"
    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:556:1: ruleProducto returns [EObject current=null] : ( (otherlv_0= 'Las' | otherlv_1= 'Los' ) ( (lv_nombreDeProducto_2_0= RULE_ID ) ) ) ;
    public final EObject ruleProducto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_nombreDeProducto_2_0=null;

         enterRule(); 
            
        try {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:559:28: ( ( (otherlv_0= 'Las' | otherlv_1= 'Los' ) ( (lv_nombreDeProducto_2_0= RULE_ID ) ) ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:560:1: ( (otherlv_0= 'Las' | otherlv_1= 'Los' ) ( (lv_nombreDeProducto_2_0= RULE_ID ) ) )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:560:1: ( (otherlv_0= 'Las' | otherlv_1= 'Los' ) ( (lv_nombreDeProducto_2_0= RULE_ID ) ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:560:2: (otherlv_0= 'Las' | otherlv_1= 'Los' ) ( (lv_nombreDeProducto_2_0= RULE_ID ) )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:560:2: (otherlv_0= 'Las' | otherlv_1= 'Los' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            else if ( (LA8_0==19) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:560:4: otherlv_0= 'Las'
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleProducto1118); 

                        	newLeafNode(otherlv_0, grammarAccess.getProductoAccess().getLasKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:565:7: otherlv_1= 'Los'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleProducto1136); 

                        	newLeafNode(otherlv_1, grammarAccess.getProductoAccess().getLosKeyword_0_1());
                        

                    }
                    break;

            }

            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:569:2: ( (lv_nombreDeProducto_2_0= RULE_ID ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:570:1: (lv_nombreDeProducto_2_0= RULE_ID )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:570:1: (lv_nombreDeProducto_2_0= RULE_ID )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:571:3: lv_nombreDeProducto_2_0= RULE_ID
            {
            lv_nombreDeProducto_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProducto1154); 

            			newLeafNode(lv_nombreDeProducto_2_0, grammarAccess.getProductoAccess().getNombreDeProductoIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProductoRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nombreDeProducto",
                    		lv_nombreDeProducto_2_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleProducto"


    // $ANTLR start "entryRuleValorDelProducto"
    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:595:1: entryRuleValorDelProducto returns [EObject current=null] : iv_ruleValorDelProducto= ruleValorDelProducto EOF ;
    public final EObject entryRuleValorDelProducto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValorDelProducto = null;


        try {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:596:2: (iv_ruleValorDelProducto= ruleValorDelProducto EOF )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:597:2: iv_ruleValorDelProducto= ruleValorDelProducto EOF
            {
             newCompositeNode(grammarAccess.getValorDelProductoRule()); 
            pushFollow(FOLLOW_ruleValorDelProducto_in_entryRuleValorDelProducto1195);
            iv_ruleValorDelProducto=ruleValorDelProducto();

            state._fsp--;

             current =iv_ruleValorDelProducto; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValorDelProducto1205); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValorDelProducto"


    // $ANTLR start "ruleValorDelProducto"
    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:604:1: ruleValorDelProducto returns [EObject current=null] : (otherlv_0= 'salen' ( (lv_unaDescripcion_1_0= ruleDescripcion ) ) ) ;
    public final EObject ruleValorDelProducto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_unaDescripcion_1_0 = null;


         enterRule(); 
            
        try {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:607:28: ( (otherlv_0= 'salen' ( (lv_unaDescripcion_1_0= ruleDescripcion ) ) ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:608:1: (otherlv_0= 'salen' ( (lv_unaDescripcion_1_0= ruleDescripcion ) ) )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:608:1: (otherlv_0= 'salen' ( (lv_unaDescripcion_1_0= ruleDescripcion ) ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:608:3: otherlv_0= 'salen' ( (lv_unaDescripcion_1_0= ruleDescripcion ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleValorDelProducto1242); 

                	newLeafNode(otherlv_0, grammarAccess.getValorDelProductoAccess().getSalenKeyword_0());
                
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:612:1: ( (lv_unaDescripcion_1_0= ruleDescripcion ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:613:1: (lv_unaDescripcion_1_0= ruleDescripcion )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:613:1: (lv_unaDescripcion_1_0= ruleDescripcion )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:614:3: lv_unaDescripcion_1_0= ruleDescripcion
            {
             
            	        newCompositeNode(grammarAccess.getValorDelProductoAccess().getUnaDescripcionDescripcionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDescripcion_in_ruleValorDelProducto1263);
            lv_unaDescripcion_1_0=ruleDescripcion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValorDelProductoRule());
            	        }
                   		set(
                   			current, 
                   			"unaDescripcion",
                    		lv_unaDescripcion_1_0, 
                    		"Descripcion");
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
    // $ANTLR end "ruleValorDelProducto"


    // $ANTLR start "entryRuleDescripcion"
    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:638:1: entryRuleDescripcion returns [EObject current=null] : iv_ruleDescripcion= ruleDescripcion EOF ;
    public final EObject entryRuleDescripcion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescripcion = null;


        try {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:639:2: (iv_ruleDescripcion= ruleDescripcion EOF )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:640:2: iv_ruleDescripcion= ruleDescripcion EOF
            {
             newCompositeNode(grammarAccess.getDescripcionRule()); 
            pushFollow(FOLLOW_ruleDescripcion_in_entryRuleDescripcion1299);
            iv_ruleDescripcion=ruleDescripcion();

            state._fsp--;

             current =iv_ruleDescripcion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDescripcion1309); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDescripcion"


    // $ANTLR start "ruleDescripcion"
    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:647:1: ruleDescripcion returns [EObject current=null] : ( ( (lv_unImporte_0_0= ruleImporte ) ) ( (lv_unaCantidad_1_0= ruleCantidad ) ) ) ;
    public final EObject ruleDescripcion() throws RecognitionException {
        EObject current = null;

        EObject lv_unImporte_0_0 = null;

        EObject lv_unaCantidad_1_0 = null;


         enterRule(); 
            
        try {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:650:28: ( ( ( (lv_unImporte_0_0= ruleImporte ) ) ( (lv_unaCantidad_1_0= ruleCantidad ) ) ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:651:1: ( ( (lv_unImporte_0_0= ruleImporte ) ) ( (lv_unaCantidad_1_0= ruleCantidad ) ) )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:651:1: ( ( (lv_unImporte_0_0= ruleImporte ) ) ( (lv_unaCantidad_1_0= ruleCantidad ) ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:651:2: ( (lv_unImporte_0_0= ruleImporte ) ) ( (lv_unaCantidad_1_0= ruleCantidad ) )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:651:2: ( (lv_unImporte_0_0= ruleImporte ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:652:1: (lv_unImporte_0_0= ruleImporte )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:652:1: (lv_unImporte_0_0= ruleImporte )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:653:3: lv_unImporte_0_0= ruleImporte
            {
             
            	        newCompositeNode(grammarAccess.getDescripcionAccess().getUnImporteImporteParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleImporte_in_ruleDescripcion1355);
            lv_unImporte_0_0=ruleImporte();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDescripcionRule());
            	        }
                   		set(
                   			current, 
                   			"unImporte",
                    		lv_unImporte_0_0, 
                    		"Importe");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:669:2: ( (lv_unaCantidad_1_0= ruleCantidad ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:670:1: (lv_unaCantidad_1_0= ruleCantidad )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:670:1: (lv_unaCantidad_1_0= ruleCantidad )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:671:3: lv_unaCantidad_1_0= ruleCantidad
            {
             
            	        newCompositeNode(grammarAccess.getDescripcionAccess().getUnaCantidadCantidadParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCantidad_in_ruleDescripcion1376);
            lv_unaCantidad_1_0=ruleCantidad();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDescripcionRule());
            	        }
                   		set(
                   			current, 
                   			"unaCantidad",
                    		lv_unaCantidad_1_0, 
                    		"Cantidad");
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
    // $ANTLR end "ruleDescripcion"


    // $ANTLR start "entryRuleCantidad"
    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:695:1: entryRuleCantidad returns [EObject current=null] : iv_ruleCantidad= ruleCantidad EOF ;
    public final EObject entryRuleCantidad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCantidad = null;


        try {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:696:2: (iv_ruleCantidad= ruleCantidad EOF )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:697:2: iv_ruleCantidad= ruleCantidad EOF
            {
             newCompositeNode(grammarAccess.getCantidadRule()); 
            pushFollow(FOLLOW_ruleCantidad_in_entryRuleCantidad1412);
            iv_ruleCantidad=ruleCantidad();

            state._fsp--;

             current =iv_ruleCantidad; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCantidad1422); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCantidad"


    // $ANTLR start "ruleCantidad"
    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:704:1: ruleCantidad returns [EObject current=null] : ( ( (lv_unArticulo_0_0= ruleArticulo ) )? ( (lv_unValor_1_0= RULE_INT ) )? ( (lv_unaCantidad_2_0= ruleUnidad ) ) ) ;
    public final EObject ruleCantidad() throws RecognitionException {
        EObject current = null;

        Token lv_unValor_1_0=null;
        EObject lv_unArticulo_0_0 = null;

        EObject lv_unaCantidad_2_0 = null;


         enterRule(); 
            
        try {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:707:28: ( ( ( (lv_unArticulo_0_0= ruleArticulo ) )? ( (lv_unValor_1_0= RULE_INT ) )? ( (lv_unaCantidad_2_0= ruleUnidad ) ) ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:708:1: ( ( (lv_unArticulo_0_0= ruleArticulo ) )? ( (lv_unValor_1_0= RULE_INT ) )? ( (lv_unaCantidad_2_0= ruleUnidad ) ) )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:708:1: ( ( (lv_unArticulo_0_0= ruleArticulo ) )? ( (lv_unValor_1_0= RULE_INT ) )? ( (lv_unaCantidad_2_0= ruleUnidad ) ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:708:2: ( (lv_unArticulo_0_0= ruleArticulo ) )? ( (lv_unValor_1_0= RULE_INT ) )? ( (lv_unaCantidad_2_0= ruleUnidad ) )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:708:2: ( (lv_unArticulo_0_0= ruleArticulo ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=21 && LA9_0<=22)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:709:1: (lv_unArticulo_0_0= ruleArticulo )
                    {
                    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:709:1: (lv_unArticulo_0_0= ruleArticulo )
                    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:710:3: lv_unArticulo_0_0= ruleArticulo
                    {
                     
                    	        newCompositeNode(grammarAccess.getCantidadAccess().getUnArticuloArticuloParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArticulo_in_ruleCantidad1468);
                    lv_unArticulo_0_0=ruleArticulo();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCantidadRule());
                    	        }
                           		set(
                           			current, 
                           			"unArticulo",
                            		lv_unArticulo_0_0, 
                            		"Articulo");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:726:3: ( (lv_unValor_1_0= RULE_INT ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:727:1: (lv_unValor_1_0= RULE_INT )
                    {
                    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:727:1: (lv_unValor_1_0= RULE_INT )
                    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:728:3: lv_unValor_1_0= RULE_INT
                    {
                    lv_unValor_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCantidad1486); 

                    			newLeafNode(lv_unValor_1_0, grammarAccess.getCantidadAccess().getUnValorINTTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCantidadRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"unValor",
                            		lv_unValor_1_0, 
                            		"INT");
                    	    

                    }


                    }
                    break;

            }

            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:744:3: ( (lv_unaCantidad_2_0= ruleUnidad ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:745:1: (lv_unaCantidad_2_0= ruleUnidad )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:745:1: (lv_unaCantidad_2_0= ruleUnidad )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:746:3: lv_unaCantidad_2_0= ruleUnidad
            {
             
            	        newCompositeNode(grammarAccess.getCantidadAccess().getUnaCantidadUnidadParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleUnidad_in_ruleCantidad1513);
            lv_unaCantidad_2_0=ruleUnidad();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCantidadRule());
            	        }
                   		set(
                   			current, 
                   			"unaCantidad",
                    		lv_unaCantidad_2_0, 
                    		"Unidad");
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
    // $ANTLR end "ruleCantidad"


    // $ANTLR start "entryRuleArticulo"
    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:770:1: entryRuleArticulo returns [EObject current=null] : iv_ruleArticulo= ruleArticulo EOF ;
    public final EObject entryRuleArticulo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArticulo = null;


        try {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:771:2: (iv_ruleArticulo= ruleArticulo EOF )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:772:2: iv_ruleArticulo= ruleArticulo EOF
            {
             newCompositeNode(grammarAccess.getArticuloRule()); 
            pushFollow(FOLLOW_ruleArticulo_in_entryRuleArticulo1549);
            iv_ruleArticulo=ruleArticulo();

            state._fsp--;

             current =iv_ruleArticulo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArticulo1559); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArticulo"


    // $ANTLR start "ruleArticulo"
    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:779:1: ruleArticulo returns [EObject current=null] : ( ( (lv_unArticulo_0_1= 'el' | lv_unArticulo_0_2= 'los' ) ) ) ;
    public final EObject ruleArticulo() throws RecognitionException {
        EObject current = null;

        Token lv_unArticulo_0_1=null;
        Token lv_unArticulo_0_2=null;

         enterRule(); 
            
        try {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:782:28: ( ( ( (lv_unArticulo_0_1= 'el' | lv_unArticulo_0_2= 'los' ) ) ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:783:1: ( ( (lv_unArticulo_0_1= 'el' | lv_unArticulo_0_2= 'los' ) ) )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:783:1: ( ( (lv_unArticulo_0_1= 'el' | lv_unArticulo_0_2= 'los' ) ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:784:1: ( (lv_unArticulo_0_1= 'el' | lv_unArticulo_0_2= 'los' ) )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:784:1: ( (lv_unArticulo_0_1= 'el' | lv_unArticulo_0_2= 'los' ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:785:1: (lv_unArticulo_0_1= 'el' | lv_unArticulo_0_2= 'los' )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:785:1: (lv_unArticulo_0_1= 'el' | lv_unArticulo_0_2= 'los' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            else if ( (LA11_0==22) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:786:3: lv_unArticulo_0_1= 'el'
                    {
                    lv_unArticulo_0_1=(Token)match(input,21,FOLLOW_21_in_ruleArticulo1603); 

                            newLeafNode(lv_unArticulo_0_1, grammarAccess.getArticuloAccess().getUnArticuloElKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArticuloRule());
                    	        }
                           		setWithLastConsumed(current, "unArticulo", lv_unArticulo_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:798:8: lv_unArticulo_0_2= 'los'
                    {
                    lv_unArticulo_0_2=(Token)match(input,22,FOLLOW_22_in_ruleArticulo1632); 

                            newLeafNode(lv_unArticulo_0_2, grammarAccess.getArticuloAccess().getUnArticuloLosKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArticuloRule());
                    	        }
                           		setWithLastConsumed(current, "unArticulo", lv_unArticulo_0_2, null);
                    	    

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
    // $ANTLR end "ruleArticulo"


    // $ANTLR start "entryRuleUnidad"
    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:821:1: entryRuleUnidad returns [EObject current=null] : iv_ruleUnidad= ruleUnidad EOF ;
    public final EObject entryRuleUnidad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnidad = null;


        try {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:822:2: (iv_ruleUnidad= ruleUnidad EOF )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:823:2: iv_ruleUnidad= ruleUnidad EOF
            {
             newCompositeNode(grammarAccess.getUnidadRule()); 
            pushFollow(FOLLOW_ruleUnidad_in_entryRuleUnidad1683);
            iv_ruleUnidad=ruleUnidad();

            state._fsp--;

             current =iv_ruleUnidad; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnidad1693); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnidad"


    // $ANTLR start "ruleUnidad"
    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:830:1: ruleUnidad returns [EObject current=null] : ( ( (lv_unaUnidad_0_1= 'kilo' | lv_unaUnidad_0_2= 'kilos' | lv_unaUnidad_0_3= 'medio kilo' | lv_unaUnidad_0_4= 'cuarto kilo' | lv_unaUnidad_0_5= 'gramos' ) ) ) ;
    public final EObject ruleUnidad() throws RecognitionException {
        EObject current = null;

        Token lv_unaUnidad_0_1=null;
        Token lv_unaUnidad_0_2=null;
        Token lv_unaUnidad_0_3=null;
        Token lv_unaUnidad_0_4=null;
        Token lv_unaUnidad_0_5=null;

         enterRule(); 
            
        try {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:833:28: ( ( ( (lv_unaUnidad_0_1= 'kilo' | lv_unaUnidad_0_2= 'kilos' | lv_unaUnidad_0_3= 'medio kilo' | lv_unaUnidad_0_4= 'cuarto kilo' | lv_unaUnidad_0_5= 'gramos' ) ) ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:834:1: ( ( (lv_unaUnidad_0_1= 'kilo' | lv_unaUnidad_0_2= 'kilos' | lv_unaUnidad_0_3= 'medio kilo' | lv_unaUnidad_0_4= 'cuarto kilo' | lv_unaUnidad_0_5= 'gramos' ) ) )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:834:1: ( ( (lv_unaUnidad_0_1= 'kilo' | lv_unaUnidad_0_2= 'kilos' | lv_unaUnidad_0_3= 'medio kilo' | lv_unaUnidad_0_4= 'cuarto kilo' | lv_unaUnidad_0_5= 'gramos' ) ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:835:1: ( (lv_unaUnidad_0_1= 'kilo' | lv_unaUnidad_0_2= 'kilos' | lv_unaUnidad_0_3= 'medio kilo' | lv_unaUnidad_0_4= 'cuarto kilo' | lv_unaUnidad_0_5= 'gramos' ) )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:835:1: ( (lv_unaUnidad_0_1= 'kilo' | lv_unaUnidad_0_2= 'kilos' | lv_unaUnidad_0_3= 'medio kilo' | lv_unaUnidad_0_4= 'cuarto kilo' | lv_unaUnidad_0_5= 'gramos' ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:836:1: (lv_unaUnidad_0_1= 'kilo' | lv_unaUnidad_0_2= 'kilos' | lv_unaUnidad_0_3= 'medio kilo' | lv_unaUnidad_0_4= 'cuarto kilo' | lv_unaUnidad_0_5= 'gramos' )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:836:1: (lv_unaUnidad_0_1= 'kilo' | lv_unaUnidad_0_2= 'kilos' | lv_unaUnidad_0_3= 'medio kilo' | lv_unaUnidad_0_4= 'cuarto kilo' | lv_unaUnidad_0_5= 'gramos' )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt12=1;
                }
                break;
            case 24:
                {
                alt12=2;
                }
                break;
            case 25:
                {
                alt12=3;
                }
                break;
            case 26:
                {
                alt12=4;
                }
                break;
            case 27:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:837:3: lv_unaUnidad_0_1= 'kilo'
                    {
                    lv_unaUnidad_0_1=(Token)match(input,23,FOLLOW_23_in_ruleUnidad1737); 

                            newLeafNode(lv_unaUnidad_0_1, grammarAccess.getUnidadAccess().getUnaUnidadKiloKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUnidadRule());
                    	        }
                           		setWithLastConsumed(current, "unaUnidad", lv_unaUnidad_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:849:8: lv_unaUnidad_0_2= 'kilos'
                    {
                    lv_unaUnidad_0_2=(Token)match(input,24,FOLLOW_24_in_ruleUnidad1766); 

                            newLeafNode(lv_unaUnidad_0_2, grammarAccess.getUnidadAccess().getUnaUnidadKilosKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUnidadRule());
                    	        }
                           		setWithLastConsumed(current, "unaUnidad", lv_unaUnidad_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:861:8: lv_unaUnidad_0_3= 'medio kilo'
                    {
                    lv_unaUnidad_0_3=(Token)match(input,25,FOLLOW_25_in_ruleUnidad1795); 

                            newLeafNode(lv_unaUnidad_0_3, grammarAccess.getUnidadAccess().getUnaUnidadMedioKiloKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUnidadRule());
                    	        }
                           		setWithLastConsumed(current, "unaUnidad", lv_unaUnidad_0_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:873:8: lv_unaUnidad_0_4= 'cuarto kilo'
                    {
                    lv_unaUnidad_0_4=(Token)match(input,26,FOLLOW_26_in_ruleUnidad1824); 

                            newLeafNode(lv_unaUnidad_0_4, grammarAccess.getUnidadAccess().getUnaUnidadCuartoKiloKeyword_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUnidadRule());
                    	        }
                           		setWithLastConsumed(current, "unaUnidad", lv_unaUnidad_0_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:885:8: lv_unaUnidad_0_5= 'gramos'
                    {
                    lv_unaUnidad_0_5=(Token)match(input,27,FOLLOW_27_in_ruleUnidad1853); 

                            newLeafNode(lv_unaUnidad_0_5, grammarAccess.getUnidadAccess().getUnaUnidadGramosKeyword_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUnidadRule());
                    	        }
                           		setWithLastConsumed(current, "unaUnidad", lv_unaUnidad_0_5, null);
                    	    

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
    // $ANTLR end "ruleUnidad"


    // $ANTLR start "entryRuleCliente"
    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:908:1: entryRuleCliente returns [EObject current=null] : iv_ruleCliente= ruleCliente EOF ;
    public final EObject entryRuleCliente() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCliente = null;


        try {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:909:2: (iv_ruleCliente= ruleCliente EOF )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:910:2: iv_ruleCliente= ruleCliente EOF
            {
             newCompositeNode(grammarAccess.getClienteRule()); 
            pushFollow(FOLLOW_ruleCliente_in_entryRuleCliente1904);
            iv_ruleCliente=ruleCliente();

            state._fsp--;

             current =iv_ruleCliente; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCliente1914); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCliente"


    // $ANTLR start "ruleCliente"
    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:917:1: ruleCliente returns [EObject current=null] : (otherlv_0= 'Cliente' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleCliente() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:920:28: ( (otherlv_0= 'Cliente' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:921:1: (otherlv_0= 'Cliente' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:921:1: (otherlv_0= 'Cliente' ( (lv_name_1_0= RULE_ID ) ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:921:3: otherlv_0= 'Cliente' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleCliente1951); 

                	newLeafNode(otherlv_0, grammarAccess.getClienteAccess().getClienteKeyword_0());
                
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:925:1: ( (lv_name_1_0= RULE_ID ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:926:1: (lv_name_1_0= RULE_ID )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:926:1: (lv_name_1_0= RULE_ID )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:927:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCliente1968); 

            			newLeafNode(lv_name_1_0, grammarAccess.getClienteAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClienteRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleCliente"


    // $ANTLR start "entryRuleEstadoDeuda"
    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:951:1: entryRuleEstadoDeuda returns [EObject current=null] : iv_ruleEstadoDeuda= ruleEstadoDeuda EOF ;
    public final EObject entryRuleEstadoDeuda() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEstadoDeuda = null;


        try {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:952:2: (iv_ruleEstadoDeuda= ruleEstadoDeuda EOF )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:953:2: iv_ruleEstadoDeuda= ruleEstadoDeuda EOF
            {
             newCompositeNode(grammarAccess.getEstadoDeudaRule()); 
            pushFollow(FOLLOW_ruleEstadoDeuda_in_entryRuleEstadoDeuda2009);
            iv_ruleEstadoDeuda=ruleEstadoDeuda();

            state._fsp--;

             current =iv_ruleEstadoDeuda; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEstadoDeuda2019); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEstadoDeuda"


    // $ANTLR start "ruleEstadoDeuda"
    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:960:1: ruleEstadoDeuda returns [EObject current=null] : ( (otherlv_0= 'debe' | otherlv_1= 'al dia' | otherlv_2= 'tiene credito' ) (this_Importe_3= ruleImporte )? ) ;
    public final EObject ruleEstadoDeuda() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject this_Importe_3 = null;


         enterRule(); 
            
        try {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:963:28: ( ( (otherlv_0= 'debe' | otherlv_1= 'al dia' | otherlv_2= 'tiene credito' ) (this_Importe_3= ruleImporte )? ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:964:1: ( (otherlv_0= 'debe' | otherlv_1= 'al dia' | otherlv_2= 'tiene credito' ) (this_Importe_3= ruleImporte )? )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:964:1: ( (otherlv_0= 'debe' | otherlv_1= 'al dia' | otherlv_2= 'tiene credito' ) (this_Importe_3= ruleImporte )? )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:964:2: (otherlv_0= 'debe' | otherlv_1= 'al dia' | otherlv_2= 'tiene credito' ) (this_Importe_3= ruleImporte )?
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:964:2: (otherlv_0= 'debe' | otherlv_1= 'al dia' | otherlv_2= 'tiene credito' )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt13=1;
                }
                break;
            case 30:
                {
                alt13=2;
                }
                break;
            case 31:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:964:4: otherlv_0= 'debe'
                    {
                    otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleEstadoDeuda2057); 

                        	newLeafNode(otherlv_0, grammarAccess.getEstadoDeudaAccess().getDebeKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:969:7: otherlv_1= 'al dia'
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleEstadoDeuda2075); 

                        	newLeafNode(otherlv_1, grammarAccess.getEstadoDeudaAccess().getAlDiaKeyword_0_1());
                        

                    }
                    break;
                case 3 :
                    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:974:7: otherlv_2= 'tiene credito'
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleEstadoDeuda2093); 

                        	newLeafNode(otherlv_2, grammarAccess.getEstadoDeudaAccess().getTieneCreditoKeyword_0_2());
                        

                    }
                    break;

            }

            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:978:2: (this_Importe_3= ruleImporte )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:979:5: this_Importe_3= ruleImporte
                    {
                     
                            newCompositeNode(grammarAccess.getEstadoDeudaAccess().getImporteParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleImporte_in_ruleEstadoDeuda2117);
                    this_Importe_3=ruleImporte();

                    state._fsp--;

                     
                            current = this_Importe_3; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleEstadoDeuda"


    // $ANTLR start "entryRuleImporte"
    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:995:1: entryRuleImporte returns [EObject current=null] : iv_ruleImporte= ruleImporte EOF ;
    public final EObject entryRuleImporte() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImporte = null;


        try {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:996:2: (iv_ruleImporte= ruleImporte EOF )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:997:2: iv_ruleImporte= ruleImporte EOF
            {
             newCompositeNode(grammarAccess.getImporteRule()); 
            pushFollow(FOLLOW_ruleImporte_in_entryRuleImporte2154);
            iv_ruleImporte=ruleImporte();

            state._fsp--;

             current =iv_ruleImporte; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImporte2164); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImporte"


    // $ANTLR start "ruleImporte"
    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:1004:1: ruleImporte returns [EObject current=null] : ( ( (lv_valor_0_0= RULE_INT ) ) ( (lv_moneda_1_0= ruleMoneda ) ) ) ;
    public final EObject ruleImporte() throws RecognitionException {
        EObject current = null;

        Token lv_valor_0_0=null;
        EObject lv_moneda_1_0 = null;


         enterRule(); 
            
        try {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:1007:28: ( ( ( (lv_valor_0_0= RULE_INT ) ) ( (lv_moneda_1_0= ruleMoneda ) ) ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:1008:1: ( ( (lv_valor_0_0= RULE_INT ) ) ( (lv_moneda_1_0= ruleMoneda ) ) )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:1008:1: ( ( (lv_valor_0_0= RULE_INT ) ) ( (lv_moneda_1_0= ruleMoneda ) ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:1008:2: ( (lv_valor_0_0= RULE_INT ) ) ( (lv_moneda_1_0= ruleMoneda ) )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:1008:2: ( (lv_valor_0_0= RULE_INT ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:1009:1: (lv_valor_0_0= RULE_INT )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:1009:1: (lv_valor_0_0= RULE_INT )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:1010:3: lv_valor_0_0= RULE_INT
            {
            lv_valor_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleImporte2206); 

            			newLeafNode(lv_valor_0_0, grammarAccess.getImporteAccess().getValorINTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImporteRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"valor",
                    		lv_valor_0_0, 
                    		"INT");
            	    

            }


            }

            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:1026:2: ( (lv_moneda_1_0= ruleMoneda ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:1027:1: (lv_moneda_1_0= ruleMoneda )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:1027:1: (lv_moneda_1_0= ruleMoneda )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:1028:3: lv_moneda_1_0= ruleMoneda
            {
             
            	        newCompositeNode(grammarAccess.getImporteAccess().getMonedaMonedaParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleMoneda_in_ruleImporte2232);
            lv_moneda_1_0=ruleMoneda();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImporteRule());
            	        }
                   		set(
                   			current, 
                   			"moneda",
                    		lv_moneda_1_0, 
                    		"Moneda");
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
    // $ANTLR end "ruleImporte"


    // $ANTLR start "entryRuleMoneda"
    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:1052:1: entryRuleMoneda returns [EObject current=null] : iv_ruleMoneda= ruleMoneda EOF ;
    public final EObject entryRuleMoneda() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoneda = null;


        try {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:1053:2: (iv_ruleMoneda= ruleMoneda EOF )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:1054:2: iv_ruleMoneda= ruleMoneda EOF
            {
             newCompositeNode(grammarAccess.getMonedaRule()); 
            pushFollow(FOLLOW_ruleMoneda_in_entryRuleMoneda2268);
            iv_ruleMoneda=ruleMoneda();

            state._fsp--;

             current =iv_ruleMoneda; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMoneda2278); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMoneda"


    // $ANTLR start "ruleMoneda"
    // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:1061:1: ruleMoneda returns [EObject current=null] : ( (lv_pesos_0_0= 'pesos' ) ) ;
    public final EObject ruleMoneda() throws RecognitionException {
        EObject current = null;

        Token lv_pesos_0_0=null;

         enterRule(); 
            
        try {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:1064:28: ( ( (lv_pesos_0_0= 'pesos' ) ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:1065:1: ( (lv_pesos_0_0= 'pesos' ) )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:1065:1: ( (lv_pesos_0_0= 'pesos' ) )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:1066:1: (lv_pesos_0_0= 'pesos' )
            {
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:1066:1: (lv_pesos_0_0= 'pesos' )
            // ../textVerduler/src-gen/textVerduler/parser/antlr/internal/InternalTextVerduler.g:1067:3: lv_pesos_0_0= 'pesos'
            {
            lv_pesos_0_0=(Token)match(input,32,FOLLOW_32_in_ruleMoneda2320); 

                    newLeafNode(lv_pesos_0_0, grammarAccess.getMonedaAccess().getPesosPesosKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMonedaRule());
            	        }
                   		setWithLastConsumed(current, "pesos", lv_pesos_0_0, "pesos");
            	    

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
    // $ANTLR end "ruleMoneda"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleVerduleria_in_entryRuleVerduleria75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerduleria85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelCliente_in_ruleVerduleria132 = new BitSet(new long[]{0x00000000100C0012L});
    public static final BitSet FOLLOW_ruleModelProducto_in_ruleVerduleria151 = new BitSet(new long[]{0x00000000100C0012L});
    public static final BitSet FOLLOW_ruleModelVenta_in_ruleVerduleria170 = new BitSet(new long[]{0x00000000100C0012L});
    public static final BitSet FOLLOW_ruleModelCliente_in_entryRuleModelCliente209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelCliente219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCliente_in_ruleModelCliente265 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleModelCliente277 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_ruleEstadoDeuda_in_ruleModelCliente298 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleModelCliente310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelProducto_in_entryRuleModelProducto346 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelProducto356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProducto_in_ruleModelProducto402 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleValorDelProducto_in_ruleModelProducto423 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleModelProducto435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelVenta_in_entryRuleModelVenta471 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelVenta481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVenta_in_ruleModelVenta526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVenta_in_entryRuleVenta561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVenta571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVenta613 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleVenta630 = new BitSet(new long[]{0x000000000FE04020L});
    public static final BitSet FOLLOW_ruleMercaderia_in_ruleVenta652 = new BitSet(new long[]{0x000000000FE04820L});
    public static final BitSet FOLLOW_11_in_ruleVenta665 = new BitSet(new long[]{0x000000000FE04020L});
    public static final BitSet FOLLOW_14_in_ruleVenta682 = new BitSet(new long[]{0x000000000FE04020L});
    public static final BitSet FOLLOW_ruleImporte_in_ruleVenta705 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleVenta717 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_ruleTotalDeCompra_in_ruleVenta738 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleVenta750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTotalDeCompra_in_entryRuleTotalDeCompra786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTotalDeCompra796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleTotalDeCompra841 = new BitSet(new long[]{0x000000000FE04022L});
    public static final BitSet FOLLOW_16_in_ruleTotalDeCompra870 = new BitSet(new long[]{0x000000000FE04022L});
    public static final BitSet FOLLOW_ruleImporte_in_ruleTotalDeCompra907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMercaderia_in_entryRuleMercaderia944 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMercaderia954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCantidad_in_ruleMercaderia1000 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMercaderia1012 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMercaderia1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProducto_in_entryRuleProducto1070 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProducto1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleProducto1118 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_19_in_ruleProducto1136 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProducto1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValorDelProducto_in_entryRuleValorDelProducto1195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValorDelProducto1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleValorDelProducto1242 = new BitSet(new long[]{0x000000000FE04020L});
    public static final BitSet FOLLOW_ruleDescripcion_in_ruleValorDelProducto1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescripcion_in_entryRuleDescripcion1299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDescripcion1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImporte_in_ruleDescripcion1355 = new BitSet(new long[]{0x000000000FE00020L});
    public static final BitSet FOLLOW_ruleCantidad_in_ruleDescripcion1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCantidad_in_entryRuleCantidad1412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCantidad1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArticulo_in_ruleCantidad1468 = new BitSet(new long[]{0x000000000FE00020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCantidad1486 = new BitSet(new long[]{0x000000000FE00020L});
    public static final BitSet FOLLOW_ruleUnidad_in_ruleCantidad1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArticulo_in_entryRuleArticulo1549 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArticulo1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleArticulo1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleArticulo1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnidad_in_entryRuleUnidad1683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnidad1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleUnidad1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleUnidad1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleUnidad1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleUnidad1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleUnidad1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCliente_in_entryRuleCliente1904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCliente1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleCliente1951 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCliente1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEstadoDeuda_in_entryRuleEstadoDeuda2009 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEstadoDeuda2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleEstadoDeuda2057 = new BitSet(new long[]{0x000000000FE04022L});
    public static final BitSet FOLLOW_30_in_ruleEstadoDeuda2075 = new BitSet(new long[]{0x000000000FE04022L});
    public static final BitSet FOLLOW_31_in_ruleEstadoDeuda2093 = new BitSet(new long[]{0x000000000FE04022L});
    public static final BitSet FOLLOW_ruleImporte_in_ruleEstadoDeuda2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImporte_in_entryRuleImporte2154 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImporte2164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleImporte2206 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ruleMoneda_in_ruleImporte2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMoneda_in_entryRuleMoneda2268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMoneda2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleMoneda2320 = new BitSet(new long[]{0x0000000000000002L});

}