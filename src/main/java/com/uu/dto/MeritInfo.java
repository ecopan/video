package com.uu.dto;

/**
 * @Author: Ecopan
 * @Description:
 * @Date: Created in 20:04 2018-02-09
 * @Modified By:
 */
public class MeritInfo {
    private int uploadID;
    private String userName;

    @Override
    public String toString() {
        return "MeritInfo{" +
                "uploadID=" + uploadID +
                ", userName='" + userName + '\'' +
                ", videoName='" + videoName + '\'' +
                ", praiseFrequency=" + praiseFrequency +
                ", videoURL='" + videoURL + '\'' +
                ", playFrequency=" + playFrequency +
                '}';
    }

    public int getUploadID() {
        return uploadID;
    }

    public void setUploadID(int uploadID) {
        this.uploadID = uploadID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public int getPraiseFrequency() {
        return praiseFrequency;
    }

    public void setPraiseFrequency(int praiseFrequency) {
        this.praiseFrequency = praiseFrequency;
    }

    public String getVideoURL() {
        return videoURL;
    }

    public void setVideoURL(String videoURL) {
        this.videoURL = videoURL;
    }

    public int getPlayFrequency() {
        return playFrequency;
    }

    public void setPlayFrequency(int playFrequency) {
        this.playFrequency = playFrequency;
    }

    private String videoName;
    private int praiseFrequency;
    private String videoURL;
    private int playFrequency;

}
