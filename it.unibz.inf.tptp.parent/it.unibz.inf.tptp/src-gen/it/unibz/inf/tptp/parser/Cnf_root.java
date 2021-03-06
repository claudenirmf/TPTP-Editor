/**
 * generated by Xtext 2.12.0
 */
package it.unibz.inf.tptp.parser;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cnf root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibz.inf.tptp.parser.Cnf_root#getName <em>Name</em>}</li>
 *   <li>{@link it.unibz.inf.tptp.parser.Cnf_root#getFormula_role <em>Formula role</em>}</li>
 *   <li>{@link it.unibz.inf.tptp.parser.Cnf_root#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see it.unibz.inf.tptp.parser.ParserPackage#getCnf_root()
 * @model
 * @generated
 */
public interface Cnf_root extends Cnf_input
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
   * @see it.unibz.inf.tptp.parser.ParserPackage#getCnf_root_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link it.unibz.inf.tptp.parser.Cnf_root#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Formula role</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Formula role</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Formula role</em>' attribute.
   * @see #setFormula_role(String)
   * @see it.unibz.inf.tptp.parser.ParserPackage#getCnf_root_Formula_role()
   * @model
   * @generated
   */
  String getFormula_role();

  /**
   * Sets the value of the '{@link it.unibz.inf.tptp.parser.Cnf_root#getFormula_role <em>Formula role</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Formula role</em>' attribute.
   * @see #getFormula_role()
   * @generated
   */
  void setFormula_role(String value);

  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(Cnf_formula_type_definition)
   * @see it.unibz.inf.tptp.parser.ParserPackage#getCnf_root_Exp()
   * @model containment="true"
   * @generated
   */
  Cnf_formula_type_definition getExp();

  /**
   * Sets the value of the '{@link it.unibz.inf.tptp.parser.Cnf_root#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(Cnf_formula_type_definition value);

} // Cnf_root
