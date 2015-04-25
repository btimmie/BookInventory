package BookInventory.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;

/**
 * Created by student on 2015/04/25.
 */
public class InventoryItem implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)//makes the code unique
    private String code;
    private String name;
    private String description;
    private List<Consumtion> consumtionList;

    private InventoryItem(){
    }

    public InventoryItem(Builder builder){
        id=builder.id;
        code=builder.code;
        name=builder.name;
        description=builder.description;
        consumtionList=builder.consumtionList;
    }

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Consumtion> getConsumtionList() {
        return consumtionList;
    }

    public static class Builder{
        private Long id;
        private String code;
        private String name;
        private String description;
        private List<Consumtion> consumtionList;

        public Builder(String code){
            this.code=code;
        }

        public Builder id(Long value){
            this.id=value;
            return this;
        }

        public Builder name(String value){
            this.name=value;
            return this;
        }

        public Builder description(String value){
            this.description=value;
            return this;
        }


    }
}
