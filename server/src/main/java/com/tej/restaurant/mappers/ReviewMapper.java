package com.tej.restaurant.mappers;

import com.tej.restaurant.domain.ReviewCreateUpdateRequest;
import com.tej.restaurant.domain.dtos.ReviewCreateUpdateRequestDto;
import com.tej.restaurant.domain.dtos.ReviewDto;
import com.tej.restaurant.domain.entities.Review;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ReviewMapper {

    ReviewCreateUpdateRequest toReviewCreateUpdateRequest(ReviewCreateUpdateRequestDto dto);

    ReviewDto toDto(Review review);

}
