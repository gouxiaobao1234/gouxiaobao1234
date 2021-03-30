package cn.chao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

@RestController
public class UploadController {

    @PostMapping("/upload")
    public String upload(HttpServletRequest request, MultipartFile touxiang) throws Exception{

        //得到文件上传的路径
        String path =request.getServletContext().getRealPath("/upload1/");
        File file=new File(path);
        //判断是否存在目录
        if (!file.exists()){
            file.mkdirs();
        }

        String name=touxiang.getName();
        System.out.println(name);
        //原始名称
        String yuanshi=touxiang.getOriginalFilename();
        System.out.println(yuanshi);

        //文件上传
        touxiang.transferTo(new File(file,yuanshi));
        return "文件上传成功";

    }
}
