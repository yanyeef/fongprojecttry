
import java.util.Scanner;


public class CalcRunner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String expression = "";
        System.out.println("If you want sin, cos, tan, !, or sqrt, type out the sign on the first line, then type out the value");
        System.out.print("Type in a value or sign: ");
        String input = scan.nextLine();
        expression += input + " ";
        while (!(input.contains("="))) {
            System.out.print("Type in a value or sign: ");
            input = scan.nextLine();
            expression += input + " ";
        }

        if (input.contains("=")) {
            System.out.print("How much values did you input: ");
            int numOfValues = scan.nextInt();

            if(numOfValues ==0){
                Calc noValue = new Calc();
                noValue.zero();
            }
           else if (numOfValues == 1) {
                String single = expression.substring(expression.indexOf(" ") + 1, expression.indexOf("=") - 1);
                double s = Double.parseDouble(single);
                String math = expression.substring(0, expression.indexOf(" "));
                Calc oneValue = new Calc(s, math);
                System.out.println(oneValue.toString1());

            } else if (numOfValues == 2) {
                String firstValue = expression.substring(0, expression.indexOf(" "));
                double fV = Double.parseDouble(firstValue);
                String secValue = expression.substring(expression.indexOf(" ") + 3, expression.indexOf("=") - 1);
                double sV = Double.parseDouble(secValue);
                String sign = expression.substring(expression.indexOf(" ") + 1, expression.indexOf(" ") + 2);

                Calc twoNumbers = new Calc(fV, sV, sign);
                System.out.println(twoNumbers.toString2());
            }
            else {
                String signEX = expression.substring(expression.indexOf(" ") + 1, expression.indexOf(" ") + 2);
               Calc express = new Calc(expression, signEX);
               System.out.println(express.expressionAdd(numOfValues, signEX));
          }


            }

        }

}