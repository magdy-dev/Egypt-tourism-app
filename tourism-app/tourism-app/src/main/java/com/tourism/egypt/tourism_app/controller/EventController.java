package com.tourism.egypt.tourism_app.controller;


import com.tourism.egypt.tourism_app.model.Event;
import com.tourism.egypt.tourism_app.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @GetMapping("/{id}")
    public Event getEventById(@PathVariable Long id) {
        return eventService.getEventById(id);
    }

    @PostMapping
    public Event createEvent(@RequestBody Event event) {
        return eventService.createEvent(event);
    }

    @PutMapping("/{id}")
    public Event updateEvent(@PathVariable Long id, @RequestBody Event eventDetails) {
        return eventService.updateEvent(id, eventDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteEvent(@PathVariable Long id) {
        eventService.deleteEvent(id);
    }

    @GetMapping("/location/{location}")
    public List<Event> getEventsByLocation(@PathVariable String location) {
        return eventService.getEventsByLocation(location);
    }

    @GetMapping("/owner/{ownerId}")
    public List<Event> getEventsByOwnerId(@PathVariable Long ownerId) {
        return eventService.getEventsByOwnerId(ownerId);
    }
}