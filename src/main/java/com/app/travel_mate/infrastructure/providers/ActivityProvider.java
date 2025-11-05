package com.app.travel_mate.infrastructure.providers;

import com.app.travel_mate.domain.model.options.ActivityOption;
import com.app.travel_mate.domain.model.queries.ActivityQuery;
import java.util.List;

/**
 * adapter interface for activity providers.
 *
 * Implements the adapter pattern, hiding the external API's complexity
 * behind this search method.
 */
public interface ActivityProvider extends Provider {

    /**
     * Searches for activity options based on the query.
     *
     * @param q The ActivityQuery.
     * @return A list of ActivityOption results.
     */
    List<ActivityOption> search(ActivityQuery q);
}