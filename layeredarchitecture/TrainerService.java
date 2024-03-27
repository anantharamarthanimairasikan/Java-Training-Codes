package layeredarchitecture;



public interface TrainerService {
	//create new trainer
	public String addTrainer(Trainer trainer);
	//getting trainer info
	public String getTrainerinfo(Trainer trainer);
	//updating trainer info
	public String updateTrainerinfo(Trainer trainer);
	//deleting trainer info
	public String DeleteTrainer(Trainer trainer);
	
	public String verifyTrainerameAndPassword1(Trainer trainerid);
	public String verifyTrainerameAndPassword(Trainer trainername);
	

}
