package les3;

import java.util.Scanner;

public class Consol {

        public static void main(String[] args) {
            Scanner scanner2 = new Scanner(System.in);
            while (true){
                System.out.println("Введите число от 0 до 9");
                if(!scanner2.hasNextInt()) {
                    System.out.println("Вы ввели не числовое значение ");
                    scanner2.nextLine();
                    continue;
                }
                int digit=scanner2.nextInt();
                if(digit>0 && digit<=10){
                    System.out.println("пользователь ввле корректное значение " +digit);
                }else {
                    System.out.println("Пользовател  ввел НЕкорректное значение "+digit);
                }
            }
        }

    }
