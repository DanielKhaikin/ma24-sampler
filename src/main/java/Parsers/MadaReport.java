package Parsers;

public class MadaReport {
    private String MDACODE;
    private String IDNum;
    private String IDType;
    private String SupplierCode;
    private String FirstName;
    private String LastName;
    private String City;
    private String Street;
    private String BuildingNumber;
    private String Barcode;
    private String GetDate;
    private String TakeDate;
    private String ResultDate;

    public MadaReport(String MDACODE, String IDNum, String IDType, String supplierCode, String firstName, String lastName, String city, String street, String buildingNumber, String barcode, String getDate, String takeDate, String resultDate) {
        this.MDACODE = MDACODE;
        this.IDNum = IDNum;
        this.IDType = IDType;
        SupplierCode = supplierCode;
        FirstName = firstName;
        LastName = lastName;
        City = city;
        Street = street;
        BuildingNumber = buildingNumber;
        Barcode = barcode;
        GetDate = getDate;
        TakeDate = takeDate;
        ResultDate = resultDate;
    }

    public String getMDACODE() {
        return MDACODE;
    }

    public void setMDACODE(String MDACODE) {
        this.MDACODE = MDACODE;
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

    public String getSupplierCode() {
        return SupplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        SupplierCode = supplierCode;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
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

    public String getGetDate() {
        return GetDate;
    }

    public void setGetDate(String getDate) {
        GetDate = getDate;
    }

    public String getTakeDate() {
        return TakeDate;
    }

    public void setTakeDate(String takeDate) {
        TakeDate = takeDate;
    }

    public String getResultDate() {
        return ResultDate;
    }

    public void setResultDate(String resultDate) {
        ResultDate = resultDate;
    }
}
