/**
 * generated by Xtext 2.12.0
 */
package it.unibz.inf.tptp.parser.impl;

import it.unibz.inf.tptp.parser.Cnf_formula_type_definition;
import it.unibz.inf.tptp.parser.Cnf_or;
import it.unibz.inf.tptp.parser.ParserPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cnf formula type definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unibz.inf.tptp.parser.impl.Cnf_formula_type_definitionImpl#getDisjunction <em>Disjunction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Cnf_formula_type_definitionImpl extends MinimalEObjectImpl.Container implements Cnf_formula_type_definition
{
  /**
   * The cached value of the '{@link #getDisjunction() <em>Disjunction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDisjunction()
   * @generated
   * @ordered
   */
  protected Cnf_or disjunction;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Cnf_formula_type_definitionImpl()
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
    return ParserPackage.Literals.CNF_FORMULA_TYPE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cnf_or getDisjunction()
  {
    return disjunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDisjunction(Cnf_or newDisjunction, NotificationChain msgs)
  {
    Cnf_or oldDisjunction = disjunction;
    disjunction = newDisjunction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ParserPackage.CNF_FORMULA_TYPE_DEFINITION__DISJUNCTION, oldDisjunction, newDisjunction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDisjunction(Cnf_or newDisjunction)
  {
    if (newDisjunction != disjunction)
    {
      NotificationChain msgs = null;
      if (disjunction != null)
        msgs = ((InternalEObject)disjunction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ParserPackage.CNF_FORMULA_TYPE_DEFINITION__DISJUNCTION, null, msgs);
      if (newDisjunction != null)
        msgs = ((InternalEObject)newDisjunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ParserPackage.CNF_FORMULA_TYPE_DEFINITION__DISJUNCTION, null, msgs);
      msgs = basicSetDisjunction(newDisjunction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ParserPackage.CNF_FORMULA_TYPE_DEFINITION__DISJUNCTION, newDisjunction, newDisjunction));
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
      case ParserPackage.CNF_FORMULA_TYPE_DEFINITION__DISJUNCTION:
        return basicSetDisjunction(null, msgs);
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
      case ParserPackage.CNF_FORMULA_TYPE_DEFINITION__DISJUNCTION:
        return getDisjunction();
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
      case ParserPackage.CNF_FORMULA_TYPE_DEFINITION__DISJUNCTION:
        setDisjunction((Cnf_or)newValue);
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
      case ParserPackage.CNF_FORMULA_TYPE_DEFINITION__DISJUNCTION:
        setDisjunction((Cnf_or)null);
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
      case ParserPackage.CNF_FORMULA_TYPE_DEFINITION__DISJUNCTION:
        return disjunction != null;
    }
    return super.eIsSet(featureID);
  }

} //Cnf_formula_type_definitionImpl
