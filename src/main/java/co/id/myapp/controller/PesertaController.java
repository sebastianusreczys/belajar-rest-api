
package co.id.myapp.controller;

import co.id.myapp.dao.PesertaDao;
import co.id.myapp.entity.Peserta;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PesertaController {
    
    @Autowired
    private PesertaDao pesertaDao;
    
    @GetMapping("/api/peserta")
    public Page<Peserta> daftarPeserta(Pageable pageable){
        return pesertaDao.findAll(pageable);
    }
    
    @PostMapping("/api/peserta")
    @ResponseStatus(HttpStatus.CREATED)
    public void simpan(@RequestBody @Valid Peserta p){
        pesertaDao.save(p);
    }
    @GetMapping("/api/peserta/{id}")
    public Optional<Peserta> cariById(@PathVariable(name = "id") String id){
        return pesertaDao.findById(id);
    }
    
    @DeleteMapping("/api/peserta/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleted(@PathVariable String id){
        pesertaDao.deleteById(id);
    }
    
}
