/**
 */
package textVerduler.textVerduler;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Producto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link textVerduler.textVerduler.ModelProducto#getProductos <em>Productos</em>}</li>
 *   <li>{@link textVerduler.textVerduler.ModelProducto#getValor <em>Valor</em>}</li>
 * </ul>
 *
 * @see textVerduler.textVerduler.TextVerdulerPackage#getModelProducto()
 * @model
 * @generated
 */
public interface ModelProducto extends EObject
{
  /**
   * Returns the value of the '<em><b>Productos</b></em>' containment reference list.
   * The list contents are of type {@link textVerduler.textVerduler.Producto}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Productos</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Productos</em>' containment reference list.
   * @see textVerduler.textVerduler.TextVerdulerPackage#getModelProducto_Productos()
   * @model containment="true"
   * @generated
   */
  EList<Producto> getProductos();

  /**
   * Returns the value of the '<em><b>Valor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Valor</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valor</em>' containment reference.
   * @see #setValor(ValorDelProducto)
   * @see textVerduler.textVerduler.TextVerdulerPackage#getModelProducto_Valor()
   * @model containment="true"
   * @generated
   */
  ValorDelProducto getValor();

  /**
   * Sets the value of the '{@link textVerduler.textVerduler.ModelProducto#getValor <em>Valor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valor</em>' containment reference.
   * @see #getValor()
   * @generated
   */
  void setValor(ValorDelProducto value);

} // ModelProducto
