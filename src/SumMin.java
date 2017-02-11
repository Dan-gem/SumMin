public class SumMin {
    public static void main(String[] args) {
        int a = 7, b = 17, c = 0;
        int sum;
        System.out.print("Все значение чисел расположенных между цифрами 7 и 17 = ");
        for (a = 8; a < b; a++) {
            for (a = 8, sum = 0; a < b; a++) {
                sum += a;
                System.out.print(a + ",");
            }
            System.out.println();
            System.out.println("Сумма всех чисел расположенных между цифрами 7 и 17 = " + sum);
        }
        System.out.print("Все нечетные значения чисел расположенные между цифрами 7 и 17 = ");
        for (a = 8; a < b; a++) {
            if (a % 2 == 1) {
                System.out.print(a + ",");
            }
        }
    }
}
