package Service;

import model.Sayings;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SayingsService {
     void save(Sayings sayings);
     boolean isExist(String sayingsQuote);
     List<Sayings> getAllSayings();
}
