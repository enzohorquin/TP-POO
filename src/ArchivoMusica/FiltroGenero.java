package ArchivoMusica;

public class FiltroGenero extends FiltroString {

	public FiltroGenero(String u) {
		super(u);
		
	}

	
	public String getAtributo(Pista P) {
		
		return P.getGenero();
	}

}
