package ieee.cs.isik.platformergaeme.game;

import com.badlogic.gdx.physics.box2d.Body;
import org.jetbrains.annotations.NotNull;


/**
 * This class represents any dynamic object in the game that going to be or has been registered to a server.
 * This class is inherited from {@link IEntity} and has extra data that required by client side.
 *
 * @see IEntity
 */
public abstract class Entity extends IEntity {

    /// Every entity should have a body so they can interact with each other physically
    @NotNull
    private final Body body;

    public Entity(final int id, final float health, final float maxHealth, @NotNull final Body body) {
        // Initialize the super class IEntity
        super(id, health, maxHealth);

        this.body = body;
    }
    public void car() {
        int x = 1;
    }
    @NotNull
    public Body getBody() {
        return body;
    }
}
