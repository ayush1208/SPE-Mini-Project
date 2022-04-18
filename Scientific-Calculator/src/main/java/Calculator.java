import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator
{
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public static double square_root(double x)
    {
        double ans = Math.sqrt(x);
        logger.info("Square root of "+x+" = "+ans);
        System.out.println("Ans = "+ans+"\n");
        System.out.println("");
        return ans;
    }
    public static int factorial(int num){
        int res = 1;
        if(num<=0)
            res=0;
        else {
            for(int i=num; i>=1; i--) {
                res = res*i;
            }
        }
        logger.info("Factorial of "+num+" = "+res);
        System.out.println("Ans = "+res+"\n");
        System.out.println("");
        return res;
    }
    public static double natural_log(double num){
        double res = Math.log(num);
        logger.info("Natural logarithm of "+num+" = "+res);
        System.out.println("Ans = "+res+"\n");
        System.out.println("");
        return res;
    }
    public static double power_func(double num, double exp){
        double res = Math.pow(num,exp);
        logger.info(num+" powers "+exp+" = "+res);
        System.out.println("Ans = "+res+"\n");
        System.out.println("");
        return res;
    }
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int flag=0;
        int operation;
        int num_int;
        double num_double,num_x,b;
        while(flag==0)
        {
            System.out.println("Enter the operation number \n"+
                    "1.Square Root \n"+
                    "2.Factorial \n"+
                    "3.Natural Logarithm (base е) \n"+
                    "4.Power Function\n"+
                    "5:Exit\n");
            operation = reader.nextInt();
            if(operation==5)
            {
                flag=1;
            }
            else
            {
                if(operation==1) {
                    System.out.print("Enter number: ");
                    num_double = reader.nextDouble();
                    square_root(num_double);
                }
                else if(operation==2) {
                    System.out.print("Enter number: ");
                    num_int = reader.nextInt();
                    factorial(num_int);
                }
                else if(operation==3) {
                    System.out.print("Enter number: ");
                    num_double = reader.nextDouble();
                    natural_log(num_double);
                }
                else if(operation==4) {
                    System.out.print("Enter number: ");
                    num_x = reader.nextDouble();
                    System.out.print("Enter exponent: ");
                    b=reader.nextDouble();
                    power_func(num_x,b);
                }
                else {
                    System.out.println("Invalid Number Entered try again");
                }
            }
        }
    }
}
