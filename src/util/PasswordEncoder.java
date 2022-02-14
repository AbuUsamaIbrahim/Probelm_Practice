package util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.time.LocalDateTime;

public class PasswordEncoder {
    public static void main(String[] args) {
        String password = "mahadi";
        System.out.println(LocalDateTime.now());
//        System.out.println(password.substring(0, password.lastIndexOf(",")));
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode(password);
        System.out.println(hashedPassword);
    }
}
