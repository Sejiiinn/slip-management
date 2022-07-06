package sejin.slipmanagement.repository;

import org.apache.ibatis.annotations.Mapper;
import sejin.slipmanagement.domain.Slip;

@Mapper
public interface SlipRepository {
    void save(Slip slip);
}
