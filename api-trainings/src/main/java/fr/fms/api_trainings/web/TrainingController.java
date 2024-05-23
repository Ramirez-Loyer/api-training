package fr.fms.api_trainings.web;

import fr.fms.api_trainings.entities.Training;
import fr.fms.api_trainings.service.ImplTrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrainingController {
    @Autowired
    private ImplTrainingService implTrainingService;

    @GetMapping("/trainings")
    public List<Training> allTrainings(){
        return implTrainingService.getTrainings();
    }
}
