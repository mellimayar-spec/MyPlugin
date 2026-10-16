package me.test;

import org.bukkit.plugin.java.JavaPlugin;

public class MyPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("شغال!");
    }
}
