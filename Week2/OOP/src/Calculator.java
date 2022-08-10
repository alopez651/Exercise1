public class Calculator extends publicFile {

    static String name = "Calculator";
    //do multiplication first then add total at the end
    int noDis;
    public static double sub(double a, double b){
        double savings = b / 100;
        double totalSavings = a * savings;
        return a - totalSavings;
    }
}
