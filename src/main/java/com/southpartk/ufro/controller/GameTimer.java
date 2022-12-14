package com.southpartk.ufro.controller;

import com.southpartk.ufro.service.TimerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class GameTimer {
    private TimerService timerService;


    public GameTimer(TimerService timerService) {
        this.timerService = timerService;
    }

    @GetMapping("/StartTimer")
    public void StartGameTimer(){
        timerService.StartGameTimer();
    }
    @GetMapping("/StopTimer")
    public void stopGameTimer(){
        timerService.stopTimer();
    }

}
