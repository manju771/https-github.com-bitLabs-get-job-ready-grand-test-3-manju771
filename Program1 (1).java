//Create a program that maintains an array of Student objects. Each Student object should have a studentId, studentName, rollNo, mobileNumber, marks, and address. The program should allow the user to input the data for each student dynamically with validations. After inputting the data for five students, the program should display the data for all five students.
import java.util.Scanner;

public class Program1{
  public static void main(String args[]){
    Scanner scanner=new Scanner(System.in);
    int numStudents;

    System.out.print("Enter the number of students:");
    numStudents=scanner.nextInt();
    Students[] students=new Student[numStudents];

    for(int i=0;i<numStudents;i++){
      System.out.println("Enter the details of students"+(i+1)+":");
      System.out.print("Name:");
      String name=scanner.next();
      System.out.print("ID:");
      int id=scanner.nextInt();
      System.out.print("Marks:");
      double marks=scanner.nextDouble();
      System.out.print("Address:");
      String address=scanner.next();
      System.out.print("Mobile:");
      String mobile=scanner.next();

      students[i]=new Student(name,id,marks,address,mobile);
    }
    System.out.println("Detalis of all students:");
    for(int i=0;i<numStudents;i++){
      System.out.println(students[i]);
    }
  }
}
class Program1{
  private String name;
  private int id;
  private double marks;
  private String address;
  private String mobile;

public Student(String name,int id, double marks,String address,String mobile){
    this.name=name;
    this.id=id;
    this.marks=marks;
    this.address=address;
    this.mobile=mobile;
  }
  public String toString(){    return"Name:"+name+"\nID:"+id+"\nMarks:"+marks+"\nAddress:"+address+"\nMobile:"+mobile+"\n";
  }
}
  