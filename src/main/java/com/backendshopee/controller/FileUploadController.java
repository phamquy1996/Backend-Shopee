package com.backendshopee.controller;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.backendshopee.dto.ImagesDTO;
@RestController
@CrossOrigin("*")
public class FileUploadController {

	public static String uploadDirectory = System.getProperty("user.dir")+"/src/main/upload/static/images/gallery";
//	  @RequestMapping("/upload")
//	  public String UploadPage(Model model) {
//		  return "index";
//	  }
	 private static final Logger LOGGER = LoggerFactory.getLogger(FileUploadController.class);
	 
	  @RequestMapping(value=("/upload"),method=RequestMethod.POST)
	  public List<ImagesDTO> upload(Model model, @RequestParam("files") MultipartFile[] files) {
		  List<ImagesDTO> imagesDTO = new ArrayList<>();
		  StringBuilder fileNames = new StringBuilder();
		 
		  for (MultipartFile file : files) {
			  System.out.println( file.getOriginalFilename());
			  Path fileNameAndPath = Paths.get(uploadDirectory,file.getOriginalFilename());
			  fileNames.append(file.getOriginalFilename()+" ");
			  ImagesDTO newDTO = new ImagesDTO();
			  newDTO.setImage(file.getOriginalFilename());
			  imagesDTO.add(newDTO);
			  try {
				Files.write(fileNameAndPath, file.getBytes());
				 System.out.println( fileNameAndPath);
			} catch (IOException e) {
				e.printStackTrace();
			}
		  }
		  model.addAttribute("msg", "Successfully uploaded files "+ fileNames.toString());
		  return (List<ImagesDTO>) imagesDTO;
	  }
}
