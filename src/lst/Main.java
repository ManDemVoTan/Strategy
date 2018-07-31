package lst;

import java.util.Scanner;

import javax.lang.model.type.NullType;

import BanPhim.PhanHoiAnNut;
import BanPhim.keyWith;

public class Main {

	public static void main(String[] args) {
		keyWith k = new keyWith();
		boolean quayVong = true;
		int chon = 0;
		Scanner sc = new Scanner(System.in);
		do {
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

			chon = sc.nextInt();
			switch (chon) {
			case 1:
				phanhoibamso bs = new phanhoibamso();
				k.setSukienAnNut(bs);
				k.annut();
				break;
			case 2:
				phanhoibamchu bc = new phanhoibamchu();
				k.setSukienAnNut(bc);
				k.annut();
				break;
			case 3:
				phanhoibamchuHoa bch = new phanhoibamchuHoa();
				k.setSukienAnNut(bch);
				k.annut();
				break;
			case 4:
				System.out.println("Tạm Biệt");
				System.exit(0);
			default:
				System.out.println("bạn chọn sai");

			}
		} while (quayVong);

	}

	static class phanhoibamso implements PhanHoiAnNut {

		@Override
		public void nguoiDungAnNut(String tenNutBam) {

			Scanner sc = new Scanner(System.in);
			System.out.println("nhap n: ");
			int n = sc.nextInt();
			System.out.println("so vua nhap la : " + n);

		}

	}

	static class phanhoibamchu implements PhanHoiAnNut {

		@Override
		public void nguoiDungAnNut(String tenNutBam) {
			Scanner sc = new Scanner(System.in);
			System.out.println("moi ban nhap : ");
			String name = sc.nextLine();
			System.out.println("ban vua nhap ky tu la : " + name);

		}

	}

	static class phanhoibamchuHoa implements PhanHoiAnNut {

		@Override
		public void nguoiDungAnNut(String tenNutBam) {
			Scanner sc = new Scanner(System.in);
			System.out.println("moi ban nhap : ");
			String names = sc.nextLine().toUpperCase();
			System.out.println("ban vua nhap ky tu la : " + names);

		}

	}
}
