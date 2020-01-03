package com.example.myfirstandroidgame;

import android.graphics.Canvas;
import android.graphics.Rect;

public class AnimationManager {
    private Animation[] animations;
    private int animationIndex = 0;

    public AnimationManager(Animation[] animations){
        this.animations = animations;
    }

    public void plaAnim(int index){
        for (int i = 0; i < animations.length; i++){
            if (i == index){
                if (!animations[index].isPLaying()) {
                    animations[i].play();
                }
            }
            else {
                animations[i].stop();
            }
        }
        animationIndex = index;
    }

    public void draw(Canvas canvas, Rect rect){
        if (animations[animationIndex].isPLaying()) {
            animations[animationIndex].draw(canvas, rect);
        }
    }

    public void update(){
        if (animations[animationIndex].isPLaying()) {
            animations[animationIndex].update();
        }

    }

}
