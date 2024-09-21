package me.sonix.omniTool;

import me.sonix.omniTool.Commands.giveKitsCommand;
import me.sonix.omniTool.Inventory.inventoryListeners;
import me.sonix.omniTool.Inventory.upgradeInventory;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.inventory.InventoryInteractEvent;
import org.bukkit.event.player.PlayerItemDamageEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerToggleSprintEvent;
import org.bukkit.plugin.java.JavaPlugin;


public final class OmniTool extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("[OmniTool v1.0 ] -- Starting");

        getServer().getPluginManager().registerEvents(new inventoryListeners(), this);

        getCommand("giveKit").setExecutor(new giveKitsCommand());
        getCommand("upgrade").setExecutor(new upgradeInventory());
    }


}
