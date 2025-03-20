import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        StringBuilder sb = new StringBuilder();
        Scanner input = new Scanner(System.in);
        System.out.println("Unesi rečenicu:");
        String tekst = input.nextLine();
        String[] rijec = tekst.split("\\s+");


        for(int i=rijec.length-1;i>=0;i--)
        {
            sb.append(rijec[i]).append(" ");
        }
        System.out.println(sb);

    }
}
