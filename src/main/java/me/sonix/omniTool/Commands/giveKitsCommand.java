package me.sonix.omniTool.Commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class giveKitsCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (commandSender instanceof Player p){

            p.sendMessage("Command executed");

            ItemStack pick = new ItemStack(Material.DIAMOND_PICKAXE,1);
            ItemMeta pickMeta = pick.getItemMeta();
            assert pickMeta != null;
            pickMeta.setDisplayName("Skibidi Pickaxe");
            pickMeta.setLore(List.of(ChatColor.GOLD+"Picks the Axe",ChatColor.DARK_GRAY+"Placeholder Stats","Tokenator 0","Skibidi 0 ","Mining Speed 0",ChatColor.YELLOW+"SHIFT + Right Click To open a Menu",ChatColor.WHITE+"Common"));
            pick.setItemMeta(pickMeta);

            p.getInventory().addItem(pick);


        }

        return true;
    }
}

//Item Lore Template
//l1->basic info of item
//l2->stats maybe idk
//enchant names
//ln-2 -> "shift right click to open menu"
//ln-1 -> <rarity>