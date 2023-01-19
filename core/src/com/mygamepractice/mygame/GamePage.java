package com.mygamepractice.mygame;

import com.badlogic.gdx.*;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

public class GamePage extends ScreenAdapter {
    MyGdxPracticeGame game;
    private Sprite sprite;
    private SpriteBatch spriteBatch;
    private Skin skin;
    private AssetManager assetManager;
    public Texture texture_img;
    private float time;
    public GamePage( MyGdxPracticeGame game){
        this.game=game;
        spriteBatch = new SpriteBatch();
        sprite = new Sprite(new Texture(Gdx.files.internal("Main menu/4.png")));
    }
    @Override
    public void show(){
//        Gdx.input.setInputProcessor(new InputAdapter(){
//            @Override
//            public boolean keyDown(int keyCode){
//                if(keyCode== Input.Keys.SPACE){
//                    game.setScreen();
//                }
//            }
//        });
    }
    @Override
    public void render(float delta){
//        time+=delta;
//        if(time>2.0){
//            game.setGamePage2();
//        }
        MyInputProcessor inputProcessor = new MyInputProcessor(game);
        Gdx.input.setInputProcessor(inputProcessor);
        Gdx.gl.glClearColor(1F,1F,1F,1F);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        spriteBatch.begin();
//        spriteBatch.draw(Assets.sprite_img2,50,100);
        sprite.draw(spriteBatch);
        spriteBatch.end();
    }
}
class MyInputProcessor extends GamePage implements InputProcessor{
    public MyInputProcessor(MyGdxPracticeGame game) {
        super(game);
    }

    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        if(button == Input.Buttons.LEFT){
            game.setGamePage2();
        }
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(float amountX, float amountY) {
        return false;
    }
}
