package com.car.car.controller;

import com.car.car.entity.Journal;
import com.car.car.entity.UserInfo;
import com.car.car.service.JournalService;
import com.car.car.service.ReserveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @Autowired
    public ReserveService reserveService;

    @Autowired
    public JournalService journalService;

    @GetMapping("/admin")
    public String getadmin(Model model, @AuthenticationPrincipal UserInfo userInfo){

        String rname = null;
        int a = 0;
        int b = 0;
        // System.out.println(reserveService.reserveList());
        // reserveService.reserveList().size()
        // reserveService.reserveList().get(0).getRname()

        // 예약 리스트 이름과 같은 로그인이름 찾기
        for(int i = 0; i < reserveService.reserveList().size(); i++) {
            if(reserveService.reserveList().get(i).getRname().equals(userInfo.getEmail())) {
                a = i;
            }
        }

        for(int j = 0; j < journalService.journalList().size(); j++) {
            if(journalService.journalList().get(j).getJname().equals(userInfo.getEmail())) {
                b = j;
            }
        }

        // model.addAttribute("rlist", reserveService.reserveList().get(a));

        //System.out.println(reserveService.reserveList().get(0).getRname());
        //System.out.println(userInfo.getEmail());
        //System.out.println(reserveService.reserveList().size());
        //System.out.println(reserveService.reserveList().get(a));
        //System.out.println(reserveService.reserveList().get(a).getId());

        model.addAttribute("rlist", reserveService.reserveList());
        model.addAttribute("jlist", journalService.journalList());

        return "admin";
    }

}
