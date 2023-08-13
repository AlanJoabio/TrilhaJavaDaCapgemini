package OrientacaoAObjetos;

/**
 *
 * @author Alan Joabio with mentorship Marcio Michelluzzi
 */

//Classe que representa uma pessoa
public class Pessoa {

    //Atributos de uma pessoa, necess�rios para a resolu��o do problema
    public float peso;
    public float altura;

    //Construtor
    Pessoa() {

    }
    
    //A��o que a pessoa pode executar
    public float calcularIMC(){
        float imc = peso / (altura * altura);
        return imc;
    }

}
