package BanPhim;

public class NumberListener implements KeyboardListener {

    @Override
    public void onUserPress(String inputString) {
        int number = inputString.length();
        System.out.println("Ban vua nhap : " + number);
    }
}
