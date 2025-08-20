package com.achrafrejouan.jpa.repositories;

import com.achrafrejouan.jpa.models.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Integer> {
}
