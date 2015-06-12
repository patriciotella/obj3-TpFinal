/**
 */
package textVerduler.textVerduler;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verduleria</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link textVerduler.textVerduler.Verduleria#getAnotaciones <em>Anotaciones</em>}</li>
 * </ul>
 *
 * @see textVerduler.textVerduler.TextVerdulerPackage#getVerduleria()
 * @model
 * @generated
 */
public interface Verduleria extends EObject
{
  /**
   * Returns the value of the '<em><b>Anotaciones</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Anotaciones</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Anotaciones</em>' containment reference list.
   * @see textVerduler.textVerduler.TextVerdulerPackage#getVerduleria_Anotaciones()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getAnotaciones();

} // Verduleria
