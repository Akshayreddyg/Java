class EmployeeWageProblem{
	 public static final int Emp_present = 1;
    public static final int Half_time = 2;
    public static final int Wage_per_hour = 20;
	 public static final int Num_of_working_days = 20;
	 public static final int Max_hours_in_month = 100;

	public static void main(String[] args){

			int empHrs = 0;
			int totalEmpHrs = 0;
			int totalWorkingDays = 0;
			while ( totalEmpHrs <= Max_hours_in_month && totalWorkingDays < Num_of_working_days ) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;

			switch (empCheck){
				case Emp_present:
								empHrs = 8;
								break;
				case Half_time :
								empHrs=4;
								break;
				default:
					empHrs=0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Days : " + totalWorkingDays + " Emp Hrs: " +empHrs);
		}
		int totalEmpWage = totalEmpHrs *  Wage_per_hour;
		System.out.println("Total Emp Wage: " + totalEmpWage);
	}

}
