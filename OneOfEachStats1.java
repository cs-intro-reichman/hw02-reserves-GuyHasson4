/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		//// Put your code here
	int T = Integer.parseInt(args[0]);

	int childcount = 0;
	int h2c = 0;
	int h3c = 0;
	int h4mc = 0;
	double total = 0;


	for ( int i = 0; i < T; i++ ) {
			boolean isBoy = false;
	        boolean isGirl = false;
		    int fcount = 0;
	        while (!(isBoy && isGirl)){
		      double rnd = Math.random();
		      if (rnd < 0.5){
			  isBoy = true;
		      }
		      if (rnd > 0.5){
			  isGirl = true;
		      }
		      fcount++;
	    }
	    total++;   
        total = total + fcount;
 
        if (fcount == 2) {
    	h2c++;
        } else {
    	  if (fcount == 3){
    		h3c++;
    	} else {
    		h4mc++;
    	}
        }
    }
    double avg = (total / T);

    System.out.println("Average: " + avg + " children to get at least one of each gender.");
    System.out.println("Number of families with 2 children: " + h2c);
    System.out.println("Number of families with  c3hildren: " + h3c);
    System.out.println("Number of families with 4 or more children: " + h4mc);


    String mode = "The most common number of children is ";
    int max = Math.max(Math.max(h2c, h3c), h4mc);
    if(max == h2c){
    	mode= mode + "2.";
    }else{
    	if (max == h3c) {
    		mode = mode + "3.";
    	}else{
    		mode = mode + "4 or more.";
    	}
    }
    System.out.println(mode);
	}
}
