//Suppose you are working on a project that requires you to count the number of elements in an array that have a specific property, such as being an even number, odd number, prime number, and palindrome. You decide to create a program to automate this process.Write a Java program to count the number of elements in an array that have a specific property. The program should prompt the user to enter the size of the array and then input the elements of the array dynamically. After inputting the array elements, the program should count the number of elements that have each specific property and display the results.
import java.util.Scanner;
public class Program2{
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);

    System.out.print("Enter the size of the array:");
    int size=scanner.nextInt();
    
    int[] array=new int[size];

    for(int i=0;i<size;i++){
    System.out.print("Enter elemment"+(i+1)+":");
    array[i]=scanner.nextInt();
    }
    int evenCount=0;
    for(int i=0;i<size;i++){
      if(array[i]%2==0){
        evenCount++;
      }
    }
    int oddCount=0;
    for(int i=0;i<size;i++){
      if(isPrime(array[i])) {
        oddCount++;
      }
    }
    int primeCount=0;
    for(int i=0;i<size;i++){
      if(isPrime(array[i])){
        primeCount++;
      }
    }
    int palindromeCount=0;
    for(int i=0;i<size;i++){
      if(isPalindrome(array[i])){
        palindromeCount++;
      }
    }
    System.out.println("Even numbers:"+evenCount);
    System.out.println("Odd numbers:"+oddCount);
    System.out.println("Prime numbers:"+primeCount);
    System.out.println("Palindrome numbers:"+palindromeCount);
  }
  public static boolean isPrime(int n){
    if(n<=1){
      return false;
    }
    for(int i=2;i<=Math.sqrt(n);i++){
      if(n%i==0){
        return false;
      }
    }
    return true;
  }
  public static boolean isPalindrome(int n){
    String str=Integer.toString(n);
    String reverse=new StringBuilder(str).reverse().toString();
    return str.equals(reverse);
  }
}