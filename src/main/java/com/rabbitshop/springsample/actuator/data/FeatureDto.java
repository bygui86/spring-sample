package com.rabbitshop.springsample.actuator.data;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;


@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
public class FeatureDto {

	Boolean enabled;

}
