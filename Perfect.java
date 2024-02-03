/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		//// Put your code here
		int num = Integer.parseInt(args[0]);
		String p = num + " is a perfect number since " + num + " = 1";
        int total = 1;
		for (int i = 2; i < num; i++) {
            if(num % i == 0){
               total = total + i;
               p = p + " + " + i;
            } 
		}
		if (num != total){
			System.out.println(num + " is not a perfect number");
		}
		else{
			System.out.println(p);
		}
	}
}
