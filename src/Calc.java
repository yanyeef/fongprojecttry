/**
 * The Calc class represents a Calculator with values and math sign
 */
public class Calc {
    private double first;
    private double second;
    private String expression;
    private String sign;
    private double radian;
    private int numOfValues;

    //constructor class
    public Calc(double one, double two, String sign) {
        this.first = one;
        this.second = two;
        this.sign = sign;
    }

    public Calc(double one, String sign){
        this.first = one;
        this.sign = sign;
    }
// if user just types = it will return 0


    public Calc(){
        this.first =0;
        this.sign = "+";
        this.second = 0;
    }

    public Calc(String expression){
        this.expression = expression;
    }
    public void zero(){
        int zero = 0;
        System.out.println("=" + zero);
    }

    public double add(){
        return first + second;
    }

    public double subtract() {
        return first -second;
    }

    public double multiply() {
        return first* second;
    }

    public double divide() {
        return (double) first/ second;
    }

    public double radian(double first) {
        this.radian =Math.toRadians(first);
        return radian;
    }

    public double sin(double radian) {
        return Math.sin(radian);
    }

    public double cos(double radian) {
        return Math.cos(radian);
    }

    public double tan(double radian) {
        return Math.tan(radian);
    }

    public double sqrt() {
        return Math.sqrt(first);
    }

    public double pow() {
        return Math.pow(first, second);
    }

    public double oneVal() {
        double result =0;
        if (sign.equals("sqrt")){
            result = sqrt();
        } else if (sign.equals("sin")){
            result = sin(radian(first));
        } else if (sign.equals("cos")){
            result = cos(radian(first));
        } else if(sign.equals("tan")){
            result = tan(radian(first));
        }
        return result;
    }

    public double twoVal() {
        double result = 0;
        if (sign.equals("+")) {
            result = add();
        } else if (sign.equals("-")) {
            result = subtract();
        } else if (sign.equals("*")) {
            result = multiply();
        } else if (sign.equals("/")) {
            result = divide();
        } else if (sign.equals("^")) {
            result = pow();
        }
        return result;
    }

    public String toString1() {
        if(!sign.equals("!")) {
            return sign + " " + first + " = " + "\n" + oneVal();
        } else {
            return printFactoral();
        }
    }

    public String toString2(){
        return first + " " + sign + " " + second + " = " +"\n"+ twoVal();
    }

    public int factoral(){
        double result = 1;
        while( first >1) {
            result = result * first;
            first--;
        }
        return (int)result;
    }

    public String printFactoral() {
        return sign  + (int)first + " = " + "\n" + factoral();
    }

    public double express(int nov){
        String current = expression.substring(0, expression.length()-1);
        double num =0;
//        int space =0 ;
//        for(int i = 0; i < current.length() && current.charAt(i) == ' '; i ++){
//            space++;
//        }
//        int fspace = space/2 +2;
        while(nov > 0){
            double value = Double.parseDouble(current.substring(0, current.indexOf(" ")));
            if(current.length() >3) {
                current = current.substring(current.indexOf(" ") + 3);
            }
            num += value;
            nov --;
        }

        return num;

    }



}
