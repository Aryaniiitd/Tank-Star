package com.mygamepractice.mygame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.ScreenUtils;
//import com.mygamepractice.mygame.game.GameScreens;

public class MyGdxPracticeGame extends Game {
	private MainMenu mainMenu;
	private GamePage gameMenu;
	private LoadingPage loadingPage;
	private GamePage2 gameMenu2;
//	private GameScreens gameScreens;
	private PauseMenu pausing;
	private SavedGamePage gamePage;
	private GameOver gameOver;
	private Table table;
	private InGame inGame;

	@Override
	public void create () {
//		Skin skin = new Skin(Gdx.files.internal("uiskin.json"));
//		Stage stage = new Stage();
//		Gdx.input.setInputProcessor(stage);
		Assets assets = new Assets();
		assets.load();
		loadingPage = new LoadingPage(this);
		setScreen(loadingPage);
	}
	public void setMainMenu(){
		mainMenu = new MainMenu(this);
		setScreen(mainMenu);
	}
	public void setGameScreen(){
		gameMenu = new GamePage(this);
		setScreen(gameMenu);
	}
	public void setGamePage2(){
		gameMenu2 = new GamePage2(this);
		setScreen(gameMenu2);
	}
	public void InGame(){
		inGame = new InGame(this);
		setScreen(inGame);
	}
	public void Pausemenu(){
		pausing = new PauseMenu(this);
		setScreen(pausing);
	}
	public void SavedGames(){
		gamePage = new SavedGamePage(this);
		setScreen(gamePage);
	}
	public void gameFinished(){
		gameOver = new GameOver(this);
		setScreen(gameOver);
	}
}
