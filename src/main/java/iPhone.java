public class iPhone extends Mobile{
    private final int msgLimit = 10;
    public iPhone(String name, String color, String brand){
        super(name,color, brand);
    }
    @Override
    public void makeAcall(String input){
        if (input.length()>msgLimit) {
            System.out.println("<iPhone> Message cannot be sent");
        }else{
            System.out.print("<iPhone>");
            super.makeAcall(input);
        }
    }


}
