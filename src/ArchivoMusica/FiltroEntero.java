package ArchivoMusica;

public  abstract class FiltroEntero implements Filtro {
	private Integer umbral;
	private Integer valor;
	
	public FiltroEntero(int u , int v ){ 
		umbral = new Integer(u);
		valor = new Integer(v);
	}
	public Integer getUmbral(){
		return umbral; 
	}
	public int getValor(){
		return valor; 
	}

	public abstract boolean cumpleRequisito(Pista P );
}
