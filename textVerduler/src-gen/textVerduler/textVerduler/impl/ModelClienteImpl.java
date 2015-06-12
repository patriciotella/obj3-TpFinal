/**
 */
package textVerduler.textVerduler.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import textVerduler.textVerduler.Cliente;
import textVerduler.textVerduler.EstadoDeuda;
import textVerduler.textVerduler.ModelCliente;
import textVerduler.textVerduler.TextVerdulerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Cliente</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link textVerduler.textVerduler.impl.ModelClienteImpl#getClientes <em>Clientes</em>}</li>
 *   <li>{@link textVerduler.textVerduler.impl.ModelClienteImpl#getEstadoDeDeuda <em>Estado De Deuda</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelClienteImpl extends MinimalEObjectImpl.Container implements ModelCliente
{
  /**
   * The cached value of the '{@link #getClientes() <em>Clientes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClientes()
   * @generated
   * @ordered
   */
  protected EList<Cliente> clientes;

  /**
   * The cached value of the '{@link #getEstadoDeDeuda() <em>Estado De Deuda</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEstadoDeDeuda()
   * @generated
   * @ordered
   */
  protected EstadoDeuda estadoDeDeuda;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelClienteImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TextVerdulerPackage.Literals.MODEL_CLIENTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Cliente> getClientes()
  {
    if (clientes == null)
    {
      clientes = new EObjectContainmentEList<Cliente>(Cliente.class, this, TextVerdulerPackage.MODEL_CLIENTE__CLIENTES);
    }
    return clientes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EstadoDeuda getEstadoDeDeuda()
  {
    return estadoDeDeuda;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEstadoDeDeuda(EstadoDeuda newEstadoDeDeuda, NotificationChain msgs)
  {
    EstadoDeuda oldEstadoDeDeuda = estadoDeDeuda;
    estadoDeDeuda = newEstadoDeDeuda;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextVerdulerPackage.MODEL_CLIENTE__ESTADO_DE_DEUDA, oldEstadoDeDeuda, newEstadoDeDeuda);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEstadoDeDeuda(EstadoDeuda newEstadoDeDeuda)
  {
    if (newEstadoDeDeuda != estadoDeDeuda)
    {
      NotificationChain msgs = null;
      if (estadoDeDeuda != null)
        msgs = ((InternalEObject)estadoDeDeuda).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextVerdulerPackage.MODEL_CLIENTE__ESTADO_DE_DEUDA, null, msgs);
      if (newEstadoDeDeuda != null)
        msgs = ((InternalEObject)newEstadoDeDeuda).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextVerdulerPackage.MODEL_CLIENTE__ESTADO_DE_DEUDA, null, msgs);
      msgs = basicSetEstadoDeDeuda(newEstadoDeDeuda, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextVerdulerPackage.MODEL_CLIENTE__ESTADO_DE_DEUDA, newEstadoDeDeuda, newEstadoDeDeuda));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TextVerdulerPackage.MODEL_CLIENTE__CLIENTES:
        return ((InternalEList<?>)getClientes()).basicRemove(otherEnd, msgs);
      case TextVerdulerPackage.MODEL_CLIENTE__ESTADO_DE_DEUDA:
        return basicSetEstadoDeDeuda(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TextVerdulerPackage.MODEL_CLIENTE__CLIENTES:
        return getClientes();
      case TextVerdulerPackage.MODEL_CLIENTE__ESTADO_DE_DEUDA:
        return getEstadoDeDeuda();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TextVerdulerPackage.MODEL_CLIENTE__CLIENTES:
        getClientes().clear();
        getClientes().addAll((Collection<? extends Cliente>)newValue);
        return;
      case TextVerdulerPackage.MODEL_CLIENTE__ESTADO_DE_DEUDA:
        setEstadoDeDeuda((EstadoDeuda)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TextVerdulerPackage.MODEL_CLIENTE__CLIENTES:
        getClientes().clear();
        return;
      case TextVerdulerPackage.MODEL_CLIENTE__ESTADO_DE_DEUDA:
        setEstadoDeDeuda((EstadoDeuda)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TextVerdulerPackage.MODEL_CLIENTE__CLIENTES:
        return clientes != null && !clientes.isEmpty();
      case TextVerdulerPackage.MODEL_CLIENTE__ESTADO_DE_DEUDA:
        return estadoDeDeuda != null;
    }
    return super.eIsSet(featureID);
  }

} //ModelClienteImpl
