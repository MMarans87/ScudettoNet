package scudettoNet.client;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import scudettoNet.model.Help;
import scudettoNet.model.Player;
import scudettoNet.utility.Constants;

public class FileUtilities {

	public static String readResponseFromFile(String fileName) throws IOException {
		Resource resource = new FileSystemResource(fileName);
		File file = resource.getFile();
		String out = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
		return out;
	}

	public String retrieveFilePathFromUrl(String url, String prefix) {
		String fileName = url;
		fileName = fileName.replace("/{", ".").replace("}/", ".").replace("/", ".").replace("}", "");
		if (fileName.startsWith(".")) {
			fileName = fileName.substring(1);
		}
		return Constants.PREFIX_PATH + fileName.toLowerCase() + "." + prefix;
	}

	public static String retrieveFilePath(String fileName) {
		return Constants.PREFIX_PATH + fileName.toLowerCase();
	}

	public static List<Player> readPlayerList(String fileName, String useInternalString) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper obj = new ObjectMapper();
		if (Constants.Y.equalsIgnoreCase(useInternalString)) {
			return Arrays.asList(obj.readValue(Constants.PLAYER_LIST, Player[].class));
		}
		String readResponseFromFile = readResponseFromFile(fileName);
		return Arrays.asList(obj.readValue(readResponseFromFile, Player[].class));
	}
	
}
