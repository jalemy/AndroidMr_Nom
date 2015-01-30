package com.androidgames.vivitrat;

import com.androidgames.framework.Game;
import com.androidgames.framework.Graphics;
import com.androidgames.framework.Graphics.PixmapFormat;
import com.androidgames.framework.Screen;

public class LoadingScreen extends Screen {
	public LoadingScreen(Game game) {
		super(game);
	}
	
	@Override
	public void update(float deltaTime) {
		Graphics g = game.getGraphics();
		Assets.background = g.newPixmap("background.png", PixmapFormat.RGB565);
		Assets.logo = g.newPixmap("logo.png", PixmapFormat.ARGB4444);
		Assets.mainMenu = g.newPixmap("mainmenu.png", PixmapFormat.ARGB4444);
		Assets.buttons = g.newPixmap("buttons.png", PixmapFormat.ARGB4444);
		Assets.help1 = g.newPixmap("help1.png", PixmapFormat.ARGB4444);
		Assets.help2 = g.newPixmap("help2.png", PixmapFormat.ARGB4444);
		Assets.help3 = g.newPixmap("help3.png", PixmapFormat.ARGB4444);
		Assets.numbers = g.newPixmap("numbers.png", PixmapFormat.ARGB4444);
		Assets.ready = g.newPixmap("ready.png", PixmapFormat.ARGB4444);
		Assets.pause = g.newPixmap("pausemenu.png", PixmapFormat.ARGB4444);
		Assets.gameOver = g.newPixmap("gameover.png", PixmapFormat.ARGB4444);
		Assets.headUp = g.newPixmap("headup.png", PixmapFormat.ARGB4444);
		Assets.headLeft = g.newPixmap("headleft.png", PixmapFormat.ARGB4444);
		Assets.headDown = g.newPixmap("headdown.png", PixmapFormat.ARGB4444);
		Assets.headRight = g.newPixmap("headright.png", PixmapFormat.ARGB4444);
		Assets.tailUp = g.newPixmap("tailup.png", PixmapFormat.ARGB4444);
		Assets.tailLeft = g.newPixmap("tailleft.png", PixmapFormat.ARGB4444);
		Assets.tailDown = g.newPixmap("taildown.png", PixmapFormat.ARGB4444);
		Assets.tailRight = g.newPixmap("tailright.png", PixmapFormat.ARGB4444);
		Assets.food1 = g.newPixmap("food1.png", PixmapFormat.ARGB4444);
		Assets.food2 = g.newPixmap("food2.png", PixmapFormat.ARGB4444);
		Assets.food3 = g.newPixmap("food3.png", PixmapFormat.ARGB4444);
		Assets.click = game.getAudio().newSound("click.mp3");
		Assets.eat = game.getAudio().newSound("eat.mp3");
		Assets.bitten = game.getAudio().newSound("bitten.mp3");
		Assets.tweet = g.newPixmap("tweet.png", PixmapFormat.ARGB4444);
		Settings.load(game.getFileIO());
		game.setScreen(new MainMenuScreen(game));
	}

	@Override
	public void present(float deltaTime) {
		
	}

	@Override
	public void pause() {
		
	}

	@Override
	public void resume() {
		
	}

	@Override
	public void dispose() {
		
	}

}
