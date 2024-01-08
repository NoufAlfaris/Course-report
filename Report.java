import java.util.*;
public class Report {
static Scanner input = new Scanner(System.in);
public static void main(String[] args){

double[] s1Marks = {15,15,30};
double[] s2Marks = {25,29,39};
double[] s3Marks = {16.5, 14, 25};
double[] s4Marks = {20,20,38};

Contact c1 = new Contact("nora@hotmail.com", "0551234567");
Student s1 = new Student("455", "Nora", c1, s1Marks, 4.0);

Contact c2 = new Contact("sara@gmail.com" , " 0501234567");
Student s2 = new Student ("3A#" , "Sara", c2, s2Marks , 4.5);

Contact c3 = new Contact("amal@outlook.com", "0541234567");
Student s3 = new Student("49933", "amal", c3, s3Marks, 3.8);

Contact c4 = new Contact("lama@yahoo.com" , "0531234567");
Student s4 = new Student("6?B44", "lama", c4, s4Marks, 4.9);

System.out.println("All students data after they are created successfully:");
s1.printStudent();
s2.printStudent();
s3.printStudent();
s4.printStudent();

System.out.println("enter a new value for Mid1 exam for s1: ");
double mid1s1 = input.nextDouble();
s1.updateMark(mid1s1, 0);
System.out.println("Enter a new value for Mid2 exam for s2:");
double mid2s2 = input.nextDouble();
s2.updateMark(mid2s2, 1);
System.out.println("Enter a new value for Final exam for s3:");
double finals3 = input.nextDouble();
s3.updateMark(finals3, 2);

System.out.println("Final exam average: "+ calcuAvg(s1,s2,s3,s4));
System.out.println("All students data after updating some marks:");
s1.printStudent();
s2.printStudent();
s3.printStudent();
s4.printStudent();



}

public static double calcuAvg(Student s1, Student s2, Student s3, Student s4){

double average = (s1.getFinal() + s2.getFinal() + s3.getFinal() + s4.getFinal()) /4.0;
return average;
}
}