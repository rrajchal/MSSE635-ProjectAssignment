/**
 */
package Assignment6.combikeshopserver;

import Assignment6.combikeshopclient.Employee;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee Db</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Assignment6.combikeshopserver.EmployeeDb#getEmployee <em>Employee</em>}</li>
 *   <li>{@link Assignment6.combikeshopserver.EmployeeDb#getBike <em>Bike</em>}</li>
 * </ul>
 *
 * @see Assignment6.combikeshopserver.CombikeshopserverPackage#getEmployeeDb()
 * @model
 * @generated
 */
public interface EmployeeDb extends EObject {
	/**
	 * Returns the value of the '<em><b>Employee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employee</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employee</em>' reference.
	 * @see #setEmployee(Employee)
	 * @see Assignment6.combikeshopserver.CombikeshopserverPackage#getEmployeeDb_Employee()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Employee getEmployee();

	/**
	 * Sets the value of the '{@link Assignment6.combikeshopserver.EmployeeDb#getEmployee <em>Employee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employee</em>' reference.
	 * @see #getEmployee()
	 * @generated
	 */
	void setEmployee(Employee value);

	/**
	 * Returns the value of the '<em><b>Bike</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bike</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bike</em>' reference.
	 * @see #setBike(Bike)
	 * @see Assignment6.combikeshopserver.CombikeshopserverPackage#getEmployeeDb_Bike()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Bike getBike();

	/**
	 * Sets the value of the '{@link Assignment6.combikeshopserver.EmployeeDb#getBike <em>Bike</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bike</em>' reference.
	 * @see #getBike()
	 * @generated
	 */
	void setBike(Bike value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void update();

} // EmployeeDb
