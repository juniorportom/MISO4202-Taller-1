/**
 */
package ceffective.impl;

import ceffective.Almacenamiento;
import ceffective.AmbienteDespliegue;
import ceffective.AutenticacionBasica;
import ceffective.AutenticacionFirma;
import ceffective.AutenticacionUsuario;
import ceffective.Ceffective;
import ceffective.CeffectiveFactory;
import ceffective.CeffectivePackage;
import ceffective.GrupoSeguridad;
import ceffective.InternetGateway;
import ceffective.MecanismoSeguridad;
import ceffective.ProveedorNube;
import ceffective.Recurso;
import ceffective.Regla;
import ceffective.Servidor;
import ceffective.ServidorAplicaciones;
import ceffective.ServidorBD;
import ceffective.Subred;
import ceffective.TamanoServidor;
import ceffective.TipoAmbiente;
import ceffective.TipoBaseDatos;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CeffectivePackageImpl extends EPackageImpl implements CeffectivePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proveedorNubeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass autenticacionUsuarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ambienteDespliegueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recursoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servidorAplicacionesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass almacenamientoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servidorBDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mecanismoSeguridadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subredEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internetGatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grupoSeguridadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vpcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reglaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ceffectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servidorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass autenticacionBasicaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass autenticacionFirmaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoAmbienteEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tamanoServidorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoBaseDatosEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ceffective.CeffectivePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CeffectivePackageImpl() {
		super(eNS_URI, CeffectiveFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CeffectivePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CeffectivePackage init() {
		if (isInited) return (CeffectivePackage)EPackage.Registry.INSTANCE.getEPackage(CeffectivePackage.eNS_URI);

		// Obtain or create and register package
		CeffectivePackageImpl theCeffectivePackage = (CeffectivePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CeffectivePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CeffectivePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCeffectivePackage.createPackageContents();

		// Initialize created meta-data
		theCeffectivePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCeffectivePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CeffectivePackage.eNS_URI, theCeffectivePackage);
		return theCeffectivePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProveedorNube() {
		return proveedorNubeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProveedorNube_Nombre() {
		return (EAttribute)proveedorNubeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProveedorNube_Ambientedespliegue() {
		return (EReference)proveedorNubeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProveedorNube_AutenticacionUsuario() {
		return (EReference)proveedorNubeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProveedorNube_Vpc() {
		return (EReference)proveedorNubeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutenticacionUsuario() {
		return autenticacionUsuarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutenticacionUsuario_Usuario() {
		return (EAttribute)autenticacionUsuarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutenticacionUsuario_Correo() {
		return (EAttribute)autenticacionUsuarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAmbienteDespliegue() {
		return ambienteDespliegueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAmbienteDespliegue_Ambiente() {
		return (EAttribute)ambienteDespliegueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAmbienteDespliegue_Recursos() {
		return (EReference)ambienteDespliegueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecurso() {
		return recursoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecurso_Nombre() {
		return (EAttribute)recursoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecurso_Recursos() {
		return (EReference)recursoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecurso_Vpc() {
		return (EReference)recursoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecurso_ZonaDisponibilidad() {
		return (EAttribute)recursoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecurso_ZonaNombre() {
		return (EAttribute)recursoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServidorAplicaciones() {
		return servidorAplicacionesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServidorAplicaciones_SistemaOperativo() {
		return (EAttribute)servidorAplicacionesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlmacenamiento() {
		return almacenamientoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlmacenamiento_TamanoInicial() {
		return (EAttribute)almacenamientoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServidorBD() {
		return servidorBDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServidorBD_Tipo() {
		return (EAttribute)servidorBDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServidorBD_SistemaManejador() {
		return (EAttribute)servidorBDEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMecanismoSeguridad() {
		return mecanismoSeguridadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMecanismoSeguridad_Nombre() {
		return (EAttribute)mecanismoSeguridadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMecanismoSeguridad_ZonaNombre() {
		return (EAttribute)mecanismoSeguridadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMecanismoSeguridad_ZonaDisponibilidad() {
		return (EAttribute)mecanismoSeguridadEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubred() {
		return subredEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubred_CidrBlock() {
		return (EAttribute)subredEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternetGateway() {
		return internetGatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrupoSeguridad() {
		return grupoSeguridadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGrupoSeguridad_Descripcion() {
		return (EAttribute)grupoSeguridadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrupoSeguridad_ReglasSalida() {
		return (EReference)grupoSeguridadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrupoSeguridad_ReglasEntrada() {
		return (EReference)grupoSeguridadEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVPC() {
		return vpcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVPC_Nombre() {
		return (EAttribute)vpcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVPC_Mecanismoseguridad() {
		return (EReference)vpcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVPC_Recurso() {
		return (EReference)vpcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegla() {
		return reglaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegla_Tipo() {
		return (EAttribute)reglaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegla_Protocolo() {
		return (EAttribute)reglaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegla_Puerto() {
		return (EAttribute)reglaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegla_Origen() {
		return (EAttribute)reglaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegla_Descripcion() {
		return (EAttribute)reglaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCeffective() {
		return ceffectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCeffective_ProveedorNube() {
		return (EReference)ceffectiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServidor() {
		return servidorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServidor_Tamano() {
		return (EAttribute)servidorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutenticacionBasica() {
		return autenticacionBasicaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutenticacionBasica_Password() {
		return (EAttribute)autenticacionBasicaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutenticacionFirma() {
		return autenticacionFirmaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutenticacionFirma_Nombre() {
		return (EAttribute)autenticacionFirmaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutenticacionFirma_Certificado() {
		return (EAttribute)autenticacionFirmaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoAmbiente() {
		return tipoAmbienteEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTamanoServidor() {
		return tamanoServidorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoBaseDatos() {
		return tipoBaseDatosEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CeffectiveFactory getCeffectiveFactory() {
		return (CeffectiveFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		proveedorNubeEClass = createEClass(PROVEEDOR_NUBE);
		createEAttribute(proveedorNubeEClass, PROVEEDOR_NUBE__NOMBRE);
		createEReference(proveedorNubeEClass, PROVEEDOR_NUBE__AMBIENTEDESPLIEGUE);
		createEReference(proveedorNubeEClass, PROVEEDOR_NUBE__AUTENTICACION_USUARIO);
		createEReference(proveedorNubeEClass, PROVEEDOR_NUBE__VPC);

		autenticacionUsuarioEClass = createEClass(AUTENTICACION_USUARIO);
		createEAttribute(autenticacionUsuarioEClass, AUTENTICACION_USUARIO__USUARIO);
		createEAttribute(autenticacionUsuarioEClass, AUTENTICACION_USUARIO__CORREO);

		ambienteDespliegueEClass = createEClass(AMBIENTE_DESPLIEGUE);
		createEAttribute(ambienteDespliegueEClass, AMBIENTE_DESPLIEGUE__AMBIENTE);
		createEReference(ambienteDespliegueEClass, AMBIENTE_DESPLIEGUE__RECURSOS);

		recursoEClass = createEClass(RECURSO);
		createEAttribute(recursoEClass, RECURSO__NOMBRE);
		createEReference(recursoEClass, RECURSO__RECURSOS);
		createEReference(recursoEClass, RECURSO__VPC);
		createEAttribute(recursoEClass, RECURSO__ZONA_DISPONIBILIDAD);
		createEAttribute(recursoEClass, RECURSO__ZONA_NOMBRE);

		servidorAplicacionesEClass = createEClass(SERVIDOR_APLICACIONES);
		createEAttribute(servidorAplicacionesEClass, SERVIDOR_APLICACIONES__SISTEMA_OPERATIVO);

		almacenamientoEClass = createEClass(ALMACENAMIENTO);
		createEAttribute(almacenamientoEClass, ALMACENAMIENTO__TAMANO_INICIAL);

		servidorBDEClass = createEClass(SERVIDOR_BD);
		createEAttribute(servidorBDEClass, SERVIDOR_BD__TIPO);
		createEAttribute(servidorBDEClass, SERVIDOR_BD__SISTEMA_MANEJADOR);

		mecanismoSeguridadEClass = createEClass(MECANISMO_SEGURIDAD);
		createEAttribute(mecanismoSeguridadEClass, MECANISMO_SEGURIDAD__NOMBRE);
		createEAttribute(mecanismoSeguridadEClass, MECANISMO_SEGURIDAD__ZONA_NOMBRE);
		createEAttribute(mecanismoSeguridadEClass, MECANISMO_SEGURIDAD__ZONA_DISPONIBILIDAD);

		subredEClass = createEClass(SUBRED);
		createEAttribute(subredEClass, SUBRED__CIDR_BLOCK);

		internetGatewayEClass = createEClass(INTERNET_GATEWAY);

		grupoSeguridadEClass = createEClass(GRUPO_SEGURIDAD);
		createEAttribute(grupoSeguridadEClass, GRUPO_SEGURIDAD__DESCRIPCION);
		createEReference(grupoSeguridadEClass, GRUPO_SEGURIDAD__REGLAS_SALIDA);
		createEReference(grupoSeguridadEClass, GRUPO_SEGURIDAD__REGLAS_ENTRADA);

		vpcEClass = createEClass(VPC);
		createEAttribute(vpcEClass, VPC__NOMBRE);
		createEReference(vpcEClass, VPC__MECANISMOSEGURIDAD);
		createEReference(vpcEClass, VPC__RECURSO);

		reglaEClass = createEClass(REGLA);
		createEAttribute(reglaEClass, REGLA__TIPO);
		createEAttribute(reglaEClass, REGLA__PROTOCOLO);
		createEAttribute(reglaEClass, REGLA__PUERTO);
		createEAttribute(reglaEClass, REGLA__ORIGEN);
		createEAttribute(reglaEClass, REGLA__DESCRIPCION);

		ceffectiveEClass = createEClass(CEFFECTIVE);
		createEReference(ceffectiveEClass, CEFFECTIVE__PROVEEDOR_NUBE);

		servidorEClass = createEClass(SERVIDOR);
		createEAttribute(servidorEClass, SERVIDOR__TAMANO);

		autenticacionBasicaEClass = createEClass(AUTENTICACION_BASICA);
		createEAttribute(autenticacionBasicaEClass, AUTENTICACION_BASICA__PASSWORD);

		autenticacionFirmaEClass = createEClass(AUTENTICACION_FIRMA);
		createEAttribute(autenticacionFirmaEClass, AUTENTICACION_FIRMA__NOMBRE);
		createEAttribute(autenticacionFirmaEClass, AUTENTICACION_FIRMA__CERTIFICADO);

		// Create enums
		tipoAmbienteEEnum = createEEnum(TIPO_AMBIENTE);
		tamanoServidorEEnum = createEEnum(TAMANO_SERVIDOR);
		tipoBaseDatosEEnum = createEEnum(TIPO_BASE_DATOS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		servidorAplicacionesEClass.getESuperTypes().add(this.getServidor());
		almacenamientoEClass.getESuperTypes().add(this.getRecurso());
		servidorBDEClass.getESuperTypes().add(this.getServidor());
		subredEClass.getESuperTypes().add(this.getMecanismoSeguridad());
		internetGatewayEClass.getESuperTypes().add(this.getMecanismoSeguridad());
		grupoSeguridadEClass.getESuperTypes().add(this.getMecanismoSeguridad());
		servidorEClass.getESuperTypes().add(this.getRecurso());
		autenticacionBasicaEClass.getESuperTypes().add(this.getAutenticacionUsuario());
		autenticacionFirmaEClass.getESuperTypes().add(this.getAutenticacionUsuario());

		// Initialize classes, features, and operations; add parameters
		initEClass(proveedorNubeEClass, ProveedorNube.class, "ProveedorNube", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProveedorNube_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, ProveedorNube.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProveedorNube_Ambientedespliegue(), this.getAmbienteDespliegue(), null, "ambientedespliegue", null, 0, -1, ProveedorNube.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProveedorNube_AutenticacionUsuario(), this.getAutenticacionUsuario(), null, "autenticacionUsuario", null, 1, -1, ProveedorNube.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProveedorNube_Vpc(), this.getVPC(), null, "vpc", null, 0, -1, ProveedorNube.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(autenticacionUsuarioEClass, AutenticacionUsuario.class, "AutenticacionUsuario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAutenticacionUsuario_Usuario(), ecorePackage.getEString(), "usuario", null, 0, 1, AutenticacionUsuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAutenticacionUsuario_Correo(), ecorePackage.getEString(), "correo", null, 0, 1, AutenticacionUsuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ambienteDespliegueEClass, AmbienteDespliegue.class, "AmbienteDespliegue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAmbienteDespliegue_Ambiente(), this.getTipoAmbiente(), "ambiente", "IST", 0, 1, AmbienteDespliegue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAmbienteDespliegue_Recursos(), this.getRecurso(), null, "recursos", null, 0, -1, AmbienteDespliegue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recursoEClass, Recurso.class, "Recurso", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecurso_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Recurso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecurso_Recursos(), this.getRecurso(), null, "recursos", null, 0, -1, Recurso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecurso_Vpc(), this.getVPC(), this.getVPC_Recurso(), "vpc", null, 0, 1, Recurso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecurso_ZonaDisponibilidad(), ecorePackage.getEString(), "zonaDisponibilidad", null, 0, 1, Recurso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecurso_ZonaNombre(), ecorePackage.getEString(), "zonaNombre", null, 0, 1, Recurso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(servidorAplicacionesEClass, ServidorAplicaciones.class, "ServidorAplicaciones", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServidorAplicaciones_SistemaOperativo(), ecorePackage.getEString(), "sistemaOperativo", null, 0, 1, ServidorAplicaciones.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(almacenamientoEClass, Almacenamiento.class, "Almacenamiento", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlmacenamiento_TamanoInicial(), ecorePackage.getEInt(), "tamanoInicial", null, 0, 1, Almacenamiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(servidorBDEClass, ServidorBD.class, "ServidorBD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServidorBD_Tipo(), this.getTipoBaseDatos(), "tipo", "Relacional", 0, 1, ServidorBD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServidorBD_SistemaManejador(), ecorePackage.getEString(), "sistemaManejador", null, 0, 1, ServidorBD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mecanismoSeguridadEClass, MecanismoSeguridad.class, "MecanismoSeguridad", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMecanismoSeguridad_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, MecanismoSeguridad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMecanismoSeguridad_ZonaNombre(), ecorePackage.getEString(), "zonaNombre", null, 0, 1, MecanismoSeguridad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMecanismoSeguridad_ZonaDisponibilidad(), ecorePackage.getEString(), "zonaDisponibilidad", null, 0, 1, MecanismoSeguridad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subredEClass, Subred.class, "Subred", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubred_CidrBlock(), ecorePackage.getEString(), "cidrBlock", null, 0, 1, Subred.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internetGatewayEClass, InternetGateway.class, "InternetGateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(grupoSeguridadEClass, GrupoSeguridad.class, "GrupoSeguridad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGrupoSeguridad_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, GrupoSeguridad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrupoSeguridad_ReglasSalida(), this.getRegla(), null, "reglasSalida", null, 1, -1, GrupoSeguridad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrupoSeguridad_ReglasEntrada(), this.getRegla(), null, "reglasEntrada", null, 1, -1, GrupoSeguridad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vpcEClass, ceffective.VPC.class, "VPC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVPC_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, ceffective.VPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVPC_Mecanismoseguridad(), this.getMecanismoSeguridad(), null, "mecanismoseguridad", null, 0, -1, ceffective.VPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVPC_Recurso(), this.getRecurso(), this.getRecurso_Vpc(), "recurso", null, 0, -1, ceffective.VPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reglaEClass, Regla.class, "Regla", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegla_Tipo(), ecorePackage.getEString(), "tipo", null, 0, 1, Regla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegla_Protocolo(), ecorePackage.getEString(), "protocolo", null, 0, 1, Regla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegla_Puerto(), ecorePackage.getEString(), "puerto", null, 0, 1, Regla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegla_Origen(), ecorePackage.getEString(), "origen", null, 0, 1, Regla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegla_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, Regla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ceffectiveEClass, Ceffective.class, "Ceffective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCeffective_ProveedorNube(), this.getProveedorNube(), null, "proveedorNube", null, 0, 1, Ceffective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(servidorEClass, Servidor.class, "Servidor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServidor_Tamano(), this.getTamanoServidor(), "tamano", "Micro", 0, 1, Servidor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(autenticacionBasicaEClass, AutenticacionBasica.class, "AutenticacionBasica", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAutenticacionBasica_Password(), ecorePackage.getEString(), "password", null, 0, 1, AutenticacionBasica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(autenticacionFirmaEClass, AutenticacionFirma.class, "AutenticacionFirma", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAutenticacionFirma_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, AutenticacionFirma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAutenticacionFirma_Certificado(), ecorePackage.getEString(), "certificado", null, 0, 1, AutenticacionFirma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(tipoAmbienteEEnum, TipoAmbiente.class, "TipoAmbiente");
		addEEnumLiteral(tipoAmbienteEEnum, TipoAmbiente.IST);
		addEEnumLiteral(tipoAmbienteEEnum, TipoAmbiente.QA);
		addEEnumLiteral(tipoAmbienteEEnum, TipoAmbiente.NFT);
		addEEnumLiteral(tipoAmbienteEEnum, TipoAmbiente.PRD);

		initEEnum(tamanoServidorEEnum, TamanoServidor.class, "TamanoServidor");
		addEEnumLiteral(tamanoServidorEEnum, TamanoServidor.MICRO);
		addEEnumLiteral(tamanoServidorEEnum, TamanoServidor.SMALL);
		addEEnumLiteral(tamanoServidorEEnum, TamanoServidor.MEDIUM);
		addEEnumLiteral(tamanoServidorEEnum, TamanoServidor.LARGE);

		initEEnum(tipoBaseDatosEEnum, TipoBaseDatos.class, "TipoBaseDatos");
		addEEnumLiteral(tipoBaseDatosEEnum, TipoBaseDatos.RELACIONAL);
		addEEnumLiteral(tipoBaseDatosEEnum, TipoBaseDatos.NO_SQL);

		// Create resource
		createResource(eNS_URI);
	}

} //CeffectivePackageImpl
