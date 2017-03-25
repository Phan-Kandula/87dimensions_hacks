package model;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import controller.*;
import shared.Person;
import shared.Tile;
import view.*;

/**
 * Created by phani on 3/25/2017.
 */
public class Model implements InterfaceModel {

    Tile map [][];
    Person team1[];
    Person team2[];
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
