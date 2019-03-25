package scudettoNet.transformations;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.ListUtils;

import scudettoNet.model.Player;
import scudettoNet.model.enumeration.RoleEnum;

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

	public static List<Player> filterByRole(List<Player> playerList, RoleEnum role) {
		if (role != null) {
			List<Player> filteredPlayerList = new ArrayList<>();
			for (Player player : ListUtils.emptyIfNull(playerList)) {
				if (player.getRole().toUpperCase().contains(role.value().toUpperCase())) {
					filteredPlayerList.add(player);
				}
			}
			playerList = filteredPlayerList;
		}
		return playerList;
	}

	public static List<Player> filterByMaxValue(List<Player> playerList, Integer maxValue) {
		if (maxValue != null) {
			List<Player> filteredPlayerList = new ArrayList<>();
			for (Player player : ListUtils.emptyIfNull(playerList)) {
				if (player.getValue() <= maxValue) {
					filteredPlayerList.add(player);
				}
			}
			playerList = filteredPlayerList;
		}
		return playerList;
	}

	public static List<Player> filterByStatus(List<Player> playerList, Boolean freeAgent) {
		if (freeAgent != null) {
			List<Player> filteredPlayerList = new ArrayList<>();
			for (Player player : ListUtils.emptyIfNull(playerList)) {
				if (player.getStatus().equals(freeAgent)) {
					filteredPlayerList.add(player);
				}
			}
			playerList = filteredPlayerList;
		}
		return playerList;
	}

}
