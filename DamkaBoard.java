/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		//// Put your code here
		int s = Integer.parseInt(args[0]);

		int i = 1;
		while (i <= s){
			int t = 1;
			while ((t <= s) && (i % 2 == 0)){
				System.out.print(" " +"*");
				t++;
			}
			while((t <= s) && (i % 2 != 0)){
				System.out.print("* ");
				t++;
			}
			System.out.println();
			i++;      
		}
	}
}
