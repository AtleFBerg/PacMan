package com.example.pacman;

import javafx.scene.paint.Color;

public class Inky extends Spokelse{
        public Inky(double x, double y){
            super(x,y);
            boks = lagBoks(x,y);
            posisjon.setFill(Color.CYAN);
            retning = "Nord";
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


}

