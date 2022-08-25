class Employee{
	
	String ename;
	double sal;
	public Employee(String ename,double sal)
	{
		super();
		ename = this.ename;
		this.sal=sal;
	}
	
	public double getSalary()
	{
		
	return sal;
		
		//System.out.println("salary is " + sal);
	}
	public void setSalary() {
		
		this.sal=sal;
	}
	
}

class Manager extends Employee {
	
	double sal;
	public Manager(String ename, double sal) {
		
		super(ename, sal);
		
		this.sal=sal;
		// TODO Auto-generated constructor stub
	}

	double incentive;
	public void  getIncentive()
	{
		incentive = 1000;
		
	}
	
//	@Override
	public double getSalary() {
		
		return sal + incentive;
	}
	
}

class Labour extends Employee{
	
	
	double sal;
	public Labour(String ename, double sal) {
		super(ename, sal);
		
		this.sal=sal;
		// TODO Auto-generated constructor stub
	}

	double overtime = 100;
	public void getOverTime() {
		
		overtime =  100;
	}

//@override	
	public double getSalary()
	{
		return sal + overtime;
	}
}

public class Main_name{
	
	public static void main(String[] args) {
		
		Employee mgr = new Manager("omkar",1000);
		
		Employee lab = new Labour("Jaee",2000);
		
		
		mgr.getSalary();
		lab.getSalary();
		
		
	}
}
