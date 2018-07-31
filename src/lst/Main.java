package lst;

import java.util.Scanner;

import BanPhim.*;

public class Main {

    private static Keyboard keyboard = new Keyboard();
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        while (true) {
            printMenu();
            doSwitch();
        }
    }

    private static void printMenu() {
        System.out.println("+--------------------+");
        System.out.println("|     1.nhập số      |");
        System.out.println("+--------------------+");
        System.out.println("| 2.in ra chữ thường |");
        System.out.println("+--------------------+");
        System.out.println("| 3. in chữ Hoa	     |");
        System.out.println("+--------------------+");
        System.out.println("|       4.Thoát      |");
        System.out.println("+--------------------+");
        System.out.println("|   mời bạn chọn CT  |");
        System.out.println("+--------------------+");
    }

    private static void doSwitch() {
        int selectedCase = scanner.nextInt();
        switch (selectedCase) {
            case 1:
                keyboard.changeMode(new NumberListener());
                break;
            case 2:
                keyboard.changeMode(new LowercaseListener());
                break;
            case 3:
                keyboard.changeMode(new UppercaseListener());
                break;
            case 4:
                System.out.println("Tạm Biệt");
                System.exit(0);
            default:
                System.out.println("bạn chọn sai");

        }
    }

}
