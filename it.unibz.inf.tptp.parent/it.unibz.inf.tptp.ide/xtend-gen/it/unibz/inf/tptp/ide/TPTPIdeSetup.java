/**
 * generated by Xtext 2.12.0
 */
package it.unibz.inf.tptp.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import it.unibz.inf.tptp.TPTPRuntimeModule;
import it.unibz.inf.tptp.TPTPStandaloneSetup;
import it.unibz.inf.tptp.ide.TPTPIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class TPTPIdeSetup extends TPTPStandaloneSetup {
  @Override
  public Injector createInjector() {
    TPTPRuntimeModule _tPTPRuntimeModule = new TPTPRuntimeModule();
    TPTPIdeModule _tPTPIdeModule = new TPTPIdeModule();
    return Guice.createInjector(Modules2.mixin(_tPTPRuntimeModule, _tPTPIdeModule));
  }
}