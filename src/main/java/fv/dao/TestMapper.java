package fv.dao;

import fv.pojo.Test;

/**
 * Test��Mapper
 */
public interface TestMapper {
    Test selectByPrimaryKey(Integer id);
}