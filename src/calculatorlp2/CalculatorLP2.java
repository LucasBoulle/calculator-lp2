/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculatorlp2;
import java.util.Scanner;
/**
 *
 * @author 081170012
 */
public class CalculatorLP2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println(" Calculadora em Java (Boulle) \n");
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n Insira dois numeros");
        System.out.print("\n Primeiro numero: ");
        int firstNumber = scanner.nextInt();
        System.out.print("\n Segundo Numero: ");
        int secondNumber = scanner.nextInt();
        System.out.println("\n Selecione entre (*,/,+,-)\n Insira o operador: ");
        String operation = scanner.next();

        String eo = "Voce selecionou o operador ";

        switch (operation) {
        case "*": 
            System.out.println(eo + "* \n Resultado: "+ ( firstNumber * secondNumber )); 
            break;
        case "/": 
            System.out.println(eo + "/ \n Resultado: "+ ( firstNumber / secondNumber )); 
            break;
        case "+": 
            System.out.println(eo + "+ \n Resultado: "+ ( firstNumber + secondNumber ));
            break;
        case "-": 
            System.out.println(eo + "- \n Resultado: "+ ( firstNumber - secondNumber )); 
            break;
        default: System.out.println("\n Por favor selecione um caracter valido"); 
        }

        scanner.close();
    }
   }
    
