//Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет эту строку в простой текстовый файл,
// обработайте исключения.

import java.io.*;
import java.util.*;
import java.lang.*;
public class aufgabe_5 {
    private  Formatter file;
    public void openFail(){
        try{
            file = new Formatter("C:\\Users\\79040\\Desktop\\java\\untitled\\my_file.txt");
            System.out.println("Ффйл создан!");
        }catch (Exception e){
            System.out.println("Ошибка! Файл не создан!");
        }
    }
    public void addRecord(){
        StringBuilder sb = new StringBuilder();
        String str = "TEST";
        String output = " ";
        for(int i = 0; i < 100; i++){
            sb.append(str);
        }
        output = sb.toString();

        try(FileWriter writer = new FileWriter("my_file.txt", false)){
            writer.write(output);
            writer.flush();
        }catch (IOException e) {
            System.out.println("Проблема вывода!");
        }
    }
    private  void closeFile(){
        file.close();
    }
    public static void main(String[] args) {
        aufgabe_5 my_class = new aufgabe_5();
        my_class.openFail();
        my_class.addRecord();
        my_class.closeFile();
    }

}
