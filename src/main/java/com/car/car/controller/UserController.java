package com.car.car.controller;

import com.car.car.entity.Reserve;
import com.car.car.entity.UserInfo;
import com.car.car.entity.UserInfoDto;
import com.car.car.service.ReserveService;
import com.car.car.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RequiredArgsConstructor
@Controller
public class UserController {

    @Autowired
    public ReserveService reserveService;
    private final UserService userService;

    @PostMapping("/user")
    public String signup(UserInfoDto infoDto) { // 회원 추가
        userService.save(infoDto);
        return "redirect:/login";
    }


    @GetMapping(value = "/logout")
    public String logoutPage(HttpServletRequest request, HttpServletResponse response) {
        new SecurityContextLogoutHandler().logout(request, response, SecurityContextHolder.getContext().getAuthentication());
        return "redirect:/login";
    }

    /*
    @GetMapping("/login")
    public String getlogin() {
        return "login";
    }

    @PostMapping("/login")
    public String login(UserInfo userInfo, Model model) {

        userService.logincreate(userInfo);

        return "redirect:/reserve";
    }*/
}
