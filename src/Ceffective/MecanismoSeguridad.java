/**
 */
package Ceffective;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mecanismo Seguridad</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Ceffective.MecanismoSeguridad#getNombre <em>Nombre</em>}</li>
 * </ul>
 *
 * @see Ceffective.CeffectivePackage#getMecanismoSeguridad()
 * @model abstract="true"
 * @generated
 */
public interface MecanismoSeguridad extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see Ceffective.CeffectivePackage#getMecanismoSeguridad_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link Ceffective.MecanismoSeguridad#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

} // MecanismoSeguridad
