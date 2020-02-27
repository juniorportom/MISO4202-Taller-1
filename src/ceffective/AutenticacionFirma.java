/**
 */
package ceffective;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Autenticacion Firma</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ceffective.AutenticacionFirma#getAccessId <em>Access Id</em>}</li>
 *   <li>{@link ceffective.AutenticacionFirma#getSecret <em>Secret</em>}</li>
 * </ul>
 * </p>
 *
 * @see ceffective.CeffectivePackage#getAutenticacionFirma()
 * @model
 * @generated
 */
public interface AutenticacionFirma extends AutenticacionUsuario {
	/**
	 * Returns the value of the '<em><b>Access Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Id</em>' attribute.
	 * @see #setAccessId(String)
	 * @see ceffective.CeffectivePackage#getAutenticacionFirma_AccessId()
	 * @model
	 * @generated
	 */
	String getAccessId();

	/**
	 * Sets the value of the '{@link ceffective.AutenticacionFirma#getAccessId <em>Access Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Id</em>' attribute.
	 * @see #getAccessId()
	 * @generated
	 */
	void setAccessId(String value);

	/**
	 * Returns the value of the '<em><b>Secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secret</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secret</em>' attribute.
	 * @see #setSecret(String)
	 * @see ceffective.CeffectivePackage#getAutenticacionFirma_Secret()
	 * @model
	 * @generated
	 */
	String getSecret();

	/**
	 * Sets the value of the '{@link ceffective.AutenticacionFirma#getSecret <em>Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secret</em>' attribute.
	 * @see #getSecret()
	 * @generated
	 */
	void setSecret(String value);

} // AutenticacionFirma
