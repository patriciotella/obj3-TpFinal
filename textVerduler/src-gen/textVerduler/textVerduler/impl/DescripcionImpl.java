/**
 */
package textVerduler.textVerduler.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import textVerduler.textVerduler.Cantidad;
import textVerduler.textVerduler.Descripcion;
import textVerduler.textVerduler.Importe;
import textVerduler.textVerduler.TextVerdulerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Descripcion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link textVerduler.textVerduler.impl.DescripcionImpl#getUnImporte <em>Un Importe</em>}</li>
 *   <li>{@link textVerduler.textVerduler.impl.DescripcionImpl#getUnaCantidad <em>Una Cantidad</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DescripcionImpl extends MinimalEObjectImpl.Container implements Descripcion
{
  /**
   * The cached value of the '{@link #getUnImporte() <em>Un Importe</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnImporte()
   * @generated
   * @ordered
   */
  protected Importe unImporte;

  /**
   * The cached value of the '{@link #getUnaCantidad() <em>Una Cantidad</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnaCantidad()
   * @generated
   * @ordered
   */
  protected Cantidad unaCantidad;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DescripcionImpl()
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
    return TextVerdulerPackage.Literals.DESCRIPCION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Importe getUnImporte()
  {
    return unImporte;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnImporte(Importe newUnImporte, NotificationChain msgs)
  {
    Importe oldUnImporte = unImporte;
    unImporte = newUnImporte;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextVerdulerPackage.DESCRIPCION__UN_IMPORTE, oldUnImporte, newUnImporte);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnImporte(Importe newUnImporte)
  {
    if (newUnImporte != unImporte)
    {
      NotificationChain msgs = null;
      if (unImporte != null)
        msgs = ((InternalEObject)unImporte).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextVerdulerPackage.DESCRIPCION__UN_IMPORTE, null, msgs);
      if (newUnImporte != null)
        msgs = ((InternalEObject)newUnImporte).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextVerdulerPackage.DESCRIPCION__UN_IMPORTE, null, msgs);
      msgs = basicSetUnImporte(newUnImporte, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextVerdulerPackage.DESCRIPCION__UN_IMPORTE, newUnImporte, newUnImporte));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cantidad getUnaCantidad()
  {
    return unaCantidad;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnaCantidad(Cantidad newUnaCantidad, NotificationChain msgs)
  {
    Cantidad oldUnaCantidad = unaCantidad;
    unaCantidad = newUnaCantidad;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextVerdulerPackage.DESCRIPCION__UNA_CANTIDAD, oldUnaCantidad, newUnaCantidad);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnaCantidad(Cantidad newUnaCantidad)
  {
    if (newUnaCantidad != unaCantidad)
    {
      NotificationChain msgs = null;
      if (unaCantidad != null)
        msgs = ((InternalEObject)unaCantidad).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextVerdulerPackage.DESCRIPCION__UNA_CANTIDAD, null, msgs);
      if (newUnaCantidad != null)
        msgs = ((InternalEObject)newUnaCantidad).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextVerdulerPackage.DESCRIPCION__UNA_CANTIDAD, null, msgs);
      msgs = basicSetUnaCantidad(newUnaCantidad, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextVerdulerPackage.DESCRIPCION__UNA_CANTIDAD, newUnaCantidad, newUnaCantidad));
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
      case TextVerdulerPackage.DESCRIPCION__UN_IMPORTE:
        return basicSetUnImporte(null, msgs);
      case TextVerdulerPackage.DESCRIPCION__UNA_CANTIDAD:
        return basicSetUnaCantidad(null, msgs);
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
      case TextVerdulerPackage.DESCRIPCION__UN_IMPORTE:
        return getUnImporte();
      case TextVerdulerPackage.DESCRIPCION__UNA_CANTIDAD:
        return getUnaCantidad();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TextVerdulerPackage.DESCRIPCION__UN_IMPORTE:
        setUnImporte((Importe)newValue);
        return;
      case TextVerdulerPackage.DESCRIPCION__UNA_CANTIDAD:
        setUnaCantidad((Cantidad)newValue);
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
      case TextVerdulerPackage.DESCRIPCION__UN_IMPORTE:
        setUnImporte((Importe)null);
        return;
      case TextVerdulerPackage.DESCRIPCION__UNA_CANTIDAD:
        setUnaCantidad((Cantidad)null);
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
      case TextVerdulerPackage.DESCRIPCION__UN_IMPORTE:
        return unImporte != null;
      case TextVerdulerPackage.DESCRIPCION__UNA_CANTIDAD:
        return unaCantidad != null;
    }
    return super.eIsSet(featureID);
  }

} //DescripcionImpl
