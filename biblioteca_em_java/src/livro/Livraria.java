package livro;

import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;

public class Livraria {
	ArrayList<Livro>Livros = new ArrayList(); 
	ArrayList<Editora>Editoras= new ArrayList(); 
	ArrayList<Autor>Autores = new ArrayList(); 

public void cadastroAutro() {
	Scanner sc = new Scanner(System.in);
	
	 System.out.println("Digite o id: ");
     int id = sc.nextInt();
     sc.nextLine(); 
     
     System.out.println("Digite o nome do Autor: ");
     String nome = sc.nextLine();
     
     System.out.println("Digite a nacionalidade: ");
     String nacionalidade = sc.nextLine();
    
    Autor autor = new Autor(id, nome, nacionalidade);
    Autores.add(autor);

}

public void cadastro() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite: \n1-Cadastrar livro.\n2-Cadastrar Revista.\n3-Cadastrar Artigo.");
	int opcao =  sc.nextInt();
	 
	if(opcao == 1) {
	System.out.println("Digite o id: ");
	int id = sc.nextInt();
	sc.nextLine();
	System.out.println("Digite o titulo do livro: ");
    String titulo = sc.nextLine();
    System.out.println("Digite o id autor");
    int idAutor = sc.nextInt();
    String nomeAutor = buscaAutor(idAutor);
    if (nomeAutor != null) {
        System.out.println("Nome do autor: " + nomeAutor);
    } else {
        System.out.println("Autor não encontrado.");
    }
    sc.nextLine();
	System.out.println("Digite a data da publicação: ");
    String data = sc.nextLine();
	System.out.println("Digite a quantidade: ");
	int quantidade = sc.nextInt();
	System.out.println("Digite a Estante: ");
	int estante = sc.nextInt();
	sc.nextLine();
	System.out.println("Digite o ISBN do livro: ");
	String isbn = sc.nextLine();
	
	Livro livro = new Livro(id,titulo,nomeAutor,data,quantidade,estante,isbn);
	Livros.add(livro);

	
	}
}

public void listarLivro() {
	for (Livro livros : Livros) {
		System.out.println(livros);
	}

}
public void listarAutores() {
	for(Autor autores : Autores) {
		System.out.println(autores);
	}

}
public String buscaAutor(int id) {
	
	for(Autor autores : Autores) {
		if(id == autores.getId()) {
			return autores.getNome();
		}
		}
	return null;

}
}


