package sejin.slipmanagement.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sejin.slipmanagement.controller.AllocationDTO;
import sejin.slipmanagement.controller.ManagementDTO;
import sejin.slipmanagement.controller.SearchDTO;
import sejin.slipmanagement.repository.ManagementDAO;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ManagementService {

    private final ManagementDAO managementDAO;

    public List<ManagementDTO> searchAll() {
        return managementDAO.findAll();
    }

    public List<ManagementDTO> searchCondition(SearchDTO searchDTO) {
        return managementDAO.findByCondition(searchDTO);
    }

    @Transactional
    public void allocationAll(AllocationDTO allocationDTO) {
        managementDAO.allocation(allocationDTO);
    }
}
