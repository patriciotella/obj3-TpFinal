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
import textVerduler.textVerduler.Mercaderia;
import textVerduler.textVerduler.TextVerdulerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mercaderia</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link textVerduler.textVerduler.impl.MercaderiaImpl#getUnaDescripcion <em>Una Descripcion</em>}</li>
 *   <li>{@link textVerduler.textVerduler.impl.MercaderiaImpl#getNombreDeProducto <em>Nombre De Producto</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MercaderiaImpl extends MinimalEObjectImpl.Container implements Mercaderia
{
  /**
   * The cached value of the '{@link #getUnaDescripcion() <em>Una Descripcion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnaDescripcion()
   * @generated
   * @ordered
   */
  protected Cantidad unaDescripcion;

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
  protected MercaderiaImpl()
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
    return TextVerdulerPackage.Literals.MERCADERIA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cantidad getUnaDescripcion()
  {
    return unaDescripcion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnaDescripcion(Cantidad newUnaDescripcion, NotificationChain msgs)
  {
    Cantidad oldUnaDescripcion = unaDescripcion;
    unaDescripcion = newUnaDescripcion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextVerdulerPackage.MERCADERIA__UNA_DESCRIPCION, oldUnaDescripcion, newUnaDescripcion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnaDescripcion(Cantidad newUnaDescripcion)
  {
    if (newUnaDescripcion != unaDescripcion)
    {
      NotificationChain msgs = null;
      if (unaDescripcion != null)
        msgs = ((InternalEObject)unaDescripcion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextVerdulerPackage.MERCADERIA__UNA_DESCRIPCION, null, msgs);
      if (newUnaDescripcion != null)
        msgs = ((InternalEObject)newUnaDescripcion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextVerdulerPackage.MERCADERIA__UNA_DESCRIPCION, null, msgs);
      msgs = basicSetUnaDescripcion(newUnaDescripcion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextVerdulerPackage.MERCADERIA__UNA_DESCRIPCION, newUnaDescripcion, newUnaDescripcion));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TextVerdulerPackage.MERCADERIA__NOMBRE_DE_PRODUCTO, oldNombreDeProducto, nombreDeProducto));
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
      case TextVerdulerPackage.MERCADERIA__UNA_DESCRIPCION:
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
      case TextVerdulerPackage.MERCADERIA__UNA_DESCRIPCION:
        return getUnaDescripcion();
      case TextVerdulerPackage.MERCADERIA__NOMBRE_DE_PRODUCTO:
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
      case TextVerdulerPackage.MERCADERIA__UNA_DESCRIPCION:
        setUnaDescripcion((Cantidad)newValue);
        return;
      case TextVerdulerPackage.MERCADERIA__NOMBRE_DE_PRODUCTO:
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
      case TextVerdulerPackage.MERCADERIA__UNA_DESCRIPCION:
        setUnaDescripcion((Cantidad)null);
        return;
      case TextVerdulerPackage.MERCADERIA__NOMBRE_DE_PRODUCTO:
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
      case TextVerdulerPackage.MERCADERIA__UNA_DESCRIPCION:
        return unaDescripcion != null;
      case TextVerdulerPackage.MERCADERIA__NOMBRE_DE_PRODUCTO:
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

} //MercaderiaImpl
