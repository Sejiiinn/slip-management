package sejin.slipmanagement.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sejin.slipmanagement.service.ManageService;

import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/manage")
public class ManagementController {

    private final ManageService manageService;

    @GetMapping("")
    public String firstPage(Model model) {
        List<ManagementDTO> list = manageService.searchAll();
        list.stream().forEach(s -> System.out.println(s));
        model.addAttribute("list", list);
        return "manage/management";
    }
}
