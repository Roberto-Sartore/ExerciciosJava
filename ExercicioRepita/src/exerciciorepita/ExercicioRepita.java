/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Pc
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0;
        int c = 0;
        int p = 0;
        int i = 0;
        int a = 0;
        
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número: "
                    + "<br><em>(Valor 0 interronpe)<em></html>", "Bem Vindo!", JOptionPane.INFORMATION_MESSAGE));
            s += n;
            if(n!=0){
                c++;
            }
            if(n!=0 && n%2==0){
                p ++;
            }else if(n%2!=0){
                i ++;
            }
            if(n>100){
                a ++;
            }
        }while(n != 0);
        float m =(float) s/c;
        JOptionPane.showMessageDialog(null, "<html>Resultado final<hr>" + "<br>Somatorio vale " + s + 
                "<br>Total de Valores: "+ c +"<br>Total de Pares: "+ p + "<br>Total de Impares: "+ i + 
                "<br>Acima de 100: "+ a + "<br>Média dos valores : "+ m +"</html>", "Calculado com sucesso!", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
