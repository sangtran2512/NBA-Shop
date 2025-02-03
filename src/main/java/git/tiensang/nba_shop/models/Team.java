package git.tiensang.nba_shop.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Team {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Long teamId;

    private String name;
    private String logoUrl;
    private String description;
}
