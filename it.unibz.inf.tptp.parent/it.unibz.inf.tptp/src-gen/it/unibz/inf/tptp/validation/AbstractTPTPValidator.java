/*
 * generated by Xtext 2.12.0
 */
package it.unibz.inf.tptp.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractTPTPValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(it.unibz.inf.tptp.parser.ParserPackage.eINSTANCE);
		return result;
	}
	
}