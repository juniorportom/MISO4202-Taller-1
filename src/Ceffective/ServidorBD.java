/**
 */
package Ceffective;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Servidor BD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Ceffective.ServidorBD#getTipo <em>Tipo</em>}</li>
 *   <li>{@link Ceffective.ServidorBD#getSistemaManejador <em>Sistema Manejador</em>}</li>
 * </ul>
 *
 * @see Ceffective.CeffectivePackage#getServidorBD()
 * @model
 * @generated
 */
public interface ServidorBD extends Servidor {
	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * The default value is <code>"Relacional"</code>.
	 * The literals are from the enumeration {@link Ceffective.TipoBaseDatos}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see Ceffective.TipoBaseDatos
	 * @see #setTipo(TipoBaseDatos)
	 * @see Ceffective.CeffectivePackage#getServidorBD_Tipo()
	 * @model default="Relacional"
	 * @generated
	 */
	TipoBaseDatos getTipo();

	/**
	 * Sets the value of the '{@link Ceffective.ServidorBD#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see Ceffective.TipoBaseDatos
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(TipoBaseDatos value);

	/**
	 * Returns the value of the '<em><b>Sistema Manejador</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sistema Manejador</em>' attribute.
	 * @see #setSistemaManejador(String)
	 * @see Ceffective.CeffectivePackage#getServidorBD_SistemaManejador()
	 * @model
	 * @generated
	 */
	String getSistemaManejador();

	/**
	 * Sets the value of the '{@link Ceffective.ServidorBD#getSistemaManejador <em>Sistema Manejador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sistema Manejador</em>' attribute.
	 * @see #getSistemaManejador()
	 * @generated
	 */
	void setSistemaManejador(String value);

} // ServidorBD
