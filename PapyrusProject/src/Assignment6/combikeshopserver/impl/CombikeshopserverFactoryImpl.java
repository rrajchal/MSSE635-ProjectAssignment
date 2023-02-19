/**
 */
package Assignment6.combikeshopserver.impl;

import Assignment6.combikeshopserver.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CombikeshopserverFactoryImpl extends EFactoryImpl implements CombikeshopserverFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CombikeshopserverFactory init() {
		try {
			CombikeshopserverFactory theCombikeshopserverFactory = (CombikeshopserverFactory)EPackage.Registry.INSTANCE.getEFactory(CombikeshopserverPackage.eNS_URI);
			if (theCombikeshopserverFactory != null) {
				return theCombikeshopserverFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CombikeshopserverFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombikeshopserverFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CombikeshopserverPackage.RESERVATION: return createReservation();
			case CombikeshopserverPackage.BIKE: return createBike();
			case CombikeshopserverPackage.ADD: return createAdd();
			case CombikeshopserverPackage.OVERWRITE: return createOverwrite();
			case CombikeshopserverPackage.AUTHENTICATION: return createAuthentication();
			case CombikeshopserverPackage.CUSTOMER_DB: return createCustomerDb();
			case CombikeshopserverPackage.EMPLOYEE_DB: return createEmployeeDb();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reservation createReservation() {
		ReservationImpl reservation = new ReservationImpl();
		return reservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bike createBike() {
		BikeImpl bike = new BikeImpl();
		return bike;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Add createAdd() {
		AddImpl add = new AddImpl();
		return add;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Overwrite createOverwrite() {
		OverwriteImpl overwrite = new OverwriteImpl();
		return overwrite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Authentication createAuthentication() {
		AuthenticationImpl authentication = new AuthenticationImpl();
		return authentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerDb createCustomerDb() {
		CustomerDbImpl customerDb = new CustomerDbImpl();
		return customerDb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmployeeDb createEmployeeDb() {
		EmployeeDbImpl employeeDb = new EmployeeDbImpl();
		return employeeDb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombikeshopserverPackage getCombikeshopserverPackage() {
		return (CombikeshopserverPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CombikeshopserverPackage getPackage() {
		return CombikeshopserverPackage.eINSTANCE;
	}

} //CombikeshopserverFactoryImpl
