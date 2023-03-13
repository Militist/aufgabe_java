import java.util.ArrayList;
import java.util.Random;
public class aufgabe_6
{
    public static void main(String[] args)
    {
        // Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++)
        {
            int value = rand.nextInt(-100, 100);
            list.add(value);
        }
        System.out.printf("Полученный список случайных чисел: %s\n", list);
        int i = 0;
        while (i < list.size())
        {
            if(list.get(i) % 2 == 0)
            {
                list.remove(i);
            }
            else
                i++;
        }
        System.out.printf("Список после удаления чётных чисел: %s\n", list);
    }
}
