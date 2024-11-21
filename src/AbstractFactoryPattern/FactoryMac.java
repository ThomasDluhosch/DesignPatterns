package AbstractFactoryPattern;

public class FactoryMac implements Factory{
    
    @Override
    public Button createButton() {
        return new ButtonMac();
    }

    @Override
    public Checkbox createCheckbox() {
        return new CheckboxMac();
    }
}
