/**
 */
package ceffective.impl;

import ceffective.AmbienteDespliegue;
import ceffective.CeffectivePackage;
import ceffective.MecanismoSeguridad;
import ceffective.Recurso;
import ceffective.TipoAmbiente;

import ceffective.VPC;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ambiente Despliegue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ceffective.impl.AmbienteDespliegueImpl#getAmbiente <em>Ambiente</em>}</li>
 *   <li>{@link ceffective.impl.AmbienteDespliegueImpl#getRecursos <em>Recursos</em>}</li>
 *   <li>{@link ceffective.impl.AmbienteDespliegueImpl#getVpc <em>Vpc</em>}</li>
 *   <li>{@link ceffective.impl.AmbienteDespliegueImpl#getMecanismoseguridad <em>Mecanismoseguridad</em>}</li>
 *   <li>{@link ceffective.impl.AmbienteDespliegueImpl#getNombre <em>Nombre</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AmbienteDespliegueImpl extends MinimalEObjectImpl.Container implements AmbienteDespliegue {
	/**
	 * The default value of the '{@link #getAmbiente() <em>Ambiente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmbiente()
	 * @generated
	 * @ordered
	 */
	protected static final TipoAmbiente AMBIENTE_EDEFAULT = TipoAmbiente.IST;

	/**
	 * The cached value of the '{@link #getAmbiente() <em>Ambiente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmbiente()
	 * @generated
	 * @ordered
	 */
	protected TipoAmbiente ambiente = AMBIENTE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRecursos() <em>Recursos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecursos()
	 * @generated
	 * @ordered
	 */
	protected EList<Recurso> recursos;

	/**
	 * The cached value of the '{@link #getVpc() <em>Vpc</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpc()
	 * @generated
	 * @ordered
	 */
	protected EList<VPC> vpc;

	/**
	 * The cached value of the '{@link #getMecanismoseguridad() <em>Mecanismoseguridad</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMecanismoseguridad()
	 * @generated
	 * @ordered
	 */
	protected EList<MecanismoSeguridad> mecanismoseguridad;

	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AmbienteDespliegueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CeffectivePackage.Literals.AMBIENTE_DESPLIEGUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoAmbiente getAmbiente() {
		return ambiente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmbiente(TipoAmbiente newAmbiente) {
		TipoAmbiente oldAmbiente = ambiente;
		ambiente = newAmbiente == null ? AMBIENTE_EDEFAULT : newAmbiente;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeffectivePackage.AMBIENTE_DESPLIEGUE__AMBIENTE, oldAmbiente, ambiente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Recurso> getRecursos() {
		if (recursos == null) {
			recursos = new EObjectResolvingEList<Recurso>(Recurso.class, this, CeffectivePackage.AMBIENTE_DESPLIEGUE__RECURSOS);
		}
		return recursos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VPC> getVpc() {
		if (vpc == null) {
			vpc = new EObjectResolvingEList<VPC>(VPC.class, this, CeffectivePackage.AMBIENTE_DESPLIEGUE__VPC);
		}
		return vpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MecanismoSeguridad> getMecanismoseguridad() {
		if (mecanismoseguridad == null) {
			mecanismoseguridad = new EObjectContainmentEList<MecanismoSeguridad>(MecanismoSeguridad.class, this, CeffectivePackage.AMBIENTE_DESPLIEGUE__MECANISMOSEGURIDAD);
		}
		return mecanismoseguridad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeffectivePackage.AMBIENTE_DESPLIEGUE__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CeffectivePackage.AMBIENTE_DESPLIEGUE__MECANISMOSEGURIDAD:
				return ((InternalEList<?>)getMecanismoseguridad()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CeffectivePackage.AMBIENTE_DESPLIEGUE__AMBIENTE:
				return getAmbiente();
			case CeffectivePackage.AMBIENTE_DESPLIEGUE__RECURSOS:
				return getRecursos();
			case CeffectivePackage.AMBIENTE_DESPLIEGUE__VPC:
				return getVpc();
			case CeffectivePackage.AMBIENTE_DESPLIEGUE__MECANISMOSEGURIDAD:
				return getMecanismoseguridad();
			case CeffectivePackage.AMBIENTE_DESPLIEGUE__NOMBRE:
				return getNombre();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CeffectivePackage.AMBIENTE_DESPLIEGUE__AMBIENTE:
				setAmbiente((TipoAmbiente)newValue);
				return;
			case CeffectivePackage.AMBIENTE_DESPLIEGUE__RECURSOS:
				getRecursos().clear();
				getRecursos().addAll((Collection<? extends Recurso>)newValue);
				return;
			case CeffectivePackage.AMBIENTE_DESPLIEGUE__VPC:
				getVpc().clear();
				getVpc().addAll((Collection<? extends VPC>)newValue);
				return;
			case CeffectivePackage.AMBIENTE_DESPLIEGUE__MECANISMOSEGURIDAD:
				getMecanismoseguridad().clear();
				getMecanismoseguridad().addAll((Collection<? extends MecanismoSeguridad>)newValue);
				return;
			case CeffectivePackage.AMBIENTE_DESPLIEGUE__NOMBRE:
				setNombre((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CeffectivePackage.AMBIENTE_DESPLIEGUE__AMBIENTE:
				setAmbiente(AMBIENTE_EDEFAULT);
				return;
			case CeffectivePackage.AMBIENTE_DESPLIEGUE__RECURSOS:
				getRecursos().clear();
				return;
			case CeffectivePackage.AMBIENTE_DESPLIEGUE__VPC:
				getVpc().clear();
				return;
			case CeffectivePackage.AMBIENTE_DESPLIEGUE__MECANISMOSEGURIDAD:
				getMecanismoseguridad().clear();
				return;
			case CeffectivePackage.AMBIENTE_DESPLIEGUE__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CeffectivePackage.AMBIENTE_DESPLIEGUE__AMBIENTE:
				return ambiente != AMBIENTE_EDEFAULT;
			case CeffectivePackage.AMBIENTE_DESPLIEGUE__RECURSOS:
				return recursos != null && !recursos.isEmpty();
			case CeffectivePackage.AMBIENTE_DESPLIEGUE__VPC:
				return vpc != null && !vpc.isEmpty();
			case CeffectivePackage.AMBIENTE_DESPLIEGUE__MECANISMOSEGURIDAD:
				return mecanismoseguridad != null && !mecanismoseguridad.isEmpty();
			case CeffectivePackage.AMBIENTE_DESPLIEGUE__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ambiente: ");
		result.append(ambiente);
		result.append(", nombre: ");
		result.append(nombre);
		result.append(')');
		return result.toString();
	}

} //AmbienteDespliegueImpl
