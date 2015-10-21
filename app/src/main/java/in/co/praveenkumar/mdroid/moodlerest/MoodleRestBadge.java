package in.co.praveenkumar.mdroid.moodlerest;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import in.co.praveenkumar.mdroid.helper.GsonExclude;
import in.co.praveenkumar.mdroid.model.MoodleBadge;

/**
 * Created by yknx4 on 20/10/2015.
 */
public class MoodleRestBadge {

    private final String DEBUG_TAG = "MoodleRestBadge";
    private String mUrl;
    private String token;

    public MoodleRestBadge(String mUrl, String token) {
        this.mUrl = mUrl;
        this.token = token;
    }

    public List<MoodleBadge> getBadgesForUser(String username) {
        List<MoodleBadge> badges = new ArrayList<>();
        String format = MoodleRestOption.RESPONSE_FORMAT;
        String function = MoodleRestOption.FUNCTION_GET_BADGES;
        String params = "&username=" + username;
        try {
            String restUrl = mUrl + "/webservice/rest/server.php" + "?wstoken="
                    + token + "&wsfunction=" + function
                    + "&moodlewsrestformat=" + format;

            // Fetch content now.
            MoodleRestCall mrc = new MoodleRestCall();
            Reader reader = mrc.fetchContent(restUrl, params);
            GsonExclude ex = new GsonExclude();
            Gson gson = new GsonBuilder()
                    .addDeserializationExclusionStrategy(ex)
                    .addSerializationExclusionStrategy(ex).create();
            badges = gson.fromJson(reader, new TypeToken<List<MoodleBadge>>() {
            }.getType());
            reader.close();

        } catch (Exception e) {
            Log.d(DEBUG_TAG, "URL encoding failed");
            e.printStackTrace();
        }


        return badges;
    }


}
