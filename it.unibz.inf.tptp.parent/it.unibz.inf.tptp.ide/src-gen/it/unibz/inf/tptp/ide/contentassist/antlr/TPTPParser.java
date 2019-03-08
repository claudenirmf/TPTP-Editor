/*
 * generated by Xtext 2.12.0
 */
package it.unibz.inf.tptp.ide.contentassist.antlr;

import com.google.inject.Inject;
import it.unibz.inf.tptp.ide.contentassist.antlr.internal.InternalTPTPParser;
import it.unibz.inf.tptp.services.TPTPGrammarAccess;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class TPTPParser extends AbstractContentAssistParser {

	@Inject
	private TPTPGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalTPTPParser createParser() {
		InternalTPTPParser result = new InternalTPTPParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getModelAccess().getAlternatives_1(), "rule__Model__Alternatives_1");
					put(grammarAccess.getFof_inputAccess().getAlternatives(), "rule__Fof_input__Alternatives");
					put(grammarAccess.getFof_rootAccess().getNameAlternatives_1_0(), "rule__Fof_root__NameAlternatives_1_0");
					put(grammarAccess.getFof_rootAccess().getFormula_roleAlternatives_3_0(), "rule__Fof_root__Formula_roleAlternatives_3_0");
					put(grammarAccess.getFof_terminating_expressionAccess().getAlternatives(), "rule__Fof_terminating_expression__Alternatives");
					put(grammarAccess.getFof_atomAccess().getAlternatives(), "rule__Fof_atom__Alternatives");
					put(grammarAccess.getFof_atom_literalAccess().getNameAlternatives_0(), "rule__Fof_atom_literal__NameAlternatives_0");
					put(grammarAccess.getFof_constantAccess().getNameAlternatives_0_0(), "rule__Fof_constant__NameAlternatives_0_0");
					put(grammarAccess.getFof_quantifier_expressionAccess().getFof_quantifierAlternatives_0_0(), "rule__Fof_quantifier_expression__Fof_quantifierAlternatives_0_0");
					put(grammarAccess.getTff_inputAccess().getAlternatives(), "rule__Tff_input__Alternatives");
					put(grammarAccess.getTff_rootAccess().getAlternatives(), "rule__Tff_root__Alternatives");
					put(grammarAccess.getTff_rootAccess().getNameAlternatives_0_1_0(), "rule__Tff_root__NameAlternatives_0_1_0");
					put(grammarAccess.getTff_rootAccess().getFormula_roleAlternatives_0_3_0(), "rule__Tff_root__Formula_roleAlternatives_0_3_0");
					put(grammarAccess.getTff_rootAccess().getNameAlternatives_1_1_0(), "rule__Tff_root__NameAlternatives_1_1_0");
					put(grammarAccess.getTff_formula_type_definitionAccess().getAlternatives(), "rule__Tff_formula_type_definition__Alternatives");
					put(grammarAccess.getTff_formula_type_definitionAccess().getAlternatives_1_0(), "rule__Tff_formula_type_definition__Alternatives_1_0");
					put(grammarAccess.getTff_formula_type_definitionAccess().getExpAlternatives_1_2_0(), "rule__Tff_formula_type_definition__ExpAlternatives_1_2_0");
					put(grammarAccess.getTff_type_expressionAccess().getOpAlternatives_1_1_0(), "rule__Tff_type_expression__OpAlternatives_1_1_0");
					put(grammarAccess.getTff_terminal_type_expressionAccess().getAlternatives(), "rule__Tff_terminal_type_expression__Alternatives");
					put(grammarAccess.getTff_type_atomAccess().getAlternatives(), "rule__Tff_type_atom__Alternatives");
					put(grammarAccess.getTff_type_constantAccess().getNameAlternatives_0_0(), "rule__Tff_type_constant__NameAlternatives_0_0");
					put(grammarAccess.getTff_type_literalAccess().getNameAlternatives_0(), "rule__Tff_type_literal__NameAlternatives_0");
					put(grammarAccess.getTff_terminating_expressionAccess().getAlternatives(), "rule__Tff_terminating_expression__Alternatives");
					put(grammarAccess.getTff_atomAccess().getAlternatives(), "rule__Tff_atom__Alternatives");
					put(grammarAccess.getTff_constantAccess().getAlternatives(), "rule__Tff_constant__Alternatives");
					put(grammarAccess.getTff_constantAccess().getNameAlternatives_0_0_0(), "rule__Tff_constant__NameAlternatives_0_0_0");
					put(grammarAccess.getTff_atom_literalAccess().getNameAlternatives_0(), "rule__Tff_atom_literal__NameAlternatives_0");
					put(grammarAccess.getTff_predefined_function_1_argsAccess().getNameAlternatives_0_0(), "rule__Tff_predefined_function_1_args__NameAlternatives_0_0");
					put(grammarAccess.getTff_predefined_function_2_argsAccess().getFuncAlternatives_0_0(), "rule__Tff_predefined_function_2_args__FuncAlternatives_0_0");
					put(grammarAccess.getTff_quantifier_expressionAccess().getQuantifierAlternatives_0_0(), "rule__Tff_quantifier_expression__QuantifierAlternatives_0_0");
					put(grammarAccess.getCnf_inputAccess().getAlternatives(), "rule__Cnf_input__Alternatives");
					put(grammarAccess.getCnf_rootAccess().getNameAlternatives_1_0(), "rule__Cnf_root__NameAlternatives_1_0");
					put(grammarAccess.getCnf_rootAccess().getFormula_roleAlternatives_3_0(), "rule__Cnf_root__Formula_roleAlternatives_3_0");
					put(grammarAccess.getCnf_formula_type_definitionAccess().getAlternatives(), "rule__Cnf_formula_type_definition__Alternatives");
					put(grammarAccess.getCnf_equalityAccess().getEqAlternatives_1_0_0(), "rule__Cnf_equality__EqAlternatives_1_0_0");
					put(grammarAccess.getCnf_expressionAccess().getAlternatives(), "rule__Cnf_expression__Alternatives");
					put(grammarAccess.getCnf_constantAccess().getNameAlternatives_0_0(), "rule__Cnf_constant__NameAlternatives_0_0");
					put(grammarAccess.getCnf_statement_literalAccess().getAlternatives(), "rule__Cnf_statement_literal__Alternatives");
					put(grammarAccess.getThf_inputAccess().getAlternatives(), "rule__Thf_input__Alternatives");
					put(grammarAccess.getThf_rootAccess().getAlternatives(), "rule__Thf_root__Alternatives");
					put(grammarAccess.getThf_rootAccess().getNameAlternatives_0_1_0(), "rule__Thf_root__NameAlternatives_0_1_0");
					put(grammarAccess.getThf_rootAccess().getNameAlternatives_1_1_0(), "rule__Thf_root__NameAlternatives_1_1_0");
					put(grammarAccess.getThf_rootAccess().getFormula_roleAlternatives_1_3_0(), "rule__Thf_root__Formula_roleAlternatives_1_3_0");
					put(grammarAccess.getThf_formula_type_definitionAccess().getAlternatives(), "rule__Thf_formula_type_definition__Alternatives");
					put(grammarAccess.getThf_formula_type_definitionAccess().getNameAlternatives_1_0_0(), "rule__Thf_formula_type_definition__NameAlternatives_1_0_0");
					put(grammarAccess.getThf_terminal_type_expressionAccess().getAlternatives(), "rule__Thf_terminal_type_expression__Alternatives");
					put(grammarAccess.getThf_type_atomAccess().getAlternatives(), "rule__Thf_type_atom__Alternatives");
					put(grammarAccess.getThf_type_constantAccess().getNameAlternatives_0(), "rule__Thf_type_constant__NameAlternatives_0");
					put(grammarAccess.getThf_type_literalAccess().getNameAlternatives_0(), "rule__Thf_type_literal__NameAlternatives_0");
					put(grammarAccess.getThf_terminating_expressionAccess().getAlternatives(), "rule__Thf_terminating_expression__Alternatives");
					put(grammarAccess.getThf_unary_operatorAccess().getAlternatives(), "rule__Thf_unary_operator__Alternatives");
					put(grammarAccess.getThf_binary_operatorAccess().getAlternatives(), "rule__Thf_binary_operator__Alternatives");
					put(grammarAccess.getThf_atomAccess().getAlternatives(), "rule__Thf_atom__Alternatives");
					put(grammarAccess.getThf_atom_literalAccess().getNameAlternatives_0(), "rule__Thf_atom_literal__NameAlternatives_0");
					put(grammarAccess.getThf_constantAccess().getNameAlternatives_0_0(), "rule__Thf_constant__NameAlternatives_0_0");
					put(grammarAccess.getThf_quantifier_expressionAccess().getQuantifierAlternatives_0_0(), "rule__Thf_quantifier_expression__QuantifierAlternatives_0_0");
					put(grammarAccess.getBinary_operatorAccess().getAlternatives(), "rule__Binary_operator__Alternatives");
					put(grammarAccess.getLower_token_and_keywordAccess().getAlternatives(), "rule__Lower_token_and_keyword__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getIncludeAccess().getGroup(), "rule__Include__Group__0");
					put(grammarAccess.getFof_rootAccess().getGroup(), "rule__Fof_root__Group__0");
					put(grammarAccess.getFof_expressionAccess().getGroup(), "rule__Fof_expression__Group__0");
					put(grammarAccess.getFof_expressionAccess().getGroup_1(), "rule__Fof_expression__Group_1__0");
					put(grammarAccess.getFof_terminating_expressionAccess().getGroup_1(), "rule__Fof_terminating_expression__Group_1__0");
					put(grammarAccess.getFof_terminating_expressionAccess().getGroup_2(), "rule__Fof_terminating_expression__Group_2__0");
					put(grammarAccess.getFof_constantAccess().getGroup(), "rule__Fof_constant__Group__0");
					put(grammarAccess.getFof_constantAccess().getGroup_1(), "rule__Fof_constant__Group_1__0");
					put(grammarAccess.getFof_constantAccess().getGroup_1_2(), "rule__Fof_constant__Group_1_2__0");
					put(grammarAccess.getFof_quantifier_expressionAccess().getGroup(), "rule__Fof_quantifier_expression__Group__0");
					put(grammarAccess.getFof_variable_listAccess().getGroup(), "rule__Fof_variable_list__Group__0");
					put(grammarAccess.getFof_variable_listAccess().getGroup_1(), "rule__Fof_variable_list__Group_1__0");
					put(grammarAccess.getTff_rootAccess().getGroup_0(), "rule__Tff_root__Group_0__0");
					put(grammarAccess.getTff_rootAccess().getGroup_1(), "rule__Tff_root__Group_1__0");
					put(grammarAccess.getTff_formula_type_definitionAccess().getGroup_0(), "rule__Tff_formula_type_definition__Group_0__0");
					put(grammarAccess.getTff_formula_type_definitionAccess().getGroup_1(), "rule__Tff_formula_type_definition__Group_1__0");
					put(grammarAccess.getTff_type_expressionAccess().getGroup(), "rule__Tff_type_expression__Group__0");
					put(grammarAccess.getTff_type_expressionAccess().getGroup_1(), "rule__Tff_type_expression__Group_1__0");
					put(grammarAccess.getTff_terminal_type_expressionAccess().getGroup_1(), "rule__Tff_terminal_type_expression__Group_1__0");
					put(grammarAccess.getTff_type_constantAccess().getGroup(), "rule__Tff_type_constant__Group__0");
					put(grammarAccess.getTff_type_constantAccess().getGroup_1(), "rule__Tff_type_constant__Group_1__0");
					put(grammarAccess.getTff_type_constantAccess().getGroup_1_2(), "rule__Tff_type_constant__Group_1_2__0");
					put(grammarAccess.getTff_expressionAccess().getGroup(), "rule__Tff_expression__Group__0");
					put(grammarAccess.getTff_expressionAccess().getGroup_1(), "rule__Tff_expression__Group_1__0");
					put(grammarAccess.getTff_terminating_expressionAccess().getGroup_1(), "rule__Tff_terminating_expression__Group_1__0");
					put(grammarAccess.getTff_terminating_expressionAccess().getGroup_2(), "rule__Tff_terminating_expression__Group_2__0");
					put(grammarAccess.getTff_constantAccess().getGroup_0(), "rule__Tff_constant__Group_0__0");
					put(grammarAccess.getTff_constantAccess().getGroup_0_1(), "rule__Tff_constant__Group_0_1__0");
					put(grammarAccess.getTff_constantAccess().getGroup_0_1_2(), "rule__Tff_constant__Group_0_1_2__0");
					put(grammarAccess.getTff_constantAccess().getGroup_1(), "rule__Tff_constant__Group_1__0");
					put(grammarAccess.getTff_predefined_function_1_argsAccess().getGroup(), "rule__Tff_predefined_function_1_args__Group__0");
					put(grammarAccess.getTff_predefined_function_2_argsAccess().getGroup(), "rule__Tff_predefined_function_2_args__Group__0");
					put(grammarAccess.getTff_var_declarationAccess().getGroup(), "rule__Tff_var_declaration__Group__0");
					put(grammarAccess.getTff_quantifier_expressionAccess().getGroup(), "rule__Tff_quantifier_expression__Group__0");
					put(grammarAccess.getTff_type_quantifier_epressionAccess().getGroup(), "rule__Tff_type_quantifier_epression__Group__0");
					put(grammarAccess.getTff_variable_listAccess().getGroup(), "rule__Tff_variable_list__Group__0");
					put(grammarAccess.getTff_variable_listAccess().getGroup_1(), "rule__Tff_variable_list__Group_1__0");
					put(grammarAccess.getCnf_rootAccess().getGroup(), "rule__Cnf_root__Group__0");
					put(grammarAccess.getCnf_formula_type_definitionAccess().getGroup_0(), "rule__Cnf_formula_type_definition__Group_0__0");
					put(grammarAccess.getCnf_orAccess().getGroup(), "rule__Cnf_or__Group__0");
					put(grammarAccess.getCnf_orAccess().getGroup_1(), "rule__Cnf_or__Group_1__0");
					put(grammarAccess.getCnf_notAccess().getGroup(), "rule__Cnf_not__Group__0");
					put(grammarAccess.getCnf_equalityAccess().getGroup(), "rule__Cnf_equality__Group__0");
					put(grammarAccess.getCnf_equalityAccess().getGroup_1(), "rule__Cnf_equality__Group_1__0");
					put(grammarAccess.getCnf_constantAccess().getGroup(), "rule__Cnf_constant__Group__0");
					put(grammarAccess.getCnf_constantAccess().getGroup_1(), "rule__Cnf_constant__Group_1__0");
					put(grammarAccess.getCnf_constantAccess().getGroup_1_2(), "rule__Cnf_constant__Group_1_2__0");
					put(grammarAccess.getThf_rootAccess().getGroup_0(), "rule__Thf_root__Group_0__0");
					put(grammarAccess.getThf_rootAccess().getGroup_1(), "rule__Thf_root__Group_1__0");
					put(grammarAccess.getThf_formula_type_definitionAccess().getGroup_0(), "rule__Thf_formula_type_definition__Group_0__0");
					put(grammarAccess.getThf_formula_type_definitionAccess().getGroup_1(), "rule__Thf_formula_type_definition__Group_1__0");
					put(grammarAccess.getThf_type_expressionAccess().getGroup(), "rule__Thf_type_expression__Group__0");
					put(grammarAccess.getThf_type_expressionAccess().getGroup_1(), "rule__Thf_type_expression__Group_1__0");
					put(grammarAccess.getThf_terminal_type_expressionAccess().getGroup_1(), "rule__Thf_terminal_type_expression__Group_1__0");
					put(grammarAccess.getThf_expressionAccess().getGroup(), "rule__Thf_expression__Group__0");
					put(grammarAccess.getThf_expressionAccess().getGroup_1(), "rule__Thf_expression__Group_1__0");
					put(grammarAccess.getThf_terminating_expressionAccess().getGroup_1(), "rule__Thf_terminating_expression__Group_1__0");
					put(grammarAccess.getThf_terminating_expressionAccess().getGroup_2(), "rule__Thf_terminating_expression__Group_2__0");
					put(grammarAccess.getThf_terminating_expressionAccess().getGroup_3(), "rule__Thf_terminating_expression__Group_3__0");
					put(grammarAccess.getThf_constantAccess().getGroup(), "rule__Thf_constant__Group__0");
					put(grammarAccess.getThf_constantAccess().getGroup_1(), "rule__Thf_constant__Group_1__0");
					put(grammarAccess.getThf_constantAccess().getGroup_1_2(), "rule__Thf_constant__Group_1_2__0");
					put(grammarAccess.getThf_quantifier_expressionAccess().getGroup(), "rule__Thf_quantifier_expression__Group__0");
					put(grammarAccess.getThf_variable_listAccess().getGroup(), "rule__Thf_variable_list__Group__0");
					put(grammarAccess.getThf_variable_listAccess().getGroup_1(), "rule__Thf_variable_list__Group_1__0");
					put(grammarAccess.getThf_var_declarationAccess().getGroup(), "rule__Thf_var_declaration__Group__0");
					put(grammarAccess.getModelAccess().getTPTP_inputAssignment_0(), "rule__Model__TPTP_inputAssignment_0");
					put(grammarAccess.getModelAccess().getTPTP_inputAssignment_1_0(), "rule__Model__TPTP_inputAssignment_1_0");
					put(grammarAccess.getModelAccess().getTPTP_inputAssignment_1_1(), "rule__Model__TPTP_inputAssignment_1_1");
					put(grammarAccess.getModelAccess().getTPTP_inputAssignment_1_2(), "rule__Model__TPTP_inputAssignment_1_2");
					put(grammarAccess.getModelAccess().getTPTP_inputAssignment_1_3(), "rule__Model__TPTP_inputAssignment_1_3");
					put(grammarAccess.getIncludeAccess().getPathAssignment_1(), "rule__Include__PathAssignment_1");
					put(grammarAccess.getFof_rootAccess().getNameAssignment_1(), "rule__Fof_root__NameAssignment_1");
					put(grammarAccess.getFof_rootAccess().getFormula_roleAssignment_3(), "rule__Fof_root__Formula_roleAssignment_3");
					put(grammarAccess.getFof_rootAccess().getExpAssignment_5(), "rule__Fof_root__ExpAssignment_5");
					put(grammarAccess.getFof_expressionAccess().getOpAssignment_1_1(), "rule__Fof_expression__OpAssignment_1_1");
					put(grammarAccess.getFof_expressionAccess().getRightAssignment_1_2(), "rule__Fof_expression__RightAssignment_1_2");
					put(grammarAccess.getFof_terminating_expressionAccess().getFof_atomAssignment_0(), "rule__Fof_terminating_expression__Fof_atomAssignment_0");
					put(grammarAccess.getFof_terminating_expressionAccess().getFof_negationAssignment_2_0(), "rule__Fof_terminating_expression__Fof_negationAssignment_2_0");
					put(grammarAccess.getFof_terminating_expressionAccess().getFof_expAssignment_2_1(), "rule__Fof_terminating_expression__Fof_expAssignment_2_1");
					put(grammarAccess.getFof_terminating_expressionAccess().getFof_expAssignment_3(), "rule__Fof_terminating_expression__Fof_expAssignment_3");
					put(grammarAccess.getFof_atom_literalAccess().getNameAssignment(), "rule__Fof_atom_literal__NameAssignment");
					put(grammarAccess.getFof_constantAccess().getNameAssignment_0(), "rule__Fof_constant__NameAssignment_0");
					put(grammarAccess.getFof_constantAccess().getFof_paramAssignment_1_1(), "rule__Fof_constant__Fof_paramAssignment_1_1");
					put(grammarAccess.getFof_constantAccess().getFof_paramAssignment_1_2_1(), "rule__Fof_constant__Fof_paramAssignment_1_2_1");
					put(grammarAccess.getFof_varAccess().getNameAssignment(), "rule__Fof_var__NameAssignment");
					put(grammarAccess.getFof_quantifier_expressionAccess().getFof_quantifierAssignment_0(), "rule__Fof_quantifier_expression__Fof_quantifierAssignment_0");
					put(grammarAccess.getFof_quantifier_expressionAccess().getFof_paramAssignment_2(), "rule__Fof_quantifier_expression__Fof_paramAssignment_2");
					put(grammarAccess.getFof_quantifier_expressionAccess().getFof_expAssignment_5(), "rule__Fof_quantifier_expression__Fof_expAssignment_5");
					put(grammarAccess.getFof_variable_listAccess().getParamsAssignment_0(), "rule__Fof_variable_list__ParamsAssignment_0");
					put(grammarAccess.getFof_variable_listAccess().getParamsAssignment_1_1(), "rule__Fof_variable_list__ParamsAssignment_1_1");
					put(grammarAccess.getTff_rootAccess().getNameAssignment_0_1(), "rule__Tff_root__NameAssignment_0_1");
					put(grammarAccess.getTff_rootAccess().getFormula_roleAssignment_0_3(), "rule__Tff_root__Formula_roleAssignment_0_3");
					put(grammarAccess.getTff_rootAccess().getExpAssignment_0_5(), "rule__Tff_root__ExpAssignment_0_5");
					put(grammarAccess.getTff_rootAccess().getNameAssignment_1_1(), "rule__Tff_root__NameAssignment_1_1");
					put(grammarAccess.getTff_rootAccess().getFormula_roleAssignment_1_3(), "rule__Tff_root__Formula_roleAssignment_1_3");
					put(grammarAccess.getTff_rootAccess().getDefAssignment_1_5(), "rule__Tff_root__DefAssignment_1_5");
					put(grammarAccess.getTff_formula_type_definitionAccess().getNameAssignment_1_0_0(), "rule__Tff_formula_type_definition__NameAssignment_1_0_0");
					put(grammarAccess.getTff_formula_type_definitionAccess().getNameAssignment_1_0_1(), "rule__Tff_formula_type_definition__NameAssignment_1_0_1");
					put(grammarAccess.getTff_formula_type_definitionAccess().getExpAssignment_1_2(), "rule__Tff_formula_type_definition__ExpAssignment_1_2");
					put(grammarAccess.getTff_type_expressionAccess().getOpAssignment_1_1(), "rule__Tff_type_expression__OpAssignment_1_1");
					put(grammarAccess.getTff_type_expressionAccess().getRightAssignment_1_2(), "rule__Tff_type_expression__RightAssignment_1_2");
					put(grammarAccess.getTff_type_constantAccess().getNameAssignment_0(), "rule__Tff_type_constant__NameAssignment_0");
					put(grammarAccess.getTff_type_constantAccess().getParamAssignment_1_1(), "rule__Tff_type_constant__ParamAssignment_1_1");
					put(grammarAccess.getTff_type_constantAccess().getParamAssignment_1_2_1(), "rule__Tff_type_constant__ParamAssignment_1_2_1");
					put(grammarAccess.getTff_type_literalAccess().getNameAssignment(), "rule__Tff_type_literal__NameAssignment");
					put(grammarAccess.getTff_expressionAccess().getOpAssignment_1_1(), "rule__Tff_expression__OpAssignment_1_1");
					put(grammarAccess.getTff_expressionAccess().getRightAssignment_1_2(), "rule__Tff_expression__RightAssignment_1_2");
					put(grammarAccess.getTff_terminating_expressionAccess().getAtomAssignment_0(), "rule__Tff_terminating_expression__AtomAssignment_0");
					put(grammarAccess.getTff_terminating_expressionAccess().getNegationAssignment_2_0(), "rule__Tff_terminating_expression__NegationAssignment_2_0");
					put(grammarAccess.getTff_terminating_expressionAccess().getExpAssignment_2_1(), "rule__Tff_terminating_expression__ExpAssignment_2_1");
					put(grammarAccess.getTff_terminating_expressionAccess().getExpAssignment_3(), "rule__Tff_terminating_expression__ExpAssignment_3");
					put(grammarAccess.getTff_constantAccess().getNameAssignment_0_0(), "rule__Tff_constant__NameAssignment_0_0");
					put(grammarAccess.getTff_constantAccess().getParamAssignment_0_1_1(), "rule__Tff_constant__ParamAssignment_0_1_1");
					put(grammarAccess.getTff_constantAccess().getParamAssignment_0_1_2_1(), "rule__Tff_constant__ParamAssignment_0_1_2_1");
					put(grammarAccess.getTff_constantAccess().getTopAssignment_1_0(), "rule__Tff_constant__TopAssignment_1_0");
					put(grammarAccess.getTff_constantAccess().getNameAssignment_1_1(), "rule__Tff_constant__NameAssignment_1_1");
					put(grammarAccess.getTff_constantAccess().getBottomAssignment_1_2(), "rule__Tff_constant__BottomAssignment_1_2");
					put(grammarAccess.getTff_atom_literalAccess().getNameAssignment(), "rule__Tff_atom_literal__NameAssignment");
					put(grammarAccess.getTff_predefined_function_1_argsAccess().getNameAssignment_0(), "rule__Tff_predefined_function_1_args__NameAssignment_0");
					put(grammarAccess.getTff_predefined_function_1_argsAccess().getParamAssignment_2(), "rule__Tff_predefined_function_1_args__ParamAssignment_2");
					put(grammarAccess.getTff_predefined_function_2_argsAccess().getFuncAssignment_0(), "rule__Tff_predefined_function_2_args__FuncAssignment_0");
					put(grammarAccess.getTff_predefined_function_2_argsAccess().getParamAssignment_2(), "rule__Tff_predefined_function_2_args__ParamAssignment_2");
					put(grammarAccess.getTff_predefined_function_2_argsAccess().getParamAssignment_4(), "rule__Tff_predefined_function_2_args__ParamAssignment_4");
					put(grammarAccess.getTff_varAccess().getNameAssignment(), "rule__Tff_var__NameAssignment");
					put(grammarAccess.getTff_var_declarationAccess().getVarAssignment_0(), "rule__Tff_var_declaration__VarAssignment_0");
					put(grammarAccess.getTff_var_declarationAccess().getVartypeAssignment_2(), "rule__Tff_var_declaration__VartypeAssignment_2");
					put(grammarAccess.getTff_quantifier_expressionAccess().getQuantifierAssignment_0(), "rule__Tff_quantifier_expression__QuantifierAssignment_0");
					put(grammarAccess.getTff_quantifier_expressionAccess().getParamAssignment_2(), "rule__Tff_quantifier_expression__ParamAssignment_2");
					put(grammarAccess.getTff_quantifier_expressionAccess().getExpAssignment_5(), "rule__Tff_quantifier_expression__ExpAssignment_5");
					put(grammarAccess.getTff_type_quantifier_epressionAccess().getQuantifierAssignment_0(), "rule__Tff_type_quantifier_epression__QuantifierAssignment_0");
					put(grammarAccess.getTff_type_quantifier_epressionAccess().getParamAssignment_2(), "rule__Tff_type_quantifier_epression__ParamAssignment_2");
					put(grammarAccess.getTff_type_quantifier_epressionAccess().getExpAssignment_5(), "rule__Tff_type_quantifier_epression__ExpAssignment_5");
					put(grammarAccess.getTff_variable_listAccess().getParamsAssignment_0(), "rule__Tff_variable_list__ParamsAssignment_0");
					put(grammarAccess.getTff_variable_listAccess().getParamsAssignment_1_1(), "rule__Tff_variable_list__ParamsAssignment_1_1");
					put(grammarAccess.getCnf_rootAccess().getNameAssignment_1(), "rule__Cnf_root__NameAssignment_1");
					put(grammarAccess.getCnf_rootAccess().getFormula_roleAssignment_3(), "rule__Cnf_root__Formula_roleAssignment_3");
					put(grammarAccess.getCnf_rootAccess().getExpAssignment_5(), "rule__Cnf_root__ExpAssignment_5");
					put(grammarAccess.getCnf_formula_type_definitionAccess().getDisjunctionAssignment_0_1(), "rule__Cnf_formula_type_definition__DisjunctionAssignment_0_1");
					put(grammarAccess.getCnf_formula_type_definitionAccess().getDisjunctionAssignment_1(), "rule__Cnf_formula_type_definition__DisjunctionAssignment_1");
					put(grammarAccess.getCnf_orAccess().getOrAssignment_0(), "rule__Cnf_or__OrAssignment_0");
					put(grammarAccess.getCnf_orAccess().getOrAssignment_1_1(), "rule__Cnf_or__OrAssignment_1_1");
					put(grammarAccess.getCnf_notAccess().getNegatedAssignment_0(), "rule__Cnf_not__NegatedAssignment_0");
					put(grammarAccess.getCnf_notAccess().getLiteralAssignment_1(), "rule__Cnf_not__LiteralAssignment_1");
					put(grammarAccess.getCnf_equalityAccess().getExpLAssignment_0(), "rule__Cnf_equality__ExpLAssignment_0");
					put(grammarAccess.getCnf_equalityAccess().getEqAssignment_1_0(), "rule__Cnf_equality__EqAssignment_1_0");
					put(grammarAccess.getCnf_equalityAccess().getExpRAssignment_1_1(), "rule__Cnf_equality__ExpRAssignment_1_1");
					put(grammarAccess.getCnf_expressionAccess().getCnf_expAssignment_2(), "rule__Cnf_expression__Cnf_expAssignment_2");
					put(grammarAccess.getCnf_constantAccess().getNameAssignment_0(), "rule__Cnf_constant__NameAssignment_0");
					put(grammarAccess.getCnf_constantAccess().getParamAssignment_1_1(), "rule__Cnf_constant__ParamAssignment_1_1");
					put(grammarAccess.getCnf_constantAccess().getParamAssignment_1_2_1(), "rule__Cnf_constant__ParamAssignment_1_2_1");
					put(grammarAccess.getCnf_varAccess().getNameAssignment(), "rule__Cnf_var__NameAssignment");
					put(grammarAccess.getThf_rootAccess().getNameAssignment_0_1(), "rule__Thf_root__NameAssignment_0_1");
					put(grammarAccess.getThf_rootAccess().getFormula_roleAssignment_0_3(), "rule__Thf_root__Formula_roleAssignment_0_3");
					put(grammarAccess.getThf_rootAccess().getDefAssignment_0_5(), "rule__Thf_root__DefAssignment_0_5");
					put(grammarAccess.getThf_rootAccess().getNameAssignment_1_1(), "rule__Thf_root__NameAssignment_1_1");
					put(grammarAccess.getThf_rootAccess().getFormula_roleAssignment_1_3(), "rule__Thf_root__Formula_roleAssignment_1_3");
					put(grammarAccess.getThf_rootAccess().getThf_expAssignment_1_5(), "rule__Thf_root__Thf_expAssignment_1_5");
					put(grammarAccess.getThf_formula_type_definitionAccess().getNameAssignment_1_0(), "rule__Thf_formula_type_definition__NameAssignment_1_0");
					put(grammarAccess.getThf_formula_type_definitionAccess().getExpAssignment_1_2(), "rule__Thf_formula_type_definition__ExpAssignment_1_2");
					put(grammarAccess.getThf_type_expressionAccess().getOpAssignment_1_1(), "rule__Thf_type_expression__OpAssignment_1_1");
					put(grammarAccess.getThf_type_expressionAccess().getRightAssignment_1_2(), "rule__Thf_type_expression__RightAssignment_1_2");
					put(grammarAccess.getThf_type_constantAccess().getNameAssignment(), "rule__Thf_type_constant__NameAssignment");
					put(grammarAccess.getThf_type_literalAccess().getNameAssignment(), "rule__Thf_type_literal__NameAssignment");
					put(grammarAccess.getThf_expressionAccess().getOpAssignment_1_1(), "rule__Thf_expression__OpAssignment_1_1");
					put(grammarAccess.getThf_expressionAccess().getRightAssignment_1_2(), "rule__Thf_expression__RightAssignment_1_2");
					put(grammarAccess.getThf_terminating_expressionAccess().getThf_atomAssignment_0(), "rule__Thf_terminating_expression__Thf_atomAssignment_0");
					put(grammarAccess.getThf_terminating_expressionAccess().getThf_negationAssignment_2_0(), "rule__Thf_terminating_expression__Thf_negationAssignment_2_0");
					put(grammarAccess.getThf_terminating_expressionAccess().getThf_expAssignment_2_1(), "rule__Thf_terminating_expression__Thf_expAssignment_2_1");
					put(grammarAccess.getThf_terminating_expressionAccess().getOpAssignment_3_0(), "rule__Thf_terminating_expression__OpAssignment_3_0");
					put(grammarAccess.getThf_terminating_expressionAccess().getThf_expAssignment_3_1(), "rule__Thf_terminating_expression__Thf_expAssignment_3_1");
					put(grammarAccess.getThf_terminating_expressionAccess().getThf_expAssignment_4(), "rule__Thf_terminating_expression__Thf_expAssignment_4");
					put(grammarAccess.getThf_atom_literalAccess().getNameAssignment(), "rule__Thf_atom_literal__NameAssignment");
					put(grammarAccess.getThf_constantAccess().getNameAssignment_0(), "rule__Thf_constant__NameAssignment_0");
					put(grammarAccess.getThf_constantAccess().getThf_paramAssignment_1_1(), "rule__Thf_constant__Thf_paramAssignment_1_1");
					put(grammarAccess.getThf_constantAccess().getThf_paramAssignment_1_2_1(), "rule__Thf_constant__Thf_paramAssignment_1_2_1");
					put(grammarAccess.getThf_varAccess().getNameAssignment(), "rule__Thf_var__NameAssignment");
					put(grammarAccess.getThf_quantifier_expressionAccess().getQuantifierAssignment_0(), "rule__Thf_quantifier_expression__QuantifierAssignment_0");
					put(grammarAccess.getThf_quantifier_expressionAccess().getParamAssignment_2(), "rule__Thf_quantifier_expression__ParamAssignment_2");
					put(grammarAccess.getThf_quantifier_expressionAccess().getExpAssignment_5(), "rule__Thf_quantifier_expression__ExpAssignment_5");
					put(grammarAccess.getThf_variable_listAccess().getParamsAssignment_0(), "rule__Thf_variable_list__ParamsAssignment_0");
					put(grammarAccess.getThf_variable_listAccess().getParamsAssignment_1_1(), "rule__Thf_variable_list__ParamsAssignment_1_1");
					put(grammarAccess.getThf_var_declarationAccess().getVarAssignment_0(), "rule__Thf_var_declaration__VarAssignment_0");
					put(grammarAccess.getThf_var_declarationAccess().getVartypeAssignment_2(), "rule__Thf_var_declaration__VartypeAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public TPTPGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TPTPGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
