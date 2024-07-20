public class StudentResult {

    public static void main(String[] args) {
        // Example marks
        int[] marks = {85, 78, 90, 66, 70};
        
        // Calculate the result
        Result result = calculateResult(marks);
        
        // Print the result
        System.out.println("Total Marks: " + result.totalMarks);
        System.out.println("Average Marks: " + result.averageMarks);
        System.out.println("Result: " + result.result);
    }

    public static Result calculateResult(int[] marks) {
        int passingPercentage = 40;
        int totalMarks = 0;
        boolean passedAllSubjects = true;
        
        // Calculate total marks and check if student passed all subjects
        for (int mark : marks) {
            totalMarks += mark;
            if (mark < passingPercentage) {
                passedAllSubjects = false;
            }
        }
        
        double averageMarks = (double) totalMarks / marks.length;
        String result = passedAllSubjects ? "Pass" : "Fail";
        
        return new Result(totalMarks, averageMarks, result);
    }
}

class Result {
    int totalMarks;
    double averageMarks;
    String result;

    Result(int totalMarks, double averageMarks, String result) {
        this.totalMarks = totalMarks;
        this.averageMarks = averageMarks;
        this.result = result;
    }
}
