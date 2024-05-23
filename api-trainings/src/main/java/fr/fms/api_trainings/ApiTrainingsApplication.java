package fr.fms.api_trainings;

import fr.fms.api_trainings.dao.TrainingRepository;
import fr.fms.api_trainings.entities.Training;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiTrainingsApplication implements CommandLineRunner {
	@Autowired
	private TrainingRepository trainingRepository;

	public static void main(String[] args) {
		SpringApplication.run(ApiTrainingsApplication.class, args);
	}

	@Override
	public void run(String...args) throws Exception {
		trainingRepository.save(new Training(null, "Java", "pour les nuls", 200, 1));
	}
}
