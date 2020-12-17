package org.fantastic.model.medicalDiagnosis;

import org.fantastic.model.personalInformation.EyesColor;

import java.util.List;

public interface SymptomsRepository {

    List<Symptom> getSymptoms(EyesColor eyesColor);
}
