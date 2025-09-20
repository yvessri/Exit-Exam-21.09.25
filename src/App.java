package src;

import src.Controller.*;
import src.Model.*;
import src.View.*;

public class App {
    public static void main(String[] args) {
        ProjectController projectController = new ProjectController();
        PledgeController pledgeController = new PledgeController();
        ProjectView projectView = new ProjectView();
        ProjectDetailView detailView = new ProjectDetailView();
        StatsView statsView = new StatsView();

        // Users (10 คน)
        User u1 = new User(1, "Alice");
        User u2 = new User(2, "Bob");
        User u3 = new User(3, "Charlie");
        User u4 = new User(4, "Diana");
        User u5 = new User(5, "Ethan");
        User u6 = new User(6, "Fiona");
        User u7 = new User(7, "George");
        User u8 = new User(8, "Hannah");
        User u9 = new User(9, "Ian");
        User u10 = new User(10, "Jane");

        // Projects (8 โปรเจกต์)
        Project p1 = new Project(10000001, "Tree Planting", "Environment", 5000, "2025-12-31");
        p1.addReward(new RewardTier("T-Shirt", 500, 5));
        p1.addReward(new RewardTier("Eco Bag", 1000, 3));
        projectController.addProject(p1);

        Project p2 = new Project(10000002, "Clean Ocean", "Environment", 10000, "2026-01-15");
        p2.addReward(new RewardTier("Sticker Pack", 200, 10));
        p2.addReward(new RewardTier("Reusable Bottle", 800, 5));
        projectController.addProject(p2);

        Project p3 = new Project(10000003, "Community Library", "Education", 15000, "2025-11-30");
        p3.addReward(new RewardTier("Bookmark", 100, 20));
        p3.addReward(new RewardTier("Library Tote Bag", 600, 7));
        projectController.addProject(p3);

        Project p4 = new Project(10000004, "Animal Shelter", "Animal Welfare", 7000, "2025-10-10");
        p4.addReward(new RewardTier("Pet Bandana", 300, 8));
        p4.addReward(new RewardTier("T-Shirt", 700, 5));
        projectController.addProject(p4);

        Project p5 = new Project(10000005, "Art for All", "Arts", 12000, "2026-02-20");
        p5.addReward(new RewardTier("Print Poster", 400, 10));
        p5.addReward(new RewardTier("Art Book", 1500, 3));
        projectController.addProject(p5);

        Project p6 = new Project(10000006, "Tech for Kids", "Education", 9000, "2025-12-01");
        p6.addReward(new RewardTier("USB Drive", 350, 12));
        p6.addReward(new RewardTier("T-Shirt", 900, 6));
        projectController.addProject(p6);

        Project p7 = new Project(10000007, "Urban Garden", "Environment", 8000, "2026-03-10");
        p7.addReward(new RewardTier("Seed Packets", 150, 20));
        p7.addReward(new RewardTier("Garden Tools Set", 1000, 4));
        projectController.addProject(p7);

        Project p8 = new Project(10000008, "Music for Everyone", "Arts", 11000, "2025-09-30");
        p8.addReward(new RewardTier("Digital Album", 250, 15));
        p8.addReward(new RewardTier("Concert Ticket", 2000, 5));
        projectController.addProject(p8);

        
        projectView.showProjects(projectController.getAllProjects());

        
        detailView.showDetail(p1);

        
        pledgeController.makePledge(u1, p1, 200, p1.getRewards().get(0)); // FAIL (ยอดน้อยกว่า reward tier)
        pledgeController.makePledge(u2, p1, 1000, p1.getRewards().get(1)); // SUCCESS
        pledgeController.makePledge(u3, p3, 600, p3.getRewards().get(1));  // SUCCESS
        pledgeController.makePledge(u4, p4, 200, p4.getRewards().get(0));  // FAIL

        
        detailView.showDetail(p1);

        
        statsView.showStats(pledgeController.getFailedCount());
    }
}
