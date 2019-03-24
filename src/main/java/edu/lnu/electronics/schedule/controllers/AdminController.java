package edu.lnu.electronics.schedule.controllers;

import edu.lnu.electronics.schedule.facade.GroupFacade;
import edu.lnu.electronics.schedule.facade.StudentFacade;
import edu.lnu.electronics.schedule.form.SearchForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private StudentFacade studentFacade;
    @Autowired
    private GroupFacade groupFacade;

    @GetMapping
    public String getAdminPage(Model model){

        model.addAttribute("students", studentFacade.getAllStudent());
        model.addAttribute("group", groupFacade.getListOfGroupsNames());

        return "pages/AdminPage";
    }

}
