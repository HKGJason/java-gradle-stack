/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {

    public static void main(String[] args) {
        Mobile m1 = new Mobile("MobileName", "Red", "BrandA");
        m1.makeAcall("Hello World");
        iPhone iphone1 = new iPhone("MyIphone", "White", "Apple");
        iphone1.makeAcall("Apple World");
        Android android1 = new Android("MyAndroid", "Black", "Samsong");
        android1.makeAcall("Android Hello");
        Person p1 = new Person(iphone1, "APerson");

        iphone1.getMobileInfo();
        android1.getMobileInfo();
        p1.makeAcall("Hi");
        p1.setMobile(android1);
        p1.makeAcall("changedAnd");

        IPhoneRobot iphonerobot1 = new IPhoneRobot("iOSBot1", iphone1);
        iphonerobot1.makeAcall("IosBot");
    }
}
