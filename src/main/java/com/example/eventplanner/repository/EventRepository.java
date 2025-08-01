package com.example.eventplanner.repository;

import com.example.eventplanner.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findAllByOrderByModifiedAtDesc();
    List<Event> findByNameOrderByModifiedAtDesc(String name);
}