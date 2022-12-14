package study.organizationservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import study.organizationservice.model.Organization;
import study.organizationservice.service.OrganizationService;

@RestController
@RequestMapping(value = "v1/organization")
public class OrganizationController {

    @Autowired
    private OrganizationService service;

    @RequestMapping(value = "/{organizationId}", method = RequestMethod.GET)
    public ResponseEntity<Organization> getOrganization(@PathVariable("organizationId") String organizationId) {
        return ResponseEntity.ok(service.findById(organizationId));
    }

    @RequestMapping(value = "/{organizationId}", method = RequestMethod.PUT)
    public void updateOrganization(@PathVariable("organizationId") String id, @RequestBody Organization organization) {
        service.update(organization);
    }

    @PostMapping
    public ResponseEntity<Organization> saveOrganization(@RequestBody Organization organization) {
        return ResponseEntity.ok(service.create(organization));
    }

    @RequestMapping(value = "/{organizationId}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteOrganization(@PathVariable("id") String id, @RequestBody Organization organization) {
        service.delete(organization);
    }

    @GetMapping(value = "/call")
    public String callOrganization() {
        System.out.println("/call-organization");
        return "hello";
    }
}
