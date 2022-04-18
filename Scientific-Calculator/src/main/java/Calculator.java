import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator
{
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public static double square_root(double x)
    {
        double square_root = Math.sqrt(x);
        
        logger.info("[SQUARE ROOT] "+x);
        logger.info("[RESULT: SQUARE ROOT] "+square_root);

        System.out.println("Square root of "+x+" = "+square_root+"\n");
        System.out.println("");
        return square_root;
    }
    public static int factorial(int x){
        int fact = 1;
        if(x<0){
            fact=0;
        }
        else{
            for(int i=1;i<=x;i++){
                fact=fact*i;
            }
        }
        
        logger.info("[FACTORIAL] "+x);
        logger.info("[RESULT: FACTORIAL] "+fact);

        System.out.println("Factorial of "+x+" = "+fact+"\n");
        System.out.println("");
        return fact;
    }
    public static double natural_log(double x){
        double log_val = Math.log(x);
        
        logger.info("[LOG] "+x);
        logger.info("[RESULT: LOG] "+log_val);

        System.out.println("Natural logarithm of "+x+" = "+log_val+"\n");
        System.out.println("");
        return log_val;
    }
    public static double power_func(double a, double b){
        double ans = Math.pow(a,b);
        
        logger.info("[POWER] "+a+" ^ "+b);
        logger.info("[RESULT: POWER] "+ans);

        System.out.println(a+"to the power of "+b+" = "+ans+"\n");
        System.out.println("");
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int stop=0;
        while(stop==0)
        {
            System.out.println("Enter the operation you want to perform \n"+
                    "1.Square Root \n"+
                    "2.Factorial \n"+
                    "3.Natural Logarithm (base е) \n"+
                    "4.Power Function\n"+
                    "5:Exit\n");
            int operation = reader.nextInt();
            if(operation==5)
            {
                stop=1;
            }
            else
            {
                if(operation==1) {
                    System.out.print("Enter number: ");
                    double x= reader.nextDouble();
                    square_root(x);
                }
                else if(operation==2) {
                    System.out.print("Enter number: ");
                    int x= reader.nextInt();
                    factorial(x);
                }
                else if(operation==3) {
                    System.out.print("Enter number: ");
                    double x = reader.nextDouble();
                    natural_log(x);
                }
                else if(operation==4) {
                    System.out.print("Enter number: ");
                    double a = reader.nextDouble();
                    System.out.print("Enter exponent: ");
                    double b=reader.nextDouble();
                    power_func(a,b);
                }
                else {
                    System.out.println("This operation does not exist");
                }
            }
        }
    }
}
