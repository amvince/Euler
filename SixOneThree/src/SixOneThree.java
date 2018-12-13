/**
 *
 * @author ash
 */
public class SixOneThree {
    private static double PI = Math.PI;
    private static double A = 3.0;
    private static double B = 4.0;
    // private static double C = 5.0;
    /**
     * @param args the command line arguments
     */
    public static double getA(double x, double y) {
        return Math.atan(x/(B-y));
    }
    
    public static double getB(double x, double y) {
        return Math.atan(y/(A-x));
    }
    
    public static double getProbability(double x, double y) {
        double c = PI/2 + getA(x,y) + getB(x,y);
        return c / (2*PI);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        double e=0.01;
        double sum = 0;
        
        long numPoints = 0;
        for (double x = e; x<A; x += e) {
            double height = B - x * B/A;
            for (double y = e; y < height; y+=e)
            {
                double current = getProbability(x,y);
                sum += current;
                numPoints++;
                
            }
        }
        double result = sum / numPoints;
        System.out.println(result);
        
        result = 0.5 + Math.log((Math.pow(2, 16) * Math.pow(3,4) * Math.sqrt(3.0/5)) / Math.pow(5,12)) / (12*PI);
        System.out.println(result);
    }
    
}
