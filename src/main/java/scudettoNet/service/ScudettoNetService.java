package scudettoNet.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import scudettoNet.client.FileUtilities;
import scudettoNet.model.Help;
import scudettoNet.model.Player;
import scudettoNet.model.errors.GenericError;
import scudettoNet.transformations.PlayersFilter;
import scudettoNet.utility.Constants;
import scudettoNet.utility.ScudettoNetUtils;

@Service
public class ScudettoNetService {
	
	@Value("${useInternalString:N}")
	String useInternalString;
	
	public static final Logger logger = LoggerFactory.getLogger(ScudettoNetService.class);

	public List<Player> retrievePlayerList(Integer id, String team, String name, String role, Boolean freeAgent) throws GenericError {
		try {

			List<Player> playerList = FileUtilities.readPlayerList(Constants.PLAYER_LIST_PATH, useInternalString);
			if (!ScudettoNetUtils.evaluateIfFilter(id, team, name, role, freeAgent)) {
				return playerList;
			}
			playerList = PlayersFilter.filterById(playerList, id);
			playerList = PlayersFilter.filterByTeam(playerList, team);
			playerList = PlayersFilter.filterByName(playerList, name);
			return playerList;
		} catch (Exception e) {
			throw new GenericError("Generic Error: " + e.getMessage(), e);
		}
	}

	public Help retrieveHelp(String operation) throws GenericError {
		try {
			Help help = new Help();
			help.setHelp(Constants.PLAYER_HELP);
			help.setOperation(operation);
			return help;
		} catch (Exception e) {
			throw new GenericError("Generic Error: " + e.getMessage(), e);
		}
	}

}
