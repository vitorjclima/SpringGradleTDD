package com.vitorlima.party.repository;

import com.vitorlima.party.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by vlima on 06/04/2017.
 */

public interface Guests extends JpaRepository<Guest, Long>{
}
