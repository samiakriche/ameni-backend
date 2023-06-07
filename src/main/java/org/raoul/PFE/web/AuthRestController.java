/**package org.raoul.PFE.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import org.raoul.PFE.security.AuthenticationRequest;
import org.raoul.PFE.security.AuthenticationResponse;
import org.raoul.PFE.security.AuthenticationService;


@RestController
public class AuthRestController {
  
    @Autowired
    private AuthenticationService authenticationService;
  
    @PostMapping("/login")
    public ResponseEntity<?> authenticate(@RequestBody AuthenticationRequest authenticationRequest) {
        try {
            // Authenticate user
            String token = authenticationService.authenticate(authenticationRequest.getUsername(), authenticationRequest.getPassword());
            // Create and return the authentication response
            AuthenticationResponse authenticationResponse = new AuthenticationResponse(token, token);
            return ResponseEntity.ok(authenticationResponse);
        } catch (Exception e) {
            // Return error response
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }
}
**/