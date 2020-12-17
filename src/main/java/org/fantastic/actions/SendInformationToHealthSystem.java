package org.fantastic.actions;

import org.fantastic.model.medicalDiagnosis.MedicalRecomendation;
import org.fantastic.model.medicalDiagnosis.MedicalRecomendationService;
import org.fantastic.model.medicalDiagnosis.SymptomAnaliserService;
import org.fantastic.model.patientLocation.PatientLocation;
import org.fantastic.model.personalInformation.PersonalInformation;

public class SendInformationToHealthSystem {

    public SendInformationToHealthSystem(SymptomAnaliserService symptomAnaliserService,
                                         MedicalRecomendationService medicalRecomendationService) {
    }

    public MedicalRecomendation execute(PersonalInformation personalInformation, PatientLocation patientLocation){
        return null;
    }
}
