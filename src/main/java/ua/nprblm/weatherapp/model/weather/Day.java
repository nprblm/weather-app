
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
    "maxtemp_c",
    "maxtemp_f",
    "mintemp_c",
    "mintemp_f",
    "avgtemp_c",
    "avgtemp_f",
    "maxwind_mph",
    "maxwind_kph",
    "totalprecip_mm",
    "totalprecip_in",
    "totalsnow_cm",
    "avgvis_km",
    "avgvis_miles",
    "avghumidity",
    "daily_will_it_rain",
    "daily_chance_of_rain",
    "daily_will_it_snow",
    "daily_chance_of_snow",
    "condition",
    "uv"
})
@Generated("jsonschema2pojo")
public class Day {

    @JsonProperty("maxtemp_c")
    private double maxtempC;
    @JsonProperty("maxtemp_f")
    private double maxtempF;
    @JsonProperty("mintemp_c")
    private double mintempC;
    @JsonProperty("mintemp_f")
    private double mintempF;
    @JsonProperty("avgtemp_c")
    private double avgtempC;
    @JsonProperty("avgtemp_f")
    private double avgtempF;
    @JsonProperty("maxwind_mph")
    private double maxwindMph;
    @JsonProperty("maxwind_kph")
    private double maxwindKph;
    @JsonProperty("totalprecip_mm")
    private double totalprecipMm;
    @JsonProperty("totalprecip_in")
    private double totalprecipIn;
    @JsonProperty("totalsnow_cm")
    private double totalsnowCm;
    @JsonProperty("avgvis_km")
    private double avgvisKm;
    @JsonProperty("avgvis_miles")
    private double avgvisMiles;
    @JsonProperty("avghumidity")
    private double avghumidity;
    @JsonProperty("daily_will_it_rain")
    private int dailyWillItRain;
    @JsonProperty("daily_chance_of_rain")
    private int dailyChanceOfRain;
    @JsonProperty("daily_will_it_snow")
    private int dailyWillItSnow;
    @JsonProperty("daily_chance_of_snow")
    private int dailyChanceOfSnow;
    @JsonProperty("condition")
    @Valid
    private Condition__1 condition;
    @JsonProperty("uv")
    private double uv;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("maxtemp_c")
    public double getMaxtempC() {
        return maxtempC;
    }

    @JsonProperty("maxtemp_c")
    public void setMaxtempC(double maxtempC) {
        this.maxtempC = maxtempC;
    }

    @JsonProperty("maxtemp_f")
    public double getMaxtempF() {
        return maxtempF;
    }

    @JsonProperty("maxtemp_f")
    public void setMaxtempF(double maxtempF) {
        this.maxtempF = maxtempF;
    }

    @JsonProperty("mintemp_c")
    public double getMintempC() {
        return mintempC;
    }

    @JsonProperty("mintemp_c")
    public void setMintempC(double mintempC) {
        this.mintempC = mintempC;
    }

    @JsonProperty("mintemp_f")
    public double getMintempF() {
        return mintempF;
    }

    @JsonProperty("mintemp_f")
    public void setMintempF(double mintempF) {
        this.mintempF = mintempF;
    }

    @JsonProperty("avgtemp_c")
    public double getAvgtempC() {
        return avgtempC;
    }

    @JsonProperty("avgtemp_c")
    public void setAvgtempC(double avgtempC) {
        this.avgtempC = avgtempC;
    }

    @JsonProperty("avgtemp_f")
    public double getAvgtempF() {
        return avgtempF;
    }

    @JsonProperty("avgtemp_f")
    public void setAvgtempF(double avgtempF) {
        this.avgtempF = avgtempF;
    }

    @JsonProperty("maxwind_mph")
    public double getMaxwindMph() {
        return maxwindMph;
    }

    @JsonProperty("maxwind_mph")
    public void setMaxwindMph(double maxwindMph) {
        this.maxwindMph = maxwindMph;
    }

    @JsonProperty("maxwind_kph")
    public double getMaxwindKph() {
        return maxwindKph;
    }

    @JsonProperty("maxwind_kph")
    public void setMaxwindKph(double maxwindKph) {
        this.maxwindKph = maxwindKph;
    }

    @JsonProperty("totalprecip_mm")
    public double getTotalprecipMm() {
        return totalprecipMm;
    }

    @JsonProperty("totalprecip_mm")
    public void setTotalprecipMm(double totalprecipMm) {
        this.totalprecipMm = totalprecipMm;
    }

    @JsonProperty("totalprecip_in")
    public double getTotalprecipIn() {
        return totalprecipIn;
    }

    @JsonProperty("totalprecip_in")
    public void setTotalprecipIn(double totalprecipIn) {
        this.totalprecipIn = totalprecipIn;
    }

    @JsonProperty("totalsnow_cm")
    public double getTotalsnowCm() {
        return totalsnowCm;
    }

    @JsonProperty("totalsnow_cm")
    public void setTotalsnowCm(double totalsnowCm) {
        this.totalsnowCm = totalsnowCm;
    }

    @JsonProperty("avgvis_km")
    public double getAvgvisKm() {
        return avgvisKm;
    }

    @JsonProperty("avgvis_km")
    public void setAvgvisKm(double avgvisKm) {
        this.avgvisKm = avgvisKm;
    }

    @JsonProperty("avgvis_miles")
    public double getAvgvisMiles() {
        return avgvisMiles;
    }

    @JsonProperty("avgvis_miles")
    public void setAvgvisMiles(double avgvisMiles) {
        this.avgvisMiles = avgvisMiles;
    }

    @JsonProperty("avghumidity")
    public double getAvghumidity() {
        return avghumidity;
    }

    @JsonProperty("avghumidity")
    public void setAvghumidity(double avghumidity) {
        this.avghumidity = avghumidity;
    }

    @JsonProperty("daily_will_it_rain")
    public int getDailyWillItRain() {
        return dailyWillItRain;
    }

    @JsonProperty("daily_will_it_rain")
    public void setDailyWillItRain(int dailyWillItRain) {
        this.dailyWillItRain = dailyWillItRain;
    }

    @JsonProperty("daily_chance_of_rain")
    public int getDailyChanceOfRain() {
        return dailyChanceOfRain;
    }

    @JsonProperty("daily_chance_of_rain")
    public void setDailyChanceOfRain(int dailyChanceOfRain) {
        this.dailyChanceOfRain = dailyChanceOfRain;
    }

    @JsonProperty("daily_will_it_snow")
    public int getDailyWillItSnow() {
        return dailyWillItSnow;
    }

    @JsonProperty("daily_will_it_snow")
    public void setDailyWillItSnow(int dailyWillItSnow) {
        this.dailyWillItSnow = dailyWillItSnow;
    }

    @JsonProperty("daily_chance_of_snow")
    public int getDailyChanceOfSnow() {
        return dailyChanceOfSnow;
    }

    @JsonProperty("daily_chance_of_snow")
    public void setDailyChanceOfSnow(int dailyChanceOfSnow) {
        this.dailyChanceOfSnow = dailyChanceOfSnow;
    }

    @JsonProperty("condition")
    public Condition__1 getCondition() {
        return condition;
    }

    @JsonProperty("condition")
    public void setCondition(Condition__1 condition) {
        this.condition = condition;
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
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.uv)^(Double.doubleToLongBits(this.uv)>>> 32))));
        result = ((result* 31)+ this.dailyWillItRain);
        result = ((result* 31)+ this.dailyChanceOfRain);
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.avgtempF)^(Double.doubleToLongBits(this.avgtempF)>>> 32))));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.mintempC)^(Double.doubleToLongBits(this.mintempC)>>> 32))));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.totalprecipMm)^(Double.doubleToLongBits(this.totalprecipMm)>>> 32))));
        result = ((result* 31)+ this.dailyWillItSnow);
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.totalprecipIn)^(Double.doubleToLongBits(this.totalprecipIn)>>> 32))));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.avghumidity)^(Double.doubleToLongBits(this.avghumidity)>>> 32))));
        result = ((result* 31)+((this.condition == null)? 0 :this.condition.hashCode()));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.avgvisKm)^(Double.doubleToLongBits(this.avgvisKm)>>> 32))));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.mintempF)^(Double.doubleToLongBits(this.mintempF)>>> 32))));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.maxwindMph)^(Double.doubleToLongBits(this.maxwindMph)>>> 32))));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.maxwindKph)^(Double.doubleToLongBits(this.maxwindKph)>>> 32))));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.maxtempF)^(Double.doubleToLongBits(this.maxtempF)>>> 32))));
        result = ((result* 31)+ this.dailyChanceOfSnow);
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.avgtempC)^(Double.doubleToLongBits(this.avgtempC)>>> 32))));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.totalsnowCm)^(Double.doubleToLongBits(this.totalsnowCm)>>> 32))));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.maxtempC)^(Double.doubleToLongBits(this.maxtempC)>>> 32))));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.avgvisMiles)^(Double.doubleToLongBits(this.avgvisMiles)>>> 32))));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Day) == false) {
            return false;
        }
        Day rhs = ((Day) other);
        return (((((((((((((((((((((Double.doubleToLongBits(this.uv) == Double.doubleToLongBits(rhs.uv))&&(this.dailyWillItRain == rhs.dailyWillItRain))&&(this.dailyChanceOfRain == rhs.dailyChanceOfRain))&&(Double.doubleToLongBits(this.avgtempF) == Double.doubleToLongBits(rhs.avgtempF)))&&(Double.doubleToLongBits(this.mintempC) == Double.doubleToLongBits(rhs.mintempC)))&&(Double.doubleToLongBits(this.totalprecipMm) == Double.doubleToLongBits(rhs.totalprecipMm)))&&(this.dailyWillItSnow == rhs.dailyWillItSnow))&&(Double.doubleToLongBits(this.totalprecipIn) == Double.doubleToLongBits(rhs.totalprecipIn)))&&(Double.doubleToLongBits(this.avghumidity) == Double.doubleToLongBits(rhs.avghumidity)))&&((this.condition == rhs.condition)||((this.condition!= null)&&this.condition.equals(rhs.condition))))&&(Double.doubleToLongBits(this.avgvisKm) == Double.doubleToLongBits(rhs.avgvisKm)))&&(Double.doubleToLongBits(this.mintempF) == Double.doubleToLongBits(rhs.mintempF)))&&(Double.doubleToLongBits(this.maxwindMph) == Double.doubleToLongBits(rhs.maxwindMph)))&&(Double.doubleToLongBits(this.maxwindKph) == Double.doubleToLongBits(rhs.maxwindKph)))&&(Double.doubleToLongBits(this.maxtempF) == Double.doubleToLongBits(rhs.maxtempF)))&&(this.dailyChanceOfSnow == rhs.dailyChanceOfSnow))&&(Double.doubleToLongBits(this.avgtempC) == Double.doubleToLongBits(rhs.avgtempC)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&(Double.doubleToLongBits(this.totalsnowCm) == Double.doubleToLongBits(rhs.totalsnowCm)))&&(Double.doubleToLongBits(this.maxtempC) == Double.doubleToLongBits(rhs.maxtempC)))&&(Double.doubleToLongBits(this.avgvisMiles) == Double.doubleToLongBits(rhs.avgvisMiles)));
    }

}
