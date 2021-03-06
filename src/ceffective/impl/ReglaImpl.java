/**
 */
package ceffective.impl;

import ceffective.CeffectivePackage;
import ceffective.DireccionRegla;
import ceffective.Regla;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regla</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ceffective.impl.ReglaImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link ceffective.impl.ReglaImpl#getProtocolo <em>Protocolo</em>}</li>
 *   <li>{@link ceffective.impl.ReglaImpl#getPuerto <em>Puerto</em>}</li>
 *   <li>{@link ceffective.impl.ReglaImpl#getOrigen <em>Origen</em>}</li>
 *   <li>{@link ceffective.impl.ReglaImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link ceffective.impl.ReglaImpl#getDireccion <em>Direccion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReglaImpl extends MinimalEObjectImpl.Container implements Regla {
	/**
	 * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected static final String TIPO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected String tipo = TIPO_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocolo() <em>Protocolo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolo()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOLO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocolo() <em>Protocolo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolo()
	 * @generated
	 * @ordered
	 */
	protected String protocolo = PROTOCOLO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPuerto() <em>Puerto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPuerto()
	 * @generated
	 * @ordered
	 */
	protected static final String PUERTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPuerto() <em>Puerto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPuerto()
	 * @generated
	 * @ordered
	 */
	protected String puerto = PUERTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrigen() <em>Origen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigen()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrigen() <em>Origen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigen()
	 * @generated
	 * @ordered
	 */
	protected String origen = ORIGEN_EDEFAULT;

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
	 * The default value of the '{@link #getDireccion() <em>Direccion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDireccion()
	 * @generated
	 * @ordered
	 */
	protected static final DireccionRegla DIRECCION_EDEFAULT = DireccionRegla.ENTRADA;

	/**
	 * The cached value of the '{@link #getDireccion() <em>Direccion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDireccion()
	 * @generated
	 * @ordered
	 */
	protected DireccionRegla direccion = DIRECCION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReglaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CeffectivePackage.Literals.REGLA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipo(String newTipo) {
		String oldTipo = tipo;
		tipo = newTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeffectivePackage.REGLA__TIPO, oldTipo, tipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProtocolo() {
		return protocolo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocolo(String newProtocolo) {
		String oldProtocolo = protocolo;
		protocolo = newProtocolo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeffectivePackage.REGLA__PROTOCOLO, oldProtocolo, protocolo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPuerto() {
		return puerto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPuerto(String newPuerto) {
		String oldPuerto = puerto;
		puerto = newPuerto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeffectivePackage.REGLA__PUERTO, oldPuerto, puerto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrigen() {
		return origen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigen(String newOrigen) {
		String oldOrigen = origen;
		origen = newOrigen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeffectivePackage.REGLA__ORIGEN, oldOrigen, origen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescripcion(String newDescripcion) {
		String oldDescripcion = descripcion;
		descripcion = newDescripcion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeffectivePackage.REGLA__DESCRIPCION, oldDescripcion, descripcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DireccionRegla getDireccion() {
		return direccion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDireccion(DireccionRegla newDireccion) {
		DireccionRegla oldDireccion = direccion;
		direccion = newDireccion == null ? DIRECCION_EDEFAULT : newDireccion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeffectivePackage.REGLA__DIRECCION, oldDireccion, direccion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CeffectivePackage.REGLA__TIPO:
				return getTipo();
			case CeffectivePackage.REGLA__PROTOCOLO:
				return getProtocolo();
			case CeffectivePackage.REGLA__PUERTO:
				return getPuerto();
			case CeffectivePackage.REGLA__ORIGEN:
				return getOrigen();
			case CeffectivePackage.REGLA__DESCRIPCION:
				return getDescripcion();
			case CeffectivePackage.REGLA__DIRECCION:
				return getDireccion();
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
			case CeffectivePackage.REGLA__TIPO:
				setTipo((String)newValue);
				return;
			case CeffectivePackage.REGLA__PROTOCOLO:
				setProtocolo((String)newValue);
				return;
			case CeffectivePackage.REGLA__PUERTO:
				setPuerto((String)newValue);
				return;
			case CeffectivePackage.REGLA__ORIGEN:
				setOrigen((String)newValue);
				return;
			case CeffectivePackage.REGLA__DESCRIPCION:
				setDescripcion((String)newValue);
				return;
			case CeffectivePackage.REGLA__DIRECCION:
				setDireccion((DireccionRegla)newValue);
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
			case CeffectivePackage.REGLA__TIPO:
				setTipo(TIPO_EDEFAULT);
				return;
			case CeffectivePackage.REGLA__PROTOCOLO:
				setProtocolo(PROTOCOLO_EDEFAULT);
				return;
			case CeffectivePackage.REGLA__PUERTO:
				setPuerto(PUERTO_EDEFAULT);
				return;
			case CeffectivePackage.REGLA__ORIGEN:
				setOrigen(ORIGEN_EDEFAULT);
				return;
			case CeffectivePackage.REGLA__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
				return;
			case CeffectivePackage.REGLA__DIRECCION:
				setDireccion(DIRECCION_EDEFAULT);
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
			case CeffectivePackage.REGLA__TIPO:
				return TIPO_EDEFAULT == null ? tipo != null : !TIPO_EDEFAULT.equals(tipo);
			case CeffectivePackage.REGLA__PROTOCOLO:
				return PROTOCOLO_EDEFAULT == null ? protocolo != null : !PROTOCOLO_EDEFAULT.equals(protocolo);
			case CeffectivePackage.REGLA__PUERTO:
				return PUERTO_EDEFAULT == null ? puerto != null : !PUERTO_EDEFAULT.equals(puerto);
			case CeffectivePackage.REGLA__ORIGEN:
				return ORIGEN_EDEFAULT == null ? origen != null : !ORIGEN_EDEFAULT.equals(origen);
			case CeffectivePackage.REGLA__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
			case CeffectivePackage.REGLA__DIRECCION:
				return direccion != DIRECCION_EDEFAULT;
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
		result.append(" (tipo: ");
		result.append(tipo);
		result.append(", protocolo: ");
		result.append(protocolo);
		result.append(", puerto: ");
		result.append(puerto);
		result.append(", origen: ");
		result.append(origen);
		result.append(", descripcion: ");
		result.append(descripcion);
		result.append(", direccion: ");
		result.append(direccion);
		result.append(')');
		return result.toString();
	}

} //ReglaImpl
