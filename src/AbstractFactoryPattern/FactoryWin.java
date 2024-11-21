package AbstractFactoryPattern;

public class FactoryWin implements Factory{

    @Override
    public Button createButton() {
        return new ButtonWin();
    }

    @Override
    public Checkbox createCheckbox() {
        return new CheckboxWin();
    }
    
}
