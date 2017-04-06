package com.vitorlima.party.model;

import com.vitorlima.party.controller.GuestsController;
import com.vitorlima.party.repository.Guests;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by vlima on 30/03/2017.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class GuestTest{

    @Autowired
    private GuestsController guestsController;

    private Guest guest;

    @Before
    public void initialize(){
        guest = new Guest();

    }

    @Test
    public void verifyIdBeforePersistence(){
        Assert.assertEquals(null , guest.getId());
    }

    @Test
    public void verifyIdAfterPersistence(){
        guestsController.save(guest);
        Assert.assertNotNull(guest.getId());
    }

    @Test
    public void verifyPersistence(){
        guest.setName("Test");
        guest.setNumberOfGuests(5);
        guestsController.save(guest);
        Long id = guest.getId();

        System.out.println(guestsController.save(guest));

        Assert.assertTrue("Check if both are the same", guest.equals(guestsController.findById(id)));

    }



}
