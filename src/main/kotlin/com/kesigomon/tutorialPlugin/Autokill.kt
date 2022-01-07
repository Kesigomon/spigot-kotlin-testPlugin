package com.kesigomon.tutorialPlugin

import org.bukkit.Bukkit
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.player.PlayerRespawnEvent
import org.bukkit.plugin.java.JavaPlugin


class Autokill(private val plugin: JavaPlugin) : Listener {
    @EventHandler
    fun onPlayerJoin(event: PlayerJoinEvent){
        event.player.health = 0.0
    }
    @EventHandler
    fun onPlayerSpawn(event: PlayerRespawnEvent){
        Bukkit.broadcastMessage(event.player.name + "is Respawned.")
    }
}

