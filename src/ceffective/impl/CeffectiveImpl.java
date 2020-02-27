/**
 */
package ceffective.impl;

import ceffective.Ceffective;
import ceffective.CeffectivePackage;
import ceffective.ProveedorNube;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ceffective</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ceffective.impl.CeffectiveImpl#getProveedorNube <em>Proveedor Nube</em>}</li>
 *   <li>{@link ceffective.impl.CeffectiveImpl#getNombre <em>Nombre</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CeffectiveImpl extends MinimalEObjectImpl.Container implements Ceffective {
	/**
	 * The cached value of the '{@link #getProveedorNube() <em>Proveedor Nube</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProveedorNube()
	 * @generated
	 * @ordered
	 */
	protected ProveedorNube proveedorNube;

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
	protected CeffectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CeffectivePackage.Literals.CEFFECTIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProveedorNube getProveedorNube() {
		return proveedorNube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProveedorNube(ProveedorNube newProveedorNube, NotificationChain msgs) {
		ProveedorNube oldProveedorNube = proveedorNube;
		proveedorNube = newProveedorNube;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CeffectivePackage.CEFFECTIVE__PROVEEDOR_NUBE, oldProveedorNube, newProveedorNube);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProveedorNube(ProveedorNube newProveedorNube) {
		if (newProveedorNube != proveedorNube) {
			NotificationChain msgs = null;
			if (proveedorNube != null)
				msgs = ((InternalEObject)proveedorNube).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CeffectivePackage.CEFFECTIVE__PROVEEDOR_NUBE, null, msgs);
			if (newProveedorNube != null)
				msgs = ((InternalEObject)newProveedorNube).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CeffectivePackage.CEFFECTIVE__PROVEEDOR_NUBE, null, msgs);
			msgs = basicSetProveedorNube(newProveedorNube, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeffectivePackage.CEFFECTIVE__PROVEEDOR_NUBE, newProveedorNube, newProveedorNube));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CeffectivePackage.CEFFECTIVE__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CeffectivePackage.CEFFECTIVE__PROVEEDOR_NUBE:
				return basicSetProveedorNube(null, msgs);
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
			case CeffectivePackage.CEFFECTIVE__PROVEEDOR_NUBE:
				return getProveedorNube();
			case CeffectivePackage.CEFFECTIVE__NOMBRE:
				return getNombre();
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
			case CeffectivePackage.CEFFECTIVE__PROVEEDOR_NUBE:
				setProveedorNube((ProveedorNube)newValue);
				return;
			case CeffectivePackage.CEFFECTIVE__NOMBRE:
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
			case CeffectivePackage.CEFFECTIVE__PROVEEDOR_NUBE:
				setProveedorNube((ProveedorNube)null);
				return;
			case CeffectivePackage.CEFFECTIVE__NOMBRE:
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
			case CeffectivePackage.CEFFECTIVE__PROVEEDOR_NUBE:
				return proveedorNube != null;
			case CeffectivePackage.CEFFECTIVE__NOMBRE:
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
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(')');
		return result.toString();
	}

} //CeffectiveImpl
