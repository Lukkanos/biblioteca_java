package livro;
import java.time.LocalDate;


public class Exemplar {

	private int id;
	private String titulo;
	private String dataPubliacao;
	private String autor;
	private int estante;
	private int quantidade;
	
	public Exemplar(int id, String titulo, String autor,String dataPublicacao, int estante, int quantidade) {
		
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.dataPubliacao = dataPublicacao;
		this.estante = estante;
		this.quantidade = quantidade;
		
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDataPubliacao() {
		return dataPubliacao;
	}

	public void setDataPubliacao(String dataPubliacao) {
		this.dataPubliacao = dataPubliacao;
	}

	public int getEstante() {
		return estante;
	}

	public void setEstante(int estante) {
		this.estante = estante;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
}
