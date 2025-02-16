package ipeters.capital.controller;

import ipeters.capital.model.Notice;
import ipeters.capital.service.NoticeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

/* carlpeters created on 16/02/2025 inside the package - ipeters.capital.controller */
@Slf4j
@Controller
@RequestMapping(value="/notice", produces = MediaType.APPLICATION_JSON_VALUE)
public class NoticeController {

    private final NoticeService noticeService;

    public NoticeController(NoticeService noticeService) {
        this.noticeService = noticeService;
    }

    @GetMapping("/all")
    public String showAllNotices(Model model) {
        log.debug("getmapping showAllNotices");
        var notices = noticeService.findAll();
        model.addAttribute("notices", notices);
        return "notice/list-notices";
    }

    @GetMapping("/new")
    public String showNewNotice(Model model) {
        log.debug("getmapping showNewNotice");
        Notice aNotice = new Notice();
        model.addAttribute("notice", aNotice);
        return "notice/new-notice";
    }

    @PostMapping("/save")
    public String createNotice(Notice notice, Model model) {
        log.debug("createNotice");
        noticeService.save(notice);
        return "redirect:/notice/all";
    }
}
