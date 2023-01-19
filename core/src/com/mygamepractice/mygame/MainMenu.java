package com.mygamepractice.mygame;

import com.badlogic.gdx.*;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.SerializationException;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import jdk.tools.jmod.Main;

import javax.swing.text.AsyncBoxView;

public class MainMenu extends ScreenAdapter implements Screen {
    private MyGdxPracticeGame game;
    private Stage stage;
    private Viewport viewport;
    private Skin skin;
    private AssetManager assetManager;
    private Sprite sprite;
    private SpriteBatch spriteBatch;
    private Table table;
    private TextButton button;
    private OrthographicCamera Camera;
    private static TextButton startButton;
    private static TextButton QuitButton;
    public MainMenu(final MyGdxPracticeGame game)  {
        viewport = new ScreenViewport();
        this.assetManager = assetManager;
        this.game=game;
        stage = new Stage(new ScreenViewport());
        Gdx.input.setInputProcessor(stage);
        Camera = new OrthographicCamera();
        Camera.setToOrtho(true,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
//        Camera.update();
        skin = new Skin(Gdx.files.internal("uiskin.json"));
        table = new Table();
        table.setWidth(stage.getWidth());
        table.align(Align.center);
//        table.right().center();
        table.setPosition(0,Gdx.graphics.getHeight());
        TextButton startButton = new TextButton("Start 1v1",skin);
        startButton.setScale(2.5f);
        startButton.setColor(Color.valueOf("#ff5349"));
//        startButton.setWidth(Gdx.graphics.getWidth()/2);
        TextButton SavedGames = new TextButton("Saved Games",skin);
        SavedGames.setColor(Color.valueOf("#ff5349"));
        SavedGames.setScale(2.5f);
        TextButton settings = new TextButton("Settings",skin);
        settings.setColor(Color.valueOf("#ff5349"));
        settings.setScale(2.5f);
        TextButton quitGame = new TextButton("Quit Game",skin);
        quitGame.setColor(Color.valueOf("#ff5349"));
        quitGame.setScale(2.5f);
        startButton.addListener(new ClickListener(){
            public void clicked(InputEvent e,float x,float y){
                game.setGameScreen();
            }
        });
//        QuitButton.setColor(200,300,500,800);

        table.padTop(1000);
        table.padLeft(1300);
        table.add(startButton).width(200).height(60);
        table.row();
        table.add(SavedGames).padTop(60).width(200).height(60);
        table.row();
        table.add(settings).padTop(60).width(200).height(60);
        table.row();
        table.add(quitGame).padTop(60).width(200).height(60);
        stage.addActor(table);
//        table.right();
        spriteBatch = new SpriteBatch();
        sprite = new Sprite(new Texture(Gdx.files.internal("Main menu/3.png")));
        sprite.setSize(Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
//        stage.addActor(startButton);
//        skin = assetManager.get(Assets.SKIN);
    }
    @Override
    public void show(){
        Gdx.app.log("Main screen","Show");
//        startButton.addListener(new ClickListener(){
//            @Override
//            public void clicked(InputEvent event,float x,float y){
//                startButton.addAction(Actions.sequence(Actions.scaleBy(0.2f,0.2f,2),Actions.scaleTo(1f,1f,2), Actions.run(new Runnable() {
//                    @Override
//                    public void run() {
//                        game.setGameScreen();
//                    }
//                })));
//                super.clicked(event,x,y);
//            }
//        });
    }
    public void render(float delta){
        Gdx.gl.glClearColor(1F,1F,1F,1F);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        Camera.update();
//        spriteBatch.setTransformMatrix(Camera.combined);
//        spriteBatch.setProjectionMatrix(Camera.combined);
        spriteBatch.begin();
        spriteBatch.draw(Assets.sprite_img,50,100);
//        stage.act();
        spriteBatch.draw(Assets.sprite_red,50,20);
        spriteBatch.draw(Assets.sprite_blue,100,10);
        sprite.draw(spriteBatch);
        spriteBatch.end();
        Camera.update();
        stage.act();
//        stage.getViewport().update(Gdx.graphics.getWidth(), Gdx.graphics.getHeight(),true);
        stage.draw();
    }
//    private TextButton addButton(String name){
//        TextButton button = new TextButton(name,skin);
//        mainTable.add(button);
//        return button;
//    }
    public void resize(int w,int h){

//        stage.getViewport().update(viewport.getScreenWidth(), viewport.getScreenHeight(),true);
//        viewport.update(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
//        super.resize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
//        Camera.setToOrtho(false,Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
    }
}
