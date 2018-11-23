public class IPhoneRobot {
    private String name;
    private iPhone iphone;
    public IPhoneRobot(String name, iPhone iphone){
        this.name = name;
        this.iphone = iphone;
    }
    public void makeAcall(String input){
        iphone.makeAcall(input);
    }
    public void setIphone(iPhone iphone){
        this.iphone = iphone;
    }
}
