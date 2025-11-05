package com.app.travel_mate.infrastructure.providers;

/**
 * base interface for all provider adapters.
 *
 * this allows the ProviderRegistry to manage them generically
 * and provides a common method for identification.
 */
public interface Provider {

    /**
     * returns the display name of the provider adapter.
     *
     * @return The adapter's name.
     */
    String name();
}