/* Алгоритъм на Евклид - намираме най-голям общ делител (НОД)      *
*  на две естествени числа a и b, който дели и двата числа без      *
*  остатък. НОД се намира по следния начин: по-голямото число го    *
*  делим на по-малкото (a/b) и получаваме остатък от деленето r.    *
*  След това предходния делител, т.е. число b го делим на остатъка, *
*  и получаваме нов остатък. И така всеки път остатъка се дели на   *
*  резултата от делението на предходните два числа.                 */

import java.util.Scanner;

public class p07_GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
                                        // Докато по-малкото число != 0,
        while (b != 0) {                // веднага запазваме по-малкото число 'b' в променливата 'oldB',
            int oldB = b;               // в 'b' пазим остатъка от деленето на 'a' на 'b',
            b = a % b;                  // в 'a' пазим старото (първото) значение на 'b', получено от 'oldB'.
            a = oldB;                   // На следваща стъпка oldB ни пази остатъка от предходното делене,
        }                               // а 'а' старото значение на 'b'. Във всеки нов цикъл
        System.out.println("GCD = " + a);   // стария остатък го делим на новия докато не стигнем 0 и не получим НОД.
    }
}
