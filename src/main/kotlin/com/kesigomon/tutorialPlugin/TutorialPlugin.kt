package com.kesigomon.tutorialPlugin
import org.bukkit.plugin.java.JavaPlugin
class TutorialPlugin: JavaPlugin() {
    override fun onEnable() {
        server.pluginManager.registerEvents(Autokill(this), this)
        logger.info("Hello World!")
    }

    override fun onDisable() {
        logger.info("Good Bye!")
    }
}
