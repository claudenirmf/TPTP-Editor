/**
 * generated by Xtext 2.12.0
 */
package it.unibz.inf.tptp.parser.impl;

import it.unibz.inf.tptp.parser.ParserPackage;
import it.unibz.inf.tptp.parser.fof_atom;
import it.unibz.inf.tptp.parser.fof_constant;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>fof constant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unibz.inf.tptp.parser.impl.fof_constantImpl#getFof_param <em>Fof param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class fof_constantImpl extends fof_atomImpl implements fof_constant
{
  /**
   * The cached value of the '{@link #getFof_param() <em>Fof param</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFof_param()
   * @generated
   * @ordered
   */
  protected EList<fof_atom> fof_param;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected fof_constantImpl()
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
    return ParserPackage.Literals.FOF_CONSTANT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<fof_atom> getFof_param()
  {
    if (fof_param == null)
    {
      fof_param = new EObjectContainmentEList<fof_atom>(fof_atom.class, this, ParserPackage.FOF_CONSTANT__FOF_PARAM);
    }
    return fof_param;
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
      case ParserPackage.FOF_CONSTANT__FOF_PARAM:
        return ((InternalEList<?>)getFof_param()).basicRemove(otherEnd, msgs);
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
      case ParserPackage.FOF_CONSTANT__FOF_PARAM:
        return getFof_param();
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
      case ParserPackage.FOF_CONSTANT__FOF_PARAM:
        getFof_param().clear();
        getFof_param().addAll((Collection<? extends fof_atom>)newValue);
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
      case ParserPackage.FOF_CONSTANT__FOF_PARAM:
        getFof_param().clear();
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
      case ParserPackage.FOF_CONSTANT__FOF_PARAM:
        return fof_param != null && !fof_param.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //fof_constantImpl