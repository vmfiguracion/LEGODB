/*
    Class to handle the database
 */
package legodatabase;

import java.util.Scanner;

/**
 * @author amrnosir
 */
public class LegoDatabase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PieceClassifier database = new PieceClassifier();
        LegoPiece newPiece;
        
        System.out.println("Enter a lego piece's information: id, type, colour, width, length, stock, used");
        Scanner in = new Scanner(System.in);
        newPiece = new LegoPiece(in.next(), in.next(), in.next(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());
        database.addPiece(newPiece);
        
        System.out.println("Enter a lego piece's information: id, type, colour, width, length, stock, used");
        in = new Scanner(System.in);
        newPiece = new LegoPiece(in.next(), in.next(), in.next(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());
        database.addPiece(newPiece);
        
        System.out.println("It didn't break woo!");
        
        database.getList();
        
        System.out.println("It didn't break here either double woo!!");
    }
    
}
