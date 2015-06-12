/**
 */
package textVerduler.textVerduler;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mercaderia</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link textVerduler.textVerduler.Mercaderia#getUnaDescripcion <em>Una Descripcion</em>}</li>
 *   <li>{@link textVerduler.textVerduler.Mercaderia#getNombreDeProducto <em>Nombre De Producto</em>}</li>
 * </ul>
 *
 * @see textVerduler.textVerduler.TextVerdulerPackage#getMercaderia()
 * @model
 * @generated
 */
public interface Mercaderia extends EObject
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
   * @see #setUnaDescripcion(Cantidad)
   * @see textVerduler.textVerduler.TextVerdulerPackage#getMercaderia_UnaDescripcion()
   * @model containment="true"
   * @generated
   */
  Cantidad getUnaDescripcion();

  /**
   * Sets the value of the '{@link textVerduler.textVerduler.Mercaderia#getUnaDescripcion <em>Una Descripcion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Una Descripcion</em>' containment reference.
   * @see #getUnaDescripcion()
   * @generated
   */
  void setUnaDescripcion(Cantidad value);

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
   * @see textVerduler.textVerduler.TextVerdulerPackage#getMercaderia_NombreDeProducto()
   * @model
   * @generated
   */
  String getNombreDeProducto();

  /**
   * Sets the value of the '{@link textVerduler.textVerduler.Mercaderia#getNombreDeProducto <em>Nombre De Producto</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nombre De Producto</em>' attribute.
   * @see #getNombreDeProducto()
   * @generated
   */
  void setNombreDeProducto(String value);

} // Mercaderia
