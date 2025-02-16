package ipeters.capital.controller;

import ipeters.capital.model.Notice;
import ipeters.capital.service.NoticeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/* carlpeters created on 16/02/2025 inside the package - ipeters.capital.controller */
@Slf4j
@RestController
@RequestMapping("app-api/notices")
public class NoticeApiController {

    private final NoticeService noticeService;

    public NoticeApiController(NoticeService noticeService) {
        this.noticeService = noticeService;
    }

    @PostMapping("/create")
    public ResponseEntity<Notice> createNotice(@RequestBody Notice notice) {
        log.debug("createNotice {}", notice);
        return ResponseEntity.ok().body(noticeService.save(notice));
    }
}
