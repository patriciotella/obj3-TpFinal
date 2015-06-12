package textVerduler.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import textVerduler.services.TextVerdulerGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTextVerdulerParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'paga'", "'queda debiendo'", "'Las'", "'Los'", "'el'", "'los'", "'kilo'", "'kilos'", "'medio kilo'", "'cuarto kilo'", "'gramos'", "'debe'", "'al dia'", "'tiene credito'", "','", "'.'", "'compro'", "'se redondea a'", "'de'", "'salen'", "'Cliente'", "'pesos'"
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
    public String getGrammarFileName() { return "../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g"; }


     
     	private TextVerdulerGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(TextVerdulerGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleVerduleria"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:60:1: entryRuleVerduleria : ruleVerduleria EOF ;
    public final void entryRuleVerduleria() throws RecognitionException {
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:61:1: ( ruleVerduleria EOF )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:62:1: ruleVerduleria EOF
            {
             before(grammarAccess.getVerduleriaRule()); 
            pushFollow(FOLLOW_ruleVerduleria_in_entryRuleVerduleria61);
            ruleVerduleria();

            state._fsp--;

             after(grammarAccess.getVerduleriaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerduleria68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVerduleria"


    // $ANTLR start "ruleVerduleria"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:69:1: ruleVerduleria : ( ( rule__Verduleria__AnotacionesAssignment )* ) ;
    public final void ruleVerduleria() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:73:2: ( ( ( rule__Verduleria__AnotacionesAssignment )* ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:74:1: ( ( rule__Verduleria__AnotacionesAssignment )* )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:74:1: ( ( rule__Verduleria__AnotacionesAssignment )* )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:75:1: ( rule__Verduleria__AnotacionesAssignment )*
            {
             before(grammarAccess.getVerduleriaAccess().getAnotacionesAssignment()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:76:1: ( rule__Verduleria__AnotacionesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=13 && LA1_0<=14)||LA1_0==31) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:76:2: rule__Verduleria__AnotacionesAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Verduleria__AnotacionesAssignment_in_ruleVerduleria94);
            	    rule__Verduleria__AnotacionesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getVerduleriaAccess().getAnotacionesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVerduleria"


    // $ANTLR start "entryRuleModelCliente"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:88:1: entryRuleModelCliente : ruleModelCliente EOF ;
    public final void entryRuleModelCliente() throws RecognitionException {
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:89:1: ( ruleModelCliente EOF )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:90:1: ruleModelCliente EOF
            {
             before(grammarAccess.getModelClienteRule()); 
            pushFollow(FOLLOW_ruleModelCliente_in_entryRuleModelCliente122);
            ruleModelCliente();

            state._fsp--;

             after(grammarAccess.getModelClienteRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelCliente129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModelCliente"


    // $ANTLR start "ruleModelCliente"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:97:1: ruleModelCliente : ( ( rule__ModelCliente__Group__0 ) ) ;
    public final void ruleModelCliente() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:101:2: ( ( ( rule__ModelCliente__Group__0 ) ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:102:1: ( ( rule__ModelCliente__Group__0 ) )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:102:1: ( ( rule__ModelCliente__Group__0 ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:103:1: ( rule__ModelCliente__Group__0 )
            {
             before(grammarAccess.getModelClienteAccess().getGroup()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:104:1: ( rule__ModelCliente__Group__0 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:104:2: rule__ModelCliente__Group__0
            {
            pushFollow(FOLLOW_rule__ModelCliente__Group__0_in_ruleModelCliente155);
            rule__ModelCliente__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelClienteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelCliente"


    // $ANTLR start "entryRuleModelProducto"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:116:1: entryRuleModelProducto : ruleModelProducto EOF ;
    public final void entryRuleModelProducto() throws RecognitionException {
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:117:1: ( ruleModelProducto EOF )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:118:1: ruleModelProducto EOF
            {
             before(grammarAccess.getModelProductoRule()); 
            pushFollow(FOLLOW_ruleModelProducto_in_entryRuleModelProducto182);
            ruleModelProducto();

            state._fsp--;

             after(grammarAccess.getModelProductoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelProducto189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModelProducto"


    // $ANTLR start "ruleModelProducto"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:125:1: ruleModelProducto : ( ( rule__ModelProducto__Group__0 ) ) ;
    public final void ruleModelProducto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:129:2: ( ( ( rule__ModelProducto__Group__0 ) ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:130:1: ( ( rule__ModelProducto__Group__0 ) )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:130:1: ( ( rule__ModelProducto__Group__0 ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:131:1: ( rule__ModelProducto__Group__0 )
            {
             before(grammarAccess.getModelProductoAccess().getGroup()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:132:1: ( rule__ModelProducto__Group__0 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:132:2: rule__ModelProducto__Group__0
            {
            pushFollow(FOLLOW_rule__ModelProducto__Group__0_in_ruleModelProducto215);
            rule__ModelProducto__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelProductoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelProducto"


    // $ANTLR start "entryRuleModelVenta"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:144:1: entryRuleModelVenta : ruleModelVenta EOF ;
    public final void entryRuleModelVenta() throws RecognitionException {
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:145:1: ( ruleModelVenta EOF )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:146:1: ruleModelVenta EOF
            {
             before(grammarAccess.getModelVentaRule()); 
            pushFollow(FOLLOW_ruleModelVenta_in_entryRuleModelVenta242);
            ruleModelVenta();

            state._fsp--;

             after(grammarAccess.getModelVentaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelVenta249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModelVenta"


    // $ANTLR start "ruleModelVenta"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:153:1: ruleModelVenta : ( ( rule__ModelVenta__VentaAssignment ) ) ;
    public final void ruleModelVenta() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:157:2: ( ( ( rule__ModelVenta__VentaAssignment ) ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:158:1: ( ( rule__ModelVenta__VentaAssignment ) )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:158:1: ( ( rule__ModelVenta__VentaAssignment ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:159:1: ( rule__ModelVenta__VentaAssignment )
            {
             before(grammarAccess.getModelVentaAccess().getVentaAssignment()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:160:1: ( rule__ModelVenta__VentaAssignment )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:160:2: rule__ModelVenta__VentaAssignment
            {
            pushFollow(FOLLOW_rule__ModelVenta__VentaAssignment_in_ruleModelVenta275);
            rule__ModelVenta__VentaAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelVentaAccess().getVentaAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelVenta"


    // $ANTLR start "entryRuleVenta"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:172:1: entryRuleVenta : ruleVenta EOF ;
    public final void entryRuleVenta() throws RecognitionException {
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:173:1: ( ruleVenta EOF )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:174:1: ruleVenta EOF
            {
             before(grammarAccess.getVentaRule()); 
            pushFollow(FOLLOW_ruleVenta_in_entryRuleVenta302);
            ruleVenta();

            state._fsp--;

             after(grammarAccess.getVentaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVenta309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVenta"


    // $ANTLR start "ruleVenta"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:181:1: ruleVenta : ( ( rule__Venta__Group__0 ) ) ;
    public final void ruleVenta() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:185:2: ( ( ( rule__Venta__Group__0 ) ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:186:1: ( ( rule__Venta__Group__0 ) )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:186:1: ( ( rule__Venta__Group__0 ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:187:1: ( rule__Venta__Group__0 )
            {
             before(grammarAccess.getVentaAccess().getGroup()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:188:1: ( rule__Venta__Group__0 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:188:2: rule__Venta__Group__0
            {
            pushFollow(FOLLOW_rule__Venta__Group__0_in_ruleVenta335);
            rule__Venta__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVentaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVenta"


    // $ANTLR start "entryRuleTotalDeCompra"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:200:1: entryRuleTotalDeCompra : ruleTotalDeCompra EOF ;
    public final void entryRuleTotalDeCompra() throws RecognitionException {
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:201:1: ( ruleTotalDeCompra EOF )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:202:1: ruleTotalDeCompra EOF
            {
             before(grammarAccess.getTotalDeCompraRule()); 
            pushFollow(FOLLOW_ruleTotalDeCompra_in_entryRuleTotalDeCompra362);
            ruleTotalDeCompra();

            state._fsp--;

             after(grammarAccess.getTotalDeCompraRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTotalDeCompra369); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTotalDeCompra"


    // $ANTLR start "ruleTotalDeCompra"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:209:1: ruleTotalDeCompra : ( ( rule__TotalDeCompra__Group__0 ) ) ;
    public final void ruleTotalDeCompra() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:213:2: ( ( ( rule__TotalDeCompra__Group__0 ) ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:214:1: ( ( rule__TotalDeCompra__Group__0 ) )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:214:1: ( ( rule__TotalDeCompra__Group__0 ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:215:1: ( rule__TotalDeCompra__Group__0 )
            {
             before(grammarAccess.getTotalDeCompraAccess().getGroup()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:216:1: ( rule__TotalDeCompra__Group__0 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:216:2: rule__TotalDeCompra__Group__0
            {
            pushFollow(FOLLOW_rule__TotalDeCompra__Group__0_in_ruleTotalDeCompra395);
            rule__TotalDeCompra__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTotalDeCompraAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTotalDeCompra"


    // $ANTLR start "entryRuleMercaderia"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:228:1: entryRuleMercaderia : ruleMercaderia EOF ;
    public final void entryRuleMercaderia() throws RecognitionException {
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:229:1: ( ruleMercaderia EOF )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:230:1: ruleMercaderia EOF
            {
             before(grammarAccess.getMercaderiaRule()); 
            pushFollow(FOLLOW_ruleMercaderia_in_entryRuleMercaderia422);
            ruleMercaderia();

            state._fsp--;

             after(grammarAccess.getMercaderiaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMercaderia429); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMercaderia"


    // $ANTLR start "ruleMercaderia"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:237:1: ruleMercaderia : ( ( rule__Mercaderia__Group__0 ) ) ;
    public final void ruleMercaderia() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:241:2: ( ( ( rule__Mercaderia__Group__0 ) ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:242:1: ( ( rule__Mercaderia__Group__0 ) )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:242:1: ( ( rule__Mercaderia__Group__0 ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:243:1: ( rule__Mercaderia__Group__0 )
            {
             before(grammarAccess.getMercaderiaAccess().getGroup()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:244:1: ( rule__Mercaderia__Group__0 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:244:2: rule__Mercaderia__Group__0
            {
            pushFollow(FOLLOW_rule__Mercaderia__Group__0_in_ruleMercaderia455);
            rule__Mercaderia__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMercaderiaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMercaderia"


    // $ANTLR start "entryRuleProducto"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:256:1: entryRuleProducto : ruleProducto EOF ;
    public final void entryRuleProducto() throws RecognitionException {
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:257:1: ( ruleProducto EOF )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:258:1: ruleProducto EOF
            {
             before(grammarAccess.getProductoRule()); 
            pushFollow(FOLLOW_ruleProducto_in_entryRuleProducto482);
            ruleProducto();

            state._fsp--;

             after(grammarAccess.getProductoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProducto489); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProducto"


    // $ANTLR start "ruleProducto"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:265:1: ruleProducto : ( ( rule__Producto__Group__0 ) ) ;
    public final void ruleProducto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:269:2: ( ( ( rule__Producto__Group__0 ) ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:270:1: ( ( rule__Producto__Group__0 ) )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:270:1: ( ( rule__Producto__Group__0 ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:271:1: ( rule__Producto__Group__0 )
            {
             before(grammarAccess.getProductoAccess().getGroup()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:272:1: ( rule__Producto__Group__0 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:272:2: rule__Producto__Group__0
            {
            pushFollow(FOLLOW_rule__Producto__Group__0_in_ruleProducto515);
            rule__Producto__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProductoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProducto"


    // $ANTLR start "entryRuleValorDelProducto"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:284:1: entryRuleValorDelProducto : ruleValorDelProducto EOF ;
    public final void entryRuleValorDelProducto() throws RecognitionException {
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:285:1: ( ruleValorDelProducto EOF )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:286:1: ruleValorDelProducto EOF
            {
             before(grammarAccess.getValorDelProductoRule()); 
            pushFollow(FOLLOW_ruleValorDelProducto_in_entryRuleValorDelProducto542);
            ruleValorDelProducto();

            state._fsp--;

             after(grammarAccess.getValorDelProductoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValorDelProducto549); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValorDelProducto"


    // $ANTLR start "ruleValorDelProducto"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:293:1: ruleValorDelProducto : ( ( rule__ValorDelProducto__Group__0 ) ) ;
    public final void ruleValorDelProducto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:297:2: ( ( ( rule__ValorDelProducto__Group__0 ) ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:298:1: ( ( rule__ValorDelProducto__Group__0 ) )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:298:1: ( ( rule__ValorDelProducto__Group__0 ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:299:1: ( rule__ValorDelProducto__Group__0 )
            {
             before(grammarAccess.getValorDelProductoAccess().getGroup()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:300:1: ( rule__ValorDelProducto__Group__0 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:300:2: rule__ValorDelProducto__Group__0
            {
            pushFollow(FOLLOW_rule__ValorDelProducto__Group__0_in_ruleValorDelProducto575);
            rule__ValorDelProducto__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValorDelProductoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValorDelProducto"


    // $ANTLR start "entryRuleDescripcion"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:312:1: entryRuleDescripcion : ruleDescripcion EOF ;
    public final void entryRuleDescripcion() throws RecognitionException {
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:313:1: ( ruleDescripcion EOF )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:314:1: ruleDescripcion EOF
            {
             before(grammarAccess.getDescripcionRule()); 
            pushFollow(FOLLOW_ruleDescripcion_in_entryRuleDescripcion602);
            ruleDescripcion();

            state._fsp--;

             after(grammarAccess.getDescripcionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDescripcion609); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDescripcion"


    // $ANTLR start "ruleDescripcion"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:321:1: ruleDescripcion : ( ( rule__Descripcion__Group__0 ) ) ;
    public final void ruleDescripcion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:325:2: ( ( ( rule__Descripcion__Group__0 ) ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:326:1: ( ( rule__Descripcion__Group__0 ) )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:326:1: ( ( rule__Descripcion__Group__0 ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:327:1: ( rule__Descripcion__Group__0 )
            {
             before(grammarAccess.getDescripcionAccess().getGroup()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:328:1: ( rule__Descripcion__Group__0 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:328:2: rule__Descripcion__Group__0
            {
            pushFollow(FOLLOW_rule__Descripcion__Group__0_in_ruleDescripcion635);
            rule__Descripcion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDescripcionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDescripcion"


    // $ANTLR start "entryRuleCantidad"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:340:1: entryRuleCantidad : ruleCantidad EOF ;
    public final void entryRuleCantidad() throws RecognitionException {
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:341:1: ( ruleCantidad EOF )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:342:1: ruleCantidad EOF
            {
             before(grammarAccess.getCantidadRule()); 
            pushFollow(FOLLOW_ruleCantidad_in_entryRuleCantidad662);
            ruleCantidad();

            state._fsp--;

             after(grammarAccess.getCantidadRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCantidad669); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCantidad"


    // $ANTLR start "ruleCantidad"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:349:1: ruleCantidad : ( ( rule__Cantidad__Group__0 ) ) ;
    public final void ruleCantidad() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:353:2: ( ( ( rule__Cantidad__Group__0 ) ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:354:1: ( ( rule__Cantidad__Group__0 ) )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:354:1: ( ( rule__Cantidad__Group__0 ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:355:1: ( rule__Cantidad__Group__0 )
            {
             before(grammarAccess.getCantidadAccess().getGroup()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:356:1: ( rule__Cantidad__Group__0 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:356:2: rule__Cantidad__Group__0
            {
            pushFollow(FOLLOW_rule__Cantidad__Group__0_in_ruleCantidad695);
            rule__Cantidad__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCantidadAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCantidad"


    // $ANTLR start "entryRuleArticulo"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:368:1: entryRuleArticulo : ruleArticulo EOF ;
    public final void entryRuleArticulo() throws RecognitionException {
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:369:1: ( ruleArticulo EOF )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:370:1: ruleArticulo EOF
            {
             before(grammarAccess.getArticuloRule()); 
            pushFollow(FOLLOW_ruleArticulo_in_entryRuleArticulo722);
            ruleArticulo();

            state._fsp--;

             after(grammarAccess.getArticuloRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArticulo729); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArticulo"


    // $ANTLR start "ruleArticulo"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:377:1: ruleArticulo : ( ( rule__Articulo__UnArticuloAssignment ) ) ;
    public final void ruleArticulo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:381:2: ( ( ( rule__Articulo__UnArticuloAssignment ) ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:382:1: ( ( rule__Articulo__UnArticuloAssignment ) )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:382:1: ( ( rule__Articulo__UnArticuloAssignment ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:383:1: ( rule__Articulo__UnArticuloAssignment )
            {
             before(grammarAccess.getArticuloAccess().getUnArticuloAssignment()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:384:1: ( rule__Articulo__UnArticuloAssignment )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:384:2: rule__Articulo__UnArticuloAssignment
            {
            pushFollow(FOLLOW_rule__Articulo__UnArticuloAssignment_in_ruleArticulo755);
            rule__Articulo__UnArticuloAssignment();

            state._fsp--;


            }

             after(grammarAccess.getArticuloAccess().getUnArticuloAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArticulo"


    // $ANTLR start "entryRuleUnidad"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:396:1: entryRuleUnidad : ruleUnidad EOF ;
    public final void entryRuleUnidad() throws RecognitionException {
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:397:1: ( ruleUnidad EOF )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:398:1: ruleUnidad EOF
            {
             before(grammarAccess.getUnidadRule()); 
            pushFollow(FOLLOW_ruleUnidad_in_entryRuleUnidad782);
            ruleUnidad();

            state._fsp--;

             after(grammarAccess.getUnidadRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnidad789); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnidad"


    // $ANTLR start "ruleUnidad"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:405:1: ruleUnidad : ( ( rule__Unidad__UnaUnidadAssignment ) ) ;
    public final void ruleUnidad() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:409:2: ( ( ( rule__Unidad__UnaUnidadAssignment ) ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:410:1: ( ( rule__Unidad__UnaUnidadAssignment ) )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:410:1: ( ( rule__Unidad__UnaUnidadAssignment ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:411:1: ( rule__Unidad__UnaUnidadAssignment )
            {
             before(grammarAccess.getUnidadAccess().getUnaUnidadAssignment()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:412:1: ( rule__Unidad__UnaUnidadAssignment )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:412:2: rule__Unidad__UnaUnidadAssignment
            {
            pushFollow(FOLLOW_rule__Unidad__UnaUnidadAssignment_in_ruleUnidad815);
            rule__Unidad__UnaUnidadAssignment();

            state._fsp--;


            }

             after(grammarAccess.getUnidadAccess().getUnaUnidadAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnidad"


    // $ANTLR start "entryRuleCliente"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:424:1: entryRuleCliente : ruleCliente EOF ;
    public final void entryRuleCliente() throws RecognitionException {
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:425:1: ( ruleCliente EOF )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:426:1: ruleCliente EOF
            {
             before(grammarAccess.getClienteRule()); 
            pushFollow(FOLLOW_ruleCliente_in_entryRuleCliente842);
            ruleCliente();

            state._fsp--;

             after(grammarAccess.getClienteRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCliente849); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCliente"


    // $ANTLR start "ruleCliente"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:433:1: ruleCliente : ( ( rule__Cliente__Group__0 ) ) ;
    public final void ruleCliente() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:437:2: ( ( ( rule__Cliente__Group__0 ) ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:438:1: ( ( rule__Cliente__Group__0 ) )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:438:1: ( ( rule__Cliente__Group__0 ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:439:1: ( rule__Cliente__Group__0 )
            {
             before(grammarAccess.getClienteAccess().getGroup()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:440:1: ( rule__Cliente__Group__0 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:440:2: rule__Cliente__Group__0
            {
            pushFollow(FOLLOW_rule__Cliente__Group__0_in_ruleCliente875);
            rule__Cliente__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClienteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCliente"


    // $ANTLR start "entryRuleEstadoDeuda"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:452:1: entryRuleEstadoDeuda : ruleEstadoDeuda EOF ;
    public final void entryRuleEstadoDeuda() throws RecognitionException {
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:453:1: ( ruleEstadoDeuda EOF )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:454:1: ruleEstadoDeuda EOF
            {
             before(grammarAccess.getEstadoDeudaRule()); 
            pushFollow(FOLLOW_ruleEstadoDeuda_in_entryRuleEstadoDeuda902);
            ruleEstadoDeuda();

            state._fsp--;

             after(grammarAccess.getEstadoDeudaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEstadoDeuda909); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEstadoDeuda"


    // $ANTLR start "ruleEstadoDeuda"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:461:1: ruleEstadoDeuda : ( ( rule__EstadoDeuda__Group__0 ) ) ;
    public final void ruleEstadoDeuda() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:465:2: ( ( ( rule__EstadoDeuda__Group__0 ) ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:466:1: ( ( rule__EstadoDeuda__Group__0 ) )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:466:1: ( ( rule__EstadoDeuda__Group__0 ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:467:1: ( rule__EstadoDeuda__Group__0 )
            {
             before(grammarAccess.getEstadoDeudaAccess().getGroup()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:468:1: ( rule__EstadoDeuda__Group__0 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:468:2: rule__EstadoDeuda__Group__0
            {
            pushFollow(FOLLOW_rule__EstadoDeuda__Group__0_in_ruleEstadoDeuda935);
            rule__EstadoDeuda__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEstadoDeudaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEstadoDeuda"


    // $ANTLR start "entryRuleImporte"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:480:1: entryRuleImporte : ruleImporte EOF ;
    public final void entryRuleImporte() throws RecognitionException {
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:481:1: ( ruleImporte EOF )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:482:1: ruleImporte EOF
            {
             before(grammarAccess.getImporteRule()); 
            pushFollow(FOLLOW_ruleImporte_in_entryRuleImporte962);
            ruleImporte();

            state._fsp--;

             after(grammarAccess.getImporteRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImporte969); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImporte"


    // $ANTLR start "ruleImporte"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:489:1: ruleImporte : ( ( rule__Importe__Group__0 ) ) ;
    public final void ruleImporte() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:493:2: ( ( ( rule__Importe__Group__0 ) ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:494:1: ( ( rule__Importe__Group__0 ) )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:494:1: ( ( rule__Importe__Group__0 ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:495:1: ( rule__Importe__Group__0 )
            {
             before(grammarAccess.getImporteAccess().getGroup()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:496:1: ( rule__Importe__Group__0 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:496:2: rule__Importe__Group__0
            {
            pushFollow(FOLLOW_rule__Importe__Group__0_in_ruleImporte995);
            rule__Importe__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImporteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImporte"


    // $ANTLR start "entryRuleMoneda"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:508:1: entryRuleMoneda : ruleMoneda EOF ;
    public final void entryRuleMoneda() throws RecognitionException {
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:509:1: ( ruleMoneda EOF )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:510:1: ruleMoneda EOF
            {
             before(grammarAccess.getMonedaRule()); 
            pushFollow(FOLLOW_ruleMoneda_in_entryRuleMoneda1022);
            ruleMoneda();

            state._fsp--;

             after(grammarAccess.getMonedaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMoneda1029); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMoneda"


    // $ANTLR start "ruleMoneda"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:517:1: ruleMoneda : ( ( rule__Moneda__PesosAssignment ) ) ;
    public final void ruleMoneda() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:521:2: ( ( ( rule__Moneda__PesosAssignment ) ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:522:1: ( ( rule__Moneda__PesosAssignment ) )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:522:1: ( ( rule__Moneda__PesosAssignment ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:523:1: ( rule__Moneda__PesosAssignment )
            {
             before(grammarAccess.getMonedaAccess().getPesosAssignment()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:524:1: ( rule__Moneda__PesosAssignment )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:524:2: rule__Moneda__PesosAssignment
            {
            pushFollow(FOLLOW_rule__Moneda__PesosAssignment_in_ruleMoneda1055);
            rule__Moneda__PesosAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMonedaAccess().getPesosAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMoneda"


    // $ANTLR start "rule__Verduleria__AnotacionesAlternatives_0"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:536:1: rule__Verduleria__AnotacionesAlternatives_0 : ( ( ruleModelCliente ) | ( ruleModelProducto ) | ( ruleModelVenta ) );
    public final void rule__Verduleria__AnotacionesAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:540:1: ( ( ruleModelCliente ) | ( ruleModelProducto ) | ( ruleModelVenta ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt2=1;
                }
                break;
            case 13:
            case 14:
                {
                alt2=2;
                }
                break;
            case RULE_ID:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:541:1: ( ruleModelCliente )
                    {
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:541:1: ( ruleModelCliente )
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:542:1: ruleModelCliente
                    {
                     before(grammarAccess.getVerduleriaAccess().getAnotacionesModelClienteParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleModelCliente_in_rule__Verduleria__AnotacionesAlternatives_01091);
                    ruleModelCliente();

                    state._fsp--;

                     after(grammarAccess.getVerduleriaAccess().getAnotacionesModelClienteParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:547:6: ( ruleModelProducto )
                    {
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:547:6: ( ruleModelProducto )
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:548:1: ruleModelProducto
                    {
                     before(grammarAccess.getVerduleriaAccess().getAnotacionesModelProductoParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleModelProducto_in_rule__Verduleria__AnotacionesAlternatives_01108);
                    ruleModelProducto();

                    state._fsp--;

                     after(grammarAccess.getVerduleriaAccess().getAnotacionesModelProductoParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:553:6: ( ruleModelVenta )
                    {
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:553:6: ( ruleModelVenta )
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:554:1: ruleModelVenta
                    {
                     before(grammarAccess.getVerduleriaAccess().getAnotacionesModelVentaParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_ruleModelVenta_in_rule__Verduleria__AnotacionesAlternatives_01125);
                    ruleModelVenta();

                    state._fsp--;

                     after(grammarAccess.getVerduleriaAccess().getAnotacionesModelVentaParserRuleCall_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verduleria__AnotacionesAlternatives_0"


    // $ANTLR start "rule__TotalDeCompra__UnTotalAlternatives_0_0"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:564:1: rule__TotalDeCompra__UnTotalAlternatives_0_0 : ( ( 'paga' ) | ( 'queda debiendo' ) );
    public final void rule__TotalDeCompra__UnTotalAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:568:1: ( ( 'paga' ) | ( 'queda debiendo' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:569:1: ( 'paga' )
                    {
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:569:1: ( 'paga' )
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:570:1: 'paga'
                    {
                     before(grammarAccess.getTotalDeCompraAccess().getUnTotalPagaKeyword_0_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__TotalDeCompra__UnTotalAlternatives_0_01158); 
                     after(grammarAccess.getTotalDeCompraAccess().getUnTotalPagaKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:577:6: ( 'queda debiendo' )
                    {
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:577:6: ( 'queda debiendo' )
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:578:1: 'queda debiendo'
                    {
                     before(grammarAccess.getTotalDeCompraAccess().getUnTotalQuedaDebiendoKeyword_0_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__TotalDeCompra__UnTotalAlternatives_0_01178); 
                     after(grammarAccess.getTotalDeCompraAccess().getUnTotalQuedaDebiendoKeyword_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TotalDeCompra__UnTotalAlternatives_0_0"


    // $ANTLR start "rule__Producto__Alternatives_0"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:590:1: rule__Producto__Alternatives_0 : ( ( 'Las' ) | ( 'Los' ) );
    public final void rule__Producto__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:594:1: ( ( 'Las' ) | ( 'Los' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:595:1: ( 'Las' )
                    {
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:595:1: ( 'Las' )
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:596:1: 'Las'
                    {
                     before(grammarAccess.getProductoAccess().getLasKeyword_0_0()); 
                    match(input,13,FOLLOW_13_in_rule__Producto__Alternatives_01213); 
                     after(grammarAccess.getProductoAccess().getLasKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:603:6: ( 'Los' )
                    {
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:603:6: ( 'Los' )
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:604:1: 'Los'
                    {
                     before(grammarAccess.getProductoAccess().getLosKeyword_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__Producto__Alternatives_01233); 
                     after(grammarAccess.getProductoAccess().getLosKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__Alternatives_0"


    // $ANTLR start "rule__Articulo__UnArticuloAlternatives_0"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:616:1: rule__Articulo__UnArticuloAlternatives_0 : ( ( 'el' ) | ( 'los' ) );
    public final void rule__Articulo__UnArticuloAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:620:1: ( ( 'el' ) | ( 'los' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:621:1: ( 'el' )
                    {
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:621:1: ( 'el' )
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:622:1: 'el'
                    {
                     before(grammarAccess.getArticuloAccess().getUnArticuloElKeyword_0_0()); 
                    match(input,15,FOLLOW_15_in_rule__Articulo__UnArticuloAlternatives_01268); 
                     after(grammarAccess.getArticuloAccess().getUnArticuloElKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:629:6: ( 'los' )
                    {
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:629:6: ( 'los' )
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:630:1: 'los'
                    {
                     before(grammarAccess.getArticuloAccess().getUnArticuloLosKeyword_0_1()); 
                    match(input,16,FOLLOW_16_in_rule__Articulo__UnArticuloAlternatives_01288); 
                     after(grammarAccess.getArticuloAccess().getUnArticuloLosKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Articulo__UnArticuloAlternatives_0"


    // $ANTLR start "rule__Unidad__UnaUnidadAlternatives_0"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:642:1: rule__Unidad__UnaUnidadAlternatives_0 : ( ( 'kilo' ) | ( 'kilos' ) | ( 'medio kilo' ) | ( 'cuarto kilo' ) | ( 'gramos' ) );
    public final void rule__Unidad__UnaUnidadAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:646:1: ( ( 'kilo' ) | ( 'kilos' ) | ( 'medio kilo' ) | ( 'cuarto kilo' ) | ( 'gramos' ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt6=1;
                }
                break;
            case 18:
                {
                alt6=2;
                }
                break;
            case 19:
                {
                alt6=3;
                }
                break;
            case 20:
                {
                alt6=4;
                }
                break;
            case 21:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:647:1: ( 'kilo' )
                    {
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:647:1: ( 'kilo' )
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:648:1: 'kilo'
                    {
                     before(grammarAccess.getUnidadAccess().getUnaUnidadKiloKeyword_0_0()); 
                    match(input,17,FOLLOW_17_in_rule__Unidad__UnaUnidadAlternatives_01323); 
                     after(grammarAccess.getUnidadAccess().getUnaUnidadKiloKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:655:6: ( 'kilos' )
                    {
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:655:6: ( 'kilos' )
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:656:1: 'kilos'
                    {
                     before(grammarAccess.getUnidadAccess().getUnaUnidadKilosKeyword_0_1()); 
                    match(input,18,FOLLOW_18_in_rule__Unidad__UnaUnidadAlternatives_01343); 
                     after(grammarAccess.getUnidadAccess().getUnaUnidadKilosKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:663:6: ( 'medio kilo' )
                    {
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:663:6: ( 'medio kilo' )
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:664:1: 'medio kilo'
                    {
                     before(grammarAccess.getUnidadAccess().getUnaUnidadMedioKiloKeyword_0_2()); 
                    match(input,19,FOLLOW_19_in_rule__Unidad__UnaUnidadAlternatives_01363); 
                     after(grammarAccess.getUnidadAccess().getUnaUnidadMedioKiloKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:671:6: ( 'cuarto kilo' )
                    {
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:671:6: ( 'cuarto kilo' )
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:672:1: 'cuarto kilo'
                    {
                     before(grammarAccess.getUnidadAccess().getUnaUnidadCuartoKiloKeyword_0_3()); 
                    match(input,20,FOLLOW_20_in_rule__Unidad__UnaUnidadAlternatives_01383); 
                     after(grammarAccess.getUnidadAccess().getUnaUnidadCuartoKiloKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:679:6: ( 'gramos' )
                    {
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:679:6: ( 'gramos' )
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:680:1: 'gramos'
                    {
                     before(grammarAccess.getUnidadAccess().getUnaUnidadGramosKeyword_0_4()); 
                    match(input,21,FOLLOW_21_in_rule__Unidad__UnaUnidadAlternatives_01403); 
                     after(grammarAccess.getUnidadAccess().getUnaUnidadGramosKeyword_0_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unidad__UnaUnidadAlternatives_0"


    // $ANTLR start "rule__EstadoDeuda__Alternatives_0"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:692:1: rule__EstadoDeuda__Alternatives_0 : ( ( 'debe' ) | ( 'al dia' ) | ( 'tiene credito' ) );
    public final void rule__EstadoDeuda__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:696:1: ( ( 'debe' ) | ( 'al dia' ) | ( 'tiene credito' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt7=1;
                }
                break;
            case 23:
                {
                alt7=2;
                }
                break;
            case 24:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:697:1: ( 'debe' )
                    {
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:697:1: ( 'debe' )
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:698:1: 'debe'
                    {
                     before(grammarAccess.getEstadoDeudaAccess().getDebeKeyword_0_0()); 
                    match(input,22,FOLLOW_22_in_rule__EstadoDeuda__Alternatives_01438); 
                     after(grammarAccess.getEstadoDeudaAccess().getDebeKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:705:6: ( 'al dia' )
                    {
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:705:6: ( 'al dia' )
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:706:1: 'al dia'
                    {
                     before(grammarAccess.getEstadoDeudaAccess().getAlDiaKeyword_0_1()); 
                    match(input,23,FOLLOW_23_in_rule__EstadoDeuda__Alternatives_01458); 
                     after(grammarAccess.getEstadoDeudaAccess().getAlDiaKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:713:6: ( 'tiene credito' )
                    {
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:713:6: ( 'tiene credito' )
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:714:1: 'tiene credito'
                    {
                     before(grammarAccess.getEstadoDeudaAccess().getTieneCreditoKeyword_0_2()); 
                    match(input,24,FOLLOW_24_in_rule__EstadoDeuda__Alternatives_01478); 
                     after(grammarAccess.getEstadoDeudaAccess().getTieneCreditoKeyword_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EstadoDeuda__Alternatives_0"


    // $ANTLR start "rule__ModelCliente__Group__0"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:728:1: rule__ModelCliente__Group__0 : rule__ModelCliente__Group__0__Impl rule__ModelCliente__Group__1 ;
    public final void rule__ModelCliente__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:732:1: ( rule__ModelCliente__Group__0__Impl rule__ModelCliente__Group__1 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:733:2: rule__ModelCliente__Group__0__Impl rule__ModelCliente__Group__1
            {
            pushFollow(FOLLOW_rule__ModelCliente__Group__0__Impl_in_rule__ModelCliente__Group__01510);
            rule__ModelCliente__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelCliente__Group__1_in_rule__ModelCliente__Group__01513);
            rule__ModelCliente__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelCliente__Group__0"


    // $ANTLR start "rule__ModelCliente__Group__0__Impl"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:740:1: rule__ModelCliente__Group__0__Impl : ( ( rule__ModelCliente__ClientesAssignment_0 ) ) ;
    public final void rule__ModelCliente__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:744:1: ( ( ( rule__ModelCliente__ClientesAssignment_0 ) ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:745:1: ( ( rule__ModelCliente__ClientesAssignment_0 ) )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:745:1: ( ( rule__ModelCliente__ClientesAssignment_0 ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:746:1: ( rule__ModelCliente__ClientesAssignment_0 )
            {
             before(grammarAccess.getModelClienteAccess().getClientesAssignment_0()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:747:1: ( rule__ModelCliente__ClientesAssignment_0 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:747:2: rule__ModelCliente__ClientesAssignment_0
            {
            pushFollow(FOLLOW_rule__ModelCliente__ClientesAssignment_0_in_rule__ModelCliente__Group__0__Impl1540);
            rule__ModelCliente__ClientesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelClienteAccess().getClientesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelCliente__Group__0__Impl"


    // $ANTLR start "rule__ModelCliente__Group__1"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:757:1: rule__ModelCliente__Group__1 : rule__ModelCliente__Group__1__Impl rule__ModelCliente__Group__2 ;
    public final void rule__ModelCliente__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:761:1: ( rule__ModelCliente__Group__1__Impl rule__ModelCliente__Group__2 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:762:2: rule__ModelCliente__Group__1__Impl rule__ModelCliente__Group__2
            {
            pushFollow(FOLLOW_rule__ModelCliente__Group__1__Impl_in_rule__ModelCliente__Group__11570);
            rule__ModelCliente__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelCliente__Group__2_in_rule__ModelCliente__Group__11573);
            rule__ModelCliente__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelCliente__Group__1"


    // $ANTLR start "rule__ModelCliente__Group__1__Impl"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:769:1: rule__ModelCliente__Group__1__Impl : ( ',' ) ;
    public final void rule__ModelCliente__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:773:1: ( ( ',' ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:774:1: ( ',' )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:774:1: ( ',' )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:775:1: ','
            {
             before(grammarAccess.getModelClienteAccess().getCommaKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__ModelCliente__Group__1__Impl1601); 
             after(grammarAccess.getModelClienteAccess().getCommaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelCliente__Group__1__Impl"


    // $ANTLR start "rule__ModelCliente__Group__2"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:788:1: rule__ModelCliente__Group__2 : rule__ModelCliente__Group__2__Impl rule__ModelCliente__Group__3 ;
    public final void rule__ModelCliente__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:792:1: ( rule__ModelCliente__Group__2__Impl rule__ModelCliente__Group__3 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:793:2: rule__ModelCliente__Group__2__Impl rule__ModelCliente__Group__3
            {
            pushFollow(FOLLOW_rule__ModelCliente__Group__2__Impl_in_rule__ModelCliente__Group__21632);
            rule__ModelCliente__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelCliente__Group__3_in_rule__ModelCliente__Group__21635);
            rule__ModelCliente__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelCliente__Group__2"


    // $ANTLR start "rule__ModelCliente__Group__2__Impl"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:800:1: rule__ModelCliente__Group__2__Impl : ( ( rule__ModelCliente__EstadoDeDeudaAssignment_2 ) ) ;
    public final void rule__ModelCliente__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:804:1: ( ( ( rule__ModelCliente__EstadoDeDeudaAssignment_2 ) ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:805:1: ( ( rule__ModelCliente__EstadoDeDeudaAssignment_2 ) )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:805:1: ( ( rule__ModelCliente__EstadoDeDeudaAssignment_2 ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:806:1: ( rule__ModelCliente__EstadoDeDeudaAssignment_2 )
            {
             before(grammarAccess.getModelClienteAccess().getEstadoDeDeudaAssignment_2()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:807:1: ( rule__ModelCliente__EstadoDeDeudaAssignment_2 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:807:2: rule__ModelCliente__EstadoDeDeudaAssignment_2
            {
            pushFollow(FOLLOW_rule__ModelCliente__EstadoDeDeudaAssignment_2_in_rule__ModelCliente__Group__2__Impl1662);
            rule__ModelCliente__EstadoDeDeudaAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelClienteAccess().getEstadoDeDeudaAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelCliente__Group__2__Impl"


    // $ANTLR start "rule__ModelCliente__Group__3"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:817:1: rule__ModelCliente__Group__3 : rule__ModelCliente__Group__3__Impl ;
    public final void rule__ModelCliente__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:821:1: ( rule__ModelCliente__Group__3__Impl )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:822:2: rule__ModelCliente__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ModelCliente__Group__3__Impl_in_rule__ModelCliente__Group__31692);
            rule__ModelCliente__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelCliente__Group__3"


    // $ANTLR start "rule__ModelCliente__Group__3__Impl"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:828:1: rule__ModelCliente__Group__3__Impl : ( '.' ) ;
    public final void rule__ModelCliente__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:832:1: ( ( '.' ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:833:1: ( '.' )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:833:1: ( '.' )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:834:1: '.'
            {
             before(grammarAccess.getModelClienteAccess().getFullStopKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__ModelCliente__Group__3__Impl1720); 
             after(grammarAccess.getModelClienteAccess().getFullStopKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelCliente__Group__3__Impl"


    // $ANTLR start "rule__ModelProducto__Group__0"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:855:1: rule__ModelProducto__Group__0 : rule__ModelProducto__Group__0__Impl rule__ModelProducto__Group__1 ;
    public final void rule__ModelProducto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:859:1: ( rule__ModelProducto__Group__0__Impl rule__ModelProducto__Group__1 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:860:2: rule__ModelProducto__Group__0__Impl rule__ModelProducto__Group__1
            {
            pushFollow(FOLLOW_rule__ModelProducto__Group__0__Impl_in_rule__ModelProducto__Group__01759);
            rule__ModelProducto__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelProducto__Group__1_in_rule__ModelProducto__Group__01762);
            rule__ModelProducto__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProducto__Group__0"


    // $ANTLR start "rule__ModelProducto__Group__0__Impl"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:867:1: rule__ModelProducto__Group__0__Impl : ( ( rule__ModelProducto__ProductosAssignment_0 ) ) ;
    public final void rule__ModelProducto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:871:1: ( ( ( rule__ModelProducto__ProductosAssignment_0 ) ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:872:1: ( ( rule__ModelProducto__ProductosAssignment_0 ) )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:872:1: ( ( rule__ModelProducto__ProductosAssignment_0 ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:873:1: ( rule__ModelProducto__ProductosAssignment_0 )
            {
             before(grammarAccess.getModelProductoAccess().getProductosAssignment_0()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:874:1: ( rule__ModelProducto__ProductosAssignment_0 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:874:2: rule__ModelProducto__ProductosAssignment_0
            {
            pushFollow(FOLLOW_rule__ModelProducto__ProductosAssignment_0_in_rule__ModelProducto__Group__0__Impl1789);
            rule__ModelProducto__ProductosAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelProductoAccess().getProductosAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProducto__Group__0__Impl"


    // $ANTLR start "rule__ModelProducto__Group__1"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:884:1: rule__ModelProducto__Group__1 : rule__ModelProducto__Group__1__Impl rule__ModelProducto__Group__2 ;
    public final void rule__ModelProducto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:888:1: ( rule__ModelProducto__Group__1__Impl rule__ModelProducto__Group__2 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:889:2: rule__ModelProducto__Group__1__Impl rule__ModelProducto__Group__2
            {
            pushFollow(FOLLOW_rule__ModelProducto__Group__1__Impl_in_rule__ModelProducto__Group__11819);
            rule__ModelProducto__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelProducto__Group__2_in_rule__ModelProducto__Group__11822);
            rule__ModelProducto__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProducto__Group__1"


    // $ANTLR start "rule__ModelProducto__Group__1__Impl"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:896:1: rule__ModelProducto__Group__1__Impl : ( ( rule__ModelProducto__ValorAssignment_1 ) ) ;
    public final void rule__ModelProducto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:900:1: ( ( ( rule__ModelProducto__ValorAssignment_1 ) ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:901:1: ( ( rule__ModelProducto__ValorAssignment_1 ) )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:901:1: ( ( rule__ModelProducto__ValorAssignment_1 ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:902:1: ( rule__ModelProducto__ValorAssignment_1 )
            {
             before(grammarAccess.getModelProductoAccess().getValorAssignment_1()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:903:1: ( rule__ModelProducto__ValorAssignment_1 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:903:2: rule__ModelProducto__ValorAssignment_1
            {
            pushFollow(FOLLOW_rule__ModelProducto__ValorAssignment_1_in_rule__ModelProducto__Group__1__Impl1849);
            rule__ModelProducto__ValorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelProductoAccess().getValorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProducto__Group__1__Impl"


    // $ANTLR start "rule__ModelProducto__Group__2"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:913:1: rule__ModelProducto__Group__2 : rule__ModelProducto__Group__2__Impl ;
    public final void rule__ModelProducto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:917:1: ( rule__ModelProducto__Group__2__Impl )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:918:2: rule__ModelProducto__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ModelProducto__Group__2__Impl_in_rule__ModelProducto__Group__21879);
            rule__ModelProducto__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProducto__Group__2"


    // $ANTLR start "rule__ModelProducto__Group__2__Impl"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:924:1: rule__ModelProducto__Group__2__Impl : ( '.' ) ;
    public final void rule__ModelProducto__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:928:1: ( ( '.' ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:929:1: ( '.' )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:929:1: ( '.' )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:930:1: '.'
            {
             before(grammarAccess.getModelProductoAccess().getFullStopKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__ModelProducto__Group__2__Impl1907); 
             after(grammarAccess.getModelProductoAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProducto__Group__2__Impl"


    // $ANTLR start "rule__Venta__Group__0"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:949:1: rule__Venta__Group__0 : rule__Venta__Group__0__Impl rule__Venta__Group__1 ;
    public final void rule__Venta__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:953:1: ( rule__Venta__Group__0__Impl rule__Venta__Group__1 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:954:2: rule__Venta__Group__0__Impl rule__Venta__Group__1
            {
            pushFollow(FOLLOW_rule__Venta__Group__0__Impl_in_rule__Venta__Group__01944);
            rule__Venta__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Venta__Group__1_in_rule__Venta__Group__01947);
            rule__Venta__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Venta__Group__0"


    // $ANTLR start "rule__Venta__Group__0__Impl"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:961:1: rule__Venta__Group__0__Impl : ( ( rule__Venta__NombreAssignment_0 ) ) ;
    public final void rule__Venta__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:965:1: ( ( ( rule__Venta__NombreAssignment_0 ) ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:966:1: ( ( rule__Venta__NombreAssignment_0 ) )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:966:1: ( ( rule__Venta__NombreAssignment_0 ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:967:1: ( rule__Venta__NombreAssignment_0 )
            {
             before(grammarAccess.getVentaAccess().getNombreAssignment_0()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:968:1: ( rule__Venta__NombreAssignment_0 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:968:2: rule__Venta__NombreAssignment_0
            {
            pushFollow(FOLLOW_rule__Venta__NombreAssignment_0_in_rule__Venta__Group__0__Impl1974);
            rule__Venta__NombreAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVentaAccess().getNombreAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Venta__Group__0__Impl"


    // $ANTLR start "rule__Venta__Group__1"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:978:1: rule__Venta__Group__1 : rule__Venta__Group__1__Impl rule__Venta__Group__2 ;
    public final void rule__Venta__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:982:1: ( rule__Venta__Group__1__Impl rule__Venta__Group__2 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:983:2: rule__Venta__Group__1__Impl rule__Venta__Group__2
            {
            pushFollow(FOLLOW_rule__Venta__Group__1__Impl_in_rule__Venta__Group__12004);
            rule__Venta__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Venta__Group__2_in_rule__Venta__Group__12007);
            rule__Venta__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Venta__Group__1"


    // $ANTLR start "rule__Venta__Group__1__Impl"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:990:1: rule__Venta__Group__1__Impl : ( 'compro' ) ;
    public final void rule__Venta__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:994:1: ( ( 'compro' ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:995:1: ( 'compro' )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:995:1: ( 'compro' )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:996:1: 'compro'
            {
             before(grammarAccess.getVentaAccess().getComproKeyword_1()); 
            match(input,27,FOLLOW_27_in_rule__Venta__Group__1__Impl2035); 
             after(grammarAccess.getVentaAccess().getComproKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Venta__Group__1__Impl"


    // $ANTLR start "rule__Venta__Group__2"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1009:1: rule__Venta__Group__2 : rule__Venta__Group__2__Impl rule__Venta__Group__3 ;
    public final void rule__Venta__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1013:1: ( rule__Venta__Group__2__Impl rule__Venta__Group__3 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1014:2: rule__Venta__Group__2__Impl rule__Venta__Group__3
            {
            pushFollow(FOLLOW_rule__Venta__Group__2__Impl_in_rule__Venta__Group__22066);
            rule__Venta__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Venta__Group__3_in_rule__Venta__Group__22069);
            rule__Venta__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Venta__Group__2"


    // $ANTLR start "rule__Venta__Group__2__Impl"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1021:1: rule__Venta__Group__2__Impl : ( ( rule__Venta__Group_2__0 )* ) ;
    public final void rule__Venta__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1025:1: ( ( ( rule__Venta__Group_2__0 )* ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1026:1: ( ( rule__Venta__Group_2__0 )* )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1026:1: ( ( rule__Venta__Group_2__0 )* )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1027:1: ( rule__Venta__Group_2__0 )*
            {
             before(grammarAccess.getVentaAccess().getGroup_2()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1028:1: ( rule__Venta__Group_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_INT) ) {
                    int LA8_2 = input.LA(2);

                    if ( ((LA8_2>=17 && LA8_2<=21)) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>=15 && LA8_0<=21)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1028:2: rule__Venta__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Venta__Group_2__0_in_rule__Venta__Group__2__Impl2096);
            	    rule__Venta__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getVentaAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Venta__Group__2__Impl"


    // $ANTLR start "rule__Venta__Group__3"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1038:1: rule__Venta__Group__3 : rule__Venta__Group__3__Impl rule__Venta__Group__4 ;
    public final void rule__Venta__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1042:1: ( rule__Venta__Group__3__Impl rule__Venta__Group__4 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1043:2: rule__Venta__Group__3__Impl rule__Venta__Group__4
            {
            pushFollow(FOLLOW_rule__Venta__Group__3__Impl_in_rule__Venta__Group__32127);
            rule__Venta__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Venta__Group__4_in_rule__Venta__Group__32130);
            rule__Venta__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Venta__Group__3"


    // $ANTLR start "rule__Venta__Group__3__Impl"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1050:1: rule__Venta__Group__3__Impl : ( ( 'se redondea a' )? ) ;
    public final void rule__Venta__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1054:1: ( ( ( 'se redondea a' )? ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1055:1: ( ( 'se redondea a' )? )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1055:1: ( ( 'se redondea a' )? )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1056:1: ( 'se redondea a' )?
            {
             before(grammarAccess.getVentaAccess().getSeRedondeaAKeyword_3()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1057:1: ( 'se redondea a' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1058:2: 'se redondea a'
                    {
                    match(input,28,FOLLOW_28_in_rule__Venta__Group__3__Impl2159); 

                    }
                    break;

            }

             after(grammarAccess.getVentaAccess().getSeRedondeaAKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Venta__Group__3__Impl"


    // $ANTLR start "rule__Venta__Group__4"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1069:1: rule__Venta__Group__4 : rule__Venta__Group__4__Impl rule__Venta__Group__5 ;
    public final void rule__Venta__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1073:1: ( rule__Venta__Group__4__Impl rule__Venta__Group__5 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1074:2: rule__Venta__Group__4__Impl rule__Venta__Group__5
            {
            pushFollow(FOLLOW_rule__Venta__Group__4__Impl_in_rule__Venta__Group__42192);
            rule__Venta__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Venta__Group__5_in_rule__Venta__Group__42195);
            rule__Venta__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Venta__Group__4"


    // $ANTLR start "rule__Venta__Group__4__Impl"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1081:1: rule__Venta__Group__4__Impl : ( ( rule__Venta__UnImporteAssignment_4 ) ) ;
    public final void rule__Venta__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1085:1: ( ( ( rule__Venta__UnImporteAssignment_4 ) ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1086:1: ( ( rule__Venta__UnImporteAssignment_4 ) )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1086:1: ( ( rule__Venta__UnImporteAssignment_4 ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1087:1: ( rule__Venta__UnImporteAssignment_4 )
            {
             before(grammarAccess.getVentaAccess().getUnImporteAssignment_4()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1088:1: ( rule__Venta__UnImporteAssignment_4 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1088:2: rule__Venta__UnImporteAssignment_4
            {
            pushFollow(FOLLOW_rule__Venta__UnImporteAssignment_4_in_rule__Venta__Group__4__Impl2222);
            rule__Venta__UnImporteAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getVentaAccess().getUnImporteAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Venta__Group__4__Impl"


    // $ANTLR start "rule__Venta__Group__5"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1098:1: rule__Venta__Group__5 : rule__Venta__Group__5__Impl rule__Venta__Group__6 ;
    public final void rule__Venta__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1102:1: ( rule__Venta__Group__5__Impl rule__Venta__Group__6 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1103:2: rule__Venta__Group__5__Impl rule__Venta__Group__6
            {
            pushFollow(FOLLOW_rule__Venta__Group__5__Impl_in_rule__Venta__Group__52252);
            rule__Venta__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Venta__Group__6_in_rule__Venta__Group__52255);
            rule__Venta__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Venta__Group__5"


    // $ANTLR start "rule__Venta__Group__5__Impl"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1110:1: rule__Venta__Group__5__Impl : ( ',' ) ;
    public final void rule__Venta__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1114:1: ( ( ',' ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1115:1: ( ',' )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1115:1: ( ',' )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1116:1: ','
            {
             before(grammarAccess.getVentaAccess().getCommaKeyword_5()); 
            match(input,25,FOLLOW_25_in_rule__Venta__Group__5__Impl2283); 
             after(grammarAccess.getVentaAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Venta__Group__5__Impl"


    // $ANTLR start "rule__Venta__Group__6"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1129:1: rule__Venta__Group__6 : rule__Venta__Group__6__Impl rule__Venta__Group__7 ;
    public final void rule__Venta__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1133:1: ( rule__Venta__Group__6__Impl rule__Venta__Group__7 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1134:2: rule__Venta__Group__6__Impl rule__Venta__Group__7
            {
            pushFollow(FOLLOW_rule__Venta__Group__6__Impl_in_rule__Venta__Group__62314);
            rule__Venta__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Venta__Group__7_in_rule__Venta__Group__62317);
            rule__Venta__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Venta__Group__6"


    // $ANTLR start "rule__Venta__Group__6__Impl"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1141:1: rule__Venta__Group__6__Impl : ( ( rule__Venta__UnTotalAssignment_6 ) ) ;
    public final void rule__Venta__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1145:1: ( ( ( rule__Venta__UnTotalAssignment_6 ) ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1146:1: ( ( rule__Venta__UnTotalAssignment_6 ) )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1146:1: ( ( rule__Venta__UnTotalAssignment_6 ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1147:1: ( rule__Venta__UnTotalAssignment_6 )
            {
             before(grammarAccess.getVentaAccess().getUnTotalAssignment_6()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1148:1: ( rule__Venta__UnTotalAssignment_6 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1148:2: rule__Venta__UnTotalAssignment_6
            {
            pushFollow(FOLLOW_rule__Venta__UnTotalAssignment_6_in_rule__Venta__Group__6__Impl2344);
            rule__Venta__UnTotalAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getVentaAccess().getUnTotalAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Venta__Group__6__Impl"


    // $ANTLR start "rule__Venta__Group__7"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1158:1: rule__Venta__Group__7 : rule__Venta__Group__7__Impl ;
    public final void rule__Venta__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1162:1: ( rule__Venta__Group__7__Impl )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1163:2: rule__Venta__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Venta__Group__7__Impl_in_rule__Venta__Group__72374);
            rule__Venta__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Venta__Group__7"


    // $ANTLR start "rule__Venta__Group__7__Impl"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1169:1: rule__Venta__Group__7__Impl : ( '.' ) ;
    public final void rule__Venta__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1173:1: ( ( '.' ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1174:1: ( '.' )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1174:1: ( '.' )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1175:1: '.'
            {
             before(grammarAccess.getVentaAccess().getFullStopKeyword_7()); 
            match(input,26,FOLLOW_26_in_rule__Venta__Group__7__Impl2402); 
             after(grammarAccess.getVentaAccess().getFullStopKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Venta__Group__7__Impl"


    // $ANTLR start "rule__Venta__Group_2__0"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1204:1: rule__Venta__Group_2__0 : rule__Venta__Group_2__0__Impl rule__Venta__Group_2__1 ;
    public final void rule__Venta__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1208:1: ( rule__Venta__Group_2__0__Impl rule__Venta__Group_2__1 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1209:2: rule__Venta__Group_2__0__Impl rule__Venta__Group_2__1
            {
            pushFollow(FOLLOW_rule__Venta__Group_2__0__Impl_in_rule__Venta__Group_2__02449);
            rule__Venta__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Venta__Group_2__1_in_rule__Venta__Group_2__02452);
            rule__Venta__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Venta__Group_2__0"


    // $ANTLR start "rule__Venta__Group_2__0__Impl"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1216:1: rule__Venta__Group_2__0__Impl : ( ( rule__Venta__UnaListaDeComprasAssignment_2_0 ) ) ;
    public final void rule__Venta__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1220:1: ( ( ( rule__Venta__UnaListaDeComprasAssignment_2_0 ) ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1221:1: ( ( rule__Venta__UnaListaDeComprasAssignment_2_0 ) )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1221:1: ( ( rule__Venta__UnaListaDeComprasAssignment_2_0 ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1222:1: ( rule__Venta__UnaListaDeComprasAssignment_2_0 )
            {
             before(grammarAccess.getVentaAccess().getUnaListaDeComprasAssignment_2_0()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1223:1: ( rule__Venta__UnaListaDeComprasAssignment_2_0 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1223:2: rule__Venta__UnaListaDeComprasAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Venta__UnaListaDeComprasAssignment_2_0_in_rule__Venta__Group_2__0__Impl2479);
            rule__Venta__UnaListaDeComprasAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getVentaAccess().getUnaListaDeComprasAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Venta__Group_2__0__Impl"


    // $ANTLR start "rule__Venta__Group_2__1"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1233:1: rule__Venta__Group_2__1 : rule__Venta__Group_2__1__Impl ;
    public final void rule__Venta__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1237:1: ( rule__Venta__Group_2__1__Impl )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1238:2: rule__Venta__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Venta__Group_2__1__Impl_in_rule__Venta__Group_2__12509);
            rule__Venta__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Venta__Group_2__1"


    // $ANTLR start "rule__Venta__Group_2__1__Impl"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1244:1: rule__Venta__Group_2__1__Impl : ( ( ',' )? ) ;
    public final void rule__Venta__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1248:1: ( ( ( ',' )? ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1249:1: ( ( ',' )? )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1249:1: ( ( ',' )? )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1250:1: ( ',' )?
            {
             before(grammarAccess.getVentaAccess().getCommaKeyword_2_1()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1251:1: ( ',' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1252:2: ','
                    {
                    match(input,25,FOLLOW_25_in_rule__Venta__Group_2__1__Impl2538); 

                    }
                    break;

            }

             after(grammarAccess.getVentaAccess().getCommaKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Venta__Group_2__1__Impl"


    // $ANTLR start "rule__TotalDeCompra__Group__0"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1267:1: rule__TotalDeCompra__Group__0 : rule__TotalDeCompra__Group__0__Impl rule__TotalDeCompra__Group__1 ;
    public final void rule__TotalDeCompra__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1271:1: ( rule__TotalDeCompra__Group__0__Impl rule__TotalDeCompra__Group__1 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1272:2: rule__TotalDeCompra__Group__0__Impl rule__TotalDeCompra__Group__1
            {
            pushFollow(FOLLOW_rule__TotalDeCompra__Group__0__Impl_in_rule__TotalDeCompra__Group__02575);
            rule__TotalDeCompra__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TotalDeCompra__Group__1_in_rule__TotalDeCompra__Group__02578);
            rule__TotalDeCompra__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TotalDeCompra__Group__0"


    // $ANTLR start "rule__TotalDeCompra__Group__0__Impl"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1279:1: rule__TotalDeCompra__Group__0__Impl : ( ( rule__TotalDeCompra__UnTotalAssignment_0 ) ) ;
    public final void rule__TotalDeCompra__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1283:1: ( ( ( rule__TotalDeCompra__UnTotalAssignment_0 ) ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1284:1: ( ( rule__TotalDeCompra__UnTotalAssignment_0 ) )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1284:1: ( ( rule__TotalDeCompra__UnTotalAssignment_0 ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1285:1: ( rule__TotalDeCompra__UnTotalAssignment_0 )
            {
             before(grammarAccess.getTotalDeCompraAccess().getUnTotalAssignment_0()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1286:1: ( rule__TotalDeCompra__UnTotalAssignment_0 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1286:2: rule__TotalDeCompra__UnTotalAssignment_0
            {
            pushFollow(FOLLOW_rule__TotalDeCompra__UnTotalAssignment_0_in_rule__TotalDeCompra__Group__0__Impl2605);
            rule__TotalDeCompra__UnTotalAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTotalDeCompraAccess().getUnTotalAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TotalDeCompra__Group__0__Impl"


    // $ANTLR start "rule__TotalDeCompra__Group__1"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1296:1: rule__TotalDeCompra__Group__1 : rule__TotalDeCompra__Group__1__Impl ;
    public final void rule__TotalDeCompra__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1300:1: ( rule__TotalDeCompra__Group__1__Impl )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1301:2: rule__TotalDeCompra__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TotalDeCompra__Group__1__Impl_in_rule__TotalDeCompra__Group__12635);
            rule__TotalDeCompra__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TotalDeCompra__Group__1"


    // $ANTLR start "rule__TotalDeCompra__Group__1__Impl"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1307:1: rule__TotalDeCompra__Group__1__Impl : ( ( rule__TotalDeCompra__UnImporteTotalAssignment_1 )? ) ;
    public final void rule__TotalDeCompra__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1311:1: ( ( ( rule__TotalDeCompra__UnImporteTotalAssignment_1 )? ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1312:1: ( ( rule__TotalDeCompra__UnImporteTotalAssignment_1 )? )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1312:1: ( ( rule__TotalDeCompra__UnImporteTotalAssignment_1 )? )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1313:1: ( rule__TotalDeCompra__UnImporteTotalAssignment_1 )?
            {
             before(grammarAccess.getTotalDeCompraAccess().getUnImporteTotalAssignment_1()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1314:1: ( rule__TotalDeCompra__UnImporteTotalAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1314:2: rule__TotalDeCompra__UnImporteTotalAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TotalDeCompra__UnImporteTotalAssignment_1_in_rule__TotalDeCompra__Group__1__Impl2662);
                    rule__TotalDeCompra__UnImporteTotalAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTotalDeCompraAccess().getUnImporteTotalAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TotalDeCompra__Group__1__Impl"


    // $ANTLR start "rule__Mercaderia__Group__0"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1328:1: rule__Mercaderia__Group__0 : rule__Mercaderia__Group__0__Impl rule__Mercaderia__Group__1 ;
    public final void rule__Mercaderia__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1332:1: ( rule__Mercaderia__Group__0__Impl rule__Mercaderia__Group__1 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1333:2: rule__Mercaderia__Group__0__Impl rule__Mercaderia__Group__1
            {
            pushFollow(FOLLOW_rule__Mercaderia__Group__0__Impl_in_rule__Mercaderia__Group__02697);
            rule__Mercaderia__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mercaderia__Group__1_in_rule__Mercaderia__Group__02700);
            rule__Mercaderia__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mercaderia__Group__0"


    // $ANTLR start "rule__Mercaderia__Group__0__Impl"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1340:1: rule__Mercaderia__Group__0__Impl : ( ( rule__Mercaderia__UnaDescripcionAssignment_0 ) ) ;
    public final void rule__Mercaderia__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1344:1: ( ( ( rule__Mercaderia__UnaDescripcionAssignment_0 ) ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1345:1: ( ( rule__Mercaderia__UnaDescripcionAssignment_0 ) )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1345:1: ( ( rule__Mercaderia__UnaDescripcionAssignment_0 ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1346:1: ( rule__Mercaderia__UnaDescripcionAssignment_0 )
            {
             before(grammarAccess.getMercaderiaAccess().getUnaDescripcionAssignment_0()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1347:1: ( rule__Mercaderia__UnaDescripcionAssignment_0 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1347:2: rule__Mercaderia__UnaDescripcionAssignment_0
            {
            pushFollow(FOLLOW_rule__Mercaderia__UnaDescripcionAssignment_0_in_rule__Mercaderia__Group__0__Impl2727);
            rule__Mercaderia__UnaDescripcionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMercaderiaAccess().getUnaDescripcionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mercaderia__Group__0__Impl"


    // $ANTLR start "rule__Mercaderia__Group__1"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1357:1: rule__Mercaderia__Group__1 : rule__Mercaderia__Group__1__Impl rule__Mercaderia__Group__2 ;
    public final void rule__Mercaderia__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1361:1: ( rule__Mercaderia__Group__1__Impl rule__Mercaderia__Group__2 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1362:2: rule__Mercaderia__Group__1__Impl rule__Mercaderia__Group__2
            {
            pushFollow(FOLLOW_rule__Mercaderia__Group__1__Impl_in_rule__Mercaderia__Group__12757);
            rule__Mercaderia__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mercaderia__Group__2_in_rule__Mercaderia__Group__12760);
            rule__Mercaderia__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mercaderia__Group__1"


    // $ANTLR start "rule__Mercaderia__Group__1__Impl"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1369:1: rule__Mercaderia__Group__1__Impl : ( 'de' ) ;
    public final void rule__Mercaderia__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1373:1: ( ( 'de' ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1374:1: ( 'de' )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1374:1: ( 'de' )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1375:1: 'de'
            {
             before(grammarAccess.getMercaderiaAccess().getDeKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__Mercaderia__Group__1__Impl2788); 
             after(grammarAccess.getMercaderiaAccess().getDeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mercaderia__Group__1__Impl"


    // $ANTLR start "rule__Mercaderia__Group__2"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1388:1: rule__Mercaderia__Group__2 : rule__Mercaderia__Group__2__Impl ;
    public final void rule__Mercaderia__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1392:1: ( rule__Mercaderia__Group__2__Impl )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1393:2: rule__Mercaderia__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Mercaderia__Group__2__Impl_in_rule__Mercaderia__Group__22819);
            rule__Mercaderia__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mercaderia__Group__2"


    // $ANTLR start "rule__Mercaderia__Group__2__Impl"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1399:1: rule__Mercaderia__Group__2__Impl : ( ( rule__Mercaderia__NombreDeProductoAssignment_2 ) ) ;
    public final void rule__Mercaderia__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1403:1: ( ( ( rule__Mercaderia__NombreDeProductoAssignment_2 ) ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1404:1: ( ( rule__Mercaderia__NombreDeProductoAssignment_2 ) )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1404:1: ( ( rule__Mercaderia__NombreDeProductoAssignment_2 ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1405:1: ( rule__Mercaderia__NombreDeProductoAssignment_2 )
            {
             before(grammarAccess.getMercaderiaAccess().getNombreDeProductoAssignment_2()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1406:1: ( rule__Mercaderia__NombreDeProductoAssignment_2 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1406:2: rule__Mercaderia__NombreDeProductoAssignment_2
            {
            pushFollow(FOLLOW_rule__Mercaderia__NombreDeProductoAssignment_2_in_rule__Mercaderia__Group__2__Impl2846);
            rule__Mercaderia__NombreDeProductoAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMercaderiaAccess().getNombreDeProductoAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mercaderia__Group__2__Impl"


    // $ANTLR start "rule__Producto__Group__0"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1422:1: rule__Producto__Group__0 : rule__Producto__Group__0__Impl rule__Producto__Group__1 ;
    public final void rule__Producto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1426:1: ( rule__Producto__Group__0__Impl rule__Producto__Group__1 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1427:2: rule__Producto__Group__0__Impl rule__Producto__Group__1
            {
            pushFollow(FOLLOW_rule__Producto__Group__0__Impl_in_rule__Producto__Group__02882);
            rule__Producto__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Producto__Group__1_in_rule__Producto__Group__02885);
            rule__Producto__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__Group__0"


    // $ANTLR start "rule__Producto__Group__0__Impl"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1434:1: rule__Producto__Group__0__Impl : ( ( rule__Producto__Alternatives_0 ) ) ;
    public final void rule__Producto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1438:1: ( ( ( rule__Producto__Alternatives_0 ) ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1439:1: ( ( rule__Producto__Alternatives_0 ) )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1439:1: ( ( rule__Producto__Alternatives_0 ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1440:1: ( rule__Producto__Alternatives_0 )
            {
             before(grammarAccess.getProductoAccess().getAlternatives_0()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1441:1: ( rule__Producto__Alternatives_0 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1441:2: rule__Producto__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Producto__Alternatives_0_in_rule__Producto__Group__0__Impl2912);
            rule__Producto__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getProductoAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__Group__0__Impl"


    // $ANTLR start "rule__Producto__Group__1"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1451:1: rule__Producto__Group__1 : rule__Producto__Group__1__Impl ;
    public final void rule__Producto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1455:1: ( rule__Producto__Group__1__Impl )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1456:2: rule__Producto__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Producto__Group__1__Impl_in_rule__Producto__Group__12942);
            rule__Producto__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__Group__1"


    // $ANTLR start "rule__Producto__Group__1__Impl"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1462:1: rule__Producto__Group__1__Impl : ( ( rule__Producto__NombreDeProductoAssignment_1 ) ) ;
    public final void rule__Producto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1466:1: ( ( ( rule__Producto__NombreDeProductoAssignment_1 ) ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1467:1: ( ( rule__Producto__NombreDeProductoAssignment_1 ) )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1467:1: ( ( rule__Producto__NombreDeProductoAssignment_1 ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1468:1: ( rule__Producto__NombreDeProductoAssignment_1 )
            {
             before(grammarAccess.getProductoAccess().getNombreDeProductoAssignment_1()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1469:1: ( rule__Producto__NombreDeProductoAssignment_1 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1469:2: rule__Producto__NombreDeProductoAssignment_1
            {
            pushFollow(FOLLOW_rule__Producto__NombreDeProductoAssignment_1_in_rule__Producto__Group__1__Impl2969);
            rule__Producto__NombreDeProductoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProductoAccess().getNombreDeProductoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__Group__1__Impl"


    // $ANTLR start "rule__ValorDelProducto__Group__0"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1483:1: rule__ValorDelProducto__Group__0 : rule__ValorDelProducto__Group__0__Impl rule__ValorDelProducto__Group__1 ;
    public final void rule__ValorDelProducto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1487:1: ( rule__ValorDelProducto__Group__0__Impl rule__ValorDelProducto__Group__1 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1488:2: rule__ValorDelProducto__Group__0__Impl rule__ValorDelProducto__Group__1
            {
            pushFollow(FOLLOW_rule__ValorDelProducto__Group__0__Impl_in_rule__ValorDelProducto__Group__03003);
            rule__ValorDelProducto__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ValorDelProducto__Group__1_in_rule__ValorDelProducto__Group__03006);
            rule__ValorDelProducto__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValorDelProducto__Group__0"


    // $ANTLR start "rule__ValorDelProducto__Group__0__Impl"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1495:1: rule__ValorDelProducto__Group__0__Impl : ( 'salen' ) ;
    public final void rule__ValorDelProducto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1499:1: ( ( 'salen' ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1500:1: ( 'salen' )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1500:1: ( 'salen' )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1501:1: 'salen'
            {
             before(grammarAccess.getValorDelProductoAccess().getSalenKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__ValorDelProducto__Group__0__Impl3034); 
             after(grammarAccess.getValorDelProductoAccess().getSalenKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValorDelProducto__Group__0__Impl"


    // $ANTLR start "rule__ValorDelProducto__Group__1"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1514:1: rule__ValorDelProducto__Group__1 : rule__ValorDelProducto__Group__1__Impl ;
    public final void rule__ValorDelProducto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1518:1: ( rule__ValorDelProducto__Group__1__Impl )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1519:2: rule__ValorDelProducto__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ValorDelProducto__Group__1__Impl_in_rule__ValorDelProducto__Group__13065);
            rule__ValorDelProducto__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValorDelProducto__Group__1"


    // $ANTLR start "rule__ValorDelProducto__Group__1__Impl"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1525:1: rule__ValorDelProducto__Group__1__Impl : ( ( rule__ValorDelProducto__UnaDescripcionAssignment_1 ) ) ;
    public final void rule__ValorDelProducto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1529:1: ( ( ( rule__ValorDelProducto__UnaDescripcionAssignment_1 ) ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1530:1: ( ( rule__ValorDelProducto__UnaDescripcionAssignment_1 ) )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1530:1: ( ( rule__ValorDelProducto__UnaDescripcionAssignment_1 ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1531:1: ( rule__ValorDelProducto__UnaDescripcionAssignment_1 )
            {
             before(grammarAccess.getValorDelProductoAccess().getUnaDescripcionAssignment_1()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1532:1: ( rule__ValorDelProducto__UnaDescripcionAssignment_1 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1532:2: rule__ValorDelProducto__UnaDescripcionAssignment_1
            {
            pushFollow(FOLLOW_rule__ValorDelProducto__UnaDescripcionAssignment_1_in_rule__ValorDelProducto__Group__1__Impl3092);
            rule__ValorDelProducto__UnaDescripcionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getValorDelProductoAccess().getUnaDescripcionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValorDelProducto__Group__1__Impl"


    // $ANTLR start "rule__Descripcion__Group__0"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1546:1: rule__Descripcion__Group__0 : rule__Descripcion__Group__0__Impl rule__Descripcion__Group__1 ;
    public final void rule__Descripcion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1550:1: ( rule__Descripcion__Group__0__Impl rule__Descripcion__Group__1 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1551:2: rule__Descripcion__Group__0__Impl rule__Descripcion__Group__1
            {
            pushFollow(FOLLOW_rule__Descripcion__Group__0__Impl_in_rule__Descripcion__Group__03126);
            rule__Descripcion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Descripcion__Group__1_in_rule__Descripcion__Group__03129);
            rule__Descripcion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Descripcion__Group__0"


    // $ANTLR start "rule__Descripcion__Group__0__Impl"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1558:1: rule__Descripcion__Group__0__Impl : ( ( rule__Descripcion__UnImporteAssignment_0 ) ) ;
    public final void rule__Descripcion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1562:1: ( ( ( rule__Descripcion__UnImporteAssignment_0 ) ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1563:1: ( ( rule__Descripcion__UnImporteAssignment_0 ) )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1563:1: ( ( rule__Descripcion__UnImporteAssignment_0 ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1564:1: ( rule__Descripcion__UnImporteAssignment_0 )
            {
             before(grammarAccess.getDescripcionAccess().getUnImporteAssignment_0()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1565:1: ( rule__Descripcion__UnImporteAssignment_0 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1565:2: rule__Descripcion__UnImporteAssignment_0
            {
            pushFollow(FOLLOW_rule__Descripcion__UnImporteAssignment_0_in_rule__Descripcion__Group__0__Impl3156);
            rule__Descripcion__UnImporteAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDescripcionAccess().getUnImporteAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Descripcion__Group__0__Impl"


    // $ANTLR start "rule__Descripcion__Group__1"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1575:1: rule__Descripcion__Group__1 : rule__Descripcion__Group__1__Impl ;
    public final void rule__Descripcion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1579:1: ( rule__Descripcion__Group__1__Impl )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1580:2: rule__Descripcion__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Descripcion__Group__1__Impl_in_rule__Descripcion__Group__13186);
            rule__Descripcion__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Descripcion__Group__1"


    // $ANTLR start "rule__Descripcion__Group__1__Impl"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1586:1: rule__Descripcion__Group__1__Impl : ( ( rule__Descripcion__UnaCantidadAssignment_1 ) ) ;
    public final void rule__Descripcion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1590:1: ( ( ( rule__Descripcion__UnaCantidadAssignment_1 ) ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1591:1: ( ( rule__Descripcion__UnaCantidadAssignment_1 ) )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1591:1: ( ( rule__Descripcion__UnaCantidadAssignment_1 ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1592:1: ( rule__Descripcion__UnaCantidadAssignment_1 )
            {
             before(grammarAccess.getDescripcionAccess().getUnaCantidadAssignment_1()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1593:1: ( rule__Descripcion__UnaCantidadAssignment_1 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1593:2: rule__Descripcion__UnaCantidadAssignment_1
            {
            pushFollow(FOLLOW_rule__Descripcion__UnaCantidadAssignment_1_in_rule__Descripcion__Group__1__Impl3213);
            rule__Descripcion__UnaCantidadAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDescripcionAccess().getUnaCantidadAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Descripcion__Group__1__Impl"


    // $ANTLR start "rule__Cantidad__Group__0"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1607:1: rule__Cantidad__Group__0 : rule__Cantidad__Group__0__Impl rule__Cantidad__Group__1 ;
    public final void rule__Cantidad__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1611:1: ( rule__Cantidad__Group__0__Impl rule__Cantidad__Group__1 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1612:2: rule__Cantidad__Group__0__Impl rule__Cantidad__Group__1
            {
            pushFollow(FOLLOW_rule__Cantidad__Group__0__Impl_in_rule__Cantidad__Group__03247);
            rule__Cantidad__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cantidad__Group__1_in_rule__Cantidad__Group__03250);
            rule__Cantidad__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cantidad__Group__0"


    // $ANTLR start "rule__Cantidad__Group__0__Impl"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1619:1: rule__Cantidad__Group__0__Impl : ( ( rule__Cantidad__UnArticuloAssignment_0 )? ) ;
    public final void rule__Cantidad__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1623:1: ( ( ( rule__Cantidad__UnArticuloAssignment_0 )? ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1624:1: ( ( rule__Cantidad__UnArticuloAssignment_0 )? )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1624:1: ( ( rule__Cantidad__UnArticuloAssignment_0 )? )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1625:1: ( rule__Cantidad__UnArticuloAssignment_0 )?
            {
             before(grammarAccess.getCantidadAccess().getUnArticuloAssignment_0()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1626:1: ( rule__Cantidad__UnArticuloAssignment_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=15 && LA12_0<=16)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1626:2: rule__Cantidad__UnArticuloAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Cantidad__UnArticuloAssignment_0_in_rule__Cantidad__Group__0__Impl3277);
                    rule__Cantidad__UnArticuloAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCantidadAccess().getUnArticuloAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cantidad__Group__0__Impl"


    // $ANTLR start "rule__Cantidad__Group__1"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1636:1: rule__Cantidad__Group__1 : rule__Cantidad__Group__1__Impl rule__Cantidad__Group__2 ;
    public final void rule__Cantidad__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1640:1: ( rule__Cantidad__Group__1__Impl rule__Cantidad__Group__2 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1641:2: rule__Cantidad__Group__1__Impl rule__Cantidad__Group__2
            {
            pushFollow(FOLLOW_rule__Cantidad__Group__1__Impl_in_rule__Cantidad__Group__13308);
            rule__Cantidad__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cantidad__Group__2_in_rule__Cantidad__Group__13311);
            rule__Cantidad__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cantidad__Group__1"


    // $ANTLR start "rule__Cantidad__Group__1__Impl"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1648:1: rule__Cantidad__Group__1__Impl : ( ( rule__Cantidad__UnValorAssignment_1 )? ) ;
    public final void rule__Cantidad__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1652:1: ( ( ( rule__Cantidad__UnValorAssignment_1 )? ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1653:1: ( ( rule__Cantidad__UnValorAssignment_1 )? )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1653:1: ( ( rule__Cantidad__UnValorAssignment_1 )? )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1654:1: ( rule__Cantidad__UnValorAssignment_1 )?
            {
             before(grammarAccess.getCantidadAccess().getUnValorAssignment_1()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1655:1: ( rule__Cantidad__UnValorAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1655:2: rule__Cantidad__UnValorAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Cantidad__UnValorAssignment_1_in_rule__Cantidad__Group__1__Impl3338);
                    rule__Cantidad__UnValorAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCantidadAccess().getUnValorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cantidad__Group__1__Impl"


    // $ANTLR start "rule__Cantidad__Group__2"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1665:1: rule__Cantidad__Group__2 : rule__Cantidad__Group__2__Impl ;
    public final void rule__Cantidad__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1669:1: ( rule__Cantidad__Group__2__Impl )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1670:2: rule__Cantidad__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Cantidad__Group__2__Impl_in_rule__Cantidad__Group__23369);
            rule__Cantidad__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cantidad__Group__2"


    // $ANTLR start "rule__Cantidad__Group__2__Impl"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1676:1: rule__Cantidad__Group__2__Impl : ( ( rule__Cantidad__UnaCantidadAssignment_2 ) ) ;
    public final void rule__Cantidad__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1680:1: ( ( ( rule__Cantidad__UnaCantidadAssignment_2 ) ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1681:1: ( ( rule__Cantidad__UnaCantidadAssignment_2 ) )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1681:1: ( ( rule__Cantidad__UnaCantidadAssignment_2 ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1682:1: ( rule__Cantidad__UnaCantidadAssignment_2 )
            {
             before(grammarAccess.getCantidadAccess().getUnaCantidadAssignment_2()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1683:1: ( rule__Cantidad__UnaCantidadAssignment_2 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1683:2: rule__Cantidad__UnaCantidadAssignment_2
            {
            pushFollow(FOLLOW_rule__Cantidad__UnaCantidadAssignment_2_in_rule__Cantidad__Group__2__Impl3396);
            rule__Cantidad__UnaCantidadAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCantidadAccess().getUnaCantidadAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cantidad__Group__2__Impl"


    // $ANTLR start "rule__Cliente__Group__0"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1699:1: rule__Cliente__Group__0 : rule__Cliente__Group__0__Impl rule__Cliente__Group__1 ;
    public final void rule__Cliente__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1703:1: ( rule__Cliente__Group__0__Impl rule__Cliente__Group__1 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1704:2: rule__Cliente__Group__0__Impl rule__Cliente__Group__1
            {
            pushFollow(FOLLOW_rule__Cliente__Group__0__Impl_in_rule__Cliente__Group__03432);
            rule__Cliente__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cliente__Group__1_in_rule__Cliente__Group__03435);
            rule__Cliente__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cliente__Group__0"


    // $ANTLR start "rule__Cliente__Group__0__Impl"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1711:1: rule__Cliente__Group__0__Impl : ( 'Cliente' ) ;
    public final void rule__Cliente__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1715:1: ( ( 'Cliente' ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1716:1: ( 'Cliente' )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1716:1: ( 'Cliente' )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1717:1: 'Cliente'
            {
             before(grammarAccess.getClienteAccess().getClienteKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Cliente__Group__0__Impl3463); 
             after(grammarAccess.getClienteAccess().getClienteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cliente__Group__0__Impl"


    // $ANTLR start "rule__Cliente__Group__1"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1730:1: rule__Cliente__Group__1 : rule__Cliente__Group__1__Impl ;
    public final void rule__Cliente__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1734:1: ( rule__Cliente__Group__1__Impl )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1735:2: rule__Cliente__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Cliente__Group__1__Impl_in_rule__Cliente__Group__13494);
            rule__Cliente__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cliente__Group__1"


    // $ANTLR start "rule__Cliente__Group__1__Impl"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1741:1: rule__Cliente__Group__1__Impl : ( ( rule__Cliente__NameAssignment_1 ) ) ;
    public final void rule__Cliente__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1745:1: ( ( ( rule__Cliente__NameAssignment_1 ) ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1746:1: ( ( rule__Cliente__NameAssignment_1 ) )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1746:1: ( ( rule__Cliente__NameAssignment_1 ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1747:1: ( rule__Cliente__NameAssignment_1 )
            {
             before(grammarAccess.getClienteAccess().getNameAssignment_1()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1748:1: ( rule__Cliente__NameAssignment_1 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1748:2: rule__Cliente__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Cliente__NameAssignment_1_in_rule__Cliente__Group__1__Impl3521);
            rule__Cliente__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClienteAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cliente__Group__1__Impl"


    // $ANTLR start "rule__EstadoDeuda__Group__0"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1762:1: rule__EstadoDeuda__Group__0 : rule__EstadoDeuda__Group__0__Impl rule__EstadoDeuda__Group__1 ;
    public final void rule__EstadoDeuda__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1766:1: ( rule__EstadoDeuda__Group__0__Impl rule__EstadoDeuda__Group__1 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1767:2: rule__EstadoDeuda__Group__0__Impl rule__EstadoDeuda__Group__1
            {
            pushFollow(FOLLOW_rule__EstadoDeuda__Group__0__Impl_in_rule__EstadoDeuda__Group__03555);
            rule__EstadoDeuda__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EstadoDeuda__Group__1_in_rule__EstadoDeuda__Group__03558);
            rule__EstadoDeuda__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EstadoDeuda__Group__0"


    // $ANTLR start "rule__EstadoDeuda__Group__0__Impl"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1774:1: rule__EstadoDeuda__Group__0__Impl : ( ( rule__EstadoDeuda__Alternatives_0 ) ) ;
    public final void rule__EstadoDeuda__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1778:1: ( ( ( rule__EstadoDeuda__Alternatives_0 ) ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1779:1: ( ( rule__EstadoDeuda__Alternatives_0 ) )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1779:1: ( ( rule__EstadoDeuda__Alternatives_0 ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1780:1: ( rule__EstadoDeuda__Alternatives_0 )
            {
             before(grammarAccess.getEstadoDeudaAccess().getAlternatives_0()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1781:1: ( rule__EstadoDeuda__Alternatives_0 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1781:2: rule__EstadoDeuda__Alternatives_0
            {
            pushFollow(FOLLOW_rule__EstadoDeuda__Alternatives_0_in_rule__EstadoDeuda__Group__0__Impl3585);
            rule__EstadoDeuda__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getEstadoDeudaAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EstadoDeuda__Group__0__Impl"


    // $ANTLR start "rule__EstadoDeuda__Group__1"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1791:1: rule__EstadoDeuda__Group__1 : rule__EstadoDeuda__Group__1__Impl ;
    public final void rule__EstadoDeuda__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1795:1: ( rule__EstadoDeuda__Group__1__Impl )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1796:2: rule__EstadoDeuda__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EstadoDeuda__Group__1__Impl_in_rule__EstadoDeuda__Group__13615);
            rule__EstadoDeuda__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EstadoDeuda__Group__1"


    // $ANTLR start "rule__EstadoDeuda__Group__1__Impl"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1802:1: rule__EstadoDeuda__Group__1__Impl : ( ( ruleImporte )? ) ;
    public final void rule__EstadoDeuda__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1806:1: ( ( ( ruleImporte )? ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1807:1: ( ( ruleImporte )? )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1807:1: ( ( ruleImporte )? )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1808:1: ( ruleImporte )?
            {
             before(grammarAccess.getEstadoDeudaAccess().getImporteParserRuleCall_1()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1809:1: ( ruleImporte )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1809:3: ruleImporte
                    {
                    pushFollow(FOLLOW_ruleImporte_in_rule__EstadoDeuda__Group__1__Impl3643);
                    ruleImporte();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEstadoDeudaAccess().getImporteParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EstadoDeuda__Group__1__Impl"


    // $ANTLR start "rule__Importe__Group__0"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1823:1: rule__Importe__Group__0 : rule__Importe__Group__0__Impl rule__Importe__Group__1 ;
    public final void rule__Importe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1827:1: ( rule__Importe__Group__0__Impl rule__Importe__Group__1 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1828:2: rule__Importe__Group__0__Impl rule__Importe__Group__1
            {
            pushFollow(FOLLOW_rule__Importe__Group__0__Impl_in_rule__Importe__Group__03678);
            rule__Importe__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Importe__Group__1_in_rule__Importe__Group__03681);
            rule__Importe__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Importe__Group__0"


    // $ANTLR start "rule__Importe__Group__0__Impl"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1835:1: rule__Importe__Group__0__Impl : ( ( rule__Importe__ValorAssignment_0 ) ) ;
    public final void rule__Importe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1839:1: ( ( ( rule__Importe__ValorAssignment_0 ) ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1840:1: ( ( rule__Importe__ValorAssignment_0 ) )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1840:1: ( ( rule__Importe__ValorAssignment_0 ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1841:1: ( rule__Importe__ValorAssignment_0 )
            {
             before(grammarAccess.getImporteAccess().getValorAssignment_0()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1842:1: ( rule__Importe__ValorAssignment_0 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1842:2: rule__Importe__ValorAssignment_0
            {
            pushFollow(FOLLOW_rule__Importe__ValorAssignment_0_in_rule__Importe__Group__0__Impl3708);
            rule__Importe__ValorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getImporteAccess().getValorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Importe__Group__0__Impl"


    // $ANTLR start "rule__Importe__Group__1"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1852:1: rule__Importe__Group__1 : rule__Importe__Group__1__Impl ;
    public final void rule__Importe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1856:1: ( rule__Importe__Group__1__Impl )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1857:2: rule__Importe__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Importe__Group__1__Impl_in_rule__Importe__Group__13738);
            rule__Importe__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Importe__Group__1"


    // $ANTLR start "rule__Importe__Group__1__Impl"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1863:1: rule__Importe__Group__1__Impl : ( ( rule__Importe__MonedaAssignment_1 ) ) ;
    public final void rule__Importe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1867:1: ( ( ( rule__Importe__MonedaAssignment_1 ) ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1868:1: ( ( rule__Importe__MonedaAssignment_1 ) )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1868:1: ( ( rule__Importe__MonedaAssignment_1 ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1869:1: ( rule__Importe__MonedaAssignment_1 )
            {
             before(grammarAccess.getImporteAccess().getMonedaAssignment_1()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1870:1: ( rule__Importe__MonedaAssignment_1 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1870:2: rule__Importe__MonedaAssignment_1
            {
            pushFollow(FOLLOW_rule__Importe__MonedaAssignment_1_in_rule__Importe__Group__1__Impl3765);
            rule__Importe__MonedaAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImporteAccess().getMonedaAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Importe__Group__1__Impl"


    // $ANTLR start "rule__Verduleria__AnotacionesAssignment"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1885:1: rule__Verduleria__AnotacionesAssignment : ( ( rule__Verduleria__AnotacionesAlternatives_0 ) ) ;
    public final void rule__Verduleria__AnotacionesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1889:1: ( ( ( rule__Verduleria__AnotacionesAlternatives_0 ) ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1890:1: ( ( rule__Verduleria__AnotacionesAlternatives_0 ) )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1890:1: ( ( rule__Verduleria__AnotacionesAlternatives_0 ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1891:1: ( rule__Verduleria__AnotacionesAlternatives_0 )
            {
             before(grammarAccess.getVerduleriaAccess().getAnotacionesAlternatives_0()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1892:1: ( rule__Verduleria__AnotacionesAlternatives_0 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1892:2: rule__Verduleria__AnotacionesAlternatives_0
            {
            pushFollow(FOLLOW_rule__Verduleria__AnotacionesAlternatives_0_in_rule__Verduleria__AnotacionesAssignment3804);
            rule__Verduleria__AnotacionesAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getVerduleriaAccess().getAnotacionesAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verduleria__AnotacionesAssignment"


    // $ANTLR start "rule__ModelCliente__ClientesAssignment_0"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1901:1: rule__ModelCliente__ClientesAssignment_0 : ( ruleCliente ) ;
    public final void rule__ModelCliente__ClientesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1905:1: ( ( ruleCliente ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1906:1: ( ruleCliente )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1906:1: ( ruleCliente )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1907:1: ruleCliente
            {
             before(grammarAccess.getModelClienteAccess().getClientesClienteParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCliente_in_rule__ModelCliente__ClientesAssignment_03837);
            ruleCliente();

            state._fsp--;

             after(grammarAccess.getModelClienteAccess().getClientesClienteParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelCliente__ClientesAssignment_0"


    // $ANTLR start "rule__ModelCliente__EstadoDeDeudaAssignment_2"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1916:1: rule__ModelCliente__EstadoDeDeudaAssignment_2 : ( ruleEstadoDeuda ) ;
    public final void rule__ModelCliente__EstadoDeDeudaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1920:1: ( ( ruleEstadoDeuda ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1921:1: ( ruleEstadoDeuda )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1921:1: ( ruleEstadoDeuda )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1922:1: ruleEstadoDeuda
            {
             before(grammarAccess.getModelClienteAccess().getEstadoDeDeudaEstadoDeudaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEstadoDeuda_in_rule__ModelCliente__EstadoDeDeudaAssignment_23868);
            ruleEstadoDeuda();

            state._fsp--;

             after(grammarAccess.getModelClienteAccess().getEstadoDeDeudaEstadoDeudaParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelCliente__EstadoDeDeudaAssignment_2"


    // $ANTLR start "rule__ModelProducto__ProductosAssignment_0"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1931:1: rule__ModelProducto__ProductosAssignment_0 : ( ruleProducto ) ;
    public final void rule__ModelProducto__ProductosAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1935:1: ( ( ruleProducto ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1936:1: ( ruleProducto )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1936:1: ( ruleProducto )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1937:1: ruleProducto
            {
             before(grammarAccess.getModelProductoAccess().getProductosProductoParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleProducto_in_rule__ModelProducto__ProductosAssignment_03899);
            ruleProducto();

            state._fsp--;

             after(grammarAccess.getModelProductoAccess().getProductosProductoParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProducto__ProductosAssignment_0"


    // $ANTLR start "rule__ModelProducto__ValorAssignment_1"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1946:1: rule__ModelProducto__ValorAssignment_1 : ( ruleValorDelProducto ) ;
    public final void rule__ModelProducto__ValorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1950:1: ( ( ruleValorDelProducto ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1951:1: ( ruleValorDelProducto )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1951:1: ( ruleValorDelProducto )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1952:1: ruleValorDelProducto
            {
             before(grammarAccess.getModelProductoAccess().getValorValorDelProductoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleValorDelProducto_in_rule__ModelProducto__ValorAssignment_13930);
            ruleValorDelProducto();

            state._fsp--;

             after(grammarAccess.getModelProductoAccess().getValorValorDelProductoParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProducto__ValorAssignment_1"


    // $ANTLR start "rule__ModelVenta__VentaAssignment"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1961:1: rule__ModelVenta__VentaAssignment : ( ruleVenta ) ;
    public final void rule__ModelVenta__VentaAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1965:1: ( ( ruleVenta ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1966:1: ( ruleVenta )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1966:1: ( ruleVenta )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1967:1: ruleVenta
            {
             before(grammarAccess.getModelVentaAccess().getVentaVentaParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleVenta_in_rule__ModelVenta__VentaAssignment3961);
            ruleVenta();

            state._fsp--;

             after(grammarAccess.getModelVentaAccess().getVentaVentaParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelVenta__VentaAssignment"


    // $ANTLR start "rule__Venta__NombreAssignment_0"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1976:1: rule__Venta__NombreAssignment_0 : ( RULE_ID ) ;
    public final void rule__Venta__NombreAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1980:1: ( ( RULE_ID ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1981:1: ( RULE_ID )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1981:1: ( RULE_ID )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1982:1: RULE_ID
            {
             before(grammarAccess.getVentaAccess().getNombreIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Venta__NombreAssignment_03992); 
             after(grammarAccess.getVentaAccess().getNombreIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Venta__NombreAssignment_0"


    // $ANTLR start "rule__Venta__UnaListaDeComprasAssignment_2_0"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1991:1: rule__Venta__UnaListaDeComprasAssignment_2_0 : ( ruleMercaderia ) ;
    public final void rule__Venta__UnaListaDeComprasAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1995:1: ( ( ruleMercaderia ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1996:1: ( ruleMercaderia )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1996:1: ( ruleMercaderia )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:1997:1: ruleMercaderia
            {
             before(grammarAccess.getVentaAccess().getUnaListaDeComprasMercaderiaParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleMercaderia_in_rule__Venta__UnaListaDeComprasAssignment_2_04023);
            ruleMercaderia();

            state._fsp--;

             after(grammarAccess.getVentaAccess().getUnaListaDeComprasMercaderiaParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Venta__UnaListaDeComprasAssignment_2_0"


    // $ANTLR start "rule__Venta__UnImporteAssignment_4"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2006:1: rule__Venta__UnImporteAssignment_4 : ( ruleImporte ) ;
    public final void rule__Venta__UnImporteAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2010:1: ( ( ruleImporte ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2011:1: ( ruleImporte )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2011:1: ( ruleImporte )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2012:1: ruleImporte
            {
             before(grammarAccess.getVentaAccess().getUnImporteImporteParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleImporte_in_rule__Venta__UnImporteAssignment_44054);
            ruleImporte();

            state._fsp--;

             after(grammarAccess.getVentaAccess().getUnImporteImporteParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Venta__UnImporteAssignment_4"


    // $ANTLR start "rule__Venta__UnTotalAssignment_6"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2021:1: rule__Venta__UnTotalAssignment_6 : ( ruleTotalDeCompra ) ;
    public final void rule__Venta__UnTotalAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2025:1: ( ( ruleTotalDeCompra ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2026:1: ( ruleTotalDeCompra )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2026:1: ( ruleTotalDeCompra )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2027:1: ruleTotalDeCompra
            {
             before(grammarAccess.getVentaAccess().getUnTotalTotalDeCompraParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleTotalDeCompra_in_rule__Venta__UnTotalAssignment_64085);
            ruleTotalDeCompra();

            state._fsp--;

             after(grammarAccess.getVentaAccess().getUnTotalTotalDeCompraParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Venta__UnTotalAssignment_6"


    // $ANTLR start "rule__TotalDeCompra__UnTotalAssignment_0"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2036:1: rule__TotalDeCompra__UnTotalAssignment_0 : ( ( rule__TotalDeCompra__UnTotalAlternatives_0_0 ) ) ;
    public final void rule__TotalDeCompra__UnTotalAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2040:1: ( ( ( rule__TotalDeCompra__UnTotalAlternatives_0_0 ) ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2041:1: ( ( rule__TotalDeCompra__UnTotalAlternatives_0_0 ) )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2041:1: ( ( rule__TotalDeCompra__UnTotalAlternatives_0_0 ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2042:1: ( rule__TotalDeCompra__UnTotalAlternatives_0_0 )
            {
             before(grammarAccess.getTotalDeCompraAccess().getUnTotalAlternatives_0_0()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2043:1: ( rule__TotalDeCompra__UnTotalAlternatives_0_0 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2043:2: rule__TotalDeCompra__UnTotalAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__TotalDeCompra__UnTotalAlternatives_0_0_in_rule__TotalDeCompra__UnTotalAssignment_04116);
            rule__TotalDeCompra__UnTotalAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getTotalDeCompraAccess().getUnTotalAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TotalDeCompra__UnTotalAssignment_0"


    // $ANTLR start "rule__TotalDeCompra__UnImporteTotalAssignment_1"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2052:1: rule__TotalDeCompra__UnImporteTotalAssignment_1 : ( ruleImporte ) ;
    public final void rule__TotalDeCompra__UnImporteTotalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2056:1: ( ( ruleImporte ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2057:1: ( ruleImporte )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2057:1: ( ruleImporte )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2058:1: ruleImporte
            {
             before(grammarAccess.getTotalDeCompraAccess().getUnImporteTotalImporteParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleImporte_in_rule__TotalDeCompra__UnImporteTotalAssignment_14149);
            ruleImporte();

            state._fsp--;

             after(grammarAccess.getTotalDeCompraAccess().getUnImporteTotalImporteParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TotalDeCompra__UnImporteTotalAssignment_1"


    // $ANTLR start "rule__Mercaderia__UnaDescripcionAssignment_0"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2067:1: rule__Mercaderia__UnaDescripcionAssignment_0 : ( ruleCantidad ) ;
    public final void rule__Mercaderia__UnaDescripcionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2071:1: ( ( ruleCantidad ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2072:1: ( ruleCantidad )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2072:1: ( ruleCantidad )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2073:1: ruleCantidad
            {
             before(grammarAccess.getMercaderiaAccess().getUnaDescripcionCantidadParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCantidad_in_rule__Mercaderia__UnaDescripcionAssignment_04180);
            ruleCantidad();

            state._fsp--;

             after(grammarAccess.getMercaderiaAccess().getUnaDescripcionCantidadParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mercaderia__UnaDescripcionAssignment_0"


    // $ANTLR start "rule__Mercaderia__NombreDeProductoAssignment_2"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2082:1: rule__Mercaderia__NombreDeProductoAssignment_2 : ( RULE_ID ) ;
    public final void rule__Mercaderia__NombreDeProductoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2086:1: ( ( RULE_ID ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2087:1: ( RULE_ID )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2087:1: ( RULE_ID )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2088:1: RULE_ID
            {
             before(grammarAccess.getMercaderiaAccess().getNombreDeProductoIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Mercaderia__NombreDeProductoAssignment_24211); 
             after(grammarAccess.getMercaderiaAccess().getNombreDeProductoIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mercaderia__NombreDeProductoAssignment_2"


    // $ANTLR start "rule__Producto__NombreDeProductoAssignment_1"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2097:1: rule__Producto__NombreDeProductoAssignment_1 : ( RULE_ID ) ;
    public final void rule__Producto__NombreDeProductoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2101:1: ( ( RULE_ID ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2102:1: ( RULE_ID )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2102:1: ( RULE_ID )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2103:1: RULE_ID
            {
             before(grammarAccess.getProductoAccess().getNombreDeProductoIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Producto__NombreDeProductoAssignment_14242); 
             after(grammarAccess.getProductoAccess().getNombreDeProductoIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__NombreDeProductoAssignment_1"


    // $ANTLR start "rule__ValorDelProducto__UnaDescripcionAssignment_1"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2112:1: rule__ValorDelProducto__UnaDescripcionAssignment_1 : ( ruleDescripcion ) ;
    public final void rule__ValorDelProducto__UnaDescripcionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2116:1: ( ( ruleDescripcion ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2117:1: ( ruleDescripcion )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2117:1: ( ruleDescripcion )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2118:1: ruleDescripcion
            {
             before(grammarAccess.getValorDelProductoAccess().getUnaDescripcionDescripcionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDescripcion_in_rule__ValorDelProducto__UnaDescripcionAssignment_14273);
            ruleDescripcion();

            state._fsp--;

             after(grammarAccess.getValorDelProductoAccess().getUnaDescripcionDescripcionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValorDelProducto__UnaDescripcionAssignment_1"


    // $ANTLR start "rule__Descripcion__UnImporteAssignment_0"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2127:1: rule__Descripcion__UnImporteAssignment_0 : ( ruleImporte ) ;
    public final void rule__Descripcion__UnImporteAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2131:1: ( ( ruleImporte ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2132:1: ( ruleImporte )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2132:1: ( ruleImporte )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2133:1: ruleImporte
            {
             before(grammarAccess.getDescripcionAccess().getUnImporteImporteParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImporte_in_rule__Descripcion__UnImporteAssignment_04304);
            ruleImporte();

            state._fsp--;

             after(grammarAccess.getDescripcionAccess().getUnImporteImporteParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Descripcion__UnImporteAssignment_0"


    // $ANTLR start "rule__Descripcion__UnaCantidadAssignment_1"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2142:1: rule__Descripcion__UnaCantidadAssignment_1 : ( ruleCantidad ) ;
    public final void rule__Descripcion__UnaCantidadAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2146:1: ( ( ruleCantidad ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2147:1: ( ruleCantidad )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2147:1: ( ruleCantidad )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2148:1: ruleCantidad
            {
             before(grammarAccess.getDescripcionAccess().getUnaCantidadCantidadParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCantidad_in_rule__Descripcion__UnaCantidadAssignment_14335);
            ruleCantidad();

            state._fsp--;

             after(grammarAccess.getDescripcionAccess().getUnaCantidadCantidadParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Descripcion__UnaCantidadAssignment_1"


    // $ANTLR start "rule__Cantidad__UnArticuloAssignment_0"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2157:1: rule__Cantidad__UnArticuloAssignment_0 : ( ruleArticulo ) ;
    public final void rule__Cantidad__UnArticuloAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2161:1: ( ( ruleArticulo ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2162:1: ( ruleArticulo )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2162:1: ( ruleArticulo )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2163:1: ruleArticulo
            {
             before(grammarAccess.getCantidadAccess().getUnArticuloArticuloParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleArticulo_in_rule__Cantidad__UnArticuloAssignment_04366);
            ruleArticulo();

            state._fsp--;

             after(grammarAccess.getCantidadAccess().getUnArticuloArticuloParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cantidad__UnArticuloAssignment_0"


    // $ANTLR start "rule__Cantidad__UnValorAssignment_1"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2172:1: rule__Cantidad__UnValorAssignment_1 : ( RULE_INT ) ;
    public final void rule__Cantidad__UnValorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2176:1: ( ( RULE_INT ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2177:1: ( RULE_INT )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2177:1: ( RULE_INT )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2178:1: RULE_INT
            {
             before(grammarAccess.getCantidadAccess().getUnValorINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Cantidad__UnValorAssignment_14397); 
             after(grammarAccess.getCantidadAccess().getUnValorINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cantidad__UnValorAssignment_1"


    // $ANTLR start "rule__Cantidad__UnaCantidadAssignment_2"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2187:1: rule__Cantidad__UnaCantidadAssignment_2 : ( ruleUnidad ) ;
    public final void rule__Cantidad__UnaCantidadAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2191:1: ( ( ruleUnidad ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2192:1: ( ruleUnidad )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2192:1: ( ruleUnidad )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2193:1: ruleUnidad
            {
             before(grammarAccess.getCantidadAccess().getUnaCantidadUnidadParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleUnidad_in_rule__Cantidad__UnaCantidadAssignment_24428);
            ruleUnidad();

            state._fsp--;

             after(grammarAccess.getCantidadAccess().getUnaCantidadUnidadParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cantidad__UnaCantidadAssignment_2"


    // $ANTLR start "rule__Articulo__UnArticuloAssignment"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2202:1: rule__Articulo__UnArticuloAssignment : ( ( rule__Articulo__UnArticuloAlternatives_0 ) ) ;
    public final void rule__Articulo__UnArticuloAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2206:1: ( ( ( rule__Articulo__UnArticuloAlternatives_0 ) ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2207:1: ( ( rule__Articulo__UnArticuloAlternatives_0 ) )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2207:1: ( ( rule__Articulo__UnArticuloAlternatives_0 ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2208:1: ( rule__Articulo__UnArticuloAlternatives_0 )
            {
             before(grammarAccess.getArticuloAccess().getUnArticuloAlternatives_0()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2209:1: ( rule__Articulo__UnArticuloAlternatives_0 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2209:2: rule__Articulo__UnArticuloAlternatives_0
            {
            pushFollow(FOLLOW_rule__Articulo__UnArticuloAlternatives_0_in_rule__Articulo__UnArticuloAssignment4459);
            rule__Articulo__UnArticuloAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getArticuloAccess().getUnArticuloAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Articulo__UnArticuloAssignment"


    // $ANTLR start "rule__Unidad__UnaUnidadAssignment"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2218:1: rule__Unidad__UnaUnidadAssignment : ( ( rule__Unidad__UnaUnidadAlternatives_0 ) ) ;
    public final void rule__Unidad__UnaUnidadAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2222:1: ( ( ( rule__Unidad__UnaUnidadAlternatives_0 ) ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2223:1: ( ( rule__Unidad__UnaUnidadAlternatives_0 ) )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2223:1: ( ( rule__Unidad__UnaUnidadAlternatives_0 ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2224:1: ( rule__Unidad__UnaUnidadAlternatives_0 )
            {
             before(grammarAccess.getUnidadAccess().getUnaUnidadAlternatives_0()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2225:1: ( rule__Unidad__UnaUnidadAlternatives_0 )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2225:2: rule__Unidad__UnaUnidadAlternatives_0
            {
            pushFollow(FOLLOW_rule__Unidad__UnaUnidadAlternatives_0_in_rule__Unidad__UnaUnidadAssignment4492);
            rule__Unidad__UnaUnidadAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getUnidadAccess().getUnaUnidadAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unidad__UnaUnidadAssignment"


    // $ANTLR start "rule__Cliente__NameAssignment_1"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2234:1: rule__Cliente__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Cliente__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2238:1: ( ( RULE_ID ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2239:1: ( RULE_ID )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2239:1: ( RULE_ID )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2240:1: RULE_ID
            {
             before(grammarAccess.getClienteAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Cliente__NameAssignment_14525); 
             after(grammarAccess.getClienteAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cliente__NameAssignment_1"


    // $ANTLR start "rule__Importe__ValorAssignment_0"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2249:1: rule__Importe__ValorAssignment_0 : ( RULE_INT ) ;
    public final void rule__Importe__ValorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2253:1: ( ( RULE_INT ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2254:1: ( RULE_INT )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2254:1: ( RULE_INT )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2255:1: RULE_INT
            {
             before(grammarAccess.getImporteAccess().getValorINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Importe__ValorAssignment_04556); 
             after(grammarAccess.getImporteAccess().getValorINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Importe__ValorAssignment_0"


    // $ANTLR start "rule__Importe__MonedaAssignment_1"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2264:1: rule__Importe__MonedaAssignment_1 : ( ruleMoneda ) ;
    public final void rule__Importe__MonedaAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2268:1: ( ( ruleMoneda ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2269:1: ( ruleMoneda )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2269:1: ( ruleMoneda )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2270:1: ruleMoneda
            {
             before(grammarAccess.getImporteAccess().getMonedaMonedaParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMoneda_in_rule__Importe__MonedaAssignment_14587);
            ruleMoneda();

            state._fsp--;

             after(grammarAccess.getImporteAccess().getMonedaMonedaParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Importe__MonedaAssignment_1"


    // $ANTLR start "rule__Moneda__PesosAssignment"
    // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2279:1: rule__Moneda__PesosAssignment : ( ( 'pesos' ) ) ;
    public final void rule__Moneda__PesosAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2283:1: ( ( ( 'pesos' ) ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2284:1: ( ( 'pesos' ) )
            {
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2284:1: ( ( 'pesos' ) )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2285:1: ( 'pesos' )
            {
             before(grammarAccess.getMonedaAccess().getPesosPesosKeyword_0()); 
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2286:1: ( 'pesos' )
            // ../textVerduler.ui/src-gen/textVerduler/ui/contentassist/antlr/internal/InternalTextVerduler.g:2287:1: 'pesos'
            {
             before(grammarAccess.getMonedaAccess().getPesosPesosKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Moneda__PesosAssignment4623); 
             after(grammarAccess.getMonedaAccess().getPesosPesosKeyword_0()); 

            }

             after(grammarAccess.getMonedaAccess().getPesosPesosKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Moneda__PesosAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleVerduleria_in_entryRuleVerduleria61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerduleria68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Verduleria__AnotacionesAssignment_in_ruleVerduleria94 = new BitSet(new long[]{0x0000000080006012L});
    public static final BitSet FOLLOW_ruleModelCliente_in_entryRuleModelCliente122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelCliente129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelCliente__Group__0_in_ruleModelCliente155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelProducto_in_entryRuleModelProducto182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelProducto189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelProducto__Group__0_in_ruleModelProducto215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelVenta_in_entryRuleModelVenta242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelVenta249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelVenta__VentaAssignment_in_ruleModelVenta275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVenta_in_entryRuleVenta302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVenta309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Venta__Group__0_in_ruleVenta335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTotalDeCompra_in_entryRuleTotalDeCompra362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTotalDeCompra369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TotalDeCompra__Group__0_in_ruleTotalDeCompra395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMercaderia_in_entryRuleMercaderia422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMercaderia429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mercaderia__Group__0_in_ruleMercaderia455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProducto_in_entryRuleProducto482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProducto489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Producto__Group__0_in_ruleProducto515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValorDelProducto_in_entryRuleValorDelProducto542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValorDelProducto549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValorDelProducto__Group__0_in_ruleValorDelProducto575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescripcion_in_entryRuleDescripcion602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDescripcion609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Descripcion__Group__0_in_ruleDescripcion635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCantidad_in_entryRuleCantidad662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCantidad669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cantidad__Group__0_in_ruleCantidad695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArticulo_in_entryRuleArticulo722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArticulo729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Articulo__UnArticuloAssignment_in_ruleArticulo755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnidad_in_entryRuleUnidad782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnidad789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unidad__UnaUnidadAssignment_in_ruleUnidad815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCliente_in_entryRuleCliente842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCliente849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cliente__Group__0_in_ruleCliente875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEstadoDeuda_in_entryRuleEstadoDeuda902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEstadoDeuda909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EstadoDeuda__Group__0_in_ruleEstadoDeuda935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImporte_in_entryRuleImporte962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImporte969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Importe__Group__0_in_ruleImporte995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMoneda_in_entryRuleMoneda1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMoneda1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Moneda__PesosAssignment_in_ruleMoneda1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelCliente_in_rule__Verduleria__AnotacionesAlternatives_01091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelProducto_in_rule__Verduleria__AnotacionesAlternatives_01108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelVenta_in_rule__Verduleria__AnotacionesAlternatives_01125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__TotalDeCompra__UnTotalAlternatives_0_01158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__TotalDeCompra__UnTotalAlternatives_0_01178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Producto__Alternatives_01213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Producto__Alternatives_01233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Articulo__UnArticuloAlternatives_01268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Articulo__UnArticuloAlternatives_01288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Unidad__UnaUnidadAlternatives_01323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Unidad__UnaUnidadAlternatives_01343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Unidad__UnaUnidadAlternatives_01363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Unidad__UnaUnidadAlternatives_01383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Unidad__UnaUnidadAlternatives_01403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EstadoDeuda__Alternatives_01438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EstadoDeuda__Alternatives_01458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__EstadoDeuda__Alternatives_01478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelCliente__Group__0__Impl_in_rule__ModelCliente__Group__01510 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ModelCliente__Group__1_in_rule__ModelCliente__Group__01513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelCliente__ClientesAssignment_0_in_rule__ModelCliente__Group__0__Impl1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelCliente__Group__1__Impl_in_rule__ModelCliente__Group__11570 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_rule__ModelCliente__Group__2_in_rule__ModelCliente__Group__11573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ModelCliente__Group__1__Impl1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelCliente__Group__2__Impl_in_rule__ModelCliente__Group__21632 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ModelCliente__Group__3_in_rule__ModelCliente__Group__21635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelCliente__EstadoDeDeudaAssignment_2_in_rule__ModelCliente__Group__2__Impl1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelCliente__Group__3__Impl_in_rule__ModelCliente__Group__31692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ModelCliente__Group__3__Impl1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelProducto__Group__0__Impl_in_rule__ModelProducto__Group__01759 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ModelProducto__Group__1_in_rule__ModelProducto__Group__01762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelProducto__ProductosAssignment_0_in_rule__ModelProducto__Group__0__Impl1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelProducto__Group__1__Impl_in_rule__ModelProducto__Group__11819 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ModelProducto__Group__2_in_rule__ModelProducto__Group__11822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelProducto__ValorAssignment_1_in_rule__ModelProducto__Group__1__Impl1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelProducto__Group__2__Impl_in_rule__ModelProducto__Group__21879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ModelProducto__Group__2__Impl1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Venta__Group__0__Impl_in_rule__Venta__Group__01944 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Venta__Group__1_in_rule__Venta__Group__01947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Venta__NombreAssignment_0_in_rule__Venta__Group__0__Impl1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Venta__Group__1__Impl_in_rule__Venta__Group__12004 = new BitSet(new long[]{0x00000000103F8020L});
    public static final BitSet FOLLOW_rule__Venta__Group__2_in_rule__Venta__Group__12007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Venta__Group__1__Impl2035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Venta__Group__2__Impl_in_rule__Venta__Group__22066 = new BitSet(new long[]{0x00000000103F8020L});
    public static final BitSet FOLLOW_rule__Venta__Group__3_in_rule__Venta__Group__22069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Venta__Group_2__0_in_rule__Venta__Group__2__Impl2096 = new BitSet(new long[]{0x00000000003F8022L});
    public static final BitSet FOLLOW_rule__Venta__Group__3__Impl_in_rule__Venta__Group__32127 = new BitSet(new long[]{0x00000000103F8020L});
    public static final BitSet FOLLOW_rule__Venta__Group__4_in_rule__Venta__Group__32130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Venta__Group__3__Impl2159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Venta__Group__4__Impl_in_rule__Venta__Group__42192 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Venta__Group__5_in_rule__Venta__Group__42195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Venta__UnImporteAssignment_4_in_rule__Venta__Group__4__Impl2222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Venta__Group__5__Impl_in_rule__Venta__Group__52252 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Venta__Group__6_in_rule__Venta__Group__52255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Venta__Group__5__Impl2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Venta__Group__6__Impl_in_rule__Venta__Group__62314 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Venta__Group__7_in_rule__Venta__Group__62317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Venta__UnTotalAssignment_6_in_rule__Venta__Group__6__Impl2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Venta__Group__7__Impl_in_rule__Venta__Group__72374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Venta__Group__7__Impl2402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Venta__Group_2__0__Impl_in_rule__Venta__Group_2__02449 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Venta__Group_2__1_in_rule__Venta__Group_2__02452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Venta__UnaListaDeComprasAssignment_2_0_in_rule__Venta__Group_2__0__Impl2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Venta__Group_2__1__Impl_in_rule__Venta__Group_2__12509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Venta__Group_2__1__Impl2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TotalDeCompra__Group__0__Impl_in_rule__TotalDeCompra__Group__02575 = new BitSet(new long[]{0x00000000103F8020L});
    public static final BitSet FOLLOW_rule__TotalDeCompra__Group__1_in_rule__TotalDeCompra__Group__02578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TotalDeCompra__UnTotalAssignment_0_in_rule__TotalDeCompra__Group__0__Impl2605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TotalDeCompra__Group__1__Impl_in_rule__TotalDeCompra__Group__12635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TotalDeCompra__UnImporteTotalAssignment_1_in_rule__TotalDeCompra__Group__1__Impl2662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mercaderia__Group__0__Impl_in_rule__Mercaderia__Group__02697 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Mercaderia__Group__1_in_rule__Mercaderia__Group__02700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mercaderia__UnaDescripcionAssignment_0_in_rule__Mercaderia__Group__0__Impl2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mercaderia__Group__1__Impl_in_rule__Mercaderia__Group__12757 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Mercaderia__Group__2_in_rule__Mercaderia__Group__12760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Mercaderia__Group__1__Impl2788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mercaderia__Group__2__Impl_in_rule__Mercaderia__Group__22819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mercaderia__NombreDeProductoAssignment_2_in_rule__Mercaderia__Group__2__Impl2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Producto__Group__0__Impl_in_rule__Producto__Group__02882 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Producto__Group__1_in_rule__Producto__Group__02885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Producto__Alternatives_0_in_rule__Producto__Group__0__Impl2912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Producto__Group__1__Impl_in_rule__Producto__Group__12942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Producto__NombreDeProductoAssignment_1_in_rule__Producto__Group__1__Impl2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValorDelProducto__Group__0__Impl_in_rule__ValorDelProducto__Group__03003 = new BitSet(new long[]{0x00000000103F8020L});
    public static final BitSet FOLLOW_rule__ValorDelProducto__Group__1_in_rule__ValorDelProducto__Group__03006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ValorDelProducto__Group__0__Impl3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValorDelProducto__Group__1__Impl_in_rule__ValorDelProducto__Group__13065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValorDelProducto__UnaDescripcionAssignment_1_in_rule__ValorDelProducto__Group__1__Impl3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Descripcion__Group__0__Impl_in_rule__Descripcion__Group__03126 = new BitSet(new long[]{0x00000000003F8020L});
    public static final BitSet FOLLOW_rule__Descripcion__Group__1_in_rule__Descripcion__Group__03129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Descripcion__UnImporteAssignment_0_in_rule__Descripcion__Group__0__Impl3156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Descripcion__Group__1__Impl_in_rule__Descripcion__Group__13186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Descripcion__UnaCantidadAssignment_1_in_rule__Descripcion__Group__1__Impl3213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cantidad__Group__0__Impl_in_rule__Cantidad__Group__03247 = new BitSet(new long[]{0x00000000003F8020L});
    public static final BitSet FOLLOW_rule__Cantidad__Group__1_in_rule__Cantidad__Group__03250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cantidad__UnArticuloAssignment_0_in_rule__Cantidad__Group__0__Impl3277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cantidad__Group__1__Impl_in_rule__Cantidad__Group__13308 = new BitSet(new long[]{0x00000000003F8020L});
    public static final BitSet FOLLOW_rule__Cantidad__Group__2_in_rule__Cantidad__Group__13311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cantidad__UnValorAssignment_1_in_rule__Cantidad__Group__1__Impl3338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cantidad__Group__2__Impl_in_rule__Cantidad__Group__23369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cantidad__UnaCantidadAssignment_2_in_rule__Cantidad__Group__2__Impl3396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cliente__Group__0__Impl_in_rule__Cliente__Group__03432 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Cliente__Group__1_in_rule__Cliente__Group__03435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Cliente__Group__0__Impl3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cliente__Group__1__Impl_in_rule__Cliente__Group__13494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cliente__NameAssignment_1_in_rule__Cliente__Group__1__Impl3521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EstadoDeuda__Group__0__Impl_in_rule__EstadoDeuda__Group__03555 = new BitSet(new long[]{0x00000000103F8020L});
    public static final BitSet FOLLOW_rule__EstadoDeuda__Group__1_in_rule__EstadoDeuda__Group__03558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EstadoDeuda__Alternatives_0_in_rule__EstadoDeuda__Group__0__Impl3585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EstadoDeuda__Group__1__Impl_in_rule__EstadoDeuda__Group__13615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImporte_in_rule__EstadoDeuda__Group__1__Impl3643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Importe__Group__0__Impl_in_rule__Importe__Group__03678 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Importe__Group__1_in_rule__Importe__Group__03681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Importe__ValorAssignment_0_in_rule__Importe__Group__0__Impl3708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Importe__Group__1__Impl_in_rule__Importe__Group__13738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Importe__MonedaAssignment_1_in_rule__Importe__Group__1__Impl3765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Verduleria__AnotacionesAlternatives_0_in_rule__Verduleria__AnotacionesAssignment3804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCliente_in_rule__ModelCliente__ClientesAssignment_03837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEstadoDeuda_in_rule__ModelCliente__EstadoDeDeudaAssignment_23868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProducto_in_rule__ModelProducto__ProductosAssignment_03899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValorDelProducto_in_rule__ModelProducto__ValorAssignment_13930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVenta_in_rule__ModelVenta__VentaAssignment3961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Venta__NombreAssignment_03992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMercaderia_in_rule__Venta__UnaListaDeComprasAssignment_2_04023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImporte_in_rule__Venta__UnImporteAssignment_44054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTotalDeCompra_in_rule__Venta__UnTotalAssignment_64085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TotalDeCompra__UnTotalAlternatives_0_0_in_rule__TotalDeCompra__UnTotalAssignment_04116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImporte_in_rule__TotalDeCompra__UnImporteTotalAssignment_14149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCantidad_in_rule__Mercaderia__UnaDescripcionAssignment_04180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Mercaderia__NombreDeProductoAssignment_24211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Producto__NombreDeProductoAssignment_14242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescripcion_in_rule__ValorDelProducto__UnaDescripcionAssignment_14273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImporte_in_rule__Descripcion__UnImporteAssignment_04304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCantidad_in_rule__Descripcion__UnaCantidadAssignment_14335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArticulo_in_rule__Cantidad__UnArticuloAssignment_04366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Cantidad__UnValorAssignment_14397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnidad_in_rule__Cantidad__UnaCantidadAssignment_24428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Articulo__UnArticuloAlternatives_0_in_rule__Articulo__UnArticuloAssignment4459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unidad__UnaUnidadAlternatives_0_in_rule__Unidad__UnaUnidadAssignment4492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Cliente__NameAssignment_14525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Importe__ValorAssignment_04556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMoneda_in_rule__Importe__MonedaAssignment_14587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Moneda__PesosAssignment4623 = new BitSet(new long[]{0x0000000000000002L});

}