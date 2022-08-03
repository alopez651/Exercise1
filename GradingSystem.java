import java.util.Scanner;

public class GradingSystem {
    public static void main(String [] args){
        Scanner scannerNum = new Scanner(System.in);

        System.out.print("What is your percent grade: ");
//
//        double num = scanner.nextDouble();
//        if(num >= 90){
//            System.out.println("You have an A!");
//        } else if( num >= 80 ) {
//            System.out.println("You have an B!");
//        } else if(num >= 70){
//            System.out.println("You have a C!");
//        } else if(num >= 65){
//            System.out.println("You have a D!");
//        }
//        else {
//            System.out.println("You are failing ):! ");
//        }
        int grade = scannerNum.nextInt();
        if(grade >= 90){
            System.out.println("You have a A!");
        } else if(grade >= 80){
            System.out.println("You have a B!");
        } else if(grade >= 70){
            System.out.println("You have a C!");
        } else if( grade >= 65){
            System.out.println("You have a D!");
        } else {
            System.out.println("You have a F :(");
        }
    }
}
