package net.ddns.templex.vanillamode.chat;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scoreboard.Team;

/* VanillaMode plugin for Bukkit: Take a few steps back to Vanilla.
 * Copyright (C) 2016  VTCAKAVSMoACE
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 * Listener for Chat to re-enable scoreboard integration with chat. This means
 * that the display names in chat will return to their intended color.
 * 
 * @author vtcakavsmoace vtcakavsmoace@gmail.com
 * @version initial-development
 */
public class ScoreboardChatIntegration implements Listener {
	
	@EventHandler(priority = EventPriority.MONITOR)
	public void onPlayerJoin(PlayerJoinEvent event) {
		String playerName = event.getPlayer().getName();
		Team playerTeam = Bukkit.getScoreboardManager().getMainScoreboard().getEntryTeam(playerName);
		event.getPlayer().setDisplayName(playerTeam.getPrefix() + playerName + playerTeam.getSuffix());
	}

}