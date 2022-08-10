public class publicFile extends Laptop {
    String moreDis;


    public String getMoreDis() {
        return moreDis;
    }

    public void setMoreDis(String moreDis) {
        this.moreDis = moreDis;
    }
    public publicFile(){
        super();
    }
    @Override
    public void discount(){
     super.discount();
        System.out.println("Unknown");

    }
}
