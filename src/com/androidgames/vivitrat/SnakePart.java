package com.androidgames.vivitrat;

public class SnakePart {
	public static final int UP = 0;
	public static final int LEFT = 1;
	public static final int DOWN = 2;
	public static final int RIGHT = 3;
	
	public int x, y;
	public int direction;
	
	public SnakePart(int x, int y, int direction) {
		this.x = x;
		this.y = y;
		this.direction = direction;
	}
}
