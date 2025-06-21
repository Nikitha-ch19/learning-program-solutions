public class TestMVCPattern {
    public static void main(String[] args) {
        // Create the model
        Student student = new Student();
        student.setName("Nikitha");
        student.setId("S123");
        student.setGrade("A");

        // Create the view
        StudentView view = new StudentView();

        // Create the controller
        StudentController controller = new StudentController(student, view);

        // Display initial data
        controller.updateView();

        // Modify data
        controller.setStudentName("Nikki");
        controller.setStudentGrade("A+");

        // Display updated data
        controller.updateView();
    }
}
