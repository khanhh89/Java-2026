package sesion13.bt4;
class Patient {
    private String id;
    private String name;
    private String disease;
    public Patient(String id, String name, String disease) {
        this.id = id;
        this.name = name;
        this.disease = disease;
    }
    public String getName() {
        return name;
    }
    public String getDisease() {
        return disease;
    }
    @Override
    public String toString() {
        return String.format("%s - %s - %s", id, name, disease);
    }
}