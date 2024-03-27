package layeredarchitecture;

public class LoginDAOImp implements LoginDAO {
	@Override
	public Login getUserDetails(String userName) {
		//In real application login details we will get it from DB
		Login login = new Login("Ashwin", "pass@2002");
		Login login1 = new Login("Harish","harish@2001");
		
		if(login.getUserName().equals(userName)) {
			return login;
		}
		
		if(login1.getUserName().equals(userName)) {
			return login1;
		}
		return null;
	}

}
