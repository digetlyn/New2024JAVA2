package enumeration.test;

public enum AuthGrade {

	GUEST, LOGIN, ADMIN;

	private final int level;
	private final String description;

	AuthGrade(int level, String description) {
		this.level = level;
		this.description = description;
	}
}
