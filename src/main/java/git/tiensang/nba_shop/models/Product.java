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
@Table(name = "products")
@Getter  
@Setter  
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @JsonProperty("productId")
    private Long productId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("price")
    private Double price;

    @JsonProperty("stockQuantity")
    private Integer stockQuantity;

    @JsonProperty("productType")
    private String productType;

    @JsonProperty("imageUrl")
    private String imageUrl;

    @JsonProperty("teamId")
    private Long teamId;  // Link to team ID
}
