package com.alipay.simplehbase.hql;

import org.junit.Test;

public class Test_IsNotEqual extends TestHQL {

    @Test
    public void test_0() {
        HQLNode hqlNode = findStatementHQLNode("test_isNotEqual");
        para.put("ok", "Y");
        para.put("age", 11);
        hqlNode.applyParaMap(para, sb, context);
        assertEqualHQL("allen OR AGE", sb.toString());
    }

    @Test
    public void test_1() {
        HQLNode hqlNode = findStatementHQLNode("test_isNotEqual");
        para.put("ok", "N");
        para.put("age", 30);
        hqlNode.applyParaMap(para, sb, context);
        assertEqualHQL("allen AND MARRIED", sb.toString());
    }
}