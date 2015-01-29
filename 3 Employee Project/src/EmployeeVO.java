
public class EmployeeVO {
	private int empID;
	private String empName;
	private String empJob;
	private double empBasic;
	private double empComm;
	private double empDeptNumber;
	
	/*getters and setters are always public methods*/
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpJob() {
		return empJob;
	}
	public void setEmpJob(String empJob) {
		this.empJob = empJob;
	}
	public double getEmpBasic() {
		return empBasic;
	}
	public void setEmpBasic(double empBasic) {
		this.empBasic = empBasic;
	}
	public double getEmpComm() {
		return empComm;
	}
	public void setEmpComm(double empComm) {
		this.empComm = empComm;
	}
	public double getEmpDeptNumber() {
		return empDeptNumber;
	}
	public void setEmpDeptNumber(double empDeptNumber) {
		this.empDeptNumber = empDeptNumber;
	}
	
}
