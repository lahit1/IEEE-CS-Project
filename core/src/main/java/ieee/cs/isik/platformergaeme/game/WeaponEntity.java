package ieee.cs.isik.platformergaeme.game;

import com.badlogic.gdx.physics.box2d.Body;
import org.jetbrains.annotations.NotNull;

public class WeaponEntity extends Entity{

    public int charge;
    public final int capacity;

    public WeaponEntity(int id, int type, String name, float health, float maxHealth, @NotNull Body body, final int charge, final int capacity) {
        super(id, type, name, health, maxHealth, body);
        this.charge = charge;
        this.capacity = capacity;
    }
}
