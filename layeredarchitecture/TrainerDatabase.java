package layeredarchitecture;

public interface TrainerDatabase {
	//create new trainer
		public String addTrainer(Trainer trainername);
		//getting trainer info
		public String getTrainerInfo(Trainer trainername);
		//updating trainer info
		public String updateTrainerInfo(Trainer trainername);;
		//deleting trainer info
		public String deleteTrainer(Trainer trainername);
		
		public String addTrainer1(Trainer trainerid);
		//getting trainer info
		public String getTrainerInfo1(Trainer trainerid);
		//updating trainer info
		public String updateTrainerInfo1(Trainer trainerid);;
		//deleting trainer info
		public String deleteTrainer1(Trainer trainerid);
		
		public Trainer getUserDetails(String trainername);
		
		public Trainer getUserDetails(int trainerid);


}
