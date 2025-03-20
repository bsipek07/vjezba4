import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        StringBuilder sb = new StringBuilder();
        Scanner input = new Scanner(System.in);
        System.out.println("Unesi rečenicu:");
        String tekst = input.nextLine();
        String[] rijec = tekst.split("\\s+");


        for(int i=0;i<tekst.length();i++)
        {
            sb.append(rijec[tekst.length()-i]);
        }
        System.out.println(sb);





    }
}
