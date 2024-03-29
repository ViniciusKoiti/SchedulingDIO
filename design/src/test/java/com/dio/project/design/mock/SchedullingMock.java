package com.dio.project.design.mock;

import com.dio.project.design.dto.EventDTO;
import com.dio.project.design.dto.SchedulingDTO;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static com.dio.project.design.mock.ClientMock.createMockClientDTO;
import static com.dio.project.design.mock.ProfessionalMock.createMockProfessionalDTO;

public class SchedullingMock {

    public static EventDTO createMockEventDTO(){
        EventDTO eventDTO = new EventDTO();
        eventDTO.setInitialDateTime(ZonedDateTime.of(2021, 1, 1, 10, 0, 0, 0, ZoneId.of("UTC")));
        eventDTO.setFinalDateTime(ZonedDateTime.of(2021, 1, 1, 12, 0, 0, 0, ZoneId.of("UTC")));
        return eventDTO;
    }

    public static SchedulingDTO createMockSchedulingDTO(long id) {
        SchedulingDTO scheduling = new SchedulingDTO();
        scheduling.setId(id);
        EventDTO event = createMockEventDTO();
        scheduling.setInitialDateTime(event.getInitialDateTime());
        scheduling.setFinalDateTime(event.getFinalDateTime());
        return scheduling;
    }
}
