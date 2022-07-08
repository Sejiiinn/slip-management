package sejin.slipmanagement.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import sejin.slipmanagement.dto.AllocationDTO;
import sejin.slipmanagement.dto.ManagementDTO;
import sejin.slipmanagement.dto.SearchDTO;
import sejin.slipmanagement.dto.SpendDTO;
import sejin.slipmanagement.repository.ManagementRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ManagementService {

    private final ManagementRepository managementRepository;

    public List<ManagementDTO> searchAll() {
        return managementRepository.findAll();
    }

    public List<ManagementDTO> searchByCondition(SearchDTO searchDTO) {
        return managementRepository.findByCondition(searchDTO);
    }

    @Transactional
    public void allocationAll(AllocationDTO allocationDTO) {
        managementRepository.allocation(allocationDTO);
    }

    @Transactional
    public void spending(SpendDTO spendDTO) {

        spendDTO.setSpendCount(StringUtils.countOccurrencesOf(spendDTO.getSpendName(),",")+1);
        managementRepository.slipSave(spendDTO);

        spendDTO.setSpendName("'"+spendDTO.getSpendName().replace(" ","").replace(",","','")+"'");
        managementRepository.spend(spendDTO);
    }
}