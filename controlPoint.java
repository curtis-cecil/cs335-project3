import javax.swing.*;
import java.awt.*;

public class controlPoint extends JButton {

    //This point's data
    public int xPos;
    public int yPos;
    private int rowID;
    private int colID;

    //Stored Neighbors
    public controlPoint east;
    public controlPoint south;
    public controlPoint southeast;
    public controlPoint west;
    public controlPoint north;
    public controlPoint northwest;

    //Locations of Neighbors
    public int eLocx;
    public int sLocx;
    public int seLocx;
    public int eLocy;
    public int sLocy;
    public int seLocy;

    //Used to color the button and check for collisions with lines
    private boolean isActive = false;

    //Constructor
    public controlPoint(int x, int y){
        xPos = x;
        yPos = y;

        setBounds(xPos, yPos, 10, 10);

        setBackground(Color.black);
    }


    //Getters
    public int getRowID(){
        return rowID;
    }

    public int getColID(){
        return colID;
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos(){
        return yPos;
    }

    public void setRowID(int rowID) {
        this.rowID = rowID;
    }

    public void setColID(int colID){
        this.colID = colID;
    }


    //Setters
    public void setEastNeighbor(controlPoint en){
        east = en;
    }

    public void setSouthNeighbor(controlPoint sn){
        south = sn;
    }

    public void setSouthEastNeighbor(controlPoint sen){
        southeast = sen;
    }

    public void setNorthNeighbor(controlPoint nn){
        north = nn;
    }

    public void setWestNeighbor(controlPoint wn){
        west = wn;
    }

    public void setNorthWestNeighbor(controlPoint nwn){
        northwest = nwn;
    }

    public void setActive(){
        isActive = true;
        setBackground(Color.red);
    }

    public void setInactive(){
        isActive = false;
        setBackground(Color.black);
    }

    public void setLocation(int x, int y){
        xPos = x;
        yPos = y;
    }

    public void relocate(){
        setBounds(xPos, yPos, 10, 10);
    }

    public void setNeighborLocations(){
        eLocx = east.getxPos();
        eLocy = east.getyPos();

        sLocx = south.getxPos();
        sLocy = south.getyPos();

        seLocx = southeast.getxPos();
        seLocy = southeast.getyPos();
    }
}