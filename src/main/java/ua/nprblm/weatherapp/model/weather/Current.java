
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
    "last_updated_epoch",
    "last_updated",
    "temp_c",
    "temp_f",
    "is_day",
    "condition",
    "wind_mph",
    "wind_kph",
    "wind_degree",
    "wind_dir",
    "pressure_mb",
    "pressure_in",
    "precip_mm",
    "precip_in",
    "humidity",
    "cloud",
    "feelslike_c",
    "feelslike_f",
    "vis_km",
    "vis_miles",
    "uv",
    "gust_mph",
    "gust_kph"
})
@Generated("jsonschema2pojo")
public class Current {

    @JsonProperty("last_updated_epoch")
    private int lastUpdatedEpoch;
    @JsonProperty("last_updated")
    private String lastUpdated;
    @JsonProperty("temp_c")
    private double tempC;
    @JsonProperty("temp_f")
    private double tempF;
    @JsonProperty("is_day")
    private int isDay;
    @JsonProperty("condition")
    @Valid
    private Condition condition;
    @JsonProperty("wind_mph")
    private double windMph;
    @JsonProperty("wind_kph")
    private double windKph;
    @JsonProperty("wind_degree")
    private int windDegree;
    @JsonProperty("wind_dir")
    private String windDir;
    @JsonProperty("pressure_mb")
    private double pressureMb;
    @JsonProperty("pressure_in")
    private double pressureIn;
    @JsonProperty("precip_mm")
    private double precipMm;
    @JsonProperty("precip_in")
    private double precipIn;
    @JsonProperty("humidity")
    private int humidity;
    @JsonProperty("cloud")
    private int cloud;
    @JsonProperty("feelslike_c")
    private double feelslikeC;
    @JsonProperty("feelslike_f")
    private double feelslikeF;
    @JsonProperty("vis_km")
    private double visKm;
    @JsonProperty("vis_miles")
    private double visMiles;
    @JsonProperty("uv")
    private double uv;
    @JsonProperty("gust_mph")
    private double gustMph;
    @JsonProperty("gust_kph")
    private double gustKph;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("last_updated_epoch")
    public int getLastUpdatedEpoch() {
        return lastUpdatedEpoch;
    }

    @JsonProperty("last_updated_epoch")
    public void setLastUpdatedEpoch(int lastUpdatedEpoch) {
        this.lastUpdatedEpoch = lastUpdatedEpoch;
    }

    @JsonProperty("last_updated")
    public String getLastUpdated() {
        return lastUpdated;
    }

    @JsonProperty("last_updated")
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @JsonProperty("temp_c")
    public double getTempC() {
        return tempC;
    }

    @JsonProperty("temp_c")
    public void setTempC(double tempC) {
        this.tempC = tempC;
    }

    @JsonProperty("temp_f")
    public double getTempF() {
        return tempF;
    }

    @JsonProperty("temp_f")
    public void setTempF(double tempF) {
        this.tempF = tempF;
    }

    @JsonProperty("is_day")
    public int getIsDay() {
        return isDay;
    }

    @JsonProperty("is_day")
    public void setIsDay(int isDay) {
        this.isDay = isDay;
    }

    @JsonProperty("condition")
    public Condition getCondition() {
        return condition;
    }

    @JsonProperty("condition")
    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    @JsonProperty("wind_mph")
    public double getWindMph() {
        return windMph;
    }

    @JsonProperty("wind_mph")
    public void setWindMph(double windMph) {
        this.windMph = windMph;
    }

    @JsonProperty("wind_kph")
    public double getWindKph() {
        return windKph;
    }

    @JsonProperty("wind_kph")
    public void setWindKph(double windKph) {
        this.windKph = windKph;
    }

    @JsonProperty("wind_degree")
    public int getWindDegree() {
        return windDegree;
    }

    @JsonProperty("wind_degree")
    public void setWindDegree(int windDegree) {
        this.windDegree = windDegree;
    }

    @JsonProperty("wind_dir")
    public String getWindDir() {
        return windDir;
    }

    @JsonProperty("wind_dir")
    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    @JsonProperty("pressure_mb")
    public double getPressureMb() {
        return pressureMb;
    }

    @JsonProperty("pressure_mb")
    public void setPressureMb(double pressureMb) {
        this.pressureMb = pressureMb;
    }

    @JsonProperty("pressure_in")
    public double getPressureIn() {
        return pressureIn;
    }

    @JsonProperty("pressure_in")
    public void setPressureIn(double pressureIn) {
        this.pressureIn = pressureIn;
    }

    @JsonProperty("precip_mm")
    public double getPrecipMm() {
        return precipMm;
    }

    @JsonProperty("precip_mm")
    public void setPrecipMm(double precipMm) {
        this.precipMm = precipMm;
    }

    @JsonProperty("precip_in")
    public double getPrecipIn() {
        return precipIn;
    }

    @JsonProperty("precip_in")
    public void setPrecipIn(double precipIn) {
        this.precipIn = precipIn;
    }

    @JsonProperty("humidity")
    public int getHumidity() {
        return humidity;
    }

    @JsonProperty("humidity")
    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    @JsonProperty("cloud")
    public int getCloud() {
        return cloud;
    }

    @JsonProperty("cloud")
    public void setCloud(int cloud) {
        this.cloud = cloud;
    }

    @JsonProperty("feelslike_c")
    public double getFeelslikeC() {
        return feelslikeC;
    }

    @JsonProperty("feelslike_c")
    public void setFeelslikeC(double feelslikeC) {
        this.feelslikeC = feelslikeC;
    }

    @JsonProperty("feelslike_f")
    public double getFeelslikeF() {
        return feelslikeF;
    }

    @JsonProperty("feelslike_f")
    public void setFeelslikeF(double feelslikeF) {
        this.feelslikeF = feelslikeF;
    }

    @JsonProperty("vis_km")
    public double getVisKm() {
        return visKm;
    }

    @JsonProperty("vis_km")
    public void setVisKm(double visKm) {
        this.visKm = visKm;
    }

    @JsonProperty("vis_miles")
    public double getVisMiles() {
        return visMiles;
    }

    @JsonProperty("vis_miles")
    public void setVisMiles(double visMiles) {
        this.visMiles = visMiles;
    }

    @JsonProperty("uv")
    public double getUv() {
        return uv;
    }

    @JsonProperty("uv")
    public void setUv(double uv) {
        this.uv = uv;
    }

    @JsonProperty("gust_mph")
    public double getGustMph() {
        return gustMph;
    }

    @JsonProperty("gust_mph")
    public void setGustMph(double gustMph) {
        this.gustMph = gustMph;
    }

    @JsonProperty("gust_kph")
    public double getGustKph() {
        return gustKph;
    }

    @JsonProperty("gust_kph")
    public void setGustKph(double gustKph) {
        this.gustKph = gustKph;
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
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.precipMm)^(Double.doubleToLongBits(this.precipMm)>>> 32))));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.feelslikeC)^(Double.doubleToLongBits(this.feelslikeC)>>> 32))));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.gustMph)^(Double.doubleToLongBits(this.gustMph)>>> 32))));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.gustKph)^(Double.doubleToLongBits(this.gustKph)>>> 32))));
        result = ((result* 31)+((this.windDir == null)? 0 :this.windDir.hashCode()));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.pressureIn)^(Double.doubleToLongBits(this.pressureIn)>>> 32))));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.precipIn)^(Double.doubleToLongBits(this.precipIn)>>> 32))));
        result = ((result* 31)+ this.cloud);
        result = ((result* 31)+((this.lastUpdated == null)? 0 :this.lastUpdated.hashCode()));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.windMph)^(Double.doubleToLongBits(this.windMph)>>> 32))));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.visKm)^(Double.doubleToLongBits(this.visKm)>>> 32))));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.windKph)^(Double.doubleToLongBits(this.windKph)>>> 32))));
        result = ((result* 31)+ this.humidity);
        result = ((result* 31)+ this.windDegree);
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.visMiles)^(Double.doubleToLongBits(this.visMiles)>>> 32))));
        result = ((result* 31)+ this.lastUpdatedEpoch);
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.tempF)^(Double.doubleToLongBits(this.tempF)>>> 32))));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.uv)^(Double.doubleToLongBits(this.uv)>>> 32))));
        result = ((result* 31)+ this.isDay);
        result = ((result* 31)+((this.condition == null)? 0 :this.condition.hashCode()));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.feelslikeF)^(Double.doubleToLongBits(this.feelslikeF)>>> 32))));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.pressureMb)^(Double.doubleToLongBits(this.pressureMb)>>> 32))));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.tempC)^(Double.doubleToLongBits(this.tempC)>>> 32))));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Current) == false) {
            return false;
        }
        Current rhs = ((Current) other);
        return ((((((((((((((((((((((((Double.doubleToLongBits(this.precipMm) == Double.doubleToLongBits(rhs.precipMm))&&(Double.doubleToLongBits(this.feelslikeC) == Double.doubleToLongBits(rhs.feelslikeC)))&&(Double.doubleToLongBits(this.gustMph) == Double.doubleToLongBits(rhs.gustMph)))&&(Double.doubleToLongBits(this.gustKph) == Double.doubleToLongBits(rhs.gustKph)))&&((this.windDir == rhs.windDir)||((this.windDir!= null)&&this.windDir.equals(rhs.windDir))))&&(Double.doubleToLongBits(this.pressureIn) == Double.doubleToLongBits(rhs.pressureIn)))&&(Double.doubleToLongBits(this.precipIn) == Double.doubleToLongBits(rhs.precipIn)))&&(this.cloud == rhs.cloud))&&((this.lastUpdated == rhs.lastUpdated)||((this.lastUpdated!= null)&&this.lastUpdated.equals(rhs.lastUpdated))))&&(Double.doubleToLongBits(this.windMph) == Double.doubleToLongBits(rhs.windMph)))&&(Double.doubleToLongBits(this.visKm) == Double.doubleToLongBits(rhs.visKm)))&&(Double.doubleToLongBits(this.windKph) == Double.doubleToLongBits(rhs.windKph)))&&(this.humidity == rhs.humidity))&&(this.windDegree == rhs.windDegree))&&(Double.doubleToLongBits(this.visMiles) == Double.doubleToLongBits(rhs.visMiles)))&&(this.lastUpdatedEpoch == rhs.lastUpdatedEpoch))&&(Double.doubleToLongBits(this.tempF) == Double.doubleToLongBits(rhs.tempF)))&&(Double.doubleToLongBits(this.uv) == Double.doubleToLongBits(rhs.uv)))&&(this.isDay == rhs.isDay))&&((this.condition == rhs.condition)||((this.condition!= null)&&this.condition.equals(rhs.condition))))&&(Double.doubleToLongBits(this.feelslikeF) == Double.doubleToLongBits(rhs.feelslikeF)))&&(Double.doubleToLongBits(this.pressureMb) == Double.doubleToLongBits(rhs.pressureMb)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&(Double.doubleToLongBits(this.tempC) == Double.doubleToLongBits(rhs.tempC)));
    }

}
