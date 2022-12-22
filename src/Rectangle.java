import java.util.Scanner;

class Rect{
	public int length, breadth, area, perimeter;
	
	public Rect(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length and breadth of rectangle");
		length = sc.nextInt();
		breadth = sc.nextInt();
		sc.close();
	}
	
	public void display() {
		System.out.println("The perimeter of rectangle is "+ 2*(length + breadth));
		System.out.println("The area of rectangle is " + length * breadth);
	}
}
public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect r = new Rect();
		r.display();
	}

}
