package scudettoNet.service;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import scudettoNet.client.FileUtilities;
import scudettoNet.model.Player;
import scudettoNet.model.errors.GenericError;

@Service
public class ScudettoNetService {

	public static final Logger logger = LoggerFactory.getLogger(ScudettoNetService.class);

	public List<Player> findActiveOrderByLinea(String fileName) throws GenericError, JsonParseException, JsonMappingException, IOException {
		try {
			List<Player> playerList = FileUtilities.readPlayerList(fileName);
			
			
			return playerList;
		} catch (Exception e) {
			throw new GenericError("Generic Error: " + e.getMessage(), e);
		}
	}

}
