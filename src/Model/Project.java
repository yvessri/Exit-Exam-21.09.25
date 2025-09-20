package src.Model;
import java.util.*;

public class Project {
    private int id;
    private String name;
    private String category;
    private double targetAmount;
    private String deadline;
    private double currentAmount;
    private List<RewardTier> rewards = new ArrayList<>();

    public Project(int id, String name, String category, double targetAmount, String deadline) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.targetAmount = targetAmount;
        this.deadline = deadline;
        this.currentAmount = 0;
    }

    public void addReward(RewardTier reward) {
        rewards.add(reward);
    }

    public List<RewardTier> getRewards() { return rewards; }
    public int getId() { return id; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public double getTargetAmount() { return targetAmount; }
    public String getDeadline() { return deadline; }
    public double getCurrentAmount() { return currentAmount; }
    public void addAmount(double amt) { currentAmount += amt; }
}
