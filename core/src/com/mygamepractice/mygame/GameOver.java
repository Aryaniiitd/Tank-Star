package com.mygamepractice.mygame;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

public class GameOver implements Screen {
    MyGdxPracticeGame game;
    private Sprite sprite;
    private SpriteBatch spriteBatch;
    private Skin skin;
    private AssetManager assetManager;
    public Texture texture_img;
    private static Stage stage;

    public GameOver(MyGdxPracticeGame game){
        this.game = game;
        spriteBatch = new SpriteBatch();
        sprite = new Sprite(new Texture(Gdx.files.internal("Main menu/10.png")));
    }
    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
//        ClickDetection4 inputProcessor = new ClickDetection4(game);
//        Gdx.input.setInputProcessor(inputProcessor);
        Gdx.gl.glClearColor(1F,1F,1F,1F);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        spriteBatch.begin();
//        spriteBatch.draw(Assets.sprite_img2,50,100);
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