/**
 */
package textVerduler.textVerduler.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import textVerduler.textVerduler.TextVerdulerPackage;
import textVerduler.textVerduler.Unidad;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unidad</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link textVerduler.textVerduler.impl.UnidadImpl#getUnaUnidad <em>Una Unidad</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnidadImpl extends MinimalEObjectImpl.Container implements Unidad
{
  /**
   * The default value of the '{@link #getUnaUnidad() <em>Una Unidad</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnaUnidad()
   * @generated
   * @ordered
   */
  protected static final String UNA_UNIDAD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUnaUnidad() <em>Una Unidad</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnaUnidad()
   * @generated
   * @ordered
   */
  protected String unaUnidad = UNA_UNIDAD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnidadImpl()
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
    return TextVerdulerPackage.Literals.UNIDAD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUnaUnidad()
  {
    return unaUnidad;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnaUnidad(String newUnaUnidad)
  {
    String oldUnaUnidad = unaUnidad;
    unaUnidad = newUnaUnidad;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextVerdulerPackage.UNIDAD__UNA_UNIDAD, oldUnaUnidad, unaUnidad));
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
      case TextVerdulerPackage.UNIDAD__UNA_UNIDAD:
        return getUnaUnidad();
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
      case TextVerdulerPackage.UNIDAD__UNA_UNIDAD:
        setUnaUnidad((String)newValue);
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
      case TextVerdulerPackage.UNIDAD__UNA_UNIDAD:
        setUnaUnidad(UNA_UNIDAD_EDEFAULT);
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
      case TextVerdulerPackage.UNIDAD__UNA_UNIDAD:
        return UNA_UNIDAD_EDEFAULT == null ? unaUnidad != null : !UNA_UNIDAD_EDEFAULT.equals(unaUnidad);
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
    result.append(" (unaUnidad: ");
    result.append(unaUnidad);
    result.append(')');
    return result.toString();
  }

} //UnidadImpl
