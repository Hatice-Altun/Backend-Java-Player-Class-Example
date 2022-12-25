package com.altun.Java;

public class Main {

    public static void main(String[] args) {
        // Player class example
    }
        public class Player {

            private String name;
            private char token;
            private int score;

            // constructor
            public Player(String name, char token) {
                this.name = name;
                this.token = token;
            }

            // method
            public char getToken() {
                return token;
            }
            public String getName() {
                return name;
            }
            public int getScore() {
                return score;
            }
            public void addScore() {
                score++;
            }
            // With this method, the player's score can get a new value throughout the application:
            // public void setScore(int Score) {
            // this.score = score; //or this.score += score; to change the
            // }

            // When the player's score is changed but always gets higher you can choose: this.score += score;
        }
    }
