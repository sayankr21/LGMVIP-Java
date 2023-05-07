public class currency {

    String name;
    double rate;

    public static double convert(double number, currency c1, currency c2)  {
        double base = c1.rate;
        double dest = c2.rate;
        double result = (double)(dest/base*number);
        return result;
    }
    
    public static currency Identify(int index) {
        currency c;
        if(index == 0) {
            c = new currency("Rupees", 81.70);
        }
        else if (index == 1) {
            c = new currency("RUB", 78);
        }
        else if (index == 2) {
            c = new currency("EUR", 0.90);
        }
        else if (index == 3) {
            c = new currency("CAD", 1.35);
        }
        else if (index == 4) {
            c = new currency("USD", 1.00);
        }
        else  {
            c = new currency("AUD", 1.50);
        }
        return c;
    }

    public currency(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }
    
}
