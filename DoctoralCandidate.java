package Information;

public class DoctoralCandidate implements StudentManagement,TeacherManagement {
	
	String name;     //����
	String sex;      //�Ա�
	int age;         //����
	double tuition;     //ÿѧ��ѧ��
	double salary;      //ÿ��нˮ
	double revenue;  //ʵ��˰�� 
    
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
		System.out.println("��ѧ��ѧ�ѣ�"+tuition);
		System.out.println("��ѧ��ѧ�ѣ�"+2*tuition);
	}
	
	public void searchSalary(double salary,double revenue) { 
		System.out.println("���ʣ�"+(salary-revenue));
		System.out.println("��ʵ�ʹ��ʣ�"+12*(salary-revenue));
	}

	@Override
	public void payTuition(double tuition) {
		// TODO �Զ����ɵķ������
		
	}
	
	public void giveSalary(double salary) {
		
	}
		public void searchSalary(double salary) {
		// TODO �Զ����ɵķ������
		
	}
		@Override
		public void giveSalary(double salary, double revenue) {
			// TODO �Զ����ɵķ������
			
		}

}
