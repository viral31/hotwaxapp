public class person {
    // (PARTY_ID, FIRST_NAME, MIDDLE_NAME, LAST_NAME, GENDER, MARITAL_STATUS_ENUM_ID)
    private String PARTY_ID ;
    private  String FIRST_NAME;
    private  String MIDDLE_NAME;
    private  String LAST_NAME;
    private  String GENDER;
    private  String MARITIAL_STATUS;
    private  int ENUM_ID;
    public person(){

    }

    public person(String PARTY_ID, String FIRST_NAME, String MIDDLE_NAME, String LAST_NAME, String GENDER, String MARITIAL_STATUS, int ENUM_ID) {
        this.PARTY_ID = PARTY_ID;
        this.FIRST_NAME = FIRST_NAME;
        this.MIDDLE_NAME = MIDDLE_NAME;
        this.LAST_NAME = LAST_NAME;
        this.GENDER = GENDER;
        this.MARITIAL_STATUS = MARITIAL_STATUS;
        this.ENUM_ID = ENUM_ID;
    }

    public String getPARTY_ID() {
        return PARTY_ID;
    }

    public void setPARTY_ID(String PARTY_ID) {
        this.PARTY_ID = PARTY_ID;
    }

    public String getFIRST_NAME() {
        return FIRST_NAME;
    }

    public void setFIRST_NAME(String FIRST_NAME) {
        this.FIRST_NAME = FIRST_NAME;
    }

    public String getMIDDLE_NAME() {
        return MIDDLE_NAME;
    }

    public void setMIDDLE_NAME(String MIDDLE_NAME) {
        this.MIDDLE_NAME = MIDDLE_NAME;
    }

    public String getLAST_NAME() {
        return LAST_NAME;
    }

    public void setLAST_NAME(String LAST_NAME) {
        this.LAST_NAME = LAST_NAME;
    }

    public String getGENDER() {
        return GENDER;
    }

    public void setGENDER(String GENDER) {
        this.GENDER = GENDER;
    }

    public String getMARITIAL_STATUS() {
        return MARITIAL_STATUS;
    }

    public void setMARITIAL_STATUS(String MARITIAL_STATUS) {
        this.MARITIAL_STATUS = MARITIAL_STATUS;
    }

    public int getENUM_ID() {
        return ENUM_ID;
    }

    public void setENUM_ID(int ENUM_ID) {
        this.ENUM_ID = ENUM_ID;
    }
    @Override
    public String toString() {
        return "Person{" +
                "PARTY_ID=" + PARTY_ID +
                ", FIRST_NAME='" + FIRST_NAME + '\'' +
                ", MIDDLE_NAME='" + MIDDLE_NAME + '\'' +
                ", LAST_NAME='" + LAST_NAME + '\'' +
                ", GENDER='" + GENDER + '\'' +
                ", MARITAL_STATUS='" + MARITIAL_STATUS + '\'' +
                ", ENUM_ID=" + ENUM_ID +
                '}';
    }
}

