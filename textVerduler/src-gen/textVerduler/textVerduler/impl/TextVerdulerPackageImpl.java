/**
 */
package textVerduler.textVerduler.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import textVerduler.textVerduler.Articulo;
import textVerduler.textVerduler.Cantidad;
import textVerduler.textVerduler.Cliente;
import textVerduler.textVerduler.Descripcion;
import textVerduler.textVerduler.EstadoDeuda;
import textVerduler.textVerduler.Importe;
import textVerduler.textVerduler.Mercaderia;
import textVerduler.textVerduler.ModelCliente;
import textVerduler.textVerduler.ModelProducto;
import textVerduler.textVerduler.ModelVenta;
import textVerduler.textVerduler.Moneda;
import textVerduler.textVerduler.Producto;
import textVerduler.textVerduler.TextVerdulerFactory;
import textVerduler.textVerduler.TextVerdulerPackage;
import textVerduler.textVerduler.TotalDeCompra;
import textVerduler.textVerduler.Unidad;
import textVerduler.textVerduler.ValorDelProducto;
import textVerduler.textVerduler.Venta;
import textVerduler.textVerduler.Verduleria;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextVerdulerPackageImpl extends EPackageImpl implements TextVerdulerPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass verduleriaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelClienteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelProductoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelVentaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ventaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass totalDeCompraEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mercaderiaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass productoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valorDelProductoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass descripcionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cantidadEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass articuloEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unidadEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass clienteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass estadoDeudaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass monedaEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see textVerduler.textVerduler.TextVerdulerPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private TextVerdulerPackageImpl()
  {
    super(eNS_URI, TextVerdulerFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link TextVerdulerPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static TextVerdulerPackage init()
  {
    if (isInited) return (TextVerdulerPackage)EPackage.Registry.INSTANCE.getEPackage(TextVerdulerPackage.eNS_URI);

    // Obtain or create and register package
    TextVerdulerPackageImpl theTextVerdulerPackage = (TextVerdulerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TextVerdulerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TextVerdulerPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theTextVerdulerPackage.createPackageContents();

    // Initialize created meta-data
    theTextVerdulerPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theTextVerdulerPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(TextVerdulerPackage.eNS_URI, theTextVerdulerPackage);
    return theTextVerdulerPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVerduleria()
  {
    return verduleriaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVerduleria_Anotaciones()
  {
    return (EReference)verduleriaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelCliente()
  {
    return modelClienteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelCliente_Clientes()
  {
    return (EReference)modelClienteEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelCliente_EstadoDeDeuda()
  {
    return (EReference)modelClienteEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelProducto()
  {
    return modelProductoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelProducto_Productos()
  {
    return (EReference)modelProductoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelProducto_Valor()
  {
    return (EReference)modelProductoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelVenta()
  {
    return modelVentaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelVenta_Venta()
  {
    return (EReference)modelVentaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVenta()
  {
    return ventaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVenta_Nombre()
  {
    return (EAttribute)ventaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVenta_UnaListaDeCompras()
  {
    return (EReference)ventaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVenta_UnImporte()
  {
    return (EReference)ventaEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVenta_UnTotal()
  {
    return (EReference)ventaEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTotalDeCompra()
  {
    return totalDeCompraEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTotalDeCompra_UnTotal()
  {
    return (EAttribute)totalDeCompraEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTotalDeCompra_UnImporteTotal()
  {
    return (EReference)totalDeCompraEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMercaderia()
  {
    return mercaderiaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMercaderia_UnaDescripcion()
  {
    return (EReference)mercaderiaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMercaderia_NombreDeProducto()
  {
    return (EAttribute)mercaderiaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProducto()
  {
    return productoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProducto_NombreDeProducto()
  {
    return (EAttribute)productoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValorDelProducto()
  {
    return valorDelProductoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValorDelProducto_UnaDescripcion()
  {
    return (EReference)valorDelProductoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDescripcion()
  {
    return descripcionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDescripcion_UnImporte()
  {
    return (EReference)descripcionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDescripcion_UnaCantidad()
  {
    return (EReference)descripcionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCantidad()
  {
    return cantidadEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCantidad_UnArticulo()
  {
    return (EReference)cantidadEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCantidad_UnValor()
  {
    return (EAttribute)cantidadEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCantidad_UnaCantidad()
  {
    return (EReference)cantidadEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArticulo()
  {
    return articuloEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArticulo_UnArticulo()
  {
    return (EAttribute)articuloEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnidad()
  {
    return unidadEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnidad_UnaUnidad()
  {
    return (EAttribute)unidadEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCliente()
  {
    return clienteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCliente_Name()
  {
    return (EAttribute)clienteEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEstadoDeuda()
  {
    return estadoDeudaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImporte()
  {
    return importeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImporte_Valor()
  {
    return (EAttribute)importeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImporte_Moneda()
  {
    return (EReference)importeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMoneda()
  {
    return monedaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMoneda_Pesos()
  {
    return (EAttribute)monedaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextVerdulerFactory getTextVerdulerFactory()
  {
    return (TextVerdulerFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    verduleriaEClass = createEClass(VERDULERIA);
    createEReference(verduleriaEClass, VERDULERIA__ANOTACIONES);

    modelClienteEClass = createEClass(MODEL_CLIENTE);
    createEReference(modelClienteEClass, MODEL_CLIENTE__CLIENTES);
    createEReference(modelClienteEClass, MODEL_CLIENTE__ESTADO_DE_DEUDA);

    modelProductoEClass = createEClass(MODEL_PRODUCTO);
    createEReference(modelProductoEClass, MODEL_PRODUCTO__PRODUCTOS);
    createEReference(modelProductoEClass, MODEL_PRODUCTO__VALOR);

    modelVentaEClass = createEClass(MODEL_VENTA);
    createEReference(modelVentaEClass, MODEL_VENTA__VENTA);

    ventaEClass = createEClass(VENTA);
    createEAttribute(ventaEClass, VENTA__NOMBRE);
    createEReference(ventaEClass, VENTA__UNA_LISTA_DE_COMPRAS);
    createEReference(ventaEClass, VENTA__UN_IMPORTE);
    createEReference(ventaEClass, VENTA__UN_TOTAL);

    totalDeCompraEClass = createEClass(TOTAL_DE_COMPRA);
    createEAttribute(totalDeCompraEClass, TOTAL_DE_COMPRA__UN_TOTAL);
    createEReference(totalDeCompraEClass, TOTAL_DE_COMPRA__UN_IMPORTE_TOTAL);

    mercaderiaEClass = createEClass(MERCADERIA);
    createEReference(mercaderiaEClass, MERCADERIA__UNA_DESCRIPCION);
    createEAttribute(mercaderiaEClass, MERCADERIA__NOMBRE_DE_PRODUCTO);

    productoEClass = createEClass(PRODUCTO);
    createEAttribute(productoEClass, PRODUCTO__NOMBRE_DE_PRODUCTO);

    valorDelProductoEClass = createEClass(VALOR_DEL_PRODUCTO);
    createEReference(valorDelProductoEClass, VALOR_DEL_PRODUCTO__UNA_DESCRIPCION);

    descripcionEClass = createEClass(DESCRIPCION);
    createEReference(descripcionEClass, DESCRIPCION__UN_IMPORTE);
    createEReference(descripcionEClass, DESCRIPCION__UNA_CANTIDAD);

    cantidadEClass = createEClass(CANTIDAD);
    createEReference(cantidadEClass, CANTIDAD__UN_ARTICULO);
    createEAttribute(cantidadEClass, CANTIDAD__UN_VALOR);
    createEReference(cantidadEClass, CANTIDAD__UNA_CANTIDAD);

    articuloEClass = createEClass(ARTICULO);
    createEAttribute(articuloEClass, ARTICULO__UN_ARTICULO);

    unidadEClass = createEClass(UNIDAD);
    createEAttribute(unidadEClass, UNIDAD__UNA_UNIDAD);

    clienteEClass = createEClass(CLIENTE);
    createEAttribute(clienteEClass, CLIENTE__NAME);

    estadoDeudaEClass = createEClass(ESTADO_DEUDA);

    importeEClass = createEClass(IMPORTE);
    createEAttribute(importeEClass, IMPORTE__VALOR);
    createEReference(importeEClass, IMPORTE__MONEDA);

    monedaEClass = createEClass(MONEDA);
    createEAttribute(monedaEClass, MONEDA__PESOS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    importeEClass.getESuperTypes().add(this.getEstadoDeuda());

    // Initialize classes and features; add operations and parameters
    initEClass(verduleriaEClass, Verduleria.class, "Verduleria", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVerduleria_Anotaciones(), ecorePackage.getEObject(), null, "anotaciones", null, 0, -1, Verduleria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modelClienteEClass, ModelCliente.class, "ModelCliente", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModelCliente_Clientes(), this.getCliente(), null, "clientes", null, 0, -1, ModelCliente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelCliente_EstadoDeDeuda(), this.getEstadoDeuda(), null, "estadoDeDeuda", null, 0, 1, ModelCliente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modelProductoEClass, ModelProducto.class, "ModelProducto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModelProducto_Productos(), this.getProducto(), null, "productos", null, 0, -1, ModelProducto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelProducto_Valor(), this.getValorDelProducto(), null, "valor", null, 0, 1, ModelProducto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modelVentaEClass, ModelVenta.class, "ModelVenta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModelVenta_Venta(), this.getVenta(), null, "venta", null, 0, -1, ModelVenta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ventaEClass, Venta.class, "Venta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVenta_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Venta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVenta_UnaListaDeCompras(), this.getMercaderia(), null, "unaListaDeCompras", null, 0, 1, Venta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVenta_UnImporte(), this.getImporte(), null, "unImporte", null, 0, 1, Venta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVenta_UnTotal(), this.getTotalDeCompra(), null, "unTotal", null, 0, 1, Venta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(totalDeCompraEClass, TotalDeCompra.class, "TotalDeCompra", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTotalDeCompra_UnTotal(), ecorePackage.getEString(), "unTotal", null, 0, 1, TotalDeCompra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTotalDeCompra_UnImporteTotal(), this.getImporte(), null, "unImporteTotal", null, 0, 1, TotalDeCompra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mercaderiaEClass, Mercaderia.class, "Mercaderia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMercaderia_UnaDescripcion(), this.getCantidad(), null, "unaDescripcion", null, 0, 1, Mercaderia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMercaderia_NombreDeProducto(), ecorePackage.getEString(), "nombreDeProducto", null, 0, 1, Mercaderia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(productoEClass, Producto.class, "Producto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProducto_NombreDeProducto(), ecorePackage.getEString(), "nombreDeProducto", null, 0, 1, Producto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valorDelProductoEClass, ValorDelProducto.class, "ValorDelProducto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getValorDelProducto_UnaDescripcion(), this.getDescripcion(), null, "unaDescripcion", null, 0, 1, ValorDelProducto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(descripcionEClass, Descripcion.class, "Descripcion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDescripcion_UnImporte(), this.getImporte(), null, "unImporte", null, 0, 1, Descripcion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDescripcion_UnaCantidad(), this.getCantidad(), null, "unaCantidad", null, 0, 1, Descripcion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cantidadEClass, Cantidad.class, "Cantidad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCantidad_UnArticulo(), this.getArticulo(), null, "unArticulo", null, 0, 1, Cantidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCantidad_UnValor(), ecorePackage.getEInt(), "unValor", null, 0, 1, Cantidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCantidad_UnaCantidad(), this.getUnidad(), null, "unaCantidad", null, 0, 1, Cantidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(articuloEClass, Articulo.class, "Articulo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArticulo_UnArticulo(), ecorePackage.getEString(), "unArticulo", null, 0, 1, Articulo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unidadEClass, Unidad.class, "Unidad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUnidad_UnaUnidad(), ecorePackage.getEString(), "unaUnidad", null, 0, 1, Unidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(clienteEClass, Cliente.class, "Cliente", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCliente_Name(), ecorePackage.getEString(), "name", null, 0, 1, Cliente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(estadoDeudaEClass, EstadoDeuda.class, "EstadoDeuda", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(importeEClass, Importe.class, "Importe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImporte_Valor(), ecorePackage.getEInt(), "valor", null, 0, 1, Importe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImporte_Moneda(), this.getMoneda(), null, "moneda", null, 0, 1, Importe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(monedaEClass, Moneda.class, "Moneda", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMoneda_Pesos(), ecorePackage.getEString(), "pesos", null, 0, 1, Moneda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //TextVerdulerPackageImpl
