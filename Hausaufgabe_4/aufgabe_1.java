// 1.Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;

public class aufgabe_1 {
    public static void main (String[] args) {
        LinkedList<Integer> my_list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            my_list.add(getRandomNumber());
        }
        System.out.println(my_list);

        for (int i = 0; i < 10; i++) {
            System.out.print(my_list.getLast() + ", ");
            my_list.removeLast();

        }
    }

    public static int getRandomNumber() {
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
}
