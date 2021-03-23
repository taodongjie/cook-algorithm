package com.cook.algorithm.tree.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author taodongjie
 */
@Data
@NoArgsConstructor
public class NumberData extends BaseData<Double>{
    private Double value;

    public NumberData(Long id, Double value){
        super(id);
        this.value = value;
    }

    @Override
    public Double queryValue() {
        return value;
    }
}
