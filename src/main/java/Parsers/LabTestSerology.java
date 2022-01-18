package Parsers;


import java.sql.Date;

public class LabTestSerology {
    private String IDnum;
    private int IDType;
    private String firstName;
    private String lastName;
    private Date resultDate;
    private Date birthDate;
    private String labCode;
    private String stickerNumber;
    private int antidotes;
    private int kitNumber;

    public LabTestSerology(String IDnum, int IDType, String firstName, String lastName, Date resultDate, Date birthDate, String labCode, String stickerNumber, int antidotes, int kitNumber) {
        this.IDnum = IDnum;
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

    public String getIDnum() {
        return IDnum;
    }

    public void setIDnum(String IDnum) {
        this.IDnum = IDnum;
    }

    public int getIDType() {
        return IDType;
    }

    public void setIDType(int IDType) {
        this.IDType = IDType;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getResultDate() {
        return resultDate;
    }

    public void setResultDate(Date resultDate) {
        this.resultDate = resultDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getLabCode() {
        return labCode;
    }

    public void setLabCode(String labCode) {
        this.labCode = labCode;
    }

    public String getStickerNumber() {
        return stickerNumber;
    }

    public void setStickerNumber(String stickerNumber) {
        this.stickerNumber = stickerNumber;
    }

    public int getAntidotes() {
        return antidotes;
    }

    public void setAntidotes(int antidotes) {
        this.antidotes = antidotes;
    }

    public int getKitNumber() {
        return kitNumber;
    }

    public void setKitNumber(int kitNumber) {
        this.kitNumber = kitNumber;
    }
}
