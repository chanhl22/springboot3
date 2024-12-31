package com.example.springboot3.http.cookie;

import com.example.springboot3.http.cookie.dto.UserRequest;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class CookieController {

    @PostMapping("/login/set-cookie")
    public String login(@RequestBody UserRequest request, HttpServletResponse response) {
        log.info("login request: {}", request);

        // 쿠키 생성
        Cookie cookie = new Cookie("myCookie", "good");
//        cookie.setHttpOnly(true); // JavaScript에서 접근하지 못하도록 설정
//        cookie.setSecure(true);  // HTTPS에서만 전송되도록 설정
        cookie.setMaxAge(60 * 60 * 24); // 1일 동안 유효
//        cookie.setPath("/"); // 모든 경로에서 쿠키 사용 가능

        // 응답에 쿠키 추가
        response.addCookie(cookie);

        return "Cookie has been set!";
    }

    @PostMapping("/login/set-cookies")
    public String login2(@RequestBody UserRequest request, HttpServletResponse response) {
        log.info("login request: {}", request);

        // 쿠키 생성
        Cookie cookie1 = new Cookie("myCookie1", "good");
        Cookie cookie2 = new Cookie("myCookie2", "soso");
        Cookie cookie3 = new Cookie("myCookie3", "bad");
        cookie1.setMaxAge(60 * 60 * 24);
        cookie2.setMaxAge(60 * 60 * 24);
        cookie3.setMaxAge(60 * 60 * 24);

        // 응답에 쿠키 추가
        response.addCookie(cookie1);
        response.addCookie(cookie2);
        response.addCookie(cookie3);

        return "Cookies has been set!";
    }

    @GetMapping("/find/get-cookie")
    public String find(HttpServletRequest request) {
        if (request.getCookies() != null) {
            for (Cookie cookie : request.getCookies()) {
                log.info("cookie.getName(): {}, cookie.getValue(): {}", cookie.getName(), cookie.getValue());
            }
        }

        return "Cookie has been get!";
    }

    @GetMapping("/find/get-cookies")
    public String find2(HttpServletRequest request) {
        if (request.getCookies() != null) {
            for (Cookie cookie : request.getCookies()) {
                log.info("cookie.getName(): {}, cookie.getValue(): {}", cookie.getName(), cookie.getValue());
            }
        }

        return "Cookies has been get!";
    }

}
