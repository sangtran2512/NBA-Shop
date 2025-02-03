package git.tiensang.nba_shop.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter  // Lombok sẽ tự động tạo getter cho tất cả các trường
@Setter  // Lombok sẽ tự động tạo setter cho tất cả các trường
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    private String name;
    private String description;
    private Double price;
    private Integer stockQuantity;
    private String productType;
    private String imageUrl;
    private Long teamId;  // Link to team ID
}
