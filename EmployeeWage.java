package employeeWageComputation;

public class EmployeeWage {

	// CONSTANTS
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	public static int empTime() {

		// EMPLOYEE WORKING HOURS PER DAY
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		int hours = 0;
		switch (empCheck) {
		case IS_FULL_TIME:
			hours = 8;
			break;
		case IS_PART_TIME:
			hours = 4;
			break;
		default:
			hours = 0;
		}
		return hours;
	}

	public static void wageCalculate(String company, int wagePerHour, int maxWorkingHours, int workingDaysPerMonth) {

		// VARIABLES
		int empHoursPerDay = 0, empHoursPerMonth = 0, workingDays = 0, empWage = 0, totalEmpWage = 0;

		// EMPLOYEE MONTHLY WAGE COMPUTATION
		while (empHoursPerMonth < maxWorkingHours && workingDays < workingDaysPerMonth) {
			empHoursPerDay = empTime();
			empHoursPerMonth += empHoursPerDay;
			workingDays++;
			empWage = empHoursPerDay * wagePerHour;
			System.out.println("Day" + workingDays + "\tEmployeeWage: " + empWage);
			totalEmpWage += empWage;
		}
		System.out.println("Monthly Wage for the Employee in " + company + " is: " + totalEmpWage);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to EMPLOYEE WAGE COMPUTATION.\n");
		System.out.println("==========================\nCOMPANY-1");
		wageCalculate("D-Mart", 20, 100, 20);
		System.out.println("==========================\nCOMPANY-2");
		wageCalculate("Reliance", 40, 50, 25);
		System.out.println("==========================\nCOMPANY-3");
		wageCalculate("Big Basket", 30, 60, 24);
	}
}