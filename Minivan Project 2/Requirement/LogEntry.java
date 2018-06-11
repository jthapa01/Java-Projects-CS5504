package edu.vt.cs5044;

/**
 * One LogEntry value is added to the event log by each MinivanDoor mutator.
 *
 * Please read the comments below for more details.
 *
 * IMPORTANT: Please DO NOT modify this file in any way!
 *
 * @author cs5044
 * @version Fall 2017
 */
public enum LogEntry {

    // -----------------------------------------------------------------------
    // Values that indicate a successful state change request:
    // -----------------------------------------------------------------------
    /**
     * Door was closed; now open.
     */
    DOOR_OPENED,

    /**
     *  Door was open; now closed.
     */
    DOOR_CLOSED,

    /**
     * Door was unlocked; now locked.
     */
    DOOR_LOCKED,

    /**
     * Door was locked; now unlocked.
     */
    DOOR_UNLOCKED,

    /**
     * Child-safety was disengaged; now engaged.
     */
    CHILD_SAFE_ENGAGED,

    /**
     * Child-safety was engaged; now disengaged.
     */
    CHILD_SAFE_DISENGAGED,

    /**
     * Gear was any gear other than park; now in park.
     */
    GEAR_PARKED,

    /**
     * Gear was in park; now in any other gear.
     */
    GEAR_RELEASED,

    // -----------------------------------------------------------------------
    // Values that indicate a change request performed no action
    // -----------------------------------------------------------------------
    //
    // NOTE: If multiple values apply, you must use the FIRST one listed below.
    //
    // For example, if the door is locked, the gear is not in park,
    // and the outside handle is activated, then the value recorded in the log
    // should be OPEN_REFUSED_GEAR rather than OPEN_REFUSED_LOCKED even though both apply
    //
    // As another example, if the door is already locked when a lock request is
    // made, the log entry should be NO_ACTION_TAKEN.
    //
    // -----------------------------------------------------------------------
    /**
     * Open refused; inner handle activated while child-safety engaged.
     */
    OPEN_REFUSED_CHILD_SAFE,

    /**
     * Open refused; gear is not in park.
     */
    OPEN_REFUSED_GEAR,

    /**
     * Open refused; door is locked.
     */
    OPEN_REFUSED_LOCK,

    /**
     * Child-safe change refused; door is not open.
     */
    CHILD_SAFE_CHANGE_REFUSED,

    /**
     * Any request that results in no state change.
     */
    NO_ACTION_TAKEN;
}
