package me.sonix.omniTool.Inventory;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;


public class inventoryListeners implements Listener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e){
        //Check if the inventory is the "Upgrade Inventory"

        if (e.getView().getTitle().equalsIgnoreCase("Upgrade Menu")){

            e.setCancelled(true);

            Player p = (Player) e.getWhoClicked();


            p.sendMessage(p.getInventory().getItemInMainHand().getItemMeta().getDisplayName());


            ItemMeta meta = p.getInventory().getItemInMainHand().getItemMeta();
            switch (e.getCurrentItem().getItemMeta().getDisplayName().replaceAll("\\d","").replaceAll(" ","")){


                case "Tokenator":


                    if (meta.getDisplayName().equals("Skibidi Pickaxe")){
                        List<String> lore = meta.getLore();
                        String lvl = lore.get(2);                            //get the tokenator enchant
                        lvl = lvl.replaceAll("[^0-9]", ""); //extract the level of the enchant
                        int intlvl = Integer.parseInt(lvl);               //convert str to int

                        intlvl++;

                        lvl = String.valueOf(intlvl);


                        lore.set(2,"Tokenator "+lvl);
                        meta.setLore(lore);

                        p.getInventory().getItemInMainHand().setItemMeta(meta);

                    }
                    else{
                        p.sendMessage("Hold the Pickaxe in your hand");
                    }
                    break;
                case "Skibidi":

                    if (meta.getDisplayName().equals("Skibidi Pickaxe")) {
                        List<String> lore = meta.getLore();
                        String lvl = lore.get(3);                            //get the skibidi enchant
                        lvl = lvl.replaceAll("[^0-9]", ""); //extract the level of the enchant
                        int intlvl = Integer.parseInt(lvl);               //convert str to int

                        intlvl++;

                        lvl = String.valueOf(intlvl);


                        lore.set(3, "Skibidi " + lvl);
                        meta.setLore(lore);

                        p.getInventory().getItemInMainHand().setItemMeta(meta);
                    }
                    else{
                        p.sendMessage("Hold the Pickaxe in your hand");
                    }
                    break;
                case "MiningSpeed":
                    if (meta.getDisplayName().equals("Skibidi Pickaxe")) {
                        List<String> lore = meta.getLore();
                        String lvl = lore.get(4);                            //get the mining enchant
                        lvl = lvl.replaceAll("[^0-9]", ""); //extract the level of the enchant
                        int intlvl = Integer.parseInt(lvl);               //convert str to int

                        intlvl++;

                        lvl = String.valueOf(intlvl);


                        lore.set(4, "Mining Speed " + lvl);
                        meta.setLore(lore);

                        p.getInventory().getItemInMainHand().setItemMeta(meta);
                    }
                    else {
                        p.sendMessage("Hold the Pickaxe in your hand");
                    }
                    break;
                default:
                    p.sendMessage("Default case");
                    break;
            }
        }
    }
}
