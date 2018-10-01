package ArchivoMusica;

public class FiltroDuracion extends FiltroEntero implements Comparable<Pista> {
	
	
	public FiltroDuracion(int u,int v){
	super(u,v);
		
	}
	public int compareTo(Pista P) {
		Integer Dur = new Integer(P.getDuracion());
		return Dur.compareTo(getUmbral()) ;
	
		
	}
	
	public boolean cumpleRequisito(Pista P) {
		
		if((compareTo(P))== super.getValor())
			return true;
		else return false;
	}
	
}
