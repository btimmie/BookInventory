package BookInventory.api;

/**
 * Created by student on 2015/05/17.
 */

import BookInventory.Services.SupplierService;
import BookInventory.domain.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/api/**")
public class SupplerPage {

    @Autowired
    private SupplierService service;

    @RequestMapping(value = "/supplier",method = RequestMethod.GET)
    public Supplier getSupplier(){
        Supplier supplier = new Supplier.Builder("ABC")
                .name("Book world").address("45 Lower Main Road Observatory").build();
        return supplier;
    }

    @RequestMapping(value = "/suppliers", method = RequestMethod.GET)
    public List<Supplier> getSuppliers(){

        return service.getSuppliers();
    }

}
