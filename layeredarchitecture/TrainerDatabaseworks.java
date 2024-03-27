package layeredarchitecture;

public class TrainerDatabaseworks implements  TrainerDatabase {

	@Override
	public String addTrainer(Trainer trainername) {
		System.out.println(trainername);
		return "Added successfully";
	}

	@Override
	public String getTrainerInfo(Trainer trainername) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateTrainerInfo(Trainer trainername) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteTrainer(Trainer trainername) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addTrainer1(Trainer trainerid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTrainerInfo1(Trainer trainerid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateTrainerInfo1(Trainer trainerid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteTrainer1(Trainer trainerid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Trainer getUserDetails(String trainername) {
		Trainer trainer =new Trainer("Ashwin", "pass@2002");
		if(trainer.getTrainername().equals(trainername)) {
			return trainer;
		}
		return null;
	}

	@Override
	public Trainer getUserDetails(int trainerid) {
		// TODO Auto-generated method stub
		return null;
	}

	
	}


	

	


