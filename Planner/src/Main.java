import java.util.ArrayList;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        ArrayList <String> menu = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        while(true)
        {
            System.out.println("\nChoose your action:\n1 — Добавить дело в конец списка или дело на определённое" +
                    " место, сдвигая остальные дела вперёд, если указать номер\n2 — Вывести дела с их " +
                    "порядковыми номерами\n3 — Удалить дело\n4 — Исправить дело\n5 — Выйти из программы");
            int menuNumber = scanner.nextInt();
            if (menuNumber == 1)
            {
                System.out.print("Set the number of your business: ");
                int number = scanner.nextInt();
                System.out.print("Set the main part of your business: ");
                String deal = scanner1.nextLine();
                menu.add((number - 1), deal);
                System.out.println("Your business has been saved !!!");
            }
            else if (menuNumber == 2)
            {
                for (int i = 0; i < menu.size(); i++)
                    System.out.println("Business № " + (i + 1) + ": " + menu.get(i));
            }
            else if (menuNumber == 3)
            {
                System.out.println("Choose the number of your business");
                int number = scanner.nextInt();
                menu.remove(number-1);
            }
            else if (menuNumber == 4)
            {
                System.out.println("Choose the number of your business");
                int number = scanner.nextInt();
                System.out.println("Set the correct version of your business");
                String deal = scanner1.nextLine();
                menu.remove(number-1);
                menu.add(number-1,deal);
            }
            else if (menuNumber == 5)
            {
                System.out.print("The end of the program");
                break;
            }
        }
    }
}