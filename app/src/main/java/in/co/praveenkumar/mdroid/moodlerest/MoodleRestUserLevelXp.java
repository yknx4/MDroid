package in.co.praveenkumar.mdroid.moodlerest;

import android.util.Log;
import java.io.BufferedReader;
import java.io.Reader;
import java.net.URLEncoder;

public class MoodleRestUserLevelXP
{
    private final String DEBUG_TAG = "MoodleRestUser";
    private String mUrl;
    private String token;

    public MoodleRestUserLevelXP(String paramString1, String paramString2)
    {
        this.mUrl = paramString1;
        this.token = paramString2;
    }

    public int getExperience(int paramInt)
    {
        int j = -1;
        int i = j;
        StringBuilder localStringBuilder;
        try
        {
            Object localObject1 = "&courseid=" + URLEncoder.encode(new StringBuilder().append(paramInt).append("").toString(), "UTF-8");
            i = j;
            Object localObject2 = this.mUrl + "/webservice/rest/server.php" + "?wstoken=" + this.token + "&wsfunction=" + "get_experience" + "&moodlewsrestformat=" + "json";
            i = j;
            localObject1 = new MoodleRestCall().fetchContent((String)localObject2, (String)localObject1);
            i = j;
            localObject2 = new BufferedReader((Reader)localObject1);
            i = j;
            localStringBuilder = new StringBuilder();
            for (;;)
            {
                i = j;
                String str = ((BufferedReader)localObject2).readLine();
                if (str == null) {
                    break;
                }
                i = j;
                localStringBuilder.append(str);
            }
            i = j;
        }
        catch (Exception localException)
        {
            Log.d("MoodleRestUser", "URL encoding failed");
            localException.printStackTrace();
            return i;
        }
        paramInt = Integer.parseInt(localStringBuilder.toString());
        i = paramInt;
        return paramInt;
    }

    public int getLevel(int paramInt)
    {
        int j = -1;
        int i = j;
        StringBuilder localStringBuilder;
        try
        {
            Object localObject1 = "&courseid=" + URLEncoder.encode(new StringBuilder().append(paramInt).append("").toString(), "UTF-8");
            i = j;
            Object localObject2 = this.mUrl + "/webservice/rest/server.php" + "?wstoken=" + this.token + "&wsfunction=" + "get_level" + "&moodlewsrestformat=" + "json";
            i = j;
            localObject1 = new MoodleRestCall().fetchContent((String)localObject2, (String)localObject1);
            i = j;
            localObject2 = new BufferedReader((Reader)localObject1);
            i = j;
            localStringBuilder = new StringBuilder();
            for (;;)
            {
                i = j;
                String str = ((BufferedReader)localObject2).readLine();
                if (str == null) {
                    break;
                }
                i = j;
                localStringBuilder.append(str);
            }
            i = j;
        }
        catch (Exception localException)
        {
            Log.d("MoodleRestUser", "URL encoding failed");
            localException.printStackTrace();
            return i;
        }
        paramInt = Integer.parseInt(localStringBuilder.toString());
        i = paramInt;
        return paramInt;
    }
}
