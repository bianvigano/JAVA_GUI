package guis.guisx;

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

public class CommandInventory implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender instanceof Player){
            Player p = (Player) sender;
            Inventory inv = Bukkit.createInventory(null, 9, "Custom Inventory Title (SUB)");
            ItemStack apple = new ItemStack(Material.APPLE);
            ItemMeta meta = apple.getItemMeta();
            meta.setDisplayName(ChatColor.RED + "MY APPLE");
            apple.setItemMeta(meta);
            inv.addItem(apple);
            inv.setItem(3, apple);
            p.openInventory(inv);
            return true;
        }
        return false;
    }
}
