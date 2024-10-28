import java.util.Scanner;

public class ArithmaticOparetor {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        double n1,n2,sum,sub,div,mul,rem;

        System.out.print("Enter 1st number=");
        n1=input.nextDouble();

        System.out.print("Enter 2nd number=");
        n2=input.nextDouble();

        sum=n1+n2;
        System.out.println("Sum="+sum);

        sub=n1-n2;
        System.out.println("Sub="+sub);

        mul=n1*n2;
        System.out.println("Mul="+mul);

        div=  n1/n2;
        System.out.println("Div="+div);

        rem=n1%n2;
        System.out.print("Rem="+rem);
    }
}
