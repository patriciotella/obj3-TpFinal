/**
 */
package textVerduler.textVerduler;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Total De Compra</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link textVerduler.textVerduler.TotalDeCompra#getUnTotal <em>Un Total</em>}</li>
 *   <li>{@link textVerduler.textVerduler.TotalDeCompra#getUnImporteTotal <em>Un Importe Total</em>}</li>
 * </ul>
 *
 * @see textVerduler.textVerduler.TextVerdulerPackage#getTotalDeCompra()
 * @model
 * @generated
 */
public interface TotalDeCompra extends EObject
{
  /**
   * Returns the value of the '<em><b>Un Total</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Un Total</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Un Total</em>' attribute.
   * @see #setUnTotal(String)
   * @see textVerduler.textVerduler.TextVerdulerPackage#getTotalDeCompra_UnTotal()
   * @model
   * @generated
   */
  String getUnTotal();

  /**
   * Sets the value of the '{@link textVerduler.textVerduler.TotalDeCompra#getUnTotal <em>Un Total</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Un Total</em>' attribute.
   * @see #getUnTotal()
   * @generated
   */
  void setUnTotal(String value);

  /**
   * Returns the value of the '<em><b>Un Importe Total</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Un Importe Total</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Un Importe Total</em>' containment reference.
   * @see #setUnImporteTotal(Importe)
   * @see textVerduler.textVerduler.TextVerdulerPackage#getTotalDeCompra_UnImporteTotal()
   * @model containment="true"
   * @generated
   */
  Importe getUnImporteTotal();

  /**
   * Sets the value of the '{@link textVerduler.textVerduler.TotalDeCompra#getUnImporteTotal <em>Un Importe Total</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Un Importe Total</em>' containment reference.
   * @see #getUnImporteTotal()
   * @generated
   */
  void setUnImporteTotal(Importe value);

} // TotalDeCompra
