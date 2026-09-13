package testpackage;

import java.util.Scanner;
import evenpackage.Even;

public class TestEven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (Even.checkEven(number)) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is not even.");
        }

        sc.close();
    }
}