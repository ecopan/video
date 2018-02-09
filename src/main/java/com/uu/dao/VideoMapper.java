package com.uu.dao;

import com.uu.entity.Video;

import java.util.List;

/**
 * @Author: Ecopan
 * @Description:
 * @Date: Created in 19:59 2018-02-09
 * @Modified By:
 */
public interface VideoMapper {

    int uploadVideo(Video video)throws Exception;

    Video findByUploadID(int upload)throws Exception;

    List<Video> findAllVideo()throws Exception;




}
