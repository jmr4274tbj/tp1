
public class CV {
	
    String nom;
	String prenom;
	String formation;
	int nbAnneesExperience;
	String competences;
	String attentes4B4;
	
	public CV(String nom, String prenom, String formation, 
		int nbAnneesExperience, String competences, String attentes4B4) {
		this.nom = nom;
		this.prenom = prenom;
		this.formation = formation;
		this.nbAnneesExperience = nbAnneesExperience;
		this.competences = competences;
		this.attentes4B4 = attentes4B4;
	}
	
	public void affiche() {		
		System.out.println("\nNom : " + nom);	
		System.out.println("\nPr�nom : " + prenom);		
		System.out.println("\nFormation(s) : " + formation);		
		System.out.println("\nNombre d'ann�es d'exp�rience" + nbAnneesExperience);		
		System.out.println("\nComp�tences : " + competences);	
		System.out.println("\nAttentes vis � vis le cours 4B4 : " + attentes4B4);	
	}
}
