package com.example.ldb;

import android.widget.TextView;
import android.view.View;

import legodatabase.LegoPiece;

public class LegoPieceEntry extends Thread{

    private MainActivity activity;

    public LegoPieceEntry(MainActivity activity){
        super("LegoPieceEntry");
        this.activity = activity;
        this.start();
    }

    @Override
    public void run(){
        LegoPiece legoPiece;
        View view;

        try {
            TextView id = activity.findViewById(R.id.id_string);
            TextView type = activity.findViewById(R.id.type_string);
            TextView colour = activity.findViewById(R.id.colour_string);
            TextView size = activity.findViewById(R.id.size_string);
            //TextView length = activity.findViewById(R.id.length_string);
            TextView stock = activity.findViewById(R.id.stock_string);
            TextView used = activity.findViewById(R.id.used_string);


           /* public void increase(View view){
                // Do something in response to button click
            }
            */


            /*
            activity.runOnUiThread(() -> {
                id.setText(legoPiece.getId);
                type.setText(legoPiece.getType);
                colour.setText(legoPiece.getColour);
                size.setText(legoPiece.getSize);
                //length.setText(legoPiece.getLength);
                stock.setText(legoPiece.getStock);
                used.setText(legoPiece.getUsed);
            }
            );
*/
            Thread.sleep(1000);

        }catch(InterruptedException e){
            System.exit(1);
        }
    }
}
