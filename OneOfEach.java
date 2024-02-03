
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		//// Put your code here
	boolean isBoy = false;
	boolean isGirl = false;
	int cn = 0;
	while (!(isBoy && isGirl)){
		double rnd = Math.random();
		if (rnd < 0.5){
			isBoy = true;
			System.out.print("b ");
		}
		if (rnd > 0.5){
			isGirl = true;
			System.out.print("g ");
		}
		cn++;
	}
    System.out.println();
    System.out.println("You made it... and you now have " + cn + " children.");
	}
}
