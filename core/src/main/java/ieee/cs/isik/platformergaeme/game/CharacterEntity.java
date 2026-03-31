package ieee.cs.isik.platformergaeme.game;

import com.badlogic.gdx.physics.box2d.Body;
import org.jetbrains.annotations.NotNull;


/**
 * This class represents data of a character,
 * A character must carry a weapon.
 * A character can carry at most one consumable.
 */
public class CharacterEntity extends Entity {

    /// Weapons can be used repeatly, weapon should not be null
    public WeaponEntity weapon;

    /// Consumable can be used just one time
    public ConsumableEntity consumable;

    public CharacterEntity(int id, int type, String name, float health, float maxHealth, @NotNull Body body, WeaponEntity weapon, ConsumableEntity consumable) {
        super(id, type, name, health, maxHealth, body);
        this.weapon = weapon;
        this.consumable = consumable;
    }
}
