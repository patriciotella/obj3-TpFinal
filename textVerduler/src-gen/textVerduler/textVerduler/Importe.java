/**
 */
package textVerduler.textVerduler;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Importe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link textVerduler.textVerduler.Importe#getValor <em>Valor</em>}</li>
 *   <li>{@link textVerduler.textVerduler.Importe#getMoneda <em>Moneda</em>}</li>
 * </ul>
 *
 * @see textVerduler.textVerduler.TextVerdulerPackage#getImporte()
 * @model
 * @generated
 */
public interface Importe extends EstadoDeuda
{
  /**
   * Returns the value of the '<em><b>Valor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Valor</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valor</em>' attribute.
   * @see #setValor(int)
   * @see textVerduler.textVerduler.TextVerdulerPackage#getImporte_Valor()
   * @model
   * @generated
   */
  int getValor();

  /**
   * Sets the value of the '{@link textVerduler.textVerduler.Importe#getValor <em>Valor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valor</em>' attribute.
   * @see #getValor()
   * @generated
   */
  void setValor(int value);

  /**
   * Returns the value of the '<em><b>Moneda</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Moneda</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Moneda</em>' containment reference.
   * @see #setMoneda(Moneda)
   * @see textVerduler.textVerduler.TextVerdulerPackage#getImporte_Moneda()
   * @model containment="true"
   * @generated
   */
  Moneda getMoneda();

  /**
   * Sets the value of the '{@link textVerduler.textVerduler.Importe#getMoneda <em>Moneda</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Moneda</em>' containment reference.
   * @see #getMoneda()
   * @generated
   */
  void setMoneda(Moneda value);

} // Importe
