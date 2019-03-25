package scudettoNet.utility;

import scudettoNet.model.enumeration.RoleEnum;

/**
 * The Class Constants.
 */

public final class ScudettoNetUtils {

	public static boolean evaluateIfFilter(Integer id, String team, String name, RoleEnum role, Boolean freeAgent) {
		if (id != null || team != null || name != null || role != null || freeAgent != null) {
			return true;
		}
			return false;
	}

}
