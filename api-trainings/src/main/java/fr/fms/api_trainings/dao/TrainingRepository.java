package fr.fms.api_trainings.dao;

import fr.fms.api_trainings.entities.Training;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainingRepository extends JpaRepository<Training, Long> {

}
