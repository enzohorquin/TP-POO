package ArchivoMusica;

public class FiltroArtista extends FiltroString {

	public FiltroArtista(String u) {
		super(u);
		
	}

	
	public int getValor() {
		
		return 0;
	}


	@Override
	public String getAtributo(Pista P) {
		return P.getArtista();
	}

	
	

}
