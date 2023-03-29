import java.awt.*;

public class WindowsGUIFactory implements GUIFactory{
    @Override
    public Button createButton(){
        return new WinButton();
    }

    @Override
    public Menu createMenu(){
        return new WinMenu();
    }
}
