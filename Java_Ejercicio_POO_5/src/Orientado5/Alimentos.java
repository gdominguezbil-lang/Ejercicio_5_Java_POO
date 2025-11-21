package Orientado5;

public class Alimentos {
	
	private String nombre;
	private String estado;
	private Double calorias;
	private Double grasas;
	private Double proteinas;
	private Double Carbohidratos;
	private String Tipo;
	
	public Alimentos(String nombre, String estado, Double calorias, Double grasas, Double proteinas,
			Double carbohidratos, String tipo) {
		super();
		this.nombre = nombre;
		this.estado = estado;
		this.calorias = calorias;
		this.grasas = grasas;
		this.proteinas = proteinas;
		Carbohidratos = carbohidratos;
		Tipo = tipo;
	}
	
	public Alimentos() {
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Double getCalorias() {
		return calorias;
	}

	public void setCalorias(Double calorias) {
		this.calorias = calorias;
	}

	public Double getGrasas() {
		return grasas;
	}

	public void setGrasas(Double grasas) {
		this.grasas = grasas;
	}

	public Double getProteinas() {
		return proteinas;
	}

	public void setProteinas(Double proteinas) {
		this.proteinas = proteinas;
	}

	public Double getCarbohidratos() {
		return Carbohidratos;
	}

	public void setCarbohidratos(Double carbohidratos) {
		Carbohidratos = carbohidratos;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public String toString() {
		return "Alimentos [nombre=" + nombre + ", estado=" + estado + ", calorias=" + calorias + ", grasas=" + grasas
				+ ", proteinas=" + proteinas + ", Carbohidratos=" + Carbohidratos + ", Tipo=" + Tipo + "]";
	}

}
