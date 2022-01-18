package Transforms;

import Parsers.CrossedData;
import Parsers.LabTest;
import Parsers.MadaReport;

import java.util.HashSet;

public class CrossDataFromCsv {
    public HashSet<CrossedData> crossData(HashSet<LabTest> labTests, HashSet<MadaReport> madaReports){
        HashSet<CrossedData> crossedData = new HashSet<>();
        for (LabTest labTest : labTests){
            for (MadaReport madaReport : madaReports){
                if (madaReport.getIDNum().equals(labTest.getIDNum())){
                    CrossedData newCrossedData = new CrossedData(madaReport.getIDNum(), madaReport.getIDType(), madaReport.getFirstName(), madaReport.getLastName(), madaReport.getCity(), madaReport.getStreet(), madaReport.getBuildingNumber(), madaReport.getBarcode(), labTest.getBirthDate(), labTest.getLabCode(), labTest.getResultDate(), madaReport.getTakeDate(), labTest.getStickerNumber(), labTest.getResultTestCorona(), labTest.getVariant(), labTest.getTestType());
                    crossedData.add(newCrossedData);
                }
            }
        }
        return crossedData;
    }
}
