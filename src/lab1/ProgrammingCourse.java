/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author djanusz
 */
public abstract class ProgrammingCourse {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public final String getCourseName() {
        return courseName;
    }

    public abstract void setCourseName(String courceName);
//    public void setCourseName(String courseName) {
//        this.courseName = courseName;
//    }

    public final String getCourseNumber() {
        return courseNumber;
    }

    public abstract void setCourseNumber(String courseNumber);
//    public void setCourseNumber(String courseNumber) {
//        this.courseNumber = courseNumber;
//    }

    public final double getCredits() {
        return credits;
    }

    public abstract void setCredits(double credits);
//    public void setCredits(double credits) {
//        this.credits = credits;
//    }

    public final String getPrerequisites() {
        return prerequisites;
    }

    public abstract void setPrerequisites(String prerequisites)
//    public void setPrerequisites(String prerequisites) {
//        this.prerequisites = prerequisites;
//    }
    
    
}
