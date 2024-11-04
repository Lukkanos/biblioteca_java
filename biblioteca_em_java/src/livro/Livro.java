package livro;

import java.time.LocalDate;

public class Livro extends Exemplar{

	private String isbn;

	
	public Livro(int id, String titulo, String autor, String dataPublicacao, int estante, int quantidade, String isbn) {
		super(id, titulo, autor, dataPublicacao, estante, quantidade);
		this.isbn = isbn;
		
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	 @Override
	    public String toString() {
	        return "ID: " + getId() +
	        		", Título: " + getTitulo() +
	        		",Autor: "+getAutor()+ 
	        		", Data de Publicação: " + getDataPubliacao()+
	        		",Qunatidade: "+getQuantidade();
	    }
	 
	 
	 
}
