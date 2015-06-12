/**
 */
package textVerduler.textVerduler.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import textVerduler.textVerduler.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see textVerduler.textVerduler.TextVerdulerPackage
 * @generated
 */
public class TextVerdulerAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TextVerdulerPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextVerdulerAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = TextVerdulerPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TextVerdulerSwitch<Adapter> modelSwitch =
    new TextVerdulerSwitch<Adapter>()
    {
      @Override
      public Adapter caseVerduleria(Verduleria object)
      {
        return createVerduleriaAdapter();
      }
      @Override
      public Adapter caseModelCliente(ModelCliente object)
      {
        return createModelClienteAdapter();
      }
      @Override
      public Adapter caseModelProducto(ModelProducto object)
      {
        return createModelProductoAdapter();
      }
      @Override
      public Adapter caseModelVenta(ModelVenta object)
      {
        return createModelVentaAdapter();
      }
      @Override
      public Adapter caseVenta(Venta object)
      {
        return createVentaAdapter();
      }
      @Override
      public Adapter caseTotalDeCompra(TotalDeCompra object)
      {
        return createTotalDeCompraAdapter();
      }
      @Override
      public Adapter caseMercaderia(Mercaderia object)
      {
        return createMercaderiaAdapter();
      }
      @Override
      public Adapter caseProducto(Producto object)
      {
        return createProductoAdapter();
      }
      @Override
      public Adapter caseValorDelProducto(ValorDelProducto object)
      {
        return createValorDelProductoAdapter();
      }
      @Override
      public Adapter caseDescripcion(Descripcion object)
      {
        return createDescripcionAdapter();
      }
      @Override
      public Adapter caseCantidad(Cantidad object)
      {
        return createCantidadAdapter();
      }
      @Override
      public Adapter caseArticulo(Articulo object)
      {
        return createArticuloAdapter();
      }
      @Override
      public Adapter caseUnidad(Unidad object)
      {
        return createUnidadAdapter();
      }
      @Override
      public Adapter caseCliente(Cliente object)
      {
        return createClienteAdapter();
      }
      @Override
      public Adapter caseEstadoDeuda(EstadoDeuda object)
      {
        return createEstadoDeudaAdapter();
      }
      @Override
      public Adapter caseImporte(Importe object)
      {
        return createImporteAdapter();
      }
      @Override
      public Adapter caseMoneda(Moneda object)
      {
        return createMonedaAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link textVerduler.textVerduler.Verduleria <em>Verduleria</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see textVerduler.textVerduler.Verduleria
   * @generated
   */
  public Adapter createVerduleriaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link textVerduler.textVerduler.ModelCliente <em>Model Cliente</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see textVerduler.textVerduler.ModelCliente
   * @generated
   */
  public Adapter createModelClienteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link textVerduler.textVerduler.ModelProducto <em>Model Producto</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see textVerduler.textVerduler.ModelProducto
   * @generated
   */
  public Adapter createModelProductoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link textVerduler.textVerduler.ModelVenta <em>Model Venta</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see textVerduler.textVerduler.ModelVenta
   * @generated
   */
  public Adapter createModelVentaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link textVerduler.textVerduler.Venta <em>Venta</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see textVerduler.textVerduler.Venta
   * @generated
   */
  public Adapter createVentaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link textVerduler.textVerduler.TotalDeCompra <em>Total De Compra</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see textVerduler.textVerduler.TotalDeCompra
   * @generated
   */
  public Adapter createTotalDeCompraAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link textVerduler.textVerduler.Mercaderia <em>Mercaderia</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see textVerduler.textVerduler.Mercaderia
   * @generated
   */
  public Adapter createMercaderiaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link textVerduler.textVerduler.Producto <em>Producto</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see textVerduler.textVerduler.Producto
   * @generated
   */
  public Adapter createProductoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link textVerduler.textVerduler.ValorDelProducto <em>Valor Del Producto</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see textVerduler.textVerduler.ValorDelProducto
   * @generated
   */
  public Adapter createValorDelProductoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link textVerduler.textVerduler.Descripcion <em>Descripcion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see textVerduler.textVerduler.Descripcion
   * @generated
   */
  public Adapter createDescripcionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link textVerduler.textVerduler.Cantidad <em>Cantidad</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see textVerduler.textVerduler.Cantidad
   * @generated
   */
  public Adapter createCantidadAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link textVerduler.textVerduler.Articulo <em>Articulo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see textVerduler.textVerduler.Articulo
   * @generated
   */
  public Adapter createArticuloAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link textVerduler.textVerduler.Unidad <em>Unidad</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see textVerduler.textVerduler.Unidad
   * @generated
   */
  public Adapter createUnidadAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link textVerduler.textVerduler.Cliente <em>Cliente</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see textVerduler.textVerduler.Cliente
   * @generated
   */
  public Adapter createClienteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link textVerduler.textVerduler.EstadoDeuda <em>Estado Deuda</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see textVerduler.textVerduler.EstadoDeuda
   * @generated
   */
  public Adapter createEstadoDeudaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link textVerduler.textVerduler.Importe <em>Importe</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see textVerduler.textVerduler.Importe
   * @generated
   */
  public Adapter createImporteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link textVerduler.textVerduler.Moneda <em>Moneda</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see textVerduler.textVerduler.Moneda
   * @generated
   */
  public Adapter createMonedaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //TextVerdulerAdapterFactory
