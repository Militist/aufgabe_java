import java.util.ArrayList;
import java.util.Scanner;
public class aufgabe_8
{
    public static void main(String[] args)
    {
        // Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа.
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int symbol = 0;
       for(int i = 0; i < 5; i++)
       {
           System.out.print("Введите строку: ");
           String s = scanner.nextLine();
           list.add(s);
       }
        System.out.println("Первоначальный список: ");
        for(String value : list)
        {
            System.out.print(value + " ");
        }
        System.out.println();
        for (int i = 0; i < list.size(); i++)
        {
            if(Character.isDigit(i))
            {
                symbol = i;
                list1.add(symbol);
            }
        }
        for(int i = 0; i < list1.size(); i++)
        {
            System.out.printf("полученный символ: %s\n", i);
        }
        System.out.print("Ввод для удаления из списка: ");
        String user_input = scanner.nextLine();
        list.remove(user_input);

        System.out.print("Список после удаления: ");
        for(String value : list)
        {
            System.out.print(value + " ");
        }
    }
}
