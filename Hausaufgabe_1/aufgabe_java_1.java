public class aufgabe_java_1 {
    public static void main(String[] args) {

       //  Задача №1. Задать одномерный массив и найти в нем минимальный и максимальный элементы
        int myArray[] = {23, 43, 1, 20, 67, 32, 7, 80, 902, 4};

       int min_value = myArray[0];
       int max_value = myArray[1];

       for (int i = 0; i < myArray.length; i++){
           if (min_value > myArray[i]) {
               min_value = myArray[i];
           }
       }
       for (int i = 0; i < myArray.length; i++){
           if (max_value < myArray[i]){
               max_value = myArray[i];
           }
       }
       System.out.println(max_value);
       System.out.println(min_value);
    }
}
