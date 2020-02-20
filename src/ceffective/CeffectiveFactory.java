/**
 */
package ceffective;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ceffective.CeffectivePackage
 * @generated
 */
public interface CeffectiveFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CeffectiveFactory eINSTANCE = ceffective.impl.CeffectiveFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Proveedor Nube</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proveedor Nube</em>'.
	 * @generated
	 */
	ProveedorNube createProveedorNube();

	/**
	 * Returns a new object of class '<em>Autenticacion Usuario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Autenticacion Usuario</em>'.
	 * @generated
	 */
	AutenticacionUsuario createAutenticacionUsuario();

	/**
	 * Returns a new object of class '<em>Ambiente Despliegue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ambiente Despliegue</em>'.
	 * @generated
	 */
	AmbienteDespliegue createAmbienteDespliegue();

	/**
	 * Returns a new object of class '<em>Servidor Aplicaciones</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Servidor Aplicaciones</em>'.
	 * @generated
	 */
	ServidorAplicaciones createServidorAplicaciones();

	/**
	 * Returns a new object of class '<em>Almacenamiento</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Almacenamiento</em>'.
	 * @generated
	 */
	Almacenamiento createAlmacenamiento();

	/**
	 * Returns a new object of class '<em>Servidor BD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Servidor BD</em>'.
	 * @generated
	 */
	ServidorBD createServidorBD();

	/**
	 * Returns a new object of class '<em>Subred</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subred</em>'.
	 * @generated
	 */
	Subred createSubred();

	/**
	 * Returns a new object of class '<em>Internet Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internet Gateway</em>'.
	 * @generated
	 */
	InternetGateway createInternetGateway();

	/**
	 * Returns a new object of class '<em>Grupo Seguridad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grupo Seguridad</em>'.
	 * @generated
	 */
	GrupoSeguridad createGrupoSeguridad();

	/**
	 * Returns a new object of class '<em>VPC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VPC</em>'.
	 * @generated
	 */
	VPC createVPC();

	/**
	 * Returns a new object of class '<em>Regla</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regla</em>'.
	 * @generated
	 */
	Regla createRegla();

	/**
	 * Returns a new object of class '<em>Ceffective</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ceffective</em>'.
	 * @generated
	 */
	Ceffective createCeffective();

	/**
	 * Returns a new object of class '<em>Servidor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Servidor</em>'.
	 * @generated
	 */
	Servidor createServidor();

	/**
	 * Returns a new object of class '<em>Autenticacion Basica</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Autenticacion Basica</em>'.
	 * @generated
	 */
	AutenticacionBasica createAutenticacionBasica();

	/**
	 * Returns a new object of class '<em>Autenticacion Firma</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Autenticacion Firma</em>'.
	 * @generated
	 */
	AutenticacionFirma createAutenticacionFirma();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CeffectivePackage getCeffectivePackage();

} //CeffectiveFactory
