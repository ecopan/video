package com.uu.dto;

/**
 * @Author: Ecopan
 * @Description:
 * @Date: Created in 17:55 2018-02-07
 * @Modified By:
 */
public class PlayInfo {
    private String uploadUserName;
    private String videoName;
    private int praiseFrequency;
    private String videoURL;

    @Override
    public String toString() {
        return "PlayInfo{" +
                "uploadUserName='" + uploadUserName + '\'' +
                ", videoName='" + videoName + '\'' +
                ", praiseFrequency=" + praiseFrequency +
                ", videoURL='" + videoURL + '\'' +
                '}';
    }

    public void setPraiseFrequency(int praiseFrequency) {
        this.praiseFrequency = praiseFrequency;
    }

    public String getUploadUserName() {

        return uploadUserName;
    }

    public String getVideoName() {
        return videoName;
    }

    public int getPraiseFrequency() {
        return praiseFrequency;
    }

    public String getVideoURL() {
        return videoURL;
    }
}
