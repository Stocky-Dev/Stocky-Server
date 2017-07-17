package cloud.persei.stocky.server.model.users;

import java.util.List;

public class User {
	private String username;
	private String password;
	private String salt;
	private String eMail;
	private List<Group> groups;
}
