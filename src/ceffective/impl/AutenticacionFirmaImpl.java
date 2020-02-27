/**
 */
package ceffective.impl;

import ceffective.AutenticacionFirma;
import ceffective.CeffectivePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Autenticacion Firma</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ceffective.impl.AutenticacionFirmaImpl#getAccessId <em>Access Id</em>}</li>
 *   <li>{@link ceffective.impl.AutenticacionFirmaImpl#getSecret <em>Secret</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AutenticacionFirmaImpl extends AutenticacionUsuarioImpl implements AutenticacionFirma {
	/**
	 * The default value of the '{@link #getAccessId() <em>Access Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessId()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessId() <em>Access Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessId()
	 * @generated
	 * @ordered
	 */
	protected String accessId = ACCESS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecret() <em>Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecret()
	 * @generated
	 * @ordered
	 */
	protected static final String SECRET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecret() <em>Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecret()
	 * @generated
	 * @ordered
	 */
	protected String secret = SECRET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AutenticacionFirmaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CeffectivePackage.Literals.AUTENTICACION_FIRMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccessId() {
		return accessId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessId(String newAccessId) {
		String oldAccessId = accessId;
		accessId = newAccessId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeffectivePackage.AUTENTICACION_FIRMA__ACCESS_ID, oldAccessId, accessId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecret() {
		return secret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecret(String newSecret) {
		String oldSecret = secret;
		secret = newSecret;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeffectivePackage.AUTENTICACION_FIRMA__SECRET, oldSecret, secret));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CeffectivePackage.AUTENTICACION_FIRMA__ACCESS_ID:
				return getAccessId();
			case CeffectivePackage.AUTENTICACION_FIRMA__SECRET:
				return getSecret();
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
			case CeffectivePackage.AUTENTICACION_FIRMA__ACCESS_ID:
				setAccessId((String)newValue);
				return;
			case CeffectivePackage.AUTENTICACION_FIRMA__SECRET:
				setSecret((String)newValue);
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
			case CeffectivePackage.AUTENTICACION_FIRMA__ACCESS_ID:
				setAccessId(ACCESS_ID_EDEFAULT);
				return;
			case CeffectivePackage.AUTENTICACION_FIRMA__SECRET:
				setSecret(SECRET_EDEFAULT);
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
			case CeffectivePackage.AUTENTICACION_FIRMA__ACCESS_ID:
				return ACCESS_ID_EDEFAULT == null ? accessId != null : !ACCESS_ID_EDEFAULT.equals(accessId);
			case CeffectivePackage.AUTENTICACION_FIRMA__SECRET:
				return SECRET_EDEFAULT == null ? secret != null : !SECRET_EDEFAULT.equals(secret);
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
		result.append(" (accessId: ");
		result.append(accessId);
		result.append(", secret: ");
		result.append(secret);
		result.append(')');
		return result.toString();
	}

} //AutenticacionFirmaImpl
