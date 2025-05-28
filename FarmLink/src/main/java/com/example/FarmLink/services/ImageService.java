package com.example.FarmLink.services;

import com.example.FarmLink.entities.Image;
import org.springframework.stereotype.Service;
import com.example.FarmLink.repositories.ImageRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ImageService {
    private final ImageRepository imageRepository;

    public ImageService(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    public List<Image> getAllImages(){
        return imageRepository.findAll();
    }

    public Image getImageById(Long id){
        return this.imageRepository.findById(id).orElseThrow(() -> new RuntimeException("Image not found"));
    }

    public List<Image> getImageByName(String name){
        List<Image> images = imageRepository.findAll();
        return images.stream().filter(image -> image.getFileName().equalsIgnoreCase(name)).collect(Collectors.toList());
    }
}
