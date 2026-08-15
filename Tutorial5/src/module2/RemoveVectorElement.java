package module2;
import java.util.Vector;

public class RemoveVectorElement {
	
	    public static void main(String[] args) {

	        Vector<String> colors = new Vector<>();

	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");

	        colors.remove("Green");

	        System.out.println("Final contents of the vector:");

	        for (int i = 0; i < colors.size(); i++) {
	            System.out.println(colors.get(i));
	        }
	        }
	    }
	


