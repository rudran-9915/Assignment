package org.example.Assignment3.EmployeeManagement;

public class Manager extends Employee{
    private int teamSize;
    private String projectName;

    public Manager(int id, String name, double salary, String department, int teamSize, String projectName) {
        super(id, name, salary, department);
        this.teamSize = teamSize;
        this.projectName = projectName;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }


    public String displayManagerDetails() {
        return "Manager{" +
                "teamSize=" + teamSize +
                ", projectName='" + projectName + '\'' +
                '}';
    }
}
