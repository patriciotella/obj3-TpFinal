/**
 */
package textVerduler.textVerduler.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import textVerduler.textVerduler.Articulo;
import textVerduler.textVerduler.TextVerdulerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Articulo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link textVerduler.textVerduler.impl.ArticuloImpl#getUnArticulo <em>Un Articulo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArticuloImpl extends MinimalEObjectImpl.Container implements Articulo
{
  /**
   * The default value of the '{@link #getUnArticulo() <em>Un Articulo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnArticulo()
   * @generated
   * @ordered
   */
  protected static final String UN_ARTICULO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUnArticulo() <em>Un Articulo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnArticulo()
   * @generated
   * @ordered
   */
  protected String unArticulo = UN_ARTICULO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArticuloImpl()
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
    return TextVerdulerPackage.Literals.ARTICULO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUnArticulo()
  {
    return unArticulo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnArticulo(String newUnArticulo)
  {
    String oldUnArticulo = unArticulo;
    unArticulo = newUnArticulo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextVerdulerPackage.ARTICULO__UN_ARTICULO, oldUnArticulo, unArticulo));
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
      case TextVerdulerPackage.ARTICULO__UN_ARTICULO:
        return getUnArticulo();
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
      case TextVerdulerPackage.ARTICULO__UN_ARTICULO:
        setUnArticulo((String)newValue);
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
      case TextVerdulerPackage.ARTICULO__UN_ARTICULO:
        setUnArticulo(UN_ARTICULO_EDEFAULT);
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
      case TextVerdulerPackage.ARTICULO__UN_ARTICULO:
        return UN_ARTICULO_EDEFAULT == null ? unArticulo != null : !UN_ARTICULO_EDEFAULT.equals(unArticulo);
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
    result.append(" (unArticulo: ");
    result.append(unArticulo);
    result.append(')');
    return result.toString();
  }

} //ArticuloImpl
