public abstract class Student {
    private String name;

    protected Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double calculateMonthlyStipend();
}
