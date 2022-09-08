package bitlab.dto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemDto {
    private Long id;
    private String name;
    private String description;
    private int amount;
    private int price;
    private BrandDto brand;
}