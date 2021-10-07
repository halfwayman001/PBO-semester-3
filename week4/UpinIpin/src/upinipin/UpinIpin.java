package upinipin;

public class UpinIpin {
    public static void main(String[] args) {
        Item name = new Item("Upin");
    }
}
class Item {
    private String name;
    private Item(){
        name = "Ipin";
    }
    public Item(String name){
        this.name = "Ipin";
        System.out.println(this.name);
    }
}
