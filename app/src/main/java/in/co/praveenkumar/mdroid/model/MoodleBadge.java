package in.co.praveenkumar.mdroid.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.orm.SugarRecord;


public class MoodleBadge extends SugarRecord<MoodleBadge> {

    @SerializedName("course_id")
    @Expose
    private Object courseId;
    @SerializedName("date_issued")
    @Expose
    private Integer dateIssued;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("details_link")
    @Expose
    private String detailsLink;
    @SerializedName("image_url")
    @Expose
    private String imageUrl;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("site_id")
    @Expose
    private Long siteId;
    @SerializedName("user_id")
    @Expose
    private Long userId;
    @SerializedName("user_name")
    @Expose
    private String userName;

    /**
     * @return The courseId
     */
    public Object getCourseId() {
        return courseId;
    }

    /**
     * @param courseId The course_id
     */
    public void setCourseId(Object courseId) {
        this.courseId = courseId;
    }

    /**
     * @return The dateIssued
     */
    public Integer getDateIssued() {
        return dateIssued;
    }

    /**
     * @param dateIssued The date_issued
     */
    public void setDateIssued(Integer dateIssued) {
        this.dateIssued = dateIssued;
    }

    /**
     * @return The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return The detailsLink
     */
    public String getDetailsLink() {
        return detailsLink;
    }

    /**
     * @param detailsLink The details_link
     */
    public void setDetailsLink(String detailsLink) {
        this.detailsLink = detailsLink;
    }

    /**
     * @return The imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * @param imageUrl The image_url
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The siteId
     */
    public Long getSiteId() {
        return siteId;
    }

    /**
     * @param siteId The site_id
     */
    public void setSiteId(Long siteId) {
        this.siteId = siteId;
    }

    /**
     * @return The userId
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId The user_id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * @return The userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName The user_name
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

}