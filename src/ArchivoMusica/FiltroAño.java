package ArchivoMusica;

public class FiltroA�o extends FiltroEntero implements Comparable<Pista>{
	

	
	public FiltroA�o(int u, int v){
	super(u,v);
		
	}
	public int compareTo(Pista P) {
		Integer A�o = new Integer(P.getA�o());
		return A�o.compareTo(getUmbral()) ;
	
	
	}
	public boolean cumpleRequisito(Pista P) {
		
		if((compareTo(P))== super.getValor())
			return true;
		else return false;
	}
	
}
