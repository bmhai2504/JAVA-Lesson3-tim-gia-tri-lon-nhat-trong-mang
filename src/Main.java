import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int arrSize;
        int[] money;
        do {
            System.out.printf("So luong nguoi muon nhap: ");
            arrSize = input.nextInt();
            money = new int[arrSize];
            if (arrSize > 20) {
                System.out.println("So luong nguoi <= 20");
                continue;
            }
            for (int i = 0; i < money.length; i++) {
                System.out.printf("Nguoi thu %d: ", i + 1);
                money[i] = input.nextInt();
            }
            int temp = money[1];
            for (int i = 1; i < money.length; i++) {
                if (temp < money[i]) {
                    temp = money[i];
                }
            }
            System.out.printf("So tai san lon nhat la: %d", temp);
        } while (arrSize > 20);
    }
}