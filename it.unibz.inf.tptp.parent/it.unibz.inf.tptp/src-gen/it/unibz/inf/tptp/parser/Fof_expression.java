/**
 * generated by Xtext 2.12.0
 */
package it.unibz.inf.tptp.parser;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fof expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibz.inf.tptp.parser.Fof_expression#getFof_atom <em>Fof atom</em>}</li>
 *   <li>{@link it.unibz.inf.tptp.parser.Fof_expression#isFof_negation <em>Fof negation</em>}</li>
 *   <li>{@link it.unibz.inf.tptp.parser.Fof_expression#getFof_exp <em>Fof exp</em>}</li>
 *   <li>{@link it.unibz.inf.tptp.parser.Fof_expression#getFof_quantifier <em>Fof quantifier</em>}</li>
 *   <li>{@link it.unibz.inf.tptp.parser.Fof_expression#getFof_param <em>Fof param</em>}</li>
 * </ul>
 *
 * @see it.unibz.inf.tptp.parser.ParserPackage#getFof_expression()
 * @model
 * @generated
 */
public interface Fof_expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Fof atom</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fof atom</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fof atom</em>' containment reference.
   * @see #setFof_atom(Fof_atom)
   * @see it.unibz.inf.tptp.parser.ParserPackage#getFof_expression_Fof_atom()
   * @model containment="true"
   * @generated
   */
  Fof_atom getFof_atom();

  /**
   * Sets the value of the '{@link it.unibz.inf.tptp.parser.Fof_expression#getFof_atom <em>Fof atom</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fof atom</em>' containment reference.
   * @see #getFof_atom()
   * @generated
   */
  void setFof_atom(Fof_atom value);

  /**
   * Returns the value of the '<em><b>Fof negation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fof negation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fof negation</em>' attribute.
   * @see #setFof_negation(boolean)
   * @see it.unibz.inf.tptp.parser.ParserPackage#getFof_expression_Fof_negation()
   * @model
   * @generated
   */
  boolean isFof_negation();

  /**
   * Sets the value of the '{@link it.unibz.inf.tptp.parser.Fof_expression#isFof_negation <em>Fof negation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fof negation</em>' attribute.
   * @see #isFof_negation()
   * @generated
   */
  void setFof_negation(boolean value);

  /**
   * Returns the value of the '<em><b>Fof exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fof exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fof exp</em>' containment reference.
   * @see #setFof_exp(Fof_expression)
   * @see it.unibz.inf.tptp.parser.ParserPackage#getFof_expression_Fof_exp()
   * @model containment="true"
   * @generated
   */
  Fof_expression getFof_exp();

  /**
   * Sets the value of the '{@link it.unibz.inf.tptp.parser.Fof_expression#getFof_exp <em>Fof exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fof exp</em>' containment reference.
   * @see #getFof_exp()
   * @generated
   */
  void setFof_exp(Fof_expression value);

  /**
   * Returns the value of the '<em><b>Fof quantifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fof quantifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fof quantifier</em>' attribute.
   * @see #setFof_quantifier(String)
   * @see it.unibz.inf.tptp.parser.ParserPackage#getFof_expression_Fof_quantifier()
   * @model
   * @generated
   */
  String getFof_quantifier();

  /**
   * Sets the value of the '{@link it.unibz.inf.tptp.parser.Fof_expression#getFof_quantifier <em>Fof quantifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fof quantifier</em>' attribute.
   * @see #getFof_quantifier()
   * @generated
   */
  void setFof_quantifier(String value);

  /**
   * Returns the value of the '<em><b>Fof param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fof param</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fof param</em>' containment reference.
   * @see #setFof_param(Fof_variable_list)
   * @see it.unibz.inf.tptp.parser.ParserPackage#getFof_expression_Fof_param()
   * @model containment="true"
   * @generated
   */
  Fof_variable_list getFof_param();

  /**
   * Sets the value of the '{@link it.unibz.inf.tptp.parser.Fof_expression#getFof_param <em>Fof param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fof param</em>' containment reference.
   * @see #getFof_param()
   * @generated
   */
  void setFof_param(Fof_variable_list value);

} // Fof_expression