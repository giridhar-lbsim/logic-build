/**
 * 
 */
package logictest;

/**
 * @author 52033410
 *
 */
public class SwitchStatement {
	
	enum days {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Integer value = 5;
		switch (value) {
		case 2:
			System.out.println("vaule is " + value);
			break;

		case 5:
			System.out.println("value is " + value);
			break;

		default:
			System.out.println("Invalid value...");

		}

		String name = "Giridhar";
		switch (name) {

		case "mukesh":
			System.out.println("name is " + name);
			break;
		case "Giridhar":
			System.out.println("name is :" + name);
			break;

		default:
			System.out.println("Invalid name: ");

		}

	}

}
