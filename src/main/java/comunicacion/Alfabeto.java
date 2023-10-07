package comunicacion;

public class Alfabeto extends Pictograma {
	private  String[] letras;
	private String interpretacion;
	public Alfabeto(String origen,String[]letras,String interpretacion) {
		super(origen);
		this.interpretacion=interpretacion;
		this.letras=letras;
		
	}
	public int cantidadLetras() {
		int numeroLetras=0;
		for (int i=0;i<letras.length;i++) {
			numeroLetras++;
		}
		return numeroLetras;
		
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion=interpretacion;
	}
	

public String interpretacion() {
	return interpretacion;
}
public String toString() {
	return("A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z");
}
}
