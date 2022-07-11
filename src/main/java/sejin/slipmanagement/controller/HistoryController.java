package sejin.slipmanagement.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sejin.slipmanagement.domain.History;
import sejin.slipmanagement.service.HistoryService;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/history")
public class HistoryController {

    private final HistoryService historyService;

    @GetMapping
    public String firstPage(Model model) {

        model.addAttribute("list", historyService.findHistories());
        return "history/history";
    }
}
