/**
 */
package ceffective.impl;

import ceffective.CeffectivePackage;
import ceffective.Conexion;
import ceffective.Recurso;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conexion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ceffective.impl.ConexionImpl#getRecurso1 <em>Recurso1</em>}</li>
 *   <li>{@link ceffective.impl.ConexionImpl#getRecurso2 <em>Recurso2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConexionImpl extends MinimalEObjectImpl.Container implements Conexion {
	/**
	 * The cached value of the '{@link #getRecurso1() <em>Recurso1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurso1()
	 * @generated
	 * @ordered
	 */
	protected Recurso recurso1;

	/**
	 * The cached value of the '{@link #getRecurso2() <em>Recurso2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurso2()
	 * @generated
	 * @ordered
	 */
	protected Recurso recurso2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConexionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CeffectivePackage.Literals.CONEXION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recurso getRecurso1() {
		if (recurso1 != null && recurso1.eIsProxy()) {
			InternalEObject oldRecurso1 = (InternalEObject)recurso1;
			recurso1 = (Recurso)eResolveProxy(oldRecurso1);
			if (recurso1 != oldRecurso1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CeffectivePackage.CONEXION__RECURSO1, oldRecurso1, recurso1));
			}
		}
		return recurso1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recurso basicGetRecurso1() {
		return recurso1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecurso1(Recurso newRecurso1) {
		Recurso oldRecurso1 = recurso1;
		recurso1 = newRecurso1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeffectivePackage.CONEXION__RECURSO1, oldRecurso1, recurso1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recurso getRecurso2() {
		if (recurso2 != null && recurso2.eIsProxy()) {
			InternalEObject oldRecurso2 = (InternalEObject)recurso2;
			recurso2 = (Recurso)eResolveProxy(oldRecurso2);
			if (recurso2 != oldRecurso2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CeffectivePackage.CONEXION__RECURSO2, oldRecurso2, recurso2));
			}
		}
		return recurso2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recurso basicGetRecurso2() {
		return recurso2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecurso2(Recurso newRecurso2) {
		Recurso oldRecurso2 = recurso2;
		recurso2 = newRecurso2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CeffectivePackage.CONEXION__RECURSO2, oldRecurso2, recurso2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CeffectivePackage.CONEXION__RECURSO1:
				if (resolve) return getRecurso1();
				return basicGetRecurso1();
			case CeffectivePackage.CONEXION__RECURSO2:
				if (resolve) return getRecurso2();
				return basicGetRecurso2();
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
			case CeffectivePackage.CONEXION__RECURSO1:
				setRecurso1((Recurso)newValue);
				return;
			case CeffectivePackage.CONEXION__RECURSO2:
				setRecurso2((Recurso)newValue);
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
			case CeffectivePackage.CONEXION__RECURSO1:
				setRecurso1((Recurso)null);
				return;
			case CeffectivePackage.CONEXION__RECURSO2:
				setRecurso2((Recurso)null);
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
			case CeffectivePackage.CONEXION__RECURSO1:
				return recurso1 != null;
			case CeffectivePackage.CONEXION__RECURSO2:
				return recurso2 != null;
		}
		return super.eIsSet(featureID);
	}

} //ConexionImpl
