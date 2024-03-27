package layeredarchitecture;

public class TrainerServices implements TrainerService {
	@Override
	public String addTrainer(Trainer trainer) {
		TrainerDatabase trainer1 = new TrainerDatabaseworks();
		return trainer1.addTrainer(trainer);
		
	}

	@Override
	public String getTrainerinfo(Trainer trainer) {
		TrainerDatabase trainer1 = new TrainerDatabaseworks();
		return trainer1.getTrainerInfo(trainer);
	}

	@Override
	public String updateTrainerinfo(Trainer trainer) {
		TrainerDatabase trainer1 = new TrainerDatabaseworks();
		return trainer1.updateTrainerInfo(trainer);
	}

	@Override
	public String DeleteTrainer(Trainer trainer) {
		TrainerDatabase trainer1 = new TrainerDatabaseworks();
		return trainer1.deleteTrainer(trainer);
	}

	@Override
	public String verifyTrainerameAndPassword1(Trainer trainer) {
		TrainerDatabase trainer1 = new TrainerDatabaseworks();
		Trainer Trainerlogin = trainer1.getUserDetails(trainer.getTrainername());
		if(trainer.getTrainername().equals(Trainerlogin.getTrainername())) {
			return "User logged in successfully";
		}
		return "User details mismatch";
	}

	@Override
	public String verifyTrainerameAndPassword(Trainer trainer) {
		TrainerDatabase trainer1 = new TrainerDatabaseworks();
		Trainer Trainerlogin = trainer1.getUserDetails(trainer.getTrainername());
		if(trainer.getTrainername().equals(Trainerlogin.getTrainername())) {
			return "User logged in successfully";
		}
		return "User details mismatch";
	
	}

	
	

	

	
	}

	

