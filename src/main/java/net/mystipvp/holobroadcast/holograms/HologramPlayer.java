/*
 * Copyright (c) 2020.
 *
 * This project (Holobroadcast) and this file is part of Romain Storaï (_Rolyn) and Nathan Djian-Martin (DevKrazy)
 *
 * Holobroadcast cannot be copied and/or distributed without the express permission of Romain Storaï (_Rolyn) and Nathan Djian-Martin (DevKrazy)
 */

package net.mystipvp.holobroadcast.holograms;

public class HologramPlayer {

    /**
     * Sets the HoloPlayer's HologramHUD and show it for a specific duration. Also removes the HoloPlayer's current HologramHUD.
     *
     * @param data   Raw data
     * @param expire Expiration
     */
    public void showHUD(String data, long expire) {
    }

    /**
     * Sets the HoloPlayer's HologramHUD and show it. Also removes the HologramPlayer's current HologramHUD.
     *
     * @param data Raw data
     */
    public void showHUD(String data) {
    }

    /**
     * Removes the HoloPlayer's current HologramHUD if he has one.
     */
    public void clearHUD() {
    }

    /**
     * Checks if a HoloPlayer currently has a HologramHUD.
     *
     * @return true if the HoloPlayer has a HologramHUD; false otherwise.
     */
    public boolean hasHUD() {
        return false;
    }

    /**
     * Clears all of the current HologramPlayer's holograms. This method clears
     * the HologramHUD if the HologramPlayer has one and all of his other HologramHolders.
     */
    public void clearHolograms() {
    }

    /**
     * @return true if the HologramPlayer can receive HUD messages; false otherwise.
     */
    public boolean receiveHUDMessages() {
        return false;
    }

    /**
     * Sets the HologramPlayer's receiveHUDMessage parameter and updates its field in the players_data.yml config.
     *
     * @param receiveHUDMessage
     */
    public void setReceiveHUDMessage(boolean receiveHUDMessage) {
    }

    /**
     * @return the HologramPlayer's hudDistance.
     */
    public int getHUDDistance() {
        return 0;
    }

    /**
     * Sets the HologramPlayer's hudDistance parameter and updates its field in the players_data.yml config.
     *
     * @param hudDistance
     */
    public void setHUDDistance(int hudDistance) {
    }

    /**
     * Destroys all of the HologramPlayer's Holograms and stops the BukkitTask
     * which was updating its Holograms.
     */
    public void destroy() {
    }
}
