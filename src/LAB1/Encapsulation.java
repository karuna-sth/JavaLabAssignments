package LAB1;
class Example{  
	private String text;   
	public String getName(){  
		return text;  
	}   
	public void setName(String text){  
		this.text=text;  
	}  
}  
public class Encapsulation {
	public static void main(String[] args) {
		Example ex =  new Example();
		ex.setName("Encapsulation Demo");
		System.out.println(ex.getName());
	}

}
