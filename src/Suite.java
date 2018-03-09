import java.util.Scanner;

class Suite {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        int debut;
        do {
            System.out.print("de (>= 1) ? ");
            debut = clavier.nextInt();
        } while (debut < 1);

        int fin;
        do {
            System.out.print("a (>= " + debut + ") ? ");
            fin = clavier.nextInt();
        } while (fin < debut);

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        
        int k = 0;
        int deb = debut;
        
        if (debut == fin) {
        	do {
        		
        		if (debut % 3 == 0) {
            		debut += 4;
            		k++;
            	} else {
            		if (debut % 4 == 0) {
            			debut = debut/2;
            			k++;
            		} else {
            			debut--;
            			k++;
            		}
            	}
        		
        	} while (debut != 0);
        	System.out.println(deb + " -> " + k);
        	
        } else if (debut < fin) {
        	
        	while (debut <= fin) {
        		
        		do {
            		
            		if (deb % 3 == 0) {
            			deb += 4;
                		k++;
                	} else {
                		if (deb % 4 == 0) {
                			deb = deb/2;
                			k++;
                		} else {
                			deb--;
                			k++;
                		}
                	}
            		
            	} while (deb != 0);
        		System.out.println(debut + " -> " + k);
        		
        		debut++;
        		deb = debut;
        		k = 0;
        	}
        }
        
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        clavier.close();
    }
}