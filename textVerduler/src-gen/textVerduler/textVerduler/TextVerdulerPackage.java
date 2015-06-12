/**
 */
package textVerduler.textVerduler;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see textVerduler.textVerduler.TextVerdulerFactory
 * @model kind="package"
 * @generated
 */
public interface TextVerdulerPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "textVerduler";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.TextVerduler";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "textVerduler";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TextVerdulerPackage eINSTANCE = textVerduler.textVerduler.impl.TextVerdulerPackageImpl.init();

  /**
   * The meta object id for the '{@link textVerduler.textVerduler.impl.VerduleriaImpl <em>Verduleria</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see textVerduler.textVerduler.impl.VerduleriaImpl
   * @see textVerduler.textVerduler.impl.TextVerdulerPackageImpl#getVerduleria()
   * @generated
   */
  int VERDULERIA = 0;

  /**
   * The feature id for the '<em><b>Anotaciones</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERDULERIA__ANOTACIONES = 0;

  /**
   * The number of structural features of the '<em>Verduleria</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERDULERIA_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link textVerduler.textVerduler.impl.ModelClienteImpl <em>Model Cliente</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see textVerduler.textVerduler.impl.ModelClienteImpl
   * @see textVerduler.textVerduler.impl.TextVerdulerPackageImpl#getModelCliente()
   * @generated
   */
  int MODEL_CLIENTE = 1;

  /**
   * The feature id for the '<em><b>Clientes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_CLIENTE__CLIENTES = 0;

  /**
   * The feature id for the '<em><b>Estado De Deuda</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_CLIENTE__ESTADO_DE_DEUDA = 1;

  /**
   * The number of structural features of the '<em>Model Cliente</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_CLIENTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link textVerduler.textVerduler.impl.ModelProductoImpl <em>Model Producto</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see textVerduler.textVerduler.impl.ModelProductoImpl
   * @see textVerduler.textVerduler.impl.TextVerdulerPackageImpl#getModelProducto()
   * @generated
   */
  int MODEL_PRODUCTO = 2;

  /**
   * The feature id for the '<em><b>Productos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_PRODUCTO__PRODUCTOS = 0;

  /**
   * The feature id for the '<em><b>Valor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_PRODUCTO__VALOR = 1;

  /**
   * The number of structural features of the '<em>Model Producto</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_PRODUCTO_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link textVerduler.textVerduler.impl.ModelVentaImpl <em>Model Venta</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see textVerduler.textVerduler.impl.ModelVentaImpl
   * @see textVerduler.textVerduler.impl.TextVerdulerPackageImpl#getModelVenta()
   * @generated
   */
  int MODEL_VENTA = 3;

  /**
   * The feature id for the '<em><b>Venta</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_VENTA__VENTA = 0;

  /**
   * The number of structural features of the '<em>Model Venta</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_VENTA_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link textVerduler.textVerduler.impl.VentaImpl <em>Venta</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see textVerduler.textVerduler.impl.VentaImpl
   * @see textVerduler.textVerduler.impl.TextVerdulerPackageImpl#getVenta()
   * @generated
   */
  int VENTA = 4;

  /**
   * The feature id for the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VENTA__NOMBRE = 0;

  /**
   * The feature id for the '<em><b>Una Lista De Compras</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VENTA__UNA_LISTA_DE_COMPRAS = 1;

  /**
   * The feature id for the '<em><b>Un Importe</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VENTA__UN_IMPORTE = 2;

  /**
   * The feature id for the '<em><b>Un Total</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VENTA__UN_TOTAL = 3;

  /**
   * The number of structural features of the '<em>Venta</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VENTA_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link textVerduler.textVerduler.impl.TotalDeCompraImpl <em>Total De Compra</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see textVerduler.textVerduler.impl.TotalDeCompraImpl
   * @see textVerduler.textVerduler.impl.TextVerdulerPackageImpl#getTotalDeCompra()
   * @generated
   */
  int TOTAL_DE_COMPRA = 5;

  /**
   * The feature id for the '<em><b>Un Total</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOTAL_DE_COMPRA__UN_TOTAL = 0;

  /**
   * The feature id for the '<em><b>Un Importe Total</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOTAL_DE_COMPRA__UN_IMPORTE_TOTAL = 1;

  /**
   * The number of structural features of the '<em>Total De Compra</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOTAL_DE_COMPRA_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link textVerduler.textVerduler.impl.MercaderiaImpl <em>Mercaderia</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see textVerduler.textVerduler.impl.MercaderiaImpl
   * @see textVerduler.textVerduler.impl.TextVerdulerPackageImpl#getMercaderia()
   * @generated
   */
  int MERCADERIA = 6;

  /**
   * The feature id for the '<em><b>Una Descripcion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MERCADERIA__UNA_DESCRIPCION = 0;

  /**
   * The feature id for the '<em><b>Nombre De Producto</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MERCADERIA__NOMBRE_DE_PRODUCTO = 1;

  /**
   * The number of structural features of the '<em>Mercaderia</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MERCADERIA_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link textVerduler.textVerduler.impl.ProductoImpl <em>Producto</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see textVerduler.textVerduler.impl.ProductoImpl
   * @see textVerduler.textVerduler.impl.TextVerdulerPackageImpl#getProducto()
   * @generated
   */
  int PRODUCTO = 7;

  /**
   * The feature id for the '<em><b>Nombre De Producto</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCTO__NOMBRE_DE_PRODUCTO = 0;

  /**
   * The number of structural features of the '<em>Producto</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCTO_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link textVerduler.textVerduler.impl.ValorDelProductoImpl <em>Valor Del Producto</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see textVerduler.textVerduler.impl.ValorDelProductoImpl
   * @see textVerduler.textVerduler.impl.TextVerdulerPackageImpl#getValorDelProducto()
   * @generated
   */
  int VALOR_DEL_PRODUCTO = 8;

  /**
   * The feature id for the '<em><b>Una Descripcion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALOR_DEL_PRODUCTO__UNA_DESCRIPCION = 0;

  /**
   * The number of structural features of the '<em>Valor Del Producto</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALOR_DEL_PRODUCTO_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link textVerduler.textVerduler.impl.DescripcionImpl <em>Descripcion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see textVerduler.textVerduler.impl.DescripcionImpl
   * @see textVerduler.textVerduler.impl.TextVerdulerPackageImpl#getDescripcion()
   * @generated
   */
  int DESCRIPCION = 9;

  /**
   * The feature id for the '<em><b>Un Importe</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPCION__UN_IMPORTE = 0;

  /**
   * The feature id for the '<em><b>Una Cantidad</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPCION__UNA_CANTIDAD = 1;

  /**
   * The number of structural features of the '<em>Descripcion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPCION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link textVerduler.textVerduler.impl.CantidadImpl <em>Cantidad</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see textVerduler.textVerduler.impl.CantidadImpl
   * @see textVerduler.textVerduler.impl.TextVerdulerPackageImpl#getCantidad()
   * @generated
   */
  int CANTIDAD = 10;

  /**
   * The feature id for the '<em><b>Un Articulo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CANTIDAD__UN_ARTICULO = 0;

  /**
   * The feature id for the '<em><b>Un Valor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CANTIDAD__UN_VALOR = 1;

  /**
   * The feature id for the '<em><b>Una Cantidad</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CANTIDAD__UNA_CANTIDAD = 2;

  /**
   * The number of structural features of the '<em>Cantidad</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CANTIDAD_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link textVerduler.textVerduler.impl.ArticuloImpl <em>Articulo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see textVerduler.textVerduler.impl.ArticuloImpl
   * @see textVerduler.textVerduler.impl.TextVerdulerPackageImpl#getArticulo()
   * @generated
   */
  int ARTICULO = 11;

  /**
   * The feature id for the '<em><b>Un Articulo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTICULO__UN_ARTICULO = 0;

  /**
   * The number of structural features of the '<em>Articulo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTICULO_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link textVerduler.textVerduler.impl.UnidadImpl <em>Unidad</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see textVerduler.textVerduler.impl.UnidadImpl
   * @see textVerduler.textVerduler.impl.TextVerdulerPackageImpl#getUnidad()
   * @generated
   */
  int UNIDAD = 12;

  /**
   * The feature id for the '<em><b>Una Unidad</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIDAD__UNA_UNIDAD = 0;

  /**
   * The number of structural features of the '<em>Unidad</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIDAD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link textVerduler.textVerduler.impl.ClienteImpl <em>Cliente</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see textVerduler.textVerduler.impl.ClienteImpl
   * @see textVerduler.textVerduler.impl.TextVerdulerPackageImpl#getCliente()
   * @generated
   */
  int CLIENTE = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLIENTE__NAME = 0;

  /**
   * The number of structural features of the '<em>Cliente</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLIENTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link textVerduler.textVerduler.impl.EstadoDeudaImpl <em>Estado Deuda</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see textVerduler.textVerduler.impl.EstadoDeudaImpl
   * @see textVerduler.textVerduler.impl.TextVerdulerPackageImpl#getEstadoDeuda()
   * @generated
   */
  int ESTADO_DEUDA = 14;

  /**
   * The number of structural features of the '<em>Estado Deuda</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTADO_DEUDA_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link textVerduler.textVerduler.impl.ImporteImpl <em>Importe</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see textVerduler.textVerduler.impl.ImporteImpl
   * @see textVerduler.textVerduler.impl.TextVerdulerPackageImpl#getImporte()
   * @generated
   */
  int IMPORTE = 15;

  /**
   * The feature id for the '<em><b>Valor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTE__VALOR = ESTADO_DEUDA_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Moneda</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTE__MONEDA = ESTADO_DEUDA_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Importe</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTE_FEATURE_COUNT = ESTADO_DEUDA_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link textVerduler.textVerduler.impl.MonedaImpl <em>Moneda</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see textVerduler.textVerduler.impl.MonedaImpl
   * @see textVerduler.textVerduler.impl.TextVerdulerPackageImpl#getMoneda()
   * @generated
   */
  int MONEDA = 16;

  /**
   * The feature id for the '<em><b>Pesos</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONEDA__PESOS = 0;

  /**
   * The number of structural features of the '<em>Moneda</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONEDA_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link textVerduler.textVerduler.Verduleria <em>Verduleria</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verduleria</em>'.
   * @see textVerduler.textVerduler.Verduleria
   * @generated
   */
  EClass getVerduleria();

  /**
   * Returns the meta object for the containment reference list '{@link textVerduler.textVerduler.Verduleria#getAnotaciones <em>Anotaciones</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Anotaciones</em>'.
   * @see textVerduler.textVerduler.Verduleria#getAnotaciones()
   * @see #getVerduleria()
   * @generated
   */
  EReference getVerduleria_Anotaciones();

  /**
   * Returns the meta object for class '{@link textVerduler.textVerduler.ModelCliente <em>Model Cliente</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Cliente</em>'.
   * @see textVerduler.textVerduler.ModelCliente
   * @generated
   */
  EClass getModelCliente();

  /**
   * Returns the meta object for the containment reference list '{@link textVerduler.textVerduler.ModelCliente#getClientes <em>Clientes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Clientes</em>'.
   * @see textVerduler.textVerduler.ModelCliente#getClientes()
   * @see #getModelCliente()
   * @generated
   */
  EReference getModelCliente_Clientes();

  /**
   * Returns the meta object for the containment reference '{@link textVerduler.textVerduler.ModelCliente#getEstadoDeDeuda <em>Estado De Deuda</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Estado De Deuda</em>'.
   * @see textVerduler.textVerduler.ModelCliente#getEstadoDeDeuda()
   * @see #getModelCliente()
   * @generated
   */
  EReference getModelCliente_EstadoDeDeuda();

  /**
   * Returns the meta object for class '{@link textVerduler.textVerduler.ModelProducto <em>Model Producto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Producto</em>'.
   * @see textVerduler.textVerduler.ModelProducto
   * @generated
   */
  EClass getModelProducto();

  /**
   * Returns the meta object for the containment reference list '{@link textVerduler.textVerduler.ModelProducto#getProductos <em>Productos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Productos</em>'.
   * @see textVerduler.textVerduler.ModelProducto#getProductos()
   * @see #getModelProducto()
   * @generated
   */
  EReference getModelProducto_Productos();

  /**
   * Returns the meta object for the containment reference '{@link textVerduler.textVerduler.ModelProducto#getValor <em>Valor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Valor</em>'.
   * @see textVerduler.textVerduler.ModelProducto#getValor()
   * @see #getModelProducto()
   * @generated
   */
  EReference getModelProducto_Valor();

  /**
   * Returns the meta object for class '{@link textVerduler.textVerduler.ModelVenta <em>Model Venta</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Venta</em>'.
   * @see textVerduler.textVerduler.ModelVenta
   * @generated
   */
  EClass getModelVenta();

  /**
   * Returns the meta object for the containment reference list '{@link textVerduler.textVerduler.ModelVenta#getVenta <em>Venta</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Venta</em>'.
   * @see textVerduler.textVerduler.ModelVenta#getVenta()
   * @see #getModelVenta()
   * @generated
   */
  EReference getModelVenta_Venta();

  /**
   * Returns the meta object for class '{@link textVerduler.textVerduler.Venta <em>Venta</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Venta</em>'.
   * @see textVerduler.textVerduler.Venta
   * @generated
   */
  EClass getVenta();

  /**
   * Returns the meta object for the attribute '{@link textVerduler.textVerduler.Venta#getNombre <em>Nombre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nombre</em>'.
   * @see textVerduler.textVerduler.Venta#getNombre()
   * @see #getVenta()
   * @generated
   */
  EAttribute getVenta_Nombre();

  /**
   * Returns the meta object for the containment reference '{@link textVerduler.textVerduler.Venta#getUnaListaDeCompras <em>Una Lista De Compras</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Una Lista De Compras</em>'.
   * @see textVerduler.textVerduler.Venta#getUnaListaDeCompras()
   * @see #getVenta()
   * @generated
   */
  EReference getVenta_UnaListaDeCompras();

  /**
   * Returns the meta object for the containment reference '{@link textVerduler.textVerduler.Venta#getUnImporte <em>Un Importe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Un Importe</em>'.
   * @see textVerduler.textVerduler.Venta#getUnImporte()
   * @see #getVenta()
   * @generated
   */
  EReference getVenta_UnImporte();

  /**
   * Returns the meta object for the containment reference '{@link textVerduler.textVerduler.Venta#getUnTotal <em>Un Total</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Un Total</em>'.
   * @see textVerduler.textVerduler.Venta#getUnTotal()
   * @see #getVenta()
   * @generated
   */
  EReference getVenta_UnTotal();

  /**
   * Returns the meta object for class '{@link textVerduler.textVerduler.TotalDeCompra <em>Total De Compra</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Total De Compra</em>'.
   * @see textVerduler.textVerduler.TotalDeCompra
   * @generated
   */
  EClass getTotalDeCompra();

  /**
   * Returns the meta object for the attribute '{@link textVerduler.textVerduler.TotalDeCompra#getUnTotal <em>Un Total</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Un Total</em>'.
   * @see textVerduler.textVerduler.TotalDeCompra#getUnTotal()
   * @see #getTotalDeCompra()
   * @generated
   */
  EAttribute getTotalDeCompra_UnTotal();

  /**
   * Returns the meta object for the containment reference '{@link textVerduler.textVerduler.TotalDeCompra#getUnImporteTotal <em>Un Importe Total</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Un Importe Total</em>'.
   * @see textVerduler.textVerduler.TotalDeCompra#getUnImporteTotal()
   * @see #getTotalDeCompra()
   * @generated
   */
  EReference getTotalDeCompra_UnImporteTotal();

  /**
   * Returns the meta object for class '{@link textVerduler.textVerduler.Mercaderia <em>Mercaderia</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mercaderia</em>'.
   * @see textVerduler.textVerduler.Mercaderia
   * @generated
   */
  EClass getMercaderia();

  /**
   * Returns the meta object for the containment reference '{@link textVerduler.textVerduler.Mercaderia#getUnaDescripcion <em>Una Descripcion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Una Descripcion</em>'.
   * @see textVerduler.textVerduler.Mercaderia#getUnaDescripcion()
   * @see #getMercaderia()
   * @generated
   */
  EReference getMercaderia_UnaDescripcion();

  /**
   * Returns the meta object for the attribute '{@link textVerduler.textVerduler.Mercaderia#getNombreDeProducto <em>Nombre De Producto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nombre De Producto</em>'.
   * @see textVerduler.textVerduler.Mercaderia#getNombreDeProducto()
   * @see #getMercaderia()
   * @generated
   */
  EAttribute getMercaderia_NombreDeProducto();

  /**
   * Returns the meta object for class '{@link textVerduler.textVerduler.Producto <em>Producto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Producto</em>'.
   * @see textVerduler.textVerduler.Producto
   * @generated
   */
  EClass getProducto();

  /**
   * Returns the meta object for the attribute '{@link textVerduler.textVerduler.Producto#getNombreDeProducto <em>Nombre De Producto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nombre De Producto</em>'.
   * @see textVerduler.textVerduler.Producto#getNombreDeProducto()
   * @see #getProducto()
   * @generated
   */
  EAttribute getProducto_NombreDeProducto();

  /**
   * Returns the meta object for class '{@link textVerduler.textVerduler.ValorDelProducto <em>Valor Del Producto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Valor Del Producto</em>'.
   * @see textVerduler.textVerduler.ValorDelProducto
   * @generated
   */
  EClass getValorDelProducto();

  /**
   * Returns the meta object for the containment reference '{@link textVerduler.textVerduler.ValorDelProducto#getUnaDescripcion <em>Una Descripcion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Una Descripcion</em>'.
   * @see textVerduler.textVerduler.ValorDelProducto#getUnaDescripcion()
   * @see #getValorDelProducto()
   * @generated
   */
  EReference getValorDelProducto_UnaDescripcion();

  /**
   * Returns the meta object for class '{@link textVerduler.textVerduler.Descripcion <em>Descripcion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Descripcion</em>'.
   * @see textVerduler.textVerduler.Descripcion
   * @generated
   */
  EClass getDescripcion();

  /**
   * Returns the meta object for the containment reference '{@link textVerduler.textVerduler.Descripcion#getUnImporte <em>Un Importe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Un Importe</em>'.
   * @see textVerduler.textVerduler.Descripcion#getUnImporte()
   * @see #getDescripcion()
   * @generated
   */
  EReference getDescripcion_UnImporte();

  /**
   * Returns the meta object for the containment reference '{@link textVerduler.textVerduler.Descripcion#getUnaCantidad <em>Una Cantidad</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Una Cantidad</em>'.
   * @see textVerduler.textVerduler.Descripcion#getUnaCantidad()
   * @see #getDescripcion()
   * @generated
   */
  EReference getDescripcion_UnaCantidad();

  /**
   * Returns the meta object for class '{@link textVerduler.textVerduler.Cantidad <em>Cantidad</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cantidad</em>'.
   * @see textVerduler.textVerduler.Cantidad
   * @generated
   */
  EClass getCantidad();

  /**
   * Returns the meta object for the containment reference '{@link textVerduler.textVerduler.Cantidad#getUnArticulo <em>Un Articulo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Un Articulo</em>'.
   * @see textVerduler.textVerduler.Cantidad#getUnArticulo()
   * @see #getCantidad()
   * @generated
   */
  EReference getCantidad_UnArticulo();

  /**
   * Returns the meta object for the attribute '{@link textVerduler.textVerduler.Cantidad#getUnValor <em>Un Valor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Un Valor</em>'.
   * @see textVerduler.textVerduler.Cantidad#getUnValor()
   * @see #getCantidad()
   * @generated
   */
  EAttribute getCantidad_UnValor();

  /**
   * Returns the meta object for the containment reference '{@link textVerduler.textVerduler.Cantidad#getUnaCantidad <em>Una Cantidad</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Una Cantidad</em>'.
   * @see textVerduler.textVerduler.Cantidad#getUnaCantidad()
   * @see #getCantidad()
   * @generated
   */
  EReference getCantidad_UnaCantidad();

  /**
   * Returns the meta object for class '{@link textVerduler.textVerduler.Articulo <em>Articulo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Articulo</em>'.
   * @see textVerduler.textVerduler.Articulo
   * @generated
   */
  EClass getArticulo();

  /**
   * Returns the meta object for the attribute '{@link textVerduler.textVerduler.Articulo#getUnArticulo <em>Un Articulo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Un Articulo</em>'.
   * @see textVerduler.textVerduler.Articulo#getUnArticulo()
   * @see #getArticulo()
   * @generated
   */
  EAttribute getArticulo_UnArticulo();

  /**
   * Returns the meta object for class '{@link textVerduler.textVerduler.Unidad <em>Unidad</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unidad</em>'.
   * @see textVerduler.textVerduler.Unidad
   * @generated
   */
  EClass getUnidad();

  /**
   * Returns the meta object for the attribute '{@link textVerduler.textVerduler.Unidad#getUnaUnidad <em>Una Unidad</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Una Unidad</em>'.
   * @see textVerduler.textVerduler.Unidad#getUnaUnidad()
   * @see #getUnidad()
   * @generated
   */
  EAttribute getUnidad_UnaUnidad();

  /**
   * Returns the meta object for class '{@link textVerduler.textVerduler.Cliente <em>Cliente</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cliente</em>'.
   * @see textVerduler.textVerduler.Cliente
   * @generated
   */
  EClass getCliente();

  /**
   * Returns the meta object for the attribute '{@link textVerduler.textVerduler.Cliente#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see textVerduler.textVerduler.Cliente#getName()
   * @see #getCliente()
   * @generated
   */
  EAttribute getCliente_Name();

  /**
   * Returns the meta object for class '{@link textVerduler.textVerduler.EstadoDeuda <em>Estado Deuda</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Estado Deuda</em>'.
   * @see textVerduler.textVerduler.EstadoDeuda
   * @generated
   */
  EClass getEstadoDeuda();

  /**
   * Returns the meta object for class '{@link textVerduler.textVerduler.Importe <em>Importe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Importe</em>'.
   * @see textVerduler.textVerduler.Importe
   * @generated
   */
  EClass getImporte();

  /**
   * Returns the meta object for the attribute '{@link textVerduler.textVerduler.Importe#getValor <em>Valor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Valor</em>'.
   * @see textVerduler.textVerduler.Importe#getValor()
   * @see #getImporte()
   * @generated
   */
  EAttribute getImporte_Valor();

  /**
   * Returns the meta object for the containment reference '{@link textVerduler.textVerduler.Importe#getMoneda <em>Moneda</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Moneda</em>'.
   * @see textVerduler.textVerduler.Importe#getMoneda()
   * @see #getImporte()
   * @generated
   */
  EReference getImporte_Moneda();

  /**
   * Returns the meta object for class '{@link textVerduler.textVerduler.Moneda <em>Moneda</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Moneda</em>'.
   * @see textVerduler.textVerduler.Moneda
   * @generated
   */
  EClass getMoneda();

  /**
   * Returns the meta object for the attribute '{@link textVerduler.textVerduler.Moneda#getPesos <em>Pesos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pesos</em>'.
   * @see textVerduler.textVerduler.Moneda#getPesos()
   * @see #getMoneda()
   * @generated
   */
  EAttribute getMoneda_Pesos();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TextVerdulerFactory getTextVerdulerFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link textVerduler.textVerduler.impl.VerduleriaImpl <em>Verduleria</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see textVerduler.textVerduler.impl.VerduleriaImpl
     * @see textVerduler.textVerduler.impl.TextVerdulerPackageImpl#getVerduleria()
     * @generated
     */
    EClass VERDULERIA = eINSTANCE.getVerduleria();

    /**
     * The meta object literal for the '<em><b>Anotaciones</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERDULERIA__ANOTACIONES = eINSTANCE.getVerduleria_Anotaciones();

    /**
     * The meta object literal for the '{@link textVerduler.textVerduler.impl.ModelClienteImpl <em>Model Cliente</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see textVerduler.textVerduler.impl.ModelClienteImpl
     * @see textVerduler.textVerduler.impl.TextVerdulerPackageImpl#getModelCliente()
     * @generated
     */
    EClass MODEL_CLIENTE = eINSTANCE.getModelCliente();

    /**
     * The meta object literal for the '<em><b>Clientes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_CLIENTE__CLIENTES = eINSTANCE.getModelCliente_Clientes();

    /**
     * The meta object literal for the '<em><b>Estado De Deuda</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_CLIENTE__ESTADO_DE_DEUDA = eINSTANCE.getModelCliente_EstadoDeDeuda();

    /**
     * The meta object literal for the '{@link textVerduler.textVerduler.impl.ModelProductoImpl <em>Model Producto</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see textVerduler.textVerduler.impl.ModelProductoImpl
     * @see textVerduler.textVerduler.impl.TextVerdulerPackageImpl#getModelProducto()
     * @generated
     */
    EClass MODEL_PRODUCTO = eINSTANCE.getModelProducto();

    /**
     * The meta object literal for the '<em><b>Productos</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_PRODUCTO__PRODUCTOS = eINSTANCE.getModelProducto_Productos();

    /**
     * The meta object literal for the '<em><b>Valor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_PRODUCTO__VALOR = eINSTANCE.getModelProducto_Valor();

    /**
     * The meta object literal for the '{@link textVerduler.textVerduler.impl.ModelVentaImpl <em>Model Venta</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see textVerduler.textVerduler.impl.ModelVentaImpl
     * @see textVerduler.textVerduler.impl.TextVerdulerPackageImpl#getModelVenta()
     * @generated
     */
    EClass MODEL_VENTA = eINSTANCE.getModelVenta();

    /**
     * The meta object literal for the '<em><b>Venta</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_VENTA__VENTA = eINSTANCE.getModelVenta_Venta();

    /**
     * The meta object literal for the '{@link textVerduler.textVerduler.impl.VentaImpl <em>Venta</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see textVerduler.textVerduler.impl.VentaImpl
     * @see textVerduler.textVerduler.impl.TextVerdulerPackageImpl#getVenta()
     * @generated
     */
    EClass VENTA = eINSTANCE.getVenta();

    /**
     * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VENTA__NOMBRE = eINSTANCE.getVenta_Nombre();

    /**
     * The meta object literal for the '<em><b>Una Lista De Compras</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VENTA__UNA_LISTA_DE_COMPRAS = eINSTANCE.getVenta_UnaListaDeCompras();

    /**
     * The meta object literal for the '<em><b>Un Importe</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VENTA__UN_IMPORTE = eINSTANCE.getVenta_UnImporte();

    /**
     * The meta object literal for the '<em><b>Un Total</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VENTA__UN_TOTAL = eINSTANCE.getVenta_UnTotal();

    /**
     * The meta object literal for the '{@link textVerduler.textVerduler.impl.TotalDeCompraImpl <em>Total De Compra</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see textVerduler.textVerduler.impl.TotalDeCompraImpl
     * @see textVerduler.textVerduler.impl.TextVerdulerPackageImpl#getTotalDeCompra()
     * @generated
     */
    EClass TOTAL_DE_COMPRA = eINSTANCE.getTotalDeCompra();

    /**
     * The meta object literal for the '<em><b>Un Total</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOTAL_DE_COMPRA__UN_TOTAL = eINSTANCE.getTotalDeCompra_UnTotal();

    /**
     * The meta object literal for the '<em><b>Un Importe Total</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TOTAL_DE_COMPRA__UN_IMPORTE_TOTAL = eINSTANCE.getTotalDeCompra_UnImporteTotal();

    /**
     * The meta object literal for the '{@link textVerduler.textVerduler.impl.MercaderiaImpl <em>Mercaderia</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see textVerduler.textVerduler.impl.MercaderiaImpl
     * @see textVerduler.textVerduler.impl.TextVerdulerPackageImpl#getMercaderia()
     * @generated
     */
    EClass MERCADERIA = eINSTANCE.getMercaderia();

    /**
     * The meta object literal for the '<em><b>Una Descripcion</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MERCADERIA__UNA_DESCRIPCION = eINSTANCE.getMercaderia_UnaDescripcion();

    /**
     * The meta object literal for the '<em><b>Nombre De Producto</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MERCADERIA__NOMBRE_DE_PRODUCTO = eINSTANCE.getMercaderia_NombreDeProducto();

    /**
     * The meta object literal for the '{@link textVerduler.textVerduler.impl.ProductoImpl <em>Producto</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see textVerduler.textVerduler.impl.ProductoImpl
     * @see textVerduler.textVerduler.impl.TextVerdulerPackageImpl#getProducto()
     * @generated
     */
    EClass PRODUCTO = eINSTANCE.getProducto();

    /**
     * The meta object literal for the '<em><b>Nombre De Producto</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRODUCTO__NOMBRE_DE_PRODUCTO = eINSTANCE.getProducto_NombreDeProducto();

    /**
     * The meta object literal for the '{@link textVerduler.textVerduler.impl.ValorDelProductoImpl <em>Valor Del Producto</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see textVerduler.textVerduler.impl.ValorDelProductoImpl
     * @see textVerduler.textVerduler.impl.TextVerdulerPackageImpl#getValorDelProducto()
     * @generated
     */
    EClass VALOR_DEL_PRODUCTO = eINSTANCE.getValorDelProducto();

    /**
     * The meta object literal for the '<em><b>Una Descripcion</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALOR_DEL_PRODUCTO__UNA_DESCRIPCION = eINSTANCE.getValorDelProducto_UnaDescripcion();

    /**
     * The meta object literal for the '{@link textVerduler.textVerduler.impl.DescripcionImpl <em>Descripcion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see textVerduler.textVerduler.impl.DescripcionImpl
     * @see textVerduler.textVerduler.impl.TextVerdulerPackageImpl#getDescripcion()
     * @generated
     */
    EClass DESCRIPCION = eINSTANCE.getDescripcion();

    /**
     * The meta object literal for the '<em><b>Un Importe</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DESCRIPCION__UN_IMPORTE = eINSTANCE.getDescripcion_UnImporte();

    /**
     * The meta object literal for the '<em><b>Una Cantidad</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DESCRIPCION__UNA_CANTIDAD = eINSTANCE.getDescripcion_UnaCantidad();

    /**
     * The meta object literal for the '{@link textVerduler.textVerduler.impl.CantidadImpl <em>Cantidad</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see textVerduler.textVerduler.impl.CantidadImpl
     * @see textVerduler.textVerduler.impl.TextVerdulerPackageImpl#getCantidad()
     * @generated
     */
    EClass CANTIDAD = eINSTANCE.getCantidad();

    /**
     * The meta object literal for the '<em><b>Un Articulo</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CANTIDAD__UN_ARTICULO = eINSTANCE.getCantidad_UnArticulo();

    /**
     * The meta object literal for the '<em><b>Un Valor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CANTIDAD__UN_VALOR = eINSTANCE.getCantidad_UnValor();

    /**
     * The meta object literal for the '<em><b>Una Cantidad</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CANTIDAD__UNA_CANTIDAD = eINSTANCE.getCantidad_UnaCantidad();

    /**
     * The meta object literal for the '{@link textVerduler.textVerduler.impl.ArticuloImpl <em>Articulo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see textVerduler.textVerduler.impl.ArticuloImpl
     * @see textVerduler.textVerduler.impl.TextVerdulerPackageImpl#getArticulo()
     * @generated
     */
    EClass ARTICULO = eINSTANCE.getArticulo();

    /**
     * The meta object literal for the '<em><b>Un Articulo</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARTICULO__UN_ARTICULO = eINSTANCE.getArticulo_UnArticulo();

    /**
     * The meta object literal for the '{@link textVerduler.textVerduler.impl.UnidadImpl <em>Unidad</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see textVerduler.textVerduler.impl.UnidadImpl
     * @see textVerduler.textVerduler.impl.TextVerdulerPackageImpl#getUnidad()
     * @generated
     */
    EClass UNIDAD = eINSTANCE.getUnidad();

    /**
     * The meta object literal for the '<em><b>Una Unidad</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNIDAD__UNA_UNIDAD = eINSTANCE.getUnidad_UnaUnidad();

    /**
     * The meta object literal for the '{@link textVerduler.textVerduler.impl.ClienteImpl <em>Cliente</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see textVerduler.textVerduler.impl.ClienteImpl
     * @see textVerduler.textVerduler.impl.TextVerdulerPackageImpl#getCliente()
     * @generated
     */
    EClass CLIENTE = eINSTANCE.getCliente();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLIENTE__NAME = eINSTANCE.getCliente_Name();

    /**
     * The meta object literal for the '{@link textVerduler.textVerduler.impl.EstadoDeudaImpl <em>Estado Deuda</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see textVerduler.textVerduler.impl.EstadoDeudaImpl
     * @see textVerduler.textVerduler.impl.TextVerdulerPackageImpl#getEstadoDeuda()
     * @generated
     */
    EClass ESTADO_DEUDA = eINSTANCE.getEstadoDeuda();

    /**
     * The meta object literal for the '{@link textVerduler.textVerduler.impl.ImporteImpl <em>Importe</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see textVerduler.textVerduler.impl.ImporteImpl
     * @see textVerduler.textVerduler.impl.TextVerdulerPackageImpl#getImporte()
     * @generated
     */
    EClass IMPORTE = eINSTANCE.getImporte();

    /**
     * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORTE__VALOR = eINSTANCE.getImporte_Valor();

    /**
     * The meta object literal for the '<em><b>Moneda</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPORTE__MONEDA = eINSTANCE.getImporte_Moneda();

    /**
     * The meta object literal for the '{@link textVerduler.textVerduler.impl.MonedaImpl <em>Moneda</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see textVerduler.textVerduler.impl.MonedaImpl
     * @see textVerduler.textVerduler.impl.TextVerdulerPackageImpl#getMoneda()
     * @generated
     */
    EClass MONEDA = eINSTANCE.getMoneda();

    /**
     * The meta object literal for the '<em><b>Pesos</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MONEDA__PESOS = eINSTANCE.getMoneda_Pesos();

  }

} //TextVerdulerPackage
