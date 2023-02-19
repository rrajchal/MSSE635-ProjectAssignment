/**
 */
package Assignment6.combikeshopserver;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Assignment6.combikeshopserver.CombikeshopserverFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='com.bikeshop.server'"
 * @generated
 */
public interface CombikeshopserverPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "combikeshopserver";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///Assignment6/combikeshopserver.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Assignment6.combikeshopserver";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CombikeshopserverPackage eINSTANCE = Assignment6.combikeshopserver.impl.CombikeshopserverPackageImpl.init();

	/**
	 * The meta object id for the '{@link Assignment6.combikeshopserver.impl.ReservationImpl <em>Reservation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Assignment6.combikeshopserver.impl.ReservationImpl
	 * @see Assignment6.combikeshopserver.impl.CombikeshopserverPackageImpl#getReservation()
	 * @generated
	 */
	int RESERVATION = 0;

	/**
	 * The feature id for the '<em><b>Reservation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__RESERVATION_DATE = 0;

	/**
	 * The feature id for the '<em><b>Bike Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__BIKE_ID = 1;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__START_DATE = 2;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__END_DATE = 3;

	/**
	 * The number of structural features of the '<em>Reservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Reserve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION___RESERVE = 0;

	/**
	 * The number of operations of the '<em>Reservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Assignment6.combikeshopserver.impl.BikeImpl <em>Bike</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Assignment6.combikeshopserver.impl.BikeImpl
	 * @see Assignment6.combikeshopserver.impl.CombikeshopserverPackageImpl#getBike()
	 * @generated
	 */
	int BIKE = 1;

	/**
	 * The feature id for the '<em><b>Bike Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE__BIKE_ID = 0;

	/**
	 * The feature id for the '<em><b>Is Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE__IS_AVAILABLE = 1;

	/**
	 * The feature id for the '<em><b>Reservation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE__RESERVATION = 2;

	/**
	 * The feature id for the '<em><b>Update By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE__UPDATE_BY = 3;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE__PRICE = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE__DESCRIPTION = 5;

	/**
	 * The number of structural features of the '<em>Bike</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE___UPDATE = 0;

	/**
	 * The number of operations of the '<em>Bike</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIKE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Assignment6.combikeshopserver.impl.AddImpl <em>Add</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Assignment6.combikeshopserver.impl.AddImpl
	 * @see Assignment6.combikeshopserver.impl.CombikeshopserverPackageImpl#getAdd()
	 * @generated
	 */
	int ADD = 2;

	/**
	 * The feature id for the '<em><b>Bike</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__BIKE = 0;

	/**
	 * The number of structural features of the '<em>Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD___ADD = 0;

	/**
	 * The number of operations of the '<em>Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Assignment6.combikeshopserver.impl.OverwriteImpl <em>Overwrite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Assignment6.combikeshopserver.impl.OverwriteImpl
	 * @see Assignment6.combikeshopserver.impl.CombikeshopserverPackageImpl#getOverwrite()
	 * @generated
	 */
	int OVERWRITE = 3;

	/**
	 * The feature id for the '<em><b>Bike</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERWRITE__BIKE = 0;

	/**
	 * The number of structural features of the '<em>Overwrite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERWRITE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Overwrite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERWRITE___OVERWRITE = 0;

	/**
	 * The number of operations of the '<em>Overwrite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERWRITE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Assignment6.combikeshopserver.impl.AuthenticationImpl <em>Authentication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Assignment6.combikeshopserver.impl.AuthenticationImpl
	 * @see Assignment6.combikeshopserver.impl.CombikeshopserverPackageImpl#getAuthentication()
	 * @generated
	 */
	int AUTHENTICATION = 4;

	/**
	 * The feature id for the '<em><b>Is Authorized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__IS_AUTHORIZED = 0;

	/**
	 * The number of structural features of the '<em>Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Authorize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION___AUTHORIZE = 0;

	/**
	 * The number of operations of the '<em>Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Assignment6.combikeshopserver.impl.CustomerDbImpl <em>Customer Db</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Assignment6.combikeshopserver.impl.CustomerDbImpl
	 * @see Assignment6.combikeshopserver.impl.CombikeshopserverPackageImpl#getCustomerDb()
	 * @generated
	 */
	int CUSTOMER_DB = 5;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_DB__CUSTOMER = 0;

	/**
	 * The feature id for the '<em><b>Bike</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_DB__BIKE = 1;

	/**
	 * The number of structural features of the '<em>Customer Db</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_DB_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_DB___UPDATE = 0;

	/**
	 * The number of operations of the '<em>Customer Db</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_DB_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Assignment6.combikeshopserver.impl.EmployeeDbImpl <em>Employee Db</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Assignment6.combikeshopserver.impl.EmployeeDbImpl
	 * @see Assignment6.combikeshopserver.impl.CombikeshopserverPackageImpl#getEmployeeDb()
	 * @generated
	 */
	int EMPLOYEE_DB = 6;

	/**
	 * The feature id for the '<em><b>Employee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_DB__EMPLOYEE = 0;

	/**
	 * The feature id for the '<em><b>Bike</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_DB__BIKE = 1;

	/**
	 * The number of structural features of the '<em>Employee Db</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_DB_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_DB___UPDATE = 0;

	/**
	 * The number of operations of the '<em>Employee Db</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_DB_OPERATION_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link Assignment6.combikeshopserver.Reservation <em>Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reservation</em>'.
	 * @see Assignment6.combikeshopserver.Reservation
	 * @generated
	 */
	EClass getReservation();

	/**
	 * Returns the meta object for the attribute '{@link Assignment6.combikeshopserver.Reservation#getReservationDate <em>Reservation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reservation Date</em>'.
	 * @see Assignment6.combikeshopserver.Reservation#getReservationDate()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_ReservationDate();

	/**
	 * Returns the meta object for the reference '{@link Assignment6.combikeshopserver.Reservation#getBikeId <em>Bike Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bike Id</em>'.
	 * @see Assignment6.combikeshopserver.Reservation#getBikeId()
	 * @see #getReservation()
	 * @generated
	 */
	EReference getReservation_BikeId();

	/**
	 * Returns the meta object for the attribute '{@link Assignment6.combikeshopserver.Reservation#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see Assignment6.combikeshopserver.Reservation#getStartDate()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link Assignment6.combikeshopserver.Reservation#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see Assignment6.combikeshopserver.Reservation#getEndDate()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_EndDate();

	/**
	 * Returns the meta object for the '{@link Assignment6.combikeshopserver.Reservation#reserve() <em>Reserve</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reserve</em>' operation.
	 * @see Assignment6.combikeshopserver.Reservation#reserve()
	 * @generated
	 */
	EOperation getReservation__Reserve();

	/**
	 * Returns the meta object for class '{@link Assignment6.combikeshopserver.Bike <em>Bike</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bike</em>'.
	 * @see Assignment6.combikeshopserver.Bike
	 * @generated
	 */
	EClass getBike();

	/**
	 * Returns the meta object for the attribute '{@link Assignment6.combikeshopserver.Bike#getBikeId <em>Bike Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bike Id</em>'.
	 * @see Assignment6.combikeshopserver.Bike#getBikeId()
	 * @see #getBike()
	 * @generated
	 */
	EAttribute getBike_BikeId();

	/**
	 * Returns the meta object for the attribute '{@link Assignment6.combikeshopserver.Bike#isAvailable <em>Is Available</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Available</em>'.
	 * @see Assignment6.combikeshopserver.Bike#isAvailable()
	 * @see #getBike()
	 * @generated
	 */
	EAttribute getBike_IsAvailable();

	/**
	 * Returns the meta object for the reference '{@link Assignment6.combikeshopserver.Bike#getReservation <em>Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reservation</em>'.
	 * @see Assignment6.combikeshopserver.Bike#getReservation()
	 * @see #getBike()
	 * @generated
	 */
	EReference getBike_Reservation();

	/**
	 * Returns the meta object for the attribute '{@link Assignment6.combikeshopserver.Bike#getUpdateBy <em>Update By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update By</em>'.
	 * @see Assignment6.combikeshopserver.Bike#getUpdateBy()
	 * @see #getBike()
	 * @generated
	 */
	EAttribute getBike_UpdateBy();

	/**
	 * Returns the meta object for the attribute '{@link Assignment6.combikeshopserver.Bike#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see Assignment6.combikeshopserver.Bike#getPrice()
	 * @see #getBike()
	 * @generated
	 */
	EAttribute getBike_Price();

	/**
	 * Returns the meta object for the attribute '{@link Assignment6.combikeshopserver.Bike#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Assignment6.combikeshopserver.Bike#getDescription()
	 * @see #getBike()
	 * @generated
	 */
	EAttribute getBike_Description();

	/**
	 * Returns the meta object for the '{@link Assignment6.combikeshopserver.Bike#update() <em>Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update</em>' operation.
	 * @see Assignment6.combikeshopserver.Bike#update()
	 * @generated
	 */
	EOperation getBike__Update();

	/**
	 * Returns the meta object for class '{@link Assignment6.combikeshopserver.Add <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add</em>'.
	 * @see Assignment6.combikeshopserver.Add
	 * @generated
	 */
	EClass getAdd();

	/**
	 * Returns the meta object for the reference '{@link Assignment6.combikeshopserver.Add#getBike <em>Bike</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bike</em>'.
	 * @see Assignment6.combikeshopserver.Add#getBike()
	 * @see #getAdd()
	 * @generated
	 */
	EReference getAdd_Bike();

	/**
	 * Returns the meta object for the '{@link Assignment6.combikeshopserver.Add#add() <em>Add</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add</em>' operation.
	 * @see Assignment6.combikeshopserver.Add#add()
	 * @generated
	 */
	EOperation getAdd__Add();

	/**
	 * Returns the meta object for class '{@link Assignment6.combikeshopserver.Overwrite <em>Overwrite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Overwrite</em>'.
	 * @see Assignment6.combikeshopserver.Overwrite
	 * @generated
	 */
	EClass getOverwrite();

	/**
	 * Returns the meta object for the reference '{@link Assignment6.combikeshopserver.Overwrite#getBike <em>Bike</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bike</em>'.
	 * @see Assignment6.combikeshopserver.Overwrite#getBike()
	 * @see #getOverwrite()
	 * @generated
	 */
	EReference getOverwrite_Bike();

	/**
	 * Returns the meta object for the '{@link Assignment6.combikeshopserver.Overwrite#overwrite() <em>Overwrite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Overwrite</em>' operation.
	 * @see Assignment6.combikeshopserver.Overwrite#overwrite()
	 * @generated
	 */
	EOperation getOverwrite__Overwrite();

	/**
	 * Returns the meta object for class '{@link Assignment6.combikeshopserver.Authentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication</em>'.
	 * @see Assignment6.combikeshopserver.Authentication
	 * @generated
	 */
	EClass getAuthentication();

	/**
	 * Returns the meta object for the attribute '{@link Assignment6.combikeshopserver.Authentication#isAuthorized <em>Is Authorized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Authorized</em>'.
	 * @see Assignment6.combikeshopserver.Authentication#isAuthorized()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_IsAuthorized();

	/**
	 * Returns the meta object for the '{@link Assignment6.combikeshopserver.Authentication#authorize() <em>Authorize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Authorize</em>' operation.
	 * @see Assignment6.combikeshopserver.Authentication#authorize()
	 * @generated
	 */
	EOperation getAuthentication__Authorize();

	/**
	 * Returns the meta object for class '{@link Assignment6.combikeshopserver.CustomerDb <em>Customer Db</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Db</em>'.
	 * @see Assignment6.combikeshopserver.CustomerDb
	 * @generated
	 */
	EClass getCustomerDb();

	/**
	 * Returns the meta object for the reference '{@link Assignment6.combikeshopserver.CustomerDb#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer</em>'.
	 * @see Assignment6.combikeshopserver.CustomerDb#getCustomer()
	 * @see #getCustomerDb()
	 * @generated
	 */
	EReference getCustomerDb_Customer();

	/**
	 * Returns the meta object for the reference '{@link Assignment6.combikeshopserver.CustomerDb#getBike <em>Bike</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bike</em>'.
	 * @see Assignment6.combikeshopserver.CustomerDb#getBike()
	 * @see #getCustomerDb()
	 * @generated
	 */
	EReference getCustomerDb_Bike();

	/**
	 * Returns the meta object for the '{@link Assignment6.combikeshopserver.CustomerDb#update() <em>Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update</em>' operation.
	 * @see Assignment6.combikeshopserver.CustomerDb#update()
	 * @generated
	 */
	EOperation getCustomerDb__Update();

	/**
	 * Returns the meta object for class '{@link Assignment6.combikeshopserver.EmployeeDb <em>Employee Db</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee Db</em>'.
	 * @see Assignment6.combikeshopserver.EmployeeDb
	 * @generated
	 */
	EClass getEmployeeDb();

	/**
	 * Returns the meta object for the reference '{@link Assignment6.combikeshopserver.EmployeeDb#getEmployee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Employee</em>'.
	 * @see Assignment6.combikeshopserver.EmployeeDb#getEmployee()
	 * @see #getEmployeeDb()
	 * @generated
	 */
	EReference getEmployeeDb_Employee();

	/**
	 * Returns the meta object for the reference '{@link Assignment6.combikeshopserver.EmployeeDb#getBike <em>Bike</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bike</em>'.
	 * @see Assignment6.combikeshopserver.EmployeeDb#getBike()
	 * @see #getEmployeeDb()
	 * @generated
	 */
	EReference getEmployeeDb_Bike();

	/**
	 * Returns the meta object for the '{@link Assignment6.combikeshopserver.EmployeeDb#update() <em>Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update</em>' operation.
	 * @see Assignment6.combikeshopserver.EmployeeDb#update()
	 * @generated
	 */
	EOperation getEmployeeDb__Update();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CombikeshopserverFactory getCombikeshopserverFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Assignment6.combikeshopserver.impl.ReservationImpl <em>Reservation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Assignment6.combikeshopserver.impl.ReservationImpl
		 * @see Assignment6.combikeshopserver.impl.CombikeshopserverPackageImpl#getReservation()
		 * @generated
		 */
		EClass RESERVATION = eINSTANCE.getReservation();

		/**
		 * The meta object literal for the '<em><b>Reservation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__RESERVATION_DATE = eINSTANCE.getReservation_ReservationDate();

		/**
		 * The meta object literal for the '<em><b>Bike Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION__BIKE_ID = eINSTANCE.getReservation_BikeId();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__START_DATE = eINSTANCE.getReservation_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__END_DATE = eINSTANCE.getReservation_EndDate();

		/**
		 * The meta object literal for the '<em><b>Reserve</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATION___RESERVE = eINSTANCE.getReservation__Reserve();

		/**
		 * The meta object literal for the '{@link Assignment6.combikeshopserver.impl.BikeImpl <em>Bike</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Assignment6.combikeshopserver.impl.BikeImpl
		 * @see Assignment6.combikeshopserver.impl.CombikeshopserverPackageImpl#getBike()
		 * @generated
		 */
		EClass BIKE = eINSTANCE.getBike();

		/**
		 * The meta object literal for the '<em><b>Bike Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIKE__BIKE_ID = eINSTANCE.getBike_BikeId();

		/**
		 * The meta object literal for the '<em><b>Is Available</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIKE__IS_AVAILABLE = eINSTANCE.getBike_IsAvailable();

		/**
		 * The meta object literal for the '<em><b>Reservation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIKE__RESERVATION = eINSTANCE.getBike_Reservation();

		/**
		 * The meta object literal for the '<em><b>Update By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIKE__UPDATE_BY = eINSTANCE.getBike_UpdateBy();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIKE__PRICE = eINSTANCE.getBike_Price();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIKE__DESCRIPTION = eINSTANCE.getBike_Description();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BIKE___UPDATE = eINSTANCE.getBike__Update();

		/**
		 * The meta object literal for the '{@link Assignment6.combikeshopserver.impl.AddImpl <em>Add</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Assignment6.combikeshopserver.impl.AddImpl
		 * @see Assignment6.combikeshopserver.impl.CombikeshopserverPackageImpl#getAdd()
		 * @generated
		 */
		EClass ADD = eINSTANCE.getAdd();

		/**
		 * The meta object literal for the '<em><b>Bike</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD__BIKE = eINSTANCE.getAdd_Bike();

		/**
		 * The meta object literal for the '<em><b>Add</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADD___ADD = eINSTANCE.getAdd__Add();

		/**
		 * The meta object literal for the '{@link Assignment6.combikeshopserver.impl.OverwriteImpl <em>Overwrite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Assignment6.combikeshopserver.impl.OverwriteImpl
		 * @see Assignment6.combikeshopserver.impl.CombikeshopserverPackageImpl#getOverwrite()
		 * @generated
		 */
		EClass OVERWRITE = eINSTANCE.getOverwrite();

		/**
		 * The meta object literal for the '<em><b>Bike</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OVERWRITE__BIKE = eINSTANCE.getOverwrite_Bike();

		/**
		 * The meta object literal for the '<em><b>Overwrite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OVERWRITE___OVERWRITE = eINSTANCE.getOverwrite__Overwrite();

		/**
		 * The meta object literal for the '{@link Assignment6.combikeshopserver.impl.AuthenticationImpl <em>Authentication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Assignment6.combikeshopserver.impl.AuthenticationImpl
		 * @see Assignment6.combikeshopserver.impl.CombikeshopserverPackageImpl#getAuthentication()
		 * @generated
		 */
		EClass AUTHENTICATION = eINSTANCE.getAuthentication();

		/**
		 * The meta object literal for the '<em><b>Is Authorized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__IS_AUTHORIZED = eINSTANCE.getAuthentication_IsAuthorized();

		/**
		 * The meta object literal for the '<em><b>Authorize</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AUTHENTICATION___AUTHORIZE = eINSTANCE.getAuthentication__Authorize();

		/**
		 * The meta object literal for the '{@link Assignment6.combikeshopserver.impl.CustomerDbImpl <em>Customer Db</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Assignment6.combikeshopserver.impl.CustomerDbImpl
		 * @see Assignment6.combikeshopserver.impl.CombikeshopserverPackageImpl#getCustomerDb()
		 * @generated
		 */
		EClass CUSTOMER_DB = eINSTANCE.getCustomerDb();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_DB__CUSTOMER = eINSTANCE.getCustomerDb_Customer();

		/**
		 * The meta object literal for the '<em><b>Bike</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_DB__BIKE = eINSTANCE.getCustomerDb_Bike();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER_DB___UPDATE = eINSTANCE.getCustomerDb__Update();

		/**
		 * The meta object literal for the '{@link Assignment6.combikeshopserver.impl.EmployeeDbImpl <em>Employee Db</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Assignment6.combikeshopserver.impl.EmployeeDbImpl
		 * @see Assignment6.combikeshopserver.impl.CombikeshopserverPackageImpl#getEmployeeDb()
		 * @generated
		 */
		EClass EMPLOYEE_DB = eINSTANCE.getEmployeeDb();

		/**
		 * The meta object literal for the '<em><b>Employee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE_DB__EMPLOYEE = eINSTANCE.getEmployeeDb_Employee();

		/**
		 * The meta object literal for the '<em><b>Bike</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE_DB__BIKE = eINSTANCE.getEmployeeDb_Bike();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPLOYEE_DB___UPDATE = eINSTANCE.getEmployeeDb__Update();

	}

} //CombikeshopserverPackage
