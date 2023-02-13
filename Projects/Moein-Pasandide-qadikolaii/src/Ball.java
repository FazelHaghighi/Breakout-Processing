import com.sun.tools.javac.Main;

import java.awt.*;

public class Ball {

    private float speedX;
    private float speedY;
    private float colorR;
    private float colorG;
    private float colorB;
    private float ballX;
    private float ballY;
    private float ballExtent = 80;

    public Ball(float speedX, float speedY, float colorR, float colorG, float colorB, float ballX, float ballY , float ballExtent) {
        this.speedX = speedX;
        this.speedY = speedY;
        this.colorR = colorR;
        this.colorG = colorG;
        this.colorB = colorB;
        this.ballX = ballX;
        this.ballY = ballY;
        this.ballExtent = ballExtent;
    }

    public void changeBall(){
        MainClass.processing.noStroke();
        if(ballX >= 400 - ballExtent/2){
//            ballX -= speedX;
            speedX *= -1;
        }
        if (ballX <= ballExtent/2) {
            speedX *= -1;
        }

        if(ballY <= ballExtent/2){
            speedY *= -1;
        }
        if( ballY + ballExtent/2 >= 630  ){

//            MainClass.gameOver();
            MainClass.letMenoGo = 3;

        }
        ballX = ballX + speedX;
        ballY = ballY + speedY;


//        if(ballX + ballExtent/2 >= 400){

//        }
    }
    public void showBall(){
        MainClass.processing.fill(colorR,colorG,colorB);
        MainClass.processing.circle(ballX , ballY, ballExtent );
    }

    public float getSpeedX() {
        return speedX;
    }

    public float getSpeedY() {
        return speedY;
    }

    public float getColorR() {
        return colorR;
    }

    public float getColorG() {
        return colorG;
    }

    public float getColorB() {
        return colorB;
    }

    public float getBallX() {
        return ballX;
    }

    public float getBallY() {
        return ballY;
    }

    public float getBallExtent() {
        return ballExtent;
    }

    public void setSpeedX(float speedX) {
        this.speedX = speedX;
    }

    public void setSpeedY(float speedY) {
        this.speedY = speedY;
    }

    public void setColorR(float colorR) {
        this.colorR = colorR;
    }

    public void setColorG(float colorG) {
        this.colorG = colorG;
    }

    public void setColorB(float colorB) {
        this.colorB = colorB;
    }

    public void setBallX(float ballX) {
        this.ballX = ballX;
    }

    public void setBallY(float ballY) {
        this.ballY = ballY;
    }

    public void setBallExtent(float ballExtent) {
        this.ballExtent = ballExtent;
    }


}
