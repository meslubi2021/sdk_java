package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 */
public class Geolocation extends BunqModel {

  /**
   * The latitude for a geolocation restriction.
   */
  @Expose
  @SerializedName("latitude")
  private BigDecimal latitude;

  /**
   * The longitude for a geolocation restriction.
   */
  @Expose
  @SerializedName("longitude")
  private BigDecimal longitude;

  /**
   * The altitude for a geolocation restriction.
   */
  @Expose
  @SerializedName("altitude")
  private BigDecimal altitude;

  /**
   * The radius for a geolocation restriction.
   */
  @Expose
  @SerializedName("radius")
  private BigDecimal radius;

  /**
   * The latitude for a geolocation restriction.
   */
  public BigDecimal getLatitude() {
    return this.latitude;
  }

  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }

  /**
   * The longitude for a geolocation restriction.
   */
  public BigDecimal getLongitude() {
    return this.longitude;
  }

  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }

  /**
   * The altitude for a geolocation restriction.
   */
  public BigDecimal getAltitude() {
    return this.altitude;
  }

  public void setAltitude(BigDecimal altitude) {
    this.altitude = altitude;
  }

  /**
   * The radius for a geolocation restriction.
   */
  public BigDecimal getRadius() {
    return this.radius;
  }

  public void setRadius(BigDecimal radius) {
    this.radius = radius;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.latitude != null) {
      return false;
    }

    if (this.longitude != null) {
      return false;
    }

    if (this.altitude != null) {
      return false;
    }

    if (this.radius != null) {
      return false;
    }

    return true;
  }

  /**
   */
  public static Geolocation fromJsonReader(JsonReader reader) {
    return fromJsonReader(Geolocation.class, reader);
  }

}
