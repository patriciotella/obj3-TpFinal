/**
 */
package textVerduler.textVerduler;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cantidad</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link textVerduler.textVerduler.Cantidad#getUnArticulo <em>Un Articulo</em>}</li>
 *   <li>{@link textVerduler.textVerduler.Cantidad#getUnValor <em>Un Valor</em>}</li>
 *   <li>{@link textVerduler.textVerduler.Cantidad#getUnaCantidad <em>Una Cantidad</em>}</li>
 * </ul>
 *
 * @see textVerduler.textVerduler.TextVerdulerPackage#getCantidad()
 * @model
 * @generated
 */
public interface Cantidad extends EObject
{
  /**
   * Returns the value of the '<em><b>Un Articulo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Un Articulo</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Un Articulo</em>' containment reference.
   * @see #setUnArticulo(Articulo)
   * @see textVerduler.textVerduler.TextVerdulerPackage#getCantidad_UnArticulo()
   * @model containment="true"
   * @generated
   */
  Articulo getUnArticulo();

  /**
   * Sets the value of the '{@link textVerduler.textVerduler.Cantidad#getUnArticulo <em>Un Articulo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Un Articulo</em>' containment reference.
   * @see #getUnArticulo()
   * @generated
   */
  void setUnArticulo(Articulo value);

  /**
   * Returns the value of the '<em><b>Un Valor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Un Valor</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Un Valor</em>' attribute.
   * @see #setUnValor(int)
   * @see textVerduler.textVerduler.TextVerdulerPackage#getCantidad_UnValor()
   * @model
   * @generated
   */
  int getUnValor();

  /**
   * Sets the value of the '{@link textVerduler.textVerduler.Cantidad#getUnValor <em>Un Valor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Un Valor</em>' attribute.
   * @see #getUnValor()
   * @generated
   */
  void setUnValor(int value);

  /**
   * Returns the value of the '<em><b>Una Cantidad</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Una Cantidad</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Una Cantidad</em>' containment reference.
   * @see #setUnaCantidad(Unidad)
   * @see textVerduler.textVerduler.TextVerdulerPackage#getCantidad_UnaCantidad()
   * @model containment="true"
   * @generated
   */
  Unidad getUnaCantidad();

  /**
   * Sets the value of the '{@link textVerduler.textVerduler.Cantidad#getUnaCantidad <em>Una Cantidad</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Una Cantidad</em>' containment reference.
   * @see #getUnaCantidad()
   * @generated
   */
  void setUnaCantidad(Unidad value);

} // Cantidad
