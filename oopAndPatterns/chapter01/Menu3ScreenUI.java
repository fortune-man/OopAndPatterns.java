package oopAndPatterns.chapter01;

public class Menu3ScreenUI implements ScreenUI{
    @Override
    public void show() {
        System.out.println("transform to Menu3");
    }

    @Override
    public void handleButton1Click() {
        System.out.println("run Button1 on Menu3");
    }

    @Override
    public void handleButton2Click() {
        System.out.println("run Button2 on Menu3");
    }
}
