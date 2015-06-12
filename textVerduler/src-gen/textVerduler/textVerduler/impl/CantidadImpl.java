/**
 */
package textVerduler.textVerduler.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import textVerduler.textVerduler.Articulo;
import textVerduler.textVerduler.Cantidad;
import textVerduler.textVerduler.TextVerdulerPackage;
import textVerduler.textVerduler.Unidad;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cantidad</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link textVerduler.textVerduler.impl.CantidadImpl#getUnArticulo <em>Un Articulo</em>}</li>
 *   <li>{@link textVerduler.textVerduler.impl.CantidadImpl#getUnValor <em>Un Valor</em>}</li>
 *   <li>{@link textVerduler.textVerduler.impl.CantidadImpl#getUnaCantidad <em>Una Cantidad</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CantidadImpl extends MinimalEObjectImpl.Container implements Cantidad
{
  /**
   * The cached value of the '{@link #getUnArticulo() <em>Un Articulo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnArticulo()
   * @generated
   * @ordered
   */
  protected Articulo unArticulo;

  /**
   * The default value of the '{@link #getUnValor() <em>Un Valor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnValor()
   * @generated
   * @ordered
   */
  protected static final int UN_VALOR_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getUnValor() <em>Un Valor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnValor()
   * @generated
   * @ordered
   */
  protected int unValor = UN_VALOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getUnaCantidad() <em>Una Cantidad</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnaCantidad()
   * @generated
   * @ordered
   */
  protected Unidad unaCantidad;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CantidadImpl()
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
    return TextVerdulerPackage.Literals.CANTIDAD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Articulo getUnArticulo()
  {
    return unArticulo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnArticulo(Articulo newUnArticulo, NotificationChain msgs)
  {
    Articulo oldUnArticulo = unArticulo;
    unArticulo = newUnArticulo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextVerdulerPackage.CANTIDAD__UN_ARTICULO, oldUnArticulo, newUnArticulo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnArticulo(Articulo newUnArticulo)
  {
    if (newUnArticulo != unArticulo)
    {
      NotificationChain msgs = null;
      if (unArticulo != null)
        msgs = ((InternalEObject)unArticulo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextVerdulerPackage.CANTIDAD__UN_ARTICULO, null, msgs);
      if (newUnArticulo != null)
        msgs = ((InternalEObject)newUnArticulo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextVerdulerPackage.CANTIDAD__UN_ARTICULO, null, msgs);
      msgs = basicSetUnArticulo(newUnArticulo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextVerdulerPackage.CANTIDAD__UN_ARTICULO, newUnArticulo, newUnArticulo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getUnValor()
  {
    return unValor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnValor(int newUnValor)
  {
    int oldUnValor = unValor;
    unValor = newUnValor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextVerdulerPackage.CANTIDAD__UN_VALOR, oldUnValor, unValor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Unidad getUnaCantidad()
  {
    return unaCantidad;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnaCantidad(Unidad newUnaCantidad, NotificationChain msgs)
  {
    Unidad oldUnaCantidad = unaCantidad;
    unaCantidad = newUnaCantidad;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextVerdulerPackage.CANTIDAD__UNA_CANTIDAD, oldUnaCantidad, newUnaCantidad);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnaCantidad(Unidad newUnaCantidad)
  {
    if (newUnaCantidad != unaCantidad)
    {
      NotificationChain msgs = null;
      if (unaCantidad != null)
        msgs = ((InternalEObject)unaCantidad).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextVerdulerPackage.CANTIDAD__UNA_CANTIDAD, null, msgs);
      if (newUnaCantidad != null)
        msgs = ((InternalEObject)newUnaCantidad).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextVerdulerPackage.CANTIDAD__UNA_CANTIDAD, null, msgs);
      msgs = basicSetUnaCantidad(newUnaCantidad, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextVerdulerPackage.CANTIDAD__UNA_CANTIDAD, newUnaCantidad, newUnaCantidad));
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
      case TextVerdulerPackage.CANTIDAD__UN_ARTICULO:
        return basicSetUnArticulo(null, msgs);
      case TextVerdulerPackage.CANTIDAD__UNA_CANTIDAD:
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
      case TextVerdulerPackage.CANTIDAD__UN_ARTICULO:
        return getUnArticulo();
      case TextVerdulerPackage.CANTIDAD__UN_VALOR:
        return getUnValor();
      case TextVerdulerPackage.CANTIDAD__UNA_CANTIDAD:
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
      case TextVerdulerPackage.CANTIDAD__UN_ARTICULO:
        setUnArticulo((Articulo)newValue);
        return;
      case TextVerdulerPackage.CANTIDAD__UN_VALOR:
        setUnValor((Integer)newValue);
        return;
      case TextVerdulerPackage.CANTIDAD__UNA_CANTIDAD:
        setUnaCantidad((Unidad)newValue);
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
      case TextVerdulerPackage.CANTIDAD__UN_ARTICULO:
        setUnArticulo((Articulo)null);
        return;
      case TextVerdulerPackage.CANTIDAD__UN_VALOR:
        setUnValor(UN_VALOR_EDEFAULT);
        return;
      case TextVerdulerPackage.CANTIDAD__UNA_CANTIDAD:
        setUnaCantidad((Unidad)null);
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
      case TextVerdulerPackage.CANTIDAD__UN_ARTICULO:
        return unArticulo != null;
      case TextVerdulerPackage.CANTIDAD__UN_VALOR:
        return unValor != UN_VALOR_EDEFAULT;
      case TextVerdulerPackage.CANTIDAD__UNA_CANTIDAD:
        return unaCantidad != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (unValor: ");
    result.append(unValor);
    result.append(')');
    return result.toString();
  }

} //CantidadImpl
