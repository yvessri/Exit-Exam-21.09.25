package src.View;

import src.Model.*;

public class ProjectDetailView {
   public void showDetail(Project p) {
        System.out.println("\n=== Project Detail ===");
        System.out.println("Name: " + p.getName());
        System.out.println("Category: " + p.getCategory());
        System.out.println("Progress: " + p.getCurrentAmount() + "/" + p.getTargetAmount());
        System.out.println("Reward Tiers:");
        for (RewardTier r : p.getRewards()) {
            System.out.println("- " + r.getTitle() + " (Min " + r.getMinAmount() + ", quota: " + r.getQuota() + ")");
        }
   }    
}

