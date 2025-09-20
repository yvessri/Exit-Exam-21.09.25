package src.View;

import src.Model.Project;
import java.util.*;

public class ProjectView {
    public void showProjects(List<Project> projects) {
        System.out.println("=== Project List ===");
        for (Project p : projects) {
            System.out.println(p.getId() + " - " + p.getName() +
                " | Category: " + p.getCategory() +
                " | Target: " + p.getTargetAmount() +
                " | Current: " + p.getCurrentAmount());
        }
    }
}

