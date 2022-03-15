
import java.util.*;

 class largest
 {
 
 public static void main(String argv[])
 {
 
    Scanner sc=new Scanner(System.in);
    int num1=sc.nextInt();
     int num2=sc.nextInt();    
     int num3=sc.nextInt();
	 
	if(num1>=num2&&num1>=num3)
	 
    System.out.println("largest="+num1);
 
    else if(num2>=num1&&num2>=num3)
    System.out.println("largest="+num2);
    else
    System.out.println("largest="+num3);
 }
 
 
 
 }