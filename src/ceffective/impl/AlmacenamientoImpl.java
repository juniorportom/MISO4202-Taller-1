/**
 */
package ceffective.impl;

import ceffective.Almacenamiento;
import ceffective.CeffectivePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Almacenamiento</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ceffective.impl.AlmacenamientoImpl#getTamanoInicial <em>Tamano Inicial</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlmacenamientoImpl extends RecursoImpl implements Almacenamiento {
	/**
	 * The default value of the '{@link #getTamanoInicial() <em>Tamano Inicial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTamanoInicial()
	 * @generated
	 * @ordered
	 */
	protected static final float TAMANO_INICIAL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTamanoInicial() <em>Tamano Inicial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTamanoInicial()
	 * @generated
	 * @ordered
	 */
	protected float tamanoInicial = TAMANO_INICIAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlmacenamientoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CeffectivePackage.Literals.ALMACENAMIENTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTamanoInicial() {
		return tamanoInicial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTamanoInicial(float newTamanoInicial) {
		float oldTamanoInicial = tamanoInicial;
		tamanoInicial = newTamanoInicial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeffectivePackage.ALMACENAMIENTO__TAMANO_INICIAL, oldTamanoInicial, tamanoInicial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CeffectivePackage.ALMACENAMIENTO__TAMANO_INICIAL:
				return getTamanoInicial();
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
			case CeffectivePackage.ALMACENAMIENTO__TAMANO_INICIAL:
				setTamanoInicial((Float)newValue);
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
			case CeffectivePackage.ALMACENAMIENTO__TAMANO_INICIAL:
				setTamanoInicial(TAMANO_INICIAL_EDEFAULT);
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
			case CeffectivePackage.ALMACENAMIENTO__TAMANO_INICIAL:
				return tamanoInicial != TAMANO_INICIAL_EDEFAULT;
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
		result.append(" (tamanoInicial: ");
		result.append(tamanoInicial);
		result.append(')');
		return result.toString();
	}

} //AlmacenamientoImpl
