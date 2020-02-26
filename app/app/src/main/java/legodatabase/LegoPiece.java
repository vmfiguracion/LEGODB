package legodatabase;

/*
    Class to define and perform basic tasks for each piece
 */
public class LegoPiece {
    private String id;          //Unique piece ID
    private String type;        //Type of piece, rectangle, semi circle, stud, etc.
    private String colour;      //Colour...
    private int width;          //Piece width in studs
    private int length;         //Piece length in studs
    private int stock;          //Total number of piece in stock
    private int used;           //Number of the pieces already in use
    private int remaining;      //Number of pieces readily available
    
    public LegoPiece(String id, String type, String colour, int width, int length, int stock, int used)
    {
        this.id = id;
        this.type = type;
        this.colour = colour;
        this.width = width;
        this.length = length;
        this.stock = stock;
        this.used = used;
        this.remaining = stock - used;
    }
    
    public LegoPiece(String id, String type, String colour, int width, int length)
    {
        this.id = id;
        this.type = type;
        this.colour = colour;
        this.width = width;
        this.length = length;
        this.stock = 0;
        this.used = 0;
        this.remaining = stock - used;
    }
    
    //Standard get methods
    public String getId(){return this.id;}
    public String getType(){return this.type;}
    public String getColour(){return this.colour;}
    public int getWidth(){return this.width;}
    public int getLength(){return this.length;}
    public int getStock(){return this.stock;}
    public int getUsed(){return this.used;}
    public int getRemaining(){return this.remaining;}
    //A method to get size as a string
    public String getSize()
    {
        String size = this.width + "x" + this.length; 
        return size;
    }
    
    //Standard set methods. For fixing errors and blah blah
    public void setId(String id){this.id = id;}
    public void setType(String type){this.type = type;}
    public void setColour(String colour){this.colour = colour;}
    public void setWidth(int width){this.width = width;}
    public void setLength(int length){this.length = length;}
    
    /*
        Methods needed for stock management
        Always update remaining.
        Methods include incremental editing and outright setting of stock and used
    */ 
    
    /*
    Updates no. of remaining pieces
    Always called after changes to stock/used
    */
    private void updateRem()
    {
        this.remaining = this.stock - this.used;
    }
    
    //The two set methods
    public void setStock(int stock)
    {
        this.stock = stock;
        this.updateRem();
    }
    
    public void setUsed(int used)
    {
        this.used = used;
        this.updateRem();
    }
    
    //Incremental methods for stock
    public void reduceStockBy(int dec)
    {
        this.stock = this.stock - dec;
        this.updateRem();
    }
    
    public void increaseStockBy(int inc)
    {
        this.stock = this.stock + inc;
        this.updateRem();
    }
    
    //Incremental methods for used
    public void reduceUsedBy(int dec)
    {
        this.used = this.used - dec;
        this.updateRem();
    }
    
    public void increaseUsedBy(int inc)
    {
        this.used = this.used + inc;
        this.updateRem();
    }
    
    /*
        Creates a string that can be used to title entries
    */
    @Override
    public String toString()
    {
        String name = this.width + "x" + this.length + " " + this.type + " - " + this.colour;
      
        return name;
    }
    
    /*
        Something to attach a picture here
    */
    
}
