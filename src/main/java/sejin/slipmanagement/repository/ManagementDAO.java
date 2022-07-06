package sejin.slipmanagement.repository;

import org.apache.ibatis.annotations.Mapper;
import sejin.slipmanagement.controller.ManagementDTO;

import java.util.List;

@Mapper
public interface ManagementDAO {

    List<ManagementDTO> findAll();

}
