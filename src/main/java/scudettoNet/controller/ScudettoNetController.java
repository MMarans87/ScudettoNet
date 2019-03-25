package scudettoNet.controller;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import scudettoNet.model.Player;
import scudettoNet.model.enumeration.RoleEnum;
import scudettoNet.model.errors.GenericError;
import scudettoNet.service.ScudettoNetService;

@RestController
@RequestMapping(path = "/api")
public class ScudettoNetController {

	@Autowired
	ScudettoNetService service;

	public static final Logger logger = LoggerFactory.getLogger(ScudettoNetController.class);

	/**
	 * SDP ACTIVE ORDERS BY LINE STUB
	 * 
	 * @throws IOException
	 * @throws JsonMappingException
	 * @throws JsonParseException
	 * @throws GenericError
	 */
	@RequestMapping(value = "/players", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<List<Player>> getPlayers(@RequestParam(name = "id", required = false) Integer id, @RequestParam(name = "team", required = false) String team, @RequestParam(name = "name", required = false) String name, @RequestParam(name = "role", required = false) RoleEnum role, @RequestParam(name = "freeAgent", required = false) Boolean freeAgent, @RequestParam(name = "maxValue", required = false) Integer maxValue, @RequestParam(name = "maxSalary", required = false) Integer maxSalary) throws JsonParseException, JsonMappingException, IOException, GenericError {

		System.out.println("Retrieve Player List with parameters: ");
		System.out.println("id:" + id + " ,team:" + team + " ,name:" + name + " ,role:" + role + " ,freeAgent:" + freeAgent);
		HttpStatus status = HttpStatus.OK;
		List<Player> playerList = service.retrievePlayerList(id, team, name, role, freeAgent, maxValue, maxSalary);
		System.out.println("Retrieved Player List");
		return new ResponseEntity<>(playerList, status);
	}
	

}
