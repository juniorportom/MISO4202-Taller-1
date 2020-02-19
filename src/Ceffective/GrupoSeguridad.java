/**
 */
package Ceffective;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grupo Seguridad</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Ceffective.GrupoSeguridad#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link Ceffective.GrupoSeguridad#getZonaDisponibilidad <em>Zona Disponibilidad</em>}</li>
 *   <li>{@link Ceffective.GrupoSeguridad#getReglasSalida <em>Reglas Salida</em>}</li>
 *   <li>{@link Ceffective.GrupoSeguridad#getReglasEntrada <em>Reglas Entrada</em>}</li>
 * </ul>
 *
 * @see Ceffective.CeffectivePackage#getGrupoSeguridad()
 * @model
 * @generated
 */
public interface GrupoSeguridad extends MecanismoSeguridad {
	/**
	 * Returns the value of the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descripcion</em>' attribute.
	 * @see #setDescripcion(String)
	 * @see Ceffective.CeffectivePackage#getGrupoSeguridad_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link Ceffective.GrupoSeguridad#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

	/**
	 * Returns the value of the '<em><b>Zona Disponibilidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zona Disponibilidad</em>' attribute.
	 * @see #setZonaDisponibilidad(String)
	 * @see Ceffective.CeffectivePackage#getGrupoSeguridad_ZonaDisponibilidad()
	 * @model
	 * @generated
	 */
	String getZonaDisponibilidad();

	/**
	 * Sets the value of the '{@link Ceffective.GrupoSeguridad#getZonaDisponibilidad <em>Zona Disponibilidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zona Disponibilidad</em>' attribute.
	 * @see #getZonaDisponibilidad()
	 * @generated
	 */
	void setZonaDisponibilidad(String value);

	/**
	 * Returns the value of the '<em><b>Reglas Salida</b></em>' containment reference list.
	 * The list contents are of type {@link Ceffective.Regla}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reglas Salida</em>' containment reference list.
	 * @see Ceffective.CeffectivePackage#getGrupoSeguridad_ReglasSalida()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Regla> getReglasSalida();

	/**
	 * Returns the value of the '<em><b>Reglas Entrada</b></em>' containment reference list.
	 * The list contents are of type {@link Ceffective.Regla}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reglas Entrada</em>' containment reference list.
	 * @see Ceffective.CeffectivePackage#getGrupoSeguridad_ReglasEntrada()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Regla> getReglasEntrada();

} // GrupoSeguridad
