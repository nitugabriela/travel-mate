package com.app.travel_mate.infrastructure.providers;

import com.app.travel_mate.domain.model.options.LuggageOption;
import com.app.travel_mate.domain.model.queries.LuggageQuery;
import java.util.List;

/**
 * adapter interface for luggage storage providers
 *
 * Implements the Adapter pattern, hiding the external API's complexity
 * behind this search method.
 */
public interface LuggageProvider extends Provider {

    /**
     * Searches for luggage storage options based on the query.
     *
 * @param q the LuggageQuery.
     * @return A list of LuggageOption results.
     */
    List<LuggageOption> search(LuggageQuery q);
}