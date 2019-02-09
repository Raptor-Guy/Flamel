package com.arpansbetter.flamel.world;

import com.badlogic.gdx.graphics.OrthographicCamera;

public abstract class GameRoom {
	public abstract void render(OrthographicCamera camera);
	public abstract void update(float delta);
	public abstract void dispose();
}
