package dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data

public class ImagemImdbDTO {

    @JsonProperty("height")
    private Long height;

    @JsonProperty("imageUrl")
    private String imageUrl;

    @JsonProperty("width")
    private Long width;

}

