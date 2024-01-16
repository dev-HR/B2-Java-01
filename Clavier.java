import java.io.* ;

/** Accès au clavier
 * @author B2
 * @version 0.1
 * @since Janvier 2018
 */
public class Clavier {

	/** Retourner la chaîne de caractère saisie par l'utilisateur
	* @return Chaîne de caractères saisie
	*/
	public static String lireChaine(){
		String ligne = null ;
		try {
			InputStreamReader lecteur = new InputStreamReader(System.in) ;
			BufferedReader entree = new BufferedReader(lecteur) ;
			ligne = entree.readLine() ;
		}
		catch(IOException e){
			ligne = "" ;
		}

		return ligne ;
	}
	
	/** Retourner le nombre entier saisi par l'utilisateur
	* @return Nombre entier saisi
	*/
	public static int lireEntier(){
		int nombreEntier ;
		try {
			String chaine = lireChaine() ;
			 nombreEntier = Integer.parseInt(chaine) ;
		}
		catch(NumberFormatException e){
			nombreEntier = 0 ;
		}
		return nombreEntier ;
	}
	
	/** Retourner le nombre réel saisi par l'utilisateur
	* @return Nombre réel saisi
	*/
	public static double lireReel(){
		double nombreReel ;
		try {
			String chaine = lireChaine() ;
			nombreReel = Double.parseDouble(chaine) ;
		}
		catch(NumberFormatException e){
			nombreReel = 0.0 ;
		}
		return nombreReel ;
	}
}
