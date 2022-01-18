package Parsers;

public class LabTestSerology {
    private String IDNum;
    private String IDType;
    private String firstName;
    private String lastName;
    private String resultDate;
    private String birthDate;
    private String labCode;
    private String stickerNumber;
    private String antidotes;
    private String kitNumber;

    public LabTestSerology(String IDNum, String IDType, String firstName, String lastName, String resultDate, String birthDate, String labCode, String stickerNumber, String antidotes, String kitNumber) {
        this.IDNum = IDNum;
        this.IDType = IDType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.resultDate = resultDate;
        this.birthDate = birthDate;
        this.labCode = labCode;
        this.stickerNumber = stickerNumber;
        this.antidotes = antidotes;
        this.kitNumber = kitNumber;
    }
}
