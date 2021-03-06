/**
 * generated by Xtext 2.12.0
 */
package it.unibz.inf.tptp.parser;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tff formula type definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibz.inf.tptp.parser.Tff_formula_type_definition#getName <em>Name</em>}</li>
 *   <li>{@link it.unibz.inf.tptp.parser.Tff_formula_type_definition#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see it.unibz.inf.tptp.parser.ParserPackage#getTff_formula_type_definition()
 * @model
 * @generated
 */
public interface Tff_formula_type_definition extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see it.unibz.inf.tptp.parser.ParserPackage#getTff_formula_type_definition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link it.unibz.inf.tptp.parser.Tff_formula_type_definition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(EObject)
   * @see it.unibz.inf.tptp.parser.ParserPackage#getTff_formula_type_definition_Exp()
   * @model containment="true"
   * @generated
   */
  EObject getExp();

  /**
   * Sets the value of the '{@link it.unibz.inf.tptp.parser.Tff_formula_type_definition#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(EObject value);

} // Tff_formula_type_definition
