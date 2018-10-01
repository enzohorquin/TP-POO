package ArchivoMusica;

public class FiltroAlbum extends FiltroString{

	public FiltroAlbum(String u) {
		super(u);
		
	}

	
	public String getAtributo(Pista P) {
		
		return P.getTituloAlbum();
	}

}
