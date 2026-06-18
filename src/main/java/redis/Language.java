package redis;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Language {
    private String language;
    private Boolean official;
    private BigDecimal percentage;
}