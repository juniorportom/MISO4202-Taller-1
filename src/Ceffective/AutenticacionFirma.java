/**
 */
package Ceffective;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Autenticacion Firma</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Ceffective.AutenticacionFirma#getNombre <em>Nombre</em>}</li>
 *   <li>{@link Ceffective.AutenticacionFirma#getCertificado <em>Certificado</em>}</li>
 * </ul>
 *
 * @see Ceffective.CeffectivePackage#getAutenticacionFirma()
 * @model
 * @generated
 */
public interface AutenticacionFirma extends AutenticacionUsuario {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see Ceffective.CeffectivePackage#getAutenticacionFirma_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link Ceffective.AutenticacionFirma#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Certificado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certificado</em>' attribute.
	 * @see #setCertificado(String)
	 * @see Ceffective.CeffectivePackage#getAutenticacionFirma_Certificado()
	 * @model
	 * @generated
	 */
	String getCertificado();

	/**
	 * Sets the value of the '{@link Ceffective.AutenticacionFirma#getCertificado <em>Certificado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificado</em>' attribute.
	 * @see #getCertificado()
	 * @generated
	 */
	void setCertificado(String value);

} // AutenticacionFirma
