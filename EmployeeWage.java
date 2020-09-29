package employeeWageComputation;

public class EmployeeWage {

	// CONSTANTS
	public static final int IS_FULL_TIME = 1;

	public static void main(String[] args) {
		System.out.println("Welcome to EMPLOYEE WAGE COMPUTATION.\n");

		// EMPLOYEE ATTENDENCE CHECK
		double empCheck = Math.floor(Math.random() * 10) % 2;
		System.out.println("empCheck: " + empCheck);
		if (empCheck == IS_FULL_TIME)
			System.out.println("Employee is PRESENT.");
		else
			System.out.println("Employee is ABSENT.");
	}
}