//You are working for a publishing company that sells books and magazines. The company is interested in tracking the orders and sales of their publications. As a software developer, your task is to create a program that can calculate the total number of copies of a given book that have been ordered and the total sale of the publication.Task: Write a program in Java that takes input for a book's title, price, number of copies sold, and number of copies ordered. The program should then calculate the total number of copies of the book that have been ordered and the total sale of the publication. The program should also display the results to the user.
import java.util.Scanner;
public class Program3{
  public static void main(String args[]){
    Scanner scanner=new Scanner(System.in);
    
    System.out.print("Enter the book title:");
    String title=scanner.nextLine();

    System.out.print("Enter the price of the book:");
    double price=scanner.nextDouble();

    System.out.print("Enter the number of copies sold:");
    int sold=scanner.nextInt();

    System.out.print("Enter the number of copies ordered:");
    int ordered=scanner.nextInt();

    int totalCopies=sold+ordered;
    double totalSale=price*sold;

    System.out.println("Book title:"+title);
    System.out.println("Total number of copies:"+totalCopies);
    System.out.println("Total sale:"+totalSale);
  }
}