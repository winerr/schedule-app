package edu.lnu.electronics.schedule.controllers.rest;

import edu.lnu.electronics.schedule.entity.ScheduleModel;
import edu.lnu.electronics.schedule.facade.ScheduleFacade;
import edu.lnu.electronics.schedule.form.SearchForm;
import edu.lnu.electronics.schedule.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ScheduleController {
    @Autowired
    private ScheduleFacade scheduleFacade;

    @PostMapping("/schedule")
    public Map<String, List<ScheduleModel>> getScheduleForGroup(@RequestBody SearchForm form){
        return scheduleFacade.getScheduleForGroup(form.getGroupName());
    }
}
