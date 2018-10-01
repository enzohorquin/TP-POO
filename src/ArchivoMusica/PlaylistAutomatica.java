package ArchivoMusica;


import java.util.Iterator;


public class PlaylistAutomatica extends ArchivoMusica {

private String Titulo; 
private Filtro Fil;
private Playlist Coleccion; 

public PlaylistAutomatica (String T){ 
	
	Titulo= T;
	
}
public String getTitulo(){
	return Titulo;
}

public Playlist actualizarPlaylistAutomatica(Filtro Fil,Playlist Col){
	this.Fil= Fil;
	Playlist out = new Playlist(Titulo);
	
	this.Coleccion=Col;
	
	Iterator<Pista> It = Coleccion.iterator();
	
	for(;It.hasNext();){
		
		Pista Aux= It.next();
		if(Fil.cumpleRequisito(Aux))
			out.add(Aux);		
			
	}
	return out;
}
public int getDuracion(){
	Playlist out = actualizarPlaylistAutomatica(Fil,Coleccion);
	
	return out.getDuracion();
		
}
@Override
public int getCantidadElementos() {
	Playlist out = actualizarPlaylistAutomatica(Fil,Coleccion);
	return out.getCantidadElementos();
}

@Override
public void Imprimir() {
	Playlist out = actualizarPlaylistAutomatica(Fil,Coleccion);
	out.Imprimir();
	
}

public Playlist buscar(Filtro F) {
	
	
	Playlist aux= actualizarPlaylistAutomatica(Fil,Coleccion);
	
	return aux.buscar(F);
}
}

