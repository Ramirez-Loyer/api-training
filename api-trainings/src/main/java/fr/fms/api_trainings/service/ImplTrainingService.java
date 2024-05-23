package fr.fms.api_trainings.service;

import fr.fms.api_trainings.dao.TrainingRepository;
import fr.fms.api_trainings.entities.Training;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ImplTrainingService implements ITrainingService {

    @Autowired()
    TrainingRepository trainingRepository;

    @Override
    public List<Training> getTrainings() { return trainingRepository.findAll();
    }
}
