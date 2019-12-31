/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bjsouth.cdmsystem.controllers;

import com.bjsouth.cdmsystem.ygo_dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Bree
 */
@Controller
public class MainController {
    @Autowired
    CardRepo cards;
    
    @Autowired
    DeckRepo decks;
    
    @GetMapping({"/", "/home"})
    public String getIndex(Model model){
        return "index";
    }
}
