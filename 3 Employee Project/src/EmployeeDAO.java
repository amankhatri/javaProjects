
public class EmployeeDAO {
 public boolean registerEmployee(EmployeeVO valueObject) {
	 String method_Name = "Register Employee";
	 System.out.println("Method Invoked from DAO Class: " +method_Name +" : " + valueObject );
	 System.out.println("Emploee Number: " + valueObject.getEmpID());
	 System.out.println("Emploee Name: " + valueObject.getEmpName());
	 System.out.println("Emploee Job: " + valueObject.getEmpJob());
	 System.out.println("Emploee Basic: " + valueObject.getEmpBasic());
	 System.out.println("Emploee Comm: " + valueObject.getEmpComm());
	 System.out.println("Emploee Dept Number: " +valueObject.getEmpDeptNumber());
	 return true;
 }
 
 /*returining multiple values from a method using class*/
 public SalaryVO returnSalaryDetails(int empID){
	 String method_name = "returnSalaryDetails";
	 System.out.println("Method Invoked from DAO Class: " +method_name+" : " +empID);
	    double empBasic = 9000.00d;
	    double empComm = 2345.00d;
	    float hra = (float)(empBasic*.4);
	    float da = (float) (empBasic* .3);
	    int mA = 700;
	    int ePf = 780;
		String jobType = "Contract";
	 SalaryVO salaryvo = new SalaryVO();
	 salaryvo.setDa(da);
	 salaryvo.setEmpBasic(empBasic);
	 salaryvo.setEmpComm(empComm);
	 salaryvo .setePf(ePf);
	 salaryvo.setHra(hra);
	 salaryvo.setJobType(jobType);
	 salaryvo.setmA(mA);
	 return salaryvo;
	 
 }
 
}
