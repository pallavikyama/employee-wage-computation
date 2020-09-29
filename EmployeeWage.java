package employeeWageComputation;

public class EmployeeWage {

	// CONSTANTS
	public static final int WAGE_PER_HOUR = 20;
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	public static void main(String[] args) {
		System.out.println("Welcome to EMPLOYEE WAGE COMPUTATION.\n");

		// VARIABLES
		int empHoursPerDay = 0;
		int empWage = 0;

		// EMPLOYEE DAILY WAGE COMPUTATION
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		switch (empCheck) {
		case IS_FULL_TIME:
			empHoursPerDay = 8;
			break;
		case IS_PART_TIME:
			empHoursPerDay = 4;
			break;
		default:
			empHoursPerDay = 0;
		}
		empWage = empHoursPerDay * WAGE_PER_HOUR;
		System.out.println("Daily Wage for the Employee is:  " + empWage);
	}
}
