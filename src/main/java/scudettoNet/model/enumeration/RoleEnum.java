package scudettoNet.model.enumeration;

public enum RoleEnum {
	
	PORTIERE ("P"),
	DIFENSORE ("D"),
	CENTROCAMPISTA ("C"),
	ATTACCANTE ("A");

	private String value;
	
	private RoleEnum(String value) {
		this.value=value;
	}

    public String value() {
        return value;
    }
}
