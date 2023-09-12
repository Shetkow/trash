package Service;

import model.Sayings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.SayingsRepository;

import java.util.List;

@Service
public class SayingsServiceImpl implements SayingsService{
    @Autowired
    SayingsRepository repository;

    @Override
    public void save(Sayings sayings) {
repository.save(sayings);
    }

    @Override
    public boolean isExist(String sayingsQuote) {
        List<Sayings> allSayings = repository.findAll();
        for(Sayings s:allSayings){
            if(s.getQuote().equals(sayingsQuote)){
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Sayings> getAllSayings() {
        return repository.findAll();
    }


}
