import java.util.Scanner;


public class MainClassDemo {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Employee Details");
		sc = new Scanner(System.in);
		System.out.println("Enter Employee Number");
		int empNumber = sc.nextInt();
		System.out.println("Enter Employee Name");
		String empName = sc.next();
		System.out.println("Enter Employee Job");
		String empJob = sc.next();
		System.out.println("Enter Employee Basic");
		double empBasic = sc.nextDouble();
		System.out.println("Enter Employee Comm");
		double empComm = sc.nextDouble();
		System.out.println("Enter Employee Dept Number");
		int empDeptNumber = sc.nextInt();
		EmployeeVO employeeVo = new EmployeeVO();
		employeeVo.setEmpID(empNumber);
		employeeVo.setEmpName(empName);
		employeeVo.setEmpJob(empJob);
		employeeVo.setEmpBasic(empBasic);
		employeeVo.setEmpComm(empComm);
		employeeVo.setEmpDeptNumber(empDeptNumber);
		EmployeeDAO empDAO = new EmployeeDAO();
		boolean regFLAG = empDAO.registerEmployee(employeeVo);
		if(regFLAG){
			System.out.println("Employee record Inserted Successfully");
		}
		SalaryVO salaryValueObject = empDAO.returnSalaryDetails(empNumber);
		System.out.println("Employee Number: " + empNumber);
		System.out.println("Employee Name: " +empName);
		System.out.println("Employee Job: " + empJob);
		System.out.println("Employee Basic: " + empBasic);
		System.out.println("Employee Comm: " + empComm);
		System.out.println("Employee DA: " + salaryValueObject.getDa());
		System.out.println("Employee HRA: " + salaryValueObject.getHra());
		System.out.println("Employee MA: " + salaryValueObject.getmA());
		System.out.println("Employee epf: " + salaryValueObject.getePf());
		System.out.println("Employee JobType: " +salaryValueObject.getJobType());
		System.out.println("SalaryValueObject Object: " +salaryValueObject);
	}

}
