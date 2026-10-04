public class GraduateStudent extends Student {
    private int teachingAssistantHours;
    private double annualResearchGrant;

    public GraduateStudent(String name, int teachingAssistantHours, double annualResearchGrant) {
        super(name);
        this.teachingAssistantHours = teachingAssistantHours;
        this.annualResearchGrant = annualResearchGrant;
    }

    @Override
    public double calculateMonthlyStipend() {
        double base = 1200;
        double teachingAssistantPay = teachingAssistantHours * 25;
        double monthlyResearchGrant = annualResearchGrant / 12;

        return base + teachingAssistantPay + monthlyResearchGrant;
    }
}
