/**
 * Implement grading system.
 */
public class GPA {
    private float gpa = 0.0f;
    private int sumCredit = 0;

    public void addGrade(int credit, float grade) {
        gpa += credit * grade;
        sumCredit += credit;
    }


    public float get() {
        if (sumCredit == 0) return 0;
        return gpa / sumCredit;
    }
    public static void main(String[] args) {
        GPA gpa = new GPA();
        System.out.println("Add data");
        gpa.addGrade(3, 4);     // Got A for 3 credits class
        gpa.addGrade(3, 3.5f);   // Got B+ for 3 credits class
        gpa.addGrade(2, 2);     // Got C for a 2 credits class
        System.out.printf("My GPS is %f\n", gpa.get());
    }
}
