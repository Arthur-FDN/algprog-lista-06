import java.util.Scanner;

public class L06EX01 
{
    public static void main(String[] args)
    {
        int[ ]numero = new int[5];
        Scanner escreve = new Scanner (System.in);
        for(int i=0;i<numero.length;i++)
            {
            System.out.print("Digite um numero: ");
            numero[i]= escreve.nextInt();
            }
        System.out.println(numero[0]+", "+numero[1]+", "+numero[2]+", "+numero[3]+", "+numero[4]);
        escreve.close();
    }
}
