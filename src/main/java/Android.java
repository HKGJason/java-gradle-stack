public class Android extends Mobile{
    private final int msgLimit = 11;
    public Android(String name, String color, String brand){
        super(name,color, brand);
    }
    @Override
    public void makeAcall(String input){
        if (input.length()>msgLimit){
            System.out.println("<Andriod> Message cannot be sent");
        }else {
            System.out.print("<Android>");
            super.makeAcall(input);
        }
    }

}
