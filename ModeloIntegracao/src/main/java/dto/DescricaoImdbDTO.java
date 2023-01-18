
package dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DescricaoImdbDTO {

    @JsonProperty("i")
    private ImagemImdbDTO imagemImdb;

    @JsonProperty("id")
    private String idImdb;

    @JsonProperty("l")
    private String dsLongName;

    @JsonProperty("q")
    private String dsQualificacao;

    @JsonProperty("qid")
    private String dsQualificacaoId;

    @JsonProperty("rank")
    private Long rank;

    @JsonProperty("s")
    private String dsStaff;

    @JsonProperty("y")
    private Long ano;

    @JsonProperty("yr")
    private String dsPeriodo;

}
