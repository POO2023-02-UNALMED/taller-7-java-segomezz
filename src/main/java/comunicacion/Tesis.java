package comunicacion;

public class Tesis extends Escrito {
	private String idea;
	private String[] argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;
	public Tesis(String origen,String titulo,String autor,int paginas,String idea,String[] argumentos,String conclusion,String referencias,String interpretacion) {
		super(origen,titulo,autor,paginas);
		this.idea=idea;
		this.argumentos=argumentos;
		this.conclusion=conclusion;
		this.referencias=referencias;
		this.interpretacion=interpretacion;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion=interpretacion;
	}
	public String getIdea() {
		return idea;
	}
	public void setIdea(String idea) {
		this.idea=idea;
	}
	public String getConclusion() {
		return conclusion;
	}
	public void setConclusion(String conclusion) {
		this.conclusion=conclusion;
	}
	public String getReferencias() {
		return referencias;
	}
	public void setReferencias(String referencias) {
		this.referencias=referencias;
	}
public String[] getArgumentos() {
	return argumentos;
		//int numeroArgumentos=0;
		//for (int i=0;i<argumentos.length;i++) {
		//	numeroArgumentos++;
		//}
		//return numeroArgumentos;
		
}
public int palabrasTotales(int palabrasPagina) {
	return (5*super.getPaginas()*palabrasPagina);
}
public String interpretacion() {
	return interpretacion;
}
public String toString() {
	return(super.getOrigen()+"\n"+super.getTitulo()+"\n"+super.getAutor()+"\n"+super.getPaginas()+"\n"+getIdea()+"\n"+argumentos.length+"\n"+getConclusion()+"\n"+getReferencias());
	

}
}
