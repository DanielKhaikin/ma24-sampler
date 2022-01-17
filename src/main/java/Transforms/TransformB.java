package Transforms;

import health_care_provider.HealthCareInfoProvider;
import health_care_provider.errors.InvalidIdException;
import health_care_provider.models.PersonInsured;

public class TransformB {

    public PersonInsured start(String IDNum, String IDType){
        HealthCareInfoProvider healthCareInfoProvider = new HealthCareInfoProvider();
        PersonInsured personInsured = null;
        try {
            personInsured = healthCareInfoProvider.fetchInfo(Integer.parseInt(IDNum),Integer.parseInt(IDType));
        } catch (InvalidIdException e) {
            e.printStackTrace();
        }
        return personInsured;
    }

    public String getJoin(String IDNum, String IDType){
        PersonInsured personInsured = start(IDNum,IDType);
        if (personInsured == null){
            return null;
        }
        return String.valueOf(personInsured.getJoinDate());
    }

    public String getHealthID(String IDNum, String IDType){
        PersonInsured personInsured = start(IDNum,IDType);
        if (personInsured == null){
            return null;
        }
        return String.valueOf(personInsured.getHealthCareId());
    }

    public String getHealthName(String IDNum, String IDType){
        PersonInsured personInsured = start(IDNum,IDType);
        if (personInsured == null){
            return null;
        }
        return personInsured.getHealthCareName();
    }
}
