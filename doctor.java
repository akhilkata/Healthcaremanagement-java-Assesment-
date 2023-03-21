public class Doctor {
    private String name;
    private String specialization;
    private String phoneNumber;

    public Doctor(String name, String specialization, String phoneNumber) {
        this.name = name;
        this.specialization = specialization;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

