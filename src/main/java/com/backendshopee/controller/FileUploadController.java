package com.backendshopee.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
@RestController
@CrossOrigin("*")
public class FileUploadController {
	public static String uploadDirectory = System.getProperty("user.dir")+"/uploads";
//	  @RequestMapping("/upload")
//	  public String UploadPage(Model model) {
//		  return "index";
//	  }
	 private static final Logger LOGGER = LoggerFactory.getLogger(FileUploadController.class);
	  @RequestMapping(value=("/upload"),method=RequestMethod.POST)
	  public String upload(Model model,@RequestParam("files") MultipartFile[] files) {
		  StringBuilder fileNames = new StringBuilder();
		 
		  for (MultipartFile file : files) {
			  System.out.println( file.getOriginalFilename());
			  Path fileNameAndPath = Paths.get(uploadDirectory, "anhquy" + file.getOriginalFilename());
			  fileNames.append(file.getOriginalFilename()+" ");
			  try {
				Files.write(fileNameAndPath, file.getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
		  }
		  model.addAttribute("msg", "Successfully uploaded files "+fileNames.toString());
		  return "uploadstatusview";
	  }
}
