/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		//// Write your code here
    int r = (int)(10 * Math.random());
    int p = r;
    do{ 
    	p = r; 
    System.out.print(p + " ");
    r = (int)(10 * Math.random());
    }while(r >= p);
    System.out.println();
	}
}
