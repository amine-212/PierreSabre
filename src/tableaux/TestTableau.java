package tableaux;

import java.util.Iterator;

public class TestTableau {
	public static void main(String[] args) {
		int[] tableauEntiers = { 5, 7, 2, 5, 3 };
		String[] tableauChaines = new String[5];
        
        //for (int i = 0; i < tableauEntiers.length; i++) {
        	//int entier =  tableauEntiers[i];
        	//System.out.print(entier);
        	//if (i < tableauEntiers.length - 1) {
        		//System.out.print(", ");
        	//}
      //  }
        
        int nbChaines = 0;
        tableauChaines[nbChaines] = "Hello";
        nbChaines++;
        tableauChaines[nbChaines] = "World";
        nbChaines++;
        tableauChaines[3] = " !";
        
        for (String chaine : tableauChaines) { 
        	if (chaine != null) { 
        		System.out.print(chaine + " "); 
        	} 
        } 
        
        
        
        
        
    }
}



