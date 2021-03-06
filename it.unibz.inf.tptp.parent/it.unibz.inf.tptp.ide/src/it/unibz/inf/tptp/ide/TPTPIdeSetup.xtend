/*
 * generated by Xtext 2.12.0
 */
package it.unibz.inf.tptp.ide

import com.google.inject.Guice
import it.unibz.inf.tptp.TPTPRuntimeModule
import it.unibz.inf.tptp.TPTPStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class TPTPIdeSetup extends TPTPStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new TPTPRuntimeModule, new TPTPIdeModule))
	}
	
}
