/**
 * The Calc class represents a Calculator with values and math sign
 */
public class Calc {
    private double first;
    private double second;
    private String expression;
    private String sign;
    private double radian;

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
    public void zero(){
        System.out.println("=" + 0);
    }

    public Calc(){
        this.first =0;
        this.sign = "+";
        this.second = 0;
    }

    public Calc(String expression){
        this.expression = expression;
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

    public String oneVal() {
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
        return sign +" " + first + " = "+ result;
    }

    public String twoVal() {
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
        return first + " "+ sign + " " + second + " = "+ result;
    }

    public String toString() {

    }




}
