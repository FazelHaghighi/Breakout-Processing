import processing.core.PApplet;

public class Paddle {

    private float x;
    private float y = 600;
    private float paddleWidth;
    private static float paddleHeight = 20;


    public void movePaddle(){
        x = MainClass.processing.mouseX - paddleWidth/2;
    }
    public void showPaddle(){
        MainClass.processing.fill(33,146,196);
        MainClass.processing.rect(x,y,paddleWidth,paddleHeight);
    }

    public Paddle(float paddleWidth) {
        this.paddleWidth = paddleWidth;
    }

    public void setPaddleWidth(float paddleWidth) {
        this.paddleWidth = paddleWidth;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getPaddleWidth() {
        return paddleWidth;
    }
}
