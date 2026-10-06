import java.util.Scanner;

public class L06EX05 {
    public static void main(String[] args) {
        int[] par = new int[20], impar = new int[20], numero = new int[20];
        int i;
        Scanner escreve = new Scanner(System.in);
        for(i=0;i<numero.length;i++){
            System.out.print("Digite o "+ (i+1)+" numero: ");
            numero[i]= escreve.nextInt();
            if(numero[i]%2==0){
                par[i]=numero[i];
            }
            else{
                impar[i]=numero[i];
            }
        }
        System.out.println("O numero digitado foi: ");
        for(i=0;i<numero.length;i++){
            System.out.println(numero[i]);
                }
        System.out.println("Os numeros pares digitados foram: ");
        for(int j=0; j<par.length;j++){
                if(par[j]!=0){
                    System.out.println(par[j]);
                }
        }
        System.out.println("Os numeros impares digitados foram: ");
        for(int k=0;k<impar.length;k++){
                if(impar[k]!=0){
                        System.out.println(impar[k]);
                    }
        }
        escreve.close();
    }
}
