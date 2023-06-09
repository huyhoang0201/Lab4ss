//package com.example.demo.controller;
//
//import com.example.demo.entity.ContactInfo;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//@RequestMapping("/contact")
//public class ContactController {
//
//    @GetMapping
//    public String showContactForm(Model model) {
//        model.addAttribute("contactForm", new ContactInfo());
//        return "contact/form";
//    }
//
//    @PostMapping
//    public String submitContactForm(@ModelAttribute("contactForm") ContactInfo contactForm) {
//        return "contact/success";
//    }
//}