/**
 */
package textVerduler.textVerduler.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import textVerduler.textVerduler.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextVerdulerFactoryImpl extends EFactoryImpl implements TextVerdulerFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TextVerdulerFactory init()
  {
    try
    {
      TextVerdulerFactory theTextVerdulerFactory = (TextVerdulerFactory)EPackage.Registry.INSTANCE.getEFactory(TextVerdulerPackage.eNS_URI);
      if (theTextVerdulerFactory != null)
      {
        return theTextVerdulerFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TextVerdulerFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextVerdulerFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TextVerdulerPackage.VERDULERIA: return createVerduleria();
      case TextVerdulerPackage.MODEL_CLIENTE: return createModelCliente();
      case TextVerdulerPackage.MODEL_PRODUCTO: return createModelProducto();
      case TextVerdulerPackage.MODEL_VENTA: return createModelVenta();
      case TextVerdulerPackage.VENTA: return createVenta();
      case TextVerdulerPackage.TOTAL_DE_COMPRA: return createTotalDeCompra();
      case TextVerdulerPackage.MERCADERIA: return createMercaderia();
      case TextVerdulerPackage.PRODUCTO: return createProducto();
      case TextVerdulerPackage.VALOR_DEL_PRODUCTO: return createValorDelProducto();
      case TextVerdulerPackage.DESCRIPCION: return createDescripcion();
      case TextVerdulerPackage.CANTIDAD: return createCantidad();
      case TextVerdulerPackage.ARTICULO: return createArticulo();
      case TextVerdulerPackage.UNIDAD: return createUnidad();
      case TextVerdulerPackage.CLIENTE: return createCliente();
      case TextVerdulerPackage.ESTADO_DEUDA: return createEstadoDeuda();
      case TextVerdulerPackage.IMPORTE: return createImporte();
      case TextVerdulerPackage.MONEDA: return createMoneda();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Verduleria createVerduleria()
  {
    VerduleriaImpl verduleria = new VerduleriaImpl();
    return verduleria;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelCliente createModelCliente()
  {
    ModelClienteImpl modelCliente = new ModelClienteImpl();
    return modelCliente;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelProducto createModelProducto()
  {
    ModelProductoImpl modelProducto = new ModelProductoImpl();
    return modelProducto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelVenta createModelVenta()
  {
    ModelVentaImpl modelVenta = new ModelVentaImpl();
    return modelVenta;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Venta createVenta()
  {
    VentaImpl venta = new VentaImpl();
    return venta;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TotalDeCompra createTotalDeCompra()
  {
    TotalDeCompraImpl totalDeCompra = new TotalDeCompraImpl();
    return totalDeCompra;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mercaderia createMercaderia()
  {
    MercaderiaImpl mercaderia = new MercaderiaImpl();
    return mercaderia;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Producto createProducto()
  {
    ProductoImpl producto = new ProductoImpl();
    return producto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValorDelProducto createValorDelProducto()
  {
    ValorDelProductoImpl valorDelProducto = new ValorDelProductoImpl();
    return valorDelProducto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Descripcion createDescripcion()
  {
    DescripcionImpl descripcion = new DescripcionImpl();
    return descripcion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cantidad createCantidad()
  {
    CantidadImpl cantidad = new CantidadImpl();
    return cantidad;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Articulo createArticulo()
  {
    ArticuloImpl articulo = new ArticuloImpl();
    return articulo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Unidad createUnidad()
  {
    UnidadImpl unidad = new UnidadImpl();
    return unidad;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cliente createCliente()
  {
    ClienteImpl cliente = new ClienteImpl();
    return cliente;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EstadoDeuda createEstadoDeuda()
  {
    EstadoDeudaImpl estadoDeuda = new EstadoDeudaImpl();
    return estadoDeuda;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Importe createImporte()
  {
    ImporteImpl importe = new ImporteImpl();
    return importe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Moneda createMoneda()
  {
    MonedaImpl moneda = new MonedaImpl();
    return moneda;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextVerdulerPackage getTextVerdulerPackage()
  {
    return (TextVerdulerPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TextVerdulerPackage getPackage()
  {
    return TextVerdulerPackage.eINSTANCE;
  }

} //TextVerdulerFactoryImpl
