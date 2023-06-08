package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class test extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Player player;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("pixel-art-8-bit-arcade-fighter-air-plane-red-vector-27629942-removebg-preview.png");
		player = new Player(img);
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 1, 1, 1);
		batch.begin();
		player.Draw(batch);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
