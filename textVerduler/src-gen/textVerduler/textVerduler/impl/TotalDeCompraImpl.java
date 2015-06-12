/**
 */
package textVerduler.textVerduler.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import textVerduler.textVerduler.Importe;
import textVerduler.textVerduler.TextVerdulerPackage;
import textVerduler.textVerduler.TotalDeCompra;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Total De Compra</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link textVerduler.textVerduler.impl.TotalDeCompraImpl#getUnTotal <em>Un Total</em>}</li>
 *   <li>{@link textVerduler.textVerduler.impl.TotalDeCompraImpl#getUnImporteTotal <em>Un Importe Total</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TotalDeCompraImpl extends MinimalEObjectImpl.Container implements TotalDeCompra
{
  /**
   * The default value of the '{@link #getUnTotal() <em>Un Total</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnTotal()
   * @generated
   * @ordered
   */
  protected static final String UN_TOTAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUnTotal() <em>Un Total</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnTotal()
   * @generated
   * @ordered
   */
  protected String unTotal = UN_TOTAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getUnImporteTotal() <em>Un Importe Total</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnImporteTotal()
   * @generated
   * @ordered
   */
  protected Importe unImporteTotal;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TotalDeCompraImpl()
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
    return TextVerdulerPackage.Literals.TOTAL_DE_COMPRA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUnTotal()
  {
    return unTotal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnTotal(String newUnTotal)
  {
    String oldUnTotal = unTotal;
    unTotal = newUnTotal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextVerdulerPackage.TOTAL_DE_COMPRA__UN_TOTAL, oldUnTotal, unTotal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Importe getUnImporteTotal()
  {
    return unImporteTotal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnImporteTotal(Importe newUnImporteTotal, NotificationChain msgs)
  {
    Importe oldUnImporteTotal = unImporteTotal;
    unImporteTotal = newUnImporteTotal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextVerdulerPackage.TOTAL_DE_COMPRA__UN_IMPORTE_TOTAL, oldUnImporteTotal, newUnImporteTotal);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnImporteTotal(Importe newUnImporteTotal)
  {
    if (newUnImporteTotal != unImporteTotal)
    {
      NotificationChain msgs = null;
      if (unImporteTotal != null)
        msgs = ((InternalEObject)unImporteTotal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextVerdulerPackage.TOTAL_DE_COMPRA__UN_IMPORTE_TOTAL, null, msgs);
      if (newUnImporteTotal != null)
        msgs = ((InternalEObject)newUnImporteTotal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextVerdulerPackage.TOTAL_DE_COMPRA__UN_IMPORTE_TOTAL, null, msgs);
      msgs = basicSetUnImporteTotal(newUnImporteTotal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextVerdulerPackage.TOTAL_DE_COMPRA__UN_IMPORTE_TOTAL, newUnImporteTotal, newUnImporteTotal));
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
      case TextVerdulerPackage.TOTAL_DE_COMPRA__UN_IMPORTE_TOTAL:
        return basicSetUnImporteTotal(null, msgs);
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
      case TextVerdulerPackage.TOTAL_DE_COMPRA__UN_TOTAL:
        return getUnTotal();
      case TextVerdulerPackage.TOTAL_DE_COMPRA__UN_IMPORTE_TOTAL:
        return getUnImporteTotal();
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
      case TextVerdulerPackage.TOTAL_DE_COMPRA__UN_TOTAL:
        setUnTotal((String)newValue);
        return;
      case TextVerdulerPackage.TOTAL_DE_COMPRA__UN_IMPORTE_TOTAL:
        setUnImporteTotal((Importe)newValue);
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
      case TextVerdulerPackage.TOTAL_DE_COMPRA__UN_TOTAL:
        setUnTotal(UN_TOTAL_EDEFAULT);
        return;
      case TextVerdulerPackage.TOTAL_DE_COMPRA__UN_IMPORTE_TOTAL:
        setUnImporteTotal((Importe)null);
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
      case TextVerdulerPackage.TOTAL_DE_COMPRA__UN_TOTAL:
        return UN_TOTAL_EDEFAULT == null ? unTotal != null : !UN_TOTAL_EDEFAULT.equals(unTotal);
      case TextVerdulerPackage.TOTAL_DE_COMPRA__UN_IMPORTE_TOTAL:
        return unImporteTotal != null;
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
    result.append(" (unTotal: ");
    result.append(unTotal);
    result.append(')');
    return result.toString();
  }

} //TotalDeCompraImpl
