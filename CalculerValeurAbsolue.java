public class CalculerValeurAbsolue {

	public static void main(String [] args){
		
		int valeurSaisie ;

		System.out.print("Saisir une valeur entière : ") ;
		valeurSaisie = Clavier.lireEntier() ;

		if(valeurSaisie < 0){
			int valeurAbsolue ;
			valeurAbsolue = -1 * valeurSaisie ;
		}
		else {
			valeurAbsolue = valeurSaisie ;
		}

		System.out.println("Valeur absolue : " + valeurAbsolue) ;
		
	}

}
