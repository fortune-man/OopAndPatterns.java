package oopAndPatterns.chapter01;

import java.awt.*;

public class Application implements OnClickListner{

    private Menu menu1 = new Menu("menu1");
    private Menu menu2 = new Menu("menu2");
    private Button button1 = new Button("button1");
    private Button button2 = new Button("button2");


    private ScreenUI currentScreen = null;

    private String currentMenu = null;

    public Application(){
        menu1.setOnClickListener(this);
        menu2.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    private OnClickListener menuListener = new OnClickListener(){
        public void clicked(Component eventSource){
            String sourceId = eventSource.getName();
            if(eventSource.getName().equals("menu1")){
                currentScreen = new Menu1ScreenUI();
            }else if (sourceId.equals("button1")){
                currentScreen = new Menu2ScreenUI();
            }
            currentScreen.show();
        }
    };

    private OnClickListener buttonListener = new OnClickListener(){
        public void clicked(Component eventSource){
            if(currentScreen == null)
                return;
            String sourceId = eventSource.getName();
        }
    };

    /**
     *
     *public void clicked(Component eventSource){
     *
     *         if(eventSource.getName().equals("menu1")){
     *             changeUIToMenu1();
     *         }else if (sourceId.equals("button1")){
     *             if(currentScreen == null){
     *                 return;
     *                 currentScreen.handleButton1Click();
     *             }
     *         }
     *
     *          else if (eventSource.getId().equals("menu2")){
     *          changeUIToMenu2();
     *          }else if (eventSource.getId().equals("button1")){
     *          if(currentMenu == null)
     *          return;
     *          if(currentMenu.equals("menu1"))
     *          processButton1WhenMenu1();
     *          else if (currentMenu.equals("menu2"))
     *          processButton1WhenMenu2();
     *          }else if (eventSource.getId().equals("button2")){
     *          if(currentMenu == null)
     *          return;
     *          if(currentMenu.equals("menu1"))
     *          processButton2WhenMenu1();
     *          else if (currentMenu.equals("menu2"))
     *          processButton2WhenMenu2();
     *     }
     */



    public void changeUIToMenu1(){
        currentMenu = "menu1";
        System.out.println("메뉴1 화면으로 전환");
    }

    public void changeUIToMenu2(){
        currentMenu = "menu2";
        System.out.println("메뉴2 화면으로 전환");
    }

    public void processButton1WhenMenu1(){
        System.out.println("메뉴1 화면의 버튼1 처리");
    }

    public void processButton1WhenMenu2(){
        System.out.println("메뉴2 화면의 버튼1 처리");
    }


}
