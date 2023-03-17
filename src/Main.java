import java.util.Scanner;
import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(in);
        System.out.println("Ввод строки 'I like Java!!!'");
        String i1 = input.nextLine(); // Предусловие
        boolean result;
        result = i1.contains("Java"); // вопрос 1
        System.out.println(result);
        boolean result2;
        result2 = i1.startsWith("I like"); // вопрос 2
        System.out.println(result2);
        boolean result3;
        result3 = i1.endsWith("!!!"); // вопрос 3
        System.out.println(result3);

        if (result == true && result2 == true && result3 == true) { //вопрос 4
        String Verh = i1.toUpperCase();
        System.out.println(Verh);
        }
        else {
            System.out.println("Что-то вы ввели не так. Попробуйте снова ввести'I like Java!!!'");
        }
        String v5 = i1.replace('a', 'o');
        System.out.println(v5.substring(7,11)); //вопрос 5 - вывод Jovo с использование сабстринг
    }
}