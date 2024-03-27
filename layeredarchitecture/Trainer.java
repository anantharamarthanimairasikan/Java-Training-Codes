package layeredarchitecture;

public class Trainer {
	
	public Trainer() {
		super();
	}

	public Trainer(int trainerid, String trainername, String password) {
		super();
		this.trainerid = trainerid;
		this.trainername = trainername;
		this.password = password;
	}

	public Trainer(int trainerid, String password) {
		super();
		this.trainerid = trainerid;
		this.password = password;
	}
	
	public Trainer(String trainername, String password) {
		super();
		this.trainername = trainername;
		this.password = password;
	}
	
	
	private int trainerid;
	private String trainername;
	private String password;
	public int getTrainerid() {
		return trainerid;
	}
	public void setTrainerid(int trainerid) {
		this.trainerid = trainerid;
	}
	public String getTrainername() {
		return trainername;
	}
	public void setTrainername(String trainername) {
		this.trainername = trainername;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Trainer [trainerid=" + trainerid + ", trainername=" + trainername + ", password=" + password + "]";
	}
	
	
	
	

}
