/**
 */
package textVerduler.textVerduler.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import textVerduler.textVerduler.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see textVerduler.textVerduler.TextVerdulerPackage
 * @generated
 */
public class TextVerdulerSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TextVerdulerPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextVerdulerSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = TextVerdulerPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case TextVerdulerPackage.VERDULERIA:
      {
        Verduleria verduleria = (Verduleria)theEObject;
        T result = caseVerduleria(verduleria);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextVerdulerPackage.MODEL_CLIENTE:
      {
        ModelCliente modelCliente = (ModelCliente)theEObject;
        T result = caseModelCliente(modelCliente);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextVerdulerPackage.MODEL_PRODUCTO:
      {
        ModelProducto modelProducto = (ModelProducto)theEObject;
        T result = caseModelProducto(modelProducto);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextVerdulerPackage.MODEL_VENTA:
      {
        ModelVenta modelVenta = (ModelVenta)theEObject;
        T result = caseModelVenta(modelVenta);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextVerdulerPackage.VENTA:
      {
        Venta venta = (Venta)theEObject;
        T result = caseVenta(venta);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextVerdulerPackage.TOTAL_DE_COMPRA:
      {
        TotalDeCompra totalDeCompra = (TotalDeCompra)theEObject;
        T result = caseTotalDeCompra(totalDeCompra);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextVerdulerPackage.MERCADERIA:
      {
        Mercaderia mercaderia = (Mercaderia)theEObject;
        T result = caseMercaderia(mercaderia);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextVerdulerPackage.PRODUCTO:
      {
        Producto producto = (Producto)theEObject;
        T result = caseProducto(producto);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextVerdulerPackage.VALOR_DEL_PRODUCTO:
      {
        ValorDelProducto valorDelProducto = (ValorDelProducto)theEObject;
        T result = caseValorDelProducto(valorDelProducto);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextVerdulerPackage.DESCRIPCION:
      {
        Descripcion descripcion = (Descripcion)theEObject;
        T result = caseDescripcion(descripcion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextVerdulerPackage.CANTIDAD:
      {
        Cantidad cantidad = (Cantidad)theEObject;
        T result = caseCantidad(cantidad);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextVerdulerPackage.ARTICULO:
      {
        Articulo articulo = (Articulo)theEObject;
        T result = caseArticulo(articulo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextVerdulerPackage.UNIDAD:
      {
        Unidad unidad = (Unidad)theEObject;
        T result = caseUnidad(unidad);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextVerdulerPackage.CLIENTE:
      {
        Cliente cliente = (Cliente)theEObject;
        T result = caseCliente(cliente);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextVerdulerPackage.ESTADO_DEUDA:
      {
        EstadoDeuda estadoDeuda = (EstadoDeuda)theEObject;
        T result = caseEstadoDeuda(estadoDeuda);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextVerdulerPackage.IMPORTE:
      {
        Importe importe = (Importe)theEObject;
        T result = caseImporte(importe);
        if (result == null) result = caseEstadoDeuda(importe);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TextVerdulerPackage.MONEDA:
      {
        Moneda moneda = (Moneda)theEObject;
        T result = caseMoneda(moneda);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Verduleria</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Verduleria</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVerduleria(Verduleria object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Cliente</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Cliente</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelCliente(ModelCliente object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Producto</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Producto</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelProducto(ModelProducto object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Venta</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Venta</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelVenta(ModelVenta object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Venta</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Venta</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVenta(Venta object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Total De Compra</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Total De Compra</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTotalDeCompra(TotalDeCompra object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mercaderia</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mercaderia</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMercaderia(Mercaderia object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Producto</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Producto</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProducto(Producto object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Valor Del Producto</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Valor Del Producto</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValorDelProducto(ValorDelProducto object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Descripcion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Descripcion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDescripcion(Descripcion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cantidad</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cantidad</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCantidad(Cantidad object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Articulo</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Articulo</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArticulo(Articulo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unidad</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unidad</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnidad(Unidad object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cliente</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cliente</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCliente(Cliente object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Estado Deuda</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Estado Deuda</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEstadoDeuda(EstadoDeuda object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Importe</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Importe</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImporte(Importe object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Moneda</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Moneda</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMoneda(Moneda object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //TextVerdulerSwitch
