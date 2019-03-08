/**
 * generated by Xtext 2.12.0
 */
package it.unibz.inf.tptp.parser.impl;

import it.unibz.inf.tptp.parser.ParserPackage;
import it.unibz.inf.tptp.parser.tff_type_expression;
import it.unibz.inf.tptp.parser.tff_var;
import it.unibz.inf.tptp.parser.tff_var_declaration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>tff var declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unibz.inf.tptp.parser.impl.tff_var_declarationImpl#getVar <em>Var</em>}</li>
 *   <li>{@link it.unibz.inf.tptp.parser.impl.tff_var_declarationImpl#getVartype <em>Vartype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class tff_var_declarationImpl extends MinimalEObjectImpl.Container implements tff_var_declaration
{
  /**
   * The cached value of the '{@link #getVar() <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected tff_var var;

  /**
   * The cached value of the '{@link #getVartype() <em>Vartype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVartype()
   * @generated
   * @ordered
   */
  protected tff_type_expression vartype;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected tff_var_declarationImpl()
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
    return ParserPackage.Literals.TFF_VAR_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public tff_var getVar()
  {
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVar(tff_var newVar, NotificationChain msgs)
  {
    tff_var oldVar = var;
    var = newVar;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ParserPackage.TFF_VAR_DECLARATION__VAR, oldVar, newVar);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar(tff_var newVar)
  {
    if (newVar != var)
    {
      NotificationChain msgs = null;
      if (var != null)
        msgs = ((InternalEObject)var).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ParserPackage.TFF_VAR_DECLARATION__VAR, null, msgs);
      if (newVar != null)
        msgs = ((InternalEObject)newVar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ParserPackage.TFF_VAR_DECLARATION__VAR, null, msgs);
      msgs = basicSetVar(newVar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ParserPackage.TFF_VAR_DECLARATION__VAR, newVar, newVar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public tff_type_expression getVartype()
  {
    return vartype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVartype(tff_type_expression newVartype, NotificationChain msgs)
  {
    tff_type_expression oldVartype = vartype;
    vartype = newVartype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ParserPackage.TFF_VAR_DECLARATION__VARTYPE, oldVartype, newVartype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVartype(tff_type_expression newVartype)
  {
    if (newVartype != vartype)
    {
      NotificationChain msgs = null;
      if (vartype != null)
        msgs = ((InternalEObject)vartype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ParserPackage.TFF_VAR_DECLARATION__VARTYPE, null, msgs);
      if (newVartype != null)
        msgs = ((InternalEObject)newVartype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ParserPackage.TFF_VAR_DECLARATION__VARTYPE, null, msgs);
      msgs = basicSetVartype(newVartype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ParserPackage.TFF_VAR_DECLARATION__VARTYPE, newVartype, newVartype));
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
      case ParserPackage.TFF_VAR_DECLARATION__VAR:
        return basicSetVar(null, msgs);
      case ParserPackage.TFF_VAR_DECLARATION__VARTYPE:
        return basicSetVartype(null, msgs);
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
      case ParserPackage.TFF_VAR_DECLARATION__VAR:
        return getVar();
      case ParserPackage.TFF_VAR_DECLARATION__VARTYPE:
        return getVartype();
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
      case ParserPackage.TFF_VAR_DECLARATION__VAR:
        setVar((tff_var)newValue);
        return;
      case ParserPackage.TFF_VAR_DECLARATION__VARTYPE:
        setVartype((tff_type_expression)newValue);
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
      case ParserPackage.TFF_VAR_DECLARATION__VAR:
        setVar((tff_var)null);
        return;
      case ParserPackage.TFF_VAR_DECLARATION__VARTYPE:
        setVartype((tff_type_expression)null);
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
      case ParserPackage.TFF_VAR_DECLARATION__VAR:
        return var != null;
      case ParserPackage.TFF_VAR_DECLARATION__VARTYPE:
        return vartype != null;
    }
    return super.eIsSet(featureID);
  }

} //tff_var_declarationImpl
