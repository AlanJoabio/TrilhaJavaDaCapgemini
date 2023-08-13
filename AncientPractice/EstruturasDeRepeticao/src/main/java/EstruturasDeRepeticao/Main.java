package EstruturasDeRepeticao;

import java.util.Scanner;

/**
 *
 * @author Alan Joabio with mentorship Marcio Michelluzzi
 */
public class Main {

    public static void main(String[] args) {

        //ESTRUTURAS DE REPETI��O
        //======================================================================
        /*
            Como voc� j� deve ter visto, estruturas de repeti��o servem para
            fazer com que um trecho de c�digo deseja executado de forma repetida,
            podendo essa repeti��o ter um n�mero conhecido ou n�o de vezes.
            Em Java existem duas estruturas de repeti��o:
            
            1 - while (Correspondente ao "enquanto" no portugol)
            2 - for (Correspondente ao "para" no portugol)
        
            Em ambas estruturas � preciso definir uma condi��o de parada para
            garantir que n�o haja um loop infinito. Os oepradores poss�veis de
            serem utilizados s�o os operadores relacionais e l�gicos
        
            Os operadores relacionais existentes na linguagem s�o:
            1 - Maior           (>) 
            2 - Maior ou igual  (>=)
            3 - Menor           (<)
            4 - Menor ou igual  (<=) 
            5 - Diferente       (!=)
            6 - Igual           (==)
        
            Os operadores l�gicos existentes na linguagem s�o:
            1 - Operador E      (&&)
            2 - Operador OU     (||)
            3 - Operador N�O    (!)
        
            Preced�ncia dos Operadores:
            Ordem 	Tipo de Operador 	Preced�ncia
            1           P�s Fixo                expr++   expr�
            2           Pr� fixo e Un�rio       ++expr   �expr   +expr   -expr   !
            3           Multiplicativo          *    /    %
            4           Aditivo                 +    �
            5           Relacional              >    >=    <=    <
            6           Igualdade               ==    !=
            7           AND L�gico              &&
            8           OR L�gico               ||
            9           Atribui��o              =   +=   -=   *=   /=   %=
         */
        //======================================================================
        // ESTRUTURA WHILE
        //======================================================================
        /*
            A estrutura while � utilizada quando a quantidade de repeti��es
            necess�rias n�o for preciamente conhecida. Ex: quando voc� quer 
            repetir algumas instru��es N vezes.
         */
        //Exemplo de estrutura simples
        boolean desejaRepetir = true;

        Scanner leitor = new Scanner(System.in);

        String nome;
        byte idade;

        while (desejaRepetir = true) {
            System.out.println("Digite o nome do usu�rio");
            nome = leitor.nextLine();

            System.out.println("Digite a idade do usu�rio");
            idade = leitor.nextByte();

            System.out.println(nome + " t�m " + idade + " anos!");

            desejaRepetir = leitor.nextBoolean();
        }

        //======================================================================
        // ESTRUTURA FOR
        //======================================================================
        /* 
            A estrutura de repeti��o for � indicada para as situa��es onde
            previamente se sabe quantas repeti��es ser�o necess�rias. 
        
            Essa estrutura � composta por 3 partes:
            1 - Cria��o da vari�vel de controle da estrutura
            2 - Condi��o de parada
            3 - Incremento
        
            Cada uma dessas partes � separada por um ";"
         */
        for (int i = 0; i < 10; i++) {
            System.out.println("O valor de i �: " + i);
        }

        /*
            Algumas coisas que voc� deve tormar cuidado quando trabalha com
            estruturas de repeti��o � em garantir que a condi��o de parada
            em algum momento seja atentida caso contr�rio sua estrutura de
            repeti��o ficar� em um loop infinito
        
            Outra coisa que voc� n�o deve fazer � criar vari�veis dentro de uma
            estrutura de repeti��o. Caso voc� fa�a isso, a cada repeti��o da 
            estrutura seu algoritmo estar� alocando mem�ria do computador e 
            isso far� com que sua aplica��o tenha um alto consumo de mem�ria.
            Caso voc� precise ler valores dentro da estrutura, crie as vari�veis
            de leitura fora da estrutura repeti��o 
         */
    }
}
