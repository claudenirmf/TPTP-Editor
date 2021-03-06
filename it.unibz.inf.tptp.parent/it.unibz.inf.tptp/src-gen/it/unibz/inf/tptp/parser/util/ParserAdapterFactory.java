/**
 * generated by Xtext 2.12.0
 */
package it.unibz.inf.tptp.parser.util;

import it.unibz.inf.tptp.parser.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see it.unibz.inf.tptp.parser.ParserPackage
 * @generated
 */
public class ParserAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ParserPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParserAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ParserPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParserSwitch<Adapter> modelSwitch =
    new ParserSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseInclude(Include object)
      {
        return createIncludeAdapter();
      }
      @Override
      public Adapter caseFof_input(Fof_input object)
      {
        return createFof_inputAdapter();
      }
      @Override
      public Adapter caseFof_root(Fof_root object)
      {
        return createFof_rootAdapter();
      }
      @Override
      public Adapter caseFof_expression(Fof_expression object)
      {
        return createFof_expressionAdapter();
      }
      @Override
      public Adapter caseFof_atom(Fof_atom object)
      {
        return createFof_atomAdapter();
      }
      @Override
      public Adapter caseFof_constant(Fof_constant object)
      {
        return createFof_constantAdapter();
      }
      @Override
      public Adapter caseFof_var(Fof_var object)
      {
        return createFof_varAdapter();
      }
      @Override
      public Adapter caseFof_variable_list(Fof_variable_list object)
      {
        return createFof_variable_listAdapter();
      }
      @Override
      public Adapter caseTff_input(Tff_input object)
      {
        return createTff_inputAdapter();
      }
      @Override
      public Adapter caseTff_root(Tff_root object)
      {
        return createTff_rootAdapter();
      }
      @Override
      public Adapter caseTff_formula_type_definition(Tff_formula_type_definition object)
      {
        return createTff_formula_type_definitionAdapter();
      }
      @Override
      public Adapter caseTff_type_expression(Tff_type_expression object)
      {
        return createTff_type_expressionAdapter();
      }
      @Override
      public Adapter caseTff_type_atom(Tff_type_atom object)
      {
        return createTff_type_atomAdapter();
      }
      @Override
      public Adapter caseTff_type_constant(Tff_type_constant object)
      {
        return createTff_type_constantAdapter();
      }
      @Override
      public Adapter caseTff_expression(Tff_expression object)
      {
        return createTff_expressionAdapter();
      }
      @Override
      public Adapter caseTff_atom(Tff_atom object)
      {
        return createTff_atomAdapter();
      }
      @Override
      public Adapter caseTff_constant(Tff_constant object)
      {
        return createTff_constantAdapter();
      }
      @Override
      public Adapter caseTff_predefined_function_2_args(Tff_predefined_function_2_args object)
      {
        return createTff_predefined_function_2_argsAdapter();
      }
      @Override
      public Adapter caseTff_var(Tff_var object)
      {
        return createTff_varAdapter();
      }
      @Override
      public Adapter caseTff_var_declaration(Tff_var_declaration object)
      {
        return createTff_var_declarationAdapter();
      }
      @Override
      public Adapter caseTff_variable_list(Tff_variable_list object)
      {
        return createTff_variable_listAdapter();
      }
      @Override
      public Adapter caseCnf_input(Cnf_input object)
      {
        return createCnf_inputAdapter();
      }
      @Override
      public Adapter caseCnf_root(Cnf_root object)
      {
        return createCnf_rootAdapter();
      }
      @Override
      public Adapter caseCnf_formula_type_definition(Cnf_formula_type_definition object)
      {
        return createCnf_formula_type_definitionAdapter();
      }
      @Override
      public Adapter caseCnf_or(Cnf_or object)
      {
        return createCnf_orAdapter();
      }
      @Override
      public Adapter caseCnf_not(Cnf_not object)
      {
        return createCnf_notAdapter();
      }
      @Override
      public Adapter caseCnf_equality(Cnf_equality object)
      {
        return createCnf_equalityAdapter();
      }
      @Override
      public Adapter caseCnf_expression(Cnf_expression object)
      {
        return createCnf_expressionAdapter();
      }
      @Override
      public Adapter caseCnf_constant(Cnf_constant object)
      {
        return createCnf_constantAdapter();
      }
      @Override
      public Adapter caseCnf_var(Cnf_var object)
      {
        return createCnf_varAdapter();
      }
      @Override
      public Adapter caseThf_input(Thf_input object)
      {
        return createThf_inputAdapter();
      }
      @Override
      public Adapter caseThf_root(Thf_root object)
      {
        return createThf_rootAdapter();
      }
      @Override
      public Adapter caseThf_formula_type_definition(Thf_formula_type_definition object)
      {
        return createThf_formula_type_definitionAdapter();
      }
      @Override
      public Adapter caseThf_type_expression(Thf_type_expression object)
      {
        return createThf_type_expressionAdapter();
      }
      @Override
      public Adapter caseThf_type_atom(Thf_type_atom object)
      {
        return createThf_type_atomAdapter();
      }
      @Override
      public Adapter caseThf_type_constant(Thf_type_constant object)
      {
        return createThf_type_constantAdapter();
      }
      @Override
      public Adapter caseThf_expression(Thf_expression object)
      {
        return createThf_expressionAdapter();
      }
      @Override
      public Adapter caseThf_atom(Thf_atom object)
      {
        return createThf_atomAdapter();
      }
      @Override
      public Adapter caseThf_constant(Thf_constant object)
      {
        return createThf_constantAdapter();
      }
      @Override
      public Adapter caseThf_var(Thf_var object)
      {
        return createThf_varAdapter();
      }
      @Override
      public Adapter caseThf_variable_list(Thf_variable_list object)
      {
        return createThf_variable_listAdapter();
      }
      @Override
      public Adapter caseThf_var_declaration(Thf_var_declaration object)
      {
        return createThf_var_declarationAdapter();
      }
      @Override
      public Adapter casebinary(binary object)
      {
        return createbinaryAdapter();
      }
      @Override
      public Adapter caseoper(oper object)
      {
        return createoperAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.tptp.parser.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.tptp.parser.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.tptp.parser.Include <em>Include</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.tptp.parser.Include
   * @generated
   */
  public Adapter createIncludeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.tptp.parser.Fof_input <em>Fof input</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.tptp.parser.Fof_input
   * @generated
   */
  public Adapter createFof_inputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.tptp.parser.Fof_root <em>Fof root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.tptp.parser.Fof_root
   * @generated
   */
  public Adapter createFof_rootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.tptp.parser.Fof_expression <em>Fof expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.tptp.parser.Fof_expression
   * @generated
   */
  public Adapter createFof_expressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.tptp.parser.Fof_atom <em>Fof atom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.tptp.parser.Fof_atom
   * @generated
   */
  public Adapter createFof_atomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.tptp.parser.Fof_constant <em>Fof constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.tptp.parser.Fof_constant
   * @generated
   */
  public Adapter createFof_constantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.tptp.parser.Fof_var <em>Fof var</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.tptp.parser.Fof_var
   * @generated
   */
  public Adapter createFof_varAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.tptp.parser.Fof_variable_list <em>Fof variable list</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.tptp.parser.Fof_variable_list
   * @generated
   */
  public Adapter createFof_variable_listAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.tptp.parser.Tff_input <em>Tff input</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.tptp.parser.Tff_input
   * @generated
   */
  public Adapter createTff_inputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.tptp.parser.Tff_root <em>Tff root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.tptp.parser.Tff_root
   * @generated
   */
  public Adapter createTff_rootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.tptp.parser.Tff_formula_type_definition <em>Tff formula type definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.tptp.parser.Tff_formula_type_definition
   * @generated
   */
  public Adapter createTff_formula_type_definitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.tptp.parser.Tff_type_expression <em>Tff type expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.tptp.parser.Tff_type_expression
   * @generated
   */
  public Adapter createTff_type_expressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.tptp.parser.Tff_type_atom <em>Tff type atom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.tptp.parser.Tff_type_atom
   * @generated
   */
  public Adapter createTff_type_atomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.tptp.parser.Tff_type_constant <em>Tff type constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.tptp.parser.Tff_type_constant
   * @generated
   */
  public Adapter createTff_type_constantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.tptp.parser.Tff_expression <em>Tff expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.tptp.parser.Tff_expression
   * @generated
   */
  public Adapter createTff_expressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.tptp.parser.Tff_atom <em>Tff atom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.tptp.parser.Tff_atom
   * @generated
   */
  public Adapter createTff_atomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.tptp.parser.Tff_constant <em>Tff constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.tptp.parser.Tff_constant
   * @generated
   */
  public Adapter createTff_constantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.tptp.parser.Tff_predefined_function_2_args <em>Tff predefined function 2args</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.tptp.parser.Tff_predefined_function_2_args
   * @generated
   */
  public Adapter createTff_predefined_function_2_argsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.tptp.parser.Tff_var <em>Tff var</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.tptp.parser.Tff_var
   * @generated
   */
  public Adapter createTff_varAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.tptp.parser.Tff_var_declaration <em>Tff var declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.tptp.parser.Tff_var_declaration
   * @generated
   */
  public Adapter createTff_var_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.tptp.parser.Tff_variable_list <em>Tff variable list</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.tptp.parser.Tff_variable_list
   * @generated
   */
  public Adapter createTff_variable_listAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.tptp.parser.Cnf_input <em>Cnf input</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.tptp.parser.Cnf_input
   * @generated
   */
  public Adapter createCnf_inputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.tptp.parser.Cnf_root <em>Cnf root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.tptp.parser.Cnf_root
   * @generated
   */
  public Adapter createCnf_rootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.tptp.parser.Cnf_formula_type_definition <em>Cnf formula type definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.tptp.parser.Cnf_formula_type_definition
   * @generated
   */
  public Adapter createCnf_formula_type_definitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.tptp.parser.Cnf_or <em>Cnf or</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.tptp.parser.Cnf_or
   * @generated
   */
  public Adapter createCnf_orAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.tptp.parser.Cnf_not <em>Cnf not</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.tptp.parser.Cnf_not
   * @generated
   */
  public Adapter createCnf_notAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.tptp.parser.Cnf_equality <em>Cnf equality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.tptp.parser.Cnf_equality
   * @generated
   */
  public Adapter createCnf_equalityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.tptp.parser.Cnf_expression <em>Cnf expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.tptp.parser.Cnf_expression
   * @generated
   */
  public Adapter createCnf_expressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.tptp.parser.Cnf_constant <em>Cnf constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.tptp.parser.Cnf_constant
   * @generated
   */
  public Adapter createCnf_constantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.tptp.parser.Cnf_var <em>Cnf var</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.tptp.parser.Cnf_var
   * @generated
   */
  public Adapter createCnf_varAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.tptp.parser.Thf_input <em>Thf input</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.tptp.parser.Thf_input
   * @generated
   */
  public Adapter createThf_inputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.tptp.parser.Thf_root <em>Thf root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.tptp.parser.Thf_root
   * @generated
   */
  public Adapter createThf_rootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.tptp.parser.Thf_formula_type_definition <em>Thf formula type definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.tptp.parser.Thf_formula_type_definition
   * @generated
   */
  public Adapter createThf_formula_type_definitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.tptp.parser.Thf_type_expression <em>Thf type expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.tptp.parser.Thf_type_expression
   * @generated
   */
  public Adapter createThf_type_expressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.tptp.parser.Thf_type_atom <em>Thf type atom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.tptp.parser.Thf_type_atom
   * @generated
   */
  public Adapter createThf_type_atomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.tptp.parser.Thf_type_constant <em>Thf type constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.tptp.parser.Thf_type_constant
   * @generated
   */
  public Adapter createThf_type_constantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.tptp.parser.Thf_expression <em>Thf expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.tptp.parser.Thf_expression
   * @generated
   */
  public Adapter createThf_expressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.tptp.parser.Thf_atom <em>Thf atom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.tptp.parser.Thf_atom
   * @generated
   */
  public Adapter createThf_atomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.tptp.parser.Thf_constant <em>Thf constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.tptp.parser.Thf_constant
   * @generated
   */
  public Adapter createThf_constantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.tptp.parser.Thf_var <em>Thf var</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.tptp.parser.Thf_var
   * @generated
   */
  public Adapter createThf_varAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.tptp.parser.Thf_variable_list <em>Thf variable list</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.tptp.parser.Thf_variable_list
   * @generated
   */
  public Adapter createThf_variable_listAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.tptp.parser.Thf_var_declaration <em>Thf var declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.tptp.parser.Thf_var_declaration
   * @generated
   */
  public Adapter createThf_var_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.tptp.parser.binary <em>binary</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.tptp.parser.binary
   * @generated
   */
  public Adapter createbinaryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.tptp.parser.oper <em>oper</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.tptp.parser.oper
   * @generated
   */
  public Adapter createoperAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ParserAdapterFactory
