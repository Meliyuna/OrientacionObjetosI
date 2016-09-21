package modelo;

import modelo.Pelicula;
import modelo.Genero;
import java.util.ArrayList;
import java.util.List;


public class Incaa {
	private List<Pelicula> catalogo;

	//CONSTRUCTOR
	public Incaa() {

		this.catalogo = new ArrayList<Pelicula>();
	}

	//GETTERS Y SETTERS
	public List<Pelicula> getCatalogo() {
		return catalogo;
	}

	
	//TRAER PELICULA EN STRING
	public Pelicula traerPelicula (String pelicula){
		Pelicula peli = null;
		/*int i=0;
		while (peli==null || i<catalogo.size()){
			if (pelicula.equalsIgnoreCase(catalogo.get(i).getPelicula())){
				peli=catalogo.get(i);
			}
		}*/
		
		for (Pelicula p: catalogo){
			if (pelicula.equalsIgnoreCase(p.getPelicula())) peli = p;
		}		
		return peli;
	}	
	
	//TRAER PELICULA EN ID
	public Pelicula traerPelicula (int idPelicula){
		Pelicula peli = null;
		/*int i=0;
		while (peli == null || i<catalogo.size()){
			if (idPelicula == catalogo.get(i).getIdPelicula()){
				peli = catalogo.get(i);
			}
		i++;
		}*/
		
		for (Pelicula p: catalogo){
			if (idPelicula == p.getIdPelicula()) peli = p;
		}
		return peli;
	}

	//AGREGAR PELICULA
	public boolean agregarPelicula (String pelicula, Genero genero) throws Exception{
		
		Pelicula p = new Pelicula(catalogo.size()+1, pelicula, genero);
		
		if (this.traerPelicula(pelicula) == null){
			catalogo.add(p);
			return true;
		}
		else throw new Exception ("Error: La pelicula ya existe");				
	}
	
	//MODIFICAR PELICULA
	public void modificarPelicula (Pelicula pelicula) throws Exception{
		int id = pelicula.getIdPelicula();
		int i=0;
		while (i < catalogo.size()){
			if (id == catalogo.get(i).getIdPelicula())
				catalogo.get(i).setPelicula(pelicula.getPelicula());
			else throw new Exception ("Error: La pelicula no existe");
			i++;
		}		
	}
	
	//ELIMINAR PELICULA
	public boolean eliminarPelicula (Pelicula pelicula) throws Exception{
		
		boolean borrar = false;
		
		/*while (i < catalogo.size() && borrar == false){
			if (id == catalogo.get(i).getIdPelicula()){
				catalogo.set(i, null);
				borrar = true;
			}
			else throw new Exception ("Error: la pelicula no existe"); 
			i++;
		}*/
		
		for (Pelicula p: catalogo){
			if (p.equals(pelicula)){
				catalogo.remove(p);
				borrar = true;
			}
			else throw new Exception ("Error: la pelicula no existe");
		}
		
		return borrar;
	}
	
	public List<Pelicula> traerPelicula (Genero genero){
		
		List<Pelicula> pelisGen = new ArrayList<Pelicula>();
		
		for (Pelicula p: catalogo){
			
			if (p.getGenero().getIdGenero() == genero.getIdGenero())
				pelisGen.add(p);
		}
		
		return pelisGen;
	}

}