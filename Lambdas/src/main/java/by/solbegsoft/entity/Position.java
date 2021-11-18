package by.solbegsoft.entity;

public enum Position {
    DEVELOPER,
    MANAGER,
    HR;

    private static final String WORK_HORS="Working hours - 9PM - 6AM";

    public String workHours(){
        return WORK_HORS;
    }
}
