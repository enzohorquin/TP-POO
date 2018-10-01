package ArchivoMusica;

public abstract class ArchivoMusica { 
	public abstract int getCantidadElementos();
	public abstract int getDuracion();
	public abstract void Imprimir();
	public abstract Playlist buscar(Filtro F);

}
