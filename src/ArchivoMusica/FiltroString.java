package ArchivoMusica;



public abstract class FiltroString implements Filtro {
	
	private String umbral;
	public abstract String getAtributo(Pista p);
	
	public FiltroString(String u){
		umbral = u; 
	}
		 
	
	private String pasarAMayuscula(String S){
		  return S.toUpperCase();
	 }
	public boolean perteneceString(String S){
		CharSequence s= pasarAMayuscula(umbral);
		
		
		return  S.contains(s); 
		
	}
	public boolean cumpleRequisito(Pista P ){ 
		
		return ((pasarAMayuscula(getAtributo(P))== pasarAMayuscula(umbral)) || (perteneceString(pasarAMayuscula(getAtributo(P))))) ; 
	}
}
