/*
 * Copyright (c) 2020.
 *
 * This project (Holobroadcast) and this file is part of Romain Storaï (_Rolyn) and Nathan Djian-Martin (DevKrazy)
 *
 * Holobroadcast cannot be copied and/or distributed without the express permission of Romain Storaï (_Rolyn) and Nathan Djian-Martin (DevKrazy)
 */

package net.mystipvp.holobroadcast.holograms;

import java.util.UUID;

public class HologramPlayersManager {

    private static HologramPlayersManager instance;

    /**
     * @return the HologramPlayersManager's instance.
     */
    public static HologramPlayersManager getInstance() {
        return null;
    }

    /**
     * Creates a new HoloPlayer and keeps a reference to it.
     * If a HoloPlayer is already associated to the given UUID this method does nothing and returns null.
     *
     * @param uuid the Bukkit Player's UUID.
     * @return the HoloPlayer's instance if it was created; null otherwise.
     */
    public HologramPlayer createHologramPlayer(UUID uuid) {
        return null;
    }

    /**
     * Deletes a HoloPlayer and its reference.
     *
     * @param uuid the Bukkit Player's UUID used to create the HoloPlayer which needs to be deleted.
     */
    public void deleteHologramPlayer(UUID uuid) {

    }

    /**
     * Returns a given UUID's associated HoloPlayer. If the UUID has no associated HoloPlayer
     * this method returns null.
     *
     * @param uuid the Bukkit Player's UUID.
     * @return the HoloPlayer's instance if it was found; null otherwise.
     */
    public HologramPlayer getHologramPlayerFromUUID(UUID uuid) {
        return null;
    }

    /**
     * Checks if a HoloPlayer exists.
     *
     * @param uuid the Bukkit Player's UUID used to create the HoloPlayer whose existence we want to check.
     * @return true if a HoloPlayer is associated to this UUID; false otherwise.
     */
    public boolean existsHologramPlayer(UUID uuid) {
        return false;
    }
}
