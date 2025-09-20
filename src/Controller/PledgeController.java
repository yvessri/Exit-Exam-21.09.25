package src.Controller;

import src.Model.*;
import java.util.*;

public class PledgeController {
    private List<Pledge> pledges = new ArrayList<>();
    private int failedCount = 0;

    public void makePledge(User user, Project project, double amount, RewardTier reward) {
        if (reward != null) {
            if (amount >= reward.getMinAmount() && reward.getQuota() > 0) {
                pledges.add(new Pledge(user, project, amount, reward, "SUCCESS"));
                project.addAmount(amount);
                reward.reduceQuota();
            } else {
                pledges.add(new Pledge(user, project, amount, reward, "FAILED"));
                failedCount++;
            }
        } else {
            if (amount > 0) {
                pledges.add(new Pledge(user, project, amount, null, "SUCCESS"));
                project.addAmount(amount);
            } else {
                pledges.add(new Pledge(user, project, amount, null, "FAILED"));
                failedCount++;
            }
        }
    }

    public int getFailedCount() { return failedCount; }
    public List<Pledge> getPledges() { return pledges; }
}

