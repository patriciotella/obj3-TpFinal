/*
 * generated by Xtext
 */
package textVerduler.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractTextVerdulerValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(textVerduler.textVerduler.TextVerdulerPackage.eINSTANCE);
		return result;
	}
}
