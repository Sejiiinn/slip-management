package sejin.slipmanagement.repository;

import org.apache.ibatis.annotations.Mapper;
import sejin.slipmanagement.dto.HistoryDTO;

import java.util.List;

@Mapper
public interface HistoryRepository {
    List<HistoryDTO> findAll();
}
