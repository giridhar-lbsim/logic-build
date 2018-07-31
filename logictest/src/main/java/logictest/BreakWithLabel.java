package logictest;

public class BreakWithLabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean t = true;
		one: {
			two: {
				three: {
					System.out.println("be4 break");
					if(t) break two;
					System.out.println("this won't execute");
				}
			System.out.println("this wont execute");
			
			}
		System.out.println("this is after second block");
		}

	}

}
