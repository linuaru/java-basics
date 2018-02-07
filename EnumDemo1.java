package enums1;

// An enumeration of Colors 
enum Colors {
	// public static final Colors RED=new Colors("RED",0);
	// public static final Colors YELLOW=new Colors("YELLOW",1);

	RED, YELLOW, GREEN, BLUE, ORANGE;

}

class EnumDemo1 {
	public static void main(String args[]) {
		
		Colors c;// enum type of ref.

		c = Colors.GREEN;
		System.out.println(c.name() + " " + c.ordinal() + " "
				+ c.getClass().getName());

		// Output an enum value.
		System.out.println("Value of clr: " + c);

		// Compare two enum values.
		if (c == Colors.GREEN)
			System.out.println("Color is green\n");

		// Use an enum to control a switch statement.
		switch (c) {
		case RED:
			System.out.println("1");
			break;
		case GREEN:
			System.out.println("2");
			break;
		case BLUE:
			System.out.println("3");
			break;
		case YELLOW:
			System.out.println("4");
			break;
		case ORANGE:
			System.out.println("5");
			break;
		}
	}
}
