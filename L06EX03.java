import java.util.Scanner;

public class L06EX03 {
    public static void main(String[] args) 
    {
        Scanner escreve = new Scanner (System.in);
        double[] notas = new double[4];
        double media,soma=0;
        for(int i=0;i<notas.length;i++){
            System.out.print("Digite o valor da nota "+ (i+1)+": ");
            notas[i]= escreve.nextDouble();
            soma=soma+ notas[i];
        }
        media=soma/notas.length;
        System.out.println("A media das quatro notas e: "+ media);
        escreve.close();
    }
}
