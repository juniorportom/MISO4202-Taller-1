/**
 */
package ceffective;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conexion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ceffective.Conexion#getRecurso1 <em>Recurso1</em>}</li>
 *   <li>{@link ceffective.Conexion#getRecurso2 <em>Recurso2</em>}</li>
 * </ul>
 *
 * @see ceffective.CeffectivePackage#getConexion()
 * @model
 * @generated
 */
public interface Conexion extends EObject {
	/**
	 * Returns the value of the '<em><b>Recurso1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recurso1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recurso1</em>' reference.
	 * @see #setRecurso1(Recurso)
	 * @see ceffective.CeffectivePackage#getConexion_Recurso1()
	 * @model required="true"
	 * @generated
	 */
	Recurso getRecurso1();

	/**
	 * Sets the value of the '{@link ceffective.Conexion#getRecurso1 <em>Recurso1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurso1</em>' reference.
	 * @see #getRecurso1()
	 * @generated
	 */
	void setRecurso1(Recurso value);

	/**
	 * Returns the value of the '<em><b>Recurso2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recurso2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recurso2</em>' reference.
	 * @see #setRecurso2(Recurso)
	 * @see ceffective.CeffectivePackage#getConexion_Recurso2()
	 * @model required="true"
	 * @generated
	 */
	Recurso getRecurso2();

	/**
	 * Sets the value of the '{@link ceffective.Conexion#getRecurso2 <em>Recurso2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurso2</em>' reference.
	 * @see #getRecurso2()
	 * @generated
	 */
	void setRecurso2(Recurso value);

} // Conexion
