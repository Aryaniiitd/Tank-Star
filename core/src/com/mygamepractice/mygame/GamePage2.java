package com.mygamepractice.mygame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

public class GamePage2 implements Screen {
    MyGdxPracticeGame game;
    private Sprite sprite;
    private SpriteBatch spriteBatch;
    private Skin skin;
    private AssetManager assetManager;
    public Texture texture_img;
    private float time;
    public GamePage2( MyGdxPracticeGame game){
        this.game=game;
        spriteBatch = new SpriteBatch();
        sprite = new Sprite(new Texture(Gdx.files.internal("Main menu/5.png")));
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        ClickDetection clickDetection = new ClickDetection(game);
        Gdx.input.setInputProcessor(clickDetection);
        Gdx.gl.glClearColor(1F,1F,1F,1F);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        spriteBatch.begin();
//        spriteBatch.draw(Assets.sprite_img,50,100);
        sprite.draw(spriteBatch);
        spriteBatch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
class ClickDetection extends GamePage2 implements InputProcessor {

    public ClickDetection(MyGdxPracticeGame game) {
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
        if(button == Input.Buttons.RIGHT){
            game.InGame();
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
