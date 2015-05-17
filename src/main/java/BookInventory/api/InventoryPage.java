package BookInventory.api;

import BookInventory.Services.InventoryItemService;
import BookInventory.domain.Consumtion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by student on 2015/05/17.
 */
@RestController
@RequestMapping(value="/inventory/**")
public class InventoryPage {

    @Autowired
    private InventoryItemService service;
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public List<Consumtion> getConsumtions(@PathVariable Long id){


        return service.getAllConsumtions(id);
    }
}
