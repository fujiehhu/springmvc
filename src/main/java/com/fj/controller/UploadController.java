package com.fj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * Created by fujie on 20/8/20.
 */

@Controller
public class UploadController {
    @RequestMapping("/uploadImage")
    public ModelAndView upload(HttpServletRequest request, UploadFile file)
            throws IllegalStateException, IOException {
        String name = "asd";
        String newFileName = name + ".jpg";
        File newFile = new File(request.getServletContext().getRealPath("/image"), newFileName);
        newFile.getParentFile().mkdirs();
        file.getImage().transferTo(newFile);

        ModelAndView mav = new ModelAndView("upload");
        mav.addObject("imageName", newFileName);
        return mav;
    }
}
