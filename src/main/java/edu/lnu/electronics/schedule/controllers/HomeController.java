package edu.lnu.electronics.schedule.controllers;

import edu.lnu.electronics.schedule.facade.GroupFacade;
import edu.lnu.electronics.schedule.facade.ScheduleFacade;
import edu.lnu.electronics.schedule.facade.StudentFacade;
import edu.lnu.electronics.schedule.form.SearchForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private GroupFacade groupFacade;
    @Autowired
    private ScheduleFacade scheduleFacade;
    @Autowired
    private StudentFacade studentFacade;

    @GetMapping
    public String mainPage(Model model){
        model.addAttribute("group", groupFacade.getListOfGroupsNames());
        model.addAttribute("schedule", scheduleFacade.getAllSchedule());

        return "pages/HomePage";
    }

    @PostMapping(value = "/schedule")
    public String getSchedule(Model model, SearchForm form){
        model.addAttribute("schedule", scheduleFacade.getScheduleForGroup(form.getGroupName()));
        return "components/ScheduleComponent";
    }

    @PostMapping("/student")
    public String getStudentByGroup(Model model, SearchForm form){
        model.addAttribute("students", studentFacade.getStudentForGroup(form.getGroupName()));
        return "components/StudentComponent";
    }
}
