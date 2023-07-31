
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
    "date",
    "date_epoch",
    "day",
    "astro",
    "hour"
})
@Generated("jsonschema2pojo")
public class Forecastday {

    @JsonProperty("date")
    private String date;
    @JsonProperty("date_epoch")
    private int dateEpoch;
    @JsonProperty("day")
    @Valid
    private Day day;
    @JsonProperty("astro")
    @Valid
    private Astro astro;
    @JsonProperty("hour")
    @Valid
    private List<Hour> hour;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("date_epoch")
    public int getDateEpoch() {
        return dateEpoch;
    }

    @JsonProperty("date_epoch")
    public void setDateEpoch(int dateEpoch) {
        this.dateEpoch = dateEpoch;
    }

    @JsonProperty("day")
    public Day getDay() {
        return day;
    }

    @JsonProperty("day")
    public void setDay(Day day) {
        this.day = day;
    }

    @JsonProperty("astro")
    public Astro getAstro() {
        return astro;
    }

    @JsonProperty("astro")
    public void setAstro(Astro astro) {
        this.astro = astro;
    }

    @JsonProperty("hour")
    public List<Hour> getHour() {
        return hour;
    }

    @JsonProperty("hour")
    public void setHour(List<Hour> hour) {
        this.hour = hour;
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
        result = ((result* 31)+((this.date == null)? 0 :this.date.hashCode()));
        result = ((result* 31)+ this.dateEpoch);
        result = ((result* 31)+((this.astro == null)? 0 :this.astro.hashCode()));
        result = ((result* 31)+((this.hour == null)? 0 :this.hour.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.day == null)? 0 :this.day.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Forecastday) == false) {
            return false;
        }
        Forecastday rhs = ((Forecastday) other);
        return (((((((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&(this.dateEpoch == rhs.dateEpoch))&&((this.astro == rhs.astro)||((this.astro!= null)&&this.astro.equals(rhs.astro))))&&((this.hour == rhs.hour)||((this.hour!= null)&&this.hour.equals(rhs.hour))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.day == rhs.day)||((this.day!= null)&&this.day.equals(rhs.day))));
    }

}
