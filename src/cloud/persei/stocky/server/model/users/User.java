package cloud.persei.stocky.server.model.users;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private int ID;
	
	private String username;
	private String password;
	private String salt;
	private String eMail;
	private List<Group> groups;
}
