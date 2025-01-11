package com.tourism.egypt.tourism_app.service;


import com.tourism.egypt.tourism_app.model.Event;
import com.tourism.egypt.tourism_app.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    @Autowired
    private     EventRepository eventRepository;

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public Event getEventById(Long id) {
        return eventRepository.findById(id).orElse(null);
    }

    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    public Event updateEvent(Long id, Event eventDetails) {
        Event event = eventRepository.findById(id).orElse(null);
        if (event != null) {
            event.setTitle(eventDetails.getTitle());
            event.setDescription(eventDetails.getDescription());
            event.setLocation(eventDetails.getLocation());
            event.setPrice(eventDetails.getPrice());
            event.setStartDate(eventDetails.getStartDate());
            event.setMaxPersons(eventDetails.getMaxPersons());
            event.setImageUrl(eventDetails.getImageUrl());
            return eventRepository.save(event);
        }
        return null;
    }

    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }

    public List<Event> getEventsByLocation(String location) {
        return eventRepository.findByLocation(location);
    }

    public List<Event> getEventsByOwnerId(Long ownerId) {
        return eventRepository.findByOwnerId(ownerId);
    }
}