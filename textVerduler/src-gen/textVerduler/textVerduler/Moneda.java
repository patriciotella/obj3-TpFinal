/**
 */
package textVerduler.textVerduler;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Moneda</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link textVerduler.textVerduler.Moneda#getPesos <em>Pesos</em>}</li>
 * </ul>
 *
 * @see textVerduler.textVerduler.TextVerdulerPackage#getMoneda()
 * @model
 * @generated
 */
public interface Moneda extends EObject
{
  /**
   * Returns the value of the '<em><b>Pesos</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pesos</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pesos</em>' attribute.
   * @see #setPesos(String)
   * @see textVerduler.textVerduler.TextVerdulerPackage#getMoneda_Pesos()
   * @model
   * @generated
   */
  String getPesos();

  /**
   * Sets the value of the '{@link textVerduler.textVerduler.Moneda#getPesos <em>Pesos</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pesos</em>' attribute.
   * @see #getPesos()
   * @generated
   */
  void setPesos(String value);

} // Moneda
