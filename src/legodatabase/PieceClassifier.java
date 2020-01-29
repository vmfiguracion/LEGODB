/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package legodatabase;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.ArrayList;

/**
 * Classifies pieces based on type, colour, size, and id
 * Used to search and access the pieces
 * Uses one unique id-to-piece map and three property-to-pieces map
 * @author amrnosir
 */
public class PieceClassifier {
    
    //The three 1:n Maps
    private TreeMap<String, ArrayList> typeList;    // <"type", list of pieces with "type">
    private TreeMap<String, ArrayList> colourList;  // <"colour", list of pieces with "colour">
    private TreeMap<String, ArrayList> sizeList;    // <"size", list of pieces with "size">
    
    //The 1:1 Map
    private TreeMap<String, LegoPiece> pieceList;   // <"id", Associated piece>
    
    
    //Initialize the collections
    //Creates empty maps
    public PieceClassifier()
    {
        typeList = new TreeMap<>();
        colourList = new TreeMap<>();
        sizeList = new TreeMap<>();
        pieceList = new TreeMap<>();
    }
    
    //Method that adds pieces to the classifier
    //Checks for keys 
    //Returns false if piece already exists. true if successful
    public Boolean addPiece(LegoPiece piece)
    {
        if(pieceList.containsKey(piece.getId()))
        {
            System.out.println("Piece ID is already in use");
            return false;
        }
        else
        {
            // Add the piece to the unique map
            pieceList.put(piece.getId(), piece);
            
            //Add the piece to each category using their methods
            this.addToType(piece.getType(), piece);
            this.addToColour(piece.getColour(), piece);
            this.addToSize(piece.getSize(), piece);
            return true;
        }
       
    }
    
    /*
        Next three methods add the piece to appropriate property
        Each checks if a list for the property exists
        Yes: add to the list
        No : create a new list then add
    */
    private void addToType(String type, LegoPiece piece)
    {
        if(typeList.containsKey(type))
        {
            typeList.get(type).add(piece);
        }
        else
        {
            typeList.put(type, new ArrayList<LegoPiece>());
            typeList.get(type).add(piece);
        }
    }
    
    private void addToColour(String colour, LegoPiece piece)
    {
        if(typeList.containsKey(colour))
        {
            typeList.get(colour).add(piece);
        }
        else
        {
            typeList.put(colour, new ArrayList<LegoPiece>());
            typeList.get(colour).add(piece);
        }
    }
    
    private void addToSize(String size, LegoPiece piece)
    {
        if(typeList.containsKey(size))
        {
            typeList.get(size).add(piece);
        }
        else
        {
            typeList.put(size, new ArrayList<LegoPiece>());
            typeList.get(size).add(piece);
        }
    }
    
    public void getList()
    {
        for(Map.Entry<String, LegoPiece> entry: this.pieceList.entrySet())
        {
            String line = entry.getKey() + ": " +  entry.getValue().toString();
            System.out.println(line);        
        }
    }
    
    /*
        Something for editing a piece and retrieving lists
    */
}
