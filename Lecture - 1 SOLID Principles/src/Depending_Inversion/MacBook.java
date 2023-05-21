package Depending_Inversion;

public class MacBook {
//    private final WiredKeyboard keyboard;
//    private final WiredMouse mouse;
//
//    public MacBook(){
//        keyboard = new WiredKeyboard();
//        mouse = new WiredMouse();
//    }

    private final Keyboard keyboard2;
    private final Mouse mouse2;

    public MacBook(Keyboard keyboard2, Mouse mouse2){
        this.keyboard2 = keyboard2;
        this.mouse2 = mouse2;
    }

}
