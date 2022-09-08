package bitlab.service.impl;
import bitlab.dto.ItemDto;
import bitlab.mapper.ItemMapper;
import bitlab.repository.ItemRepository;
import bitlab.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;
    private final ItemMapper itemMapper;

    @Override
    public List<ItemDto> getItems() {
        return itemMapper.toDtoList(itemRepository.findAll());
    }
}
