import java.util.Scanner;

public class L06EX02 {
    public static void main(String[] args)
    {
        double[] numero = new double[10];
        int i;
        Scanner escreve = new Scanner(System.in);        
        for(i = 0;i<numero.length;i++)
            {
            System.out.print("Digite um numero: ");
            numero[i]=escreve.nextDouble();
            }
        for(i=numero.length - 1;i>=0;i--)
            {
                    System.out.println(numero[i]);
            }
            escreve.close();
    }
}
