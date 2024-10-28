import java.util.Scanner;

public class CelsiusToFarenhight {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        double celsius,fahrenheit;

        System.out.print("Enter Celcious=");
        celsius=input.nextDouble();

        fahrenheit=((9/5)*celsius)+32;

        System.out.print("Fahrenheit= "+fahrenheit);
    }
}
