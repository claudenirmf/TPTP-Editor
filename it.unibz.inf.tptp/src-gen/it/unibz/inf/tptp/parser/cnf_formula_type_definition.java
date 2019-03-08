/**
 * generated by Xtext 2.12.0
 */
package it.unibz.inf.tptp.parser;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>cnf formula type definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibz.inf.tptp.parser.cnf_formula_type_definition#getDisjunction <em>Disjunction</em>}</li>
 * </ul>
 *
 * @see it.unibz.inf.tptp.parser.ParserPackage#getcnf_formula_type_definition()
 * @model
 * @generated
 */
public interface cnf_formula_type_definition extends EObject
{
  /**
   * Returns the value of the '<em><b>Disjunction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Disjunction</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Disjunction</em>' containment reference.
   * @see #setDisjunction(cnf_or)
   * @see it.unibz.inf.tptp.parser.ParserPackage#getcnf_formula_type_definition_Disjunction()
   * @model containment="true"
   * @generated
   */
  cnf_or getDisjunction();

  /**
   * Sets the value of the '{@link it.unibz.inf.tptp.parser.cnf_formula_type_definition#getDisjunction <em>Disjunction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Disjunction</em>' containment reference.
   * @see #getDisjunction()
   * @generated
   */
  void setDisjunction(cnf_or value);

} // cnf_formula_type_definition
