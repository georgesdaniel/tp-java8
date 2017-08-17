package lambdas;

public class TestClasseAnonyme {

	public static void main (String[] args) {
	// Ecriture Java 7
		Mapper mapper = new Mapper () {
				public Personne map (CompteCourant compte) {
					return new Personne(compte.getSolde());
				}
		};
		
		// Première étape : on supprime le code "administratif" de la méthode
		
		mapper = (CompteCourant t) -> {
			
			return new Personne(t.getSolde());
		};
		
		
		// Seconde étape, je peux supprimer les accolades, ET le return, à droite de la flèche car le corps de la
		// méthode ne contient quune seule ligne de code;
		mapper = (CompteCourant t) -> new Personne(t.getSolde());
		
		// Troisième étape : Je peux retire le type des paramètres dentrée car Java les connais déjà
		
		mapper = t -> new Personne(t.getSolde());
		
		CompteCourant cc = new CompteCourant ();
		cc.setSolde(150.0);
		
		Personne personne = mapper.map(cc);
		System.out.println(personne.getSolde());
	}
	


}
