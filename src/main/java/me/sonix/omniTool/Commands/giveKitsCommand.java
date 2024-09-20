package me.sonix.omniTool.Commands;

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
            pickMeta.setDisplayName("Pickaxe");
            List<String> pickLore = new ArrayList<>();
            pickLore.add("Tokenator 57/100");
            pickLore.add("Skibidi 24/100");
            pickLore.add("MiningSpeed 66/100");

            pickMeta.setLore(pickLore);

            pick.setItemMeta(pickMeta);




            p.getInventory().addItem(pick);


        }

        return true;
    }
}
