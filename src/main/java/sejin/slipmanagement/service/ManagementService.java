package sejin.slipmanagement.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import sejin.slipmanagement.controller.AllocationDTO;
import sejin.slipmanagement.controller.ManagementDTO;
import sejin.slipmanagement.controller.SearchDTO;
import sejin.slipmanagement.controller.SpendDTO;
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

    public List<ManagementDTO> searchByCondition(SearchDTO searchDTO) {
        return managementDAO.findByCondition(searchDTO);
    }

    @Transactional
    public void allocationAll(AllocationDTO allocationDTO) {
        managementDAO.allocation(allocationDTO);
    }

    @Transactional
    public void spending(SpendDTO spendDTO) {

        spendDTO.setSpend_count(StringUtils.countOccurrencesOf(spendDTO.getSpend_name(),",")+1);
        managementDAO.slipSave(spendDTO);

        spendDTO.setSpend_name("'"+spendDTO.getSpend_name().replace(" ","").replace(",","','")+"'");
//        System.out.println(spendDTO.getSpend_name());
        managementDAO.spend(spendDTO);
    }
}
