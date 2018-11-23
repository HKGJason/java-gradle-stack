public class Person {
    private Mobile mobile;
    private String name;

    public Person(Mobile mobile, String name){
        this.mobile = mobile;
        this.name = name;
    }

    public void makeAcall(String input){
        mobile.makeAcall(input);
    }
    public void setMobile(Mobile mobile){
        this.mobile = mobile;
    }
    public Mobile getMobile(){
        return this.mobile;
    }

}
