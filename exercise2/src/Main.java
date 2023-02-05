public class Main {
    public static void main(String[] args) {
        Course course = new Course("Computer Science 101");

        Student john = new Student("John Smith", 20, 3.5);
        Student jane = new Student("Jane Doe", 21, 3.8);
        Student bob = new Student("Bob Johnson", 22, 2.5);

        course.addStudent(john);
        course.addStudent(jane);
        course.addStudent(bob);

        System.out.println("Student names before removal :");
        course.printStudents();

        course.removeStudent(bob);

        System.out.println("Student names after removal :");
        course.printStudents();
    }
}
