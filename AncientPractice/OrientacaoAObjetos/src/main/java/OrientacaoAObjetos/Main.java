package OrientacaoAObjetos;

/**
 *
 * @author Alan Joabio with mentorship Marcio Michelluzzi
 */
public class Main {

    public static void main(String[] args) {
        
        //ORIENTA��O A OBJETOS
        //======================================================================
        /*
            A programa��o orientada a objetos � um paradigma de programa��o
            criado na decada de 60 a partir da linguagem de programa��o 
            SmallTalk e que se difundiu amplamente nos dias atuais.
        
            A POO (Programa��o Orientada a Objetos) foi criada para tentar 
            aproximar o mundo real do mundo virtual: a id�ia fundamental � 
            tentar simular o mundo real dentro do computador. Para isso, nada 
            mais natural do que utilizar Objetos, afinal, nosso mundo � composto
            de objetos.
        
            Na POO o programador � respons�vel por moldar o mundo dos objetos, 
            e explicar para estes objetos como eles devem interagir entre si. 
            
            Cada objeto possui suas pr�prias informa��es (atributos) e podem
            realizar um conjunto de a��es pr� definidos(m�todos). A intera��o
            entre objeto acontece exatamente quando um objeto "solicita" que 
            o outro objeto execute uma de suas a��es(m�todos).
            
            Para ser criado o objeto precisa de um "molde" e esse molde � a 
            Classe, nela ser�o descritas quais informa��es o objeto poder�  
            armazenar e quais a��es ele poder� executar com as suas informa��es
        
            Os 4 conceitos b�sicos da orienta��o a objetos s�o:
            1 - Classe (Consiste na defini��o da entidade do mundo real, o molde)
            2 - Objeto (Consiste no resultado criado a partir do molde)
            3 - Atributo (Consiste nos informa��es que aquele objeto poder� conter)
            4 - M�todos (Consiste nas a��es que aquele objeto poder� realiziar)
        */
        
        /*
            Vamos imaginar o desenvolcimento de uma aplica��o que calcule o IMC
            de uma pessoa.
       
            Para resolver esse problema de forma orientada a objeto, �
            necess�rio refletir sobre qual entidade do mundo real eu quero 
            respresentar dentro do meu algoritmo, nesse exemplo a pessoa. 
            
            Ap�s identificada da(s)entidade(s) do mundo real que eu vou modelar 
            dentro do meu algoritmo � necess�rio identificar quais informa��es 
            dessa entidade s�o relevante para a resolu��o do meu problema, 
            nesse caso, peso e altura da pessoa.
            
            Note que uma pessoa tem muitas outras informa��es alem dessas, por�m
            para a resolu��o desse problema apenas essas informa��es s�o
            necess�rias. 
        
            Al�m de identificar quais informa��es da entidade
            s�o pertinentes, � necess�rio identificar o que essa entidade poder�
            fazer, nesse caso a pessoa calcular� seu pr�prio IMC.
        
            Vamos a solu��o desse problema:
            1 - De uma olhada na classe pessoa que pertence a esse projeto
            2 - Abaixo � criada uma pessoa e definida as informa��es de peso e
                altura dessa pessoa
            3 - � solicitado que a pessoa fa�a o calculo do seu IMC
        */
        
        //Cria��o do objeto
        Pessoa objetoPessoa = new Pessoa();
        
        //Mudando as informa��es do objeto
        objetoPessoa.peso = 67.3f;
        objetoPessoa.altura = 1.67f;
        
        //Solicitando que a pessoa calcule seu IMC
        float imcPessoa = objetoPessoa.calcularIMC();
              
        System.out.println("O IMC da pessoa �: " + imcPessoa);
        
        /*
            Links de leituras:
        
            * https://www.devmedia.com.br/os-4-pilares-da-programacao-orientada-a-objetos/9264
        */
        //======================================================================
    }
    
}
