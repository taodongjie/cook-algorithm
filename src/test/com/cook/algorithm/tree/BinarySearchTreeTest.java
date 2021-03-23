package com.cook.algorithm.tree;


import com.cook.algorithm.tree.domain.BaseData;
import com.cook.algorithm.tree.domain.NumberData;
import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTreeTest {

    @Test
    public void testAddWithNoDataTree() {
        //目标空Tree
        BinarySearchTree target = new BinarySearchTree();

        //一个测试Node
        BinarySearchTree node = construct(1L, 12.3);

        //新增节点
        Tree result = target.add(node);

        Assert.assertEquals(0, result.queryData().queryValue().compareTo(12.3));
    }

    @Test
    public void testAddOneNodeTree() {
        BinarySearchTree target = construct(1L, 12.3);

        BinarySearchTree add1 = construct(2L, 12.4);
        BinarySearchTree add2 = construct(3L, 12.2);

        target.add(add1);
        target.add(add2);

        //比较左子树
        BaseData leftTreeData = target.getLeftTree().queryData();
        Assert.assertEquals(add2.getData().getId(), leftTreeData.getId());
        Assert.assertEquals(add2.getData().getValue(), leftTreeData.queryValue());

        //比较右子树
        BaseData rightTreeData = target.getRightTree().queryData();
        Assert.assertEquals(add1.getData().getId(), rightTreeData.getId());
        Assert.assertEquals(add1.getData().getValue(), rightTreeData.queryValue());
    }


    private BinarySearchTree construct(Long id, Double value) {
        BinarySearchTree tree = new BinarySearchTree();
        NumberData data = new NumberData(id, value);
        tree.setData(data);
        return tree;
    }
}