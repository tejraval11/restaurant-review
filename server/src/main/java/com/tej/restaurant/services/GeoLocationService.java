package com.tej.restaurant.services;

import com.tej.restaurant.domain.GeoLocation;
import com.tej.restaurant.domain.entities.Address;

public interface GeoLocationService {
    GeoLocation geoLocate(Address address);
}
