package fv.dao;

import fv.pojo.Test;

/**
 * TestµÄMapper
 */
public interface TestMapper {
    Test selectByPrimaryKey(Integer id);
}