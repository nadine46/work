public class UndergraduateStudent extends Student {
    private double gpa;

    public UndergraduateStudent(String name, double gpa) {
        super(name);
        this.gpa = gpa;
    }

    @Override
    public double calculateMonthlyStipend() {
        double stipend = 500;
        if (gpa > 3.5) {
            stipend += 150;
        }
        return stipend;
    }
}
