package co.edu.umanizales.apigrafo.service;


import co.edu.umanizales.apigrafo.domain.entities.Vertice;
import co.edu.umanizales.apigrafo.repository.VerticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VerticeService {

    private VerticeRepository verticeRepository;

    @Autowired
    public VerticeService(VerticeRepository verticeRepository) {
        this.verticeRepository = verticeRepository;
    }

    public Iterable<Vertice> getAllVertice(){
        return verticeRepository.findAll();
    }

    public Vertice getVerticeByCodigo(int codigo){

        return verticeRepository.findById(codigo).get();
    }

    public Vertice saveVertice(Vertice vertice){
        verticeRepository.save(vertice);
        return vertice;
    }
}
