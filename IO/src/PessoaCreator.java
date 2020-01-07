
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jauqeline
 */
public class PessoaCreator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome: ");
        String n = scanner.next();
        System.out.println("Informe a idade: ");
        int i = scanner.nextInt();
        System.out.println("Digite o numero de telefone: ");
        long tel = scanner.nextLong();
        Pessoa p = new Pessoa(n, i, tel);
        System.out.println("Objeto criado: " + p.toString());     
    }
}
