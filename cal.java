//Calculator
import java.util.*;
public class cal {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a: ");
      int a=sc.nextInt();
      System.out.print("Enter b: ");
      int b=sc.nextInt();
      System.out.print("Enter Operator: ");
      char operator = sc.next().charAt(0);

      switch(operator){
        case '+': System.out.println(a+b);
                  break;
        case '-': System.out.println(a-b);
                  break;
        case '*' : System.out.println(a*b);
                  break;
        case '/' :System.out.println(a/b); 
                  break;
        case '%' :System.out.println(a%b);  
                  break;
        default : System.out.println("My operator is not that advance");                    
       }
      sc.close();
   }
}
