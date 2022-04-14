
package co.id.myapp.controller;

import co.id.myapp.dao.PesertaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/peserta")
public class PesertaController {
    
    @Autowired
    private PesertaDao pesertaDao;
    
    @GetMapping
    public void getDaftarPeserta(){
        pesertaDao.findAll();
    }
    
    
}
