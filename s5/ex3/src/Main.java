public class Main {
    public static void main(String[] args) {
        GUIFactory gf1, gf2;

        gf1 = new MacGUIFactory();
        gf1.createButton();

        gf2 = new WindowsGUIFactory();
        gf2.createMenu();
    }
}
