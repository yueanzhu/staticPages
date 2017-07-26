package fv.srv.imp;

import fv.dao.TestMapper;
import fv.pojo.Test;
import fv.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ²âÊÔ·þÎñ
 */
@Service("testService")
public class TestServiceImp implements TestService {
    @Autowired(required = false)
    private TestMapper testMapper = null;

    public Test getById(int id) {
        return testMapper.selectByPrimaryKey(id);
    }
}