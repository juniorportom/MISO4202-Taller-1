/**
 */
package Ceffective.impl;

import Ceffective.CeffectivePackage;
import Ceffective.GrupoSeguridad;
import Ceffective.Regla;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grupo Seguridad</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Ceffective.impl.GrupoSeguridadImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link Ceffective.impl.GrupoSeguridadImpl#getZonaDisponibilidad <em>Zona Disponibilidad</em>}</li>
 *   <li>{@link Ceffective.impl.GrupoSeguridadImpl#getReglasSalida <em>Reglas Salida</em>}</li>
 *   <li>{@link Ceffective.impl.GrupoSeguridadImpl#getReglasEntrada <em>Reglas Entrada</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GrupoSeguridadImpl extends MecanismoSeguridadImpl implements GrupoSeguridad {
	/**
	 * The default value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPCION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected String descripcion = DESCRIPCION_EDEFAULT;

	/**
	 * The default value of the '{@link #getZonaDisponibilidad() <em>Zona Disponibilidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZonaDisponibilidad()
	 * @generated
	 * @ordered
	 */
	protected static final String ZONA_DISPONIBILIDAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZonaDisponibilidad() <em>Zona Disponibilidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZonaDisponibilidad()
	 * @generated
	 * @ordered
	 */
	protected String zonaDisponibilidad = ZONA_DISPONIBILIDAD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReglasSalida() <em>Reglas Salida</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReglasSalida()
	 * @generated
	 * @ordered
	 */
	protected EList<Regla> reglasSalida;

	/**
	 * The cached value of the '{@link #getReglasEntrada() <em>Reglas Entrada</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReglasEntrada()
	 * @generated
	 * @ordered
	 */
	protected EList<Regla> reglasEntrada;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GrupoSeguridadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CeffectivePackage.Literals.GRUPO_SEGURIDAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescripcion(String newDescripcion) {
		String oldDescripcion = descripcion;
		descripcion = newDescripcion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeffectivePackage.GRUPO_SEGURIDAD__DESCRIPCION, oldDescripcion, descripcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getZonaDisponibilidad() {
		return zonaDisponibilidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZonaDisponibilidad(String newZonaDisponibilidad) {
		String oldZonaDisponibilidad = zonaDisponibilidad;
		zonaDisponibilidad = newZonaDisponibilidad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeffectivePackage.GRUPO_SEGURIDAD__ZONA_DISPONIBILIDAD, oldZonaDisponibilidad, zonaDisponibilidad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Regla> getReglasSalida() {
		if (reglasSalida == null) {
			reglasSalida = new EObjectContainmentEList<Regla>(Regla.class, this, CeffectivePackage.GRUPO_SEGURIDAD__REGLAS_SALIDA);
		}
		return reglasSalida;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Regla> getReglasEntrada() {
		if (reglasEntrada == null) {
			reglasEntrada = new EObjectContainmentEList<Regla>(Regla.class, this, CeffectivePackage.GRUPO_SEGURIDAD__REGLAS_ENTRADA);
		}
		return reglasEntrada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CeffectivePackage.GRUPO_SEGURIDAD__REGLAS_SALIDA:
				return ((InternalEList<?>)getReglasSalida()).basicRemove(otherEnd, msgs);
			case CeffectivePackage.GRUPO_SEGURIDAD__REGLAS_ENTRADA:
				return ((InternalEList<?>)getReglasEntrada()).basicRemove(otherEnd, msgs);
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
			case CeffectivePackage.GRUPO_SEGURIDAD__DESCRIPCION:
				return getDescripcion();
			case CeffectivePackage.GRUPO_SEGURIDAD__ZONA_DISPONIBILIDAD:
				return getZonaDisponibilidad();
			case CeffectivePackage.GRUPO_SEGURIDAD__REGLAS_SALIDA:
				return getReglasSalida();
			case CeffectivePackage.GRUPO_SEGURIDAD__REGLAS_ENTRADA:
				return getReglasEntrada();
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
			case CeffectivePackage.GRUPO_SEGURIDAD__DESCRIPCION:
				setDescripcion((String)newValue);
				return;
			case CeffectivePackage.GRUPO_SEGURIDAD__ZONA_DISPONIBILIDAD:
				setZonaDisponibilidad((String)newValue);
				return;
			case CeffectivePackage.GRUPO_SEGURIDAD__REGLAS_SALIDA:
				getReglasSalida().clear();
				getReglasSalida().addAll((Collection<? extends Regla>)newValue);
				return;
			case CeffectivePackage.GRUPO_SEGURIDAD__REGLAS_ENTRADA:
				getReglasEntrada().clear();
				getReglasEntrada().addAll((Collection<? extends Regla>)newValue);
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
			case CeffectivePackage.GRUPO_SEGURIDAD__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
				return;
			case CeffectivePackage.GRUPO_SEGURIDAD__ZONA_DISPONIBILIDAD:
				setZonaDisponibilidad(ZONA_DISPONIBILIDAD_EDEFAULT);
				return;
			case CeffectivePackage.GRUPO_SEGURIDAD__REGLAS_SALIDA:
				getReglasSalida().clear();
				return;
			case CeffectivePackage.GRUPO_SEGURIDAD__REGLAS_ENTRADA:
				getReglasEntrada().clear();
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
			case CeffectivePackage.GRUPO_SEGURIDAD__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
			case CeffectivePackage.GRUPO_SEGURIDAD__ZONA_DISPONIBILIDAD:
				return ZONA_DISPONIBILIDAD_EDEFAULT == null ? zonaDisponibilidad != null : !ZONA_DISPONIBILIDAD_EDEFAULT.equals(zonaDisponibilidad);
			case CeffectivePackage.GRUPO_SEGURIDAD__REGLAS_SALIDA:
				return reglasSalida != null && !reglasSalida.isEmpty();
			case CeffectivePackage.GRUPO_SEGURIDAD__REGLAS_ENTRADA:
				return reglasEntrada != null && !reglasEntrada.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (descripcion: ");
		result.append(descripcion);
		result.append(", zonaDisponibilidad: ");
		result.append(zonaDisponibilidad);
		result.append(')');
		return result.toString();
	}

} //GrupoSeguridadImpl
