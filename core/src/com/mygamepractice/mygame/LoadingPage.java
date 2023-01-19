package com.mygamepractice.mygame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ProgressBar;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

import java.text.Format;

public class LoadingPage implements Screen {
    MyGdxPracticeGame game;
    private Sprite sprite;
    private SpriteBatch spriteBatch;
    private Skin skin;
    private AssetManager assetManager;
    public Texture texture_img;
    private static Stage stage;
    private float time;

    public LoadingPage(MyGdxPracticeGame game){
        this.game = game;
        spriteBatch = new SpriteBatch();
        sprite = new Sprite(new Texture(Gdx.files.internal("Main menu/2.png")));
        Pixmap pixmap = new Pixmap(0,20, Pixmap.Format.RGB888);
        TextureRegionDrawable textureRegionDrawable = new TextureRegionDrawable(new Texture(pixmap));
        ProgressBar.ProgressBarStyle progressBarStyle = new ProgressBar.ProgressBarStyle();
        progressBarStyle.knob = textureRegionDrawable;

        stage = new Stage();
        ProgressBar bar = new ProgressBar(0.1f,1.0f,0.01f,false,progressBarStyle);
        bar.setValue(1.0f);
        bar.setAnimateDuration(1.0f);
        bar.setBounds(10,10,100,20);
        stage.addActor(bar);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        time+=delta;
        if(time > 3.0){
            game.setMainMenu();
        }
        Gdx.gl.glClearColor(1F,1F,1F,1F);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        spriteBatch.begin();
//        spriteBatch.draw(Assets.sprite_img,50,100);
        sprite.draw(spriteBatch);
        spriteBatch.end();
        stage.draw();
        stage.act();
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

