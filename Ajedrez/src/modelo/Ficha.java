package modelo;

public abstract class Ficha {

	 protected double fila;
	 protected double columna;
	 protected int tipoFicha;
	 
	 
	 public double getFila() {
		return fila;
	}


	public void setFila(double fila) {
		this.fila = fila;
	}


	public double  getColumna() {
		return columna;
	}


	public void setColumna(double columna) {
		this.columna = columna;
	}
	
	
	
	 
	public int getTipoFicha() {
		return tipoFicha;
	}


	public void setTipoFicha(int tipoFicha) {
		this.tipoFicha = tipoFicha;
	}


	public Ficha(double fila, double columna, int tipoFicha) {
		super();
		this.fila = fila;
		this.columna = columna;
		this.tipoFicha = tipoFicha;
	}


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
	
	
}
