package in.co.praveenkumar.mdroid.model;

import com.google.gson.annotations.SerializedName;
import com.orm.SugarRecord;
import com.orm.dsl.Ignore;
import java.util.ArrayList;

public class MoodleCourse
		extends SugarRecord<MoodleCourse>
{
	@SerializedName("categoryid")
	int categoryid;
	@SerializedName("categorysortorder")
	int categorysortorder;
	@SerializedName("completionnotify")
	int completionnotify;
	@SerializedName("courseformatoptions")
	@Ignore
	ArrayList<MoodleCourseFormatOption> courseformatoptions;
	@SerializedName("id")
	int courseid;
	@SerializedName("debuginfo")
	@Ignore
	String debuginfo;
	@SerializedName("defaultgroupingid")
	int defaultgroupingid;
	@SerializedName("enablecompletion")
	boolean enablecompletion;
	@SerializedName("errorcode")
	@Ignore
	String errorcode;
	@SerializedName("exception")
	@Ignore
	String exception;
	@SerializedName("forcetheme")
	String forcetheme;
	@SerializedName("format")
	String format;
	@SerializedName("fullname")
	String fullname;
	@SerializedName("groupmode")
	int groupmode;
	@SerializedName("groupmodeforce")
	int groupmodeforce;
	@SerializedName("hiddensections")
	int hiddensections;
	@SerializedName("idnumber")
	String idnumber;
	Boolean isFavCourse = Boolean.valueOf(false);
	Boolean isUserCourse = Boolean.valueOf(false);
	@SerializedName("lang")
	String lang;
	@SerializedName("maxbytes")
	int maxbytes;
	@SerializedName("message")
	@Ignore
	String message;
	@SerializedName("newsitems")
	int newsitems;
	@SerializedName("numsections")
	int numsections;
	@SerializedName("shortname")
	String shortname;
	@SerializedName("showgrades")
	boolean showgrades;
	@SerializedName("showreports")
	int showreports;
	long siteid;
	@SerializedName("startdate")
	int startdate;
	@SerializedName("summary")
	String summary;
	@SerializedName("summaryformat")
	int summaryformat;
	@SerializedName("timecreated")
	int timecreated;
	@SerializedName("timemodified")
	int timemodified;
	@SerializedName("visible")
	int visible;

	public MoodleCourse() {}

	public MoodleCourse(long paramLong)
	{
		this.siteid = paramLong;
	}

	public int getCategoryid()
	{
		return this.categoryid;
	}

	public int getCategorysortorder()
	{
		return this.categorysortorder;
	}

	public int getCompletionnotify()
	{
		return this.completionnotify;
	}

	public ArrayList<MoodleCourseFormatOption> getCourseformatoptions()
	{
		return this.courseformatoptions;
	}

	public int getCourseid()
	{
		return this.courseid;
	}

	public String getDebuginfo()
	{
		return this.debuginfo;
	}

	public int getDefaultgroupingid()
	{
		return this.defaultgroupingid;
	}

	public boolean getEnablecompletion()
	{
		return this.enablecompletion;
	}

	public String getErrorcode()
	{
		return this.errorcode;
	}

	public String getException()
	{
		return this.exception;
	}

	public String getForcetheme()
	{
		return this.forcetheme;
	}

	public String getFormat()
	{
		return this.format;
	}

	public String getFullname()
	{
		return this.fullname;
	}

	public int getGroupmode()
	{
		return this.groupmode;
	}

	public int getGroupmodeforce()
	{
		return this.groupmodeforce;
	}

	public int getHiddensections()
	{
		return this.hiddensections;
	}

	public String getIdnumber()
	{
		return this.idnumber;
	}

	public Boolean getIsFavCourse()
	{
		return this.isFavCourse;
	}

	public Boolean getIsUserCourse()
	{
		return this.isUserCourse;
	}

	public String getLang()
	{
		return this.lang;
	}

	public int getMaxbytes()
	{
		return this.maxbytes;
	}

	public String getMessage()
	{
		return this.message;
	}

	public int getNewsitems()
	{
		return this.newsitems;
	}

	public int getNumsections()
	{
		return this.numsections;
	}

	public String getShortname()
	{
		return this.shortname;
	}

	public boolean getShowgrades()
	{
		return this.showgrades;
	}

	public int getShowreports()
	{
		return this.showreports;
	}

	public long getSiteid()
	{
		return this.siteid;
	}

	public int getStartdate()
	{
		return this.startdate;
	}

	public String getSummary()
	{
		return this.summary;
	}

	public int getSummaryformat()
	{
		return this.summaryformat;
	}

	public int getTimecreated()
	{
		return this.timecreated;
	}

	public int getTimemodified()
	{
		return this.timemodified;
	}

	public int getVisible()
	{
		return this.visible;
	}

	public void setIsFavCourse(Boolean paramBoolean)
	{
		this.isFavCourse = paramBoolean;
	}

	public void setIsUserCourse(Boolean paramBoolean)
	{
		this.isUserCourse = paramBoolean;
	}

	public void setSiteid(long paramLong)
	{
		this.siteid = paramLong;
	}

	public String toString()
	{
		return "MoodleCourse{courseid=" + this.courseid + ", categoryid=" + this.categoryid + ", message='" + this.message + '\'' + ", debuginfo='" + this.debuginfo + '\'' + ", fullname='" + this.fullname + '\'' + '}';
	}
}
