/**
 */
package Ceffective;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recurso</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Ceffective.Recurso#getNombre <em>Nombre</em>}</li>
 *   <li>{@link Ceffective.Recurso#getRecursos <em>Recursos</em>}</li>
 *   <li>{@link Ceffective.Recurso#getVpc <em>Vpc</em>}</li>
 *   <li>{@link Ceffective.Recurso#getZonaDisponibilidad <em>Zona Disponibilidad</em>}</li>
 *   <li>{@link Ceffective.Recurso#getZonaNombre <em>Zona Nombre</em>}</li>
 * </ul>
 *
 * @see Ceffective.CeffectivePackage#getRecurso()
 * @model abstract="true"
 * @generated
 */
public interface Recurso extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see Ceffective.CeffectivePackage#getRecurso_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link Ceffective.Recurso#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Recursos</b></em>' reference list.
	 * The list contents are of type {@link Ceffective.Recurso}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recursos</em>' reference list.
	 * @see Ceffective.CeffectivePackage#getRecurso_Recursos()
	 * @model
	 * @generated
	 */
	EList<Recurso> getRecursos();

	/**
	 * Returns the value of the '<em><b>Vpc</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Ceffective.VPC#getRecurso <em>Recurso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc</em>' reference.
	 * @see #setVpc(VPC)
	 * @see Ceffective.CeffectivePackage#getRecurso_Vpc()
	 * @see Ceffective.VPC#getRecurso
	 * @model opposite="recurso"
	 * @generated
	 */
	VPC getVpc();

	/**
	 * Sets the value of the '{@link Ceffective.Recurso#getVpc <em>Vpc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpc</em>' reference.
	 * @see #getVpc()
	 * @generated
	 */
	void setVpc(VPC value);

	/**
	 * Returns the value of the '<em><b>Zona Disponibilidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zona Disponibilidad</em>' attribute.
	 * @see #setZonaDisponibilidad(String)
	 * @see Ceffective.CeffectivePackage#getRecurso_ZonaDisponibilidad()
	 * @model
	 * @generated
	 */
	String getZonaDisponibilidad();

	/**
	 * Sets the value of the '{@link Ceffective.Recurso#getZonaDisponibilidad <em>Zona Disponibilidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zona Disponibilidad</em>' attribute.
	 * @see #getZonaDisponibilidad()
	 * @generated
	 */
	void setZonaDisponibilidad(String value);

	/**
	 * Returns the value of the '<em><b>Zona Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zona Nombre</em>' attribute.
	 * @see #setZonaNombre(String)
	 * @see Ceffective.CeffectivePackage#getRecurso_ZonaNombre()
	 * @model
	 * @generated
	 */
	String getZonaNombre();

	/**
	 * Sets the value of the '{@link Ceffective.Recurso#getZonaNombre <em>Zona Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zona Nombre</em>' attribute.
	 * @see #getZonaNombre()
	 * @generated
	 */
	void setZonaNombre(String value);

} // Recurso
