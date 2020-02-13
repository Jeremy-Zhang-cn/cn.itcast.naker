package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;

@Controller
@RequestMapping("upl")
public class UploadController {

	@RequestMapping("/show")
	public String show(String username, MultipartFile profile) throws IOException {

		System.out.println(username);

		if (profile != null) {
			//获取上传文件的文件名
			String filename = profile.getOriginalFilename();
			//为了防止文件重名，对文件名进行处理
			filename = new Date().getTime() + "_" + filename;

			//将文件保存在本地
			profile.transferTo(new File("G://" +filename));
		}

		return "success";
	}

}
