/**
 */
package Ceffective;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ceffective</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Ceffective.Ceffective#getProveedorNube <em>Proveedor Nube</em>}</li>
 * </ul>
 *
 * @see Ceffective.CeffectivePackage#getCeffective()
 * @model
 * @generated
 */
public interface Ceffective extends EObject {
	/**
	 * Returns the value of the '<em><b>Proveedor Nube</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proveedor Nube</em>' containment reference.
	 * @see #setProveedorNube(ProveedorNube)
	 * @see Ceffective.CeffectivePackage#getCeffective_ProveedorNube()
	 * @model containment="true"
	 * @generated
	 */
	ProveedorNube getProveedorNube();

	/**
	 * Sets the value of the '{@link Ceffective.Ceffective#getProveedorNube <em>Proveedor Nube</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proveedor Nube</em>' containment reference.
	 * @see #getProveedorNube()
	 * @generated
	 */
	void setProveedorNube(ProveedorNube value);

} // Ceffective
