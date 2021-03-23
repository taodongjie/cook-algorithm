package com.cook.algorithm.tree;

import com.cook.algorithm.tree.domain.BaseData;

/**
 * @author taodongjie
 */
public interface Tree {
    /**
     * add node
     * @param node
     * @return
     */
    Tree add(Tree node);

    /**
     * remove node
     * @param node
     */
    void remove(Tree node);

    /**
     * update node
     * @param node
     * @return
     */
    Tree update(Tree node);

    /**
     * query node
     * @param node
     * @return
     */
    Tree query(Tree node);

    /**
     * query Tree data
     * @return
     */
    BaseData queryData();
}
