/**
 */
package Assignment6.combikeshopserver.impl;

import Assignment6.combikeshopclient.CombikeshopclientPackage;

import Assignment6.combikeshopclient.impl.CombikeshopclientPackageImpl;

import Assignment6.combikeshopserver.Add;
import Assignment6.combikeshopserver.Authentication;
import Assignment6.combikeshopserver.Bike;
import Assignment6.combikeshopserver.CombikeshopserverFactory;
import Assignment6.combikeshopserver.CombikeshopserverPackage;
import Assignment6.combikeshopserver.CustomerDb;
import Assignment6.combikeshopserver.EmployeeDb;
import Assignment6.combikeshopserver.Overwrite;
import Assignment6.combikeshopserver.Reservation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CombikeshopserverPackageImpl extends EPackageImpl implements CombikeshopserverPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bikeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass overwriteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authenticationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerDbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass employeeDbEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Assignment6.combikeshopserver.CombikeshopserverPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CombikeshopserverPackageImpl() {
		super(eNS_URI, CombikeshopserverFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CombikeshopserverPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CombikeshopserverPackage init() {
		if (isInited) return (CombikeshopserverPackage)EPackage.Registry.INSTANCE.getEPackage(CombikeshopserverPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCombikeshopserverPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CombikeshopserverPackageImpl theCombikeshopserverPackage = registeredCombikeshopserverPackage instanceof CombikeshopserverPackageImpl ? (CombikeshopserverPackageImpl)registeredCombikeshopserverPackage : new CombikeshopserverPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CombikeshopclientPackage.eNS_URI);
		CombikeshopclientPackageImpl theCombikeshopclientPackage = (CombikeshopclientPackageImpl)(registeredPackage instanceof CombikeshopclientPackageImpl ? registeredPackage : CombikeshopclientPackage.eINSTANCE);

		// Create package meta-data objects
		theCombikeshopserverPackage.createPackageContents();
		theCombikeshopclientPackage.createPackageContents();

		// Initialize created meta-data
		theCombikeshopserverPackage.initializePackageContents();
		theCombikeshopclientPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCombikeshopserverPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CombikeshopserverPackage.eNS_URI, theCombikeshopserverPackage);
		return theCombikeshopserverPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReservation() {
		return reservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservation_ReservationDate() {
		return (EAttribute)reservationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservation_BikeId() {
		return (EReference)reservationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservation_StartDate() {
		return (EAttribute)reservationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservation_EndDate() {
		return (EAttribute)reservationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReservation__Reserve() {
		return reservationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBike() {
		return bikeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBike_BikeId() {
		return (EAttribute)bikeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBike_IsAvailable() {
		return (EAttribute)bikeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBike_Reservation() {
		return (EReference)bikeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBike_UpdateBy() {
		return (EAttribute)bikeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBike_Price() {
		return (EAttribute)bikeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBike_Description() {
		return (EAttribute)bikeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBike__Update() {
		return bikeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdd() {
		return addEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdd_Bike() {
		return (EReference)addEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdd__Add() {
		return addEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOverwrite() {
		return overwriteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOverwrite_Bike() {
		return (EReference)overwriteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOverwrite__Overwrite() {
		return overwriteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthentication() {
		return authenticationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthentication_IsAuthorized() {
		return (EAttribute)authenticationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAuthentication__Authorize() {
		return authenticationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomerDb() {
		return customerDbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerDb_Customer() {
		return (EReference)customerDbEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerDb_Bike() {
		return (EReference)customerDbEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomerDb__Update() {
		return customerDbEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmployeeDb() {
		return employeeDbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmployeeDb_Employee() {
		return (EReference)employeeDbEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmployeeDb_Bike() {
		return (EReference)employeeDbEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmployeeDb__Update() {
		return employeeDbEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombikeshopserverFactory getCombikeshopserverFactory() {
		return (CombikeshopserverFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		reservationEClass = createEClass(RESERVATION);
		createEAttribute(reservationEClass, RESERVATION__RESERVATION_DATE);
		createEReference(reservationEClass, RESERVATION__BIKE_ID);
		createEAttribute(reservationEClass, RESERVATION__START_DATE);
		createEAttribute(reservationEClass, RESERVATION__END_DATE);
		createEOperation(reservationEClass, RESERVATION___RESERVE);

		bikeEClass = createEClass(BIKE);
		createEAttribute(bikeEClass, BIKE__BIKE_ID);
		createEAttribute(bikeEClass, BIKE__IS_AVAILABLE);
		createEReference(bikeEClass, BIKE__RESERVATION);
		createEAttribute(bikeEClass, BIKE__UPDATE_BY);
		createEAttribute(bikeEClass, BIKE__PRICE);
		createEAttribute(bikeEClass, BIKE__DESCRIPTION);
		createEOperation(bikeEClass, BIKE___UPDATE);

		addEClass = createEClass(ADD);
		createEReference(addEClass, ADD__BIKE);
		createEOperation(addEClass, ADD___ADD);

		overwriteEClass = createEClass(OVERWRITE);
		createEReference(overwriteEClass, OVERWRITE__BIKE);
		createEOperation(overwriteEClass, OVERWRITE___OVERWRITE);

		authenticationEClass = createEClass(AUTHENTICATION);
		createEAttribute(authenticationEClass, AUTHENTICATION__IS_AUTHORIZED);
		createEOperation(authenticationEClass, AUTHENTICATION___AUTHORIZE);

		customerDbEClass = createEClass(CUSTOMER_DB);
		createEReference(customerDbEClass, CUSTOMER_DB__CUSTOMER);
		createEReference(customerDbEClass, CUSTOMER_DB__BIKE);
		createEOperation(customerDbEClass, CUSTOMER_DB___UPDATE);

		employeeDbEClass = createEClass(EMPLOYEE_DB);
		createEReference(employeeDbEClass, EMPLOYEE_DB__EMPLOYEE);
		createEReference(employeeDbEClass, EMPLOYEE_DB__BIKE);
		createEOperation(employeeDbEClass, EMPLOYEE_DB___UPDATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CombikeshopclientPackage theCombikeshopclientPackage = (CombikeshopclientPackage)EPackage.Registry.INSTANCE.getEPackage(CombikeshopclientPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(reservationEClass, Reservation.class, "Reservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReservation_ReservationDate(), ecorePackage.getEString(), "reservationDate", null, 1, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReservation_BikeId(), this.getBike(), null, "bikeId", null, 1, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReservation_StartDate(), ecorePackage.getEString(), "startDate", null, 1, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReservation_EndDate(), ecorePackage.getEString(), "endDate", null, 1, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getReservation__Reserve(), null, "reserve", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(bikeEClass, Bike.class, "Bike", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBike_BikeId(), ecorePackage.getELong(), "bikeId", null, 1, 1, Bike.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBike_IsAvailable(), ecorePackage.getEBoolean(), "isAvailable", null, 1, 1, Bike.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBike_Reservation(), this.getReservation(), null, "reservation", null, 1, 1, Bike.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBike_UpdateBy(), ecorePackage.getELong(), "updateBy", null, 1, 1, Bike.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBike_Price(), ecorePackage.getELong(), "price", null, 1, 1, Bike.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBike_Description(), ecorePackage.getEString(), "description", null, 1, 1, Bike.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getBike__Update(), null, "update", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(addEClass, Add.class, "Add", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdd_Bike(), this.getBike(), null, "bike", null, 1, 1, Add.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getAdd__Add(), null, "add", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(overwriteEClass, Overwrite.class, "Overwrite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOverwrite_Bike(), this.getBike(), null, "bike", null, 1, 1, Overwrite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getOverwrite__Overwrite(), null, "overwrite", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(authenticationEClass, Authentication.class, "Authentication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthentication_IsAuthorized(), ecorePackage.getEBoolean(), "isAuthorized", null, 1, 1, Authentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getAuthentication__Authorize(), null, "authorize", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(customerDbEClass, CustomerDb.class, "CustomerDb", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomerDb_Customer(), theCombikeshopclientPackage.getCustomer(), null, "customer", null, 1, 1, CustomerDb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCustomerDb_Bike(), this.getBike(), null, "bike", null, 1, 1, CustomerDb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getCustomerDb__Update(), null, "update", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(employeeDbEClass, EmployeeDb.class, "EmployeeDb", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEmployeeDb_Employee(), theCombikeshopclientPackage.getEmployee(), null, "employee", null, 1, 1, EmployeeDb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEmployeeDb_Bike(), this.getBike(), null, "bike", null, 1, 1, EmployeeDb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getEmployeeDb__Update(), null, "update", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "originalName", "com.bikeshop.server"
		   });
	}

} //CombikeshopserverPackageImpl
