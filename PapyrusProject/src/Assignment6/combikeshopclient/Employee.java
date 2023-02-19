/**
 */
package Assignment6.combikeshopclient;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Assignment6.combikeshopclient.Employee#getEmployeeName <em>Employee Name</em>}</li>
 *   <li>{@link Assignment6.combikeshopclient.Employee#getEmployeeId <em>Employee Id</em>}</li>
 *   <li>{@link Assignment6.combikeshopclient.Employee#isManager <em>Is Manager</em>}</li>
 * </ul>
 *
 * @see Assignment6.combikeshopclient.CombikeshopclientPackage#getEmployee()
 * @model
 * @generated
 */
public interface Employee extends EObject {
	/**
	 * Returns the value of the '<em><b>Employee Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employee Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employee Name</em>' attribute.
	 * @see #setEmployeeName(String)
	 * @see Assignment6.combikeshopclient.CombikeshopclientPackage#getEmployee_EmployeeName()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getEmployeeName();

	/**
	 * Sets the value of the '{@link Assignment6.combikeshopclient.Employee#getEmployeeName <em>Employee Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employee Name</em>' attribute.
	 * @see #getEmployeeName()
	 * @generated
	 */
	void setEmployeeName(String value);

	/**
	 * Returns the value of the '<em><b>Employee Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employee Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employee Id</em>' attribute.
	 * @see #setEmployeeId(long)
	 * @see Assignment6.combikeshopclient.CombikeshopclientPackage#getEmployee_EmployeeId()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	long getEmployeeId();

	/**
	 * Sets the value of the '{@link Assignment6.combikeshopclient.Employee#getEmployeeId <em>Employee Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employee Id</em>' attribute.
	 * @see #getEmployeeId()
	 * @generated
	 */
	void setEmployeeId(long value);

	/**
	 * Returns the value of the '<em><b>Is Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Manager</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Manager</em>' attribute.
	 * @see #setIsManager(boolean)
	 * @see Assignment6.combikeshopclient.CombikeshopclientPackage#getEmployee_IsManager()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isManager();

	/**
	 * Sets the value of the '{@link Assignment6.combikeshopclient.Employee#isManager <em>Is Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Manager</em>' attribute.
	 * @see #isManager()
	 * @generated
	 */
	void setIsManager(boolean value);

} // Employee
