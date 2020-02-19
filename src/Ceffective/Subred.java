/**
 */
package Ceffective;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subred</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Ceffective.Subred#getCidrBlock <em>Cidr Block</em>}</li>
 *   <li>{@link Ceffective.Subred#getZonaDisponibilidad <em>Zona Disponibilidad</em>}</li>
 * </ul>
 *
 * @see Ceffective.CeffectivePackage#getSubred()
 * @model
 * @generated
 */
public interface Subred extends MecanismoSeguridad {
	/**
	 * Returns the value of the '<em><b>Cidr Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cidr Block</em>' attribute.
	 * @see #setCidrBlock(String)
	 * @see Ceffective.CeffectivePackage#getSubred_CidrBlock()
	 * @model
	 * @generated
	 */
	String getCidrBlock();

	/**
	 * Sets the value of the '{@link Ceffective.Subred#getCidrBlock <em>Cidr Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cidr Block</em>' attribute.
	 * @see #getCidrBlock()
	 * @generated
	 */
	void setCidrBlock(String value);

	/**
	 * Returns the value of the '<em><b>Zona Disponibilidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zona Disponibilidad</em>' attribute.
	 * @see #setZonaDisponibilidad(String)
	 * @see Ceffective.CeffectivePackage#getSubred_ZonaDisponibilidad()
	 * @model
	 * @generated
	 */
	String getZonaDisponibilidad();

	/**
	 * Sets the value of the '{@link Ceffective.Subred#getZonaDisponibilidad <em>Zona Disponibilidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zona Disponibilidad</em>' attribute.
	 * @see #getZonaDisponibilidad()
	 * @generated
	 */
	void setZonaDisponibilidad(String value);

} // Subred
