package layeredarchitecture;

public class LoginServiceImp implements LoginService {
	@Override
	public String verifyUserNameAndPassword(Login login) {
		LoginDAO loginDAO = new LoginDAOImp();
		Login loginFromDB = loginDAO.getUserDetails(login.getUserName());
		if(login.getPassword().equals(loginFromDB.getPassword())) {
			return "User logged in successfully";
		}
		return "User details mismatch";
		
	}

}
