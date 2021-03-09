package com.backendshopee.service;

import java.util.List;

import com.backendshopee.dto.ImagesDTO;

public interface IImageService {
	public void addImage(List<ImagesDTO> imagesDTO, Long id);

}
