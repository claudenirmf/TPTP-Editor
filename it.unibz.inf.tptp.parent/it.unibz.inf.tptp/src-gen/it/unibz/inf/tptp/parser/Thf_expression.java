/**
 * generated by Xtext 2.12.0
 */
package it.unibz.inf.tptp.parser;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thf expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibz.inf.tptp.parser.Thf_expression#getThf_atom <em>Thf atom</em>}</li>
 *   <li>{@link it.unibz.inf.tptp.parser.Thf_expression#isThf_negation <em>Thf negation</em>}</li>
 *   <li>{@link it.unibz.inf.tptp.parser.Thf_expression#getThf_exp <em>Thf exp</em>}</li>
 *   <li>{@link it.unibz.inf.tptp.parser.Thf_expression#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see it.unibz.inf.tptp.parser.ParserPackage#getThf_expression()
 * @model
 * @generated
 */
public interface Thf_expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Thf atom</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Thf atom</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Thf atom</em>' containment reference.
   * @see #setThf_atom(Thf_atom)
   * @see it.unibz.inf.tptp.parser.ParserPackage#getThf_expression_Thf_atom()
   * @model containment="true"
   * @generated
   */
  Thf_atom getThf_atom();

  /**
   * Sets the value of the '{@link it.unibz.inf.tptp.parser.Thf_expression#getThf_atom <em>Thf atom</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Thf atom</em>' containment reference.
   * @see #getThf_atom()
   * @generated
   */
  void setThf_atom(Thf_atom value);

  /**
   * Returns the value of the '<em><b>Thf negation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Thf negation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Thf negation</em>' attribute.
   * @see #setThf_negation(boolean)
   * @see it.unibz.inf.tptp.parser.ParserPackage#getThf_expression_Thf_negation()
   * @model
   * @generated
   */
  boolean isThf_negation();

  /**
   * Sets the value of the '{@link it.unibz.inf.tptp.parser.Thf_expression#isThf_negation <em>Thf negation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Thf negation</em>' attribute.
   * @see #isThf_negation()
   * @generated
   */
  void setThf_negation(boolean value);

  /**
   * Returns the value of the '<em><b>Thf exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Thf exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Thf exp</em>' containment reference.
   * @see #setThf_exp(EObject)
   * @see it.unibz.inf.tptp.parser.ParserPackage#getThf_expression_Thf_exp()
   * @model containment="true"
   * @generated
   */
  EObject getThf_exp();

  /**
   * Sets the value of the '{@link it.unibz.inf.tptp.parser.Thf_expression#getThf_exp <em>Thf exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Thf exp</em>' containment reference.
   * @see #getThf_exp()
   * @generated
   */
  void setThf_exp(EObject value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see it.unibz.inf.tptp.parser.ParserPackage#getThf_expression_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link it.unibz.inf.tptp.parser.Thf_expression#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

} // Thf_expression
