package model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import shared.Person;
import shared.Player;
import shared.Tile;
import view.*;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import controller.*;

import javax.imageio.ImageIO;

import static jdk.nashorn.internal.codegen.OptimisticTypesPersistence.load;

/**
 * Created by phani on 3/25/2017.
 */
public class Model implements InterfaceModel {


    Tile map [][];
    Person team1[];
    Person team2[];
    Image image;
    ArrayList<Image> spriteData;


    public Model(Controller controller, File f) {

        //this.controller = controller;
        load(f);
        spriteData = new ArrayList<Image>();
        Image image = null;
        try {
            //String playerImage = Driver.spritePath + "player.png";
            //image = ImageIO.read(new File(playerImage));
            //System.out.println(playerImage);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.exit(0);
        }
        player = new Player("test", image, 16, 16, this, new Pokemon[6]);
        spriteData.add(player);
        setPlayerSpot(player.getY(),player.getX());
    }

    public void loadMap(File f){
        /*load(f);
        try {
            for (int i = 0; i <  ; i++) {

            }
        }*/

        int i = 0;
        int j = 0;
        try {
            Scanner in = new Scanner(f);
//            String ls = System.getProperty("line.separator");
//            String lines = "";
            int xsize = in.nextInt();
            int ysize = in.nextInt();
            System.out.println(xsize + ", " + ysize);
            map = new Tile[ysize][xsize];
            while (in.hasNext()) {
//            	System.out.println(i + ", " + j);
                String imageName = in.next();
                String walkable = in.next();
                imageName = imageName.substring(1);
                walkable = walkable.substring(0,walkable.length()-1);
                //File f1 = new File();
                //Image image = ImageIO.read(f1);
                Tile tile;
                if(walkable.equals("true")){
                    tile = new Tile(true,image);
                }else{
                    tile = new Tile(false,image);
                }
                map[j][i] = tile;
                i++;
                if (i >= xsize){
                    i =0;
                    j++;
                }
                if(j >= ysize){
                    break;
                }
                // map[j][i] = tile;
            }
            in.close();
        }catch (Exception e){
            System.out.println(e.toString() + f.toString());
        }
    }

    @Override
    public Tile[][] getTileData() {
        return new Tile[0][];
    }

    @Override
    public Person[] getTeam1() {
        return team1;
    }

    @Override
    public Person[] getTeam2() {
        return team2;
    }


    public Boolean inBounds(int x, int y){
        System.out.println("(" + y + ", " + x + ")");
        if (x >= 0 && x < map[0].length-1 && y >= 0 && y < map.length-1){
            if (map[y][x].isWalkable()){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}
