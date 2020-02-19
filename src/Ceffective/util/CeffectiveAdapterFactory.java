/**
 */
package Ceffective.util;

import Ceffective.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Ceffective.CeffectivePackage
 * @generated
 */
public class CeffectiveAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CeffectivePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CeffectiveAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CeffectivePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CeffectiveSwitch<Adapter> modelSwitch =
		new CeffectiveSwitch<Adapter>() {
			@Override
			public Adapter caseProveedorNube(ProveedorNube object) {
				return createProveedorNubeAdapter();
			}
			@Override
			public Adapter caseAutenticacionUsuario(AutenticacionUsuario object) {
				return createAutenticacionUsuarioAdapter();
			}
			@Override
			public Adapter caseAmbienteDespliegue(AmbienteDespliegue object) {
				return createAmbienteDespliegueAdapter();
			}
			@Override
			public Adapter caseRecurso(Recurso object) {
				return createRecursoAdapter();
			}
			@Override
			public Adapter caseServidorAplicaciones(ServidorAplicaciones object) {
				return createServidorAplicacionesAdapter();
			}
			@Override
			public Adapter caseAlmacenamiento(Almacenamiento object) {
				return createAlmacenamientoAdapter();
			}
			@Override
			public Adapter caseServidorBD(ServidorBD object) {
				return createServidorBDAdapter();
			}
			@Override
			public Adapter caseMecanismoSeguridad(MecanismoSeguridad object) {
				return createMecanismoSeguridadAdapter();
			}
			@Override
			public Adapter caseSubred(Subred object) {
				return createSubredAdapter();
			}
			@Override
			public Adapter caseInternetGateway(InternetGateway object) {
				return createInternetGatewayAdapter();
			}
			@Override
			public Adapter caseGrupoSeguridad(GrupoSeguridad object) {
				return createGrupoSeguridadAdapter();
			}
			@Override
			public Adapter caseVPC(VPC object) {
				return createVPCAdapter();
			}
			@Override
			public Adapter caseRegla(Regla object) {
				return createReglaAdapter();
			}
			@Override
			public Adapter caseCeffective(Ceffective object) {
				return createCeffectiveAdapter();
			}
			@Override
			public Adapter caseServidor(Servidor object) {
				return createServidorAdapter();
			}
			@Override
			public Adapter caseAutenticacionBasica(AutenticacionBasica object) {
				return createAutenticacionBasicaAdapter();
			}
			@Override
			public Adapter caseAutenticacionFirma(AutenticacionFirma object) {
				return createAutenticacionFirmaAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Ceffective.ProveedorNube <em>Proveedor Nube</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Ceffective.ProveedorNube
	 * @generated
	 */
	public Adapter createProveedorNubeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Ceffective.AutenticacionUsuario <em>Autenticacion Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Ceffective.AutenticacionUsuario
	 * @generated
	 */
	public Adapter createAutenticacionUsuarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Ceffective.AmbienteDespliegue <em>Ambiente Despliegue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Ceffective.AmbienteDespliegue
	 * @generated
	 */
	public Adapter createAmbienteDespliegueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Ceffective.Recurso <em>Recurso</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Ceffective.Recurso
	 * @generated
	 */
	public Adapter createRecursoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Ceffective.ServidorAplicaciones <em>Servidor Aplicaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Ceffective.ServidorAplicaciones
	 * @generated
	 */
	public Adapter createServidorAplicacionesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Ceffective.Almacenamiento <em>Almacenamiento</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Ceffective.Almacenamiento
	 * @generated
	 */
	public Adapter createAlmacenamientoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Ceffective.ServidorBD <em>Servidor BD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Ceffective.ServidorBD
	 * @generated
	 */
	public Adapter createServidorBDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Ceffective.MecanismoSeguridad <em>Mecanismo Seguridad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Ceffective.MecanismoSeguridad
	 * @generated
	 */
	public Adapter createMecanismoSeguridadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Ceffective.Subred <em>Subred</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Ceffective.Subred
	 * @generated
	 */
	public Adapter createSubredAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Ceffective.InternetGateway <em>Internet Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Ceffective.InternetGateway
	 * @generated
	 */
	public Adapter createInternetGatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Ceffective.GrupoSeguridad <em>Grupo Seguridad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Ceffective.GrupoSeguridad
	 * @generated
	 */
	public Adapter createGrupoSeguridadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Ceffective.VPC <em>VPC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Ceffective.VPC
	 * @generated
	 */
	public Adapter createVPCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Ceffective.Regla <em>Regla</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Ceffective.Regla
	 * @generated
	 */
	public Adapter createReglaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Ceffective.Ceffective <em>Ceffective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Ceffective.Ceffective
	 * @generated
	 */
	public Adapter createCeffectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Ceffective.Servidor <em>Servidor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Ceffective.Servidor
	 * @generated
	 */
	public Adapter createServidorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Ceffective.AutenticacionBasica <em>Autenticacion Basica</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Ceffective.AutenticacionBasica
	 * @generated
	 */
	public Adapter createAutenticacionBasicaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Ceffective.AutenticacionFirma <em>Autenticacion Firma</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Ceffective.AutenticacionFirma
	 * @generated
	 */
	public Adapter createAutenticacionFirmaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CeffectiveAdapterFactory
