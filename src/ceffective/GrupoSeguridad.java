/**
 */
package ceffective;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grupo Seguridad</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ceffective.GrupoSeguridad#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link ceffective.GrupoSeguridad#getReglas <em>Reglas</em>}</li>
 * </ul>
 * </p>
 *
 * @see ceffective.CeffectivePackage#getGrupoSeguridad()
 * @model
 * @generated
 */
public interface GrupoSeguridad extends MecanismoSeguridad {
	/**
	 * Returns the value of the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descripcion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descripcion</em>' attribute.
	 * @see #setDescripcion(String)
	 * @see ceffective.CeffectivePackage#getGrupoSeguridad_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link ceffective.GrupoSeguridad#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

	/**
	 * Returns the value of the '<em><b>Reglas</b></em>' reference list.
	 * The list contents are of type {@link ceffective.Regla}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reglas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reglas</em>' reference list.
	 * @see ceffective.CeffectivePackage#getGrupoSeguridad_Reglas()
	 * @model required="true"
	 * @generated
	 */
	EList<Regla> getReglas();

} // GrupoSeguridad
