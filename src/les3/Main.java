package les3;

import java.util.Random;
import java.util.Scanner;


public class Main {

    public static int m() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            if(!scanner.hasNextInt()) {
                System.out.println("Вы ввели не числовое значение ");
                scanner.nextLine();
                continue;
            }
            int digit=scanner.nextInt();
            if(digit>=0 && digit<10){
                return digit;
            }else {
                System.out.printf("Пользовател ввел %s! НЕкорректное значение\n",digit);
            }
        }
    }
    private static int counter;
    private static Random random=new Random();
    public static void main(String[] args) {
        do {
            int number = random.nextInt(10);
            counter = 1;
            System.out.println("Угадай число от  0 до 9");
            int input_number = m();
            while (counter < 3 && !(number == input_number)) {
                if (input_number != number) {
                    System.out.println("Ваше число " + (input_number < number ? "меньше" : " больше"));
                    input_number = m();
                    counter++;
                }
            }
            System.out.println("Вы " + (input_number == number ? "Выигали" : "Проиграли "+number));
            System.out.println("Введите 1, если хотите продолжить");
        }while (m()==1);
    }


}
