/*
 * generated by Xtext
 */
grammar InternalTextVerduler;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package textVerduler.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleVerduleria
entryRuleVerduleria returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getVerduleriaRule()); }
	 iv_ruleVerduleria=ruleVerduleria 
	 { $current=$iv_ruleVerduleria.current; } 
	 EOF 
;

// Rule Verduleria
ruleVerduleria returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
(
		{ 
	        newCompositeNode(grammarAccess.getVerduleriaAccess().getAnotacionesModelClienteParserRuleCall_0_0()); 
	    }
		lv_anotaciones_0_1=ruleModelCliente		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getVerduleriaRule());
	        }
       		add(
       			$current, 
       			"anotaciones",
        		lv_anotaciones_0_1, 
        		"ModelCliente");
	        afterParserOrEnumRuleCall();
	    }

    |		{ 
	        newCompositeNode(grammarAccess.getVerduleriaAccess().getAnotacionesModelProductoParserRuleCall_0_1()); 
	    }
		lv_anotaciones_0_2=ruleModelProducto		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getVerduleriaRule());
	        }
       		add(
       			$current, 
       			"anotaciones",
        		lv_anotaciones_0_2, 
        		"ModelProducto");
	        afterParserOrEnumRuleCall();
	    }

    |		{ 
	        newCompositeNode(grammarAccess.getVerduleriaAccess().getAnotacionesModelVentaParserRuleCall_0_2()); 
	    }
		lv_anotaciones_0_3=ruleModelVenta		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getVerduleriaRule());
	        }
       		add(
       			$current, 
       			"anotaciones",
        		lv_anotaciones_0_3, 
        		"ModelVenta");
	        afterParserOrEnumRuleCall();
	    }

)

)
)*
;





// Entry rule entryRuleModelCliente
entryRuleModelCliente returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelClienteRule()); }
	 iv_ruleModelCliente=ruleModelCliente 
	 { $current=$iv_ruleModelCliente.current; } 
	 EOF 
;

// Rule ModelCliente
ruleModelCliente returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getModelClienteAccess().getClientesClienteParserRuleCall_0_0()); 
	    }
		lv_clientes_0_0=ruleCliente		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelClienteRule());
	        }
       		add(
       			$current, 
       			"clientes",
        		lv_clientes_0_0, 
        		"Cliente");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_1=',' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getModelClienteAccess().getCommaKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelClienteAccess().getEstadoDeDeudaEstadoDeudaParserRuleCall_2_0()); 
	    }
		lv_estadoDeDeuda_2_0=ruleEstadoDeuda		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelClienteRule());
	        }
       		set(
       			$current, 
       			"estadoDeDeuda",
        		lv_estadoDeDeuda_2_0, 
        		"EstadoDeuda");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='.' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getModelClienteAccess().getFullStopKeyword_3());
    }
)
;





// Entry rule entryRuleModelProducto
entryRuleModelProducto returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelProductoRule()); }
	 iv_ruleModelProducto=ruleModelProducto 
	 { $current=$iv_ruleModelProducto.current; } 
	 EOF 
;

// Rule ModelProducto
ruleModelProducto returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getModelProductoAccess().getProductosProductoParserRuleCall_0_0()); 
	    }
		lv_productos_0_0=ruleProducto		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelProductoRule());
	        }
       		add(
       			$current, 
       			"productos",
        		lv_productos_0_0, 
        		"Producto");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getModelProductoAccess().getValorValorDelProductoParserRuleCall_1_0()); 
	    }
		lv_valor_1_0=ruleValorDelProducto		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelProductoRule());
	        }
       		set(
       			$current, 
       			"valor",
        		lv_valor_1_0, 
        		"ValorDelProducto");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='.' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getModelProductoAccess().getFullStopKeyword_2());
    }
)
;





// Entry rule entryRuleModelVenta
entryRuleModelVenta returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelVentaRule()); }
	 iv_ruleModelVenta=ruleModelVenta 
	 { $current=$iv_ruleModelVenta.current; } 
	 EOF 
;

// Rule ModelVenta
ruleModelVenta returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelVentaAccess().getVentaVentaParserRuleCall_0()); 
	    }
		lv_venta_0_0=ruleVenta		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelVentaRule());
	        }
       		add(
       			$current, 
       			"venta",
        		lv_venta_0_0, 
        		"Venta");
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Entry rule entryRuleVenta
entryRuleVenta returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getVentaRule()); }
	 iv_ruleVenta=ruleVenta 
	 { $current=$iv_ruleVenta.current; } 
	 EOF 
;

// Rule Venta
ruleVenta returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_nombre_0_0=RULE_ID
		{
			newLeafNode(lv_nombre_0_0, grammarAccess.getVentaAccess().getNombreIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getVentaRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"nombre",
        		lv_nombre_0_0, 
        		"ID");
	    }

)
)	otherlv_1='compro' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getVentaAccess().getComproKeyword_1());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getVentaAccess().getUnaListaDeComprasMercaderiaParserRuleCall_2_0_0()); 
	    }
		lv_unaListaDeCompras_2_0=ruleMercaderia		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getVentaRule());
	        }
       		set(
       			$current, 
       			"unaListaDeCompras",
        		lv_unaListaDeCompras_2_0, 
        		"Mercaderia");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_3=',' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getVentaAccess().getCommaKeyword_2_1());
    }
)?)*(	otherlv_4='se redondea a' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getVentaAccess().getSeRedondeaAKeyword_3());
    }
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getVentaAccess().getUnImporteImporteParserRuleCall_4_0()); 
	    }
		lv_unImporte_5_0=ruleImporte		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getVentaRule());
	        }
       		set(
       			$current, 
       			"unImporte",
        		lv_unImporte_5_0, 
        		"Importe");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_6=',' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getVentaAccess().getCommaKeyword_5());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getVentaAccess().getUnTotalTotalDeCompraParserRuleCall_6_0()); 
	    }
		lv_unTotal_7_0=ruleTotalDeCompra		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getVentaRule());
	        }
       		set(
       			$current, 
       			"unTotal",
        		lv_unTotal_7_0, 
        		"TotalDeCompra");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_8='.' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getVentaAccess().getFullStopKeyword_7());
    }
)
;





// Entry rule entryRuleTotalDeCompra
entryRuleTotalDeCompra returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTotalDeCompraRule()); }
	 iv_ruleTotalDeCompra=ruleTotalDeCompra 
	 { $current=$iv_ruleTotalDeCompra.current; } 
	 EOF 
;

// Rule TotalDeCompra
ruleTotalDeCompra returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
(
		lv_unTotal_0_1=	'paga' 
    {
        newLeafNode(lv_unTotal_0_1, grammarAccess.getTotalDeCompraAccess().getUnTotalPagaKeyword_0_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTotalDeCompraRule());
	        }
       		setWithLastConsumed($current, "unTotal", lv_unTotal_0_1, null);
	    }

    |		lv_unTotal_0_2=	'queda debiendo' 
    {
        newLeafNode(lv_unTotal_0_2, grammarAccess.getTotalDeCompraAccess().getUnTotalQuedaDebiendoKeyword_0_0_1());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTotalDeCompraRule());
	        }
       		setWithLastConsumed($current, "unTotal", lv_unTotal_0_2, null);
	    }

)

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getTotalDeCompraAccess().getUnImporteTotalImporteParserRuleCall_1_0()); 
	    }
		lv_unImporteTotal_1_0=ruleImporte		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTotalDeCompraRule());
	        }
       		set(
       			$current, 
       			"unImporteTotal",
        		lv_unImporteTotal_1_0, 
        		"Importe");
	        afterParserOrEnumRuleCall();
	    }

)
)?)
;





// Entry rule entryRuleMercaderia
entryRuleMercaderia returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMercaderiaRule()); }
	 iv_ruleMercaderia=ruleMercaderia 
	 { $current=$iv_ruleMercaderia.current; } 
	 EOF 
;

// Rule Mercaderia
ruleMercaderia returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getMercaderiaAccess().getUnaDescripcionCantidadParserRuleCall_0_0()); 
	    }
		lv_unaDescripcion_0_0=ruleCantidad		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMercaderiaRule());
	        }
       		set(
       			$current, 
       			"unaDescripcion",
        		lv_unaDescripcion_0_0, 
        		"Cantidad");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_1='de' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMercaderiaAccess().getDeKeyword_1());
    }
(
(
		lv_nombreDeProducto_2_0=RULE_ID
		{
			newLeafNode(lv_nombreDeProducto_2_0, grammarAccess.getMercaderiaAccess().getNombreDeProductoIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMercaderiaRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"nombreDeProducto",
        		lv_nombreDeProducto_2_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleProducto
entryRuleProducto returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getProductoRule()); }
	 iv_ruleProducto=ruleProducto 
	 { $current=$iv_ruleProducto.current; } 
	 EOF 
;

// Rule Producto
ruleProducto returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((	otherlv_0='Las' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getProductoAccess().getLasKeyword_0_0());
    }

    |	otherlv_1='Los' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getProductoAccess().getLosKeyword_0_1());
    }
)(
(
		lv_nombreDeProducto_2_0=RULE_ID
		{
			newLeafNode(lv_nombreDeProducto_2_0, grammarAccess.getProductoAccess().getNombreDeProductoIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getProductoRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"nombreDeProducto",
        		lv_nombreDeProducto_2_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleValorDelProducto
entryRuleValorDelProducto returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getValorDelProductoRule()); }
	 iv_ruleValorDelProducto=ruleValorDelProducto 
	 { $current=$iv_ruleValorDelProducto.current; } 
	 EOF 
;

// Rule ValorDelProducto
ruleValorDelProducto returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='salen' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getValorDelProductoAccess().getSalenKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getValorDelProductoAccess().getUnaDescripcionDescripcionParserRuleCall_1_0()); 
	    }
		lv_unaDescripcion_1_0=ruleDescripcion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getValorDelProductoRule());
	        }
       		set(
       			$current, 
       			"unaDescripcion",
        		lv_unaDescripcion_1_0, 
        		"Descripcion");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleDescripcion
entryRuleDescripcion returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDescripcionRule()); }
	 iv_ruleDescripcion=ruleDescripcion 
	 { $current=$iv_ruleDescripcion.current; } 
	 EOF 
;

// Rule Descripcion
ruleDescripcion returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getDescripcionAccess().getUnImporteImporteParserRuleCall_0_0()); 
	    }
		lv_unImporte_0_0=ruleImporte		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDescripcionRule());
	        }
       		set(
       			$current, 
       			"unImporte",
        		lv_unImporte_0_0, 
        		"Importe");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getDescripcionAccess().getUnaCantidadCantidadParserRuleCall_1_0()); 
	    }
		lv_unaCantidad_1_0=ruleCantidad		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDescripcionRule());
	        }
       		set(
       			$current, 
       			"unaCantidad",
        		lv_unaCantidad_1_0, 
        		"Cantidad");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleCantidad
entryRuleCantidad returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCantidadRule()); }
	 iv_ruleCantidad=ruleCantidad 
	 { $current=$iv_ruleCantidad.current; } 
	 EOF 
;

// Rule Cantidad
ruleCantidad returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getCantidadAccess().getUnArticuloArticuloParserRuleCall_0_0()); 
	    }
		lv_unArticulo_0_0=ruleArticulo		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCantidadRule());
	        }
       		set(
       			$current, 
       			"unArticulo",
        		lv_unArticulo_0_0, 
        		"Articulo");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
		lv_unValor_1_0=RULE_INT
		{
			newLeafNode(lv_unValor_1_0, grammarAccess.getCantidadAccess().getUnValorINTTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCantidadRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"unValor",
        		lv_unValor_1_0, 
        		"INT");
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getCantidadAccess().getUnaCantidadUnidadParserRuleCall_2_0()); 
	    }
		lv_unaCantidad_2_0=ruleUnidad		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCantidadRule());
	        }
       		set(
       			$current, 
       			"unaCantidad",
        		lv_unaCantidad_2_0, 
        		"Unidad");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleArticulo
entryRuleArticulo returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getArticuloRule()); }
	 iv_ruleArticulo=ruleArticulo 
	 { $current=$iv_ruleArticulo.current; } 
	 EOF 
;

// Rule Articulo
ruleArticulo returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
(
		lv_unArticulo_0_1=	'el' 
    {
        newLeafNode(lv_unArticulo_0_1, grammarAccess.getArticuloAccess().getUnArticuloElKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getArticuloRule());
	        }
       		setWithLastConsumed($current, "unArticulo", lv_unArticulo_0_1, null);
	    }

    |		lv_unArticulo_0_2=	'los' 
    {
        newLeafNode(lv_unArticulo_0_2, grammarAccess.getArticuloAccess().getUnArticuloLosKeyword_0_1());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getArticuloRule());
	        }
       		setWithLastConsumed($current, "unArticulo", lv_unArticulo_0_2, null);
	    }

)

)
)
;





// Entry rule entryRuleUnidad
entryRuleUnidad returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getUnidadRule()); }
	 iv_ruleUnidad=ruleUnidad 
	 { $current=$iv_ruleUnidad.current; } 
	 EOF 
;

// Rule Unidad
ruleUnidad returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
(
		lv_unaUnidad_0_1=	'kilo' 
    {
        newLeafNode(lv_unaUnidad_0_1, grammarAccess.getUnidadAccess().getUnaUnidadKiloKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getUnidadRule());
	        }
       		setWithLastConsumed($current, "unaUnidad", lv_unaUnidad_0_1, null);
	    }

    |		lv_unaUnidad_0_2=	'kilos' 
    {
        newLeafNode(lv_unaUnidad_0_2, grammarAccess.getUnidadAccess().getUnaUnidadKilosKeyword_0_1());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getUnidadRule());
	        }
       		setWithLastConsumed($current, "unaUnidad", lv_unaUnidad_0_2, null);
	    }

    |		lv_unaUnidad_0_3=	'medio kilo' 
    {
        newLeafNode(lv_unaUnidad_0_3, grammarAccess.getUnidadAccess().getUnaUnidadMedioKiloKeyword_0_2());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getUnidadRule());
	        }
       		setWithLastConsumed($current, "unaUnidad", lv_unaUnidad_0_3, null);
	    }

    |		lv_unaUnidad_0_4=	'cuarto kilo' 
    {
        newLeafNode(lv_unaUnidad_0_4, grammarAccess.getUnidadAccess().getUnaUnidadCuartoKiloKeyword_0_3());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getUnidadRule());
	        }
       		setWithLastConsumed($current, "unaUnidad", lv_unaUnidad_0_4, null);
	    }

    |		lv_unaUnidad_0_5=	'gramos' 
    {
        newLeafNode(lv_unaUnidad_0_5, grammarAccess.getUnidadAccess().getUnaUnidadGramosKeyword_0_4());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getUnidadRule());
	        }
       		setWithLastConsumed($current, "unaUnidad", lv_unaUnidad_0_5, null);
	    }

)

)
)
;





// Entry rule entryRuleCliente
entryRuleCliente returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getClienteRule()); }
	 iv_ruleCliente=ruleCliente 
	 { $current=$iv_ruleCliente.current; } 
	 EOF 
;

// Rule Cliente
ruleCliente returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Cliente' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getClienteAccess().getClienteKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getClienteAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getClienteRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleEstadoDeuda
entryRuleEstadoDeuda returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEstadoDeudaRule()); }
	 iv_ruleEstadoDeuda=ruleEstadoDeuda 
	 { $current=$iv_ruleEstadoDeuda.current; } 
	 EOF 
;

// Rule EstadoDeuda
ruleEstadoDeuda returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((	otherlv_0='debe' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getEstadoDeudaAccess().getDebeKeyword_0_0());
    }

    |	otherlv_1='al dia' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getEstadoDeudaAccess().getAlDiaKeyword_0_1());
    }

    |	otherlv_2='tiene credito' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getEstadoDeudaAccess().getTieneCreditoKeyword_0_2());
    }
)(
    { 
        newCompositeNode(grammarAccess.getEstadoDeudaAccess().getImporteParserRuleCall_1()); 
    }
    this_Importe_3=ruleImporte
    { 
        $current = $this_Importe_3.current; 
        afterParserOrEnumRuleCall();
    }
)?)
;





// Entry rule entryRuleImporte
entryRuleImporte returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getImporteRule()); }
	 iv_ruleImporte=ruleImporte 
	 { $current=$iv_ruleImporte.current; } 
	 EOF 
;

// Rule Importe
ruleImporte returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_valor_0_0=RULE_INT
		{
			newLeafNode(lv_valor_0_0, grammarAccess.getImporteAccess().getValorINTTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getImporteRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"valor",
        		lv_valor_0_0, 
        		"INT");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getImporteAccess().getMonedaMonedaParserRuleCall_1_0()); 
	    }
		lv_moneda_1_0=ruleMoneda		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getImporteRule());
	        }
       		set(
       			$current, 
       			"moneda",
        		lv_moneda_1_0, 
        		"Moneda");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleMoneda
entryRuleMoneda returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMonedaRule()); }
	 iv_ruleMoneda=ruleMoneda 
	 { $current=$iv_ruleMoneda.current; } 
	 EOF 
;

// Rule Moneda
ruleMoneda returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_pesos_0_0=	'pesos' 
    {
        newLeafNode(lv_pesos_0_0, grammarAccess.getMonedaAccess().getPesosPesosKeyword_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMonedaRule());
	        }
       		setWithLastConsumed($current, "pesos", lv_pesos_0_0, "pesos");
	    }

)
)
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

