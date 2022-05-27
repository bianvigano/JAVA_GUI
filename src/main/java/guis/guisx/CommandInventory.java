package guis.guisx;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class CommandInventory implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender instanceof Player){
            Player p = (Player) sender;
            Inventory inv = Bukkit.createInventory(null, 9, "Custom Inventory Title (SUB)");
            inv.addItem(new ItemStack(Material.APPLE));
            inv.setItem(3, new ItemStack(Material.APPLE));
            p.openInventory(inv);
            return true;
        }
        return false;
    }
}
