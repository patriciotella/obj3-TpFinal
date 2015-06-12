/**
 */
package textVerduler.textVerduler;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Producto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link textVerduler.textVerduler.Producto#getNombreDeProducto <em>Nombre De Producto</em>}</li>
 * </ul>
 *
 * @see textVerduler.textVerduler.TextVerdulerPackage#getProducto()
 * @model
 * @generated
 */
public interface Producto extends EObject
{
  /**
   * Returns the value of the '<em><b>Nombre De Producto</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nombre De Producto</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nombre De Producto</em>' attribute.
   * @see #setNombreDeProducto(String)
   * @see textVerduler.textVerduler.TextVerdulerPackage#getProducto_NombreDeProducto()
   * @model
   * @generated
   */
  String getNombreDeProducto();

  /**
   * Sets the value of the '{@link textVerduler.textVerduler.Producto#getNombreDeProducto <em>Nombre De Producto</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nombre De Producto</em>' attribute.
   * @see #getNombreDeProducto()
   * @generated
   */
  void setNombreDeProducto(String value);

} // Producto
