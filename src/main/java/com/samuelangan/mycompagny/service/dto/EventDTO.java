package com.samuelangan.mycompagny.service.dto;

import com.samuelangan.mycompagny.domain.Event;
import java.io.Serializable;
import java.time.Instant;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A DTO representing a user, with only the public attributes.
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class EventDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String name;

    private String address;

    private String comment;

    private Date eventDate;

    private String createdBy;

    private Instant createdDate;

    private String lastModifiedBy;

    private Instant lastModifiedDate;

    public static EventDTO createSimple(Event event) {
        if (event == null) {
            return null;
        }

        return EventDTO.builder()
            .id(event.getId())
            .name(event.getName())
            .address(event.getAddress())
            .comment(event.getComment())
            .eventDate(event.getEventDate())
            .createdDate(event.getCreatedDate())
            .createdBy(event.getCreatedBy())
            .lastModifiedDate(event.getLastModifiedDate())
            .lastModifiedBy(event.getLastModifiedBy())
            .build();
    }

    public EventDTO(Event event) {
        this.id = event.getId();
        this.name = event.getName();
        this.address = event.getAddress();
        this.comment = event.getComment();
        this.eventDate = event.getEventDate();
    }

    public Event dtoToEntity() {
        return Event.builder().id(this.id).name(this.name).address(this.address).comment(this.comment).eventDate(this.eventDate).build();
    }
}
