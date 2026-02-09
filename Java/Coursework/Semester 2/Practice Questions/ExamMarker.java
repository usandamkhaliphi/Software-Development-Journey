public class ExamMarker 
{
    public int[] marks;

    public ExamMarker(int[] marks) 
    {
        this.marks = marks;
    }

    public int failed() 
    {
        int count = 0;
        for (int counter = 0; counter <= 9; counter++) 
        {
            if (marks[counter] < 50) 
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) 
    {
        int[] marksArray = new int[10];
        marksArray[0] = 56;
        marksArray[1] = 84;
        marksArray[2] = 43;
        marksArray[3] = 24;
        marksArray[4] = 49;
        marksArray[5] = 82;
        marksArray[6] = 29;
        marksArray[7] = 72;
        marksArray[8] = 93;
        marksArray[9] = 37;

        ExamMarker exam = new ExamMarker(marksArray);

        System.out.println(exam.failed());
    }
}
