package ArchivoMusica;

public class FiltroOr implements Filtro {

private Filtro F1;
private Filtro F2; 

public FiltroOr(Filtro F1, Filtro F2){
	
	this.F1=F1;
	this.F2=F2;
	
}

@Override
public boolean cumpleRequisito(Pista P) {
	
	return F1.cumpleRequisito(P)||F2.cumpleRequisito(P);
}


}
