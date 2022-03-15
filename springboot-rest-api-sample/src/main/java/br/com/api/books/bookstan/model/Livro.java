package br.com.api.books.bookstan.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "seq_livro", sequenceName = "seq_livro",  allocationSize = 1, initialValue =1)
public class Livro implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_livro")
	private Long bookId;
	
	private String name;
	
	private String autor;
	
	private String sinopse;
	
	private String genero;
	
	private int paginas;
	
	private int dataCompra;
	
	private boolean foiLido;
	
	private String resenha;
	
	private int anoEdcao;
	
	private int preco;

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public int getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(int dataCompra) {
		this.dataCompra = dataCompra;
	}

	public boolean isFoiLido() {
		return foiLido;
	}

	public void setFoiLido(boolean foiLido) {
		this.foiLido = foiLido;
	}

	public String getResenha() {
		return resenha;
	}

	public void setResenha(String resenha) {
		this.resenha = resenha;
	}

	public int getAnoEdcao() {
		return anoEdcao;
	}

	public void setAnoEdcao(int anoEdcao) {
		this.anoEdcao = anoEdcao;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}	

}
