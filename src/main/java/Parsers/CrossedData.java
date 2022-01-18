package Parsers;

public class CrossedData {
    private String IDNum;
    private String IDType;
    private String firstName;
    private String lastName;
    private String City;
    private String Street;
    private String BuildingNumber;
    private String Barcode;
    private String BirthDate;
    private String LabCode;
    private String ResultDate;
    private String TakeDate;
    private String StickerNumber;
    private String ResultTestCorona;
    private String variant;
    private String testType;

    public CrossedData(String IDNum, String IDType, String firstName, String lastName, String city, String street, String buildingNumber, String barcode, String birthDate, String labCode, String resultDate, String takeDate, String stickerNumber, String resultTestCorona, String variant, String testType) {
        this.IDNum = IDNum;
        this.IDType = IDType;
        this.firstName = firstName;
        this.lastName = lastName;
        City = city;
        Street = street;
        BuildingNumber = buildingNumber;
        Barcode = barcode;
        BirthDate = birthDate;
        LabCode = labCode;
        ResultDate = resultDate;
        TakeDate = takeDate;
        StickerNumber = stickerNumber;
        ResultTestCorona = resultTestCorona;
        this.variant = variant;
        this.testType = testType;
    }

    public String getIDNum() {
        return IDNum;
    }

    public void setIDNum(String IDNum) {
        this.IDNum = IDNum;
    }

    public String getIDType() {
        return IDType;
    }

    public void setIDType(String IDType) {
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

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getBuildingNumber() {
        return BuildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        BuildingNumber = buildingNumber;
    }

    public String getBarcode() {
        return Barcode;
    }

    public void setBarcode(String barcode) {
        Barcode = barcode;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String birthDate) {
        BirthDate = birthDate;
    }

    public String getLabCode() {
        return LabCode;
    }

    public void setLabCode(String labCode) {
        LabCode = labCode;
    }

    public String getResultDate() {
        return ResultDate;
    }

    public void setResultDate(String resultDate) {
        ResultDate = resultDate;
    }

    public String getTakeDate() {
        return TakeDate;
    }

    public void setTakeDate(String takeDate) {
        TakeDate = takeDate;
    }

    public String getStickerNumber() {
        return StickerNumber;
    }

    public void setStickerNumber(String stickerNumber) {
        StickerNumber = stickerNumber;
    }

    public String getResultTestCorona() {
        return ResultTestCorona;
    }

    public void setResultTestCorona(String resultTestCorona) {
        ResultTestCorona = resultTestCorona;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }
}
