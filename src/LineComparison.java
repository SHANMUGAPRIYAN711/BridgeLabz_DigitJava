public class LineComparison {
    public static double CalculateLength(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        double length = CalculateLength(0, 0, 3, 4);
        System.out.println("Length of Line : " + length);
    }
}
