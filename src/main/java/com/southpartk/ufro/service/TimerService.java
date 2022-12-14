package com.southpartk.ufro.service;

import org.springframework.stereotype.Service;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Service
public class TimerService {
    private Timer timer;

    public void StartGameTimer(){
        this.timer = new Timer(1, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                startTimer();
            }
        });
    }
    public void startTimer(){
        System.out.println("Timer comenzó");
        this.timer.start();
    }

    public void stopTimer(){
        System.out.println("Timer terminó");
        this.timer.stop();
        showTime();
    }
    public void showTime(){
        JOptionPane.showMessageDialog(null, "Tiempo: " + this.timer.toString());
    }
}
