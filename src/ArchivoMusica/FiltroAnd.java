package ArchivoMusica;

public class FiltroAnd implements Filtro {
	
	private Filtro F1;
	private Filtro F2;

	public FiltroAnd(Filtro F1,Filtro F2){
		this.F1=F1;
		this.F2=F2;
	}
	public boolean cumpleRequisito(Pista P) {
		
		return F1.cumpleRequisito(P)&&F2.cumpleRequisito(P);
	}
	

	
}
