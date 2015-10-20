package in.co.praveenkumar.mdroid.model;

import com.google.gson.annotations.SerializedName;
import com.orm.SugarRecord;

public class MoodleUserLevelXp
        extends SugarRecord<MoodleUserLevelXp>
{
    @SerializedName("level")
    int level;
    @SerializedName("id")
    int ulid;
    @SerializedName("userid")
    int userid;
    @SerializedName("xp")
    int xp;

    public int getLevel()
    {
        return this.level;
    }

    public int getUlid()
    {
        return this.ulid;
    }

    public int getUserid()
    {
        return this.userid;
    }

    public int getXp()
    {
        return this.xp;
    }

    public void setLevel(int paramInt)
    {
        this.level = paramInt;
    }

    public void setUserid(int paramInt)
    {
        this.userid = paramInt;
    }

    public void setXp(int paramInt)
    {
        this.xp = paramInt;
    }
}
