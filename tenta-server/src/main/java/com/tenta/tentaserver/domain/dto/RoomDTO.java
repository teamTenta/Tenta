package com.tenta.tentaserver.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Getter
public class RoomDTO implements Serializable {

    private final long id;
    private List<ParticipantDTO> participants;

    @JsonProperty("created_at")
    private LocalDateTime createAt;
    private LocalDateTime lastMessageTime;

    @Builder
    public RoomDTO(long id, List<ParticipantDTO> participants, LocalDateTime createAt, LocalDateTime lastMessageTime) {
        this.id = id;
        this.participants = participants;
        this.createAt = createAt;
        this.lastMessageTime = lastMessageTime;
    }
}
