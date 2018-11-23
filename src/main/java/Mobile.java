public class Mobile {
    private String name;
    private String color;
    private String brand;


    public Mobile(String _name, String _color, String _brand){
        this.name = _name;
        this.color = _color;
        this.brand = _brand;
    }
    public void makeAcall(String input){
        System.out.println("Message: "+input);
    }



}
