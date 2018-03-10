import java.io.*;

public class Bai87 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int sum = 0;
			String str = br.readLine();
			char[] numStr = str.toCharArray();
			for (int i = 0; i < numStr.length; i++) {
				sum += numStr[i] - '0';
			}
			System.out.println("So goc: " + str);
			print_number(sum);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void print_number(int n) {
		int x;
		int y;
		int z;
		String[] number = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		System.out.println("Tong cac chu so cua so noi tren: " + n);
		if (n < 10) {
			System.out.println(number[n]);
		} else if (n < 100) {
			x = n / 10;
			y = n - x * 10;
			System.out.println("In English: " + number[x] + " " + number[y]);
		} else {
			x = n / 100;
			y = (n - x * 100) / 10;
			z = n - x * 100 - y * 10;
			System.out.println("In English: " + number[x] + " " + number[y] + " " + number[z]);
		}

	}
}