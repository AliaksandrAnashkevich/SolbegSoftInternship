package by.solbegsoft.entity;

public enum Position {
    DEVELOPER{
        @Override
        public String workHours() {
            return "Working hours - 9PM - 6AM";
        }
    },
    MANAGER{
        @Override
        public String workHours() {
            return "Working hours - 9AM - 6PM";
        }
    },
    HR{
        @Override
        public String workHours() {
            return "Working hours - 10AM - 4PM";
        }
    };

    public String workHours(){
        return "NOT DATA";
    };
}