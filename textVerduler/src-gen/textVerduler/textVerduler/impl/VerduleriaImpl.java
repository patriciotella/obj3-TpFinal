/**
 */
package textVerduler.textVerduler.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import textVerduler.textVerduler.TextVerdulerPackage;
import textVerduler.textVerduler.Verduleria;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verduleria</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link textVerduler.textVerduler.impl.VerduleriaImpl#getAnotaciones <em>Anotaciones</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerduleriaImpl extends MinimalEObjectImpl.Container implements Verduleria
{
  /**
   * The cached value of the '{@link #getAnotaciones() <em>Anotaciones</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnotaciones()
   * @generated
   * @ordered
   */
  protected EList<EObject> anotaciones;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VerduleriaImpl()
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
    return TextVerdulerPackage.Literals.VERDULERIA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getAnotaciones()
  {
    if (anotaciones == null)
    {
      anotaciones = new EObjectContainmentEList<EObject>(EObject.class, this, TextVerdulerPackage.VERDULERIA__ANOTACIONES);
    }
    return anotaciones;
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
      case TextVerdulerPackage.VERDULERIA__ANOTACIONES:
        return ((InternalEList<?>)getAnotaciones()).basicRemove(otherEnd, msgs);
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
      case TextVerdulerPackage.VERDULERIA__ANOTACIONES:
        return getAnotaciones();
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
      case TextVerdulerPackage.VERDULERIA__ANOTACIONES:
        getAnotaciones().clear();
        getAnotaciones().addAll((Collection<? extends EObject>)newValue);
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
      case TextVerdulerPackage.VERDULERIA__ANOTACIONES:
        getAnotaciones().clear();
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
      case TextVerdulerPackage.VERDULERIA__ANOTACIONES:
        return anotaciones != null && !anotaciones.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //VerduleriaImpl
