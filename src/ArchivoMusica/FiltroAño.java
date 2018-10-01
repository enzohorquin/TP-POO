package ArchivoMusica;

public class FiltroAño extends FiltroEntero implements Comparable<Pista>{
	

	
	public FiltroAño(int u, int v){
	super(u,v);
		
	}
	public int compareTo(Pista P) {
		Integer Año = new Integer(P.getAño());
		return Año.compareTo(getUmbral()) ;
	
	
	}
	public boolean cumpleRequisito(Pista P) {
		
		if((compareTo(P))== super.getValor())
			return true;
		else return false;
	}
	
}
