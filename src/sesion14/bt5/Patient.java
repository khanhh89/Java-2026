package sesion14.bt5;
class Patient {
    String name;
    int severity;
    String arrivalTime;

    public Patient(String name, int severity, String arrivalTime) {
        this.name = name;
        this.severity = severity;
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String toString() {
        return name + " - Severity: " + severity + ", Arrival Time: " + arrivalTime;
    }
}
