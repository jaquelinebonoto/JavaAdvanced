/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jaqueline
 */
public class Pessoa {
    private String nome;
    private int idade;
    private long telefone;
    
    public Pessoa(String nome, int idade, long telefone){
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        System.out.println("Pessoa criada. Nome: " + nome + "Idade:" + idade + ", telefone" + telefone);
    }
}
