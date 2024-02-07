package dev.kbejj.chunkcollector.events;

import org.bukkit.Location;
import org.bukkit.OfflinePlayer;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public class CollectorAutoSellEvent extends Event implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private boolean cancelled = false;
    private final ItemStack itemStack;
    private double sellPrice;
    private final OfflinePlayer offlinePlayer;
    private final Location collectorLocation;

    public CollectorAutoSellEvent(ItemStack itemStack, double sellPrice, OfflinePlayer offlinePlayer, Location collectorLocation) {
        this.itemStack = itemStack;
        this.sellPrice = sellPrice;
        this.offlinePlayer = offlinePlayer;
        this.collectorLocation = collectorLocation;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public ItemStack getItemStack() {
        return itemStack;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public OfflinePlayer getOfflinePlayer() {
        return offlinePlayer;
    }

    public Location getCollectorLocation() {
        return collectorLocation;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        this.cancelled = b;
    }
}
