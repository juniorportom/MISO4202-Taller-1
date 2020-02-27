/**
 */
package ceffective;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ambiente Despliegue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ceffective.AmbienteDespliegue#getAmbiente <em>Ambiente</em>}</li>
 *   <li>{@link ceffective.AmbienteDespliegue#getRecursos <em>Recursos</em>}</li>
 *   <li>{@link ceffective.AmbienteDespliegue#getVpc <em>Vpc</em>}</li>
 *   <li>{@link ceffective.AmbienteDespliegue#getMecanismoseguridad <em>Mecanismoseguridad</em>}</li>
 *   <li>{@link ceffective.AmbienteDespliegue#getNombre <em>Nombre</em>}</li>
 * </ul>
 * </p>
 *
 * @see ceffective.CeffectivePackage#getAmbienteDespliegue()
 * @model
 * @generated
 */
public interface AmbienteDespliegue extends EObject {
	/**
	 * Returns the value of the '<em><b>Ambiente</b></em>' attribute.
	 * The default value is <code>"IST"</code>.
	 * The literals are from the enumeration {@link ceffective.TipoAmbiente}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ambiente</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ambiente</em>' attribute.
	 * @see ceffective.TipoAmbiente
	 * @see #setAmbiente(TipoAmbiente)
	 * @see ceffective.CeffectivePackage#getAmbienteDespliegue_Ambiente()
	 * @model default="IST"
	 * @generated
	 */
	TipoAmbiente getAmbiente();

	/**
	 * Sets the value of the '{@link ceffective.AmbienteDespliegue#getAmbiente <em>Ambiente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ambiente</em>' attribute.
	 * @see ceffective.TipoAmbiente
	 * @see #getAmbiente()
	 * @generated
	 */
	void setAmbiente(TipoAmbiente value);

	/**
	 * Returns the value of the '<em><b>Recursos</b></em>' reference list.
	 * The list contents are of type {@link ceffective.Recurso}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recursos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recursos</em>' reference list.
	 * @see ceffective.CeffectivePackage#getAmbienteDespliegue_Recursos()
	 * @model
	 * @generated
	 */
	EList<Recurso> getRecursos();

	/**
	 * Returns the value of the '<em><b>Vpc</b></em>' reference list.
	 * The list contents are of type {@link ceffective.VPC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vpc</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc</em>' reference list.
	 * @see ceffective.CeffectivePackage#getAmbienteDespliegue_Vpc()
	 * @model
	 * @generated
	 */
	EList<VPC> getVpc();

	/**
	 * Returns the value of the '<em><b>Mecanismoseguridad</b></em>' containment reference list.
	 * The list contents are of type {@link ceffective.MecanismoSeguridad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mecanismoseguridad</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mecanismoseguridad</em>' containment reference list.
	 * @see ceffective.CeffectivePackage#getAmbienteDespliegue_Mecanismoseguridad()
	 * @model containment="true"
	 * @generated
	 */
	EList<MecanismoSeguridad> getMecanismoseguridad();

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see ceffective.CeffectivePackage#getAmbienteDespliegue_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link ceffective.AmbienteDespliegue#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

} // AmbienteDespliegue
