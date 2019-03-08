/**
 * generated by Xtext 2.12.0
 */
package it.unibz.inf.tptp.parser.impl;

import it.unibz.inf.tptp.parser.ParserPackage;
import it.unibz.inf.tptp.parser.thf_expression;
import it.unibz.inf.tptp.parser.thf_formula_type_definition;
import it.unibz.inf.tptp.parser.thf_root;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>thf root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unibz.inf.tptp.parser.impl.thf_rootImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.unibz.inf.tptp.parser.impl.thf_rootImpl#getFormula_role <em>Formula role</em>}</li>
 *   <li>{@link it.unibz.inf.tptp.parser.impl.thf_rootImpl#getDef <em>Def</em>}</li>
 *   <li>{@link it.unibz.inf.tptp.parser.impl.thf_rootImpl#getThf_exp <em>Thf exp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class thf_rootImpl extends thf_inputImpl implements thf_root
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getFormula_role() <em>Formula role</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormula_role()
   * @generated
   * @ordered
   */
  protected static final String FORMULA_ROLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFormula_role() <em>Formula role</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormula_role()
   * @generated
   * @ordered
   */
  protected String formula_role = FORMULA_ROLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getDef() <em>Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDef()
   * @generated
   * @ordered
   */
  protected thf_formula_type_definition def;

  /**
   * The cached value of the '{@link #getThf_exp() <em>Thf exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThf_exp()
   * @generated
   * @ordered
   */
  protected thf_expression thf_exp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected thf_rootImpl()
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
    return ParserPackage.Literals.THF_ROOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ParserPackage.THF_ROOT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFormula_role()
  {
    return formula_role;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFormula_role(String newFormula_role)
  {
    String oldFormula_role = formula_role;
    formula_role = newFormula_role;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ParserPackage.THF_ROOT__FORMULA_ROLE, oldFormula_role, formula_role));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public thf_formula_type_definition getDef()
  {
    return def;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDef(thf_formula_type_definition newDef, NotificationChain msgs)
  {
    thf_formula_type_definition oldDef = def;
    def = newDef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ParserPackage.THF_ROOT__DEF, oldDef, newDef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDef(thf_formula_type_definition newDef)
  {
    if (newDef != def)
    {
      NotificationChain msgs = null;
      if (def != null)
        msgs = ((InternalEObject)def).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ParserPackage.THF_ROOT__DEF, null, msgs);
      if (newDef != null)
        msgs = ((InternalEObject)newDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ParserPackage.THF_ROOT__DEF, null, msgs);
      msgs = basicSetDef(newDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ParserPackage.THF_ROOT__DEF, newDef, newDef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public thf_expression getThf_exp()
  {
    return thf_exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThf_exp(thf_expression newThf_exp, NotificationChain msgs)
  {
    thf_expression oldThf_exp = thf_exp;
    thf_exp = newThf_exp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ParserPackage.THF_ROOT__THF_EXP, oldThf_exp, newThf_exp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThf_exp(thf_expression newThf_exp)
  {
    if (newThf_exp != thf_exp)
    {
      NotificationChain msgs = null;
      if (thf_exp != null)
        msgs = ((InternalEObject)thf_exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ParserPackage.THF_ROOT__THF_EXP, null, msgs);
      if (newThf_exp != null)
        msgs = ((InternalEObject)newThf_exp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ParserPackage.THF_ROOT__THF_EXP, null, msgs);
      msgs = basicSetThf_exp(newThf_exp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ParserPackage.THF_ROOT__THF_EXP, newThf_exp, newThf_exp));
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
      case ParserPackage.THF_ROOT__DEF:
        return basicSetDef(null, msgs);
      case ParserPackage.THF_ROOT__THF_EXP:
        return basicSetThf_exp(null, msgs);
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
      case ParserPackage.THF_ROOT__NAME:
        return getName();
      case ParserPackage.THF_ROOT__FORMULA_ROLE:
        return getFormula_role();
      case ParserPackage.THF_ROOT__DEF:
        return getDef();
      case ParserPackage.THF_ROOT__THF_EXP:
        return getThf_exp();
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
      case ParserPackage.THF_ROOT__NAME:
        setName((String)newValue);
        return;
      case ParserPackage.THF_ROOT__FORMULA_ROLE:
        setFormula_role((String)newValue);
        return;
      case ParserPackage.THF_ROOT__DEF:
        setDef((thf_formula_type_definition)newValue);
        return;
      case ParserPackage.THF_ROOT__THF_EXP:
        setThf_exp((thf_expression)newValue);
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
      case ParserPackage.THF_ROOT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ParserPackage.THF_ROOT__FORMULA_ROLE:
        setFormula_role(FORMULA_ROLE_EDEFAULT);
        return;
      case ParserPackage.THF_ROOT__DEF:
        setDef((thf_formula_type_definition)null);
        return;
      case ParserPackage.THF_ROOT__THF_EXP:
        setThf_exp((thf_expression)null);
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
      case ParserPackage.THF_ROOT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ParserPackage.THF_ROOT__FORMULA_ROLE:
        return FORMULA_ROLE_EDEFAULT == null ? formula_role != null : !FORMULA_ROLE_EDEFAULT.equals(formula_role);
      case ParserPackage.THF_ROOT__DEF:
        return def != null;
      case ParserPackage.THF_ROOT__THF_EXP:
        return thf_exp != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", formula_role: ");
    result.append(formula_role);
    result.append(')');
    return result.toString();
  }

} //thf_rootImpl
