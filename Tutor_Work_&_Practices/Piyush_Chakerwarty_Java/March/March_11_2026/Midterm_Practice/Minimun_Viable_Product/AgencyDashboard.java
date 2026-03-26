import java.util.ArrayList;

public class AgencyDashboard {
    // Declare and initialize a private ArrayList of type Project. 
    private ArrayList<Project> project = new ArrayList<Project>();

    // Create a method addProject(Project p) to add a new project to the list. 
    public void addProject(Project p) {
        project.add(p);
    }

    // In the AgencyDashboard class, write a method printPendingProjects(). 
    // Use an enhanced for-loop to iterate through the list 
    // and print the names of only the projects where isCompleted is false. 
    public void printPendingProjects() {
        for (Project p : project) {
            if (!p.isCompleted()) {
                System.out.println(p.getProjectName());
            }
        }
    }

    public static void main(String[] args) {
        AgencyDashboard dashboard = new AgencyDashboard();
        // Test the projects.
        Project project1 = new Project("Website Redesign", false);
        Project project2 = new Project("Logo Design", true);
        Project project3 = new Project("Mobile App", false);

        dashboard.printPendingProjects();
    }
}

