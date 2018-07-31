package BanPhim;

public class UppercaseListener implements KeyboardListener {
    @Override
    public void onUserPress(String inputString) {
        System.out.println("ban vua nhap ky tu la : " + inputString.toUpperCase());

    }
}
