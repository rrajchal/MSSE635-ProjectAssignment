/**
 */
package Assignment6.combikeshopclient.impl;

import Assignment6.combikeshopclient.CombikeshopclientPackage;
import Assignment6.combikeshopclient.Employee;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Assignment6.combikeshopclient.impl.EmployeeImpl#getEmployeeName <em>Employee Name</em>}</li>
 *   <li>{@link Assignment6.combikeshopclient.impl.EmployeeImpl#getEmployeeId <em>Employee Id</em>}</li>
 *   <li>{@link Assignment6.combikeshopclient.impl.EmployeeImpl#isManager <em>Is Manager</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmployeeImpl extends MinimalEObjectImpl.Container implements Employee {
	/**
	 * The default value of the '{@link #getEmployeeName() <em>Employee Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeName()
	 * @generated
	 * @ordered
	 */
	protected static final String EMPLOYEE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmployeeName() <em>Employee Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeName()
	 * @generated
	 * @ordered
	 */
	protected String employeeName = EMPLOYEE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmployeeId() <em>Employee Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeId()
	 * @generated
	 * @ordered
	 */
	protected static final long EMPLOYEE_ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getEmployeeId() <em>Employee Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeId()
	 * @generated
	 * @ordered
	 */
	protected long employeeId = EMPLOYEE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isManager() <em>Is Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isManager()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MANAGER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isManager() <em>Is Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isManager()
	 * @generated
	 * @ordered
	 */
	protected boolean isManager = IS_MANAGER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmployeeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CombikeshopclientPackage.Literals.EMPLOYEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmployeeName(String newEmployeeName) {
		String oldEmployeeName = employeeName;
		employeeName = newEmployeeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CombikeshopclientPackage.EMPLOYEE__EMPLOYEE_NAME, oldEmployeeName, employeeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getEmployeeId() {
		return employeeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmployeeId(long newEmployeeId) {
		long oldEmployeeId = employeeId;
		employeeId = newEmployeeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CombikeshopclientPackage.EMPLOYEE__EMPLOYEE_ID, oldEmployeeId, employeeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isManager() {
		return isManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsManager(boolean newIsManager) {
		boolean oldIsManager = isManager;
		isManager = newIsManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CombikeshopclientPackage.EMPLOYEE__IS_MANAGER, oldIsManager, isManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CombikeshopclientPackage.EMPLOYEE__EMPLOYEE_NAME:
				return getEmployeeName();
			case CombikeshopclientPackage.EMPLOYEE__EMPLOYEE_ID:
				return getEmployeeId();
			case CombikeshopclientPackage.EMPLOYEE__IS_MANAGER:
				return isManager();
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
			case CombikeshopclientPackage.EMPLOYEE__EMPLOYEE_NAME:
				setEmployeeName((String)newValue);
				return;
			case CombikeshopclientPackage.EMPLOYEE__EMPLOYEE_ID:
				setEmployeeId((Long)newValue);
				return;
			case CombikeshopclientPackage.EMPLOYEE__IS_MANAGER:
				setIsManager((Boolean)newValue);
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
			case CombikeshopclientPackage.EMPLOYEE__EMPLOYEE_NAME:
				setEmployeeName(EMPLOYEE_NAME_EDEFAULT);
				return;
			case CombikeshopclientPackage.EMPLOYEE__EMPLOYEE_ID:
				setEmployeeId(EMPLOYEE_ID_EDEFAULT);
				return;
			case CombikeshopclientPackage.EMPLOYEE__IS_MANAGER:
				setIsManager(IS_MANAGER_EDEFAULT);
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
			case CombikeshopclientPackage.EMPLOYEE__EMPLOYEE_NAME:
				return EMPLOYEE_NAME_EDEFAULT == null ? employeeName != null : !EMPLOYEE_NAME_EDEFAULT.equals(employeeName);
			case CombikeshopclientPackage.EMPLOYEE__EMPLOYEE_ID:
				return employeeId != EMPLOYEE_ID_EDEFAULT;
			case CombikeshopclientPackage.EMPLOYEE__IS_MANAGER:
				return isManager != IS_MANAGER_EDEFAULT;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (employeeName: ");
		result.append(employeeName);
		result.append(", employeeId: ");
		result.append(employeeId);
		result.append(", isManager: ");
		result.append(isManager);
		result.append(')');
		return result.toString();
	}

} //EmployeeImpl
