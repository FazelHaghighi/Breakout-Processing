import java.util.ArrayList;

public class Block {

    private int potential;
    private int blockColorR;
    private int blockColorG;
    private int blockColorB;
    public static int blockWidth = 46;
    public static int blockHeight = 20;
    private int blockX;
    private int blockY;

    public Block(int potential, int blockColorR, int blockColorG, int blockColorB, int blockX, int blockY) {
        this.potential = potential;
        this.blockColorR = blockColorR;
        this.blockColorG = blockColorG;
        this.blockColorB = blockColorB;
        this.blockX = blockX;
        this.blockY = blockY;
    }


    public int getPotential() {
        return potential;
    }

    public int getBlockColorR() {
        return blockColorR;
    }

    public int getBlockColorG() {
        return blockColorG;
    }

    public int getBlockColorB() {
        return blockColorB;
    }

    public int getBlockWidth() {
        return blockWidth;
    }

    public int getBlockHeight() {
        return blockHeight;
    }

    public int getBlockX() {
        return blockX;
    }

    public int getBlockY() {
        return blockY;
    }

    public void setBlockColorR(int blockColorR) {
        this.blockColorR = blockColorR;
    }

    public void setBlockColorG(int blockColorG) {
        this.blockColorG = blockColorG;
    }

    public void setBlockColorB(int blockColorB) {
        this.blockColorB = blockColorB;
    }

    public void setBlockX(int blockX) {
        this.blockX = blockX;
    }

    public void setBlockY(int blockY) {
        this.blockY = blockY;
    }

    public void setPotential(int potential) {
        this.potential = potential;
    }
}
