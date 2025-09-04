package maxtheservice.devops.authservice.controller;

import maxtheservice.devops.authservice.dto.RegisterDto;
import maxtheservice.devops.authservice.dto.TokenDto;
import maxtheservice.devops.authservice.request.LoginRequest;
import maxtheservice.devops.authservice.request.RegisterRequest;
import maxtheservice.devops.authservice.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<TokenDto> login(@RequestBody LoginRequest request) {
        return ResponseEntity.ok(authService.login(request));
    }

    @PostMapping("/register")
    public ResponseEntity<RegisterDto> register(@RequestBody RegisterRequest request) {
        return ResponseEntity.ok(authService.register(request));
    }
}
