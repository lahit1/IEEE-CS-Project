package ieee.cs.isik.platformergaeme.game;

import com.badlogic.gdx.physics.box2d.Body;
import org.jetbrains.annotations.NotNull;

public class ConsumableEntity extends Entity {
    public ConsumableEntity(int id, int type, String name, float health, float maxHealth, @NotNull Body body) {
        super(id, type, name, health, maxHealth, body);
    }
}
