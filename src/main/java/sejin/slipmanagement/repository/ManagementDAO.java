package sejin.slipmanagement.repository;

import org.apache.ibatis.annotations.Mapper;
import sejin.slipmanagement.controller.AllocationDTO;
import sejin.slipmanagement.controller.ManagementDTO;
import sejin.slipmanagement.controller.SearchDTO;

import java.util.List;

@Mapper
public interface ManagementDAO {

    List<ManagementDTO> findAll();

    List<ManagementDTO> findByCondition(SearchDTO searchDTO);

    void allocation(AllocationDTO allocationDTO);
}
