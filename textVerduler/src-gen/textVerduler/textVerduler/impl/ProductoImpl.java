/**
 */
package textVerduler.textVerduler.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import textVerduler.textVerduler.Producto;
import textVerduler.textVerduler.TextVerdulerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Producto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link textVerduler.textVerduler.impl.ProductoImpl#getNombreDeProducto <em>Nombre De Producto</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductoImpl extends MinimalEObjectImpl.Container implements Producto
{
  /**
   * The default value of the '{@link #getNombreDeProducto() <em>Nombre De Producto</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNombreDeProducto()
   * @generated
   * @ordered
   */
  protected static final String NOMBRE_DE_PRODUCTO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNombreDeProducto() <em>Nombre De Producto</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNombreDeProducto()
   * @generated
   * @ordered
   */
  protected String nombreDeProducto = NOMBRE_DE_PRODUCTO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProductoImpl()
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
    return TextVerdulerPackage.Literals.PRODUCTO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNombreDeProducto()
  {
    return nombreDeProducto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNombreDeProducto(String newNombreDeProducto)
  {
    String oldNombreDeProducto = nombreDeProducto;
    nombreDeProducto = newNombreDeProducto;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextVerdulerPackage.PRODUCTO__NOMBRE_DE_PRODUCTO, oldNombreDeProducto, nombreDeProducto));
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
      case TextVerdulerPackage.PRODUCTO__NOMBRE_DE_PRODUCTO:
        return getNombreDeProducto();
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
      case TextVerdulerPackage.PRODUCTO__NOMBRE_DE_PRODUCTO:
        setNombreDeProducto((String)newValue);
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
      case TextVerdulerPackage.PRODUCTO__NOMBRE_DE_PRODUCTO:
        setNombreDeProducto(NOMBRE_DE_PRODUCTO_EDEFAULT);
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
      case TextVerdulerPackage.PRODUCTO__NOMBRE_DE_PRODUCTO:
        return NOMBRE_DE_PRODUCTO_EDEFAULT == null ? nombreDeProducto != null : !NOMBRE_DE_PRODUCTO_EDEFAULT.equals(nombreDeProducto);
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
    result.append(" (nombreDeProducto: ");
    result.append(nombreDeProducto);
    result.append(')');
    return result.toString();
  }

} //ProductoImpl
