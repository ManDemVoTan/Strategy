package BanPhim;

public class LowercaseListener implements KeyboardListener {
    @Override
    public void onUserPress(String inputString) {
        System.out.println("ban vua nhap ky tu la : " + inputString);
    }
}
