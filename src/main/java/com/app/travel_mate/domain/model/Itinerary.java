package com.app.travel_mate.domain.model;

import com.app.travel_mate.domain.model.options.ActivityOption;
import com.app.travel_mate.domain.model.options.LuggageOption;
import com.app.travel_mate.domain.model.options.StayOption;
import com.app.travel_mate.domain.model.options.TransportOption;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@EqualsAndHashCode
public final class Itinerary {

    private final List<TransportOption> transports;
    private final List<StayOption> stays;
    private final List<ActivityOption> activities;
    private final List<LuggageOption> luggages;

    public Itinerary(List<TransportOption> transports, List<StayOption> stays,
                     List<ActivityOption> activities, List<LuggageOption> luggages) {
        // might wrap these in Collections.unmodifiableList() tbd
        this.transports = transports;
        this.stays = stays;
        this.activities = activities;
        this.luggages = luggages;
    }
}