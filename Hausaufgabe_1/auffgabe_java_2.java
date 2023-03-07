import java.util.Scanner;

public class auffgabe_java_2 {
    public static  void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("geben Sie die Jahrnummer ein: ");
        int jahr = in.nextInt();

        System.out.printf("jahr angegeben: %d \n", jahr);

        boolean eingabe = true;

        if ((jahr % 4 == 0) && (jahr % 100 != 0) || (jahr % 400 == 0)){
            eingabe = true;
        }
        else{
            eingabe = false;
        }
        System.out.print(eingabe);

    }

}
