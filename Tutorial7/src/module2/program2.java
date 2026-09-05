package module2;
import java.util.Scanner;

class Students {
    String name, course;
    int rollNo;

    void setDetails(String name, int rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}

class StudentAccount extends Students {
    float collegeFee;

    void setCollegeFee(float collegeFee) {
        this.collegeFee = collegeFee;
    }

    void displayCollegeFee() {
        System.out.println("College Fee: " + collegeFee);
    }
}

class Hosteller extends StudentAccount {
    float hostelFee, messFee;

    void setFees(float hostelFee, float messFee) {
        this.hostelFee = hostelFee;
        this.messFee = messFee;
    }

    void displayDetails() {
        super.displayDetails();
        displayCollegeFee();
        System.out.println("Hostel Fee: " + hostelFee);
        System.out.println("Mess Fee: " + messFee);
        System.out.println("Total Fee: " + (collegeFee + hostelFee + messFee));
    }
}

class DayScholar extends StudentAccount {
    float busFee;

    void setBusFee(float busFee) {
        this.busFee = busFee;
    }

    void displayDetails() {
        super.displayDetails();
        displayCollegeFee();
        System.out.println("Bus Fee: " + busFee);
        System.out.println("Total Fee: " + (collegeFee + busFee));
    }
}

public class program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Hosteller h = new Hosteller();

        System.out.print("Enter Hosteller's Name: ");
        String hName = sc.nextLine();

        System.out.print("Enter Roll No: ");
        int hRollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course: ");
        String hCourse = sc.nextLine();

        System.out.print("Enter College Fee: ");
        float hCollegeFee = sc.nextFloat();

        System.out.print("Enter Hostel Fee: ");
        float hHostelFee = sc.nextFloat();

        System.out.print("Enter Mess Fee: ");
        float hMessFee = sc.nextFloat();
        sc.nextLine();

        h.setDetails(hName, hRollNo, hCourse);
        h.setCollegeFee(hCollegeFee);
        h.setFees(hHostelFee, hMessFee);

        DayScholar d = new DayScholar();

        System.out.print("\nEnter Day Scholar's Name: ");
        String dName = sc.nextLine();

        System.out.print("Enter Roll No: ");
        int dRollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course: ");
        String dCourse = sc.nextLine();

        System.out.print("Enter College Fee: ");
        float dCollegeFee = sc.nextFloat();

        System.out.print("Enter Bus Fee: ");
        float dBusFee = sc.nextFloat();

        d.setDetails(dName, dRollNo, dCourse);
        d.setCollegeFee(dCollegeFee);
        d.setBusFee(dBusFee);

        System.out.println("\n--- HOSTELLER DETAILS ---");
        h.displayDetails();

        System.out.println("\n--- DAY SCHOLAR DETAILS ---");
        d.displayDetails();

        sc.close();
    }
}
