package module2;
import java.util.Vector;

public class LargestInVector {

	    public static void main(String[] args) {

	        Vector<Integer> numbers = new Vector<>();

	        numbers.add(25);
	        numbers.add(60);
	        numbers.add(15);
	        numbers.add(80);
	        numbers.add(45);

	        int max = numbers.get(0);

	        for (int i = 1; i < numbers.size(); i++) {
	            if (numbers.get(i) > max) {
	                max = numbers.get(i);
	            }
	        }

	        System.out.println("Largest number: " + max);
	    }
	}

