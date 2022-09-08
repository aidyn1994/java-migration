package bitlab.mapper;
import bitlab.dto.BrandDto;
import bitlab.model.Brand;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface BrandMapper {

    BrandDto toDto(Brand brand);
    Brand toEntity(BrandDto brandDto);

    List<BrandDto> toDtoList(List<Brand> list);
    List<Brand> toEntityList(List<BrandDto> list);

}