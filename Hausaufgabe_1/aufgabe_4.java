
//Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).
import java.util.Scanner;
public class aufgabe_4 {
    public static boolean isPolindrom(String targetStr){
        if(targetStr.length() == 1){
            return true;
        }
        for (int i = 0; i < targetStr.length() / 2; i++){
            if(targetStr.toLowerCase().charAt(i) != targetStr.toLowerCase().charAt(targetStr.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String user_input = in.nextLine();

        System.out.println("Введённая строка: " + user_input);
        in.close();

        boolean res = isPolindrom(user_input);
        System.out.printf("%s - полиндром \n", res);

        if (isPolindrom(user_input)){
            System.out.printf("%s - полиндром \n", user_input);
        }
        else{
            System.out.printf("%s - не полиндром \n", user_input);
        }
    }
}
