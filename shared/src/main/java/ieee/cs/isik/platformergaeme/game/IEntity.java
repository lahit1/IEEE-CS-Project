package ieee.cs.isik.platformergaeme.game;


/**
 * This class holds some part of Entity data that shared between Client and Server
 * Complete data can be found in {@link Entity}
 */
public abstract class IEntity {
    /// It's a unique integer, Neither of Entities can share same id.
    public final int id;

    /// Represents health of entity. When reaches 0, entity dies.
    public float health;

    /// Represents maxHealth of entity. If it's 0, that means entity is immortal.
    public float maxHealth;

    public IEntity(final int id, final float health, final float maxHealth) {
        this.id = id;
        this.health = health;
        this.maxHealth = maxHealth;
    }
}
