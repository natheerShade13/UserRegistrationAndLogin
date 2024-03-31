package za.ac.cput.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.UserRegistration;
import za.ac.cput.service.RegistrationService;

@RestController
@RequestMapping(path = "/api")
@AllArgsConstructor
public class RegistrationController {

    private final RegistrationService registrationService;

    @GetMapping(path = "/get")
    public String hello(){
        return "Hello";
    }

    @PostMapping(path = "/hello")
    public String register(@RequestBody UserRegistration request){
        return registrationService.register(request);
    }

    @GetMapping(path =   "/confirm")
    public String confirm(@RequestParam("token") String token) {
        return registrationService.confirmToken(token);
    }

}
