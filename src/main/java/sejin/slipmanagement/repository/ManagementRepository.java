package sejin.slipmanagement.repository;

import org.apache.ibatis.annotations.Mapper;
import sejin.slipmanagement.dto.AllocationDTO;
import sejin.slipmanagement.dto.ManagementDTO;
import sejin.slipmanagement.dto.SearchDTO;
import sejin.slipmanagement.dto.SpendDTO;

import java.util.List;

@Mapper
public interface ManagementRepository {

    List<ManagementDTO> findAll();

    List<ManagementDTO> findByCondition(SearchDTO searchDTO);

    void allocation(AllocationDTO allocationDTO);

    void spend(SpendDTO spendDTO);

    void slipSave(SpendDTO spendDTO);
}
