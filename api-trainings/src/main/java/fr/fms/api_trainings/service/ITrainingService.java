package fr.fms.api_trainings.service;

import fr.fms.api_trainings.entities.Training;

import java.util.List;

public interface ITrainingService {
    List<Training> getTrainings();
}
