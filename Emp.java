
public class Emp {
	// instance(Object) variables, one copy per object
	private int empId;
	private String empName;
	
	private static int count; // class level variable, one copy per class
	
	// constructors
	public Emp() {
		count = count+1;
	}
	
	public Emp(int empId, String empName) {// here arg variables are - local variables
		this.empId = empId;
		this.empName = empName;
		
		count++;
	}
	
	
	// getters(accessors) && setters(mutaters)
	
	public static int getCount(){ // this is static method , call it directly from class name
		return Emp.count;
	}	
	
	public int getCount2(){ // this is non static method. you have call with object ref
		return count;
	}
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
}
