package com.androidgames.vivitrat;

import com.androidgames.framework.Screen;
import com.androidgames.framework.impl.AndroidGame;

public class VivitRatGame extends AndroidGame {

	@Override
	public Screen getStartScreen() {
		return new LoadingScreen(this);
	}

}
