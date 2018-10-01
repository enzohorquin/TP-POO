package ArchivoMusica;

import java.util.ArrayList;
import java.util.List;

public class Pista extends ArchivoMusica{
private int id; 
private String Titulo; 
private int duracion; 
private String Artista ; 
private String TituloAlbum; 
private int Año;
private String Genero; 
private String Comentarios; 

public Pista(int id, String titulo, int duracion, String artista, String tituloAlbum, int a, String genero){ 
	
	
this.id= id;
 this.Titulo=titulo;
 this.duracion=duracion;
 this.Artista=artista;
 this.TituloAlbum=tituloAlbum;
 this.Año=a;
 this.Genero=genero;
 	
}
public void setId(int id){
	this.id=id;
}
public Pista getPista(){
	return this; 
}

public int getId() {
	return id;
}

public String getTitulo() {
	return Titulo;
}

public int getDuracion() {
	return duracion;
}

public String getArtista() {
	return Artista;
}

public String getTituloAlbum() {
	return TituloAlbum;
}

public int getAño() {
	return Año;
}

public String getGenero() {
	return Genero;
}

public String getComentarios() {
	return Comentarios;
}
public void setComentarios(String comentarios) {
	Comentarios = comentarios;
}

public int getCantidadElementos() {
	
	return 1;
}
public String toString(Pista P){
	
	return P.getTitulo() + ", "+P.getArtista()+", "+P.getTituloAlbum()+", "+P.getGenero()+", "+P.getAño();
	
}
public void Imprimir(){
	
	System.out.println(toString(this));
}


public Playlist buscar(Filtro F) {

Playlist out = new Playlist(""); 

if(F.cumpleRequisito(this)){
	out.add(this);
	
}
return out;

	
}


}
