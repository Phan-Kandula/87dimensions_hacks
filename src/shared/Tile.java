package shared;

import javafx.scene.image.ImageView;
import javafx.scene.image.Image;

/**
 * Created by phani on 3/25/2017.
 */
public class Tile {
    boolean walkable;
    Image image;
    Person player;

    /**
     *
     * @param walkable is the tile walkable
     * @param img the tile's picture
     */
    public Tile(Boolean walkable, Image img) {
        this.walkable = walkable;
        this.image = img;
        //player = null;
    }


    public Person getPlayer() {
        return player;
    }


    public void setPlayer(Person player) {
        this.player = player;
    }

    /**
     * get the tile's background image
     * @return
     */
    public Image getImage(){
        return image;
    }

    /**
     * set the tile's background image to the BufferedImage passed in
     * @param newImage
     */
    public void setImage(Image newImage) {
        image = newImage;
    }

    /**
     * returns true if walkable else returns false
     * @return
     */
    public boolean isWalkable() {
        return walkable;
    }

    /**
     * Sets the tile's walkable setting
     * @param walkable
     */
    public void setWalkable(boolean walkable) {
        this.walkable = walkable;
    }

    public String toString(){
        return this.getImage().toString();
    }


}
