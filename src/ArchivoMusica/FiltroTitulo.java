package ArchivoMusica;

public class FiltroTitulo extends FiltroString {
	public FiltroTitulo(String u) {
		super(u);
		
	
	}
	

	
	public String getAtributo(Pista P) {
		
		return P.getTitulo();
	}

}
