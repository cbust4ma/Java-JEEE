package com.inpartek;

public class Libro {

	//atributos
	private String	titulo;
	private int		numpaginas;
	private boolean	esnuevo;
	private String	isbn;
	private String	autor;
	/**
	 * @param titulo
	 * @param numpaginas
	 * @param esnuevo
	 * @param isbn
	 * @param autor
	 */
	public Libro(String titulo, int numpaginas, boolean esnuevo, String isbn, String autor) 
	{
		super();
		this.titulo = titulo;
		this.numpaginas = numpaginas;
		this.esnuevo = esnuevo;
		this.isbn = isbn;
		this.autor = autor;
	}
	
	public Libro() 
	{
		super();
		this.titulo = "";
		this.numpaginas = 0;
		this.esnuevo = true;
		this.isbn = "";
		this.autor = "";
	}
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return the numpaginas
	 */
	public int getNumpaginas() {
		return numpaginas;
	}
	/**
	 * @param numpaginas the numpaginas to set
	 */
	public void setNumpaginas(int numpaginas) {
		this.numpaginas = numpaginas;
	}
	/**
	 * @return the esnuevo
	 */
	public boolean isEsnuevo() {
		return esnuevo;
	}
	/**
	 * @param esnuevo the esnuevo to set
	 */
	public void setEsnuevo(boolean esnuevo) {
		this.esnuevo = esnuevo;
	}
	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}
	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}
	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", numpaginas=" + numpaginas + ", esnuevo=" + esnuevo + ", isbn=" + isbn
				+ ", autor=" + autor + "]";
	}
	
	

}
