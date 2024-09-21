package me.sonix.omniTool.Inventory;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class upgradeInventory implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {


        if (commandSender instanceof Player p) {

            Inventory inventory = Bukkit.createInventory(p,45, "Upgrade Menu");


            // Buttons

            ItemStack enchant_1 = new ItemStack(Material.ENCHANTED_BOOK);
            ItemStack enchant_2 = new ItemStack(Material.ENCHANTED_BOOK);
            ItemStack enchant_3 = new ItemStack(Material.ENCHANTED_BOOK);
//            ItemStack settingsButton = new ItemStack(Material.NETHER_STAR);


            // Metadata
            ItemMeta enchant_1_meta = enchant_1.getItemMeta();
            enchant_1_meta.setDisplayName("Tokenator");
            enchant_1_meta.setLore(List.of(ChatColor.RED+"Upgrade The Tokenator Of Your Pickaxe"));

            enchant_1.setItemMeta(enchant_1_meta);



            ItemMeta enchant_2_meta = enchant_2.getItemMeta();
            enchant_2_meta.setDisplayName("Skibidi");
            enchant_2_meta.setLore(List.of(ChatColor.RED+"Upgrade The Skibidi Of Your Pickaxe"));

            enchant_2.setItemMeta(enchant_2_meta);



            ItemMeta enchant_3_meta = enchant_3.getItemMeta();
            enchant_3_meta.setDisplayName("Mining Speed");
            enchant_3_meta.setLore(List.of(ChatColor.RED+"Upgrade The Mining Speed Of Your Pickaxe"));

            enchant_3.setItemMeta(enchant_3_meta);




            inventory.setItem(11, enchant_1);
            inventory.setItem(12, enchant_2);
            inventory.setItem(13, enchant_3);

            p.openInventory(inventory);
        }
        return true;
    }
}
