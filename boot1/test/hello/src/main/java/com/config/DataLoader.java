package com.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.model.Position;
import com.repository.PositionRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class DataLoader implements ApplicationRunner {

    private final PositionRepository repository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        var p = new Position();
        p.setName("投手");
        repository.save(p);

        var c = new Position();
        c.setName("捕手");
        repository.save(c);
        
        var b1 = new Position();
        b1.setName("一塁手");
        repository.save(b1);
        
        var b2 = new Position();
        b2.setName("二塁手");
        repository.save(b2);
        
        var b3 = new Position();
        b3.setName("三塁手");
        repository.save(b3);
        
        var ss = new Position();
        ss.setName("遊撃手");
        repository.save(ss);
        
        var lf = new Position();
        lf.setName("レフト");
        repository.save(lf);
        
        var cf = new Position();
        cf.setName("センター");
        repository.save(cf);
        
        var rf = new Position();
        rf.setName("ライト");
        repository.save(rf);
    }
}
