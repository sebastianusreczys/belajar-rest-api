
package co.id.myapp.dao;

import co.id.myapp.entity.Peserta;
import org.springframework.data.repository.PagingAndSortingRepository;
public interface PesertaDao extends PagingAndSortingRepository<Peserta, String>{
    
}
