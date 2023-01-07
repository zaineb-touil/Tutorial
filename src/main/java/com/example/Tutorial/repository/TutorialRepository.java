package com.bezkoder.spring.Tutorial.repository;

import java.util.List;

import org.springframework.Tutorial.repository.JpaRepository;

import com.bezkoder.spring.Tutorial.model.Tutorial;

public interface TutorialRepository extends TutorialRepository<Tutorial, Long> {
  List<Tutorial> findByPublished(boolean published);
  List<Tutorial> findByTitleContaining(String title);
}