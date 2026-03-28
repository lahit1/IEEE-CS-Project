package ieee.cs.isik.platformergaeme;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

/**
 * Don't forget we're using OpenGL 2.0
 **/
public class Main extends ApplicationAdapter {
    @Override
    public void create() {
        // Set process name (Name of the window in desktop/laptop or name of the app in mobile)
        Gdx.graphics.setTitle("IEEE CS Ekibi Mario");

        // Set window size
        Gdx.graphics.setWindowedMode(640, 480);

        // Set default background color
        Gdx.gl20.glClearColor(0, 0, 0, 1);
    }

    @Override
    public void render() {
        /*
         * Clear previous screen
         * This will paint entire screen to the default color that we decided in create() with Gdx.gl20.glClearColor function
         */
        Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }

    @Override
    public void dispose() {
        // Nothing to dispose
    }
}
