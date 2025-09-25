public class Sqrt {
    
    /**
     * Calculate square root using binary search algorithm
     * with precision of ±0.01
     * @param x number to find square root (x >= 0)
     * @return square root of x with error ±0.01, or -1 if x < 0
     */
    public static double sqrt(double x) {
        if (x < 0) {
            return -1; // Return -1 for negative input
        }
        
        if (x == 0 || x == 1) {
            return x;
        }
        
        double left, right;
        
        // Determine search range
        if (x < 1) {
            left = x;
            right = 1;
        } else {
            left = 1;
            right = x;
        }
        
        double epsilon = 0.01; // Allowed error
        
        // Binary search to find square root
        while (right - left > epsilon) {
            double mid = (left + right) / 2.0;
            double square = mid * mid;
            
            if (square == x) {
                return mid;
            } else if (square < x) {
                left = mid;
            } else {
                right = mid;
            }
        }
        
        // Return average of final range
        return (left + right) / 2.0;
    }
    
    public static void main(String[] args) {
        // Test some values
        System.out.println("sqrt(4) = " + sqrt(4));
        System.out.println("sqrt(9) = " + sqrt(9));
        System.out.println("sqrt(16) = " + sqrt(16));
        System.out.println("sqrt(2) = " + sqrt(2));
        System.out.println("sqrt(-5) = " + sqrt(-5));
    }
}
