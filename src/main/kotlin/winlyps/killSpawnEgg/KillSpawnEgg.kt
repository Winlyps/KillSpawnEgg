package winlyps.killSpawnEgg

import org.bukkit.plugin.java.JavaPlugin

class KillSpawnEgg : JavaPlugin() {

    override fun onEnable() {
        // Register the event listener
        server.pluginManager.registerEvents(EventListener(this), this)

        logger.info("KillSpawnEgg plugin enabled!")
    }

    override fun onDisable() {
        logger.info("KillSpawnEgg plugin disabled!")
    }
}