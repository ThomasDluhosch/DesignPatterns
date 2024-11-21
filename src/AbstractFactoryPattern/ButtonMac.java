package AbstractFactoryPattern;

public class ButtonMac implements Button{
    
    @Override
    public void paint() {
        System.out.println("You have created Button for Mac.");
    }
}
