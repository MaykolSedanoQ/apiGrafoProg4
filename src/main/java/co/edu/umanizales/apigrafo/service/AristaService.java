package co.edu.umanizales.apigrafo.service;

import co.edu.umanizales.apigrafo.domain.entities.Arista;
import co.edu.umanizales.apigrafo.repository.AristaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class AristaService implements Serializable {

    private AristaRepository aristaRepository;

    @Autowired
    public AristaService(AristaRepository aristaRepository) {
        this.aristaRepository = aristaRepository;
    }


    public  Iterable<Arista> getAllArista(){
      return aristaRepository.findAll();
   }


    public Arista saveArista(Arista arista){
       aristaRepository.save(arista);
       return arista;
    }
}
