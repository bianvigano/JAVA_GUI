package guis.guisx;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class EventInventory implements Listener {
    @Override
    public void onPlayerClickInventory(InventoryClickEvent e){
        if(e.getInventory().getTitle().equals("Custom Inventory Title (SUB)")){
            if(e.getCurrentItem().getItemMeta() != null){
                if(e.getCurrentItem().getItemMeta().getDisplayName() != null){
                    if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.RED + "MY APPLE")){
                        //code
                        Player p = (Player) e.getWhoClicked();
                        p.sendMessage("DON'T STEAL MY APPLES!");
                        e.setCancelled(true);
                    }
                }
            }
        }
    }
}
