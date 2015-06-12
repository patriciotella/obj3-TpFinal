/**
 */
package textVerduler.textVerduler;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Valor Del Producto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link textVerduler.textVerduler.ValorDelProducto#getUnaDescripcion <em>Una Descripcion</em>}</li>
 * </ul>
 *
 * @see textVerduler.textVerduler.TextVerdulerPackage#getValorDelProducto()
 * @model
 * @generated
 */
public interface ValorDelProducto extends EObject
{
  /**
   * Returns the value of the '<em><b>Una Descripcion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Una Descripcion</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Una Descripcion</em>' containment reference.
   * @see #setUnaDescripcion(Descripcion)
   * @see textVerduler.textVerduler.TextVerdulerPackage#getValorDelProducto_UnaDescripcion()
   * @model containment="true"
   * @generated
   */
  Descripcion getUnaDescripcion();

  /**
   * Sets the value of the '{@link textVerduler.textVerduler.ValorDelProducto#getUnaDescripcion <em>Una Descripcion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Una Descripcion</em>' containment reference.
   * @see #getUnaDescripcion()
   * @generated
   */
  void setUnaDescripcion(Descripcion value);

} // ValorDelProducto
