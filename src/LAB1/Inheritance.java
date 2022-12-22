package LAB1;
class Employee{  
	double gpa = 4.0;  
}  
class Inheritance extends Employee{  
	String grade="A+";  
	public static void main(String args[]){  
		Inheritance p=new Inheritance();  
		System.out.println("The GPA is "+p.gpa);  
		System.out.println("Grade is:"+p.grade);  
	}  
}  