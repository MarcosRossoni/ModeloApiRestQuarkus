
package dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MovieImdbDTO {

    @JsonProperty("d")
    private List<DescricaoImdbDTO> listDescricao;

    @JsonProperty("q")
    private String dsQuery;

    @JsonProperty("v")
    private Long version;

}
