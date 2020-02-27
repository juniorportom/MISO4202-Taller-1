/**
 */
package ceffective;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regla</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ceffective.Regla#getTipo <em>Tipo</em>}</li>
 *   <li>{@link ceffective.Regla#getProtocolo <em>Protocolo</em>}</li>
 *   <li>{@link ceffective.Regla#getPuerto <em>Puerto</em>}</li>
 *   <li>{@link ceffective.Regla#getOrigen <em>Origen</em>}</li>
 *   <li>{@link ceffective.Regla#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link ceffective.Regla#getDireccion <em>Direccion</em>}</li>
 * </ul>
 * </p>
 *
 * @see ceffective.CeffectivePackage#getRegla()
 * @model
 * @generated
 */
public interface Regla extends EObject {
	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see #setTipo(String)
	 * @see ceffective.CeffectivePackage#getRegla_Tipo()
	 * @model
	 * @generated
	 */
	String getTipo();

	/**
	 * Sets the value of the '{@link ceffective.Regla#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(String value);

	/**
	 * Returns the value of the '<em><b>Protocolo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocolo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocolo</em>' attribute.
	 * @see #setProtocolo(String)
	 * @see ceffective.CeffectivePackage#getRegla_Protocolo()
	 * @model
	 * @generated
	 */
	String getProtocolo();

	/**
	 * Sets the value of the '{@link ceffective.Regla#getProtocolo <em>Protocolo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocolo</em>' attribute.
	 * @see #getProtocolo()
	 * @generated
	 */
	void setProtocolo(String value);

	/**
	 * Returns the value of the '<em><b>Puerto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Puerto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Puerto</em>' attribute.
	 * @see #setPuerto(String)
	 * @see ceffective.CeffectivePackage#getRegla_Puerto()
	 * @model
	 * @generated
	 */
	String getPuerto();

	/**
	 * Sets the value of the '{@link ceffective.Regla#getPuerto <em>Puerto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Puerto</em>' attribute.
	 * @see #getPuerto()
	 * @generated
	 */
	void setPuerto(String value);

	/**
	 * Returns the value of the '<em><b>Origen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origen</em>' attribute.
	 * @see #setOrigen(String)
	 * @see ceffective.CeffectivePackage#getRegla_Origen()
	 * @model
	 * @generated
	 */
	String getOrigen();

	/**
	 * Sets the value of the '{@link ceffective.Regla#getOrigen <em>Origen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origen</em>' attribute.
	 * @see #getOrigen()
	 * @generated
	 */
	void setOrigen(String value);

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
	 * @see ceffective.CeffectivePackage#getRegla_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link ceffective.Regla#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

	/**
	 * Returns the value of the '<em><b>Direccion</b></em>' attribute.
	 * The default value is <code>"ENTRADA"</code>.
	 * The literals are from the enumeration {@link ceffective.DireccionRegla}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direccion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direccion</em>' attribute.
	 * @see ceffective.DireccionRegla
	 * @see #setDireccion(DireccionRegla)
	 * @see ceffective.CeffectivePackage#getRegla_Direccion()
	 * @model default="ENTRADA"
	 * @generated
	 */
	DireccionRegla getDireccion();

	/**
	 * Sets the value of the '{@link ceffective.Regla#getDireccion <em>Direccion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direccion</em>' attribute.
	 * @see ceffective.DireccionRegla
	 * @see #getDireccion()
	 * @generated
	 */
	void setDireccion(DireccionRegla value);

} // Regla
