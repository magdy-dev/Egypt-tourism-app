package com.tourism.egypt.tourism_app.controller;


import com.tourism.egypt.tourism_app.model.Owner;
import com.tourism.egypt.tourism_app.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/owners")
public class OwnerController {

    @Autowired
    private OwnerService ownerService;

    @GetMapping
    public List<Owner> getAllOwners() {
        return ownerService.getAllOwners();
    }

    @GetMapping("/{id}")
    public Owner getOwnerById(@PathVariable Long id) {
        return ownerService.getOwnerById(id);
    }

    @PostMapping
    public Owner createOwner(@RequestBody Owner owner) {
        return ownerService.createOwner(owner);
    }

    @PutMapping("/{id}")
    public Owner updateOwner(@PathVariable Long id, @RequestBody Owner ownerDetails) {
        return ownerService.updateOwner(id, ownerDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteOwner(@PathVariable Long id) {
        ownerService.deleteOwner(id);
    }

    @GetMapping("/email/{email}")
    public Owner getOwnerByEmail(@PathVariable String email) {
        return ownerService.findByEmail(email);
    }
}