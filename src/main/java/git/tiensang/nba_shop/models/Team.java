package git.tiensang.nba_shop.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "teams")
@Getter
@Setter
public class Team {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    @JsonProperty("teamId")
    private Long teamId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("logoUrl")
    private String logoUrl;
    
    @JsonProperty("description") 
    private String description;
}
