/**
 */
package textVerduler.textVerduler.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import textVerduler.textVerduler.ModelVenta;
import textVerduler.textVerduler.TextVerdulerPackage;
import textVerduler.textVerduler.Venta;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Venta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link textVerduler.textVerduler.impl.ModelVentaImpl#getVenta <em>Venta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelVentaImpl extends MinimalEObjectImpl.Container implements ModelVenta
{
  /**
   * The cached value of the '{@link #getVenta() <em>Venta</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVenta()
   * @generated
   * @ordered
   */
  protected EList<Venta> venta;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelVentaImpl()
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
    return TextVerdulerPackage.Literals.MODEL_VENTA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Venta> getVenta()
  {
    if (venta == null)
    {
      venta = new EObjectContainmentEList<Venta>(Venta.class, this, TextVerdulerPackage.MODEL_VENTA__VENTA);
    }
    return venta;
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
      case TextVerdulerPackage.MODEL_VENTA__VENTA:
        return ((InternalEList<?>)getVenta()).basicRemove(otherEnd, msgs);
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
      case TextVerdulerPackage.MODEL_VENTA__VENTA:
        return getVenta();
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
      case TextVerdulerPackage.MODEL_VENTA__VENTA:
        getVenta().clear();
        getVenta().addAll((Collection<? extends Venta>)newValue);
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
      case TextVerdulerPackage.MODEL_VENTA__VENTA:
        getVenta().clear();
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
      case TextVerdulerPackage.MODEL_VENTA__VENTA:
        return venta != null && !venta.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelVentaImpl
