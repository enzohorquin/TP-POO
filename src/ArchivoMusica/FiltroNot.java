package ArchivoMusica;

public class FiltroNot implements Filtro {
	private Filtro F1;
	
	public FiltroNot(Filtro F){
		F1=F;
	}

	public boolean cumpleRequisito(Pista P) {
		if(!F1.cumpleRequisito(P))
		return true;
		else return false;
	}

}
