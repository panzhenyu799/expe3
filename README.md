# 计192 2019311237 潘振宇
# expe3
Java课程作业项目仓库
# 阅读程序
## 实验目的
1.掌握Java中抽象类和抽象方法的定义； 
2.掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法
3.了解异常的使用方法，并在程序中根据输入情况做异常处理
## 实验要求
1.在博士研究生类中实现各个接口定义的抽象方法;
2.对年学费和年收入进行统计，用收入减去学费，求得纳税额；
3.国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static  final修饰定义。
4.实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入。
5.根据输入情况，要在程序中做异常处理。


## 实验过程
1.设计两个管理接口：学生管理接口和教师管理接口。学生接口包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。
2.设计研究生博士类，实现学生管理接口和教师管理接口。研究生包括姓名、性别、年龄、学费、工资、收益等属性。年学费等于学费乘以二，年工资等于工资乘以十二。
3.编写测试类，根据输入的研究生姓名、性别、年龄、学费、工资等打印该研究生信息。利用if-else语句提供工资查询、学费查询、应缴税金查询等。根据国家工资税收标准，用if-else语句判断收益类型，得到应缴金额。

## 核心方法  

1.方法1（研究生信息）
```
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

``` 
2.方法2（计算年学费和年工资）
```
public void searchTuition(double tuition) {
		this.tuition=tuition;
		System.out.println("本学期学费："+tuition);
		System.out.println("本学年学费："+2*tuition);
	}
	
	public void searchSalary(double salary,double revenue) { 
		System.out.println("工资："+(salary-revenue));
		System.out.println("年实际工资："+12*(salary-revenue));
	}}
	   
``` 
3.输出面板 异常处理
```
public static void main(String[] args) {
		System.out.println("                                       ");
		System.out.println("                                       ");
		System.out.println("***************************************");
		System.out.println("请输入研究生人数：");
		Scanner reader0 = new Scanner(System.in);
		try{
			x =reader0.nextInt();
		}
        catch(Exception e){
        	System.out.println("请输入正确格式！");
``` 
4.选择
```
a:for(;;) {
		System.out.println("\n1.工资查询\n2.学费查询\n3.应缴税金\n4.退出");
		System.out.println("请输入1~4：");
		try{
		Scanner reader1 = new Scanner(System.in);
		int y =reader1.nextInt();
		if(y==2) {
			for(int i=0;i<x;) {
				System.out.println(Doctor[i].name);
	        	stu[i] =  Doctor[i];
	        	stu[i].searchTuition(Doctor[i].tuition);
				stu[i].payTuition(Doctor[i].tuition);
				i++;
			}
			}
			else if(y==1) {
				for(int i=0;i<x;) {
					System.out.println(Doctor[i].name);
					tea[i] =  Doctor[i];
					tea[i].searchSalary(Doctor[i].salary,revenue);
					i++;
			}
			}
			else if(y==3) {
				for(int i=0;i<x;) {
					System.out.println(Doctor[i].name);
					System.out.println(Doctor[i].revenue);
					i++;
			}
			}
			else if(y==4) {
				break a;
			
			}
		}
		catch(Exception e){
			System.out.println("请输入正确数字");
		}
		}		
	}
```
5.计算应缴税收
```
public final static double giveRevenue(double salary,double tuition) {
		                          
		revenue=salary*12-tuition*2;
		if(revenue<=5000.00) {                           //3%
			return revenue*0.03;
		}
		else if(revenue>5000.00 && revenue<=12000.00) {  //10%
			return (revenue-5000)*0.1+150;
		}
		else if(revenue>12000.00 && revenue<=25000.00) { //20%
			return (revenue-12000)*0.2+850;
		}
		else if(revenue>25000.00 && revenue<=35000.00) { //25%
			return (revenue-25000)*0.25+3450;
		}
		else if(revenue>35000.00 && revenue<=55000.00) { //30%
			return (revenue-35000)*0.3+5950;
		}
		else if(revenue>55000.00 && revenue<=80000.00) { //35%
			return (revenue-55000)*0.35+11950;
		}
		else if(revenue>80000.00) {                      //45%
			return (revenue-80000)*0.45+20700;
		}
		return 0;
	}
}
```


## 实验结果
![1](https://github.com/panzhenyu799/expe3/blob/main/205c4c90f9aa897e6ba707cad125cca.png)
![2](https://github.com/panzhenyu799/expe3/blob/main/b023be8a62b7cba2ee04f49446dfc9f.png)
## 实验感想  
对Java中抽象类和抽象方法的定义有了更深刻的理解，初步掌握了Java中接口的定义，了解了接口的定义形式以及接口的实现方法，了解异常的使用方法，并在程序中根据输入情况做异常处理。开始的时候，主类中输出的时候还是会忽略抽象方法的定义，导致程序无法运行，刚开始接触异常处理，也不能很好的运用到程序中，只能靠自己不断地摸索实验，在同学的帮助下，去尽力的做好这件事。
