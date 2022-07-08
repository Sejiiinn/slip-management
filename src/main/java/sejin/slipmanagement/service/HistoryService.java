package sejin.slipmanagement.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sejin.slipmanagement.dto.HistoryDTO;
import sejin.slipmanagement.repository.HistoryRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class HistoryService {

    private final HistoryRepository historyRepository;

    public List<HistoryDTO> findHistories() {
        return historyRepository.findAll();
    }
}
