package com.controller;

import java.lang.reflect.Member;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class MemberController {

    private final MemberRepository repository;

    @GetMapping("/")
    public String showList(Model model) {
        model.addAttribute("members", repository.findAll());
        return "index";
    }

    @GetMapping("/add")
    public String addMember(@ModelAttribute Member member) {
        return "form";
    }

    @PostMapping("/process")
    public String process(@Validated @ModelAttribute Member member,
            BindingResult result) {

        if (result.hasErrors()) {
            return "form";
        }
        repository.save(member);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String editMember(@PathVariable Long id, Model model) {
        model.addAttribute("member", repository.findById(id));
        return "form";
    }

    @GetMapping("/delete/{id}")
    public String deleteMember(@PathVariable Long id) {
        repository.deleteById(id);
        return "redirect:/";
    }
}
