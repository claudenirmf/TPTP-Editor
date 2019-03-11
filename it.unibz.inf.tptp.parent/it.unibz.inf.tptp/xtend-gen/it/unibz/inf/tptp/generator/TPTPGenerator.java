/**
 * generated by Xtext 2.12.0
 */
package it.unibz.inf.tptp.generator;

import com.google.inject.Inject;
import it.unibz.inf.tptp.parser.Include;
import it.unibz.inf.tptp.parser.Model;
import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.function.Consumer;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class TPTPGenerator extends AbstractGenerator {
  @Inject
  private XtextResourceSet xrs;
  
  private final static String URIPrefix = "platform:/resource/";
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final URI resolvedFile = CommonPlugin.resolve(resource.getURI());
    IWorkspaceRoot _root = ResourcesPlugin.getWorkspace().getRoot();
    String _fileString = resolvedFile.toFileString();
    Path _path = new Path(_fileString);
    final File resourceFile = _root.getFile(_path).getFullPath().toFile();
    final File parentFolder = resourceFile.getParentFile();
    final LinkedList<File> files = new LinkedList<File>();
    boolean _isEmpty = resource.getContents().isEmpty();
    if (_isEmpty) {
      return;
    }
    files.add(resourceFile);
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    final Consumer<EObject> _function = (EObject it) -> {
      try {
        if ((it instanceof Include)) {
          String _canonicalPath = parentFolder.getCanonicalPath();
          String _plus = (_canonicalPath + File.separator);
          String _path_1 = ((Include)it).getPath();
          String _plus_1 = (_plus + _path_1);
          File _file = new File(_plus_1);
          files.add(_file);
        }
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    };
    ((Model) _head).getTPTP_input().forEach(_function);
    final StringBuilder output = new StringBuilder();
    final Consumer<File> _function_1 = (File file) -> {
      try {
        if (((!file.exists()) || file.isDirectory())) {
          return;
        }
        final Scanner reader = new Scanner(file);
        String _name = file.getName();
        String _plus = ("% Statements from file " + _name);
        String _plus_1 = (_plus + "\n");
        output.append(_plus_1);
        output.append("% ------------------------------------------\n\n");
        while (reader.hasNextLine()) {
          String _nextLine = reader.nextLine();
          String _plus_2 = (_nextLine + "\n");
          output.append(_plus_2);
        }
        output.append("\n");
        reader.close();
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    };
    files.forEach(_function_1);
    String _name = resourceFile.getName();
    int _length = resourceFile.getName().length();
    int _minus = (_length - 2);
    String _substring = _name.substring(0, _minus);
    String _plus = (_substring + ".txt");
    fsa.generateFile(_plus, output);
  }
}