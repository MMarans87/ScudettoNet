package scudettoNet.transformations;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.ListUtils;

import scudettoNet.model.Player;

public class PlayersFilter {

	public static List<Player> filterByid(List<Player> playerList, int id) {
		List<Player> filteredPlayerList = new ArrayList<>();
		for (Player player : ListUtils.emptyIfNull(playerList)) {
			if (player.compareId(id)) {
				filteredPlayerList.add(player);
			}
		}
		return filteredPlayerList;
	}

}
