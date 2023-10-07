package comunicacion;

public class Fabula extends Escrito {
	private String ensenanza;
	private String interpretacion;
	public Fabula(String origen,String titulo,String autor,int paginas,String ensenanza,String interpretacion) {
		super(origen,titulo,autor,paginas);
		this.ensenanza=ensenanza;
		this.interpretacion=interpretacion;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion=interpretacion;
	}
	public String getEnsenanza() {
		return ensenanza;
	}
	public void setEnsenanza(String ensenanza) {
		this.ensenanza=ensenanza;
	}
	public String interpretacion() {
		return interpretacion;
	}
	int c=1;
	public int palabrasTotales(int c) {
		return super.getPaginas();
	}
	public String toString() {
		return(ensenanza+"\n"+super.getOrigen()+"\n"+super.getTitulo()+"\n"+super.getAutor()+"\n"+super.getPaginas());
	}

}
