package oopAndPatterns.chapter01;

public class Menu2ScreenUI implements ScreenUI{
    @Override
    public void show() {
        System.out.println("show this Menu");
    }

    @Override
    public void handleButton1Click() {
        System.out.println("run button on this Menu");
    }
}
