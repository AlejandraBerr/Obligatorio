package obligatoriop2;

public class ObligatorioP2 {

    public static void main(String[] args) {
        //Gran Tateti
        char[][][] tableroGrande = new char[9][3][3];
        for (int tableroChico = 0; tableroChico < tableroGrande.length; tableroChico++) {
            for (int fil = 0; fil < tableroGrande[0].length; fil++) {
                for (int col = 0; col < tableroGrande[0][0].length; col++) {
                    tableroGrande[tableroChico][fil][col] = '1';
                }
            }
        }
        for (int tableroChico = 0; tableroChico < tableroGrande.length; tableroChico++) {
            for (int fil = 0; fil < tableroGrande[0].length; fil++) {
                for (int col = 0; col < tableroGrande[0][0].length; col++) {
                    System.out.print(tableroGrande[tableroChico][fil][col]);
                    System.out.print('/');
                }
                System.out.print(ANSI_RED + "+"  + ANSI_RESET);
            }
            System.out.println();
        }
    }    
}
/*
 * Tablero granTateti = new tablero(3, 3);
 * for(granTateti){
 * }
 * 
 * "A2" A = 0 , B = 1, C = 2; 
 * ""
 */

