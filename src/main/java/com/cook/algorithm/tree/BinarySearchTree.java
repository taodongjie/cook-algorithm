package com.cook.algorithm.tree;

import com.cook.algorithm.tree.domain.BaseData;
import com.cook.algorithm.tree.domain.NumberData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author taodongjie
 * <p>
 * 二叉搜索树
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BinarySearchTree<T extends NumberData> implements Tree {
    private T data;
    private Tree leftTree;
    private Tree rightTree;

    @Override
    public Tree add(Tree node) {
        //1.考虑异常情况
        if (node == null ||
                node.queryData() == null ||
                node.queryData().queryValue() == null
        ) {
            return this;
        }

        if (this.getData() == null) {
            this.data = (T) node.queryData();
            return this;
        }

        if (this.getData().getValue() == null) {
            this.data.setValue((Double) node.queryData().queryValue());
        }

        //2.如果数据等于当前Root节点，则返回
        int compareValue = node.queryData().queryValue().compareTo(this.data.getValue());
        if (compareValue == 0) {
            return this;
        } else if (compareValue > 0) {
            //3.如果数据大于当前Root节点，则插入右子树
            if (this.rightTree != null) {
                this.rightTree.add(node);
            } else {
                this.rightTree = node;
            }
        } else {
            //4.如果数据小于当前Root节点，则插入左子树
            if (this.leftTree != null) {
                this.leftTree.add(node);
            } else {
                this.leftTree = node;
            }
        }
        return this;
    }

    @Override
    public void remove(Tree node) {

    }

    @Override
    public Tree update(Tree node) {
        return null;
    }

    @Override
    public Tree query(Tree node) {
        return null;
    }

    @Override
    public BaseData queryData() {
        return data;
    }
}
