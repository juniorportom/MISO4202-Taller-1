/**
 */
package Ceffective;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ambiente Despliegue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Ceffective.AmbienteDespliegue#getAmbiente <em>Ambiente</em>}</li>
 *   <li>{@link Ceffective.AmbienteDespliegue#getRecursos <em>Recursos</em>}</li>
 * </ul>
 *
 * @see Ceffective.CeffectivePackage#getAmbienteDespliegue()
 * @model
 * @generated
 */
public interface AmbienteDespliegue extends EObject {
	/**
	 * Returns the value of the '<em><b>Ambiente</b></em>' attribute.
	 * The default value is <code>"IST"</code>.
	 * The literals are from the enumeration {@link Ceffective.TipoAmbiente}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ambiente</em>' attribute.
	 * @see Ceffective.TipoAmbiente
	 * @see #setAmbiente(TipoAmbiente)
	 * @see Ceffective.CeffectivePackage#getAmbienteDespliegue_Ambiente()
	 * @model default="IST"
	 * @generated
	 */
	TipoAmbiente getAmbiente();

	/**
	 * Sets the value of the '{@link Ceffective.AmbienteDespliegue#getAmbiente <em>Ambiente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ambiente</em>' attribute.
	 * @see Ceffective.TipoAmbiente
	 * @see #getAmbiente()
	 * @generated
	 */
	void setAmbiente(TipoAmbiente value);

	/**
	 * Returns the value of the '<em><b>Recursos</b></em>' containment reference list.
	 * The list contents are of type {@link Ceffective.Recurso}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recursos</em>' containment reference list.
	 * @see Ceffective.CeffectivePackage#getAmbienteDespliegue_Recursos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Recurso> getRecursos();

} // AmbienteDespliegue
