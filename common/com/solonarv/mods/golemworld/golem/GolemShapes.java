package com.solonarv.mods.golemworld.golem;

/**
 * An enum that hold the golems' different standard shapes.
 * 
 * @author Solonarv
 * 
 */
public enum GolemShapes {
    /**
     * The vanilla Iron Golem's shape. Used for most golems.
     */
    DEFAULT,
    /**
     * The vanilla Snow Golem's shape. Not used yet, but seems like a common
     * enough shape to include.
     */
    PILLAR,
    /**
     * Requires all blocks (except the head) to be constructed out of the
     * specified material
     */
    FULL
}
