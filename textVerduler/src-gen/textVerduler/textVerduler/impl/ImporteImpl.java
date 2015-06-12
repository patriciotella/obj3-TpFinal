/**
 */
package textVerduler.textVerduler.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import textVerduler.textVerduler.Importe;
import textVerduler.textVerduler.Moneda;
import textVerduler.textVerduler.TextVerdulerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Importe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link textVerduler.textVerduler.impl.ImporteImpl#getValor <em>Valor</em>}</li>
 *   <li>{@link textVerduler.textVerduler.impl.ImporteImpl#getMoneda <em>Moneda</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImporteImpl extends EstadoDeudaImpl implements Importe
{
  /**
   * The default value of the '{@link #getValor() <em>Valor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValor()
   * @generated
   * @ordered
   */
  protected static final int VALOR_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValor() <em>Valor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValor()
   * @generated
   * @ordered
   */
  protected int valor = VALOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getMoneda() <em>Moneda</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMoneda()
   * @generated
   * @ordered
   */
  protected Moneda moneda;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImporteImpl()
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
    return TextVerdulerPackage.Literals.IMPORTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValor()
  {
    return valor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValor(int newValor)
  {
    int oldValor = valor;
    valor = newValor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextVerdulerPackage.IMPORTE__VALOR, oldValor, valor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Moneda getMoneda()
  {
    return moneda;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMoneda(Moneda newMoneda, NotificationChain msgs)
  {
    Moneda oldMoneda = moneda;
    moneda = newMoneda;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextVerdulerPackage.IMPORTE__MONEDA, oldMoneda, newMoneda);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMoneda(Moneda newMoneda)
  {
    if (newMoneda != moneda)
    {
      NotificationChain msgs = null;
      if (moneda != null)
        msgs = ((InternalEObject)moneda).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextVerdulerPackage.IMPORTE__MONEDA, null, msgs);
      if (newMoneda != null)
        msgs = ((InternalEObject)newMoneda).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextVerdulerPackage.IMPORTE__MONEDA, null, msgs);
      msgs = basicSetMoneda(newMoneda, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextVerdulerPackage.IMPORTE__MONEDA, newMoneda, newMoneda));
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
      case TextVerdulerPackage.IMPORTE__MONEDA:
        return basicSetMoneda(null, msgs);
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
      case TextVerdulerPackage.IMPORTE__VALOR:
        return getValor();
      case TextVerdulerPackage.IMPORTE__MONEDA:
        return getMoneda();
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
      case TextVerdulerPackage.IMPORTE__VALOR:
        setValor((Integer)newValue);
        return;
      case TextVerdulerPackage.IMPORTE__MONEDA:
        setMoneda((Moneda)newValue);
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
      case TextVerdulerPackage.IMPORTE__VALOR:
        setValor(VALOR_EDEFAULT);
        return;
      case TextVerdulerPackage.IMPORTE__MONEDA:
        setMoneda((Moneda)null);
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
      case TextVerdulerPackage.IMPORTE__VALOR:
        return valor != VALOR_EDEFAULT;
      case TextVerdulerPackage.IMPORTE__MONEDA:
        return moneda != null;
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
    result.append(" (valor: ");
    result.append(valor);
    result.append(')');
    return result.toString();
  }

} //ImporteImpl
