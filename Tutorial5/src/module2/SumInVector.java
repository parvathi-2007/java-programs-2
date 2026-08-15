package module2;
import java.util.Vector;

public class SumInVector {

	    public static void main(String[] args) {

	        Vector<Integer> numbers = new Vector<>();

	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);
	        numbers.add(40);
	        numbers.add(50);

	        int sum = 0;

	        for (int i = 0; i < numbers.size(); i++) {
	            sum = sum + numbers.get(i);
	        }

	        System.out.println("Sum of all elements: " + sum);
	    }
	}


