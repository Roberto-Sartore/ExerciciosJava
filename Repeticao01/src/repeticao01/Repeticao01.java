/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticao01;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Repeticao01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int cc = 0;
        do{
            System.out.println("Cambalhota " +cc);
            cc++;
        }while(cc<4);
        
        int n, s = 0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.print("Digite um número ");
            n = teclado.nextInt();
            s += n;
            System.out.print("Quer continuar? [S/N] ");
            resp = teclado.next();
            
        }while(resp.equals("S"));
        System.out.println("A som a de todos os valores é "+ s);
        
    }
    
}
