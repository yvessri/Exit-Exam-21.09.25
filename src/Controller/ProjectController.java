package src.Controller;

import src.Model.*;
import java.util.*;

public class ProjectController {
    private List<Project> projects = new ArrayList<>();

    public void addProject(Project p) {
        projects.add(p);
    }

    public List<Project> getAllProjects() {
        return projects;
    }

    public Project getProjectById(int id) {
        for (Project p : projects) {
            if (p.getId() == id) return p;
        }
        return null;
    }
}

