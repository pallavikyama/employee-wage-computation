package employeeWageComputation;

public class EmployeeWage {

	// CONSTANTS
	public static final int WAGE_PER_HOUR = 20;
	public static final int WORKING_DAYS_PER_MONTH = 20;
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	public static void main(String[] args) {
		System.out.println("Welcome to EMPLOYEE WAGE COMPUTATION.\n");

		// VARIABLES
		int empHoursPerDay = 0;
		int empWage = 0;
		int totalEmpWage = 0;

		// EMPLOYEE MONTHLY WAGE COMPUTATION
		for (int day = 1; day <= WORKING_DAYS_PER_MONTH; day++) {
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
			System.out.println("Day" + day + "\tEmployeeWage: " + empWage);
			totalEmpWage += empWage;
		}
		System.out.println("\nMonthly Wage for the Employee is: " + totalEmpWage);
	}
}
