/**
 */
package Ceffective;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Autenticacion Basica</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Ceffective.AutenticacionBasica#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @see Ceffective.CeffectivePackage#getAutenticacionBasica()
 * @model
 * @generated
 */
public interface AutenticacionBasica extends AutenticacionUsuario {
	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see Ceffective.CeffectivePackage#getAutenticacionBasica_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link Ceffective.AutenticacionBasica#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

} // AutenticacionBasica
