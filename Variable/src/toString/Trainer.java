package toString;

public class Trainer {
	int trainerId;
	String trainerName;
	String trainerSubject;
	
	public void setTrainerData(int trainerId, String trainerName, String trainerSubject) {
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.trainerSubject = trainerSubject;
	}

	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", trainerName=" + trainerName + ", trainerSubject=" + trainerSubject
				+ "]";
	}
}
