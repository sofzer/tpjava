import java.util.ArrayList;


public class Departement {
	ArrayList<Section> Section= new ArrayList<Section>();
	String nom;
	
	
	void ajoutSection(Section e){
		Section.add(e);
	}


	public Departement(String nom) {
		super();
		this.nom = nom;
		Section=new ArrayList<Section>();	}
}
