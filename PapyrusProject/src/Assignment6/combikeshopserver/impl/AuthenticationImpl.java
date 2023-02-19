/**
 */
package Assignment6.combikeshopserver.impl;

import Assignment6.combikeshopserver.Authentication;
import Assignment6.combikeshopserver.CombikeshopserverPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authentication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Assignment6.combikeshopserver.impl.AuthenticationImpl#isAuthorized <em>Is Authorized</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthenticationImpl extends MinimalEObjectImpl.Container implements Authentication {
	/**
	 * The default value of the '{@link #isAuthorized() <em>Is Authorized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuthorized()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_AUTHORIZED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAuthorized() <em>Is Authorized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuthorized()
	 * @generated
	 * @ordered
	 */
	protected boolean isAuthorized = IS_AUTHORIZED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthenticationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CombikeshopserverPackage.Literals.AUTHENTICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAuthorized() {
		return isAuthorized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAuthorized(boolean newIsAuthorized) {
		boolean oldIsAuthorized = isAuthorized;
		isAuthorized = newIsAuthorized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CombikeshopserverPackage.AUTHENTICATION__IS_AUTHORIZED, oldIsAuthorized, isAuthorized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void authorize() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CombikeshopserverPackage.AUTHENTICATION__IS_AUTHORIZED:
				return isAuthorized();
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
			case CombikeshopserverPackage.AUTHENTICATION__IS_AUTHORIZED:
				setIsAuthorized((Boolean)newValue);
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
			case CombikeshopserverPackage.AUTHENTICATION__IS_AUTHORIZED:
				setIsAuthorized(IS_AUTHORIZED_EDEFAULT);
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
			case CombikeshopserverPackage.AUTHENTICATION__IS_AUTHORIZED:
				return isAuthorized != IS_AUTHORIZED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CombikeshopserverPackage.AUTHENTICATION___AUTHORIZE:
				authorize();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (isAuthorized: ");
		result.append(isAuthorized);
		result.append(')');
		return result.toString();
	}

} //AuthenticationImpl
