/**
 */
package Ceffective;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VPC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Ceffective.VPC#getNombre <em>Nombre</em>}</li>
 *   <li>{@link Ceffective.VPC#getMecanismoseguridad <em>Mecanismoseguridad</em>}</li>
 *   <li>{@link Ceffective.VPC#getRecurso <em>Recurso</em>}</li>
 * </ul>
 *
 * @see Ceffective.CeffectivePackage#getVPC()
 * @model
 * @generated
 */
public interface VPC extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see Ceffective.CeffectivePackage#getVPC_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link Ceffective.VPC#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Mecanismoseguridad</b></em>' containment reference list.
	 * The list contents are of type {@link Ceffective.MecanismoSeguridad}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mecanismoseguridad</em>' containment reference list.
	 * @see Ceffective.CeffectivePackage#getVPC_Mecanismoseguridad()
	 * @model containment="true"
	 * @generated
	 */
	EList<MecanismoSeguridad> getMecanismoseguridad();

	/**
	 * Returns the value of the '<em><b>Recurso</b></em>' reference list.
	 * The list contents are of type {@link Ceffective.Recurso}.
	 * It is bidirectional and its opposite is '{@link Ceffective.Recurso#getVpc <em>Vpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recurso</em>' reference list.
	 * @see Ceffective.CeffectivePackage#getVPC_Recurso()
	 * @see Ceffective.Recurso#getVpc
	 * @model opposite="vpc"
	 * @generated
	 */
	EList<Recurso> getRecurso();

} // VPC
