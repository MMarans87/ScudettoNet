package scudettoNet.utility;

/**
 * The Class Constants.
 */

public final class ScudettoNetUtils {

	public static boolean evaluateIfFilter(Integer id, String team, String name, String role, Boolean freeAgent) {
		if (id != null || team != null || name != null || role != null || freeAgent != null) {
			return true;
		}
			return false;
	}

}
