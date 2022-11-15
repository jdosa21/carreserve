package com.car.car.controller;

import com.car.car.entity.Car;
import com.car.car.entity.Reserve;
import com.car.car.entity.UserInfo;
import com.car.car.entity.UserInfoDto;
import com.car.car.service.CarService;
import com.car.car.service.ReserveService;
import com.car.car.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class CheckController {

    @Autowired
    private ReserveService reserveService;
    @Autowired
    private CarService carService;
    @Autowired
    private UserService userService;

    @GetMapping("/check") // 로그인 된 이름으로 예약 확인
    public String getcheck(Model model, @AuthenticationPrincipal UserInfo userInfo){

        String rname = null;
        int a = 0;
        // System.out.println(reserveService.reserveList());
        // reserveService.reserveList().size()
        // reserveService.reserveList().get(0).getRname()

        // 예약 리스트 이름과 같은 로그인이름 찾기
        for(int i = 0; i < reserveService.reserveList().size(); i++) {
            if(reserveService.reserveList().get(i).getRname().equals(userInfo.getEmail())) {
                rname = reserveService.reserveList().get(i).getRname();
                a = i;
            }
        }

        model.addAttribute("rlist", reserveService.reserveList().get(a));

        //System.out.println(reserveService.reserveList().get(0).getRname());
        //System.out.println(userInfo.getEmail());
        //System.out.println(reserveService.reserveList().size());
        //System.out.println(reserveService.reserveList().get(a));
        //System.out.println(reserveService.reserveList().get(a).getId());

        return "check";
    }

    @GetMapping("/delete") // 예약 취소
    public String delete(Integer id, Model model){

        reserveService.reserveDelete(id);

        return "redirect:/reserve";
    }

    @GetMapping("/modify") // 예약 수정
    public String modify(@RequestParam("id") Integer id,
                            Model model) {
        model.addAttribute("reserve", reserveService.reserveView(id));

        ArrayList<Reserve> alist1 = null;
        ArrayList<Reserve> alist2 = null;
        ArrayList<Reserve> alist3 = null;
        ArrayList<Reserve> alist4 = null;
        ArrayList<Reserve> alist5 = null;
        ArrayList<Reserve> alist6 = null;
        ArrayList<Reserve> alist7 = null;
        ArrayList<Reserve> alist8 = null;
        ArrayList<Reserve> alist9 = null;
        ArrayList<Reserve> alist10 = null;
        ArrayList<Reserve> alist11 = null;
        ArrayList<Reserve> alist12 = null;
        ArrayList<Reserve> alist13 = null;

        ArrayList<Reserve> blist1 = null;
        ArrayList<Reserve> blist2 = null;
        ArrayList<Reserve> blist3 = null;
        ArrayList<Reserve> blist4 = null;
        ArrayList<Reserve> blist5 = null;
        ArrayList<Reserve> blist6 = null;
        ArrayList<Reserve> blist7 = null;
        ArrayList<Reserve> blist8 = null;
        ArrayList<Reserve> blist9 = null;
        ArrayList<Reserve> blist10 = null;
        ArrayList<Reserve> blist11 = null;
        ArrayList<Reserve> blist12 = null;
        ArrayList<Reserve> blist13 = null;

        ArrayList<Reserve> clist1 = null;
        ArrayList<Reserve> clist2 = null;
        ArrayList<Reserve> clist3 = null;
        ArrayList<Reserve> clist4 = null;
        ArrayList<Reserve> clist5 = null;
        ArrayList<Reserve> clist6 = null;
        ArrayList<Reserve> clist7 = null;
        ArrayList<Reserve> clist8 = null;
        ArrayList<Reserve> clist9 = null;
        ArrayList<Reserve> clist10 = null;
        ArrayList<Reserve> clist11 = null;
        ArrayList<Reserve> clist12 = null;
        ArrayList<Reserve> clist13 = null;

        alist1 = reserveService.reserveSearchList("1234(아반떼)", "09:00 - 10:00");
        alist2 = reserveService.reserveSearchList("1234(아반떼)", "10:00 - 11:00");
        alist3 = reserveService.reserveSearchList("1234(아반떼)", "11:00 - 12:00");
        alist4 = reserveService.reserveSearchList("1234(아반떼)", "12:00 - 13:00");
        alist5 = reserveService.reserveSearchList("1234(아반떼)", "13:00 - 14:00");
        alist6 = reserveService.reserveSearchList("1234(아반떼)", "14:00 - 15:00");
        alist7 = reserveService.reserveSearchList("1234(아반떼)", "15:00 - 16:00");
        alist8 = reserveService.reserveSearchList("1234(아반떼)", "16:00 - 17:00");
        alist9 = reserveService.reserveSearchList("1234(아반떼)", "17:00 - 18:00");
        alist10 = reserveService.reserveSearchList("1234(아반떼)", "18:00 - 19:00");
        alist11 = reserveService.reserveSearchList("1234(아반떼)", "19:00 - 20:00");
        alist12 = reserveService.reserveSearchList("1234(아반떼)", "20:00 - 21:00");
        alist13 = reserveService.reserveSearchList("1234(아반떼)", "21:00 - 22:00");

        blist1 = reserveService.reserveSearchList("5678(소나타)", "09:00 - 10:00");
        blist2 = reserveService.reserveSearchList("5678(소나타)", "10:00 - 11:00");
        blist3 = reserveService.reserveSearchList("5678(소나타)", "11:00 - 12:00");
        blist4 = reserveService.reserveSearchList("5678(소나타)", "12:00 - 13:00");
        blist5 = reserveService.reserveSearchList("5678(소나타)", "13:00 - 14:00");
        blist6 = reserveService.reserveSearchList("5678(소나타)", "14:00 - 15:00");
        blist7 = reserveService.reserveSearchList("5678(소나타)", "15:00 - 16:00");
        blist8 = reserveService.reserveSearchList("5678(소나타)", "16:00 - 17:00");
        blist9 = reserveService.reserveSearchList("5678(소나타)", "17:00 - 18:00");
        blist10 = reserveService.reserveSearchList("5678(소나타)", "18:00 - 19:00");
        blist11 = reserveService.reserveSearchList("5678(소나타)", "19:00 - 20:00");
        blist12 = reserveService.reserveSearchList("5678(소나타)", "20:00 - 21:00");
        blist13 = reserveService.reserveSearchList("5678(소나타)", "21:00 - 22:00");

        clist1 = reserveService.reserveSearchList("9123(그랜저)", "09:00 - 10:00");
        clist2 = reserveService.reserveSearchList("9123(그랜저)", "10:00 - 11:00");
        clist3 = reserveService.reserveSearchList("9123(그랜저)", "11:00 - 12:00");
        clist4 = reserveService.reserveSearchList("9123(그랜저)", "12:00 - 13:00");
        clist5 = reserveService.reserveSearchList("9123(그랜저)", "13:00 - 14:00");
        clist6 = reserveService.reserveSearchList("9123(그랜저)", "14:00 - 15:00");
        clist7 = reserveService.reserveSearchList("9123(그랜저)", "15:00 - 16:00");
        clist8 = reserveService.reserveSearchList("9123(그랜저)", "16:00 - 17:00");
        clist9 = reserveService.reserveSearchList("9123(그랜저)", "17:00 - 18:00");
        clist10 = reserveService.reserveSearchList("9123(그랜저)", "18:00 - 19:00");
        clist11 = reserveService.reserveSearchList("9123(그랜저)", "19:00 - 20:00");
        clist12 = reserveService.reserveSearchList("9123(그랜저)", "20:00 - 21:00");
        clist13 = reserveService.reserveSearchList("9123(그랜저)", "21:00 - 22:00");


        /*
        model.addAttribute("alist0", alist.get(0));
        model.addAttribute("alist1", alist.get(1));
        model.addAttribute("alist2", alist.get(2));
        model.addAttribute("alist3", alist.get(3));
        */

        model.addAttribute("alist1", alist1);
        model.addAttribute("alist2", alist2);
        model.addAttribute("alist3", alist3);
        model.addAttribute("alist4", alist4);
        model.addAttribute("alist5", alist5);
        model.addAttribute("alist6", alist6);
        model.addAttribute("alist7", alist7);
        model.addAttribute("alist8", alist8);
        model.addAttribute("alist9", alist9);
        model.addAttribute("alist10", alist10);
        model.addAttribute("alist11", alist11);
        model.addAttribute("alist12", alist12);
        model.addAttribute("alist13", alist13);

        model.addAttribute("blist1", blist1);
        model.addAttribute("blist2", blist2);
        model.addAttribute("blist3", blist3);
        model.addAttribute("blist4", blist4);
        model.addAttribute("blist5", blist5);
        model.addAttribute("blist6", blist6);
        model.addAttribute("blist7", blist7);
        model.addAttribute("blist8", blist8);
        model.addAttribute("blist9", blist9);
        model.addAttribute("blist10", blist10);
        model.addAttribute("blist11", blist11);
        model.addAttribute("blist12", blist12);
        model.addAttribute("blist13", blist13);

        model.addAttribute("clist1", clist1);
        model.addAttribute("clist2", clist2);
        model.addAttribute("clist3", clist3);
        model.addAttribute("clist4", clist4);
        model.addAttribute("clist5", clist5);
        model.addAttribute("clist6", clist6);
        model.addAttribute("clist7", clist7);
        model.addAttribute("clist8", clist8);
        model.addAttribute("clist9", clist9);
        model.addAttribute("clist10", clist10);
        model.addAttribute("clist11", clist11);
        model.addAttribute("clist12", clist12);
        model.addAttribute("clist13", clist13);

        return "modify";
    }

    @PostMapping("/update")
    public String busUpdate(@RequestParam("id") Integer id, Reserve reserve){
        Reserve reserveTemp = reserveService.reserveView(id);
        reserveTemp.setDest(reserve.getDest());
        reserveTemp.setRt(reserve.getRt());
        reserveTemp.setRname(reserve.getRname());
        reserveTemp.setRcarnum(reserve.getRcarnum());
        reserveTemp.setPurpose(reserve.getPurpose());

        reserveService.create(reserveTemp);

        return "redirect:/reserve";
    }
}
