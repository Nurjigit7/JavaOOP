public class Triangle {
    double a;
    double b;
    double c;

    public double area(double a,double b,double c){
        double p = (a + b + c) / 2;
        double s = p * (p - a) * (p - b) * (p - c);

        return  Math.sqrt(s);
    }
}


