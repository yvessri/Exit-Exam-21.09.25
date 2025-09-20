package src.Model;

public class RewardTier {
    private String title;
    private double minAmount;
    private int quota;

    public RewardTier(String title, double minAmount, int quota) {
        this.title = title;
        this.minAmount = minAmount;
        this.quota = quota;
    }

    public String getTitle() { return title; }
    public double getMinAmount() { return minAmount; }
    public int getQuota() { return quota; }
    public void reduceQuota() { if (quota > 0) quota--; }
}

