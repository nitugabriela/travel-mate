package com.app.travel_mate.domain.builder;

import com.app.travel_mate.domain.model.Itinerary;
import com.app.travel_mate.domain.model.options.ActivityOption;
import com.app.travel_mate.domain.model.options.LuggageOption;
import com.app.travel_mate.domain.model.options.StayOption;
import com.app.travel_mate.domain.model.options.TransportOption;

/**
 * builder pattern interface for constructing an Itinerary.
 *
 * this interface defines the steps to build the complex Itinerary object,
 * which is directed by the TravelPlanner facade
 */
public interface ItineraryBuilder {

    /**
     * clears all internal lists and resets the builder to a clean state.
     * called by the Facade before building a new Itinerary.
     */
    void reset();

    /**
     * adds a transport segment to the plan.
     */
    void addTransport(TransportOption o);

    /**
     * adds a stay/accommodation to the plan.
     */
    void addStay(StayOption o);

    /**
     * adds a city activity or point of interest to the plan.
     */
    void addActivity(ActivityOption o);

    /**
     * (Optional) adds a luggage storage option to the plan.
     */
    void addLuggage(LuggageOption o);

    /**
     * assembles and returns the final, immutable Itinerary object.
     *
     * @return The completed Itinerary.
     */
    Itinerary getResult();
}