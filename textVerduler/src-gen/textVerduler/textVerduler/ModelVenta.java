/**
 */
package textVerduler.textVerduler;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Venta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link textVerduler.textVerduler.ModelVenta#getVenta <em>Venta</em>}</li>
 * </ul>
 *
 * @see textVerduler.textVerduler.TextVerdulerPackage#getModelVenta()
 * @model
 * @generated
 */
public interface ModelVenta extends EObject
{
  /**
   * Returns the value of the '<em><b>Venta</b></em>' containment reference list.
   * The list contents are of type {@link textVerduler.textVerduler.Venta}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Venta</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Venta</em>' containment reference list.
   * @see textVerduler.textVerduler.TextVerdulerPackage#getModelVenta_Venta()
   * @model containment="true"
   * @generated
   */
  EList<Venta> getVenta();

} // ModelVenta
