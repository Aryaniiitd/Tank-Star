package com.mygamepractice.mygame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Assets {
    public static Texture texture_img1;
    public static Texture texture_img2;
    public static Texture texture_img3;
    public static Texture texture_img4;
    public static Sprite sprite_img;
    public static Sprite sprite_img2;
    public static Sprite sprite_red;
    public static Sprite sprite_blue;
    private static TextureRegion region;
    public static void load(){
        texture_img1 = new Texture(Gdx.files.internal("Main menu/3.png"));
        texture_img3 = new Texture(Gdx.files.internal("Main menu/4.png"));
//        region = new TextureRegion(texture_img,50,50,100,100);
        texture_img1.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        texture_img3.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        sprite_img = new Sprite(texture_img1);
        sprite_img2 = new Sprite(texture_img3);
//        sprite_img.flip(false,true);
        texture_img2 = new Texture(Gdx.files.internal("Main menu/spritesheet.png"));
        sprite_red = new Sprite(texture_img2,0,0,16,16);
        sprite_blue = new Sprite(texture_img2,16,0,16,16);
    }
}
