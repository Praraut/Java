
public class EmpTest {

	public static void main(String[] args) {
		Emp e1 = new Emp(101,"Akshay");
		//System.out.println("Count="+ Emp.count);
		//System.out.println("Count = " + e1.getCount2());
		//System.out.println("Count = " + e1.getCount());
		System.out.println("Count = " + Emp.getCount());
		
		
		Emp e2 = new Emp();e2.setEmpId(102);e2.setEmpName("Shubhangi");
		//System.out.println("Count = " + e2.getCount2());
		System.out.println("Count = " + Emp.getCount());
		
		
		//System.out.println(e1.getEmpId());
		//System.out.println(e2.getEmpId());
		
		// No. of objects created for class Emp
	}

}
