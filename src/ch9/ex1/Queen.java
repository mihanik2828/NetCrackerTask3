package ch9.ex1;

import java.util.ArrayList;

public class Queen extends ChessPiece{

    public Queen(String coordinates) {
        super(coordinates);
    }

    @Override
    ArrayList<String> canMoveTo() {
        int row = coordinates[0]-96;
        int column =coordinates[1]-48;

        ArrayList<String> moveTo = new ArrayList<String>();

        for(int i=1 ; i<8 ; i++)
        {
            for(int rows=-1;rows<2;rows+=2)
                for(int col=-1;col<2;col+=2)
                    if((row+rows*i>0)&&(row+rows*i<9)&&(column+col*i>0)&&(column+col*i)<9)
                        moveTo.add(""+(char)(row+rows*i+96)+(char)(column+col*i+48));
        }

        for(int i=1;i<9;i++)
            if(row!=i)
                moveTo.add(""+(char)(i+96)+(char)(column+48));

        for(int i=1;i<9;i++)
            if(column!=i)
                moveTo.add(""+(char)(row+96)+(char)(i+48));

        return moveTo;
    }
}
