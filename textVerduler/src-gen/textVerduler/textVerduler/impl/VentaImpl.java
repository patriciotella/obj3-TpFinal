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
import textVerduler.textVerduler.Mercaderia;
import textVerduler.textVerduler.TextVerdulerPackage;
import textVerduler.textVerduler.TotalDeCompra;
import textVerduler.textVerduler.Venta;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Venta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link textVerduler.textVerduler.impl.VentaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link textVerduler.textVerduler.impl.VentaImpl#getUnaListaDeCompras <em>Una Lista De Compras</em>}</li>
 *   <li>{@link textVerduler.textVerduler.impl.VentaImpl#getUnImporte <em>Un Importe</em>}</li>
 *   <li>{@link textVerduler.textVerduler.impl.VentaImpl#getUnTotal <em>Un Total</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VentaImpl extends MinimalEObjectImpl.Container implements Venta
{
  /**
   * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNombre()
   * @generated
   * @ordered
   */
  protected static final String NOMBRE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNombre()
   * @generated
   * @ordered
   */
  protected String nombre = NOMBRE_EDEFAULT;

  /**
   * The cached value of the '{@link #getUnaListaDeCompras() <em>Una Lista De Compras</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnaListaDeCompras()
   * @generated
   * @ordered
   */
  protected Mercaderia unaListaDeCompras;

  /**
   * The cached value of the '{@link #getUnImporte() <em>Un Importe</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnImporte()
   * @generated
   * @ordered
   */
  protected Importe unImporte;

  /**
   * The cached value of the '{@link #getUnTotal() <em>Un Total</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnTotal()
   * @generated
   * @ordered
   */
  protected TotalDeCompra unTotal;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VentaImpl()
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
    return TextVerdulerPackage.Literals.VENTA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNombre()
  {
    return nombre;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNombre(String newNombre)
  {
    String oldNombre = nombre;
    nombre = newNombre;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextVerdulerPackage.VENTA__NOMBRE, oldNombre, nombre));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mercaderia getUnaListaDeCompras()
  {
    return unaListaDeCompras;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnaListaDeCompras(Mercaderia newUnaListaDeCompras, NotificationChain msgs)
  {
    Mercaderia oldUnaListaDeCompras = unaListaDeCompras;
    unaListaDeCompras = newUnaListaDeCompras;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextVerdulerPackage.VENTA__UNA_LISTA_DE_COMPRAS, oldUnaListaDeCompras, newUnaListaDeCompras);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnaListaDeCompras(Mercaderia newUnaListaDeCompras)
  {
    if (newUnaListaDeCompras != unaListaDeCompras)
    {
      NotificationChain msgs = null;
      if (unaListaDeCompras != null)
        msgs = ((InternalEObject)unaListaDeCompras).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextVerdulerPackage.VENTA__UNA_LISTA_DE_COMPRAS, null, msgs);
      if (newUnaListaDeCompras != null)
        msgs = ((InternalEObject)newUnaListaDeCompras).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextVerdulerPackage.VENTA__UNA_LISTA_DE_COMPRAS, null, msgs);
      msgs = basicSetUnaListaDeCompras(newUnaListaDeCompras, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextVerdulerPackage.VENTA__UNA_LISTA_DE_COMPRAS, newUnaListaDeCompras, newUnaListaDeCompras));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Importe getUnImporte()
  {
    return unImporte;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnImporte(Importe newUnImporte, NotificationChain msgs)
  {
    Importe oldUnImporte = unImporte;
    unImporte = newUnImporte;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextVerdulerPackage.VENTA__UN_IMPORTE, oldUnImporte, newUnImporte);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnImporte(Importe newUnImporte)
  {
    if (newUnImporte != unImporte)
    {
      NotificationChain msgs = null;
      if (unImporte != null)
        msgs = ((InternalEObject)unImporte).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextVerdulerPackage.VENTA__UN_IMPORTE, null, msgs);
      if (newUnImporte != null)
        msgs = ((InternalEObject)newUnImporte).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextVerdulerPackage.VENTA__UN_IMPORTE, null, msgs);
      msgs = basicSetUnImporte(newUnImporte, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextVerdulerPackage.VENTA__UN_IMPORTE, newUnImporte, newUnImporte));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TotalDeCompra getUnTotal()
  {
    return unTotal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnTotal(TotalDeCompra newUnTotal, NotificationChain msgs)
  {
    TotalDeCompra oldUnTotal = unTotal;
    unTotal = newUnTotal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextVerdulerPackage.VENTA__UN_TOTAL, oldUnTotal, newUnTotal);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnTotal(TotalDeCompra newUnTotal)
  {
    if (newUnTotal != unTotal)
    {
      NotificationChain msgs = null;
      if (unTotal != null)
        msgs = ((InternalEObject)unTotal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextVerdulerPackage.VENTA__UN_TOTAL, null, msgs);
      if (newUnTotal != null)
        msgs = ((InternalEObject)newUnTotal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextVerdulerPackage.VENTA__UN_TOTAL, null, msgs);
      msgs = basicSetUnTotal(newUnTotal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TextVerdulerPackage.VENTA__UN_TOTAL, newUnTotal, newUnTotal));
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
      case TextVerdulerPackage.VENTA__UNA_LISTA_DE_COMPRAS:
        return basicSetUnaListaDeCompras(null, msgs);
      case TextVerdulerPackage.VENTA__UN_IMPORTE:
        return basicSetUnImporte(null, msgs);
      case TextVerdulerPackage.VENTA__UN_TOTAL:
        return basicSetUnTotal(null, msgs);
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
      case TextVerdulerPackage.VENTA__NOMBRE:
        return getNombre();
      case TextVerdulerPackage.VENTA__UNA_LISTA_DE_COMPRAS:
        return getUnaListaDeCompras();
      case TextVerdulerPackage.VENTA__UN_IMPORTE:
        return getUnImporte();
      case TextVerdulerPackage.VENTA__UN_TOTAL:
        return getUnTotal();
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
      case TextVerdulerPackage.VENTA__NOMBRE:
        setNombre((String)newValue);
        return;
      case TextVerdulerPackage.VENTA__UNA_LISTA_DE_COMPRAS:
        setUnaListaDeCompras((Mercaderia)newValue);
        return;
      case TextVerdulerPackage.VENTA__UN_IMPORTE:
        setUnImporte((Importe)newValue);
        return;
      case TextVerdulerPackage.VENTA__UN_TOTAL:
        setUnTotal((TotalDeCompra)newValue);
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
      case TextVerdulerPackage.VENTA__NOMBRE:
        setNombre(NOMBRE_EDEFAULT);
        return;
      case TextVerdulerPackage.VENTA__UNA_LISTA_DE_COMPRAS:
        setUnaListaDeCompras((Mercaderia)null);
        return;
      case TextVerdulerPackage.VENTA__UN_IMPORTE:
        setUnImporte((Importe)null);
        return;
      case TextVerdulerPackage.VENTA__UN_TOTAL:
        setUnTotal((TotalDeCompra)null);
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
      case TextVerdulerPackage.VENTA__NOMBRE:
        return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
      case TextVerdulerPackage.VENTA__UNA_LISTA_DE_COMPRAS:
        return unaListaDeCompras != null;
      case TextVerdulerPackage.VENTA__UN_IMPORTE:
        return unImporte != null;
      case TextVerdulerPackage.VENTA__UN_TOTAL:
        return unTotal != null;
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
    result.append(" (nombre: ");
    result.append(nombre);
    result.append(')');
    return result.toString();
  }

} //VentaImpl
