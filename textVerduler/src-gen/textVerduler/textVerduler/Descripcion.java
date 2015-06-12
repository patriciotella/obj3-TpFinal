/**
 */
package textVerduler.textVerduler;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Descripcion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link textVerduler.textVerduler.Descripcion#getUnImporte <em>Un Importe</em>}</li>
 *   <li>{@link textVerduler.textVerduler.Descripcion#getUnaCantidad <em>Una Cantidad</em>}</li>
 * </ul>
 *
 * @see textVerduler.textVerduler.TextVerdulerPackage#getDescripcion()
 * @model
 * @generated
 */
public interface Descripcion extends EObject
{
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
   * @see textVerduler.textVerduler.TextVerdulerPackage#getDescripcion_UnImporte()
   * @model containment="true"
   * @generated
   */
  Importe getUnImporte();

  /**
   * Sets the value of the '{@link textVerduler.textVerduler.Descripcion#getUnImporte <em>Un Importe</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Un Importe</em>' containment reference.
   * @see #getUnImporte()
   * @generated
   */
  void setUnImporte(Importe value);

  /**
   * Returns the value of the '<em><b>Una Cantidad</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Una Cantidad</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Una Cantidad</em>' containment reference.
   * @see #setUnaCantidad(Cantidad)
   * @see textVerduler.textVerduler.TextVerdulerPackage#getDescripcion_UnaCantidad()
   * @model containment="true"
   * @generated
   */
  Cantidad getUnaCantidad();

  /**
   * Sets the value of the '{@link textVerduler.textVerduler.Descripcion#getUnaCantidad <em>Una Cantidad</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Una Cantidad</em>' containment reference.
   * @see #getUnaCantidad()
   * @generated
   */
  void setUnaCantidad(Cantidad value);

} // Descripcion
