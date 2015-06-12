/**
 */
package textVerduler.textVerduler;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Venta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link textVerduler.textVerduler.Venta#getNombre <em>Nombre</em>}</li>
 *   <li>{@link textVerduler.textVerduler.Venta#getUnaListaDeCompras <em>Una Lista De Compras</em>}</li>
 *   <li>{@link textVerduler.textVerduler.Venta#getUnImporte <em>Un Importe</em>}</li>
 *   <li>{@link textVerduler.textVerduler.Venta#getUnTotal <em>Un Total</em>}</li>
 * </ul>
 *
 * @see textVerduler.textVerduler.TextVerdulerPackage#getVenta()
 * @model
 * @generated
 */
public interface Venta extends EObject
{
  /**
   * Returns the value of the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nombre</em>' attribute.
   * @see #setNombre(String)
   * @see textVerduler.textVerduler.TextVerdulerPackage#getVenta_Nombre()
   * @model
   * @generated
   */
  String getNombre();

  /**
   * Sets the value of the '{@link textVerduler.textVerduler.Venta#getNombre <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nombre</em>' attribute.
   * @see #getNombre()
   * @generated
   */
  void setNombre(String value);

  /**
   * Returns the value of the '<em><b>Una Lista De Compras</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Una Lista De Compras</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Una Lista De Compras</em>' containment reference.
   * @see #setUnaListaDeCompras(Mercaderia)
   * @see textVerduler.textVerduler.TextVerdulerPackage#getVenta_UnaListaDeCompras()
   * @model containment="true"
   * @generated
   */
  Mercaderia getUnaListaDeCompras();

  /**
   * Sets the value of the '{@link textVerduler.textVerduler.Venta#getUnaListaDeCompras <em>Una Lista De Compras</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Una Lista De Compras</em>' containment reference.
   * @see #getUnaListaDeCompras()
   * @generated
   */
  void setUnaListaDeCompras(Mercaderia value);

  /**
   * Returns the value of the '<em><b>Un Importe</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Un Importe</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Un Importe</em>' containment reference.
   * @see #setUnImporte(Importe)
   * @see textVerduler.textVerduler.TextVerdulerPackage#getVenta_UnImporte()
   * @model containment="true"
   * @generated
   */
  Importe getUnImporte();

  /**
   * Sets the value of the '{@link textVerduler.textVerduler.Venta#getUnImporte <em>Un Importe</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Un Importe</em>' containment reference.
   * @see #getUnImporte()
   * @generated
   */
  void setUnImporte(Importe value);

  /**
   * Returns the value of the '<em><b>Un Total</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Un Total</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Un Total</em>' containment reference.
   * @see #setUnTotal(TotalDeCompra)
   * @see textVerduler.textVerduler.TextVerdulerPackage#getVenta_UnTotal()
   * @model containment="true"
   * @generated
   */
  TotalDeCompra getUnTotal();

  /**
   * Sets the value of the '{@link textVerduler.textVerduler.Venta#getUnTotal <em>Un Total</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Un Total</em>' containment reference.
   * @see #getUnTotal()
   * @generated
   */
  void setUnTotal(TotalDeCompra value);

} // Venta
