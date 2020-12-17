package org.fantastic.infrastructure.repositories;

import org.fantastic.model.medicalDiagnosis.Symptom;
import org.fantastic.model.medicalDiagnosis.SymptomsRepository;
import org.fantastic.model.personalInformation.EyesColor;

import java.util.List;

public class InMemorySymptomsRepository implements SymptomsRepository {
    @Override
    public List<Symptom> getSymptoms(EyesColor eyesColor) {
        return null;
    }
}
