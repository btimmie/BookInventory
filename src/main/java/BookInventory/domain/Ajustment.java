package BookInventory.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by student on 2015/04/25.
 */
public class Ajustment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    @Column(unique = true)//makes the code unique
    private String code;
    private String itemName;
    private Date ajustmentDate;
    private int amount;

    private Ajustment(){
    }

    public Ajustment(Builder builder){

    }

    public Long getId() {
        return Id;
    }

    public String getCode() {
        return code;
    }

    public String getItemName() {
        return itemName;
    }

    public Date getAjustmentDate() {
        return ajustmentDate;
    }

    public int getAmount() {
        return amount;
    }

    public static class Builder{
        private String code;
        private String itemName;
        private Date ajustmentDate;
        private int amount;

        public Builder(String code){
            this.code=code;
        }

        public Builder itemName(String value){
            this.itemName = value;
            return this;
        }

        public Builder ajustmentDate(Date value){
            this.ajustmentDate = value;
            return this;
        }

        public Builder amount(int value){
            this.amount = value;
            return this;
        }

        public Builder copy(Ajustment value){
            this.code = value.getCode();
            this.itemName = value.getItemName();
            this.ajustmentDate = value.getAjustmentDate();
            this.amount = value.getAmount();
            return this;
        }

        public Ajustment build(){
            return new Ajustment(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ajustment ajustment = (Ajustment) o;

        if (Id != null ? !Id.equals(ajustment.Id) : ajustment.Id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Id != null ? Id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Ajustment{" +
                "Id=" + Id +
                ", code='" + code + '\'' +
                '}';
    }
}
