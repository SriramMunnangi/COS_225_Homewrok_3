class Patient {
    private int ID;
    int caffeineLevel;

    public Patient(int ID, int caffeineLevel) {
        this.ID = ID;
        this.caffeineLevel = caffeineLevel;
    }

    public int getID() {
        return ID;
    }

    public int getCaffeineLevel() {
        return caffeineLevel;
    }

    @Override
    public String toString() {
        return ID + " " + caffeineLevel;
    }
}
