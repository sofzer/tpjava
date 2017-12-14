import java.util.ArrayList;


public class Section {
	ArrayList<Etudiant> Etudiant;
	ArrayList<Matiere> Matiere;
	String nom;
	
	
	
	public Section(String nom) {
		super();
		this.nom = nom;
	}

	
	
	void ajoutEtudiant(Etudiant e){
		Etudiant= new ArrayList<Etudiant>();
		Etudiant.add(e);
	}
	void ajoutMatiere(Matiere e){
		Matiere.add(e);
	}
	

}
