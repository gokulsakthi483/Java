package JavaProgramsDay2;

import java.util.Scanner;

public class Studentdetail {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter Student Roll No: ");
        int rollNo = obj.nextInt();
        System.out.print("Enter Student Name: ");
        obj.nextLine(); // Consume the newline character
        String name = obj.nextLine();
        System.out.print("Enter Class: ");
        String studentClass = obj.nextLine();
        System.out.print("Enter Section: ");
        char section = obj.next().charAt(0);

        // Collect marks for 5 subjects
        System.out.print("Enter marks for Subject 1: ");
        double mark1 = obj.nextDouble();

        System.out.print("Enter marks for Subject 2: ");
        double mark2 = obj.nextDouble();
        System.out.print("Enter marks for Subject 3: ");
        double mark3 = obj.nextDouble();

        System.out.print("Enter marks for Subject 4: ");
        double mark4 = obj.nextDouble();

        System.out.print("Enter marks for Subject 5: ");
        double mark5 = obj.nextDouble();

        // Calculate average
        double average = (mark1 + mark2 + mark3 + mark4 + mark5) / 5;
        System.out.println("\n--- Student Details ---");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Class: " + studentClass);
        System.out.println("Section: " + section);
        System.out.println("Marks: ");
        System.out.println("  Subject 1: " + mark1);
        System.out.println("  Subject 2: " + mark2);
        System.out.println("  Subject 3: " + mark3);
        System.out.println("  Subject 4: " + mark4);
        System.out.println("  Subject 5: " + mark5);
        System.out.printf("Average Marks: %.2f%n", average); // Display average with 2 decimal places

        obj.close();

	}

}