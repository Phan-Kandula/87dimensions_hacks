package shared;

import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
/**
 * Created by phani on 3/25/2017.
 */
public class Person {
    Image image;
    //Model model;
    int x;
    int y;
    int width = 2;
    int height = 2;
    String name;
    public Person(String name,Image image, int x, int y ) {
        this.name = name;
        this.image = image;
        //this.model = model;
        this.x = x;
        this.y = y;
        //model.setPlayerSpot(y,x);
    }

    /*
    public void moveUp(){
        int x1 = x;
        int y1 = y + 1;
        if(model.inBounds(x1,y1)){
            x = x1;
            y = y1;
            Tile t;
            t = model.getMapVal(y,x);
            //t.setPlayer(this);
        }
    }
    public void moveDown(){
        int x1 = x;
        int y1 = y - 1;
        if(model.inBounds(x1,y1)){
            x = x1;
            y = y1;
            Tile t;
            t = model.getMapVal(y,x);
            //t.setPlayer(this);
            x = x1;
            y = y1;
        }
    }
    public void moveRight(){
        int x1 = x + 1;
        int y1 = y;
        if(model.inBounds(x1,y1)){
            x = x1;
            y = y1;
            Tile t;
            t = model.getMapVal(y,x);
            //t.setPlayer(this);
            x = x1;
            y = y1;
        }
    }
    public void moveLeft(){
        int x1 = x - 1;
        int y1 = y;
        if(model.inBounds(x1,y1)){
            x = x1;
            y = y1;
            Tile t;
            t = model.getMapVal(y,x);
            //t.setPlayer(this);
            x = x1;
            y = y1;
        }
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public int getCol() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getRow() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }
}
