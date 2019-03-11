/**
 * generated by Xtext 2.12.0
 */
package it.unibz.inf.tptp.parser.impl;

import it.unibz.inf.tptp.parser.ParserPackage;
import it.unibz.inf.tptp.parser.Tff_constant;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tff constant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unibz.inf.tptp.parser.impl.Tff_constantImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.unibz.inf.tptp.parser.impl.Tff_constantImpl#getParam <em>Param</em>}</li>
 *   <li>{@link it.unibz.inf.tptp.parser.impl.Tff_constantImpl#getTop <em>Top</em>}</li>
 *   <li>{@link it.unibz.inf.tptp.parser.impl.Tff_constantImpl#getBottom <em>Bottom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Tff_constantImpl extends Tff_atomImpl implements Tff_constant
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
   * The cached value of the '{@link #getParam() <em>Param</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParam()
   * @generated
   * @ordered
   */
  protected EList<EObject> param;

  /**
   * The default value of the '{@link #getTop() <em>Top</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTop()
   * @generated
   * @ordered
   */
  protected static final String TOP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTop() <em>Top</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTop()
   * @generated
   * @ordered
   */
  protected String top = TOP_EDEFAULT;

  /**
   * The default value of the '{@link #getBottom() <em>Bottom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBottom()
   * @generated
   * @ordered
   */
  protected static final String BOTTOM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBottom() <em>Bottom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBottom()
   * @generated
   * @ordered
   */
  protected String bottom = BOTTOM_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Tff_constantImpl()
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
    return ParserPackage.Literals.TFF_CONSTANT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ParserPackage.TFF_CONSTANT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getParam()
  {
    if (param == null)
    {
      param = new EObjectContainmentEList<EObject>(EObject.class, this, ParserPackage.TFF_CONSTANT__PARAM);
    }
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTop()
  {
    return top;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTop(String newTop)
  {
    String oldTop = top;
    top = newTop;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ParserPackage.TFF_CONSTANT__TOP, oldTop, top));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBottom()
  {
    return bottom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBottom(String newBottom)
  {
    String oldBottom = bottom;
    bottom = newBottom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ParserPackage.TFF_CONSTANT__BOTTOM, oldBottom, bottom));
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
      case ParserPackage.TFF_CONSTANT__PARAM:
        return ((InternalEList<?>)getParam()).basicRemove(otherEnd, msgs);
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
      case ParserPackage.TFF_CONSTANT__NAME:
        return getName();
      case ParserPackage.TFF_CONSTANT__PARAM:
        return getParam();
      case ParserPackage.TFF_CONSTANT__TOP:
        return getTop();
      case ParserPackage.TFF_CONSTANT__BOTTOM:
        return getBottom();
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
      case ParserPackage.TFF_CONSTANT__NAME:
        setName((String)newValue);
        return;
      case ParserPackage.TFF_CONSTANT__PARAM:
        getParam().clear();
        getParam().addAll((Collection<? extends EObject>)newValue);
        return;
      case ParserPackage.TFF_CONSTANT__TOP:
        setTop((String)newValue);
        return;
      case ParserPackage.TFF_CONSTANT__BOTTOM:
        setBottom((String)newValue);
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
      case ParserPackage.TFF_CONSTANT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ParserPackage.TFF_CONSTANT__PARAM:
        getParam().clear();
        return;
      case ParserPackage.TFF_CONSTANT__TOP:
        setTop(TOP_EDEFAULT);
        return;
      case ParserPackage.TFF_CONSTANT__BOTTOM:
        setBottom(BOTTOM_EDEFAULT);
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
      case ParserPackage.TFF_CONSTANT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ParserPackage.TFF_CONSTANT__PARAM:
        return param != null && !param.isEmpty();
      case ParserPackage.TFF_CONSTANT__TOP:
        return TOP_EDEFAULT == null ? top != null : !TOP_EDEFAULT.equals(top);
      case ParserPackage.TFF_CONSTANT__BOTTOM:
        return BOTTOM_EDEFAULT == null ? bottom != null : !BOTTOM_EDEFAULT.equals(bottom);
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", top: ");
    result.append(top);
    result.append(", bottom: ");
    result.append(bottom);
    result.append(')');
    return result.toString();
  }

} //Tff_constantImpl