package me.pi3ro.streamannouncer.commands;

import me.pi3ro.streamannouncer.utils.CC;
import me.vaperion.blade.command.annotation.*;
import org.bukkit.entity.Player;

public class StreamCommand {

    @Command(value = {"stream"}, async = true, quoted = false)
    @Permission(value = "streamannouncer.use", message = "No permission.")
    public static void streamCommnad(@Sender Player player) {

        player.sendMessage(CC.translate("&7&m---------------------------------"));
        player.sendMessage(CC.translate("&e&lStream Announcer Commands:"));
        player.sendMessage(CC.translate(" "));
        player.sendMessage(CC.translate("&e/stream &7- &fView this page."));
        player.sendMessage(CC.translate("&e/stream announce (link) &7- &fAnnounce your stream on the server."));
        player.sendMessage(CC.translate("&7&m---------------------------------"));
    }

    @Command(value = {"stream announce"}, async = true, quoted = false)
    @Permission(value = "streamannouncer.use", message = "No permission.")
    public static void streamannouncerCommand(@Sender Player player, @Name("link") @Combined String message) {

        player.sendMessage(CC.translate("&e&l[LIVE] " + player.getDisplayName() + " &ais now live at &n" + message));
    }
}
