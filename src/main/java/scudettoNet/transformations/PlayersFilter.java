package scudettoNet.transformations;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.ListUtils;

import scudettoNet.model.Player;

public class PlayersFilter {

	public static List<Player> filterById(List<Player> playerList, Integer id) {
		if (id != null) {
			List<Player> filteredPlayerList = new ArrayList<>();
			for (Player player : ListUtils.emptyIfNull(playerList)) {
				if (player.compareId(id)) {
					filteredPlayerList.add(player);
				}
			}
			playerList = filteredPlayerList;
		}
		return playerList;
	}

	public static List<Player> filterByTeam(List<Player> playerList, String team) {
		if (team != null) {
			List<Player> filteredPlayerList = new ArrayList<>();
			for (Player player : ListUtils.emptyIfNull(playerList)) {
				if (player.getTeam().toUpperCase().contains(team.toUpperCase())) {
					filteredPlayerList.add(player);
				}
			}
			playerList = filteredPlayerList;
		}
		return playerList;
	}

	public static List<Player> filterByName(List<Player> playerList, String name) {
		if (name != null) {
			List<Player> filteredPlayerList = new ArrayList<>();
			for (Player player : ListUtils.emptyIfNull(playerList)) {
				if (player.getName().toUpperCase().contains(name.toUpperCase())) {
					filteredPlayerList.add(player);
				}
			}
			playerList = filteredPlayerList;
		}
		return playerList;
	}

}
