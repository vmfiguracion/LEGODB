package legodatabase;

import java.util.Scanner;

/**
 * @author Amr Nosir and Valerie Figuracion
 */
public class LegoDatabase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DatabaseAccessor dbAcc = DatabaseAccessor.getInstance();
        PieceHandler pcHandler = new PieceHandler();
        LegoPiece newPiece;
        
        while(true){
            System.out.println("Enter a lego piece's information: id, type, colour, width, length, stock, used");
            System.out.println("(To exit enter: -1)");
            Scanner in = new Scanner(System.in);
            String firstEntry = in.next();
            if(firstEntry.equals("-1")){
                System.out.println("B-Bye!!");
                break;
            }
            newPiece = new LegoPiece(firstEntry, in.next(), in.next(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());
            pcHandler.addPiece(newPiece);

            System.out.println("It didn't break woo!");


            System.out.println("It didn't break here either double woo!!");
        }
    }
    
}
