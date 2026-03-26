public class Project {
    // Create a class Project with private fields: String projectName and boolean isCompleted. 
    private String projectName;
    boolean isCompleted;

    // Create a constructor that accepts the project name and sets isCompleted to false by default. 
    public Project (String projectName, boolean isCompleted) {
        this.projectName = projectName;
        this.isCompleted = false;
    }

    // Provide public getters for both fields, and a method completeProject() that changes the boolean to true.
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    public void completeProject() {
        isCompleted = true;
    }
}
