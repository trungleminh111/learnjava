package task1;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {

		String[] data = { "toyota", "bmw", "mec", "honda" };

		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.println("Vui lòng nhập loại xe bạn muốn tìm (hoặc nhập 'exit' để thoát):");
			String car = sc.nextLine();

			if (car.equals("exit")) {
				System.out.println("Kết thúc chương trình.");
				break;
			}

			boolean found = false;
			for (int i = 0; i < data.length; i++) {

				if (car.equals(data[i])) {
					found = true;
					break;
				}
			}

			if (found) {
				System.out.println("Xe " + car + " đang có trong kho.");
			} else {
				System.out.println("Xe " + car + " không có trong kho.");
			}
		}

		sc.close();

	}
}
