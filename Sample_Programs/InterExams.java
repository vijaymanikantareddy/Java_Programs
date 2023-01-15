import java.util.Scanner;
interface Internal_exam
{
    void get_InternalMarks();
    void show_InternalMarks();
}

interface External_exam
{
    void get_ExternalMarks();
    void show_ExternalMarks();
}

interface Exam extends Internal_exam, External_exam{
    void show_marks();
}

class InterExams implements Exam
{
    Scanner s = new Scanner(System.in);
    int m1, c1, p1, m2, p2, c2, s1, s2, s3;
    public void get_InternalMarks()
    {
        System.out.println("Enter the 3 subjects internal marks: ");
        m1 = s.nextInt();
        p1 = s.nextInt();
        c1 = s.nextInt();
    }

    public void show_InternalMarks()
    {
        System.out.println("Internal Marks: ");
        System.out.println("Maths = "+m1+" \nPhysics = "+p1 +" \nChemistry = "+c1);
    }

    public void get_ExternalMarks()
    {
        System.out.println("Enter the 3 subjects external marks: ");
        m2 = s.nextInt();
        p2 = s.nextInt();
        c2 = s.nextInt();
    }

    public void show_ExternalMarks()
    {
        System.out.println("External Marks: ");
        System.out.println("Maths = "+m2+" \nPhysics = "+p2 +" \nChemistry = "+c2);
    }

    public void show_marks()
    {
        s1 = m1+m2;
        s2 = p1+p2;
        s3 = c1+c2;
        System.out.println("Total Marks are : "+(s1+s2+s3));
    }
    public static void main(String args[])
    {
        Exam ie;
        ie = new InterExams();
        ie.get_InternalMarks();
        ie.get_ExternalMarks();
        ie.show_InternalMarks();
        ie.show_ExternalMarks();
        ie.show_marks();
    }
}