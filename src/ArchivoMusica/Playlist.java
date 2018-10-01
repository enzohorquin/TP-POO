package ArchivoMusica;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;





public class Playlist extends ArchivoMusica {
	
private List<ArchivoMusica> listaPlaylist;
private String Titulo;
private int duracionPlaylist;
 
public Playlist(String T){
	
	this.Titulo=T;
	listaPlaylist= new ArrayList<ArchivoMusica>();
	duracionPlaylist=0;
}

public void copiarPlaylist(Playlist Pl){
	
	
	for(ArchivoMusica A: listaPlaylist){
		Pl.add(A);
	}
	
	
	
}
public void cambiarOrden(Pista P1, Pista P2){
int i = getPosicion(P1);
int j= getPosicion(P2);


listaPlaylist.remove(P1);
listaPlaylist.add(j, P1);

listaPlaylist.remove(P2);
listaPlaylist.add(i, P2);

}

public void Imprimir(){
	
Iterator<ArchivoMusica> It = listaPlaylist.iterator();
System.out.println("Titulo Playlist : "+Titulo);
for(;It.hasNext();){
	ArchivoMusica Aux = It.next();
	Aux.Imprimir();
}
	
}

public String getTitulo(){
	return this.Titulo;
}

public void setTitulo(String T){
	Titulo=T;
}

public void add(ArchivoMusica a){
	listaPlaylist.add(a);
	
	duracionPlaylist+=a.getDuracion();
	
}
public boolean estaVacia(){
	return listaPlaylist.isEmpty();
}


public void deleteArchivo(ArchivoMusica a){
	listaPlaylist.remove(a);
	duracionPlaylist-=a.getDuracion();
	
}

private int getPosicion(ArchivoMusica a){
	return listaPlaylist.indexOf(a);
}


public int getCantidadElementos() {
	int suma = 0;
	for(ArchivoMusica a: listaPlaylist){
		 suma += a.getCantidadElementos();
	}
	return suma;
	}


public int getDuracion() {
		
		return duracionPlaylist;
		
	}
public Playlist buscar(Filtro F){
		
	Playlist out = new Playlist("");
	
	for(ArchivoMusica A : listaPlaylist){
		Playlist Auxiliar = A.buscar(F);
		Iterator<Pista> it = Auxiliar.iterator();
		for(;it.hasNext();){
			out.add(it.next());
		}
		
		
		
		
	}		
return out; 
}	

public Iterator<Pista> iterator(){
	
	Iterator<Pista> it = new IteradorPlaylist();
	return it;
	
}
private class IteradorPlaylist implements Iterator<Pista>{

	private  int i = 0 ;
	public boolean hasNext() {
		
		return i<listaPlaylist.size();
	}

	public Pista next() {
		
		i++;
		return (Pista)listaPlaylist.get(i-1);
	}
	
	
	
	
	
	
	
}
public static void main(String[] args) {
	
	Pista P1 = new Pista(1,"El tiempo no para",311,"Bersuit Vergarabat","De la cabeza",2002,"Rock Nacional");
	Pista P2 = new Pista(2,"Mi caramelo",290,"Bersuit Vergarabat","De la cabeza",2002,"Rock Nacional");
	Pista P3 = new Pista(3,"Party Rock Anthem",408,"LMFAO","Sorry for Party Rocking",2011,"Electro pop");
	Pista P4= new Pista(4,"Sorry for Party Rocking",421,"LMFAO","Sorry for Party Rocking",2011,"Electro pop");
	Pista P5 = new Pista(5,"Fix you",255,"Coldplay","X&Y",2005,"Rock alternativo");
	Pista P6 = new Pista(6,"Speed of Sound",455,"Coldplay","X&Y",2005,"Rock alternativo");
	Pista P7 = new Pista(7,"Viva la vida",320,"Coldplay","Viva la vida",2008,"Rock alternativo");
	Pista P8 = new Pista(8,"Whit or whitout you",360,"U2","The Joshua Tree",1987,"Rock");
	Pista P9 = new Pista(9,"Vertigo",355,"U2","The Joshua Tree", 1987, "rock");
	Pista P10 = new Pista(10,"City of Blinding Lights", 284,"U2","How to Dismantle an Atomic Bomb",2004,"Rock");
	Pista P11 = new Pista(11,"A la luz de la luna",438,"El Indio Solari","Pajaritos, bravos muchachitos",2013,"rock nacional");
	Pista P12 = new Pista(12,"Yo Canibal",258,"Patricio Rey y sus redonditos de ricota","Lobo Suelto, Cordero atado", 1993, "Rock Nacional");
	
	//Punto 2 
	
	Playlist Libreria = new Playlist("Libreria de Pistas"); 
	
	Playlist Pl1 = new Playlist("Clasicos del Rock"); 
	Playlist Pl2 = new Playlist("Lo mejor"); 
	Playlist Pl3 = new Playlist("Coldplay"); 
	Playlist Pl4 = new Playlist("El Indio"); 
	
	Libreria.add(P1);
	Libreria.add(P2);
	Libreria.add(P8);
	Libreria.add(P9);
	Libreria.add(P10);
	Libreria.add(P12);
	Libreria.add(P3);
	Libreria.add(P4);
	Libreria.add(P5);
	Libreria.add(P6);
	Libreria.add(P7);
	Libreria.add(P11);
	

	Pl1.add(P1);
	Pl1.add(P2);
	Pl1.add(P8);
	Pl1.add(P9);
	Pl1.add(P10);
	Pl1.add(P12);
	
	
	Pl2.add(P3);
	Pl2.add(P4);
	Pl2.add(P7);
	Pl2.add(P12);
	
	Pl3.add(P5);
	Pl3.add(P6);
	Pl3.add(P7);
	
	
	Pl4.add(P12);
	Pl4.add(P11);
	
	//Punto 3 
	
	
	System.out.println("Punto 3"); 
	System.out.println("");
	Pl1.Imprimir();
	System.out.println("");
	Pl2.Imprimir();
	System.out.println("");
	Pl3.Imprimir();
	
	System.out.println("");
	//Punto 4
	// a. Las pistas cuya duración sea superior a 400 segundos.
	
	System.out.println("Punto 4.a");
	System.out.println("");
	FiltroDuracion FD= new FiltroDuracion(400,1); 
	
	Playlist ResultadoFiltro= Libreria.buscar(FD);
	ResultadoFiltro.setTitulo("Playlist mayor a 400 segundos");
	ResultadoFiltro.Imprimir();
	
	//Punto 4.b Las pistas cuyo género contenga la palabra “rock”.
	
	FiltroGenero FG= new FiltroGenero("rock");
	System.out.println("");
	System.out.println("Punto 4b");
	System.out.println("");
	ResultadoFiltro.setTitulo("Solo Rock");
	ResultadoFiltro= Libreria.buscar(FG);
	
	ResultadoFiltro.Imprimir();
	
	
	// Punto 4.c Las pistas cuyo nombre contenga “rock” pero cuyo interprete NO sea “LMFAO”.

	System.out.println("");
	System.out.println("Punto 4.c");
	System.out.println("");
	
	FiltroArtista FA = new FiltroArtista("LMFAO");
	ResultadoFiltro.setTitulo("Pistas cuyo nombre contenga rock pero el interprete no es LMFAO");
	FiltroNot FNot= new FiltroNot(FA);
	FiltroTitulo FTit= new FiltroTitulo("rock");
	FiltroAnd FAnd = new FiltroAnd(FTit,FNot);
	ResultadoFiltro=Libreria.buscar(FAnd);
	
	ResultadoFiltro.Imprimir();
	
	
	
	//Punto 4.d Las pistas cuyo género contenga “rock” y cuya fecha sea mayor a “2006”, o cuyo género contenga “rock” y
	//cuyo intérprete sea “coldplay”.
	
	System.out.println("");
	System.out.println("Punto 4.d");
	System.out.println("");
	
	//( GENERO ROCK Y FECHA > 2006) || (GENERO = ROCK Y INTERPRETE coldplay)
	
	
	
	FiltroAño FAño = new FiltroAño(2006,1);
	FiltroAnd FAND = new FiltroAnd(FG,FAño);
	
	FiltroArtista FArt= new FiltroArtista("coldplay");
	FiltroAnd FAND2 = new FiltroAnd(FG,FArt);
	
	FiltroOr FOR = new FiltroOr(FAND,FAND2);
	ResultadoFiltro.setTitulo("");
	ResultadoFiltro= Libreria.buscar(FOR);

	ResultadoFiltro.Imprimir();
	
	
	
	//Punto 5 
	System.out.println("");
	System.out.println("Punto 5 ");
	System.out.println("");
	System.out.println("Duracion Playlist : "+Pl1.getTitulo()+" "+Pl1.getDuracion());
	System.out.println("Duracion Playlist : "+Pl2.getTitulo()+" "+Pl2.getDuracion());
	System.out.println("Duracion Playlist : "+Pl3.getTitulo()+" "+Pl3.getDuracion());
	System.out.println("Duracion Playlist : "+Pl4.getTitulo()+" "+Pl4.getDuracion());
	
		ResultadoFiltro = Libreria.buscar(FD);
		System.out.println("");
		
		System.out.println("Se vuelve a realizar el filtro pedido en punto 4.a");
		ResultadoFiltro.Imprimir();
		System.out.println("Duracion de Playlist : "+ResultadoFiltro.getDuracion());
		System.out.println("");
	
	//Punto 6 
	System.out.println("");
	System.out.println("Punto 6 ");
	System.out.println("");
	
	Playlist copia = new Playlist("Lo mejor++");
	
	Pl2.copiarPlaylist(copia);
	
	
	copia.cambiarOrden(P3,P7);
	
	
	Pl2.Imprimir();
	System.out.println("");
	copia.Imprimir();
	
	
	// Punto 7 
	System.out.println("");
	System.out.println("Punto 7 ");
	System.out.println("");
	
	PlaylistAutomatica PlAuto = new PlaylistAutomatica("Todo lo de Coldplay");
	
	//PlAuto.setFiltro(FArt); // Filtro definido en  4.d
	
	Playlist ResultadoPlaylistAutomatica = new Playlist(PlAuto.getTitulo());
	
	//ResultadoPlaylistAutomatica = PlAuto.generarPlaylistAutomatica(Libreria,FArt);
	
	
	
	
	ResultadoPlaylistAutomatica= PlAuto.actualizarPlaylistAutomatica(FArt,Libreria);
	
	System.out.println("Resultado Playlist Automatica");
System.out.println("");

	ResultadoPlaylistAutomatica.Imprimir();
	//ResultadoPlaylistAutomatica.clear();
	// Punto 8 
		System.out.println("");
		System.out.println("Punto 8 ");
		System.out.println("");

	
	Pista P13 = new Pista(13,"Paradise",365,"Coldplay","Mylo Xyloto",2011,"Rock Alternativo");
	
	Libreria.add(P13);
	 ResultadoPlaylistAutomatica = PlAuto.actualizarPlaylistAutomatica(FArt,Libreria);
	 System.out.println("");
	 System.out.println("Resultado Playlist Automatica");
	 
	 ResultadoPlaylistAutomatica.Imprimir();
	 
	
	
	
	
	
	
	
	
}

}
	
	
