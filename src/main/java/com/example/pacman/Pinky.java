package com.example.pacman;

import javafx.scene.paint.Color;

public class Pinky extends Spokelse{
    public Pinky(double x, double y){
        super(x,y);
        boks = lagBoks(x,y);
        posisjon.setFill(Color.PINK);
        retning = "Nord";
        poly.setFill(Color.PINK);
    }

    public String logikk(String gammelRetning){
        String nyRetning = "";
        int random = trekkTall(1,3);
        switch (gammelRetning){
            case "Nord": switch (random){
                case 1: nyRetning = "Øst"; ;break;
                case 2: nyRetning = "Vest"; break;
                case 3: nyRetning = "Nord"; break;
            } break;
            case "Sør": switch (random){
                case 1: nyRetning = "Sør"; break;
                case 2: nyRetning = "Øst"; break;
                case 3: nyRetning = "Vest"; break;
            } break;
            case "Øst": switch (random){
                case 1: nyRetning = "Sør"; break;
                case 2: nyRetning = "Øst"; break;
                case 3: nyRetning = "Nord"; break;
            } break;
            case "Vest": switch (random){
                case 1: nyRetning = "Sør"; break;
                case 2: nyRetning = "Vest"; break;
                case 3: nyRetning = "Nord"; break;
            }

                return nyRetning;
        }

        return nyRetning;
    }

    public void utenforSjekk(){
        if (Spill.utenforHøyre.contains(boks) ){
            posisjon.setCenterX(-10);
            poly.setLayoutX(-290);
        }
        if (Spill.utenforVenstre.contains(boks) ){
            posisjon.setCenterX(580);
            poly.setLayoutX(300);
        }
    }
    public void nullStill(){
        Spill.blinky.posisjon.setFill(Color.RED);
        Spill.blinky.poly.setFill(Color.RED);
        Spill.blinky.erSkremt = false;
    }
}
