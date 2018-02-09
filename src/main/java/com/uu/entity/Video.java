package com.uu.entity;

/**
 * @Author: Ecopan
 * @Description:
 * @Date: Created in 17:53 2018-02-07
 * @Modified By:
 */
public class Video {
    private int id;
    private String videoName;
    private int uploadID;
    private String videoURL;
    //点赞数
    private int praiseFrequency;
    //播放量
    private int playFrequency;


    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", videoName='" + videoName + '\'' +
                ", uploadID=" + uploadID +
                ", videoURL='" + videoURL + '\'' +
                ", praiseFrequency=" + praiseFrequency +
                ", playFrequency=" + playFrequency +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public int getUploadID() {
        return uploadID;
    }

    public void setUploadID(int uploadID) {
        this.uploadID = uploadID;
    }

    public String getVideoURL() {
        return videoURL;
    }

    public void setVideoURL(String videoURL) {
        this.videoURL = videoURL;
    }

    public int getPraiseFrequency() {
        return praiseFrequency;
    }

    public void setPraiseFrequency(int praiseFrequency) {
        this.praiseFrequency = praiseFrequency;
    }

    public int getPlayFrequency() {
        return playFrequency;
    }

    public void setPlayFrequency(int playFrequency) {
        this.playFrequency = playFrequency;
    }





}
