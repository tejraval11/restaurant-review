package com.tej.restaurant.mappers;

import com.tej.restaurant.domain.RestaurantCreateUpdateRequest;
import com.tej.restaurant.domain.dtos.GeoPointDto;
import com.tej.restaurant.domain.dtos.RestaurantCreateUpdateRequestDto;
import com.tej.restaurant.domain.dtos.RestaurantDto;
import com.tej.restaurant.domain.dtos.RestaurantSummaryDto;
import com.tej.restaurant.domain.entities.Restaurant;
import com.tej.restaurant.domain.entities.Review;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.ReportingPolicy;
import org.springframework.data.elasticsearch.core.geo.GeoPoint;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RestaurantMapper {

    RestaurantCreateUpdateRequest toRestaurantCreateUpdateRequest(RestaurantCreateUpdateRequestDto dto);

    @Mapping(source = "reviews", target = "totalReviews", qualifiedByName = "populateTotalReviews")
    RestaurantDto toRestaurantDto(Restaurant restaurant);

    @Mapping(source = "reviews", target = "totalReviews", qualifiedByName = "populateTotalReviews")
    RestaurantSummaryDto toSummaryDto(Restaurant restaurant);

    @Named("populateTotalReviews")
    default Integer populateTotalReviews(List<Review> reviews) {
        return reviews.size();
    }

    @Mapping(target = "latitude", expression = "java(geoPoint.getLat())")
    @Mapping(target = "longitude", expression = "java(geoPoint.getLon())")
    GeoPointDto toGeoPointDto(GeoPoint geoPoint);
}
