/*
package com.mygdx.game;


import com.badlogic.gdx.ApplicationListener;
import com.badlogic.*;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

       // import javafx.animation.Animation;

public class Game implements ApplicationListener {
    private SpriteBatch batch;
    private BitmapFont font;
    private Texture img;
    private Sprite sprite;

   TextureAtlas shooterAtlas;
     Animation animation;
    private float timePassed = 0;

    @Override
    public void create() {
        img = new Texture("forest.png");
        sprite = new Sprite(img);
        batch = new SpriteBatch();
        font = new BitmapFont();
        font.setColor(Color.RED);
        textureAtlas = new TextureAtlas(Gdx.files.internal("data/spritesheet.atlas"));
        animation = new Animation(1/15f, textureAtlas.getRegions());
    }

    @Override
    public void dispose() {
        batch.dispose();
        font.dispose();
        img.dispose();
        shooterAtlas.dispose();
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        sprite.draw(batch);
        font.draw(batch, "Hello World", 200, 200);
        batch.end();

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
}
 // https://www.youtube.com/watch?v=_rVS1zHThZ0
*/
package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

import sun.font.GlyphLayout;

public class Game extends ApplicationAdapter implements InputProcessor {
    private SpriteBatch batch;
    private TextureAtlas textureAtlas;
    private Animation animation;
    private float elapsedTime = 0;
    private BitmapFont font;
    private int screenWIDTH,screenHEIGHT;
    private String message = "touch me baby";





    @Override
    public void create() {
        batch = new SpriteBatch();
        textureAtlas = new TextureAtlas(Gdx.files.internal("shooter.atlas"));
        animation = new Animation(1/15f, textureAtlas.getRegions());
        screenWIDTH = Gdx.graphics.getWidth();
        screenHEIGHT = Gdx.graphics.getHeight();
       BitmapFont.getBounds


        font = new BitmapFont();
        font.setColor(Color.CHARTREUSE);
        Gdx.input.setInputProcessor(this); //user input is handled by gdx methods

    }

    @Override
    public void dispose() {
        batch.dispose();
        textureAtlas.dispose();
        font.dispose();
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);



        batch.begin();
        //sprite.draw(batch);
        elapsedTime += Gdx.graphics.getDeltaTime();
        batch.draw(animation.getKeyFrame(elapsedTime, true), 330, 330);


        batch.end();
    }


    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {




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
    public boolean scrolled(int amount) {
        return false;
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

}