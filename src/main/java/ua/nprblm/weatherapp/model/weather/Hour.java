
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
    "time_epoch",
    "time",
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
    "windchill_c",
    "windchill_f",
    "heatindex_c",
    "heatindex_f",
    "dewpoint_c",
    "dewpoint_f",
    "will_it_rain",
    "chance_of_rain",
    "will_it_snow",
    "chance_of_snow",
    "vis_km",
    "vis_miles",
    "gust_mph",
    "gust_kph",
    "uv"
})
@Generated("jsonschema2pojo")
public class Hour {

    @JsonProperty("time_epoch")
    private int timeEpoch;
    @JsonProperty("time")
    private String time;
    @JsonProperty("temp_c")
    private double tempC;
    @JsonProperty("temp_f")
    private double tempF;
    @JsonProperty("is_day")
    private int isDay;
    @JsonProperty("condition")
    @Valid
    private Condition__2 condition;
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
    @JsonProperty("windchill_c")
    private double windchillC;
    @JsonProperty("windchill_f")
    private double windchillF;
    @JsonProperty("heatindex_c")
    private double heatindexC;
    @JsonProperty("heatindex_f")
    private double heatindexF;
    @JsonProperty("dewpoint_c")
    private double dewpointC;
    @JsonProperty("dewpoint_f")
    private double dewpointF;
    @JsonProperty("will_it_rain")
    private int willItRain;
    @JsonProperty("chance_of_rain")
    private int chanceOfRain;
    @JsonProperty("will_it_snow")
    private int willItSnow;
    @JsonProperty("chance_of_snow")
    private int chanceOfSnow;
    @JsonProperty("vis_km")
    private double visKm;
    @JsonProperty("vis_miles")
    private double visMiles;
    @JsonProperty("gust_mph")
    private double gustMph;
    @JsonProperty("gust_kph")
    private double gustKph;
    @JsonProperty("uv")
    private double uv;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("time_epoch")
    public int getTimeEpoch() {
        return timeEpoch;
    }

    @JsonProperty("time_epoch")
    public void setTimeEpoch(int timeEpoch) {
        this.timeEpoch = timeEpoch;
    }

    @JsonProperty("time")
    public String getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(String time) {
        this.time = time;
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
    public Condition__2 getCondition() {
        return condition;
    }

    @JsonProperty("condition")
    public void setCondition(Condition__2 condition) {
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

    @JsonProperty("windchill_c")
    public double getWindchillC() {
        return windchillC;
    }

    @JsonProperty("windchill_c")
    public void setWindchillC(double windchillC) {
        this.windchillC = windchillC;
    }

    @JsonProperty("windchill_f")
    public double getWindchillF() {
        return windchillF;
    }

    @JsonProperty("windchill_f")
    public void setWindchillF(double windchillF) {
        this.windchillF = windchillF;
    }

    @JsonProperty("heatindex_c")
    public double getHeatindexC() {
        return heatindexC;
    }

    @JsonProperty("heatindex_c")
    public void setHeatindexC(double heatindexC) {
        this.heatindexC = heatindexC;
    }

    @JsonProperty("heatindex_f")
    public double getHeatindexF() {
        return heatindexF;
    }

    @JsonProperty("heatindex_f")
    public void setHeatindexF(double heatindexF) {
        this.heatindexF = heatindexF;
    }

    @JsonProperty("dewpoint_c")
    public double getDewpointC() {
        return dewpointC;
    }

    @JsonProperty("dewpoint_c")
    public void setDewpointC(double dewpointC) {
        this.dewpointC = dewpointC;
    }

    @JsonProperty("dewpoint_f")
    public double getDewpointF() {
        return dewpointF;
    }

    @JsonProperty("dewpoint_f")
    public void setDewpointF(double dewpointF) {
        this.dewpointF = dewpointF;
    }

    @JsonProperty("will_it_rain")
    public int getWillItRain() {
        return willItRain;
    }

    @JsonProperty("will_it_rain")
    public void setWillItRain(int willItRain) {
        this.willItRain = willItRain;
    }

    @JsonProperty("chance_of_rain")
    public int getChanceOfRain() {
        return chanceOfRain;
    }

    @JsonProperty("chance_of_rain")
    public void setChanceOfRain(int chanceOfRain) {
        this.chanceOfRain = chanceOfRain;
    }

    @JsonProperty("will_it_snow")
    public int getWillItSnow() {
        return willItSnow;
    }

    @JsonProperty("will_it_snow")
    public void setWillItSnow(int willItSnow) {
        this.willItSnow = willItSnow;
    }

    @JsonProperty("chance_of_snow")
    public int getChanceOfSnow() {
        return chanceOfSnow;
    }

    @JsonProperty("chance_of_snow")
    public void setChanceOfSnow(int chanceOfSnow) {
        this.chanceOfSnow = chanceOfSnow;
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

    @JsonProperty("uv")
    public double getUv() {
        return uv;
    }

    @JsonProperty("uv")
    public void setUv(double uv) {
        this.uv = uv;
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
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.heatindexF)^(Double.doubleToLongBits(this.heatindexF)>>> 32))));
        result = ((result* 31)+ this.timeEpoch);
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.feelslikeC)^(Double.doubleToLongBits(this.feelslikeC)>>> 32))));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.heatindexC)^(Double.doubleToLongBits(this.heatindexC)>>> 32))));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.gustMph)^(Double.doubleToLongBits(this.gustMph)>>> 32))));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.gustKph)^(Double.doubleToLongBits(this.gustKph)>>> 32))));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.dewpointC)^(Double.doubleToLongBits(this.dewpointC)>>> 32))));
        result = ((result* 31)+((this.windDir == null)? 0 :this.windDir.hashCode()));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.pressureIn)^(Double.doubleToLongBits(this.pressureIn)>>> 32))));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.precipIn)^(Double.doubleToLongBits(this.precipIn)>>> 32))));
        result = ((result* 31)+ this.chanceOfRain);
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.dewpointF)^(Double.doubleToLongBits(this.dewpointF)>>> 32))));
        result = ((result* 31)+ this.cloud);
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.windMph)^(Double.doubleToLongBits(this.windMph)>>> 32))));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.visKm)^(Double.doubleToLongBits(this.visKm)>>> 32))));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.windKph)^(Double.doubleToLongBits(this.windKph)>>> 32))));
        result = ((result* 31)+ this.humidity);
        result = ((result* 31)+ this.windDegree);
        result = ((result* 31)+ this.chanceOfSnow);
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.visMiles)^(Double.doubleToLongBits(this.visMiles)>>> 32))));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.tempF)^(Double.doubleToLongBits(this.tempF)>>> 32))));
        result = ((result* 31)+ this.willItRain);
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.uv)^(Double.doubleToLongBits(this.uv)>>> 32))));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.windchillC)^(Double.doubleToLongBits(this.windchillC)>>> 32))));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.windchillF)^(Double.doubleToLongBits(this.windchillF)>>> 32))));
        result = ((result* 31)+ this.isDay);
        result = ((result* 31)+ this.willItSnow);
        result = ((result* 31)+((this.condition == null)? 0 :this.condition.hashCode()));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.feelslikeF)^(Double.doubleToLongBits(this.feelslikeF)>>> 32))));
        result = ((result* 31)+((this.time == null)? 0 :this.time.hashCode()));
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
        if ((other instanceof Hour) == false) {
            return false;
        }
        Hour rhs = ((Hour) other);
        return ((((((((((((((((((((((((((((((((((Double.doubleToLongBits(this.precipMm) == Double.doubleToLongBits(rhs.precipMm))&&(Double.doubleToLongBits(this.heatindexF) == Double.doubleToLongBits(rhs.heatindexF)))&&(this.timeEpoch == rhs.timeEpoch))&&(Double.doubleToLongBits(this.feelslikeC) == Double.doubleToLongBits(rhs.feelslikeC)))&&(Double.doubleToLongBits(this.heatindexC) == Double.doubleToLongBits(rhs.heatindexC)))&&(Double.doubleToLongBits(this.gustMph) == Double.doubleToLongBits(rhs.gustMph)))&&(Double.doubleToLongBits(this.gustKph) == Double.doubleToLongBits(rhs.gustKph)))&&(Double.doubleToLongBits(this.dewpointC) == Double.doubleToLongBits(rhs.dewpointC)))&&((this.windDir == rhs.windDir)||((this.windDir!= null)&&this.windDir.equals(rhs.windDir))))&&(Double.doubleToLongBits(this.pressureIn) == Double.doubleToLongBits(rhs.pressureIn)))&&(Double.doubleToLongBits(this.precipIn) == Double.doubleToLongBits(rhs.precipIn)))&&(this.chanceOfRain == rhs.chanceOfRain))&&(Double.doubleToLongBits(this.dewpointF) == Double.doubleToLongBits(rhs.dewpointF)))&&(this.cloud == rhs.cloud))&&(Double.doubleToLongBits(this.windMph) == Double.doubleToLongBits(rhs.windMph)))&&(Double.doubleToLongBits(this.visKm) == Double.doubleToLongBits(rhs.visKm)))&&(Double.doubleToLongBits(this.windKph) == Double.doubleToLongBits(rhs.windKph)))&&(this.humidity == rhs.humidity))&&(this.windDegree == rhs.windDegree))&&(this.chanceOfSnow == rhs.chanceOfSnow))&&(Double.doubleToLongBits(this.visMiles) == Double.doubleToLongBits(rhs.visMiles)))&&(Double.doubleToLongBits(this.tempF) == Double.doubleToLongBits(rhs.tempF)))&&(this.willItRain == rhs.willItRain))&&(Double.doubleToLongBits(this.uv) == Double.doubleToLongBits(rhs.uv)))&&(Double.doubleToLongBits(this.windchillC) == Double.doubleToLongBits(rhs.windchillC)))&&(Double.doubleToLongBits(this.windchillF) == Double.doubleToLongBits(rhs.windchillF)))&&(this.isDay == rhs.isDay))&&(this.willItSnow == rhs.willItSnow))&&((this.condition == rhs.condition)||((this.condition!= null)&&this.condition.equals(rhs.condition))))&&(Double.doubleToLongBits(this.feelslikeF) == Double.doubleToLongBits(rhs.feelslikeF)))&&((this.time == rhs.time)||((this.time!= null)&&this.time.equals(rhs.time))))&&(Double.doubleToLongBits(this.pressureMb) == Double.doubleToLongBits(rhs.pressureMb)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&(Double.doubleToLongBits(this.tempC) == Double.doubleToLongBits(rhs.tempC)));
    }

}
