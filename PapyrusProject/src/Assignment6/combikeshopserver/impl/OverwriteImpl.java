/**
 */
package Assignment6.combikeshopserver.impl;

import Assignment6.combikeshopserver.Bike;
import Assignment6.combikeshopserver.CombikeshopserverPackage;
import Assignment6.combikeshopserver.Overwrite;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Overwrite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Assignment6.combikeshopserver.impl.OverwriteImpl#getBike <em>Bike</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OverwriteImpl extends MinimalEObjectImpl.Container implements Overwrite {
	/**
	 * The cached value of the '{@link #getBike() <em>Bike</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBike()
	 * @generated
	 * @ordered
	 */
	protected Bike bike;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OverwriteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CombikeshopserverPackage.Literals.OVERWRITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bike getBike() {
		if (bike != null && bike.eIsProxy()) {
			InternalEObject oldBike = (InternalEObject)bike;
			bike = (Bike)eResolveProxy(oldBike);
			if (bike != oldBike) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CombikeshopserverPackage.OVERWRITE__BIKE, oldBike, bike));
			}
		}
		return bike;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bike basicGetBike() {
		return bike;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBike(Bike newBike) {
		Bike oldBike = bike;
		bike = newBike;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CombikeshopserverPackage.OVERWRITE__BIKE, oldBike, bike));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void overwrite() {
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
			case CombikeshopserverPackage.OVERWRITE__BIKE:
				if (resolve) return getBike();
				return basicGetBike();
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
			case CombikeshopserverPackage.OVERWRITE__BIKE:
				setBike((Bike)newValue);
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
			case CombikeshopserverPackage.OVERWRITE__BIKE:
				setBike((Bike)null);
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
			case CombikeshopserverPackage.OVERWRITE__BIKE:
				return bike != null;
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
			case CombikeshopserverPackage.OVERWRITE___OVERWRITE:
				overwrite();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //OverwriteImpl
