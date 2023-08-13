package Heranca;

import java.util.Date;

/**
 *
 * @author Alan Joabio with mentorship Marcio Michelluzzi
 */

/*
    Est� extendendo de funcion�rio pois o motorista � um tipo de funcion�rio,
    assim fica caracterizado a necessidade do uso da heran�a
*/
public class Motorista extends Funcionario {
    
    //Construtor do Motorista
    public Motorista(String nome, Date dataNascimento, String cpf, Double salario) {
        /*
            Note que � chamado o construtor da classe Pai (Funcion�rio),
            para isso � feito o uso do recurso "super" que chama o construtor
            da classe pai
        */
        super(nome, dataNascimento, cpf, salario);
    }
    
}
