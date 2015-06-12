/**
 */
package textVerduler.textVerduler;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see textVerduler.textVerduler.TextVerdulerPackage
 * @generated
 */
public interface TextVerdulerFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TextVerdulerFactory eINSTANCE = textVerduler.textVerduler.impl.TextVerdulerFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Verduleria</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Verduleria</em>'.
   * @generated
   */
  Verduleria createVerduleria();

  /**
   * Returns a new object of class '<em>Model Cliente</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Cliente</em>'.
   * @generated
   */
  ModelCliente createModelCliente();

  /**
   * Returns a new object of class '<em>Model Producto</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Producto</em>'.
   * @generated
   */
  ModelProducto createModelProducto();

  /**
   * Returns a new object of class '<em>Model Venta</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Venta</em>'.
   * @generated
   */
  ModelVenta createModelVenta();

  /**
   * Returns a new object of class '<em>Venta</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Venta</em>'.
   * @generated
   */
  Venta createVenta();

  /**
   * Returns a new object of class '<em>Total De Compra</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Total De Compra</em>'.
   * @generated
   */
  TotalDeCompra createTotalDeCompra();

  /**
   * Returns a new object of class '<em>Mercaderia</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mercaderia</em>'.
   * @generated
   */
  Mercaderia createMercaderia();

  /**
   * Returns a new object of class '<em>Producto</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Producto</em>'.
   * @generated
   */
  Producto createProducto();

  /**
   * Returns a new object of class '<em>Valor Del Producto</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Valor Del Producto</em>'.
   * @generated
   */
  ValorDelProducto createValorDelProducto();

  /**
   * Returns a new object of class '<em>Descripcion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Descripcion</em>'.
   * @generated
   */
  Descripcion createDescripcion();

  /**
   * Returns a new object of class '<em>Cantidad</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cantidad</em>'.
   * @generated
   */
  Cantidad createCantidad();

  /**
   * Returns a new object of class '<em>Articulo</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Articulo</em>'.
   * @generated
   */
  Articulo createArticulo();

  /**
   * Returns a new object of class '<em>Unidad</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unidad</em>'.
   * @generated
   */
  Unidad createUnidad();

  /**
   * Returns a new object of class '<em>Cliente</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cliente</em>'.
   * @generated
   */
  Cliente createCliente();

  /**
   * Returns a new object of class '<em>Estado Deuda</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Estado Deuda</em>'.
   * @generated
   */
  EstadoDeuda createEstadoDeuda();

  /**
   * Returns a new object of class '<em>Importe</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Importe</em>'.
   * @generated
   */
  Importe createImporte();

  /**
   * Returns a new object of class '<em>Moneda</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Moneda</em>'.
   * @generated
   */
  Moneda createMoneda();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  TextVerdulerPackage getTextVerdulerPackage();

} //TextVerdulerFactory
