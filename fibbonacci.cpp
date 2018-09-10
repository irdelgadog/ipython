#include <stdio.h>

int main()
{
    int fib = 0;
    printf("Ingrese el numero Fibonacci deseado: ");
    scanf("%d", &fib);

    int a = 0;
    int b = 1;
    int c = 0;

    for(int i=0; i<fib-1; i++)
    {
        c = a+b;
        a = b;
        b = c;
    }

    printf("El numero Fibonacci es: %d", c);

    return 0;
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 /
package fibonacci;

import java.util.;

/
 *
 * @author Arkai Ariza
 */
public class Fibonacci {

    /
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero Fibonacci deseado: ");

        int fib = scanner.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;

        for (int i = 0; i < fib-1; i++) 
        {
            c = a+b;
            a = b;
            b = c;
        }

        System.out.println("El numero Fibonacci deseado es: " + c);
    }
}
