/*
 * Copyright (c) 2020.
 *
 * This project (Holobroadcast) and this file is part of Romain Storaï (_Rolyn) and Nathan Djian-Martin (DevKrazy)
 *
 * Holobroadcast cannot be copied and/or distributed without the express permission of Romain Storaï (_Rolyn) and Nathan Djian-Martin (DevKrazy)
 */

package net.mystipvp.holobroadcast.holograms;

import org.bukkit.command.CommandSender;

public class HologramPlayer {

    /**
     * Sets the HologramPlayer's HologramHUD and show it for a specific duration.
     * Also removes the HologramPlayer's current HologramHUD.
     *
     * @param creator  the Sender whose permissions will be checked in order to apply placeholders
     * @param rawData  the raw String data
     * @param lifeTime the time in ticks during which the HUD will be show to the player
     */
    public void showHUD(CommandSender creator, String rawData, long lifeTime) {
    }

    /**
     * Sets the HologramPlayer's HologramHUD and show it for a specific duration.
     * Also removes the HologramPlayer's current HologramHUD.
     *
     * @param rawData  the raw String data
     * @param lifeTime the time in ticks during which the HUD will be show to the player
     */
    public void showHUD(String rawData, long lifeTime) {
    }

    /**
     * Sets the HologramPlayer's HologramHUD after a delay and shows it for a specific duration
     * Also removes the HologramPlayer's current HologramHUD.
     *
     * @param creator  the Sender whose permissions will be checked in order to apply placeholders
     * @param rawData  the raw String data
     * @param lifeTime the time in ticks during which the HUD will be show to the player
     * @param delay    the delay in ticks after which the HUD will be shown to the player
     */
    public void showDelayedHUD(CommandSender creator, String rawData, long lifeTime, long delay) {
    }

    /**
     * Sets the HologramPlayer's HologramHUD after a delay and shows it for a specific duration
     * Also removes the HologramPlayer's current HologramHUD.
     *
     * @param rawData  the raw String data
     * @param lifeTime the time in ticks during which the HUD will be show to the player
     * @param delay    the delay in ticks after which the HUD will be shown to the player
     */
    public void showDelayedHUD(String rawData, long lifeTime, long delay) {
    }

    /**
     * Deletes the HologramPlayer's current HologramHUD if he has one.
     */
    public void deleteHUD() {
    }

    /**
     * Checks if a HologramPlayer currently has a HologramHUD.
     *
     * @return true if the HologramPlayer has a HologramHUD; false otherwise.
     */
    public boolean hasHUD() {
        return true;
    }

    /**
     * @return true if the HologramPlayer can receive HUD messages; false otherwise.
     */
    public boolean receiveHUDMessages() {
        return true;
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
     * @return true if the player can receive holograms sounds; false otherwise.
     */
    public boolean receiveHologramsSounds() {
        return true;
    }

    /**
     * Sets the HologramPlayer's receiveHologramsSounds parameter and updates its field in the players_data.yml config.
     *
     * @param receiveHologramsSounds
     */
    public void setReceiveHologramsSounds(boolean receiveHologramsSounds) {
    }

    /**
     * @return true if the player can receive HUD while in combattag
     */
    public boolean getReceiveHUDInCombat() {
        return true;
    }

    /**
     * Sets the HologramPlayer's receiveHUDinCombat parameter ad updates its field i the players_data.yml config.
     *
     * @param receiveHUDInCombat
     */
    public void setReceiveHUDInCombat(boolean receiveHUDInCombat) {
    }

    /**
     * @return true if the player can receive Auto Announces
     */
    public boolean getReceiveAutoAnnounces() {
        return true;
    }

    /**
     * Sets the HologramPlayer's receiveAutoAnnounces parameter ad updates its field i the players_data.yml config.
     *
     * @param receiveAutoAnnounces
     */
    public void setReceiveAutoAnnounces(boolean receiveAutoAnnounces) {
    }

    /**
     * @return true if the player can receive Particles
     */
    public boolean getReceiveParticles() {
        return true;
    }

    /**
     * Sets the HologramPlayer's receiveParticles parameter ad updates its field i the players_data.yml config.
     *
     * @param receiveParticles
     */
    public void setReceiveParticles(boolean receiveParticles) {
    }

    /**
     * Clears all of the current HologramPlayer's holograms. This method clears
     * the HologramHUD if the HologramPlayer has one and all of his other HologramHolders.
     */
    public void clearHolograms() {
    }

    /**
     * Destroys all of the HologramPlayer's Holograms, cancels the BukkitTask
     * which was updating its Holograms and saves the players_data.yml config file.
     */
    public void destroy() {
    }

    /**
     * @return true if the player is considered in combat
     */
    public boolean isInCombat() {
        return true;
    }
}
