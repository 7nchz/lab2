//Известны оценки 28 учащихся. Определить есть ли среди них двойки?
package javaapplication41;
import java.util.Scanner;

public class three {


    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.println("Укажите количество учеников");
        int students = console.nextInt();
        int i=1;
        int bad =0;
        while(i <= students)
        {
            System.out.println("Введите фамилию ученика");
            String name = console.next();
            System.out.println("Введите оценку");
            int mark = console.nextInt();
            if (mark == 2){

                System.out.println("Ученик "+name+" получил 2!");
                bad++;
            }
            i++;
        }
        System.out.println("Количество двоек "+bad);
    }
}