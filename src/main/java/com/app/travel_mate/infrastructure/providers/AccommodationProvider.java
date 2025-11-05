package com.app.travel_mate.infrastructure.providers;

import com.app.travel_mate.domain.model.options.StayOption;
import com.app.travel_mate.domain.model.queries.StayQuery;
import java.util.List;

/**
 * adapter interface for accommodation providers
 *
 * Implements the Adapter pattern, hiding the external API's complexity
 * behind this search method.
 */
public interface AccommodationProvider extends Provider {

    /**
     * Searches for accommodation options based on the query.
     *
     * @param q The StayQuery.
     * @return A list of StayOption results.
     */
    List<StayOption> search(StayQuery q);
}