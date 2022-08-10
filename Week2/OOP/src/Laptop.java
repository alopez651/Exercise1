public class Laptop {
    private String brand;
    private String color;
    private String memory;
    private double price;
    private String studentDiscount;

    public Laptop(){
        super();
    }

    public void discount(){
        System.out.println("Unknown" + studentDiscount);
    }

    public Laptop(String brand, String color, String memory, double price, String studentDiscount) {
        this.brand = brand;
        this.color = color;
        this.memory = memory;
        this.price = price;
        this.studentDiscount = studentDiscount;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStudentDiscount() {
        return studentDiscount;
    }

    public void setStudentDiscount(String studentDiscount) {
        this.studentDiscount = studentDiscount;
    }

    @Override
    public String toString() {
        return "Laptop " +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", memory=" + memory +
                ", price=" + price +
                ", studentDiscount=" + studentDiscount +
                ' ';
    }
}
