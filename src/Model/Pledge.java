package src.Model;

public class Pledge {
    private User user;
    private Project project;
    private double amount;
    private RewardTier reward;
    private String status; // SUCCESS / FAILED

    public Pledge(User user, Project project, double amount, RewardTier reward, String status) {
        this.user = user;
        this.project = project;
        this.amount = amount;
        this.reward = reward;
        this.status = status;
    }

    public String getStatus() { return status; }
}
