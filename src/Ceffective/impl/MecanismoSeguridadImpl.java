/**
 */
package ceffective.impl;

import ceffective.CeffectivePackage;
import ceffective.MecanismoSeguridad;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mecanismo Seguridad</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ceffective.impl.MecanismoSeguridadImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link ceffective.impl.MecanismoSeguridadImpl#getZonaNombre <em>Zona Nombre</em>}</li>
 *   <li>{@link ceffective.impl.MecanismoSeguridadImpl#getZonaDisponibilidad <em>Zona Disponibilidad</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MecanismoSeguridadImpl extends MinimalEObjectImpl.Container implements MecanismoSeguridad {
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
	 * The default value of the '{@link #getZonaNombre() <em>Zona Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZonaNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String ZONA_NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZonaNombre() <em>Zona Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZonaNombre()
	 * @generated
	 * @ordered
	 */
	protected String zonaNombre = ZONA_NOMBRE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MecanismoSeguridadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CeffectivePackage.Literals.MECANISMO_SEGURIDAD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CeffectivePackage.MECANISMO_SEGURIDAD__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZonaNombre() {
		return zonaNombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZonaNombre(String newZonaNombre) {
		String oldZonaNombre = zonaNombre;
		zonaNombre = newZonaNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeffectivePackage.MECANISMO_SEGURIDAD__ZONA_NOMBRE, oldZonaNombre, zonaNombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZonaDisponibilidad() {
		return zonaDisponibilidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZonaDisponibilidad(String newZonaDisponibilidad) {
		String oldZonaDisponibilidad = zonaDisponibilidad;
		zonaDisponibilidad = newZonaDisponibilidad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeffectivePackage.MECANISMO_SEGURIDAD__ZONA_DISPONIBILIDAD, oldZonaDisponibilidad, zonaDisponibilidad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CeffectivePackage.MECANISMO_SEGURIDAD__NOMBRE:
				return getNombre();
			case CeffectivePackage.MECANISMO_SEGURIDAD__ZONA_NOMBRE:
				return getZonaNombre();
			case CeffectivePackage.MECANISMO_SEGURIDAD__ZONA_DISPONIBILIDAD:
				return getZonaDisponibilidad();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CeffectivePackage.MECANISMO_SEGURIDAD__NOMBRE:
				setNombre((String)newValue);
				return;
			case CeffectivePackage.MECANISMO_SEGURIDAD__ZONA_NOMBRE:
				setZonaNombre((String)newValue);
				return;
			case CeffectivePackage.MECANISMO_SEGURIDAD__ZONA_DISPONIBILIDAD:
				setZonaDisponibilidad((String)newValue);
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
			case CeffectivePackage.MECANISMO_SEGURIDAD__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case CeffectivePackage.MECANISMO_SEGURIDAD__ZONA_NOMBRE:
				setZonaNombre(ZONA_NOMBRE_EDEFAULT);
				return;
			case CeffectivePackage.MECANISMO_SEGURIDAD__ZONA_DISPONIBILIDAD:
				setZonaDisponibilidad(ZONA_DISPONIBILIDAD_EDEFAULT);
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
			case CeffectivePackage.MECANISMO_SEGURIDAD__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case CeffectivePackage.MECANISMO_SEGURIDAD__ZONA_NOMBRE:
				return ZONA_NOMBRE_EDEFAULT == null ? zonaNombre != null : !ZONA_NOMBRE_EDEFAULT.equals(zonaNombre);
			case CeffectivePackage.MECANISMO_SEGURIDAD__ZONA_DISPONIBILIDAD:
				return ZONA_DISPONIBILIDAD_EDEFAULT == null ? zonaDisponibilidad != null : !ZONA_DISPONIBILIDAD_EDEFAULT.equals(zonaDisponibilidad);
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
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(", zonaNombre: ");
		result.append(zonaNombre);
		result.append(", zonaDisponibilidad: ");
		result.append(zonaDisponibilidad);
		result.append(')');
		return result.toString();
	}

} //MecanismoSeguridadImpl
