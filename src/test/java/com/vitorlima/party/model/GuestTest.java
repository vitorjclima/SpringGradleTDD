package com.vitorlima.party.model;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by vlima on 30/03/2017.
 */

@Entity
@SpringBootTest
public class GuestTest extends TestCase{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    @Test
    public void verifyId(){
        Assert.assertEquals(id,a.getId());
    }

}
