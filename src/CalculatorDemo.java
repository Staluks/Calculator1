import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scan = new Scanner(System.in);
        int result = 0;
        System.out.print("Ievadi Int1: ");
        int amount1 = scan.nextInt();

        System.out.print("Ievadi Int2: ");
        int amount2 = scan.nextInt();

        System.out.print("Izvelies darbibu: (+) (-) (*) (/) ");
        String action = scan.nextLine();

        switch (action) {
            case "+":
                result = calculator.sum(amount1, amount2);
                break;
            case "-":
                result = calculator.sub(amount1, amount2);
                break;
            case "* ":
                result = calculator.mul(amount1, amount2);
                break;
            case "/":
                result = calculator.div(amount1, amount2);
                break;

        }

        System.out.println(result);
    }
}
