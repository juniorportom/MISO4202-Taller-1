/**
 */
package ceffective;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Almacenamiento</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ceffective.Almacenamiento#getTamanoInicial <em>Tamano Inicial</em>}</li>
 * </ul>
 *
 * @see ceffective.CeffectivePackage#getAlmacenamiento()
 * @model
 * @generated
 */
public interface Almacenamiento extends Recurso {
	/**
	 * Returns the value of the '<em><b>Tamano Inicial</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tamano Inicial</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tamano Inicial</em>' attribute.
	 * @see #setTamanoInicial(float)
	 * @see ceffective.CeffectivePackage#getAlmacenamiento_TamanoInicial()
	 * @model default="0.0"
	 * @generated
	 */
	float getTamanoInicial();

	/**
	 * Sets the value of the '{@link ceffective.Almacenamiento#getTamanoInicial <em>Tamano Inicial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tamano Inicial</em>' attribute.
	 * @see #getTamanoInicial()
	 * @generated
	 */
	void setTamanoInicial(float value);

} // Almacenamiento
