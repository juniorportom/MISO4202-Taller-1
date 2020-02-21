/**
 */
package ceffective;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ceffective.CeffectiveFactory
 * @model kind="package"
 * @generated
 */
public interface CeffectivePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ceffective";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://www.uniandes.edu.co/ceffective";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ceffective";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CeffectivePackage eINSTANCE = ceffective.impl.CeffectivePackageImpl.init();

	/**
	 * The meta object id for the '{@link ceffective.impl.ProveedorNubeImpl <em>Proveedor Nube</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ceffective.impl.ProveedorNubeImpl
	 * @see ceffective.impl.CeffectivePackageImpl#getProveedorNube()
	 * @generated
	 */
	int PROVEEDOR_NUBE = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVEEDOR_NUBE__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Ambientedespliegue</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVEEDOR_NUBE__AMBIENTEDESPLIEGUE = 1;

	/**
	 * The feature id for the '<em><b>Autenticacion Usuario</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVEEDOR_NUBE__AUTENTICACION_USUARIO = 2;

	/**
	 * The feature id for the '<em><b>Vpc</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVEEDOR_NUBE__VPC = 3;

	/**
	 * The number of structural features of the '<em>Proveedor Nube</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVEEDOR_NUBE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Proveedor Nube</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVEEDOR_NUBE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ceffective.impl.AutenticacionUsuarioImpl <em>Autenticacion Usuario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ceffective.impl.AutenticacionUsuarioImpl
	 * @see ceffective.impl.CeffectivePackageImpl#getAutenticacionUsuario()
	 * @generated
	 */
	int AUTENTICACION_USUARIO = 1;

	/**
	 * The feature id for the '<em><b>Usuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTENTICACION_USUARIO__USUARIO = 0;

	/**
	 * The feature id for the '<em><b>Correo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTENTICACION_USUARIO__CORREO = 1;

	/**
	 * The number of structural features of the '<em>Autenticacion Usuario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTENTICACION_USUARIO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Autenticacion Usuario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTENTICACION_USUARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ceffective.impl.AmbienteDespliegueImpl <em>Ambiente Despliegue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ceffective.impl.AmbienteDespliegueImpl
	 * @see ceffective.impl.CeffectivePackageImpl#getAmbienteDespliegue()
	 * @generated
	 */
	int AMBIENTE_DESPLIEGUE = 2;

	/**
	 * The feature id for the '<em><b>Ambiente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIENTE_DESPLIEGUE__AMBIENTE = 0;

	/**
	 * The feature id for the '<em><b>Recursos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIENTE_DESPLIEGUE__RECURSOS = 1;

	/**
	 * The number of structural features of the '<em>Ambiente Despliegue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIENTE_DESPLIEGUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ambiente Despliegue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIENTE_DESPLIEGUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ceffective.impl.RecursoImpl <em>Recurso</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ceffective.impl.RecursoImpl
	 * @see ceffective.impl.CeffectivePackageImpl#getRecurso()
	 * @generated
	 */
	int RECURSO = 3;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSO__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Recursos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSO__RECURSOS = 1;

	/**
	 * The feature id for the '<em><b>Vpc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSO__VPC = 2;

	/**
	 * The feature id for the '<em><b>Zona Disponibilidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSO__ZONA_DISPONIBILIDAD = 3;

	/**
	 * The feature id for the '<em><b>Zona Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSO__ZONA_NOMBRE = 4;

	/**
	 * The number of structural features of the '<em>Recurso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSO_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Recurso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ceffective.impl.ServidorImpl <em>Servidor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ceffective.impl.ServidorImpl
	 * @see ceffective.impl.CeffectivePackageImpl#getServidor()
	 * @generated
	 */
	int SERVIDOR = 14;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR__NOMBRE = RECURSO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Recursos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR__RECURSOS = RECURSO__RECURSOS;

	/**
	 * The feature id for the '<em><b>Vpc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR__VPC = RECURSO__VPC;

	/**
	 * The feature id for the '<em><b>Zona Disponibilidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR__ZONA_DISPONIBILIDAD = RECURSO__ZONA_DISPONIBILIDAD;

	/**
	 * The feature id for the '<em><b>Zona Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR__ZONA_NOMBRE = RECURSO__ZONA_NOMBRE;

	/**
	 * The feature id for the '<em><b>Tamano</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR__TAMANO = RECURSO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Servidor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_FEATURE_COUNT = RECURSO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Servidor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_OPERATION_COUNT = RECURSO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ceffective.impl.ServidorAplicacionesImpl <em>Servidor Aplicaciones</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ceffective.impl.ServidorAplicacionesImpl
	 * @see ceffective.impl.CeffectivePackageImpl#getServidorAplicaciones()
	 * @generated
	 */
	int SERVIDOR_APLICACIONES = 4;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_APLICACIONES__NOMBRE = SERVIDOR__NOMBRE;

	/**
	 * The feature id for the '<em><b>Recursos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_APLICACIONES__RECURSOS = SERVIDOR__RECURSOS;

	/**
	 * The feature id for the '<em><b>Vpc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_APLICACIONES__VPC = SERVIDOR__VPC;

	/**
	 * The feature id for the '<em><b>Zona Disponibilidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_APLICACIONES__ZONA_DISPONIBILIDAD = SERVIDOR__ZONA_DISPONIBILIDAD;

	/**
	 * The feature id for the '<em><b>Zona Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_APLICACIONES__ZONA_NOMBRE = SERVIDOR__ZONA_NOMBRE;

	/**
	 * The feature id for the '<em><b>Tamano</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_APLICACIONES__TAMANO = SERVIDOR__TAMANO;

	/**
	 * The feature id for the '<em><b>Sistema Operativo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_APLICACIONES__SISTEMA_OPERATIVO = SERVIDOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Servidor Aplicaciones</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_APLICACIONES_FEATURE_COUNT = SERVIDOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Servidor Aplicaciones</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_APLICACIONES_OPERATION_COUNT = SERVIDOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ceffective.impl.AlmacenamientoImpl <em>Almacenamiento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ceffective.impl.AlmacenamientoImpl
	 * @see ceffective.impl.CeffectivePackageImpl#getAlmacenamiento()
	 * @generated
	 */
	int ALMACENAMIENTO = 5;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALMACENAMIENTO__NOMBRE = RECURSO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Recursos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALMACENAMIENTO__RECURSOS = RECURSO__RECURSOS;

	/**
	 * The feature id for the '<em><b>Vpc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALMACENAMIENTO__VPC = RECURSO__VPC;

	/**
	 * The feature id for the '<em><b>Zona Disponibilidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALMACENAMIENTO__ZONA_DISPONIBILIDAD = RECURSO__ZONA_DISPONIBILIDAD;

	/**
	 * The feature id for the '<em><b>Zona Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALMACENAMIENTO__ZONA_NOMBRE = RECURSO__ZONA_NOMBRE;

	/**
	 * The feature id for the '<em><b>Tamano Inicial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALMACENAMIENTO__TAMANO_INICIAL = RECURSO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Almacenamiento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALMACENAMIENTO_FEATURE_COUNT = RECURSO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Almacenamiento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALMACENAMIENTO_OPERATION_COUNT = RECURSO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ceffective.impl.ServidorBDImpl <em>Servidor BD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ceffective.impl.ServidorBDImpl
	 * @see ceffective.impl.CeffectivePackageImpl#getServidorBD()
	 * @generated
	 */
	int SERVIDOR_BD = 6;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_BD__NOMBRE = SERVIDOR__NOMBRE;

	/**
	 * The feature id for the '<em><b>Recursos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_BD__RECURSOS = SERVIDOR__RECURSOS;

	/**
	 * The feature id for the '<em><b>Vpc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_BD__VPC = SERVIDOR__VPC;

	/**
	 * The feature id for the '<em><b>Zona Disponibilidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_BD__ZONA_DISPONIBILIDAD = SERVIDOR__ZONA_DISPONIBILIDAD;

	/**
	 * The feature id for the '<em><b>Zona Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_BD__ZONA_NOMBRE = SERVIDOR__ZONA_NOMBRE;

	/**
	 * The feature id for the '<em><b>Tamano</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_BD__TAMANO = SERVIDOR__TAMANO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_BD__TIPO = SERVIDOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sistema Manejador</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_BD__SISTEMA_MANEJADOR = SERVIDOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Servidor BD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_BD_FEATURE_COUNT = SERVIDOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Servidor BD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_BD_OPERATION_COUNT = SERVIDOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ceffective.impl.MecanismoSeguridadImpl <em>Mecanismo Seguridad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ceffective.impl.MecanismoSeguridadImpl
	 * @see ceffective.impl.CeffectivePackageImpl#getMecanismoSeguridad()
	 * @generated
	 */
	int MECANISMO_SEGURIDAD = 7;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECANISMO_SEGURIDAD__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Zona Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECANISMO_SEGURIDAD__ZONA_NOMBRE = 1;

	/**
	 * The feature id for the '<em><b>Zona Disponibilidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECANISMO_SEGURIDAD__ZONA_DISPONIBILIDAD = 2;

	/**
	 * The number of structural features of the '<em>Mecanismo Seguridad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECANISMO_SEGURIDAD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Mecanismo Seguridad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MECANISMO_SEGURIDAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ceffective.impl.SubredImpl <em>Subred</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ceffective.impl.SubredImpl
	 * @see ceffective.impl.CeffectivePackageImpl#getSubred()
	 * @generated
	 */
	int SUBRED = 8;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRED__NOMBRE = MECANISMO_SEGURIDAD__NOMBRE;

	/**
	 * The feature id for the '<em><b>Zona Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRED__ZONA_NOMBRE = MECANISMO_SEGURIDAD__ZONA_NOMBRE;

	/**
	 * The feature id for the '<em><b>Zona Disponibilidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRED__ZONA_DISPONIBILIDAD = MECANISMO_SEGURIDAD__ZONA_DISPONIBILIDAD;

	/**
	 * The feature id for the '<em><b>Cidr Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRED__CIDR_BLOCK = MECANISMO_SEGURIDAD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Subred</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRED_FEATURE_COUNT = MECANISMO_SEGURIDAD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Subred</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRED_OPERATION_COUNT = MECANISMO_SEGURIDAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ceffective.impl.InternetGatewayImpl <em>Internet Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ceffective.impl.InternetGatewayImpl
	 * @see ceffective.impl.CeffectivePackageImpl#getInternetGateway()
	 * @generated
	 */
	int INTERNET_GATEWAY = 9;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNET_GATEWAY__NOMBRE = MECANISMO_SEGURIDAD__NOMBRE;

	/**
	 * The feature id for the '<em><b>Zona Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNET_GATEWAY__ZONA_NOMBRE = MECANISMO_SEGURIDAD__ZONA_NOMBRE;

	/**
	 * The feature id for the '<em><b>Zona Disponibilidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNET_GATEWAY__ZONA_DISPONIBILIDAD = MECANISMO_SEGURIDAD__ZONA_DISPONIBILIDAD;

	/**
	 * The number of structural features of the '<em>Internet Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNET_GATEWAY_FEATURE_COUNT = MECANISMO_SEGURIDAD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Internet Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNET_GATEWAY_OPERATION_COUNT = MECANISMO_SEGURIDAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ceffective.impl.GrupoSeguridadImpl <em>Grupo Seguridad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ceffective.impl.GrupoSeguridadImpl
	 * @see ceffective.impl.CeffectivePackageImpl#getGrupoSeguridad()
	 * @generated
	 */
	int GRUPO_SEGURIDAD = 10;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRUPO_SEGURIDAD__NOMBRE = MECANISMO_SEGURIDAD__NOMBRE;

	/**
	 * The feature id for the '<em><b>Zona Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRUPO_SEGURIDAD__ZONA_NOMBRE = MECANISMO_SEGURIDAD__ZONA_NOMBRE;

	/**
	 * The feature id for the '<em><b>Zona Disponibilidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRUPO_SEGURIDAD__ZONA_DISPONIBILIDAD = MECANISMO_SEGURIDAD__ZONA_DISPONIBILIDAD;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRUPO_SEGURIDAD__DESCRIPCION = MECANISMO_SEGURIDAD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reglas Salida</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRUPO_SEGURIDAD__REGLAS_SALIDA = MECANISMO_SEGURIDAD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reglas Entrada</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRUPO_SEGURIDAD__REGLAS_ENTRADA = MECANISMO_SEGURIDAD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Grupo Seguridad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRUPO_SEGURIDAD_FEATURE_COUNT = MECANISMO_SEGURIDAD_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Grupo Seguridad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRUPO_SEGURIDAD_OPERATION_COUNT = MECANISMO_SEGURIDAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ceffective.impl.VPCImpl <em>VPC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ceffective.impl.VPCImpl
	 * @see ceffective.impl.CeffectivePackageImpl#getVPC()
	 * @generated
	 */
	int VPC = 11;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Mecanismoseguridad</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC__MECANISMOSEGURIDAD = 1;

	/**
	 * The feature id for the '<em><b>Recurso</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC__RECURSO = 2;

	/**
	 * The number of structural features of the '<em>VPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>VPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ceffective.impl.ReglaImpl <em>Regla</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ceffective.impl.ReglaImpl
	 * @see ceffective.impl.CeffectivePackageImpl#getRegla()
	 * @generated
	 */
	int REGLA = 12;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGLA__TIPO = 0;

	/**
	 * The feature id for the '<em><b>Protocolo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGLA__PROTOCOLO = 1;

	/**
	 * The feature id for the '<em><b>Puerto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGLA__PUERTO = 2;

	/**
	 * The feature id for the '<em><b>Origen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGLA__ORIGEN = 3;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGLA__DESCRIPCION = 4;

	/**
	 * The number of structural features of the '<em>Regla</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGLA_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Regla</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGLA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ceffective.impl.CeffectiveImpl <em>Ceffective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ceffective.impl.CeffectiveImpl
	 * @see ceffective.impl.CeffectivePackageImpl#getCeffective()
	 * @generated
	 */
	int CEFFECTIVE = 13;

	/**
	 * The feature id for the '<em><b>Proveedor Nube</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEFFECTIVE__PROVEEDOR_NUBE = 0;

	/**
	 * The number of structural features of the '<em>Ceffective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEFFECTIVE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Ceffective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEFFECTIVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ceffective.impl.AutenticacionBasicaImpl <em>Autenticacion Basica</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ceffective.impl.AutenticacionBasicaImpl
	 * @see ceffective.impl.CeffectivePackageImpl#getAutenticacionBasica()
	 * @generated
	 */
	int AUTENTICACION_BASICA = 15;

	/**
	 * The feature id for the '<em><b>Usuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTENTICACION_BASICA__USUARIO = AUTENTICACION_USUARIO__USUARIO;

	/**
	 * The feature id for the '<em><b>Correo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTENTICACION_BASICA__CORREO = AUTENTICACION_USUARIO__CORREO;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTENTICACION_BASICA__PASSWORD = AUTENTICACION_USUARIO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Autenticacion Basica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTENTICACION_BASICA_FEATURE_COUNT = AUTENTICACION_USUARIO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Autenticacion Basica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTENTICACION_BASICA_OPERATION_COUNT = AUTENTICACION_USUARIO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ceffective.impl.AutenticacionFirmaImpl <em>Autenticacion Firma</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ceffective.impl.AutenticacionFirmaImpl
	 * @see ceffective.impl.CeffectivePackageImpl#getAutenticacionFirma()
	 * @generated
	 */
	int AUTENTICACION_FIRMA = 16;

	/**
	 * The feature id for the '<em><b>Usuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTENTICACION_FIRMA__USUARIO = AUTENTICACION_USUARIO__USUARIO;

	/**
	 * The feature id for the '<em><b>Correo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTENTICACION_FIRMA__CORREO = AUTENTICACION_USUARIO__CORREO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTENTICACION_FIRMA__NOMBRE = AUTENTICACION_USUARIO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Certificado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTENTICACION_FIRMA__CERTIFICADO = AUTENTICACION_USUARIO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Autenticacion Firma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTENTICACION_FIRMA_FEATURE_COUNT = AUTENTICACION_USUARIO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Autenticacion Firma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTENTICACION_FIRMA_OPERATION_COUNT = AUTENTICACION_USUARIO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ceffective.TipoAmbiente <em>Tipo Ambiente</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ceffective.TipoAmbiente
	 * @see ceffective.impl.CeffectivePackageImpl#getTipoAmbiente()
	 * @generated
	 */
	int TIPO_AMBIENTE = 17;

	/**
	 * The meta object id for the '{@link ceffective.TamanoServidor <em>Tamano Servidor</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ceffective.TamanoServidor
	 * @see ceffective.impl.CeffectivePackageImpl#getTamanoServidor()
	 * @generated
	 */
	int TAMANO_SERVIDOR = 18;

	/**
	 * The meta object id for the '{@link ceffective.TipoBaseDatos <em>Tipo Base Datos</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ceffective.TipoBaseDatos
	 * @see ceffective.impl.CeffectivePackageImpl#getTipoBaseDatos()
	 * @generated
	 */
	int TIPO_BASE_DATOS = 19;


	/**
	 * Returns the meta object for class '{@link ceffective.ProveedorNube <em>Proveedor Nube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proveedor Nube</em>'.
	 * @see ceffective.ProveedorNube
	 * @generated
	 */
	EClass getProveedorNube();

	/**
	 * Returns the meta object for the attribute '{@link ceffective.ProveedorNube#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see ceffective.ProveedorNube#getNombre()
	 * @see #getProveedorNube()
	 * @generated
	 */
	EAttribute getProveedorNube_Nombre();

	/**
	 * Returns the meta object for the reference list '{@link ceffective.ProveedorNube#getAmbientedespliegue <em>Ambientedespliegue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ambientedespliegue</em>'.
	 * @see ceffective.ProveedorNube#getAmbientedespliegue()
	 * @see #getProveedorNube()
	 * @generated
	 */
	EReference getProveedorNube_Ambientedespliegue();

	/**
	 * Returns the meta object for the containment reference list '{@link ceffective.ProveedorNube#getAutenticacionUsuario <em>Autenticacion Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Autenticacion Usuario</em>'.
	 * @see ceffective.ProveedorNube#getAutenticacionUsuario()
	 * @see #getProveedorNube()
	 * @generated
	 */
	EReference getProveedorNube_AutenticacionUsuario();

	/**
	 * Returns the meta object for the reference list '{@link ceffective.ProveedorNube#getVpc <em>Vpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vpc</em>'.
	 * @see ceffective.ProveedorNube#getVpc()
	 * @see #getProveedorNube()
	 * @generated
	 */
	EReference getProveedorNube_Vpc();

	/**
	 * Returns the meta object for class '{@link ceffective.AutenticacionUsuario <em>Autenticacion Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Autenticacion Usuario</em>'.
	 * @see ceffective.AutenticacionUsuario
	 * @generated
	 */
	EClass getAutenticacionUsuario();

	/**
	 * Returns the meta object for the attribute '{@link ceffective.AutenticacionUsuario#getUsuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usuario</em>'.
	 * @see ceffective.AutenticacionUsuario#getUsuario()
	 * @see #getAutenticacionUsuario()
	 * @generated
	 */
	EAttribute getAutenticacionUsuario_Usuario();

	/**
	 * Returns the meta object for the attribute '{@link ceffective.AutenticacionUsuario#getCorreo <em>Correo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correo</em>'.
	 * @see ceffective.AutenticacionUsuario#getCorreo()
	 * @see #getAutenticacionUsuario()
	 * @generated
	 */
	EAttribute getAutenticacionUsuario_Correo();

	/**
	 * Returns the meta object for class '{@link ceffective.AmbienteDespliegue <em>Ambiente Despliegue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ambiente Despliegue</em>'.
	 * @see ceffective.AmbienteDespliegue
	 * @generated
	 */
	EClass getAmbienteDespliegue();

	/**
	 * Returns the meta object for the attribute '{@link ceffective.AmbienteDespliegue#getAmbiente <em>Ambiente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ambiente</em>'.
	 * @see ceffective.AmbienteDespliegue#getAmbiente()
	 * @see #getAmbienteDespliegue()
	 * @generated
	 */
	EAttribute getAmbienteDespliegue_Ambiente();

	/**
	 * Returns the meta object for the reference list '{@link ceffective.AmbienteDespliegue#getRecursos <em>Recursos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Recursos</em>'.
	 * @see ceffective.AmbienteDespliegue#getRecursos()
	 * @see #getAmbienteDespliegue()
	 * @generated
	 */
	EReference getAmbienteDespliegue_Recursos();

	/**
	 * Returns the meta object for class '{@link ceffective.Recurso <em>Recurso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recurso</em>'.
	 * @see ceffective.Recurso
	 * @generated
	 */
	EClass getRecurso();

	/**
	 * Returns the meta object for the attribute '{@link ceffective.Recurso#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see ceffective.Recurso#getNombre()
	 * @see #getRecurso()
	 * @generated
	 */
	EAttribute getRecurso_Nombre();

	/**
	 * Returns the meta object for the reference list '{@link ceffective.Recurso#getRecursos <em>Recursos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Recursos</em>'.
	 * @see ceffective.Recurso#getRecursos()
	 * @see #getRecurso()
	 * @generated
	 */
	EReference getRecurso_Recursos();

	/**
	 * Returns the meta object for the reference '{@link ceffective.Recurso#getVpc <em>Vpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vpc</em>'.
	 * @see ceffective.Recurso#getVpc()
	 * @see #getRecurso()
	 * @generated
	 */
	EReference getRecurso_Vpc();

	/**
	 * Returns the meta object for the attribute '{@link ceffective.Recurso#getZonaDisponibilidad <em>Zona Disponibilidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zona Disponibilidad</em>'.
	 * @see ceffective.Recurso#getZonaDisponibilidad()
	 * @see #getRecurso()
	 * @generated
	 */
	EAttribute getRecurso_ZonaDisponibilidad();

	/**
	 * Returns the meta object for the attribute '{@link ceffective.Recurso#getZonaNombre <em>Zona Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zona Nombre</em>'.
	 * @see ceffective.Recurso#getZonaNombre()
	 * @see #getRecurso()
	 * @generated
	 */
	EAttribute getRecurso_ZonaNombre();

	/**
	 * Returns the meta object for class '{@link ceffective.ServidorAplicaciones <em>Servidor Aplicaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Servidor Aplicaciones</em>'.
	 * @see ceffective.ServidorAplicaciones
	 * @generated
	 */
	EClass getServidorAplicaciones();

	/**
	 * Returns the meta object for the attribute '{@link ceffective.ServidorAplicaciones#getSistemaOperativo <em>Sistema Operativo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sistema Operativo</em>'.
	 * @see ceffective.ServidorAplicaciones#getSistemaOperativo()
	 * @see #getServidorAplicaciones()
	 * @generated
	 */
	EAttribute getServidorAplicaciones_SistemaOperativo();

	/**
	 * Returns the meta object for class '{@link ceffective.Almacenamiento <em>Almacenamiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Almacenamiento</em>'.
	 * @see ceffective.Almacenamiento
	 * @generated
	 */
	EClass getAlmacenamiento();

	/**
	 * Returns the meta object for the attribute '{@link ceffective.Almacenamiento#getTamanoInicial <em>Tamano Inicial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tamano Inicial</em>'.
	 * @see ceffective.Almacenamiento#getTamanoInicial()
	 * @see #getAlmacenamiento()
	 * @generated
	 */
	EAttribute getAlmacenamiento_TamanoInicial();

	/**
	 * Returns the meta object for class '{@link ceffective.ServidorBD <em>Servidor BD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Servidor BD</em>'.
	 * @see ceffective.ServidorBD
	 * @generated
	 */
	EClass getServidorBD();

	/**
	 * Returns the meta object for the attribute '{@link ceffective.ServidorBD#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see ceffective.ServidorBD#getTipo()
	 * @see #getServidorBD()
	 * @generated
	 */
	EAttribute getServidorBD_Tipo();

	/**
	 * Returns the meta object for the attribute '{@link ceffective.ServidorBD#getSistemaManejador <em>Sistema Manejador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sistema Manejador</em>'.
	 * @see ceffective.ServidorBD#getSistemaManejador()
	 * @see #getServidorBD()
	 * @generated
	 */
	EAttribute getServidorBD_SistemaManejador();

	/**
	 * Returns the meta object for class '{@link ceffective.MecanismoSeguridad <em>Mecanismo Seguridad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mecanismo Seguridad</em>'.
	 * @see ceffective.MecanismoSeguridad
	 * @generated
	 */
	EClass getMecanismoSeguridad();

	/**
	 * Returns the meta object for the attribute '{@link ceffective.MecanismoSeguridad#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see ceffective.MecanismoSeguridad#getNombre()
	 * @see #getMecanismoSeguridad()
	 * @generated
	 */
	EAttribute getMecanismoSeguridad_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link ceffective.MecanismoSeguridad#getZonaNombre <em>Zona Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zona Nombre</em>'.
	 * @see ceffective.MecanismoSeguridad#getZonaNombre()
	 * @see #getMecanismoSeguridad()
	 * @generated
	 */
	EAttribute getMecanismoSeguridad_ZonaNombre();

	/**
	 * Returns the meta object for the attribute '{@link ceffective.MecanismoSeguridad#getZonaDisponibilidad <em>Zona Disponibilidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zona Disponibilidad</em>'.
	 * @see ceffective.MecanismoSeguridad#getZonaDisponibilidad()
	 * @see #getMecanismoSeguridad()
	 * @generated
	 */
	EAttribute getMecanismoSeguridad_ZonaDisponibilidad();

	/**
	 * Returns the meta object for class '{@link ceffective.Subred <em>Subred</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subred</em>'.
	 * @see ceffective.Subred
	 * @generated
	 */
	EClass getSubred();

	/**
	 * Returns the meta object for the attribute '{@link ceffective.Subred#getCidrBlock <em>Cidr Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cidr Block</em>'.
	 * @see ceffective.Subred#getCidrBlock()
	 * @see #getSubred()
	 * @generated
	 */
	EAttribute getSubred_CidrBlock();

	/**
	 * Returns the meta object for class '{@link ceffective.InternetGateway <em>Internet Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internet Gateway</em>'.
	 * @see ceffective.InternetGateway
	 * @generated
	 */
	EClass getInternetGateway();

	/**
	 * Returns the meta object for class '{@link ceffective.GrupoSeguridad <em>Grupo Seguridad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grupo Seguridad</em>'.
	 * @see ceffective.GrupoSeguridad
	 * @generated
	 */
	EClass getGrupoSeguridad();

	/**
	 * Returns the meta object for the attribute '{@link ceffective.GrupoSeguridad#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see ceffective.GrupoSeguridad#getDescripcion()
	 * @see #getGrupoSeguridad()
	 * @generated
	 */
	EAttribute getGrupoSeguridad_Descripcion();

	/**
	 * Returns the meta object for the reference list '{@link ceffective.GrupoSeguridad#getReglasSalida <em>Reglas Salida</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reglas Salida</em>'.
	 * @see ceffective.GrupoSeguridad#getReglasSalida()
	 * @see #getGrupoSeguridad()
	 * @generated
	 */
	EReference getGrupoSeguridad_ReglasSalida();

	/**
	 * Returns the meta object for the reference list '{@link ceffective.GrupoSeguridad#getReglasEntrada <em>Reglas Entrada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reglas Entrada</em>'.
	 * @see ceffective.GrupoSeguridad#getReglasEntrada()
	 * @see #getGrupoSeguridad()
	 * @generated
	 */
	EReference getGrupoSeguridad_ReglasEntrada();

	/**
	 * Returns the meta object for class '{@link ceffective.VPC <em>VPC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VPC</em>'.
	 * @see ceffective.VPC
	 * @generated
	 */
	EClass getVPC();

	/**
	 * Returns the meta object for the attribute '{@link ceffective.VPC#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see ceffective.VPC#getNombre()
	 * @see #getVPC()
	 * @generated
	 */
	EAttribute getVPC_Nombre();

	/**
	 * Returns the meta object for the reference list '{@link ceffective.VPC#getMecanismoseguridad <em>Mecanismoseguridad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mecanismoseguridad</em>'.
	 * @see ceffective.VPC#getMecanismoseguridad()
	 * @see #getVPC()
	 * @generated
	 */
	EReference getVPC_Mecanismoseguridad();

	/**
	 * Returns the meta object for the reference list '{@link ceffective.VPC#getRecurso <em>Recurso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Recurso</em>'.
	 * @see ceffective.VPC#getRecurso()
	 * @see #getVPC()
	 * @generated
	 */
	EReference getVPC_Recurso();

	/**
	 * Returns the meta object for class '{@link ceffective.Regla <em>Regla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regla</em>'.
	 * @see ceffective.Regla
	 * @generated
	 */
	EClass getRegla();

	/**
	 * Returns the meta object for the attribute '{@link ceffective.Regla#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see ceffective.Regla#getTipo()
	 * @see #getRegla()
	 * @generated
	 */
	EAttribute getRegla_Tipo();

	/**
	 * Returns the meta object for the attribute '{@link ceffective.Regla#getProtocolo <em>Protocolo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocolo</em>'.
	 * @see ceffective.Regla#getProtocolo()
	 * @see #getRegla()
	 * @generated
	 */
	EAttribute getRegla_Protocolo();

	/**
	 * Returns the meta object for the attribute '{@link ceffective.Regla#getPuerto <em>Puerto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Puerto</em>'.
	 * @see ceffective.Regla#getPuerto()
	 * @see #getRegla()
	 * @generated
	 */
	EAttribute getRegla_Puerto();

	/**
	 * Returns the meta object for the attribute '{@link ceffective.Regla#getOrigen <em>Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origen</em>'.
	 * @see ceffective.Regla#getOrigen()
	 * @see #getRegla()
	 * @generated
	 */
	EAttribute getRegla_Origen();

	/**
	 * Returns the meta object for the attribute '{@link ceffective.Regla#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see ceffective.Regla#getDescripcion()
	 * @see #getRegla()
	 * @generated
	 */
	EAttribute getRegla_Descripcion();

	/**
	 * Returns the meta object for class '{@link ceffective.Ceffective <em>Ceffective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ceffective</em>'.
	 * @see ceffective.Ceffective
	 * @generated
	 */
	EClass getCeffective();

	/**
	 * Returns the meta object for the containment reference '{@link ceffective.Ceffective#getProveedorNube <em>Proveedor Nube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Proveedor Nube</em>'.
	 * @see ceffective.Ceffective#getProveedorNube()
	 * @see #getCeffective()
	 * @generated
	 */
	EReference getCeffective_ProveedorNube();

	/**
	 * Returns the meta object for class '{@link ceffective.Servidor <em>Servidor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Servidor</em>'.
	 * @see ceffective.Servidor
	 * @generated
	 */
	EClass getServidor();

	/**
	 * Returns the meta object for the attribute '{@link ceffective.Servidor#getTamano <em>Tamano</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tamano</em>'.
	 * @see ceffective.Servidor#getTamano()
	 * @see #getServidor()
	 * @generated
	 */
	EAttribute getServidor_Tamano();

	/**
	 * Returns the meta object for class '{@link ceffective.AutenticacionBasica <em>Autenticacion Basica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Autenticacion Basica</em>'.
	 * @see ceffective.AutenticacionBasica
	 * @generated
	 */
	EClass getAutenticacionBasica();

	/**
	 * Returns the meta object for the attribute '{@link ceffective.AutenticacionBasica#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see ceffective.AutenticacionBasica#getPassword()
	 * @see #getAutenticacionBasica()
	 * @generated
	 */
	EAttribute getAutenticacionBasica_Password();

	/**
	 * Returns the meta object for class '{@link ceffective.AutenticacionFirma <em>Autenticacion Firma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Autenticacion Firma</em>'.
	 * @see ceffective.AutenticacionFirma
	 * @generated
	 */
	EClass getAutenticacionFirma();

	/**
	 * Returns the meta object for the attribute '{@link ceffective.AutenticacionFirma#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see ceffective.AutenticacionFirma#getNombre()
	 * @see #getAutenticacionFirma()
	 * @generated
	 */
	EAttribute getAutenticacionFirma_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link ceffective.AutenticacionFirma#getCertificado <em>Certificado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Certificado</em>'.
	 * @see ceffective.AutenticacionFirma#getCertificado()
	 * @see #getAutenticacionFirma()
	 * @generated
	 */
	EAttribute getAutenticacionFirma_Certificado();

	/**
	 * Returns the meta object for enum '{@link ceffective.TipoAmbiente <em>Tipo Ambiente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Ambiente</em>'.
	 * @see ceffective.TipoAmbiente
	 * @generated
	 */
	EEnum getTipoAmbiente();

	/**
	 * Returns the meta object for enum '{@link ceffective.TamanoServidor <em>Tamano Servidor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tamano Servidor</em>'.
	 * @see ceffective.TamanoServidor
	 * @generated
	 */
	EEnum getTamanoServidor();

	/**
	 * Returns the meta object for enum '{@link ceffective.TipoBaseDatos <em>Tipo Base Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Base Datos</em>'.
	 * @see ceffective.TipoBaseDatos
	 * @generated
	 */
	EEnum getTipoBaseDatos();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CeffectiveFactory getCeffectiveFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ceffective.impl.ProveedorNubeImpl <em>Proveedor Nube</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ceffective.impl.ProveedorNubeImpl
		 * @see ceffective.impl.CeffectivePackageImpl#getProveedorNube()
		 * @generated
		 */
		EClass PROVEEDOR_NUBE = eINSTANCE.getProveedorNube();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVEEDOR_NUBE__NOMBRE = eINSTANCE.getProveedorNube_Nombre();

		/**
		 * The meta object literal for the '<em><b>Ambientedespliegue</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVEEDOR_NUBE__AMBIENTEDESPLIEGUE = eINSTANCE.getProveedorNube_Ambientedespliegue();

		/**
		 * The meta object literal for the '<em><b>Autenticacion Usuario</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVEEDOR_NUBE__AUTENTICACION_USUARIO = eINSTANCE.getProveedorNube_AutenticacionUsuario();

		/**
		 * The meta object literal for the '<em><b>Vpc</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVEEDOR_NUBE__VPC = eINSTANCE.getProveedorNube_Vpc();

		/**
		 * The meta object literal for the '{@link ceffective.impl.AutenticacionUsuarioImpl <em>Autenticacion Usuario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ceffective.impl.AutenticacionUsuarioImpl
		 * @see ceffective.impl.CeffectivePackageImpl#getAutenticacionUsuario()
		 * @generated
		 */
		EClass AUTENTICACION_USUARIO = eINSTANCE.getAutenticacionUsuario();

		/**
		 * The meta object literal for the '<em><b>Usuario</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTENTICACION_USUARIO__USUARIO = eINSTANCE.getAutenticacionUsuario_Usuario();

		/**
		 * The meta object literal for the '<em><b>Correo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTENTICACION_USUARIO__CORREO = eINSTANCE.getAutenticacionUsuario_Correo();

		/**
		 * The meta object literal for the '{@link ceffective.impl.AmbienteDespliegueImpl <em>Ambiente Despliegue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ceffective.impl.AmbienteDespliegueImpl
		 * @see ceffective.impl.CeffectivePackageImpl#getAmbienteDespliegue()
		 * @generated
		 */
		EClass AMBIENTE_DESPLIEGUE = eINSTANCE.getAmbienteDespliegue();

		/**
		 * The meta object literal for the '<em><b>Ambiente</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMBIENTE_DESPLIEGUE__AMBIENTE = eINSTANCE.getAmbienteDespliegue_Ambiente();

		/**
		 * The meta object literal for the '<em><b>Recursos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AMBIENTE_DESPLIEGUE__RECURSOS = eINSTANCE.getAmbienteDespliegue_Recursos();

		/**
		 * The meta object literal for the '{@link ceffective.impl.RecursoImpl <em>Recurso</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ceffective.impl.RecursoImpl
		 * @see ceffective.impl.CeffectivePackageImpl#getRecurso()
		 * @generated
		 */
		EClass RECURSO = eINSTANCE.getRecurso();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURSO__NOMBRE = eINSTANCE.getRecurso_Nombre();

		/**
		 * The meta object literal for the '<em><b>Recursos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECURSO__RECURSOS = eINSTANCE.getRecurso_Recursos();

		/**
		 * The meta object literal for the '<em><b>Vpc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECURSO__VPC = eINSTANCE.getRecurso_Vpc();

		/**
		 * The meta object literal for the '<em><b>Zona Disponibilidad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURSO__ZONA_DISPONIBILIDAD = eINSTANCE.getRecurso_ZonaDisponibilidad();

		/**
		 * The meta object literal for the '<em><b>Zona Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECURSO__ZONA_NOMBRE = eINSTANCE.getRecurso_ZonaNombre();

		/**
		 * The meta object literal for the '{@link ceffective.impl.ServidorAplicacionesImpl <em>Servidor Aplicaciones</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ceffective.impl.ServidorAplicacionesImpl
		 * @see ceffective.impl.CeffectivePackageImpl#getServidorAplicaciones()
		 * @generated
		 */
		EClass SERVIDOR_APLICACIONES = eINSTANCE.getServidorAplicaciones();

		/**
		 * The meta object literal for the '<em><b>Sistema Operativo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVIDOR_APLICACIONES__SISTEMA_OPERATIVO = eINSTANCE.getServidorAplicaciones_SistemaOperativo();

		/**
		 * The meta object literal for the '{@link ceffective.impl.AlmacenamientoImpl <em>Almacenamiento</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ceffective.impl.AlmacenamientoImpl
		 * @see ceffective.impl.CeffectivePackageImpl#getAlmacenamiento()
		 * @generated
		 */
		EClass ALMACENAMIENTO = eINSTANCE.getAlmacenamiento();

		/**
		 * The meta object literal for the '<em><b>Tamano Inicial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALMACENAMIENTO__TAMANO_INICIAL = eINSTANCE.getAlmacenamiento_TamanoInicial();

		/**
		 * The meta object literal for the '{@link ceffective.impl.ServidorBDImpl <em>Servidor BD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ceffective.impl.ServidorBDImpl
		 * @see ceffective.impl.CeffectivePackageImpl#getServidorBD()
		 * @generated
		 */
		EClass SERVIDOR_BD = eINSTANCE.getServidorBD();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVIDOR_BD__TIPO = eINSTANCE.getServidorBD_Tipo();

		/**
		 * The meta object literal for the '<em><b>Sistema Manejador</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVIDOR_BD__SISTEMA_MANEJADOR = eINSTANCE.getServidorBD_SistemaManejador();

		/**
		 * The meta object literal for the '{@link ceffective.impl.MecanismoSeguridadImpl <em>Mecanismo Seguridad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ceffective.impl.MecanismoSeguridadImpl
		 * @see ceffective.impl.CeffectivePackageImpl#getMecanismoSeguridad()
		 * @generated
		 */
		EClass MECANISMO_SEGURIDAD = eINSTANCE.getMecanismoSeguridad();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MECANISMO_SEGURIDAD__NOMBRE = eINSTANCE.getMecanismoSeguridad_Nombre();

		/**
		 * The meta object literal for the '<em><b>Zona Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MECANISMO_SEGURIDAD__ZONA_NOMBRE = eINSTANCE.getMecanismoSeguridad_ZonaNombre();

		/**
		 * The meta object literal for the '<em><b>Zona Disponibilidad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MECANISMO_SEGURIDAD__ZONA_DISPONIBILIDAD = eINSTANCE.getMecanismoSeguridad_ZonaDisponibilidad();

		/**
		 * The meta object literal for the '{@link ceffective.impl.SubredImpl <em>Subred</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ceffective.impl.SubredImpl
		 * @see ceffective.impl.CeffectivePackageImpl#getSubred()
		 * @generated
		 */
		EClass SUBRED = eINSTANCE.getSubred();

		/**
		 * The meta object literal for the '<em><b>Cidr Block</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBRED__CIDR_BLOCK = eINSTANCE.getSubred_CidrBlock();

		/**
		 * The meta object literal for the '{@link ceffective.impl.InternetGatewayImpl <em>Internet Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ceffective.impl.InternetGatewayImpl
		 * @see ceffective.impl.CeffectivePackageImpl#getInternetGateway()
		 * @generated
		 */
		EClass INTERNET_GATEWAY = eINSTANCE.getInternetGateway();

		/**
		 * The meta object literal for the '{@link ceffective.impl.GrupoSeguridadImpl <em>Grupo Seguridad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ceffective.impl.GrupoSeguridadImpl
		 * @see ceffective.impl.CeffectivePackageImpl#getGrupoSeguridad()
		 * @generated
		 */
		EClass GRUPO_SEGURIDAD = eINSTANCE.getGrupoSeguridad();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRUPO_SEGURIDAD__DESCRIPCION = eINSTANCE.getGrupoSeguridad_Descripcion();

		/**
		 * The meta object literal for the '<em><b>Reglas Salida</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRUPO_SEGURIDAD__REGLAS_SALIDA = eINSTANCE.getGrupoSeguridad_ReglasSalida();

		/**
		 * The meta object literal for the '<em><b>Reglas Entrada</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRUPO_SEGURIDAD__REGLAS_ENTRADA = eINSTANCE.getGrupoSeguridad_ReglasEntrada();

		/**
		 * The meta object literal for the '{@link ceffective.impl.VPCImpl <em>VPC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ceffective.impl.VPCImpl
		 * @see ceffective.impl.CeffectivePackageImpl#getVPC()
		 * @generated
		 */
		EClass VPC = eINSTANCE.getVPC();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC__NOMBRE = eINSTANCE.getVPC_Nombre();

		/**
		 * The meta object literal for the '<em><b>Mecanismoseguridad</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VPC__MECANISMOSEGURIDAD = eINSTANCE.getVPC_Mecanismoseguridad();

		/**
		 * The meta object literal for the '<em><b>Recurso</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VPC__RECURSO = eINSTANCE.getVPC_Recurso();

		/**
		 * The meta object literal for the '{@link ceffective.impl.ReglaImpl <em>Regla</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ceffective.impl.ReglaImpl
		 * @see ceffective.impl.CeffectivePackageImpl#getRegla()
		 * @generated
		 */
		EClass REGLA = eINSTANCE.getRegla();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGLA__TIPO = eINSTANCE.getRegla_Tipo();

		/**
		 * The meta object literal for the '<em><b>Protocolo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGLA__PROTOCOLO = eINSTANCE.getRegla_Protocolo();

		/**
		 * The meta object literal for the '<em><b>Puerto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGLA__PUERTO = eINSTANCE.getRegla_Puerto();

		/**
		 * The meta object literal for the '<em><b>Origen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGLA__ORIGEN = eINSTANCE.getRegla_Origen();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGLA__DESCRIPCION = eINSTANCE.getRegla_Descripcion();

		/**
		 * The meta object literal for the '{@link ceffective.impl.CeffectiveImpl <em>Ceffective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ceffective.impl.CeffectiveImpl
		 * @see ceffective.impl.CeffectivePackageImpl#getCeffective()
		 * @generated
		 */
		EClass CEFFECTIVE = eINSTANCE.getCeffective();

		/**
		 * The meta object literal for the '<em><b>Proveedor Nube</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CEFFECTIVE__PROVEEDOR_NUBE = eINSTANCE.getCeffective_ProveedorNube();

		/**
		 * The meta object literal for the '{@link ceffective.impl.ServidorImpl <em>Servidor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ceffective.impl.ServidorImpl
		 * @see ceffective.impl.CeffectivePackageImpl#getServidor()
		 * @generated
		 */
		EClass SERVIDOR = eINSTANCE.getServidor();

		/**
		 * The meta object literal for the '<em><b>Tamano</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVIDOR__TAMANO = eINSTANCE.getServidor_Tamano();

		/**
		 * The meta object literal for the '{@link ceffective.impl.AutenticacionBasicaImpl <em>Autenticacion Basica</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ceffective.impl.AutenticacionBasicaImpl
		 * @see ceffective.impl.CeffectivePackageImpl#getAutenticacionBasica()
		 * @generated
		 */
		EClass AUTENTICACION_BASICA = eINSTANCE.getAutenticacionBasica();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTENTICACION_BASICA__PASSWORD = eINSTANCE.getAutenticacionBasica_Password();

		/**
		 * The meta object literal for the '{@link ceffective.impl.AutenticacionFirmaImpl <em>Autenticacion Firma</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ceffective.impl.AutenticacionFirmaImpl
		 * @see ceffective.impl.CeffectivePackageImpl#getAutenticacionFirma()
		 * @generated
		 */
		EClass AUTENTICACION_FIRMA = eINSTANCE.getAutenticacionFirma();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTENTICACION_FIRMA__NOMBRE = eINSTANCE.getAutenticacionFirma_Nombre();

		/**
		 * The meta object literal for the '<em><b>Certificado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTENTICACION_FIRMA__CERTIFICADO = eINSTANCE.getAutenticacionFirma_Certificado();

		/**
		 * The meta object literal for the '{@link ceffective.TipoAmbiente <em>Tipo Ambiente</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ceffective.TipoAmbiente
		 * @see ceffective.impl.CeffectivePackageImpl#getTipoAmbiente()
		 * @generated
		 */
		EEnum TIPO_AMBIENTE = eINSTANCE.getTipoAmbiente();

		/**
		 * The meta object literal for the '{@link ceffective.TamanoServidor <em>Tamano Servidor</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ceffective.TamanoServidor
		 * @see ceffective.impl.CeffectivePackageImpl#getTamanoServidor()
		 * @generated
		 */
		EEnum TAMANO_SERVIDOR = eINSTANCE.getTamanoServidor();

		/**
		 * The meta object literal for the '{@link ceffective.TipoBaseDatos <em>Tipo Base Datos</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ceffective.TipoBaseDatos
		 * @see ceffective.impl.CeffectivePackageImpl#getTipoBaseDatos()
		 * @generated
		 */
		EEnum TIPO_BASE_DATOS = eINSTANCE.getTipoBaseDatos();

	}

} //CeffectivePackage
