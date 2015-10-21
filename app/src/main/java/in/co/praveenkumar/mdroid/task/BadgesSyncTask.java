package in.co.praveenkumar.mdroid.task;

import java.util.List;

import in.co.praveenkumar.mdroid.model.MoodleBadge;
import in.co.praveenkumar.mdroid.model.MoodleSiteInfo;
import in.co.praveenkumar.mdroid.moodlerest.MoodleRestBadge;

/**
 * Created by yknx4 on 20/10/2015.
 */
public class BadgesSyncTask {
    private MoodleSiteInfo info;

    public BadgesSyncTask(MoodleSiteInfo info) {

        this.info = info;
    }

    public boolean newBadges = false;
    public String error;

    public Boolean syncBadges() {
        MoodleRestBadge mrb = new MoodleRestBadge(info.getSiteurl(), info.getToken());
        List<MoodleBadge> mBadges = mrb.getBadgesForUser(info.getUsername());
        /** Error checking **/
        // Some network or encoding issue.
        if (mBadges == null || mBadges.size() == 0) {
            error = "No badges found!";
            return false;
        }

        List<MoodleBadge> dbBadges;
        MoodleBadge mBadge = new MoodleBadge();
        for (int i = 0; i < mBadges.size(); i++) {
            mBadge = mBadges.get(i);
            mBadge.setSiteId(info.getId());
            mBadge.setUserId((long) info.getUserid());
            mBadge.setUserName(info.getUsername());
            dbBadges = MoodleBadge.find(MoodleBadge.class,
                    "username = ? and site_id = ? and name = ?",
                    info.getUsername(), info.getId() + "", mBadge.getName());
            if (dbBadges.size() > 0) {
                mBadge.setId(dbBadges.get(0).getId());
            } else {
                newBadges = true;
            }
            mBadge.save();
        }

        return true;
    }
}
