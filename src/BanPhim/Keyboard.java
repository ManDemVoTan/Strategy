package BanPhim;

import java.util.Scanner;

public class Keyboard {

    private KeyboardListener listener;


    public Keyboard() {
    }

    public Keyboard(KeyboardListener listener) {
        super();
        this.listener = listener;
    }

    public void setListener(KeyboardListener listener) {
        this.listener = listener;
    }

    public void changeMode(KeyboardListener listener) {
        this.listener = listener;
        this.onPress();

    }

    private void onPress() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap string: ");
        String str = scanner.nextLine();
        listener.onUserPress(str);
    }


}
