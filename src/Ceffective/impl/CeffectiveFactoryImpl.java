/**
 */
package ceffective.impl;

import ceffective.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CeffectiveFactoryImpl extends EFactoryImpl implements CeffectiveFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CeffectiveFactory init() {
		try {
			CeffectiveFactory theCeffectiveFactory = (CeffectiveFactory)EPackage.Registry.INSTANCE.getEFactory(CeffectivePackage.eNS_URI);
			if (theCeffectiveFactory != null) {
				return theCeffectiveFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CeffectiveFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CeffectiveFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CeffectivePackage.PROVEEDOR_NUBE: return createProveedorNube();
			case CeffectivePackage.AUTENTICACION_USUARIO: return createAutenticacionUsuario();
			case CeffectivePackage.AMBIENTE_DESPLIEGUE: return createAmbienteDespliegue();
			case CeffectivePackage.SERVIDOR_APLICACIONES: return createServidorAplicaciones();
			case CeffectivePackage.ALMACENAMIENTO: return createAlmacenamiento();
			case CeffectivePackage.SERVIDOR_BD: return createServidorBD();
			case CeffectivePackage.SUBRED: return createSubred();
			case CeffectivePackage.INTERNET_GATEWAY: return createInternetGateway();
			case CeffectivePackage.GRUPO_SEGURIDAD: return createGrupoSeguridad();
			case CeffectivePackage.VPC: return createVPC();
			case CeffectivePackage.REGLA: return createRegla();
			case CeffectivePackage.CEFFECTIVE: return createCeffective();
			case CeffectivePackage.SERVIDOR: return createServidor();
			case CeffectivePackage.AUTENTICACION_BASICA: return createAutenticacionBasica();
			case CeffectivePackage.AUTENTICACION_FIRMA: return createAutenticacionFirma();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CeffectivePackage.TIPO_AMBIENTE:
				return createTipoAmbienteFromString(eDataType, initialValue);
			case CeffectivePackage.TAMANO_SERVIDOR:
				return createTamanoServidorFromString(eDataType, initialValue);
			case CeffectivePackage.TIPO_BASE_DATOS:
				return createTipoBaseDatosFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CeffectivePackage.TIPO_AMBIENTE:
				return convertTipoAmbienteToString(eDataType, instanceValue);
			case CeffectivePackage.TAMANO_SERVIDOR:
				return convertTamanoServidorToString(eDataType, instanceValue);
			case CeffectivePackage.TIPO_BASE_DATOS:
				return convertTipoBaseDatosToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProveedorNube createProveedorNube() {
		ProveedorNubeImpl proveedorNube = new ProveedorNubeImpl();
		return proveedorNube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutenticacionUsuario createAutenticacionUsuario() {
		AutenticacionUsuarioImpl autenticacionUsuario = new AutenticacionUsuarioImpl();
		return autenticacionUsuario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmbienteDespliegue createAmbienteDespliegue() {
		AmbienteDespliegueImpl ambienteDespliegue = new AmbienteDespliegueImpl();
		return ambienteDespliegue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServidorAplicaciones createServidorAplicaciones() {
		ServidorAplicacionesImpl servidorAplicaciones = new ServidorAplicacionesImpl();
		return servidorAplicaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Almacenamiento createAlmacenamiento() {
		AlmacenamientoImpl almacenamiento = new AlmacenamientoImpl();
		return almacenamiento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServidorBD createServidorBD() {
		ServidorBDImpl servidorBD = new ServidorBDImpl();
		return servidorBD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subred createSubred() {
		SubredImpl subred = new SubredImpl();
		return subred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternetGateway createInternetGateway() {
		InternetGatewayImpl internetGateway = new InternetGatewayImpl();
		return internetGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrupoSeguridad createGrupoSeguridad() {
		GrupoSeguridadImpl grupoSeguridad = new GrupoSeguridadImpl();
		return grupoSeguridad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VPC createVPC() {
		VPCImpl vpc = new VPCImpl();
		return vpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Regla createRegla() {
		ReglaImpl regla = new ReglaImpl();
		return regla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ceffective createCeffective() {
		CeffectiveImpl ceffective = new CeffectiveImpl();
		return ceffective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Servidor createServidor() {
		ServidorImpl servidor = new ServidorImpl();
		return servidor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutenticacionBasica createAutenticacionBasica() {
		AutenticacionBasicaImpl autenticacionBasica = new AutenticacionBasicaImpl();
		return autenticacionBasica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutenticacionFirma createAutenticacionFirma() {
		AutenticacionFirmaImpl autenticacionFirma = new AutenticacionFirmaImpl();
		return autenticacionFirma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoAmbiente createTipoAmbienteFromString(EDataType eDataType, String initialValue) {
		TipoAmbiente result = TipoAmbiente.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoAmbienteToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TamanoServidor createTamanoServidorFromString(EDataType eDataType, String initialValue) {
		TamanoServidor result = TamanoServidor.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTamanoServidorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoBaseDatos createTipoBaseDatosFromString(EDataType eDataType, String initialValue) {
		TipoBaseDatos result = TipoBaseDatos.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoBaseDatosToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CeffectivePackage getCeffectivePackage() {
		return (CeffectivePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CeffectivePackage getPackage() {
		return CeffectivePackage.eINSTANCE;
	}

} //CeffectiveFactoryImpl
