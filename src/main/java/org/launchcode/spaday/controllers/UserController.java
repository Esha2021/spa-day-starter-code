package org.launchcode.spaday.controllers;

        import org.launchcode.spaday.data.UserData;
        import org.launchcode.spaday.models.User;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.validation.Errors;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.ModelAttribute;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestMapping;

        import javax.validation.Valid;
        import java.util.ArrayList;
        import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    // private static List<User> users = new ArrayList<>();

    @GetMapping("/add")
    public String displayAddUserForm(Model model) {
        model.addAttribute(new User());
        return "user/add";
    }

    @PostMapping()
    public String processAddUserForm(Model model, @ModelAttribute @Valid User user, Errors errors) {
        if (errors.hasErrors()) {
           // model.addAttribute("error", "Passwords do not match");
            return "user/add";
        }

        else{
            return "user/index";
        }
           // add form submission handling code here

        }

    }

