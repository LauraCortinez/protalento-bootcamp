package ar.com.educacionit.domain;

import java.util.Date;

public class Articulos {

	private Long id;
	private String titulo;
	private Date fechaCreacion;
	private String codigo;
	private Double precio;
	private Integer stock;
	private Long marcaId;
	private Long categoriaId;
	
	// hacia la base de datos.
	public Articulos(String titulo, Date fechaCreacion, String codigo, Double precio, Integer stock, Long marcaId,
			Long categoriaId) {
		this.titulo = titulo;
		this.fechaCreacion = fechaCreacion;
		this.codigo = codigo;
		this.precio = precio;
		this.stock = stock;
		this.marcaId = marcaId;
		this.categoriaId = categoriaId;
	}

	// desde la base de datos
	public Articulos(Long id, String titulo, Date fechaCreacion, String codigo, Double precio, Integer stock,
			Long marcaId, Long categoriaId) {
		this.id = id;
		this.titulo = titulo;
		this.fechaCreacion = fechaCreacion;
		this.codigo = codigo;
		this.precio = precio;
		this.stock = stock;
		this.marcaId = marcaId;
		this.categoriaId = categoriaId;
	}
	
	
	//Constructor que es lo de arriba lo sacamos con alt+shif+s 

	//get/set
	
	public Double getPrecio() {
		return this.precio;	
	}
	public String getPrecio(String pattern) {
		return this.precio.toString();
	}

	public String getTitulo() {
		return titulo;
	}
	
    public String getTitulo(boolean isUpperCase) {
	if(isUpperCase) {
		return this.titulo.toUpperCase();
	}else {
		return this.titulo;
	}
}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Long getMarcaId() {
		return marcaId;
	}

	public void setMarcaId(Long marcaId) {
		this.marcaId = marcaId;
	}

	public Long getCategoriaId() {
		return categoriaId;
	}

	public void setCategoriaId(Long categoriaId) {
		this.categoriaId = categoriaId;
	}

	public Long getId() {
		return id;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	//toString 
	public String toString() {
		return "Articulo [id=" + id + ", titulo=" + titulo + ", fechaCreacion=" + fechaCreacion + ", codigo=" + codigo
				+ ", precio=" + precio + ", stock=" + stock + ", marcaId=" + marcaId + ", categoriaId=" + categoriaId
				+ "]";
	}
	
	
	
	
}


