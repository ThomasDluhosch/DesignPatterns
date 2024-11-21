package AbstractFactoryPattern;

public class ButtonWin implements Button{
    
    @Override
    public void paint() {
        System.out.println("You have created Button for Windows.");
    }
    
}
