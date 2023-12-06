/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetointegrador;

import java.util.Scanner;

/**
 *
 * @author breno
 */
public class ProjetoIntegrador {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        float nota1, nota2, nota3, soma;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = teclado.nextLine(); 
        do{
            System.out.print("Digite a primeira nota: ");
            nota1=teclado.nextFloat();
            System.out.println("Digite uma nota no intervalo de [0, 10].");
        }
        while (nota1<0 || nota1>10);
        do{
            System.out.print("Digite a segunda nota: ");
            nota2=teclado.nextFloat();
            System.out.println("Digite uma nota no intervalo de [0, 10].");
        }
        while (nota2<0 || nota2>10);
        do{
            System.out.print("Digite a terceira nota: ");
            nota3=teclado.nextFloat();
            System.out.println("Digite uma nota no intervalo de [0, 10].");
        }
        while (nota3<0 || nota3>10);
        soma = nota1 + nota2 + nota3;
        if (soma>=18) {
            System.out.format("O valor da soma é %.2f \n", soma);
            System.out.format("O aluno %s está aprovado! \n", nome);
        }
        else if (soma>=15 && soma<18){
            System.out.format("O valor da soma é %.2f \n", soma);
            System.out.format("O aluno %s fará a recuperação final! \n", nome);
        }
        else {
            System.out.format("O valor da soma é %.2f \n", soma);
            System.out.format("O aluno %s está reprovado! \n", nome);
        }
        
    }
    
}
