/**
 */
package textVerduler.textVerduler;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Cliente</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link textVerduler.textVerduler.ModelCliente#getClientes <em>Clientes</em>}</li>
 *   <li>{@link textVerduler.textVerduler.ModelCliente#getEstadoDeDeuda <em>Estado De Deuda</em>}</li>
 * </ul>
 *
 * @see textVerduler.textVerduler.TextVerdulerPackage#getModelCliente()
 * @model
 * @generated
 */
public interface ModelCliente extends EObject
{
  /**
   * Returns the value of the '<em><b>Clientes</b></em>' containment reference list.
   * The list contents are of type {@link textVerduler.textVerduler.Cliente}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clientes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clientes</em>' containment reference list.
   * @see textVerduler.textVerduler.TextVerdulerPackage#getModelCliente_Clientes()
   * @model containment="true"
   * @generated
   */
  EList<Cliente> getClientes();

  /**
   * Returns the value of the '<em><b>Estado De Deuda</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Estado De Deuda</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Estado De Deuda</em>' containment reference.
   * @see #setEstadoDeDeuda(EstadoDeuda)
   * @see textVerduler.textVerduler.TextVerdulerPackage#getModelCliente_EstadoDeDeuda()
   * @model containment="true"
   * @generated
   */
  EstadoDeuda getEstadoDeDeuda();

  /**
   * Sets the value of the '{@link textVerduler.textVerduler.ModelCliente#getEstadoDeDeuda <em>Estado De Deuda</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Estado De Deuda</em>' containment reference.
   * @see #getEstadoDeDeuda()
   * @generated
   */
  void setEstadoDeDeuda(EstadoDeuda value);

} // ModelCliente
