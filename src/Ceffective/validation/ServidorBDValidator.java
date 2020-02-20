/**
 *
 * $Id$
 */
package ceffective.validation;

import ceffective.TipoBaseDatos;

/**
 * A sample validator interface for {@link ceffective.ServidorBD}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ServidorBDValidator {
	boolean validate();

	boolean validateTipo(TipoBaseDatos value);
	boolean validateSistemaManejador(String value);
}
