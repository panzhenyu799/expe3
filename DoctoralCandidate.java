package Information;

public class DoctoralCandidate implements StudentManagement,TeacherManagement {
	
	String name;     //姓名
	String sex;      //性别
	int age;         //年龄
	double tuition;     //每学期学费
	double salary;      //每月薪水
	double revenue;  //实际税收 
    
    void setTuition(int tuition) {
		this.tuition = tuition;	
	}
	double getTuition() {
		return tuition;	
	}
	void setSalary(int salary) {
		this.salary =salary;	
	}
	double getSalary() {
		return salary;	
	}
	
	public void searchTuition(double tuition) {
		this.tuition=tuition;
		System.out.println("本学期学费："+tuition);
		System.out.println("本学年学费："+2*tuition);
	}
	
	public void searchSalary(double salary,double revenue) { 
		System.out.println("工资："+(salary-revenue));
		System.out.println("年实际工资："+12*(salary-revenue));
	}

	@Override
	public void payTuition(double tuition) {
		// TODO 自动生成的方法存根
		
	}
	
	public void giveSalary(double salary) {
		
	}
		public void searchSalary(double salary) {
		// TODO 自动生成的方法存根
		
	}
		@Override
		public void giveSalary(double salary, double revenue) {
			// TODO 自动生成的方法存根
			
		}

}
