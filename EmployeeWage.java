package employeeWageComputation;

public class EmployeeWage {

	// CONSTANTS
	public String company;
	public int wagePerHour;
	public int maxWorkingHours;
	public int workingDaysPerMonth;
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	public EmployeeWage(String company, int wagePerHour, int maxWorkingHours, int workingDaysPerMonth) {
		this.company = company;
		this.wagePerHour = wagePerHour;
		this.maxWorkingHours = maxWorkingHours;
		this.workingDaysPerMonth = workingDaysPerMonth;
	}

	public int empTime() {

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

	public void wageCalculate() {

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
		EmployeeWage dmart = new EmployeeWage("D-Mart", 20, 100, 20);
		EmployeeWage reliance = new EmployeeWage("Reliance", 40, 50, 25);
		EmployeeWage bigbasket = new EmployeeWage("Big Basket", 30, 60, 24);
		System.out.println("==========================\nCOMPANY-1");
		dmart.wageCalculate();
		System.out.println("==========================\nCOMPANY-2");
		reliance.wageCalculate();
		System.out.println("==========================\nCOMPANY-3");
		bigbasket.wageCalculate();
	}
}