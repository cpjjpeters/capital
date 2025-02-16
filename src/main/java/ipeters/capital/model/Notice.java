package ipeters.capital.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* carlpeters created on 16/02/2025 inside the package - ipeters.capital.model */
public class Notice {
    @JsonProperty("noticeId")
    private Long noticeId;
    @JsonProperty("noticeType")
    private String noticeType;
    @JsonProperty("noticeName")
    private String noticeName;
}
