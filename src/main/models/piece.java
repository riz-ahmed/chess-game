package main.models;

import java.util.Arrays;

/**
 * piece
 */
public class piece {
    public enum Color {BLACK, WHITE}
    private int[] position; 
    private Color color;
    private boolean state;

    
    public piece(int[] position, Color color, boolean state) {
        this.position = position;
        this.color = color;
        this.state = state;
    }

    public piece(piece source) {
        this.position = source.position;
        this.color = source.color;
        this.state = source.state;
    }


    public int[] getPosition() {
        return this.position;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isState() {
        return this.state;
    }

    public boolean getState() {
        return this.state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public void setPieceCaptured(){
        this.state = true;
    }

    public void resetPieceState(){
        this.state = false;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.getPosition()) +
                this.getColor() + 
                this.getState();
    }

}