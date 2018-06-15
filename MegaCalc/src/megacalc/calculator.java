package megacalc;

public enum calculator {
    PLUS,
    MINUS,
    MAAL,
    OVER;

    //constructor
    private calculator() {

    }

    //methods
    public static double plus(double a,double b){
        return a + b;
    }

    public static double minus(double a,double b){
        return a - b;
    }

    public static double maal(double a,double b){
        return a * b;
    }

    public static double over(double a,double b){
        return a / b;
    }
}
