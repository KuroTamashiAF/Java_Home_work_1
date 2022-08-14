//Написать программу вычисления n-ого треугольного числа. 

package Home_Work_1;

import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n для которого нужно расчитать треугольное число: ");
        int input_number = sc.nextInt();
        float input_number_float = input_number;
        float triangle_number  = (input_number_float/2)*(input_number+1);
        String res  = String.format("Треугольное число для числа %d = %d ",input_number, (int)triangle_number);
        System.out.printf(res);
    }
}