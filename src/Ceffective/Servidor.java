/**
 */
package Ceffective;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Servidor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Ceffective.Servidor#getTamano <em>Tamano</em>}</li>
 * </ul>
 *
 * @see Ceffective.CeffectivePackage#getServidor()
 * @model
 * @generated
 */
public interface Servidor extends Recurso {
	/**
	 * Returns the value of the '<em><b>Tamano</b></em>' attribute.
	 * The default value is <code>"Micro"</code>.
	 * The literals are from the enumeration {@link Ceffective.TamanoServidor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tamano</em>' attribute.
	 * @see Ceffective.TamanoServidor
	 * @see #setTamano(TamanoServidor)
	 * @see Ceffective.CeffectivePackage#getServidor_Tamano()
	 * @model default="Micro"
	 * @generated
	 */
	TamanoServidor getTamano();

	/**
	 * Sets the value of the '{@link Ceffective.Servidor#getTamano <em>Tamano</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tamano</em>' attribute.
	 * @see Ceffective.TamanoServidor
	 * @see #getTamano()
	 * @generated
	 */
	void setTamano(TamanoServidor value);

} // Servidor
