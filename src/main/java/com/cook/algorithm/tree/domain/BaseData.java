package com.cook.algorithm.tree.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author taodongjie
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseData<T extends Comparable> {
    private Long id;

    /**
     * query value
     * @return
     */
    public abstract T queryValue();
}
