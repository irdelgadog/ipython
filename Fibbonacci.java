/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibbonacci;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Fibbonacci {

    /**
     * @param args the command line arguments
     */
    
    public int fibbIterativo(int numero){
        int n1 = 0;
        int n2 = 1;
        int resultado = 0;
        if (numero > 1){
            for (int i =0; i < numero-2; i++){
                resultado = n1 + n2;
                n1 = n2;
                n2 = resultado;
            }
            return resultado;
        }else if (numero == 1){
            return 1;
        }else if(numero == 0){
            return 0;
        }
        else{
            System.out.println("Este numero no es correcto");
            return -1;
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Ingrese numero: ");
        int numero = entrada.nextInt();
        int n1 = 0;
        int n2 = 1;
        int resultado = 0;
        
        if (numero > 1){
            for (int i =0; i < numero-1; i++){
                resultado = n1 + n2;
                n1 = n2;
                n2 = resultado;
            }
            System.out.println(resultado);
        }else if (numero == 1){
            System.out.println(1);
        }else if(numero == 0){
            System.out.println(0);
        }
        else{
            System.out.println("Este numero no es correcto");
        }
    }
}
