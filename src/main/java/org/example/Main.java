package org.example;
/*
Dudeney sayıları, İngiliz matematikçi Henry Dudeney'in adını taşıyan bir tür doğal sayıdır. Bir Dudeney sayısı, kendi rakamları toplamının
küpü olarak ifade edilebilen bir tamsayıdır.

Matematiksel olarak, n bir Dudeney sayısı ise, şu eşitlik sağlanır: n = toplam(n)³ Burada,toplam(n),n sayısının rakamlarının toplamını
temsil eder.
Örneğin 512 = (5+1+2)³ bir Dudeney sayısıdır.
*/

public class Main {
    public static void main(String[] args) {


        System.out.println("1'den 999'a kadar olan Dudeney sayıları:");
        for (int i = 1; i <= 999; i++) {
            int sum = digitSum(i);
            int cube = sum * sum * sum;
            if (i == cube) {
                System.out.println(i);
            }
        }
        // Bir sayının rakamlarının toplamını hesaplayan metot
    }

    private static int digitSum(int number) {
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}