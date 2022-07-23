package oopAndPatterns.chapter01;

public class Menu1ScreenUI implements ScreenUI{
    @Override
    public void show() {
        System.out.println("show this Menu");
    }

    @Override
    public void handleButton1Click() {
        System.out.println("run Button1 on this Menu ");
    }
    public void handleButton2Click() {
        System.out.println("run Button2 on this Menu ");
    }
}
