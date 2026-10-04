public class StipendCalculatorDemo {
    public static void main(String[] args) {
        Student[] students = {
                new UndergraduateStudent("Alice", 3.8),
                new UndergraduateStudent("Jordan", 3.5),
                new GraduateStudent("Morgan", 10, 36000)
        };

        for (Student student : students) {
            System.out.println(
                    student.getName() + ": $" + student.calculateMonthlyStipend());
        }
    }
}
