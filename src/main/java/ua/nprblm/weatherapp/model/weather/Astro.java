
package ua.nprblm.weatherapp.model.weather;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.Valid;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sunrise",
    "sunset",
    "moonrise",
    "moonset",
    "moon_phase",
    "moon_illumination",
    "is_moon_up",
    "is_sun_up"
})
@Generated("jsonschema2pojo")
public class Astro {

    @JsonProperty("sunrise")
    private String sunrise;
    @JsonProperty("sunset")
    private String sunset;
    @JsonProperty("moonrise")
    private String moonrise;
    @JsonProperty("moonset")
    private String moonset;
    @JsonProperty("moon_phase")
    private String moonPhase;
    @JsonProperty("moon_illumination")
    private String moonIllumination;
    @JsonProperty("is_moon_up")
    private int isMoonUp;
    @JsonProperty("is_sun_up")
    private int isSunUp;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("sunrise")
    public String getSunrise() {
        return sunrise;
    }

    @JsonProperty("sunrise")
    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    @JsonProperty("sunset")
    public String getSunset() {
        return sunset;
    }

    @JsonProperty("sunset")
    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    @JsonProperty("moonrise")
    public String getMoonrise() {
        return moonrise;
    }

    @JsonProperty("moonrise")
    public void setMoonrise(String moonrise) {
        this.moonrise = moonrise;
    }

    @JsonProperty("moonset")
    public String getMoonset() {
        return moonset;
    }

    @JsonProperty("moonset")
    public void setMoonset(String moonset) {
        this.moonset = moonset;
    }

    @JsonProperty("moon_phase")
    public String getMoonPhase() {
        return moonPhase;
    }

    @JsonProperty("moon_phase")
    public void setMoonPhase(String moonPhase) {
        this.moonPhase = moonPhase;
    }

    @JsonProperty("moon_illumination")
    public String getMoonIllumination() {
        return moonIllumination;
    }

    @JsonProperty("moon_illumination")
    public void setMoonIllumination(String moonIllumination) {
        this.moonIllumination = moonIllumination;
    }

    @JsonProperty("is_moon_up")
    public int getIsMoonUp() {
        return isMoonUp;
    }

    @JsonProperty("is_moon_up")
    public void setIsMoonUp(int isMoonUp) {
        this.isMoonUp = isMoonUp;
    }

    @JsonProperty("is_sun_up")
    public int getIsSunUp() {
        return isSunUp;
    }

    @JsonProperty("is_sun_up")
    public void setIsSunUp(int isSunUp) {
        this.isSunUp = isSunUp;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.moonset == null)? 0 :this.moonset.hashCode()));
        result = ((result* 31)+((this.sunrise == null)? 0 :this.sunrise.hashCode()));
        result = ((result* 31)+((this.sunset == null)? 0 :this.sunset.hashCode()));
        result = ((result* 31)+ this.isSunUp);
        result = ((result* 31)+((this.moonrise == null)? 0 :this.moonrise.hashCode()));
        result = ((result* 31)+ this.isMoonUp);
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.moonPhase == null)? 0 :this.moonPhase.hashCode()));
        result = ((result* 31)+((this.moonIllumination == null)? 0 :this.moonIllumination.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Astro) == false) {
            return false;
        }
        Astro rhs = ((Astro) other);
        return ((((((((((this.moonset == rhs.moonset)||((this.moonset!= null)&&this.moonset.equals(rhs.moonset)))&&((this.sunrise == rhs.sunrise)||((this.sunrise!= null)&&this.sunrise.equals(rhs.sunrise))))&&((this.sunset == rhs.sunset)||((this.sunset!= null)&&this.sunset.equals(rhs.sunset))))&&(this.isSunUp == rhs.isSunUp))&&((this.moonrise == rhs.moonrise)||((this.moonrise!= null)&&this.moonrise.equals(rhs.moonrise))))&&(this.isMoonUp == rhs.isMoonUp))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.moonPhase == rhs.moonPhase)||((this.moonPhase!= null)&&this.moonPhase.equals(rhs.moonPhase))))&&((this.moonIllumination == rhs.moonIllumination)||((this.moonIllumination!= null)&&this.moonIllumination.equals(rhs.moonIllumination))));
    }

}
