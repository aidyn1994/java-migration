package bitlab.mapper;
import bitlab.dto.ItemDto;
import bitlab.model.Item;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface ItemMapper {

    ItemDto toDto(Item item);
    Item toEntity(ItemDto itemDto);

    List<ItemDto> toDtoList(List<Item> list);
    List<Item> toEntityList(List<ItemDto> list);

}
