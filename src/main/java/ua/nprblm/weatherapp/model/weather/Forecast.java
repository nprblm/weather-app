
package ua.nprblm.weatherapp.model.weather;

import java.util.LinkedHashMap;
import java.util.List;
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
    "forecastday"
})
@Generated("jsonschema2pojo")
public class Forecast {

    @JsonProperty("forecastday")
    @Valid
    private List<Forecastday> forecastday;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("forecastday")
    public List<Forecastday> getForecastday() {
        return forecastday;
    }

    @JsonProperty("forecastday")
    public void setForecastday(List<Forecastday> forecastday) {
        this.forecastday = forecastday;
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
        result = ((result* 31)+((this.forecastday == null)? 0 :this.forecastday.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Forecast) == false) {
            return false;
        }
        Forecast rhs = ((Forecast) other);
        return (((this.forecastday == rhs.forecastday)||((this.forecastday!= null)&&this.forecastday.equals(rhs.forecastday)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
