package chamomile;
public enum PossibleOutcomesOfChamomile {
    LOVE("любит"),
    NOLOVE("не любит"),
    SPIT("плюнет"),
    KISS("поцелует");
    private String outcome;
    PossibleOutcomesOfChamomile(String outcome) {
        this.outcome = outcome;
    }
    public String toString() {
        return outcome;
    }
}
