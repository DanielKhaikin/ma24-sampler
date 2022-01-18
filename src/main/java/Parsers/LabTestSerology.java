package Parsers;

import java.time.LocalDate;

public class LabTestSerology {
    private String IDNum;
    private int IDType;
    private String firstName;
    private String lastName;
    private LocalDate resultDate;
    private LocalDate birthDate;
    private String labCode;
    private String stickerNumber;
    private int antidotes;
    private int kitNumber;

    public LabTestSerology(String IDNum, int IDType, String firstName, String lastName, LocalDate resultDate, LocalDate birthDate, String labCode, String stickerNumber, int antidotes, int kitNumber) {
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
