/**
 */
package ceffective;

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
 *   <li>{@link ceffective.MecanismoSeguridad#getNombre <em>Nombre</em>}</li>
 *   <li>{@link ceffective.MecanismoSeguridad#getZonaNombre <em>Zona Nombre</em>}</li>
 *   <li>{@link ceffective.MecanismoSeguridad#getZonaDisponibilidad <em>Zona Disponibilidad</em>}</li>
 * </ul>
 *
 * @see ceffective.CeffectivePackage#getMecanismoSeguridad()
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
	 * @see ceffective.CeffectivePackage#getMecanismoSeguridad_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link ceffective.MecanismoSeguridad#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Zona Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zona Nombre</em>' attribute.
	 * @see #setZonaNombre(String)
	 * @see ceffective.CeffectivePackage#getMecanismoSeguridad_ZonaNombre()
	 * @model
	 * @generated
	 */
	String getZonaNombre();

	/**
	 * Sets the value of the '{@link ceffective.MecanismoSeguridad#getZonaNombre <em>Zona Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zona Nombre</em>' attribute.
	 * @see #getZonaNombre()
	 * @generated
	 */
	void setZonaNombre(String value);

	/**
	 * Returns the value of the '<em><b>Zona Disponibilidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zona Disponibilidad</em>' attribute.
	 * @see #setZonaDisponibilidad(String)
	 * @see ceffective.CeffectivePackage#getMecanismoSeguridad_ZonaDisponibilidad()
	 * @model
	 * @generated
	 */
	String getZonaDisponibilidad();

	/**
	 * Sets the value of the '{@link ceffective.MecanismoSeguridad#getZonaDisponibilidad <em>Zona Disponibilidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zona Disponibilidad</em>' attribute.
	 * @see #getZonaDisponibilidad()
	 * @generated
	 */
	void setZonaDisponibilidad(String value);

} // MecanismoSeguridad
