/**
 */
package ceffective.impl;

import ceffective.CeffectivePackage;
import ceffective.GrupoSeguridad;
import ceffective.Regla;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grupo Seguridad</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ceffective.impl.GrupoSeguridadImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link ceffective.impl.GrupoSeguridadImpl#getReglas <em>Reglas</em>}</li>
 * </ul>
 * </p>
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
	 * The cached value of the '{@link #getReglas() <em>Reglas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReglas()
	 * @generated
	 * @ordered
	 */
	protected EList<Regla> reglas;

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
			eNotify(new ENotificationImpl(this, Notification.SET, CeffectivePackage.GRUPO_SEGURIDAD__DESCRIPCION, oldDescripcion, descripcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Regla> getReglas() {
		if (reglas == null) {
			reglas = new EObjectResolvingEList<Regla>(Regla.class, this, CeffectivePackage.GRUPO_SEGURIDAD__REGLAS);
		}
		return reglas;
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
			case CeffectivePackage.GRUPO_SEGURIDAD__REGLAS:
				return getReglas();
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
			case CeffectivePackage.GRUPO_SEGURIDAD__REGLAS:
				getReglas().clear();
				getReglas().addAll((Collection<? extends Regla>)newValue);
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
			case CeffectivePackage.GRUPO_SEGURIDAD__REGLAS:
				getReglas().clear();
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
			case CeffectivePackage.GRUPO_SEGURIDAD__REGLAS:
				return reglas != null && !reglas.isEmpty();
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
		result.append(" (descripcion: ");
		result.append(descripcion);
		result.append(')');
		return result.toString();
	}

} //GrupoSeguridadImpl
