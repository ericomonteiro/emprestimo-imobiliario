package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.entrypoint.events.dto;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class EventDto {
    String id;
    String eventSchema;
    String action;
    ZonedDateTime timestamp;
    String[] data;

    public EventDto(String textLine) {
        String[] splitLine = textLine.split(",");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssz");

        this.id = splitLine[0];
        this.eventSchema = splitLine[1];
        this.action = splitLine[2];
        this.timestamp = ZonedDateTime.parse(splitLine[3], formatter);
        this.data = Arrays.copyOfRange(splitLine, 4, splitLine.length);
    }

    public String getEventSchema() {
        return eventSchema;
    }

    public String getAction() {
        return action;
    }

    public String[] getData() {
        return data;
    }
}