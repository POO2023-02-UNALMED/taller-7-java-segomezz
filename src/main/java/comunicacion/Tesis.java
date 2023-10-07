package comunicacion;
import java.util.*;

public class Tesis extends Escrito {
	private String idea;
	private  static List<String> argumentos= new ArrayList<String>();
	private String conclusion;
	private String referencias;
	private String interpretacion;
	public Tesis(String origen,String titulo,String autor,int paginas,String idea,ArrayList<String> argumentos,String conclusion,String referencias,String interpretacion) {
		super(origen,titulo,autor,paginas);
		this.idea=idea;
		this.argumentos= new ArrayList<String>(argumentos);
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
	public String getIdean() {
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
public int cantidadArgumentos() {
		int numeroArgumentos=0;
		for (int i=0;i<argumentos.size();i++) {
			numeroArgumentos++;
		}
		return numeroArgumentos;
		
}
int c=5;
public int palabrasTotales(int c) {
	return (c*(super.getPaginas()));
}
public String interpretacion() {
	return interpretacion;
}
public String toString() {
	return(idea+"\n"+argumentos+"\n"+cantidadArgumentos()+"\n"+conclusion+"\n"+referencias+"\n"+super.getOrigen()+"\n"+super.getTitulo()+"\n"+super.getAutor()+"\n"+super.getPaginas());
}
	

}
