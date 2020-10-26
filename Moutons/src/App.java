
import donnee.MoutonDAO;
import modele.Mouton;
import vue.Fenetre;

public class App {

	public static void main(String[] parametres) {
		
		/*MoutonDAO dao = new MoutonDAO();
		Mouton mouton = new Mouton();
		mouton.setNom("osekour");
		mouton.setCouleur("terre");
		mouton.setPoids(1010);
		dao.ajouterMouton(mouton);*/
		
		Fenetre.launch(Fenetre.class, parametres);	
	}

}
