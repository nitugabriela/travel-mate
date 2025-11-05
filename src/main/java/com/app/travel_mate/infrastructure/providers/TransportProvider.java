package com.app.travel_mate.infrastructure.providers;

import com.app.travel_mate.domain.model.options.TransportOption;
import com.app.travel_mate.domain.model.queries.TransportQuery;
import java.util.List;

/**
 * adapter interface for transport providers
 * implements the Adapter pattern, hiding the external API's complexity
 * behind this search method.
 */
public interface TransportProvider extends Provider {

    /**
     * searches for transport options based on the unified query.
     *
     * @param q the TransportQuery.
     * @return a list of TransportOption results.
     */
    List<TransportOption> search(TransportQuery q);
}