/**
 */
package Ceffective.impl;

import Ceffective.CeffectivePackage;
import Ceffective.Subred;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subred</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Ceffective.impl.SubredImpl#getCidrBlock <em>Cidr Block</em>}</li>
 *   <li>{@link Ceffective.impl.SubredImpl#getZonaDisponibilidad <em>Zona Disponibilidad</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubredImpl extends MecanismoSeguridadImpl implements Subred {
	/**
	 * The default value of the '{@link #getCidrBlock() <em>Cidr Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidrBlock()
	 * @generated
	 * @ordered
	 */
	protected static final String CIDR_BLOCK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCidrBlock() <em>Cidr Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidrBlock()
	 * @generated
	 * @ordered
	 */
	protected String cidrBlock = CIDR_BLOCK_EDEFAULT;

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
	protected SubredImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CeffectivePackage.Literals.SUBRED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCidrBlock() {
		return cidrBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCidrBlock(String newCidrBlock) {
		String oldCidrBlock = cidrBlock;
		cidrBlock = newCidrBlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeffectivePackage.SUBRED__CIDR_BLOCK, oldCidrBlock, cidrBlock));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CeffectivePackage.SUBRED__ZONA_DISPONIBILIDAD, oldZonaDisponibilidad, zonaDisponibilidad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CeffectivePackage.SUBRED__CIDR_BLOCK:
				return getCidrBlock();
			case CeffectivePackage.SUBRED__ZONA_DISPONIBILIDAD:
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
			case CeffectivePackage.SUBRED__CIDR_BLOCK:
				setCidrBlock((String)newValue);
				return;
			case CeffectivePackage.SUBRED__ZONA_DISPONIBILIDAD:
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
			case CeffectivePackage.SUBRED__CIDR_BLOCK:
				setCidrBlock(CIDR_BLOCK_EDEFAULT);
				return;
			case CeffectivePackage.SUBRED__ZONA_DISPONIBILIDAD:
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
			case CeffectivePackage.SUBRED__CIDR_BLOCK:
				return CIDR_BLOCK_EDEFAULT == null ? cidrBlock != null : !CIDR_BLOCK_EDEFAULT.equals(cidrBlock);
			case CeffectivePackage.SUBRED__ZONA_DISPONIBILIDAD:
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (cidrBlock: ");
		result.append(cidrBlock);
		result.append(", zonaDisponibilidad: ");
		result.append(zonaDisponibilidad);
		result.append(')');
		return result.toString();
	}

} //SubredImpl
