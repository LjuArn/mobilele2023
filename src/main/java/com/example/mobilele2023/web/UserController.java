package com.example.mobilele2023.web;

import com.example.mobilele2023.domain.bindingModel.UserLoginBindingModel;
import com.example.mobilele2023.domain.bindingModel.UserRegisterBindingModel;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/users")
public class UserController {


    @GetMapping("/register")
    public String register() {

        return "auth-register";
    }


    @ModelAttribute
    public UserRegisterBindingModel userRegisterBindingModel(){
        return new UserRegisterBindingModel();
    }




    //---------------------------------------------------------------------------------


    @GetMapping("/login")
    public String loginUser(Model model) {
        if(!model.containsAttribute("userLoginBindingModel")){
            model.addAttribute("userLoginBindingModel", new UserLoginBindingModel());
        }
        return "auth-login";
    }



    @PostMapping("/login")
    public String loginConfirmPost(@Valid UserLoginBindingModel userLoginBindingModel,
                                   BindingResult bindingResult,
                                   RedirectAttributes redirectAttributes) {


        if (bindingResult.hasErrors()) {
            redirectAttributes
                    .addFlashAttribute("userLoginBindingModel", userLoginBindingModel);
            redirectAttributes
                    .addFlashAttribute("org.springframework.validation.BindingResult.userLoginBindingModel",
                            bindingResult);
            return "redirect:auth-login";
        }



        return "redirect:/";


    }
}


//        UserServiceModel user = userService
//                .findUserByUsernameAndPassword(userLoginBindingModel.getUsername(),
//                        userLoginBindingModel.getPassword());
//
//
//        if (user == null) {
//            redirectAttributes
//                    .addFlashAttribute("isNotFound", true)
//                    .addFlashAttribute("org.springframework.validation.BindingResult.userLoginBindingModel",
//                            bindingResult)
//                    .addFlashAttribute("userLoginBindingModel", userLoginBindingModel);
//            return "redirect:login";
//
//        }
//
//        userService.loginUser(user.getId(), user.getUsername());
