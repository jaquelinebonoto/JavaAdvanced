/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package split;

/**
 *
 * @author Jaqueline
 */
public class Split {

    public static void main(String[] args) {
        String nome = "Jaqueline Paz Bonoto";
        String[] name = nome.split(" "); //retorna um vetor de string com as posições que ele encontrou
        System.out.println(name[0]); //pegando o primeiro nome
        System.out.println(name[1]); //pegando o segundo nome
        
        String[] teste = nome.split(" ", 3); //passando dois parametros para o método split - quanto pedaços quero da string
        System.out.println(teste[2]);
        
        
        
        String pais = "BRseparaARseparaCA";
        String[] paises = pais.split("separa");
        System.out.println(paises[0]);
        System.out.println(paises[1]);
        System.out.println(paises[2]);
    }
    
}
