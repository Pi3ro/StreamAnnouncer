package me.pi3ro.streamannouncer;

import lombok.Getter;
import me.pi3ro.streamannouncer.commands.StreamCommand;
import me.vaperion.blade.Blade;
import me.vaperion.blade.command.bindings.impl.BukkitBindings;
import me.vaperion.blade.command.container.impl.BukkitCommandContainer;
import org.bukkit.plugin.java.JavaPlugin;

@Getter
public class StreamAnnouncer extends JavaPlugin {

    @Getter
    private static StreamAnnouncer instance;

    @Override
    public void onEnable() {
        instance = this;
        Blade.of()
                .fallbackPrefix("streamannouncer")
                .containerCreator(BukkitCommandContainer.CREATOR)
                .binding(new BukkitBindings())
                .build()
                .register(StreamCommand.class);
    }
    public void onDisable() {
        instance = null;
    }
}
