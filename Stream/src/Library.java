
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jaqueline
 */
public class Library {
    
    public static void main(String[] args) {
        ArrayList<Book> livros = inicializaLista();
        livros.stream().filter(livro -> {
            return livro.getAutor().startsWith("A");
        }).filter(livro -> {
            return livro.getTitulo().startsWith("A");        
        }).forEach(System.out::println);      
    }

    static ArrayList<Book> inicializaLista(){
        ArrayList<Book> livros = new ArrayList();
        
        livros.add(new Book("Vários autores", "Felicidade: Modos de Usar"));
        livros.add(new Book("Dale Carnegie", "Como Fazer amigos e influenciar pessoas"));
        livros.add(new Book("Laurentino Gomes", "Escravidão"));
        livros.add(new Book("Clive Staples Lewis", "As crônicas de Nárnia"));
        livros.add(new Book("Paulo Vieira", "O Poder da ação"));
        livros.add(new Book("Jane Austen", "Orgulho e Preconceito"));
        livros.add(new Book("Augusto Cury", "Ansiedade"));
        livros.add(new Book("Augusto Cury", "Ansiedade 2"));
        
        return livros;
    }
    
    
    
}
