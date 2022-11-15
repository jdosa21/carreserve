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
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JournalController {

    @Autowired
    public JournalService journalService;

    @Autowired
    public ReserveService reserveService;

    @GetMapping("/journal")
    public String getjournal(Model model, @AuthenticationPrincipal UserInfo userInfo){
        String rname = null;
        int a = 0;

        // 예약 리스트 이름과 같은 로그인이름 찾기
        for(int i = 0; i < reserveService.reserveList().size(); i++) {
            if(reserveService.reserveList().get(i).getRname().equals(userInfo.getEmail())) {
                a = i;
            }
        }

        model.addAttribute("jname", reserveService.reserveList().get(a).getRname());
        model.addAttribute("jcarnum", reserveService.reserveList().get(a).getRcarnum());
        model.addAttribute("jpurpose", reserveService.reserveList().get(a).getPurpose());
        model.addAttribute("jdest", reserveService.reserveList().get(a).getDest());
        model.addAttribute("jrt", reserveService.reserveList().get(a).getRt());

        return "journal";
    }

    @PostMapping("/journal/create")
    public String createjournal(Journal journal) {
        journalService.create(journal);
        return "redirect:/journal";
    }
}
