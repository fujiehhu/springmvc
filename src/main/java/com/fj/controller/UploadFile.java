package com.fj.controller;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by fujie on 20/8/20.
 */
public class UploadFile {
    MultipartFile image;

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }
}
