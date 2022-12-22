package LAB1;
class LevelOne{
	
	public void displayLvlOne() {
		System.out.println("This is from Level One - Super class of Level Two");
	}
}

class LevelTwo extends LevelOne{
	public void displayLvlTwo() {
		System.out.println("This is From Level Two - Super class of Level Three and Inherits Level One");
	}
}

class LevelThree extends LevelTwo{
	public void displayLvlThree() {
		System.out.println("This is From Level Three - Inherits Level Two");
	}
}
public class MultiLevel {
	public static void main(String[] arguments) {
		LevelThree lt = new LevelThree();
		lt.displayLvlOne();
		lt.displayLvlTwo();
		lt.displayLvlThree();
	}
}