package sejin.slipmanagement.repository;

import org.apache.ibatis.annotations.Mapper;
import sejin.slipmanagement.controller.HistoryDTO;

import java.util.List;

@Mapper
public interface HistoryDAO {
    List<HistoryDTO> findAll();
}
