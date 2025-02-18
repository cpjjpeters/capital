package ipeters.capital.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import ipeters.capital.config.NoticeType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/* carlpeters created on 16/02/2025 inside the package - ipeters.capital.model */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Notice {
    @JsonProperty("noticeId")
    private Long noticeId;
    @JsonProperty("noticeType")
    private NoticeType noticeType;
    @JsonProperty("noticeName")
    private String noticeName;
}
