package openclasseroomtablo;

public class tablo {

	
		public static void main(String[] args)
		  {
		    String[] tab = {"toto", "tata", "titi", "tete"};
		    parcourirTableau(tab);
		    System.out.println(toString(tab));   
		  }

		  static void parcourirTableau(String[] tab)
		  {
		    for(String str : tab)
		    System.out.println(str);
		  }
		           
		  static String toString(String[] tab)
		  {
		    System.out.println("M�thode toString() !\n----------");
		    String retour = " ";
		                   
		    for(String str : tab)
		      retour += str + "\n"; 
		                   
		    return retour;
		  }         


}
