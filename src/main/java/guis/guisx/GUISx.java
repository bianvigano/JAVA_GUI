package guis.guisx;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class GUISx extends JavaPlugin {

    @Override
    public void onEnable() {
       getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[Plugin] Gui Is Enable!");
        getCommand("gubs").setExecutor(new Commanhello());
        getCommand("gubin").setExecutor(new CommandInventory());
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[Plugin] Gui Is Disable!");
    }
}
