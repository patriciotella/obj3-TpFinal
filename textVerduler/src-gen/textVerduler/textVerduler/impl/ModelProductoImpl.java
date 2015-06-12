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

import textVerduler.textVerduler.ModelProducto;
import textVerduler.textVerduler.Producto;
import textVerduler.textVerduler.TextVerdulerPackage;
import textVerduler.textVerduler.ValorDelProducto;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Producto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link textVerduler.textVerduler.impl.ModelProductoImpl#getProductos <em>Productos</em>}</li>
 *   <li>{@link textVerduler.textVerduler.impl.ModelProductoImpl#getValor <em>Valor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelProductoImpl extends MinimalEObjectImpl.Container implements ModelProducto
{
  /**
   * The cached value of the '{@link #getProductos() <em>Productos</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProductos()
   * @generated
   * @ordered
   */
  protected EList<Producto> productos;

  /**
   * The cached value of the '{@link #getValor() <em>Valor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValor()
   * @generated
   * @ordered
   */
  protected ValorDelProducto valor;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelProductoImpl()
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
    return TextVerdulerPackage.Literals.MODEL_PRODUCTO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Producto> getProductos()
  {
    if (productos == null)
    {
      productos = new EObjectContainmentEList<Producto>(Producto.class, this, TextVerdulerPackage.MODEL_PRODUCTO__PRODUCTOS);
    }
    return productos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValorDelProducto getValor()
  {
    return valor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValor(ValorDelProducto newValor, NotificationChain msgs)
  {
    ValorDelProducto oldValor = valor;
    valor = newValor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextVerdulerPackage.MODEL_PRODUCTO__VALOR, oldValor, newValor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValor(ValorDelProducto newValor)
  {
    if (newValor != valor)
    {
      NotificationChain msgs = null;
      if (valor != null)
        msgs = ((InternalEObject)valor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextVerdulerPackage.MODEL_PRODUCTO__VALOR, null, msgs);
      if (newValor != null)
        msgs = ((InternalEObject)newValor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextVerdulerPackage.MODEL_PRODUCTO__VALOR, null, msgs);
      msgs = basicSetValor(newValor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextVerdulerPackage.MODEL_PRODUCTO__VALOR, newValor, newValor));
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
      case TextVerdulerPackage.MODEL_PRODUCTO__PRODUCTOS:
        return ((InternalEList<?>)getProductos()).basicRemove(otherEnd, msgs);
      case TextVerdulerPackage.MODEL_PRODUCTO__VALOR:
        return basicSetValor(null, msgs);
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
      case TextVerdulerPackage.MODEL_PRODUCTO__PRODUCTOS:
        return getProductos();
      case TextVerdulerPackage.MODEL_PRODUCTO__VALOR:
        return getValor();
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
      case TextVerdulerPackage.MODEL_PRODUCTO__PRODUCTOS:
        getProductos().clear();
        getProductos().addAll((Collection<? extends Producto>)newValue);
        return;
      case TextVerdulerPackage.MODEL_PRODUCTO__VALOR:
        setValor((ValorDelProducto)newValue);
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
      case TextVerdulerPackage.MODEL_PRODUCTO__PRODUCTOS:
        getProductos().clear();
        return;
      case TextVerdulerPackage.MODEL_PRODUCTO__VALOR:
        setValor((ValorDelProducto)null);
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
      case TextVerdulerPackage.MODEL_PRODUCTO__PRODUCTOS:
        return productos != null && !productos.isEmpty();
      case TextVerdulerPackage.MODEL_PRODUCTO__VALOR:
        return valor != null;
    }
    return super.eIsSet(featureID);
  }

} //ModelProductoImpl
