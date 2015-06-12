/**
 */
package textVerduler.textVerduler.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import textVerduler.textVerduler.Descripcion;
import textVerduler.textVerduler.TextVerdulerPackage;
import textVerduler.textVerduler.ValorDelProducto;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Valor Del Producto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link textVerduler.textVerduler.impl.ValorDelProductoImpl#getUnaDescripcion <em>Una Descripcion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValorDelProductoImpl extends MinimalEObjectImpl.Container implements ValorDelProducto
{
  /**
   * The cached value of the '{@link #getUnaDescripcion() <em>Una Descripcion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnaDescripcion()
   * @generated
   * @ordered
   */
  protected Descripcion unaDescripcion;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ValorDelProductoImpl()
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
    return TextVerdulerPackage.Literals.VALOR_DEL_PRODUCTO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Descripcion getUnaDescripcion()
  {
    return unaDescripcion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnaDescripcion(Descripcion newUnaDescripcion, NotificationChain msgs)
  {
    Descripcion oldUnaDescripcion = unaDescripcion;
    unaDescripcion = newUnaDescripcion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextVerdulerPackage.VALOR_DEL_PRODUCTO__UNA_DESCRIPCION, oldUnaDescripcion, newUnaDescripcion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnaDescripcion(Descripcion newUnaDescripcion)
  {
    if (newUnaDescripcion != unaDescripcion)
    {
      NotificationChain msgs = null;
      if (unaDescripcion != null)
        msgs = ((InternalEObject)unaDescripcion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextVerdulerPackage.VALOR_DEL_PRODUCTO__UNA_DESCRIPCION, null, msgs);
      if (newUnaDescripcion != null)
        msgs = ((InternalEObject)newUnaDescripcion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextVerdulerPackage.VALOR_DEL_PRODUCTO__UNA_DESCRIPCION, null, msgs);
      msgs = basicSetUnaDescripcion(newUnaDescripcion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextVerdulerPackage.VALOR_DEL_PRODUCTO__UNA_DESCRIPCION, newUnaDescripcion, newUnaDescripcion));
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
      case TextVerdulerPackage.VALOR_DEL_PRODUCTO__UNA_DESCRIPCION:
        return basicSetUnaDescripcion(null, msgs);
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
      case TextVerdulerPackage.VALOR_DEL_PRODUCTO__UNA_DESCRIPCION:
        return getUnaDescripcion();
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
      case TextVerdulerPackage.VALOR_DEL_PRODUCTO__UNA_DESCRIPCION:
        setUnaDescripcion((Descripcion)newValue);
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
      case TextVerdulerPackage.VALOR_DEL_PRODUCTO__UNA_DESCRIPCION:
        setUnaDescripcion((Descripcion)null);
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
      case TextVerdulerPackage.VALOR_DEL_PRODUCTO__UNA_DESCRIPCION:
        return unaDescripcion != null;
    }
    return super.eIsSet(featureID);
  }

} //ValorDelProductoImpl
