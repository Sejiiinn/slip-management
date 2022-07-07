package sejin.slipmanagement.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sejin.slipmanagement.service.ManagementService;


@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/manage")
public class ManagementController {

    private final ManagementService managementService;

    @GetMapping("")
    public String firstPage(Model model) {
        model.addAttribute("list", managementService.searchAll());
        return "manage/management";
    }

    @PostMapping("")
    public String searching(Model model, SearchDTO searchDTO) {
        model.addAttribute("list", managementService.searchCondition(searchDTO));
        return "manage/management";
    }
}
