/**
 */
package Ceffective;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Autenticacion Usuario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Ceffective.AutenticacionUsuario#getUsuario <em>Usuario</em>}</li>
 *   <li>{@link Ceffective.AutenticacionUsuario#getCorreo <em>Correo</em>}</li>
 * </ul>
 *
 * @see Ceffective.CeffectivePackage#getAutenticacionUsuario()
 * @model
 * @generated
 */
public interface AutenticacionUsuario extends EObject {
	/**
	 * Returns the value of the '<em><b>Usuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usuario</em>' attribute.
	 * @see #setUsuario(String)
	 * @see Ceffective.CeffectivePackage#getAutenticacionUsuario_Usuario()
	 * @model
	 * @generated
	 */
	String getUsuario();

	/**
	 * Sets the value of the '{@link Ceffective.AutenticacionUsuario#getUsuario <em>Usuario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usuario</em>' attribute.
	 * @see #getUsuario()
	 * @generated
	 */
	void setUsuario(String value);

	/**
	 * Returns the value of the '<em><b>Correo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correo</em>' attribute.
	 * @see #setCorreo(String)
	 * @see Ceffective.CeffectivePackage#getAutenticacionUsuario_Correo()
	 * @model
	 * @generated
	 */
	String getCorreo();

	/**
	 * Sets the value of the '{@link Ceffective.AutenticacionUsuario#getCorreo <em>Correo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correo</em>' attribute.
	 * @see #getCorreo()
	 * @generated
	 */
	void setCorreo(String value);

} // AutenticacionUsuario
