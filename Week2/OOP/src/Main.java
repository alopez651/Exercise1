public class Main {
    public static void main(String[] args){
        Laptop laptop = new Laptop("Accer", "Navy Blue",
                "250 GB", 1200.87, "");

        laptop.setBrand("Accer");
        laptop.setColor("Navy Blue");
        laptop.setMemory("250 GB");
        laptop.setPrice(1200.87);


        System.out.println("Your order list: ");
        System.out.print(laptop.toString());
        laptop.discount();
        System.out.print("Your Total is: $");
        double a1 = Calculator.sub(1200.87, 0.0);
        System.out.print(a1 + "\n\n");

        laptop.setBrand("Dell");
        laptop.setColor("Silver/Black");
        laptop.setMemory("1 TB");
        laptop.setPrice(2500.87);
        laptop.setStudentDiscount("Yes, 25% OFF!");

        System.out.println("Your order list: ");
        System.out.println(laptop.toString());
        System.out.print("Your Total is: $");
        double a = Calculator.sub(2500.50, 25.0);
        System.out.print(a + "\n\n");

        laptop.setBrand("Apple");
        laptop.setColor("Silver");
        laptop.setMemory("1 TB");
        laptop.setPrice(3000.00);
        laptop.setStudentDiscount("Yes, 20% OFF!");

        System.out.println("Your order list: ");
        System.out.println(laptop.toString());
        System.out.print("Your Total is: $");
        double b = Calculator.sub(3000.00, 25.0);
        System.out.print(b + "\n\n");
    }
}
