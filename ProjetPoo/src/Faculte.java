import java.util.ArrayList;
import java.util.Scanner;


public class Faculte {
	ArrayList<Departement> Departement=new ArrayList<Departement>();
	void menu(){
		System.out.println("****************************************************************");
		System.out.println("***Pour ajouter    un departement            tapez 1:      *****");
		System.out.println("***Pour ajouter    une section               tapez 2:      *****");
		System.out.println("***Pour ajouter    un etudiant               tapez 3:      *****");
		System.out.println("***Pour afficher la liste des departements   tapez 4:      *****");
		System.out.println("***Pour afficher la liste des etudiants      tapez 5:      *****");
		System.out.println("***Pour afficher la liste des sections       tapez 6:      *****");
		System.out.println("***Pour supprimer    un departement          tapez 1:      *****");
		System.out.println("***Pour supprimer    une section             tapez 2:      *****");
		System.out.println("***Pour supprimer    un etudiant             tapez 3:      *****");
		System.out.println("***                      QUITTER                           *****");

		System.out.println("****************************************************************");
		Scanner sc=new Scanner(System.in); int choix=sc.nextInt();
		switch(choix){
		case 1:		ajoutDepartement(); menu(); break;
		case 2:		ajoutSection(); menu();break;
		case 3:		ajoutEtudiant(); menu();break;
		case 4:		affichageDepartement(); menu();break;
		case 6:		affichageSection(); menu();break;
		case 5:		affichageEtudiant(); menu();break;	
		case 7:		return;

		}
	}
	void ajoutDepartement(){		
		System.out.println("Indiquer le nom du departement à ajouter...: ");
		Scanner sc=new Scanner(System.in);
		Departement.add(new Departement(sc.nextLine()));
	}
	
	void ajoutSection(){
		System.out.println("Indiquer dans quel departement vous voulez ajouter cette section...: ");
		Scanner sc=new Scanner(System.in); 	String nom=sc.nextLine();

		for(int i=0 ; i<Departement.size();i++){
			if(Departement.get(i).nom.equals(nom)){
				System.out.println("Indiquer le nom du section à ajouter...: ");
				sc=new Scanner(System.in); String noms=sc.nextLine();
				Departement.get(i).ajoutSection(new Section(noms));
				return;
			}
		}
		System.out.println("Ce departement n'existe pas voulez vous l'ajouter...: ");
		System.out.println("1: oui \n2:Non (quitter) ");
		sc=new Scanner(System.in);
		if(sc.nextInt()==1){ 
			Departement.add(new Departement(nom));
			}else return;
		
			
	}
	
	void ajoutEtudiant(){
		System.out.println("Indiquer dans quel departement vous voulez ajouter cet etudiant...: ");
		Scanner sc=new Scanner(System.in);  String nom=sc.nextLine();
		for(int i=0 ; i<Departement.size();i++){
			if(Departement.get(i).nom.equals(nom)){				
				System.out.println("Indiquer dans quel section vous voulez ajouter cet etudiant...: : ");
				sc=new Scanner(System.in); String noms=sc.nextLine();
				for(int j=0 ; j<Departement.get(i).Section.size();j++){
					if(Departement.get(i).Section.get(j).nom.equals(noms)){
						System.out.println("Donnez son nom...: : "); String nome=sc.nextLine();						
						System.out.println("Donnez son prenom...: : "); String prenom=sc.nextLine();
						Departement.get(i).Section.get(j).ajoutEtudiant(new Etudiant(prenom,nome));
						return;
					}
				System.out.println("Cette section n'existe pas voulez vous l'ajouter...: ");
				System.out.println("1: oui \n2:Non (quitter) ");
				sc=new Scanner(System.in);
				if(sc.nextInt()==1){
					Departement.get(i).ajoutSection(new Section(noms));
					System.out.println("Donnez son nom...: : "); String nome=sc.nextLine();						
					System.out.println("Donnez son prenom...: : "); String prenom=sc.nextLine();
					Departement.get(i).Section.get(j).ajoutEtudiant(new Etudiant(prenom,nome));
					return;
					}else return;
				
			}
				
			}
		}
		System.out.println("Ce departement n'existe pas voulez vous l'ajouter...: ");
		System.out.println("1: oui \n2:Non (quitter) ");
		sc=new Scanner(System.in);
		if(sc.nextInt()==1){
			Departement.add(new Departement(nom));
		}else return;
		
	
}
	
	
	void affichageSection(){
		System.out.println("Liste des sections: ");
		for(int i=0 ; i<Departement.size();i++){ 				

			for(int j=0 ; j<Departement.get(i).Section.size();j++){
				System.out.println(Departement.get(i).Section.get(j).nom);
			}
		}
	}
	
	void affichageDepartement(){
		System.out.println("Liste des departements: ");
		for(int i=0 ; i<Departement.size();i++){
			System.out.println(Departement.get(i).nom);			
		}
	}

	public void affichageEtudiant() {
		System.out.println("Liste des sections: ");
		for(int i=0 ; i<Departement.size();i++){ 				

			for(int j=0 ; j<Departement.get(i).Section.size();j++){
				for(int k=0 ; k<Departement.get(i).Section.get(j).Etudiant.size();k++){

				System.out.println("Nom: "+Departement.get(i).Section.get(j).Etudiant.get(k).nom+"    Prenom: "+Departement.get(i).Section.get(j).Etudiant.get(k).prenom);
			}
		}
	}
	
}
	
	
}
