
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
	
	public static void main(String[] args) {		
		System.out.println("Bienvenue chez Barette!");
		
		CV cv1 = new CV("Taleb", "Rayane", "Informatique, plus particulièrement en programmation", 
				2, "Java", "Que le cours soit intéréssant.");
		cv1.affiche();
		
		CV cv2 = new CV("Martel-Raiche", "Jonathan", "Informatique, principalement programmation", 
				2, "Java, Javascript Jquery, html, css, C#", "Que les travaux soient surtout fait en classe.");
		cv2.affiche();	
	}
	
	public void affiche() {		
		System.out.println("\nNom : " + nom);	
		System.out.println("\nPrénom : " + prenom);		
		System.out.println("\nFormation(s) : " + formation);		
		System.out.println("\nNombre d'années d'expérience" + nbAnneesExperience);		
		System.out.println("\nCompétences : " + competences);	
		System.out.println("\nAttentes vis à vis le cours 4B4 : " + attentes4B4);	
	}
}
